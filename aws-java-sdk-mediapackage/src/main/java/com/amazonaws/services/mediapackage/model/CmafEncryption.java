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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * A Common Media Application Format (CMAF) encryption configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/CmafEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CmafEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting blocks. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     */
    private String constantInitializationVector;
    /** Time (in seconds) between each encryption key rotation. */
    private Integer keyRotationIntervalSeconds;

    private SpekeKeyProvider spekeKeyProvider;

    /**
     * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting blocks. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     * 
     * @param constantInitializationVector
     *        An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the
     *        key for encrypting blocks. If you don't specify a value, then MediaPackage creates the constant
     *        initialization vector (IV).
     */

    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting blocks. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     * 
     * @return An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the
     *         key for encrypting blocks. If you don't specify a value, then MediaPackage creates the constant
     *         initialization vector (IV).
     */

    public String getConstantInitializationVector() {
        return this.constantInitializationVector;
    }

    /**
     * An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for
     * encrypting blocks. If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     * 
     * @param constantInitializationVector
     *        An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the
     *        key for encrypting blocks. If you don't specify a value, then MediaPackage creates the constant
     *        initialization vector (IV).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryption withConstantInitializationVector(String constantInitializationVector) {
        setConstantInitializationVector(constantInitializationVector);
        return this;
    }

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     * @param keyRotationIntervalSeconds
     *        Time (in seconds) between each encryption key rotation.
     */

    public void setKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
    }

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     * @return Time (in seconds) between each encryption key rotation.
     */

    public Integer getKeyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds;
    }

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     * @param keyRotationIntervalSeconds
     *        Time (in seconds) between each encryption key rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryption withKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        setKeyRotationIntervalSeconds(keyRotationIntervalSeconds);
        return this;
    }

    /**
     * @param spekeKeyProvider
     */

    public void setSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * @return
     */

    public SpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    /**
     * @param spekeKeyProvider
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CmafEncryption withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
        setSpekeKeyProvider(spekeKeyProvider);
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
        if (getConstantInitializationVector() != null)
            sb.append("ConstantInitializationVector: ").append(getConstantInitializationVector()).append(",");
        if (getKeyRotationIntervalSeconds() != null)
            sb.append("KeyRotationIntervalSeconds: ").append(getKeyRotationIntervalSeconds()).append(",");
        if (getSpekeKeyProvider() != null)
            sb.append("SpekeKeyProvider: ").append(getSpekeKeyProvider());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafEncryption == false)
            return false;
        CmafEncryption other = (CmafEncryption) obj;
        if (other.getConstantInitializationVector() == null ^ this.getConstantInitializationVector() == null)
            return false;
        if (other.getConstantInitializationVector() != null && other.getConstantInitializationVector().equals(this.getConstantInitializationVector()) == false)
            return false;
        if (other.getKeyRotationIntervalSeconds() == null ^ this.getKeyRotationIntervalSeconds() == null)
            return false;
        if (other.getKeyRotationIntervalSeconds() != null && other.getKeyRotationIntervalSeconds().equals(this.getKeyRotationIntervalSeconds()) == false)
            return false;
        if (other.getSpekeKeyProvider() == null ^ this.getSpekeKeyProvider() == null)
            return false;
        if (other.getSpekeKeyProvider() != null && other.getSpekeKeyProvider().equals(this.getSpekeKeyProvider()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstantInitializationVector() == null) ? 0 : getConstantInitializationVector().hashCode());
        hashCode = prime * hashCode + ((getKeyRotationIntervalSeconds() == null) ? 0 : getKeyRotationIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public CmafEncryption clone() {
        try {
            return (CmafEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackage.model.transform.CmafEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
