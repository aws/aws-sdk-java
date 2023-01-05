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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure containing information about how this workspace works with SAML.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/SamlAuthentication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SamlAuthentication implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure containing details about how this workspace works with SAML.
     * </p>
     */
    private SamlConfiguration configuration;
    /**
     * <p>
     * Specifies whether the workspace's SAML configuration is complete.
     * </p>
     */
    private String status;

    /**
     * <p>
     * A structure containing details about how this workspace works with SAML.
     * </p>
     * 
     * @param configuration
     *        A structure containing details about how this workspace works with SAML.
     */

    public void setConfiguration(SamlConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * A structure containing details about how this workspace works with SAML.
     * </p>
     * 
     * @return A structure containing details about how this workspace works with SAML.
     */

    public SamlConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * A structure containing details about how this workspace works with SAML.
     * </p>
     * 
     * @param configuration
     *        A structure containing details about how this workspace works with SAML.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SamlAuthentication withConfiguration(SamlConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * <p>
     * Specifies whether the workspace's SAML configuration is complete.
     * </p>
     * 
     * @param status
     *        Specifies whether the workspace's SAML configuration is complete.
     * @see SamlConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether the workspace's SAML configuration is complete.
     * </p>
     * 
     * @return Specifies whether the workspace's SAML configuration is complete.
     * @see SamlConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies whether the workspace's SAML configuration is complete.
     * </p>
     * 
     * @param status
     *        Specifies whether the workspace's SAML configuration is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SamlConfigurationStatus
     */

    public SamlAuthentication withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies whether the workspace's SAML configuration is complete.
     * </p>
     * 
     * @param status
     *        Specifies whether the workspace's SAML configuration is complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SamlConfigurationStatus
     */

    public SamlAuthentication withStatus(SamlConfigurationStatus status) {
        this.status = status.toString();
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
        if (getConfiguration() != null)
            sb.append("Configuration: ").append(getConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SamlAuthentication == false)
            return false;
        SamlAuthentication other = (SamlAuthentication) obj;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SamlAuthentication clone() {
        try {
            return (SamlAuthentication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.managedgrafana.model.transform.SamlAuthenticationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
