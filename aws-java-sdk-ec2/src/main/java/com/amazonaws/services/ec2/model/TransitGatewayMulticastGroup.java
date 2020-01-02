/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes the transit gateway multicast group resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayMulticastGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayMulticastGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     */
    private String groupIpAddress;
    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The ID of the subnet.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The ID of the resource.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     */
    private String networkInterfaceId;
    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     */
    private Boolean groupMember;
    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     */
    private Boolean groupSource;
    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     */
    private String memberType;
    /**
     * <p>
     * The source type.
     * </p>
     */
    private String sourceType;

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * 
     * @param groupIpAddress
     *        The IP address assigned to the transit gateway multicast group.
     */

    public void setGroupIpAddress(String groupIpAddress) {
        this.groupIpAddress = groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * 
     * @return The IP address assigned to the transit gateway multicast group.
     */

    public String getGroupIpAddress() {
        return this.groupIpAddress;
    }

    /**
     * <p>
     * The IP address assigned to the transit gateway multicast group.
     * </p>
     * 
     * @param groupIpAddress
     *        The IP address assigned to the transit gateway multicast group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastGroup withGroupIpAddress(String groupIpAddress) {
        setGroupIpAddress(groupIpAddress);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @return The ID of the transit gateway attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastGroup withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @return The ID of the subnet.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The ID of the subnet.
     * </p>
     * 
     * @param subnetId
     *        The ID of the subnet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastGroup withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @return The ID of the resource.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource.
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastGroup withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * 
     * @param resourceType
     *        The type of resource, for example a VPC attachment.
     * @see TransitGatewayAttachmentResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * 
     * @return The type of resource, for example a VPC attachment.
     * @see TransitGatewayAttachmentResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * 
     * @param resourceType
     *        The type of resource, for example a VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentResourceType
     */

    public TransitGatewayMulticastGroup withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource, for example a VPC attachment.
     * </p>
     * 
     * @param resourceType
     *        The type of resource, for example a VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentResourceType
     */

    public TransitGatewayMulticastGroup withResourceType(TransitGatewayAttachmentResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the transit gateway attachment.
     */

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @return The ID of the transit gateway attachment.
     */

    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the transit gateway attachment.
     * </p>
     * 
     * @param networkInterfaceId
     *        The ID of the transit gateway attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastGroup withNetworkInterfaceId(String networkInterfaceId) {
        setNetworkInterfaceId(networkInterfaceId);
        return this;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @param groupMember
     *        Indicates that the resource is a transit gateway multicast group member.
     */

    public void setGroupMember(Boolean groupMember) {
        this.groupMember = groupMember;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @return Indicates that the resource is a transit gateway multicast group member.
     */

    public Boolean getGroupMember() {
        return this.groupMember;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @param groupMember
     *        Indicates that the resource is a transit gateway multicast group member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastGroup withGroupMember(Boolean groupMember) {
        setGroupMember(groupMember);
        return this;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @return Indicates that the resource is a transit gateway multicast group member.
     */

    public Boolean isGroupMember() {
        return this.groupMember;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @param groupSource
     *        Indicates that the resource is a transit gateway multicast group member.
     */

    public void setGroupSource(Boolean groupSource) {
        this.groupSource = groupSource;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @return Indicates that the resource is a transit gateway multicast group member.
     */

    public Boolean getGroupSource() {
        return this.groupSource;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @param groupSource
     *        Indicates that the resource is a transit gateway multicast group member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayMulticastGroup withGroupSource(Boolean groupSource) {
        setGroupSource(groupSource);
        return this;
    }

    /**
     * <p>
     * Indicates that the resource is a transit gateway multicast group member.
     * </p>
     * 
     * @return Indicates that the resource is a transit gateway multicast group member.
     */

    public Boolean isGroupSource() {
        return this.groupSource;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * 
     * @param memberType
     *        The member type (for example, <code>static</code>).
     * @see MembershipType
     */

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * 
     * @return The member type (for example, <code>static</code>).
     * @see MembershipType
     */

    public String getMemberType() {
        return this.memberType;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * 
     * @param memberType
     *        The member type (for example, <code>static</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public TransitGatewayMulticastGroup withMemberType(String memberType) {
        setMemberType(memberType);
        return this;
    }

    /**
     * <p>
     * The member type (for example, <code>static</code>).
     * </p>
     * 
     * @param memberType
     *        The member type (for example, <code>static</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public TransitGatewayMulticastGroup withMemberType(MembershipType memberType) {
        this.memberType = memberType.toString();
        return this;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @param sourceType
     *        The source type.
     * @see MembershipType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @return The source type.
     * @see MembershipType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @param sourceType
     *        The source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public TransitGatewayMulticastGroup withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The source type.
     * </p>
     * 
     * @param sourceType
     *        The source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MembershipType
     */

    public TransitGatewayMulticastGroup withSourceType(MembershipType sourceType) {
        this.sourceType = sourceType.toString();
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
        if (getGroupIpAddress() != null)
            sb.append("GroupIpAddress: ").append(getGroupIpAddress()).append(",");
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: ").append(getNetworkInterfaceId()).append(",");
        if (getGroupMember() != null)
            sb.append("GroupMember: ").append(getGroupMember()).append(",");
        if (getGroupSource() != null)
            sb.append("GroupSource: ").append(getGroupSource()).append(",");
        if (getMemberType() != null)
            sb.append("MemberType: ").append(getMemberType()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayMulticastGroup == false)
            return false;
        TransitGatewayMulticastGroup other = (TransitGatewayMulticastGroup) obj;
        if (other.getGroupIpAddress() == null ^ this.getGroupIpAddress() == null)
            return false;
        if (other.getGroupIpAddress() != null && other.getGroupIpAddress().equals(this.getGroupIpAddress()) == false)
            return false;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getGroupMember() == null ^ this.getGroupMember() == null)
            return false;
        if (other.getGroupMember() != null && other.getGroupMember().equals(this.getGroupMember()) == false)
            return false;
        if (other.getGroupSource() == null ^ this.getGroupSource() == null)
            return false;
        if (other.getGroupSource() != null && other.getGroupSource().equals(this.getGroupSource()) == false)
            return false;
        if (other.getMemberType() == null ^ this.getMemberType() == null)
            return false;
        if (other.getMemberType() != null && other.getMemberType().equals(this.getMemberType()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupIpAddress() == null) ? 0 : getGroupIpAddress().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getGroupMember() == null) ? 0 : getGroupMember().hashCode());
        hashCode = prime * hashCode + ((getGroupSource() == null) ? 0 : getGroupSource().hashCode());
        hashCode = prime * hashCode + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayMulticastGroup clone() {
        try {
            return (TransitGatewayMulticastGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
