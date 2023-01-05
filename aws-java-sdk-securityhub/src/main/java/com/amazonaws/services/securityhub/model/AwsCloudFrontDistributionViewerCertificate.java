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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the TLS/SSL configuration that the CloudFront distribution uses to communicate with
 * viewers.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsCloudFrontDistributionViewerCertificate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudFrontDistributionViewerCertificate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM certificate ARN,
     * you must also provide <code>MinimumCertificateVersion</code> and <code>SslSupportMethod</code>.
     * </p>
     */
    private String acmCertificateArn;
    /**
     * <p>
     * The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The source of the certificate identified by <code>Certificate</code>. Note that in CloudFront, this attribute is
     * deprecated.
     * </p>
     */
    private String certificateSource;
    /**
     * <p>
     * Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide either
     * <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     * </p>
     */
    private Boolean cloudFrontDefaultCertificate;
    /**
     * <p>
     * The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide
     * <code>IamCertificateId</code>, then you also must provide <code>MinimumProtocolVersion</code> and
     * <code>SslSupportMethod</code>.
     * </p>
     */
    private String iamCertificateId;
    /**
     * <p>
     * The security policy that CloudFront uses for HTTPS connections with viewers. If <code>SslSupportMethod</code> is
     * <code>sni-only</code>, then <code>MinimumProtocolVersion</code> must be <code>TLSv1</code> or higher.
     * </p>
     */
    private String minimumProtocolVersion;
    /**
     * <p>
     * The viewers that the distribution accepts HTTPS connections from.
     * </p>
     */
    private String sslSupportMethod;

    /**
     * <p>
     * The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM certificate ARN,
     * you must also provide <code>MinimumCertificateVersion</code> and <code>SslSupportMethod</code>.
     * </p>
     * 
     * @param acmCertificateArn
     *        The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM
     *        certificate ARN, you must also provide <code>MinimumCertificateVersion</code> and
     *        <code>SslSupportMethod</code>.
     */

    public void setAcmCertificateArn(String acmCertificateArn) {
        this.acmCertificateArn = acmCertificateArn;
    }

    /**
     * <p>
     * The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM certificate ARN,
     * you must also provide <code>MinimumCertificateVersion</code> and <code>SslSupportMethod</code>.
     * </p>
     * 
     * @return The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM
     *         certificate ARN, you must also provide <code>MinimumCertificateVersion</code> and
     *         <code>SslSupportMethod</code>.
     */

    public String getAcmCertificateArn() {
        return this.acmCertificateArn;
    }

    /**
     * <p>
     * The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM certificate ARN,
     * you must also provide <code>MinimumCertificateVersion</code> and <code>SslSupportMethod</code>.
     * </p>
     * 
     * @param acmCertificateArn
     *        The ARN of the ACM certificate. Used if the certificate is stored in ACM. If you provide an ACM
     *        certificate ARN, you must also provide <code>MinimumCertificateVersion</code> and
     *        <code>SslSupportMethod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionViewerCertificate withAcmCertificateArn(String acmCertificateArn) {
        setAcmCertificateArn(acmCertificateArn);
        return this;
    }

    /**
     * <p>
     * The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
     * </p>
     * 
     * @param certificate
     *        The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
     * </p>
     * 
     * @return The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
     * </p>
     * 
     * @param certificate
     *        The identifier of the certificate. Note that in CloudFront, this attribute is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionViewerCertificate withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The source of the certificate identified by <code>Certificate</code>. Note that in CloudFront, this attribute is
     * deprecated.
     * </p>
     * 
     * @param certificateSource
     *        The source of the certificate identified by <code>Certificate</code>. Note that in CloudFront, this
     *        attribute is deprecated.
     */

    public void setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
    }

    /**
     * <p>
     * The source of the certificate identified by <code>Certificate</code>. Note that in CloudFront, this attribute is
     * deprecated.
     * </p>
     * 
     * @return The source of the certificate identified by <code>Certificate</code>. Note that in CloudFront, this
     *         attribute is deprecated.
     */

    public String getCertificateSource() {
        return this.certificateSource;
    }

    /**
     * <p>
     * The source of the certificate identified by <code>Certificate</code>. Note that in CloudFront, this attribute is
     * deprecated.
     * </p>
     * 
     * @param certificateSource
     *        The source of the certificate identified by <code>Certificate</code>. Note that in CloudFront, this
     *        attribute is deprecated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionViewerCertificate withCertificateSource(String certificateSource) {
        setCertificateSource(certificateSource);
        return this;
    }

    /**
     * <p>
     * Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide either
     * <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide
     *        either <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     */

    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide either
     * <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     * </p>
     * 
     * @return Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide
     *         either <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     */

    public Boolean getCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide either
     * <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     * </p>
     * 
     * @param cloudFrontDefaultCertificate
     *        Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide
     *        either <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        setCloudFrontDefaultCertificate(cloudFrontDefaultCertificate);
        return this;
    }

    /**
     * <p>
     * Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide either
     * <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     * </p>
     * 
     * @return Whether the distribution uses the CloudFront domain name. If set to <code>false</code>, then you provide
     *         either <code>AcmCertificateArn</code> or <code>IamCertificateId</code>.
     */

    public Boolean isCloudFrontDefaultCertificate() {
        return this.cloudFrontDefaultCertificate;
    }

    /**
     * <p>
     * The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide
     * <code>IamCertificateId</code>, then you also must provide <code>MinimumProtocolVersion</code> and
     * <code>SslSupportMethod</code>.
     * </p>
     * 
     * @param iamCertificateId
     *        The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide
     *        <code>IamCertificateId</code>, then you also must provide <code>MinimumProtocolVersion</code> and
     *        <code>SslSupportMethod</code>.
     */

    public void setIamCertificateId(String iamCertificateId) {
        this.iamCertificateId = iamCertificateId;
    }

    /**
     * <p>
     * The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide
     * <code>IamCertificateId</code>, then you also must provide <code>MinimumProtocolVersion</code> and
     * <code>SslSupportMethod</code>.
     * </p>
     * 
     * @return The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide
     *         <code>IamCertificateId</code>, then you also must provide <code>MinimumProtocolVersion</code> and
     *         <code>SslSupportMethod</code>.
     */

    public String getIamCertificateId() {
        return this.iamCertificateId;
    }

    /**
     * <p>
     * The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide
     * <code>IamCertificateId</code>, then you also must provide <code>MinimumProtocolVersion</code> and
     * <code>SslSupportMethod</code>.
     * </p>
     * 
     * @param iamCertificateId
     *        The identifier of the IAM certificate. Used if the certificate is stored in IAM. If you provide
     *        <code>IamCertificateId</code>, then you also must provide <code>MinimumProtocolVersion</code> and
     *        <code>SslSupportMethod</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionViewerCertificate withIamCertificateId(String iamCertificateId) {
        setIamCertificateId(iamCertificateId);
        return this;
    }

    /**
     * <p>
     * The security policy that CloudFront uses for HTTPS connections with viewers. If <code>SslSupportMethod</code> is
     * <code>sni-only</code>, then <code>MinimumProtocolVersion</code> must be <code>TLSv1</code> or higher.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        The security policy that CloudFront uses for HTTPS connections with viewers. If
     *        <code>SslSupportMethod</code> is <code>sni-only</code>, then <code>MinimumProtocolVersion</code> must be
     *        <code>TLSv1</code> or higher.
     */

    public void setMinimumProtocolVersion(String minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    /**
     * <p>
     * The security policy that CloudFront uses for HTTPS connections with viewers. If <code>SslSupportMethod</code> is
     * <code>sni-only</code>, then <code>MinimumProtocolVersion</code> must be <code>TLSv1</code> or higher.
     * </p>
     * 
     * @return The security policy that CloudFront uses for HTTPS connections with viewers. If
     *         <code>SslSupportMethod</code> is <code>sni-only</code>, then <code>MinimumProtocolVersion</code> must be
     *         <code>TLSv1</code> or higher.
     */

    public String getMinimumProtocolVersion() {
        return this.minimumProtocolVersion;
    }

    /**
     * <p>
     * The security policy that CloudFront uses for HTTPS connections with viewers. If <code>SslSupportMethod</code> is
     * <code>sni-only</code>, then <code>MinimumProtocolVersion</code> must be <code>TLSv1</code> or higher.
     * </p>
     * 
     * @param minimumProtocolVersion
     *        The security policy that CloudFront uses for HTTPS connections with viewers. If
     *        <code>SslSupportMethod</code> is <code>sni-only</code>, then <code>MinimumProtocolVersion</code> must be
     *        <code>TLSv1</code> or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionViewerCertificate withMinimumProtocolVersion(String minimumProtocolVersion) {
        setMinimumProtocolVersion(minimumProtocolVersion);
        return this;
    }

    /**
     * <p>
     * The viewers that the distribution accepts HTTPS connections from.
     * </p>
     * 
     * @param sslSupportMethod
     *        The viewers that the distribution accepts HTTPS connections from.
     */

    public void setSslSupportMethod(String sslSupportMethod) {
        this.sslSupportMethod = sslSupportMethod;
    }

    /**
     * <p>
     * The viewers that the distribution accepts HTTPS connections from.
     * </p>
     * 
     * @return The viewers that the distribution accepts HTTPS connections from.
     */

    public String getSslSupportMethod() {
        return this.sslSupportMethod;
    }

    /**
     * <p>
     * The viewers that the distribution accepts HTTPS connections from.
     * </p>
     * 
     * @param sslSupportMethod
     *        The viewers that the distribution accepts HTTPS connections from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsCloudFrontDistributionViewerCertificate withSslSupportMethod(String sslSupportMethod) {
        setSslSupportMethod(sslSupportMethod);
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
        if (getAcmCertificateArn() != null)
            sb.append("AcmCertificateArn: ").append(getAcmCertificateArn()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getCertificateSource() != null)
            sb.append("CertificateSource: ").append(getCertificateSource()).append(",");
        if (getCloudFrontDefaultCertificate() != null)
            sb.append("CloudFrontDefaultCertificate: ").append(getCloudFrontDefaultCertificate()).append(",");
        if (getIamCertificateId() != null)
            sb.append("IamCertificateId: ").append(getIamCertificateId()).append(",");
        if (getMinimumProtocolVersion() != null)
            sb.append("MinimumProtocolVersion: ").append(getMinimumProtocolVersion()).append(",");
        if (getSslSupportMethod() != null)
            sb.append("SslSupportMethod: ").append(getSslSupportMethod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsCloudFrontDistributionViewerCertificate == false)
            return false;
        AwsCloudFrontDistributionViewerCertificate other = (AwsCloudFrontDistributionViewerCertificate) obj;
        if (other.getAcmCertificateArn() == null ^ this.getAcmCertificateArn() == null)
            return false;
        if (other.getAcmCertificateArn() != null && other.getAcmCertificateArn().equals(this.getAcmCertificateArn()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getCertificateSource() == null ^ this.getCertificateSource() == null)
            return false;
        if (other.getCertificateSource() != null && other.getCertificateSource().equals(this.getCertificateSource()) == false)
            return false;
        if (other.getCloudFrontDefaultCertificate() == null ^ this.getCloudFrontDefaultCertificate() == null)
            return false;
        if (other.getCloudFrontDefaultCertificate() != null && other.getCloudFrontDefaultCertificate().equals(this.getCloudFrontDefaultCertificate()) == false)
            return false;
        if (other.getIamCertificateId() == null ^ this.getIamCertificateId() == null)
            return false;
        if (other.getIamCertificateId() != null && other.getIamCertificateId().equals(this.getIamCertificateId()) == false)
            return false;
        if (other.getMinimumProtocolVersion() == null ^ this.getMinimumProtocolVersion() == null)
            return false;
        if (other.getMinimumProtocolVersion() != null && other.getMinimumProtocolVersion().equals(this.getMinimumProtocolVersion()) == false)
            return false;
        if (other.getSslSupportMethod() == null ^ this.getSslSupportMethod() == null)
            return false;
        if (other.getSslSupportMethod() != null && other.getSslSupportMethod().equals(this.getSslSupportMethod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcmCertificateArn() == null) ? 0 : getAcmCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getCertificateSource() == null) ? 0 : getCertificateSource().hashCode());
        hashCode = prime * hashCode + ((getCloudFrontDefaultCertificate() == null) ? 0 : getCloudFrontDefaultCertificate().hashCode());
        hashCode = prime * hashCode + ((getIamCertificateId() == null) ? 0 : getIamCertificateId().hashCode());
        hashCode = prime * hashCode + ((getMinimumProtocolVersion() == null) ? 0 : getMinimumProtocolVersion().hashCode());
        hashCode = prime * hashCode + ((getSslSupportMethod() == null) ? 0 : getSslSupportMethod().hashCode());
        return hashCode;
    }

    @Override
    public AwsCloudFrontDistributionViewerCertificate clone() {
        try {
            return (AwsCloudFrontDistributionViewerCertificate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsCloudFrontDistributionViewerCertificateMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
