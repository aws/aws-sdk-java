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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the training dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanroomsml-2023-09-06/TrainingDatasetSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingDatasetSummary implements Serializable, Cloneable, StructuredPojo {

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
     * The status of the training dataset.
     * </p>
     */
    private String status;
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

    public TrainingDatasetSummary withCreateTime(java.util.Date createTime) {
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

    public TrainingDatasetSummary withDescription(String description) {
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

    public TrainingDatasetSummary withName(String name) {
        setName(name);
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

    public TrainingDatasetSummary withStatus(String status) {
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

    public TrainingDatasetSummary withStatus(TrainingDatasetStatus status) {
        this.status = status.toString();
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

    public TrainingDatasetSummary withTrainingDatasetArn(String trainingDatasetArn) {
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

    public TrainingDatasetSummary withUpdateTime(java.util.Date updateTime) {
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof TrainingDatasetSummary == false)
            return false;
        TrainingDatasetSummary other = (TrainingDatasetSummary) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTrainingDatasetArn() == null) ? 0 : getTrainingDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public TrainingDatasetSummary clone() {
        try {
            return (TrainingDatasetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cleanroomsml.model.transform.TrainingDatasetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
