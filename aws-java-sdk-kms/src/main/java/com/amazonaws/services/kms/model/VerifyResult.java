/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/Verify" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the asymmetric CMK that was used to verify the signature.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates that
     * the <code>Signature</code> was produced by signing the <code>Message</code> with the specified <code>KeyID</code>
     * and <code>SigningAlgorithm.</code> If the signature is not verified, the <code>Verify</code> operation fails with
     * a <code>KMSInvalidSignatureException</code> exception.
     * </p>
     */
    private Boolean signatureValid;
    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     */
    private String signingAlgorithm;

    /**
     * <p>
     * The unique identifier for the asymmetric CMK that was used to verify the signature.
     * </p>
     * 
     * @param keyId
     *        The unique identifier for the asymmetric CMK that was used to verify the signature.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier for the asymmetric CMK that was used to verify the signature.
     * </p>
     * 
     * @return The unique identifier for the asymmetric CMK that was used to verify the signature.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The unique identifier for the asymmetric CMK that was used to verify the signature.
     * </p>
     * 
     * @param keyId
     *        The unique identifier for the asymmetric CMK that was used to verify the signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates that
     * the <code>Signature</code> was produced by signing the <code>Message</code> with the specified <code>KeyID</code>
     * and <code>SigningAlgorithm.</code> If the signature is not verified, the <code>Verify</code> operation fails with
     * a <code>KMSInvalidSignatureException</code> exception.
     * </p>
     * 
     * @param signatureValid
     *        A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates
     *        that the <code>Signature</code> was produced by signing the <code>Message</code> with the specified
     *        <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is not verified, the
     *        <code>Verify</code> operation fails with a <code>KMSInvalidSignatureException</code> exception.
     */

    public void setSignatureValid(Boolean signatureValid) {
        this.signatureValid = signatureValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates that
     * the <code>Signature</code> was produced by signing the <code>Message</code> with the specified <code>KeyID</code>
     * and <code>SigningAlgorithm.</code> If the signature is not verified, the <code>Verify</code> operation fails with
     * a <code>KMSInvalidSignatureException</code> exception.
     * </p>
     * 
     * @return A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates
     *         that the <code>Signature</code> was produced by signing the <code>Message</code> with the specified
     *         <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is not verified, the
     *         <code>Verify</code> operation fails with a <code>KMSInvalidSignatureException</code> exception.
     */

    public Boolean getSignatureValid() {
        return this.signatureValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates that
     * the <code>Signature</code> was produced by signing the <code>Message</code> with the specified <code>KeyID</code>
     * and <code>SigningAlgorithm.</code> If the signature is not verified, the <code>Verify</code> operation fails with
     * a <code>KMSInvalidSignatureException</code> exception.
     * </p>
     * 
     * @param signatureValid
     *        A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates
     *        that the <code>Signature</code> was produced by signing the <code>Message</code> with the specified
     *        <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is not verified, the
     *        <code>Verify</code> operation fails with a <code>KMSInvalidSignatureException</code> exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyResult withSignatureValid(Boolean signatureValid) {
        setSignatureValid(signatureValid);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates that
     * the <code>Signature</code> was produced by signing the <code>Message</code> with the specified <code>KeyID</code>
     * and <code>SigningAlgorithm.</code> If the signature is not verified, the <code>Verify</code> operation fails with
     * a <code>KMSInvalidSignatureException</code> exception.
     * </p>
     * 
     * @return A Boolean value that indicates whether the signature was verified. A value of <code>True</code> indicates
     *         that the <code>Signature</code> was produced by signing the <code>Message</code> with the specified
     *         <code>KeyID</code> and <code>SigningAlgorithm.</code> If the signature is not verified, the
     *         <code>Verify</code> operation fails with a <code>KMSInvalidSignatureException</code> exception.
     */

    public Boolean isSignatureValid() {
        return this.signatureValid;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     * 
     * @param signingAlgorithm
     *        The signing algorithm that was used to verify the signature.
     * @see SigningAlgorithmSpec
     */

    public void setSigningAlgorithm(String signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     * 
     * @return The signing algorithm that was used to verify the signature.
     * @see SigningAlgorithmSpec
     */

    public String getSigningAlgorithm() {
        return this.signingAlgorithm;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     * 
     * @param signingAlgorithm
     *        The signing algorithm that was used to verify the signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public VerifyResult withSigningAlgorithm(String signingAlgorithm) {
        setSigningAlgorithm(signingAlgorithm);
        return this;
    }

    /**
     * <p>
     * The signing algorithm that was used to verify the signature.
     * </p>
     * 
     * @param signingAlgorithm
     *        The signing algorithm that was used to verify the signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SigningAlgorithmSpec
     */

    public VerifyResult withSigningAlgorithm(SigningAlgorithmSpec signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm.toString();
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getSignatureValid() != null)
            sb.append("SignatureValid: ").append(getSignatureValid()).append(",");
        if (getSigningAlgorithm() != null)
            sb.append("SigningAlgorithm: ").append(getSigningAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyResult == false)
            return false;
        VerifyResult other = (VerifyResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getSignatureValid() == null ^ this.getSignatureValid() == null)
            return false;
        if (other.getSignatureValid() != null && other.getSignatureValid().equals(this.getSignatureValid()) == false)
            return false;
        if (other.getSigningAlgorithm() == null ^ this.getSigningAlgorithm() == null)
            return false;
        if (other.getSigningAlgorithm() != null && other.getSigningAlgorithm().equals(this.getSigningAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getSignatureValid() == null) ? 0 : getSignatureValid().hashCode());
        hashCode = prime * hashCode + ((getSigningAlgorithm() == null) ? 0 : getSigningAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public VerifyResult clone() {
        try {
            return (VerifyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
