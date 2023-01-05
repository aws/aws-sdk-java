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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a service discovery registry to assign to the service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsServiceServiceRegistriesDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsServiceServiceRegistriesDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container name value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The port value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * The port value to use for a service discovery service that specifies an SRV record. This field can be used if
     * both the <code>awsvpc</code>awsvpc network mode and SRV records are used.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The ARN of the service registry.
     * </p>
     */
    private String registryArn;

    /**
     * <p>
     * The container name value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     * 
     * @param containerName
     *        The container name value to use for the service discovery service.</p>
     *        <p>
     *        If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     *        <code>ContainerName</code> and <code>ContainerPort</code>.
     *        </p>
     *        <p>
     *        If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must
     *        specify either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not
     *        both.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The container name value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     * 
     * @return The container name value to use for the service discovery service.</p>
     *         <p>
     *         If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     *         <code>ContainerName</code> and <code>ContainerPort</code>.
     *         </p>
     *         <p>
     *         If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must
     *         specify either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not
     *         both.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The container name value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     * 
     * @param containerName
     *        The container name value to use for the service discovery service.</p>
     *        <p>
     *        If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     *        <code>ContainerName</code> and <code>ContainerPort</code>.
     *        </p>
     *        <p>
     *        If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must
     *        specify either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceServiceRegistriesDetails withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The port value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     * 
     * @param containerPort
     *        The port value to use for the service discovery service.</p>
     *        <p>
     *        If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     *        <code>ContainerName</code> and <code>ContainerPort</code>.
     *        </p>
     *        <p>
     *        If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must
     *        specify either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not
     *        both.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     * 
     * @return The port value to use for the service discovery service.</p>
     *         <p>
     *         If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     *         <code>ContainerName</code> and <code>ContainerPort</code>.
     *         </p>
     *         <p>
     *         If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must
     *         specify either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not
     *         both.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port value to use for the service discovery service.
     * </p>
     * <p>
     * If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     * <code>ContainerName</code> and <code>ContainerPort</code>.
     * </p>
     * <p>
     * If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must specify
     * either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not both.
     * </p>
     * 
     * @param containerPort
     *        The port value to use for the service discovery service.</p>
     *        <p>
     *        If the task definition uses the <code>bridge</code> or <code>host</code> network mode, you must specify
     *        <code>ContainerName</code> and <code>ContainerPort</code>.
     *        </p>
     *        <p>
     *        If the task definition uses the <code>awsvpc</code> network mode and a type SRV DNS record, you must
     *        specify either <code>ContainerName</code> and <code>ContainerPort</code>, or <code>Port</code> , but not
     *        both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceServiceRegistriesDetails withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * The port value to use for a service discovery service that specifies an SRV record. This field can be used if
     * both the <code>awsvpc</code>awsvpc network mode and SRV records are used.
     * </p>
     * 
     * @param port
     *        The port value to use for a service discovery service that specifies an SRV record. This field can be used
     *        if both the <code>awsvpc</code>awsvpc network mode and SRV records are used.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value to use for a service discovery service that specifies an SRV record. This field can be used if
     * both the <code>awsvpc</code>awsvpc network mode and SRV records are used.
     * </p>
     * 
     * @return The port value to use for a service discovery service that specifies an SRV record. This field can be
     *         used if both the <code>awsvpc</code>awsvpc network mode and SRV records are used.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value to use for a service discovery service that specifies an SRV record. This field can be used if
     * both the <code>awsvpc</code>awsvpc network mode and SRV records are used.
     * </p>
     * 
     * @param port
     *        The port value to use for a service discovery service that specifies an SRV record. This field can be used
     *        if both the <code>awsvpc</code>awsvpc network mode and SRV records are used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceServiceRegistriesDetails withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The ARN of the service registry.
     * </p>
     * 
     * @param registryArn
     *        The ARN of the service registry.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The ARN of the service registry.
     * </p>
     * 
     * @return The ARN of the service registry.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The ARN of the service registry.
     * </p>
     * 
     * @param registryArn
     *        The ARN of the service registry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceServiceRegistriesDetails withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
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
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsServiceServiceRegistriesDetails == false)
            return false;
        AwsEcsServiceServiceRegistriesDetails other = (AwsEcsServiceServiceRegistriesDetails) obj;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsServiceServiceRegistriesDetails clone() {
        try {
            return (AwsEcsServiceServiceRegistriesDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsServiceServiceRegistriesDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
