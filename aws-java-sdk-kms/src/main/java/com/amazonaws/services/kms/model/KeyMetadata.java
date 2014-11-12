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
 * <p>
 * Contains metadata associated with a specific key.
 * </p>
 */
public class KeyMetadata implements Serializable {

    /**
     * Account ID number.
     */
    private String aWSAccountId;

    /**
     * Unique identifier for the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * Key ARN (Amazon Resource Name).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * Date the key was created.
     */
    private java.util.Date creationDate;

    /**
     * Value that specifies whether the key is enabled.
     */
    private Boolean enabled;

    /**
     * The description of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * A value that specifies what operation(s) the key can perform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     */
    private String keyUsage;

    /**
     * Account ID number.
     *
     * @return Account ID number.
     */
    public String getAWSAccountId() {
        return aWSAccountId;
    }
    
    /**
     * Account ID number.
     *
     * @param aWSAccountId Account ID number.
     */
    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }
    
    /**
     * Account ID number.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountId Account ID number.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
        return this;
    }

    /**
     * Unique identifier for the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return Unique identifier for the key.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * Unique identifier for the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier for the key.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * Unique identifier for the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId Unique identifier for the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * Key ARN (Amazon Resource Name).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return Key ARN (Amazon Resource Name).
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * Key ARN (Amazon Resource Name).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn Key ARN (Amazon Resource Name).
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * Key ARN (Amazon Resource Name).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn Key ARN (Amazon Resource Name).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * Date the key was created.
     *
     * @return Date the key was created.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * Date the key was created.
     *
     * @param creationDate Date the key was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * Date the key was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate Date the key was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Value that specifies whether the key is enabled.
     *
     * @return Value that specifies whether the key is enabled.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Value that specifies whether the key is enabled.
     *
     * @param enabled Value that specifies whether the key is enabled.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Value that specifies whether the key is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Value that specifies whether the key is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Value that specifies whether the key is enabled.
     *
     * @return Value that specifies whether the key is enabled.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The description of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return The description of the key.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description The description of the key.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description The description of the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A value that specifies what operation(s) the key can perform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @return A value that specifies what operation(s) the key can perform.
     *
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return keyUsage;
    }
    
    /**
     * A value that specifies what operation(s) the key can perform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage A value that specifies what operation(s) the key can perform.
     *
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }
    
    /**
     * A value that specifies what operation(s) the key can perform.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage A value that specifies what operation(s) the key can perform.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see KeyUsageType
     */
    public KeyMetadata withKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /**
     * A value that specifies what operation(s) the key can perform.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage A value that specifies what operation(s) the key can perform.
     *
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }
    
    /**
     * A value that specifies what operation(s) the key can perform.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage A value that specifies what operation(s) the key can perform.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see KeyUsageType
     */
    public KeyMetadata withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
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
        if (getAWSAccountId() != null) sb.append("AWSAccountId: " + getAWSAccountId() + ",");
        if (getKeyId() != null) sb.append("KeyId: " + getKeyId() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getKeyUsage() != null) sb.append("KeyUsage: " + getKeyUsage() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode()); 
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof KeyMetadata == false) return false;
        KeyMetadata other = (KeyMetadata)obj;
        
        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null) return false;
        if (other.getAWSAccountId() != null && other.getAWSAccountId().equals(this.getAWSAccountId()) == false) return false; 
        if (other.getKeyId() == null ^ this.getKeyId() == null) return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null) return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false) return false; 
        return true;
    }
    
}
    