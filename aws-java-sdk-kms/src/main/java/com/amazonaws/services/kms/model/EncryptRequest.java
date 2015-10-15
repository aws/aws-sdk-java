/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Encrypts plaintext into ciphertext by using a customer master key. The
 * <code>Encrypt</code> function has two primary use cases:
 * <ul>
 * <li>You can encrypt up to 4 KB of arbitrary data such as an RSA key,
 * a database password, or other sensitive customer information.</li>
 * <li>If you are moving encrypted data from one region to another, you
 * can use this API to encrypt in the new region the plaintext data key
 * that was used to encrypt the data in the original region. This
 * provides you with an encrypted copy of the data key that can be
 * decrypted in the new region and used there to decrypt the encrypted
 * data. </li>
 * 
 * </ul>
 * 
 * </p>
 * <p>
 * Unless you are moving encrypted data from one region to another, you
 * don't use this function to encrypt a generated data key within a
 * region. You retrieve data keys already encrypted by calling the
 * GenerateDataKey or GenerateDataKeyWithoutPlaintext function. Data keys
 * don't need to be encrypted again by calling <code>Encrypt</code> .
 * </p>
 * <p>
 * If you want to encrypt data locally in your application, you can use
 * the <code>GenerateDataKey</code> function to return a plaintext data
 * encryption key and a copy of the key encrypted under the customer
 * master key (CMK) of your choosing.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#encrypt(EncryptRequest)
 */
public class EncryptRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias
     * or a key, or an alias name prefixed by "alias/". <ul> <li>Key ARN
     * Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li> <li>Globally
     * Unique Key ID Example - 12345678-1234-1234-1234-123456789012</li>
     * <li>Alias Name Example - alias/MyAliasName</li> </ul>
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
     * Name/value pair that specifies the encryption context to be used for
     * authenticated encryption. If used here, the same value must be
     * supplied to the <code>Decrypt</code> API or decryption will fail. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     */
    private java.util.Map<String,String> encryptionContext;

    /**
     * A list of grant tokens. <p>For more information, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokens;

    /**
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias
     * or a key, or an alias name prefixed by "alias/". <ul> <li>Key ARN
     * Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li> <li>Globally
     * Unique Key ID Example - 12345678-1234-1234-1234-123456789012</li>
     * <li>Alias Name Example - alias/MyAliasName</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return A unique identifier for the customer master key. This value can be a
     *         globally unique identifier, a fully specified ARN to either an alias
     *         or a key, or an alias name prefixed by "alias/". <ul> <li>Key ARN
     *         Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li> <li>Globally
     *         Unique Key ID Example - 12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias Name Example - alias/MyAliasName</li> </ul>
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias
     * or a key, or an alias name prefixed by "alias/". <ul> <li>Key ARN
     * Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li> <li>Globally
     * Unique Key ID Example - 12345678-1234-1234-1234-123456789012</li>
     * <li>Alias Name Example - alias/MyAliasName</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId A unique identifier for the customer master key. This value can be a
     *         globally unique identifier, a fully specified ARN to either an alias
     *         or a key, or an alias name prefixed by "alias/". <ul> <li>Key ARN
     *         Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li> <li>Globally
     *         Unique Key ID Example - 12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias Name Example - alias/MyAliasName</li> </ul>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias
     * or a key, or an alias name prefixed by "alias/". <ul> <li>Key ARN
     * Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li> <li>Globally
     * Unique Key ID Example - 12345678-1234-1234-1234-123456789012</li>
     * <li>Alias Name Example - alias/MyAliasName</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId A unique identifier for the customer master key. This value can be a
     *         globally unique identifier, a fully specified ARN to either an alias
     *         or a key, or an alias name prefixed by "alias/". <ul> <li>Key ARN
     *         Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li> <li>Globally
     *         Unique Key ID Example - 12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias Name Example - alias/MyAliasName</li> </ul>
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
     * Name/value pair that specifies the encryption context to be used for
     * authenticated encryption. If used here, the same value must be
     * supplied to the <code>Decrypt</code> API or decryption will fail. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     *
     * @return Name/value pair that specifies the encryption context to be used for
     *         authenticated encryption. If used here, the same value must be
     *         supplied to the <code>Decrypt</code> API or decryption will fail. For
     *         more information, see <a
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
     * Name/value pair that specifies the encryption context to be used for
     * authenticated encryption. If used here, the same value must be
     * supplied to the <code>Decrypt</code> API or decryption will fail. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     *
     * @param encryptionContext Name/value pair that specifies the encryption context to be used for
     *         authenticated encryption. If used here, the same value must be
     *         supplied to the <code>Decrypt</code> API or decryption will fail. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     *         Context</a>.
     */
    public void setEncryptionContext(java.util.Map<String,String> encryptionContext) {
        this.encryptionContext = encryptionContext;
    }
    
    /**
     * Name/value pair that specifies the encryption context to be used for
     * authenticated encryption. If used here, the same value must be
     * supplied to the <code>Decrypt</code> API or decryption will fail. For
     * more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     * Context</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryptionContext Name/value pair that specifies the encryption context to be used for
     *         authenticated encryption. If used here, the same value must be
     *         supplied to the <code>Decrypt</code> API or decryption will fail. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html">Encryption
     *         Context</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EncryptRequest withEncryptionContext(java.util.Map<String,String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    /**
     * Name/value pair that specifies the encryption context to be used for
     * authenticated encryption. If used here, the same value must be
     * supplied to the <code>Decrypt</code> API or decryption will fail. For
     * more information, see <a
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
     * A list of grant tokens. <p>For more information, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of grant tokens. <p>For more information, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     */
    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
              grantTokens = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              grantTokens.setAutoConstruct(true);
        }
        return grantTokens;
    }
    
    /**
     * A list of grant tokens. <p>For more information, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens. <p>For more information, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
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
     * A list of grant tokens. <p>For more information, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGrantTokens(java.util.Collection)} or {@link
     * #withGrantTokens(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens. <p>For more information, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
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
     * A list of grant tokens. <p>For more information, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens. <p>For more information, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a> in the <i>AWS Key Management Service Developer Guide</i>.
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
    
    @Override
    public EncryptRequest clone() {
        
            return (EncryptRequest) super.clone();
    }

}
    