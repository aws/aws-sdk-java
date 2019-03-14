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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthorityAuditReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCertificateAuthorityAuditReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The name of the S3 bucket that will contain the audit report.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * </p>
     */
    private String auditReportResponseFormat;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:</p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the CA to be audited. This is of the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityAuditReportRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The name of the S3 bucket that will contain the audit report.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket that will contain the audit report.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket that will contain the audit report.
     * </p>
     * 
     * @return The name of the S3 bucket that will contain the audit report.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the S3 bucket that will contain the audit report.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the S3 bucket that will contain the audit report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityAuditReportRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * </p>
     * 
     * @param auditReportResponseFormat
     *        The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * @see AuditReportResponseFormat
     */

    public void setAuditReportResponseFormat(String auditReportResponseFormat) {
        this.auditReportResponseFormat = auditReportResponseFormat;
    }

    /**
     * <p>
     * The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * </p>
     * 
     * @return The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * @see AuditReportResponseFormat
     */

    public String getAuditReportResponseFormat() {
        return this.auditReportResponseFormat;
    }

    /**
     * <p>
     * The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * </p>
     * 
     * @param auditReportResponseFormat
     *        The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditReportResponseFormat
     */

    public CreateCertificateAuthorityAuditReportRequest withAuditReportResponseFormat(String auditReportResponseFormat) {
        setAuditReportResponseFormat(auditReportResponseFormat);
        return this;
    }

    /**
     * <p>
     * The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * </p>
     * 
     * @param auditReportResponseFormat
     *        The format in which to create the report. This can be either <b>JSON</b> or <b>CSV</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuditReportResponseFormat
     */

    public CreateCertificateAuthorityAuditReportRequest withAuditReportResponseFormat(AuditReportResponseFormat auditReportResponseFormat) {
        this.auditReportResponseFormat = auditReportResponseFormat.toString();
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getAuditReportResponseFormat() != null)
            sb.append("AuditReportResponseFormat: ").append(getAuditReportResponseFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCertificateAuthorityAuditReportRequest == false)
            return false;
        CreateCertificateAuthorityAuditReportRequest other = (CreateCertificateAuthorityAuditReportRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getAuditReportResponseFormat() == null ^ this.getAuditReportResponseFormat() == null)
            return false;
        if (other.getAuditReportResponseFormat() != null && other.getAuditReportResponseFormat().equals(this.getAuditReportResponseFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getAuditReportResponseFormat() == null) ? 0 : getAuditReportResponseFormat().hashCode());
        return hashCode;
    }

    @Override
    public CreateCertificateAuthorityAuditReportRequest clone() {
        return (CreateCertificateAuthorityAuditReportRequest) super.clone();
    }

}
