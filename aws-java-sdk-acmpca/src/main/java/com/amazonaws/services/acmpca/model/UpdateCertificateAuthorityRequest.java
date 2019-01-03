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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/UpdateCertificateAuthority" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateCertificateAuthorityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * Revocation information for your private CA.
     * </p>
     */
    private RevocationConfiguration revocationConfiguration;
    /**
     * <p>
     * Status of your private CA.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of
     *        the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of
     *         the form:</p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        Amazon Resource Name (ARN) of the private CA that issued the certificate to be revoked. This must be of
     *        the form:</p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCertificateAuthorityRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * Revocation information for your private CA.
     * </p>
     * 
     * @param revocationConfiguration
     *        Revocation information for your private CA.
     */

    public void setRevocationConfiguration(RevocationConfiguration revocationConfiguration) {
        this.revocationConfiguration = revocationConfiguration;
    }

    /**
     * <p>
     * Revocation information for your private CA.
     * </p>
     * 
     * @return Revocation information for your private CA.
     */

    public RevocationConfiguration getRevocationConfiguration() {
        return this.revocationConfiguration;
    }

    /**
     * <p>
     * Revocation information for your private CA.
     * </p>
     * 
     * @param revocationConfiguration
     *        Revocation information for your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateCertificateAuthorityRequest withRevocationConfiguration(RevocationConfiguration revocationConfiguration) {
        setRevocationConfiguration(revocationConfiguration);
        return this;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @param status
     *        Status of your private CA.
     * @see CertificateAuthorityStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @return Status of your private CA.
     * @see CertificateAuthorityStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @param status
     *        Status of your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityStatus
     */

    public UpdateCertificateAuthorityRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of your private CA.
     * </p>
     * 
     * @param status
     *        Status of your private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityStatus
     */

    public UpdateCertificateAuthorityRequest withStatus(CertificateAuthorityStatus status) {
        this.status = status.toString();
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
        if (getRevocationConfiguration() != null)
            sb.append("RevocationConfiguration: ").append(getRevocationConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCertificateAuthorityRequest == false)
            return false;
        UpdateCertificateAuthorityRequest other = (UpdateCertificateAuthorityRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getRevocationConfiguration() == null ^ this.getRevocationConfiguration() == null)
            return false;
        if (other.getRevocationConfiguration() != null && other.getRevocationConfiguration().equals(this.getRevocationConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getRevocationConfiguration() == null) ? 0 : getRevocationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateCertificateAuthorityRequest clone() {
        return (UpdateCertificateAuthorityRequest) super.clone();
    }

}
