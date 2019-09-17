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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthorityAuditReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateAuthorityAuditReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether report creation is in progress, has succeeded, or has failed.
     * </p>
     */
    private String auditReportStatus;
    /**
     * <p>
     * Name of the S3 bucket that contains the report.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * S3 <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     */
    private String s3Key;
    /**
     * <p>
     * The date and time at which the report was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Specifies whether report creation is in progress, has succeeded, or has failed.
     * </p>
     * 
     * @param auditReportStatus
     *        Specifies whether report creation is in progress, has succeeded, or has failed.
     * @see AuditReportStatus
     */

    public void setAuditReportStatus(String auditReportStatus) {
        this.auditReportStatus = auditReportStatus;
    }

    /**
     * <p>
     * Specifies whether report creation is in progress, has succeeded, or has failed.
     * </p>
     * 
     * @return Specifies whether report creation is in progress, has succeeded, or has failed.
     * @see AuditReportStatus
     */

    public String getAuditReportStatus() {
        return this.auditReportStatus;
    }

    /**
     * <p>
     * Specifies whether report creation is in progress, has succeeded, or has failed.
     * </p>
     * 
     * @param auditReportStatus
     *        Specifies whether report creation is in progress, has succeeded, or has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditReportStatus
     */

    public DescribeCertificateAuthorityAuditReportResult withAuditReportStatus(String auditReportStatus) {
        setAuditReportStatus(auditReportStatus);
        return this;
    }

    /**
     * <p>
     * Specifies whether report creation is in progress, has succeeded, or has failed.
     * </p>
     * 
     * @param auditReportStatus
     *        Specifies whether report creation is in progress, has succeeded, or has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditReportStatus
     */

    public DescribeCertificateAuthorityAuditReportResult withAuditReportStatus(AuditReportStatus auditReportStatus) {
        this.auditReportStatus = auditReportStatus.toString();
        return this;
    }

    /**
     * <p>
     * Name of the S3 bucket that contains the report.
     * </p>
     * 
     * @param s3BucketName
     *        Name of the S3 bucket that contains the report.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket that contains the report.
     * </p>
     * 
     * @return Name of the S3 bucket that contains the report.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * Name of the S3 bucket that contains the report.
     * </p>
     * 
     * @param s3BucketName
     *        Name of the S3 bucket that contains the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateAuthorityAuditReportResult withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * S3 <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        S3 <b>key</b> that uniquely identifies the report file in your S3 bucket.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * S3 <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     * 
     * @return S3 <b>key</b> that uniquely identifies the report file in your S3 bucket.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * S3 <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        S3 <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateAuthorityAuditReportResult withS3Key(String s3Key) {
        setS3Key(s3Key);
        return this;
    }

    /**
     * <p>
     * The date and time at which the report was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time at which the report was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time at which the report was created.
     * </p>
     * 
     * @return The date and time at which the report was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time at which the report was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time at which the report was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateAuthorityAuditReportResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getAuditReportStatus() != null)
            sb.append("AuditReportStatus: ").append(getAuditReportStatus()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateAuthorityAuditReportResult == false)
            return false;
        DescribeCertificateAuthorityAuditReportResult other = (DescribeCertificateAuthorityAuditReportResult) obj;
        if (other.getAuditReportStatus() == null ^ this.getAuditReportStatus() == null)
            return false;
        if (other.getAuditReportStatus() != null && other.getAuditReportStatus().equals(this.getAuditReportStatus()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuditReportStatus() == null) ? 0 : getAuditReportStatus().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateAuthorityAuditReportResult clone() {
        try {
            return (DescribeCertificateAuthorityAuditReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
