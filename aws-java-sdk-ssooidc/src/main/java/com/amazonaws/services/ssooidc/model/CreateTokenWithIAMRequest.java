/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssooidc.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/CreateTokenWithIAM" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTokenWithIAMRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier string for the client or application. This value is an application ARN that has OAuth
     * grants configured.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * Supports the following OAuth grant types: Authorization Code, Refresh Token, JWT Bearer, and Token Exchange.
     * Specify one of the following values, depending on the grant type that you want:
     * </p>
     * <p>
     * * Authorization Code - <code>authorization_code</code>
     * </p>
     * <p>
     * * Refresh Token - <code>refresh_token</code>
     * </p>
     * <p>
     * * JWT Bearer - <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>
     * </p>
     * <p>
     * * Token Exchange - <code>urn:ietf:params:oauth:grant-type:token-exchange</code>
     * </p>
     */
    private String grantType;
    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This short-term code is used to identify
     * this authorization request. The code is obtained through a redirect from IAM Identity Center to a redirect URI
     * persisted in the Authorization Code GrantOptions for the application.
     * </p>
     */
    private String code;
    /**
     * <p>
     * Used only when calling this API for the Refresh Token grant type. This token is used to refresh short-term
     * tokens, such as the access token, that might expire.
     * </p>
     * <p>
     * For more information about the features and limitations of the current IAM Identity Center OIDC implementation,
     * see <i>Considerations for Using this Guide</i> in the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center OIDC API
     * Reference</a>.
     * </p>
     */
    private String refreshToken;
    /**
     * <p>
     * Used only when calling this API for the JWT Bearer grant type. This value specifies the JSON Web Token (JWT)
     * issued by a trusted token issuer. To authorize a trusted token issuer, configure the JWT Bearer GrantOptions for
     * the application.
     * </p>
     */
    private String assertion;
    /**
     * <p>
     * The list of scopes for which authorization is requested. The access token that is issued is limited to the scopes
     * that are granted. If the value is not specified, IAM Identity Center authorizes all scopes configured for the
     * application, including the following default scopes: <code>openid</code>, <code>aws</code>,
     * <code>sts:identity_context</code>.
     * </p>
     */
    private java.util.List<String> scope;
    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value specifies the location of the
     * client or application that has registered to receive the authorization code.
     * </p>
     */
    private String redirectUri;
    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the subject of the
     * exchange. The value of the subject token must be an access token issued by IAM Identity Center to a different
     * client or application. The access token must have authorized scopes that indicate the requested application as a
     * target audience.
     * </p>
     */
    private String subjectToken;
    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that is
     * passed as the subject of the exchange. The following value is supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     */
    private String subjectTokenType;
    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that
     * the requester can receive. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     */
    private String requestedTokenType;
    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value is generated by the client and
     * presented to validate the original code challenge value the client passed at authorization time.
     * </p>
     */
    private String codeVerifier;

    /**
     * <p>
     * The unique identifier string for the client or application. This value is an application ARN that has OAuth
     * grants configured.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for the client or application. This value is an application ARN that has
     *        OAuth grants configured.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The unique identifier string for the client or application. This value is an application ARN that has OAuth
     * grants configured.
     * </p>
     * 
     * @return The unique identifier string for the client or application. This value is an application ARN that has
     *         OAuth grants configured.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The unique identifier string for the client or application. This value is an application ARN that has OAuth
     * grants configured.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for the client or application. This value is an application ARN that has
     *        OAuth grants configured.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * Supports the following OAuth grant types: Authorization Code, Refresh Token, JWT Bearer, and Token Exchange.
     * Specify one of the following values, depending on the grant type that you want:
     * </p>
     * <p>
     * * Authorization Code - <code>authorization_code</code>
     * </p>
     * <p>
     * * Refresh Token - <code>refresh_token</code>
     * </p>
     * <p>
     * * JWT Bearer - <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>
     * </p>
     * <p>
     * * Token Exchange - <code>urn:ietf:params:oauth:grant-type:token-exchange</code>
     * </p>
     * 
     * @param grantType
     *        Supports the following OAuth grant types: Authorization Code, Refresh Token, JWT Bearer, and Token
     *        Exchange. Specify one of the following values, depending on the grant type that you want:</p>
     *        <p>
     *        Authorization Code - <code>authorization_code</code>
     *        </p>
     *        <p>
     *        Refresh Token - <code>refresh_token</code>
     *        </p>
     *        <p>
     *        JWT Bearer - <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>
     *        </p>
     *        <p>
     *        Token Exchange - <code>urn:ietf:params:oauth:grant-type:token-exchange</code>
     */

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * <p>
     * Supports the following OAuth grant types: Authorization Code, Refresh Token, JWT Bearer, and Token Exchange.
     * Specify one of the following values, depending on the grant type that you want:
     * </p>
     * <p>
     * * Authorization Code - <code>authorization_code</code>
     * </p>
     * <p>
     * * Refresh Token - <code>refresh_token</code>
     * </p>
     * <p>
     * * JWT Bearer - <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>
     * </p>
     * <p>
     * * Token Exchange - <code>urn:ietf:params:oauth:grant-type:token-exchange</code>
     * </p>
     * 
     * @return Supports the following OAuth grant types: Authorization Code, Refresh Token, JWT Bearer, and Token
     *         Exchange. Specify one of the following values, depending on the grant type that you want:</p>
     *         <p>
     *         Authorization Code - <code>authorization_code</code>
     *         </p>
     *         <p>
     *         Refresh Token - <code>refresh_token</code>
     *         </p>
     *         <p>
     *         JWT Bearer - <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>
     *         </p>
     *         <p>
     *         Token Exchange - <code>urn:ietf:params:oauth:grant-type:token-exchange</code>
     */

    public String getGrantType() {
        return this.grantType;
    }

    /**
     * <p>
     * Supports the following OAuth grant types: Authorization Code, Refresh Token, JWT Bearer, and Token Exchange.
     * Specify one of the following values, depending on the grant type that you want:
     * </p>
     * <p>
     * * Authorization Code - <code>authorization_code</code>
     * </p>
     * <p>
     * * Refresh Token - <code>refresh_token</code>
     * </p>
     * <p>
     * * JWT Bearer - <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>
     * </p>
     * <p>
     * * Token Exchange - <code>urn:ietf:params:oauth:grant-type:token-exchange</code>
     * </p>
     * 
     * @param grantType
     *        Supports the following OAuth grant types: Authorization Code, Refresh Token, JWT Bearer, and Token
     *        Exchange. Specify one of the following values, depending on the grant type that you want:</p>
     *        <p>
     *        Authorization Code - <code>authorization_code</code>
     *        </p>
     *        <p>
     *        Refresh Token - <code>refresh_token</code>
     *        </p>
     *        <p>
     *        JWT Bearer - <code>urn:ietf:params:oauth:grant-type:jwt-bearer</code>
     *        </p>
     *        <p>
     *        Token Exchange - <code>urn:ietf:params:oauth:grant-type:token-exchange</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withGrantType(String grantType) {
        setGrantType(grantType);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This short-term code is used to identify
     * this authorization request. The code is obtained through a redirect from IAM Identity Center to a redirect URI
     * persisted in the Authorization Code GrantOptions for the application.
     * </p>
     * 
     * @param code
     *        Used only when calling this API for the Authorization Code grant type. This short-term code is used to
     *        identify this authorization request. The code is obtained through a redirect from IAM Identity Center to a
     *        redirect URI persisted in the Authorization Code GrantOptions for the application.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This short-term code is used to identify
     * this authorization request. The code is obtained through a redirect from IAM Identity Center to a redirect URI
     * persisted in the Authorization Code GrantOptions for the application.
     * </p>
     * 
     * @return Used only when calling this API for the Authorization Code grant type. This short-term code is used to
     *         identify this authorization request. The code is obtained through a redirect from IAM Identity Center to
     *         a redirect URI persisted in the Authorization Code GrantOptions for the application.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This short-term code is used to identify
     * this authorization request. The code is obtained through a redirect from IAM Identity Center to a redirect URI
     * persisted in the Authorization Code GrantOptions for the application.
     * </p>
     * 
     * @param code
     *        Used only when calling this API for the Authorization Code grant type. This short-term code is used to
     *        identify this authorization request. The code is obtained through a redirect from IAM Identity Center to a
     *        redirect URI persisted in the Authorization Code GrantOptions for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the Refresh Token grant type. This token is used to refresh short-term
     * tokens, such as the access token, that might expire.
     * </p>
     * <p>
     * For more information about the features and limitations of the current IAM Identity Center OIDC implementation,
     * see <i>Considerations for Using this Guide</i> in the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center OIDC API
     * Reference</a>.
     * </p>
     * 
     * @param refreshToken
     *        Used only when calling this API for the Refresh Token grant type. This token is used to refresh short-term
     *        tokens, such as the access token, that might expire.</p>
     *        <p>
     *        For more information about the features and limitations of the current IAM Identity Center OIDC
     *        implementation, see <i>Considerations for Using this Guide</i> in the <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center
     *        OIDC API Reference</a>.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * Used only when calling this API for the Refresh Token grant type. This token is used to refresh short-term
     * tokens, such as the access token, that might expire.
     * </p>
     * <p>
     * For more information about the features and limitations of the current IAM Identity Center OIDC implementation,
     * see <i>Considerations for Using this Guide</i> in the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center OIDC API
     * Reference</a>.
     * </p>
     * 
     * @return Used only when calling this API for the Refresh Token grant type. This token is used to refresh
     *         short-term tokens, such as the access token, that might expire.</p>
     *         <p>
     *         For more information about the features and limitations of the current IAM Identity Center OIDC
     *         implementation, see <i>Considerations for Using this Guide</i> in the <a
     *         href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center
     *         OIDC API Reference</a>.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * Used only when calling this API for the Refresh Token grant type. This token is used to refresh short-term
     * tokens, such as the access token, that might expire.
     * </p>
     * <p>
     * For more information about the features and limitations of the current IAM Identity Center OIDC implementation,
     * see <i>Considerations for Using this Guide</i> in the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center OIDC API
     * Reference</a>.
     * </p>
     * 
     * @param refreshToken
     *        Used only when calling this API for the Refresh Token grant type. This token is used to refresh short-term
     *        tokens, such as the access token, that might expire.</p>
     *        <p>
     *        For more information about the features and limitations of the current IAM Identity Center OIDC
     *        implementation, see <i>Considerations for Using this Guide</i> in the <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center
     *        OIDC API Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the JWT Bearer grant type. This value specifies the JSON Web Token (JWT)
     * issued by a trusted token issuer. To authorize a trusted token issuer, configure the JWT Bearer GrantOptions for
     * the application.
     * </p>
     * 
     * @param assertion
     *        Used only when calling this API for the JWT Bearer grant type. This value specifies the JSON Web Token
     *        (JWT) issued by a trusted token issuer. To authorize a trusted token issuer, configure the JWT Bearer
     *        GrantOptions for the application.
     */

    public void setAssertion(String assertion) {
        this.assertion = assertion;
    }

    /**
     * <p>
     * Used only when calling this API for the JWT Bearer grant type. This value specifies the JSON Web Token (JWT)
     * issued by a trusted token issuer. To authorize a trusted token issuer, configure the JWT Bearer GrantOptions for
     * the application.
     * </p>
     * 
     * @return Used only when calling this API for the JWT Bearer grant type. This value specifies the JSON Web Token
     *         (JWT) issued by a trusted token issuer. To authorize a trusted token issuer, configure the JWT Bearer
     *         GrantOptions for the application.
     */

    public String getAssertion() {
        return this.assertion;
    }

    /**
     * <p>
     * Used only when calling this API for the JWT Bearer grant type. This value specifies the JSON Web Token (JWT)
     * issued by a trusted token issuer. To authorize a trusted token issuer, configure the JWT Bearer GrantOptions for
     * the application.
     * </p>
     * 
     * @param assertion
     *        Used only when calling this API for the JWT Bearer grant type. This value specifies the JSON Web Token
     *        (JWT) issued by a trusted token issuer. To authorize a trusted token issuer, configure the JWT Bearer
     *        GrantOptions for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withAssertion(String assertion) {
        setAssertion(assertion);
        return this;
    }

    /**
     * <p>
     * The list of scopes for which authorization is requested. The access token that is issued is limited to the scopes
     * that are granted. If the value is not specified, IAM Identity Center authorizes all scopes configured for the
     * application, including the following default scopes: <code>openid</code>, <code>aws</code>,
     * <code>sts:identity_context</code>.
     * </p>
     * 
     * @return The list of scopes for which authorization is requested. The access token that is issued is limited to
     *         the scopes that are granted. If the value is not specified, IAM Identity Center authorizes all scopes
     *         configured for the application, including the following default scopes: <code>openid</code>,
     *         <code>aws</code>, <code>sts:identity_context</code>.
     */

    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * <p>
     * The list of scopes for which authorization is requested. The access token that is issued is limited to the scopes
     * that are granted. If the value is not specified, IAM Identity Center authorizes all scopes configured for the
     * application, including the following default scopes: <code>openid</code>, <code>aws</code>,
     * <code>sts:identity_context</code>.
     * </p>
     * 
     * @param scope
     *        The list of scopes for which authorization is requested. The access token that is issued is limited to the
     *        scopes that are granted. If the value is not specified, IAM Identity Center authorizes all scopes
     *        configured for the application, including the following default scopes: <code>openid</code>,
     *        <code>aws</code>, <code>sts:identity_context</code>.
     */

    public void setScope(java.util.Collection<String> scope) {
        if (scope == null) {
            this.scope = null;
            return;
        }

        this.scope = new java.util.ArrayList<String>(scope);
    }

    /**
     * <p>
     * The list of scopes for which authorization is requested. The access token that is issued is limited to the scopes
     * that are granted. If the value is not specified, IAM Identity Center authorizes all scopes configured for the
     * application, including the following default scopes: <code>openid</code>, <code>aws</code>,
     * <code>sts:identity_context</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScope(java.util.Collection)} or {@link #withScope(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scope
     *        The list of scopes for which authorization is requested. The access token that is issued is limited to the
     *        scopes that are granted. If the value is not specified, IAM Identity Center authorizes all scopes
     *        configured for the application, including the following default scopes: <code>openid</code>,
     *        <code>aws</code>, <code>sts:identity_context</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withScope(String... scope) {
        if (this.scope == null) {
            setScope(new java.util.ArrayList<String>(scope.length));
        }
        for (String ele : scope) {
            this.scope.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scopes for which authorization is requested. The access token that is issued is limited to the scopes
     * that are granted. If the value is not specified, IAM Identity Center authorizes all scopes configured for the
     * application, including the following default scopes: <code>openid</code>, <code>aws</code>,
     * <code>sts:identity_context</code>.
     * </p>
     * 
     * @param scope
     *        The list of scopes for which authorization is requested. The access token that is issued is limited to the
     *        scopes that are granted. If the value is not specified, IAM Identity Center authorizes all scopes
     *        configured for the application, including the following default scopes: <code>openid</code>,
     *        <code>aws</code>, <code>sts:identity_context</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withScope(java.util.Collection<String> scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value specifies the location of the
     * client or application that has registered to receive the authorization code.
     * </p>
     * 
     * @param redirectUri
     *        Used only when calling this API for the Authorization Code grant type. This value specifies the location
     *        of the client or application that has registered to receive the authorization code.
     */

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value specifies the location of the
     * client or application that has registered to receive the authorization code.
     * </p>
     * 
     * @return Used only when calling this API for the Authorization Code grant type. This value specifies the location
     *         of the client or application that has registered to receive the authorization code.
     */

    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value specifies the location of the
     * client or application that has registered to receive the authorization code.
     * </p>
     * 
     * @param redirectUri
     *        Used only when calling this API for the Authorization Code grant type. This value specifies the location
     *        of the client or application that has registered to receive the authorization code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withRedirectUri(String redirectUri) {
        setRedirectUri(redirectUri);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the subject of the
     * exchange. The value of the subject token must be an access token issued by IAM Identity Center to a different
     * client or application. The access token must have authorized scopes that indicate the requested application as a
     * target audience.
     * </p>
     * 
     * @param subjectToken
     *        Used only when calling this API for the Token Exchange grant type. This value specifies the subject of the
     *        exchange. The value of the subject token must be an access token issued by IAM Identity Center to a
     *        different client or application. The access token must have authorized scopes that indicate the requested
     *        application as a target audience.
     */

    public void setSubjectToken(String subjectToken) {
        this.subjectToken = subjectToken;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the subject of the
     * exchange. The value of the subject token must be an access token issued by IAM Identity Center to a different
     * client or application. The access token must have authorized scopes that indicate the requested application as a
     * target audience.
     * </p>
     * 
     * @return Used only when calling this API for the Token Exchange grant type. This value specifies the subject of
     *         the exchange. The value of the subject token must be an access token issued by IAM Identity Center to a
     *         different client or application. The access token must have authorized scopes that indicate the requested
     *         application as a target audience.
     */

    public String getSubjectToken() {
        return this.subjectToken;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the subject of the
     * exchange. The value of the subject token must be an access token issued by IAM Identity Center to a different
     * client or application. The access token must have authorized scopes that indicate the requested application as a
     * target audience.
     * </p>
     * 
     * @param subjectToken
     *        Used only when calling this API for the Token Exchange grant type. This value specifies the subject of the
     *        exchange. The value of the subject token must be an access token issued by IAM Identity Center to a
     *        different client or application. The access token must have authorized scopes that indicate the requested
     *        application as a target audience.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withSubjectToken(String subjectToken) {
        setSubjectToken(subjectToken);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that is
     * passed as the subject of the exchange. The following value is supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * 
     * @param subjectTokenType
     *        Used only when calling this API for the Token Exchange grant type. This value specifies the type of token
     *        that is passed as the subject of the exchange. The following value is supported:</p>
     *        <p>
     *        Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     */

    public void setSubjectTokenType(String subjectTokenType) {
        this.subjectTokenType = subjectTokenType;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that is
     * passed as the subject of the exchange. The following value is supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * 
     * @return Used only when calling this API for the Token Exchange grant type. This value specifies the type of token
     *         that is passed as the subject of the exchange. The following value is supported:</p>
     *         <p>
     *         Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     */

    public String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that is
     * passed as the subject of the exchange. The following value is supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * 
     * @param subjectTokenType
     *        Used only when calling this API for the Token Exchange grant type. This value specifies the type of token
     *        that is passed as the subject of the exchange. The following value is supported:</p>
     *        <p>
     *        Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withSubjectTokenType(String subjectTokenType) {
        setSubjectTokenType(subjectTokenType);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that
     * the requester can receive. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     * 
     * @param requestedTokenType
     *        Used only when calling this API for the Token Exchange grant type. This value specifies the type of token
     *        that the requester can receive. The following values are supported:</p>
     *        <p>
     *        Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     *        </p>
     *        <p>
     *        Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     */

    public void setRequestedTokenType(String requestedTokenType) {
        this.requestedTokenType = requestedTokenType;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that
     * the requester can receive. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     * 
     * @return Used only when calling this API for the Token Exchange grant type. This value specifies the type of token
     *         that the requester can receive. The following values are supported:</p>
     *         <p>
     *         Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     *         </p>
     *         <p>
     *         Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     */

    public String getRequestedTokenType() {
        return this.requestedTokenType;
    }

    /**
     * <p>
     * Used only when calling this API for the Token Exchange grant type. This value specifies the type of token that
     * the requester can receive. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     * 
     * @param requestedTokenType
     *        Used only when calling this API for the Token Exchange grant type. This value specifies the type of token
     *        that the requester can receive. The following values are supported:</p>
     *        <p>
     *        Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     *        </p>
     *        <p>
     *        Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withRequestedTokenType(String requestedTokenType) {
        setRequestedTokenType(requestedTokenType);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value is generated by the client and
     * presented to validate the original code challenge value the client passed at authorization time.
     * </p>
     * 
     * @param codeVerifier
     *        Used only when calling this API for the Authorization Code grant type. This value is generated by the
     *        client and presented to validate the original code challenge value the client passed at authorization
     *        time.
     */

    public void setCodeVerifier(String codeVerifier) {
        this.codeVerifier = codeVerifier;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value is generated by the client and
     * presented to validate the original code challenge value the client passed at authorization time.
     * </p>
     * 
     * @return Used only when calling this API for the Authorization Code grant type. This value is generated by the
     *         client and presented to validate the original code challenge value the client passed at authorization
     *         time.
     */

    public String getCodeVerifier() {
        return this.codeVerifier;
    }

    /**
     * <p>
     * Used only when calling this API for the Authorization Code grant type. This value is generated by the client and
     * presented to validate the original code challenge value the client passed at authorization time.
     * </p>
     * 
     * @param codeVerifier
     *        Used only when calling this API for the Authorization Code grant type. This value is generated by the
     *        client and presented to validate the original code challenge value the client passed at authorization
     *        time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMRequest withCodeVerifier(String codeVerifier) {
        setCodeVerifier(codeVerifier);
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
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getGrantType() != null)
            sb.append("GrantType: ").append(getGrantType()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getAssertion() != null)
            sb.append("Assertion: ").append("***Sensitive Data Redacted***").append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getRedirectUri() != null)
            sb.append("RedirectUri: ").append(getRedirectUri()).append(",");
        if (getSubjectToken() != null)
            sb.append("SubjectToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getSubjectTokenType() != null)
            sb.append("SubjectTokenType: ").append(getSubjectTokenType()).append(",");
        if (getRequestedTokenType() != null)
            sb.append("RequestedTokenType: ").append(getRequestedTokenType()).append(",");
        if (getCodeVerifier() != null)
            sb.append("CodeVerifier: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTokenWithIAMRequest == false)
            return false;
        CreateTokenWithIAMRequest other = (CreateTokenWithIAMRequest) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getGrantType() == null ^ this.getGrantType() == null)
            return false;
        if (other.getGrantType() != null && other.getGrantType().equals(this.getGrantType()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getAssertion() == null ^ this.getAssertion() == null)
            return false;
        if (other.getAssertion() != null && other.getAssertion().equals(this.getAssertion()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getRedirectUri() == null ^ this.getRedirectUri() == null)
            return false;
        if (other.getRedirectUri() != null && other.getRedirectUri().equals(this.getRedirectUri()) == false)
            return false;
        if (other.getSubjectToken() == null ^ this.getSubjectToken() == null)
            return false;
        if (other.getSubjectToken() != null && other.getSubjectToken().equals(this.getSubjectToken()) == false)
            return false;
        if (other.getSubjectTokenType() == null ^ this.getSubjectTokenType() == null)
            return false;
        if (other.getSubjectTokenType() != null && other.getSubjectTokenType().equals(this.getSubjectTokenType()) == false)
            return false;
        if (other.getRequestedTokenType() == null ^ this.getRequestedTokenType() == null)
            return false;
        if (other.getRequestedTokenType() != null && other.getRequestedTokenType().equals(this.getRequestedTokenType()) == false)
            return false;
        if (other.getCodeVerifier() == null ^ this.getCodeVerifier() == null)
            return false;
        if (other.getCodeVerifier() != null && other.getCodeVerifier().equals(this.getCodeVerifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getGrantType() == null) ? 0 : getGrantType().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getAssertion() == null) ? 0 : getAssertion().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getRedirectUri() == null) ? 0 : getRedirectUri().hashCode());
        hashCode = prime * hashCode + ((getSubjectToken() == null) ? 0 : getSubjectToken().hashCode());
        hashCode = prime * hashCode + ((getSubjectTokenType() == null) ? 0 : getSubjectTokenType().hashCode());
        hashCode = prime * hashCode + ((getRequestedTokenType() == null) ? 0 : getRequestedTokenType().hashCode());
        hashCode = prime * hashCode + ((getCodeVerifier() == null) ? 0 : getCodeVerifier().hashCode());
        return hashCode;
    }

    @Override
    public CreateTokenWithIAMRequest clone() {
        return (CreateTokenWithIAMRequest) super.clone();
    }

}
