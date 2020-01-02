/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-oidc-2019-06-10/CreateToken" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTokenRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier string for each client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * A secret string generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * Supports grant types for authorization code, refresh token, and device code request.
     * </p>
     */
    private String grantType;
    /**
     * <p>
     * Used only when calling this API for the device code grant type. This short-term code is used to identify this
     * authentication attempt. This should come from an in-memory reference to the result of the
     * <a>StartDeviceAuthorization</a> API.
     * </p>
     */
    private String deviceCode;
    /**
     * <p>
     * The authorization code received from the authorization service. This parameter is required to perform an
     * authorization grant request to get access to a token.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The token used to obtain an access token in the event that the access token is invalid or expired. This token is
     * not issued by the service.
     * </p>
     */
    private String refreshToken;
    /**
     * <p>
     * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     */
    private java.util.List<String> scope;
    /**
     * <p>
     * The location of the application that will receive the authorization code. Users authorize the service to send the
     * request to this location.
     * </p>
     */
    private String redirectUri;

    /**
     * <p>
     * The unique identifier string for each client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for each client. This value should come from the persisted result of the
     *        <a>RegisterClient</a> API.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The unique identifier string for each client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     * 
     * @return The unique identifier string for each client. This value should come from the persisted result of the
     *         <a>RegisterClient</a> API.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The unique identifier string for each client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     * 
     * @param clientId
     *        The unique identifier string for each client. This value should come from the persisted result of the
     *        <a>RegisterClient</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * A secret string generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     * 
     * @param clientSecret
     *        A secret string generated for the client. This value should come from the persisted result of the
     *        <a>RegisterClient</a> API.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * A secret string generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     * 
     * @return A secret string generated for the client. This value should come from the persisted result of the
     *         <a>RegisterClient</a> API.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * A secret string generated for the client. This value should come from the persisted result of the
     * <a>RegisterClient</a> API.
     * </p>
     * 
     * @param clientSecret
     *        A secret string generated for the client. This value should come from the persisted result of the
     *        <a>RegisterClient</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * Supports grant types for authorization code, refresh token, and device code request.
     * </p>
     * 
     * @param grantType
     *        Supports grant types for authorization code, refresh token, and device code request.
     */

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    /**
     * <p>
     * Supports grant types for authorization code, refresh token, and device code request.
     * </p>
     * 
     * @return Supports grant types for authorization code, refresh token, and device code request.
     */

    public String getGrantType() {
        return this.grantType;
    }

    /**
     * <p>
     * Supports grant types for authorization code, refresh token, and device code request.
     * </p>
     * 
     * @param grantType
     *        Supports grant types for authorization code, refresh token, and device code request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withGrantType(String grantType) {
        setGrantType(grantType);
        return this;
    }

    /**
     * <p>
     * Used only when calling this API for the device code grant type. This short-term code is used to identify this
     * authentication attempt. This should come from an in-memory reference to the result of the
     * <a>StartDeviceAuthorization</a> API.
     * </p>
     * 
     * @param deviceCode
     *        Used only when calling this API for the device code grant type. This short-term code is used to identify
     *        this authentication attempt. This should come from an in-memory reference to the result of the
     *        <a>StartDeviceAuthorization</a> API.
     */

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    /**
     * <p>
     * Used only when calling this API for the device code grant type. This short-term code is used to identify this
     * authentication attempt. This should come from an in-memory reference to the result of the
     * <a>StartDeviceAuthorization</a> API.
     * </p>
     * 
     * @return Used only when calling this API for the device code grant type. This short-term code is used to identify
     *         this authentication attempt. This should come from an in-memory reference to the result of the
     *         <a>StartDeviceAuthorization</a> API.
     */

    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * <p>
     * Used only when calling this API for the device code grant type. This short-term code is used to identify this
     * authentication attempt. This should come from an in-memory reference to the result of the
     * <a>StartDeviceAuthorization</a> API.
     * </p>
     * 
     * @param deviceCode
     *        Used only when calling this API for the device code grant type. This short-term code is used to identify
     *        this authentication attempt. This should come from an in-memory reference to the result of the
     *        <a>StartDeviceAuthorization</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withDeviceCode(String deviceCode) {
        setDeviceCode(deviceCode);
        return this;
    }

    /**
     * <p>
     * The authorization code received from the authorization service. This parameter is required to perform an
     * authorization grant request to get access to a token.
     * </p>
     * 
     * @param code
     *        The authorization code received from the authorization service. This parameter is required to perform an
     *        authorization grant request to get access to a token.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The authorization code received from the authorization service. This parameter is required to perform an
     * authorization grant request to get access to a token.
     * </p>
     * 
     * @return The authorization code received from the authorization service. This parameter is required to perform an
     *         authorization grant request to get access to a token.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The authorization code received from the authorization service. This parameter is required to perform an
     * authorization grant request to get access to a token.
     * </p>
     * 
     * @param code
     *        The authorization code received from the authorization service. This parameter is required to perform an
     *        authorization grant request to get access to a token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The token used to obtain an access token in the event that the access token is invalid or expired. This token is
     * not issued by the service.
     * </p>
     * 
     * @param refreshToken
     *        The token used to obtain an access token in the event that the access token is invalid or expired. This
     *        token is not issued by the service.
     */

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    /**
     * <p>
     * The token used to obtain an access token in the event that the access token is invalid or expired. This token is
     * not issued by the service.
     * </p>
     * 
     * @return The token used to obtain an access token in the event that the access token is invalid or expired. This
     *         token is not issued by the service.
     */

    public String getRefreshToken() {
        return this.refreshToken;
    }

    /**
     * <p>
     * The token used to obtain an access token in the event that the access token is invalid or expired. This token is
     * not issued by the service.
     * </p>
     * 
     * @param refreshToken
     *        The token used to obtain an access token in the event that the access token is invalid or expired. This
     *        token is not issued by the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withRefreshToken(String refreshToken) {
        setRefreshToken(refreshToken);
        return this;
    }

    /**
     * <p>
     * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @return The list of scopes that is defined by the client. Upon authorization, this list is used to restrict
     *         permissions when granting an access token.
     */

    public java.util.List<String> getScope() {
        return scope;
    }

    /**
     * <p>
     * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @param scope
     *        The list of scopes that is defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
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
     * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScope(java.util.Collection)} or {@link #withScope(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param scope
     *        The list of scopes that is defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withScope(String... scope) {
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
     * The list of scopes that is defined by the client. Upon authorization, this list is used to restrict permissions
     * when granting an access token.
     * </p>
     * 
     * @param scope
     *        The list of scopes that is defined by the client. Upon authorization, this list is used to restrict
     *        permissions when granting an access token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withScope(java.util.Collection<String> scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The location of the application that will receive the authorization code. Users authorize the service to send the
     * request to this location.
     * </p>
     * 
     * @param redirectUri
     *        The location of the application that will receive the authorization code. Users authorize the service to
     *        send the request to this location.
     */

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    /**
     * <p>
     * The location of the application that will receive the authorization code. Users authorize the service to send the
     * request to this location.
     * </p>
     * 
     * @return The location of the application that will receive the authorization code. Users authorize the service to
     *         send the request to this location.
     */

    public String getRedirectUri() {
        return this.redirectUri;
    }

    /**
     * <p>
     * The location of the application that will receive the authorization code. Users authorize the service to send the
     * request to this location.
     * </p>
     * 
     * @param redirectUri
     *        The location of the application that will receive the authorization code. Users authorize the service to
     *        send the request to this location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTokenRequest withRedirectUri(String redirectUri) {
        setRedirectUri(redirectUri);
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
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append(getClientSecret()).append(",");
        if (getGrantType() != null)
            sb.append("GrantType: ").append(getGrantType()).append(",");
        if (getDeviceCode() != null)
            sb.append("DeviceCode: ").append(getDeviceCode()).append(",");
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getRefreshToken() != null)
            sb.append("RefreshToken: ").append(getRefreshToken()).append(",");
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getRedirectUri() != null)
            sb.append("RedirectUri: ").append(getRedirectUri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTokenRequest == false)
            return false;
        CreateTokenRequest other = (CreateTokenRequest) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getGrantType() == null ^ this.getGrantType() == null)
            return false;
        if (other.getGrantType() != null && other.getGrantType().equals(this.getGrantType()) == false)
            return false;
        if (other.getDeviceCode() == null ^ this.getDeviceCode() == null)
            return false;
        if (other.getDeviceCode() != null && other.getDeviceCode().equals(this.getDeviceCode()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getRefreshToken() == null ^ this.getRefreshToken() == null)
            return false;
        if (other.getRefreshToken() != null && other.getRefreshToken().equals(this.getRefreshToken()) == false)
            return false;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getRedirectUri() == null ^ this.getRedirectUri() == null)
            return false;
        if (other.getRedirectUri() != null && other.getRedirectUri().equals(this.getRedirectUri()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getGrantType() == null) ? 0 : getGrantType().hashCode());
        hashCode = prime * hashCode + ((getDeviceCode() == null) ? 0 : getDeviceCode().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getRedirectUri() == null) ? 0 : getRedirectUri().hashCode());
        return hashCode;
    }

    @Override
    public CreateTokenRequest clone() {
        return (CreateTokenRequest) super.clone();
    }

}
