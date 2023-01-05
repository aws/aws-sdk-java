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
package com.amazonaws.services.keyspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Amazon Keyspaces encrypts and decrypts the table data at rest transparently and integrates with Key Management
 * Service for storing and managing the encryption key. You can choose one of the following KMS keys (KMS keys):
 * </p>
 * <p>
 * • Amazon Web Services owned key - This is the default encryption type. The key is owned by Amazon Keyspaces (no
 * additional charge).
 * </p>
 * <p>
 * • Customer managed key - This key is stored in your account and is created, owned, and managed by you. You have full
 * control over the customer managed key (KMS charges apply).
 * </p>
 * <p>
 * For more information about encryption at rest in Amazon Keyspaces, see <a
 * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
 * <i>Amazon Keyspaces Developer Guide</i>.
 * </p>
 * <p>
 * For more information about KMS, see <a
 * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">KMS management service
 * concepts</a> in the <i>Key Management Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/keyspaces-2022-02-10/EncryptionSpecification" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption option specified for the table. You can choose one of the following KMS keys (KMS keys):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key, for example <code>kms_key_identifier:ARN</code>.
     * </p>
     */
    private String kmsKeyIdentifier;

    /**
     * <p>
     * The encryption option specified for the table. You can choose one of the following KMS keys (KMS keys):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The encryption option specified for the table. You can choose one of the following KMS keys (KMS
     *        keys):</p>
     *        <p>
     *        • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        <p>
     *        • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *        and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *        Resource Name (ARN) format as input.
     *        </p>
     *        <p>
     *        The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     * @see EncryptionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The encryption option specified for the table. You can choose one of the following KMS keys (KMS keys):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @return The encryption option specified for the table. You can choose one of the following KMS keys (KMS
     *         keys):</p>
     *         <p>
     *         • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *         </p>
     *         <p>
     *         • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *         and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *         Resource Name (ARN) format as input.
     *         </p>
     *         <p>
     *         The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *         in the <i>Amazon Keyspaces Developer Guide</i>.
     * @see EncryptionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The encryption option specified for the table. You can choose one of the following KMS keys (KMS keys):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The encryption option specified for the table. You can choose one of the following KMS keys (KMS
     *        keys):</p>
     *        <p>
     *        • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        <p>
     *        • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *        and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *        Resource Name (ARN) format as input.
     *        </p>
     *        <p>
     *        The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionSpecification withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The encryption option specified for the table. You can choose one of the following KMS keys (KMS keys):
     * </p>
     * <p>
     * • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     * </p>
     * <p>
     * • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned, and
     * managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon Resource Name
     * (ARN) format as input.
     * </p>
     * <p>
     * The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a> in the
     * <i>Amazon Keyspaces Developer Guide</i>.
     * </p>
     * 
     * @param type
     *        The encryption option specified for the table. You can choose one of the following KMS keys (KMS
     *        keys):</p>
     *        <p>
     *        • <code>type:AWS_OWNED_KMS_KEY</code> - This key is owned by Amazon Keyspaces.
     *        </p>
     *        <p>
     *        • <code>type:CUSTOMER_MANAGED_KMS_KEY</code> - This key is stored in your account and is created, owned,
     *        and managed by you. This option requires the <code>kms_key_identifier</code> of the KMS key in Amazon
     *        Resource Name (ARN) format as input.
     *        </p>
     *        <p>
     *        The default is <code>type:AWS_OWNED_KMS_KEY</code>.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/keyspaces/latest/devguide/EncryptionAtRest.html">Encryption at rest</a>
     *        in the <i>Amazon Keyspaces Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public EncryptionSpecification withType(EncryptionType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key, for example <code>kms_key_identifier:ARN</code>.
     * </p>
     * 
     * @param kmsKeyIdentifier
     *        The Amazon Resource Name (ARN) of the customer managed KMS key, for example
     *        <code>kms_key_identifier:ARN</code>.
     */

    public void setKmsKeyIdentifier(String kmsKeyIdentifier) {
        this.kmsKeyIdentifier = kmsKeyIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key, for example <code>kms_key_identifier:ARN</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the customer managed KMS key, for example
     *         <code>kms_key_identifier:ARN</code>.
     */

    public String getKmsKeyIdentifier() {
        return this.kmsKeyIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key, for example <code>kms_key_identifier:ARN</code>.
     * </p>
     * 
     * @param kmsKeyIdentifier
     *        The Amazon Resource Name (ARN) of the customer managed KMS key, for example
     *        <code>kms_key_identifier:ARN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionSpecification withKmsKeyIdentifier(String kmsKeyIdentifier) {
        setKmsKeyIdentifier(kmsKeyIdentifier);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getKmsKeyIdentifier() != null)
            sb.append("KmsKeyIdentifier: ").append(getKmsKeyIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncryptionSpecification == false)
            return false;
        EncryptionSpecification other = (EncryptionSpecification) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getKmsKeyIdentifier() == null ^ this.getKmsKeyIdentifier() == null)
            return false;
        if (other.getKmsKeyIdentifier() != null && other.getKmsKeyIdentifier().equals(this.getKmsKeyIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyIdentifier() == null) ? 0 : getKmsKeyIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EncryptionSpecification clone() {
        try {
            return (EncryptionSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.keyspaces.model.transform.EncryptionSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
