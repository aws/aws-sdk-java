/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration document that specifies encryption configuration settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/EncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the customer master key (CMK) used for encryption, if applicable.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of
     * the new and old settings.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default
     * encryption.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the customer master key (CMK) used for encryption, if applicable.
     * </p>
     * 
     * @param keyId
     *        The ID of the customer master key (CMK) used for encryption, if applicable.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The ID of the customer master key (CMK) used for encryption, if applicable.
     * </p>
     * 
     * @return The ID of the customer master key (CMK) used for encryption, if applicable.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The ID of the customer master key (CMK) used for encryption, if applicable.
     * </p>
     * 
     * @param keyId
     *        The ID of the customer master key (CMK) used for encryption, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfig withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of
     * the new and old settings.
     * </p>
     * 
     * @param status
     *        The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a
     *        combination of the new and old settings.
     * @see EncryptionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of
     * the new and old settings.
     * </p>
     * 
     * @return The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a
     *         combination of the new and old settings.
     * @see EncryptionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of
     * the new and old settings.
     * </p>
     * 
     * @param status
     *        The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a
     *        combination of the new and old settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionStatus
     */

    public EncryptionConfig withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a combination of
     * the new and old settings.
     * </p>
     * 
     * @param status
     *        The encryption status. While the status is <code>UPDATING</code>, X-Ray may encrypt data with a
     *        combination of the new and old settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionStatus
     */

    public EncryptionConfig withStatus(EncryptionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default
     * encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for
     *        default encryption.
     * @see EncryptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default
     * encryption.
     * </p>
     * 
     * @return The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for
     *         default encryption.
     * @see EncryptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default
     * encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for
     *        default encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfig withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for default
     * encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. Set to <code>KMS</code> for encryption with CMKs. Set to <code>NONE</code> for
     *        default encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfig withType(EncryptionType type) {
        this.type = type.toString();
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
        com.amazonaws.services.xray.model.transform.EncryptionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
