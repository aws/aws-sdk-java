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
 * </p>
 */
public class ImportKeyPairResult implements Serializable {

    /**
     * The specified unique key pair name.
     */
    private String keyName;

    /**
     * The MD5 public key fingerprint as specified in section 4 of <a
     * href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a>.
     */
    private String keyFingerprint;

    /**
     * The specified unique key pair name.
     *
     * @return The specified unique key pair name.
     */
    public String getKeyName() {
        return keyName;
    }
    
    /**
     * The specified unique key pair name.
     *
     * @param keyName The specified unique key pair name.
     */
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }
    
    /**
     * The specified unique key pair name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyName The specified unique key pair name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportKeyPairResult withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * The MD5 public key fingerprint as specified in section 4 of <a
     * href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a>.
     *
     * @return The MD5 public key fingerprint as specified in section 4 of <a
     *         href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a>.
     */
    public String getKeyFingerprint() {
        return keyFingerprint;
    }
    
    /**
     * The MD5 public key fingerprint as specified in section 4 of <a
     * href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a>.
     *
     * @param keyFingerprint The MD5 public key fingerprint as specified in section 4 of <a
     *         href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a>.
     */
    public void setKeyFingerprint(String keyFingerprint) {
        this.keyFingerprint = keyFingerprint;
    }
    
    /**
     * The MD5 public key fingerprint as specified in section 4 of <a
     * href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyFingerprint The MD5 public key fingerprint as specified in section 4 of <a
     *         href="http://tools.ietf.org/html/rfc4716"> RFC4716 </a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ImportKeyPairResult withKeyFingerprint(String keyFingerprint) {
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
        if (getKeyName() != null) sb.append("KeyName: " + getKeyName() + ",");
        if (getKeyFingerprint() != null) sb.append("KeyFingerprint: " + getKeyFingerprint() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyName() == null) ? 0 : getKeyName().hashCode()); 
        hashCode = prime * hashCode + ((getKeyFingerprint() == null) ? 0 : getKeyFingerprint().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImportKeyPairResult == false) return false;
        ImportKeyPairResult other = (ImportKeyPairResult)obj;
        
        if (other.getKeyName() == null ^ this.getKeyName() == null) return false;
        if (other.getKeyName() != null && other.getKeyName().equals(this.getKeyName()) == false) return false; 
        if (other.getKeyFingerprint() == null ^ this.getKeyFingerprint() == null) return false;
        if (other.getKeyFingerprint() != null && other.getKeyFingerprint().equals(this.getKeyFingerprint()) == false) return false; 
        return true;
    }
    
}
    