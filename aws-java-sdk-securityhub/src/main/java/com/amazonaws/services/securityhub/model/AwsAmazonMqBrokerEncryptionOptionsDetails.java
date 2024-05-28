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
 * Provides details about broker encryption options.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAmazonMqBrokerEncryptionOptionsDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAmazonMqBrokerEncryptionOptionsDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The KMS key that’s used to encrypt your data at rest. If not provided, Amazon MQ will use a default KMS key to
     * encrypt your data.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if no value
     * is provided (for example, for RabbitMQ brokers).
     * </p>
     */
    private Boolean useAwsOwnedKey;

    /**
     * <p>
     * The KMS key that’s used to encrypt your data at rest. If not provided, Amazon MQ will use a default KMS key to
     * encrypt your data.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key that’s used to encrypt your data at rest. If not provided, Amazon MQ will use a default KMS
     *        key to encrypt your data.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key that’s used to encrypt your data at rest. If not provided, Amazon MQ will use a default KMS key to
     * encrypt your data.
     * </p>
     * 
     * @return The KMS key that’s used to encrypt your data at rest. If not provided, Amazon MQ will use a default KMS
     *         key to encrypt your data.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key that’s used to encrypt your data at rest. If not provided, Amazon MQ will use a default KMS key to
     * encrypt your data.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key that’s used to encrypt your data at rest. If not provided, Amazon MQ will use a default KMS
     *        key to encrypt your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerEncryptionOptionsDetails withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if no value
     * is provided (for example, for RabbitMQ brokers).
     * </p>
     * 
     * @param useAwsOwnedKey
     *        Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if no
     *        value is provided (for example, for RabbitMQ brokers).
     */

    public void setUseAwsOwnedKey(Boolean useAwsOwnedKey) {
        this.useAwsOwnedKey = useAwsOwnedKey;
    }

    /**
     * <p>
     * Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if no value
     * is provided (for example, for RabbitMQ brokers).
     * </p>
     * 
     * @return Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if
     *         no value is provided (for example, for RabbitMQ brokers).
     */

    public Boolean getUseAwsOwnedKey() {
        return this.useAwsOwnedKey;
    }

    /**
     * <p>
     * Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if no value
     * is provided (for example, for RabbitMQ brokers).
     * </p>
     * 
     * @param useAwsOwnedKey
     *        Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if no
     *        value is provided (for example, for RabbitMQ brokers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAmazonMqBrokerEncryptionOptionsDetails withUseAwsOwnedKey(Boolean useAwsOwnedKey) {
        setUseAwsOwnedKey(useAwsOwnedKey);
        return this;
    }

    /**
     * <p>
     * Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if no value
     * is provided (for example, for RabbitMQ brokers).
     * </p>
     * 
     * @return Specifies that an KMS key should be used for at-rest encryption. Set to <code>true</code> by default if
     *         no value is provided (for example, for RabbitMQ brokers).
     */

    public Boolean isUseAwsOwnedKey() {
        return this.useAwsOwnedKey;
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
        if (getUseAwsOwnedKey() != null)
            sb.append("UseAwsOwnedKey: ").append(getUseAwsOwnedKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAmazonMqBrokerEncryptionOptionsDetails == false)
            return false;
        AwsAmazonMqBrokerEncryptionOptionsDetails other = (AwsAmazonMqBrokerEncryptionOptionsDetails) obj;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getUseAwsOwnedKey() == null ^ this.getUseAwsOwnedKey() == null)
            return false;
        if (other.getUseAwsOwnedKey() != null && other.getUseAwsOwnedKey().equals(this.getUseAwsOwnedKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getUseAwsOwnedKey() == null) ? 0 : getUseAwsOwnedKey().hashCode());
        return hashCode;
    }

    @Override
    public AwsAmazonMqBrokerEncryptionOptionsDetails clone() {
        try {
            return (AwsAmazonMqBrokerEncryptionOptionsDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAmazonMqBrokerEncryptionOptionsDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
