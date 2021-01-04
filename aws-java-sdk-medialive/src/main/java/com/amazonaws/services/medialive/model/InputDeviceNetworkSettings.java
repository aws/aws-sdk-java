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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The network settings for the input device.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDeviceNetworkSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceNetworkSettings implements Serializable, Cloneable, StructuredPojo {

    /** The DNS addresses of the input device. */
    private java.util.List<String> dnsAddresses;
    /** The network gateway IP address. */
    private String gateway;
    /** The IP address of the input device. */
    private String ipAddress;
    /**
     * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     * assignment (DHCP) or a static IP address.
     */
    private String ipScheme;
    /** The subnet mask of the input device. */
    private String subnetMask;

    /**
     * The DNS addresses of the input device.
     * 
     * @return The DNS addresses of the input device.
     */

    public java.util.List<String> getDnsAddresses() {
        return dnsAddresses;
    }

    /**
     * The DNS addresses of the input device.
     * 
     * @param dnsAddresses
     *        The DNS addresses of the input device.
     */

    public void setDnsAddresses(java.util.Collection<String> dnsAddresses) {
        if (dnsAddresses == null) {
            this.dnsAddresses = null;
            return;
        }

        this.dnsAddresses = new java.util.ArrayList<String>(dnsAddresses);
    }

    /**
     * The DNS addresses of the input device.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsAddresses(java.util.Collection)} or {@link #withDnsAddresses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsAddresses
     *        The DNS addresses of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceNetworkSettings withDnsAddresses(String... dnsAddresses) {
        if (this.dnsAddresses == null) {
            setDnsAddresses(new java.util.ArrayList<String>(dnsAddresses.length));
        }
        for (String ele : dnsAddresses) {
            this.dnsAddresses.add(ele);
        }
        return this;
    }

    /**
     * The DNS addresses of the input device.
     * 
     * @param dnsAddresses
     *        The DNS addresses of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceNetworkSettings withDnsAddresses(java.util.Collection<String> dnsAddresses) {
        setDnsAddresses(dnsAddresses);
        return this;
    }

    /**
     * The network gateway IP address.
     * 
     * @param gateway
     *        The network gateway IP address.
     */

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    /**
     * The network gateway IP address.
     * 
     * @return The network gateway IP address.
     */

    public String getGateway() {
        return this.gateway;
    }

    /**
     * The network gateway IP address.
     * 
     * @param gateway
     *        The network gateway IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceNetworkSettings withGateway(String gateway) {
        setGateway(gateway);
        return this;
    }

    /**
     * The IP address of the input device.
     * 
     * @param ipAddress
     *        The IP address of the input device.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * The IP address of the input device.
     * 
     * @return The IP address of the input device.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * The IP address of the input device.
     * 
     * @param ipAddress
     *        The IP address of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceNetworkSettings withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     * assignment (DHCP) or a static IP address.
     * 
     * @param ipScheme
     *        Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     *        assignment (DHCP) or a static IP address.
     * @see InputDeviceIpScheme
     */

    public void setIpScheme(String ipScheme) {
        this.ipScheme = ipScheme;
    }

    /**
     * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     * assignment (DHCP) or a static IP address.
     * 
     * @return Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     *         assignment (DHCP) or a static IP address.
     * @see InputDeviceIpScheme
     */

    public String getIpScheme() {
        return this.ipScheme;
    }

    /**
     * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     * assignment (DHCP) or a static IP address.
     * 
     * @param ipScheme
     *        Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     *        assignment (DHCP) or a static IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceIpScheme
     */

    public InputDeviceNetworkSettings withIpScheme(String ipScheme) {
        setIpScheme(ipScheme);
        return this;
    }

    /**
     * Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     * assignment (DHCP) or a static IP address.
     * 
     * @param ipScheme
     *        Specifies whether the input device has been configured (outside of MediaLive) to use a dynamic IP address
     *        assignment (DHCP) or a static IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceIpScheme
     */

    public InputDeviceNetworkSettings withIpScheme(InputDeviceIpScheme ipScheme) {
        this.ipScheme = ipScheme.toString();
        return this;
    }

    /**
     * The subnet mask of the input device.
     * 
     * @param subnetMask
     *        The subnet mask of the input device.
     */

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    /**
     * The subnet mask of the input device.
     * 
     * @return The subnet mask of the input device.
     */

    public String getSubnetMask() {
        return this.subnetMask;
    }

    /**
     * The subnet mask of the input device.
     * 
     * @param subnetMask
     *        The subnet mask of the input device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceNetworkSettings withSubnetMask(String subnetMask) {
        setSubnetMask(subnetMask);
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
        if (getDnsAddresses() != null)
            sb.append("DnsAddresses: ").append(getDnsAddresses()).append(",");
        if (getGateway() != null)
            sb.append("Gateway: ").append(getGateway()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getIpScheme() != null)
            sb.append("IpScheme: ").append(getIpScheme()).append(",");
        if (getSubnetMask() != null)
            sb.append("SubnetMask: ").append(getSubnetMask());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDeviceNetworkSettings == false)
            return false;
        InputDeviceNetworkSettings other = (InputDeviceNetworkSettings) obj;
        if (other.getDnsAddresses() == null ^ this.getDnsAddresses() == null)
            return false;
        if (other.getDnsAddresses() != null && other.getDnsAddresses().equals(this.getDnsAddresses()) == false)
            return false;
        if (other.getGateway() == null ^ this.getGateway() == null)
            return false;
        if (other.getGateway() != null && other.getGateway().equals(this.getGateway()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getIpScheme() == null ^ this.getIpScheme() == null)
            return false;
        if (other.getIpScheme() != null && other.getIpScheme().equals(this.getIpScheme()) == false)
            return false;
        if (other.getSubnetMask() == null ^ this.getSubnetMask() == null)
            return false;
        if (other.getSubnetMask() != null && other.getSubnetMask().equals(this.getSubnetMask()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDnsAddresses() == null) ? 0 : getDnsAddresses().hashCode());
        hashCode = prime * hashCode + ((getGateway() == null) ? 0 : getGateway().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getIpScheme() == null) ? 0 : getIpScheme().hashCode());
        hashCode = prime * hashCode + ((getSubnetMask() == null) ? 0 : getSubnetMask().hashCode());
        return hashCode;
    }

    @Override
    public InputDeviceNetworkSettings clone() {
        try {
            return (InputDeviceNetworkSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDeviceNetworkSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
