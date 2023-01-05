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
 * Contains information about the authentication config that the connector supports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/AuthenticationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AuthenticationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether basic authentication is supported by the connector.
     * </p>
     */
    private Boolean isBasicAuthSupported;
    /**
     * <p>
     * Indicates whether API key authentication is supported by the connector
     * </p>
     */
    private Boolean isApiKeyAuthSupported;
    /**
     * <p>
     * Indicates whether OAuth 2.0 authentication is supported by the connector.
     * </p>
     */
    private Boolean isOAuth2Supported;
    /**
     * <p>
     * Indicates whether custom authentication is supported by the connector
     * </p>
     */
    private Boolean isCustomAuthSupported;
    /**
     * <p>
     * Contains the default values required for OAuth 2.0 authentication.
     * </p>
     */
    private OAuth2Defaults oAuth2Defaults;
    /**
     * <p>
     * Contains information required for custom authentication.
     * </p>
     */
    private java.util.List<CustomAuthConfig> customAuthConfigs;

    /**
     * <p>
     * Indicates whether basic authentication is supported by the connector.
     * </p>
     * 
     * @param isBasicAuthSupported
     *        Indicates whether basic authentication is supported by the connector.
     */

    public void setIsBasicAuthSupported(Boolean isBasicAuthSupported) {
        this.isBasicAuthSupported = isBasicAuthSupported;
    }

    /**
     * <p>
     * Indicates whether basic authentication is supported by the connector.
     * </p>
     * 
     * @return Indicates whether basic authentication is supported by the connector.
     */

    public Boolean getIsBasicAuthSupported() {
        return this.isBasicAuthSupported;
    }

    /**
     * <p>
     * Indicates whether basic authentication is supported by the connector.
     * </p>
     * 
     * @param isBasicAuthSupported
     *        Indicates whether basic authentication is supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfig withIsBasicAuthSupported(Boolean isBasicAuthSupported) {
        setIsBasicAuthSupported(isBasicAuthSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether basic authentication is supported by the connector.
     * </p>
     * 
     * @return Indicates whether basic authentication is supported by the connector.
     */

    public Boolean isBasicAuthSupported() {
        return this.isBasicAuthSupported;
    }

    /**
     * <p>
     * Indicates whether API key authentication is supported by the connector
     * </p>
     * 
     * @param isApiKeyAuthSupported
     *        Indicates whether API key authentication is supported by the connector
     */

    public void setIsApiKeyAuthSupported(Boolean isApiKeyAuthSupported) {
        this.isApiKeyAuthSupported = isApiKeyAuthSupported;
    }

    /**
     * <p>
     * Indicates whether API key authentication is supported by the connector
     * </p>
     * 
     * @return Indicates whether API key authentication is supported by the connector
     */

    public Boolean getIsApiKeyAuthSupported() {
        return this.isApiKeyAuthSupported;
    }

    /**
     * <p>
     * Indicates whether API key authentication is supported by the connector
     * </p>
     * 
     * @param isApiKeyAuthSupported
     *        Indicates whether API key authentication is supported by the connector
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfig withIsApiKeyAuthSupported(Boolean isApiKeyAuthSupported) {
        setIsApiKeyAuthSupported(isApiKeyAuthSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether API key authentication is supported by the connector
     * </p>
     * 
     * @return Indicates whether API key authentication is supported by the connector
     */

    public Boolean isApiKeyAuthSupported() {
        return this.isApiKeyAuthSupported;
    }

    /**
     * <p>
     * Indicates whether OAuth 2.0 authentication is supported by the connector.
     * </p>
     * 
     * @param isOAuth2Supported
     *        Indicates whether OAuth 2.0 authentication is supported by the connector.
     */

    public void setIsOAuth2Supported(Boolean isOAuth2Supported) {
        this.isOAuth2Supported = isOAuth2Supported;
    }

    /**
     * <p>
     * Indicates whether OAuth 2.0 authentication is supported by the connector.
     * </p>
     * 
     * @return Indicates whether OAuth 2.0 authentication is supported by the connector.
     */

    public Boolean getIsOAuth2Supported() {
        return this.isOAuth2Supported;
    }

    /**
     * <p>
     * Indicates whether OAuth 2.0 authentication is supported by the connector.
     * </p>
     * 
     * @param isOAuth2Supported
     *        Indicates whether OAuth 2.0 authentication is supported by the connector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfig withIsOAuth2Supported(Boolean isOAuth2Supported) {
        setIsOAuth2Supported(isOAuth2Supported);
        return this;
    }

    /**
     * <p>
     * Indicates whether OAuth 2.0 authentication is supported by the connector.
     * </p>
     * 
     * @return Indicates whether OAuth 2.0 authentication is supported by the connector.
     */

    public Boolean isOAuth2Supported() {
        return this.isOAuth2Supported;
    }

    /**
     * <p>
     * Indicates whether custom authentication is supported by the connector
     * </p>
     * 
     * @param isCustomAuthSupported
     *        Indicates whether custom authentication is supported by the connector
     */

    public void setIsCustomAuthSupported(Boolean isCustomAuthSupported) {
        this.isCustomAuthSupported = isCustomAuthSupported;
    }

    /**
     * <p>
     * Indicates whether custom authentication is supported by the connector
     * </p>
     * 
     * @return Indicates whether custom authentication is supported by the connector
     */

    public Boolean getIsCustomAuthSupported() {
        return this.isCustomAuthSupported;
    }

    /**
     * <p>
     * Indicates whether custom authentication is supported by the connector
     * </p>
     * 
     * @param isCustomAuthSupported
     *        Indicates whether custom authentication is supported by the connector
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfig withIsCustomAuthSupported(Boolean isCustomAuthSupported) {
        setIsCustomAuthSupported(isCustomAuthSupported);
        return this;
    }

    /**
     * <p>
     * Indicates whether custom authentication is supported by the connector
     * </p>
     * 
     * @return Indicates whether custom authentication is supported by the connector
     */

    public Boolean isCustomAuthSupported() {
        return this.isCustomAuthSupported;
    }

    /**
     * <p>
     * Contains the default values required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param oAuth2Defaults
     *        Contains the default values required for OAuth 2.0 authentication.
     */

    public void setOAuth2Defaults(OAuth2Defaults oAuth2Defaults) {
        this.oAuth2Defaults = oAuth2Defaults;
    }

    /**
     * <p>
     * Contains the default values required for OAuth 2.0 authentication.
     * </p>
     * 
     * @return Contains the default values required for OAuth 2.0 authentication.
     */

    public OAuth2Defaults getOAuth2Defaults() {
        return this.oAuth2Defaults;
    }

    /**
     * <p>
     * Contains the default values required for OAuth 2.0 authentication.
     * </p>
     * 
     * @param oAuth2Defaults
     *        Contains the default values required for OAuth 2.0 authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfig withOAuth2Defaults(OAuth2Defaults oAuth2Defaults) {
        setOAuth2Defaults(oAuth2Defaults);
        return this;
    }

    /**
     * <p>
     * Contains information required for custom authentication.
     * </p>
     * 
     * @return Contains information required for custom authentication.
     */

    public java.util.List<CustomAuthConfig> getCustomAuthConfigs() {
        return customAuthConfigs;
    }

    /**
     * <p>
     * Contains information required for custom authentication.
     * </p>
     * 
     * @param customAuthConfigs
     *        Contains information required for custom authentication.
     */

    public void setCustomAuthConfigs(java.util.Collection<CustomAuthConfig> customAuthConfigs) {
        if (customAuthConfigs == null) {
            this.customAuthConfigs = null;
            return;
        }

        this.customAuthConfigs = new java.util.ArrayList<CustomAuthConfig>(customAuthConfigs);
    }

    /**
     * <p>
     * Contains information required for custom authentication.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomAuthConfigs(java.util.Collection)} or {@link #withCustomAuthConfigs(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param customAuthConfigs
     *        Contains information required for custom authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfig withCustomAuthConfigs(CustomAuthConfig... customAuthConfigs) {
        if (this.customAuthConfigs == null) {
            setCustomAuthConfigs(new java.util.ArrayList<CustomAuthConfig>(customAuthConfigs.length));
        }
        for (CustomAuthConfig ele : customAuthConfigs) {
            this.customAuthConfigs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information required for custom authentication.
     * </p>
     * 
     * @param customAuthConfigs
     *        Contains information required for custom authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AuthenticationConfig withCustomAuthConfigs(java.util.Collection<CustomAuthConfig> customAuthConfigs) {
        setCustomAuthConfigs(customAuthConfigs);
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
        if (getIsBasicAuthSupported() != null)
            sb.append("IsBasicAuthSupported: ").append(getIsBasicAuthSupported()).append(",");
        if (getIsApiKeyAuthSupported() != null)
            sb.append("IsApiKeyAuthSupported: ").append(getIsApiKeyAuthSupported()).append(",");
        if (getIsOAuth2Supported() != null)
            sb.append("IsOAuth2Supported: ").append(getIsOAuth2Supported()).append(",");
        if (getIsCustomAuthSupported() != null)
            sb.append("IsCustomAuthSupported: ").append(getIsCustomAuthSupported()).append(",");
        if (getOAuth2Defaults() != null)
            sb.append("OAuth2Defaults: ").append(getOAuth2Defaults()).append(",");
        if (getCustomAuthConfigs() != null)
            sb.append("CustomAuthConfigs: ").append(getCustomAuthConfigs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AuthenticationConfig == false)
            return false;
        AuthenticationConfig other = (AuthenticationConfig) obj;
        if (other.getIsBasicAuthSupported() == null ^ this.getIsBasicAuthSupported() == null)
            return false;
        if (other.getIsBasicAuthSupported() != null && other.getIsBasicAuthSupported().equals(this.getIsBasicAuthSupported()) == false)
            return false;
        if (other.getIsApiKeyAuthSupported() == null ^ this.getIsApiKeyAuthSupported() == null)
            return false;
        if (other.getIsApiKeyAuthSupported() != null && other.getIsApiKeyAuthSupported().equals(this.getIsApiKeyAuthSupported()) == false)
            return false;
        if (other.getIsOAuth2Supported() == null ^ this.getIsOAuth2Supported() == null)
            return false;
        if (other.getIsOAuth2Supported() != null && other.getIsOAuth2Supported().equals(this.getIsOAuth2Supported()) == false)
            return false;
        if (other.getIsCustomAuthSupported() == null ^ this.getIsCustomAuthSupported() == null)
            return false;
        if (other.getIsCustomAuthSupported() != null && other.getIsCustomAuthSupported().equals(this.getIsCustomAuthSupported()) == false)
            return false;
        if (other.getOAuth2Defaults() == null ^ this.getOAuth2Defaults() == null)
            return false;
        if (other.getOAuth2Defaults() != null && other.getOAuth2Defaults().equals(this.getOAuth2Defaults()) == false)
            return false;
        if (other.getCustomAuthConfigs() == null ^ this.getCustomAuthConfigs() == null)
            return false;
        if (other.getCustomAuthConfigs() != null && other.getCustomAuthConfigs().equals(this.getCustomAuthConfigs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsBasicAuthSupported() == null) ? 0 : getIsBasicAuthSupported().hashCode());
        hashCode = prime * hashCode + ((getIsApiKeyAuthSupported() == null) ? 0 : getIsApiKeyAuthSupported().hashCode());
        hashCode = prime * hashCode + ((getIsOAuth2Supported() == null) ? 0 : getIsOAuth2Supported().hashCode());
        hashCode = prime * hashCode + ((getIsCustomAuthSupported() == null) ? 0 : getIsCustomAuthSupported().hashCode());
        hashCode = prime * hashCode + ((getOAuth2Defaults() == null) ? 0 : getOAuth2Defaults().hashCode());
        hashCode = prime * hashCode + ((getCustomAuthConfigs() == null) ? 0 : getCustomAuthConfigs().hashCode());
        return hashCode;
    }

    @Override
    public AuthenticationConfig clone() {
        try {
            return (AuthenticationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.AuthenticationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
