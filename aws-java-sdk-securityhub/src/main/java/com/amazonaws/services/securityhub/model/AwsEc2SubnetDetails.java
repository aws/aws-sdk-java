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
 * Contains information about a subnet in EC2.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2SubnetDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2SubnetDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether to assign an IPV6 address to a network interface that is created in this subnet.
     * </p>
     */
    private Boolean assignIpv6AddressOnCreation;
    /**
     * <p>
     * The Availability Zone for the subnet.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The identifier of the Availability Zone for the subnet.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
     * </p>
     */
    private Integer availableIpAddressCount;
    /**
     * <p>
     * The IPV4 CIDR block that is assigned to the subnet.
     * </p>
     */
    private String cidrBlock;
    /**
     * <p>
     * Whether this subnet is the default subnet for the Availability Zone.
     * </p>
     */
    private Boolean defaultForAz;
    /**
     * <p>
     * Whether instances in this subnet receive a public IP address.
     * </p>
     */
    private Boolean mapPublicIpOnLaunch;
    /**
     * <p>
     * The identifier of the AWS account that owns the subnet.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The current state of the subnet.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     */
    private String subnetArn;
    /**
     * <p>
     * The identifier of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The identifier of the VPC that contains the subnet.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The IPV6 CIDR blocks that are associated with the subnet.
     * </p>
     */
    private java.util.List<Ipv6CidrBlockAssociation> ipv6CidrBlockAssociationSet;

    /**
     * <p>
     * Whether to assign an IPV6 address to a network interface that is created in this subnet.
     * </p>
     * 
     * @param assignIpv6AddressOnCreation
     *        Whether to assign an IPV6 address to a network interface that is created in this subnet.
     */

    public void setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Whether to assign an IPV6 address to a network interface that is created in this subnet.
     * </p>
     * 
     * @return Whether to assign an IPV6 address to a network interface that is created in this subnet.
     */

    public Boolean getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * Whether to assign an IPV6 address to a network interface that is created in this subnet.
     * </p>
     * 
     * @param assignIpv6AddressOnCreation
     *        Whether to assign an IPV6 address to a network interface that is created in this subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
        setAssignIpv6AddressOnCreation(assignIpv6AddressOnCreation);
        return this;
    }

    /**
     * <p>
     * Whether to assign an IPV6 address to a network interface that is created in this subnet.
     * </p>
     * 
     * @return Whether to assign an IPV6 address to a network interface that is created in this subnet.
     */

    public Boolean isAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }

    /**
     * <p>
     * The Availability Zone for the subnet.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the subnet.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the subnet.
     * </p>
     * 
     * @return The Availability Zone for the subnet.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone for the subnet.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The identifier of the Availability Zone for the subnet.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the Availability Zone for the subnet.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the Availability Zone for the subnet.
     * </p>
     * 
     * @return The identifier of the Availability Zone for the subnet.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the Availability Zone for the subnet.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the Availability Zone for the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
     * </p>
     * 
     * @param availableIpAddressCount
     *        The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
     */

    public void setAvailableIpAddressCount(Integer availableIpAddressCount) {
        this.availableIpAddressCount = availableIpAddressCount;
    }

    /**
     * <p>
     * The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
     * </p>
     * 
     * @return The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
     */

    public Integer getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }

    /**
     * <p>
     * The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
     * </p>
     * 
     * @param availableIpAddressCount
     *        The number of available IPV4 addresses in the subnet. Does not include addresses for stopped instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withAvailableIpAddressCount(Integer availableIpAddressCount) {
        setAvailableIpAddressCount(availableIpAddressCount);
        return this;
    }

    /**
     * <p>
     * The IPV4 CIDR block that is assigned to the subnet.
     * </p>
     * 
     * @param cidrBlock
     *        The IPV4 CIDR block that is assigned to the subnet.
     */

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    /**
     * <p>
     * The IPV4 CIDR block that is assigned to the subnet.
     * </p>
     * 
     * @return The IPV4 CIDR block that is assigned to the subnet.
     */

    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * <p>
     * The IPV4 CIDR block that is assigned to the subnet.
     * </p>
     * 
     * @param cidrBlock
     *        The IPV4 CIDR block that is assigned to the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withCidrBlock(String cidrBlock) {
        setCidrBlock(cidrBlock);
        return this;
    }

    /**
     * <p>
     * Whether this subnet is the default subnet for the Availability Zone.
     * </p>
     * 
     * @param defaultForAz
     *        Whether this subnet is the default subnet for the Availability Zone.
     */

    public void setDefaultForAz(Boolean defaultForAz) {
        this.defaultForAz = defaultForAz;
    }

    /**
     * <p>
     * Whether this subnet is the default subnet for the Availability Zone.
     * </p>
     * 
     * @return Whether this subnet is the default subnet for the Availability Zone.
     */

    public Boolean getDefaultForAz() {
        return this.defaultForAz;
    }

    /**
     * <p>
     * Whether this subnet is the default subnet for the Availability Zone.
     * </p>
     * 
     * @param defaultForAz
     *        Whether this subnet is the default subnet for the Availability Zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withDefaultForAz(Boolean defaultForAz) {
        setDefaultForAz(defaultForAz);
        return this;
    }

    /**
     * <p>
     * Whether this subnet is the default subnet for the Availability Zone.
     * </p>
     * 
     * @return Whether this subnet is the default subnet for the Availability Zone.
     */

    public Boolean isDefaultForAz() {
        return this.defaultForAz;
    }

    /**
     * <p>
     * Whether instances in this subnet receive a public IP address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Whether instances in this subnet receive a public IP address.
     */

    public void setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Whether instances in this subnet receive a public IP address.
     * </p>
     * 
     * @return Whether instances in this subnet receive a public IP address.
     */

    public Boolean getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * Whether instances in this subnet receive a public IP address.
     * </p>
     * 
     * @param mapPublicIpOnLaunch
     *        Whether instances in this subnet receive a public IP address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
        setMapPublicIpOnLaunch(mapPublicIpOnLaunch);
        return this;
    }

    /**
     * <p>
     * Whether instances in this subnet receive a public IP address.
     * </p>
     * 
     * @return Whether instances in this subnet receive a public IP address.
     */

    public Boolean isMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the subnet.
     * </p>
     * 
     * @param ownerId
     *        The identifier of the AWS account that owns the subnet.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the subnet.
     * </p>
     * 
     * @return The identifier of the AWS account that owns the subnet.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the subnet.
     * </p>
     * 
     * @param ownerId
     *        The identifier of the AWS account that owns the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @param state
     *        The current state of the subnet.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @return The current state of the subnet.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the subnet.
     * </p>
     * 
     * @param state
     *        The current state of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     * 
     * @param subnetArn
     *        The ARN of the subnet.
     */

    public void setSubnetArn(String subnetArn) {
        this.subnetArn = subnetArn;
    }

    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     * 
     * @return The ARN of the subnet.
     */

    public String getSubnetArn() {
        return this.subnetArn;
    }

    /**
     * <p>
     * The ARN of the subnet.
     * </p>
     * 
     * @param subnetArn
     *        The ARN of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withSubnetArn(String subnetArn) {
        setSubnetArn(subnetArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet.
     * </p>
     * 
     * @return The identifier of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The identifier of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The identifier of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC that contains the subnet.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that contains the subnet.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that contains the subnet.
     * </p>
     * 
     * @return The identifier of the VPC that contains the subnet.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC that contains the subnet.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC that contains the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The IPV6 CIDR blocks that are associated with the subnet.
     * </p>
     * 
     * @return The IPV6 CIDR blocks that are associated with the subnet.
     */

    public java.util.List<Ipv6CidrBlockAssociation> getIpv6CidrBlockAssociationSet() {
        return ipv6CidrBlockAssociationSet;
    }

    /**
     * <p>
     * The IPV6 CIDR blocks that are associated with the subnet.
     * </p>
     * 
     * @param ipv6CidrBlockAssociationSet
     *        The IPV6 CIDR blocks that are associated with the subnet.
     */

    public void setIpv6CidrBlockAssociationSet(java.util.Collection<Ipv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        if (ipv6CidrBlockAssociationSet == null) {
            this.ipv6CidrBlockAssociationSet = null;
            return;
        }

        this.ipv6CidrBlockAssociationSet = new java.util.ArrayList<Ipv6CidrBlockAssociation>(ipv6CidrBlockAssociationSet);
    }

    /**
     * <p>
     * The IPV6 CIDR blocks that are associated with the subnet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv6CidrBlockAssociationSet(java.util.Collection)} or
     * {@link #withIpv6CidrBlockAssociationSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param ipv6CidrBlockAssociationSet
     *        The IPV6 CIDR blocks that are associated with the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withIpv6CidrBlockAssociationSet(Ipv6CidrBlockAssociation... ipv6CidrBlockAssociationSet) {
        if (this.ipv6CidrBlockAssociationSet == null) {
            setIpv6CidrBlockAssociationSet(new java.util.ArrayList<Ipv6CidrBlockAssociation>(ipv6CidrBlockAssociationSet.length));
        }
        for (Ipv6CidrBlockAssociation ele : ipv6CidrBlockAssociationSet) {
            this.ipv6CidrBlockAssociationSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPV6 CIDR blocks that are associated with the subnet.
     * </p>
     * 
     * @param ipv6CidrBlockAssociationSet
     *        The IPV6 CIDR blocks that are associated with the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2SubnetDetails withIpv6CidrBlockAssociationSet(java.util.Collection<Ipv6CidrBlockAssociation> ipv6CidrBlockAssociationSet) {
        setIpv6CidrBlockAssociationSet(ipv6CidrBlockAssociationSet);
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
        if (getAssignIpv6AddressOnCreation() != null)
            sb.append("AssignIpv6AddressOnCreation: ").append(getAssignIpv6AddressOnCreation()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getAvailableIpAddressCount() != null)
            sb.append("AvailableIpAddressCount: ").append(getAvailableIpAddressCount()).append(",");
        if (getCidrBlock() != null)
            sb.append("CidrBlock: ").append(getCidrBlock()).append(",");
        if (getDefaultForAz() != null)
            sb.append("DefaultForAz: ").append(getDefaultForAz()).append(",");
        if (getMapPublicIpOnLaunch() != null)
            sb.append("MapPublicIpOnLaunch: ").append(getMapPublicIpOnLaunch()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSubnetArn() != null)
            sb.append("SubnetArn: ").append(getSubnetArn()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getIpv6CidrBlockAssociationSet() != null)
            sb.append("Ipv6CidrBlockAssociationSet: ").append(getIpv6CidrBlockAssociationSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2SubnetDetails == false)
            return false;
        AwsEc2SubnetDetails other = (AwsEc2SubnetDetails) obj;
        if (other.getAssignIpv6AddressOnCreation() == null ^ this.getAssignIpv6AddressOnCreation() == null)
            return false;
        if (other.getAssignIpv6AddressOnCreation() != null && other.getAssignIpv6AddressOnCreation().equals(this.getAssignIpv6AddressOnCreation()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getAvailableIpAddressCount() == null ^ this.getAvailableIpAddressCount() == null)
            return false;
        if (other.getAvailableIpAddressCount() != null && other.getAvailableIpAddressCount().equals(this.getAvailableIpAddressCount()) == false)
            return false;
        if (other.getCidrBlock() == null ^ this.getCidrBlock() == null)
            return false;
        if (other.getCidrBlock() != null && other.getCidrBlock().equals(this.getCidrBlock()) == false)
            return false;
        if (other.getDefaultForAz() == null ^ this.getDefaultForAz() == null)
            return false;
        if (other.getDefaultForAz() != null && other.getDefaultForAz().equals(this.getDefaultForAz()) == false)
            return false;
        if (other.getMapPublicIpOnLaunch() == null ^ this.getMapPublicIpOnLaunch() == null)
            return false;
        if (other.getMapPublicIpOnLaunch() != null && other.getMapPublicIpOnLaunch().equals(this.getMapPublicIpOnLaunch()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSubnetArn() == null ^ this.getSubnetArn() == null)
            return false;
        if (other.getSubnetArn() != null && other.getSubnetArn().equals(this.getSubnetArn()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() == null ^ this.getIpv6CidrBlockAssociationSet() == null)
            return false;
        if (other.getIpv6CidrBlockAssociationSet() != null && other.getIpv6CidrBlockAssociationSet().equals(this.getIpv6CidrBlockAssociationSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssignIpv6AddressOnCreation() == null) ? 0 : getAssignIpv6AddressOnCreation().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getAvailableIpAddressCount() == null) ? 0 : getAvailableIpAddressCount().hashCode());
        hashCode = prime * hashCode + ((getCidrBlock() == null) ? 0 : getCidrBlock().hashCode());
        hashCode = prime * hashCode + ((getDefaultForAz() == null) ? 0 : getDefaultForAz().hashCode());
        hashCode = prime * hashCode + ((getMapPublicIpOnLaunch() == null) ? 0 : getMapPublicIpOnLaunch().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSubnetArn() == null) ? 0 : getSubnetArn().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getIpv6CidrBlockAssociationSet() == null) ? 0 : getIpv6CidrBlockAssociationSet().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2SubnetDetails clone() {
        try {
            return (AwsEc2SubnetDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2SubnetDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
