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
 * Contains the default values required for OAuth 2.0 authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/OAuth2Defaults" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2Defaults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * OAuth 2.0 scopes that the connector supports.
     * </p>
     */
    private java.util.List<String> oauthScopes;
    /**
     * <p>
     * Token URLs that can be used for OAuth 2.0 authentication.
     * </p>
     */
    private java.util.List<String> tokenUrls;
    /**
     * <p>
     * Auth code URLs that can be used for OAuth 2.0 authentication.
     * </p>
     */
    private java.util.List<String> authCodeUrls;
    /**
     * <p>
     * OAuth 2.0 grant types supported by the connector.
     * </p>
     */
    private java.util.List<String> oauth2GrantTypesSupported;
    /**
     * <p>
     * List of custom parameters required for OAuth 2.0 authentication.
     * </p>
     */
    private java.util.List<OAuth2CustomParameter> oauth2CustomProperties;

    /**
     * <p>
     * OAuth 2.0 scopes that the connector supports.
     * </p>
     * 
     * @return OAuth 2.0 scopes that the connector supports.
     */

    public java.util.List<String> getOauthScopes() {
        return oauthScopes;
    }

    /**
     * <p>
     * OAuth 2.0 scopes that the connector supports.
     * </p>
     * 
     * @param oauthScopes
     *        OAuth 2.0 scopes that the connector supports.
     */

    public void setOauthScopes(java.util.Collection<String> oauthScopes) {
        if (oauthScopes == null) {
            this.oauthScopes = null;
            return;
        }

        this.oauthScopes = new java.util.ArrayList<String>(oauthScopes);
    }

    /**
     * <p>
     * OAuth 2.0 scopes that the connector supports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOauthScopes(java.util.Collection)} or {@link #withOauthScopes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param oauthScopes
     *        OAuth 2.0 scopes that the connector supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withOauthScopes(String... oauthScopes) {
        if (this.oauthScopes == null) {
            setOauthScopes(new java.util.ArrayList<String>(oauthScopes.length));
        }
        for (String ele : oauthScopes) {
            this.oauthScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * OAuth 2.0 scopes that the connector supports.
     * </p>
     * 
     * @param oauthScopes
     *        OAuth 2.0 scopes that the connector supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withOauthScopes(java.util.Collection<String> oauthScopes) {
        setOauthScopes(oauthScopes);
        return this;
    }

    /**
     * <p>
     * Token URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * 
     * @return Token URLs that can be used for OAuth 2.0 authentication.
     */

    public java.util.List<String> getTokenUrls() {
        return tokenUrls;
    }

    /**
     * <p>
     * Token URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param tokenUrls
     *        Token URLs that can be used for OAuth 2.0 authentication.
     */

    public void setTokenUrls(java.util.Collection<String> tokenUrls) {
        if (tokenUrls == null) {
            this.tokenUrls = null;
            return;
        }

        this.tokenUrls = new java.util.ArrayList<String>(tokenUrls);
    }

    /**
     * <p>
     * Token URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenUrls(java.util.Collection)} or {@link #withTokenUrls(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tokenUrls
     *        Token URLs that can be used for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withTokenUrls(String... tokenUrls) {
        if (this.tokenUrls == null) {
            setTokenUrls(new java.util.ArrayList<String>(tokenUrls.length));
        }
        for (String ele : tokenUrls) {
            this.tokenUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Token URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param tokenUrls
     *        Token URLs that can be used for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withTokenUrls(java.util.Collection<String> tokenUrls) {
        setTokenUrls(tokenUrls);
        return this;
    }

    /**
     * <p>
     * Auth code URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * 
     * @return Auth code URLs that can be used for OAuth 2.0 authentication.
     */

    public java.util.List<String> getAuthCodeUrls() {
        return authCodeUrls;
    }

    /**
     * <p>
     * Auth code URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param authCodeUrls
     *        Auth code URLs that can be used for OAuth 2.0 authentication.
     */

    public void setAuthCodeUrls(java.util.Collection<String> authCodeUrls) {
        if (authCodeUrls == null) {
            this.authCodeUrls = null;
            return;
        }

        this.authCodeUrls = new java.util.ArrayList<String>(authCodeUrls);
    }

    /**
     * <p>
     * Auth code URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAuthCodeUrls(java.util.Collection)} or {@link #withAuthCodeUrls(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param authCodeUrls
     *        Auth code URLs that can be used for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withAuthCodeUrls(String... authCodeUrls) {
        if (this.authCodeUrls == null) {
            setAuthCodeUrls(new java.util.ArrayList<String>(authCodeUrls.length));
        }
        for (String ele : authCodeUrls) {
            this.authCodeUrls.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Auth code URLs that can be used for OAuth 2.0 authentication.
     * </p>
     * 
     * @param authCodeUrls
     *        Auth code URLs that can be used for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withAuthCodeUrls(java.util.Collection<String> authCodeUrls) {
        setAuthCodeUrls(authCodeUrls);
        return this;
    }

    /**
     * <p>
     * OAuth 2.0 grant types supported by the connector.
     * </p>
     * 
     * @return OAuth 2.0 grant types supported by the connector.
     * @see OAuth2GrantType
     */

    public java.util.List<String> getOauth2GrantTypesSupported() {
        return oauth2GrantTypesSupported;
    }

    /**
     * <p>
     * OAuth 2.0 grant types supported by the connector.
     * </p>
     * 
     * @param oauth2GrantTypesSupported
     *        OAuth 2.0 grant types supported by the connector.
     * @see OAuth2GrantType
     */

    public void setOauth2GrantTypesSupported(java.util.Collection<String> oauth2GrantTypesSupported) {
        if (oauth2GrantTypesSupported == null) {
            this.oauth2GrantTypesSupported = null;
            return;
        }

        this.oauth2GrantTypesSupported = new java.util.ArrayList<String>(oauth2GrantTypesSupported);
    }

    /**
     * <p>
     * OAuth 2.0 grant types supported by the connector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOauth2GrantTypesSupported(java.util.Collection)} or
     * {@link #withOauth2GrantTypesSupported(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param oauth2GrantTypesSupported
     *        OAuth 2.0 grant types supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public OAuth2Defaults withOauth2GrantTypesSupported(String... oauth2GrantTypesSupported) {
        if (this.oauth2GrantTypesSupported == null) {
            setOauth2GrantTypesSupported(new java.util.ArrayList<String>(oauth2GrantTypesSupported.length));
        }
        for (String ele : oauth2GrantTypesSupported) {
            this.oauth2GrantTypesSupported.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * OAuth 2.0 grant types supported by the connector.
     * </p>
     * 
     * @param oauth2GrantTypesSupported
     *        OAuth 2.0 grant types supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public OAuth2Defaults withOauth2GrantTypesSupported(java.util.Collection<String> oauth2GrantTypesSupported) {
        setOauth2GrantTypesSupported(oauth2GrantTypesSupported);
        return this;
    }

    /**
     * <p>
     * OAuth 2.0 grant types supported by the connector.
     * </p>
     * 
     * @param oauth2GrantTypesSupported
     *        OAuth 2.0 grant types supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public OAuth2Defaults withOauth2GrantTypesSupported(OAuth2GrantType... oauth2GrantTypesSupported) {
        java.util.ArrayList<String> oauth2GrantTypesSupportedCopy = new java.util.ArrayList<String>(oauth2GrantTypesSupported.length);
        for (OAuth2GrantType value : oauth2GrantTypesSupported) {
            oauth2GrantTypesSupportedCopy.add(value.toString());
        }
        if (getOauth2GrantTypesSupported() == null) {
            setOauth2GrantTypesSupported(oauth2GrantTypesSupportedCopy);
        } else {
            getOauth2GrantTypesSupported().addAll(oauth2GrantTypesSupportedCopy);
        }
        return this;
    }

    /**
     * <p>
     * List of custom parameters required for OAuth 2.0 authentication.
     * </p>
     * 
     * @return List of custom parameters required for OAuth 2.0 authentication.
     */

    public java.util.List<OAuth2CustomParameter> getOauth2CustomProperties() {
        return oauth2CustomProperties;
    }

    /**
     * <p>
     * List of custom parameters required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param oauth2CustomProperties
     *        List of custom parameters required for OAuth 2.0 authentication.
     */

    public void setOauth2CustomProperties(java.util.Collection<OAuth2CustomParameter> oauth2CustomProperties) {
        if (oauth2CustomProperties == null) {
            this.oauth2CustomProperties = null;
            return;
        }

        this.oauth2CustomProperties = new java.util.ArrayList<OAuth2CustomParameter>(oauth2CustomProperties);
    }

    /**
     * <p>
     * List of custom parameters required for OAuth 2.0 authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOauth2CustomProperties(java.util.Collection)} or
     * {@link #withOauth2CustomProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param oauth2CustomProperties
     *        List of custom parameters required for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withOauth2CustomProperties(OAuth2CustomParameter... oauth2CustomProperties) {
        if (this.oauth2CustomProperties == null) {
            setOauth2CustomProperties(new java.util.ArrayList<OAuth2CustomParameter>(oauth2CustomProperties.length));
        }
        for (OAuth2CustomParameter ele : oauth2CustomProperties) {
            this.oauth2CustomProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of custom parameters required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param oauth2CustomProperties
     *        List of custom parameters required for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Defaults withOauth2CustomProperties(java.util.Collection<OAuth2CustomParameter> oauth2CustomProperties) {
        setOauth2CustomProperties(oauth2CustomProperties);
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
        if (getOauthScopes() != null)
            sb.append("OauthScopes: ").append(getOauthScopes()).append(",");
        if (getTokenUrls() != null)
            sb.append("TokenUrls: ").append(getTokenUrls()).append(",");
        if (getAuthCodeUrls() != null)
            sb.append("AuthCodeUrls: ").append(getAuthCodeUrls()).append(",");
        if (getOauth2GrantTypesSupported() != null)
            sb.append("Oauth2GrantTypesSupported: ").append(getOauth2GrantTypesSupported()).append(",");
        if (getOauth2CustomProperties() != null)
            sb.append("Oauth2CustomProperties: ").append(getOauth2CustomProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OAuth2Defaults == false)
            return false;
        OAuth2Defaults other = (OAuth2Defaults) obj;
        if (other.getOauthScopes() == null ^ this.getOauthScopes() == null)
            return false;
        if (other.getOauthScopes() != null && other.getOauthScopes().equals(this.getOauthScopes()) == false)
            return false;
        if (other.getTokenUrls() == null ^ this.getTokenUrls() == null)
            return false;
        if (other.getTokenUrls() != null && other.getTokenUrls().equals(this.getTokenUrls()) == false)
            return false;
        if (other.getAuthCodeUrls() == null ^ this.getAuthCodeUrls() == null)
            return false;
        if (other.getAuthCodeUrls() != null && other.getAuthCodeUrls().equals(this.getAuthCodeUrls()) == false)
            return false;
        if (other.getOauth2GrantTypesSupported() == null ^ this.getOauth2GrantTypesSupported() == null)
            return false;
        if (other.getOauth2GrantTypesSupported() != null && other.getOauth2GrantTypesSupported().equals(this.getOauth2GrantTypesSupported()) == false)
            return false;
        if (other.getOauth2CustomProperties() == null ^ this.getOauth2CustomProperties() == null)
            return false;
        if (other.getOauth2CustomProperties() != null && other.getOauth2CustomProperties().equals(this.getOauth2CustomProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOauthScopes() == null) ? 0 : getOauthScopes().hashCode());
        hashCode = prime * hashCode + ((getTokenUrls() == null) ? 0 : getTokenUrls().hashCode());
        hashCode = prime * hashCode + ((getAuthCodeUrls() == null) ? 0 : getAuthCodeUrls().hashCode());
        hashCode = prime * hashCode + ((getOauth2GrantTypesSupported() == null) ? 0 : getOauth2GrantTypesSupported().hashCode());
        hashCode = prime * hashCode + ((getOauth2CustomProperties() == null) ? 0 : getOauth2CustomProperties().hashCode());
        return hashCode;
    }

    @Override
    public OAuth2Defaults clone() {
        try {
            return (OAuth2Defaults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.OAuth2DefaultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
