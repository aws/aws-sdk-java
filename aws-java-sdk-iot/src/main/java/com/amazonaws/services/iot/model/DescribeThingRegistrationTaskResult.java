/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeThingRegistrationTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The task ID.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The task creation date.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The task's template.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     */
    private String inputFileBucket;
    /**
     * <p>
     * The input file key.
     * </p>
     */
    private String inputFileKey;
    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     */
    private Integer successCount;
    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     */
    private Integer failureCount;
    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     */
    private Integer percentageProgress;

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @return The task ID.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The task ID.
     * </p>
     * 
     * @param taskId
     *        The task ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The task creation date.
     * </p>
     * 
     * @param creationDate
     *        The task creation date.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The task creation date.
     * </p>
     * 
     * @return The task creation date.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The task creation date.
     * </p>
     * 
     * @param creationDate
     *        The task creation date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the task was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     * 
     * @return The date when the task was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date when the task was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date when the task was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The task's template.
     * </p>
     * 
     * @param templateBody
     *        The task's template.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The task's template.
     * </p>
     * 
     * @return The task's template.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The task's template.
     * </p>
     * 
     * @param templateBody
     *        The task's template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * 
     * @param inputFileBucket
     *        The S3 bucket that contains the input file.
     */

    public void setInputFileBucket(String inputFileBucket) {
        this.inputFileBucket = inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * 
     * @return The S3 bucket that contains the input file.
     */

    public String getInputFileBucket() {
        return this.inputFileBucket;
    }

    /**
     * <p>
     * The S3 bucket that contains the input file.
     * </p>
     * 
     * @param inputFileBucket
     *        The S3 bucket that contains the input file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withInputFileBucket(String inputFileBucket) {
        setInputFileBucket(inputFileBucket);
        return this;
    }

    /**
     * <p>
     * The input file key.
     * </p>
     * 
     * @param inputFileKey
     *        The input file key.
     */

    public void setInputFileKey(String inputFileKey) {
        this.inputFileKey = inputFileKey;
    }

    /**
     * <p>
     * The input file key.
     * </p>
     * 
     * @return The input file key.
     */

    public String getInputFileKey() {
        return this.inputFileKey;
    }

    /**
     * <p>
     * The input file key.
     * </p>
     * 
     * @param inputFileKey
     *        The input file key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withInputFileKey(String inputFileKey) {
        setInputFileKey(inputFileKey);
        return this;
    }

    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     * 
     * @param roleArn
     *        The role ARN that grants access to the input file bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     * 
     * @return The role ARN that grants access to the input file bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The role ARN that grants access to the input file bucket.
     * </p>
     * 
     * @param roleArn
     *        The role ARN that grants access to the input file bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * 
     * @param status
     *        The status of the bulk thing provisioning task.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * 
     * @return The status of the bulk thing provisioning task.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * 
     * @param status
     *        The status of the bulk thing provisioning task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DescribeThingRegistrationTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the bulk thing provisioning task.
     * </p>
     * 
     * @param status
     *        The status of the bulk thing provisioning task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public DescribeThingRegistrationTaskResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The message.
     * </p>
     * 
     * @param message
     *        The message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message.
     * </p>
     * 
     * @return The message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message.
     * </p>
     * 
     * @param message
     *        The message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     * 
     * @param successCount
     *        The number of things successfully provisioned.
     */

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     * 
     * @return The number of things successfully provisioned.
     */

    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * <p>
     * The number of things successfully provisioned.
     * </p>
     * 
     * @param successCount
     *        The number of things successfully provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withSuccessCount(Integer successCount) {
        setSuccessCount(successCount);
        return this;
    }

    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     * 
     * @param failureCount
     *        The number of things that failed to be provisioned.
     */

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     * 
     * @return The number of things that failed to be provisioned.
     */

    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     * <p>
     * The number of things that failed to be provisioned.
     * </p>
     * 
     * @param failureCount
     *        The number of things that failed to be provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withFailureCount(Integer failureCount) {
        setFailureCount(failureCount);
        return this;
    }

    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     * 
     * @param percentageProgress
     *        The progress of the bulk provisioning task expressed as a percentage.
     */

    public void setPercentageProgress(Integer percentageProgress) {
        this.percentageProgress = percentageProgress;
    }

    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     * 
     * @return The progress of the bulk provisioning task expressed as a percentage.
     */

    public Integer getPercentageProgress() {
        return this.percentageProgress;
    }

    /**
     * <p>
     * The progress of the bulk provisioning task expressed as a percentage.
     * </p>
     * 
     * @param percentageProgress
     *        The progress of the bulk provisioning task expressed as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeThingRegistrationTaskResult withPercentageProgress(Integer percentageProgress) {
        setPercentageProgress(percentageProgress);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getInputFileBucket() != null)
            sb.append("InputFileBucket: ").append(getInputFileBucket()).append(",");
        if (getInputFileKey() != null)
            sb.append("InputFileKey: ").append(getInputFileKey()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getSuccessCount() != null)
            sb.append("SuccessCount: ").append(getSuccessCount()).append(",");
        if (getFailureCount() != null)
            sb.append("FailureCount: ").append(getFailureCount()).append(",");
        if (getPercentageProgress() != null)
            sb.append("PercentageProgress: ").append(getPercentageProgress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeThingRegistrationTaskResult == false)
            return false;
        DescribeThingRegistrationTaskResult other = (DescribeThingRegistrationTaskResult) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getInputFileBucket() == null ^ this.getInputFileBucket() == null)
            return false;
        if (other.getInputFileBucket() != null && other.getInputFileBucket().equals(this.getInputFileBucket()) == false)
            return false;
        if (other.getInputFileKey() == null ^ this.getInputFileKey() == null)
            return false;
        if (other.getInputFileKey() != null && other.getInputFileKey().equals(this.getInputFileKey()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSuccessCount() == null ^ this.getSuccessCount() == null)
            return false;
        if (other.getSuccessCount() != null && other.getSuccessCount().equals(this.getSuccessCount()) == false)
            return false;
        if (other.getFailureCount() == null ^ this.getFailureCount() == null)
            return false;
        if (other.getFailureCount() != null && other.getFailureCount().equals(this.getFailureCount()) == false)
            return false;
        if (other.getPercentageProgress() == null ^ this.getPercentageProgress() == null)
            return false;
        if (other.getPercentageProgress() != null && other.getPercentageProgress().equals(this.getPercentageProgress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getInputFileBucket() == null) ? 0 : getInputFileBucket().hashCode());
        hashCode = prime * hashCode + ((getInputFileKey() == null) ? 0 : getInputFileKey().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getSuccessCount() == null) ? 0 : getSuccessCount().hashCode());
        hashCode = prime * hashCode + ((getFailureCount() == null) ? 0 : getFailureCount().hashCode());
        hashCode = prime * hashCode + ((getPercentageProgress() == null) ? 0 : getPercentageProgress().hashCode());
        return hashCode;
    }

    @Override
    public DescribeThingRegistrationTaskResult clone() {
        try {
            return (DescribeThingRegistrationTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
