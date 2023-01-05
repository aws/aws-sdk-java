/*
 * Copyright 2012-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the default server-side encryption to apply to new objects in the bucket. If a PUT Object request doesn't
 * specify any server-side encryption, this default encryption will be applied. If you don't specify a customer managed
 * key at configuration, Amazon S3 automatically creates an Amazon Web Services KMS key in your Amazon Web Services
 * account the first time that you add an object encrypted with SSE-KMS to a bucket. By default, Amazon S3 uses this KMS
 * key for SSE-KMS. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTencryption.html">PUT Bucket encryption</a> in the
 * <i>Amazon S3 API Reference</i>.
 * </p>
 */
public class ServerSideEncryptionByDefault implements Serializable, Cloneable {

    private String sseAlgorithm;
    private String kmsMasterKeyID;

    /**
     * @return Server-side encryption algorithm to use for the default encryption.
     */
    public String getSSEAlgorithm() {
        return sseAlgorithm;
    }

    /**
     * Sets the server-side encryption algorithm to use for the default encryption.
     *
     * @param sseAlgorithm SSE algorithm to use.
     */
    public void setSSEAlgorithm(String sseAlgorithm) {
        this.sseAlgorithm = sseAlgorithm;
    }

    /**
     * Sets the server-side encryption algorithm to use for the default encryption.
     *
     * @param sseAlgorithm SSE algorithm to use.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionByDefault withSSEAlgorithm(String sseAlgorithm) {
        setSSEAlgorithm(sseAlgorithm);
        return this;
    }

    /**
     * Sets the server-side encryption algorithm to use for the default encryption.
     *
     * @param sseAlgorithm SSE algorithm to use.
     * @return This object for method chaining.
     */
    public ServerSideEncryptionByDefault withSSEAlgorithm(SSEAlgorithm sseAlgorithm) {
        setSSEAlgorithm(sseAlgorithm == null ? null : sseAlgorithm.toString());
        return this;
    }

    /**
     * <p>
     * Amazon Web Services Key Management Service (KMS) customer Amazon Web Services KMS key ID to use for the default
     * encryption. This parameter is allowed if and only if <code>SSEAlgorithm</code> is set to <code>aws:kms</code>.
     * </p>
     * <p>
     * You can specify the key ID or the Amazon Resource Name (ARN) of the KMS key. However, if you are using encryption
     * with cross-account or Amazon Web Services service operations you must use a fully qualified KMS key ARN. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     * >Using encryption for cross-account operations</a>.
     * </p>
     * <p>
     * <b>For example:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     *
     * @return Amazon Web Services Key Management Service (KMS) customer Amazon Web Services KMS key ID to use for the
     *         default encryption. This parameter is allowed if and only if <code>SSEAlgorithm</code> is set to
     *         <code>aws:kms</code>.</p>
     *         <p>
     *         You can specify the key ID or the Amazon Resource Name (ARN) of the KMS key. However, if you are using
     *         encryption with cross-account or Amazon Web Services service operations you must use a fully qualified
     *         KMS key ARN. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     *         >Using encryption for cross-account operations</a>.
     *         </p>
     *         <p>
     *         <b>For example:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <important>
     *         <p>
     *         Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
     *         and asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     *         </p>
     */
    public String getKMSMasterKeyID() {
        return kmsMasterKeyID;
    }

    /**
     * <p>
     * Amazon Web Services Key Management Service (KMS) customer Amazon Web Services KMS key ID to use for the
     * default encryption. This parameter is allowed if and only if <code>SSEAlgorithm</code> is set to
     * <code>aws:kms</code>.
     * </p>
     * <p>
     * You can specify the key ID or the Amazon Resource Name (ARN) of the KMS key. However, if you are using
     * encryption with cross-account or Amazon Web Services service operations you must use a fully qualified KMS
     * key ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     * >Using encryption for cross-account operations</a>.
     * </p>
     * <p>
     * <b>For example:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     *
     * @param kmsMasterKeyID
     *        Amazon Web Services Key Management Service (KMS) customer Amazon Web Services KMS key ID to use for
     *        the default encryption. This parameter is allowed if and only if <code>SSEAlgorithm</code> is set to
     *        <code>aws:kms</code>.</p>
     *        <p>
     *        You can specify the key ID or the Amazon Resource Name (ARN) of the KMS key. However, if you are using
     *        encryption with cross-account or Amazon Web Services service operations you must use a fully qualified
     *        KMS key ARN. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     *        >Using encryption for cross-account operations</a>.
     *        </p>
     *        <p>
     *        <b>For example:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
     *        and asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     *        </p>
     */
    public void setKMSMasterKeyID(String kmsMasterKeyID) {
        this.kmsMasterKeyID = kmsMasterKeyID;
    }

    /**
     * <p>
     * Amazon Web Services Key Management Service (KMS) customer Amazon Web Services KMS key ID to use for the
     * default encryption. This parameter is allowed if and only if <code>SSEAlgorithm</code> is set to
     * <code>aws:kms</code>.
     * </p>
     * <p>
     * You can specify the key ID or the Amazon Resource Name (ARN) of the KMS key. However, if you are using
     * encryption with cross-account or Amazon Web Services service operations you must use a fully qualified KMS
     * key ARN. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     * >Using encryption for cross-account operations</a>.
     * </p>
     * <p>
     * <b>For example:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     * </p>
     * </li>
     * </ul>
     * <important>
     * <p>
     * Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric and
     * asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * </important>
     *
     * @param kmsMasterKeyID
     *        Amazon Web Services Key Management Service (KMS) customer Amazon Web Services KMS key ID to use for
     *        the default encryption. This parameter is allowed if and only if <code>SSEAlgorithm</code> is set to
     *        <code>aws:kms</code>.</p>
     *        <p>
     *        You can specify the key ID or the Amazon Resource Name (ARN) of the KMS key. However, if you are using
     *        encryption with cross-account or Amazon Web Services service operations you must use a fully qualified
     *        KMS key ARN. For more information, see <a href=
     *        "https://docs.aws.amazon.com/AmazonS3/latest/dev/bucket-encryption.html#bucket-encryption-update-bucket-policy"
     *        >Using encryption for cross-account operations</a>.
     *        </p>
     *        <p>
     *        <b>For example:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Key ID: <code>1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Key ARN: <code>arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <important>
     *        <p>
     *        Amazon S3 only supports symmetric KMS keys and not asymmetric KMS keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/symmetric-asymmetric.html">Using symmetric
     *        and asymmetric keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    public ServerSideEncryptionByDefault withKMSMasterKeyID(String kmsMasterKeyID) {
        setKMSMasterKeyID(kmsMasterKeyID);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSSEAlgorithm() != null) {
            sb.append("SSEAlgorithm: ").append(getSSEAlgorithm()).append(",");
        }
        if (getKMSMasterKeyID() != null) {
            sb.append("KMSMasterKeyID: ").append(getKMSMasterKeyID()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof ServerSideEncryptionByDefault == false) {
            return false;
        }
        ServerSideEncryptionByDefault other = (ServerSideEncryptionByDefault) obj;
        if (other.getSSEAlgorithm() == null ^ this.getSSEAlgorithm() == null) {
            return false;
        }
        if (other.getSSEAlgorithm() != null
            && other.getSSEAlgorithm().equals(this.getSSEAlgorithm()) == false) {
            return false;
        }
        if (other.getKMSMasterKeyID() == null ^ this.getKMSMasterKeyID() == null) {
            return false;
        }
        if (other.getKMSMasterKeyID() != null
            && other.getKMSMasterKeyID().equals(this.getKMSMasterKeyID()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSSEAlgorithm() == null) ? 0 : getSSEAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getKMSMasterKeyID() == null) ? 0 : getKMSMasterKeyID().hashCode());
        return hashCode;
    }

    @Override
    public ServerSideEncryptionByDefault clone() {
        try {
            return (ServerSideEncryptionByDefault) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
