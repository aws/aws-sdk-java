/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Specifies encryption-related information for an Amazon S3 bucket that is a destination for replicated objects.
 * </p>
 * <note>
 * <p>
 * This is not supported by Amazon S3 on Outposts buckets.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/EncryptionConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the
     * destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for the KMS
     * key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric encryption KMS
     * keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">Symmetric encryption
     * KMS keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     */
    private String replicaKmsKeyID;

    /**
     * <p>
     * Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the
     * destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for the KMS
     * key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric encryption KMS
     * keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">Symmetric encryption
     * KMS keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param replicaKmsKeyID
     *        Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the
     *        destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for
     *        the KMS key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric
     *        encryption KMS keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">Symmetric
     *        encryption KMS keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     */

    public void setReplicaKmsKeyID(String replicaKmsKeyID) {
        this.replicaKmsKeyID = replicaKmsKeyID;
    }

    /**
     * <p>
     * Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the
     * destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for the KMS
     * key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric encryption KMS
     * keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">Symmetric encryption
     * KMS keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the
     *         destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for
     *         the KMS key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric
     *         encryption KMS keys. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">Symmetric
     *         encryption KMS keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     */

    public String getReplicaKmsKeyID() {
        return this.replicaKmsKeyID;
    }

    /**
     * <p>
     * Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the
     * destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for the KMS
     * key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric encryption KMS
     * keys. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">Symmetric encryption
     * KMS keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param replicaKmsKeyID
     *        Specifies the ID of the customer managed KMS key that's stored in Key Management Service (KMS) for the
     *        destination bucket. This ID is either the Amazon Resource Name (ARN) for the KMS key or the alias ARN for
     *        the KMS key. Amazon S3 uses this KMS key to encrypt replica objects. Amazon S3 supports only symmetric
     *        encryption KMS keys. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#symmetric-cmks">Symmetric
     *        encryption KMS keys</a> in the <i>Amazon Web Services Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withReplicaKmsKeyID(String replicaKmsKeyID) {
        setReplicaKmsKeyID(replicaKmsKeyID);
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
        if (getReplicaKmsKeyID() != null)
            sb.append("ReplicaKmsKeyID: ").append(getReplicaKmsKeyID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionConfiguration == false)
            return false;
        EncryptionConfiguration other = (EncryptionConfiguration) obj;
        if (other.getReplicaKmsKeyID() == null ^ this.getReplicaKmsKeyID() == null)
            return false;
        if (other.getReplicaKmsKeyID() != null && other.getReplicaKmsKeyID().equals(this.getReplicaKmsKeyID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicaKmsKeyID() == null) ? 0 : getReplicaKmsKeyID().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfiguration clone() {
        try {
            return (EncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
