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
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#encrypt(EncryptRequest) Encrypt operation}.
 * <p>
 * Encrypts plaintext into ciphertext by using a customer master key.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#encrypt(EncryptRequest)
 */
public class EncryptRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Unique identifier of the customer master. This can be an ARN, an
     * alias, or the Key ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Data to be encrypted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     */
    private java.nio.ByteBuffer plaintext;

    /**
     * Name:value pair that specifies the encryption context to be used for
     * authenticated encryption. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     * Encryption</a>.
     */
    private java.util.Map<String,String> encryptionContext;

    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokens;

    /**
     * Unique identifier of the customer master. This can be an ARN, an
     * alias, or the Key ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the customer master. This can be an ARN, an
     *         alias, or the Key ID.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier of the customer master. This can be an ARN, an
     * alias, or the Key ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the customer master. This can be an ARN, an
     *         alias, or the Key ID.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier of the customer master. This can be an ARN, an
     * alias, or the Key ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the customer master. This can be an ARN, an
     *         alias, or the Key ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EncryptRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Data to be encrypted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @return Data to be encrypted.
     */
    public java.nio.ByteBuffer getPlaintext() {
        return plaintext;
    }
    
    /**
     * Data to be encrypted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext Data to be encrypted.
     */
    public void setPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
    }
    
    /**
     * Data to be encrypted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     *
     * @param plaintext Data to be encrypted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EncryptRequest withPlaintext(java.nio.ByteBuffer plaintext) {
        this.plaintext = plaintext;
        return this;
    }

    /**
     * Name:value pair that specifies the encryption context to be used for
     * authenticated encryption. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     * Encryption</a>.
     *
     * @return Name:value pair that specifies the encryption context to be used for
     *         authenticated encryption. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     *         Encryption</a>.
     */
    public java.util.Map<String,String> getEncryptionContext() {
        
        if (encryptionContext == null) {
            encryptionContext = new java.util.HashMap<String,String>();
        }
        return encryptionContext;
    }
    
    /**
     * Name:value pair that specifies the encryption context to be used for
     * authenticated encryption. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     * Encryption</a>.
     *
     * @param encryptionContext Name:value pair that specifies the encryption context to be used for
     *         authenticated encryption. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     *         Encryption</a>.
     */
    public void setEncryptionContext(java.util.Map<String,String> encryptionContext) {
        this.encryptionContext = encryptionContext;
    }
    
    /**
     * Name:value pair that specifies the encryption context to be used for
     * authenticated encryption. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     * Encryption</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryptionContext Name:value pair that specifies the encryption context to be used for
     *         authenticated encryption. For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     *         Encryption</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EncryptRequest withEncryptionContext(java.util.Map<String,String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    /**
     * Name:value pair that specifies the encryption context to be used for
     * authenticated encryption. For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/crypto_authen.html">Authenticated
     * Encryption</a>.
     * <p>
     * The method adds a new key-value pair into EncryptionContext parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into EncryptionContext.
     * @param value The corresponding value of the entry to be added into EncryptionContext.
     */
    public EncryptRequest addEncryptionContextEntry(String key, String value) {
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
    public EncryptRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }
    
    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform encryption.
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
     * provide long term permissions to perform encryption.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform encryption.
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
     * provide long term permissions to perform encryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform encryption.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EncryptRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) setGrantTokens(new java.util.ArrayList<String>(grantTokens.length));
        for (String value : grantTokens) {
            getGrantTokens().add(value);
        }
        return this;
    }
    
    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to perform encryption.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to perform encryption.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EncryptRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getPlaintext() != null) sb.append("Plaintext: " + getPlaintext() + ",");
        if (getEncryptionContext() != null) sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        if (getGrantTokens() != null) sb.append("GrantTokens: " + getGrantTokens() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getPlaintext() == null) ? 0 : getPlaintext().hashCode()); 
        hashCode = prime * hashCode + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode()); 
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EncryptRequest == false) return false;
        EncryptRequest other = (EncryptRequest)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getPlaintext() == null ^ this.getPlaintext() == null) return false;
        if (other.getPlaintext() != null && other.getPlaintext().equals(this.getPlaintext()) == false) return false; 
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null) return false;
        if (other.getEncryptionContext() != null && other.getEncryptionContext().equals(this.getEncryptionContext()) == false) return false; 
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null) return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false) return false; 
        return true;
    }
    
}
    