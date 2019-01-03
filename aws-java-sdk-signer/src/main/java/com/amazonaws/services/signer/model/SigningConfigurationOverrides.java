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
package com.amazonaws.services.signer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A signing configuration that overrides the default encryption or hash algorithm of a signing job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningConfigurationOverrides"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningConfigurationOverrides implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * </p>
     */
    private String encryptionAlgorithm;
    /**
     * <p>
     * A specified override of the default hash algorithm that is used in an AWS Signer job.
     * </p>
     */
    private String hashAlgorithm;

    /**
     * <p>
     * A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * @see EncryptionAlgorithm
     */

    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    /**
     * <p>
     * A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @return A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * @see EncryptionAlgorithm
     */

    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * <p>
     * A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithm
     */

    public SigningConfigurationOverrides withEncryptionAlgorithm(String encryptionAlgorithm) {
        setEncryptionAlgorithm(encryptionAlgorithm);
        return this;
    }

    /**
     * <p>
     * A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @param encryptionAlgorithm
     *        A specified override of the default encryption algorithm that is used in an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionAlgorithm
     */

    public SigningConfigurationOverrides withEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * A specified override of the default hash algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @param hashAlgorithm
     *        A specified override of the default hash algorithm that is used in an AWS Signer job.
     * @see HashAlgorithm
     */

    public void setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
    }

    /**
     * <p>
     * A specified override of the default hash algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @return A specified override of the default hash algorithm that is used in an AWS Signer job.
     * @see HashAlgorithm
     */

    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    /**
     * <p>
     * A specified override of the default hash algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @param hashAlgorithm
     *        A specified override of the default hash algorithm that is used in an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HashAlgorithm
     */

    public SigningConfigurationOverrides withHashAlgorithm(String hashAlgorithm) {
        setHashAlgorithm(hashAlgorithm);
        return this;
    }

    /**
     * <p>
     * A specified override of the default hash algorithm that is used in an AWS Signer job.
     * </p>
     * 
     * @param hashAlgorithm
     *        A specified override of the default hash algorithm that is used in an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HashAlgorithm
     */

    public SigningConfigurationOverrides withHashAlgorithm(HashAlgorithm hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm.toString();
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
        if (getEncryptionAlgorithm() != null)
            sb.append("EncryptionAlgorithm: ").append(getEncryptionAlgorithm()).append(",");
        if (getHashAlgorithm() != null)
            sb.append("HashAlgorithm: ").append(getHashAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningConfigurationOverrides == false)
            return false;
        SigningConfigurationOverrides other = (SigningConfigurationOverrides) obj;
        if (other.getEncryptionAlgorithm() == null ^ this.getEncryptionAlgorithm() == null)
            return false;
        if (other.getEncryptionAlgorithm() != null && other.getEncryptionAlgorithm().equals(this.getEncryptionAlgorithm()) == false)
            return false;
        if (other.getHashAlgorithm() == null ^ this.getHashAlgorithm() == null)
            return false;
        if (other.getHashAlgorithm() != null && other.getHashAlgorithm().equals(this.getHashAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionAlgorithm() == null) ? 0 : getEncryptionAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getHashAlgorithm() == null) ? 0 : getHashAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public SigningConfigurationOverrides clone() {
        try {
            return (SigningConfigurationOverrides) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningConfigurationOverridesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
