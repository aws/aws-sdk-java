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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/RevokeCertificate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RevokeCertificateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial
     * number by calling <a>GetCertificate</a> with the Amazon Resource Name (ARN) of the certificate you want and the
     * ARN of your private CA. The <b>GetCertificate</b> operation retrieves the certificate in the PEM format. You can
     * use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.
     * </p>
     * <p>
     * <code>openssl x509 -in <i>file_path</i> -text -noout</code>
     * </p>
     * <p>
     * You can also copy the serial number from the console or use the <a
     * href="https://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html">DescribeCertificate</a>
     * operation in the <i>AWS Certificate Manager API Reference</i>.
     * </p>
     */
    private String certificateSerial;
    /**
     * <p>
     * Specifies why you revoked the certificate.
     * </p>
     */
    private String revocationReason;

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

    public RevokeCertificateRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial
     * number by calling <a>GetCertificate</a> with the Amazon Resource Name (ARN) of the certificate you want and the
     * ARN of your private CA. The <b>GetCertificate</b> operation retrieves the certificate in the PEM format. You can
     * use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.
     * </p>
     * <p>
     * <code>openssl x509 -in <i>file_path</i> -text -noout</code>
     * </p>
     * <p>
     * You can also copy the serial number from the console or use the <a
     * href="https://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html">DescribeCertificate</a>
     * operation in the <i>AWS Certificate Manager API Reference</i>.
     * </p>
     * 
     * @param certificateSerial
     *        Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the
     *        serial number by calling <a>GetCertificate</a> with the Amazon Resource Name (ARN) of the certificate you
     *        want and the ARN of your private CA. The <b>GetCertificate</b> operation retrieves the certificate in the
     *        PEM format. You can use the following OpenSSL command to list the certificate in text format and copy the
     *        hexadecimal serial number. </p>
     *        <p>
     *        <code>openssl x509 -in <i>file_path</i> -text -noout</code>
     *        </p>
     *        <p>
     *        You can also copy the serial number from the console or use the <a
     *        href="https://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html"
     *        >DescribeCertificate</a> operation in the <i>AWS Certificate Manager API Reference</i>.
     */

    public void setCertificateSerial(String certificateSerial) {
        this.certificateSerial = certificateSerial;
    }

    /**
     * <p>
     * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial
     * number by calling <a>GetCertificate</a> with the Amazon Resource Name (ARN) of the certificate you want and the
     * ARN of your private CA. The <b>GetCertificate</b> operation retrieves the certificate in the PEM format. You can
     * use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.
     * </p>
     * <p>
     * <code>openssl x509 -in <i>file_path</i> -text -noout</code>
     * </p>
     * <p>
     * You can also copy the serial number from the console or use the <a
     * href="https://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html">DescribeCertificate</a>
     * operation in the <i>AWS Certificate Manager API Reference</i>.
     * </p>
     * 
     * @return Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the
     *         serial number by calling <a>GetCertificate</a> with the Amazon Resource Name (ARN) of the certificate you
     *         want and the ARN of your private CA. The <b>GetCertificate</b> operation retrieves the certificate in the
     *         PEM format. You can use the following OpenSSL command to list the certificate in text format and copy the
     *         hexadecimal serial number. </p>
     *         <p>
     *         <code>openssl x509 -in <i>file_path</i> -text -noout</code>
     *         </p>
     *         <p>
     *         You can also copy the serial number from the console or use the <a
     *         href="https://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html"
     *         >DescribeCertificate</a> operation in the <i>AWS Certificate Manager API Reference</i>.
     */

    public String getCertificateSerial() {
        return this.certificateSerial;
    }

    /**
     * <p>
     * Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the serial
     * number by calling <a>GetCertificate</a> with the Amazon Resource Name (ARN) of the certificate you want and the
     * ARN of your private CA. The <b>GetCertificate</b> operation retrieves the certificate in the PEM format. You can
     * use the following OpenSSL command to list the certificate in text format and copy the hexadecimal serial number.
     * </p>
     * <p>
     * <code>openssl x509 -in <i>file_path</i> -text -noout</code>
     * </p>
     * <p>
     * You can also copy the serial number from the console or use the <a
     * href="https://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html">DescribeCertificate</a>
     * operation in the <i>AWS Certificate Manager API Reference</i>.
     * </p>
     * 
     * @param certificateSerial
     *        Serial number of the certificate to be revoked. This must be in hexadecimal format. You can retrieve the
     *        serial number by calling <a>GetCertificate</a> with the Amazon Resource Name (ARN) of the certificate you
     *        want and the ARN of your private CA. The <b>GetCertificate</b> operation retrieves the certificate in the
     *        PEM format. You can use the following OpenSSL command to list the certificate in text format and copy the
     *        hexadecimal serial number. </p>
     *        <p>
     *        <code>openssl x509 -in <i>file_path</i> -text -noout</code>
     *        </p>
     *        <p>
     *        You can also copy the serial number from the console or use the <a
     *        href="https://docs.aws.amazon.com/acm/latest/APIReference/API_DescribeCertificate.html"
     *        >DescribeCertificate</a> operation in the <i>AWS Certificate Manager API Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RevokeCertificateRequest withCertificateSerial(String certificateSerial) {
        setCertificateSerial(certificateSerial);
        return this;
    }

    /**
     * <p>
     * Specifies why you revoked the certificate.
     * </p>
     * 
     * @param revocationReason
     *        Specifies why you revoked the certificate.
     * @see RevocationReason
     */

    public void setRevocationReason(String revocationReason) {
        this.revocationReason = revocationReason;
    }

    /**
     * <p>
     * Specifies why you revoked the certificate.
     * </p>
     * 
     * @return Specifies why you revoked the certificate.
     * @see RevocationReason
     */

    public String getRevocationReason() {
        return this.revocationReason;
    }

    /**
     * <p>
     * Specifies why you revoked the certificate.
     * </p>
     * 
     * @param revocationReason
     *        Specifies why you revoked the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationReason
     */

    public RevokeCertificateRequest withRevocationReason(String revocationReason) {
        setRevocationReason(revocationReason);
        return this;
    }

    /**
     * <p>
     * Specifies why you revoked the certificate.
     * </p>
     * 
     * @param revocationReason
     *        Specifies why you revoked the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RevocationReason
     */

    public RevokeCertificateRequest withRevocationReason(RevocationReason revocationReason) {
        this.revocationReason = revocationReason.toString();
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
        if (getCertificateSerial() != null)
            sb.append("CertificateSerial: ").append(getCertificateSerial()).append(",");
        if (getRevocationReason() != null)
            sb.append("RevocationReason: ").append(getRevocationReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RevokeCertificateRequest == false)
            return false;
        RevokeCertificateRequest other = (RevokeCertificateRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getCertificateSerial() == null ^ this.getCertificateSerial() == null)
            return false;
        if (other.getCertificateSerial() != null && other.getCertificateSerial().equals(this.getCertificateSerial()) == false)
            return false;
        if (other.getRevocationReason() == null ^ this.getRevocationReason() == null)
            return false;
        if (other.getRevocationReason() != null && other.getRevocationReason().equals(this.getRevocationReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateSerial() == null) ? 0 : getCertificateSerial().hashCode());
        hashCode = prime * hashCode + ((getRevocationReason() == null) ? 0 : getRevocationReason().hashCode());
        return hashCode;
    }

    @Override
    public RevokeCertificateRequest clone() {
        return (RevokeCertificateRequest) super.clone();
    }

}
