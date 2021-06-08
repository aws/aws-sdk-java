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
 * Information about the destination of the next component in the network path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/NetworkPathComponentDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkPathComponentDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IP addresses of the destination.
     * </p>
     */
    private java.util.List<String> address;
    /**
     * <p>
     * A list of port ranges for the destination.
     * </p>
     */
    private java.util.List<PortRange> portRanges;

    /**
     * <p>
     * The IP addresses of the destination.
     * </p>
     * 
     * @return The IP addresses of the destination.
     */

    public java.util.List<String> getAddress() {
        return address;
    }

    /**
     * <p>
     * The IP addresses of the destination.
     * </p>
     * 
     * @param address
     *        The IP addresses of the destination.
     */

    public void setAddress(java.util.Collection<String> address) {
        if (address == null) {
            this.address = null;
            return;
        }

        this.address = new java.util.ArrayList<String>(address);
    }

    /**
     * <p>
     * The IP addresses of the destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAddress(java.util.Collection)} or {@link #withAddress(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param address
     *        The IP addresses of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponentDetails withAddress(String... address) {
        if (this.address == null) {
            setAddress(new java.util.ArrayList<String>(address.length));
        }
        for (String ele : address) {
            this.address.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses of the destination.
     * </p>
     * 
     * @param address
     *        The IP addresses of the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponentDetails withAddress(java.util.Collection<String> address) {
        setAddress(address);
        return this;
    }

    /**
     * <p>
     * A list of port ranges for the destination.
     * </p>
     * 
     * @return A list of port ranges for the destination.
     */

    public java.util.List<PortRange> getPortRanges() {
        return portRanges;
    }

    /**
     * <p>
     * A list of port ranges for the destination.
     * </p>
     * 
     * @param portRanges
     *        A list of port ranges for the destination.
     */

    public void setPortRanges(java.util.Collection<PortRange> portRanges) {
        if (portRanges == null) {
            this.portRanges = null;
            return;
        }

        this.portRanges = new java.util.ArrayList<PortRange>(portRanges);
    }

    /**
     * <p>
     * A list of port ranges for the destination.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortRanges(java.util.Collection)} or {@link #withPortRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portRanges
     *        A list of port ranges for the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponentDetails withPortRanges(PortRange... portRanges) {
        if (this.portRanges == null) {
            setPortRanges(new java.util.ArrayList<PortRange>(portRanges.length));
        }
        for (PortRange ele : portRanges) {
            this.portRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of port ranges for the destination.
     * </p>
     * 
     * @param portRanges
     *        A list of port ranges for the destination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkPathComponentDetails withPortRanges(java.util.Collection<PortRange> portRanges) {
        setPortRanges(portRanges);
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
        if (getAddress() != null)
            sb.append("Address: ").append(getAddress()).append(",");
        if (getPortRanges() != null)
            sb.append("PortRanges: ").append(getPortRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkPathComponentDetails == false)
            return false;
        NetworkPathComponentDetails other = (NetworkPathComponentDetails) obj;
        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPortRanges() == null ^ this.getPortRanges() == null)
            return false;
        if (other.getPortRanges() != null && other.getPortRanges().equals(this.getPortRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPortRanges() == null) ? 0 : getPortRanges().hashCode());
        return hashCode;
    }

    @Override
    public NetworkPathComponentDetails clone() {
        try {
            return (NetworkPathComponentDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.NetworkPathComponentDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
