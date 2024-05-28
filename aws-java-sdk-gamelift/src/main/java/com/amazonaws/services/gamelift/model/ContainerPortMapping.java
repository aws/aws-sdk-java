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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the Amazon GameLift containers feature, which is currently in public preview.</b>
 * </p>
 * <p>
 * Defines how an internal-facing container port is mapped to an external-facing connection port on a fleet instance of
 * compute type <code>CONTAINER</code>. Incoming traffic, such as a game client, uses a connection port to connect to a
 * process in the container fleet. Amazon GameLift directs the inbound traffic to the container port that is assigned to
 * the process, such as a game session, running on a container.
 * </p>
 * <p>
 * <b>Part of:</b> <a>ContainerAttributes</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerPortMapping" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerPortMapping implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The port opened on the container.
     * </p>
     */
    private Integer containerPort;
    /**
     * <p>
     * The port opened on the fleet instance. This is also called the "host port".
     * </p>
     */
    private Integer connectionPort;
    /**
     * <p>
     * The network protocol that this mapping supports.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The port opened on the container.
     * </p>
     * 
     * @param containerPort
     *        The port opened on the container.
     */

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * <p>
     * The port opened on the container.
     * </p>
     * 
     * @return The port opened on the container.
     */

    public Integer getContainerPort() {
        return this.containerPort;
    }

    /**
     * <p>
     * The port opened on the container.
     * </p>
     * 
     * @param containerPort
     *        The port opened on the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerPortMapping withContainerPort(Integer containerPort) {
        setContainerPort(containerPort);
        return this;
    }

    /**
     * <p>
     * The port opened on the fleet instance. This is also called the "host port".
     * </p>
     * 
     * @param connectionPort
     *        The port opened on the fleet instance. This is also called the "host port".
     */

    public void setConnectionPort(Integer connectionPort) {
        this.connectionPort = connectionPort;
    }

    /**
     * <p>
     * The port opened on the fleet instance. This is also called the "host port".
     * </p>
     * 
     * @return The port opened on the fleet instance. This is also called the "host port".
     */

    public Integer getConnectionPort() {
        return this.connectionPort;
    }

    /**
     * <p>
     * The port opened on the fleet instance. This is also called the "host port".
     * </p>
     * 
     * @param connectionPort
     *        The port opened on the fleet instance. This is also called the "host port".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerPortMapping withConnectionPort(Integer connectionPort) {
        setConnectionPort(connectionPort);
        return this;
    }

    /**
     * <p>
     * The network protocol that this mapping supports.
     * </p>
     * 
     * @param protocol
     *        The network protocol that this mapping supports.
     * @see IpProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The network protocol that this mapping supports.
     * </p>
     * 
     * @return The network protocol that this mapping supports.
     * @see IpProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The network protocol that this mapping supports.
     * </p>
     * 
     * @param protocol
     *        The network protocol that this mapping supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpProtocol
     */

    public ContainerPortMapping withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The network protocol that this mapping supports.
     * </p>
     * 
     * @param protocol
     *        The network protocol that this mapping supports.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpProtocol
     */

    public ContainerPortMapping withProtocol(IpProtocol protocol) {
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
        if (getContainerPort() != null)
            sb.append("ContainerPort: ").append("***Sensitive Data Redacted***").append(",");
        if (getConnectionPort() != null)
            sb.append("ConnectionPort: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof ContainerPortMapping == false)
            return false;
        ContainerPortMapping other = (ContainerPortMapping) obj;
        if (other.getContainerPort() == null ^ this.getContainerPort() == null)
            return false;
        if (other.getContainerPort() != null && other.getContainerPort().equals(this.getContainerPort()) == false)
            return false;
        if (other.getConnectionPort() == null ^ this.getConnectionPort() == null)
            return false;
        if (other.getConnectionPort() != null && other.getConnectionPort().equals(this.getConnectionPort()) == false)
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

        hashCode = prime * hashCode + ((getContainerPort() == null) ? 0 : getContainerPort().hashCode());
        hashCode = prime * hashCode + ((getConnectionPort() == null) ? 0 : getConnectionPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public ContainerPortMapping clone() {
        try {
            return (ContainerPortMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerPortMappingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
