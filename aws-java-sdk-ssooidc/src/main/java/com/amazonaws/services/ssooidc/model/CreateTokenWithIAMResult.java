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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/CreateTokenWithIAM" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTokenWithIAMResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A bearer token to access Amazon Web Services accounts and applications assigned to a user.
     * </p>
     */
    private String accessToken;
    /**
     * <p>
     * Used to notify the requester that the returned token is an access token. The supported token type is
     * <code>Bearer</code>.
     * </p>
     */
    private String tokenType;
    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     */
    private Integer expiresIn;
    /**
     * <p>
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
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
     * A JSON Web Token (JWT) that identifies the user associated with the issued access token.
     * </p>
     */
    private String idToken;
    /**
     * <p>
     * Indicates the type of tokens that are issued by IAM Identity Center. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     */
    private String issuedTokenType;
    /**
     * <p>
     * The list of scopes for which authorization is granted. The access token that is issued is limited to the scopes
     * that are granted.
     * </p>
     */
    private java.util.List<String> scope;

    /**
     * <p>
     * A bearer token to access Amazon Web Services accounts and applications assigned to a user.
     * </p>
     * 
     * @param accessToken
     *        A bearer token to access Amazon Web Services accounts and applications assigned to a user.
     */

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * <p>
     * A bearer token to access Amazon Web Services accounts and applications assigned to a user.
     * </p>
     * 
     * @return A bearer token to access Amazon Web Services accounts and applications assigned to a user.
     */

    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * <p>
     * A bearer token to access Amazon Web Services accounts and applications assigned to a user.
     * </p>
     * 
     * @param accessToken
     *        A bearer token to access Amazon Web Services accounts and applications assigned to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withAccessToken(String accessToken) {
        setAccessToken(accessToken);
        return this;
    }

    /**
     * <p>
     * Used to notify the requester that the returned token is an access token. The supported token type is
     * <code>Bearer</code>.
     * </p>
     * 
     * @param tokenType
     *        Used to notify the requester that the returned token is an access token. The supported token type is
     *        <code>Bearer</code>.
     */

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    /**
     * <p>
     * Used to notify the requester that the returned token is an access token. The supported token type is
     * <code>Bearer</code>.
     * </p>
     * 
     * @return Used to notify the requester that the returned token is an access token. The supported token type is
     *         <code>Bearer</code>.
     */

    public String getTokenType() {
        return this.tokenType;
    }

    /**
     * <p>
     * Used to notify the requester that the returned token is an access token. The supported token type is
     * <code>Bearer</code>.
     * </p>
     * 
     * @param tokenType
     *        Used to notify the requester that the returned token is an access token. The supported token type is
     *        <code>Bearer</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withTokenType(String tokenType) {
        setTokenType(tokenType);
        return this;
    }

    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     * 
     * @param expiresIn
     *        Indicates the time in seconds when an access token will expire.
     */

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     * 
     * @return Indicates the time in seconds when an access token will expire.
     */

    public Integer getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * <p>
     * Indicates the time in seconds when an access token will expire.
     * </p>
     * 
     * @param expiresIn
     *        Indicates the time in seconds when an access token will expire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withExpiresIn(Integer expiresIn) {
        setExpiresIn(expiresIn);
        return this;
    }

    /**
     * <p>
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * </p>
     * <p>
     * For more information about the features and limitations of the current IAM Identity Center OIDC implementation,
     * see <i>Considerations for Using this Guide</i> in the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center OIDC API
     * Reference</a>.
     * </p>
     * 
     * @param refreshToken
     *        A token that, if present, can be used to refresh a previously issued access token that might have
     *        expired.</p>
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
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * </p>
     * <p>
     * For more information about the features and limitations of the current IAM Identity Center OIDC implementation,
     * see <i>Considerations for Using this Guide</i> in the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center OIDC API
     * Reference</a>.
     * </p>
     * 
     * @return A token that, if present, can be used to refresh a previously issued access token that might have
     *         expired.</p>
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
     * A token that, if present, can be used to refresh a previously issued access token that might have expired.
     * </p>
     * <p>
     * For more information about the features and limitations of the current IAM Identity Center OIDC implementation,
     * see <i>Considerations for Using this Guide</i> in the <a
     * href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center OIDC API
     * Reference</a>.
     * </p>
     * 
     * @param refreshToken
     *        A token that, if present, can be used to refresh a previously issued access token that might have
     *        expired.</p>
     *        <p>
     *        For more information about the features and limitations of the current IAM Identity Center OIDC
     *        implementation, see <i>Considerations for Using this Guide</i> in the <a
     *        href="https://docs.aws.amazon.com/singlesignon/latest/OIDCAPIReference/Welcome.html">IAM Identity Center
     *        OIDC API Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * A JSON Web Token (JWT) that identifies the user associated with the issued access token.
     * </p>
     * 
     * @param idToken
     *        A JSON Web Token (JWT) that identifies the user associated with the issued access token.
     */

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    /**
     * <p>
     * A JSON Web Token (JWT) that identifies the user associated with the issued access token.
     * </p>
     * 
     * @return A JSON Web Token (JWT) that identifies the user associated with the issued access token.
     */

    public String getIdToken() {
        return this.idToken;
    }

    /**
     * <p>
     * A JSON Web Token (JWT) that identifies the user associated with the issued access token.
     * </p>
     * 
     * @param idToken
     *        A JSON Web Token (JWT) that identifies the user associated with the issued access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withIdToken(String idToken) {
        setIdToken(idToken);
        return this;
    }

    /**
     * <p>
     * Indicates the type of tokens that are issued by IAM Identity Center. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     * 
     * @param issuedTokenType
     *        Indicates the type of tokens that are issued by IAM Identity Center. The following values are supported:
     *        </p>
     *        <p>
     *        Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     *        </p>
     *        <p>
     *        Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     */

    public void setIssuedTokenType(String issuedTokenType) {
        this.issuedTokenType = issuedTokenType;
    }

    /**
     * <p>
     * Indicates the type of tokens that are issued by IAM Identity Center. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     * 
     * @return Indicates the type of tokens that are issued by IAM Identity Center. The following values are supported:
     *         </p>
     *         <p>
     *         Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     *         </p>
     *         <p>
     *         Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     */

    public String getIssuedTokenType() {
        return this.issuedTokenType;
    }

    /**
     * <p>
     * Indicates the type of tokens that are issued by IAM Identity Center. The following values are supported:
     * </p>
     * <p>
     * * Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     * </p>
     * <p>
     * * Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * </p>
     * 
     * @param issuedTokenType
     *        Indicates the type of tokens that are issued by IAM Identity Center. The following values are supported:
     *        </p>
     *        <p>
     *        Access Token - <code>urn:ietf:params:oauth:token-type:access_token</code>
     *        </p>
     *        <p>
     *        Refresh Token - <code>urn:ietf:params:oauth:token-type:refresh_token</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withIssuedTokenType(String issuedTokenType) {
        setIssuedTokenType(issuedTokenType);
        return this;
    }

    /**
     * <p>
     * The list of scopes for which authorization is granted. The access token that is issued is limited to the scopes
     * that are granted.
     * </p>
     * 
     * @return The list of scopes for which authorization is granted. The access token that is issued is limited to the
     *         scopes that are granted.
     */

    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * <p>
     * The list of scopes for which authorization is granted. The access token that is issued is limited to the scopes
     * that are granted.
     * </p>
     * 
     * @param scope
     *        The list of scopes for which authorization is granted. The access token that is issued is limited to the
     *        scopes that are granted.
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
     * The list of scopes for which authorization is granted. The access token that is issued is limited to the scopes
     * that are granted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScope(java.util.Collection)} or {@link #withScope(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scope
     *        The list of scopes for which authorization is granted. The access token that is issued is limited to the
     *        scopes that are granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withScope(String... scope) {
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
     * The list of scopes for which authorization is granted. The access token that is issued is limited to the scopes
     * that are granted.
     * </p>
     * 
     * @param scope
     *        The list of scopes for which authorization is granted. The access token that is issued is limited to the
     *        scopes that are granted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenWithIAMResult withScope(java.util.Collection<String> scope) {
        setScope(scope);
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
        if (getTokenType() != null)
            sb.append("TokenType: ").append(getTokenType()).append(",");
        if (getExpiresIn() != null)
            sb.append("ExpiresIn: ").append(getExpiresIn()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getIdToken() != null)
            sb.append("IdToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getIssuedTokenType() != null)
            sb.append("IssuedTokenType: ").append(getIssuedTokenType()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTokenWithIAMResult == false)
            return false;
        CreateTokenWithIAMResult other = (CreateTokenWithIAMResult) obj;
        if (other.getAccessToken() == null ^ this.getAccessToken() == null)
            return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false)
            return false;
        if (other.getTokenType() == null ^ this.getTokenType() == null)
            return false;
        if (other.getTokenType() != null && other.getTokenType().equals(this.getTokenType()) == false)
            return false;
        if (other.getExpiresIn() == null ^ this.getExpiresIn() == null)
            return false;
        if (other.getExpiresIn() != null && other.getExpiresIn().equals(this.getExpiresIn()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getIdToken() == null ^ this.getIdToken() == null)
            return false;
        if (other.getIdToken() != null && other.getIdToken().equals(this.getIdToken()) == false)
            return false;
        if (other.getIssuedTokenType() == null ^ this.getIssuedTokenType() == null)
            return false;
        if (other.getIssuedTokenType() != null && other.getIssuedTokenType().equals(this.getIssuedTokenType()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode());
        hashCode = prime * hashCode + ((getTokenType() == null) ? 0 : getTokenType().hashCode());
        hashCode = prime * hashCode + ((getExpiresIn() == null) ? 0 : getExpiresIn().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getIdToken() == null) ? 0 : getIdToken().hashCode());
        hashCode = prime * hashCode + ((getIssuedTokenType() == null) ? 0 : getIssuedTokenType().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        return hashCode;
    }

    @Override
    public CreateTokenWithIAMResult clone() {
        try {
            return (CreateTokenWithIAMResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
