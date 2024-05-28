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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The IP addresses for a host.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/IpAddresses" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpAddresses implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IpV4 address of the network.
     * </p>
     */
    private java.util.List<String> ipV4Addresses;
    /**
     * <p>
     * The IpV6 address for the network and node component.
     * </p>
     */
    private java.util.List<String> ipV6Addresses;

    /**
     * <p>
     * The IpV4 address of the network.
     * </p>
     * 
     * @return The IpV4 address of the network.
     */

    public java.util.List<String> getIpV4Addresses() {
        return ipV4Addresses;
    }

    /**
     * <p>
     * The IpV4 address of the network.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IpV4 address of the network.
     */

    public void setIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        if (ipV4Addresses == null) {
            this.ipV4Addresses = null;
            return;
        }

        this.ipV4Addresses = new java.util.ArrayList<String>(ipV4Addresses);
    }

    /**
     * <p>
     * The IpV4 address of the network.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpV4Addresses(java.util.Collection)} or {@link #withIpV4Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IpV4 address of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddresses withIpV4Addresses(String... ipV4Addresses) {
        if (this.ipV4Addresses == null) {
            setIpV4Addresses(new java.util.ArrayList<String>(ipV4Addresses.length));
        }
        for (String ele : ipV4Addresses) {
            this.ipV4Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IpV4 address of the network.
     * </p>
     * 
     * @param ipV4Addresses
     *        The IpV4 address of the network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddresses withIpV4Addresses(java.util.Collection<String> ipV4Addresses) {
        setIpV4Addresses(ipV4Addresses);
        return this;
    }

    /**
     * <p>
     * The IpV6 address for the network and node component.
     * </p>
     * 
     * @return The IpV6 address for the network and node component.
     */

    public java.util.List<String> getIpV6Addresses() {
        return ipV6Addresses;
    }

    /**
     * <p>
     * The IpV6 address for the network and node component.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IpV6 address for the network and node component.
     */

    public void setIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        if (ipV6Addresses == null) {
            this.ipV6Addresses = null;
            return;
        }

        this.ipV6Addresses = new java.util.ArrayList<String>(ipV6Addresses);
    }

    /**
     * <p>
     * The IpV6 address for the network and node component.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpV6Addresses(java.util.Collection)} or {@link #withIpV6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IpV6 address for the network and node component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddresses withIpV6Addresses(String... ipV6Addresses) {
        if (this.ipV6Addresses == null) {
            setIpV6Addresses(new java.util.ArrayList<String>(ipV6Addresses.length));
        }
        for (String ele : ipV6Addresses) {
            this.ipV6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IpV6 address for the network and node component.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IpV6 address for the network and node component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpAddresses withIpV6Addresses(java.util.Collection<String> ipV6Addresses) {
        setIpV6Addresses(ipV6Addresses);
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
        if (getIpV4Addresses() != null)
            sb.append("IpV4Addresses: ").append(getIpV4Addresses()).append(",");
        if (getIpV6Addresses() != null)
            sb.append("IpV6Addresses: ").append(getIpV6Addresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpAddresses == false)
            return false;
        IpAddresses other = (IpAddresses) obj;
        if (other.getIpV4Addresses() == null ^ this.getIpV4Addresses() == null)
            return false;
        if (other.getIpV4Addresses() != null && other.getIpV4Addresses().equals(this.getIpV4Addresses()) == false)
            return false;
        if (other.getIpV6Addresses() == null ^ this.getIpV6Addresses() == null)
            return false;
        if (other.getIpV6Addresses() != null && other.getIpV6Addresses().equals(this.getIpV6Addresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpV4Addresses() == null) ? 0 : getIpV4Addresses().hashCode());
        hashCode = prime * hashCode + ((getIpV6Addresses() == null) ? 0 : getIpV6Addresses().hashCode());
        return hashCode;
    }

    @Override
    public IpAddresses clone() {
        try {
            return (IpAddresses) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.IpAddressesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
