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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the method used to encrypt the user’s data stores in the Athena workgroup.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether Amazon Simple Storage Service (Amazon S3) server-side encryption with Amazon S3 managed keys
     * (SSE_S3), server-side encryption with KMS keys (SSE_KMS), or client-side encryption with KMS customer managed
     * keys (CSE_KMS) is used.
     * </p>
     */
    private String encryptionOption;
    /**
     * <p>
     * For <code>SSE_KMS</code> and <code>CSE_KMS</code>, this is the KMS key Amazon Resource Name (ARN) or ID.
     * </p>
     */
    private String kmsKey;

    /**
     * <p>
     * Indicates whether Amazon Simple Storage Service (Amazon S3) server-side encryption with Amazon S3 managed keys
     * (SSE_S3), server-side encryption with KMS keys (SSE_KMS), or client-side encryption with KMS customer managed
     * keys (CSE_KMS) is used.
     * </p>
     * 
     * @param encryptionOption
     *        Indicates whether Amazon Simple Storage Service (Amazon S3) server-side encryption with Amazon S3 managed
     *        keys (SSE_S3), server-side encryption with KMS keys (SSE_KMS), or client-side encryption with KMS customer
     *        managed keys (CSE_KMS) is used.
     */

    public void setEncryptionOption(String encryptionOption) {
        this.encryptionOption = encryptionOption;
    }

    /**
     * <p>
     * Indicates whether Amazon Simple Storage Service (Amazon S3) server-side encryption with Amazon S3 managed keys
     * (SSE_S3), server-side encryption with KMS keys (SSE_KMS), or client-side encryption with KMS customer managed
     * keys (CSE_KMS) is used.
     * </p>
     * 
     * @return Indicates whether Amazon Simple Storage Service (Amazon S3) server-side encryption with Amazon S3 managed
     *         keys (SSE_S3), server-side encryption with KMS keys (SSE_KMS), or client-side encryption with KMS
     *         customer managed keys (CSE_KMS) is used.
     */

    public String getEncryptionOption() {
        return this.encryptionOption;
    }

    /**
     * <p>
     * Indicates whether Amazon Simple Storage Service (Amazon S3) server-side encryption with Amazon S3 managed keys
     * (SSE_S3), server-side encryption with KMS keys (SSE_KMS), or client-side encryption with KMS customer managed
     * keys (CSE_KMS) is used.
     * </p>
     * 
     * @param encryptionOption
     *        Indicates whether Amazon Simple Storage Service (Amazon S3) server-side encryption with Amazon S3 managed
     *        keys (SSE_S3), server-side encryption with KMS keys (SSE_KMS), or client-side encryption with KMS customer
     *        managed keys (CSE_KMS) is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails withEncryptionOption(String encryptionOption) {
        setEncryptionOption(encryptionOption);
        return this;
    }

    /**
     * <p>
     * For <code>SSE_KMS</code> and <code>CSE_KMS</code>, this is the KMS key Amazon Resource Name (ARN) or ID.
     * </p>
     * 
     * @param kmsKey
     *        For <code>SSE_KMS</code> and <code>CSE_KMS</code>, this is the KMS key Amazon Resource Name (ARN) or ID.
     */

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    /**
     * <p>
     * For <code>SSE_KMS</code> and <code>CSE_KMS</code>, this is the KMS key Amazon Resource Name (ARN) or ID.
     * </p>
     * 
     * @return For <code>SSE_KMS</code> and <code>CSE_KMS</code>, this is the KMS key Amazon Resource Name (ARN) or ID.
     */

    public String getKmsKey() {
        return this.kmsKey;
    }

    /**
     * <p>
     * For <code>SSE_KMS</code> and <code>CSE_KMS</code>, this is the KMS key Amazon Resource Name (ARN) or ID.
     * </p>
     * 
     * @param kmsKey
     *        For <code>SSE_KMS</code> and <code>CSE_KMS</code>, this is the KMS key Amazon Resource Name (ARN) or ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails withKmsKey(String kmsKey) {
        setKmsKey(kmsKey);
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
        if (getEncryptionOption() != null)
            sb.append("EncryptionOption: ").append(getEncryptionOption()).append(",");
        if (getKmsKey() != null)
            sb.append("KmsKey: ").append(getKmsKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails == false)
            return false;
        AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails other = (AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails) obj;
        if (other.getEncryptionOption() == null ^ this.getEncryptionOption() == null)
            return false;
        if (other.getEncryptionOption() != null && other.getEncryptionOption().equals(this.getEncryptionOption()) == false)
            return false;
        if (other.getKmsKey() == null ^ this.getKmsKey() == null)
            return false;
        if (other.getKmsKey() != null && other.getKmsKey().equals(this.getKmsKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionOption() == null) ? 0 : getEncryptionOption().hashCode());
        hashCode = prime * hashCode + ((getKmsKey() == null) ? 0 : getKmsKey().hashCode());
        return hashCode;
    }

    @Override
    public AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails clone() {
        try {
            return (AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAthenaWorkGroupConfigurationResultConfigurationEncryptionConfigurationDetailsMarshaller
                .getInstance().marshall(this, protocolMarshaller);
    }
}
