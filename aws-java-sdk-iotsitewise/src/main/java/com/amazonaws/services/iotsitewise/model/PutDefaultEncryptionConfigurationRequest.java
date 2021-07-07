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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutDefaultEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDefaultEncryptionConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of encryption used for the encryption configuration.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The Key ID of the customer managed customer master key (CMK) used for KMS encryption. This is required if you use
     * <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The type of encryption used for the encryption configuration.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption used for the encryption configuration.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption used for the encryption configuration.
     * </p>
     * 
     * @return The type of encryption used for the encryption configuration.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The type of encryption used for the encryption configuration.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption used for the encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutDefaultEncryptionConfigurationRequest withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The type of encryption used for the encryption configuration.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption used for the encryption configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutDefaultEncryptionConfigurationRequest withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The Key ID of the customer managed customer master key (CMK) used for KMS encryption. This is required if you use
     * <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Key ID of the customer managed customer master key (CMK) used for KMS encryption. This is required if
     *        you use <code>KMS_BASED_ENCRYPTION</code>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The Key ID of the customer managed customer master key (CMK) used for KMS encryption. This is required if you use
     * <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     * 
     * @return The Key ID of the customer managed customer master key (CMK) used for KMS encryption. This is required if
     *         you use <code>KMS_BASED_ENCRYPTION</code>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The Key ID of the customer managed customer master key (CMK) used for KMS encryption. This is required if you use
     * <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     * 
     * @param kmsKeyId
     *        The Key ID of the customer managed customer master key (CMK) used for KMS encryption. This is required if
     *        you use <code>KMS_BASED_ENCRYPTION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDefaultEncryptionConfigurationRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDefaultEncryptionConfigurationRequest == false)
            return false;
        PutDefaultEncryptionConfigurationRequest other = (PutDefaultEncryptionConfigurationRequest) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public PutDefaultEncryptionConfigurationRequest clone() {
        return (PutDefaultEncryptionConfigurationRequest) super.clone();
    }

}
