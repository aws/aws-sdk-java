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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the network interfaces interacting with an EC2 instance. This data type is used as one of
 * the elements of the <a>AssetAttributes</a> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/NetworkInterface" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInterface implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * The ID of a subnet associated with the network interface.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The ID of a VPC associated with the network interface.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The name of a private DNS associated with the network interface.
     * </p>
     */
    private String privateDnsName;
    /**
     * <p>
     * The private IP address associated with the network interface.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     * privateIpAddress.
     * </p>
     */
    private java.util.List<PrivateIp> privateIpAddresses;
    /**
     * <p>
     * The name of a public DNS associated with the network interface.
     * </p>
     */
    private String publicDnsName;
    /**
     * <p>
     * The public IP address from which the network interface is reachable.
     * </p>
     */
    private String publicIp;
    /**
     * <p>
     * The IP addresses associated with the network interface.
     * </p>
     */
    private java.util.List<String> ipv6Addresses;
    /**
     * <p>
     * A list of the security groups associated with the network interface. Includes the groupId and groupName.
     * </p>
     */
    private java.util.List<SecurityGroup> securityGroups;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @return The ID of the network interface.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of a subnet associated with the network interface.
     * </p>
     * 
     * @param subnetId
     *        The ID of a subnet associated with the network interface.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of a subnet associated with the network interface.
     * </p>
     * 
     * @return The ID of a subnet associated with the network interface.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of a subnet associated with the network interface.
     * </p>
     * 
     * @param subnetId
     *        The ID of a subnet associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ID of a VPC associated with the network interface.
     * </p>
     * 
     * @param vpcId
     *        The ID of a VPC associated with the network interface.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of a VPC associated with the network interface.
     * </p>
     * 
     * @return The ID of a VPC associated with the network interface.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of a VPC associated with the network interface.
     * </p>
     * 
     * @param vpcId
     *        The ID of a VPC associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The name of a private DNS associated with the network interface.
     * </p>
     * 
     * @param privateDnsName
     *        The name of a private DNS associated with the network interface.
     */

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    /**
     * <p>
     * The name of a private DNS associated with the network interface.
     * </p>
     * 
     * @return The name of a private DNS associated with the network interface.
     */

    public String getPrivateDnsName() {
        return this.privateDnsName;
    }

    /**
     * <p>
     * The name of a private DNS associated with the network interface.
     * </p>
     * 
     * @param privateDnsName
     *        The name of a private DNS associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withPrivateDnsName(String privateDnsName) {
        setPrivateDnsName(privateDnsName);
        return this;
    }

    /**
     * <p>
     * The private IP address associated with the network interface.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address associated with the network interface.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the network interface.
     * </p>
     * 
     * @return The private IP address associated with the network interface.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address associated with the network interface.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     * privateIpAddress.
     * </p>
     * 
     * @return A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     *         privateIpAddress.
     */

    public java.util.List<PrivateIp> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     * privateIpAddress.
     * </p>
     * 
     * @param privateIpAddresses
     *        A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     *        privateIpAddress.
     */

    public void setPrivateIpAddresses(java.util.Collection<PrivateIp> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<PrivateIp>(privateIpAddresses);
    }

    /**
     * <p>
     * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     * privateIpAddress.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     *        privateIpAddress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withPrivateIpAddresses(PrivateIp... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new java.util.ArrayList<PrivateIp>(privateIpAddresses.length));
        }
        for (PrivateIp ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     * privateIpAddress.
     * </p>
     * 
     * @param privateIpAddresses
     *        A list of the private IP addresses associated with the network interface. Includes the privateDnsName and
     *        privateIpAddress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withPrivateIpAddresses(java.util.Collection<PrivateIp> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The name of a public DNS associated with the network interface.
     * </p>
     * 
     * @param publicDnsName
     *        The name of a public DNS associated with the network interface.
     */

    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The name of a public DNS associated with the network interface.
     * </p>
     * 
     * @return The name of a public DNS associated with the network interface.
     */

    public String getPublicDnsName() {
        return this.publicDnsName;
    }

    /**
     * <p>
     * The name of a public DNS associated with the network interface.
     * </p>
     * 
     * @param publicDnsName
     *        The name of a public DNS associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withPublicDnsName(String publicDnsName) {
        setPublicDnsName(publicDnsName);
        return this;
    }

    /**
     * <p>
     * The public IP address from which the network interface is reachable.
     * </p>
     * 
     * @param publicIp
     *        The public IP address from which the network interface is reachable.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The public IP address from which the network interface is reachable.
     * </p>
     * 
     * @return The public IP address from which the network interface is reachable.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The public IP address from which the network interface is reachable.
     * </p>
     * 
     * @param publicIp
     *        The public IP address from which the network interface is reachable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withPublicIp(String publicIp) {
        setPublicIp(publicIp);
        return this;
    }

    /**
     * <p>
     * The IP addresses associated with the network interface.
     * </p>
     * 
     * @return The IP addresses associated with the network interface.
     */

    public java.util.List<String> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * <p>
     * The IP addresses associated with the network interface.
     * </p>
     * 
     * @param ipv6Addresses
     *        The IP addresses associated with the network interface.
     */

    public void setIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        if (ipv6Addresses == null) {
            this.ipv6Addresses = null;
            return;
        }

        this.ipv6Addresses = new java.util.ArrayList<String>(ipv6Addresses);
    }

    /**
     * <p>
     * The IP addresses associated with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6Addresses(java.util.Collection)} or {@link #withIpv6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipv6Addresses
     *        The IP addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withIpv6Addresses(String... ipv6Addresses) {
        if (this.ipv6Addresses == null) {
            setIpv6Addresses(new java.util.ArrayList<String>(ipv6Addresses.length));
        }
        for (String ele : ipv6Addresses) {
            this.ipv6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses associated with the network interface.
     * </p>
     * 
     * @param ipv6Addresses
     *        The IP addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withIpv6Addresses(java.util.Collection<String> ipv6Addresses) {
        setIpv6Addresses(ipv6Addresses);
        return this;
    }

    /**
     * <p>
     * A list of the security groups associated with the network interface. Includes the groupId and groupName.
     * </p>
     * 
     * @return A list of the security groups associated with the network interface. Includes the groupId and groupName.
     */

    public java.util.List<SecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * A list of the security groups associated with the network interface. Includes the groupId and groupName.
     * </p>
     * 
     * @param securityGroups
     *        A list of the security groups associated with the network interface. Includes the groupId and groupName.
     */

    public void setSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<SecurityGroup>(securityGroups);
    }

    /**
     * <p>
     * A list of the security groups associated with the network interface. Includes the groupId and groupName.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        A list of the security groups associated with the network interface. Includes the groupId and groupName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withSecurityGroups(SecurityGroup... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<SecurityGroup>(securityGroups.length));
        }
        for (SecurityGroup ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the security groups associated with the network interface. Includes the groupId and groupName.
     * </p>
     * 
     * @param securityGroups
     *        A list of the security groups associated with the network interface. Includes the groupId and groupName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInterface withSecurityGroups(java.util.Collection<SecurityGroup> securityGroups) {
        setSecurityGroups(securityGroups);
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
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getPrivateDnsName() != null)
            sb.append("PrivateDnsName: ").append(getPrivateDnsName()).append(",");
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: ").append(getPublicDnsName()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp()).append(",");
        if (getIpv6Addresses() != null)
            sb.append("Ipv6Addresses: ").append(getIpv6Addresses()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInterface == false)
            return false;
        NetworkInterface other = (NetworkInterface) obj;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getPrivateDnsName() == null ^ this.getPrivateDnsName() == null)
            return false;
        if (other.getPrivateDnsName() != null && other.getPrivateDnsName().equals(this.getPrivateDnsName()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPrivateIpAddresses() == null ^ this.getPrivateIpAddresses() == null)
            return false;
        if (other.getPrivateIpAddresses() != null && other.getPrivateIpAddresses().equals(this.getPrivateIpAddresses()) == false)
            return false;
        if (other.getPublicDnsName() == null ^ this.getPublicDnsName() == null)
            return false;
        if (other.getPublicDnsName() != null && other.getPublicDnsName().equals(this.getPublicDnsName()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        if (other.getIpv6Addresses() == null ^ this.getIpv6Addresses() == null)
            return false;
        if (other.getIpv6Addresses() != null && other.getIpv6Addresses().equals(this.getIpv6Addresses()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getPrivateDnsName() == null) ? 0 : getPrivateDnsName().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        hashCode = prime * hashCode + ((getIpv6Addresses() == null) ? 0 : getIpv6Addresses().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInterface clone() {
        try {
            return (NetworkInterface) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.NetworkInterfaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
