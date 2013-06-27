package org.scribe.builder.api;

import org.scribe.extractors.*;
import org.scribe.model.OAuthConfig;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuth10aServiceImpl;
import org.scribe.oauth.OAuthService;
import org.scribe.services.HMACSha1SignatureService;
import org.scribe.services.SignatureService;
import org.scribe.services.TimestampService;
import org.scribe.services.TimestampServiceImpl;

/**
 * Default implementation of the OAuth protocol, version 1.0a
 * <p/>
 * This class is meant to be extended by concrete implementations of the API,
 * providing the endpoints and endpoint-http-verbs.
 * <p/>
 * If your Api adheres to the 1.0a protocol correctly, you just need to extend
 * this class and define the getters for your endpoints.
 * <p/>
 * If your Api does something a bit different, you can override the different
 * extractors or services, in order to fine-tune the process. Please read the
 * javadocs of the interfaces to get an idea of what to do.
 * <p/>
 * @author Pablo Fernandez
 * <p/>
 */
public abstract class DefaultApi10a implements Api {

  /**
   * Returns the access token extractor.
   * <p/>
   * @return access token extractor
   */
  public AccessTokenExtractor getAccessTokenExtractor() {
    return new TokenExtractorImpl();
  }

  /**
   * Returns the base string extractor.
   * <p/>
   * @return base string extractor
   */
  public BaseStringExtractor getBaseStringExtractor() {
    return new BaseStringExtractorImpl();
  }

  /**
   * Returns the header extractor.
   * <p/>
   * @return header extractor
   */
  public HeaderExtractor getHeaderExtractor() {
    return new HeaderExtractorImpl();
  }

  /**
   * Returns the request token extractor.
   * <p/>
   * @return request token extractor
   */
  public RequestTokenExtractor getRequestTokenExtractor() {
    return new TokenExtractorImpl();
  }

  /**
   * Returns the signature service.
   * <p/>
   * @return signature service
   */
  public SignatureService getSignatureService() {
    return new HMACSha1SignatureService();
  }

  /**
   * Returns the timestamp service.
   * <p/>
   * @return timestamp service
   */
  public TimestampService getTimestampService() {
    return new TimestampServiceImpl();
  }

  /**
   * Returns the verb for the access token endpoint (defaults to POST)
   * <p/>
   * @return access token endpoint verb
   */
  public Verb getAccessTokenVerb() {
    return Verb.POST;
  }

  /**
   * Returns the verb for the request token endpoint (defaults to POST)
   * <p/>
   * @return request token endpoint verb
   */
  public Verb getRequestTokenVerb() {
    return Verb.POST;
  }

  /**
   * Returns the URL that receives the request token requests.
   * <p/>
   * @return request token URL
   */
  public abstract String getRequestTokenEndpoint();

  /**
   * Returns the URL that receives the access token requests.
   * <p/>
   * @return access token URL
   */
  public abstract String getAccessTokenEndpoint();

  /**
   * Returns the URL where you should redirect your users to authenticate your
   * application.
   * <p/>
   * @param requestToken the request token you need to authorize
   * @return the URL where you should redirect your users
   */
  public abstract String getAuthorizationUrl(Token requestToken);

  /**
   * Returns the {@link OAuthService} for this Api
   * <p/>
   * @param apiKey    Key
   * @param apiSecret Api Secret
   * @param callback  OAuth callback (either URL or 'oob')
   * @param scope     OAuth scope (optional)
   */
  public OAuthService createService(OAuthConfig config) {
    return new OAuth10aServiceImpl(this, config);
  }
}
