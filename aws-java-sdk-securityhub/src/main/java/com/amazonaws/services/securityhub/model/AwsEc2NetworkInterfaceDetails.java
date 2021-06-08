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
 * Details about the network interface
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2NetworkInterfaceDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkInterfaceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The network interface attachment.
     * </p>
     */
    private AwsEc2NetworkInterfaceAttachment attachment;
    /**
     * <p>
     * The ID of the network interface.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     */
    private java.util.List<AwsEc2NetworkInterfaceSecurityGroup> securityGroups;
    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     */
    private Boolean sourceDestCheck;
    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     */
    private java.util.List<AwsEc2NetworkInterfaceIpV6AddressDetail> ipV6Addresses;
    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     */
    private java.util.List<AwsEc2NetworkInterfacePrivateIpAddressDetail> privateIpAddresses;
    /**
     * <p>
     * The public DNS name of the network interface.
     * </p>
     */
    private String publicDnsName;
    /**
     * <p>
     * The address of the Elastic IP address bound to the network interface.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * 
     * @param attachment
     *        The network interface attachment.
     */

    public void setAttachment(AwsEc2NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * 
     * @return The network interface attachment.
     */

    public AwsEc2NetworkInterfaceAttachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * 
     * @param attachment
     *        The network interface attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withAttachment(AwsEc2NetworkInterfaceAttachment attachment) {
        setAttachment(attachment);
        return this;
    }

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

    public AwsEc2NetworkInterfaceDetails withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     * 
     * @return Security groups for the network interface.
     */

    public java.util.List<AwsEc2NetworkInterfaceSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     * 
     * @param securityGroups
     *        Security groups for the network interface.
     */

    public void setSecurityGroups(java.util.Collection<AwsEc2NetworkInterfaceSecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<AwsEc2NetworkInterfaceSecurityGroup>(securityGroups);
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        Security groups for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withSecurityGroups(AwsEc2NetworkInterfaceSecurityGroup... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<AwsEc2NetworkInterfaceSecurityGroup>(securityGroups.length));
        }
        for (AwsEc2NetworkInterfaceSecurityGroup ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     * 
     * @param securityGroups
     *        Security groups for the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withSecurityGroups(java.util.Collection<AwsEc2NetworkInterfaceSecurityGroup> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether traffic to or from the instance is validated.
     */

    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     * 
     * @return Indicates whether traffic to or from the instance is validated.
     */

    public Boolean getSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     * 
     * @param sourceDestCheck
     *        Indicates whether traffic to or from the instance is validated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withSourceDestCheck(Boolean sourceDestCheck) {
        setSourceDestCheck(sourceDestCheck);
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     * 
     * @return Indicates whether traffic to or from the instance is validated.
     */

    public Boolean isSourceDestCheck() {
        return this.sourceDestCheck;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     * 
     * @return The IPv6 addresses associated with the network interface.
     */

    public java.util.List<AwsEc2NetworkInterfaceIpV6AddressDetail> getIpV6Addresses() {
        return ipV6Addresses;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the network interface.
     */

    public void setIpV6Addresses(java.util.Collection<AwsEc2NetworkInterfaceIpV6AddressDetail> ipV6Addresses) {
        if (ipV6Addresses == null) {
            this.ipV6Addresses = null;
            return;
        }

        this.ipV6Addresses = new java.util.ArrayList<AwsEc2NetworkInterfaceIpV6AddressDetail>(ipV6Addresses);
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpV6Addresses(java.util.Collection)} or {@link #withIpV6Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withIpV6Addresses(AwsEc2NetworkInterfaceIpV6AddressDetail... ipV6Addresses) {
        if (this.ipV6Addresses == null) {
            setIpV6Addresses(new java.util.ArrayList<AwsEc2NetworkInterfaceIpV6AddressDetail>(ipV6Addresses.length));
        }
        for (AwsEc2NetworkInterfaceIpV6AddressDetail ele : ipV6Addresses) {
            this.ipV6Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv6 addresses associated with the network interface.
     * </p>
     * 
     * @param ipV6Addresses
     *        The IPv6 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withIpV6Addresses(java.util.Collection<AwsEc2NetworkInterfaceIpV6AddressDetail> ipV6Addresses) {
        setIpV6Addresses(ipV6Addresses);
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     * 
     * @return The private IPv4 addresses associated with the network interface.
     */

    public java.util.List<AwsEc2NetworkInterfacePrivateIpAddressDetail> getPrivateIpAddresses() {
        return privateIpAddresses;
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses associated with the network interface.
     */

    public void setPrivateIpAddresses(java.util.Collection<AwsEc2NetworkInterfacePrivateIpAddressDetail> privateIpAddresses) {
        if (privateIpAddresses == null) {
            this.privateIpAddresses = null;
            return;
        }

        this.privateIpAddresses = new java.util.ArrayList<AwsEc2NetworkInterfacePrivateIpAddressDetail>(privateIpAddresses);
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPrivateIpAddresses(java.util.Collection)} or {@link #withPrivateIpAddresses(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withPrivateIpAddresses(AwsEc2NetworkInterfacePrivateIpAddressDetail... privateIpAddresses) {
        if (this.privateIpAddresses == null) {
            setPrivateIpAddresses(new java.util.ArrayList<AwsEc2NetworkInterfacePrivateIpAddressDetail>(privateIpAddresses.length));
        }
        for (AwsEc2NetworkInterfacePrivateIpAddressDetail ele : privateIpAddresses) {
            this.privateIpAddresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The private IPv4 addresses associated with the network interface.
     * </p>
     * 
     * @param privateIpAddresses
     *        The private IPv4 addresses associated with the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withPrivateIpAddresses(java.util.Collection<AwsEc2NetworkInterfacePrivateIpAddressDetail> privateIpAddresses) {
        setPrivateIpAddresses(privateIpAddresses);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the network interface.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name of the network interface.
     */

    public void setPublicDnsName(String publicDnsName) {
        this.publicDnsName = publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the network interface.
     * </p>
     * 
     * @return The public DNS name of the network interface.
     */

    public String getPublicDnsName() {
        return this.publicDnsName;
    }

    /**
     * <p>
     * The public DNS name of the network interface.
     * </p>
     * 
     * @param publicDnsName
     *        The public DNS name of the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withPublicDnsName(String publicDnsName) {
        setPublicDnsName(publicDnsName);
        return this;
    }

    /**
     * <p>
     * The address of the Elastic IP address bound to the network interface.
     * </p>
     * 
     * @param publicIp
     *        The address of the Elastic IP address bound to the network interface.
     */

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The address of the Elastic IP address bound to the network interface.
     * </p>
     * 
     * @return The address of the Elastic IP address bound to the network interface.
     */

    public String getPublicIp() {
        return this.publicIp;
    }

    /**
     * <p>
     * The address of the Elastic IP address bound to the network interface.
     * </p>
     * 
     * @param publicIp
     *        The address of the Elastic IP address bound to the network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkInterfaceDetails withPublicIp(String publicIp) {
        setPublicIp(publicIp);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: ").append(getSourceDestCheck()).append(",");
        if (getIpV6Addresses() != null)
            sb.append("IpV6Addresses: ").append(getIpV6Addresses()).append(",");
        if (getPrivateIpAddresses() != null)
            sb.append("PrivateIpAddresses: ").append(getPrivateIpAddresses()).append(",");
        if (getPublicDnsName() != null)
            sb.append("PublicDnsName: ").append(getPublicDnsName()).append(",");
        if (getPublicIp() != null)
            sb.append("PublicIp: ").append(getPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2NetworkInterfaceDetails == false)
            return false;
        AwsEc2NetworkInterfaceDetails other = (AwsEc2NetworkInterfaceDetails) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        if (other.getIpV6Addresses() == null ^ this.getIpV6Addresses() == null)
            return false;
        if (other.getIpV6Addresses() != null && other.getIpV6Addresses().equals(this.getIpV6Addresses()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        hashCode = prime * hashCode + ((getIpV6Addresses() == null) ? 0 : getIpV6Addresses().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddresses() == null) ? 0 : getPrivateIpAddresses().hashCode());
        hashCode = prime * hashCode + ((getPublicDnsName() == null) ? 0 : getPublicDnsName().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2NetworkInterfaceDetails clone() {
        try {
            return (AwsEc2NetworkInterfaceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2NetworkInterfaceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
