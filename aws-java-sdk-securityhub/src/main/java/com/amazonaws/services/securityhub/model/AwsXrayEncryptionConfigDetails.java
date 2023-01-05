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
 * Information about the encryption configuration for X-Ray.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsXrayEncryptionConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsXrayEncryptionConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the KMS key that is used for encryption. Provided if <code>Type</code> is <code>KMS</code>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The current status of the encryption configuration. Valid values are <code>ACTIVE</code> or <code>UPDATING</code>
     * .
     * </p>
     * <p>
     * When <code>Status</code> is equal to <code>UPDATING</code>, X-Ray might use both the old and new encryption.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The type of encryption. <code>KMS</code> indicates that the encryption uses KMS keys. <code>NONE</code> indicates
     * the default encryption.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier of the KMS key that is used for encryption. Provided if <code>Type</code> is <code>KMS</code>.
     * </p>
     * 
     * @param keyId
     *        The identifier of the KMS key that is used for encryption. Provided if <code>Type</code> is
     *        <code>KMS</code>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The identifier of the KMS key that is used for encryption. Provided if <code>Type</code> is <code>KMS</code>.
     * </p>
     * 
     * @return The identifier of the KMS key that is used for encryption. Provided if <code>Type</code> is
     *         <code>KMS</code>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The identifier of the KMS key that is used for encryption. Provided if <code>Type</code> is <code>KMS</code>.
     * </p>
     * 
     * @param keyId
     *        The identifier of the KMS key that is used for encryption. Provided if <code>Type</code> is
     *        <code>KMS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsXrayEncryptionConfigDetails withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The current status of the encryption configuration. Valid values are <code>ACTIVE</code> or <code>UPDATING</code>
     * .
     * </p>
     * <p>
     * When <code>Status</code> is equal to <code>UPDATING</code>, X-Ray might use both the old and new encryption.
     * </p>
     * 
     * @param status
     *        The current status of the encryption configuration. Valid values are <code>ACTIVE</code> or
     *        <code>UPDATING</code>.</p>
     *        <p>
     *        When <code>Status</code> is equal to <code>UPDATING</code>, X-Ray might use both the old and new
     *        encryption.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the encryption configuration. Valid values are <code>ACTIVE</code> or <code>UPDATING</code>
     * .
     * </p>
     * <p>
     * When <code>Status</code> is equal to <code>UPDATING</code>, X-Ray might use both the old and new encryption.
     * </p>
     * 
     * @return The current status of the encryption configuration. Valid values are <code>ACTIVE</code> or
     *         <code>UPDATING</code>.</p>
     *         <p>
     *         When <code>Status</code> is equal to <code>UPDATING</code>, X-Ray might use both the old and new
     *         encryption.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the encryption configuration. Valid values are <code>ACTIVE</code> or <code>UPDATING</code>
     * .
     * </p>
     * <p>
     * When <code>Status</code> is equal to <code>UPDATING</code>, X-Ray might use both the old and new encryption.
     * </p>
     * 
     * @param status
     *        The current status of the encryption configuration. Valid values are <code>ACTIVE</code> or
     *        <code>UPDATING</code>.</p>
     *        <p>
     *        When <code>Status</code> is equal to <code>UPDATING</code>, X-Ray might use both the old and new
     *        encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsXrayEncryptionConfigDetails withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The type of encryption. <code>KMS</code> indicates that the encryption uses KMS keys. <code>NONE</code> indicates
     * the default encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. <code>KMS</code> indicates that the encryption uses KMS keys. <code>NONE</code>
     *        indicates the default encryption.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of encryption. <code>KMS</code> indicates that the encryption uses KMS keys. <code>NONE</code> indicates
     * the default encryption.
     * </p>
     * 
     * @return The type of encryption. <code>KMS</code> indicates that the encryption uses KMS keys. <code>NONE</code>
     *         indicates the default encryption.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of encryption. <code>KMS</code> indicates that the encryption uses KMS keys. <code>NONE</code> indicates
     * the default encryption.
     * </p>
     * 
     * @param type
     *        The type of encryption. <code>KMS</code> indicates that the encryption uses KMS keys. <code>NONE</code>
     *        indicates the default encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsXrayEncryptionConfigDetails withType(String type) {
        setType(type);
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

        if (obj instanceof AwsXrayEncryptionConfigDetails == false)
            return false;
        AwsXrayEncryptionConfigDetails other = (AwsXrayEncryptionConfigDetails) obj;
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
    public AwsXrayEncryptionConfigDetails clone() {
        try {
            return (AwsXrayEncryptionConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsXrayEncryptionConfigDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
