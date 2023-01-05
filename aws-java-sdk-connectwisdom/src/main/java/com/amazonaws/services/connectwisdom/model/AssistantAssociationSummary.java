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
package com.amazonaws.services.connectwisdom.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about the assistant association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wisdom-2020-10-19/AssistantAssociationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssistantAssociationSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     */
    private String assistantArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assistant association.
     * </p>
     */
    private String assistantAssociationArn;
    /**
     * <p>
     * The identifier of the assistant association.
     * </p>
     */
    private String assistantAssociationId;
    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     */
    private String assistantId;
    /**
     * <p>
     * The association data.
     * </p>
     */
    private AssistantAssociationOutputData associationData;
    /**
     * <p>
     * The type of association.
     * </p>
     */
    private String associationType;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public void setAssistantArn(String assistantArn) {
        this.assistantArn = assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Wisdom assistant.
     */

    public String getAssistantArn() {
        return this.assistantArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Wisdom assistant.
     * </p>
     * 
     * @param assistantArn
     *        The Amazon Resource Name (ARN) of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary withAssistantArn(String assistantArn) {
        setAssistantArn(assistantArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assistant association.
     * </p>
     * 
     * @param assistantAssociationArn
     *        The Amazon Resource Name (ARN) of the assistant association.
     */

    public void setAssistantAssociationArn(String assistantAssociationArn) {
        this.assistantAssociationArn = assistantAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assistant association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the assistant association.
     */

    public String getAssistantAssociationArn() {
        return this.assistantAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the assistant association.
     * </p>
     * 
     * @param assistantAssociationArn
     *        The Amazon Resource Name (ARN) of the assistant association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary withAssistantAssociationArn(String assistantAssociationArn) {
        setAssistantAssociationArn(assistantAssociationArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the assistant association.
     * </p>
     * 
     * @param assistantAssociationId
     *        The identifier of the assistant association.
     */

    public void setAssistantAssociationId(String assistantAssociationId) {
        this.assistantAssociationId = assistantAssociationId;
    }

    /**
     * <p>
     * The identifier of the assistant association.
     * </p>
     * 
     * @return The identifier of the assistant association.
     */

    public String getAssistantAssociationId() {
        return this.assistantAssociationId;
    }

    /**
     * <p>
     * The identifier of the assistant association.
     * </p>
     * 
     * @param assistantAssociationId
     *        The identifier of the assistant association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary withAssistantAssociationId(String assistantAssociationId) {
        setAssistantAssociationId(assistantAssociationId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     */

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @return The identifier of the Wisdom assistant.
     */

    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * <p>
     * The identifier of the Wisdom assistant.
     * </p>
     * 
     * @param assistantId
     *        The identifier of the Wisdom assistant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary withAssistantId(String assistantId) {
        setAssistantId(assistantId);
        return this;
    }

    /**
     * <p>
     * The association data.
     * </p>
     * 
     * @param associationData
     *        The association data.
     */

    public void setAssociationData(AssistantAssociationOutputData associationData) {
        this.associationData = associationData;
    }

    /**
     * <p>
     * The association data.
     * </p>
     * 
     * @return The association data.
     */

    public AssistantAssociationOutputData getAssociationData() {
        return this.associationData;
    }

    /**
     * <p>
     * The association data.
     * </p>
     * 
     * @param associationData
     *        The association data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary withAssociationData(AssistantAssociationOutputData associationData) {
        setAssociationData(associationData);
        return this;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @param associationType
     *        The type of association.
     * @see AssociationType
     */

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @return The type of association.
     * @see AssociationType
     */

    public String getAssociationType() {
        return this.associationType;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @param associationType
     *        The type of association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public AssistantAssociationSummary withAssociationType(String associationType) {
        setAssociationType(associationType);
        return this;
    }

    /**
     * <p>
     * The type of association.
     * </p>
     * 
     * @param associationType
     *        The type of association.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssociationType
     */

    public AssistantAssociationSummary withAssociationType(AssociationType associationType) {
        this.associationType = associationType.toString();
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see AssistantAssociationSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssistantAssociationSummary clearTagsEntries() {
        this.tags = null;
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
        if (getAssistantArn() != null)
            sb.append("AssistantArn: ").append(getAssistantArn()).append(",");
        if (getAssistantAssociationArn() != null)
            sb.append("AssistantAssociationArn: ").append(getAssistantAssociationArn()).append(",");
        if (getAssistantAssociationId() != null)
            sb.append("AssistantAssociationId: ").append(getAssistantAssociationId()).append(",");
        if (getAssistantId() != null)
            sb.append("AssistantId: ").append(getAssistantId()).append(",");
        if (getAssociationData() != null)
            sb.append("AssociationData: ").append(getAssociationData()).append(",");
        if (getAssociationType() != null)
            sb.append("AssociationType: ").append(getAssociationType()).append(",");
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

        if (obj instanceof AssistantAssociationSummary == false)
            return false;
        AssistantAssociationSummary other = (AssistantAssociationSummary) obj;
        if (other.getAssistantArn() == null ^ this.getAssistantArn() == null)
            return false;
        if (other.getAssistantArn() != null && other.getAssistantArn().equals(this.getAssistantArn()) == false)
            return false;
        if (other.getAssistantAssociationArn() == null ^ this.getAssistantAssociationArn() == null)
            return false;
        if (other.getAssistantAssociationArn() != null && other.getAssistantAssociationArn().equals(this.getAssistantAssociationArn()) == false)
            return false;
        if (other.getAssistantAssociationId() == null ^ this.getAssistantAssociationId() == null)
            return false;
        if (other.getAssistantAssociationId() != null && other.getAssistantAssociationId().equals(this.getAssistantAssociationId()) == false)
            return false;
        if (other.getAssistantId() == null ^ this.getAssistantId() == null)
            return false;
        if (other.getAssistantId() != null && other.getAssistantId().equals(this.getAssistantId()) == false)
            return false;
        if (other.getAssociationData() == null ^ this.getAssociationData() == null)
            return false;
        if (other.getAssociationData() != null && other.getAssociationData().equals(this.getAssociationData()) == false)
            return false;
        if (other.getAssociationType() == null ^ this.getAssociationType() == null)
            return false;
        if (other.getAssociationType() != null && other.getAssociationType().equals(this.getAssociationType()) == false)
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

        hashCode = prime * hashCode + ((getAssistantArn() == null) ? 0 : getAssistantArn().hashCode());
        hashCode = prime * hashCode + ((getAssistantAssociationArn() == null) ? 0 : getAssistantAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getAssistantAssociationId() == null) ? 0 : getAssistantAssociationId().hashCode());
        hashCode = prime * hashCode + ((getAssistantId() == null) ? 0 : getAssistantId().hashCode());
        hashCode = prime * hashCode + ((getAssociationData() == null) ? 0 : getAssociationData().hashCode());
        hashCode = prime * hashCode + ((getAssociationType() == null) ? 0 : getAssociationType().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AssistantAssociationSummary clone() {
        try {
            return (AssistantAssociationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectwisdom.model.transform.AssistantAssociationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
