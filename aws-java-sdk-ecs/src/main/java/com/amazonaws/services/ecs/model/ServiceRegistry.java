/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the service registry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceRegistry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceRegistry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud
     * Map. For more information, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html">CreateService</a>.
     * </p>
     */
    private String registryArn;
    /**
     * <p>
     * The port value used if your service discovery service specified an SRV record. This field may be used if both the
     * <code>awsvpc</code> network mode and SRV records are used.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The container name value, already specified in the task definition, to be used for your service discovery
     * service. If the task definition that your service task specifies uses the <code>bridge</code> or
     * <code>host</code> network mode, you must specify a <code>containerName</code> and <code>containerPort</code>
     * combination from the task definition. If the task definition that your service task specifies uses the
     * <code>awsvpc</code> network mode and a type SRV DNS record is used, you must specify either a
     * <code>containerName</code> and <code>containerPort</code> combination or a <code>port</code> value, but not both.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The port value, already specified in the task definition, to be used for your service discovery service. If the
     * task definition your service task specifies uses the <code>bridge</code> or <code>host</code> network mode, you
     * must specify a <code>containerName</code> and <code>containerPort</code> combination from the task definition. If
     * the task definition your service task specifies uses the <code>awsvpc</code> network mode and a type SRV DNS
     * record is used, you must specify either a <code>containerName</code> and <code>containerPort</code> combination
     * or a <code>port</code> value, but not both.
     * </p>
     */
    private Integer containerPort;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud
     * Map. For more information, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html">CreateService</a>.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS
     *        Cloud Map. For more information, see <a
     *        href="https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html">CreateService</a>.
     */

    public void setRegistryArn(String registryArn) {
        this.registryArn = registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud
     * Map. For more information, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html">CreateService</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS
     *         Cloud Map. For more information, see <a
     *         href="https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html">CreateService</a>.
     */

    public String getRegistryArn() {
        return this.registryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud
     * Map. For more information, see <a
     * href="https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html">CreateService</a>.
     * </p>
     * 
     * @param registryArn
     *        The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS
     *        Cloud Map. For more information, see <a
     *        href="https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html">CreateService</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceRegistry withRegistryArn(String registryArn) {
        setRegistryArn(registryArn);
        return this;
    }

    /**
     * <p>
     * The port value used if your service discovery service specified an SRV record. This field may be used if both the
     * <code>awsvpc</code> network mode and SRV records are used.
     * </p>
     * 
     * @param port
     *        The port value used if your service discovery service specified an SRV record. This field may be used if
     *        both the <code>awsvpc</code> network mode and SRV records are used.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value used if your service discovery service specified an SRV record. This field may be used if both the
     * <code>awsvpc</code> network mode and SRV records are used.
     * </p>
     * 
     * @return The port value used if your service discovery service specified an SRV record. This field may be used if
     *         both the <code>awsvpc</code> network mode and SRV records are used.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value used if your service discovery service specified an SRV record. This field may be used if both the
     * <code>awsvpc</code> network mode and SRV records are used.
     * </p>
     * 
     * @param port
     *        The port value used if your service discovery service specified an SRV record. This field may be used if
     *        both the <code>awsvpc</code> network mode and SRV records are used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceRegistry withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The container name value, already specified in the task definition, to be used for your service discovery
     * service. If the task definition that your service task specifies uses the <code>bridge</code> or
     * <code>host</code> network mode, you must specify a <code>containerName</code> and <code>containerPort</code>
     * combination from the task definition. If the task definition that your service task specifies uses the
     * <code>awsvpc</code> network mode and a type SRV DNS record is used, you must specify either a
     * <code>containerName</code> and <code>containerPort</code> combination or a <code>port</code> value, but not both.
     * </p>
     * 
     * @param containerName
     *        The container name value, already specified in the task definition, to be used for your service discovery
     *        service. If the task definition that your service task specifies uses the <code>bridge</code> or
     *        <code>host</code> network mode, you must specify a <code>containerName</code> and
     *        <code>containerPort</code> combination from the task definition. If the task definition that your service
     *        task specifies uses the <code>awsvpc</code> network mode and a type SRV DNS record is used, you must
     *        specify either a <code>containerName</code> and <code>containerPort</code> combination or a
     *        <code>port</code> value, but not both.
     */

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    /**
     * <p>
     * The container name value, already specified in the task definition, to be used for your service discovery
     * service. If the task definition that your service task specifies uses the <code>bridge</code> or
     * <code>host</code> network mode, you must specify a <code>containerName</code> and <code>containerPort</code>
     * combination from the task definition. If the task definition that your service task specifies uses the
     * <code>awsvpc</code> network mode and a type SRV DNS record is used, you must specify either a
     * <code>containerName</code> and <code>containerPort</code> combination or a <code>port</code> value, but not both.
     * </p>
     * 
     * @return The container name value, already specified in the task definition, to be used for your service discovery
     *         service. If the task definition that your service task specifies uses the <code>bridge</code> or
     *         <code>host</code> network mode, you must specify a <code>containerName</code> and
     *         <code>containerPort</code> combination from the task definition. If the task definition that your service
     *         task specifies uses the <code>awsvpc</code> network mode and a type SRV DNS record is used, you must
     *         specify either a <code>containerName</code> and <code>containerPort</code> combination or a
     *         <code>port</code> value, but not both.
     */

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * <p>
     * The container name value, already specified in the task definition, to be used for your service discovery
     * service. If the task definition that your service task specifies uses the <code>bridge</code> or
     * <code>host</code> network mode, you must specify a <code>containerName</code> and <code>containerPort</code>
     * combination from the task definition. If the task definition that your service task specifies uses the
     * <code>awsvpc</code> network mode and a type SRV DNS record is used, you must specify either a
     * <code>containerName</code> and <code>containerPort</code> combination or a <code>port</code> value, but not both.
     * </p>
     * 
     * @param containerName
     *        The container name value, already specified in the task definition, to be used for your service discovery
     *        service. If the task definition that your service task specifies uses the <code>bridge</code> or
     *        <code>host</code> network mode, you must specify a <code>containerName</code> and
     *        <code>containerPort</code> combination from the task definition. If the task definition that your service
     *        task specifies uses the <code>awsvpc</code> network mode and a type SRV DNS record is used, you must
     *        specify either a <code>containerName</code> and <code>containerPort</code> combination or a
     *        <code>port</code> value, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceRegistry withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The port value, already specified in the task definition, to be used for your service discovery service. If the
     * task definition your service task specifies uses the <code>bridge</code> or <code>host</code> network mode, you
     * must specify a <code>containerName</code> and <code>containerPort</code> combination from the task definition. If
     * the task definition your service task specifies uses the <code>awsvpc</code> network mode and a type SRV DNS
     * record is used, you must specify either a <code>containerName</code> and <code>containerPort</code> combination
     * or a <code>port</code> value, but not both.
     * </p>
     * 
     * @param containerPort
     *        The port value, already specified in the task definition, to be used for your service discovery service.
     *        If the task definition your service task specifies uses the <code>bridge</code> or <code>host</code>
     *        network mode, you must specify a <code>containerName</code> and <code>containerPort</code> combination
     *        from the task definition. If the task definition your service task specifies uses the <code>awsvpc</code>
     *        network mode and a type SRV DNS record is used, you must specify either a <code>containerName</code> and
     *        <code>containerPort</code> combination or a <code>port</code> value, but not both.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port value, already specified in the task definition, to be used for your service discovery service. If the
     * task definition your service task specifies uses the <code>bridge</code> or <code>host</code> network mode, you
     * must specify a <code>containerName</code> and <code>containerPort</code> combination from the task definition. If
     * the task definition your service task specifies uses the <code>awsvpc</code> network mode and a type SRV DNS
     * record is used, you must specify either a <code>containerName</code> and <code>containerPort</code> combination
     * or a <code>port</code> value, but not both.
     * </p>
     * 
     * @return The port value, already specified in the task definition, to be used for your service discovery service.
     *         If the task definition your service task specifies uses the <code>bridge</code> or <code>host</code>
     *         network mode, you must specify a <code>containerName</code> and <code>containerPort</code> combination
     *         from the task definition. If the task definition your service task specifies uses the <code>awsvpc</code>
     *         network mode and a type SRV DNS record is used, you must specify either a <code>containerName</code> and
     *         <code>containerPort</code> combination or a <code>port</code> value, but not both.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port value, already specified in the task definition, to be used for your service discovery service. If the
     * task definition your service task specifies uses the <code>bridge</code> or <code>host</code> network mode, you
     * must specify a <code>containerName</code> and <code>containerPort</code> combination from the task definition. If
     * the task definition your service task specifies uses the <code>awsvpc</code> network mode and a type SRV DNS
     * record is used, you must specify either a <code>containerName</code> and <code>containerPort</code> combination
     * or a <code>port</code> value, but not both.
     * </p>
     * 
     * @param containerPort
     *        The port value, already specified in the task definition, to be used for your service discovery service.
     *        If the task definition your service task specifies uses the <code>bridge</code> or <code>host</code>
     *        network mode, you must specify a <code>containerName</code> and <code>containerPort</code> combination
     *        from the task definition. If the task definition your service task specifies uses the <code>awsvpc</code>
     *        network mode and a type SRV DNS record is used, you must specify either a <code>containerName</code> and
     *        <code>containerPort</code> combination or a <code>port</code> value, but not both.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceRegistry withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
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
        if (getRegistryArn() != null)
            sb.append("RegistryArn: ").append(getRegistryArn()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceRegistry == false)
            return false;
        ServiceRegistry other = (ServiceRegistry) obj;
        if (other.getRegistryArn() == null ^ this.getRegistryArn() == null)
            return false;
        if (other.getRegistryArn() != null && other.getRegistryArn().equals(this.getRegistryArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryArn() == null) ? 0 : getRegistryArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        return hashCode;
    }

    @Override
    public ServiceRegistry clone() {
        try {
            return (ServiceRegistry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceRegistryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
