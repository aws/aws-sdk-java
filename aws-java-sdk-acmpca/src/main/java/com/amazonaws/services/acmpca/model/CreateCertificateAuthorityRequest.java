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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/CreateCertificateAuthority" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCertificateAuthorityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject
     * information.
     * </p>
     */
    private CertificateAuthorityConfiguration certificateAuthorityConfiguration;
    /**
     * <p>
     * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of
     * the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to hide the name
     * of your bucket in the <b>CRL Distribution Points</b> extension of your CA certificate. For more information, see
     * the <a>CrlConfiguration</a> structure.
     * </p>
     */
    private RevocationConfiguration revocationConfiguration;
    /**
     * <p>
     * The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * </p>
     */
    private String certificateAuthorityType;
    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to <b>CreateCertificateAuthority</b>.
     * Idempotency tokens time out after five minutes. Therefore, if you call <b>CreateCertificateAuthority</b> multiple
     * times with the same idempotency token within a five minute period, ACM PCA recognizes that you are requesting
     * only one certificate. As a result, ACM PCA issues only one. If you change the idempotency token for each call,
     * however, ACM PCA recognizes that you are requesting multiple certificates.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject
     * information.
     * </p>
     * 
     * @param certificateAuthorityConfiguration
     *        Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate
     *        subject information.
     */

    public void setCertificateAuthorityConfiguration(CertificateAuthorityConfiguration certificateAuthorityConfiguration) {
        this.certificateAuthorityConfiguration = certificateAuthorityConfiguration;
    }

    /**
     * <p>
     * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject
     * information.
     * </p>
     * 
     * @return Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate
     *         subject information.
     */

    public CertificateAuthorityConfiguration getCertificateAuthorityConfiguration() {
        return this.certificateAuthorityConfiguration;
    }

    /**
     * <p>
     * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject
     * information.
     * </p>
     * 
     * @param certificateAuthorityConfiguration
     *        Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate
     *        subject information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityRequest withCertificateAuthorityConfiguration(CertificateAuthorityConfiguration certificateAuthorityConfiguration) {
        setCertificateAuthorityConfiguration(certificateAuthorityConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of
     * the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to hide the name
     * of your bucket in the <b>CRL Distribution Points</b> extension of your CA certificate. For more information, see
     * the <a>CrlConfiguration</a> structure.
     * </p>
     * 
     * @param revocationConfiguration
     *        Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the
     *        name of the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to
     *        hide the name of your bucket in the <b>CRL Distribution Points</b> extension of your CA certificate. For
     *        more information, see the <a>CrlConfiguration</a> structure.
     */

    public void setRevocationConfiguration(RevocationConfiguration revocationConfiguration) {
        this.revocationConfiguration = revocationConfiguration;
    }

    /**
     * <p>
     * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of
     * the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to hide the name
     * of your bucket in the <b>CRL Distribution Points</b> extension of your CA certificate. For more information, see
     * the <a>CrlConfiguration</a> structure.
     * </p>
     * 
     * @return Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the
     *         name of the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use
     *         to hide the name of your bucket in the <b>CRL Distribution Points</b> extension of your CA certificate.
     *         For more information, see the <a>CrlConfiguration</a> structure.
     */

    public RevocationConfiguration getRevocationConfiguration() {
        return this.revocationConfiguration;
    }

    /**
     * <p>
     * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of
     * the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to hide the name
     * of your bucket in the <b>CRL Distribution Points</b> extension of your CA certificate. For more information, see
     * the <a>CrlConfiguration</a> structure.
     * </p>
     * 
     * @param revocationConfiguration
     *        Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the
     *        name of the S3 bucket to which ACM PCA will write the CRL, and an optional CNAME alias that you can use to
     *        hide the name of your bucket in the <b>CRL Distribution Points</b> extension of your CA certificate. For
     *        more information, see the <a>CrlConfiguration</a> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityRequest withRevocationConfiguration(RevocationConfiguration revocationConfiguration) {
        setRevocationConfiguration(revocationConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * </p>
     * 
     * @param certificateAuthorityType
     *        The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * @see CertificateAuthorityType
     */

    public void setCertificateAuthorityType(String certificateAuthorityType) {
        this.certificateAuthorityType = certificateAuthorityType;
    }

    /**
     * <p>
     * The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * </p>
     * 
     * @return The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * @see CertificateAuthorityType
     */

    public String getCertificateAuthorityType() {
        return this.certificateAuthorityType;
    }

    /**
     * <p>
     * The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * </p>
     * 
     * @param certificateAuthorityType
     *        The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityType
     */

    public CreateCertificateAuthorityRequest withCertificateAuthorityType(String certificateAuthorityType) {
        setCertificateAuthorityType(certificateAuthorityType);
        return this;
    }

    /**
     * <p>
     * The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * </p>
     * 
     * @param certificateAuthorityType
     *        The type of the certificate authority. Currently, this must be <b>SUBORDINATE</b>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CertificateAuthorityType
     */

    public CreateCertificateAuthorityRequest withCertificateAuthorityType(CertificateAuthorityType certificateAuthorityType) {
        this.certificateAuthorityType = certificateAuthorityType.toString();
        return this;
    }

    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to <b>CreateCertificateAuthority</b>.
     * Idempotency tokens time out after five minutes. Therefore, if you call <b>CreateCertificateAuthority</b> multiple
     * times with the same idempotency token within a five minute period, ACM PCA recognizes that you are requesting
     * only one certificate. As a result, ACM PCA issues only one. If you change the idempotency token for each call,
     * however, ACM PCA recognizes that you are requesting multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Alphanumeric string that can be used to distinguish between calls to <b>CreateCertificateAuthority</b>.
     *        Idempotency tokens time out after five minutes. Therefore, if you call <b>CreateCertificateAuthority</b>
     *        multiple times with the same idempotency token within a five minute period, ACM PCA recognizes that you
     *        are requesting only one certificate. As a result, ACM PCA issues only one. If you change the idempotency
     *        token for each call, however, ACM PCA recognizes that you are requesting multiple certificates.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to <b>CreateCertificateAuthority</b>.
     * Idempotency tokens time out after five minutes. Therefore, if you call <b>CreateCertificateAuthority</b> multiple
     * times with the same idempotency token within a five minute period, ACM PCA recognizes that you are requesting
     * only one certificate. As a result, ACM PCA issues only one. If you change the idempotency token for each call,
     * however, ACM PCA recognizes that you are requesting multiple certificates.
     * </p>
     * 
     * @return Alphanumeric string that can be used to distinguish between calls to <b>CreateCertificateAuthority</b>.
     *         Idempotency tokens time out after five minutes. Therefore, if you call <b>CreateCertificateAuthority</b>
     *         multiple times with the same idempotency token within a five minute period, ACM PCA recognizes that you
     *         are requesting only one certificate. As a result, ACM PCA issues only one. If you change the idempotency
     *         token for each call, however, ACM PCA recognizes that you are requesting multiple certificates.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * Alphanumeric string that can be used to distinguish between calls to <b>CreateCertificateAuthority</b>.
     * Idempotency tokens time out after five minutes. Therefore, if you call <b>CreateCertificateAuthority</b> multiple
     * times with the same idempotency token within a five minute period, ACM PCA recognizes that you are requesting
     * only one certificate. As a result, ACM PCA issues only one. If you change the idempotency token for each call,
     * however, ACM PCA recognizes that you are requesting multiple certificates.
     * </p>
     * 
     * @param idempotencyToken
     *        Alphanumeric string that can be used to distinguish between calls to <b>CreateCertificateAuthority</b>.
     *        Idempotency tokens time out after five minutes. Therefore, if you call <b>CreateCertificateAuthority</b>
     *        multiple times with the same idempotency token within a five minute period, ACM PCA recognizes that you
     *        are requesting only one certificate. As a result, ACM PCA issues only one. If you change the idempotency
     *        token for each call, however, ACM PCA recognizes that you are requesting multiple certificates.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA.
     * </p>
     * 
     * @return Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a
     *         private CA.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a
     *        private CA.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a
     *        private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA.
     * </p>
     * 
     * @param tags
     *        Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a
     *        private CA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCertificateAuthorityRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getCertificateAuthorityConfiguration() != null)
            sb.append("CertificateAuthorityConfiguration: ").append(getCertificateAuthorityConfiguration()).append(",");
        if (getRevocationConfiguration() != null)
            sb.append("RevocationConfiguration: ").append(getRevocationConfiguration()).append(",");
        if (getCertificateAuthorityType() != null)
            sb.append("CertificateAuthorityType: ").append(getCertificateAuthorityType()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
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

        if (obj instanceof CreateCertificateAuthorityRequest == false)
            return false;
        CreateCertificateAuthorityRequest other = (CreateCertificateAuthorityRequest) obj;
        if (other.getCertificateAuthorityConfiguration() == null ^ this.getCertificateAuthorityConfiguration() == null)
            return false;
        if (other.getCertificateAuthorityConfiguration() != null
                && other.getCertificateAuthorityConfiguration().equals(this.getCertificateAuthorityConfiguration()) == false)
            return false;
        if (other.getRevocationConfiguration() == null ^ this.getRevocationConfiguration() == null)
            return false;
        if (other.getRevocationConfiguration() != null && other.getRevocationConfiguration().equals(this.getRevocationConfiguration()) == false)
            return false;
        if (other.getCertificateAuthorityType() == null ^ this.getCertificateAuthorityType() == null)
            return false;
        if (other.getCertificateAuthorityType() != null && other.getCertificateAuthorityType().equals(this.getCertificateAuthorityType()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
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

        hashCode = prime * hashCode + ((getCertificateAuthorityConfiguration() == null) ? 0 : getCertificateAuthorityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRevocationConfiguration() == null) ? 0 : getRevocationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCertificateAuthorityType() == null) ? 0 : getCertificateAuthorityType().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateCertificateAuthorityRequest clone() {
        return (CreateCertificateAuthorityRequest) super.clone();
    }

}
