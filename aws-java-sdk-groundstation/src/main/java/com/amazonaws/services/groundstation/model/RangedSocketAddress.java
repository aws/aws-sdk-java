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
package com.amazonaws.services.groundstation.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A socket address with a port range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/groundstation-2019-05-23/RangedSocketAddress" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RangedSocketAddress implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * IPv4 socket address.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Port range of a socket address.
     * </p>
     */
    private IntegerRange portRange;

    /**
     * <p>
     * IPv4 socket address.
     * </p>
     * 
     * @param name
     *        IPv4 socket address.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * IPv4 socket address.
     * </p>
     * 
     * @return IPv4 socket address.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * IPv4 socket address.
     * </p>
     * 
     * @param name
     *        IPv4 socket address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RangedSocketAddress withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Port range of a socket address.
     * </p>
     * 
     * @param portRange
     *        Port range of a socket address.
     */

    public void setPortRange(IntegerRange portRange) {
        this.portRange = portRange;
    }

    /**
     * <p>
     * Port range of a socket address.
     * </p>
     * 
     * @return Port range of a socket address.
     */

    public IntegerRange getPortRange() {
        return this.portRange;
    }

    /**
     * <p>
     * Port range of a socket address.
     * </p>
     * 
     * @param portRange
     *        Port range of a socket address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RangedSocketAddress withPortRange(IntegerRange portRange) {
        setPortRange(portRange);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPortRange() != null)
            sb.append("PortRange: ").append(getPortRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RangedSocketAddress == false)
            return false;
        RangedSocketAddress other = (RangedSocketAddress) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPortRange() == null ^ this.getPortRange() == null)
            return false;
        if (other.getPortRange() != null && other.getPortRange().equals(this.getPortRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPortRange() == null) ? 0 : getPortRange().hashCode());
        return hashCode;
    }

    @Override
    public RangedSocketAddress clone() {
        try {
            return (RangedSocketAddress) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.groundstation.model.transform.RangedSocketAddressMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
