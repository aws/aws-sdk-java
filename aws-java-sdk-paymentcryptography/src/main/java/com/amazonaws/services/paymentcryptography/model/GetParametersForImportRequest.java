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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForImport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersForImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     * <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).
     * </p>
     * <p>
     * Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * </p>
     */
    private String keyMaterialType;
    /**
     * <p>
     * The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under import.
     * </p>
     * <p>
     * At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import. Additionally,
     * <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed algorithms for RSA
     * WrappedKeyCryptogram import.
     * </p>
     */
    private String wrappingKeyAlgorithm;

    /**
     * <p>
     * The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     * <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).
     * </p>
     * <p>
     * Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * </p>
     * 
     * @param keyMaterialType
     *        The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     *        <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).</p>
     *        <p>
     *        Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * @see KeyMaterialType
     */

    public void setKeyMaterialType(String keyMaterialType) {
        this.keyMaterialType = keyMaterialType;
    }

    /**
     * <p>
     * The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     * <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).
     * </p>
     * <p>
     * Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * </p>
     * 
     * @return The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     *         <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).</p>
     *         <p>
     *         Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * @see KeyMaterialType
     */

    public String getKeyMaterialType() {
        return this.keyMaterialType;
    }

    /**
     * <p>
     * The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     * <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).
     * </p>
     * <p>
     * Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * </p>
     * 
     * @param keyMaterialType
     *        The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     *        <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).</p>
     *        <p>
     *        Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyMaterialType
     */

    public GetParametersForImportRequest withKeyMaterialType(String keyMaterialType) {
        setKeyMaterialType(keyMaterialType);
        return this;
    }

    /**
     * <p>
     * The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     * <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).
     * </p>
     * <p>
     * Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * </p>
     * 
     * @param keyMaterialType
     *        The method to use for key material import. Import token is only required for TR-34 WrappedKeyBlock (
     *        <code>TR34_KEY_BLOCK</code>) and RSA WrappedKeyCryptogram (<code>KEY_CRYPTOGRAM</code>).</p>
     *        <p>
     *        Import token is not required for TR-31, root public key cerificate or trusted public key certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyMaterialType
     */

    public GetParametersForImportRequest withKeyMaterialType(KeyMaterialType keyMaterialType) {
        this.keyMaterialType = keyMaterialType.toString();
        return this;
    }

    /**
     * <p>
     * The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under import.
     * </p>
     * <p>
     * At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import. Additionally,
     * <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed algorithms for RSA
     * WrappedKeyCryptogram import.
     * </p>
     * 
     * @param wrappingKeyAlgorithm
     *        The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under
     *        import.</p>
     *        <p>
     *        At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import.
     *        Additionally, <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed
     *        algorithms for RSA WrappedKeyCryptogram import.
     * @see KeyAlgorithm
     */

    public void setWrappingKeyAlgorithm(String wrappingKeyAlgorithm) {
        this.wrappingKeyAlgorithm = wrappingKeyAlgorithm;
    }

    /**
     * <p>
     * The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under import.
     * </p>
     * <p>
     * At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import. Additionally,
     * <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed algorithms for RSA
     * WrappedKeyCryptogram import.
     * </p>
     * 
     * @return The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under
     *         import.</p>
     *         <p>
     *         At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import.
     *         Additionally, <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed
     *         algorithms for RSA WrappedKeyCryptogram import.
     * @see KeyAlgorithm
     */

    public String getWrappingKeyAlgorithm() {
        return this.wrappingKeyAlgorithm;
    }

    /**
     * <p>
     * The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under import.
     * </p>
     * <p>
     * At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import. Additionally,
     * <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed algorithms for RSA
     * WrappedKeyCryptogram import.
     * </p>
     * 
     * @param wrappingKeyAlgorithm
     *        The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under
     *        import.</p>
     *        <p>
     *        At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import.
     *        Additionally, <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed
     *        algorithms for RSA WrappedKeyCryptogram import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForImportRequest withWrappingKeyAlgorithm(String wrappingKeyAlgorithm) {
        setWrappingKeyAlgorithm(wrappingKeyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under import.
     * </p>
     * <p>
     * At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import. Additionally,
     * <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed algorithms for RSA
     * WrappedKeyCryptogram import.
     * </p>
     * 
     * @param wrappingKeyAlgorithm
     *        The wrapping key algorithm to generate a wrapping key certificate. This certificate wraps the key under
     *        import.</p>
     *        <p>
     *        At this time, <code>RSA_2048</code> is the allowed algorithm for TR-34 WrappedKeyBlock import.
     *        Additionally, <code>RSA_2048</code>, <code>RSA_3072</code>, <code>RSA_4096</code> are the allowed
     *        algorithms for RSA WrappedKeyCryptogram import.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForImportRequest withWrappingKeyAlgorithm(KeyAlgorithm wrappingKeyAlgorithm) {
        this.wrappingKeyAlgorithm = wrappingKeyAlgorithm.toString();
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
        if (getKeyMaterialType() != null)
            sb.append("KeyMaterialType: ").append(getKeyMaterialType()).append(",");
        if (getWrappingKeyAlgorithm() != null)
            sb.append("WrappingKeyAlgorithm: ").append(getWrappingKeyAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForImportRequest == false)
            return false;
        GetParametersForImportRequest other = (GetParametersForImportRequest) obj;
        if (other.getKeyMaterialType() == null ^ this.getKeyMaterialType() == null)
            return false;
        if (other.getKeyMaterialType() != null && other.getKeyMaterialType().equals(this.getKeyMaterialType()) == false)
            return false;
        if (other.getWrappingKeyAlgorithm() == null ^ this.getWrappingKeyAlgorithm() == null)
            return false;
        if (other.getWrappingKeyAlgorithm() != null && other.getWrappingKeyAlgorithm().equals(this.getWrappingKeyAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyMaterialType() == null) ? 0 : getKeyMaterialType().hashCode());
        hashCode = prime * hashCode + ((getWrappingKeyAlgorithm() == null) ? 0 : getWrappingKeyAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersForImportRequest clone() {
        return (GetParametersForImportRequest) super.clone();
    }

}
