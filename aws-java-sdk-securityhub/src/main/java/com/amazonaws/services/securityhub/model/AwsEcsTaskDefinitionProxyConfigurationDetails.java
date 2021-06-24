/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details for the App Mesh proxy.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsTaskDefinitionProxyConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsTaskDefinitionProxyConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the container that will serve as the App Mesh proxy.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin, specified
     * as key-value pairs.
     * </p>
     */
    private java.util.List<AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails> proxyConfigurationProperties;
    /**
     * <p>
     * The proxy type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the container that will serve as the App Mesh proxy.
     * </p>
     * 
     * @param containerName
     *        The name of the container that will serve as the App Mesh proxy.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The name of the container that will serve as the App Mesh proxy.
     * </p>
     * 
     * @return The name of the container that will serve as the App Mesh proxy.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The name of the container that will serve as the App Mesh proxy.
     * </p>
     * 
     * @param containerName
     *        The name of the container that will serve as the App Mesh proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionProxyConfigurationDetails withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin, specified
     * as key-value pairs.
     * </p>
     * 
     * @return The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin,
     *         specified as key-value pairs.
     */

    public java.util.List<AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails> getProxyConfigurationProperties() {
        return proxyConfigurationProperties;
    }

    /**
     * <p>
     * The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin, specified
     * as key-value pairs.
     * </p>
     * 
     * @param proxyConfigurationProperties
     *        The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin,
     *        specified as key-value pairs.
     */

    public void setProxyConfigurationProperties(
            java.util.Collection<AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails> proxyConfigurationProperties) {
        if (proxyConfigurationProperties == null) {
            this.proxyConfigurationProperties = null;
            return;
        }

        this.proxyConfigurationProperties = new java.util.ArrayList<AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails>(
                proxyConfigurationProperties);
    }

    /**
     * <p>
     * The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin, specified
     * as key-value pairs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProxyConfigurationProperties(java.util.Collection)} or
     * {@link #withProxyConfigurationProperties(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param proxyConfigurationProperties
     *        The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin,
     *        specified as key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionProxyConfigurationDetails withProxyConfigurationProperties(
            AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails... proxyConfigurationProperties) {
        if (this.proxyConfigurationProperties == null) {
            setProxyConfigurationProperties(new java.util.ArrayList<AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails>(
                    proxyConfigurationProperties.length));
        }
        for (AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails ele : proxyConfigurationProperties) {
            this.proxyConfigurationProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin, specified
     * as key-value pairs.
     * </p>
     * 
     * @param proxyConfigurationProperties
     *        The set of network configuration parameters to provide to the Container Network Interface (CNI) plugin,
     *        specified as key-value pairs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionProxyConfigurationDetails withProxyConfigurationProperties(
            java.util.Collection<AwsEcsTaskDefinitionProxyConfigurationProxyConfigurationPropertiesDetails> proxyConfigurationProperties) {
        setProxyConfigurationProperties(proxyConfigurationProperties);
        return this;
    }

    /**
     * <p>
     * The proxy type.
     * </p>
     * 
     * @param type
     *        The proxy type.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The proxy type.
     * </p>
     * 
     * @return The proxy type.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The proxy type.
     * </p>
     * 
     * @param type
     *        The proxy type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsTaskDefinitionProxyConfigurationDetails withType(String type) {
        setType(type);
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
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getProxyConfigurationProperties() != null)
            sb.append("ProxyConfigurationProperties: ").append(getProxyConfigurationProperties()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsTaskDefinitionProxyConfigurationDetails == false)
            return false;
        AwsEcsTaskDefinitionProxyConfigurationDetails other = (AwsEcsTaskDefinitionProxyConfigurationDetails) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getProxyConfigurationProperties() == null ^ this.getProxyConfigurationProperties() == null)
            return false;
        if (other.getProxyConfigurationProperties() != null && other.getProxyConfigurationProperties().equals(this.getProxyConfigurationProperties()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getProxyConfigurationProperties() == null) ? 0 : getProxyConfigurationProperties().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsTaskDefinitionProxyConfigurationDetails clone() {
        try {
            return (AwsEcsTaskDefinitionProxyConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsTaskDefinitionProxyConfigurationDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
