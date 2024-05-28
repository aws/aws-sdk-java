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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/PutEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEncryptionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the KMS key that is used for encryption.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     * <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * </p>
     */
    private String encryptionType;

    /**
     * <p>
     * The ID of the KMS key that is used for encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key that is used for encryption.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that is used for encryption.
     * </p>
     * 
     * @return The ID of the KMS key that is used for encryption.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key that is used for encryption.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key that is used for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEncryptionConfigurationRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     * <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     *        <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     * <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * </p>
     * 
     * @return The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     *         <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     * <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     *        <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutEncryptionConfigurationRequest withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     * <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption. Choose <code>KMS_BASED_ENCRYPTION</code> to use a KMS key or
     *        <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutEncryptionConfigurationRequest withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEncryptionConfigurationRequest == false)
            return false;
        PutEncryptionConfigurationRequest other = (PutEncryptionConfigurationRequest) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public PutEncryptionConfigurationRequest clone() {
        return (PutEncryptionConfigurationRequest) super.clone();
    }

}
