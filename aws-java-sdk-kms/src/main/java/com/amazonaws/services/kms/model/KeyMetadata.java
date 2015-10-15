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

/**
 * <p>
 * Contains metadata about a customer master key (CMK).
 * </p>
 * <p>
 * This data type is used as a response element for the CreateKey and
 * DescribeKey operations.
 * </p>
 */
public class KeyMetadata implements Serializable, Cloneable {

    /**
     * The twelve-digit account ID of the AWS account that owns the key.
     */
    private String aWSAccountId;

    /**
     * The globally unique identifier for the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String keyId;

    /**
     * The Amazon Resource Name (ARN) of the key. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS
     * Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String arn;

    /**
     * The date and time when the key was created.
     */
    private java.util.Date creationDate;

    /**
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     */
    private Boolean enabled;

    /**
     * The friendly description of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     */
    private String description;

    /**
     * The cryptographic operations for which you can use the key. Currently
     * the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     * you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     */
    private String keyUsage;

    /**
     * The state of the customer master key (CMK). <p>For more information
     * about how key state affects the use of a CMK, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled, PendingDeletion
     */
    private String keyState;

    /**
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     */
    private java.util.Date deletionDate;

    /**
     * The twelve-digit account ID of the AWS account that owns the key.
     *
     * @return The twelve-digit account ID of the AWS account that owns the key.
     */
    public String getAWSAccountId() {
        return aWSAccountId;
    }
    
    /**
     * The twelve-digit account ID of the AWS account that owns the key.
     *
     * @param aWSAccountId The twelve-digit account ID of the AWS account that owns the key.
     */
    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }
    
    /**
     * The twelve-digit account ID of the AWS account that owns the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aWSAccountId The twelve-digit account ID of the AWS account that owns the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
        return this;
    }

    /**
     * The globally unique identifier for the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The globally unique identifier for the key.
     */
    public String getKeyId() {
        return keyId;
    }
    
    /**
     * The globally unique identifier for the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId The globally unique identifier for the key.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    
    /**
     * The globally unique identifier for the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param keyId The globally unique identifier for the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the key. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS
     * Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return The Amazon Resource Name (ARN) of the key. For examples, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS
     *         Key Management Service (AWS KMS)</a> in the Example ARNs section of
     *         the <i>AWS General Reference</i>.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the key. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS
     * Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) of the key. For examples, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS
     *         Key Management Service (AWS KMS)</a> in the Example ARNs section of
     *         the <i>AWS General Reference</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the key. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS
     * Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param arn The Amazon Resource Name (ARN) of the key. For examples, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS
     *         Key Management Service (AWS KMS)</a> in the Example ARNs section of
     *         the <i>AWS General Reference</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * The date and time when the key was created.
     *
     * @return The date and time when the key was created.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * The date and time when the key was created.
     *
     * @param creationDate The date and time when the key was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The date and time when the key was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The date and time when the key was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     *
     * @return Specifies whether the key is enabled. When <code>KeyState</code> is
     *         <code>Enabled</code> this value is true, otherwise it is false.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     *
     * @param enabled Specifies whether the key is enabled. When <code>KeyState</code> is
     *         <code>Enabled</code> this value is true, otherwise it is false.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether the key is enabled. When <code>KeyState</code> is
     *         <code>Enabled</code> this value is true, otherwise it is false.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     *
     * @return Specifies whether the key is enabled. When <code>KeyState</code> is
     *         <code>Enabled</code> this value is true, otherwise it is false.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The friendly description of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @return The friendly description of the key.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The friendly description of the key.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description The friendly description of the key.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The friendly description of the key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     *
     * @param description The friendly description of the key.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The cryptographic operations for which you can use the key. Currently
     * the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     * you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @return The cryptographic operations for which you can use the key. Currently
     *         the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     *         you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     *         operations.
     *
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return keyUsage;
    }
    
    /**
     * The cryptographic operations for which you can use the key. Currently
     * the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     * you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage The cryptographic operations for which you can use the key. Currently
     *         the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     *         you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     *         operations.
     *
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }
    
    /**
     * The cryptographic operations for which you can use the key. Currently
     * the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     * you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage The cryptographic operations for which you can use the key. Currently
     *         the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     *         you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     *         operations.
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
     * The cryptographic operations for which you can use the key. Currently
     * the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     * you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage The cryptographic operations for which you can use the key. Currently
     *         the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     *         you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     *         operations.
     *
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }
    
    /**
     * The cryptographic operations for which you can use the key. Currently
     * the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     * you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENCRYPT_DECRYPT
     *
     * @param keyUsage The cryptographic operations for which you can use the key. Currently
     *         the only allowed value is <code>ENCRYPT_DECRYPT</code>, which means
     *         you can use the key for the <a>Encrypt</a> and <a>Decrypt</a>
     *         operations.
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
     * The state of the customer master key (CMK). <p>For more information
     * about how key state affects the use of a CMK, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled, PendingDeletion
     *
     * @return The state of the customer master key (CMK). <p>For more information
     *         about how key state affects the use of a CMK, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     *         Key Management Service Developer Guide</i>.
     *
     * @see KeyState
     */
    public String getKeyState() {
        return keyState;
    }
    
    /**
     * The state of the customer master key (CMK). <p>For more information
     * about how key state affects the use of a CMK, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled, PendingDeletion
     *
     * @param keyState The state of the customer master key (CMK). <p>For more information
     *         about how key state affects the use of a CMK, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     *         Key Management Service Developer Guide</i>.
     *
     * @see KeyState
     */
    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }
    
    /**
     * The state of the customer master key (CMK). <p>For more information
     * about how key state affects the use of a CMK, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled, PendingDeletion
     *
     * @param keyState The state of the customer master key (CMK). <p>For more information
     *         about how key state affects the use of a CMK, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     *         Key Management Service Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see KeyState
     */
    public KeyMetadata withKeyState(String keyState) {
        this.keyState = keyState;
        return this;
    }

    /**
     * The state of the customer master key (CMK). <p>For more information
     * about how key state affects the use of a CMK, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled, PendingDeletion
     *
     * @param keyState The state of the customer master key (CMK). <p>For more information
     *         about how key state affects the use of a CMK, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     *         Key Management Service Developer Guide</i>.
     *
     * @see KeyState
     */
    public void setKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
    }
    
    /**
     * The state of the customer master key (CMK). <p>For more information
     * about how key state affects the use of a CMK, go to <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     * Key Management Service Developer Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled, PendingDeletion
     *
     * @param keyState The state of the customer master key (CMK). <p>For more information
     *         about how key state affects the use of a CMK, go to <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     *         Key State Affects the Use of a Customer Master Key</a> in the <i>AWS
     *         Key Management Service Developer Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see KeyState
     */
    public KeyMetadata withKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
        return this;
    }

    /**
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     *
     * @return The date and time after which AWS KMS deletes the customer master key
     *         (CMK). This value is present only when <code>KeyState</code> is
     *         <code>PendingDeletion</code>, otherwise this value is null.
     */
    public java.util.Date getDeletionDate() {
        return deletionDate;
    }
    
    /**
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     *
     * @param deletionDate The date and time after which AWS KMS deletes the customer master key
     *         (CMK). This value is present only when <code>KeyState</code> is
     *         <code>PendingDeletion</code>, otherwise this value is null.
     */
    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }
    
    /**
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deletionDate The date and time after which AWS KMS deletes the customer master key
     *         (CMK). This value is present only when <code>KeyState</code> is
     *         <code>PendingDeletion</code>, otherwise this value is null.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public KeyMetadata withDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
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
        if (getKeyUsage() != null) sb.append("KeyUsage: " + getKeyUsage() + ",");
        if (getKeyState() != null) sb.append("KeyState: " + getKeyState() + ",");
        if (getDeletionDate() != null) sb.append("DeletionDate: " + getDeletionDate() );
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
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode()); 
        hashCode = prime * hashCode + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode()); 
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
        if (other.getKeyState() == null ^ this.getKeyState() == null) return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false) return false; 
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null) return false;
        if (other.getDeletionDate() != null && other.getDeletionDate().equals(this.getDeletionDate()) == false) return false; 
        return true;
    }
    
    @Override
    public KeyMetadata clone() {
        try {
            return (KeyMetadata) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    