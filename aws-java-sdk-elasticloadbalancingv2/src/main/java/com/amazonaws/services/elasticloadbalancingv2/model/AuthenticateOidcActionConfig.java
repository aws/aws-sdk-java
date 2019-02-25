/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Request parameters when using an identity provider (IdP) that is compliant with OpenID Connect (OIDC) to authenticate
 * users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/AuthenticateOidcActionConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticateOidcActionConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     */
    private String authorizationEndpoint;
    /**
     * <p>
     * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
     * </p>
     */
    private String tokenEndpoint;
    /**
     * <p>
     * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     */
    private String userInfoEndpoint;
    /**
     * <p>
     * The OAuth 2.0 client identifier.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a rule,
     * you can omit this parameter if you set <code>UseExistingClientSecret</code> to true.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     */
    private String sessionCookieName;
    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     */
    private Long sessionTimeout;
    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     */
    private java.util.Map<String, String> authenticationRequestExtraParams;
    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     */
    private String onUnauthenticatedRequest;
    /**
     * <p>
     * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can
     * omit this parameter or set it to false.
     * </p>
     */
    private Boolean useExistingClientSecret;

    /**
     * <p>
     * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @param issuer
     *        The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain,
     *        and the path.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @return The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain,
     *         and the path.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @param issuer
     *        The OIDC issuer identifier of the IdP. This must be a full URL, including the HTTPS protocol, the domain,
     *        and the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain,
     *        and the path.
     */

    public void setAuthorizationEndpoint(String authorizationEndpoint) {
        this.authorizationEndpoint = authorizationEndpoint;
    }

    /**
     * <p>
     * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @return The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain,
     *         and the path.
     */

    public String getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /**
     * <p>
     * The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @param authorizationEndpoint
     *        The authorization endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain,
     *        and the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withAuthorizationEndpoint(String authorizationEndpoint) {
        setAuthorizationEndpoint(authorizationEndpoint);
        return this;
    }

    /**
     * <p>
     * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
     * </p>
     * 
     * @param tokenEndpoint
     *        The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     *        path.
     */

    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    /**
     * <p>
     * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
     * </p>
     * 
     * @return The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     *         path.
     */

    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    /**
     * <p>
     * The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the path.
     * </p>
     * 
     * @param tokenEndpoint
     *        The token endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     *        path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withTokenEndpoint(String tokenEndpoint) {
        setTokenEndpoint(tokenEndpoint);
        return this;
    }

    /**
     * <p>
     * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @param userInfoEndpoint
     *        The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and
     *        the path.
     */

    public void setUserInfoEndpoint(String userInfoEndpoint) {
        this.userInfoEndpoint = userInfoEndpoint;
    }

    /**
     * <p>
     * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @return The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and
     *         the path.
     */

    public String getUserInfoEndpoint() {
        return this.userInfoEndpoint;
    }

    /**
     * <p>
     * The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and the
     * path.
     * </p>
     * 
     * @param userInfoEndpoint
     *        The user info endpoint of the IdP. This must be a full URL, including the HTTPS protocol, the domain, and
     *        the path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withUserInfoEndpoint(String userInfoEndpoint) {
        setUserInfoEndpoint(userInfoEndpoint);
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 client identifier.
     * </p>
     * 
     * @param clientId
     *        The OAuth 2.0 client identifier.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The OAuth 2.0 client identifier.
     * </p>
     * 
     * @return The OAuth 2.0 client identifier.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The OAuth 2.0 client identifier.
     * </p>
     * 
     * @param clientId
     *        The OAuth 2.0 client identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a rule,
     * you can omit this parameter if you set <code>UseExistingClientSecret</code> to true.
     * </p>
     * 
     * @param clientSecret
     *        The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a
     *        rule, you can omit this parameter if you set <code>UseExistingClientSecret</code> to true.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a rule,
     * you can omit this parameter if you set <code>UseExistingClientSecret</code> to true.
     * </p>
     * 
     * @return The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying
     *         a rule, you can omit this parameter if you set <code>UseExistingClientSecret</code> to true.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a rule,
     * you can omit this parameter if you set <code>UseExistingClientSecret</code> to true.
     * </p>
     * 
     * @param clientSecret
     *        The OAuth 2.0 client secret. This parameter is required if you are creating a rule. If you are modifying a
     *        rule, you can omit this parameter if you set <code>UseExistingClientSecret</code> to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     * 
     * @param sessionCookieName
     *        The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     */

    public void setSessionCookieName(String sessionCookieName) {
        this.sessionCookieName = sessionCookieName;
    }

    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     * 
     * @return The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     */

    public String getSessionCookieName() {
        return this.sessionCookieName;
    }

    /**
     * <p>
     * The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * </p>
     * 
     * @param sessionCookieName
     *        The name of the cookie used to maintain session information. The default is AWSELBAuthSessionCookie.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withSessionCookieName(String sessionCookieName) {
        setSessionCookieName(sessionCookieName);
        return this;
    }

    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     * 
     * @param scope
     *        The set of user claims to be requested from the IdP. The default is <code>openid</code>.</p>
     *        <p>
     *        To verify which scope values your IdP supports and how to separate multiple values, see the documentation
     *        for your IdP.
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     * 
     * @return The set of user claims to be requested from the IdP. The default is <code>openid</code>.</p>
     *         <p>
     *         To verify which scope values your IdP supports and how to separate multiple values, see the documentation
     *         for your IdP.
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The set of user claims to be requested from the IdP. The default is <code>openid</code>.
     * </p>
     * <p>
     * To verify which scope values your IdP supports and how to separate multiple values, see the documentation for
     * your IdP.
     * </p>
     * 
     * @param scope
     *        The set of user claims to be requested from the IdP. The default is <code>openid</code>.</p>
     *        <p>
     *        To verify which scope values your IdP supports and how to separate multiple values, see the documentation
     *        for your IdP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     * 
     * @param sessionTimeout
     *        The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     */

    public void setSessionTimeout(Long sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     * 
     * @return The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     */

    public Long getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * <p>
     * The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * </p>
     * 
     * @param sessionTimeout
     *        The maximum duration of the authentication session, in seconds. The default is 604800 seconds (7 days).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withSessionTimeout(Long sessionTimeout) {
        setSessionTimeout(sessionTimeout);
        return this;
    }

    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     * 
     * @return The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     */

    public java.util.Map<String, String> getAuthenticationRequestExtraParams() {
        return authenticationRequestExtraParams;
    }

    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     * 
     * @param authenticationRequestExtraParams
     *        The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     */

    public void setAuthenticationRequestExtraParams(java.util.Map<String, String> authenticationRequestExtraParams) {
        this.authenticationRequestExtraParams = authenticationRequestExtraParams;
    }

    /**
     * <p>
     * The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * </p>
     * 
     * @param authenticationRequestExtraParams
     *        The query parameters (up to 10) to include in the redirect request to the authorization endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withAuthenticationRequestExtraParams(java.util.Map<String, String> authenticationRequestExtraParams) {
        setAuthenticationRequestExtraParams(authenticationRequestExtraParams);
        return this;
    }

    public AuthenticateOidcActionConfig addAuthenticationRequestExtraParamsEntry(String key, String value) {
        if (null == this.authenticationRequestExtraParams) {
            this.authenticationRequestExtraParams = new java.util.HashMap<String, String>();
        }
        if (this.authenticationRequestExtraParams.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.authenticationRequestExtraParams.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AuthenticationRequestExtraParams.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig clearAuthenticationRequestExtraParamsEntries() {
        this.authenticationRequestExtraParams = null;
        return this;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param onUnauthenticatedRequest
     *        The behavior if the user is not authenticated. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        deny<code/> - Return an HTTP 401 Unauthorized error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        allow<code/> - Allow the request to be forwarded to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *        </p>
     *        </li>
     * @see AuthenticateOidcActionConditionalBehaviorEnum
     */

    public void setOnUnauthenticatedRequest(String onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The behavior if the user is not authenticated. The following are possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         deny<code/> - Return an HTTP 401 Unauthorized error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         allow<code/> - Allow the request to be forwarded to the target.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *         </p>
     *         </li>
     * @see AuthenticateOidcActionConditionalBehaviorEnum
     */

    public String getOnUnauthenticatedRequest() {
        return this.onUnauthenticatedRequest;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param onUnauthenticatedRequest
     *        The behavior if the user is not authenticated. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        deny<code/> - Return an HTTP 401 Unauthorized error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        allow<code/> - Allow the request to be forwarded to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticateOidcActionConditionalBehaviorEnum
     */

    public AuthenticateOidcActionConfig withOnUnauthenticatedRequest(String onUnauthenticatedRequest) {
        setOnUnauthenticatedRequest(onUnauthenticatedRequest);
        return this;
    }

    /**
     * <p>
     * The behavior if the user is not authenticated. The following are possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * deny<code/> - Return an HTTP 401 Unauthorized error.
     * </p>
     * </li>
     * <li>
     * <p>
     * allow<code/> - Allow the request to be forwarded to the target.
     * </p>
     * </li>
     * <li>
     * <p>
     * authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     * </p>
     * </li>
     * </ul>
     * 
     * @param onUnauthenticatedRequest
     *        The behavior if the user is not authenticated. The following are possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        deny<code/> - Return an HTTP 401 Unauthorized error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        allow<code/> - Allow the request to be forwarded to the target.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        authenticate<code/> - Redirect the request to the IdP authorization endpoint. This is the default value.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthenticateOidcActionConditionalBehaviorEnum
     */

    public AuthenticateOidcActionConfig withOnUnauthenticatedRequest(AuthenticateOidcActionConditionalBehaviorEnum onUnauthenticatedRequest) {
        this.onUnauthenticatedRequest = onUnauthenticatedRequest.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can
     * omit this parameter or set it to false.
     * </p>
     * 
     * @param useExistingClientSecret
     *        Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you
     *        can omit this parameter or set it to false.
     */

    public void setUseExistingClientSecret(Boolean useExistingClientSecret) {
        this.useExistingClientSecret = useExistingClientSecret;
    }

    /**
     * <p>
     * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can
     * omit this parameter or set it to false.
     * </p>
     * 
     * @return Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule,
     *         you can omit this parameter or set it to false.
     */

    public Boolean getUseExistingClientSecret() {
        return this.useExistingClientSecret;
    }

    /**
     * <p>
     * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can
     * omit this parameter or set it to false.
     * </p>
     * 
     * @param useExistingClientSecret
     *        Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you
     *        can omit this parameter or set it to false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticateOidcActionConfig withUseExistingClientSecret(Boolean useExistingClientSecret) {
        setUseExistingClientSecret(useExistingClientSecret);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule, you can
     * omit this parameter or set it to false.
     * </p>
     * 
     * @return Indicates whether to use the existing client secret when modifying a rule. If you are creating a rule,
     *         you can omit this parameter or set it to false.
     */

    public Boolean isUseExistingClientSecret() {
        return this.useExistingClientSecret;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getAuthorizationEndpoint() != null)
            sb.append("AuthorizationEndpoint: ").append(getAuthorizationEndpoint()).append(",");
        if (getTokenEndpoint() != null)
            sb.append("TokenEndpoint: ").append(getTokenEndpoint()).append(",");
        if (getUserInfoEndpoint() != null)
            sb.append("UserInfoEndpoint: ").append(getUserInfoEndpoint()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append(getClientSecret()).append(",");
        if (getSessionCookieName() != null)
            sb.append("SessionCookieName: ").append(getSessionCookieName()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getSessionTimeout() != null)
            sb.append("SessionTimeout: ").append(getSessionTimeout()).append(",");
        if (getAuthenticationRequestExtraParams() != null)
            sb.append("AuthenticationRequestExtraParams: ").append(getAuthenticationRequestExtraParams()).append(",");
        if (getOnUnauthenticatedRequest() != null)
            sb.append("OnUnauthenticatedRequest: ").append(getOnUnauthenticatedRequest()).append(",");
        if (getUseExistingClientSecret() != null)
            sb.append("UseExistingClientSecret: ").append(getUseExistingClientSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticateOidcActionConfig == false)
            return false;
        AuthenticateOidcActionConfig other = (AuthenticateOidcActionConfig) obj;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getAuthorizationEndpoint() == null ^ this.getAuthorizationEndpoint() == null)
            return false;
        if (other.getAuthorizationEndpoint() != null && other.getAuthorizationEndpoint().equals(this.getAuthorizationEndpoint()) == false)
            return false;
        if (other.getTokenEndpoint() == null ^ this.getTokenEndpoint() == null)
            return false;
        if (other.getTokenEndpoint() != null && other.getTokenEndpoint().equals(this.getTokenEndpoint()) == false)
            return false;
        if (other.getUserInfoEndpoint() == null ^ this.getUserInfoEndpoint() == null)
            return false;
        if (other.getUserInfoEndpoint() != null && other.getUserInfoEndpoint().equals(this.getUserInfoEndpoint()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getSessionCookieName() == null ^ this.getSessionCookieName() == null)
            return false;
        if (other.getSessionCookieName() != null && other.getSessionCookieName().equals(this.getSessionCookieName()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getSessionTimeout() == null ^ this.getSessionTimeout() == null)
            return false;
        if (other.getSessionTimeout() != null && other.getSessionTimeout().equals(this.getSessionTimeout()) == false)
            return false;
        if (other.getAuthenticationRequestExtraParams() == null ^ this.getAuthenticationRequestExtraParams() == null)
            return false;
        if (other.getAuthenticationRequestExtraParams() != null
                && other.getAuthenticationRequestExtraParams().equals(this.getAuthenticationRequestExtraParams()) == false)
            return false;
        if (other.getOnUnauthenticatedRequest() == null ^ this.getOnUnauthenticatedRequest() == null)
            return false;
        if (other.getOnUnauthenticatedRequest() != null && other.getOnUnauthenticatedRequest().equals(this.getOnUnauthenticatedRequest()) == false)
            return false;
        if (other.getUseExistingClientSecret() == null ^ this.getUseExistingClientSecret() == null)
            return false;
        if (other.getUseExistingClientSecret() != null && other.getUseExistingClientSecret().equals(this.getUseExistingClientSecret()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationEndpoint() == null) ? 0 : getAuthorizationEndpoint().hashCode());
        hashCode = prime * hashCode + ((getTokenEndpoint() == null) ? 0 : getTokenEndpoint().hashCode());
        hashCode = prime * hashCode + ((getUserInfoEndpoint() == null) ? 0 : getUserInfoEndpoint().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getSessionCookieName() == null) ? 0 : getSessionCookieName().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getSessionTimeout() == null) ? 0 : getSessionTimeout().hashCode());
        hashCode = prime * hashCode + ((getAuthenticationRequestExtraParams() == null) ? 0 : getAuthenticationRequestExtraParams().hashCode());
        hashCode = prime * hashCode + ((getOnUnauthenticatedRequest() == null) ? 0 : getOnUnauthenticatedRequest().hashCode());
        hashCode = prime * hashCode + ((getUseExistingClientSecret() == null) ? 0 : getUseExistingClientSecret().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticateOidcActionConfig clone() {
        try {
            return (AuthenticateOidcActionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
