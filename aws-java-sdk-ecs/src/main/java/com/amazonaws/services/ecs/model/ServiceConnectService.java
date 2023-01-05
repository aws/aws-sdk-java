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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Service Connect service object configuration. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in the
 * <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceConnectService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConnectService implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>portName</code> must match the name of one of the <code>portMappings</code> from all the containers in
     * the task definition of this Amazon ECS service.
     * </p>
     */
    private String portName;
    /**
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     */
    private String discoveryName;
    /**
     * <p>
     * The list of client aliases for this Service Connect service. You use these to assign names that can be used by
     * client applications. The maximum number of client aliases that you can have in this list is 1.
     * </p>
     * <p>
     * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients") can use
     * to connect to this service.
     * </p>
     * <p>
     * Each name and port mapping must be unique within the namespace.
     * </p>
     * <p>
     * For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with one
     * <code>port</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceConnectClientAlias> clientAliases;
    /**
     * <p>
     * The port number for the Service Connect proxy to listen on.
     * </p>
     * <p>
     * Use the value of this field to bypass the proxy for traffic on the port number specified in the named
     * <code>portMapping</code> in the task definition of this application, and then use it in your VPC security groups
     * to allow traffic into the proxy for this Amazon ECS service.
     * </p>
     * <p>
     * In <code>awsvpc</code> mode and Fargate, the default value is the container port number. The container port
     * number is in the <code>portMapping</code> in the task definition. In bridge mode, the default value is the
     * ephemeral port of the Service Connect proxy.
     * </p>
     */
    private Integer ingressPortOverride;

    /**
     * <p>
     * The <code>portName</code> must match the name of one of the <code>portMappings</code> from all the containers in
     * the task definition of this Amazon ECS service.
     * </p>
     * 
     * @param portName
     *        The <code>portName</code> must match the name of one of the <code>portMappings</code> from all the
     *        containers in the task definition of this Amazon ECS service.
     */

    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * <p>
     * The <code>portName</code> must match the name of one of the <code>portMappings</code> from all the containers in
     * the task definition of this Amazon ECS service.
     * </p>
     * 
     * @return The <code>portName</code> must match the name of one of the <code>portMappings</code> from all the
     *         containers in the task definition of this Amazon ECS service.
     */

    public String getPortName() {
        return this.portName;
    }

    /**
     * <p>
     * The <code>portName</code> must match the name of one of the <code>portMappings</code> from all the containers in
     * the task definition of this Amazon ECS service.
     * </p>
     * 
     * @param portName
     *        The <code>portName</code> must match the name of one of the <code>portMappings</code> from all the
     *        containers in the task definition of this Amazon ECS service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectService withPortName(String portName) {
        setPortName(portName);
        return this;
    }

    /**
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * 
     * @param discoveryName
     *        The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this
     *        Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64
     *        characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     *        can't start with a hyphen.</p>
     *        <p>
     *        If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *        the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *        <code>portName.namespace</code>.
     */

    public void setDiscoveryName(String discoveryName) {
        this.discoveryName = discoveryName;
    }

    /**
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * 
     * @return The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this
     *         Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64
     *         characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     *         can't start with a hyphen.</p>
     *         <p>
     *         If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *         the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *         <code>portName.namespace</code>.
     */

    public String getDiscoveryName() {
        return this.discoveryName;
    }

    /**
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * 
     * @param discoveryName
     *        The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this
     *        Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64
     *        characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     *        can't start with a hyphen.</p>
     *        <p>
     *        If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *        the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *        <code>portName.namespace</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectService withDiscoveryName(String discoveryName) {
        setDiscoveryName(discoveryName);
        return this;
    }

    /**
     * <p>
     * The list of client aliases for this Service Connect service. You use these to assign names that can be used by
     * client applications. The maximum number of client aliases that you can have in this list is 1.
     * </p>
     * <p>
     * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients") can use
     * to connect to this service.
     * </p>
     * <p>
     * Each name and port mapping must be unique within the namespace.
     * </p>
     * <p>
     * For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with one
     * <code>port</code>.
     * </p>
     * 
     * @return The list of client aliases for this Service Connect service. You use these to assign names that can be
     *         used by client applications. The maximum number of client aliases that you can have in this list is
     *         1.</p>
     *         <p>
     *         Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients")
     *         can use to connect to this service.
     *         </p>
     *         <p>
     *         Each name and port mapping must be unique within the namespace.
     *         </p>
     *         <p>
     *         For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with
     *         one <code>port</code>.
     */

    public java.util.List<ServiceConnectClientAlias> getClientAliases() {
        if (clientAliases == null) {
            clientAliases = new com.amazonaws.internal.SdkInternalList<ServiceConnectClientAlias>();
        }
        return clientAliases;
    }

    /**
     * <p>
     * The list of client aliases for this Service Connect service. You use these to assign names that can be used by
     * client applications. The maximum number of client aliases that you can have in this list is 1.
     * </p>
     * <p>
     * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients") can use
     * to connect to this service.
     * </p>
     * <p>
     * Each name and port mapping must be unique within the namespace.
     * </p>
     * <p>
     * For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with one
     * <code>port</code>.
     * </p>
     * 
     * @param clientAliases
     *        The list of client aliases for this Service Connect service. You use these to assign names that can be
     *        used by client applications. The maximum number of client aliases that you can have in this list is 1.</p>
     *        <p>
     *        Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients")
     *        can use to connect to this service.
     *        </p>
     *        <p>
     *        Each name and port mapping must be unique within the namespace.
     *        </p>
     *        <p>
     *        For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with
     *        one <code>port</code>.
     */

    public void setClientAliases(java.util.Collection<ServiceConnectClientAlias> clientAliases) {
        if (clientAliases == null) {
            this.clientAliases = null;
            return;
        }

        this.clientAliases = new com.amazonaws.internal.SdkInternalList<ServiceConnectClientAlias>(clientAliases);
    }

    /**
     * <p>
     * The list of client aliases for this Service Connect service. You use these to assign names that can be used by
     * client applications. The maximum number of client aliases that you can have in this list is 1.
     * </p>
     * <p>
     * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients") can use
     * to connect to this service.
     * </p>
     * <p>
     * Each name and port mapping must be unique within the namespace.
     * </p>
     * <p>
     * For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with one
     * <code>port</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientAliases(java.util.Collection)} or {@link #withClientAliases(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param clientAliases
     *        The list of client aliases for this Service Connect service. You use these to assign names that can be
     *        used by client applications. The maximum number of client aliases that you can have in this list is 1.</p>
     *        <p>
     *        Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients")
     *        can use to connect to this service.
     *        </p>
     *        <p>
     *        Each name and port mapping must be unique within the namespace.
     *        </p>
     *        <p>
     *        For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with
     *        one <code>port</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectService withClientAliases(ServiceConnectClientAlias... clientAliases) {
        if (this.clientAliases == null) {
            setClientAliases(new com.amazonaws.internal.SdkInternalList<ServiceConnectClientAlias>(clientAliases.length));
        }
        for (ServiceConnectClientAlias ele : clientAliases) {
            this.clientAliases.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of client aliases for this Service Connect service. You use these to assign names that can be used by
     * client applications. The maximum number of client aliases that you can have in this list is 1.
     * </p>
     * <p>
     * Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients") can use
     * to connect to this service.
     * </p>
     * <p>
     * Each name and port mapping must be unique within the namespace.
     * </p>
     * <p>
     * For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with one
     * <code>port</code>.
     * </p>
     * 
     * @param clientAliases
     *        The list of client aliases for this Service Connect service. You use these to assign names that can be
     *        used by client applications. The maximum number of client aliases that you can have in this list is 1.</p>
     *        <p>
     *        Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients")
     *        can use to connect to this service.
     *        </p>
     *        <p>
     *        Each name and port mapping must be unique within the namespace.
     *        </p>
     *        <p>
     *        For each <code>ServiceConnectService</code>, you must provide at least one <code>clientAlias</code> with
     *        one <code>port</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectService withClientAliases(java.util.Collection<ServiceConnectClientAlias> clientAliases) {
        setClientAliases(clientAliases);
        return this;
    }

    /**
     * <p>
     * The port number for the Service Connect proxy to listen on.
     * </p>
     * <p>
     * Use the value of this field to bypass the proxy for traffic on the port number specified in the named
     * <code>portMapping</code> in the task definition of this application, and then use it in your VPC security groups
     * to allow traffic into the proxy for this Amazon ECS service.
     * </p>
     * <p>
     * In <code>awsvpc</code> mode and Fargate, the default value is the container port number. The container port
     * number is in the <code>portMapping</code> in the task definition. In bridge mode, the default value is the
     * ephemeral port of the Service Connect proxy.
     * </p>
     * 
     * @param ingressPortOverride
     *        The port number for the Service Connect proxy to listen on.</p>
     *        <p>
     *        Use the value of this field to bypass the proxy for traffic on the port number specified in the named
     *        <code>portMapping</code> in the task definition of this application, and then use it in your VPC security
     *        groups to allow traffic into the proxy for this Amazon ECS service.
     *        </p>
     *        <p>
     *        In <code>awsvpc</code> mode and Fargate, the default value is the container port number. The container
     *        port number is in the <code>portMapping</code> in the task definition. In bridge mode, the default value
     *        is the ephemeral port of the Service Connect proxy.
     */

    public void setIngressPortOverride(Integer ingressPortOverride) {
        this.ingressPortOverride = ingressPortOverride;
    }

    /**
     * <p>
     * The port number for the Service Connect proxy to listen on.
     * </p>
     * <p>
     * Use the value of this field to bypass the proxy for traffic on the port number specified in the named
     * <code>portMapping</code> in the task definition of this application, and then use it in your VPC security groups
     * to allow traffic into the proxy for this Amazon ECS service.
     * </p>
     * <p>
     * In <code>awsvpc</code> mode and Fargate, the default value is the container port number. The container port
     * number is in the <code>portMapping</code> in the task definition. In bridge mode, the default value is the
     * ephemeral port of the Service Connect proxy.
     * </p>
     * 
     * @return The port number for the Service Connect proxy to listen on.</p>
     *         <p>
     *         Use the value of this field to bypass the proxy for traffic on the port number specified in the named
     *         <code>portMapping</code> in the task definition of this application, and then use it in your VPC security
     *         groups to allow traffic into the proxy for this Amazon ECS service.
     *         </p>
     *         <p>
     *         In <code>awsvpc</code> mode and Fargate, the default value is the container port number. The container
     *         port number is in the <code>portMapping</code> in the task definition. In bridge mode, the default value
     *         is the ephemeral port of the Service Connect proxy.
     */

    public Integer getIngressPortOverride() {
        return this.ingressPortOverride;
    }

    /**
     * <p>
     * The port number for the Service Connect proxy to listen on.
     * </p>
     * <p>
     * Use the value of this field to bypass the proxy for traffic on the port number specified in the named
     * <code>portMapping</code> in the task definition of this application, and then use it in your VPC security groups
     * to allow traffic into the proxy for this Amazon ECS service.
     * </p>
     * <p>
     * In <code>awsvpc</code> mode and Fargate, the default value is the container port number. The container port
     * number is in the <code>portMapping</code> in the task definition. In bridge mode, the default value is the
     * ephemeral port of the Service Connect proxy.
     * </p>
     * 
     * @param ingressPortOverride
     *        The port number for the Service Connect proxy to listen on.</p>
     *        <p>
     *        Use the value of this field to bypass the proxy for traffic on the port number specified in the named
     *        <code>portMapping</code> in the task definition of this application, and then use it in your VPC security
     *        groups to allow traffic into the proxy for this Amazon ECS service.
     *        </p>
     *        <p>
     *        In <code>awsvpc</code> mode and Fargate, the default value is the container port number. The container
     *        port number is in the <code>portMapping</code> in the task definition. In bridge mode, the default value
     *        is the ephemeral port of the Service Connect proxy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectService withIngressPortOverride(Integer ingressPortOverride) {
        setIngressPortOverride(ingressPortOverride);
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
        if (getPortName() != null)
            sb.append("PortName: ").append(getPortName()).append(",");
        if (getDiscoveryName() != null)
            sb.append("DiscoveryName: ").append(getDiscoveryName()).append(",");
        if (getClientAliases() != null)
            sb.append("ClientAliases: ").append(getClientAliases()).append(",");
        if (getIngressPortOverride() != null)
            sb.append("IngressPortOverride: ").append(getIngressPortOverride());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceConnectService == false)
            return false;
        ServiceConnectService other = (ServiceConnectService) obj;
        if (other.getPortName() == null ^ this.getPortName() == null)
            return false;
        if (other.getPortName() != null && other.getPortName().equals(this.getPortName()) == false)
            return false;
        if (other.getDiscoveryName() == null ^ this.getDiscoveryName() == null)
            return false;
        if (other.getDiscoveryName() != null && other.getDiscoveryName().equals(this.getDiscoveryName()) == false)
            return false;
        if (other.getClientAliases() == null ^ this.getClientAliases() == null)
            return false;
        if (other.getClientAliases() != null && other.getClientAliases().equals(this.getClientAliases()) == false)
            return false;
        if (other.getIngressPortOverride() == null ^ this.getIngressPortOverride() == null)
            return false;
        if (other.getIngressPortOverride() != null && other.getIngressPortOverride().equals(this.getIngressPortOverride()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortName() == null) ? 0 : getPortName().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryName() == null) ? 0 : getDiscoveryName().hashCode());
        hashCode = prime * hashCode + ((getClientAliases() == null) ? 0 : getClientAliases().hashCode());
        hashCode = prime * hashCode + ((getIngressPortOverride() == null) ? 0 : getIngressPortOverride().hashCode());
        return hashCode;
    }

    @Override
    public ServiceConnectService clone() {
        try {
            return (ServiceConnectService) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceConnectServiceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
