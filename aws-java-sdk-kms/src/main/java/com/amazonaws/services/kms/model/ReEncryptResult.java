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
public class ReEncryptResult implements Serializable {

    /**
     * The re-encrypted data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextBlob;

    /**
     * Unique identifier of the key used to originally encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String sourceKeyId;

    /**
     * Unique identifier of the key used to re-encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * The re-encrypted data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return The re-encrypted data.
     */
    public java.nio.ByteBuffer getCiphertextBlob() {
        return ciphertextBlob;
    }
    
    /**
     * The re-encrypted data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob The re-encrypted data.
     */
    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }
    
    /**
     * The re-encrypted data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob The re-encrypted data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptResult withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }

    /**
     * Unique identifier of the key used to originally encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the key used to originally encrypt the data.
     */
    public String getSourceKeyId() {
        return sourceKeyId;
    }
    
    /**
     * Unique identifier of the key used to originally encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param sourceKeyId Unique identifier of the key used to originally encrypt the data.
     */
    public void setSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
    }
    
    /**
     * Unique identifier of the key used to originally encrypt the data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param sourceKeyId Unique identifier of the key used to originally encrypt the data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptResult withSourceKeyId(String sourceKeyId) {
        this.sourceKeyId = sourceKeyId;
        return this;
    }

    /**
     * Unique identifier of the key used to re-encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the key used to re-encrypt the data.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier of the key used to re-encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key used to re-encrypt the data.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier of the key used to re-encrypt the data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key used to re-encrypt the data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptResult withKeyId(String keyId) {
        this.keyId = keyId;
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
        if (getCiphertextBlob() != null) sb.append("CiphertextBlob: " + getCiphertextBlob() + ",");
        if (getSourceKeyId() != null) sb.append("SourceKeyId: " + getSourceKeyId() + ",");
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode()); 
        hashCode = prime * hashCode + ((getSourceKeyId() == null) ? 0 : getSourceKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReEncryptResult == false) return false;
        ReEncryptResult other = (ReEncryptResult)obj;
        
        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null) return false;
        if (other.getCiphertextBlob() != null && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false) return false; 
        if (other.getSourceKeyId() == null ^ this.getSourceKeyId() == null) return false;
        if (other.getSourceKeyId() != null && other.getSourceKeyId().equals(this.getSourceKeyId()) == false) return false; 
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        return true;
    }
    
}
    