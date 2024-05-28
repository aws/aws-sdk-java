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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/GetParametersForExport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetParametersForExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is only
     * required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31 key export.
     * </p>
     */
    private String keyMaterialType;
    /**
     * <p>
     * The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key under
     * export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * </p>
     */
    private String signingKeyAlgorithm;

    /**
     * <p>
     * The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is only
     * required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31 key export.
     * </p>
     * 
     * @param keyMaterialType
     *        The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is
     *        only required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31
     *        key export.
     * @see KeyMaterialType
     */

    public void setKeyMaterialType(String keyMaterialType) {
        this.keyMaterialType = keyMaterialType;
    }

    /**
     * <p>
     * The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is only
     * required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31 key export.
     * </p>
     * 
     * @return The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token
     *         is only required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for
     *         TR-31 key export.
     * @see KeyMaterialType
     */

    public String getKeyMaterialType() {
        return this.keyMaterialType;
    }

    /**
     * <p>
     * The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is only
     * required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31 key export.
     * </p>
     * 
     * @param keyMaterialType
     *        The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is
     *        only required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31
     *        key export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyMaterialType
     */

    public GetParametersForExportRequest withKeyMaterialType(String keyMaterialType) {
        setKeyMaterialType(keyMaterialType);
        return this;
    }

    /**
     * <p>
     * The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is only
     * required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31 key export.
     * </p>
     * 
     * @param keyMaterialType
     *        The key block format type (for example, TR-34 or TR-31) to use during key material export. Export token is
     *        only required for a TR-34 key export, <code>TR34_KEY_BLOCK</code>. Export token is not required for TR-31
     *        key export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyMaterialType
     */

    public GetParametersForExportRequest withKeyMaterialType(KeyMaterialType keyMaterialType) {
        this.keyMaterialType = keyMaterialType.toString();
        return this;
    }

    /**
     * <p>
     * The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key under
     * export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * </p>
     * 
     * @param signingKeyAlgorithm
     *        The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key
     *        under export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * @see KeyAlgorithm
     */

    public void setSigningKeyAlgorithm(String signingKeyAlgorithm) {
        this.signingKeyAlgorithm = signingKeyAlgorithm;
    }

    /**
     * <p>
     * The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key under
     * export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * </p>
     * 
     * @return The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key
     *         under export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * @see KeyAlgorithm
     */

    public String getSigningKeyAlgorithm() {
        return this.signingKeyAlgorithm;
    }

    /**
     * <p>
     * The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key under
     * export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * </p>
     * 
     * @param signingKeyAlgorithm
     *        The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key
     *        under export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForExportRequest withSigningKeyAlgorithm(String signingKeyAlgorithm) {
        setSigningKeyAlgorithm(signingKeyAlgorithm);
        return this;
    }

    /**
     * <p>
     * The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key under
     * export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * </p>
     * 
     * @param signingKeyAlgorithm
     *        The signing key algorithm to generate a signing key certificate. This certificate signs the wrapped key
     *        under export within the TR-34 key block. <code>RSA_2048</code> is the only signing key algorithm allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyAlgorithm
     */

    public GetParametersForExportRequest withSigningKeyAlgorithm(KeyAlgorithm signingKeyAlgorithm) {
        this.signingKeyAlgorithm = signingKeyAlgorithm.toString();
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
        if (getSigningKeyAlgorithm() != null)
            sb.append("SigningKeyAlgorithm: ").append(getSigningKeyAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetParametersForExportRequest == false)
            return false;
        GetParametersForExportRequest other = (GetParametersForExportRequest) obj;
        if (other.getKeyMaterialType() == null ^ this.getKeyMaterialType() == null)
            return false;
        if (other.getKeyMaterialType() != null && other.getKeyMaterialType().equals(this.getKeyMaterialType()) == false)
            return false;
        if (other.getSigningKeyAlgorithm() == null ^ this.getSigningKeyAlgorithm() == null)
            return false;
        if (other.getSigningKeyAlgorithm() != null && other.getSigningKeyAlgorithm().equals(this.getSigningKeyAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyMaterialType() == null) ? 0 : getKeyMaterialType().hashCode());
        hashCode = prime * hashCode + ((getSigningKeyAlgorithm() == null) ? 0 : getSigningKeyAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public GetParametersForExportRequest clone() {
        return (GetParametersForExportRequest) super.clone();
    }

}
