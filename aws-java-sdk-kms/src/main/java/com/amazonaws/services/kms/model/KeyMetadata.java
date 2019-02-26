/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains metadata about a customer master key (CMK).
 * </p>
 * <p>
 * This data type is used as a response element for the <a>CreateKey</a> and <a>DescribeKey</a> operations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/KeyMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     */
    private String aWSAccountId;
    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key
     * Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true,
     * otherwise it is false.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The description of the CMK.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     * <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * </p>
     */
    private String keyUsage;
    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String keyState;
    /**
     * <p>
     * The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>.
     * </p>
     */
    private java.util.Date deletionDate;
    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is
     * <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this
     * value is omitted.
     * </p>
     */
    private java.util.Date validTo;
    /**
     * <p>
     * The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     */
    private String origin;
    /**
     * <p>
     * A unique identifier for the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> that
     * contains the CMK. This value is present only when the CMK is created in a custom key store.
     * </p>
     */
    private String customKeyStoreId;
    /**
     * <p>
     * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>, AWS
     * KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when
     * the CMK is created in a custom key store.
     * </p>
     */
    private String cloudHsmClusterId;
    /**
     * <p>
     * Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     * <code>EXTERNAL</code>, otherwise this value is omitted.
     * </p>
     */
    private String expirationModel;
    /**
     * <p>
     * The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the difference,
     * see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     * Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String keyManager;

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the AWS account that owns the CMK.
     */

    public void setAWSAccountId(String aWSAccountId) {
        this.aWSAccountId = aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * 
     * @return The twelve-digit account ID of the AWS account that owns the CMK.
     */

    public String getAWSAccountId() {
        return this.aWSAccountId;
    }

    /**
     * <p>
     * The twelve-digit account ID of the AWS account that owns the CMK.
     * </p>
     * 
     * @param aWSAccountId
     *        The twelve-digit account ID of the AWS account that owns the CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withAWSAccountId(String aWSAccountId) {
        setAWSAccountId(aWSAccountId);
        return this;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the CMK.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * 
     * @return The globally unique identifier for the CMK.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The globally unique identifier for the CMK.
     * </p>
     * 
     * @param keyId
     *        The globally unique identifier for the CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key
     * Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the CMK. For examples, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key
     *        Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key
     * Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CMK. For examples, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key
     *         Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CMK. For examples, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key
     * Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the CMK. For examples, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kms">AWS Key
     *        Management Service (AWS KMS)</a> in the Example ARNs section of the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the CMK was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     * 
     * @return The date and time when the CMK was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the CMK was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the CMK was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true,
     * otherwise it is false.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is
     *        true, otherwise it is false.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true,
     * otherwise it is false.
     * </p>
     * 
     * @return Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is
     *         true, otherwise it is false.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true,
     * otherwise it is false.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is
     *        true, otherwise it is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is true,
     * otherwise it is false.
     * </p>
     * 
     * @return Specifies whether the CMK is enabled. When <code>KeyState</code> is <code>Enabled</code> this value is
     *         true, otherwise it is false.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The description of the CMK.
     * </p>
     * 
     * @param description
     *        The description of the CMK.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the CMK.
     * </p>
     * 
     * @return The description of the CMK.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the CMK.
     * </p>
     * 
     * @param description
     *        The description of the CMK.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     * <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     *        <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     *        operations.
     * @see KeyUsageType
     */

    public void setKeyUsage(String keyUsage) {
        this.keyUsage = keyUsage;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     * <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * </p>
     * 
     * @return The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     *         <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     *         operations.
     * @see KeyUsageType
     */

    public String getKeyUsage() {
        return this.keyUsage;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     * <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     *        <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     *        operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public KeyMetadata withKeyUsage(String keyUsage) {
        setKeyUsage(keyUsage);
        return this;
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     * <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     *        <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     *        operations.
     * @see KeyUsageType
     */

    public void setKeyUsage(KeyUsageType keyUsage) {
        withKeyUsage(keyUsage);
    }

    /**
     * <p>
     * The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     * <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     * operations.
     * </p>
     * 
     * @param keyUsage
     *        The cryptographic operations for which you can use the CMK. Currently the only allowed value is
     *        <code>ENCRYPT_DECRYPT</code>, which means you can use the CMK for the <a>Encrypt</a> and <a>Decrypt</a>
     *        operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyUsageType
     */

    public KeyMetadata withKeyUsage(KeyUsageType keyUsage) {
        this.keyUsage = keyUsage.toString();
        return this;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the CMK.</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use
     *        of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyState
     */

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The state of the CMK.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use
     *         of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyState
     */

    public String getKeyState() {
        return this.keyState;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the CMK.</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use
     *        of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public KeyMetadata withKeyState(String keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the CMK.</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use
     *        of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyState
     */

    public void setKeyState(KeyState keyState) {
        withKeyState(keyState);
    }

    /**
     * <p>
     * The state of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use of a
     * Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The state of the CMK.</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">How Key State Affects the Use
     *        of a Customer Master Key</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public KeyMetadata withKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
        return this;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the CMK. This value is present only when
     *        <code>KeyState</code> is <code>PendingDeletion</code>.
     */

    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>.
     * </p>
     * 
     * @return The date and time after which AWS KMS deletes the CMK. This value is present only when
     *         <code>KeyState</code> is <code>PendingDeletion</code>.
     */

    public java.util.Date getDeletionDate() {
        return this.deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the CMK. This value is present only when <code>KeyState</code> is
     * <code>PendingDeletion</code>.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the CMK. This value is present only when
     *        <code>KeyState</code> is <code>PendingDeletion</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withDeletionDate(java.util.Date deletionDate) {
        setDeletionDate(deletionDate);
        return this;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is
     * <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this
     * value is omitted.
     * </p>
     * 
     * @param validTo
     *        The time at which the imported key material expires. When the key material expires, AWS KMS deletes the
     *        key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code>
     *        is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>,
     *        otherwise this value is omitted.
     */

    public void setValidTo(java.util.Date validTo) {
        this.validTo = validTo;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is
     * <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this
     * value is omitted.
     * </p>
     * 
     * @return The time at which the imported key material expires. When the key material expires, AWS KMS deletes the
     *         key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code>
     *         is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>,
     *         otherwise this value is omitted.
     */

    public java.util.Date getValidTo() {
        return this.validTo;
    }

    /**
     * <p>
     * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key
     * material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code> is
     * <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>, otherwise this
     * value is omitted.
     * </p>
     * 
     * @param validTo
     *        The time at which the imported key material expires. When the key material expires, AWS KMS deletes the
     *        key material and the CMK becomes unusable. This value is present only for CMKs whose <code>Origin</code>
     *        is <code>EXTERNAL</code> and whose <code>ExpirationModel</code> is <code>KEY_MATERIAL_EXPIRES</code>,
     *        otherwise this value is omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withValidTo(java.util.Date validTo) {
        setValidTo(validTo);
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key
     *        material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key
     *        management infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the
     *        key material was created in the AWS CloudHSM cluster associated with a custom key store.
     * @see OriginType
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * 
     * @return The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key
     *         material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key
     *         management infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>,
     *         the key material was created in the AWS CloudHSM cluster associated with a custom key store.
     * @see OriginType
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key
     *        material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key
     *        management infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the
     *        key material was created in the AWS CloudHSM cluster associated with a custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public KeyMetadata withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key
     *        material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key
     *        management infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the
     *        key material was created in the AWS CloudHSM cluster associated with a custom key store.
     * @see OriginType
     */

    public void setOrigin(OriginType origin) {
        withOrigin(origin);
    }

    /**
     * <p>
     * The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key material.
     * When this value is <code>EXTERNAL</code>, the key material was imported from your existing key management
     * infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the key material was
     * created in the AWS CloudHSM cluster associated with a custom key store.
     * </p>
     * 
     * @param origin
     *        The source of the CMK's key material. When this value is <code>AWS_KMS</code>, AWS KMS created the key
     *        material. When this value is <code>EXTERNAL</code>, the key material was imported from your existing key
     *        management infrastructure or the CMK lacks key material. When this value is <code>AWS_CLOUDHSM</code>, the
     *        key material was created in the AWS CloudHSM cluster associated with a custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginType
     */

    public KeyMetadata withOrigin(OriginType origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> that
     * contains the CMK. This value is present only when the CMK is created in a custom key store.
     * </p>
     * 
     * @param customKeyStoreId
     *        A unique identifier for the <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        that contains the CMK. This value is present only when the CMK is created in a custom key store.
     */

    public void setCustomKeyStoreId(String customKeyStoreId) {
        this.customKeyStoreId = customKeyStoreId;
    }

    /**
     * <p>
     * A unique identifier for the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> that
     * contains the CMK. This value is present only when the CMK is created in a custom key store.
     * </p>
     * 
     * @return A unique identifier for the <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *         that contains the CMK. This value is present only when the CMK is created in a custom key store.
     */

    public String getCustomKeyStoreId() {
        return this.customKeyStoreId;
    }

    /**
     * <p>
     * A unique identifier for the <a
     * href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a> that
     * contains the CMK. This value is present only when the CMK is created in a custom key store.
     * </p>
     * 
     * @param customKeyStoreId
     *        A unique identifier for the <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>
     *        that contains the CMK. This value is present only when the CMK is created in a custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withCustomKeyStoreId(String customKeyStoreId) {
        setCustomKeyStoreId(customKeyStoreId);
        return this;
    }

    /**
     * <p>
     * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>, AWS
     * KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when
     * the CMK is created in a custom key store.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a
     *        CMK in a <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key
     *        store</a>, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value
     *        is present only when the CMK is created in a custom key store.
     */

    public void setCloudHsmClusterId(String cloudHsmClusterId) {
        this.cloudHsmClusterId = cloudHsmClusterId;
    }

    /**
     * <p>
     * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>, AWS
     * KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when
     * the CMK is created in a custom key store.
     * </p>
     * 
     * @return The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a
     *         CMK in a <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom
     *         key store</a>, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This
     *         value is present only when the CMK is created in a custom key store.
     */

    public String getCloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }

    /**
     * <p>
     * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a
     * <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key store</a>, AWS
     * KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when
     * the CMK is created in a custom key store.
     * </p>
     * 
     * @param cloudHsmClusterId
     *        The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a
     *        CMK in a <a href="http://docs.aws.amazon.com/kms/latest/developerguide/key-store-overview.html">custom key
     *        store</a>, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value
     *        is present only when the CMK is created in a custom key store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyMetadata withCloudHsmClusterId(String cloudHsmClusterId) {
        setCloudHsmClusterId(cloudHsmClusterId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     * <code>EXTERNAL</code>, otherwise this value is omitted.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     *        <code>EXTERNAL</code>, otherwise this value is omitted.
     * @see ExpirationModelType
     */

    public void setExpirationModel(String expirationModel) {
        this.expirationModel = expirationModel;
    }

    /**
     * <p>
     * Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     * <code>EXTERNAL</code>, otherwise this value is omitted.
     * </p>
     * 
     * @return Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     *         <code>EXTERNAL</code>, otherwise this value is omitted.
     * @see ExpirationModelType
     */

    public String getExpirationModel() {
        return this.expirationModel;
    }

    /**
     * <p>
     * Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     * <code>EXTERNAL</code>, otherwise this value is omitted.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     *        <code>EXTERNAL</code>, otherwise this value is omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationModelType
     */

    public KeyMetadata withExpirationModel(String expirationModel) {
        setExpirationModel(expirationModel);
        return this;
    }

    /**
     * <p>
     * Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     * <code>EXTERNAL</code>, otherwise this value is omitted.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     *        <code>EXTERNAL</code>, otherwise this value is omitted.
     * @see ExpirationModelType
     */

    public void setExpirationModel(ExpirationModelType expirationModel) {
        withExpirationModel(expirationModel);
    }

    /**
     * <p>
     * Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     * <code>EXTERNAL</code>, otherwise this value is omitted.
     * </p>
     * 
     * @param expirationModel
     *        Specifies whether the CMK's key material expires. This value is present only when <code>Origin</code> is
     *        <code>EXTERNAL</code>, otherwise this value is omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExpirationModelType
     */

    public KeyMetadata withExpirationModel(ExpirationModelType expirationModel) {
        this.expirationModel = expirationModel.toString();
        return this;
    }

    /**
     * <p>
     * The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the difference,
     * see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     * Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyManager
     *        The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the
     *        difference, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyManagerType
     */

    public void setKeyManager(String keyManager) {
        this.keyManager = keyManager;
    }

    /**
     * <p>
     * The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the difference,
     * see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     * Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the
     *         difference, see <a
     *         href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *         Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyManagerType
     */

    public String getKeyManager() {
        return this.keyManager;
    }

    /**
     * <p>
     * The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the difference,
     * see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     * Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyManager
     *        The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the
     *        difference, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyManagerType
     */

    public KeyMetadata withKeyManager(String keyManager) {
        setKeyManager(keyManager);
        return this;
    }

    /**
     * <p>
     * The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the difference,
     * see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     * Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyManager
     *        The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the
     *        difference, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyManagerType
     */

    public void setKeyManager(KeyManagerType keyManager) {
        withKeyManager(keyManager);
    }

    /**
     * <p>
     * The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the difference,
     * see <a href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     * Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyManager
     *        The CMK's manager. CMKs are either customer-managed or AWS-managed. For more information about the
     *        difference, see <a
     *        href="http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#master_keys">Customer Master
     *        Keys</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyManagerType
     */

    public KeyMetadata withKeyManager(KeyManagerType keyManager) {
        this.keyManager = keyManager.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
            sb.append("AWSAccountId: ").append(getAWSAccountId()).append(",");
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKeyUsage() != null)
            sb.append("KeyUsage: ").append(getKeyUsage()).append(",");
        if (getKeyState() != null)
            sb.append("KeyState: ").append(getKeyState()).append(",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: ").append(getDeletionDate()).append(",");
        if (getValidTo() != null)
            sb.append("ValidTo: ").append(getValidTo()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getCustomKeyStoreId() != null)
            sb.append("CustomKeyStoreId: ").append(getCustomKeyStoreId()).append(",");
        if (getCloudHsmClusterId() != null)
            sb.append("CloudHsmClusterId: ").append(getCloudHsmClusterId()).append(",");
        if (getExpirationModel() != null)
            sb.append("ExpirationModel: ").append(getExpirationModel()).append(",");
        if (getKeyManager() != null)
            sb.append("KeyManager: ").append(getKeyManager());
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
        if (other.getAWSAccountId() != null && other.getAWSAccountId().equals(this.getAWSAccountId()) == false)
            return false;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKeyUsage() == null ^ this.getKeyUsage() == null)
            return false;
        if (other.getKeyUsage() != null && other.getKeyUsage().equals(this.getKeyUsage()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        if (other.getValidTo() == null ^ this.getValidTo() == null)
            return false;
        if (other.getValidTo() != null && other.getValidTo().equals(this.getValidTo()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getCustomKeyStoreId() == null ^ this.getCustomKeyStoreId() == null)
            return false;
        if (other.getCustomKeyStoreId() != null && other.getCustomKeyStoreId().equals(this.getCustomKeyStoreId()) == false)
            return false;
        if (other.getCloudHsmClusterId() == null ^ this.getCloudHsmClusterId() == null)
            return false;
        if (other.getCloudHsmClusterId() != null && other.getCloudHsmClusterId().equals(this.getCloudHsmClusterId()) == false)
            return false;
        if (other.getExpirationModel() == null ^ this.getExpirationModel() == null)
            return false;
        if (other.getExpirationModel() != null && other.getExpirationModel().equals(this.getExpirationModel()) == false)
            return false;
        if (other.getKeyManager() == null ^ this.getKeyManager() == null)
            return false;
        if (other.getKeyManager() != null && other.getKeyManager().equals(this.getKeyManager()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAWSAccountId() == null) ? 0 : getAWSAccountId().hashCode());
        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKeyUsage() == null) ? 0 : getKeyUsage().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        hashCode = prime * hashCode + ((getValidTo() == null) ? 0 : getValidTo().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getCustomKeyStoreId() == null) ? 0 : getCustomKeyStoreId().hashCode());
        hashCode = prime * hashCode + ((getCloudHsmClusterId() == null) ? 0 : getCloudHsmClusterId().hashCode());
        hashCode = prime * hashCode + ((getExpirationModel() == null) ? 0 : getExpirationModel().hashCode());
        hashCode = prime * hashCode + ((getKeyManager() == null) ? 0 : getKeyManager().hashCode());
        return hashCode;
    }

    @Override
    public KeyMetadata clone() {
        try {
            return (KeyMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kms.model.transform.KeyMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
