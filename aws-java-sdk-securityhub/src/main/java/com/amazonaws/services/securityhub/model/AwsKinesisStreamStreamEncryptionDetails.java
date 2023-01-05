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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about stream encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsKinesisStreamStreamEncryptionDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsKinesisStreamStreamEncryptionDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption type to use.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The globally unique identifier for the customer-managed KMS key to use for encryption.
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use.
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * 
     * @return The encryption type to use.
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The encryption type to use.
     * </p>
     * 
     * @param encryptionType
     *        The encryption type to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKinesisStreamStreamEncryptionDetails withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the customer-managed KMS key to use for encryption.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the customer-managed KMS key to use for encryption.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the customer-managed KMS key to use for encryption.
     * </p>
     * 
     * @return The globally unique identifier for the customer-managed KMS key to use for encryption.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the customer-managed KMS key to use for encryption.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the customer-managed KMS key to use for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsKinesisStreamStreamEncryptionDetails withKeyId(String keyId) {
        setKeyId(keyId);
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsKinesisStreamStreamEncryptionDetails == false)
            return false;
        AwsKinesisStreamStreamEncryptionDetails other = (AwsKinesisStreamStreamEncryptionDetails) obj;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        return hashCode;
    }

    @Override
    public AwsKinesisStreamStreamEncryptionDetails clone() {
        try {
            return (AwsKinesisStreamStreamEncryptionDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsKinesisStreamStreamEncryptionDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
