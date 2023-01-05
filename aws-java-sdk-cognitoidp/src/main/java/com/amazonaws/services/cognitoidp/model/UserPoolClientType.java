/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a user pool client.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/UserPoolClientType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPoolClientType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * The date the user pool client was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date the user pool client was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't use their refresh token. To specify the
     * time unit for <code>RefreshTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>
     * , or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as <code>10</code> and
     * <code>TokenValidityUnits</code> as <code>days</code>, your user can refresh their session and retrieve new access
     * and ID tokens for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API request is days. You can't set
     * <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito overrides the value with the default value of
     * 30 days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for 30
     * days.
     * </p>
     */
    private Integer refreshTokenValidity;
    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't use their access token. To specify the
     * time unit for <code>AccessTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>,
     * or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to <code>10</code> and <code>TokenValidityUnits</code>
     * to <code>hours</code>, your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your access tokens are valid for one
     * hour.
     * </p>
     */
    private Integer accessTokenValidity;
    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time unit
     * for <code>IdTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code> and <code>TokenValidityUnits</code> as
     * <code>hours</code>, your user can authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one hour.
     * </p>
     */
    private Integer idTokenValidity;
    /**
     * <p>
     * The time units used to specify the token validity times of each token type: ID, access, and refresh.
     * </p>
     */
    private TokenValidityUnitsType tokenValidityUnits;
    /**
     * <p>
     * The Read-only attributes.
     * </p>
     */
    private java.util.List<String> readAttributes;
    /**
     * <p>
     * The writeable attributes.
     * </p>
     */
    private java.util.List<String> writeAttributes;
    /**
     * <p>
     * The authentication flows that you want your user pool client to support. For each app client in your user pool,
     * you can sign in your users with any combination of one or more flows, including with a user name and Secure
     * Remote Password (SRP), a user name and password, or a custom authentication process that you define with Lambda
     * functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     * <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With
     * this authentication flow, your app passes a user name and password to Amazon Cognito in the request, instead of
     * using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon Cognito
     * receives the password in the request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>,
     * or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy <code>ExplicitAuthFlows</code> values to user
     * pool clients at the same time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     */
    private java.util.List<String> explicitAuthFlows;
    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The following are supported:
     * <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     * </p>
     */
    private java.util.List<String> supportedIdentityProviders;
    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the IdPs.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     */
    private java.util.List<String> callbackURLs;
    /**
     * <p>
     * A list of allowed logout URLs for the IdPs.
     * </p>
     */
    private java.util.List<String> logoutURLs;
    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     */
    private String defaultRedirectURI;
    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the response. This code can be exchanged for
     * access tokens with the <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     * combination of the client ID and client secret.
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.List<String> allowedOAuthFlows;
    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>,
     * <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web Services
     * provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom scopes that you
     * create in Resource Servers.
     * </p>
     */
    private java.util.List<String> allowedOAuthScopes;
    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito user
     * pools.
     * </p>
     */
    private Boolean allowedOAuthFlowsUserPoolClient;
    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N. Virginia)
     * us-east-1 Region, regardless of the Region where the user pool resides.
     * </p>
     * </note>
     */
    private AnalyticsConfigurationType analyticsConfiguration;
    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during authentication, account confirmation, and
     * password recovery when the user doesn't exist in the user pool. When set to <code>ENABLED</code> and the user
     * doesn't exist, authentication returns an error indicating either the username or password was incorrect. Account
     * confirmation and password recovery return a response indicating a code was sent to a simulated destination. When
     * set to <code>LEGACY</code>, those APIs return a <code>UserNotFoundException</code> exception if the user doesn't
     * exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related errors
     * aren't prevented.
     * </p>
     * </li>
     * </ul>
     */
    private String preventUserExistenceErrors;
    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client. When you create a new user pool client,
     * token revocation is activated by default. For more information about revoking tokens, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     */
    private Boolean enableTokenRevocation;
    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     * <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk analysis.
     * You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     * <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP address
     * to Amazon Cognito advanced security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP address in
     * a <code>ContextData</code> parameter with the authenticated API operations <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a client
     * secret. For more information about propagation of user context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     */
    private Boolean enablePropagateAdditionalUserContextData;
    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an authentication flow.
     * <code>AuthSessionValidity</code> is the duration, in minutes, of that session token. Your user pool native user
     * must respond to each authentication challenge before the session expires.
     * </p>
     */
    private Integer authSessionValidity;

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool client.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * 
     * @return The user pool ID for the user pool client.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * 
     * @param clientName
     *        The client name from the user pool request of the client type.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * 
     * @return The client name from the user pool request of the client type.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * 
     * @param clientName
     *        The client name from the user pool request of the client type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @return The ID of the client associated with the user pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * 
     * @param clientSecret
     *        The client secret from the user pool request of the client type.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * 
     * @return The client secret from the user pool request of the client type.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * 
     * @param clientSecret
     *        The client secret from the user pool request of the client type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * The date the user pool client was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the user pool client was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool client was last modified.
     * </p>
     * 
     * @return The date the user pool client was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool client was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date the user pool client was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date the user pool client was created.
     * </p>
     * 
     * @param creationDate
     *        The date the user pool client was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the user pool client was created.
     * </p>
     * 
     * @return The date the user pool client was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date the user pool client was created.
     * </p>
     * 
     * @param creationDate
     *        The date the user pool client was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't use their refresh token. To specify the
     * time unit for <code>RefreshTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>
     * , or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as <code>10</code> and
     * <code>TokenValidityUnits</code> as <code>days</code>, your user can refresh their session and retrieve new access
     * and ID tokens for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API request is days. You can't set
     * <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito overrides the value with the default value of
     * 30 days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for 30
     * days.
     * </p>
     * 
     * @param refreshTokenValidity
     *        The refresh token time limit. After this limit expires, your user can't use their refresh token. To
     *        specify the time unit for <code>RefreshTokenValidity</code> as <code>seconds</code>, <code>minutes</code>,
     *        <code>hours</code>, or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API
     *        request.</p>
     *        <p>
     *        For example, when you set <code>RefreshTokenValidity</code> as <code>10</code> and
     *        <code>TokenValidityUnits</code> as <code>days</code>, your user can refresh their session and retrieve new
     *        access and ID tokens for 10 days.
     *        </p>
     *        <p>
     *        The default time unit for <code>RefreshTokenValidity</code> in an API request is days. You can't set
     *        <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito overrides the value with the default
     *        value of 30 days. <i>Valid range</i> is displayed below in seconds.
     *        </p>
     *        <p>
     *        If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for
     *        30 days.
     */

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't use their refresh token. To specify the
     * time unit for <code>RefreshTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>
     * , or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as <code>10</code> and
     * <code>TokenValidityUnits</code> as <code>days</code>, your user can refresh their session and retrieve new access
     * and ID tokens for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API request is days. You can't set
     * <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito overrides the value with the default value of
     * 30 days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for 30
     * days.
     * </p>
     * 
     * @return The refresh token time limit. After this limit expires, your user can't use their refresh token. To
     *         specify the time unit for <code>RefreshTokenValidity</code> as <code>seconds</code>, <code>minutes</code>
     *         , <code>hours</code>, or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API
     *         request.</p>
     *         <p>
     *         For example, when you set <code>RefreshTokenValidity</code> as <code>10</code> and
     *         <code>TokenValidityUnits</code> as <code>days</code>, your user can refresh their session and retrieve
     *         new access and ID tokens for 10 days.
     *         </p>
     *         <p>
     *         The default time unit for <code>RefreshTokenValidity</code> in an API request is days. You can't set
     *         <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito overrides the value with the default
     *         value of 30 days. <i>Valid range</i> is displayed below in seconds.
     *         </p>
     *         <p>
     *         If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for
     *         30 days.
     */

    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    /**
     * <p>
     * The refresh token time limit. After this limit expires, your user can't use their refresh token. To specify the
     * time unit for <code>RefreshTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>
     * , or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>RefreshTokenValidity</code> as <code>10</code> and
     * <code>TokenValidityUnits</code> as <code>days</code>, your user can refresh their session and retrieve new access
     * and ID tokens for 10 days.
     * </p>
     * <p>
     * The default time unit for <code>RefreshTokenValidity</code> in an API request is days. You can't set
     * <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito overrides the value with the default value of
     * 30 days. <i>Valid range</i> is displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for 30
     * days.
     * </p>
     * 
     * @param refreshTokenValidity
     *        The refresh token time limit. After this limit expires, your user can't use their refresh token. To
     *        specify the time unit for <code>RefreshTokenValidity</code> as <code>seconds</code>, <code>minutes</code>,
     *        <code>hours</code>, or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API
     *        request.</p>
     *        <p>
     *        For example, when you set <code>RefreshTokenValidity</code> as <code>10</code> and
     *        <code>TokenValidityUnits</code> as <code>days</code>, your user can refresh their session and retrieve new
     *        access and ID tokens for 10 days.
     *        </p>
     *        <p>
     *        The default time unit for <code>RefreshTokenValidity</code> in an API request is days. You can't set
     *        <code>RefreshTokenValidity</code> to 0. If you do, Amazon Cognito overrides the value with the default
     *        value of 30 days. <i>Valid range</i> is displayed below in seconds.
     *        </p>
     *        <p>
     *        If you don't specify otherwise in the configuration of your app client, your refresh tokens are valid for
     *        30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withRefreshTokenValidity(Integer refreshTokenValidity) {
        setRefreshTokenValidity(refreshTokenValidity);
        return this;
    }

    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't use their access token. To specify the
     * time unit for <code>AccessTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>,
     * or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to <code>10</code> and <code>TokenValidityUnits</code>
     * to <code>hours</code>, your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your access tokens are valid for one
     * hour.
     * </p>
     * 
     * @param accessTokenValidity
     *        The access token time limit. After this limit expires, your user can't use their access token. To specify
     *        the time unit for <code>AccessTokenValidity</code> as <code>seconds</code>, <code>minutes</code>,
     *        <code>hours</code>, or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API
     *        request.</p>
     *        <p>
     *        For example, when you set <code>AccessTokenValidity</code> to <code>10</code> and
     *        <code>TokenValidityUnits</code> to <code>hours</code>, your user can authorize access with their access
     *        token for 10 hours.
     *        </p>
     *        <p>
     *        The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i>
     *        is displayed below in seconds.
     *        </p>
     *        <p>
     *        If you don't specify otherwise in the configuration of your app client, your access tokens are valid for
     *        one hour.
     */

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't use their access token. To specify the
     * time unit for <code>AccessTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>,
     * or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to <code>10</code> and <code>TokenValidityUnits</code>
     * to <code>hours</code>, your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your access tokens are valid for one
     * hour.
     * </p>
     * 
     * @return The access token time limit. After this limit expires, your user can't use their access token. To specify
     *         the time unit for <code>AccessTokenValidity</code> as <code>seconds</code>, <code>minutes</code>,
     *         <code>hours</code>, or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API
     *         request.</p>
     *         <p>
     *         For example, when you set <code>AccessTokenValidity</code> to <code>10</code> and
     *         <code>TokenValidityUnits</code> to <code>hours</code>, your user can authorize access with their access
     *         token for 10 hours.
     *         </p>
     *         <p>
     *         The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i>
     *         is displayed below in seconds.
     *         </p>
     *         <p>
     *         If you don't specify otherwise in the configuration of your app client, your access tokens are valid for
     *         one hour.
     */

    public Integer getAccessTokenValidity() {
        return this.accessTokenValidity;
    }

    /**
     * <p>
     * The access token time limit. After this limit expires, your user can't use their access token. To specify the
     * time unit for <code>AccessTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>,
     * or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>AccessTokenValidity</code> to <code>10</code> and <code>TokenValidityUnits</code>
     * to <code>hours</code>, your user can authorize access with their access token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your access tokens are valid for one
     * hour.
     * </p>
     * 
     * @param accessTokenValidity
     *        The access token time limit. After this limit expires, your user can't use their access token. To specify
     *        the time unit for <code>AccessTokenValidity</code> as <code>seconds</code>, <code>minutes</code>,
     *        <code>hours</code>, or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API
     *        request.</p>
     *        <p>
     *        For example, when you set <code>AccessTokenValidity</code> to <code>10</code> and
     *        <code>TokenValidityUnits</code> to <code>hours</code>, your user can authorize access with their access
     *        token for 10 hours.
     *        </p>
     *        <p>
     *        The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i>
     *        is displayed below in seconds.
     *        </p>
     *        <p>
     *        If you don't specify otherwise in the configuration of your app client, your access tokens are valid for
     *        one hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withAccessTokenValidity(Integer accessTokenValidity) {
        setAccessTokenValidity(accessTokenValidity);
        return this;
    }

    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time unit
     * for <code>IdTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code> and <code>TokenValidityUnits</code> as
     * <code>hours</code>, your user can authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one hour.
     * </p>
     * 
     * @param idTokenValidity
     *        The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time
     *        unit for <code>IdTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>,
     *        or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.</p>
     *        <p>
     *        For example, when you set <code>IdTokenValidity</code> as <code>10</code> and
     *        <code>TokenValidityUnits</code> as <code>hours</code>, your user can authenticate their session with their
     *        ID token for 10 hours.
     *        </p>
     *        <p>
     *        The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i>
     *        is displayed below in seconds.
     *        </p>
     *        <p>
     *        If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one
     *        hour.
     */

    public void setIdTokenValidity(Integer idTokenValidity) {
        this.idTokenValidity = idTokenValidity;
    }

    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time unit
     * for <code>IdTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code> and <code>TokenValidityUnits</code> as
     * <code>hours</code>, your user can authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one hour.
     * </p>
     * 
     * @return The ID token time limit. After this limit expires, your user can't use their ID token. To specify the
     *         time unit for <code>IdTokenValidity</code> as <code>seconds</code>, <code>minutes</code>,
     *         <code>hours</code>, or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API
     *         request.</p>
     *         <p>
     *         For example, when you set <code>IdTokenValidity</code> as <code>10</code> and
     *         <code>TokenValidityUnits</code> as <code>hours</code>, your user can authenticate their session with
     *         their ID token for 10 hours.
     *         </p>
     *         <p>
     *         The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i>
     *         is displayed below in seconds.
     *         </p>
     *         <p>
     *         If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one
     *         hour.
     */

    public Integer getIdTokenValidity() {
        return this.idTokenValidity;
    }

    /**
     * <p>
     * The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time unit
     * for <code>IdTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>, or
     * <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.
     * </p>
     * <p>
     * For example, when you set <code>IdTokenValidity</code> as <code>10</code> and <code>TokenValidityUnits</code> as
     * <code>hours</code>, your user can authenticate their session with their ID token for 10 hours.
     * </p>
     * <p>
     * The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i> is
     * displayed below in seconds.
     * </p>
     * <p>
     * If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one hour.
     * </p>
     * 
     * @param idTokenValidity
     *        The ID token time limit. After this limit expires, your user can't use their ID token. To specify the time
     *        unit for <code>IdTokenValidity</code> as <code>seconds</code>, <code>minutes</code>, <code>hours</code>,
     *        or <code>days</code>, set a <code>TokenValidityUnits</code> value in your API request.</p>
     *        <p>
     *        For example, when you set <code>IdTokenValidity</code> as <code>10</code> and
     *        <code>TokenValidityUnits</code> as <code>hours</code>, your user can authenticate their session with their
     *        ID token for 10 hours.
     *        </p>
     *        <p>
     *        The default time unit for <code>AccessTokenValidity</code> in an API request is hours. <i>Valid range</i>
     *        is displayed below in seconds.
     *        </p>
     *        <p>
     *        If you don't specify otherwise in the configuration of your app client, your ID tokens are valid for one
     *        hour.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withIdTokenValidity(Integer idTokenValidity) {
        setIdTokenValidity(idTokenValidity);
        return this;
    }

    /**
     * <p>
     * The time units used to specify the token validity times of each token type: ID, access, and refresh.
     * </p>
     * 
     * @param tokenValidityUnits
     *        The time units used to specify the token validity times of each token type: ID, access, and refresh.
     */

    public void setTokenValidityUnits(TokenValidityUnitsType tokenValidityUnits) {
        this.tokenValidityUnits = tokenValidityUnits;
    }

    /**
     * <p>
     * The time units used to specify the token validity times of each token type: ID, access, and refresh.
     * </p>
     * 
     * @return The time units used to specify the token validity times of each token type: ID, access, and refresh.
     */

    public TokenValidityUnitsType getTokenValidityUnits() {
        return this.tokenValidityUnits;
    }

    /**
     * <p>
     * The time units used to specify the token validity times of each token type: ID, access, and refresh.
     * </p>
     * 
     * @param tokenValidityUnits
     *        The time units used to specify the token validity times of each token type: ID, access, and refresh.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withTokenValidityUnits(TokenValidityUnitsType tokenValidityUnits) {
        setTokenValidityUnits(tokenValidityUnits);
        return this;
    }

    /**
     * <p>
     * The Read-only attributes.
     * </p>
     * 
     * @return The Read-only attributes.
     */

    public java.util.List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * <p>
     * The Read-only attributes.
     * </p>
     * 
     * @param readAttributes
     *        The Read-only attributes.
     */

    public void setReadAttributes(java.util.Collection<String> readAttributes) {
        if (readAttributes == null) {
            this.readAttributes = null;
            return;
        }

        this.readAttributes = new java.util.ArrayList<String>(readAttributes);
    }

    /**
     * <p>
     * The Read-only attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadAttributes(java.util.Collection)} or {@link #withReadAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param readAttributes
     *        The Read-only attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withReadAttributes(String... readAttributes) {
        if (this.readAttributes == null) {
            setReadAttributes(new java.util.ArrayList<String>(readAttributes.length));
        }
        for (String ele : readAttributes) {
            this.readAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Read-only attributes.
     * </p>
     * 
     * @param readAttributes
     *        The Read-only attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withReadAttributes(java.util.Collection<String> readAttributes) {
        setReadAttributes(readAttributes);
        return this;
    }

    /**
     * <p>
     * The writeable attributes.
     * </p>
     * 
     * @return The writeable attributes.
     */

    public java.util.List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * <p>
     * The writeable attributes.
     * </p>
     * 
     * @param writeAttributes
     *        The writeable attributes.
     */

    public void setWriteAttributes(java.util.Collection<String> writeAttributes) {
        if (writeAttributes == null) {
            this.writeAttributes = null;
            return;
        }

        this.writeAttributes = new java.util.ArrayList<String>(writeAttributes);
    }

    /**
     * <p>
     * The writeable attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWriteAttributes(java.util.Collection)} or {@link #withWriteAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param writeAttributes
     *        The writeable attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withWriteAttributes(String... writeAttributes) {
        if (this.writeAttributes == null) {
            setWriteAttributes(new java.util.ArrayList<String>(writeAttributes.length));
        }
        for (String ele : writeAttributes) {
            this.writeAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The writeable attributes.
     * </p>
     * 
     * @param writeAttributes
     *        The writeable attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withWriteAttributes(java.util.Collection<String> writeAttributes) {
        setWriteAttributes(writeAttributes);
        return this;
    }

    /**
     * <p>
     * The authentication flows that you want your user pool client to support. For each app client in your user pool,
     * you can sign in your users with any combination of one or more flows, including with a user name and Secure
     * Remote Password (SRP), a user name and password, or a custom authentication process that you define with Lambda
     * functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     * <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With
     * this authentication flow, your app passes a user name and password to Amazon Cognito in the request, instead of
     * using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon Cognito
     * receives the password in the request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>,
     * or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy <code>ExplicitAuthFlows</code> values to user
     * pool clients at the same time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     * 
     * @return The authentication flows that you want your user pool client to support. For each app client in your user
     *         pool, you can sign in your users with any combination of one or more flows, including with a user name
     *         and Secure Remote Password (SRP), a user name and password, or a custom authentication process that you
     *         define with Lambda functions.</p> <note>
     *         <p>
     *         If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     *         <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and
     *         <code>ALLOW_CUSTOM_AUTH</code>.
     *         </p>
     *         </note>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     *         <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting.
     *         With this authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     *         instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon
     *         Cognito receives the password in the request instead of using the SRP protocol to verify passwords.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>,
     *         <code>CUSTOM_AUTH_FLOW_ONLY</code>, or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *         <code>ExplicitAuthFlows</code> values to user pool clients at the same time as values that begin with
     *         <code>ALLOW_</code>, like <code>ALLOW_USER_SRP_AUTH</code>.
     * @see ExplicitAuthFlowsType
     */

    public java.util.List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * <p>
     * The authentication flows that you want your user pool client to support. For each app client in your user pool,
     * you can sign in your users with any combination of one or more flows, including with a user name and Secure
     * Remote Password (SRP), a user name and password, or a custom authentication process that you define with Lambda
     * functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     * <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With
     * this authentication flow, your app passes a user name and password to Amazon Cognito in the request, instead of
     * using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon Cognito
     * receives the password in the request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>,
     * or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy <code>ExplicitAuthFlows</code> values to user
     * pool clients at the same time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The authentication flows that you want your user pool client to support. For each app client in your user
     *        pool, you can sign in your users with any combination of one or more flows, including with a user name and
     *        Secure Remote Password (SRP), a user name and password, or a custom authentication process that you define
     *        with Lambda functions.</p> <note>
     *        <p>
     *        If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and
     *        <code>ALLOW_CUSTOM_AUTH</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     *        <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting.
     *        With this authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     *        instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon
     *        Cognito receives the password in the request instead of using the SRP protocol to verify passwords.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>,
     *        <code>CUSTOM_AUTH_FLOW_ONLY</code>, or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *        <code>ExplicitAuthFlows</code> values to user pool clients at the same time as values that begin with
     *        <code>ALLOW_</code>, like <code>ALLOW_USER_SRP_AUTH</code>.
     * @see ExplicitAuthFlowsType
     */

    public void setExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        if (explicitAuthFlows == null) {
            this.explicitAuthFlows = null;
            return;
        }

        this.explicitAuthFlows = new java.util.ArrayList<String>(explicitAuthFlows);
    }

    /**
     * <p>
     * The authentication flows that you want your user pool client to support. For each app client in your user pool,
     * you can sign in your users with any combination of one or more flows, including with a user name and Secure
     * Remote Password (SRP), a user name and password, or a custom authentication process that you define with Lambda
     * functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     * <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With
     * this authentication flow, your app passes a user name and password to Amazon Cognito in the request, instead of
     * using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon Cognito
     * receives the password in the request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>,
     * or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy <code>ExplicitAuthFlows</code> values to user
     * pool clients at the same time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplicitAuthFlows(java.util.Collection)} or {@link #withExplicitAuthFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The authentication flows that you want your user pool client to support. For each app client in your user
     *        pool, you can sign in your users with any combination of one or more flows, including with a user name and
     *        Secure Remote Password (SRP), a user name and password, or a custom authentication process that you define
     *        with Lambda functions.</p> <note>
     *        <p>
     *        If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and
     *        <code>ALLOW_CUSTOM_AUTH</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     *        <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting.
     *        With this authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     *        instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon
     *        Cognito receives the password in the request instead of using the SRP protocol to verify passwords.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>,
     *        <code>CUSTOM_AUTH_FLOW_ONLY</code>, or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *        <code>ExplicitAuthFlows</code> values to user pool clients at the same time as values that begin with
     *        <code>ALLOW_</code>, like <code>ALLOW_USER_SRP_AUTH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public UserPoolClientType withExplicitAuthFlows(String... explicitAuthFlows) {
        if (this.explicitAuthFlows == null) {
            setExplicitAuthFlows(new java.util.ArrayList<String>(explicitAuthFlows.length));
        }
        for (String ele : explicitAuthFlows) {
            this.explicitAuthFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The authentication flows that you want your user pool client to support. For each app client in your user pool,
     * you can sign in your users with any combination of one or more flows, including with a user name and Secure
     * Remote Password (SRP), a user name and password, or a custom authentication process that you define with Lambda
     * functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     * <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With
     * this authentication flow, your app passes a user name and password to Amazon Cognito in the request, instead of
     * using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon Cognito
     * receives the password in the request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>,
     * or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy <code>ExplicitAuthFlows</code> values to user
     * pool clients at the same time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The authentication flows that you want your user pool client to support. For each app client in your user
     *        pool, you can sign in your users with any combination of one or more flows, including with a user name and
     *        Secure Remote Password (SRP), a user name and password, or a custom authentication process that you define
     *        with Lambda functions.</p> <note>
     *        <p>
     *        If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and
     *        <code>ALLOW_CUSTOM_AUTH</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     *        <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting.
     *        With this authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     *        instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon
     *        Cognito receives the password in the request instead of using the SRP protocol to verify passwords.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>,
     *        <code>CUSTOM_AUTH_FLOW_ONLY</code>, or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *        <code>ExplicitAuthFlows</code> values to user pool clients at the same time as values that begin with
     *        <code>ALLOW_</code>, like <code>ALLOW_USER_SRP_AUTH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public UserPoolClientType withExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        setExplicitAuthFlows(explicitAuthFlows);
        return this;
    }

    /**
     * <p>
     * The authentication flows that you want your user pool client to support. For each app client in your user pool,
     * you can sign in your users with any combination of one or more flows, including with a user name and Secure
     * Remote Password (SRP), a user name and password, or a custom authentication process that you define with Lambda
     * functions.
     * </p>
     * <note>
     * <p>
     * If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and <code>ALLOW_CUSTOM_AUTH</code>.
     * </p>
     * </note>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     * <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting. With
     * this authentication flow, your app passes a user name and password to Amazon Cognito in the request, instead of
     * using the Secure Remote Password (SRP) protocol to securely transmit the password.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon Cognito
     * receives the password in the request instead of using the SRP protocol to verify passwords.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>, <code>CUSTOM_AUTH_FLOW_ONLY</code>,
     * or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy <code>ExplicitAuthFlows</code> values to user
     * pool clients at the same time as values that begin with <code>ALLOW_</code>, like
     * <code>ALLOW_USER_SRP_AUTH</code>.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The authentication flows that you want your user pool client to support. For each app client in your user
     *        pool, you can sign in your users with any combination of one or more flows, including with a user name and
     *        Secure Remote Password (SRP), a user name and password, or a custom authentication process that you define
     *        with Lambda functions.</p> <note>
     *        <p>
     *        If you don't specify a value for <code>ExplicitAuthFlows</code>, your user client supports
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>, <code>ALLOW_USER_SRP_AUTH</code>, and
     *        <code>ALLOW_CUSTOM_AUTH</code>.
     *        </p>
     *        </note>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW_ADMIN_USER_PASSWORD_AUTH</code>: Enable admin based user password authentication flow
     *        <code>ADMIN_USER_PASSWORD_AUTH</code>. This setting replaces the <code>ADMIN_NO_SRP_AUTH</code> setting.
     *        With this authentication flow, your app passes a user name and password to Amazon Cognito in the request,
     *        instead of using the Secure Remote Password (SRP) protocol to securely transmit the password.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_CUSTOM_AUTH</code>: Enable Lambda trigger based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_PASSWORD_AUTH</code>: Enable user password-based authentication. In this flow, Amazon
     *        Cognito receives the password in the request instead of using the SRP protocol to verify passwords.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_USER_SRP_AUTH</code>: Enable SRP-based authentication.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALLOW_REFRESH_TOKEN_AUTH</code>: Enable authflow to refresh tokens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        In some environments, you will see the values <code>ADMIN_NO_SRP_AUTH</code>,
     *        <code>CUSTOM_AUTH_FLOW_ONLY</code>, or <code>USER_PASSWORD_AUTH</code>. You can't assign these legacy
     *        <code>ExplicitAuthFlows</code> values to user pool clients at the same time as values that begin with
     *        <code>ALLOW_</code>, like <code>ALLOW_USER_SRP_AUTH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public UserPoolClientType withExplicitAuthFlows(ExplicitAuthFlowsType... explicitAuthFlows) {
        java.util.ArrayList<String> explicitAuthFlowsCopy = new java.util.ArrayList<String>(explicitAuthFlows.length);
        for (ExplicitAuthFlowsType value : explicitAuthFlows) {
            explicitAuthFlowsCopy.add(value.toString());
        }
        if (getExplicitAuthFlows() == null) {
            setExplicitAuthFlows(explicitAuthFlowsCopy);
        } else {
            getExplicitAuthFlows().addAll(explicitAuthFlowsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The following are supported:
     * <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     * </p>
     * 
     * @return A list of provider names for the IdPs that this client supports. The following are supported:
     *         <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     *         <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     */

    public java.util.List<String> getSupportedIdentityProviders() {
        return supportedIdentityProviders;
    }

    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The following are supported:
     * <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     * </p>
     * 
     * @param supportedIdentityProviders
     *        A list of provider names for the IdPs that this client supports. The following are supported:
     *        <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     *        <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     */

    public void setSupportedIdentityProviders(java.util.Collection<String> supportedIdentityProviders) {
        if (supportedIdentityProviders == null) {
            this.supportedIdentityProviders = null;
            return;
        }

        this.supportedIdentityProviders = new java.util.ArrayList<String>(supportedIdentityProviders);
    }

    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The following are supported:
     * <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedIdentityProviders(java.util.Collection)} or
     * {@link #withSupportedIdentityProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedIdentityProviders
     *        A list of provider names for the IdPs that this client supports. The following are supported:
     *        <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     *        <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withSupportedIdentityProviders(String... supportedIdentityProviders) {
        if (this.supportedIdentityProviders == null) {
            setSupportedIdentityProviders(new java.util.ArrayList<String>(supportedIdentityProviders.length));
        }
        for (String ele : supportedIdentityProviders) {
            this.supportedIdentityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of provider names for the IdPs that this client supports. The following are supported:
     * <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     * <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     * </p>
     * 
     * @param supportedIdentityProviders
     *        A list of provider names for the IdPs that this client supports. The following are supported:
     *        <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code>, <code>SignInWithApple</code>,
     *        <code>LoginWithAmazon</code>, and the names of your own SAML and OIDC providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withSupportedIdentityProviders(java.util.Collection<String> supportedIdentityProviders) {
        setSupportedIdentityProviders(supportedIdentityProviders);
        return this;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the IdPs.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @return A list of allowed redirect (callback) URLs for the IdPs.</p>
     *         <p>
     *         A redirect URI must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Be an absolute URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be registered with the authorization server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not include a fragment component.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *         </p>
     *         <p>
     *         Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *         </p>
     *         <p>
     *         App callback URLs such as myapp://example are also supported.
     */

    public java.util.List<String> getCallbackURLs() {
        return callbackURLs;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the IdPs.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param callbackURLs
     *        A list of allowed redirect (callback) URLs for the IdPs.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     */

    public void setCallbackURLs(java.util.Collection<String> callbackURLs) {
        if (callbackURLs == null) {
            this.callbackURLs = null;
            return;
        }

        this.callbackURLs = new java.util.ArrayList<String>(callbackURLs);
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the IdPs.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCallbackURLs(java.util.Collection)} or {@link #withCallbackURLs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param callbackURLs
     *        A list of allowed redirect (callback) URLs for the IdPs.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withCallbackURLs(String... callbackURLs) {
        if (this.callbackURLs == null) {
            setCallbackURLs(new java.util.ArrayList<String>(callbackURLs.length));
        }
        for (String ele : callbackURLs) {
            this.callbackURLs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the IdPs.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param callbackURLs
     *        A list of allowed redirect (callback) URLs for the IdPs.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withCallbackURLs(java.util.Collection<String> callbackURLs) {
        setCallbackURLs(callbackURLs);
        return this;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the IdPs.
     * </p>
     * 
     * @return A list of allowed logout URLs for the IdPs.
     */

    public java.util.List<String> getLogoutURLs() {
        return logoutURLs;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the IdPs.
     * </p>
     * 
     * @param logoutURLs
     *        A list of allowed logout URLs for the IdPs.
     */

    public void setLogoutURLs(java.util.Collection<String> logoutURLs) {
        if (logoutURLs == null) {
            this.logoutURLs = null;
            return;
        }

        this.logoutURLs = new java.util.ArrayList<String>(logoutURLs);
    }

    /**
     * <p>
     * A list of allowed logout URLs for the IdPs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogoutURLs(java.util.Collection)} or {@link #withLogoutURLs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logoutURLs
     *        A list of allowed logout URLs for the IdPs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withLogoutURLs(String... logoutURLs) {
        if (this.logoutURLs == null) {
            setLogoutURLs(new java.util.ArrayList<String>(logoutURLs.length));
        }
        for (String ele : logoutURLs) {
            this.logoutURLs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the IdPs.
     * </p>
     * 
     * @param logoutURLs
     *        A list of allowed logout URLs for the IdPs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withLogoutURLs(java.util.Collection<String> logoutURLs) {
        setLogoutURLs(logoutURLs);
        return this;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param defaultRedirectURI
     *        The default redirect URI. Must be in the <code>CallbackURLs</code> list.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     */

    public void setDefaultRedirectURI(String defaultRedirectURI) {
        this.defaultRedirectURI = defaultRedirectURI;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @return The default redirect URI. Must be in the <code>CallbackURLs</code> list.</p>
     *         <p>
     *         A redirect URI must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Be an absolute URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be registered with the authorization server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not include a fragment component.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *         </p>
     *         <p>
     *         Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *         </p>
     *         <p>
     *         App callback URLs such as myapp://example are also supported.
     */

    public String getDefaultRedirectURI() {
        return this.defaultRedirectURI;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param defaultRedirectURI
     *        The default redirect URI. Must be in the <code>CallbackURLs</code> list.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withDefaultRedirectURI(String defaultRedirectURI) {
        setDefaultRedirectURI(defaultRedirectURI);
        return this;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the response. This code can be exchanged for
     * access tokens with the <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     * combination of the client ID and client secret.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The allowed OAuth flows.</p>
     *         <dl>
     *         <dt>code</dt>
     *         <dd>
     *         <p>
     *         Use a code grant flow, which provides an authorization code as the response. This code can be exchanged
     *         for access tokens with the <code>/oauth2/token</code> endpoint.
     *         </p>
     *         </dd>
     *         <dt>implicit</dt>
     *         <dd>
     *         <p>
     *         Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     *         </p>
     *         </dd>
     *         <dt>client_credentials</dt>
     *         <dd>
     *         <p>
     *         Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     *         combination of the client ID and client secret.
     *         </p>
     *         </dd>
     * @see OAuthFlowType
     */

    public java.util.List<String> getAllowedOAuthFlows() {
        return allowedOAuthFlows;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the response. This code can be exchanged for
     * access tokens with the <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     * combination of the client ID and client secret.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param allowedOAuthFlows
     *        The allowed OAuth flows.</p>
     *        <dl>
     *        <dt>code</dt>
     *        <dd>
     *        <p>
     *        Use a code grant flow, which provides an authorization code as the response. This code can be exchanged
     *        for access tokens with the <code>/oauth2/token</code> endpoint.
     *        </p>
     *        </dd>
     *        <dt>implicit</dt>
     *        <dd>
     *        <p>
     *        Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     *        </p>
     *        </dd>
     *        <dt>client_credentials</dt>
     *        <dd>
     *        <p>
     *        Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     *        combination of the client ID and client secret.
     *        </p>
     *        </dd>
     * @see OAuthFlowType
     */

    public void setAllowedOAuthFlows(java.util.Collection<String> allowedOAuthFlows) {
        if (allowedOAuthFlows == null) {
            this.allowedOAuthFlows = null;
            return;
        }

        this.allowedOAuthFlows = new java.util.ArrayList<String>(allowedOAuthFlows);
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the response. This code can be exchanged for
     * access tokens with the <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     * combination of the client ID and client secret.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOAuthFlows(java.util.Collection)} or {@link #withAllowedOAuthFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedOAuthFlows
     *        The allowed OAuth flows.</p>
     *        <dl>
     *        <dt>code</dt>
     *        <dd>
     *        <p>
     *        Use a code grant flow, which provides an authorization code as the response. This code can be exchanged
     *        for access tokens with the <code>/oauth2/token</code> endpoint.
     *        </p>
     *        </dd>
     *        <dt>implicit</dt>
     *        <dd>
     *        <p>
     *        Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     *        </p>
     *        </dd>
     *        <dt>client_credentials</dt>
     *        <dd>
     *        <p>
     *        Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     *        combination of the client ID and client secret.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthFlowType
     */

    public UserPoolClientType withAllowedOAuthFlows(String... allowedOAuthFlows) {
        if (this.allowedOAuthFlows == null) {
            setAllowedOAuthFlows(new java.util.ArrayList<String>(allowedOAuthFlows.length));
        }
        for (String ele : allowedOAuthFlows) {
            this.allowedOAuthFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the response. This code can be exchanged for
     * access tokens with the <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     * combination of the client ID and client secret.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param allowedOAuthFlows
     *        The allowed OAuth flows.</p>
     *        <dl>
     *        <dt>code</dt>
     *        <dd>
     *        <p>
     *        Use a code grant flow, which provides an authorization code as the response. This code can be exchanged
     *        for access tokens with the <code>/oauth2/token</code> endpoint.
     *        </p>
     *        </dd>
     *        <dt>implicit</dt>
     *        <dd>
     *        <p>
     *        Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     *        </p>
     *        </dd>
     *        <dt>client_credentials</dt>
     *        <dd>
     *        <p>
     *        Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     *        combination of the client ID and client secret.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthFlowType
     */

    public UserPoolClientType withAllowedOAuthFlows(java.util.Collection<String> allowedOAuthFlows) {
        setAllowedOAuthFlows(allowedOAuthFlows);
        return this;
    }

    /**
     * <p>
     * The allowed OAuth flows.
     * </p>
     * <dl>
     * <dt>code</dt>
     * <dd>
     * <p>
     * Use a code grant flow, which provides an authorization code as the response. This code can be exchanged for
     * access tokens with the <code>/oauth2/token</code> endpoint.
     * </p>
     * </dd>
     * <dt>implicit</dt>
     * <dd>
     * <p>
     * Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     * </p>
     * </dd>
     * <dt>client_credentials</dt>
     * <dd>
     * <p>
     * Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     * combination of the client ID and client secret.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param allowedOAuthFlows
     *        The allowed OAuth flows.</p>
     *        <dl>
     *        <dt>code</dt>
     *        <dd>
     *        <p>
     *        Use a code grant flow, which provides an authorization code as the response. This code can be exchanged
     *        for access tokens with the <code>/oauth2/token</code> endpoint.
     *        </p>
     *        </dd>
     *        <dt>implicit</dt>
     *        <dd>
     *        <p>
     *        Issue the access token (and, optionally, ID token, based on scopes) directly to your user.
     *        </p>
     *        </dd>
     *        <dt>client_credentials</dt>
     *        <dd>
     *        <p>
     *        Issue the access token from the <code>/oauth2/token</code> endpoint directly to a non-person user using a
     *        combination of the client ID and client secret.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthFlowType
     */

    public UserPoolClientType withAllowedOAuthFlows(OAuthFlowType... allowedOAuthFlows) {
        java.util.ArrayList<String> allowedOAuthFlowsCopy = new java.util.ArrayList<String>(allowedOAuthFlows.length);
        for (OAuthFlowType value : allowedOAuthFlows) {
            allowedOAuthFlowsCopy.add(value.toString());
        }
        if (getAllowedOAuthFlows() == null) {
            setAllowedOAuthFlows(allowedOAuthFlowsCopy);
        } else {
            getAllowedOAuthFlows().addAll(allowedOAuthFlowsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>,
     * <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web Services
     * provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom scopes that you
     * create in Resource Servers.
     * </p>
     * 
     * @return The OAuth scopes that your app client supports. Possible values that OAuth provides are
     *         <code>phone</code>, <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values
     *         that Amazon Web Services provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also
     *         supports custom scopes that you create in Resource Servers.
     */

    public java.util.List<String> getAllowedOAuthScopes() {
        return allowedOAuthScopes;
    }

    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>,
     * <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web Services
     * provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom scopes that you
     * create in Resource Servers.
     * </p>
     * 
     * @param allowedOAuthScopes
     *        The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>
     *        , <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web
     *        Services provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom
     *        scopes that you create in Resource Servers.
     */

    public void setAllowedOAuthScopes(java.util.Collection<String> allowedOAuthScopes) {
        if (allowedOAuthScopes == null) {
            this.allowedOAuthScopes = null;
            return;
        }

        this.allowedOAuthScopes = new java.util.ArrayList<String>(allowedOAuthScopes);
    }

    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>,
     * <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web Services
     * provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom scopes that you
     * create in Resource Servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOAuthScopes(java.util.Collection)} or {@link #withAllowedOAuthScopes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedOAuthScopes
     *        The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>
     *        , <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web
     *        Services provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom
     *        scopes that you create in Resource Servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withAllowedOAuthScopes(String... allowedOAuthScopes) {
        if (this.allowedOAuthScopes == null) {
            setAllowedOAuthScopes(new java.util.ArrayList<String>(allowedOAuthScopes.length));
        }
        for (String ele : allowedOAuthScopes) {
            this.allowedOAuthScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>,
     * <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web Services
     * provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom scopes that you
     * create in Resource Servers.
     * </p>
     * 
     * @param allowedOAuthScopes
     *        The OAuth scopes that your app client supports. Possible values that OAuth provides are <code>phone</code>
     *        , <code>email</code>, <code>openid</code>, and <code>profile</code>. Possible values that Amazon Web
     *        Services provides are <code>aws.cognito.signin.user.admin</code>. Amazon Cognito also supports custom
     *        scopes that you create in Resource Servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withAllowedOAuthScopes(java.util.Collection<String> allowedOAuthScopes) {
        setAllowedOAuthScopes(allowedOAuthScopes);
        return this;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito user
     * pools.
     * </p>
     * 
     * @param allowedOAuthFlowsUserPoolClient
     *        Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito
     *        user pools.
     */

    public void setAllowedOAuthFlowsUserPoolClient(Boolean allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito user
     * pools.
     * </p>
     * 
     * @return Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito
     *         user pools.
     */

    public Boolean getAllowedOAuthFlowsUserPoolClient() {
        return this.allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito user
     * pools.
     * </p>
     * 
     * @param allowedOAuthFlowsUserPoolClient
     *        Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito
     *        user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withAllowedOAuthFlowsUserPoolClient(Boolean allowedOAuthFlowsUserPoolClient) {
        setAllowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient);
        return this;
    }

    /**
     * <p>
     * Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito user
     * pools.
     * </p>
     * 
     * @return Set to true if the client is allowed to follow the OAuth protocol when interacting with Amazon Cognito
     *         user pools.
     */

    public Boolean isAllowedOAuthFlowsUserPoolClient() {
        return this.allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N. Virginia)
     * us-east-1 Region, regardless of the Region where the user pool resides.
     * </p>
     * </note>
     * 
     * @param analyticsConfiguration
     *        The Amazon Pinpoint analytics configuration for the user pool client.</p> <note>
     *        <p>
     *        Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N.
     *        Virginia) us-east-1 Region, regardless of the Region where the user pool resides.
     *        </p>
     */

    public void setAnalyticsConfiguration(AnalyticsConfigurationType analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N. Virginia)
     * us-east-1 Region, regardless of the Region where the user pool resides.
     * </p>
     * </note>
     * 
     * @return The Amazon Pinpoint analytics configuration for the user pool client.</p> <note>
     *         <p>
     *         Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N.
     *         Virginia) us-east-1 Region, regardless of the Region where the user pool resides.
     *         </p>
     */

    public AnalyticsConfigurationType getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for the user pool client.
     * </p>
     * <note>
     * <p>
     * Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N. Virginia)
     * us-east-1 Region, regardless of the Region where the user pool resides.
     * </p>
     * </note>
     * 
     * @param analyticsConfiguration
     *        The Amazon Pinpoint analytics configuration for the user pool client.</p> <note>
     *        <p>
     *        Amazon Cognito user pools only support sending events to Amazon Pinpoint projects in the US East (N.
     *        Virginia) us-east-1 Region, regardless of the Region where the user pool resides.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withAnalyticsConfiguration(AnalyticsConfigurationType analyticsConfiguration) {
        setAnalyticsConfiguration(analyticsConfiguration);
        return this;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during authentication, account confirmation, and
     * password recovery when the user doesn't exist in the user pool. When set to <code>ENABLED</code> and the user
     * doesn't exist, authentication returns an error indicating either the username or password was incorrect. Account
     * confirmation and password recovery return a response indicating a code was sent to a simulated destination. When
     * set to <code>LEGACY</code>, those APIs return a <code>UserNotFoundException</code> exception if the user doesn't
     * exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related errors
     * aren't prevented.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preventUserExistenceErrors
     *        Errors and responses that you want Amazon Cognito APIs to return during authentication, account
     *        confirmation, and password recovery when the user doesn't exist in the user pool. When set to
     *        <code>ENABLED</code> and the user doesn't exist, authentication returns an error indicating either the
     *        username or password was incorrect. Account confirmation and password recovery return a response
     *        indicating a code was sent to a simulated destination. When set to <code>LEGACY</code>, those APIs return
     *        a <code>UserNotFoundException</code> exception if the user doesn't exist in the user pool.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - This prevents user existence-related errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related
     *        errors aren't prevented.
     *        </p>
     *        </li>
     * @see PreventUserExistenceErrorTypes
     */

    public void setPreventUserExistenceErrors(String preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during authentication, account confirmation, and
     * password recovery when the user doesn't exist in the user pool. When set to <code>ENABLED</code> and the user
     * doesn't exist, authentication returns an error indicating either the username or password was incorrect. Account
     * confirmation and password recovery return a response indicating a code was sent to a simulated destination. When
     * set to <code>LEGACY</code>, those APIs return a <code>UserNotFoundException</code> exception if the user doesn't
     * exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related errors
     * aren't prevented.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Errors and responses that you want Amazon Cognito APIs to return during authentication, account
     *         confirmation, and password recovery when the user doesn't exist in the user pool. When set to
     *         <code>ENABLED</code> and the user doesn't exist, authentication returns an error indicating either the
     *         username or password was incorrect. Account confirmation and password recovery return a response
     *         indicating a code was sent to a simulated destination. When set to <code>LEGACY</code>, those APIs return
     *         a <code>UserNotFoundException</code> exception if the user doesn't exist in the user pool.</p>
     *         <p>
     *         Valid values include:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - This prevents user existence-related errors.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related
     *         errors aren't prevented.
     *         </p>
     *         </li>
     * @see PreventUserExistenceErrorTypes
     */

    public String getPreventUserExistenceErrors() {
        return this.preventUserExistenceErrors;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during authentication, account confirmation, and
     * password recovery when the user doesn't exist in the user pool. When set to <code>ENABLED</code> and the user
     * doesn't exist, authentication returns an error indicating either the username or password was incorrect. Account
     * confirmation and password recovery return a response indicating a code was sent to a simulated destination. When
     * set to <code>LEGACY</code>, those APIs return a <code>UserNotFoundException</code> exception if the user doesn't
     * exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related errors
     * aren't prevented.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preventUserExistenceErrors
     *        Errors and responses that you want Amazon Cognito APIs to return during authentication, account
     *        confirmation, and password recovery when the user doesn't exist in the user pool. When set to
     *        <code>ENABLED</code> and the user doesn't exist, authentication returns an error indicating either the
     *        username or password was incorrect. Account confirmation and password recovery return a response
     *        indicating a code was sent to a simulated destination. When set to <code>LEGACY</code>, those APIs return
     *        a <code>UserNotFoundException</code> exception if the user doesn't exist in the user pool.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - This prevents user existence-related errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related
     *        errors aren't prevented.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreventUserExistenceErrorTypes
     */

    public UserPoolClientType withPreventUserExistenceErrors(String preventUserExistenceErrors) {
        setPreventUserExistenceErrors(preventUserExistenceErrors);
        return this;
    }

    /**
     * <p>
     * Errors and responses that you want Amazon Cognito APIs to return during authentication, account confirmation, and
     * password recovery when the user doesn't exist in the user pool. When set to <code>ENABLED</code> and the user
     * doesn't exist, authentication returns an error indicating either the username or password was incorrect. Account
     * confirmation and password recovery return a response indicating a code was sent to a simulated destination. When
     * set to <code>LEGACY</code>, those APIs return a <code>UserNotFoundException</code> exception if the user doesn't
     * exist in the user pool.
     * </p>
     * <p>
     * Valid values include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code> - This prevents user existence-related errors.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related errors
     * aren't prevented.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preventUserExistenceErrors
     *        Errors and responses that you want Amazon Cognito APIs to return during authentication, account
     *        confirmation, and password recovery when the user doesn't exist in the user pool. When set to
     *        <code>ENABLED</code> and the user doesn't exist, authentication returns an error indicating either the
     *        username or password was incorrect. Account confirmation and password recovery return a response
     *        indicating a code was sent to a simulated destination. When set to <code>LEGACY</code>, those APIs return
     *        a <code>UserNotFoundException</code> exception if the user doesn't exist in the user pool.</p>
     *        <p>
     *        Valid values include:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - This prevents user existence-related errors.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LEGACY</code> - This represents the old behavior of Amazon Cognito where user existence related
     *        errors aren't prevented.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PreventUserExistenceErrorTypes
     */

    public UserPoolClientType withPreventUserExistenceErrors(PreventUserExistenceErrorTypes preventUserExistenceErrors) {
        this.preventUserExistenceErrors = preventUserExistenceErrors.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client. When you create a new user pool client,
     * token revocation is activated by default. For more information about revoking tokens, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * 
     * @param enableTokenRevocation
     *        Indicates whether token revocation is activated for the user pool client. When you create a new user pool
     *        client, token revocation is activated by default. For more information about revoking tokens, see <a
     *        href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     *        >RevokeToken</a>.
     */

    public void setEnableTokenRevocation(Boolean enableTokenRevocation) {
        this.enableTokenRevocation = enableTokenRevocation;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client. When you create a new user pool client,
     * token revocation is activated by default. For more information about revoking tokens, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * 
     * @return Indicates whether token revocation is activated for the user pool client. When you create a new user pool
     *         client, token revocation is activated by default. For more information about revoking tokens, see <a
     *         href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html">
     *         RevokeToken</a>.
     */

    public Boolean getEnableTokenRevocation() {
        return this.enableTokenRevocation;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client. When you create a new user pool client,
     * token revocation is activated by default. For more information about revoking tokens, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * 
     * @param enableTokenRevocation
     *        Indicates whether token revocation is activated for the user pool client. When you create a new user pool
     *        client, token revocation is activated by default. For more information about revoking tokens, see <a
     *        href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     *        >RevokeToken</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withEnableTokenRevocation(Boolean enableTokenRevocation) {
        setEnableTokenRevocation(enableTokenRevocation);
        return this;
    }

    /**
     * <p>
     * Indicates whether token revocation is activated for the user pool client. When you create a new user pool client,
     * token revocation is activated by default. For more information about revoking tokens, see <a
     * href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html"
     * >RevokeToken</a>.
     * </p>
     * 
     * @return Indicates whether token revocation is activated for the user pool client. When you create a new user pool
     *         client, token revocation is activated by default. For more information about revoking tokens, see <a
     *         href="https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_RevokeToken.html">
     *         RevokeToken</a>.
     */

    public Boolean isEnableTokenRevocation() {
        return this.enableTokenRevocation;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     * <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk analysis.
     * You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     * <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP address
     * to Amazon Cognito advanced security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP address in
     * a <code>ContextData</code> parameter with the authenticated API operations <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a client
     * secret. For more information about propagation of user context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * 
     * @param enablePropagateAdditionalUserContextData
     *        When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     *        <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     *        <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk
     *        analysis. You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     *        <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.</p>
     *        <p>
     *        When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP
     *        address to Amazon Cognito advanced security with unauthenticated API operations.
     *        <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP
     *        address in a <code>ContextData</code> parameter with the authenticated API operations
     *        <code>AdminInitiateAuth</code> and <code>AdminRespondToAuthChallenge</code>.
     *        </p>
     *        <p>
     *        You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a
     *        client secret. For more information about propagation of user context data, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *        >Adding user device and session data to API requests</a>.
     */

    public void setEnablePropagateAdditionalUserContextData(Boolean enablePropagateAdditionalUserContextData) {
        this.enablePropagateAdditionalUserContextData = enablePropagateAdditionalUserContextData;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     * <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk analysis.
     * You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     * <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP address
     * to Amazon Cognito advanced security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP address in
     * a <code>ContextData</code> parameter with the authenticated API operations <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a client
     * secret. For more information about propagation of user context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * 
     * @return When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     *         <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     *         <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk
     *         analysis. You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     *         <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.</p>
     *         <p>
     *         When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP
     *         address to Amazon Cognito advanced security with unauthenticated API operations.
     *         <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP
     *         address in a <code>ContextData</code> parameter with the authenticated API operations
     *         <code>AdminInitiateAuth</code> and <code>AdminRespondToAuthChallenge</code>.
     *         </p>
     *         <p>
     *         You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a
     *         client secret. For more information about propagation of user context data, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *         >Adding user device and session data to API requests</a>.
     */

    public Boolean getEnablePropagateAdditionalUserContextData() {
        return this.enablePropagateAdditionalUserContextData;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     * <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk analysis.
     * You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     * <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP address
     * to Amazon Cognito advanced security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP address in
     * a <code>ContextData</code> parameter with the authenticated API operations <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a client
     * secret. For more information about propagation of user context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * 
     * @param enablePropagateAdditionalUserContextData
     *        When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     *        <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     *        <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk
     *        analysis. You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     *        <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.</p>
     *        <p>
     *        When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP
     *        address to Amazon Cognito advanced security with unauthenticated API operations.
     *        <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP
     *        address in a <code>ContextData</code> parameter with the authenticated API operations
     *        <code>AdminInitiateAuth</code> and <code>AdminRespondToAuthChallenge</code>.
     *        </p>
     *        <p>
     *        You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a
     *        client secret. For more information about propagation of user context data, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *        >Adding user device and session data to API requests</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withEnablePropagateAdditionalUserContextData(Boolean enablePropagateAdditionalUserContextData) {
        setEnablePropagateAdditionalUserContextData(enablePropagateAdditionalUserContextData);
        return this;
    }

    /**
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     * <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     * <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk analysis.
     * You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     * <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.
     * </p>
     * <p>
     * When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP address
     * to Amazon Cognito advanced security with unauthenticated API operations.
     * <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP address in
     * a <code>ContextData</code> parameter with the authenticated API operations <code>AdminInitiateAuth</code> and
     * <code>AdminRespondToAuthChallenge</code>.
     * </p>
     * <p>
     * You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a client
     * secret. For more information about propagation of user context data, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     * >Adding user device and session data to API requests</a>.
     * </p>
     * 
     * @return When <code>EnablePropagateAdditionalUserContextData</code> is true, Amazon Cognito accepts an
     *         <code>IpAddress</code> value that you send in the <code>UserContextData</code> parameter. The
     *         <code>UserContextData</code> parameter sends information to Amazon Cognito advanced security for risk
     *         analysis. You can send <code>UserContextData</code> when you sign in Amazon Cognito native users with the
     *         <code>InitiateAuth</code> and <code>RespondToAuthChallenge</code> API operations.</p>
     *         <p>
     *         When <code>EnablePropagateAdditionalUserContextData</code> is false, you can't send your user's source IP
     *         address to Amazon Cognito advanced security with unauthenticated API operations.
     *         <code>EnablePropagateAdditionalUserContextData</code> doesn't affect whether you can send a source IP
     *         address in a <code>ContextData</code> parameter with the authenticated API operations
     *         <code>AdminInitiateAuth</code> and <code>AdminRespondToAuthChallenge</code>.
     *         </p>
     *         <p>
     *         You can only activate <code>EnablePropagateAdditionalUserContextData</code> in an app client that has a
     *         client secret. For more information about propagation of user context data, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-adaptive-authentication.html#user-pool-settings-adaptive-authentication-device-fingerprint"
     *         >Adding user device and session data to API requests</a>.
     */

    public Boolean isEnablePropagateAdditionalUserContextData() {
        return this.enablePropagateAdditionalUserContextData;
    }

    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an authentication flow.
     * <code>AuthSessionValidity</code> is the duration, in minutes, of that session token. Your user pool native user
     * must respond to each authentication challenge before the session expires.
     * </p>
     * 
     * @param authSessionValidity
     *        Amazon Cognito creates a session token for each API request in an authentication flow.
     *        <code>AuthSessionValidity</code> is the duration, in minutes, of that session token. Your user pool native
     *        user must respond to each authentication challenge before the session expires.
     */

    public void setAuthSessionValidity(Integer authSessionValidity) {
        this.authSessionValidity = authSessionValidity;
    }

    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an authentication flow.
     * <code>AuthSessionValidity</code> is the duration, in minutes, of that session token. Your user pool native user
     * must respond to each authentication challenge before the session expires.
     * </p>
     * 
     * @return Amazon Cognito creates a session token for each API request in an authentication flow.
     *         <code>AuthSessionValidity</code> is the duration, in minutes, of that session token. Your user pool
     *         native user must respond to each authentication challenge before the session expires.
     */

    public Integer getAuthSessionValidity() {
        return this.authSessionValidity;
    }

    /**
     * <p>
     * Amazon Cognito creates a session token for each API request in an authentication flow.
     * <code>AuthSessionValidity</code> is the duration, in minutes, of that session token. Your user pool native user
     * must respond to each authentication challenge before the session expires.
     * </p>
     * 
     * @param authSessionValidity
     *        Amazon Cognito creates a session token for each API request in an authentication flow.
     *        <code>AuthSessionValidity</code> is the duration, in minutes, of that session token. Your user pool native
     *        user must respond to each authentication challenge before the session expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPoolClientType withAuthSessionValidity(Integer authSessionValidity) {
        setAuthSessionValidity(authSessionValidity);
        return this;
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getClientName() != null)
            sb.append("ClientName: ").append(getClientName()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append("***Sensitive Data Redacted***").append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getRefreshTokenValidity() != null)
            sb.append("RefreshTokenValidity: ").append(getRefreshTokenValidity()).append(",");
        if (getAccessTokenValidity() != null)
            sb.append("AccessTokenValidity: ").append(getAccessTokenValidity()).append(",");
        if (getIdTokenValidity() != null)
            sb.append("IdTokenValidity: ").append(getIdTokenValidity()).append(",");
        if (getTokenValidityUnits() != null)
            sb.append("TokenValidityUnits: ").append(getTokenValidityUnits()).append(",");
        if (getReadAttributes() != null)
            sb.append("ReadAttributes: ").append(getReadAttributes()).append(",");
        if (getWriteAttributes() != null)
            sb.append("WriteAttributes: ").append(getWriteAttributes()).append(",");
        if (getExplicitAuthFlows() != null)
            sb.append("ExplicitAuthFlows: ").append(getExplicitAuthFlows()).append(",");
        if (getSupportedIdentityProviders() != null)
            sb.append("SupportedIdentityProviders: ").append(getSupportedIdentityProviders()).append(",");
        if (getCallbackURLs() != null)
            sb.append("CallbackURLs: ").append(getCallbackURLs()).append(",");
        if (getLogoutURLs() != null)
            sb.append("LogoutURLs: ").append(getLogoutURLs()).append(",");
        if (getDefaultRedirectURI() != null)
            sb.append("DefaultRedirectURI: ").append(getDefaultRedirectURI()).append(",");
        if (getAllowedOAuthFlows() != null)
            sb.append("AllowedOAuthFlows: ").append(getAllowedOAuthFlows()).append(",");
        if (getAllowedOAuthScopes() != null)
            sb.append("AllowedOAuthScopes: ").append(getAllowedOAuthScopes()).append(",");
        if (getAllowedOAuthFlowsUserPoolClient() != null)
            sb.append("AllowedOAuthFlowsUserPoolClient: ").append(getAllowedOAuthFlowsUserPoolClient()).append(",");
        if (getAnalyticsConfiguration() != null)
            sb.append("AnalyticsConfiguration: ").append(getAnalyticsConfiguration()).append(",");
        if (getPreventUserExistenceErrors() != null)
            sb.append("PreventUserExistenceErrors: ").append(getPreventUserExistenceErrors()).append(",");
        if (getEnableTokenRevocation() != null)
            sb.append("EnableTokenRevocation: ").append(getEnableTokenRevocation()).append(",");
        if (getEnablePropagateAdditionalUserContextData() != null)
            sb.append("EnablePropagateAdditionalUserContextData: ").append(getEnablePropagateAdditionalUserContextData()).append(",");
        if (getAuthSessionValidity() != null)
            sb.append("AuthSessionValidity: ").append(getAuthSessionValidity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolClientType == false)
            return false;
        UserPoolClientType other = (UserPoolClientType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getRefreshTokenValidity() == null ^ this.getRefreshTokenValidity() == null)
            return false;
        if (other.getRefreshTokenValidity() != null && other.getRefreshTokenValidity().equals(this.getRefreshTokenValidity()) == false)
            return false;
        if (other.getAccessTokenValidity() == null ^ this.getAccessTokenValidity() == null)
            return false;
        if (other.getAccessTokenValidity() != null && other.getAccessTokenValidity().equals(this.getAccessTokenValidity()) == false)
            return false;
        if (other.getIdTokenValidity() == null ^ this.getIdTokenValidity() == null)
            return false;
        if (other.getIdTokenValidity() != null && other.getIdTokenValidity().equals(this.getIdTokenValidity()) == false)
            return false;
        if (other.getTokenValidityUnits() == null ^ this.getTokenValidityUnits() == null)
            return false;
        if (other.getTokenValidityUnits() != null && other.getTokenValidityUnits().equals(this.getTokenValidityUnits()) == false)
            return false;
        if (other.getReadAttributes() == null ^ this.getReadAttributes() == null)
            return false;
        if (other.getReadAttributes() != null && other.getReadAttributes().equals(this.getReadAttributes()) == false)
            return false;
        if (other.getWriteAttributes() == null ^ this.getWriteAttributes() == null)
            return false;
        if (other.getWriteAttributes() != null && other.getWriteAttributes().equals(this.getWriteAttributes()) == false)
            return false;
        if (other.getExplicitAuthFlows() == null ^ this.getExplicitAuthFlows() == null)
            return false;
        if (other.getExplicitAuthFlows() != null && other.getExplicitAuthFlows().equals(this.getExplicitAuthFlows()) == false)
            return false;
        if (other.getSupportedIdentityProviders() == null ^ this.getSupportedIdentityProviders() == null)
            return false;
        if (other.getSupportedIdentityProviders() != null && other.getSupportedIdentityProviders().equals(this.getSupportedIdentityProviders()) == false)
            return false;
        if (other.getCallbackURLs() == null ^ this.getCallbackURLs() == null)
            return false;
        if (other.getCallbackURLs() != null && other.getCallbackURLs().equals(this.getCallbackURLs()) == false)
            return false;
        if (other.getLogoutURLs() == null ^ this.getLogoutURLs() == null)
            return false;
        if (other.getLogoutURLs() != null && other.getLogoutURLs().equals(this.getLogoutURLs()) == false)
            return false;
        if (other.getDefaultRedirectURI() == null ^ this.getDefaultRedirectURI() == null)
            return false;
        if (other.getDefaultRedirectURI() != null && other.getDefaultRedirectURI().equals(this.getDefaultRedirectURI()) == false)
            return false;
        if (other.getAllowedOAuthFlows() == null ^ this.getAllowedOAuthFlows() == null)
            return false;
        if (other.getAllowedOAuthFlows() != null && other.getAllowedOAuthFlows().equals(this.getAllowedOAuthFlows()) == false)
            return false;
        if (other.getAllowedOAuthScopes() == null ^ this.getAllowedOAuthScopes() == null)
            return false;
        if (other.getAllowedOAuthScopes() != null && other.getAllowedOAuthScopes().equals(this.getAllowedOAuthScopes()) == false)
            return false;
        if (other.getAllowedOAuthFlowsUserPoolClient() == null ^ this.getAllowedOAuthFlowsUserPoolClient() == null)
            return false;
        if (other.getAllowedOAuthFlowsUserPoolClient() != null
                && other.getAllowedOAuthFlowsUserPoolClient().equals(this.getAllowedOAuthFlowsUserPoolClient()) == false)
            return false;
        if (other.getAnalyticsConfiguration() == null ^ this.getAnalyticsConfiguration() == null)
            return false;
        if (other.getAnalyticsConfiguration() != null && other.getAnalyticsConfiguration().equals(this.getAnalyticsConfiguration()) == false)
            return false;
        if (other.getPreventUserExistenceErrors() == null ^ this.getPreventUserExistenceErrors() == null)
            return false;
        if (other.getPreventUserExistenceErrors() != null && other.getPreventUserExistenceErrors().equals(this.getPreventUserExistenceErrors()) == false)
            return false;
        if (other.getEnableTokenRevocation() == null ^ this.getEnableTokenRevocation() == null)
            return false;
        if (other.getEnableTokenRevocation() != null && other.getEnableTokenRevocation().equals(this.getEnableTokenRevocation()) == false)
            return false;
        if (other.getEnablePropagateAdditionalUserContextData() == null ^ this.getEnablePropagateAdditionalUserContextData() == null)
            return false;
        if (other.getEnablePropagateAdditionalUserContextData() != null
                && other.getEnablePropagateAdditionalUserContextData().equals(this.getEnablePropagateAdditionalUserContextData()) == false)
            return false;
        if (other.getAuthSessionValidity() == null ^ this.getAuthSessionValidity() == null)
            return false;
        if (other.getAuthSessionValidity() != null && other.getAuthSessionValidity().equals(this.getAuthSessionValidity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        hashCode = prime * hashCode + ((getAccessTokenValidity() == null) ? 0 : getAccessTokenValidity().hashCode());
        hashCode = prime * hashCode + ((getIdTokenValidity() == null) ? 0 : getIdTokenValidity().hashCode());
        hashCode = prime * hashCode + ((getTokenValidityUnits() == null) ? 0 : getTokenValidityUnits().hashCode());
        hashCode = prime * hashCode + ((getReadAttributes() == null) ? 0 : getReadAttributes().hashCode());
        hashCode = prime * hashCode + ((getWriteAttributes() == null) ? 0 : getWriteAttributes().hashCode());
        hashCode = prime * hashCode + ((getExplicitAuthFlows() == null) ? 0 : getExplicitAuthFlows().hashCode());
        hashCode = prime * hashCode + ((getSupportedIdentityProviders() == null) ? 0 : getSupportedIdentityProviders().hashCode());
        hashCode = prime * hashCode + ((getCallbackURLs() == null) ? 0 : getCallbackURLs().hashCode());
        hashCode = prime * hashCode + ((getLogoutURLs() == null) ? 0 : getLogoutURLs().hashCode());
        hashCode = prime * hashCode + ((getDefaultRedirectURI() == null) ? 0 : getDefaultRedirectURI().hashCode());
        hashCode = prime * hashCode + ((getAllowedOAuthFlows() == null) ? 0 : getAllowedOAuthFlows().hashCode());
        hashCode = prime * hashCode + ((getAllowedOAuthScopes() == null) ? 0 : getAllowedOAuthScopes().hashCode());
        hashCode = prime * hashCode + ((getAllowedOAuthFlowsUserPoolClient() == null) ? 0 : getAllowedOAuthFlowsUserPoolClient().hashCode());
        hashCode = prime * hashCode + ((getAnalyticsConfiguration() == null) ? 0 : getAnalyticsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPreventUserExistenceErrors() == null) ? 0 : getPreventUserExistenceErrors().hashCode());
        hashCode = prime * hashCode + ((getEnableTokenRevocation() == null) ? 0 : getEnableTokenRevocation().hashCode());
        hashCode = prime * hashCode + ((getEnablePropagateAdditionalUserContextData() == null) ? 0 : getEnablePropagateAdditionalUserContextData().hashCode());
        hashCode = prime * hashCode + ((getAuthSessionValidity() == null) ? 0 : getAuthSessionValidity().hashCode());
        return hashCode;
    }

    @Override
    public UserPoolClientType clone() {
        try {
            return (UserPoolClientType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.UserPoolClientTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
