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
 * Provides information about the number of S3 buckets that use certain types of server-side encryption by default or
 * don't encrypt new objects by default. For detailed information about these settings, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/bucket-encryption.html">Setting default server-side
 * encryption behavior for Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/BucketCountByEncryptionType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BucketCountByEncryptionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of buckets that use an Key Management Service (KMS) customer master key (CMK) to encrypt new
     * objects by default. These buckets use Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed
     * KMS encryption (SSE-KMS) by default.
     * </p>
     */
    private Long kmsManaged;
    /**
     * <p>
     * The total number of buckets that use an Amazon S3 managed key to encrypt new objects by default. These buckets
     * use Amazon S3 managed encryption (SSE-S3) by default.
     * </p>
     */
    private Long s3Managed;
    /**
     * <p>
     * The total number of buckets that don't encrypt new objects by default. Default encryption is disabled for these
     * buckets.
     * </p>
     */
    private Long unencrypted;
    /**
     * <p>
     * The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't provide
     * current data about the default encryption settings for these buckets.
     * </p>
     */
    private Long unknown;

    /**
     * <p>
     * The total number of buckets that use an Key Management Service (KMS) customer master key (CMK) to encrypt new
     * objects by default. These buckets use Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed
     * KMS encryption (SSE-KMS) by default.
     * </p>
     * 
     * @param kmsManaged
     *        <p>
     *        The total number of buckets that use an Key Management Service (KMS) customer master key (CMK) to encrypt
     *        new objects by default. These buckets use Amazon Web Services managed KMS encryption (AWS-KMS) or customer
     *        managed KMS encryption (SSE-KMS) by default.
     *        </p>
     */

    public void setKmsManaged(Long kmsManaged) {
        this.kmsManaged = kmsManaged;
    }

    /**
     * <p>
     * The total number of buckets that use an Key Management Service (KMS) customer master key (CMK) to encrypt new
     * objects by default. These buckets use Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed
     * KMS encryption (SSE-KMS) by default.
     * </p>
     * 
     * @return <p>
     *         The total number of buckets that use an Key Management Service (KMS) customer master key (CMK) to encrypt
     *         new objects by default. These buckets use Amazon Web Services managed KMS encryption (AWS-KMS) or
     *         customer managed KMS encryption (SSE-KMS) by default.
     *         </p>
     */

    public Long getKmsManaged() {
        return this.kmsManaged;
    }

    /**
     * <p>
     * The total number of buckets that use an Key Management Service (KMS) customer master key (CMK) to encrypt new
     * objects by default. These buckets use Amazon Web Services managed KMS encryption (AWS-KMS) or customer managed
     * KMS encryption (SSE-KMS) by default.
     * </p>
     * 
     * @param kmsManaged
     *        <p>
     *        The total number of buckets that use an Key Management Service (KMS) customer master key (CMK) to encrypt
     *        new objects by default. These buckets use Amazon Web Services managed KMS encryption (AWS-KMS) or customer
     *        managed KMS encryption (SSE-KMS) by default.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEncryptionType withKmsManaged(Long kmsManaged) {
        setKmsManaged(kmsManaged);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that use an Amazon S3 managed key to encrypt new objects by default. These buckets
     * use Amazon S3 managed encryption (SSE-S3) by default.
     * </p>
     * 
     * @param s3Managed
     *        The total number of buckets that use an Amazon S3 managed key to encrypt new objects by default. These
     *        buckets use Amazon S3 managed encryption (SSE-S3) by default.
     */

    public void setS3Managed(Long s3Managed) {
        this.s3Managed = s3Managed;
    }

    /**
     * <p>
     * The total number of buckets that use an Amazon S3 managed key to encrypt new objects by default. These buckets
     * use Amazon S3 managed encryption (SSE-S3) by default.
     * </p>
     * 
     * @return The total number of buckets that use an Amazon S3 managed key to encrypt new objects by default. These
     *         buckets use Amazon S3 managed encryption (SSE-S3) by default.
     */

    public Long getS3Managed() {
        return this.s3Managed;
    }

    /**
     * <p>
     * The total number of buckets that use an Amazon S3 managed key to encrypt new objects by default. These buckets
     * use Amazon S3 managed encryption (SSE-S3) by default.
     * </p>
     * 
     * @param s3Managed
     *        The total number of buckets that use an Amazon S3 managed key to encrypt new objects by default. These
     *        buckets use Amazon S3 managed encryption (SSE-S3) by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEncryptionType withS3Managed(Long s3Managed) {
        setS3Managed(s3Managed);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that don't encrypt new objects by default. Default encryption is disabled for these
     * buckets.
     * </p>
     * 
     * @param unencrypted
     *        The total number of buckets that don't encrypt new objects by default. Default encryption is disabled for
     *        these buckets.
     */

    public void setUnencrypted(Long unencrypted) {
        this.unencrypted = unencrypted;
    }

    /**
     * <p>
     * The total number of buckets that don't encrypt new objects by default. Default encryption is disabled for these
     * buckets.
     * </p>
     * 
     * @return The total number of buckets that don't encrypt new objects by default. Default encryption is disabled for
     *         these buckets.
     */

    public Long getUnencrypted() {
        return this.unencrypted;
    }

    /**
     * <p>
     * The total number of buckets that don't encrypt new objects by default. Default encryption is disabled for these
     * buckets.
     * </p>
     * 
     * @param unencrypted
     *        The total number of buckets that don't encrypt new objects by default. Default encryption is disabled for
     *        these buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEncryptionType withUnencrypted(Long unencrypted) {
        setUnencrypted(unencrypted);
        return this;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't provide
     * current data about the default encryption settings for these buckets.
     * </p>
     * 
     * @param unknown
     *        The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't
     *        provide current data about the default encryption settings for these buckets.
     */

    public void setUnknown(Long unknown) {
        this.unknown = unknown;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't provide
     * current data about the default encryption settings for these buckets.
     * </p>
     * 
     * @return The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't
     *         provide current data about the default encryption settings for these buckets.
     */

    public Long getUnknown() {
        return this.unknown;
    }

    /**
     * <p>
     * The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't provide
     * current data about the default encryption settings for these buckets.
     * </p>
     * 
     * @param unknown
     *        The total number of buckets that Amazon Macie doesn't have current encryption metadata for. Macie can't
     *        provide current data about the default encryption settings for these buckets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BucketCountByEncryptionType withUnknown(Long unknown) {
        setUnknown(unknown);
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
        if (getKmsManaged() != null)
            sb.append("KmsManaged: ").append(getKmsManaged()).append(",");
        if (getS3Managed() != null)
            sb.append("S3Managed: ").append(getS3Managed()).append(",");
        if (getUnencrypted() != null)
            sb.append("Unencrypted: ").append(getUnencrypted()).append(",");
        if (getUnknown() != null)
            sb.append("Unknown: ").append(getUnknown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BucketCountByEncryptionType == false)
            return false;
        BucketCountByEncryptionType other = (BucketCountByEncryptionType) obj;
        if (other.getKmsManaged() == null ^ this.getKmsManaged() == null)
            return false;
        if (other.getKmsManaged() != null && other.getKmsManaged().equals(this.getKmsManaged()) == false)
            return false;
        if (other.getS3Managed() == null ^ this.getS3Managed() == null)
            return false;
        if (other.getS3Managed() != null && other.getS3Managed().equals(this.getS3Managed()) == false)
            return false;
        if (other.getUnencrypted() == null ^ this.getUnencrypted() == null)
            return false;
        if (other.getUnencrypted() != null && other.getUnencrypted().equals(this.getUnencrypted()) == false)
            return false;
        if (other.getUnknown() == null ^ this.getUnknown() == null)
            return false;
        if (other.getUnknown() != null && other.getUnknown().equals(this.getUnknown()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsManaged() == null) ? 0 : getKmsManaged().hashCode());
        hashCode = prime * hashCode + ((getS3Managed() == null) ? 0 : getS3Managed().hashCode());
        hashCode = prime * hashCode + ((getUnencrypted() == null) ? 0 : getUnencrypted().hashCode());
        hashCode = prime * hashCode + ((getUnknown() == null) ? 0 : getUnknown().hashCode());
        return hashCode;
    }

    @Override
    public BucketCountByEncryptionType clone() {
        try {
            return (BucketCountByEncryptionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.BucketCountByEncryptionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
