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
 * Parameter information for key material import using asymmetric RSA wrap and unwrap key exchange method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ImportKeyCryptogram"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportKeyCryptogram implements Serializable, Cloneable, StructuredPojo {

    private KeyAttributes keyAttributes;
    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     */
    private Boolean exportable;
    /**
     * <p>
     * The RSA wrapped key cryptogram under import.
     * </p>
     */
    private String wrappedKeyCryptogram;
    /**
     * <p>
     * The import token that initiates key import using the asymmetric RSA wrap and unwrap key exchange method into AWS
     * Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys to the
     * same service account.
     * </p>
     */
    private String importToken;
    /**
     * <p>
     * The wrapping spec for the wrapped key cryptogram.
     * </p>
     */
    private String wrappingSpec;

    /**
     * @param keyAttributes
     */

    public void setKeyAttributes(KeyAttributes keyAttributes) {
        this.keyAttributes = keyAttributes;
    }

    /**
     * @return
     */

    public KeyAttributes getKeyAttributes() {
        return this.keyAttributes;
    }

    /**
     * @param keyAttributes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyCryptogram withKeyAttributes(KeyAttributes keyAttributes) {
        setKeyAttributes(keyAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @param exportable
     *        Specifies whether the key is exportable from the service.
     */

    public void setExportable(Boolean exportable) {
        this.exportable = exportable;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @return Specifies whether the key is exportable from the service.
     */

    public Boolean getExportable() {
        return this.exportable;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @param exportable
     *        Specifies whether the key is exportable from the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyCryptogram withExportable(Boolean exportable) {
        setExportable(exportable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the key is exportable from the service.
     * </p>
     * 
     * @return Specifies whether the key is exportable from the service.
     */

    public Boolean isExportable() {
        return this.exportable;
    }

    /**
     * <p>
     * The RSA wrapped key cryptogram under import.
     * </p>
     * 
     * @param wrappedKeyCryptogram
     *        The RSA wrapped key cryptogram under import.
     */

    public void setWrappedKeyCryptogram(String wrappedKeyCryptogram) {
        this.wrappedKeyCryptogram = wrappedKeyCryptogram;
    }

    /**
     * <p>
     * The RSA wrapped key cryptogram under import.
     * </p>
     * 
     * @return The RSA wrapped key cryptogram under import.
     */

    public String getWrappedKeyCryptogram() {
        return this.wrappedKeyCryptogram;
    }

    /**
     * <p>
     * The RSA wrapped key cryptogram under import.
     * </p>
     * 
     * @param wrappedKeyCryptogram
     *        The RSA wrapped key cryptogram under import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyCryptogram withWrappedKeyCryptogram(String wrappedKeyCryptogram) {
        setWrappedKeyCryptogram(wrappedKeyCryptogram);
        return this;
    }

    /**
     * <p>
     * The import token that initiates key import using the asymmetric RSA wrap and unwrap key exchange method into AWS
     * Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys to the
     * same service account.
     * </p>
     * 
     * @param importToken
     *        The import token that initiates key import using the asymmetric RSA wrap and unwrap key exchange method
     *        into AWS Payment Cryptography. It expires after 7 days. You can use the same import token to import
     *        multiple keys to the same service account.
     */

    public void setImportToken(String importToken) {
        this.importToken = importToken;
    }

    /**
     * <p>
     * The import token that initiates key import using the asymmetric RSA wrap and unwrap key exchange method into AWS
     * Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys to the
     * same service account.
     * </p>
     * 
     * @return The import token that initiates key import using the asymmetric RSA wrap and unwrap key exchange method
     *         into AWS Payment Cryptography. It expires after 7 days. You can use the same import token to import
     *         multiple keys to the same service account.
     */

    public String getImportToken() {
        return this.importToken;
    }

    /**
     * <p>
     * The import token that initiates key import using the asymmetric RSA wrap and unwrap key exchange method into AWS
     * Payment Cryptography. It expires after 7 days. You can use the same import token to import multiple keys to the
     * same service account.
     * </p>
     * 
     * @param importToken
     *        The import token that initiates key import using the asymmetric RSA wrap and unwrap key exchange method
     *        into AWS Payment Cryptography. It expires after 7 days. You can use the same import token to import
     *        multiple keys to the same service account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportKeyCryptogram withImportToken(String importToken) {
        setImportToken(importToken);
        return this;
    }

    /**
     * <p>
     * The wrapping spec for the wrapped key cryptogram.
     * </p>
     * 
     * @param wrappingSpec
     *        The wrapping spec for the wrapped key cryptogram.
     * @see WrappingKeySpec
     */

    public void setWrappingSpec(String wrappingSpec) {
        this.wrappingSpec = wrappingSpec;
    }

    /**
     * <p>
     * The wrapping spec for the wrapped key cryptogram.
     * </p>
     * 
     * @return The wrapping spec for the wrapped key cryptogram.
     * @see WrappingKeySpec
     */

    public String getWrappingSpec() {
        return this.wrappingSpec;
    }

    /**
     * <p>
     * The wrapping spec for the wrapped key cryptogram.
     * </p>
     * 
     * @param wrappingSpec
     *        The wrapping spec for the wrapped key cryptogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public ImportKeyCryptogram withWrappingSpec(String wrappingSpec) {
        setWrappingSpec(wrappingSpec);
        return this;
    }

    /**
     * <p>
     * The wrapping spec for the wrapped key cryptogram.
     * </p>
     * 
     * @param wrappingSpec
     *        The wrapping spec for the wrapped key cryptogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WrappingKeySpec
     */

    public ImportKeyCryptogram withWrappingSpec(WrappingKeySpec wrappingSpec) {
        this.wrappingSpec = wrappingSpec.toString();
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
        if (getKeyAttributes() != null)
            sb.append("KeyAttributes: ").append(getKeyAttributes()).append(",");
        if (getExportable() != null)
            sb.append("Exportable: ").append(getExportable()).append(",");
        if (getWrappedKeyCryptogram() != null)
            sb.append("WrappedKeyCryptogram: ").append(getWrappedKeyCryptogram()).append(",");
        if (getImportToken() != null)
            sb.append("ImportToken: ").append(getImportToken()).append(",");
        if (getWrappingSpec() != null)
            sb.append("WrappingSpec: ").append(getWrappingSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportKeyCryptogram == false)
            return false;
        ImportKeyCryptogram other = (ImportKeyCryptogram) obj;
        if (other.getKeyAttributes() == null ^ this.getKeyAttributes() == null)
            return false;
        if (other.getKeyAttributes() != null && other.getKeyAttributes().equals(this.getKeyAttributes()) == false)
            return false;
        if (other.getExportable() == null ^ this.getExportable() == null)
            return false;
        if (other.getExportable() != null && other.getExportable().equals(this.getExportable()) == false)
            return false;
        if (other.getWrappedKeyCryptogram() == null ^ this.getWrappedKeyCryptogram() == null)
            return false;
        if (other.getWrappedKeyCryptogram() != null && other.getWrappedKeyCryptogram().equals(this.getWrappedKeyCryptogram()) == false)
            return false;
        if (other.getImportToken() == null ^ this.getImportToken() == null)
            return false;
        if (other.getImportToken() != null && other.getImportToken().equals(this.getImportToken()) == false)
            return false;
        if (other.getWrappingSpec() == null ^ this.getWrappingSpec() == null)
            return false;
        if (other.getWrappingSpec() != null && other.getWrappingSpec().equals(this.getWrappingSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyAttributes() == null) ? 0 : getKeyAttributes().hashCode());
        hashCode = prime * hashCode + ((getExportable() == null) ? 0 : getExportable().hashCode());
        hashCode = prime * hashCode + ((getWrappedKeyCryptogram() == null) ? 0 : getWrappedKeyCryptogram().hashCode());
        hashCode = prime * hashCode + ((getImportToken() == null) ? 0 : getImportToken().hashCode());
        hashCode = prime * hashCode + ((getWrappingSpec() == null) ? 0 : getWrappingSpec().hashCode());
        return hashCode;
    }

    @Override
    public ImportKeyCryptogram clone() {
        try {
            return (ImportKeyCryptogram) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ImportKeyCryptogramMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
