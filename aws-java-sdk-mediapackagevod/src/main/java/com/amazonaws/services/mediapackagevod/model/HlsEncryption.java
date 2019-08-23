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
package com.amazonaws.services.mediapackagevod.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An HTTP Live Streaming (HLS) encryption configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-vod-2018-11-07/HlsEncryption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsEncryption implements Serializable, Cloneable, StructuredPojo {

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be
     * periodically rotated.
     */
    private String constantInitializationVector;
    /** The encryption method to use. */
    private String encryptionMethod;

    private SpekeKeyProvider spekeKeyProvider;

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be
     * periodically rotated.
     * 
     * @param constantInitializationVector
     *        A constant initialization vector for encryption (optional). When not specified the initialization vector
     *        will be periodically rotated.
     */

    public void setConstantInitializationVector(String constantInitializationVector) {
        this.constantInitializationVector = constantInitializationVector;
    }

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be
     * periodically rotated.
     * 
     * @return A constant initialization vector for encryption (optional). When not specified the initialization vector
     *         will be periodically rotated.
     */

    public String getConstantInitializationVector() {
        return this.constantInitializationVector;
    }

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be
     * periodically rotated.
     * 
     * @param constantInitializationVector
     *        A constant initialization vector for encryption (optional). When not specified the initialization vector
     *        will be periodically rotated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsEncryption withConstantInitializationVector(String constantInitializationVector) {
        setConstantInitializationVector(constantInitializationVector);
        return this;
    }

    /**
     * The encryption method to use.
     * 
     * @param encryptionMethod
     *        The encryption method to use.
     * @see EncryptionMethod
     */

    public void setEncryptionMethod(String encryptionMethod) {
        this.encryptionMethod = encryptionMethod;
    }

    /**
     * The encryption method to use.
     * 
     * @return The encryption method to use.
     * @see EncryptionMethod
     */

    public String getEncryptionMethod() {
        return this.encryptionMethod;
    }

    /**
     * The encryption method to use.
     * 
     * @param encryptionMethod
     *        The encryption method to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMethod
     */

    public HlsEncryption withEncryptionMethod(String encryptionMethod) {
        setEncryptionMethod(encryptionMethod);
        return this;
    }

    /**
     * The encryption method to use.
     * 
     * @param encryptionMethod
     *        The encryption method to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionMethod
     */

    public HlsEncryption withEncryptionMethod(EncryptionMethod encryptionMethod) {
        this.encryptionMethod = encryptionMethod.toString();
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

    public HlsEncryption withSpekeKeyProvider(SpekeKeyProvider spekeKeyProvider) {
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
        if (getEncryptionMethod() != null)
            sb.append("EncryptionMethod: ").append(getEncryptionMethod()).append(",");
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

        if (obj instanceof HlsEncryption == false)
            return false;
        HlsEncryption other = (HlsEncryption) obj;
        if (other.getConstantInitializationVector() == null ^ this.getConstantInitializationVector() == null)
            return false;
        if (other.getConstantInitializationVector() != null && other.getConstantInitializationVector().equals(this.getConstantInitializationVector()) == false)
            return false;
        if (other.getEncryptionMethod() == null ^ this.getEncryptionMethod() == null)
            return false;
        if (other.getEncryptionMethod() != null && other.getEncryptionMethod().equals(this.getEncryptionMethod()) == false)
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
        hashCode = prime * hashCode + ((getEncryptionMethod() == null) ? 0 : getEncryptionMethod().hashCode());
        hashCode = prime * hashCode + ((getSpekeKeyProvider() == null) ? 0 : getSpekeKeyProvider().hashCode());
        return hashCode;
    }

    @Override
    public HlsEncryption clone() {
        try {
            return (HlsEncryption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediapackagevod.model.transform.HlsEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
