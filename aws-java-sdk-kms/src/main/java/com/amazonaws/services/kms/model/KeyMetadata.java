/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
 * This data type is used as a response element for the <a>CreateKey</a> and
 * <a>DescribeKey</a> operations.
 * </p>
 */
public class KeyMetadata implements Serializable, Cloneable {

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the key.
     * </p>
     */
    private String aWSAccountId;
    /**
     * <p>
     * The globally unique identifier for the key.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key. For examples, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >AWS Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The friendly description of the key.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The cryptographic operations for which you can use the key. Currently the
     * only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can
     * use the key for the <a>Encrypt</a> and <a>Decrypt</a> operations.
     * </p>
     */
    private String keyUsage;
    /**
     * <p>
     * The state of the customer master key (CMK).
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, go to
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     */
    private String keyState;
    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     * </p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the key.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the AWS account that owns the key.
     */
    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the key.
     * </p>
     * 
     * @return The twelve-digit account ID of the AWS account that owns the key.
     */
    public String getAWSAccountId() {
        return this.aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the key.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the AWS account that owns the key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withAWSAccountId(String aWSAccountId) {
        setAWSAccountId(aWSAccountId);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the key.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the key.
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the key.
     * </p>
     * 
     * @return The globally unique identifier for the key.
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the key.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key. For examples, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >AWS Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the key. For examples, see <a
     *        href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *        >AWS Key Management Service (AWS KMS)</a> in the Example ARNs
     *        section of the <i>AWS General Reference</i>.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key. For examples, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >AWS Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the key. For examples, see <a
     *         href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *         >AWS Key Management Service (AWS KMS)</a> in the Example ARNs
     *         section of the <i>AWS General Reference</i>.
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key. For examples, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     * >AWS Key Management Service (AWS KMS)</a> in the Example ARNs section of
     * the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the key. For examples, see <a
     *        href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms"
     *        >AWS Key Management Service (AWS KMS)</a> in the Example ARNs
     *        section of the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the key was created.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     * 
     * @return The date and time when the key was created.
     */
    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the key was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the key is enabled. When <code>KeyState</code>
     *        is <code>Enabled</code> this value is true, otherwise it is false.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     * 
     * @return Specifies whether the key is enabled. When <code>KeyState</code>
     *         is <code>Enabled</code> this value is true, otherwise it is
     *         false.
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the key is enabled. When <code>KeyState</code>
     *        is <code>Enabled</code> this value is true, otherwise it is false.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is enabled. When <code>KeyState</code> is
     * <code>Enabled</code> this value is true, otherwise it is false.
     * </p>
     * 
     * @return Specifies whether the key is enabled. When <code>KeyState</code>
     *         is <code>Enabled</code> this value is true, otherwise it is
     *         false.
     */
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The friendly description of the key.
     * </p>
     * 
     * @param description
     *        The friendly description of the key.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The friendly description of the key.
     * </p>
     * 
     * @return The friendly description of the key.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The friendly description of the key.
     * </p>
     * 
     * @param description
     *        The friendly description of the key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the key. Currently the
     * only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can
     * use the key for the <a>Encrypt</a> and <a>Decrypt</a> operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the key.
     *        Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>,
     *        which means you can use the key for the <a>Encrypt</a> and
     *        <a>Decrypt</a> operations.
     * @see KeyUsageType
     */
    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the key. Currently the
     * only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can
     * use the key for the <a>Encrypt</a> and <a>Decrypt</a> operations.
     * </p>
     * 
     * @return The cryptographic operations for which you can use the key.
     *         Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>,
     *         which means you can use the key for the <a>Encrypt</a> and
     *         <a>Decrypt</a> operations.
     * @see KeyUsageType
     */
    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the key. Currently the
     * only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can
     * use the key for the <a>Encrypt</a> and <a>Decrypt</a> operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the key.
     *        Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>,
     *        which means you can use the key for the <a>Encrypt</a> and
     *        <a>Decrypt</a> operations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public KeyMetadata withKeyUsage(String keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the key. Currently the
     * only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can
     * use the key for the <a>Encrypt</a> and <a>Decrypt</a> operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the key.
     *        Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>,
     *        which means you can use the key for the <a>Encrypt</a> and
     *        <a>Decrypt</a> operations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public void setKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the key. Currently the
     * only allowed value is <code>ENCRYPT_DECRYPT</code>, which means you can
     * use the key for the <a>Encrypt</a> and <a>Decrypt</a> operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the key.
     *        Currently the only allowed value is <code>ENCRYPT_DECRYPT</code>,
     *        which means you can use the key for the <a>Encrypt</a> and
     *        <a>Decrypt</a> operations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyUsageType
     */
    public KeyMetadata withKeyUsage(KeyUsageType keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * The state of the customer master key (CMK).
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, go to
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the customer master key (CMK).</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK,
     *        go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *        >How Key State Affects the Use of a Customer Master Key</a> in the
     *        <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyState
     */
    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The state of the customer master key (CMK).
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, go to
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The state of the customer master key (CMK).</p>
     *         <p>
     *         For more information about how key state affects the use of a
     *         CMK, go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *         >How Key State Affects the Use of a Customer Master Key</a> in
     *         the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyState
     */
    public String getKeyState() {
        return this.keyState;
    }

    /**
     * <p>
     * The state of the customer master key (CMK).
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, go to
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the customer master key (CMK).</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK,
     *        go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *        >How Key State Affects the Use of a Customer Master Key</a> in the
     *        <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyState
     */
    public KeyMetadata withKeyState(String keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The state of the customer master key (CMK).
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, go to
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the customer master key (CMK).</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK,
     *        go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *        >How Key State Affects the Use of a Customer Master Key</a> in the
     *        <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyState
     */
    public void setKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
    }

    /**
     * <p>
     * The state of the customer master key (CMK).
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, go to
     * <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How
     * Key State Affects the Use of a Customer Master Key</a> in the <i>AWS Key
     * Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the customer master key (CMK).</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK,
     *        go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html"
     *        >How Key State Affects the Use of a Customer Master Key</a> in the
     *        <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see KeyState
     */
    public KeyMetadata withKeyState(KeyState keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the customer master
     *        key (CMK). This value is present only when <code>KeyState</code>
     *        is <code>PendingDeletion</code>, otherwise this value is null.
     */
    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     * </p>
     * 
     * @return The date and time after which AWS KMS deletes the customer master
     *         key (CMK). This value is present only when <code>KeyState</code>
     *         is <code>PendingDeletion</code>, otherwise this value is null.
     */
    public java.util.Date getDeletionDate() {
        return this.deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK). This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>, otherwise this value is null.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the customer master
     *        key (CMK). This value is present only when <code>KeyState</code>
     *        is <code>PendingDeletion</code>, otherwise this value is null.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public KeyMetadata withDeletionDate(java.util.Date deletionDate) {
        setDeletionDate(deletionDate);
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
        if (getAWSAccountId() != null)
            sb.append("AWSAccountId: " + getAWSAccountId() + ",");
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: " + getKeyUsage() + ",");
        if (getKeyState() != null)
            sb.append("KeyState: " + getKeyState() + ",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: " + getDeletionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyMetadata == false)
            return false;
        KeyMetadata other = (KeyMetadata) obj;
        if (other.getAWSAccountId() == null ^ this.getAWSAccountId() == null)
            return false;
        if (other.getAWSAccountId() != null
                && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null
                && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null
                && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null
                && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null
                && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null
                && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAWSAccountId() == null) ? 0 : getAWSAccountId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode
                + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeletionDate() == null) ? 0 : getDeletionDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public KeyMetadata clone() {
        try {
            return (KeyMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}