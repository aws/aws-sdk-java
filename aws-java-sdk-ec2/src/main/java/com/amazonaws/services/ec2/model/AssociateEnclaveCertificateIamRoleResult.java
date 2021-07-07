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

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateEnclaveCertificateIamRoleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The name of the Amazon S3 bucket to which the certificate was uploaded.
     * </p>
     */
    private String certificateS3BucketName;
    /**
     * <p>
     * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are stored.
     * The object key is formatted as follows: <code>role_arn</code>/<code>certificate_arn</code>.
     * </p>
     */
    private String certificateS3ObjectKey;
    /**
     * <p>
     * The ID of the KMS key used to encrypt the private key of the certificate.
     * </p>
     */
    private String encryptionKmsKeyId;

    /**
     * <p>
     * The name of the Amazon S3 bucket to which the certificate was uploaded.
     * </p>
     * 
     * @param certificateS3BucketName
     *        The name of the Amazon S3 bucket to which the certificate was uploaded.
     */

    public void setCertificateS3BucketName(String certificateS3BucketName) {
        this.certificateS3BucketName = certificateS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to which the certificate was uploaded.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket to which the certificate was uploaded.
     */

    public String getCertificateS3BucketName() {
        return this.certificateS3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to which the certificate was uploaded.
     * </p>
     * 
     * @param certificateS3BucketName
     *        The name of the Amazon S3 bucket to which the certificate was uploaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEnclaveCertificateIamRoleResult withCertificateS3BucketName(String certificateS3BucketName) {
        setCertificateS3BucketName(certificateS3BucketName);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are stored.
     * The object key is formatted as follows: <code>role_arn</code>/<code>certificate_arn</code>.
     * </p>
     * 
     * @param certificateS3ObjectKey
     *        The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are
     *        stored. The object key is formatted as follows: <code>role_arn</code>/<code>certificate_arn</code>.
     */

    public void setCertificateS3ObjectKey(String certificateS3ObjectKey) {
        this.certificateS3ObjectKey = certificateS3ObjectKey;
    }

    /**
     * <p>
     * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are stored.
     * The object key is formatted as follows: <code>role_arn</code>/<code>certificate_arn</code>.
     * </p>
     * 
     * @return The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are
     *         stored. The object key is formatted as follows: <code>role_arn</code>/<code>certificate_arn</code>.
     */

    public String getCertificateS3ObjectKey() {
        return this.certificateS3ObjectKey;
    }

    /**
     * <p>
     * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are stored.
     * The object key is formatted as follows: <code>role_arn</code>/<code>certificate_arn</code>.
     * </p>
     * 
     * @param certificateS3ObjectKey
     *        The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are
     *        stored. The object key is formatted as follows: <code>role_arn</code>/<code>certificate_arn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEnclaveCertificateIamRoleResult withCertificateS3ObjectKey(String certificateS3ObjectKey) {
        setCertificateS3ObjectKey(certificateS3ObjectKey);
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the private key of the certificate.
     * </p>
     * 
     * @param encryptionKmsKeyId
     *        The ID of the KMS key used to encrypt the private key of the certificate.
     */

    public void setEncryptionKmsKeyId(String encryptionKmsKeyId) {
        this.encryptionKmsKeyId = encryptionKmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the private key of the certificate.
     * </p>
     * 
     * @return The ID of the KMS key used to encrypt the private key of the certificate.
     */

    public String getEncryptionKmsKeyId() {
        return this.encryptionKmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the private key of the certificate.
     * </p>
     * 
     * @param encryptionKmsKeyId
     *        The ID of the KMS key used to encrypt the private key of the certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateEnclaveCertificateIamRoleResult withEncryptionKmsKeyId(String encryptionKmsKeyId) {
        setEncryptionKmsKeyId(encryptionKmsKeyId);
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
        if (getCertificateS3BucketName() != null)
            sb.append("CertificateS3BucketName: ").append(getCertificateS3BucketName()).append(",");
        if (getCertificateS3ObjectKey() != null)
            sb.append("CertificateS3ObjectKey: ").append(getCertificateS3ObjectKey()).append(",");
        if (getEncryptionKmsKeyId() != null)
            sb.append("EncryptionKmsKeyId: ").append(getEncryptionKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateEnclaveCertificateIamRoleResult == false)
            return false;
        AssociateEnclaveCertificateIamRoleResult other = (AssociateEnclaveCertificateIamRoleResult) obj;
        if (other.getCertificateS3BucketName() == null ^ this.getCertificateS3BucketName() == null)
            return false;
        if (other.getCertificateS3BucketName() != null && other.getCertificateS3BucketName().equals(this.getCertificateS3BucketName()) == false)
            return false;
        if (other.getCertificateS3ObjectKey() == null ^ this.getCertificateS3ObjectKey() == null)
            return false;
        if (other.getCertificateS3ObjectKey() != null && other.getCertificateS3ObjectKey().equals(this.getCertificateS3ObjectKey()) == false)
            return false;
        if (other.getEncryptionKmsKeyId() == null ^ this.getEncryptionKmsKeyId() == null)
            return false;
        if (other.getEncryptionKmsKeyId() != null && other.getEncryptionKmsKeyId().equals(this.getEncryptionKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateS3BucketName() == null) ? 0 : getCertificateS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getCertificateS3ObjectKey() == null) ? 0 : getCertificateS3ObjectKey().hashCode());
        hashCode = prime * hashCode + ((getEncryptionKmsKeyId() == null) ? 0 : getEncryptionKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public AssociateEnclaveCertificateIamRoleResult clone() {
        try {
            return (AssociateEnclaveCertificateIamRoleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
