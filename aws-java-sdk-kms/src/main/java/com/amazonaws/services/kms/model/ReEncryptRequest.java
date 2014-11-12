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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#reEncrypt(ReEncryptRequest) ReEncrypt operation}.
 * <p>
 * Encrypts data on the server side with a new customer master key
 * without exposing the plaintext of the data on the client side. The
 * data is first decrypted and then encrypted. This operation can also be
 * used to change the encryption context of a ciphertext.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#reEncrypt(ReEncryptRequest)
 */
public class ReEncryptRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Ciphertext of the data to re-encrypt.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextBlob;

    /**
     * Encryption context used to encrypt and decrypt the data specified in
     * the <code>CiphertextBlob</code> parameter.
     */
    private java.util.Map<String,String> sourceEncryptionContext;

    /**
     * Key identifier of the key used to re-encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String destinationKeyId;

    /**
     * Encryption context to be used when the data is re-encrypted.
     */
    private java.util.Map<String,String> destinationEncryptionContext;

    /**
     * Grant tokens that identify the grants that have permissions for the
     * encryption and decryption process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokens;

    /**
     * Ciphertext of the data to re-encrypt.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return Ciphertext of the data to re-encrypt.
     */
    public java.nio.ByteBuffer getCiphertextBlob() {
        return ciphertextBlob;
    }
    
    /**
     * Ciphertext of the data to re-encrypt.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob Ciphertext of the data to re-encrypt.
     */
    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }
    
    /**
     * Ciphertext of the data to re-encrypt.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob Ciphertext of the data to re-encrypt.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptRequest withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }

    /**
     * Encryption context used to encrypt and decrypt the data specified in
     * the <code>CiphertextBlob</code> parameter.
     *
     * @return Encryption context used to encrypt and decrypt the data specified in
     *         the <code>CiphertextBlob</code> parameter.
     */
    public java.util.Map<String,String> getSourceEncryptionContext() {
        
        if (sourceEncryptionContext == null) {
            sourceEncryptionContext = new java.util.HashMap<String,String>();
        }
        return sourceEncryptionContext;
    }
    
    /**
     * Encryption context used to encrypt and decrypt the data specified in
     * the <code>CiphertextBlob</code> parameter.
     *
     * @param sourceEncryptionContext Encryption context used to encrypt and decrypt the data specified in
     *         the <code>CiphertextBlob</code> parameter.
     */
    public void setSourceEncryptionContext(java.util.Map<String,String> sourceEncryptionContext) {
        this.sourceEncryptionContext = sourceEncryptionContext;
    }
    
    /**
     * Encryption context used to encrypt and decrypt the data specified in
     * the <code>CiphertextBlob</code> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceEncryptionContext Encryption context used to encrypt and decrypt the data specified in
     *         the <code>CiphertextBlob</code> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptRequest withSourceEncryptionContext(java.util.Map<String,String> sourceEncryptionContext) {
        setSourceEncryptionContext(sourceEncryptionContext);
        return this;
    }

    /**
     * Encryption context used to encrypt and decrypt the data specified in
     * the <code>CiphertextBlob</code> parameter.
     * <p>
     * The method adds a new key-value pair into SourceEncryptionContext
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into SourceEncryptionContext.
     * @param value The corresponding value of the entry to be added into SourceEncryptionContext.
     */
    public ReEncryptRequest addSourceEncryptionContextEntry(String key, String value) {
        if (null == this.sourceEncryptionContext) {
            this.sourceEncryptionContext = new java.util.HashMap<String,String>();
        }
        if (this.sourceEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sourceEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SourceEncryptionContext.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public ReEncryptRequest clearSourceEncryptionContextEntries() {
        this.sourceEncryptionContext = null;
        return this;
    }
    
    /**
     * Key identifier of the key used to re-encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Key identifier of the key used to re-encrypt the data.
     */
    public String getDestinationKeyId() {
        return destinationKeyId;
    }
    
    /**
     * Key identifier of the key used to re-encrypt the data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param destinationKeyId Key identifier of the key used to re-encrypt the data.
     */
    public void setDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
    }
    
    /**
     * Key identifier of the key used to re-encrypt the data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param destinationKeyId Key identifier of the key used to re-encrypt the data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptRequest withDestinationKeyId(String destinationKeyId) {
        this.destinationKeyId = destinationKeyId;
        return this;
    }

    /**
     * Encryption context to be used when the data is re-encrypted.
     *
     * @return Encryption context to be used when the data is re-encrypted.
     */
    public java.util.Map<String,String> getDestinationEncryptionContext() {
        
        if (destinationEncryptionContext == null) {
            destinationEncryptionContext = new java.util.HashMap<String,String>();
        }
        return destinationEncryptionContext;
    }
    
    /**
     * Encryption context to be used when the data is re-encrypted.
     *
     * @param destinationEncryptionContext Encryption context to be used when the data is re-encrypted.
     */
    public void setDestinationEncryptionContext(java.util.Map<String,String> destinationEncryptionContext) {
        this.destinationEncryptionContext = destinationEncryptionContext;
    }
    
    /**
     * Encryption context to be used when the data is re-encrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param destinationEncryptionContext Encryption context to be used when the data is re-encrypted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptRequest withDestinationEncryptionContext(java.util.Map<String,String> destinationEncryptionContext) {
        setDestinationEncryptionContext(destinationEncryptionContext);
        return this;
    }

    /**
     * Encryption context to be used when the data is re-encrypted.
     * <p>
     * The method adds a new key-value pair into DestinationEncryptionContext
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into DestinationEncryptionContext.
     * @param value The corresponding value of the entry to be added into DestinationEncryptionContext.
     */
    public ReEncryptRequest addDestinationEncryptionContextEntry(String key, String value) {
        if (null == this.destinationEncryptionContext) {
            this.destinationEncryptionContext = new java.util.HashMap<String,String>();
        }
        if (this.destinationEncryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.destinationEncryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DestinationEncryptionContext.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public ReEncryptRequest clearDestinationEncryptionContextEntries() {
        this.destinationEncryptionContext = null;
        return this;
    }
    
    /**
     * Grant tokens that identify the grants that have permissions for the
     * encryption and decryption process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return Grant tokens that identify the grants that have permissions for the
     *         encryption and decryption process.
     */
    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
              grantTokens = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              grantTokens.setAutoConstruct(true);
        }
        return grantTokens;
    }
    
    /**
     * Grant tokens that identify the grants that have permissions for the
     * encryption and decryption process.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens Grant tokens that identify the grants that have permissions for the
     *         encryption and decryption process.
     */
    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokensCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(grantTokens.size());
        grantTokensCopy.addAll(grantTokens);
        this.grantTokens = grantTokensCopy;
    }
    
    /**
     * Grant tokens that identify the grants that have permissions for the
     * encryption and decryption process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens Grant tokens that identify the grants that have permissions for the
     *         encryption and decryption process.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) setGrantTokens(new java.util.ArrayList<String>(grantTokens.length));
        for (String value : grantTokens) {
            getGrantTokens().add(value);
        }
        return this;
    }
    
    /**
     * Grant tokens that identify the grants that have permissions for the
     * encryption and decryption process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens Grant tokens that identify the grants that have permissions for the
     *         encryption and decryption process.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ReEncryptRequest withGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokensCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(grantTokens.size());
            grantTokensCopy.addAll(grantTokens);
            this.grantTokens = grantTokensCopy;
        }

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
        if (getSourceEncryptionContext() != null) sb.append("SourceEncryptionContext: " + getSourceEncryptionContext() + ",");
        if (getDestinationKeyId() != null) sb.append("DestinationKeyId: " + getDestinationKeyId() + ",");
        if (getDestinationEncryptionContext() != null) sb.append("DestinationEncryptionContext: " + getDestinationEncryptionContext() + ",");
        if (getGrantTokens() != null) sb.append("GrantTokens: " + getGrantTokens() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode()); 
        hashCode = prime * hashCode + ((getSourceEncryptionContext() == null) ? 0 : getSourceEncryptionContext().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationKeyId() == null) ? 0 : getDestinationKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getDestinationEncryptionContext() == null) ? 0 : getDestinationEncryptionContext().hashCode()); 
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReEncryptRequest == false) return false;
        ReEncryptRequest other = (ReEncryptRequest)obj;
        
        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null) return false;
        if (other.getCiphertextBlob() != null && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false) return false; 
        if (other.getSourceEncryptionContext() == null ^ this.getSourceEncryptionContext() == null) return false;
        if (other.getSourceEncryptionContext() != null && other.getSourceEncryptionContext().equals(this.getSourceEncryptionContext()) == false) return false; 
        if (other.getDestinationKeyId() == null ^ this.getDestinationKeyId() == null) return false;
        if (other.getDestinationKeyId() != null && other.getDestinationKeyId().equals(this.getDestinationKeyId()) == false) return false; 
        if (other.getDestinationEncryptionContext() == null ^ this.getDestinationEncryptionContext() == null) return false;
        if (other.getDestinationEncryptionContext() != null && other.getDestinationEncryptionContext().equals(this.getDestinationEncryptionContext()) == false) return false; 
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null) return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false) return false; 
        return true;
    }
    
}
    