/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * 
 */
public class DecryptResult implements Serializable {

    /**
     * Unique identifier created by the system for the key. This value is
     * always returned as long as no errors are encountered during the
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Decrypted plaintext data. This value may not be returned if the
     * customer master key is not available or if you didn't have permission
     * to use it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer plaintext;

    /**
     * Unique identifier created by the system for the key. This value is
     * always returned as long as no errors are encountered during the
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier created by the system for the key. This value is
     *         always returned as long as no errors are encountered during the
     *         operation.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier created by the system for the key. This value is
     * always returned as long as no errors are encountered during the
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier created by the system for the key. This value is
     *         always returned as long as no errors are encountered during the
     *         operation.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier created by the system for the key. This value is
     * always returned as long as no errors are encountered during the
     * operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier created by the system for the key. This value is
     *         always returned as long as no errors are encountered during the
     *         operation.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DecryptResult withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Decrypted plaintext data. This value may not be returned if the
     * customer master key is not available or if you didn't have permission
     * to use it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return Decrypted plaintext data. This value may not be returned if the
     *         customer master key is not available or if you didn't have permission
     *         to use it.
     */
    public java.nio.ByteBuffer getPlaintext() {
        return plaintext;
    }
    
    /**
     * Decrypted plaintext data. This value may not be returned if the
     * customer master key is not available or if you didn't have permission
     * to use it.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext Decrypted plaintext data. This value may not be returned if the
     *         customer master key is not available or if you didn't have permission
     *         to use it.
     */
    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }
    
    /**
     * Decrypted plaintext data. This value may not be returned if the
     * customer master key is not available or if you didn't have permission
     * to use it.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext Decrypted plaintext data. This value may not be returned if the
     *         customer master key is not available or if you didn't have permission
     *         to use it.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DecryptResult withPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
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
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getPlaintext() != null) sb.append("Plaintext: " + getPlaintext() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DecryptResult == false) return false;
        DecryptResult other = (DecryptResult)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getPlaintext() == null ^ this.getPlaintext() == null) return false;
        if (other.getPlaintext() != null && other.getPlaintext().equals(this.getPlaintext()) == false) return false; 
        return true;
    }
    
}
    