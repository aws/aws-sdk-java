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
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#generateDataKey(GenerateDataKeyRequest) GenerateDataKey operation}.
 * <p>
 * Generates a data key that you can use in your application to locally
 * encrypt data. This call returns a plaintext version of the key in the
 * <code>Plaintext</code> field of the response object and an encrypted
 * copy of the key in the <code>CiphertextBlob</code> field. The key is
 * encrypted by using the master key specified by the <code>KeyId</code>
 * field. To decrypt the encrypted key, pass it to the
 * <code>Decrypt</code> API.
 * </p>
 * <p>
 * We recommend that you use the following pattern to locally encrypt
 * data: call the <code>GenerateDataKey</code> API, use the key returned
 * in the <code>Plaintext</code> response field to locally encrypt data,
 * and then erase the plaintext data key from memory. Store the encrypted
 * data key (contained in the <code>CiphertextBlob</code> field)
 * alongside of the locally encrypted data.
 * </p>
 * <p>
 * <b>NOTE:</b>You should not call the Encrypt function to re-encrypt
 * your data keys within a region. GenerateDataKey always returns the
 * data key encrypted and tied to the customer master key that will be
 * used to decrypt it. There is no need to decrypt it twice.
 * </p>
 * <p>
 * If you decide to use the optional <code>EncryptionContext</code>
 * parameter, you must also store the context in full or at least store
 * enough information along with the encrypted data to be able to
 * reconstruct the context when submitting the ciphertext to the
 * <code>Decrypt</code> API. It is a good practice to choose a context
 * that you can reconstruct on the fly to better secure the ciphertext.
 * For more information about how this parameter is used, see
 * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"> Encryption Context </a>
 * .
 * </p>
 * <p>
 * To decrypt data, pass the encrypted data key to the
 * <code>Decrypt</code> API. <code>Decrypt</code> uses the associated
 * master key to decrypt the encrypted data key and returns it as
 * plaintext. Use the plaintext data key to locally decrypt your data and
 * then erase the key from memory. You must specify the encryption
 * context, if any, that you specified when you generated the key. The
 * encryption context is logged by CloudTrail, and you can use this log
 * to help track the use of particular data.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#generateDataKey(GenerateDataKeyRequest)
 */
public class GenerateDataKeyRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * Name/value pair that contains additional data to be authenticated
     * during the encryption and decryption processes that use the key. This
     * value is logged by AWS CloudTrail to provide context around the data
     * encrypted by the key.
     */
    private java.util.Map<String,String> encryptionContext;

    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, and 1024. 1024 is the current limit. We recommend
     * that you use the <code>KeySpec</code> parameter instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer numberOfBytes;

    /**
     * Value that identifies the encryption algorithm and key size to
     * generate a data key for. Currently this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     */
    private String keySpec;

    /**
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
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
    public GenerateDataKeyRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Name/value pair that contains additional data to be authenticated
     * during the encryption and decryption processes that use the key. This
     * value is logged by AWS CloudTrail to provide context around the data
     * encrypted by the key.
     *
     * @return Name/value pair that contains additional data to be authenticated
     *         during the encryption and decryption processes that use the key. This
     *         value is logged by AWS CloudTrail to provide context around the data
     *         encrypted by the key.
     */
    public java.util.Map<String,String> getEncryptionContext() {
        
        if (encryptionContext == null) {
            encryptionContext = new java.util.HashMap<String,String>();
        }
        return encryptionContext;
    }
    
    /**
     * Name/value pair that contains additional data to be authenticated
     * during the encryption and decryption processes that use the key. This
     * value is logged by AWS CloudTrail to provide context around the data
     * encrypted by the key.
     *
     * @param encryptionContext Name/value pair that contains additional data to be authenticated
     *         during the encryption and decryption processes that use the key. This
     *         value is logged by AWS CloudTrail to provide context around the data
     *         encrypted by the key.
     */
    public void setEncryptionContext(java.util.Map<String,String> encryptionContext) {
        this.encryptionContext = encryptionContext;
    }
    
    /**
     * Name/value pair that contains additional data to be authenticated
     * during the encryption and decryption processes that use the key. This
     * value is logged by AWS CloudTrail to provide context around the data
     * encrypted by the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryptionContext Name/value pair that contains additional data to be authenticated
     *         during the encryption and decryption processes that use the key. This
     *         value is logged by AWS CloudTrail to provide context around the data
     *         encrypted by the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyRequest withEncryptionContext(java.util.Map<String,String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    /**
     * Name/value pair that contains additional data to be authenticated
     * during the encryption and decryption processes that use the key. This
     * value is logged by AWS CloudTrail to provide context around the data
     * encrypted by the key.
     * <p>
     * The method adds a new key-value pair into EncryptionContext parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into EncryptionContext.
     * @param value The corresponding value of the entry to be added into EncryptionContext.
     */
  public GenerateDataKeyRequest addEncryptionContextEntry(String key, String value) {
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
  public GenerateDataKeyRequest clearEncryptionContextEntries() {
    this.encryptionContext = null;
    return this;
  }
  
    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, and 1024. 1024 is the current limit. We recommend
     * that you use the <code>KeySpec</code> parameter instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return Integer that contains the number of bytes to generate. Common values
     *         are 128, 256, 512, and 1024. 1024 is the current limit. We recommend
     *         that you use the <code>KeySpec</code> parameter instead.
     */
    public Integer getNumberOfBytes() {
        return numberOfBytes;
    }
    
    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, and 1024. 1024 is the current limit. We recommend
     * that you use the <code>KeySpec</code> parameter instead.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes Integer that contains the number of bytes to generate. Common values
     *         are 128, 256, 512, and 1024. 1024 is the current limit. We recommend
     *         that you use the <code>KeySpec</code> parameter instead.
     */
    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }
    
    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, and 1024. 1024 is the current limit. We recommend
     * that you use the <code>KeySpec</code> parameter instead.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes Integer that contains the number of bytes to generate. Common values
     *         are 128, 256, 512, and 1024. 1024 is the current limit. We recommend
     *         that you use the <code>KeySpec</code> parameter instead.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyRequest withNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }

    /**
     * Value that identifies the encryption algorithm and key size to
     * generate a data key for. Currently this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @return Value that identifies the encryption algorithm and key size to
     *         generate a data key for. Currently this can be AES_128 or AES_256.
     *
     * @see DataKeySpec
     */
    public String getKeySpec() {
        return keySpec;
    }
    
    /**
     * Value that identifies the encryption algorithm and key size to
     * generate a data key for. Currently this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size to
     *         generate a data key for. Currently this can be AES_128 or AES_256.
     *
     * @see DataKeySpec
     */
    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }
    
    /**
     * Value that identifies the encryption algorithm and key size to
     * generate a data key for. Currently this can be AES_128 or AES_256.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size to
     *         generate a data key for. Currently this can be AES_128 or AES_256.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DataKeySpec
     */
    public GenerateDataKeyRequest withKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * Value that identifies the encryption algorithm and key size to
     * generate a data key for. Currently this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size to
     *         generate a data key for. Currently this can be AES_128 or AES_256.
     *
     * @see DataKeySpec
     */
    public void setKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
    }
    
    /**
     * Value that identifies the encryption algorithm and key size to
     * generate a data key for. Currently this can be AES_128 or AES_256.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size to
     *         generate a data key for. Currently this can be AES_128 or AES_256.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DataKeySpec
     */
    public GenerateDataKeyRequest withKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
        return this;
    }

    /**
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a>.
     */
    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
              grantTokens = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              grantTokens.setAutoConstruct(true);
        }
        return grantTokens;
    }
    
    /**
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a>.
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
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
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
     * @param grantTokens For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) setGrantTokens(new java.util.ArrayList<String>(grantTokens.length));
        for (String value : grantTokens) {
            getGrantTokens().add(value);
        }
        return this;
    }
    
    /**
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     * Tokens</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens For more information, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token">Grant
     *         Tokens</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
        if (getEncryptionContext() != null) sb.append("EncryptionContext: " + getEncryptionContext() + ",");
        if (getNumberOfBytes() != null) sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
        if (getKeySpec() != null) sb.append("KeySpec: " + getKeySpec() + ",");
        if (getGrantTokens() != null) sb.append("GrantTokens: " + getGrantTokens() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getEncryptionContext() == null) ? 0 : getEncryptionContext().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode()); 
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode()); 
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GenerateDataKeyRequest == false) return false;
        GenerateDataKeyRequest other = (GenerateDataKeyRequest)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null) return false;
        if (other.getEncryptionContext() != null && other.getEncryptionContext().equals(this.getEncryptionContext()) == false) return false; 
        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null) return false;
        if (other.getNumberOfBytes() != null && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false) return false; 
        if (other.getKeySpec() == null ^ this.getKeySpec() == null) return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false) return false; 
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null) return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false) return false; 
        return true;
    }
    
    @Override
    public GenerateDataKeyRequest clone() {
        
            return (GenerateDataKeyRequest) super.clone();
    }

}
    