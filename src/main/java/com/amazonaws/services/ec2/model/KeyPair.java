/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an Amazon EC2 key pair, including the private key material.
 * </p>
 * <p>
 * The public key portion is stored by Amazon EC2 and the private key is returned only once, in this type, when the key is initially created.
 * </p>
 */
public class KeyPair implements Serializable {

    /**
     * The name of the key pair.
     */
    private String keyName;

    /**
     * The SHA-1 digest of the DER encoded private key.
     */
    private String keyFingerprint;

    /**
     * The unencrypted PEM encoded RSA private key.
     */
    private String keyMaterial;

    /**
     * The name of the key pair.
     *
     * @return The name of the key pair.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The name of the key pair.
     *
     * @param keyName The name of the key pair.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The name of the key pair.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The name of the key pair.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeyPair withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * The SHA-1 digest of the DER encoded private key.
     *
     * @return The SHA-1 digest of the DER encoded private key.
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }
    
    /**
     * The SHA-1 digest of the DER encoded private key.
     *
     * @param keyFingerprint The SHA-1 digest of the DER encoded private key.
     */
    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }
    
    /**
     * The SHA-1 digest of the DER encoded private key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyFingerprint The SHA-1 digest of the DER encoded private key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeyPair withKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
        return this;
    }

    /**
     * The unencrypted PEM encoded RSA private key.
     *
     * @return The unencrypted PEM encoded RSA private key.
     */
    public String getKeyMaterial() {
        return keyMaterial;
    }
    
    /**
     * The unencrypted PEM encoded RSA private key.
     *
     * @param keyMaterial The unencrypted PEM encoded RSA private key.
     */
    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }
    
    /**
     * The unencrypted PEM encoded RSA private key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyMaterial The unencrypted PEM encoded RSA private key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public KeyPair withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getKeyFingerprint() != null) sb.append("KeyFingerprint: " + getKeyFingerprint() + ",");
        if (getKeyMaterial() != null) sb.append("KeyMaterial: " + getKeyMaterial() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode()); 
        hashCode = prime * hashCode + ((getKeyMaterial() == null) ? 0 : getKeyMaterial().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof KeyPair == false) return false;
        KeyPair other = (KeyPair)obj;
        
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null) return false;
        if (other.getKeyFingerprint() != null && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false) return false; 
        if (other.getKeyMaterial() == null ^ this.getKeyMaterial() == null) return false;
        if (other.getKeyMaterial() != null && other.getKeyMaterial().equals(this.getKeyMaterial()) == false) return false; 
        return true;
    }
    
}
    