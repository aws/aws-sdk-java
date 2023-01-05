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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains optional Amazon Web Services Key Management Service (KMS) encryption settings for your
 * Network Firewall resources. Your data is encrypted by default with an Amazon Web Services owned key that Amazon Web
 * Services owns and manages for you. You can use either the Amazon Web Services owned key, or provide your own customer
 * managed key. To learn more about KMS encryption of your Network Firewall resources, see <a
 * href="https://docs.aws.amazon.com/kms/latest/developerguide/kms-encryption-at-rest.html">Encryption at rest with
 * Amazon Web Services Key Managment Service</a> in the <i>Network Firewall Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/EncryptionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of the key
     * identifiers that KMS supports, unless you're using a key that's managed by another account. If you're using a key
     * managed by another account, then specify the key ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key ID</a> in the <i>Amazon Web
     * Services KMS Developer Guide</i>.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of the key
     * identifiers that KMS supports, unless you're using a key that's managed by another account. If you're using a key
     * managed by another account, then specify the key ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key ID</a> in the <i>Amazon Web
     * Services KMS Developer Guide</i>.
     * </p>
     * 
     * @param keyId
     *        The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of
     *        the key identifiers that KMS supports, unless you're using a key that's managed by another account. If
     *        you're using a key managed by another account, then specify the key ARN. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key ID</a> in the
     *        <i>Amazon Web Services KMS Developer Guide</i>.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of the key
     * identifiers that KMS supports, unless you're using a key that's managed by another account. If you're using a key
     * managed by another account, then specify the key ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key ID</a> in the <i>Amazon Web
     * Services KMS Developer Guide</i>.
     * </p>
     * 
     * @return The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of
     *         the key identifiers that KMS supports, unless you're using a key that's managed by another account. If
     *         you're using a key managed by another account, then specify the key ARN. For more information, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key ID</a> in the
     *         <i>Amazon Web Services KMS Developer Guide</i>.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of the key
     * identifiers that KMS supports, unless you're using a key that's managed by another account. If you're using a key
     * managed by another account, then specify the key ARN. For more information, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key ID</a> in the <i>Amazon Web
     * Services KMS Developer Guide</i>.
     * </p>
     * 
     * @param keyId
     *        The ID of the Amazon Web Services Key Management Service (KMS) customer managed key. You can use any of
     *        the key identifiers that KMS supports, unless you're using a key that's managed by another account. If
     *        you're using a key managed by another account, then specify the key ARN. For more information, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id">Key ID</a> in the
     *        <i>Amazon Web Services KMS Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * </p>
     * 
     * @param type
     *        The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * @see EncryptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * </p>
     * 
     * @return The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * @see EncryptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * </p>
     * 
     * @param type
     *        The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfiguration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * </p>
     * 
     * @param type
     *        The type of Amazon Web Services KMS key to use for encryption of your Network Firewall resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionConfiguration withType(EncryptionType type) {
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

        if (obj instanceof EncryptionConfiguration == false)
            return false;
        EncryptionConfiguration other = (EncryptionConfiguration) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
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
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionConfiguration clone() {
        try {
            return (EncryptionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.EncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
