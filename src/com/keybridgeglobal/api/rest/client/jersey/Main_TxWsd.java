/*
 *   Copyright (C) 2009-2013 Key Bridge Global LLC and/or its affiliates.
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.keybridgeglobal.api.rest.client.jersey;

import com.keybridgeglobal.wsif.entity.Antenna;
import com.keybridgeglobal.wsif.entity.Coordinate;
import com.keybridgeglobal.wsif.entity.Location;
import com.keybridgeglobal.wsif.entity.device.TxRxWsd;
import com.keybridgeglobal.wsif.enumerated.EnumWsifDatum;
import com.keybridgeglobal.wsif.enumerated.EnumWsifQueryType;
import com.keybridgeglobal.wsif.enumerated.EnumWsifWsdMode;
import com.keybridgeglobal.wsif.transaction.WhitespaceFrequency;
import com.keybridgeglobal.wsif.transaction.WhitespaceQuery;
import com.keybridgeglobal.wsif.transaction.WhitespaceResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;
import javax.ws.rs.core.MediaType;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/**
 * Sample implementation of a Key Bridge API Web Service client using the Jersey
 * API.
 * <p/>
 * This client emulates a web service call for an unlicensed white space device
 * transmitter (TxWsd).
 * <p/>
 * @author jesse
 */
public class Main_TxWsd {

  private static final String OAUTH_CLIENT_APPLICATION = "Key Bridge API Demo Rest Client : TxWsd : Jersey";
//  private static final String SERVICE_URI = "http://api.keybridgeglobal.com";  // only https is supported
  private static final String SERVICE_URI_SSL = "https://api.keybridgeglobal.com";
  private static final String OAUTH_API_KEY = "OAUTH_API_KEY";                // change to your issued API key
  private static final String OAUTH_SHARED_SECRET = "OAUTH_SHARED_SECRET";    // change to your issued API secret
  private WebResource oauthWebResource;

  /**
   * Internal reusable method to prepare the OAuth authenticated web resource.
   * This is called by other (public) methods when preparing a REST transaction.
   * <p/>
   * @return @throws Exception
   */
  private WebResource getOauthWebResource(boolean logging) {
    /**
     * Initialize the Client and OAuth Web Resource
     */
    if (oauthWebResource == null) {
      Client client = Client.create();
      /**
       * To view the transaction (Request/Response) uncomment the following
       * statement:
       */
      if (logging) {
        client.addFilter(new LoggingFilter());
      }
      /**
       * Configure the baseline OAuthParameters, setting the consumerKey.
       * <p/>
       * This action authorizes the client.
       * <p/>
       * Supported signatureMethods are HMAC-SHA1 (default) and PLAINTEXT
       */
      OAuthParameters oAuthParameters = new OAuthParameters();
      oAuthParameters.signatureMethod("HMAC-SHA1");
      oAuthParameters.timestamp();
      oAuthParameters.nonce();
      oAuthParameters.consumerKey(OAUTH_API_KEY);
      /**
       * Configure the OAuthSecrets, setting the consumerSecret to the issued
       * SharedSecret.
       * <p/>
       * This action authenticates the client to the server.
       */
      OAuthSecrets oAuthSecrets = new OAuthSecrets();
      oAuthSecrets.consumerSecret(OAUTH_SHARED_SECRET);
      /**
       * Create a new OAuth-enabled Jersey WebResource by adding an
       * OAuthClientFilter
       * <p/>
       * Web services that require the client to also authenticate the Key
       * Bridge server must use the SSL URI (https).
       * <p/>
       * Web services that do not require server authentication may use either
       * the SSL (http) or non-SSL (https) URI.
       * <p/>
       * Not that unnecessary SSL queries may consume the client application
       * quota faster.
       * <p/>
       */
      oauthWebResource = client.resource(SERVICE_URI_SSL).path("rest");
      oauthWebResource.addFilter(new OAuthClientFilter(client.getProviders(), oAuthParameters, oAuthSecrets));
    }
    return oauthWebResource;
  }

  /**
   * Query the Key Bridge API Rest Web Service
   * <p/>
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("Key Bridge API Test Client for TxWsd using Jersey");
    /**
     * Create a new class instance, setting debugging to ON
     */
    Main_TxWsd m = new Main_TxWsd();
    /**
     * Create an OAuth-enabled Jersey WebResource with logging enabled
     */
    WebResource webResource = m.getOauthWebResource(true);

    /**
     * Identify the client location with a Coordinate object
     */
    Coordinate coordinate = new Coordinate();
    coordinate.setLatitude(38.889927);
    coordinate.setLongitude(-77.009139);
    coordinate.setDatum(EnumWsifDatum.WGS_84);
    /**
     * Describe the client white space device with a TxWsd object.
     * <p/>
     * For evaluation purposes use the 'demo' deviceId and deviceSn.
     * <p/>
     * The four mandatory fields are deviceId, deviceSn and wsdMode, where the
     * wsdMode must be chosen from one of the enumerated types, and Antenna may
     * be configured by one of the following strategies:
     * <p/>
     * 1) A custom antenna configuration is included in the request. For this
     * option the antenna ID must be set to null.
     * <p/>
     * 2) A custom antenna configuration is pre-registered with Key Bridge and
     * included by reference to its Key Bridge-assigned ID number. For this
     * option the antenna ID must be set to Key Bridge-assigned antenna ID
     * number.
     * <p/>
     * 3) No antenna configuration is included and Key Bridge automatically
     * assigns the system default omnidirectional antenna configuration. The
     * system default omnidirectional antenna is always assigned to ID number 1.
     * <p/>
     * In this demonstration query the second antenna identification strategy is
     * implemented by including the default omnidirectional antenna
     * configuration by reference to its ID number.
     * <p/>
     * Testing Note: The web service only provices a ResponseType.INFORMATION
     * MessageType when responding to the 'demo' device, regardless of the
     * QueryType indicated in this client program's messageType field (e.g.
     * REQUEST or INFORMATION).
     */
    TxRxWsd txRxWsd = new TxRxWsd();
    txRxWsd.setDeviceId("A2UACRS10");
    txRxWsd.setDeviceSn("demo");
    txRxWsd.setWsdMode(EnumWsifWsdMode.ACCESS_POINT);
    txRxWsd.setAntenna(new Antenna("GENERIC", "GENERIC"));
    /**
     * Create a WhitespaceQuery message
     */
    WhitespaceQuery whitespaceQuery = new WhitespaceQuery();
    whitespaceQuery.setLocation(new Location());
    whitespaceQuery.getLocation().setCoordinate(coordinate);
    /**
     * The XSD creates an object that expects a XMLGregorianCalendar instance.
     * This field can be changed to a java.util.Date if desired.
     */
    try {
      whitespaceQuery.setDateCreated(DatatypeFactory.newInstance().newXMLGregorianCalendar((GregorianCalendar) Calendar.getInstance()));
    } catch (DatatypeConfigurationException datatypeConfigurationException) {
    }
    whitespaceQuery.setMessageType(EnumWsifQueryType.REQUEST);
    whitespaceQuery.setProtocolVersion(1.0f);
    whitespaceQuery.setTxRxWsd(txRxWsd);
    whitespaceQuery.setUuid(UUID.randomUUID().toString());
    /**
     * Execute the REST transaction.
     * <p/>
     * This demonstration program queries the API to find the LPAUX reserved
     * channels at the United States Capital Visitor Center.
     * <p/>
     * Update the path() settings to call your desired web service.
     * <p/>
     * All Key Bridge API web services return a ClientResponse, with the
     * encapsulated entity or entity list varying by service. You must
     * programmatically unwrap each web services ClientResponse.
     * <p/>
     * Key Bridge API web services consume and produce two MediaTypes. These are
     * MediaType.APPLICATION_XML (application/xml) (default) and
     * MediaType.APPLICATION_JSON (application/json).
     * <p/>
     * The default MediaType is MediaType.APPLICATION_XML
     * <p/>
     * If using the OAUTH_API_KEY in more that one application (e.g. different
     * classes, etc.) then set the User-Agent header to your application name.
     * This information will be reported back to you in your API usage report.
     */
    ClientResponse clientResponse = webResource.path("whitespace").path("find").
      type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).
      header("User-Agent", OAUTH_CLIENT_APPLICATION).
      put(ClientResponse.class, whitespaceQuery);
    /**
     * Unwrap the clientResponse and cast the entity to its appropriate class.
     */
    WhitespaceResponse whitespaceResponse = clientResponse.getEntity(WhitespaceResponse.class);
    /**
     * Print the WhitespaceResponse contents.
     */
    System.out.println("WhitespaceResponse from " + webResource.getURI().getHost());
    System.out.println("  Protocol Version   : " + whitespaceResponse.getProtocolVersion());
    System.out.println("  Date Effective     : " + whitespaceResponse.getDateEffective());
    System.out.println("  Date Expiration    : " + whitespaceResponse.getDateExpiration());
    System.out.println("  At Coordinate      : [" + whitespaceResponse.getLocation().getCoordinate().getLatitude() + ", " + whitespaceResponse.getLocation().getCoordinate().getLatitude() + "]");
    System.out.println("  Available Channels : ");
    for (WhitespaceFrequency whitespaceFrequency : whitespaceResponse.getWhitespaceFrequencyList()) {
      System.out.println("    "
        + whitespaceFrequency.getChannel().getChannel() + " ["
        + whitespaceFrequency.getChannel().getFrequencyMin() + " - "
        + whitespaceFrequency.getChannel().getFrequencyMax() + " MHz] "
        + whitespaceFrequency.getErpMax() + " dbW max");
    }

    /**
     * Uncomment the following to print the WhiteSpaceFrequency extension field,
     * which contains a list of White Space Registration Identifiers and the
     * respective channels that each registration blocks at the indicated
     * location.
     */
//    System.out.println("  White Space Registrations blocking " + whitespaceResponse.getLocation().getCoordinate().getLatitude() + ", " + whitespaceResponse.getLocation().getCoordinate().getLatitude() + ":");
//    HashMap<String, String> extension = (HashMap<String, String>) URITextUtility.decodeKVMap(whitespaceResponse.getExtension());
//    for (Map.Entry<String, String> entry : extension.entrySet()) {
//      System.out.println("    uuid: " + entry.getKey() + " channels " + entry.getValue());
//    }
  }
}
