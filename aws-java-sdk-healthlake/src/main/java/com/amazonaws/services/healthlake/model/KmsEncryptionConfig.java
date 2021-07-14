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
package com.amazonaws.services.healthlake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The customer-managed-key(CMK) used when creating a Data Store. If a customer owned key is not specified, an AWS owned
 * key will be used for encryption.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/healthlake-2017-07-01/KmsEncryptionConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KmsEncryptionConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer owned
     * CMKs and AWS owned CMKs.
     * </p>
     */
    private String cmkType;
    /**
     * <p>
     * The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer owned
     * CMKs and AWS owned CMKs.
     * </p>
     * 
     * @param cmkType
     *        The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer
     *        owned CMKs and AWS owned CMKs.
     * @see CmkType
     */

    public void setCmkType(String cmkType) {
        this.cmkType = cmkType;
    }

    /**
     * <p>
     * The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer owned
     * CMKs and AWS owned CMKs.
     * </p>
     * 
     * @return The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer
     *         owned CMKs and AWS owned CMKs.
     * @see CmkType
     */

    public String getCmkType() {
        return this.cmkType;
    }

    /**
     * <p>
     * The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer owned
     * CMKs and AWS owned CMKs.
     * </p>
     * 
     * @param cmkType
     *        The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer
     *        owned CMKs and AWS owned CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmkType
     */

    public KmsEncryptionConfig withCmkType(String cmkType) {
        setCmkType(cmkType);
        return this;
    }

    /**
     * <p>
     * The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer owned
     * CMKs and AWS owned CMKs.
     * </p>
     * 
     * @param cmkType
     *        The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer
     *        owned CMKs and AWS owned CMKs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CmkType
     */

    public KmsEncryptionConfig withCmkType(CmkType cmkType) {
        this.cmkType = cmkType.toString();
        return this;
    }

    /**
     * <p>
     * The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     * </p>
     * 
     * @return The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS encryption key id/alias used to encrypt the Data Store contents at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KmsEncryptionConfig withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getCmkType() != null)
            sb.append("CmkType: ").append(getCmkType()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KmsEncryptionConfig == false)
            return false;
        KmsEncryptionConfig other = (KmsEncryptionConfig) obj;
        if (other.getCmkType() == null ^ this.getCmkType() == null)
            return false;
        if (other.getCmkType() != null && other.getCmkType().equals(this.getCmkType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCmkType() == null) ? 0 : getCmkType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public KmsEncryptionConfig clone() {
        try {
            return (KmsEncryptionConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.healthlake.model.transform.KmsEncryptionConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
