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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/KeySummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeySummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the key.
     * </p>
     */
    private String keyArn;
    /**
     * <p>
     * The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * </p>
     */
    private String keyState;
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
     * Specifies whether the key is exportable. This data is immutable after the key is created.
     * </p>
     */
    private Boolean exportable;
    /**
     * <p>
     * Specifies whether the key is enabled.
     * </p>
     */
    private Boolean enabled;

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

    public KeySummary withKeyArn(String keyArn) {
        setKeyArn(keyArn);
        return this;
    }

    /**
     * <p>
     * The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * </p>
     * 
     * @param keyState
     *        The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * @see KeyState
     */

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * </p>
     * 
     * @return The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * @see KeyState
     */

    public String getKeyState() {
        return this.keyState;
    }

    /**
     * <p>
     * The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * </p>
     * 
     * @param keyState
     *        The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public KeySummary withKeyState(String keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * </p>
     * 
     * @param keyState
     *        The state of an Amazon Web Services Payment Cryptography that is being created or deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public KeySummary withKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
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

    public KeySummary withKeyAttributes(KeyAttributes keyAttributes) {
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

    public KeySummary withKeyCheckValue(String keyCheckValue) {
        setKeyCheckValue(keyCheckValue);
        return this;
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

    public KeySummary withExportable(Boolean exportable) {
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

    public KeySummary withEnabled(Boolean enabled) {
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
        if (getKeyState() != null)
            sb.append("KeyState: ").append(getKeyState()).append(",");
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getKeyCheckValue() != null)
            sb.append("KeyCheckValue: ").append(getKeyCheckValue()).append(",");
        if (getExportable() != null)
            sb.append("Exportable: ").append(getExportable()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeySummary == false)
            return false;
        KeySummary other = (KeySummary) obj;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getKeyCheckValue() == null ^ this.getKeyCheckValue() == null)
            return false;
        if (other.getKeyCheckValue() != null && other.getKeyCheckValue().equals(this.getKeyCheckValue()) == false)
            return false;
        if (other.getExportable() == null ^ this.getExportable() == null)
            return false;
        if (other.getExportable() != null && other.getExportable().equals(this.getExportable()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getKeyCheckValue() == null) ? 0 : getKeyCheckValue().hashCode());
        hashCode = prime * hashCode + ((getExportable() == null) ? 0 : getExportable().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public KeySummary clone() {
        try {
            return (KeySummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.KeySummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
