/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/GetQuantumTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetQuantumTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The time at which the task was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ARN of the device the task was run on.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The parameters for the device on which the task ran.
     * </p>
     */
    private String deviceParameters;
    /**
     * <p>
     * The time at which the task ended.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The reason that a task failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The S3 bucket where task results are stored.
     * </p>
     */
    private String outputS3Bucket;
    /**
     * <p>
     * The folder in the S3 bucket where task results are stored.
     * </p>
     */
    private String outputS3Directory;
    /**
     * <p>
     * The ARN of the task.
     * </p>
     */
    private String quantumTaskArn;
    /**
     * <p>
     * The number of shots used in the task.
     * </p>
     */
    private Long shots;
    /**
     * <p>
     * The status of the task.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The tags that belong to this task.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The time at which the task was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the task was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time at which the task was created.
     * </p>
     * 
     * @return The time at which the task was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time at which the task was created.
     * </p>
     * 
     * @param createdAt
     *        The time at which the task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ARN of the device the task was run on.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device the task was run on.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The ARN of the device the task was run on.
     * </p>
     * 
     * @return The ARN of the device the task was run on.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The ARN of the device the task was run on.
     * </p>
     * 
     * @param deviceArn
     *        The ARN of the device the task was run on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The parameters for the device on which the task ran.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param deviceParameters
     *        The parameters for the device on which the task ran.
     */

    public void setDeviceParameters(String deviceParameters) {
        this.deviceParameters = deviceParameters;
    }

    /**
     * <p>
     * The parameters for the device on which the task ran.
     * </p>
     * <p>
     * This field's value will be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * 
     * @return The parameters for the device on which the task ran.
     */

    public String getDeviceParameters() {
        return this.deviceParameters;
    }

    /**
     * <p>
     * The parameters for the device on which the task ran.
     * </p>
     * <p>
     * This field's value must be valid JSON according to RFC 7159, including the opening and closing braces. For
     * example: '{"key": "value"}'.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * 
     * @param deviceParameters
     *        The parameters for the device on which the task ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withDeviceParameters(String deviceParameters) {
        setDeviceParameters(deviceParameters);
        return this;
    }

    /**
     * <p>
     * The time at which the task ended.
     * </p>
     * 
     * @param endedAt
     *        The time at which the task ended.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The time at which the task ended.
     * </p>
     * 
     * @return The time at which the task ended.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The time at which the task ended.
     * </p>
     * 
     * @param endedAt
     *        The time at which the task ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The reason that a task failed.
     * </p>
     * 
     * @param failureReason
     *        The reason that a task failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason that a task failed.
     * </p>
     * 
     * @return The reason that a task failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason that a task failed.
     * </p>
     * 
     * @param failureReason
     *        The reason that a task failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The S3 bucket where task results are stored.
     * </p>
     * 
     * @param outputS3Bucket
     *        The S3 bucket where task results are stored.
     */

    public void setOutputS3Bucket(String outputS3Bucket) {
        this.outputS3Bucket = outputS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where task results are stored.
     * </p>
     * 
     * @return The S3 bucket where task results are stored.
     */

    public String getOutputS3Bucket() {
        return this.outputS3Bucket;
    }

    /**
     * <p>
     * The S3 bucket where task results are stored.
     * </p>
     * 
     * @param outputS3Bucket
     *        The S3 bucket where task results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withOutputS3Bucket(String outputS3Bucket) {
        setOutputS3Bucket(outputS3Bucket);
        return this;
    }

    /**
     * <p>
     * The folder in the S3 bucket where task results are stored.
     * </p>
     * 
     * @param outputS3Directory
     *        The folder in the S3 bucket where task results are stored.
     */

    public void setOutputS3Directory(String outputS3Directory) {
        this.outputS3Directory = outputS3Directory;
    }

    /**
     * <p>
     * The folder in the S3 bucket where task results are stored.
     * </p>
     * 
     * @return The folder in the S3 bucket where task results are stored.
     */

    public String getOutputS3Directory() {
        return this.outputS3Directory;
    }

    /**
     * <p>
     * The folder in the S3 bucket where task results are stored.
     * </p>
     * 
     * @param outputS3Directory
     *        The folder in the S3 bucket where task results are stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withOutputS3Directory(String outputS3Directory) {
        setOutputS3Directory(outputS3Directory);
        return this;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @param quantumTaskArn
     *        The ARN of the task.
     */

    public void setQuantumTaskArn(String quantumTaskArn) {
        this.quantumTaskArn = quantumTaskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @return The ARN of the task.
     */

    public String getQuantumTaskArn() {
        return this.quantumTaskArn;
    }

    /**
     * <p>
     * The ARN of the task.
     * </p>
     * 
     * @param quantumTaskArn
     *        The ARN of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withQuantumTaskArn(String quantumTaskArn) {
        setQuantumTaskArn(quantumTaskArn);
        return this;
    }

    /**
     * <p>
     * The number of shots used in the task.
     * </p>
     * 
     * @param shots
     *        The number of shots used in the task.
     */

    public void setShots(Long shots) {
        this.shots = shots;
    }

    /**
     * <p>
     * The number of shots used in the task.
     * </p>
     * 
     * @return The number of shots used in the task.
     */

    public Long getShots() {
        return this.shots;
    }

    /**
     * <p>
     * The number of shots used in the task.
     * </p>
     * 
     * @param shots
     *        The number of shots used in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withShots(Long shots) {
        setShots(shots);
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @see QuantumTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @return The status of the task.
     * @see QuantumTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuantumTaskStatus
     */

    public GetQuantumTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the task.
     * </p>
     * 
     * @param status
     *        The status of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuantumTaskStatus
     */

    public GetQuantumTaskResult withStatus(QuantumTaskStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The tags that belong to this task.
     * </p>
     * 
     * @return The tags that belong to this task.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags that belong to this task.
     * </p>
     * 
     * @param tags
     *        The tags that belong to this task.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags that belong to this task.
     * </p>
     * 
     * @param tags
     *        The tags that belong to this task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetQuantumTaskResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetQuantumTaskResult addTagsEntry(String key, String value) {
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

    public GetQuantumTaskResult clearTagsEntries() {
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceParameters() != null)
            sb.append("DeviceParameters: ").append(getDeviceParameters()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getOutputS3Bucket() != null)
            sb.append("OutputS3Bucket: ").append(getOutputS3Bucket()).append(",");
        if (getOutputS3Directory() != null)
            sb.append("OutputS3Directory: ").append(getOutputS3Directory()).append(",");
        if (getQuantumTaskArn() != null)
            sb.append("QuantumTaskArn: ").append(getQuantumTaskArn()).append(",");
        if (getShots() != null)
            sb.append("Shots: ").append(getShots()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
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

        if (obj instanceof GetQuantumTaskResult == false)
            return false;
        GetQuantumTaskResult other = (GetQuantumTaskResult) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceParameters() == null ^ this.getDeviceParameters() == null)
            return false;
        if (other.getDeviceParameters() != null && other.getDeviceParameters().equals(this.getDeviceParameters()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getOutputS3Bucket() == null ^ this.getOutputS3Bucket() == null)
            return false;
        if (other.getOutputS3Bucket() != null && other.getOutputS3Bucket().equals(this.getOutputS3Bucket()) == false)
            return false;
        if (other.getOutputS3Directory() == null ^ this.getOutputS3Directory() == null)
            return false;
        if (other.getOutputS3Directory() != null && other.getOutputS3Directory().equals(this.getOutputS3Directory()) == false)
            return false;
        if (other.getQuantumTaskArn() == null ^ this.getQuantumTaskArn() == null)
            return false;
        if (other.getQuantumTaskArn() != null && other.getQuantumTaskArn().equals(this.getQuantumTaskArn()) == false)
            return false;
        if (other.getShots() == null ^ this.getShots() == null)
            return false;
        if (other.getShots() != null && other.getShots().equals(this.getShots()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
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

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceParameters() == null) ? 0 : getDeviceParameters().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Bucket() == null) ? 0 : getOutputS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getOutputS3Directory() == null) ? 0 : getOutputS3Directory().hashCode());
        hashCode = prime * hashCode + ((getQuantumTaskArn() == null) ? 0 : getQuantumTaskArn().hashCode());
        hashCode = prime * hashCode + ((getShots() == null) ? 0 : getShots().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetQuantumTaskResult clone() {
        try {
            return (GetQuantumTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
