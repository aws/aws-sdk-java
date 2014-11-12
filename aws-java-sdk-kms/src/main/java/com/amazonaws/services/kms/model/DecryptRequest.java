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
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#decrypt(DecryptRequest) Decrypt operation}.
 * <p>
 * Decrypts ciphertext. Ciphertext is plaintext that has been previously
 * encrypted by using the Encrypt function.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#decrypt(DecryptRequest)
 */
public class DecryptRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Ciphertext including metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private java.nio.ByteBuffer ciphertextBlob;

    /**
     * The encryption context. If this was specified in the <a>Encrypt</a>
     * function, it must be specified here or the decryption operation will
     * fail. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     */
    private java.util.Map<String,String> encryptionContext;

    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform decryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokens;

    /**
     * Ciphertext including metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return Ciphertext including metadata.
     */
    public java.nio.ByteBuffer getCiphertextBlob() {
        return ciphertextBlob;
    }
    
    /**
     * Ciphertext including metadata.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob Ciphertext including metadata.
     */
    public void setCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
    }
    
    /**
     * Ciphertext including metadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param ciphertextBlob Ciphertext including metadata.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DecryptRequest withCiphertextBlob(java.nio.ByteBuffer ciphertextBlob) {
        this.ciphertextBlob = ciphertextBlob;
        return this;
    }

    /**
     * The encryption context. If this was specified in the <a>Encrypt</a>
     * function, it must be specified here or the decryption operation will
     * fail. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     *
     * @return The encryption context. If this was specified in the <a>Encrypt</a>
     *         function, it must be specified here or the decryption operation will
     *         fail. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     *         Context</a>.
     */
    public java.util.Map<String,String> getEncryptionContext() {
        
        if (encryptionContext == null) {
            encryptionContext = new java.util.HashMap<String,String>();
        }
        return encryptionContext;
    }
    
    /**
     * The encryption context. If this was specified in the <a>Encrypt</a>
     * function, it must be specified here or the decryption operation will
     * fail. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     *
     * @param encryptionContext The encryption context. If this was specified in the <a>Encrypt</a>
     *         function, it must be specified here or the decryption operation will
     *         fail. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     *         Context</a>.
     */
    public void setEncryptionContext(java.util.Map<String,String> encryptionContext) {
        this.encryptionContext = encryptionContext;
    }
    
    /**
     * The encryption context. If this was specified in the <a>Encrypt</a>
     * function, it must be specified here or the decryption operation will
     * fail. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryptionContext The encryption context. If this was specified in the <a>Encrypt</a>
     *         function, it must be specified here or the decryption operation will
     *         fail. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     *         Context</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DecryptRequest withEncryptionContext(java.util.Map<String,String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    /**
     * The encryption context. If this was specified in the <a>Encrypt</a>
     * function, it must be specified here or the decryption operation will
     * fail. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     * <p>
     * The method adds a new key-value pair into EncryptionContext parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into EncryptionContext.
     * @param value The corresponding value of the entry to be added into EncryptionContext.
     */
    public DecryptRequest addEncryptionContextEntry(String key, String value) {
        if (null == this.encryptionContext) {
            this.encryptionContext = new java.util.HashMap<String,String>();
        }
        if (this.encryptionContext.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.encryptionContext.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into EncryptionContext.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public DecryptRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }
    
    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform decryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform decryption.
     */
    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
              grantTokens = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              grantTokens.setAutoConstruct(true);
        }
        return grantTokens;
    }
    
    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform decryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform decryption.
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
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform decryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform decryption.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DecryptRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) setGrantTokens(new java.util.ArrayList<String>(grantTokens.length));
        for (String value : grantTokens) {
            getGrantTokens().add(value);
        }
        return this;
    }
    
    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform decryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform decryption.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DecryptRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
        if (getEncryptionContext() != null) sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        if (getGrantTokens() != null) sb.append("GrantTokens: " + getGrantTokens() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCiphertextBlob() == null) ? 0 : getCiphertextBlob().hashCode()); 
        hashCode = prime * hashCode + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode()); 
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DecryptRequest == false) return false;
        DecryptRequest other = (DecryptRequest)obj;
        
        if (other.getCiphertextBlob() == null ^ this.getCiphertextBlob() == null) return false;
        if (other.getCiphertextBlob() != null && other.getCiphertextBlob().equals(this.getCiphertextBlob()) == false) return false; 
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null) return false;
        if (other.getEncryptionContext() != null && other.getEncryptionContext().equals(this.getEncryptionContext()) == false) return false; 
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null) return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false) return false; 
        return true;
    }
    
}
    