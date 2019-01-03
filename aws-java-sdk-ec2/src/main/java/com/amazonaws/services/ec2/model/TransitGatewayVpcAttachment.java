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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a VPC attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayVpcAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayVpcAttachment implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     */
    private String vpcOwnerId;
    /**
     * <p>
     * The state of the VPC attachment.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> subnetIds;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The VPC attachment options.
     * </p>
     */
    private TransitGatewayVpcAttachmentOptions options;
    /**
     * <p>
     * The tags for the VPC attachment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @return The ID of the attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @return The ID of the transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     * 
     * @param vpcOwnerId
     *        The ID of the AWS account that owns the VPC.
     */

    public void setVpcOwnerId(String vpcOwnerId) {
        this.vpcOwnerId = vpcOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     * 
     * @return The ID of the AWS account that owns the VPC.
     */

    public String getVpcOwnerId() {
        return this.vpcOwnerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the VPC.
     * </p>
     * 
     * @param vpcOwnerId
     *        The ID of the AWS account that owns the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withVpcOwnerId(String vpcOwnerId) {
        setVpcOwnerId(vpcOwnerId);
        return this;
    }

    /**
     * <p>
     * The state of the VPC attachment.
     * </p>
     * 
     * @param state
     *        The state of the VPC attachment.
     * @see TransitGatewayAttachmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the VPC attachment.
     * </p>
     * 
     * @return The state of the VPC attachment.
     * @see TransitGatewayAttachmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the VPC attachment.
     * </p>
     * 
     * @param state
     *        The state of the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentState
     */

    public TransitGatewayVpcAttachment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the VPC attachment.
     * </p>
     * 
     * @param state
     *        The state of the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentState
     */

    public TransitGatewayVpcAttachment withState(TransitGatewayAttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * 
     * @return The IDs of the subnets.
     */

    public java.util.List<String> getSubnetIds() {
        if (subnetIds == null) {
            subnetIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return subnetIds;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new com.amazonaws.internal.SdkInternalList<String>(subnetIds);
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new com.amazonaws.internal.SdkInternalList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the subnets.
     * </p>
     * 
     * @param subnetIds
     *        The IDs of the subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The VPC attachment options.
     * </p>
     * 
     * @param options
     *        The VPC attachment options.
     */

    public void setOptions(TransitGatewayVpcAttachmentOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The VPC attachment options.
     * </p>
     * 
     * @return The VPC attachment options.
     */

    public TransitGatewayVpcAttachmentOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The VPC attachment options.
     * </p>
     * 
     * @param options
     *        The VPC attachment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withOptions(TransitGatewayVpcAttachmentOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The tags for the VPC attachment.
     * </p>
     * 
     * @return The tags for the VPC attachment.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the VPC attachment.
     * </p>
     * 
     * @param tags
     *        The tags for the VPC attachment.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for the VPC attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags for the VPC attachment.
     * </p>
     * 
     * @param tags
     *        The tags for the VPC attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayVpcAttachment withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getVpcOwnerId() != null)
            sb.append("VpcOwnerId: ").append(getVpcOwnerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayVpcAttachment == false)
            return false;
        TransitGatewayVpcAttachment other = (TransitGatewayVpcAttachment) obj;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getVpcOwnerId() == null ^ this.getVpcOwnerId() == null)
            return false;
        if (other.getVpcOwnerId() != null && other.getVpcOwnerId().equals(this.getVpcOwnerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getVpcOwnerId() == null) ? 0 : getVpcOwnerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayVpcAttachment clone() {
        try {
            return (TransitGatewayVpcAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
