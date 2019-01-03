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
package com.amazonaws.services.mediapackage.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * An HTTP Live Streaming (HLS) encryption configuration.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediapackage-2017-10-12/HlsEncryption" target="_top">AWS API
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
    /** Interval (in seconds) between each encryption key rotation. */
    private Integer keyRotationIntervalSeconds;
    /** When enabled, the EXT-X-KEY tag will be repeated in output manifests. */
    private Boolean repeatExtXKey;

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
     * Interval (in seconds) between each encryption key rotation.
     * 
     * @param keyRotationIntervalSeconds
     *        Interval (in seconds) between each encryption key rotation.
     */

    public void setKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
    }

    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     * @return Interval (in seconds) between each encryption key rotation.
     */

    public Integer getKeyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds;
    }

    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     * @param keyRotationIntervalSeconds
     *        Interval (in seconds) between each encryption key rotation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsEncryption withKeyRotationIntervalSeconds(Integer keyRotationIntervalSeconds) {
        setKeyRotationIntervalSeconds(keyRotationIntervalSeconds);
        return this;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @param repeatExtXKey
     *        When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     */

    public void setRepeatExtXKey(Boolean repeatExtXKey) {
        this.repeatExtXKey = repeatExtXKey;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @return When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     */

    public Boolean getRepeatExtXKey() {
        return this.repeatExtXKey;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @param repeatExtXKey
     *        When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsEncryption withRepeatExtXKey(Boolean repeatExtXKey) {
        setRepeatExtXKey(repeatExtXKey);
        return this;
    }

    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     * @return When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     */

    public Boolean isRepeatExtXKey() {
        return this.repeatExtXKey;
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
        if (getKeyRotationIntervalSeconds() != null)
            sb.append("KeyRotationIntervalSeconds: ").append(getKeyRotationIntervalSeconds()).append(",");
        if (getRepeatExtXKey() != null)
            sb.append("RepeatExtXKey: ").append(getRepeatExtXKey()).append(",");
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
        if (other.getKeyRotationIntervalSeconds() == null ^ this.getKeyRotationIntervalSeconds() == null)
            return false;
        if (other.getKeyRotationIntervalSeconds() != null && other.getKeyRotationIntervalSeconds().equals(this.getKeyRotationIntervalSeconds()) == false)
            return false;
        if (other.getRepeatExtXKey() == null ^ this.getRepeatExtXKey() == null)
            return false;
        if (other.getRepeatExtXKey() != null && other.getRepeatExtXKey().equals(this.getRepeatExtXKey()) == false)
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
        hashCode = prime * hashCode + ((getKeyRotationIntervalSeconds() == null) ? 0 : getKeyRotationIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getRepeatExtXKey() == null) ? 0 : getRepeatExtXKey().hashCode());
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
        com.amazonaws.services.mediapackage.model.transform.HlsEncryptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
