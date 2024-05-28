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
 * Parameter information for key material export using symmetric TR-31 key exchange method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportTr31KeyBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportTr31KeyBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>KeyARN</code> of the the wrapping key. This key encrypts or wraps the key under export for TR-31 key
     * block generation.
     * </p>
     */
    private String wrappingKeyIdentifier;
    /**
     * <p>
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     */
    private KeyBlockHeaders keyBlockHeaders;

    /**
     * <p>
     * The <code>KeyARN</code> of the the wrapping key. This key encrypts or wraps the key under export for TR-31 key
     * block generation.
     * </p>
     * 
     * @param wrappingKeyIdentifier
     *        The <code>KeyARN</code> of the the wrapping key. This key encrypts or wraps the key under export for TR-31
     *        key block generation.
     */

    public void setWrappingKeyIdentifier(String wrappingKeyIdentifier) {
        this.wrappingKeyIdentifier = wrappingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the the wrapping key. This key encrypts or wraps the key under export for TR-31 key
     * block generation.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the the wrapping key. This key encrypts or wraps the key under export for
     *         TR-31 key block generation.
     */

    public String getWrappingKeyIdentifier() {
        return this.wrappingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the the wrapping key. This key encrypts or wraps the key under export for TR-31 key
     * block generation.
     * </p>
     * 
     * @param wrappingKeyIdentifier
     *        The <code>KeyARN</code> of the the wrapping key. This key encrypts or wraps the key under export for TR-31
     *        key block generation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTr31KeyBlock withWrappingKeyIdentifier(String wrappingKeyIdentifier) {
        setWrappingKeyIdentifier(wrappingKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     * 
     * @param keyBlockHeaders
     *        Optional metadata for export associated with the key material. This data is signed but transmitted in
     *        clear text.
     */

    public void setKeyBlockHeaders(KeyBlockHeaders keyBlockHeaders) {
        this.keyBlockHeaders = keyBlockHeaders;
    }

    /**
     * <p>
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     * 
     * @return Optional metadata for export associated with the key material. This data is signed but transmitted in
     *         clear text.
     */

    public KeyBlockHeaders getKeyBlockHeaders() {
        return this.keyBlockHeaders;
    }

    /**
     * <p>
     * Optional metadata for export associated with the key material. This data is signed but transmitted in clear text.
     * </p>
     * 
     * @param keyBlockHeaders
     *        Optional metadata for export associated with the key material. This data is signed but transmitted in
     *        clear text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportTr31KeyBlock withKeyBlockHeaders(KeyBlockHeaders keyBlockHeaders) {
        setKeyBlockHeaders(keyBlockHeaders);
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
        if (getWrappingKeyIdentifier() != null)
            sb.append("WrappingKeyIdentifier: ").append(getWrappingKeyIdentifier()).append(",");
        if (getKeyBlockHeaders() != null)
            sb.append("KeyBlockHeaders: ").append(getKeyBlockHeaders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportTr31KeyBlock == false)
            return false;
        ExportTr31KeyBlock other = (ExportTr31KeyBlock) obj;
        if (other.getWrappingKeyIdentifier() == null ^ this.getWrappingKeyIdentifier() == null)
            return false;
        if (other.getWrappingKeyIdentifier() != null && other.getWrappingKeyIdentifier().equals(this.getWrappingKeyIdentifier()) == false)
            return false;
        if (other.getKeyBlockHeaders() == null ^ this.getKeyBlockHeaders() == null)
            return false;
        if (other.getKeyBlockHeaders() != null && other.getKeyBlockHeaders().equals(this.getKeyBlockHeaders()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWrappingKeyIdentifier() == null) ? 0 : getWrappingKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getKeyBlockHeaders() == null) ? 0 : getKeyBlockHeaders().hashCode());
        return hashCode;
    }

    @Override
    public ExportTr31KeyBlock clone() {
        try {
            return (ExportTr31KeyBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ExportTr31KeyBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
