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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption-at-rest settings of the transform that apply to accessing user data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/MLUserDataEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MLUserDataEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption mode applied to user data. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISABLED: encryption is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon S3.
     * </p>
     * </li>
     * </ul>
     */
    private String mlUserDataEncryptionMode;
    /**
     * <p>
     * The ID for the customer-provided KMS key.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The encryption mode applied to user data. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISABLED: encryption is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mlUserDataEncryptionMode
     *        The encryption mode applied to user data. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISABLED: encryption is disabled
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon
     *        S3.
     *        </p>
     *        </li>
     * @see MLUserDataEncryptionModeString
     */

    public void setMlUserDataEncryptionMode(String mlUserDataEncryptionMode) {
        this.mlUserDataEncryptionMode = mlUserDataEncryptionMode;
    }

    /**
     * <p>
     * The encryption mode applied to user data. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISABLED: encryption is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The encryption mode applied to user data. Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DISABLED: encryption is disabled
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in
     *         Amazon S3.
     *         </p>
     *         </li>
     * @see MLUserDataEncryptionModeString
     */

    public String getMlUserDataEncryptionMode() {
        return this.mlUserDataEncryptionMode;
    }

    /**
     * <p>
     * The encryption mode applied to user data. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISABLED: encryption is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mlUserDataEncryptionMode
     *        The encryption mode applied to user data. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISABLED: encryption is disabled
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon
     *        S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MLUserDataEncryptionModeString
     */

    public MLUserDataEncryption withMlUserDataEncryptionMode(String mlUserDataEncryptionMode) {
        setMlUserDataEncryptionMode(mlUserDataEncryptionMode);
        return this;
    }

    /**
     * <p>
     * The encryption mode applied to user data. Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISABLED: encryption is disabled
     * </p>
     * </li>
     * <li>
     * <p>
     * SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param mlUserDataEncryptionMode
     *        The encryption mode applied to user data. Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISABLED: encryption is disabled
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SSEKMS: use of server-side encryption with Key Management Service (SSE-KMS) for user data stored in Amazon
     *        S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MLUserDataEncryptionModeString
     */

    public MLUserDataEncryption withMlUserDataEncryptionMode(MLUserDataEncryptionModeString mlUserDataEncryptionMode) {
        this.mlUserDataEncryptionMode = mlUserDataEncryptionMode.toString();
        return this;
    }

    /**
     * <p>
     * The ID for the customer-provided KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID for the customer-provided KMS key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID for the customer-provided KMS key.
     * </p>
     * 
     * @return The ID for the customer-provided KMS key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID for the customer-provided KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID for the customer-provided KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MLUserDataEncryption withKmsKeyId(String kmsKeyId) {
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
        if (getMlUserDataEncryptionMode() != null)
            sb.append("MlUserDataEncryptionMode: ").append(getMlUserDataEncryptionMode()).append(",");
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

        if (obj instanceof MLUserDataEncryption == false)
            return false;
        MLUserDataEncryption other = (MLUserDataEncryption) obj;
        if (other.getMlUserDataEncryptionMode() == null ^ this.getMlUserDataEncryptionMode() == null)
            return false;
        if (other.getMlUserDataEncryptionMode() != null && other.getMlUserDataEncryptionMode().equals(this.getMlUserDataEncryptionMode()) == false)
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

        hashCode = prime * hashCode + ((getMlUserDataEncryptionMode() == null) ? 0 : getMlUserDataEncryptionMode().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public MLUserDataEncryption clone() {
        try {
            return (MLUserDataEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.MLUserDataEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
