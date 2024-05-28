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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/GetTrainingDataset" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTrainingDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time at which the training dataset was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The description of the training dataset.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the training dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The IAM role used to read the training data.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the training dataset.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags that are assigned to this training dataset.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * Metadata about the requested training data.
     * </p>
     */
    private java.util.List<Dataset> trainingData;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset.
     * </p>
     */
    private String trainingDatasetArn;
    /**
     * <p>
     * The most recent time at which the training dataset was updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The time at which the training dataset was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the training dataset was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time at which the training dataset was created.
     * </p>
     * 
     * @return The time at which the training dataset was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time at which the training dataset was created.
     * </p>
     * 
     * @param createTime
     *        The time at which the training dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The description of the training dataset.
     * </p>
     * 
     * @param description
     *        The description of the training dataset.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the training dataset.
     * </p>
     * 
     * @return The description of the training dataset.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the training dataset.
     * </p>
     * 
     * @param description
     *        The description of the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the training dataset.
     * </p>
     * 
     * @param name
     *        The name of the training dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the training dataset.
     * </p>
     * 
     * @return The name of the training dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the training dataset.
     * </p>
     * 
     * @param name
     *        The name of the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The IAM role used to read the training data.
     * </p>
     * 
     * @param roleArn
     *        The IAM role used to read the training data.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role used to read the training data.
     * </p>
     * 
     * @return The IAM role used to read the training data.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role used to read the training data.
     * </p>
     * 
     * @param roleArn
     *        The IAM role used to read the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the training dataset.
     * </p>
     * 
     * @param status
     *        The status of the training dataset.
     * @see TrainingDatasetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the training dataset.
     * </p>
     * 
     * @return The status of the training dataset.
     * @see TrainingDatasetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the training dataset.
     * </p>
     * 
     * @param status
     *        The status of the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingDatasetStatus
     */

    public GetTrainingDatasetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the training dataset.
     * </p>
     * 
     * @param status
     *        The status of the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingDatasetStatus
     */

    public GetTrainingDatasetResult withStatus(TrainingDatasetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to this training dataset.
     * </p>
     * 
     * @return The tags that are assigned to this training dataset.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that are assigned to this training dataset.
     * </p>
     * 
     * @param tags
     *        The tags that are assigned to this training dataset.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that are assigned to this training dataset.
     * </p>
     * 
     * @param tags
     *        The tags that are assigned to this training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetTrainingDatasetResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult addTagsEntry(String key, String value) {
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

    public GetTrainingDatasetResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * Metadata about the requested training data.
     * </p>
     * 
     * @return Metadata about the requested training data.
     */

    public java.util.List<Dataset> getTrainingData() {
        return trainingData;
    }

    /**
     * <p>
     * Metadata about the requested training data.
     * </p>
     * 
     * @param trainingData
     *        Metadata about the requested training data.
     */

    public void setTrainingData(java.util.Collection<Dataset> trainingData) {
        if (trainingData == null) {
            this.trainingData = null;
            return;
        }

        this.trainingData = new java.util.ArrayList<Dataset>(trainingData);
    }

    /**
     * <p>
     * Metadata about the requested training data.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrainingData(java.util.Collection)} or {@link #withTrainingData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param trainingData
     *        Metadata about the requested training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withTrainingData(Dataset... trainingData) {
        if (this.trainingData == null) {
            setTrainingData(new java.util.ArrayList<Dataset>(trainingData.length));
        }
        for (Dataset ele : trainingData) {
            this.trainingData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metadata about the requested training data.
     * </p>
     * 
     * @param trainingData
     *        Metadata about the requested training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withTrainingData(java.util.Collection<Dataset> trainingData) {
        setTrainingData(trainingData);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset.
     */

    public void setTrainingDatasetArn(String trainingDatasetArn) {
        this.trainingDatasetArn = trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the training dataset.
     */

    public String getTrainingDatasetArn() {
        return this.trainingDatasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the training dataset.
     * </p>
     * 
     * @param trainingDatasetArn
     *        The Amazon Resource Name (ARN) of the training dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withTrainingDatasetArn(String trainingDatasetArn) {
        setTrainingDatasetArn(trainingDatasetArn);
        return this;
    }

    /**
     * <p>
     * The most recent time at which the training dataset was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the training dataset was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The most recent time at which the training dataset was updated.
     * </p>
     * 
     * @return The most recent time at which the training dataset was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The most recent time at which the training dataset was updated.
     * </p>
     * 
     * @param updateTime
     *        The most recent time at which the training dataset was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTrainingDatasetResult withUpdateTime(java.util.Date updateTime) {
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrainingData() != null)
            sb.append("TrainingData: ").append(getTrainingData()).append(",");
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

        if (obj instanceof GetTrainingDatasetResult == false)
            return false;
        GetTrainingDatasetResult other = (GetTrainingDatasetResult) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrainingData() == null ^ this.getTrainingData() == null)
            return false;
        if (other.getTrainingData() != null && other.getTrainingData().equals(this.getTrainingData()) == false)
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

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrainingData() == null) ? 0 : getTrainingData().hashCode());
        hashCode = prime * hashCode + ((getTrainingDatasetArn() == null) ? 0 : getTrainingDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetTrainingDatasetResult clone() {
        try {
            return (GetTrainingDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
