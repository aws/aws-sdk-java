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
 * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/KeyBlockHeaders"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyBlockHeaders implements Serializable, Cloneable, StructuredPojo {

    private KeyModesOfUse keyModesOfUse;
    /**
     * <p>
     * Specifies subsequent exportability of the key within the key block after it is received by the receiving party.
     * It can be used to further restrict exportability of the key after export from Amazon Web Services Payment
     * Cryptography.
     * </p>
     * <p>
     * When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK using TR-31
     * or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be subsequently exported
     * by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the receiver under a KEK using
     * TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram key export method. For further
     * information refer to <a href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * </p>
     */
    private String keyExportability;
    /**
     * <p>
     * Parameter used to indicate the version of the key carried in the key block or indicate the value carried in the
     * key block is a component of a key.
     * </p>
     */
    private String keyVersion;
    /**
     * <p>
     * Parameter used to indicate the type of optional data in key block headers. Refer to <a
     * href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a> for information on allowed
     * data type for optional blocks.
     * </p>
     * <p>
     * Optional block character limit is 112 characters. For each optional block, 2 characters are reserved for optional
     * block ID and 2 characters reserved for optional block length. More than one optional blocks can be included as
     * long as the combined length does not increase 112 characters.
     * </p>
     */
    private java.util.Map<String, String> optionalBlocks;

    /**
     * @param keyModesOfUse
     */

    public void setKeyModesOfUse(KeyModesOfUse keyModesOfUse) {
        this.keyModesOfUse = keyModesOfUse;
    }

    /**
     * @return
     */

    public KeyModesOfUse getKeyModesOfUse() {
        return this.keyModesOfUse;
    }

    /**
     * @param keyModesOfUse
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyBlockHeaders withKeyModesOfUse(KeyModesOfUse keyModesOfUse) {
        setKeyModesOfUse(keyModesOfUse);
        return this;
    }

    /**
     * <p>
     * Specifies subsequent exportability of the key within the key block after it is received by the receiving party.
     * It can be used to further restrict exportability of the key after export from Amazon Web Services Payment
     * Cryptography.
     * </p>
     * <p>
     * When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK using TR-31
     * or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be subsequently exported
     * by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the receiver under a KEK using
     * TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram key export method. For further
     * information refer to <a href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * </p>
     * 
     * @param keyExportability
     *        Specifies subsequent exportability of the key within the key block after it is received by the receiving
     *        party. It can be used to further restrict exportability of the key after export from Amazon Web Services
     *        Payment Cryptography.</p>
     *        <p>
     *        When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK
     *        using TR-31 or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be
     *        subsequently exported by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the
     *        receiver under a KEK using TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram
     *        key export method. For further information refer to <a
     *        href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * @see KeyExportability
     */

    public void setKeyExportability(String keyExportability) {
        this.keyExportability = keyExportability;
    }

    /**
     * <p>
     * Specifies subsequent exportability of the key within the key block after it is received by the receiving party.
     * It can be used to further restrict exportability of the key after export from Amazon Web Services Payment
     * Cryptography.
     * </p>
     * <p>
     * When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK using TR-31
     * or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be subsequently exported
     * by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the receiver under a KEK using
     * TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram key export method. For further
     * information refer to <a href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * </p>
     * 
     * @return Specifies subsequent exportability of the key within the key block after it is received by the receiving
     *         party. It can be used to further restrict exportability of the key after export from Amazon Web Services
     *         Payment Cryptography.</p>
     *         <p>
     *         When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK
     *         using TR-31 or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be
     *         subsequently exported by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the
     *         receiver under a KEK using TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram
     *         key export method. For further information refer to <a
     *         href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * @see KeyExportability
     */

    public String getKeyExportability() {
        return this.keyExportability;
    }

    /**
     * <p>
     * Specifies subsequent exportability of the key within the key block after it is received by the receiving party.
     * It can be used to further restrict exportability of the key after export from Amazon Web Services Payment
     * Cryptography.
     * </p>
     * <p>
     * When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK using TR-31
     * or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be subsequently exported
     * by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the receiver under a KEK using
     * TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram key export method. For further
     * information refer to <a href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * </p>
     * 
     * @param keyExportability
     *        Specifies subsequent exportability of the key within the key block after it is received by the receiving
     *        party. It can be used to further restrict exportability of the key after export from Amazon Web Services
     *        Payment Cryptography.</p>
     *        <p>
     *        When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK
     *        using TR-31 or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be
     *        subsequently exported by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the
     *        receiver under a KEK using TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram
     *        key export method. For further information refer to <a
     *        href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyExportability
     */

    public KeyBlockHeaders withKeyExportability(String keyExportability) {
        setKeyExportability(keyExportability);
        return this;
    }

    /**
     * <p>
     * Specifies subsequent exportability of the key within the key block after it is received by the receiving party.
     * It can be used to further restrict exportability of the key after export from Amazon Web Services Payment
     * Cryptography.
     * </p>
     * <p>
     * When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK using TR-31
     * or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be subsequently exported
     * by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the receiver under a KEK using
     * TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram key export method. For further
     * information refer to <a href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * </p>
     * 
     * @param keyExportability
     *        Specifies subsequent exportability of the key within the key block after it is received by the receiving
     *        party. It can be used to further restrict exportability of the key after export from Amazon Web Services
     *        Payment Cryptography.</p>
     *        <p>
     *        When set to <code>EXPORTABLE</code>, the key can be subsequently exported by the receiver under a KEK
     *        using TR-31 or TR-34 key block export only. When set to <code>NON_EXPORTABLE</code>, the key cannot be
     *        subsequently exported by the receiver. When set to <code>SENSITIVE</code>, the key can be exported by the
     *        receiver under a KEK using TR-31, TR-34, RSA wrap and unwrap cryptogram or using a symmetric cryptogram
     *        key export method. For further information refer to <a
     *        href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyExportability
     */

    public KeyBlockHeaders withKeyExportability(KeyExportability keyExportability) {
        this.keyExportability = keyExportability.toString();
        return this;
    }

    /**
     * <p>
     * Parameter used to indicate the version of the key carried in the key block or indicate the value carried in the
     * key block is a component of a key.
     * </p>
     * 
     * @param keyVersion
     *        Parameter used to indicate the version of the key carried in the key block or indicate the value carried
     *        in the key block is a component of a key.
     */

    public void setKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
    }

    /**
     * <p>
     * Parameter used to indicate the version of the key carried in the key block or indicate the value carried in the
     * key block is a component of a key.
     * </p>
     * 
     * @return Parameter used to indicate the version of the key carried in the key block or indicate the value carried
     *         in the key block is a component of a key.
     */

    public String getKeyVersion() {
        return this.keyVersion;
    }

    /**
     * <p>
     * Parameter used to indicate the version of the key carried in the key block or indicate the value carried in the
     * key block is a component of a key.
     * </p>
     * 
     * @param keyVersion
     *        Parameter used to indicate the version of the key carried in the key block or indicate the value carried
     *        in the key block is a component of a key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyBlockHeaders withKeyVersion(String keyVersion) {
        setKeyVersion(keyVersion);
        return this;
    }

    /**
     * <p>
     * Parameter used to indicate the type of optional data in key block headers. Refer to <a
     * href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a> for information on allowed
     * data type for optional blocks.
     * </p>
     * <p>
     * Optional block character limit is 112 characters. For each optional block, 2 characters are reserved for optional
     * block ID and 2 characters reserved for optional block length. More than one optional blocks can be included as
     * long as the combined length does not increase 112 characters.
     * </p>
     * 
     * @return Parameter used to indicate the type of optional data in key block headers. Refer to <a
     *         href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a> for information on
     *         allowed data type for optional blocks.</p>
     *         <p>
     *         Optional block character limit is 112 characters. For each optional block, 2 characters are reserved for
     *         optional block ID and 2 characters reserved for optional block length. More than one optional blocks can
     *         be included as long as the combined length does not increase 112 characters.
     */

    public java.util.Map<String, String> getOptionalBlocks() {
        return optionalBlocks;
    }

    /**
     * <p>
     * Parameter used to indicate the type of optional data in key block headers. Refer to <a
     * href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a> for information on allowed
     * data type for optional blocks.
     * </p>
     * <p>
     * Optional block character limit is 112 characters. For each optional block, 2 characters are reserved for optional
     * block ID and 2 characters reserved for optional block length. More than one optional blocks can be included as
     * long as the combined length does not increase 112 characters.
     * </p>
     * 
     * @param optionalBlocks
     *        Parameter used to indicate the type of optional data in key block headers. Refer to <a
     *        href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a> for information on
     *        allowed data type for optional blocks.</p>
     *        <p>
     *        Optional block character limit is 112 characters. For each optional block, 2 characters are reserved for
     *        optional block ID and 2 characters reserved for optional block length. More than one optional blocks can
     *        be included as long as the combined length does not increase 112 characters.
     */

    public void setOptionalBlocks(java.util.Map<String, String> optionalBlocks) {
        this.optionalBlocks = optionalBlocks;
    }

    /**
     * <p>
     * Parameter used to indicate the type of optional data in key block headers. Refer to <a
     * href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a> for information on allowed
     * data type for optional blocks.
     * </p>
     * <p>
     * Optional block character limit is 112 characters. For each optional block, 2 characters are reserved for optional
     * block ID and 2 characters reserved for optional block length. More than one optional blocks can be included as
     * long as the combined length does not increase 112 characters.
     * </p>
     * 
     * @param optionalBlocks
     *        Parameter used to indicate the type of optional data in key block headers. Refer to <a
     *        href="https://webstore.ansi.org/standards/ascx9/ansix91432022">ANSI X9.143-2022</a> for information on
     *        allowed data type for optional blocks.</p>
     *        <p>
     *        Optional block character limit is 112 characters. For each optional block, 2 characters are reserved for
     *        optional block ID and 2 characters reserved for optional block length. More than one optional blocks can
     *        be included as long as the combined length does not increase 112 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyBlockHeaders withOptionalBlocks(java.util.Map<String, String> optionalBlocks) {
        setOptionalBlocks(optionalBlocks);
        return this;
    }

    /**
     * Add a single OptionalBlocks entry
     *
     * @see KeyBlockHeaders#withOptionalBlocks
     * @returns a reference to this object so that method calls can be chained together.
     */

    public KeyBlockHeaders addOptionalBlocksEntry(String key, String value) {
        if (null == this.optionalBlocks) {
            this.optionalBlocks = new java.util.HashMap<String, String>();
        }
        if (this.optionalBlocks.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.optionalBlocks.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into OptionalBlocks.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyBlockHeaders clearOptionalBlocksEntries() {
        this.optionalBlocks = null;
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
        if (getKeyModesOfUse() != null)
            sb.append("KeyModesOfUse: ").append(getKeyModesOfUse()).append(",");
        if (getKeyExportability() != null)
            sb.append("KeyExportability: ").append(getKeyExportability()).append(",");
        if (getKeyVersion() != null)
            sb.append("KeyVersion: ").append(getKeyVersion()).append(",");
        if (getOptionalBlocks() != null)
            sb.append("OptionalBlocks: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyBlockHeaders == false)
            return false;
        KeyBlockHeaders other = (KeyBlockHeaders) obj;
        if (other.getKeyModesOfUse() == null ^ this.getKeyModesOfUse() == null)
            return false;
        if (other.getKeyModesOfUse() != null && other.getKeyModesOfUse().equals(this.getKeyModesOfUse()) == false)
            return false;
        if (other.getKeyExportability() == null ^ this.getKeyExportability() == null)
            return false;
        if (other.getKeyExportability() != null && other.getKeyExportability().equals(this.getKeyExportability()) == false)
            return false;
        if (other.getKeyVersion() == null ^ this.getKeyVersion() == null)
            return false;
        if (other.getKeyVersion() != null && other.getKeyVersion().equals(this.getKeyVersion()) == false)
            return false;
        if (other.getOptionalBlocks() == null ^ this.getOptionalBlocks() == null)
            return false;
        if (other.getOptionalBlocks() != null && other.getOptionalBlocks().equals(this.getOptionalBlocks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyModesOfUse() == null) ? 0 : getKeyModesOfUse().hashCode());
        hashCode = prime * hashCode + ((getKeyExportability() == null) ? 0 : getKeyExportability().hashCode());
        hashCode = prime * hashCode + ((getKeyVersion() == null) ? 0 : getKeyVersion().hashCode());
        hashCode = prime * hashCode + ((getOptionalBlocks() == null) ? 0 : getOptionalBlocks().hashCode());
        return hashCode;
    }

    @Override
    public KeyBlockHeaders clone() {
        try {
            return (KeyBlockHeaders) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.KeyBlockHeadersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
