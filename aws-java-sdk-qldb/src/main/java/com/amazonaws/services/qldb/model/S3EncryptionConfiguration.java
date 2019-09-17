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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption settings that are used by a journal export job to write data in an Amazon Simple Storage Service
 * (Amazon S3) bucket.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/S3EncryptionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3EncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     */
    private String objectEncryptionType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify <code>SSE_KMS</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @param objectEncryptionType
     *        The Amazon S3 object encryption type.</p>
     *        <p>
     *        To learn more about server-side encryption options in Amazon S3, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     *        Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * @see S3ObjectEncryptionType
     */

    public void setObjectEncryptionType(String objectEncryptionType) {
        this.objectEncryptionType = objectEncryptionType;
    }

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @return The Amazon S3 object encryption type.</p>
     *         <p>
     *         To learn more about server-side encryption options in Amazon S3, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     *         Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * @see S3ObjectEncryptionType
     */

    public String getObjectEncryptionType() {
        return this.objectEncryptionType;
    }

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @param objectEncryptionType
     *        The Amazon S3 object encryption type.</p>
     *        <p>
     *        To learn more about server-side encryption options in Amazon S3, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     *        Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectEncryptionType
     */

    public S3EncryptionConfiguration withObjectEncryptionType(String objectEncryptionType) {
        setObjectEncryptionType(objectEncryptionType);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 object encryption type.
     * </p>
     * <p>
     * To learn more about server-side encryption options in Amazon S3, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     * Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * </p>
     * 
     * @param objectEncryptionType
     *        The Amazon S3 object encryption type.</p>
     *        <p>
     *        To learn more about server-side encryption options in Amazon S3, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/serv-side-encryption.html">Protecting Data Using
     *        Server-Side Encryption</a> in the <i>Amazon S3 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see S3ObjectEncryptionType
     */

    public S3EncryptionConfiguration withObjectEncryptionType(S3ObjectEncryptionType objectEncryptionType) {
        this.objectEncryptionType = objectEncryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify <code>SSE_KMS</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS
     *        KMS).</p>
     *        <p>
     *        You must provide a <code>KmsKeyArn</code> if you specify <code>SSE_KMS</code> as the
     *        <code>ObjectEncryptionType</code>.
     *        </p>
     *        <p>
     *        <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code> as the
     *        <code>ObjectEncryptionType</code>.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify <code>SSE_KMS</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS
     *         KMS).</p>
     *         <p>
     *         You must provide a <code>KmsKeyArn</code> if you specify <code>SSE_KMS</code> as the
     *         <code>ObjectEncryptionType</code>.
     *         </p>
     *         <p>
     *         <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code> as the
     *         <code>ObjectEncryptionType</code>.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS KMS).
     * </p>
     * <p>
     * You must provide a <code>KmsKeyArn</code> if you specify <code>SSE_KMS</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     * <p>
     * <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code> as the
     * <code>ObjectEncryptionType</code>.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) for a customer master key (CMK) in AWS Key Management Service (AWS
     *        KMS).</p>
     *        <p>
     *        You must provide a <code>KmsKeyArn</code> if you specify <code>SSE_KMS</code> as the
     *        <code>ObjectEncryptionType</code>.
     *        </p>
     *        <p>
     *        <code>KmsKeyArn</code> is not required if you specify <code>SSE_S3</code> as the
     *        <code>ObjectEncryptionType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3EncryptionConfiguration withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getObjectEncryptionType() != null)
            sb.append("ObjectEncryptionType: ").append(getObjectEncryptionType()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3EncryptionConfiguration == false)
            return false;
        S3EncryptionConfiguration other = (S3EncryptionConfiguration) obj;
        if (other.getObjectEncryptionType() == null ^ this.getObjectEncryptionType() == null)
            return false;
        if (other.getObjectEncryptionType() != null && other.getObjectEncryptionType().equals(this.getObjectEncryptionType()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getObjectEncryptionType() == null) ? 0 : getObjectEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public S3EncryptionConfiguration clone() {
        try {
            return (S3EncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.S3EncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
