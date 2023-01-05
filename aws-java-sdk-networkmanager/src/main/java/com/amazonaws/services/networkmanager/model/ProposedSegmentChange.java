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
 * Describes a proposed segment change. In some cases, the segment change must first be evaluated and accepted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ProposedSegmentChange"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProposedSegmentChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of key-value tags that changed for the segment.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The rule number in the policy document that applies to this change.
     * </p>
     */
    private Integer attachmentPolicyRuleNumber;
    /**
     * <p>
     * The name of the segment to change.
     * </p>
     */
    private String segmentName;

    /**
     * <p>
     * The list of key-value tags that changed for the segment.
     * </p>
     * 
     * @return The list of key-value tags that changed for the segment.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value tags that changed for the segment.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags that changed for the segment.
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
     * The list of key-value tags that changed for the segment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags that changed for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposedSegmentChange withTags(Tag... tags) {
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
     * The list of key-value tags that changed for the segment.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags that changed for the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposedSegmentChange withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The rule number in the policy document that applies to this change.
     * </p>
     * 
     * @param attachmentPolicyRuleNumber
     *        The rule number in the policy document that applies to this change.
     */

    public void setAttachmentPolicyRuleNumber(Integer attachmentPolicyRuleNumber) {
        this.attachmentPolicyRuleNumber = attachmentPolicyRuleNumber;
    }

    /**
     * <p>
     * The rule number in the policy document that applies to this change.
     * </p>
     * 
     * @return The rule number in the policy document that applies to this change.
     */

    public Integer getAttachmentPolicyRuleNumber() {
        return this.attachmentPolicyRuleNumber;
    }

    /**
     * <p>
     * The rule number in the policy document that applies to this change.
     * </p>
     * 
     * @param attachmentPolicyRuleNumber
     *        The rule number in the policy document that applies to this change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposedSegmentChange withAttachmentPolicyRuleNumber(Integer attachmentPolicyRuleNumber) {
        setAttachmentPolicyRuleNumber(attachmentPolicyRuleNumber);
        return this;
    }

    /**
     * <p>
     * The name of the segment to change.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment to change.
     */

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    /**
     * <p>
     * The name of the segment to change.
     * </p>
     * 
     * @return The name of the segment to change.
     */

    public String getSegmentName() {
        return this.segmentName;
    }

    /**
     * <p>
     * The name of the segment to change.
     * </p>
     * 
     * @param segmentName
     *        The name of the segment to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProposedSegmentChange withSegmentName(String segmentName) {
        setSegmentName(segmentName);
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
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getAttachmentPolicyRuleNumber() != null)
            sb.append("AttachmentPolicyRuleNumber: ").append(getAttachmentPolicyRuleNumber()).append(",");
        if (getSegmentName() != null)
            sb.append("SegmentName: ").append(getSegmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProposedSegmentChange == false)
            return false;
        ProposedSegmentChange other = (ProposedSegmentChange) obj;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAttachmentPolicyRuleNumber() == null ^ this.getAttachmentPolicyRuleNumber() == null)
            return false;
        if (other.getAttachmentPolicyRuleNumber() != null && other.getAttachmentPolicyRuleNumber().equals(this.getAttachmentPolicyRuleNumber()) == false)
            return false;
        if (other.getSegmentName() == null ^ this.getSegmentName() == null)
            return false;
        if (other.getSegmentName() != null && other.getSegmentName().equals(this.getSegmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getAttachmentPolicyRuleNumber() == null) ? 0 : getAttachmentPolicyRuleNumber().hashCode());
        hashCode = prime * hashCode + ((getSegmentName() == null) ? 0 : getSegmentName().hashCode());
        return hashCode;
    }

    @Override
    public ProposedSegmentChange clone() {
        try {
            return (ProposedSegmentChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ProposedSegmentChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
