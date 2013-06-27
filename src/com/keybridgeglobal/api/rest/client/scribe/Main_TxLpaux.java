/*
 *   Copyright (C) 2009-2013 Caulfield IP Holdings (Caulfield)
 *   and/or its affiliates.
 *   All rights reserved. Use is subject to license terms.
 *
 *   Software Code is protected by Caulfield Copyrights. Caulfield hereby
 *   reserves all rights in and to Caulfield Copyrights and no license is
 *   granted under Caulfield Copyrights in this Software License Agreement.
 *   Caulfield generally licenses Caulfield Copyrights for commercialization
 *   pursuant to the terms of either Caulfield's Standard Software Source Code
 *   License Agreement or Caulfield's Standard Product License Agreement.
 *
 *   A copy of Caulfield's either License Agreement can be obtained on request
 *   by email from: info@caufield.org.
 */
package com.keybridgeglobal.api.rest.client.scribe;

import com.keybridgeglobal.wsif.entity.Coordinate;
import com.keybridgeglobal.wsif.enumerated.EnumWsifDatum;
import com.keybridgeglobal.wsif.transaction.WhitespaceFrequency;
import com.keybridgeglobal.wsif.transaction.WhitespaceResponse;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.DefaultApi10a;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

/**
 * Developer sample application of a Key Bridge API Web Service client using the
 * Apache Commons and Scribe OAuth APIs to implement two-legged OAuth
 * authentication (using Jersey).
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
 * To implement 2-legged OAuth using Scribe-java simply override the default API
 * class and stub-out the 3rd-party call methods.
 * <p/>
 * @author jesse
 */
public class Main_TxLpaux {

  private static final String OAUTH_CLIENT_APPLICATION = "Key Bridge API Demo Rest Client : Scribe";
//  private static final String SERVICE_URI = "http://api.keybridgeglobal.com";
  private static final String SERVICE_URI_SSL = "https://api.keybridgeglobal.com";
  private static final String OAUTH_API_KEY = "OAUTH_API_KEY";                // change to your issued API key
  private static final String OAUTH_SHARED_SECRET = "OAUTH_SHARED_SECRET";    // change to your issued API secret

  /**
   * Make a RESTful web service call.
   * <p/>
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.println("TestOAuthScribe");

    OAuthService service = new ServiceBuilder().provider(TwoLeggedOAuth.class).
      apiKey(OAUTH_API_KEY).
      apiSecret(OAUTH_SHARED_SECRET).
      build();
    /**
     * For 3-legged you would need to request the authorization token Key Bridge
     * web services use a two-legged OAuth transaction so the token is empty
     */
    Token token = new Token("", "");
    /**
     * Build the REST URI
     */
    String webResourceUri = SERVICE_URI_SSL
      + "/rest"
      + "/whitespace"
      + "/query"
      + "/txlpaux";
    /**
     * Initialize the OAuth Request by setting the request method (PUT),
     * identifying the encoding type, and signing the request header using the
     * empty token.
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
    OAuthRequest request = new OAuthRequest(Verb.PUT, webResourceUri);
    request.addHeader("Content-Type", "application/xml");
    request.addHeader("User-Agent", OAUTH_CLIENT_APPLICATION);

    service.signRequest(token, request);
    /**
     * This demonstration program queries the API to find the LPAUX reserved
     * channels at the United States Capital Visitor Center.
     * <p/>
     * All Key Bridge API web services return a ClientResponse, with the
     * encapsulated entity or entity list varying by service. You must
     * programmatically unwrap each web services ClientResponse.
     */
    Coordinate coordinate = new Coordinate();
    coordinate.setLatitude(38.889927);
    coordinate.setLongitude(-77.009139);
    coordinate.setDatum(EnumWsifDatum.WGS_84);
    /**
     * Use the JAXB reference implementation to marshall and unmarshall the
     * request and response objects to and from XML.
     */
    try {
      JAXBContext jaxbContextCoordinate = JAXBContext.newInstance(Coordinate.class);
      Marshaller marshaller = jaxbContextCoordinate.createMarshaller();
      StringWriter stringWriter = new StringWriter();
      marshaller.marshal(coordinate, stringWriter);
      request.addPayload(stringWriter.toString());
    } catch (JAXBException ex) {
      Logger.getLogger(Main_TxLpaux.class.getName()).log(Level.SEVERE, null, ex);
    }
    /**
     * Execute the REST transaction.
     */
    Response response = request.send();
    /**
     * Uncomment the following lines to print the raw response test header and
     * body.
     */
//    System.out.println("Response.Headers " + response.getHeaders());
//    System.out.println("Response.Body    " + response.getBody());
    /**
     * If the transaction was successful then unmarshall the returned XML
     * object.
     */
    if (response.isSuccessful()) {
      try {
        JAXBContext jaxbContextWhitespaceResponse = JAXBContext.newInstance(WhitespaceResponse.class);
        Unmarshaller unmarshaller = jaxbContextWhitespaceResponse.createUnmarshaller();

        StringReader stringReader = new StringReader(response.getBody());
        WhitespaceResponse whitespaceResponse = (WhitespaceResponse) unmarshaller.unmarshal(stringReader);

        System.out.println("WhitespaceResponse from " + SERVICE_URI_SSL);
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

      } catch (JAXBException ex) {
        Logger.getLogger(Main_TxLpaux.class.getName()).log(Level.SEVERE, null, ex);
      }
    } else {
      System.err.println("Query failed to " + webResourceUri);
      System.out.println("Error message: " + response.getHeader("ERROR"));
    }
  }

  //<editor-fold defaultstate="collapsed" desc="TwoLegged OAuth Dummy Token Generator">
  /**
   * Implement a dumbed-down version of the default implementation of the OAuth
   * protocol, version 1.0a, stubbing out the 3-legged OAuth methods that are
   * not required.
   */
  public static class TwoLeggedOAuth extends DefaultApi10a {

    @Override
    public String getAccessTokenEndpoint() {
      return "";
    }

    @Override
    public String getRequestTokenEndpoint() {
      return "";
    }

    @Override
    public String getAuthorizationUrl(Token arg0) {
      return "";
    }
  }
  //</editor-fold>
}
