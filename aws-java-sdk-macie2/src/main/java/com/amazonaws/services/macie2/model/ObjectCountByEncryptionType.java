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
 * Provides information about the number of objects that are in an S3 bucket and use certain types of server-side
 * encryption, use client-side encryption, or aren't encrypted.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/ObjectCountByEncryptionType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ObjectCountByEncryptionType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The total number of objects that are encrypted using a customer-managed key. The objects use customer-provided
     * server-side encryption (SSE-C).
     * </p>
     */
    private Long customerManaged;
    /**
     * <p>
     * The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer master key
     * (CMK). The objects use AWS managed AWS KMS encryption (AWS-KMS) or customer managed AWS KMS encryption (SSE-KMS).
     * </p>
     */
    private Long kmsManaged;
    /**
     * <p>
     * The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3 managed
     * encryption (SSE-S3).
     * </p>
     */
    private Long s3Managed;
    /**
     * <p>
     * The total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     */
    private Long unencrypted;

    /**
     * <p>
     * The total number of objects that are encrypted using a customer-managed key. The objects use customer-provided
     * server-side encryption (SSE-C).
     * </p>
     * 
     * @param customerManaged
     *        The total number of objects that are encrypted using a customer-managed key. The objects use
     *        customer-provided server-side encryption (SSE-C).
     */

    public void setCustomerManaged(Long customerManaged) {
        this.customerManaged = customerManaged;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using a customer-managed key. The objects use customer-provided
     * server-side encryption (SSE-C).
     * </p>
     * 
     * @return The total number of objects that are encrypted using a customer-managed key. The objects use
     *         customer-provided server-side encryption (SSE-C).
     */

    public Long getCustomerManaged() {
        return this.customerManaged;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using a customer-managed key. The objects use customer-provided
     * server-side encryption (SSE-C).
     * </p>
     * 
     * @param customerManaged
     *        The total number of objects that are encrypted using a customer-managed key. The objects use
     *        customer-provided server-side encryption (SSE-C).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectCountByEncryptionType withCustomerManaged(Long customerManaged) {
        setCustomerManaged(customerManaged);
        return this;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer master key
     * (CMK). The objects use AWS managed AWS KMS encryption (AWS-KMS) or customer managed AWS KMS encryption (SSE-KMS).
     * </p>
     * 
     * @param kmsManaged
     *        The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer
     *        master key (CMK). The objects use AWS managed AWS KMS encryption (AWS-KMS) or customer managed AWS KMS
     *        encryption (SSE-KMS).
     */

    public void setKmsManaged(Long kmsManaged) {
        this.kmsManaged = kmsManaged;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer master key
     * (CMK). The objects use AWS managed AWS KMS encryption (AWS-KMS) or customer managed AWS KMS encryption (SSE-KMS).
     * </p>
     * 
     * @return The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer
     *         master key (CMK). The objects use AWS managed AWS KMS encryption (AWS-KMS) or customer managed AWS KMS
     *         encryption (SSE-KMS).
     */

    public Long getKmsManaged() {
        return this.kmsManaged;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer master key
     * (CMK). The objects use AWS managed AWS KMS encryption (AWS-KMS) or customer managed AWS KMS encryption (SSE-KMS).
     * </p>
     * 
     * @param kmsManaged
     *        The total number of objects that are encrypted using an AWS Key Management Service (AWS KMS) customer
     *        master key (CMK). The objects use AWS managed AWS KMS encryption (AWS-KMS) or customer managed AWS KMS
     *        encryption (SSE-KMS).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectCountByEncryptionType withKmsManaged(Long kmsManaged) {
        setKmsManaged(kmsManaged);
        return this;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3 managed
     * encryption (SSE-S3).
     * </p>
     * 
     * @param s3Managed
     *        The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3
     *        managed encryption (SSE-S3).
     */

    public void setS3Managed(Long s3Managed) {
        this.s3Managed = s3Managed;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3 managed
     * encryption (SSE-S3).
     * </p>
     * 
     * @return The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3
     *         managed encryption (SSE-S3).
     */

    public Long getS3Managed() {
        return this.s3Managed;
    }

    /**
     * <p>
     * The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3 managed
     * encryption (SSE-S3).
     * </p>
     * 
     * @param s3Managed
     *        The total number of objects that are encrypted using an Amazon S3 managed key. The objects use Amazon S3
     *        managed encryption (SSE-S3).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectCountByEncryptionType withS3Managed(Long s3Managed) {
        setS3Managed(s3Managed);
        return this;
    }

    /**
     * <p>
     * The total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     * 
     * @param unencrypted
     *        The total number of objects that aren't encrypted or use client-side encryption.
     */

    public void setUnencrypted(Long unencrypted) {
        this.unencrypted = unencrypted;
    }

    /**
     * <p>
     * The total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     * 
     * @return The total number of objects that aren't encrypted or use client-side encryption.
     */

    public Long getUnencrypted() {
        return this.unencrypted;
    }

    /**
     * <p>
     * The total number of objects that aren't encrypted or use client-side encryption.
     * </p>
     * 
     * @param unencrypted
     *        The total number of objects that aren't encrypted or use client-side encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ObjectCountByEncryptionType withUnencrypted(Long unencrypted) {
        setUnencrypted(unencrypted);
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
        if (getCustomerManaged() != null)
            sb.append("CustomerManaged: ").append(getCustomerManaged()).append(",");
        if (getKmsManaged() != null)
            sb.append("KmsManaged: ").append(getKmsManaged()).append(",");
        if (getS3Managed() != null)
            sb.append("S3Managed: ").append(getS3Managed()).append(",");
        if (getUnencrypted() != null)
            sb.append("Unencrypted: ").append(getUnencrypted());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ObjectCountByEncryptionType == false)
            return false;
        ObjectCountByEncryptionType other = (ObjectCountByEncryptionType) obj;
        if (other.getCustomerManaged() == null ^ this.getCustomerManaged() == null)
            return false;
        if (other.getCustomerManaged() != null && other.getCustomerManaged().equals(this.getCustomerManaged()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomerManaged() == null) ? 0 : getCustomerManaged().hashCode());
        hashCode = prime * hashCode + ((getKmsManaged() == null) ? 0 : getKmsManaged().hashCode());
        hashCode = prime * hashCode + ((getS3Managed() == null) ? 0 : getS3Managed().hashCode());
        hashCode = prime * hashCode + ((getUnencrypted() == null) ? 0 : getUnencrypted().hashCode());
        return hashCode;
    }

    @Override
    public ObjectCountByEncryptionType clone() {
        try {
            return (ObjectCountByEncryptionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.ObjectCountByEncryptionTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
