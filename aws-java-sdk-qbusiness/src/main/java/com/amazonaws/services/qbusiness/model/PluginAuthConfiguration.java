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
package com.amazonaws.services.qbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Authentication configuration information for an Amazon Q Business plugin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qbusiness-2023-11-27/PluginAuthConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PluginAuthConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the basic authentication credentials used to configure a plugin.
     * </p>
     */
    private BasicAuthConfiguration basicAuthConfiguration;
    /**
     * <p>
     * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     * </p>
     */
    private OAuth2ClientCredentialConfiguration oAuth2ClientCredentialConfiguration;
    /**
     * <p>
     * Information about invoking a custom plugin without any authentication.
     * </p>
     */
    private NoAuthConfiguration noAuthConfiguration;

    /**
     * <p>
     * Information about the basic authentication credentials used to configure a plugin.
     * </p>
     * 
     * @param basicAuthConfiguration
     *        Information about the basic authentication credentials used to configure a plugin.
     */

    public void setBasicAuthConfiguration(BasicAuthConfiguration basicAuthConfiguration) {
        this.basicAuthConfiguration = basicAuthConfiguration;
    }

    /**
     * <p>
     * Information about the basic authentication credentials used to configure a plugin.
     * </p>
     * 
     * @return Information about the basic authentication credentials used to configure a plugin.
     */

    public BasicAuthConfiguration getBasicAuthConfiguration() {
        return this.basicAuthConfiguration;
    }

    /**
     * <p>
     * Information about the basic authentication credentials used to configure a plugin.
     * </p>
     * 
     * @param basicAuthConfiguration
     *        Information about the basic authentication credentials used to configure a plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginAuthConfiguration withBasicAuthConfiguration(BasicAuthConfiguration basicAuthConfiguration) {
        setBasicAuthConfiguration(basicAuthConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     * </p>
     * 
     * @param oAuth2ClientCredentialConfiguration
     *        Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     */

    public void setOAuth2ClientCredentialConfiguration(OAuth2ClientCredentialConfiguration oAuth2ClientCredentialConfiguration) {
        this.oAuth2ClientCredentialConfiguration = oAuth2ClientCredentialConfiguration;
    }

    /**
     * <p>
     * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     * </p>
     * 
     * @return Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     */

    public OAuth2ClientCredentialConfiguration getOAuth2ClientCredentialConfiguration() {
        return this.oAuth2ClientCredentialConfiguration;
    }

    /**
     * <p>
     * Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     * </p>
     * 
     * @param oAuth2ClientCredentialConfiguration
     *        Information about the OAuth 2.0 authentication credential/token used to configure a plugin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginAuthConfiguration withOAuth2ClientCredentialConfiguration(OAuth2ClientCredentialConfiguration oAuth2ClientCredentialConfiguration) {
        setOAuth2ClientCredentialConfiguration(oAuth2ClientCredentialConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about invoking a custom plugin without any authentication.
     * </p>
     * 
     * @param noAuthConfiguration
     *        Information about invoking a custom plugin without any authentication.
     */

    public void setNoAuthConfiguration(NoAuthConfiguration noAuthConfiguration) {
        this.noAuthConfiguration = noAuthConfiguration;
    }

    /**
     * <p>
     * Information about invoking a custom plugin without any authentication.
     * </p>
     * 
     * @return Information about invoking a custom plugin without any authentication.
     */

    public NoAuthConfiguration getNoAuthConfiguration() {
        return this.noAuthConfiguration;
    }

    /**
     * <p>
     * Information about invoking a custom plugin without any authentication.
     * </p>
     * 
     * @param noAuthConfiguration
     *        Information about invoking a custom plugin without any authentication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PluginAuthConfiguration withNoAuthConfiguration(NoAuthConfiguration noAuthConfiguration) {
        setNoAuthConfiguration(noAuthConfiguration);
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
        if (getBasicAuthConfiguration() != null)
            sb.append("BasicAuthConfiguration: ").append(getBasicAuthConfiguration()).append(",");
        if (getOAuth2ClientCredentialConfiguration() != null)
            sb.append("OAuth2ClientCredentialConfiguration: ").append(getOAuth2ClientCredentialConfiguration()).append(",");
        if (getNoAuthConfiguration() != null)
            sb.append("NoAuthConfiguration: ").append(getNoAuthConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PluginAuthConfiguration == false)
            return false;
        PluginAuthConfiguration other = (PluginAuthConfiguration) obj;
        if (other.getBasicAuthConfiguration() == null ^ this.getBasicAuthConfiguration() == null)
            return false;
        if (other.getBasicAuthConfiguration() != null && other.getBasicAuthConfiguration().equals(this.getBasicAuthConfiguration()) == false)
            return false;
        if (other.getOAuth2ClientCredentialConfiguration() == null ^ this.getOAuth2ClientCredentialConfiguration() == null)
            return false;
        if (other.getOAuth2ClientCredentialConfiguration() != null
                && other.getOAuth2ClientCredentialConfiguration().equals(this.getOAuth2ClientCredentialConfiguration()) == false)
            return false;
        if (other.getNoAuthConfiguration() == null ^ this.getNoAuthConfiguration() == null)
            return false;
        if (other.getNoAuthConfiguration() != null && other.getNoAuthConfiguration().equals(this.getNoAuthConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBasicAuthConfiguration() == null) ? 0 : getBasicAuthConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOAuth2ClientCredentialConfiguration() == null) ? 0 : getOAuth2ClientCredentialConfiguration().hashCode());
        hashCode = prime * hashCode + ((getNoAuthConfiguration() == null) ? 0 : getNoAuthConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PluginAuthConfiguration clone() {
        try {
            return (PluginAuthConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qbusiness.model.transform.PluginAuthConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
