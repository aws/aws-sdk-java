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
 * Details on the network bindings between a container and its host container instance. After a task reaches the
 * <code>RUNNING</code> status, manual and automatic host and container port assignments are visible in the
 * <code>networkBindings</code> section of <a>DescribeTasks</a> API responses.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/NetworkBinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkBinding implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     */
    private String bindIP;
    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     */
    private Integer hostPort;
    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     * 
     * @param bindIP
     *        The IP address that the container is bound to on the container instance.
     */

    public void setBindIP(String bindIP) {
        this.bindIP = bindIP;
    }

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     * 
     * @return The IP address that the container is bound to on the container instance.
     */

    public String getBindIP() {
        return this.bindIP;
    }

    /**
     * <p>
     * The IP address that the container is bound to on the container instance.
     * </p>
     * 
     * @param bindIP
     *        The IP address that the container is bound to on the container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkBinding withBindIP(String bindIP) {
        setBindIP(bindIP);
        return this;
    }

    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that is used with the network binding.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     * 
     * @return The port number on the container that is used with the network binding.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port number on the container that is used with the network binding.
     * </p>
     * 
     * @param containerPort
     *        The port number on the container that is used with the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkBinding withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     * 
     * @param hostPort
     *        The port number on the host that is used with the network binding.
     */

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     * 
     * @return The port number on the host that is used with the network binding.
     */

    public Integer getHostPort() {
        return this.hostPort;
    }

    /**
     * <p>
     * The port number on the host that is used with the network binding.
     * </p>
     * 
     * @param hostPort
     *        The port number on the host that is used with the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkBinding withHostPort(Integer hostPort) {
        setHostPort(hostPort);
        return this;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @see TransportProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @return The protocol used for the network binding.
     * @see TransportProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public NetworkBinding withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @see TransportProtocol
     */

    public void setProtocol(TransportProtocol protocol) {
        withProtocol(protocol);
    }

    /**
     * <p>
     * The protocol used for the network binding.
     * </p>
     * 
     * @param protocol
     *        The protocol used for the network binding.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransportProtocol
     */

    public NetworkBinding withProtocol(TransportProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getBindIP() != null)
            sb.append("BindIP: ").append(getBindIP()).append(",");
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append(getContainerPort()).append(",");
        if (getHostPort() != null)
            sb.append("HostPort: ").append(getHostPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkBinding == false)
            return false;
        NetworkBinding other = (NetworkBinding) obj;
        if (other.getBindIP() == null ^ this.getBindIP() == null)
            return false;
        if (other.getBindIP() != null && other.getBindIP().equals(this.getBindIP()) == false)
            return false;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getHostPort() == null ^ this.getHostPort() == null)
            return false;
        if (other.getHostPort() != null && other.getHostPort().equals(this.getHostPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBindIP() == null) ? 0 : getBindIP().hashCode());
        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getHostPort() == null) ? 0 : getHostPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public NetworkBinding clone() {
        try {
            return (NetworkBinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.NetworkBindingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
