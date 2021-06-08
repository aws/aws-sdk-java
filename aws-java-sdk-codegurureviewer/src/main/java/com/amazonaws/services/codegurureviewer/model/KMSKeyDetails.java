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
package com.amazonaws.services.codegurureviewer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (
 * <code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
 * </p>
 * </li>
 * <li>
 * <p>
 * The ID of the AWS KMS key that is associated with a respository association.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguru-reviewer-2019-09-19/KMSKeyDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KMSKeyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the AWS KMS key that is associated with a respository association.
     * </p>
     */
    private String kMSKeyId;
    /**
     * <p>
     * The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (
     * <code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * </p>
     */
    private String encryptionOption;

    /**
     * <p>
     * The ID of the AWS KMS key that is associated with a respository association.
     * </p>
     * 
     * @param kMSKeyId
     *        The ID of the AWS KMS key that is associated with a respository association.
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is associated with a respository association.
     * </p>
     * 
     * @return The ID of the AWS KMS key that is associated with a respository association.
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key that is associated with a respository association.
     * </p>
     * 
     * @param kMSKeyId
     *        The ID of the AWS KMS key that is associated with a respository association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KMSKeyDetails withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * <p>
     * The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (
     * <code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * </p>
     * 
     * @param encryptionOption
     *        The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS)
     *        (<code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * @see EncryptionOption
     */

    public void setEncryptionOption(String encryptionOption) {
        this.encryptionOption = encryptionOption;
    }

    /**
     * <p>
     * The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (
     * <code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * </p>
     * 
     * @return The encryption option for a repository association. It is either owned by AWS Key Management Service
     *         (KMS) (<code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * @see EncryptionOption
     */

    public String getEncryptionOption() {
        return this.encryptionOption;
    }

    /**
     * <p>
     * The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (
     * <code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * </p>
     * 
     * @param encryptionOption
     *        The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS)
     *        (<code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionOption
     */

    public KMSKeyDetails withEncryptionOption(String encryptionOption) {
        setEncryptionOption(encryptionOption);
        return this;
    }

    /**
     * <p>
     * The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS) (
     * <code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * </p>
     * 
     * @param encryptionOption
     *        The encryption option for a repository association. It is either owned by AWS Key Management Service (KMS)
     *        (<code>AWS_OWNED_CMK</code>) or customer managed (<code>CUSTOMER_MANAGED_CMK</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionOption
     */

    public KMSKeyDetails withEncryptionOption(EncryptionOption encryptionOption) {
        this.encryptionOption = encryptionOption.toString();
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
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getEncryptionOption() != null)
            sb.append("EncryptionOption: ").append(getEncryptionOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KMSKeyDetails == false)
            return false;
        KMSKeyDetails other = (KMSKeyDetails) obj;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getEncryptionOption() == null ^ this.getEncryptionOption() == null)
            return false;
        if (other.getEncryptionOption() != null && other.getEncryptionOption().equals(this.getEncryptionOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getEncryptionOption() == null) ? 0 : getEncryptionOption().hashCode());
        return hashCode;
    }

    @Override
    public KMSKeyDetails clone() {
        try {
            return (KMSKeyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codegurureviewer.model.transform.KMSKeyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
