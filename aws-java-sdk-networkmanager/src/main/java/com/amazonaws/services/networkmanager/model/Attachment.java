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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a core network attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Attachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a core network.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ARN of a core network.
     * </p>
     */
    private String coreNetworkArn;
    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String attachmentId;
    /**
     * <p>
     * The ID of the attachment account owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The type of attachment.
     * </p>
     */
    private String attachmentType;
    /**
     * <p>
     * The state of the attachment.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The attachment resource ARN.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The policy rule number associated with the attachment.
     * </p>
     */
    private Integer attachmentPolicyRuleNumber;
    /**
     * <p>
     * The name of the segment attachment.
     * </p>
     */
    private String segmentName;
    /**
     * <p>
     * The tags associated with the attachment.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The attachment to move from one segment to another.
     * </p>
     */
    private ProposedSegmentChange proposedSegmentChange;
    /**
     * <p>
     * The timestamp when the attachment was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp when the attachment was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @return The ID of a core network.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of a core network.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @param coreNetworkArn
     *        The ARN of a core network.
     */

    public void setCoreNetworkArn(String coreNetworkArn) {
        this.coreNetworkArn = coreNetworkArn;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @return The ARN of a core network.
     */

    public String getCoreNetworkArn() {
        return this.coreNetworkArn;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @param coreNetworkArn
     *        The ARN of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withCoreNetworkArn(String coreNetworkArn) {
        setCoreNetworkArn(coreNetworkArn);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @return The ID of the attachment.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment account owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the attachment account owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The ID of the attachment account owner.
     * </p>
     * 
     * @return The ID of the attachment account owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The ID of the attachment account owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the attachment account owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment.
     * @see AttachmentType
     */

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @return The type of attachment.
     * @see AttachmentType
     */

    public String getAttachmentType() {
        return this.attachmentType;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentType
     */

    public Attachment withAttachmentType(String attachmentType) {
        setAttachmentType(attachmentType);
        return this;
    }

    /**
     * <p>
     * The type of attachment.
     * </p>
     * 
     * @param attachmentType
     *        The type of attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentType
     */

    public Attachment withAttachmentType(AttachmentType attachmentType) {
        this.attachmentType = attachmentType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @see AttachmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @return The state of the attachment.
     * @see AttachmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentState
     */

    public Attachment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AttachmentState
     */

    public Attachment withState(AttachmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the edge is located.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @return The Region where the edge is located.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The Region where the edge is located.
     * </p>
     * 
     * @param edgeLocation
     *        The Region where the edge is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The attachment resource ARN.
     * </p>
     * 
     * @param resourceArn
     *        The attachment resource ARN.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The attachment resource ARN.
     * </p>
     * 
     * @return The attachment resource ARN.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The attachment resource ARN.
     * </p>
     * 
     * @param resourceArn
     *        The attachment resource ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The policy rule number associated with the attachment.
     * </p>
     * 
     * @param attachmentPolicyRuleNumber
     *        The policy rule number associated with the attachment.
     */

    public void setAttachmentPolicyRuleNumber(Integer attachmentPolicyRuleNumber) {
        this.attachmentPolicyRuleNumber = attachmentPolicyRuleNumber;
    }

    /**
     * <p>
     * The policy rule number associated with the attachment.
     * </p>
     * 
     * @return The policy rule number associated with the attachment.
     */

    public Integer getAttachmentPolicyRuleNumber() {
        return this.attachmentPolicyRuleNumber;
    }

    /**
     * <p>
     * The policy rule number associated with the attachment.
     * </p>
     * 
     * @param attachmentPolicyRuleNumber
     *        The policy rule number associated with the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withAttachmentPolicyRuleNumber(Integer attachmentPolicyRuleNumber) {
        setAttachmentPolicyRuleNumber(attachmentPolicyRuleNumber);
        return this;
    }

    /**
     * <p>
     * The name of the segment attachment.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment attachment.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The name of the segment attachment.
     * </p>
     * 
     * @return The name of the segment attachment.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The name of the segment attachment.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withSegmentName(String segmentName) {
        setSegmentName(segmentName);
        return this;
    }

    /**
     * <p>
     * The tags associated with the attachment.
     * </p>
     * 
     * @return The tags associated with the attachment.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags associated with the attachment.
     * </p>
     * 
     * @param tags
     *        The tags associated with the attachment.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags associated with the attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags associated with the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags associated with the attachment.
     * </p>
     * 
     * @param tags
     *        The tags associated with the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The attachment to move from one segment to another.
     * </p>
     * 
     * @param proposedSegmentChange
     *        The attachment to move from one segment to another.
     */

    public void setProposedSegmentChange(ProposedSegmentChange proposedSegmentChange) {
        this.proposedSegmentChange = proposedSegmentChange;
    }

    /**
     * <p>
     * The attachment to move from one segment to another.
     * </p>
     * 
     * @return The attachment to move from one segment to another.
     */

    public ProposedSegmentChange getProposedSegmentChange() {
        return this.proposedSegmentChange;
    }

    /**
     * <p>
     * The attachment to move from one segment to another.
     * </p>
     * 
     * @param proposedSegmentChange
     *        The attachment to move from one segment to another.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withProposedSegmentChange(ProposedSegmentChange proposedSegmentChange) {
        setProposedSegmentChange(proposedSegmentChange);
        return this;
    }

    /**
     * <p>
     * The timestamp when the attachment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the attachment was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the attachment was created.
     * </p>
     * 
     * @return The timestamp when the attachment was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the attachment was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the attachment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp when the attachment was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the attachment was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp when the attachment was last updated.
     * </p>
     * 
     * @return The timestamp when the attachment was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp when the attachment was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp when the attachment was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getCoreNetworkArn() != null)
            sb.append("CoreNetworkArn: ").append(getCoreNetworkArn()).append(",");
        if (getAttachmentId() != null)
            sb.append("AttachmentId: ").append(getAttachmentId()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getAttachmentType() != null)
            sb.append("AttachmentType: ").append(getAttachmentType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getAttachmentPolicyRuleNumber() != null)
            sb.append("AttachmentPolicyRuleNumber: ").append(getAttachmentPolicyRuleNumber()).append(",");
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getProposedSegmentChange() != null)
            sb.append("ProposedSegmentChange: ").append(getProposedSegmentChange()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attachment == false)
            return false;
        Attachment other = (Attachment) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getCoreNetworkArn() == null ^ this.getCoreNetworkArn() == null)
            return false;
        if (other.getCoreNetworkArn() != null && other.getCoreNetworkArn().equals(this.getCoreNetworkArn()) == false)
            return false;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getAttachmentType() == null ^ this.getAttachmentType() == null)
            return false;
        if (other.getAttachmentType() != null && other.getAttachmentType().equals(this.getAttachmentType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getAttachmentPolicyRuleNumber() == null ^ this.getAttachmentPolicyRuleNumber() == null)
            return false;
        if (other.getAttachmentPolicyRuleNumber() != null && other.getAttachmentPolicyRuleNumber().equals(this.getAttachmentPolicyRuleNumber()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getProposedSegmentChange() == null ^ this.getProposedSegmentChange() == null)
            return false;
        if (other.getProposedSegmentChange() != null && other.getProposedSegmentChange().equals(this.getProposedSegmentChange()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkArn() == null) ? 0 : getCoreNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getAttachmentType() == null) ? 0 : getAttachmentType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getAttachmentPolicyRuleNumber() == null) ? 0 : getAttachmentPolicyRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getProposedSegmentChange() == null) ? 0 : getProposedSegmentChange().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Attachment clone() {
        try {
            return (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.AttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
