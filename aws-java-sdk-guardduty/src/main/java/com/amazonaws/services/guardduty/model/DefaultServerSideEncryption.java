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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information on the server side encryption method used in the S3 bucket. See <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">S3 Server-Side Encryption</a> for
 * more information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/DefaultServerSideEncryption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DefaultServerSideEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket
     * <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     */
    private String kmsMasterKeyArn;

    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption used for objects within the S3 bucket.
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     * 
     * @return The type of encryption used for objects within the S3 bucket.
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The type of encryption used for objects within the S3 bucket.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption used for objects within the S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultServerSideEncryption withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket
     * <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     * 
     * @param kmsMasterKeyArn
     *        The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket
     *        <code>EncryptionType</code> is <code>aws:kms</code>.
     */

    public void setKmsMasterKeyArn(String kmsMasterKeyArn) {
        this.kmsMasterKeyArn = kmsMasterKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket
     * <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket
     *         <code>EncryptionType</code> is <code>aws:kms</code>.
     */

    public String getKmsMasterKeyArn() {
        return this.kmsMasterKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket
     * <code>EncryptionType</code> is <code>aws:kms</code>.
     * </p>
     * 
     * @param kmsMasterKeyArn
     *        The Amazon Resource Name (ARN) of the KMS encryption key. Only available if the bucket
     *        <code>EncryptionType</code> is <code>aws:kms</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DefaultServerSideEncryption withKmsMasterKeyArn(String kmsMasterKeyArn) {
        setKmsMasterKeyArn(kmsMasterKeyArn);
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
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType()).append(",");
        if (getKmsMasterKeyArn() != null)
            sb.append("KmsMasterKeyArn: ").append(getKmsMasterKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DefaultServerSideEncryption == false)
            return false;
        DefaultServerSideEncryption other = (DefaultServerSideEncryption) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsMasterKeyArn() == null ^ this.getKmsMasterKeyArn() == null)
            return false;
        if (other.getKmsMasterKeyArn() != null && other.getKmsMasterKeyArn().equals(this.getKmsMasterKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsMasterKeyArn() == null) ? 0 : getKmsMasterKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public DefaultServerSideEncryption clone() {
        try {
            return (DefaultServerSideEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.DefaultServerSideEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
