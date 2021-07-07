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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <important>
 * <p>
 * Does not apply to RabbitMQ brokers.
 * </p>
 * </important>
 * <p>
 * Encryption options for the broker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/EncryptionOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your
     * data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no value
     * is provided, for example, for RabbitMQ brokers.
     * </p>
     */
    private Boolean useAwsOwnedKey;

    /**
     * <p>
     * The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your
     * data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
     * </p>
     * 
     * @param kmsKeyId
     *        The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt
     *        your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your
     * data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
     * </p>
     * 
     * @return The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to
     *         encrypt your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt your
     * data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
     * </p>
     * 
     * @param kmsKeyId
     *        The customer master key (CMK) to use for the AWS Key Management Service (KMS). This key is used to encrypt
     *        your data at rest. If not provided, Amazon MQ will use a default CMK to encrypt your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionOptions withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no value
     * is provided, for example, for RabbitMQ brokers.
     * </p>
     * 
     * @param useAwsOwnedKey
     *        Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no
     *        value is provided, for example, for RabbitMQ brokers.
     */

    public void setUseAwsOwnedKey(Boolean useAwsOwnedKey) {
        this.useAwsOwnedKey = useAwsOwnedKey;
    }

    /**
     * <p>
     * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no value
     * is provided, for example, for RabbitMQ brokers.
     * </p>
     * 
     * @return Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no
     *         value is provided, for example, for RabbitMQ brokers.
     */

    public Boolean getUseAwsOwnedKey() {
        return this.useAwsOwnedKey;
    }

    /**
     * <p>
     * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no value
     * is provided, for example, for RabbitMQ brokers.
     * </p>
     * 
     * @param useAwsOwnedKey
     *        Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no
     *        value is provided, for example, for RabbitMQ brokers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionOptions withUseAwsOwnedKey(Boolean useAwsOwnedKey) {
        setUseAwsOwnedKey(useAwsOwnedKey);
        return this;
    }

    /**
     * <p>
     * Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no value
     * is provided, for example, for RabbitMQ brokers.
     * </p>
     * 
     * @return Enables the use of an AWS owned CMK using AWS Key Management Service (KMS). Set to true by default, if no
     *         value is provided, for example, for RabbitMQ brokers.
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

        if (obj instanceof EncryptionOptions == false)
            return false;
        EncryptionOptions other = (EncryptionOptions) obj;
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
    public EncryptionOptions clone() {
        try {
            return (EncryptionOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mq.model.transform.EncryptionOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
