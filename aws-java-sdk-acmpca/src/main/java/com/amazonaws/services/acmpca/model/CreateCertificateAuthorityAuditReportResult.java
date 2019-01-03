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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthorityAuditReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCertificateAuthorityAuditReportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An alphanumeric string that contains a report identifier.
     * </p>
     */
    private String auditReportId;
    /**
     * <p>
     * The <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     */
    private String s3Key;

    /**
     * <p>
     * An alphanumeric string that contains a report identifier.
     * </p>
     * 
     * @param auditReportId
     *        An alphanumeric string that contains a report identifier.
     */

    public void setAuditReportId(String auditReportId) {
        this.auditReportId = auditReportId;
    }

    /**
     * <p>
     * An alphanumeric string that contains a report identifier.
     * </p>
     * 
     * @return An alphanumeric string that contains a report identifier.
     */

    public String getAuditReportId() {
        return this.auditReportId;
    }

    /**
     * <p>
     * An alphanumeric string that contains a report identifier.
     * </p>
     * 
     * @param auditReportId
     *        An alphanumeric string that contains a report identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityAuditReportResult withAuditReportId(String auditReportId) {
        setAuditReportId(auditReportId);
        return this;
    }

    /**
     * <p>
     * The <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        The <b>key</b> that uniquely identifies the report file in your S3 bucket.
     */

    public void setS3Key(String s3Key) {
        this.s3Key = s3Key;
    }

    /**
     * <p>
     * The <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     * 
     * @return The <b>key</b> that uniquely identifies the report file in your S3 bucket.
     */

    public String getS3Key() {
        return this.s3Key;
    }

    /**
     * <p>
     * The <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * </p>
     * 
     * @param s3Key
     *        The <b>key</b> that uniquely identifies the report file in your S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityAuditReportResult withS3Key(String s3Key) {
        setS3Key(s3Key);
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
        if (getAuditReportId() != null)
            sb.append("AuditReportId: ").append(getAuditReportId()).append(",");
        if (getS3Key() != null)
            sb.append("S3Key: ").append(getS3Key());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCertificateAuthorityAuditReportResult == false)
            return false;
        CreateCertificateAuthorityAuditReportResult other = (CreateCertificateAuthorityAuditReportResult) obj;
        if (other.getAuditReportId() == null ^ this.getAuditReportId() == null)
            return false;
        if (other.getAuditReportId() != null && other.getAuditReportId().equals(this.getAuditReportId()) == false)
            return false;
        if (other.getS3Key() == null ^ this.getS3Key() == null)
            return false;
        if (other.getS3Key() != null && other.getS3Key().equals(this.getS3Key()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuditReportId() == null) ? 0 : getAuditReportId().hashCode());
        hashCode = prime * hashCode + ((getS3Key() == null) ? 0 : getS3Key().hashCode());
        return hashCode;
    }

    @Override
    public CreateCertificateAuthorityAuditReportResult clone() {
        try {
            return (CreateCertificateAuthorityAuditReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
