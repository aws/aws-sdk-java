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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/DescribeMailboxExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMailboxExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     */
    private String entityId;
    /**
     * <p>
     * The mailbox export job description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon Simple
     * Storage Service (Amazon S3) bucket.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     */
    private String s3Prefix;
    /**
     * <p>
     * The path to the S3 bucket and file that the mailbox export job is exporting to.
     * </p>
     */
    private String s3Path;
    /**
     * <p>
     * The estimated progress of the mailbox export job, in percentage points.
     * </p>
     */
    private Integer estimatedProgress;
    /**
     * <p>
     * The state of the mailbox export job.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Error information for failed mailbox export jobs.
     * </p>
     */
    private String errorInfo;
    /**
     * <p>
     * The mailbox export job start timestamp.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The mailbox export job end timestamp.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user or resource associated with the mailbox.
     */

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     * 
     * @return The identifier of the user or resource associated with the mailbox.
     */

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * <p>
     * The identifier of the user or resource associated with the mailbox.
     * </p>
     * 
     * @param entityId
     *        The identifier of the user or resource associated with the mailbox.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withEntityId(String entityId) {
        setEntityId(entityId);
        return this;
    }

    /**
     * <p>
     * The mailbox export job description.
     * </p>
     * 
     * @param description
     *        The mailbox export job description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The mailbox export job description.
     * </p>
     * 
     * @return The mailbox export job description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The mailbox export job description.
     * </p>
     * 
     * @param description
     *        The mailbox export job description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon Simple
     * Storage Service (Amazon S3) bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon
     *        Simple Storage Service (Amazon S3) bucket.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon Simple
     * Storage Service (Amazon S3) bucket.
     * </p>
     * 
     * @return The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon
     *         Simple Storage Service (Amazon S3) bucket.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon Simple
     * Storage Service (Amazon S3) bucket.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the AWS Identity and Access Management (IAM) role that grants write permission to the Amazon
     *        Simple Storage Service (Amazon S3) bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     *        exported mailbox content.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts
     *         the exported mailbox content.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     * exported mailbox content.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the symmetric AWS Key Management Service (AWS KMS) key that encrypts the
     *        exported mailbox content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @return The name of the S3 bucket.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 bucket prefix.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @return The S3 bucket prefix.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The S3 bucket prefix.
     * </p>
     * 
     * @param s3Prefix
     *        The S3 bucket prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * <p>
     * The path to the S3 bucket and file that the mailbox export job is exporting to.
     * </p>
     * 
     * @param s3Path
     *        The path to the S3 bucket and file that the mailbox export job is exporting to.
     */

    public void setS3Path(String s3Path) {
        this.s3Path = s3Path;
    }

    /**
     * <p>
     * The path to the S3 bucket and file that the mailbox export job is exporting to.
     * </p>
     * 
     * @return The path to the S3 bucket and file that the mailbox export job is exporting to.
     */

    public String getS3Path() {
        return this.s3Path;
    }

    /**
     * <p>
     * The path to the S3 bucket and file that the mailbox export job is exporting to.
     * </p>
     * 
     * @param s3Path
     *        The path to the S3 bucket and file that the mailbox export job is exporting to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withS3Path(String s3Path) {
        setS3Path(s3Path);
        return this;
    }

    /**
     * <p>
     * The estimated progress of the mailbox export job, in percentage points.
     * </p>
     * 
     * @param estimatedProgress
     *        The estimated progress of the mailbox export job, in percentage points.
     */

    public void setEstimatedProgress(Integer estimatedProgress) {
        this.estimatedProgress = estimatedProgress;
    }

    /**
     * <p>
     * The estimated progress of the mailbox export job, in percentage points.
     * </p>
     * 
     * @return The estimated progress of the mailbox export job, in percentage points.
     */

    public Integer getEstimatedProgress() {
        return this.estimatedProgress;
    }

    /**
     * <p>
     * The estimated progress of the mailbox export job, in percentage points.
     * </p>
     * 
     * @param estimatedProgress
     *        The estimated progress of the mailbox export job, in percentage points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withEstimatedProgress(Integer estimatedProgress) {
        setEstimatedProgress(estimatedProgress);
        return this;
    }

    /**
     * <p>
     * The state of the mailbox export job.
     * </p>
     * 
     * @param state
     *        The state of the mailbox export job.
     * @see MailboxExportJobState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the mailbox export job.
     * </p>
     * 
     * @return The state of the mailbox export job.
     * @see MailboxExportJobState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the mailbox export job.
     * </p>
     * 
     * @param state
     *        The state of the mailbox export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailboxExportJobState
     */

    public DescribeMailboxExportJobResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the mailbox export job.
     * </p>
     * 
     * @param state
     *        The state of the mailbox export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MailboxExportJobState
     */

    public DescribeMailboxExportJobResult withState(MailboxExportJobState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Error information for failed mailbox export jobs.
     * </p>
     * 
     * @param errorInfo
     *        Error information for failed mailbox export jobs.
     */

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Error information for failed mailbox export jobs.
     * </p>
     * 
     * @return Error information for failed mailbox export jobs.
     */

    public String getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Error information for failed mailbox export jobs.
     * </p>
     * 
     * @param errorInfo
     *        Error information for failed mailbox export jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withErrorInfo(String errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * <p>
     * The mailbox export job start timestamp.
     * </p>
     * 
     * @param startTime
     *        The mailbox export job start timestamp.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The mailbox export job start timestamp.
     * </p>
     * 
     * @return The mailbox export job start timestamp.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The mailbox export job start timestamp.
     * </p>
     * 
     * @param startTime
     *        The mailbox export job start timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The mailbox export job end timestamp.
     * </p>
     * 
     * @param endTime
     *        The mailbox export job end timestamp.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The mailbox export job end timestamp.
     * </p>
     * 
     * @return The mailbox export job end timestamp.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The mailbox export job end timestamp.
     * </p>
     * 
     * @param endTime
     *        The mailbox export job end timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMailboxExportJobResult withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getEntityId() != null)
            sb.append("EntityId: ").append(getEntityId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix()).append(",");
        if (getS3Path() != null)
            sb.append("S3Path: ").append(getS3Path()).append(",");
        if (getEstimatedProgress() != null)
            sb.append("EstimatedProgress: ").append(getEstimatedProgress()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMailboxExportJobResult == false)
            return false;
        DescribeMailboxExportJobResult other = (DescribeMailboxExportJobResult) obj;
        if (other.getEntityId() == null ^ this.getEntityId() == null)
            return false;
        if (other.getEntityId() != null && other.getEntityId().equals(this.getEntityId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getS3Path() == null ^ this.getS3Path() == null)
            return false;
        if (other.getS3Path() != null && other.getS3Path().equals(this.getS3Path()) == false)
            return false;
        if (other.getEstimatedProgress() == null ^ this.getEstimatedProgress() == null)
            return false;
        if (other.getEstimatedProgress() != null && other.getEstimatedProgress().equals(this.getEstimatedProgress()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityId() == null) ? 0 : getEntityId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getS3Path() == null) ? 0 : getS3Path().hashCode());
        hashCode = prime * hashCode + ((getEstimatedProgress() == null) ? 0 : getEstimatedProgress().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMailboxExportJobResult clone() {
        try {
            return (DescribeMailboxExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
