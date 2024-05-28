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
package com.amazonaws.services.paymentcryptographydata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters that are required for DUKPT, HMAC, or EMV MAC generation or verification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/MacAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MacAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The encryption algorithm for MAC generation or verification.
     * </p>
     */
    private String algorithm;
    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT CMAC algorithm.
     * </p>
     */
    private MacAlgorithmDukpt dukptCmac;
    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm1.
     * </p>
     */
    private MacAlgorithmDukpt dukptIso9797Algorithm1;
    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm3.
     * </p>
     */
    private MacAlgorithmDukpt dukptIso9797Algorithm3;
    /**
     * <p>
     * Parameters that are required for MAC generation or verification using EMV MAC algorithm.
     * </p>
     */
    private MacAlgorithmEmv emvMac;

    /**
     * <p>
     * The encryption algorithm for MAC generation or verification.
     * </p>
     * 
     * @param algorithm
     *        The encryption algorithm for MAC generation or verification.
     * @see MacAlgorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * <p>
     * The encryption algorithm for MAC generation or verification.
     * </p>
     * 
     * @return The encryption algorithm for MAC generation or verification.
     * @see MacAlgorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * <p>
     * The encryption algorithm for MAC generation or verification.
     * </p>
     * 
     * @param algorithm
     *        The encryption algorithm for MAC generation or verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithm
     */

    public MacAttributes withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * <p>
     * The encryption algorithm for MAC generation or verification.
     * </p>
     * 
     * @param algorithm
     *        The encryption algorithm for MAC generation or verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MacAlgorithm
     */

    public MacAttributes withAlgorithm(MacAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT CMAC algorithm.
     * </p>
     * 
     * @param dukptCmac
     *        Parameters that are required for MAC generation or verification using DUKPT CMAC algorithm.
     */

    public void setDukptCmac(MacAlgorithmDukpt dukptCmac) {
        this.dukptCmac = dukptCmac;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT CMAC algorithm.
     * </p>
     * 
     * @return Parameters that are required for MAC generation or verification using DUKPT CMAC algorithm.
     */

    public MacAlgorithmDukpt getDukptCmac() {
        return this.dukptCmac;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT CMAC algorithm.
     * </p>
     * 
     * @param dukptCmac
     *        Parameters that are required for MAC generation or verification using DUKPT CMAC algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacAttributes withDukptCmac(MacAlgorithmDukpt dukptCmac) {
        setDukptCmac(dukptCmac);
        return this;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm1.
     * </p>
     * 
     * @param dukptIso9797Algorithm1
     *        Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm1.
     */

    public void setDukptIso9797Algorithm1(MacAlgorithmDukpt dukptIso9797Algorithm1) {
        this.dukptIso9797Algorithm1 = dukptIso9797Algorithm1;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm1.
     * </p>
     * 
     * @return Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm1.
     */

    public MacAlgorithmDukpt getDukptIso9797Algorithm1() {
        return this.dukptIso9797Algorithm1;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm1.
     * </p>
     * 
     * @param dukptIso9797Algorithm1
     *        Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacAttributes withDukptIso9797Algorithm1(MacAlgorithmDukpt dukptIso9797Algorithm1) {
        setDukptIso9797Algorithm1(dukptIso9797Algorithm1);
        return this;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm3.
     * </p>
     * 
     * @param dukptIso9797Algorithm3
     *        Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm3.
     */

    public void setDukptIso9797Algorithm3(MacAlgorithmDukpt dukptIso9797Algorithm3) {
        this.dukptIso9797Algorithm3 = dukptIso9797Algorithm3;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm3.
     * </p>
     * 
     * @return Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm3.
     */

    public MacAlgorithmDukpt getDukptIso9797Algorithm3() {
        return this.dukptIso9797Algorithm3;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm3.
     * </p>
     * 
     * @param dukptIso9797Algorithm3
     *        Parameters that are required for MAC generation or verification using DUKPT ISO 9797 algorithm3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacAttributes withDukptIso9797Algorithm3(MacAlgorithmDukpt dukptIso9797Algorithm3) {
        setDukptIso9797Algorithm3(dukptIso9797Algorithm3);
        return this;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using EMV MAC algorithm.
     * </p>
     * 
     * @param emvMac
     *        Parameters that are required for MAC generation or verification using EMV MAC algorithm.
     */

    public void setEmvMac(MacAlgorithmEmv emvMac) {
        this.emvMac = emvMac;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using EMV MAC algorithm.
     * </p>
     * 
     * @return Parameters that are required for MAC generation or verification using EMV MAC algorithm.
     */

    public MacAlgorithmEmv getEmvMac() {
        return this.emvMac;
    }

    /**
     * <p>
     * Parameters that are required for MAC generation or verification using EMV MAC algorithm.
     * </p>
     * 
     * @param emvMac
     *        Parameters that are required for MAC generation or verification using EMV MAC algorithm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MacAttributes withEmvMac(MacAlgorithmEmv emvMac) {
        setEmvMac(emvMac);
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getDukptCmac() != null)
            sb.append("DukptCmac: ").append(getDukptCmac()).append(",");
        if (getDukptIso9797Algorithm1() != null)
            sb.append("DukptIso9797Algorithm1: ").append(getDukptIso9797Algorithm1()).append(",");
        if (getDukptIso9797Algorithm3() != null)
            sb.append("DukptIso9797Algorithm3: ").append(getDukptIso9797Algorithm3()).append(",");
        if (getEmvMac() != null)
            sb.append("EmvMac: ").append(getEmvMac());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MacAttributes == false)
            return false;
        MacAttributes other = (MacAttributes) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getDukptCmac() == null ^ this.getDukptCmac() == null)
            return false;
        if (other.getDukptCmac() != null && other.getDukptCmac().equals(this.getDukptCmac()) == false)
            return false;
        if (other.getDukptIso9797Algorithm1() == null ^ this.getDukptIso9797Algorithm1() == null)
            return false;
        if (other.getDukptIso9797Algorithm1() != null && other.getDukptIso9797Algorithm1().equals(this.getDukptIso9797Algorithm1()) == false)
            return false;
        if (other.getDukptIso9797Algorithm3() == null ^ this.getDukptIso9797Algorithm3() == null)
            return false;
        if (other.getDukptIso9797Algorithm3() != null && other.getDukptIso9797Algorithm3().equals(this.getDukptIso9797Algorithm3()) == false)
            return false;
        if (other.getEmvMac() == null ^ this.getEmvMac() == null)
            return false;
        if (other.getEmvMac() != null && other.getEmvMac().equals(this.getEmvMac()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getDukptCmac() == null) ? 0 : getDukptCmac().hashCode());
        hashCode = prime * hashCode + ((getDukptIso9797Algorithm1() == null) ? 0 : getDukptIso9797Algorithm1().hashCode());
        hashCode = prime * hashCode + ((getDukptIso9797Algorithm3() == null) ? 0 : getDukptIso9797Algorithm3().hashCode());
        hashCode = prime * hashCode + ((getEmvMac() == null) ? 0 : getEmvMac().hashCode());
        return hashCode;
    }

    @Override
    public MacAttributes clone() {
        try {
            return (MacAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.MacAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
