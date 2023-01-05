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
 * The OAuth 2.0 properties required for OAuth 2.0 authentication.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/OAuth2Properties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2Properties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The token URL required for OAuth 2.0 authentication.
     * </p>
     */
    private String tokenUrl;
    /**
     * <p>
     * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * </p>
     */
    private String oAuth2GrantType;
    /**
     * <p>
     * Associates your token URL with a map of properties that you define. Use this parameter to provide any additional
     * details that the connector requires to authenticate your request.
     * </p>
     */
    private java.util.Map<String, String> tokenUrlCustomProperties;

    /**
     * <p>
     * The token URL required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param tokenUrl
     *        The token URL required for OAuth 2.0 authentication.
     */

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    /**
     * <p>
     * The token URL required for OAuth 2.0 authentication.
     * </p>
     * 
     * @return The token URL required for OAuth 2.0 authentication.
     */

    public String getTokenUrl() {
        return this.tokenUrl;
    }

    /**
     * <p>
     * The token URL required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param tokenUrl
     *        The token URL required for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Properties withTokenUrl(String tokenUrl) {
        setTokenUrl(tokenUrl);
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * </p>
     * 
     * @param oAuth2GrantType
     *        The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * @see OAuth2GrantType
     */

    public void setOAuth2GrantType(String oAuth2GrantType) {
        this.oAuth2GrantType = oAuth2GrantType;
    }

    /**
     * <p>
     * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * </p>
     * 
     * @return The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * @see OAuth2GrantType
     */

    public String getOAuth2GrantType() {
        return this.oAuth2GrantType;
    }

    /**
     * <p>
     * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * </p>
     * 
     * @param oAuth2GrantType
     *        The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public OAuth2Properties withOAuth2GrantType(String oAuth2GrantType) {
        setOAuth2GrantType(oAuth2GrantType);
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * </p>
     * 
     * @param oAuth2GrantType
     *        The OAuth 2.0 grant type used by connector for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuth2GrantType
     */

    public OAuth2Properties withOAuth2GrantType(OAuth2GrantType oAuth2GrantType) {
        this.oAuth2GrantType = oAuth2GrantType.toString();
        return this;
    }

    /**
     * <p>
     * Associates your token URL with a map of properties that you define. Use this parameter to provide any additional
     * details that the connector requires to authenticate your request.
     * </p>
     * 
     * @return Associates your token URL with a map of properties that you define. Use this parameter to provide any
     *         additional details that the connector requires to authenticate your request.
     */

    public java.util.Map<String, String> getTokenUrlCustomProperties() {
        return tokenUrlCustomProperties;
    }

    /**
     * <p>
     * Associates your token URL with a map of properties that you define. Use this parameter to provide any additional
     * details that the connector requires to authenticate your request.
     * </p>
     * 
     * @param tokenUrlCustomProperties
     *        Associates your token URL with a map of properties that you define. Use this parameter to provide any
     *        additional details that the connector requires to authenticate your request.
     */

    public void setTokenUrlCustomProperties(java.util.Map<String, String> tokenUrlCustomProperties) {
        this.tokenUrlCustomProperties = tokenUrlCustomProperties;
    }

    /**
     * <p>
     * Associates your token URL with a map of properties that you define. Use this parameter to provide any additional
     * details that the connector requires to authenticate your request.
     * </p>
     * 
     * @param tokenUrlCustomProperties
     *        Associates your token URL with a map of properties that you define. Use this parameter to provide any
     *        additional details that the connector requires to authenticate your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Properties withTokenUrlCustomProperties(java.util.Map<String, String> tokenUrlCustomProperties) {
        setTokenUrlCustomProperties(tokenUrlCustomProperties);
        return this;
    }

    /**
     * Add a single TokenUrlCustomProperties entry
     *
     * @see OAuth2Properties#withTokenUrlCustomProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Properties addTokenUrlCustomPropertiesEntry(String key, String value) {
        if (null == this.tokenUrlCustomProperties) {
            this.tokenUrlCustomProperties = new java.util.HashMap<String, String>();
        }
        if (this.tokenUrlCustomProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tokenUrlCustomProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TokenUrlCustomProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OAuth2Properties clearTokenUrlCustomPropertiesEntries() {
        this.tokenUrlCustomProperties = null;
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
        if (getOAuth2GrantType() != null)
            sb.append("OAuth2GrantType: ").append(getOAuth2GrantType()).append(",");
        if (getTokenUrlCustomProperties() != null)
            sb.append("TokenUrlCustomProperties: ").append(getTokenUrlCustomProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OAuth2Properties == false)
            return false;
        OAuth2Properties other = (OAuth2Properties) obj;
        if (other.getTokenUrl() == null ^ this.getTokenUrl() == null)
            return false;
        if (other.getTokenUrl() != null && other.getTokenUrl().equals(this.getTokenUrl()) == false)
            return false;
        if (other.getOAuth2GrantType() == null ^ this.getOAuth2GrantType() == null)
            return false;
        if (other.getOAuth2GrantType() != null && other.getOAuth2GrantType().equals(this.getOAuth2GrantType()) == false)
            return false;
        if (other.getTokenUrlCustomProperties() == null ^ this.getTokenUrlCustomProperties() == null)
            return false;
        if (other.getTokenUrlCustomProperties() != null && other.getTokenUrlCustomProperties().equals(this.getTokenUrlCustomProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTokenUrl() == null) ? 0 : getTokenUrl().hashCode());
        hashCode = prime * hashCode + ((getOAuth2GrantType() == null) ? 0 : getOAuth2GrantType().hashCode());
        hashCode = prime * hashCode + ((getTokenUrlCustomProperties() == null) ? 0 : getTokenUrlCustomProperties().hashCode());
        return hashCode;
    }

    @Override
    public OAuth2Properties clone() {
        try {
            return (OAuth2Properties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.OAuth2PropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
