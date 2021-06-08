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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The encryption configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/EncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of encryption.
     * </p>
     */
    private String encryptionType;
    /**
     * <p>
     * The identifier of the encryption key.
     * </p>
     */
    private String keyId;

    /**
     * <p>
     * The type of encryption.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption.
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The type of encryption.
     * </p>
     * 
     * @return The type of encryption.
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The type of encryption.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfig withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The type of encryption.
     * </p>
     * 
     * @param encryptionType
     *        The type of encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfig withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the encryption key.
     * </p>
     * 
     * @param keyId
     *        The identifier of the encryption key.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the encryption key.
     * </p>
     * 
     * @return The identifier of the encryption key.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the encryption key.
     * </p>
     * 
     * @param keyId
     *        The identifier of the encryption key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfig withKeyId(String keyId) {
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

        if (obj instanceof EncryptionConfig == false)
            return false;
        EncryptionConfig other = (EncryptionConfig) obj;
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
    public EncryptionConfig clone() {
        try {
            return (EncryptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.EncryptionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
