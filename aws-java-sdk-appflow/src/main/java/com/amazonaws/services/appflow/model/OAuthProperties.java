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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The OAuth properties required for OAuth type authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/OAuthProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuthProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access
     * token using refresh token.
     * </p>
     */
    private String tokenUrl;
    /**
     * <p>
     * The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth type
     * authentication.
     * </p>
     */
    private String authCodeUrl;
    /**
     * <p>
     * The OAuth scopes required for OAuth type authentication.
     * </p>
     */
    private java.util.List<String> oAuthScopes;

    /**
     * <p>
     * The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access
     * token using refresh token.
     * </p>
     * 
     * @param tokenUrl
     *        The token url required to fetch access/refresh tokens using authorization code and also to refresh expired
     *        access token using refresh token.
     */

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    /**
     * <p>
     * The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access
     * token using refresh token.
     * </p>
     * 
     * @return The token url required to fetch access/refresh tokens using authorization code and also to refresh
     *         expired access token using refresh token.
     */

    public String getTokenUrl() {
        return this.tokenUrl;
    }

    /**
     * <p>
     * The token url required to fetch access/refresh tokens using authorization code and also to refresh expired access
     * token using refresh token.
     * </p>
     * 
     * @param tokenUrl
     *        The token url required to fetch access/refresh tokens using authorization code and also to refresh expired
     *        access token using refresh token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuthProperties withTokenUrl(String tokenUrl) {
        setTokenUrl(tokenUrl);
        return this;
    }

    /**
     * <p>
     * The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth type
     * authentication.
     * </p>
     * 
     * @param authCodeUrl
     *        The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth
     *        type authentication.
     */

    public void setAuthCodeUrl(String authCodeUrl) {
        this.authCodeUrl = authCodeUrl;
    }

    /**
     * <p>
     * The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth type
     * authentication.
     * </p>
     * 
     * @return The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth
     *         type authentication.
     */

    public String getAuthCodeUrl() {
        return this.authCodeUrl;
    }

    /**
     * <p>
     * The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth type
     * authentication.
     * </p>
     * 
     * @param authCodeUrl
     *        The authorization code url required to redirect to SAP Login Page to fetch authorization code for OAuth
     *        type authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuthProperties withAuthCodeUrl(String authCodeUrl) {
        setAuthCodeUrl(authCodeUrl);
        return this;
    }

    /**
     * <p>
     * The OAuth scopes required for OAuth type authentication.
     * </p>
     * 
     * @return The OAuth scopes required for OAuth type authentication.
     */

    public java.util.List<String> getOAuthScopes() {
        return oAuthScopes;
    }

    /**
     * <p>
     * The OAuth scopes required for OAuth type authentication.
     * </p>
     * 
     * @param oAuthScopes
     *        The OAuth scopes required for OAuth type authentication.
     */

    public void setOAuthScopes(java.util.Collection<String> oAuthScopes) {
        if (oAuthScopes == null) {
            this.oAuthScopes = null;
            return;
        }

        this.oAuthScopes = new java.util.ArrayList<String>(oAuthScopes);
    }

    /**
     * <p>
     * The OAuth scopes required for OAuth type authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOAuthScopes(java.util.Collection)} or {@link #withOAuthScopes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oAuthScopes
     *        The OAuth scopes required for OAuth type authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuthProperties withOAuthScopes(String... oAuthScopes) {
        if (this.oAuthScopes == null) {
            setOAuthScopes(new java.util.ArrayList<String>(oAuthScopes.length));
        }
        for (String ele : oAuthScopes) {
            this.oAuthScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The OAuth scopes required for OAuth type authentication.
     * </p>
     * 
     * @param oAuthScopes
     *        The OAuth scopes required for OAuth type authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuthProperties withOAuthScopes(java.util.Collection<String> oAuthScopes) {
        setOAuthScopes(oAuthScopes);
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
        if (getTokenUrl() != null)
            sb.append("TokenUrl: ").append(getTokenUrl()).append(",");
        if (getAuthCodeUrl() != null)
            sb.append("AuthCodeUrl: ").append(getAuthCodeUrl()).append(",");
        if (getOAuthScopes() != null)
            sb.append("OAuthScopes: ").append(getOAuthScopes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OAuthProperties == false)
            return false;
        OAuthProperties other = (OAuthProperties) obj;
        if (other.getTokenUrl() == null ^ this.getTokenUrl() == null)
            return false;
        if (other.getTokenUrl() != null && other.getTokenUrl().equals(this.getTokenUrl()) == false)
            return false;
        if (other.getAuthCodeUrl() == null ^ this.getAuthCodeUrl() == null)
            return false;
        if (other.getAuthCodeUrl() != null && other.getAuthCodeUrl().equals(this.getAuthCodeUrl()) == false)
            return false;
        if (other.getOAuthScopes() == null ^ this.getOAuthScopes() == null)
            return false;
        if (other.getOAuthScopes() != null && other.getOAuthScopes().equals(this.getOAuthScopes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenUrl() == null) ? 0 : getTokenUrl().hashCode());
        hashCode = prime * hashCode + ((getAuthCodeUrl() == null) ? 0 : getAuthCodeUrl().hashCode());
        hashCode = prime * hashCode + ((getOAuthScopes() == null) ? 0 : getOAuthScopes().hashCode());
        return hashCode;
    }

    @Override
    public OAuthProperties clone() {
        try {
            return (OAuthProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.OAuthPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
