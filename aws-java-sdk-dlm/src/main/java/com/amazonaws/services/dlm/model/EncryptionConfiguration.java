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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the encryption settings for shared snapshots that are copied across Regions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/EncryptionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EncryptionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption
     * by default is not enabled.
     * </p>
     */
    private Boolean encrypted;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     */
    private String cmkArn;

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption
     * by default is not enabled.
     * </p>
     * 
     * @param encrypted
     *        To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption
     *        using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when
     *        encryption by default is not enabled.
     */

    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption
     * by default is not enabled.
     * </p>
     * 
     * @return To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption
     *         using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or
     *         when encryption by default is not enabled.
     */

    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption
     * by default is not enabled.
     * </p>
     * 
     * @param encrypted
     *        To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption
     *        using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when
     *        encryption by default is not enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withEncrypted(Boolean encrypted) {
        setEncrypted(encrypted);
        return this;
    }

    /**
     * <p>
     * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption using
     * this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption
     * by default is not enabled.
     * </p>
     * 
     * @return To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption
     *         using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or
     *         when encryption by default is not enabled.
     */

    public Boolean isEncrypted() {
        return this.encrypted;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     * 
     * @param cmkArn
     *        The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     *        parameter is not specified, your AWS managed CMK for EBS is used.
     */

    public void setCmkArn(String cmkArn) {
        this.cmkArn = cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If
     *         this parameter is not specified, your AWS managed CMK for EBS is used.
     */

    public String getCmkArn() {
        return this.cmkArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     * parameter is not specified, your AWS managed CMK for EBS is used.
     * </p>
     * 
     * @param cmkArn
     *        The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this
     *        parameter is not specified, your AWS managed CMK for EBS is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EncryptionConfiguration withCmkArn(String cmkArn) {
        setCmkArn(cmkArn);
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
        if (getEncrypted() != null)
            sb.append("Encrypted: ").append(getEncrypted()).append(",");
        if (getCmkArn() != null)
            sb.append("CmkArn: ").append(getCmkArn());
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
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getCmkArn() == null ^ this.getCmkArn() == null)
            return false;
        if (other.getCmkArn() != null && other.getCmkArn().equals(this.getCmkArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getCmkArn() == null) ? 0 : getCmkArn().hashCode());
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
        com.amazonaws.services.dlm.model.transform.EncryptionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
