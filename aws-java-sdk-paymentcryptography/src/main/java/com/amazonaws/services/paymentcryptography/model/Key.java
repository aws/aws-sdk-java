/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata about an Amazon Web Services Payment Cryptography key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/Key" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Key implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     */
    private KeyAttributes keyAttributes;
    /**
     * <p>
     * The key check value (KCV) is used to check if all parties holding a given key have the same key or to detect that
     * a key has changed.
     * </p>
     */
    private String keyCheckValue;
    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     */
    private String keyCheckValueAlgorithm;
    /**
     * <p>
     * Specifies whether the key is enabled.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * Specifies whether the key is exportable. This data is immutable after the key is created.
     * </p>
     */
    private Boolean exportable;
    /**
     * <p>
     * The state of key that is being created or deleted.
     * </p>
     */
    private String keyState;
    /**
     * <p>
     * The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the value is
     * <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment Cryptography, the value
     * is <code>EXTERNAL</code>.
     * </p>
     */
    private String keyOrigin;
    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will start using the key material for
     * cryptographic operations.
     * </p>
     */
    private java.util.Date usageStartTimestamp;
    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will stop using the key material for
     * cryptographic operations.
     * </p>
     */
    private java.util.Date usageStopTimestamp;
    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when <code>KeyState</code> is <code>DELETE_PENDING</code> and the key is scheduled for deletion.
     * </p>
     */
    private java.util.Date deletePendingTimestamp;
    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when when the <code>KeyState</code> is <code>DELETE_COMPLETE</code> and the Amazon Web Services Payment
     * Cryptography key is deleted.
     * </p>
     */
    private java.util.Date deleteTimestamp;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key.
     * </p>
     * 
     * @param keyArn
     *        The Amazon Resource Name (ARN) of the key.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the key.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key.
     * </p>
     * 
     * @param keyArn
     *        The Amazon Resource Name (ARN) of the key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     * 
     * @param keyAttributes
     *        The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *        This data is immutable after the key is created.
     */

    public void setKeyAttributes(KeyAttributes keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     * 
     * @return The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *         This data is immutable after the key is created.
     */

    public KeyAttributes getKeyAttributes() {
        return this.keyAttributes;
    }

    /**
     * <p>
     * The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key. This data
     * is immutable after the key is created.
     * </p>
     * 
     * @param keyAttributes
     *        The role of the key, the algorithm it supports, and the cryptographic operations allowed with the key.
     *        This data is immutable after the key is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withKeyAttributes(KeyAttributes keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * <p>
     * The key check value (KCV) is used to check if all parties holding a given key have the same key or to detect that
     * a key has changed.
     * </p>
     * 
     * @param keyCheckValue
     *        The key check value (KCV) is used to check if all parties holding a given key have the same key or to
     *        detect that a key has changed.
     */

    public void setKeyCheckValue(String keyCheckValue) {
        this.keyCheckValue = keyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) is used to check if all parties holding a given key have the same key or to detect that
     * a key has changed.
     * </p>
     * 
     * @return The key check value (KCV) is used to check if all parties holding a given key have the same key or to
     *         detect that a key has changed.
     */

    public String getKeyCheckValue() {
        return this.keyCheckValue;
    }

    /**
     * <p>
     * The key check value (KCV) is used to check if all parties holding a given key have the same key or to detect that
     * a key has changed.
     * </p>
     * 
     * @param keyCheckValue
     *        The key check value (KCV) is used to check if all parties holding a given key have the same key or to
     *        detect that a key has changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withKeyCheckValue(String keyCheckValue) {
        setKeyCheckValue(keyCheckValue);
        return this;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *        It is used to validate the key integrity.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @see KeyCheckValueAlgorithm
     */

    public void setKeyCheckValueAlgorithm(String keyCheckValueAlgorithm) {
        this.keyCheckValueAlgorithm = keyCheckValueAlgorithm;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @return The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *         It is used to validate the key integrity.</p>
     *         <p>
     *         For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *         checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is
     *         computed using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest
     *         order bytes of the encrypted result.
     * @see KeyCheckValueAlgorithm
     */

    public String getKeyCheckValueAlgorithm() {
        return this.keyCheckValueAlgorithm;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *        It is used to validate the key integrity.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public Key withKeyCheckValueAlgorithm(String keyCheckValueAlgorithm) {
        setKeyCheckValueAlgorithm(keyCheckValueAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @param keyCheckValueAlgorithm
     *        The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *        It is used to validate the key integrity.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public Key withKeyCheckValueAlgorithm(KeyCheckValueAlgorithm keyCheckValueAlgorithm) {
        this.keyCheckValueAlgorithm = keyCheckValueAlgorithm.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the key is enabled.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether the key is enabled.
     * </p>
     * 
     * @return Specifies whether the key is enabled.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the key is enabled.
     * </p>
     * 
     * @param enabled
     *        Specifies whether the key is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is enabled.
     * </p>
     * 
     * @return Specifies whether the key is enabled.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether the key is exportable. This data is immutable after the key is created.
     * </p>
     * 
     * @param exportable
     *        Specifies whether the key is exportable. This data is immutable after the key is created.
     */

    public void setExportable(Boolean exportable) {
        this.exportable = exportable;
    }

    /**
     * <p>
     * Specifies whether the key is exportable. This data is immutable after the key is created.
     * </p>
     * 
     * @return Specifies whether the key is exportable. This data is immutable after the key is created.
     */

    public Boolean getExportable() {
        return this.exportable;
    }

    /**
     * <p>
     * Specifies whether the key is exportable. This data is immutable after the key is created.
     * </p>
     * 
     * @param exportable
     *        Specifies whether the key is exportable. This data is immutable after the key is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withExportable(Boolean exportable) {
        setExportable(exportable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is exportable. This data is immutable after the key is created.
     * </p>
     * 
     * @return Specifies whether the key is exportable. This data is immutable after the key is created.
     */

    public Boolean isExportable() {
        return this.exportable;
    }

    /**
     * <p>
     * The state of key that is being created or deleted.
     * </p>
     * 
     * @param keyState
     *        The state of key that is being created or deleted.
     * @see KeyState
     */

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The state of key that is being created or deleted.
     * </p>
     * 
     * @return The state of key that is being created or deleted.
     * @see KeyState
     */

    public String getKeyState() {
        return this.keyState;
    }

    /**
     * <p>
     * The state of key that is being created or deleted.
     * </p>
     * 
     * @param keyState
     *        The state of key that is being created or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public Key withKeyState(String keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The state of key that is being created or deleted.
     * </p>
     * 
     * @param keyState
     *        The state of key that is being created or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public Key withKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
        return this;
    }

    /**
     * <p>
     * The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the value is
     * <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment Cryptography, the value
     * is <code>EXTERNAL</code>.
     * </p>
     * 
     * @param keyOrigin
     *        The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the
     *        value is <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment
     *        Cryptography, the value is <code>EXTERNAL</code>.
     * @see KeyOrigin
     */

    public void setKeyOrigin(String keyOrigin) {
        this.keyOrigin = keyOrigin;
    }

    /**
     * <p>
     * The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the value is
     * <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment Cryptography, the value
     * is <code>EXTERNAL</code>.
     * </p>
     * 
     * @return The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the
     *         value is <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment
     *         Cryptography, the value is <code>EXTERNAL</code>.
     * @see KeyOrigin
     */

    public String getKeyOrigin() {
        return this.keyOrigin;
    }

    /**
     * <p>
     * The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the value is
     * <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment Cryptography, the value
     * is <code>EXTERNAL</code>.
     * </p>
     * 
     * @param keyOrigin
     *        The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the
     *        value is <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment
     *        Cryptography, the value is <code>EXTERNAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyOrigin
     */

    public Key withKeyOrigin(String keyOrigin) {
        setKeyOrigin(keyOrigin);
        return this;
    }

    /**
     * <p>
     * The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the value is
     * <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment Cryptography, the value
     * is <code>EXTERNAL</code>.
     * </p>
     * 
     * @param keyOrigin
     *        The source of the key material. For keys created within Amazon Web Services Payment Cryptography, the
     *        value is <code>AWS_PAYMENT_CRYPTOGRAPHY</code>. For keys imported into Amazon Web Services Payment
     *        Cryptography, the value is <code>EXTERNAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyOrigin
     */

    public Key withKeyOrigin(KeyOrigin keyOrigin) {
        this.keyOrigin = keyOrigin.toString();
        return this;
    }

    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the key was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     * 
     * @return The date and time when the key was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The date and time when the key was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time when the key was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will start using the key material for
     * cryptographic operations.
     * </p>
     * 
     * @param usageStartTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will start using the key material
     *        for cryptographic operations.
     */

    public void setUsageStartTimestamp(java.util.Date usageStartTimestamp) {
        this.usageStartTimestamp = usageStartTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will start using the key material for
     * cryptographic operations.
     * </p>
     * 
     * @return The date and time after which Amazon Web Services Payment Cryptography will start using the key material
     *         for cryptographic operations.
     */

    public java.util.Date getUsageStartTimestamp() {
        return this.usageStartTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will start using the key material for
     * cryptographic operations.
     * </p>
     * 
     * @param usageStartTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will start using the key material
     *        for cryptographic operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withUsageStartTimestamp(java.util.Date usageStartTimestamp) {
        setUsageStartTimestamp(usageStartTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will stop using the key material for
     * cryptographic operations.
     * </p>
     * 
     * @param usageStopTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will stop using the key material
     *        for cryptographic operations.
     */

    public void setUsageStopTimestamp(java.util.Date usageStopTimestamp) {
        this.usageStopTimestamp = usageStopTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will stop using the key material for
     * cryptographic operations.
     * </p>
     * 
     * @return The date and time after which Amazon Web Services Payment Cryptography will stop using the key material
     *         for cryptographic operations.
     */

    public java.util.Date getUsageStopTimestamp() {
        return this.usageStopTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will stop using the key material for
     * cryptographic operations.
     * </p>
     * 
     * @param usageStopTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will stop using the key material
     *        for cryptographic operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withUsageStopTimestamp(java.util.Date usageStopTimestamp) {
        setUsageStopTimestamp(usageStopTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when <code>KeyState</code> is <code>DELETE_PENDING</code> and the key is scheduled for deletion.
     * </p>
     * 
     * @param deletePendingTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is
     *        present only when <code>KeyState</code> is <code>DELETE_PENDING</code> and the key is scheduled for
     *        deletion.
     */

    public void setDeletePendingTimestamp(java.util.Date deletePendingTimestamp) {
        this.deletePendingTimestamp = deletePendingTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when <code>KeyState</code> is <code>DELETE_PENDING</code> and the key is scheduled for deletion.
     * </p>
     * 
     * @return The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is
     *         present only when <code>KeyState</code> is <code>DELETE_PENDING</code> and the key is scheduled for
     *         deletion.
     */

    public java.util.Date getDeletePendingTimestamp() {
        return this.deletePendingTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when <code>KeyState</code> is <code>DELETE_PENDING</code> and the key is scheduled for deletion.
     * </p>
     * 
     * @param deletePendingTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is
     *        present only when <code>KeyState</code> is <code>DELETE_PENDING</code> and the key is scheduled for
     *        deletion.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withDeletePendingTimestamp(java.util.Date deletePendingTimestamp) {
        setDeletePendingTimestamp(deletePendingTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when when the <code>KeyState</code> is <code>DELETE_COMPLETE</code> and the Amazon Web Services Payment
     * Cryptography key is deleted.
     * </p>
     * 
     * @param deleteTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is
     *        present only when when the <code>KeyState</code> is <code>DELETE_COMPLETE</code> and the Amazon Web
     *        Services Payment Cryptography key is deleted.
     */

    public void setDeleteTimestamp(java.util.Date deleteTimestamp) {
        this.deleteTimestamp = deleteTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when when the <code>KeyState</code> is <code>DELETE_COMPLETE</code> and the Amazon Web Services Payment
     * Cryptography key is deleted.
     * </p>
     * 
     * @return The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is
     *         present only when when the <code>KeyState</code> is <code>DELETE_COMPLETE</code> and the Amazon Web
     *         Services Payment Cryptography key is deleted.
     */

    public java.util.Date getDeleteTimestamp() {
        return this.deleteTimestamp;
    }

    /**
     * <p>
     * The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is present
     * only when when the <code>KeyState</code> is <code>DELETE_COMPLETE</code> and the Amazon Web Services Payment
     * Cryptography key is deleted.
     * </p>
     * 
     * @param deleteTimestamp
     *        The date and time after which Amazon Web Services Payment Cryptography will delete the key. This value is
     *        present only when when the <code>KeyState</code> is <code>DELETE_COMPLETE</code> and the Amazon Web
     *        Services Payment Cryptography key is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Key withDeleteTimestamp(java.util.Date deleteTimestamp) {
        setDeleteTimestamp(deleteTimestamp);
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
        if (getKeyArn() != null)
            sb.append("KeyArn: ").append(getKeyArn()).append(",");
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getKeyCheckValue() != null)
            sb.append("KeyCheckValue: ").append(getKeyCheckValue()).append(",");
        if (getKeyCheckValueAlgorithm() != null)
            sb.append("KeyCheckValueAlgorithm: ").append(getKeyCheckValueAlgorithm()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getExportable() != null)
            sb.append("Exportable: ").append(getExportable()).append(",");
        if (getKeyState() != null)
            sb.append("KeyState: ").append(getKeyState()).append(",");
        if (getKeyOrigin() != null)
            sb.append("KeyOrigin: ").append(getKeyOrigin()).append(",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getUsageStartTimestamp() != null)
            sb.append("UsageStartTimestamp: ").append(getUsageStartTimestamp()).append(",");
        if (getUsageStopTimestamp() != null)
            sb.append("UsageStopTimestamp: ").append(getUsageStopTimestamp()).append(",");
        if (getDeletePendingTimestamp() != null)
            sb.append("DeletePendingTimestamp: ").append(getDeletePendingTimestamp()).append(",");
        if (getDeleteTimestamp() != null)
            sb.append("DeleteTimestamp: ").append(getDeleteTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Key == false)
            return false;
        Key other = (Key) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getKeyCheckValue() == null ^ this.getKeyCheckValue() == null)
            return false;
        if (other.getKeyCheckValue() != null && other.getKeyCheckValue().equals(this.getKeyCheckValue()) == false)
            return false;
        if (other.getKeyCheckValueAlgorithm() == null ^ this.getKeyCheckValueAlgorithm() == null)
            return false;
        if (other.getKeyCheckValueAlgorithm() != null && other.getKeyCheckValueAlgorithm().equals(this.getKeyCheckValueAlgorithm()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getExportable() == null ^ this.getExportable() == null)
            return false;
        if (other.getExportable() != null && other.getExportable().equals(this.getExportable()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getKeyOrigin() == null ^ this.getKeyOrigin() == null)
            return false;
        if (other.getKeyOrigin() != null && other.getKeyOrigin().equals(this.getKeyOrigin()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getUsageStartTimestamp() == null ^ this.getUsageStartTimestamp() == null)
            return false;
        if (other.getUsageStartTimestamp() != null && other.getUsageStartTimestamp().equals(this.getUsageStartTimestamp()) == false)
            return false;
        if (other.getUsageStopTimestamp() == null ^ this.getUsageStopTimestamp() == null)
            return false;
        if (other.getUsageStopTimestamp() != null && other.getUsageStopTimestamp().equals(this.getUsageStopTimestamp()) == false)
            return false;
        if (other.getDeletePendingTimestamp() == null ^ this.getDeletePendingTimestamp() == null)
            return false;
        if (other.getDeletePendingTimestamp() != null && other.getDeletePendingTimestamp().equals(this.getDeletePendingTimestamp()) == false)
            return false;
        if (other.getDeleteTimestamp() == null ^ this.getDeleteTimestamp() == null)
            return false;
        if (other.getDeleteTimestamp() != null && other.getDeleteTimestamp().equals(this.getDeleteTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getKeyCheckValue() == null) ? 0 : getKeyCheckValue().hashCode());
        hashCode = prime * hashCode + ((getKeyCheckValueAlgorithm() == null) ? 0 : getKeyCheckValueAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getExportable() == null) ? 0 : getExportable().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode + ((getKeyOrigin() == null) ? 0 : getKeyOrigin().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUsageStartTimestamp() == null) ? 0 : getUsageStartTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUsageStopTimestamp() == null) ? 0 : getUsageStopTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDeletePendingTimestamp() == null) ? 0 : getDeletePendingTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDeleteTimestamp() == null) ? 0 : getDeleteTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public Key clone() {
        try {
            return (Key) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.KeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
