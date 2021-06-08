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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The information about the AMI store task, including the progress of the task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StoreImageTaskResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StoreImageTaskResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the AMI that is being stored.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The time the task started.
     * </p>
     */
    private java.util.Date taskStartTime;
    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     */
    private String bucket;
    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     */
    private String s3objectKey;
    /**
     * <p>
     * The progress of the task as a percentage.
     * </p>
     */
    private Integer progressPercentage;
    /**
     * <p>
     * The state of the store task (<code>InProgress</code>, <code>Completed</code>, or <code>Failed</code>).
     * </p>
     */
    private String storeTaskState;
    /**
     * <p>
     * If the tasks fails, the reason for the failure is returned. If the task succeeds, <code>null</code> is returned.
     * </p>
     */
    private String storeTaskFailureReason;

    /**
     * <p>
     * The ID of the AMI that is being stored.
     * </p>
     * 
     * @param amiId
     *        The ID of the AMI that is being stored.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The ID of the AMI that is being stored.
     * </p>
     * 
     * @return The ID of the AMI that is being stored.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The ID of the AMI that is being stored.
     * </p>
     * 
     * @param amiId
     *        The ID of the AMI that is being stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoreImageTaskResult withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The time the task started.
     * </p>
     * 
     * @param taskStartTime
     *        The time the task started.
     */

    public void setTaskStartTime(java.util.Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    /**
     * <p>
     * The time the task started.
     * </p>
     * 
     * @return The time the task started.
     */

    public java.util.Date getTaskStartTime() {
        return this.taskStartTime;
    }

    /**
     * <p>
     * The time the task started.
     * </p>
     * 
     * @param taskStartTime
     *        The time the task started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoreImageTaskResult withTaskStartTime(java.util.Date taskStartTime) {
        setTaskStartTime(taskStartTime);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that contains the stored AMI object.
     */

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     * 
     * @return The name of the S3 bucket that contains the stored AMI object.
     */

    public String getBucket() {
        return this.bucket;
    }

    /**
     * <p>
     * The name of the S3 bucket that contains the stored AMI object.
     * </p>
     * 
     * @param bucket
     *        The name of the S3 bucket that contains the stored AMI object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoreImageTaskResult withBucket(String bucket) {
        setBucket(bucket);
        return this;
    }

    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     * 
     * @param s3objectKey
     *        The name of the stored AMI object in the bucket.
     */

    public void setS3objectKey(String s3objectKey) {
        this.s3objectKey = s3objectKey;
    }

    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     * 
     * @return The name of the stored AMI object in the bucket.
     */

    public String getS3objectKey() {
        return this.s3objectKey;
    }

    /**
     * <p>
     * The name of the stored AMI object in the bucket.
     * </p>
     * 
     * @param s3objectKey
     *        The name of the stored AMI object in the bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoreImageTaskResult withS3objectKey(String s3objectKey) {
        setS3objectKey(s3objectKey);
        return this;
    }

    /**
     * <p>
     * The progress of the task as a percentage.
     * </p>
     * 
     * @param progressPercentage
     *        The progress of the task as a percentage.
     */

    public void setProgressPercentage(Integer progressPercentage) {
        this.progressPercentage = progressPercentage;
    }

    /**
     * <p>
     * The progress of the task as a percentage.
     * </p>
     * 
     * @return The progress of the task as a percentage.
     */

    public Integer getProgressPercentage() {
        return this.progressPercentage;
    }

    /**
     * <p>
     * The progress of the task as a percentage.
     * </p>
     * 
     * @param progressPercentage
     *        The progress of the task as a percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoreImageTaskResult withProgressPercentage(Integer progressPercentage) {
        setProgressPercentage(progressPercentage);
        return this;
    }

    /**
     * <p>
     * The state of the store task (<code>InProgress</code>, <code>Completed</code>, or <code>Failed</code>).
     * </p>
     * 
     * @param storeTaskState
     *        The state of the store task (<code>InProgress</code>, <code>Completed</code>, or <code>Failed</code>).
     */

    public void setStoreTaskState(String storeTaskState) {
        this.storeTaskState = storeTaskState;
    }

    /**
     * <p>
     * The state of the store task (<code>InProgress</code>, <code>Completed</code>, or <code>Failed</code>).
     * </p>
     * 
     * @return The state of the store task (<code>InProgress</code>, <code>Completed</code>, or <code>Failed</code>).
     */

    public String getStoreTaskState() {
        return this.storeTaskState;
    }

    /**
     * <p>
     * The state of the store task (<code>InProgress</code>, <code>Completed</code>, or <code>Failed</code>).
     * </p>
     * 
     * @param storeTaskState
     *        The state of the store task (<code>InProgress</code>, <code>Completed</code>, or <code>Failed</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoreImageTaskResult withStoreTaskState(String storeTaskState) {
        setStoreTaskState(storeTaskState);
        return this;
    }

    /**
     * <p>
     * If the tasks fails, the reason for the failure is returned. If the task succeeds, <code>null</code> is returned.
     * </p>
     * 
     * @param storeTaskFailureReason
     *        If the tasks fails, the reason for the failure is returned. If the task succeeds, <code>null</code> is
     *        returned.
     */

    public void setStoreTaskFailureReason(String storeTaskFailureReason) {
        this.storeTaskFailureReason = storeTaskFailureReason;
    }

    /**
     * <p>
     * If the tasks fails, the reason for the failure is returned. If the task succeeds, <code>null</code> is returned.
     * </p>
     * 
     * @return If the tasks fails, the reason for the failure is returned. If the task succeeds, <code>null</code> is
     *         returned.
     */

    public String getStoreTaskFailureReason() {
        return this.storeTaskFailureReason;
    }

    /**
     * <p>
     * If the tasks fails, the reason for the failure is returned. If the task succeeds, <code>null</code> is returned.
     * </p>
     * 
     * @param storeTaskFailureReason
     *        If the tasks fails, the reason for the failure is returned. If the task succeeds, <code>null</code> is
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StoreImageTaskResult withStoreTaskFailureReason(String storeTaskFailureReason) {
        setStoreTaskFailureReason(storeTaskFailureReason);
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
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getTaskStartTime() != null)
            sb.append("TaskStartTime: ").append(getTaskStartTime()).append(",");
        if (getBucket() != null)
            sb.append("Bucket: ").append(getBucket()).append(",");
        if (getS3objectKey() != null)
            sb.append("S3objectKey: ").append(getS3objectKey()).append(",");
        if (getProgressPercentage() != null)
            sb.append("ProgressPercentage: ").append(getProgressPercentage()).append(",");
        if (getStoreTaskState() != null)
            sb.append("StoreTaskState: ").append(getStoreTaskState()).append(",");
        if (getStoreTaskFailureReason() != null)
            sb.append("StoreTaskFailureReason: ").append(getStoreTaskFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StoreImageTaskResult == false)
            return false;
        StoreImageTaskResult other = (StoreImageTaskResult) obj;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getTaskStartTime() == null ^ this.getTaskStartTime() == null)
            return false;
        if (other.getTaskStartTime() != null && other.getTaskStartTime().equals(this.getTaskStartTime()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getS3objectKey() == null ^ this.getS3objectKey() == null)
            return false;
        if (other.getS3objectKey() != null && other.getS3objectKey().equals(this.getS3objectKey()) == false)
            return false;
        if (other.getProgressPercentage() == null ^ this.getProgressPercentage() == null)
            return false;
        if (other.getProgressPercentage() != null && other.getProgressPercentage().equals(this.getProgressPercentage()) == false)
            return false;
        if (other.getStoreTaskState() == null ^ this.getStoreTaskState() == null)
            return false;
        if (other.getStoreTaskState() != null && other.getStoreTaskState().equals(this.getStoreTaskState()) == false)
            return false;
        if (other.getStoreTaskFailureReason() == null ^ this.getStoreTaskFailureReason() == null)
            return false;
        if (other.getStoreTaskFailureReason() != null && other.getStoreTaskFailureReason().equals(this.getStoreTaskFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getS3objectKey() == null) ? 0 : getS3objectKey().hashCode());
        hashCode = prime * hashCode + ((getProgressPercentage() == null) ? 0 : getProgressPercentage().hashCode());
        hashCode = prime * hashCode + ((getStoreTaskState() == null) ? 0 : getStoreTaskState().hashCode());
        hashCode = prime * hashCode + ((getStoreTaskFailureReason() == null) ? 0 : getStoreTaskFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public StoreImageTaskResult clone() {
        try {
            return (StoreImageTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
