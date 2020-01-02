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
 * Describes the transit gateway peering attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPeeringAttachment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPeeringAttachment implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     */
    private PeeringTgwInfo requesterTgwInfo;
    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     */
    private PeeringTgwInfo accepterTgwInfo;
    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     */
    private PeeringAttachmentStatus status;
    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway peering attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @return The ID of the transit gateway peering attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the transit gateway peering attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeeringAttachment withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     * 
     * @param requesterTgwInfo
     *        Information about the requester transit gateway.
     */

    public void setRequesterTgwInfo(PeeringTgwInfo requesterTgwInfo) {
        this.requesterTgwInfo = requesterTgwInfo;
    }

    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     * 
     * @return Information about the requester transit gateway.
     */

    public PeeringTgwInfo getRequesterTgwInfo() {
        return this.requesterTgwInfo;
    }

    /**
     * <p>
     * Information about the requester transit gateway.
     * </p>
     * 
     * @param requesterTgwInfo
     *        Information about the requester transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeeringAttachment withRequesterTgwInfo(PeeringTgwInfo requesterTgwInfo) {
        setRequesterTgwInfo(requesterTgwInfo);
        return this;
    }

    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     * 
     * @param accepterTgwInfo
     *        Information about the accepter transit gateway.
     */

    public void setAccepterTgwInfo(PeeringTgwInfo accepterTgwInfo) {
        this.accepterTgwInfo = accepterTgwInfo;
    }

    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     * 
     * @return Information about the accepter transit gateway.
     */

    public PeeringTgwInfo getAccepterTgwInfo() {
        return this.accepterTgwInfo;
    }

    /**
     * <p>
     * Information about the accepter transit gateway.
     * </p>
     * 
     * @param accepterTgwInfo
     *        Information about the accepter transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeeringAttachment withAccepterTgwInfo(PeeringTgwInfo accepterTgwInfo) {
        setAccepterTgwInfo(accepterTgwInfo);
        return this;
    }

    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     * 
     * @param status
     *        The status of the transit gateway peering attachment.
     */

    public void setStatus(PeeringAttachmentStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     * 
     * @return The status of the transit gateway peering attachment.
     */

    public PeeringAttachmentStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the transit gateway peering attachment.
     * </p>
     * 
     * @param status
     *        The status of the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeeringAttachment withStatus(PeeringAttachmentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway peering attachment.
     * @see TransitGatewayAttachmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * 
     * @return The state of the transit gateway peering attachment.
     * @see TransitGatewayAttachmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentState
     */

    public TransitGatewayPeeringAttachment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway peering attachment.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentState
     */

    public TransitGatewayPeeringAttachment withState(TransitGatewayAttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     * 
     * @param creationTime
     *        The time the transit gateway peering attachment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     * 
     * @return The time the transit gateway peering attachment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the transit gateway peering attachment was created.
     * </p>
     * 
     * @param creationTime
     *        The time the transit gateway peering attachment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeeringAttachment withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     * 
     * @return The tags for the transit gateway peering attachment.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the transit gateway peering attachment.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway peering attachment.
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
     * The tags for the transit gateway peering attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeeringAttachment withTags(Tag... tags) {
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
     * The tags for the transit gateway peering attachment.
     * </p>
     * 
     * @param tags
     *        The tags for the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayPeeringAttachment withTags(java.util.Collection<Tag> tags) {
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
        if (getRequesterTgwInfo() != null)
            sb.append("RequesterTgwInfo: ").append(getRequesterTgwInfo()).append(",");
        if (getAccepterTgwInfo() != null)
            sb.append("AccepterTgwInfo: ").append(getAccepterTgwInfo()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof TransitGatewayPeeringAttachment == false)
            return false;
        TransitGatewayPeeringAttachment other = (TransitGatewayPeeringAttachment) obj;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getRequesterTgwInfo() == null ^ this.getRequesterTgwInfo() == null)
            return false;
        if (other.getRequesterTgwInfo() != null && other.getRequesterTgwInfo().equals(this.getRequesterTgwInfo()) == false)
            return false;
        if (other.getAccepterTgwInfo() == null ^ this.getAccepterTgwInfo() == null)
            return false;
        if (other.getAccepterTgwInfo() != null && other.getAccepterTgwInfo().equals(this.getAccepterTgwInfo()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        hashCode = prime * hashCode + ((getRequesterTgwInfo() == null) ? 0 : getRequesterTgwInfo().hashCode());
        hashCode = prime * hashCode + ((getAccepterTgwInfo() == null) ? 0 : getAccepterTgwInfo().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPeeringAttachment clone() {
        try {
            return (TransitGatewayPeeringAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
