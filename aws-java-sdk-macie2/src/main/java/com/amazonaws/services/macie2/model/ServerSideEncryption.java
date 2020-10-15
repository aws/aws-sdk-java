/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the server-side encryption settings for an S3 bucket or S3 object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ServerSideEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServerSideEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is
     * disabled for the bucket or object, this value is NONE.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket
     * or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
     * </p>
     */
    private String kmsMasterKeyId;

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is
     * disabled for the bucket or object, this value is NONE.
     * </p>
     * 
     * @param encryptionType
     *        The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption
     *        is disabled for the bucket or object, this value is NONE.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is
     * disabled for the bucket or object, this value is NONE.
     * </p>
     * 
     * @return The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption
     *         is disabled for the bucket or object, this value is NONE.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is
     * disabled for the bucket or object, this value is NONE.
     * </p>
     * 
     * @param encryptionType
     *        The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption
     *        is disabled for the bucket or object, this value is NONE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public ServerSideEncryption withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption is
     * disabled for the bucket or object, this value is NONE.
     * </p>
     * 
     * @param encryptionType
     *        The server-side encryption algorithm that's used when storing data in the bucket or object. If encryption
     *        is disabled for the bucket or object, this value is NONE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public ServerSideEncryption withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket
     * or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the
     *        bucket or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
     */

    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket
     * or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
     * </p>
     * 
     * @return The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the
     *         bucket or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
     */

    public String getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }

    /**
     * <p>
     * The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the bucket
     * or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The unique identifier for the AWS Key Management Service (AWS KMS) master key that's used to encrypt the
     *        bucket or object. This value is null if AWS KMS isn't used to encrypt the bucket or object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServerSideEncryption withKmsMasterKeyId(String kmsMasterKeyId) {
        setKmsMasterKeyId(kmsMasterKeyId);
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
        if (getKmsMasterKeyId() != null)
            sb.append("KmsMasterKeyId: ").append(getKmsMasterKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServerSideEncryption == false)
            return false;
        ServerSideEncryption other = (ServerSideEncryption) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        return hashCode;
    }

    @Override
    public ServerSideEncryption clone() {
        try {
            return (ServerSideEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ServerSideEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
