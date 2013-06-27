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

import com.keybridgeglobal.wsif.entity.Coordinate;
import com.keybridgeglobal.wsif.enumerated.EnumWsifDatum;
import com.keybridgeglobal.wsif.transaction.WhitespaceFrequency;
import com.keybridgeglobal.wsif.transaction.WhitespaceResponse;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import javax.ws.rs.core.MediaType;

/**
 * Developer sample application of a Key Bridge API Web Service client using the
 * Jersey API to implement two-legged OAuth authentication (using Jersey).
 * <p/>
 * This client executes a machine-to-machine web service call to retrieve
 * reserved channel information for a wireless microphone dvice transmitter
 * (TxLpaux) at the indicated coordinate.
 * <p/>
 * The key with 2-legged OAuth, which is exactly the same as three-legged OAuth,
 * is that you're skipping the 3rd-party authorization step as the special
 * authorization key granted by the user from OAuth provider is not needed.
 * Everything else is exactly the same.
 * <p/>
 * @author jesse
 */
public class Main_TxLpaux {

  private static final String OAUTH_CLIENT_APPLICATION = "Key Bridge API Demo Rest Client : Jersey";
//  private static final String SERVICE_URI = "http://api.keybridgeglobal.com"; // only https is supported
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
       * This action authenticates the client.
       */
      OAuthSecrets oAuthSecrets = new OAuthSecrets();
      oAuthSecrets.consumerSecret(OAUTH_SHARED_SECRET);
      /**
       * Create a new OAuth-enabled Jersey WebResource by adding an
       * OAuthClientFilter
       * <p/>
       * Web services that require the client to also authenticate the Key
       * Bridge server must use the SSL service URI (https).
       * <p/>
       * Web services that do not require server authentication may use either
       * the SSL (http) or non-SSL (https) URI.
       * <p/>
       * Unnecessary SSL queries may consume the client application quota
       * faster.
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
    System.out.println("Key Bridge API Test Client for TxLpaux using Jersey");
    /**
     * Create a new class instance, setting debugging to ON
     */
    Main_TxLpaux m = new Main_TxLpaux();
    /**
     * Create an OAuth-enabled Jersey WebResource with logging enabled
     */
    WebResource webResource = m.getOauthWebResource(true);
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
    Coordinate coordinate = new Coordinate();
    coordinate.setLatitude(38.889927);
    coordinate.setLongitude(-77.009139);
    coordinate.setDatum(EnumWsifDatum.WGS_84);

    ClientResponse clientResponse = webResource.path("whitespace").path("reserved").
      type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).
      header("User-Agent", OAUTH_CLIENT_APPLICATION).
      put(ClientResponse.class, coordinate);
    /**
     * Unwrap the clientResponse and cast the entity to its appropriate class.
     */
    WhitespaceResponse whitespaceResponse = clientResponse.getEntity(WhitespaceResponse.class);

    System.out.println("WhitespaceResponse from " + webResource.getURI().getHost());
    System.out.println("  Protocol Version   : " + whitespaceResponse.getProtocolVersion());
    System.out.println("  Date Effective     : " + whitespaceResponse.getDateEffective());
    System.out.println("  Date Expiration    : " + whitespaceResponse.getDateExpiration());
    System.out.println("  At Coordinate      : [" + whitespaceResponse.getLocation().getCoordinate().getLatitude() + ", " + whitespaceResponse.getLocation().getCoordinate().getLatitude() + "]");
    System.out.println("  Reserved Channels  : ");
    for (WhitespaceFrequency whitespaceFrequency : whitespaceResponse.getWhitespaceFrequencyList()) {
      System.out.println("    "
        + whitespaceFrequency.getChannel().getChannel() + " ["
        + whitespaceFrequency.getChannel().getFrequencyMin() + " - "
        + whitespaceFrequency.getChannel().getFrequencyMax() + " MHz] ("
        + whitespaceFrequency.getChannel().getAllocation()
        + ")");
    }
  }
}
