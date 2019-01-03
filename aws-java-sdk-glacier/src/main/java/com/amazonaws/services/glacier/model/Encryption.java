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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the encryption used to store the job results in Amazon S3.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Encryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in Amazon S3, for example <code>AES256</code>
     * or <code>aws:kms</code>.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail
     * if not made by using Secure Sockets Layer (SSL) or Signature Version 4.
     * </p>
     */
    private String kMSKeyId;
    /**
     * <p>
     * Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption
     * context for the job results.
     * </p>
     */
    private String kMSContext;

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in Amazon S3, for example <code>AES256</code>
     * or <code>aws:kms</code>.
     * </p>
     * 
     * @param encryptionType
     *        The server-side encryption algorithm used when storing job results in Amazon S3, for example
     *        <code>AES256</code> or <code>aws:kms</code>.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in Amazon S3, for example <code>AES256</code>
     * or <code>aws:kms</code>.
     * </p>
     * 
     * @return The server-side encryption algorithm used when storing job results in Amazon S3, for example
     *         <code>AES256</code> or <code>aws:kms</code>.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in Amazon S3, for example <code>AES256</code>
     * or <code>aws:kms</code>.
     * </p>
     * 
     * @param encryptionType
     *        The server-side encryption algorithm used when storing job results in Amazon S3, for example
     *        <code>AES256</code> or <code>aws:kms</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public Encryption withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The server-side encryption algorithm used when storing job results in Amazon S3, for example <code>AES256</code>
     * or <code>aws:kms</code>.
     * </p>
     * 
     * @param encryptionType
     *        The server-side encryption algorithm used when storing job results in Amazon S3, for example
     *        <code>AES256</code> or <code>aws:kms</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public Encryption withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail
     * if not made by using Secure Sockets Layer (SSL) or Signature Version 4.
     * </p>
     * 
     * @param kMSKeyId
     *        The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS
     *        KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4.
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail
     * if not made by using Secure Sockets Layer (SSL) or Signature Version 4.
     * </p>
     * 
     * @return The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS
     *         KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4.
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail
     * if not made by using Secure Sockets Layer (SSL) or Signature Version 4.
     * </p>
     * 
     * @param kMSKeyId
     *        The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS
     *        KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * <p>
     * Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption
     * context for the job results.
     * </p>
     * 
     * @param kMSContext
     *        Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption
     *        context for the job results.
     */

    public void setKMSContext(String kMSContext) {
        this.kMSContext = kMSContext;
    }

    /**
     * <p>
     * Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption
     * context for the job results.
     * </p>
     * 
     * @return Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the
     *         encryption context for the job results.
     */

    public String getKMSContext() {
        return this.kMSContext;
    }

    /**
     * <p>
     * Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption
     * context for the job results.
     * </p>
     * 
     * @param kMSContext
     *        Optional. If the encryption type is <code>aws:kms</code>, you can use this value to specify the encryption
     *        context for the job results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Encryption withKMSContext(String kMSContext) {
        setKMSContext(kMSContext);
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
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getKMSContext() != null)
            sb.append("KMSContext: ").append(getKMSContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Encryption == false)
            return false;
        Encryption other = (Encryption) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getKMSContext() == null ^ this.getKMSContext() == null)
            return false;
        if (other.getKMSContext() != null && other.getKMSContext().equals(this.getKMSContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getKMSContext() == null) ? 0 : getKMSContext().hashCode());
        return hashCode;
    }

    @Override
    public Encryption clone() {
        try {
            return (Encryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glacier.model.transform.EncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
