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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The connector-specific profile credentials required when using Salesforce.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SalesforceConnectorProfileCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SalesforceConnectorProfileCredentials implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     */
    private String refreshToken;
    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     */
    private ConnectorOAuthRequest oAuthRequest;
    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     */
    private String clientCredentialsArn;
    /**
     * <p>
     * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from Salesforce.
     * Amazon AppFlow requires an access token each time it attempts to access your Salesforce records.
     * </p>
     * <p>
     * You can specify one of the following values:
     * </p>
     * <dl>
     * <dt>AUTHORIZATION_CODE</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon AppFlow
     * receives the authorization code from Salesforce after you log in to your Salesforce account and authorize Amazon
     * AppFlow to access your records.
     * </p>
     * </dd>
     * <dt>CLIENT_CREDENTIALS</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token from
     * Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your Salesforce
     * account.
     * </p>
     * </dd>
     * <dt>JWT_BEARER</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You provide the
     * JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use this grant type,
     * you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access your records.
     * </p>
     * </dd>
     * </dl>
     */
    private String oAuth2GrantType;
    /**
     * <p>
     * A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     * </p>
     */
    private String jwtToken;

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Salesforce resources.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     * 
     * @return The credentials used to access protected Salesforce resources.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * The credentials used to access protected Salesforce resources.
     * </p>
     * 
     * @param accessToken
     *        The credentials used to access protected Salesforce resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     * 
     * @param refreshToken
     *        The credentials used to acquire new access tokens.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     * 
     * @return The credentials used to acquire new access tokens.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * The credentials used to acquire new access tokens.
     * </p>
     * 
     * @param refreshToken
     *        The credentials used to acquire new access tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     * 
     * @param oAuthRequest
     *        The OAuth requirement needed to request security tokens from the connector endpoint.
     */

    public void setOAuthRequest(ConnectorOAuthRequest oAuthRequest) {
        this.oAuthRequest = oAuthRequest;
    }

    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     * 
     * @return The OAuth requirement needed to request security tokens from the connector endpoint.
     */

    public ConnectorOAuthRequest getOAuthRequest() {
        return this.oAuthRequest;
    }

    /**
     * <p>
     * The OAuth requirement needed to request security tokens from the connector endpoint.
     * </p>
     * 
     * @param oAuthRequest
     *        The OAuth requirement needed to request security tokens from the connector endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withOAuthRequest(ConnectorOAuthRequest oAuthRequest) {
        setOAuthRequest(oAuthRequest);
        return this;
    }

    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     * 
     * @param clientCredentialsArn
     *        The secret manager ARN, which contains the client ID and client secret of the connected app.
     */

    public void setClientCredentialsArn(String clientCredentialsArn) {
        this.clientCredentialsArn = clientCredentialsArn;
    }

    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     * 
     * @return The secret manager ARN, which contains the client ID and client secret of the connected app.
     */

    public String getClientCredentialsArn() {
        return this.clientCredentialsArn;
    }

    /**
     * <p>
     * The secret manager ARN, which contains the client ID and client secret of the connected app.
     * </p>
     * 
     * @param clientCredentialsArn
     *        The secret manager ARN, which contains the client ID and client secret of the connected app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withClientCredentialsArn(String clientCredentialsArn) {
        setClientCredentialsArn(clientCredentialsArn);
        return this;
    }

    /**
     * <p>
     * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from Salesforce.
     * Amazon AppFlow requires an access token each time it attempts to access your Salesforce records.
     * </p>
     * <p>
     * You can specify one of the following values:
     * </p>
     * <dl>
     * <dt>AUTHORIZATION_CODE</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon AppFlow
     * receives the authorization code from Salesforce after you log in to your Salesforce account and authorize Amazon
     * AppFlow to access your records.
     * </p>
     * </dd>
     * <dt>CLIENT_CREDENTIALS</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token from
     * Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your Salesforce
     * account.
     * </p>
     * </dd>
     * <dt>JWT_BEARER</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You provide the
     * JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use this grant type,
     * you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access your records.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param oAuth2GrantType
     *        Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from
     *        Salesforce. Amazon AppFlow requires an access token each time it attempts to access your Salesforce
     *        records.</p>
     *        <p>
     *        You can specify one of the following values:
     *        </p>
     *        <dl>
     *        <dt>AUTHORIZATION_CODE</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon
     *        AppFlow receives the authorization code from Salesforce after you log in to your Salesforce account and
     *        authorize Amazon AppFlow to access your records.
     *        </p>
     *        </dd>
     *        <dt>CLIENT_CREDENTIALS</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token
     *        from Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your
     *        Salesforce account.
     *        </p>
     *        </dd>
     *        <dt>JWT_BEARER</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You
     *        provide the JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use
     *        this grant type, you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access
     *        your records.
     *        </p>
     *        </dd>
     * @see OAuth2GrantType
     */

    public void setOAuth2GrantType(String oAuth2GrantType) {
        this.oAuth2GrantType = oAuth2GrantType;
    }

    /**
     * <p>
     * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from Salesforce.
     * Amazon AppFlow requires an access token each time it attempts to access your Salesforce records.
     * </p>
     * <p>
     * You can specify one of the following values:
     * </p>
     * <dl>
     * <dt>AUTHORIZATION_CODE</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon AppFlow
     * receives the authorization code from Salesforce after you log in to your Salesforce account and authorize Amazon
     * AppFlow to access your records.
     * </p>
     * </dd>
     * <dt>CLIENT_CREDENTIALS</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token from
     * Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your Salesforce
     * account.
     * </p>
     * </dd>
     * <dt>JWT_BEARER</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You provide the
     * JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use this grant type,
     * you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access your records.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from
     *         Salesforce. Amazon AppFlow requires an access token each time it attempts to access your Salesforce
     *         records.</p>
     *         <p>
     *         You can specify one of the following values:
     *         </p>
     *         <dl>
     *         <dt>AUTHORIZATION_CODE</dt>
     *         <dd>
     *         <p>
     *         Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon
     *         AppFlow receives the authorization code from Salesforce after you log in to your Salesforce account and
     *         authorize Amazon AppFlow to access your records.
     *         </p>
     *         </dd>
     *         <dt>CLIENT_CREDENTIALS</dt>
     *         <dd>
     *         <p>
     *         Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access
     *         token from Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to
     *         your Salesforce account.
     *         </p>
     *         </dd>
     *         <dt>JWT_BEARER</dt>
     *         <dd>
     *         <p>
     *         Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You
     *         provide the JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use
     *         this grant type, you don't need to log in to your Salesforce account to authorize Amazon AppFlow to
     *         access your records.
     *         </p>
     *         </dd>
     * @see OAuth2GrantType
     */

    public String getOAuth2GrantType() {
        return this.oAuth2GrantType;
    }

    /**
     * <p>
     * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from Salesforce.
     * Amazon AppFlow requires an access token each time it attempts to access your Salesforce records.
     * </p>
     * <p>
     * You can specify one of the following values:
     * </p>
     * <dl>
     * <dt>AUTHORIZATION_CODE</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon AppFlow
     * receives the authorization code from Salesforce after you log in to your Salesforce account and authorize Amazon
     * AppFlow to access your records.
     * </p>
     * </dd>
     * <dt>CLIENT_CREDENTIALS</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token from
     * Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your Salesforce
     * account.
     * </p>
     * </dd>
     * <dt>JWT_BEARER</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You provide the
     * JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use this grant type,
     * you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access your records.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param oAuth2GrantType
     *        Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from
     *        Salesforce. Amazon AppFlow requires an access token each time it attempts to access your Salesforce
     *        records.</p>
     *        <p>
     *        You can specify one of the following values:
     *        </p>
     *        <dl>
     *        <dt>AUTHORIZATION_CODE</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon
     *        AppFlow receives the authorization code from Salesforce after you log in to your Salesforce account and
     *        authorize Amazon AppFlow to access your records.
     *        </p>
     *        </dd>
     *        <dt>CLIENT_CREDENTIALS</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token
     *        from Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your
     *        Salesforce account.
     *        </p>
     *        </dd>
     *        <dt>JWT_BEARER</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You
     *        provide the JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use
     *        this grant type, you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access
     *        your records.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public SalesforceConnectorProfileCredentials withOAuth2GrantType(String oAuth2GrantType) {
        setOAuth2GrantType(oAuth2GrantType);
        return this;
    }

    /**
     * <p>
     * Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from Salesforce.
     * Amazon AppFlow requires an access token each time it attempts to access your Salesforce records.
     * </p>
     * <p>
     * You can specify one of the following values:
     * </p>
     * <dl>
     * <dt>AUTHORIZATION_CODE</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon AppFlow
     * receives the authorization code from Salesforce after you log in to your Salesforce account and authorize Amazon
     * AppFlow to access your records.
     * </p>
     * </dd>
     * <dt>CLIENT_CREDENTIALS</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token from
     * Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your Salesforce
     * account.
     * </p>
     * </dd>
     * <dt>JWT_BEARER</dt>
     * <dd>
     * <p>
     * Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You provide the
     * JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use this grant type,
     * you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access your records.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param oAuth2GrantType
     *        Specifies the OAuth 2.0 grant type that Amazon AppFlow uses when it requests an access token from
     *        Salesforce. Amazon AppFlow requires an access token each time it attempts to access your Salesforce
     *        records.</p>
     *        <p>
     *        You can specify one of the following values:
     *        </p>
     *        <dl>
     *        <dt>AUTHORIZATION_CODE</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes an authorization code when it requests the access token from Salesforce. Amazon
     *        AppFlow receives the authorization code from Salesforce after you log in to your Salesforce account and
     *        authorize Amazon AppFlow to access your records.
     *        </p>
     *        </dd>
     *        <dt>CLIENT_CREDENTIALS</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes client credentials (a client ID and client secret) when it requests the access token
     *        from Salesforce. You provide these credentials to Amazon AppFlow when you define the connection to your
     *        Salesforce account.
     *        </p>
     *        </dd>
     *        <dt>JWT_BEARER</dt>
     *        <dd>
     *        <p>
     *        Amazon AppFlow passes a JSON web token (JWT) when it requests the access token from Salesforce. You
     *        provide the JWT to Amazon AppFlow when you define the connection to your Salesforce account. When you use
     *        this grant type, you don't need to log in to your Salesforce account to authorize Amazon AppFlow to access
     *        your records.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public SalesforceConnectorProfileCredentials withOAuth2GrantType(OAuth2GrantType oAuth2GrantType) {
        this.oAuth2GrantType = oAuth2GrantType.toString();
        return this;
    }

    /**
     * <p>
     * A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     * </p>
     * 
     * @param jwtToken
     *        A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     */

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    /**
     * <p>
     * A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     * </p>
     * 
     * @return A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     */

    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * <p>
     * A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     * </p>
     * 
     * @param jwtToken
     *        A JSON web token (JWT) that authorizes Amazon AppFlow to access your Salesforce records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SalesforceConnectorProfileCredentials withJwtToken(String jwtToken) {
        setJwtToken(jwtToken);
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
        if (getAccessToken() != null)
            sb.append("AccessToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append(getRefreshToken()).append(",");
        if (getOAuthRequest() != null)
            sb.append("OAuthRequest: ").append(getOAuthRequest()).append(",");
        if (getClientCredentialsArn() != null)
            sb.append("ClientCredentialsArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getOAuth2GrantType() != null)
            sb.append("OAuth2GrantType: ").append(getOAuth2GrantType()).append(",");
        if (getJwtToken() != null)
            sb.append("JwtToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SalesforceConnectorProfileCredentials == false)
            return false;
        SalesforceConnectorProfileCredentials other = (SalesforceConnectorProfileCredentials) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getOAuthRequest() == null ^ this.getOAuthRequest() == null)
            return false;
        if (other.getOAuthRequest() != null && other.getOAuthRequest().equals(this.getOAuthRequest()) == false)
            return false;
        if (other.getClientCredentialsArn() == null ^ this.getClientCredentialsArn() == null)
            return false;
        if (other.getClientCredentialsArn() != null && other.getClientCredentialsArn().equals(this.getClientCredentialsArn()) == false)
            return false;
        if (other.getOAuth2GrantType() == null ^ this.getOAuth2GrantType() == null)
            return false;
        if (other.getOAuth2GrantType() != null && other.getOAuth2GrantType().equals(this.getOAuth2GrantType()) == false)
            return false;
        if (other.getJwtToken() == null ^ this.getJwtToken() == null)
            return false;
        if (other.getJwtToken() != null && other.getJwtToken().equals(this.getJwtToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getOAuthRequest() == null) ? 0 : getOAuthRequest().hashCode());
        hashCode = prime * hashCode + ((getClientCredentialsArn() == null) ? 0 : getClientCredentialsArn().hashCode());
        hashCode = prime * hashCode + ((getOAuth2GrantType() == null) ? 0 : getOAuth2GrantType().hashCode());
        hashCode = prime * hashCode + ((getJwtToken() == null) ? 0 : getJwtToken().hashCode());
        return hashCode;
    }

    @Override
    public SalesforceConnectorProfileCredentials clone() {
        try {
            return (SalesforceConnectorProfileCredentials) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SalesforceConnectorProfileCredentialsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
