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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The key material under export as a TR-34 WrappedKeyBlock or a TR-31 WrappedKeyBlock. or a RSA
     * WrappedKeyCryptogram.
     * </p>
     */
    private WrappedKey wrappedKey;

    /**
     * <p>
     * The key material under export as a TR-34 WrappedKeyBlock or a TR-31 WrappedKeyBlock. or a RSA
     * WrappedKeyCryptogram.
     * </p>
     * 
     * @param wrappedKey
     *        The key material under export as a TR-34 WrappedKeyBlock or a TR-31 WrappedKeyBlock. or a RSA
     *        WrappedKeyCryptogram.
     */

    public void setWrappedKey(WrappedKey wrappedKey) {
        this.wrappedKey = wrappedKey;
    }

    /**
     * <p>
     * The key material under export as a TR-34 WrappedKeyBlock or a TR-31 WrappedKeyBlock. or a RSA
     * WrappedKeyCryptogram.
     * </p>
     * 
     * @return The key material under export as a TR-34 WrappedKeyBlock or a TR-31 WrappedKeyBlock. or a RSA
     *         WrappedKeyCryptogram.
     */

    public WrappedKey getWrappedKey() {
        return this.wrappedKey;
    }

    /**
     * <p>
     * The key material under export as a TR-34 WrappedKeyBlock or a TR-31 WrappedKeyBlock. or a RSA
     * WrappedKeyCryptogram.
     * </p>
     * 
     * @param wrappedKey
     *        The key material under export as a TR-34 WrappedKeyBlock or a TR-31 WrappedKeyBlock. or a RSA
     *        WrappedKeyCryptogram.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportKeyResult withWrappedKey(WrappedKey wrappedKey) {
        setWrappedKey(wrappedKey);
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
        if (getWrappedKey() != null)
            sb.append("WrappedKey: ").append(getWrappedKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportKeyResult == false)
            return false;
        ExportKeyResult other = (ExportKeyResult) obj;
        if (other.getWrappedKey() == null ^ this.getWrappedKey() == null)
            return false;
        if (other.getWrappedKey() != null && other.getWrappedKey().equals(this.getWrappedKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWrappedKey() == null) ? 0 : getWrappedKey().hashCode());
        return hashCode;
    }

    @Override
    public ExportKeyResult clone() {
        try {
            return (ExportKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
