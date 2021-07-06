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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the default server-side encryption settings for an S3 bucket. For detailed information
 * about these settings, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-encryption.html">Setting default server-side
 * encryption behavior for Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketServerSideEncryption" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketServerSideEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or unique identifier (key ID) for the Key Management Service (KMS) customer master
     * key (CMK) that's used by default to encrypt objects that are added to the bucket. This value is null if the
     * bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't encrypt new objects by default.
     * </p>
     */
    private String kmsMasterKeyId;
    /**
     * <p>
     * The type of server-side encryption that's used by default when storing new objects in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption (SSE-S3).
     * </p>
     * </li>
     * <li>
     * <p>
     * aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use Amazon Web
     * Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or unique identifier (key ID) for the Key Management Service (KMS) customer master
     * key (CMK) that's used by default to encrypt objects that are added to the bucket. This value is null if the
     * bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't encrypt new objects by default.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The Amazon Resource Name (ARN) or unique identifier (key ID) for the Key Management Service (KMS) customer
     *        master key (CMK) that's used by default to encrypt objects that are added to the bucket. This value is
     *        null if the bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't encrypt new
     *        objects by default.
     */

    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or unique identifier (key ID) for the Key Management Service (KMS) customer master
     * key (CMK) that's used by default to encrypt objects that are added to the bucket. This value is null if the
     * bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't encrypt new objects by default.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or unique identifier (key ID) for the Key Management Service (KMS)
     *         customer master key (CMK) that's used by default to encrypt objects that are added to the bucket. This
     *         value is null if the bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't
     *         encrypt new objects by default.
     */

    public String getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or unique identifier (key ID) for the Key Management Service (KMS) customer master
     * key (CMK) that's used by default to encrypt objects that are added to the bucket. This value is null if the
     * bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't encrypt new objects by default.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The Amazon Resource Name (ARN) or unique identifier (key ID) for the Key Management Service (KMS) customer
     *        master key (CMK) that's used by default to encrypt objects that are added to the bucket. This value is
     *        null if the bucket uses an Amazon S3 managed key to encrypt new objects or the bucket doesn't encrypt new
     *        objects by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketServerSideEncryption withKmsMasterKeyId(String kmsMasterKeyId) {
        setKmsMasterKeyId(kmsMasterKeyId);
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that's used by default when storing new objects in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption (SSE-S3).
     * </p>
     * </li>
     * <li>
     * <p>
     * aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use Amazon Web
     * Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of server-side encryption that's used by default when storing new objects in the bucket. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption
     *        (SSE-S3).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use
     *        Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     *        </p>
     *        </li>
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of server-side encryption that's used by default when storing new objects in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption (SSE-S3).
     * </p>
     * </li>
     * <li>
     * <p>
     * aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use Amazon Web
     * Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of server-side encryption that's used by default when storing new objects in the bucket.
     *         Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption
     *         (SSE-S3).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use
     *         Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     *         </p>
     *         </li>
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of server-side encryption that's used by default when storing new objects in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption (SSE-S3).
     * </p>
     * </li>
     * <li>
     * <p>
     * aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use Amazon Web
     * Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of server-side encryption that's used by default when storing new objects in the bucket. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption
     *        (SSE-S3).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use
     *        Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public BucketServerSideEncryption withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of server-side encryption that's used by default when storing new objects in the bucket. Possible values
     * are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption (SSE-S3).
     * </p>
     * </li>
     * <li>
     * <p>
     * aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use Amazon Web
     * Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     * </p>
     * </li>
     * <li>
     * <p>
     * NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of server-side encryption that's used by default when storing new objects in the bucket. Possible
     *        values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AES256 - New objects are encrypted with an Amazon S3 managed key and use Amazon S3 managed encryption
     *        (SSE-S3).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        aws:kms - New objects are encrypted with an KMS CMK, specified by the kmsMasterKeyId property, and use
     *        Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed KMS encryption (SSE-KMS).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        NONE - New objects aren't encrypted by default. Default encryption is disabled for the bucket.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public BucketServerSideEncryption withType(Type type) {
        this.type = type.toString();
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
        if (getKmsMasterKeyId() != null)
            sb.append("KmsMasterKeyId: ").append(getKmsMasterKeyId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketServerSideEncryption == false)
            return false;
        BucketServerSideEncryption other = (BucketServerSideEncryption) obj;
        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public BucketServerSideEncryption clone() {
        try {
            return (BucketServerSideEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketServerSideEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
