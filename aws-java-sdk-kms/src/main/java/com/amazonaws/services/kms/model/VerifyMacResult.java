/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/VerifyMac" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerifyMacResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that the
     * HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (<code>KeyID</code>)
     * and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     * <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs changed
     * since the HMAC was computed.
     * </p>
     */
    private Boolean macValid;
    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     */
    private String macAlgorithm;

    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     * 
     * @param keyId
     *        The HMAC KMS key used in the verification.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     * 
     * @return The HMAC KMS key used in the verification.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The HMAC KMS key used in the verification.
     * </p>
     * 
     * @param keyId
     *        The HMAC KMS key used in the verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyMacResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that the
     * HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (<code>KeyID</code>)
     * and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     * <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs changed
     * since the HMAC was computed.
     * </p>
     * 
     * @param macValid
     *        A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that
     *        the HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (
     *        <code>KeyID</code>) and <code>MacAlgorithm.</code>.</p>
     *        <p>
     *        If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     *        <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs
     *        changed since the HMAC was computed.
     */

    public void setMacValid(Boolean macValid) {
        this.macValid = macValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that the
     * HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (<code>KeyID</code>)
     * and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     * <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs changed
     * since the HMAC was computed.
     * </p>
     * 
     * @return A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that
     *         the HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (
     *         <code>KeyID</code>) and <code>MacAlgorithm.</code>.</p>
     *         <p>
     *         If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     *         <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs
     *         changed since the HMAC was computed.
     */

    public Boolean getMacValid() {
        return this.macValid;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that the
     * HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (<code>KeyID</code>)
     * and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     * <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs changed
     * since the HMAC was computed.
     * </p>
     * 
     * @param macValid
     *        A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that
     *        the HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (
     *        <code>KeyID</code>) and <code>MacAlgorithm.</code>.</p>
     *        <p>
     *        If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     *        <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs
     *        changed since the HMAC was computed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerifyMacResult withMacValid(Boolean macValid) {
        setMacValid(macValid);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that the
     * HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (<code>KeyID</code>)
     * and <code>MacAlgorithm.</code>.
     * </p>
     * <p>
     * If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     * <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs changed
     * since the HMAC was computed.
     * </p>
     * 
     * @return A Boolean value that indicates whether the HMAC was verified. A value of <code>True</code> indicates that
     *         the HMAC (<code>Mac</code>) was generated with the specified <code>Message</code>, HMAC KMS key (
     *         <code>KeyID</code>) and <code>MacAlgorithm.</code>.</p>
     *         <p>
     *         If the HMAC is not verified, the <code>VerifyMac</code> operation fails with a
     *         <code>KMSInvalidMacException</code> exception. This exception indicates that one or more of the inputs
     *         changed since the HMAC was computed.
     */

    public Boolean isMacValid() {
        return this.macValid;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm used in the verification.
     * @see MacAlgorithmSpec
     */

    public void setMacAlgorithm(String macAlgorithm) {
        this.macAlgorithm = macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * 
     * @return The MAC algorithm used in the verification.
     * @see MacAlgorithmSpec
     */

    public String getMacAlgorithm() {
        return this.macAlgorithm;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm used in the verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithmSpec
     */

    public VerifyMacResult withMacAlgorithm(String macAlgorithm) {
        setMacAlgorithm(macAlgorithm);
        return this;
    }

    /**
     * <p>
     * The MAC algorithm used in the verification.
     * </p>
     * 
     * @param macAlgorithm
     *        The MAC algorithm used in the verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithmSpec
     */

    public VerifyMacResult withMacAlgorithm(MacAlgorithmSpec macAlgorithm) {
        this.macAlgorithm = macAlgorithm.toString();
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
        if (getMacValid() != null)
            sb.append("MacValid: ").append(getMacValid()).append(",");
        if (getMacAlgorithm() != null)
            sb.append("MacAlgorithm: ").append(getMacAlgorithm());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyMacResult == false)
            return false;
        VerifyMacResult other = (VerifyMacResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getMacValid() == null ^ this.getMacValid() == null)
            return false;
        if (other.getMacValid() != null && other.getMacValid().equals(this.getMacValid()) == false)
            return false;
        if (other.getMacAlgorithm() == null ^ this.getMacAlgorithm() == null)
            return false;
        if (other.getMacAlgorithm() != null && other.getMacAlgorithm().equals(this.getMacAlgorithm()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getMacValid() == null) ? 0 : getMacValid().hashCode());
        hashCode = prime * hashCode + ((getMacAlgorithm() == null) ? 0 : getMacAlgorithm().hashCode());
        return hashCode;
    }

    @Override
    public VerifyMacResult clone() {
        try {
            return (VerifyMacResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
