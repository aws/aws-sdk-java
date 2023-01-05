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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists a summary of properties of an inference experiment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceExperimentSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceExperimentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     * <p>
     * The maximum duration that you can set for an inference experiment is 30 days.
     * </p>
     */
    private InferenceExperimentSchedule schedule;
    /**
     * <p>
     * The status of the inference experiment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The error message for the inference experiment status result.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp at which the inference experiment was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     */
    private java.util.Date completionTime;
    /**
     * <p>
     * The timestamp when you last modified the inference experiment.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     * 
     * @return The name of the inference experiment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the inference experiment.
     * </p>
     * 
     * @param name
     *        The name of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @param type
     *        The type of the inference experiment.
     * @see InferenceExperimentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @return The type of the inference experiment.
     * @see InferenceExperimentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @param type
     *        The type of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public InferenceExperimentSummary withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the inference experiment.
     * </p>
     * 
     * @param type
     *        The type of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public InferenceExperimentSummary withType(InferenceExperimentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     * <p>
     * The maximum duration that you can set for an inference experiment is 30 days.
     * </p>
     * 
     * @param schedule
     *        The duration for which the inference experiment ran or will run.</p>
     *        <p>
     *        The maximum duration that you can set for an inference experiment is 30 days.
     */

    public void setSchedule(InferenceExperimentSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     * <p>
     * The maximum duration that you can set for an inference experiment is 30 days.
     * </p>
     * 
     * @return The duration for which the inference experiment ran or will run.</p>
     *         <p>
     *         The maximum duration that you can set for an inference experiment is 30 days.
     */

    public InferenceExperimentSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * The duration for which the inference experiment ran or will run.
     * </p>
     * <p>
     * The maximum duration that you can set for an inference experiment is 30 days.
     * </p>
     * 
     * @param schedule
     *        The duration for which the inference experiment ran or will run.</p>
     *        <p>
     *        The maximum duration that you can set for an inference experiment is 30 days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withSchedule(InferenceExperimentSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The status of the inference experiment.
     * </p>
     * 
     * @param status
     *        The status of the inference experiment.
     * @see InferenceExperimentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the inference experiment.
     * </p>
     * 
     * @return The status of the inference experiment.
     * @see InferenceExperimentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the inference experiment.
     * </p>
     * 
     * @param status
     *        The status of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStatus
     */

    public InferenceExperimentSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the inference experiment.
     * </p>
     * 
     * @param status
     *        The status of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStatus
     */

    public InferenceExperimentSummary withStatus(InferenceExperimentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The error message for the inference experiment status result.
     * </p>
     * 
     * @param statusReason
     *        The error message for the inference experiment status result.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The error message for the inference experiment status result.
     * </p>
     * 
     * @return The error message for the inference experiment status result.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The error message for the inference experiment status result.
     * </p>
     * 
     * @param statusReason
     *        The error message for the inference experiment status result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @param description
     *        The description of the inference experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @return The description of the inference experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the inference experiment.
     * </p>
     * 
     * @param description
     *        The description of the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp at which the inference experiment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was created.
     * </p>
     * 
     * @return The timestamp at which the inference experiment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp at which the inference experiment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     * 
     * @param completionTime
     *        The timestamp at which the inference experiment was completed.
     */

    public void setCompletionTime(java.util.Date completionTime) {
        this.completionTime = completionTime;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     * 
     * @return The timestamp at which the inference experiment was completed.
     */

    public java.util.Date getCompletionTime() {
        return this.completionTime;
    }

    /**
     * <p>
     * The timestamp at which the inference experiment was completed.
     * </p>
     * 
     * @param completionTime
     *        The timestamp at which the inference experiment was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withCompletionTime(java.util.Date completionTime) {
        setCompletionTime(completionTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when you last modified the inference experiment.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when you last modified the inference experiment.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when you last modified the inference experiment.
     * </p>
     * 
     * @return The timestamp when you last modified the inference experiment.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The timestamp when you last modified the inference experiment.
     * </p>
     * 
     * @param lastModifiedTime
     *        The timestamp when you last modified the inference experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images,
     *        and manage Amazon SageMaker Inference endpoints for model deployment.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     * 
     * @return The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images,
     *         and manage Amazon SageMaker Inference endpoints for model deployment.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and
     * manage Amazon SageMaker Inference endpoints for model deployment.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images,
     *        and manage Amazon SageMaker Inference endpoints for model deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceExperimentSummary withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCompletionTime() != null)
            sb.append("CompletionTime: ").append(getCompletionTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceExperimentSummary == false)
            return false;
        InferenceExperimentSummary other = (InferenceExperimentSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCompletionTime() == null ^ this.getCompletionTime() == null)
            return false;
        if (other.getCompletionTime() != null && other.getCompletionTime().equals(this.getCompletionTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCompletionTime() == null) ? 0 : getCompletionTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public InferenceExperimentSummary clone() {
        try {
            return (InferenceExperimentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceExperimentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
