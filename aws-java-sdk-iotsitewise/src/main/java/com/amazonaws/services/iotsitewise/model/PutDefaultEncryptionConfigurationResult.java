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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/PutDefaultEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDefaultEncryptionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The type of encryption used for the encryption configuration.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The Key ARN of the KMS CMK used for KMS encryption if you use <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The status of the account configuration. This contains the <code>ConfigurationState</code>. If there is an error,
     * it also contains the <code>ErrorDetails</code>.
     * </p>
     */
    private ConfigurationStatus configurationStatus;

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

    public PutDefaultEncryptionConfigurationResult withEncryptionType(String encryptionType) {
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

    public PutDefaultEncryptionConfigurationResult withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The Key ARN of the KMS CMK used for KMS encryption if you use <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Key ARN of the KMS CMK used for KMS encryption if you use <code>KMS_BASED_ENCRYPTION</code>.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Key ARN of the KMS CMK used for KMS encryption if you use <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     * 
     * @return The Key ARN of the KMS CMK used for KMS encryption if you use <code>KMS_BASED_ENCRYPTION</code>.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Key ARN of the KMS CMK used for KMS encryption if you use <code>KMS_BASED_ENCRYPTION</code>.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Key ARN of the KMS CMK used for KMS encryption if you use <code>KMS_BASED_ENCRYPTION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDefaultEncryptionConfigurationResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The status of the account configuration. This contains the <code>ConfigurationState</code>. If there is an error,
     * it also contains the <code>ErrorDetails</code>.
     * </p>
     * 
     * @param configurationStatus
     *        The status of the account configuration. This contains the <code>ConfigurationState</code>. If there is an
     *        error, it also contains the <code>ErrorDetails</code>.
     */

    public void setConfigurationStatus(ConfigurationStatus configurationStatus) {
        this.configurationStatus = configurationStatus;
    }

    /**
     * <p>
     * The status of the account configuration. This contains the <code>ConfigurationState</code>. If there is an error,
     * it also contains the <code>ErrorDetails</code>.
     * </p>
     * 
     * @return The status of the account configuration. This contains the <code>ConfigurationState</code>. If there is
     *         an error, it also contains the <code>ErrorDetails</code>.
     */

    public ConfigurationStatus getConfigurationStatus() {
        return this.configurationStatus;
    }

    /**
     * <p>
     * The status of the account configuration. This contains the <code>ConfigurationState</code>. If there is an error,
     * it also contains the <code>ErrorDetails</code>.
     * </p>
     * 
     * @param configurationStatus
     *        The status of the account configuration. This contains the <code>ConfigurationState</code>. If there is an
     *        error, it also contains the <code>ErrorDetails</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDefaultEncryptionConfigurationResult withConfigurationStatus(ConfigurationStatus configurationStatus) {
        setConfigurationStatus(configurationStatus);
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getConfigurationStatus() != null)
            sb.append("ConfigurationStatus: ").append(getConfigurationStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDefaultEncryptionConfigurationResult == false)
            return false;
        PutDefaultEncryptionConfigurationResult other = (PutDefaultEncryptionConfigurationResult) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getConfigurationStatus() == null ^ this.getConfigurationStatus() == null)
            return false;
        if (other.getConfigurationStatus() != null && other.getConfigurationStatus().equals(this.getConfigurationStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationStatus() == null) ? 0 : getConfigurationStatus().hashCode());
        return hashCode;
    }

    @Override
    public PutDefaultEncryptionConfigurationResult clone() {
        try {
            return (PutDefaultEncryptionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
