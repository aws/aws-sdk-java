/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an Amazon EC2 key pair. This is a summary of the key pair
 * data, and will not contain the actual private key material.
 * </p>
 * <p>
 * The private key material is only available when initially creating
 * the key pair.
 * </p>
 */
public class KeyPairInfo {

    /**
     * The name of the key pair.
     */
    private String keyName;

    /**
     * The SHA-1 digest of the DER encoded private key.
     */
    private String keyFingerprint;

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
    public KeyPairInfo withKeyName(String keyName) {
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
    public KeyPairInfo withKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
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
        sb.append("KeyName: " + keyName + ", ");
        sb.append("KeyFingerprint: " + keyFingerprint + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    