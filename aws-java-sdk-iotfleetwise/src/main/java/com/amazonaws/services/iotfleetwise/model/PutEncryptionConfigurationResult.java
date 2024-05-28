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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/PutEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEncryptionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the KMS key that is used for encryption.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The encryption status.
     * </p>
     */
    private String encryptionStatus;
    /**
     * <p>
     * The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and manage. Set
     * to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is owned by the
     * Amazon Web Services IoT FleetWise service account.
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

    public PutEncryptionConfigurationResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The encryption status.
     * </p>
     * 
     * @param encryptionStatus
     *        The encryption status.
     * @see EncryptionStatus
     */

    public void setEncryptionStatus(String encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
    }

    /**
     * <p>
     * The encryption status.
     * </p>
     * 
     * @return The encryption status.
     * @see EncryptionStatus
     */

    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    /**
     * <p>
     * The encryption status.
     * </p>
     * 
     * @param encryptionStatus
     *        The encryption status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionStatus
     */

    public PutEncryptionConfigurationResult withEncryptionStatus(String encryptionStatus) {
        setEncryptionStatus(encryptionStatus);
        return this;
    }

    /**
     * <p>
     * The encryption status.
     * </p>
     * 
     * @param encryptionStatus
     *        The encryption status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionStatus
     */

    public PutEncryptionConfigurationResult withEncryptionStatus(EncryptionStatus encryptionStatus) {
        this.encryptionStatus = encryptionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and manage. Set
     * to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is owned by the
     * Amazon Web Services IoT FleetWise service account.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and
     *        manage. Set to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is
     *        owned by the Amazon Web Services IoT FleetWise service account.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and manage. Set
     * to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is owned by the
     * Amazon Web Services IoT FleetWise service account.
     * </p>
     * 
     * @return The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and
     *         manage. Set to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that
     *         is owned by the Amazon Web Services IoT FleetWise service account.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and manage. Set
     * to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is owned by the
     * Amazon Web Services IoT FleetWise service account.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and
     *        manage. Set to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is
     *        owned by the Amazon Web Services IoT FleetWise service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutEncryptionConfigurationResult withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and manage. Set
     * to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is owned by the
     * Amazon Web Services IoT FleetWise service account.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption. Set to <code>KMS_BASED_ENCRYPTION</code> to use an KMS key that you own and
     *        manage. Set to <code>FLEETWISE_DEFAULT_ENCRYPTION</code> to use an Amazon Web Services managed key that is
     *        owned by the Amazon Web Services IoT FleetWise service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutEncryptionConfigurationResult withEncryptionType(EncryptionType encryptionType) {
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
        if (getEncryptionStatus() != null)
            sb.append("EncryptionStatus: ").append(getEncryptionStatus()).append(",");
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

        if (obj instanceof PutEncryptionConfigurationResult == false)
            return false;
        PutEncryptionConfigurationResult other = (PutEncryptionConfigurationResult) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEncryptionStatus() == null ^ this.getEncryptionStatus() == null)
            return false;
        if (other.getEncryptionStatus() != null && other.getEncryptionStatus().equals(this.getEncryptionStatus()) == false)
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
        hashCode = prime * hashCode + ((getEncryptionStatus() == null) ? 0 : getEncryptionStatus().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public PutEncryptionConfigurationResult clone() {
        try {
            return (PutEncryptionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
