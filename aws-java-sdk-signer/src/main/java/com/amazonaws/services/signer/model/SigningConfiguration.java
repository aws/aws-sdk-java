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
 * The configuration of an AWS Signer operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/signer-2017-08-25/SigningConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SigningConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption algorithm options that are available for an AWS Signer job.
     * </p>
     */
    private EncryptionAlgorithmOptions encryptionAlgorithmOptions;
    /**
     * <p>
     * The hash algorithm options that are available for an AWS Signer job.
     * </p>
     */
    private HashAlgorithmOptions hashAlgorithmOptions;

    /**
     * <p>
     * The encryption algorithm options that are available for an AWS Signer job.
     * </p>
     * 
     * @param encryptionAlgorithmOptions
     *        The encryption algorithm options that are available for an AWS Signer job.
     */

    public void setEncryptionAlgorithmOptions(EncryptionAlgorithmOptions encryptionAlgorithmOptions) {
        this.encryptionAlgorithmOptions = encryptionAlgorithmOptions;
    }

    /**
     * <p>
     * The encryption algorithm options that are available for an AWS Signer job.
     * </p>
     * 
     * @return The encryption algorithm options that are available for an AWS Signer job.
     */

    public EncryptionAlgorithmOptions getEncryptionAlgorithmOptions() {
        return this.encryptionAlgorithmOptions;
    }

    /**
     * <p>
     * The encryption algorithm options that are available for an AWS Signer job.
     * </p>
     * 
     * @param encryptionAlgorithmOptions
     *        The encryption algorithm options that are available for an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningConfiguration withEncryptionAlgorithmOptions(EncryptionAlgorithmOptions encryptionAlgorithmOptions) {
        setEncryptionAlgorithmOptions(encryptionAlgorithmOptions);
        return this;
    }

    /**
     * <p>
     * The hash algorithm options that are available for an AWS Signer job.
     * </p>
     * 
     * @param hashAlgorithmOptions
     *        The hash algorithm options that are available for an AWS Signer job.
     */

    public void setHashAlgorithmOptions(HashAlgorithmOptions hashAlgorithmOptions) {
        this.hashAlgorithmOptions = hashAlgorithmOptions;
    }

    /**
     * <p>
     * The hash algorithm options that are available for an AWS Signer job.
     * </p>
     * 
     * @return The hash algorithm options that are available for an AWS Signer job.
     */

    public HashAlgorithmOptions getHashAlgorithmOptions() {
        return this.hashAlgorithmOptions;
    }

    /**
     * <p>
     * The hash algorithm options that are available for an AWS Signer job.
     * </p>
     * 
     * @param hashAlgorithmOptions
     *        The hash algorithm options that are available for an AWS Signer job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SigningConfiguration withHashAlgorithmOptions(HashAlgorithmOptions hashAlgorithmOptions) {
        setHashAlgorithmOptions(hashAlgorithmOptions);
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
        if (getEncryptionAlgorithmOptions() != null)
            sb.append("EncryptionAlgorithmOptions: ").append(getEncryptionAlgorithmOptions()).append(",");
        if (getHashAlgorithmOptions() != null)
            sb.append("HashAlgorithmOptions: ").append(getHashAlgorithmOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SigningConfiguration == false)
            return false;
        SigningConfiguration other = (SigningConfiguration) obj;
        if (other.getEncryptionAlgorithmOptions() == null ^ this.getEncryptionAlgorithmOptions() == null)
            return false;
        if (other.getEncryptionAlgorithmOptions() != null && other.getEncryptionAlgorithmOptions().equals(this.getEncryptionAlgorithmOptions()) == false)
            return false;
        if (other.getHashAlgorithmOptions() == null ^ this.getHashAlgorithmOptions() == null)
            return false;
        if (other.getHashAlgorithmOptions() != null && other.getHashAlgorithmOptions().equals(this.getHashAlgorithmOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncryptionAlgorithmOptions() == null) ? 0 : getEncryptionAlgorithmOptions().hashCode());
        hashCode = prime * hashCode + ((getHashAlgorithmOptions() == null) ? 0 : getHashAlgorithmOptions().hashCode());
        return hashCode;
    }

    @Override
    public SigningConfiguration clone() {
        try {
            return (SigningConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.signer.model.transform.SigningConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
