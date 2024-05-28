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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the evaluation form.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EvaluationForm" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationForm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     */
    private String evaluationFormId;
    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     */
    private Integer evaluationFormVersion;
    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     */
    private Boolean locked;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     */
    private String evaluationFormArn;
    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     */
    private String title;
    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     */
    private java.util.List<EvaluationFormItem> items;
    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     */
    private EvaluationFormScoringStrategy scoringStrategy;
    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     */

    public void setEvaluationFormId(String evaluationFormId) {
        this.evaluationFormId = evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @return The unique identifier for the evaluation form.
     */

    public String getEvaluationFormId() {
        return this.evaluationFormId;
    }

    /**
     * <p>
     * The unique identifier for the evaluation form.
     * </p>
     * 
     * @param evaluationFormId
     *        The unique identifier for the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withEvaluationFormId(String evaluationFormId) {
        setEvaluationFormId(evaluationFormId);
        return this;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @param evaluationFormVersion
     *        A version of the evaluation form.
     */

    public void setEvaluationFormVersion(Integer evaluationFormVersion) {
        this.evaluationFormVersion = evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @return A version of the evaluation form.
     */

    public Integer getEvaluationFormVersion() {
        return this.evaluationFormVersion;
    }

    /**
     * <p>
     * A version of the evaluation form.
     * </p>
     * 
     * @param evaluationFormVersion
     *        A version of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withEvaluationFormVersion(Integer evaluationFormVersion) {
        setEvaluationFormVersion(evaluationFormVersion);
        return this;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @param locked
     *        The flag indicating whether the evaluation form is locked for changes.
     */

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @return The flag indicating whether the evaluation form is locked for changes.
     */

    public Boolean getLocked() {
        return this.locked;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @param locked
     *        The flag indicating whether the evaluation form is locked for changes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withLocked(Boolean locked) {
        setLocked(locked);
        return this;
    }

    /**
     * <p>
     * The flag indicating whether the evaluation form is locked for changes.
     * </p>
     * 
     * @return The flag indicating whether the evaluation form is locked for changes.
     */

    public Boolean isLocked() {
        return this.locked;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public void setEvaluationFormArn(String evaluationFormArn) {
        this.evaluationFormArn = evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the evaluation form resource.
     */

    public String getEvaluationFormArn() {
        return this.evaluationFormArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the evaluation form resource.
     * </p>
     * 
     * @param evaluationFormArn
     *        The Amazon Resource Name (ARN) for the evaluation form resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withEvaluationFormArn(String evaluationFormArn) {
        setEvaluationFormArn(evaluationFormArn);
        return this;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @return A title of the evaluation form.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * A title of the evaluation form.
     * </p>
     * 
     * @param title
     *        A title of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withTitle(String title) {
        setTitle(title);
        return this;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @param description
     *        The description of the evaluation form.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @return The description of the evaluation form.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the evaluation form.
     * </p>
     * 
     * @param description
     *        The description of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @param status
     *        The status of the evaluation form.
     * @see EvaluationFormVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @return The status of the evaluation form.
     * @see EvaluationFormVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @param status
     *        The status of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormVersionStatus
     */

    public EvaluationForm withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the evaluation form.
     * </p>
     * 
     * @param status
     *        The status of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFormVersionStatus
     */

    public EvaluationForm withStatus(EvaluationFormVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @return Items that are part of the evaluation form. The total number of sections and questions must not exceed
     *         100 each. Questions must be contained in a section.
     */

    public java.util.List<EvaluationFormItem> getItems() {
        return items;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     */

    public void setItems(java.util.Collection<EvaluationFormItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<EvaluationFormItem>(items);
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withItems(EvaluationFormItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<EvaluationFormItem>(items.length));
        }
        for (EvaluationFormItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Items that are part of the evaluation form. The total number of sections and questions must not exceed 100 each.
     * Questions must be contained in a section.
     * </p>
     * 
     * @param items
     *        Items that are part of the evaluation form. The total number of sections and questions must not exceed 100
     *        each. Questions must be contained in a section.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withItems(java.util.Collection<EvaluationFormItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @param scoringStrategy
     *        A scoring strategy of the evaluation form.
     */

    public void setScoringStrategy(EvaluationFormScoringStrategy scoringStrategy) {
        this.scoringStrategy = scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @return A scoring strategy of the evaluation form.
     */

    public EvaluationFormScoringStrategy getScoringStrategy() {
        return this.scoringStrategy;
    }

    /**
     * <p>
     * A scoring strategy of the evaluation form.
     * </p>
     * 
     * @param scoringStrategy
     *        A scoring strategy of the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withScoringStrategy(EvaluationFormScoringStrategy scoringStrategy) {
        setScoringStrategy(scoringStrategy);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the evaluation form was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     * 
     * @return The timestamp for when the evaluation form was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was created.
     * </p>
     * 
     * @param createdTime
     *        The timestamp for when the evaluation form was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the evaluation form.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who created the evaluation form.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * </p>
     * 
     * @param createdBy
     *        The Amazon Resource Name (ARN) of the user who created the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the evaluation form was last updated.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     * 
     * @return The timestamp for when the evaluation form was last updated.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp for when the evaluation form was last updated.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp for when the evaluation form was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * </p>
     * 
     * @param lastModifiedBy
     *        The Amazon Resource Name (ARN) of the user who last updated the evaluation form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *         {"key1":"value1", "key2":"value2"} }.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource. For example, { "Tags": {"key1":"value1",
     * "key2":"value2"} }.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource. For example, { "Tags":
     *        {"key1":"value1", "key2":"value2"} }.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EvaluationForm#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationForm addTagsEntry(String key, String value) {
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

    public EvaluationForm clearTagsEntries() {
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
        if (getEvaluationFormId() != null)
            sb.append("EvaluationFormId: ").append(getEvaluationFormId()).append(",");
        if (getEvaluationFormVersion() != null)
            sb.append("EvaluationFormVersion: ").append(getEvaluationFormVersion()).append(",");
        if (getLocked() != null)
            sb.append("Locked: ").append(getLocked()).append(",");
        if (getEvaluationFormArn() != null)
            sb.append("EvaluationFormArn: ").append(getEvaluationFormArn()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getScoringStrategy() != null)
            sb.append("ScoringStrategy: ").append(getScoringStrategy()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
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

        if (obj instanceof EvaluationForm == false)
            return false;
        EvaluationForm other = (EvaluationForm) obj;
        if (other.getEvaluationFormId() == null ^ this.getEvaluationFormId() == null)
            return false;
        if (other.getEvaluationFormId() != null && other.getEvaluationFormId().equals(this.getEvaluationFormId()) == false)
            return false;
        if (other.getEvaluationFormVersion() == null ^ this.getEvaluationFormVersion() == null)
            return false;
        if (other.getEvaluationFormVersion() != null && other.getEvaluationFormVersion().equals(this.getEvaluationFormVersion()) == false)
            return false;
        if (other.getLocked() == null ^ this.getLocked() == null)
            return false;
        if (other.getLocked() != null && other.getLocked().equals(this.getLocked()) == false)
            return false;
        if (other.getEvaluationFormArn() == null ^ this.getEvaluationFormArn() == null)
            return false;
        if (other.getEvaluationFormArn() != null && other.getEvaluationFormArn().equals(this.getEvaluationFormArn()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getScoringStrategy() == null ^ this.getScoringStrategy() == null)
            return false;
        if (other.getScoringStrategy() != null && other.getScoringStrategy().equals(this.getScoringStrategy()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
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

        hashCode = prime * hashCode + ((getEvaluationFormId() == null) ? 0 : getEvaluationFormId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormVersion() == null) ? 0 : getEvaluationFormVersion().hashCode());
        hashCode = prime * hashCode + ((getLocked() == null) ? 0 : getLocked().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFormArn() == null) ? 0 : getEvaluationFormArn().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getScoringStrategy() == null) ? 0 : getScoringStrategy().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationForm clone() {
        try {
            return (EvaluationForm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EvaluationFormMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
