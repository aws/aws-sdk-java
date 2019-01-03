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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type for the set of IP addresses for an accelerator.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/IpSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IpSet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The types of IP addresses included in this IP set.
     * </p>
     */
    private String ipFamily;
    /**
     * <p>
     * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     * </p>
     */
    private java.util.List<String> ipAddresses;

    /**
     * <p>
     * The types of IP addresses included in this IP set.
     * </p>
     * 
     * @param ipFamily
     *        The types of IP addresses included in this IP set.
     */

    public void setIpFamily(String ipFamily) {
        this.ipFamily = ipFamily;
    }

    /**
     * <p>
     * The types of IP addresses included in this IP set.
     * </p>
     * 
     * @return The types of IP addresses included in this IP set.
     */

    public String getIpFamily() {
        return this.ipFamily;
    }

    /**
     * <p>
     * The types of IP addresses included in this IP set.
     * </p>
     * 
     * @param ipFamily
     *        The types of IP addresses included in this IP set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpSet withIpFamily(String ipFamily) {
        setIpFamily(ipFamily);
        return this;
    }

    /**
     * <p>
     * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     * </p>
     * 
     * @return The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP
     *         addresses.
     */

    public java.util.List<String> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * <p>
     * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     * </p>
     * 
     * @param ipAddresses
     *        The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     */

    public void setIpAddresses(java.util.Collection<String> ipAddresses) {
        if (ipAddresses == null) {
            this.ipAddresses = null;
            return;
        }

        this.ipAddresses = new java.util.ArrayList<String>(ipAddresses);
    }

    /**
     * <p>
     * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpAddresses(java.util.Collection)} or {@link #withIpAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipAddresses
     *        The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpSet withIpAddresses(String... ipAddresses) {
        if (this.ipAddresses == null) {
            setIpAddresses(new java.util.ArrayList<String>(ipAddresses.length));
        }
        for (String ele : ipAddresses) {
            this.ipAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     * </p>
     * 
     * @param ipAddresses
     *        The array of IP addresses in the IP address set. An IP address set can have a maximum of two IP addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IpSet withIpAddresses(java.util.Collection<String> ipAddresses) {
        setIpAddresses(ipAddresses);
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
        if (getIpFamily() != null)
            sb.append("IpFamily: ").append(getIpFamily()).append(",");
        if (getIpAddresses() != null)
            sb.append("IpAddresses: ").append(getIpAddresses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IpSet == false)
            return false;
        IpSet other = (IpSet) obj;
        if (other.getIpFamily() == null ^ this.getIpFamily() == null)
            return false;
        if (other.getIpFamily() != null && other.getIpFamily().equals(this.getIpFamily()) == false)
            return false;
        if (other.getIpAddresses() == null ^ this.getIpAddresses() == null)
            return false;
        if (other.getIpAddresses() != null && other.getIpAddresses().equals(this.getIpAddresses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIpFamily() == null) ? 0 : getIpFamily().hashCode());
        hashCode = prime * hashCode + ((getIpAddresses() == null) ? 0 : getIpAddresses().hashCode());
        return hashCode;
    }

    @Override
    public IpSet clone() {
        try {
            return (IpSet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.IpSetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
