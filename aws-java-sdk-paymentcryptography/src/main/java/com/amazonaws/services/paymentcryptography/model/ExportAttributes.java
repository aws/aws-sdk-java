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
 * The attributes for IPEK generation during export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameter information for IPEK export.
     * </p>
     */
    private ExportDukptInitialKey exportDukptInitialKey;
    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity. Specify KCV for IPEK export only.
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
     * Parameter information for IPEK export.
     * </p>
     * 
     * @param exportDukptInitialKey
     *        Parameter information for IPEK export.
     */

    public void setExportDukptInitialKey(ExportDukptInitialKey exportDukptInitialKey) {
        this.exportDukptInitialKey = exportDukptInitialKey;
    }

    /**
     * <p>
     * Parameter information for IPEK export.
     * </p>
     * 
     * @return Parameter information for IPEK export.
     */

    public ExportDukptInitialKey getExportDukptInitialKey() {
        return this.exportDukptInitialKey;
    }

    /**
     * <p>
     * Parameter information for IPEK export.
     * </p>
     * 
     * @param exportDukptInitialKey
     *        Parameter information for IPEK export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportAttributes withExportDukptInitialKey(ExportDukptInitialKey exportDukptInitialKey) {
        setExportDukptInitialKey(exportDukptInitialKey);
        return this;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity. Specify KCV for IPEK export only.
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
     *        It is used to validate the key integrity. Specify KCV for IPEK export only.</p>
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
     * used to validate the key integrity. Specify KCV for IPEK export only.
     * </p>
     * <p>
     * For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be checked and
     * retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed using a CMAC
     * algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of the encrypted
     * result.
     * </p>
     * 
     * @return The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV).
     *         It is used to validate the key integrity. Specify KCV for IPEK export only.</p>
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
     * used to validate the key integrity. Specify KCV for IPEK export only.
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
     *        It is used to validate the key integrity. Specify KCV for IPEK export only.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public ExportAttributes withKeyCheckValueAlgorithm(String keyCheckValueAlgorithm) {
        setKeyCheckValueAlgorithm(keyCheckValueAlgorithm);
        return this;
    }

    /**
     * <p>
     * The algorithm that Amazon Web Services Payment Cryptography uses to calculate the key check value (KCV). It is
     * used to validate the key integrity. Specify KCV for IPEK export only.
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
     *        It is used to validate the key integrity. Specify KCV for IPEK export only.</p>
     *        <p>
     *        For TDES keys, the KCV is computed by encrypting 8 bytes, each with value of zero, with the key to be
     *        checked and retaining the 3 highest order bytes of the encrypted result. For AES keys, the KCV is computed
     *        using a CMAC algorithm where the input data is 16 bytes of zero and retaining the 3 highest order bytes of
     *        the encrypted result.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyCheckValueAlgorithm
     */

    public ExportAttributes withKeyCheckValueAlgorithm(KeyCheckValueAlgorithm keyCheckValueAlgorithm) {
        this.keyCheckValueAlgorithm = keyCheckValueAlgorithm.toString();
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
        if (getExportDukptInitialKey() != null)
            sb.append("ExportDukptInitialKey: ").append(getExportDukptInitialKey()).append(",");
        if (getKeyCheckValueAlgorithm() != null)
            sb.append("KeyCheckValueAlgorithm: ").append(getKeyCheckValueAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportAttributes == false)
            return false;
        ExportAttributes other = (ExportAttributes) obj;
        if (other.getExportDukptInitialKey() == null ^ this.getExportDukptInitialKey() == null)
            return false;
        if (other.getExportDukptInitialKey() != null && other.getExportDukptInitialKey().equals(this.getExportDukptInitialKey()) == false)
            return false;
        if (other.getKeyCheckValueAlgorithm() == null ^ this.getKeyCheckValueAlgorithm() == null)
            return false;
        if (other.getKeyCheckValueAlgorithm() != null && other.getKeyCheckValueAlgorithm().equals(this.getKeyCheckValueAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportDukptInitialKey() == null) ? 0 : getExportDukptInitialKey().hashCode());
        hashCode = prime * hashCode + ((getKeyCheckValueAlgorithm() == null) ? 0 : getKeyCheckValueAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public ExportAttributes clone() {
        try {
            return (ExportAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ExportAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
