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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a key pair.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/KeyPair" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyPair implements Serializable, Cloneable {

    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     */
    private String keyFingerprint;
    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     */
    private String keyMaterial;
    /**
     * <p>
     * The name of the key pair.
     * </p>
     */
    private String keyName;

    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     * 
     * @param keyFingerprint
     *        The SHA-1 digest of the DER encoded private key.
     */

    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }

    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     * 
     * @return The SHA-1 digest of the DER encoded private key.
     */

    public String getKeyFingerprint() {
        return this.keyFingerprint;
    }

    /**
     * <p>
     * The SHA-1 digest of the DER encoded private key.
     * </p>
     * 
     * @param keyFingerprint
     *        The SHA-1 digest of the DER encoded private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withKeyFingerprint(String keyFingerprint) {
        setKeyFingerprint(keyFingerprint);
        return this;
    }

    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     * 
     * @param keyMaterial
     *        An unencrypted PEM encoded RSA private key.
     */

    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     * 
     * @return An unencrypted PEM encoded RSA private key.
     */

    public String getKeyMaterial() {
        return this.keyMaterial;
    }

    /**
     * <p>
     * An unencrypted PEM encoded RSA private key.
     * </p>
     * 
     * @param keyMaterial
     *        An unencrypted PEM encoded RSA private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withKeyMaterial(String keyMaterial) {
        setKeyMaterial(keyMaterial);
        return this;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     */

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @return The name of the key pair.
     */

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * <p>
     * The name of the key pair.
     * </p>
     * 
     * @param keyName
     *        The name of the key pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyPair withKeyName(String keyName) {
        setKeyName(keyName);
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
        if (getKeyFingerprint() != null)
            sb.append("KeyFingerprint: ").append(getKeyFingerprint()).append(",");
        if (getKeyMaterial() != null)
            sb.append("KeyMaterial: ").append(getKeyMaterial()).append(",");
        if (getKeyName() != null)
            sb.append("KeyName: ").append(getKeyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyPair == false)
            return false;
        KeyPair other = (KeyPair) obj;
        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null)
            return false;
        if (other.getKeyFingerprint() != null && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false)
            return false;
        if (other.getKeyMaterial() == null ^ this.getKeyMaterial() == null)
            return false;
        if (other.getKeyMaterial() != null && other.getKeyMaterial().equals(this.getKeyMaterial()) == false)
            return false;
        if (other.getKeyName() == null ^ this.getKeyName() == null)
            return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode());
        hashCode = prime * hashCode + ((getKeyMaterial() == null) ? 0 : getKeyMaterial().hashCode());
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode());
        return hashCode;
    }

    @Override
    public KeyPair clone() {
        try {
            return (KeyPair) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
