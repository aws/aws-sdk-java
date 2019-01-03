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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DescribeCertificateAuthorityAuditReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCertificateAuthorityAuditReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private CA. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * The report ID returned by calling the <a>CreateCertificateAuthorityAuditReport</a> operation.
     * </p>
     */
    private String auditReportId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private CA. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the private CA. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private CA. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the private CA. This must be of the form:</p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the private CA. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * .
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) of the private CA. This must be of the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateAuthorityAuditReportRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * The report ID returned by calling the <a>CreateCertificateAuthorityAuditReport</a> operation.
     * </p>
     * 
     * @param auditReportId
     *        The report ID returned by calling the <a>CreateCertificateAuthorityAuditReport</a> operation.
     */

    public void setAuditReportId(String auditReportId) {
        this.auditReportId = auditReportId;
    }

    /**
     * <p>
     * The report ID returned by calling the <a>CreateCertificateAuthorityAuditReport</a> operation.
     * </p>
     * 
     * @return The report ID returned by calling the <a>CreateCertificateAuthorityAuditReport</a> operation.
     */

    public String getAuditReportId() {
        return this.auditReportId;
    }

    /**
     * <p>
     * The report ID returned by calling the <a>CreateCertificateAuthorityAuditReport</a> operation.
     * </p>
     * 
     * @param auditReportId
     *        The report ID returned by calling the <a>CreateCertificateAuthorityAuditReport</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCertificateAuthorityAuditReportRequest withAuditReportId(String auditReportId) {
        setAuditReportId(auditReportId);
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
        if (getAuditReportId() != null)
            sb.append("AuditReportId: ").append(getAuditReportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCertificateAuthorityAuditReportRequest == false)
            return false;
        DescribeCertificateAuthorityAuditReportRequest other = (DescribeCertificateAuthorityAuditReportRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getAuditReportId() == null ^ this.getAuditReportId() == null)
            return false;
        if (other.getAuditReportId() != null && other.getAuditReportId().equals(this.getAuditReportId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getAuditReportId() == null) ? 0 : getAuditReportId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCertificateAuthorityAuditReportRequest clone() {
        return (DescribeCertificateAuthorityAuditReportRequest) super.clone();
    }

}
