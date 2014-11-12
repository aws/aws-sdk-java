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
 * Container for the parameters to the {@link com.amazonaws.services.kms.AWSKMS#generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest) GenerateDataKeyWithoutPlaintext operation}.
 * <p>
 * Returns a key wrapped by a customer master key without the plaintext
 * copy of that key. To retrieve the plaintext, see GenerateDataKey.
 * </p>
 *
 * @see com.amazonaws.services.kms.AWSKMS#generateDataKeyWithoutPlaintext(GenerateDataKeyWithoutPlaintextRequest)
 */
public class GenerateDataKeyWithoutPlaintextRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Name:value pair that contains additional data to be authenticated
     * during the encryption and decryption processes.
     */
    private java.util.Map<String,String> encryptionContext;

    /**
     * Value that identifies the encryption algorithm and key size. Currently
     * this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     */
    private String keySpec;

    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, 1024 and so on.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     */
    private Integer numberOfBytes;

    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to generate a key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> grantTokens;

    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier of the key. This can be an ARN, an alias, or a
     *         globally unique identifier.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key. This can be an ARN, an alias, or a
     *         globally unique identifier.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier of the key. This can be an ARN, an alias, or a
     * globally unique identifier.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier of the key. This can be an ARN, an alias, or a
     *         globally unique identifier.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyWithoutPlaintextRequest withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Name:value pair that contains additional data to be authenticated
     * during the encryption and decryption processes.
     *
     * @return Name:value pair that contains additional data to be authenticated
     *         during the encryption and decryption processes.
     */
    public java.util.Map<String,String> getEncryptionContext() {
        
        if (encryptionContext == null) {
            encryptionContext = new java.util.HashMap<String,String>();
        }
        return encryptionContext;
    }
    
    /**
     * Name:value pair that contains additional data to be authenticated
     * during the encryption and decryption processes.
     *
     * @param encryptionContext Name:value pair that contains additional data to be authenticated
     *         during the encryption and decryption processes.
     */
    public void setEncryptionContext(java.util.Map<String,String> encryptionContext) {
        this.encryptionContext = encryptionContext;
    }
    
    /**
     * Name:value pair that contains additional data to be authenticated
     * during the encryption and decryption processes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param encryptionContext Name:value pair that contains additional data to be authenticated
     *         during the encryption and decryption processes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyWithoutPlaintextRequest withEncryptionContext(java.util.Map<String,String> encryptionContext) {
        setEncryptionContext(encryptionContext);
        return this;
    }

    /**
     * Name:value pair that contains additional data to be authenticated
     * during the encryption and decryption processes.
     * <p>
     * The method adds a new key-value pair into EncryptionContext parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into EncryptionContext.
     * @param value The corresponding value of the entry to be added into EncryptionContext.
     */
    public GenerateDataKeyWithoutPlaintextRequest addEncryptionContextEntry(String key, String value) {
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
    public GenerateDataKeyWithoutPlaintextRequest clearEncryptionContextEntries() {
        this.encryptionContext = null;
        return this;
    }
    
    /**
     * Value that identifies the encryption algorithm and key size. Currently
     * this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @return Value that identifies the encryption algorithm and key size. Currently
     *         this can be AES_128 or AES_256.
     *
     * @see DataKeySpec
     */
    public String getKeySpec() {
        return keySpec;
    }
    
    /**
     * Value that identifies the encryption algorithm and key size. Currently
     * this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size. Currently
     *         this can be AES_128 or AES_256.
     *
     * @see DataKeySpec
     */
    public void setKeySpec(String keySpec) {
        this.keySpec = keySpec;
    }
    
    /**
     * Value that identifies the encryption algorithm and key size. Currently
     * this can be AES_128 or AES_256.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size. Currently
     *         this can be AES_128 or AES_256.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DataKeySpec
     */
    public GenerateDataKeyWithoutPlaintextRequest withKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }

    /**
     * Value that identifies the encryption algorithm and key size. Currently
     * this can be AES_128 or AES_256.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size. Currently
     *         this can be AES_128 or AES_256.
     *
     * @see DataKeySpec
     */
    public void setKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
    }
    
    /**
     * Value that identifies the encryption algorithm and key size. Currently
     * this can be AES_128 or AES_256.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AES_256, AES_128
     *
     * @param keySpec Value that identifies the encryption algorithm and key size. Currently
     *         this can be AES_128 or AES_256.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DataKeySpec
     */
    public GenerateDataKeyWithoutPlaintextRequest withKeySpec(DataKeySpec keySpec) {
        this.keySpec = keySpec.toString();
        return this;
    }

    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, 1024 and so on.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @return Integer that contains the number of bytes to generate. Common values
     *         are 128, 256, 512, 1024 and so on.
     */
    public Integer getNumberOfBytes() {
        return numberOfBytes;
    }
    
    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, 1024 and so on.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes Integer that contains the number of bytes to generate. Common values
     *         are 128, 256, 512, 1024 and so on.
     */
    public void setNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }
    
    /**
     * Integer that contains the number of bytes to generate. Common values
     * are 128, 256, 512, 1024 and so on.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1024<br/>
     *
     * @param numberOfBytes Integer that contains the number of bytes to generate. Common values
     *         are 128, 256, 512, 1024 and so on.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyWithoutPlaintextRequest withNumberOfBytes(Integer numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
        return this;
    }

    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to generate a key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @return A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to generate a key.
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
     * provide long term permissions to generate a key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to generate a key.
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
     * provide long term permissions to generate a key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to generate a key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyWithoutPlaintextRequest withGrantTokens(String... grantTokens) {
        if (getGrantTokens() == null) setGrantTokens(new java.util.ArrayList<String>(grantTokens.length));
        for (String value : grantTokens) {
            getGrantTokens().add(value);
        }
        return this;
    }
    
    /**
     * A list of grant tokens that represent grants which can be used to
     * provide long term permissions to generate a key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 10<br/>
     *
     * @param grantTokens A list of grant tokens that represent grants which can be used to
     *         provide long term permissions to generate a key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GenerateDataKeyWithoutPlaintextRequest withGrantTokens(java.util.Collection<String> grantTokens) {
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
        if (getKeySpec() != null) sb.append("KeySpec: " + getKeySpec() + ",");
        if (getNumberOfBytes() != null) sb.append("NumberOfBytes: " + getNumberOfBytes() + ",");
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
        hashCode = prime * hashCode + ((getKeySpec() == null) ? 0 : getKeySpec().hashCode()); 
        hashCode = prime * hashCode + ((getNumberOfBytes() == null) ? 0 : getNumberOfBytes().hashCode()); 
        hashCode = prime * hashCode + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GenerateDataKeyWithoutPlaintextRequest == false) return false;
        GenerateDataKeyWithoutPlaintextRequest other = (GenerateDataKeyWithoutPlaintextRequest)obj;
        
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getEncryptionContext() == null ^ this.getEncryptionContext() == null) return false;
        if (other.getEncryptionContext() != null && other.getEncryptionContext().equals(this.getEncryptionContext()) == false) return false; 
        if (other.getKeySpec() == null ^ this.getKeySpec() == null) return false;
        if (other.getKeySpec() != null && other.getKeySpec().equals(this.getKeySpec()) == false) return false; 
        if (other.getNumberOfBytes() == null ^ this.getNumberOfBytes() == null) return false;
        if (other.getNumberOfBytes() != null && other.getNumberOfBytes().equals(this.getNumberOfBytes()) == false) return false; 
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null) return false;
        if (other.getGrantTokens() != null && other.getGrantTokens().equals(this.getGrantTokens()) == false) return false; 
        return true;
    }
    
}
    