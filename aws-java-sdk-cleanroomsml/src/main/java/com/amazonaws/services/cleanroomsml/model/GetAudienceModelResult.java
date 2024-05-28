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
package com.amazonaws.services.cleanroomsml.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetAudienceModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAudienceModelResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model.
     * </p>
     */
    private String audienceModelArn;
    /**
     * <p>
     * The time at which the audience model was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The description of the audience model.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The KMS key ARN used for the audience model.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The name of the audience model.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the audience model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Details about the status of the audience model.
     * </p>
     */
    private StatusDetails statusDetails;
    /**
     * <p>
     * The tags that are assigned to the audience model.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The end date specified for the training window.
     * </p>
     */
    private java.util.Date trainingDataEndTime;
    /**
     * <p>
     * The start date specified for the training window.
     * </p>
     */
    private java.util.Date trainingDataStartTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that was used for this audience model.
     * </p>
     */
    private String trainingDatasetArn;
    /**
     * <p>
     * The most recent time at which the audience model was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model.
     */

    public void setAudienceModelArn(String audienceModelArn) {
        this.audienceModelArn = audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the audience model.
     */

    public String getAudienceModelArn() {
        return this.audienceModelArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the audience model.
     * </p>
     * 
     * @param audienceModelArn
     *        The Amazon Resource Name (ARN) of the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withAudienceModelArn(String audienceModelArn) {
        setAudienceModelArn(audienceModelArn);
        return this;
    }

    /**
     * <p>
     * The time at which the audience model was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience model was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the audience model was created.
     * </p>
     * 
     * @return The time at which the audience model was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the audience model was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the audience model was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The description of the audience model.
     * </p>
     * 
     * @param description
     *        The description of the audience model.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the audience model.
     * </p>
     * 
     * @return The description of the audience model.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the audience model.
     * </p>
     * 
     * @param description
     *        The description of the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The KMS key ARN used for the audience model.
     * </p>
     * 
     * @param kmsKeyArn
     *        The KMS key ARN used for the audience model.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN used for the audience model.
     * </p>
     * 
     * @return The KMS key ARN used for the audience model.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The KMS key ARN used for the audience model.
     * </p>
     * 
     * @param kmsKeyArn
     *        The KMS key ARN used for the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the audience model.
     * </p>
     * 
     * @param name
     *        The name of the audience model.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the audience model.
     * </p>
     * 
     * @return The name of the audience model.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the audience model.
     * </p>
     * 
     * @param name
     *        The name of the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the audience model.
     * </p>
     * 
     * @param status
     *        The status of the audience model.
     * @see AudienceModelStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the audience model.
     * </p>
     * 
     * @return The status of the audience model.
     * @see AudienceModelStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the audience model.
     * </p>
     * 
     * @param status
     *        The status of the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceModelStatus
     */

    public GetAudienceModelResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the audience model.
     * </p>
     * 
     * @param status
     *        The status of the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudienceModelStatus
     */

    public GetAudienceModelResult withStatus(AudienceModelStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Details about the status of the audience model.
     * </p>
     * 
     * @param statusDetails
     *        Details about the status of the audience model.
     */

    public void setStatusDetails(StatusDetails statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * Details about the status of the audience model.
     * </p>
     * 
     * @return Details about the status of the audience model.
     */

    public StatusDetails getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * Details about the status of the audience model.
     * </p>
     * 
     * @param statusDetails
     *        Details about the status of the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withStatusDetails(StatusDetails statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to the audience model.
     * </p>
     * 
     * @return The tags that are assigned to the audience model.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are assigned to the audience model.
     * </p>
     * 
     * @param tags
     *        The tags that are assigned to the audience model.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that are assigned to the audience model.
     * </p>
     * 
     * @param tags
     *        The tags that are assigned to the audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAudienceModelResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult addTagsEntry(String key, String value) {
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

    public GetAudienceModelResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The end date specified for the training window.
     * </p>
     * 
     * @param trainingDataEndTime
     *        The end date specified for the training window.
     */

    public void setTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        this.trainingDataEndTime = trainingDataEndTime;
    }

    /**
     * <p>
     * The end date specified for the training window.
     * </p>
     * 
     * @return The end date specified for the training window.
     */

    public java.util.Date getTrainingDataEndTime() {
        return this.trainingDataEndTime;
    }

    /**
     * <p>
     * The end date specified for the training window.
     * </p>
     * 
     * @param trainingDataEndTime
     *        The end date specified for the training window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withTrainingDataEndTime(java.util.Date trainingDataEndTime) {
        setTrainingDataEndTime(trainingDataEndTime);
        return this;
    }

    /**
     * <p>
     * The start date specified for the training window.
     * </p>
     * 
     * @param trainingDataStartTime
     *        The start date specified for the training window.
     */

    public void setTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        this.trainingDataStartTime = trainingDataStartTime;
    }

    /**
     * <p>
     * The start date specified for the training window.
     * </p>
     * 
     * @return The start date specified for the training window.
     */

    public java.util.Date getTrainingDataStartTime() {
        return this.trainingDataStartTime;
    }

    /**
     * <p>
     * The start date specified for the training window.
     * </p>
     * 
     * @param trainingDataStartTime
     *        The start date specified for the training window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withTrainingDataStartTime(java.util.Date trainingDataStartTime) {
        setTrainingDataStartTime(trainingDataStartTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that was used for this audience model.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset that was used for this audience model.
     */

    public void setTrainingDatasetArn(String trainingDatasetArn) {
        this.trainingDatasetArn = trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that was used for this audience model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training dataset that was used for this audience model.
     */

    public String getTrainingDatasetArn() {
        return this.trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset that was used for this audience model.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset that was used for this audience model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withTrainingDatasetArn(String trainingDatasetArn) {
        setTrainingDatasetArn(trainingDatasetArn);
        return this;
    }

    /**
     * <p>
     * The most recent time at which the audience model was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience model was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience model was updated.
     * </p>
     * 
     * @return The most recent time at which the audience model was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the audience model was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the audience model was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAudienceModelResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getAudienceModelArn() != null)
            sb.append("AudienceModelArn: ").append(getAudienceModelArn()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrainingDataEndTime() != null)
            sb.append("TrainingDataEndTime: ").append(getTrainingDataEndTime()).append(",");
        if (getTrainingDataStartTime() != null)
            sb.append("TrainingDataStartTime: ").append(getTrainingDataStartTime()).append(",");
        if (getTrainingDatasetArn() != null)
            sb.append("TrainingDatasetArn: ").append(getTrainingDatasetArn()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAudienceModelResult == false)
            return false;
        GetAudienceModelResult other = (GetAudienceModelResult) obj;
        if (other.getAudienceModelArn() == null ^ this.getAudienceModelArn() == null)
            return false;
        if (other.getAudienceModelArn() != null && other.getAudienceModelArn().equals(this.getAudienceModelArn()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrainingDataEndTime() == null ^ this.getTrainingDataEndTime() == null)
            return false;
        if (other.getTrainingDataEndTime() != null && other.getTrainingDataEndTime().equals(this.getTrainingDataEndTime()) == false)
            return false;
        if (other.getTrainingDataStartTime() == null ^ this.getTrainingDataStartTime() == null)
            return false;
        if (other.getTrainingDataStartTime() != null && other.getTrainingDataStartTime().equals(this.getTrainingDataStartTime()) == false)
            return false;
        if (other.getTrainingDatasetArn() == null ^ this.getTrainingDatasetArn() == null)
            return false;
        if (other.getTrainingDatasetArn() != null && other.getTrainingDatasetArn().equals(this.getTrainingDatasetArn()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudienceModelArn() == null) ? 0 : getAudienceModelArn().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataEndTime() == null) ? 0 : getTrainingDataEndTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataStartTime() == null) ? 0 : getTrainingDataStartTime().hashCode());
        hashCode = prime * hashCode + ((getTrainingDatasetArn() == null) ? 0 : getTrainingDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetAudienceModelResult clone() {
        try {
            return (GetAudienceModelResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
