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
package com.amazonaws.services.nimblestudio.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration of the encryption method that is used for the studio.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/nimble-2020-08-01/StudioEncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StudioEncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for a KMS key that is used to encrypt studio data.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * The type of KMS key that is used to encrypt studio data.
     * </p>
     */
    private String keyType;

    /**
     * <p>
     * The ARN for a KMS key that is used to encrypt studio data.
     * </p>
     * 
     * @param keyArn
     *        The ARN for a KMS key that is used to encrypt studio data.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The ARN for a KMS key that is used to encrypt studio data.
     * </p>
     * 
     * @return The ARN for a KMS key that is used to encrypt studio data.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The ARN for a KMS key that is used to encrypt studio data.
     * </p>
     * 
     * @param keyArn
     *        The ARN for a KMS key that is used to encrypt studio data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StudioEncryptionConfiguration withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * The type of KMS key that is used to encrypt studio data.
     * </p>
     * 
     * @param keyType
     *        The type of KMS key that is used to encrypt studio data.
     * @see StudioEncryptionConfigurationKeyType
     */

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    /**
     * <p>
     * The type of KMS key that is used to encrypt studio data.
     * </p>
     * 
     * @return The type of KMS key that is used to encrypt studio data.
     * @see StudioEncryptionConfigurationKeyType
     */

    public String getKeyType() {
        return this.keyType;
    }

    /**
     * <p>
     * The type of KMS key that is used to encrypt studio data.
     * </p>
     * 
     * @param keyType
     *        The type of KMS key that is used to encrypt studio data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioEncryptionConfigurationKeyType
     */

    public StudioEncryptionConfiguration withKeyType(String keyType) {
        setKeyType(keyType);
        return this;
    }

    /**
     * <p>
     * The type of KMS key that is used to encrypt studio data.
     * </p>
     * 
     * @param keyType
     *        The type of KMS key that is used to encrypt studio data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StudioEncryptionConfigurationKeyType
     */

    public StudioEncryptionConfiguration withKeyType(StudioEncryptionConfigurationKeyType keyType) {
        this.keyType = keyType.toString();
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getKeyType() != null)
            sb.append("KeyType: ").append(getKeyType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StudioEncryptionConfiguration == false)
            return false;
        StudioEncryptionConfiguration other = (StudioEncryptionConfiguration) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getKeyType() == null ^ this.getKeyType() == null)
            return false;
        if (other.getKeyType() != null && other.getKeyType().equals(this.getKeyType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getKeyType() == null) ? 0 : getKeyType().hashCode());
        return hashCode;
    }

    @Override
    public StudioEncryptionConfiguration clone() {
        try {
            return (StudioEncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.nimblestudio.model.transform.StudioEncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
