/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.wellarchitected.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A review template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wellarchitected-2020-03-31/ReviewTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReviewTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The review template description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The lenses applied to the review template.
     * </p>
     */
    private java.util.List<String> lenses;

    private String notes;
    /**
     * <p>
     * A count of how many total questions are answered and unanswered in the review template.
     * </p>
     */
    private java.util.Map<String, Integer> questionCounts;

    private String owner;

    private java.util.Date updatedAt;
    /**
     * <p>
     * The review template ARN.
     * </p>
     */
    private String templateArn;
    /**
     * <p>
     * The name of the review template.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The latest status of a review template.
     * </p>
     */
    private String updateStatus;
    /**
     * <p>
     * The ID assigned to the template share invitation.
     * </p>
     */
    private String shareInvitationId;

    /**
     * <p>
     * The review template description.
     * </p>
     * 
     * @param description
     *        The review template description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The review template description.
     * </p>
     * 
     * @return The review template description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The review template description.
     * </p>
     * 
     * @param description
     *        The review template description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The lenses applied to the review template.
     * </p>
     * 
     * @return The lenses applied to the review template.
     */

    public java.util.List<String> getLenses() {
        return lenses;
    }

    /**
     * <p>
     * The lenses applied to the review template.
     * </p>
     * 
     * @param lenses
     *        The lenses applied to the review template.
     */

    public void setLenses(java.util.Collection<String> lenses) {
        if (lenses == null) {
            this.lenses = null;
            return;
        }

        this.lenses = new java.util.ArrayList<String>(lenses);
    }

    /**
     * <p>
     * The lenses applied to the review template.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLenses(java.util.Collection)} or {@link #withLenses(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lenses
     *        The lenses applied to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withLenses(String... lenses) {
        if (this.lenses == null) {
            setLenses(new java.util.ArrayList<String>(lenses.length));
        }
        for (String ele : lenses) {
            this.lenses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The lenses applied to the review template.
     * </p>
     * 
     * @param lenses
     *        The lenses applied to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withLenses(java.util.Collection<String> lenses) {
        setLenses(lenses);
        return this;
    }

    /**
     * @param notes
     */

    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * @return
     */

    public String getNotes() {
        return this.notes;
    }

    /**
     * @param notes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withNotes(String notes) {
        setNotes(notes);
        return this;
    }

    /**
     * <p>
     * A count of how many total questions are answered and unanswered in the review template.
     * </p>
     * 
     * @return A count of how many total questions are answered and unanswered in the review template.
     */

    public java.util.Map<String, Integer> getQuestionCounts() {
        return questionCounts;
    }

    /**
     * <p>
     * A count of how many total questions are answered and unanswered in the review template.
     * </p>
     * 
     * @param questionCounts
     *        A count of how many total questions are answered and unanswered in the review template.
     */

    public void setQuestionCounts(java.util.Map<String, Integer> questionCounts) {
        this.questionCounts = questionCounts;
    }

    /**
     * <p>
     * A count of how many total questions are answered and unanswered in the review template.
     * </p>
     * 
     * @param questionCounts
     *        A count of how many total questions are answered and unanswered in the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withQuestionCounts(java.util.Map<String, Integer> questionCounts) {
        setQuestionCounts(questionCounts);
        return this;
    }

    /**
     * Add a single QuestionCounts entry
     *
     * @see ReviewTemplate#withQuestionCounts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate addQuestionCountsEntry(String key, Integer value) {
        if (null == this.questionCounts) {
            this.questionCounts = new java.util.HashMap<String, Integer>();
        }
        if (this.questionCounts.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.questionCounts.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into QuestionCounts.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate clearQuestionCountsEntries() {
        this.questionCounts = null;
        return this;
    }

    /**
     * @param owner
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * @param updatedAt
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * @return
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @param updatedAt
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     */

    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @return The review template ARN.
     */

    public String getTemplateArn() {
        return this.templateArn;
    }

    /**
     * <p>
     * The review template ARN.
     * </p>
     * 
     * @param templateArn
     *        The review template ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withTemplateArn(String templateArn) {
        setTemplateArn(templateArn);
        return this;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @param templateName
     *        The name of the review template.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @return The name of the review template.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the review template.
     * </p>
     * 
     * @param templateName
     *        The name of the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     * 
     * @return The tags assigned to the review template.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the review template.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the review template.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see ReviewTemplate#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate addTagsEntry(String key, String value) {
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

    public ReviewTemplate clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @param updateStatus
     *        The latest status of a review template.
     * @see ReviewTemplateUpdateStatus
     */

    public void setUpdateStatus(String updateStatus) {
        this.updateStatus = updateStatus;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @return The latest status of a review template.
     * @see ReviewTemplateUpdateStatus
     */

    public String getUpdateStatus() {
        return this.updateStatus;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @param updateStatus
     *        The latest status of a review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewTemplateUpdateStatus
     */

    public ReviewTemplate withUpdateStatus(String updateStatus) {
        setUpdateStatus(updateStatus);
        return this;
    }

    /**
     * <p>
     * The latest status of a review template.
     * </p>
     * 
     * @param updateStatus
     *        The latest status of a review template.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReviewTemplateUpdateStatus
     */

    public ReviewTemplate withUpdateStatus(ReviewTemplateUpdateStatus updateStatus) {
        this.updateStatus = updateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ID assigned to the template share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the template share invitation.
     */

    public void setShareInvitationId(String shareInvitationId) {
        this.shareInvitationId = shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the template share invitation.
     * </p>
     * 
     * @return The ID assigned to the template share invitation.
     */

    public String getShareInvitationId() {
        return this.shareInvitationId;
    }

    /**
     * <p>
     * The ID assigned to the template share invitation.
     * </p>
     * 
     * @param shareInvitationId
     *        The ID assigned to the template share invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReviewTemplate withShareInvitationId(String shareInvitationId) {
        setShareInvitationId(shareInvitationId);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLenses() != null)
            sb.append("Lenses: ").append(getLenses()).append(",");
        if (getNotes() != null)
            sb.append("Notes: ").append(getNotes()).append(",");
        if (getQuestionCounts() != null)
            sb.append("QuestionCounts: ").append(getQuestionCounts()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getTemplateArn() != null)
            sb.append("TemplateArn: ").append(getTemplateArn()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getUpdateStatus() != null)
            sb.append("UpdateStatus: ").append(getUpdateStatus()).append(",");
        if (getShareInvitationId() != null)
            sb.append("ShareInvitationId: ").append(getShareInvitationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReviewTemplate == false)
            return false;
        ReviewTemplate other = (ReviewTemplate) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLenses() == null ^ this.getLenses() == null)
            return false;
        if (other.getLenses() != null && other.getLenses().equals(this.getLenses()) == false)
            return false;
        if (other.getNotes() == null ^ this.getNotes() == null)
            return false;
        if (other.getNotes() != null && other.getNotes().equals(this.getNotes()) == false)
            return false;
        if (other.getQuestionCounts() == null ^ this.getQuestionCounts() == null)
            return false;
        if (other.getQuestionCounts() != null && other.getQuestionCounts().equals(this.getQuestionCounts()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUpdateStatus() == null ^ this.getUpdateStatus() == null)
            return false;
        if (other.getUpdateStatus() != null && other.getUpdateStatus().equals(this.getUpdateStatus()) == false)
            return false;
        if (other.getShareInvitationId() == null ^ this.getShareInvitationId() == null)
            return false;
        if (other.getShareInvitationId() != null && other.getShareInvitationId().equals(this.getShareInvitationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLenses() == null) ? 0 : getLenses().hashCode());
        hashCode = prime * hashCode + ((getNotes() == null) ? 0 : getNotes().hashCode());
        hashCode = prime * hashCode + ((getQuestionCounts() == null) ? 0 : getQuestionCounts().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUpdateStatus() == null) ? 0 : getUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getShareInvitationId() == null) ? 0 : getShareInvitationId().hashCode());
        return hashCode;
    }

    @Override
    public ReviewTemplate clone() {
        try {
            return (ReviewTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wellarchitected.model.transform.ReviewTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
