/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.synthetics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains the configuration of encryption-at-rest settings for canary artifacts that the canary
 * uploads to Amazon S3.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html"
 * >Encrypting canary artifacts</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/synthetics-2017-10-11/S3EncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3EncryptionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use server-side
     * encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use server-side encryption with a
     * customer-managed KMS key.
     * </p>
     * <p>
     * If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * </p>
     */
    private String encryptionMode;
    /**
     * <p>
     * The ARN of the customer-managed KMS key to use, if you specify <code>SSE-KMS</code> for
     * <code>EncryptionMode</code>
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use server-side
     * encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use server-side encryption with a
     * customer-managed KMS key.
     * </p>
     * <p>
     * If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * </p>
     * 
     * @param encryptionMode
     *        The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use
     *        server-side encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use
     *        server-side encryption with a customer-managed KMS key.</p>
     *        <p>
     *        If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * @see EncryptionMode
     */

    public void setEncryptionMode(String encryptionMode) {
        this.encryptionMode = encryptionMode;
    }

    /**
     * <p>
     * The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use server-side
     * encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use server-side encryption with a
     * customer-managed KMS key.
     * </p>
     * <p>
     * If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * </p>
     * 
     * @return The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use
     *         server-side encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use
     *         server-side encryption with a customer-managed KMS key.</p>
     *         <p>
     *         If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * @see EncryptionMode
     */

    public String getEncryptionMode() {
        return this.encryptionMode;
    }

    /**
     * <p>
     * The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use server-side
     * encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use server-side encryption with a
     * customer-managed KMS key.
     * </p>
     * <p>
     * If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * </p>
     * 
     * @param encryptionMode
     *        The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use
     *        server-side encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use
     *        server-side encryption with a customer-managed KMS key.</p>
     *        <p>
     *        If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public S3EncryptionConfig withEncryptionMode(String encryptionMode) {
        setEncryptionMode(encryptionMode);
        return this;
    }

    /**
     * <p>
     * The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use server-side
     * encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use server-side encryption with a
     * customer-managed KMS key.
     * </p>
     * <p>
     * If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * </p>
     * 
     * @param encryptionMode
     *        The encryption method to use for artifacts created by this canary. Specify <code>SSE_S3</code> to use
     *        server-side encryption (SSE) with an Amazon S3-managed key. Specify <code>SSE-KMS</code> to use
     *        server-side encryption with a customer-managed KMS key.</p>
     *        <p>
     *        If you omit this parameter, an Amazon Web Services-managed KMS key is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMode
     */

    public S3EncryptionConfig withEncryptionMode(EncryptionMode encryptionMode) {
        this.encryptionMode = encryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the customer-managed KMS key to use, if you specify <code>SSE-KMS</code> for
     * <code>EncryptionMode</code>
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the customer-managed KMS key to use, if you specify <code>SSE-KMS</code> for
     *        <code>EncryptionMode</code>
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the customer-managed KMS key to use, if you specify <code>SSE-KMS</code> for
     * <code>EncryptionMode</code>
     * </p>
     * 
     * @return The ARN of the customer-managed KMS key to use, if you specify <code>SSE-KMS</code> for
     *         <code>EncryptionMode</code>
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the customer-managed KMS key to use, if you specify <code>SSE-KMS</code> for
     * <code>EncryptionMode</code>
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the customer-managed KMS key to use, if you specify <code>SSE-KMS</code> for
     *        <code>EncryptionMode</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3EncryptionConfig withKmsKeyArn(String kmsKeyArn) {
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
        if (getEncryptionMode() != null)
            sb.append("EncryptionMode: ").append(getEncryptionMode()).append(",");
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

        if (obj instanceof S3EncryptionConfig == false)
            return false;
        S3EncryptionConfig other = (S3EncryptionConfig) obj;
        if (other.getEncryptionMode() == null ^ this.getEncryptionMode() == null)
            return false;
        if (other.getEncryptionMode() != null && other.getEncryptionMode().equals(this.getEncryptionMode()) == false)
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

        hashCode = prime * hashCode + ((getEncryptionMode() == null) ? 0 : getEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public S3EncryptionConfig clone() {
        try {
            return (S3EncryptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.synthetics.model.transform.S3EncryptionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
