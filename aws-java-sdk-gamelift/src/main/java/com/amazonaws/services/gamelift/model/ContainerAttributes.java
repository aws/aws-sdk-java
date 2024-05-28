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
 * Describes attributes of containers that are deployed to a fleet with compute type <code>CONTAINER</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to a game
     * via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection port to a port
     * on the container that hosts the game session.
     * </p>
     */
    private java.util.List<ContainerPortMapping> containerPortMappings;

    /**
     * <p>
     * Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to a game
     * via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection port to a port
     * on the container that hosts the game session.
     * </p>
     * 
     * @return Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to
     *         a game via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection
     *         port to a port on the container that hosts the game session.
     */

    public java.util.List<ContainerPortMapping> getContainerPortMappings() {
        return containerPortMappings;
    }

    /**
     * <p>
     * Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to a game
     * via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection port to a port
     * on the container that hosts the game session.
     * </p>
     * 
     * @param containerPortMappings
     *        Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to
     *        a game via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection
     *        port to a port on the container that hosts the game session.
     */

    public void setContainerPortMappings(java.util.Collection<ContainerPortMapping> containerPortMappings) {
        if (containerPortMappings == null) {
            this.containerPortMappings = null;
            return;
        }

        this.containerPortMappings = new java.util.ArrayList<ContainerPortMapping>(containerPortMappings);
    }

    /**
     * <p>
     * Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to a game
     * via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection port to a port
     * on the container that hosts the game session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerPortMappings(java.util.Collection)} or
     * {@link #withContainerPortMappings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param containerPortMappings
     *        Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to
     *        a game via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection
     *        port to a port on the container that hosts the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerAttributes withContainerPortMappings(ContainerPortMapping... containerPortMappings) {
        if (this.containerPortMappings == null) {
            setContainerPortMappings(new java.util.ArrayList<ContainerPortMapping>(containerPortMappings.length));
        }
        for (ContainerPortMapping ele : containerPortMappings) {
            this.containerPortMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to a game
     * via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection port to a port
     * on the container that hosts the game session.
     * </p>
     * 
     * @param containerPortMappings
     *        Describes how container ports map to connection ports on the fleet instance. Incoming traffic connects to
     *        a game via a connection port. A <code>ContainerPortMapping</code> directs the traffic from a connection
     *        port to a port on the container that hosts the game session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerAttributes withContainerPortMappings(java.util.Collection<ContainerPortMapping> containerPortMappings) {
        setContainerPortMappings(containerPortMappings);
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
        if (getContainerPortMappings() != null)
            sb.append("ContainerPortMappings: ").append(getContainerPortMappings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerAttributes == false)
            return false;
        ContainerAttributes other = (ContainerAttributes) obj;
        if (other.getContainerPortMappings() == null ^ this.getContainerPortMappings() == null)
            return false;
        if (other.getContainerPortMappings() != null && other.getContainerPortMappings().equals(this.getContainerPortMappings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerPortMappings() == null) ? 0 : getContainerPortMappings().hashCode());
        return hashCode;
    }

    @Override
    public ContainerAttributes clone() {
        try {
            return (ContainerAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
