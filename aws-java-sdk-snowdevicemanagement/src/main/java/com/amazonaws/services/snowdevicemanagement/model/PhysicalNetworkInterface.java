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
package com.amazonaws.services.snowdevicemanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details about the physical network interface for the device.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snow-device-management-2021-08-04/PhysicalNetworkInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PhysicalNetworkInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The default gateway of the device.
     * </p>
     */
    private String defaultGateway;
    /**
     * <p>
     * The IP address of the device.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * A value that describes whether the IP address is dynamic or persistent.
     * </p>
     */
    private String ipAddressAssignment;
    /**
     * <p>
     * The MAC address of the device.
     * </p>
     */
    private String macAddress;
    /**
     * <p>
     * The netmask used to divide the IP address into subnets.
     * </p>
     */
    private String netmask;
    /**
     * <p>
     * The physical connector type.
     * </p>
     */
    private String physicalConnectorType;
    /**
     * <p>
     * The physical network interface ID.
     * </p>
     */
    private String physicalNetworkInterfaceId;

    /**
     * <p>
     * The default gateway of the device.
     * </p>
     * 
     * @param defaultGateway
     *        The default gateway of the device.
     */

    public void setDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
    }

    /**
     * <p>
     * The default gateway of the device.
     * </p>
     * 
     * @return The default gateway of the device.
     */

    public String getDefaultGateway() {
        return this.defaultGateway;
    }

    /**
     * <p>
     * The default gateway of the device.
     * </p>
     * 
     * @param defaultGateway
     *        The default gateway of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalNetworkInterface withDefaultGateway(String defaultGateway) {
        setDefaultGateway(defaultGateway);
        return this;
    }

    /**
     * <p>
     * The IP address of the device.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the device.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the device.
     * </p>
     * 
     * @return The IP address of the device.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the device.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalNetworkInterface withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * A value that describes whether the IP address is dynamic or persistent.
     * </p>
     * 
     * @param ipAddressAssignment
     *        A value that describes whether the IP address is dynamic or persistent.
     * @see IpAddressAssignment
     */

    public void setIpAddressAssignment(String ipAddressAssignment) {
        this.ipAddressAssignment = ipAddressAssignment;
    }

    /**
     * <p>
     * A value that describes whether the IP address is dynamic or persistent.
     * </p>
     * 
     * @return A value that describes whether the IP address is dynamic or persistent.
     * @see IpAddressAssignment
     */

    public String getIpAddressAssignment() {
        return this.ipAddressAssignment;
    }

    /**
     * <p>
     * A value that describes whether the IP address is dynamic or persistent.
     * </p>
     * 
     * @param ipAddressAssignment
     *        A value that describes whether the IP address is dynamic or persistent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressAssignment
     */

    public PhysicalNetworkInterface withIpAddressAssignment(String ipAddressAssignment) {
        setIpAddressAssignment(ipAddressAssignment);
        return this;
    }

    /**
     * <p>
     * A value that describes whether the IP address is dynamic or persistent.
     * </p>
     * 
     * @param ipAddressAssignment
     *        A value that describes whether the IP address is dynamic or persistent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IpAddressAssignment
     */

    public PhysicalNetworkInterface withIpAddressAssignment(IpAddressAssignment ipAddressAssignment) {
        this.ipAddressAssignment = ipAddressAssignment.toString();
        return this;
    }

    /**
     * <p>
     * The MAC address of the device.
     * </p>
     * 
     * @param macAddress
     *        The MAC address of the device.
     */

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * <p>
     * The MAC address of the device.
     * </p>
     * 
     * @return The MAC address of the device.
     */

    public String getMacAddress() {
        return this.macAddress;
    }

    /**
     * <p>
     * The MAC address of the device.
     * </p>
     * 
     * @param macAddress
     *        The MAC address of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalNetworkInterface withMacAddress(String macAddress) {
        setMacAddress(macAddress);
        return this;
    }

    /**
     * <p>
     * The netmask used to divide the IP address into subnets.
     * </p>
     * 
     * @param netmask
     *        The netmask used to divide the IP address into subnets.
     */

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    /**
     * <p>
     * The netmask used to divide the IP address into subnets.
     * </p>
     * 
     * @return The netmask used to divide the IP address into subnets.
     */

    public String getNetmask() {
        return this.netmask;
    }

    /**
     * <p>
     * The netmask used to divide the IP address into subnets.
     * </p>
     * 
     * @param netmask
     *        The netmask used to divide the IP address into subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalNetworkInterface withNetmask(String netmask) {
        setNetmask(netmask);
        return this;
    }

    /**
     * <p>
     * The physical connector type.
     * </p>
     * 
     * @param physicalConnectorType
     *        The physical connector type.
     * @see PhysicalConnectorType
     */

    public void setPhysicalConnectorType(String physicalConnectorType) {
        this.physicalConnectorType = physicalConnectorType;
    }

    /**
     * <p>
     * The physical connector type.
     * </p>
     * 
     * @return The physical connector type.
     * @see PhysicalConnectorType
     */

    public String getPhysicalConnectorType() {
        return this.physicalConnectorType;
    }

    /**
     * <p>
     * The physical connector type.
     * </p>
     * 
     * @param physicalConnectorType
     *        The physical connector type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhysicalConnectorType
     */

    public PhysicalNetworkInterface withPhysicalConnectorType(String physicalConnectorType) {
        setPhysicalConnectorType(physicalConnectorType);
        return this;
    }

    /**
     * <p>
     * The physical connector type.
     * </p>
     * 
     * @param physicalConnectorType
     *        The physical connector type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhysicalConnectorType
     */

    public PhysicalNetworkInterface withPhysicalConnectorType(PhysicalConnectorType physicalConnectorType) {
        this.physicalConnectorType = physicalConnectorType.toString();
        return this;
    }

    /**
     * <p>
     * The physical network interface ID.
     * </p>
     * 
     * @param physicalNetworkInterfaceId
     *        The physical network interface ID.
     */

    public void setPhysicalNetworkInterfaceId(String physicalNetworkInterfaceId) {
        this.physicalNetworkInterfaceId = physicalNetworkInterfaceId;
    }

    /**
     * <p>
     * The physical network interface ID.
     * </p>
     * 
     * @return The physical network interface ID.
     */

    public String getPhysicalNetworkInterfaceId() {
        return this.physicalNetworkInterfaceId;
    }

    /**
     * <p>
     * The physical network interface ID.
     * </p>
     * 
     * @param physicalNetworkInterfaceId
     *        The physical network interface ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PhysicalNetworkInterface withPhysicalNetworkInterfaceId(String physicalNetworkInterfaceId) {
        setPhysicalNetworkInterfaceId(physicalNetworkInterfaceId);
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
        if (getDefaultGateway() != null)
            sb.append("DefaultGateway: ").append(getDefaultGateway()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getIpAddressAssignment() != null)
            sb.append("IpAddressAssignment: ").append(getIpAddressAssignment()).append(",");
        if (getMacAddress() != null)
            sb.append("MacAddress: ").append(getMacAddress()).append(",");
        if (getNetmask() != null)
            sb.append("Netmask: ").append(getNetmask()).append(",");
        if (getPhysicalConnectorType() != null)
            sb.append("PhysicalConnectorType: ").append(getPhysicalConnectorType()).append(",");
        if (getPhysicalNetworkInterfaceId() != null)
            sb.append("PhysicalNetworkInterfaceId: ").append(getPhysicalNetworkInterfaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PhysicalNetworkInterface == false)
            return false;
        PhysicalNetworkInterface other = (PhysicalNetworkInterface) obj;
        if (other.getDefaultGateway() == null ^ this.getDefaultGateway() == null)
            return false;
        if (other.getDefaultGateway() != null && other.getDefaultGateway().equals(this.getDefaultGateway()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getIpAddressAssignment() == null ^ this.getIpAddressAssignment() == null)
            return false;
        if (other.getIpAddressAssignment() != null && other.getIpAddressAssignment().equals(this.getIpAddressAssignment()) == false)
            return false;
        if (other.getMacAddress() == null ^ this.getMacAddress() == null)
            return false;
        if (other.getMacAddress() != null && other.getMacAddress().equals(this.getMacAddress()) == false)
            return false;
        if (other.getNetmask() == null ^ this.getNetmask() == null)
            return false;
        if (other.getNetmask() != null && other.getNetmask().equals(this.getNetmask()) == false)
            return false;
        if (other.getPhysicalConnectorType() == null ^ this.getPhysicalConnectorType() == null)
            return false;
        if (other.getPhysicalConnectorType() != null && other.getPhysicalConnectorType().equals(this.getPhysicalConnectorType()) == false)
            return false;
        if (other.getPhysicalNetworkInterfaceId() == null ^ this.getPhysicalNetworkInterfaceId() == null)
            return false;
        if (other.getPhysicalNetworkInterfaceId() != null && other.getPhysicalNetworkInterfaceId().equals(this.getPhysicalNetworkInterfaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultGateway() == null) ? 0 : getDefaultGateway().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getIpAddressAssignment() == null) ? 0 : getIpAddressAssignment().hashCode());
        hashCode = prime * hashCode + ((getMacAddress() == null) ? 0 : getMacAddress().hashCode());
        hashCode = prime * hashCode + ((getNetmask() == null) ? 0 : getNetmask().hashCode());
        hashCode = prime * hashCode + ((getPhysicalConnectorType() == null) ? 0 : getPhysicalConnectorType().hashCode());
        hashCode = prime * hashCode + ((getPhysicalNetworkInterfaceId() == null) ? 0 : getPhysicalNetworkInterfaceId().hashCode());
        return hashCode;
    }

    @Override
    public PhysicalNetworkInterface clone() {
        try {
            return (PhysicalNetworkInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowdevicemanagement.model.transform.PhysicalNetworkInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
