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
 * Parameter information for key material import using symmetric TR-31 key exchange method.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ImportTr31KeyBlock"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportTr31KeyBlock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <code>KeyARN</code> of the key that will decrypt or unwrap a TR-31 key block during import.
     * </p>
     */
    private String wrappingKeyIdentifier;
    /**
     * <p>
     * The TR-31 wrapped key block to import.
     * </p>
     */
    private String wrappedKeyBlock;

    /**
     * <p>
     * The <code>KeyARN</code> of the key that will decrypt or unwrap a TR-31 key block during import.
     * </p>
     * 
     * @param wrappingKeyIdentifier
     *        The <code>KeyARN</code> of the key that will decrypt or unwrap a TR-31 key block during import.
     */

    public void setWrappingKeyIdentifier(String wrappingKeyIdentifier) {
        this.wrappingKeyIdentifier = wrappingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key that will decrypt or unwrap a TR-31 key block during import.
     * </p>
     * 
     * @return The <code>KeyARN</code> of the key that will decrypt or unwrap a TR-31 key block during import.
     */

    public String getWrappingKeyIdentifier() {
        return this.wrappingKeyIdentifier;
    }

    /**
     * <p>
     * The <code>KeyARN</code> of the key that will decrypt or unwrap a TR-31 key block during import.
     * </p>
     * 
     * @param wrappingKeyIdentifier
     *        The <code>KeyARN</code> of the key that will decrypt or unwrap a TR-31 key block during import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTr31KeyBlock withWrappingKeyIdentifier(String wrappingKeyIdentifier) {
        setWrappingKeyIdentifier(wrappingKeyIdentifier);
        return this;
    }

    /**
     * <p>
     * The TR-31 wrapped key block to import.
     * </p>
     * 
     * @param wrappedKeyBlock
     *        The TR-31 wrapped key block to import.
     */

    public void setWrappedKeyBlock(String wrappedKeyBlock) {
        this.wrappedKeyBlock = wrappedKeyBlock;
    }

    /**
     * <p>
     * The TR-31 wrapped key block to import.
     * </p>
     * 
     * @return The TR-31 wrapped key block to import.
     */

    public String getWrappedKeyBlock() {
        return this.wrappedKeyBlock;
    }

    /**
     * <p>
     * The TR-31 wrapped key block to import.
     * </p>
     * 
     * @param wrappedKeyBlock
     *        The TR-31 wrapped key block to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportTr31KeyBlock withWrappedKeyBlock(String wrappedKeyBlock) {
        setWrappedKeyBlock(wrappedKeyBlock);
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
        if (getWrappedKeyBlock() != null)
            sb.append("WrappedKeyBlock: ").append(getWrappedKeyBlock());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTr31KeyBlock == false)
            return false;
        ImportTr31KeyBlock other = (ImportTr31KeyBlock) obj;
        if (other.getWrappingKeyIdentifier() == null ^ this.getWrappingKeyIdentifier() == null)
            return false;
        if (other.getWrappingKeyIdentifier() != null && other.getWrappingKeyIdentifier().equals(this.getWrappingKeyIdentifier()) == false)
            return false;
        if (other.getWrappedKeyBlock() == null ^ this.getWrappedKeyBlock() == null)
            return false;
        if (other.getWrappedKeyBlock() != null && other.getWrappedKeyBlock().equals(this.getWrappedKeyBlock()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWrappingKeyIdentifier() == null) ? 0 : getWrappingKeyIdentifier().hashCode());
        hashCode = prime * hashCode + ((getWrappedKeyBlock() == null) ? 0 : getWrappedKeyBlock().hashCode());
        return hashCode;
    }

    @Override
    public ImportTr31KeyBlock clone() {
        try {
            return (ImportTr31KeyBlock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ImportTr31KeyBlockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
