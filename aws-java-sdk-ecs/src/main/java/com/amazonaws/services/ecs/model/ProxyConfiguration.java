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
 * The configuration details for the App Mesh proxy.
 * </p>
 * <p>
 * Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least version
 * 1.26.0-1 of the <code>ecs-init</code> package to enable a proxy configuration. If your container instances are
 * launched from the Amazon ECS-optimized AMI version <code>20190301</code> or later, then they contain the required
 * versions of the container agent and <code>ecs-init</code>. For more information, see <a
 * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html">Amazon ECS-optimized Linux
 * AMI</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ProxyConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProxyConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The proxy type. The only supported value is <code>APPMESH</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The name of the container that will serve as the App Mesh proxy.
     * </p>
     */
    private String containerName;
    /**
     * <p>
     * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified as
     * key-value pairs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the <code>user</code>
     * parameter in a container definition. This is used to ensure the proxy ignores its own traffic. If
     * <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     * <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own traffic.
     * If <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these ports is
     * forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored and not
     * redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is ignored and
     * not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValuePair> properties;

    /**
     * <p>
     * The proxy type. The only supported value is <code>APPMESH</code>.
     * </p>
     * 
     * @param type
     *        The proxy type. The only supported value is <code>APPMESH</code>.
     * @see ProxyConfigurationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The proxy type. The only supported value is <code>APPMESH</code>.
     * </p>
     * 
     * @return The proxy type. The only supported value is <code>APPMESH</code>.
     * @see ProxyConfigurationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The proxy type. The only supported value is <code>APPMESH</code>.
     * </p>
     * 
     * @param type
     *        The proxy type. The only supported value is <code>APPMESH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProxyConfigurationType
     */

    public ProxyConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The proxy type. The only supported value is <code>APPMESH</code>.
     * </p>
     * 
     * @param type
     *        The proxy type. The only supported value is <code>APPMESH</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProxyConfigurationType
     */

    public ProxyConfiguration withType(ProxyConfigurationType type) {
        this.type = type.toString();
        return this;
    }

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

    public ProxyConfiguration withContainerName(String containerName) {
        setContainerName(containerName);
        return this;
    }

    /**
     * <p>
     * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified as
     * key-value pairs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the <code>user</code>
     * parameter in a container definition. This is used to ensure the proxy ignores its own traffic. If
     * <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     * <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own traffic.
     * If <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these ports is
     * forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored and not
     * redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is ignored and
     * not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The set of network configuration parameters to provide the Container Network Interface (CNI) plugin,
     *         specified as key-value pairs.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the
     *         <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *         traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     *         <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *         traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these
     *         ports is forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the
     *         <code>AppPorts</code> is directed to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the
     *         <code>AppPorts</code> is directed to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored
     *         and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is
     *         ignored and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *         </p>
     *         </li>
     */

    public java.util.List<KeyValuePair> getProperties() {
        if (properties == null) {
            properties = new com.amazonaws.internal.SdkInternalList<KeyValuePair>();
        }
        return properties;
    }

    /**
     * <p>
     * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified as
     * key-value pairs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the <code>user</code>
     * parameter in a container definition. This is used to ensure the proxy ignores its own traffic. If
     * <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     * <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own traffic.
     * If <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these ports is
     * forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored and not
     * redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is ignored and
     * not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param properties
     *        The set of network configuration parameters to provide the Container Network Interface (CNI) plugin,
     *        specified as key-value pairs.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the
     *        <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *        traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     *        <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *        traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these
     *        ports is forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the
     *        <code>AppPorts</code> is directed to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the
     *        <code>AppPorts</code> is directed to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored
     *        and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is
     *        ignored and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *        </p>
     *        </li>
     */

    public void setProperties(java.util.Collection<KeyValuePair> properties) {
        if (properties == null) {
            this.properties = null;
            return;
        }

        this.properties = new com.amazonaws.internal.SdkInternalList<KeyValuePair>(properties);
    }

    /**
     * <p>
     * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified as
     * key-value pairs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the <code>user</code>
     * parameter in a container definition. This is used to ensure the proxy ignores its own traffic. If
     * <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     * <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own traffic.
     * If <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these ports is
     * forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored and not
     * redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is ignored and
     * not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProperties(java.util.Collection)} or {@link #withProperties(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param properties
     *        The set of network configuration parameters to provide the Container Network Interface (CNI) plugin,
     *        specified as key-value pairs.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the
     *        <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *        traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     *        <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *        traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these
     *        ports is forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the
     *        <code>AppPorts</code> is directed to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the
     *        <code>AppPorts</code> is directed to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored
     *        and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is
     *        ignored and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxyConfiguration withProperties(KeyValuePair... properties) {
        if (this.properties == null) {
            setProperties(new com.amazonaws.internal.SdkInternalList<KeyValuePair>(properties.length));
        }
        for (KeyValuePair ele : properties) {
            this.properties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of network configuration parameters to provide the Container Network Interface (CNI) plugin, specified as
     * key-value pairs.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the <code>user</code>
     * parameter in a container definition. This is used to ensure the proxy ignores its own traffic. If
     * <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     * <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own traffic.
     * If <code>IgnoredGID</code> is specified, this field can be empty.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these ports is
     * forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the <code>AppPorts</code>
     * is directed to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored and not
     * redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is ignored and
     * not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param properties
     *        The set of network configuration parameters to provide the Container Network Interface (CNI) plugin,
     *        specified as key-value pairs.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IgnoredUID</code> - (Required) The user ID (UID) of the proxy container as defined by the
     *        <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *        traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IgnoredGID</code> - (Required) The group ID (GID) of the proxy container as defined by the
     *        <code>user</code> parameter in a container definition. This is used to ensure the proxy ignores its own
     *        traffic. If <code>IgnoredGID</code> is specified, this field can be empty.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AppPorts</code> - (Required) The list of ports that the application uses. Network traffic to these
     *        ports is forwarded to the <code>ProxyIngressPort</code> and <code>ProxyEgressPort</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProxyIngressPort</code> - (Required) Specifies the port that incoming traffic to the
     *        <code>AppPorts</code> is directed to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ProxyEgressPort</code> - (Required) Specifies the port that outgoing traffic from the
     *        <code>AppPorts</code> is directed to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EgressIgnoredPorts</code> - (Required) The egress traffic going to the specified ports is ignored
     *        and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EgressIgnoredIPs</code> - (Required) The egress traffic going to the specified IP addresses is
     *        ignored and not redirected to the <code>ProxyEgressPort</code>. It can be an empty list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProxyConfiguration withProperties(java.util.Collection<KeyValuePair> properties) {
        setProperties(properties);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getContainerName() != null)
            sb.append("ContainerName: ").append(getContainerName()).append(",");
        if (getProperties() != null)
            sb.append("Properties: ").append(getProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProxyConfiguration == false)
            return false;
        ProxyConfiguration other = (ProxyConfiguration) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getContainerName() == null ^ this.getContainerName() == null)
            return false;
        if (other.getContainerName() != null && other.getContainerName().equals(this.getContainerName()) == false)
            return false;
        if (other.getProperties() == null ^ this.getProperties() == null)
            return false;
        if (other.getProperties() != null && other.getProperties().equals(this.getProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getContainerName() == null) ? 0 : getContainerName().hashCode());
        hashCode = prime * hashCode + ((getProperties() == null) ? 0 : getProperties().hashCode());
        return hashCode;
    }

    @Override
    public ProxyConfiguration clone() {
        try {
            return (ProxyConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ProxyConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
