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
 * Pparameters that are required to generate or verify Ibm3624 PIN offset PIN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/Ibm3624PinOffset"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ibm3624PinOffset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The decimalization table to use for IBM 3624 PIN algorithm. The table is used to convert the algorithm
     * intermediate result from hexadecimal characters to decimal.
     * </p>
     */
    private String decimalizationTable;
    /**
     * <p>
     * The encrypted PIN block data. According to ISO 9564 standard, a PIN Block is an encoded representation of a
     * payment card Personal Account Number (PAN) and the cardholder Personal Identification Number (PIN).
     * </p>
     */
    private String encryptedPinBlock;
    /**
     * <p>
     * The unique data for cardholder identification.
     * </p>
     */
    private String pinValidationData;
    /**
     * <p>
     * The padding character for validation data.
     * </p>
     */
    private String pinValidationDataPadCharacter;

    /**
     * <p>
     * The decimalization table to use for IBM 3624 PIN algorithm. The table is used to convert the algorithm
     * intermediate result from hexadecimal characters to decimal.
     * </p>
     * 
     * @param decimalizationTable
     *        The decimalization table to use for IBM 3624 PIN algorithm. The table is used to convert the algorithm
     *        intermediate result from hexadecimal characters to decimal.
     */

    public void setDecimalizationTable(String decimalizationTable) {
        this.decimalizationTable = decimalizationTable;
    }

    /**
     * <p>
     * The decimalization table to use for IBM 3624 PIN algorithm. The table is used to convert the algorithm
     * intermediate result from hexadecimal characters to decimal.
     * </p>
     * 
     * @return The decimalization table to use for IBM 3624 PIN algorithm. The table is used to convert the algorithm
     *         intermediate result from hexadecimal characters to decimal.
     */

    public String getDecimalizationTable() {
        return this.decimalizationTable;
    }

    /**
     * <p>
     * The decimalization table to use for IBM 3624 PIN algorithm. The table is used to convert the algorithm
     * intermediate result from hexadecimal characters to decimal.
     * </p>
     * 
     * @param decimalizationTable
     *        The decimalization table to use for IBM 3624 PIN algorithm. The table is used to convert the algorithm
     *        intermediate result from hexadecimal characters to decimal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ibm3624PinOffset withDecimalizationTable(String decimalizationTable) {
        setDecimalizationTable(decimalizationTable);
        return this;
    }

    /**
     * <p>
     * The encrypted PIN block data. According to ISO 9564 standard, a PIN Block is an encoded representation of a
     * payment card Personal Account Number (PAN) and the cardholder Personal Identification Number (PIN).
     * </p>
     * 
     * @param encryptedPinBlock
     *        The encrypted PIN block data. According to ISO 9564 standard, a PIN Block is an encoded representation of
     *        a payment card Personal Account Number (PAN) and the cardholder Personal Identification Number (PIN).
     */

    public void setEncryptedPinBlock(String encryptedPinBlock) {
        this.encryptedPinBlock = encryptedPinBlock;
    }

    /**
     * <p>
     * The encrypted PIN block data. According to ISO 9564 standard, a PIN Block is an encoded representation of a
     * payment card Personal Account Number (PAN) and the cardholder Personal Identification Number (PIN).
     * </p>
     * 
     * @return The encrypted PIN block data. According to ISO 9564 standard, a PIN Block is an encoded representation of
     *         a payment card Personal Account Number (PAN) and the cardholder Personal Identification Number (PIN).
     */

    public String getEncryptedPinBlock() {
        return this.encryptedPinBlock;
    }

    /**
     * <p>
     * The encrypted PIN block data. According to ISO 9564 standard, a PIN Block is an encoded representation of a
     * payment card Personal Account Number (PAN) and the cardholder Personal Identification Number (PIN).
     * </p>
     * 
     * @param encryptedPinBlock
     *        The encrypted PIN block data. According to ISO 9564 standard, a PIN Block is an encoded representation of
     *        a payment card Personal Account Number (PAN) and the cardholder Personal Identification Number (PIN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ibm3624PinOffset withEncryptedPinBlock(String encryptedPinBlock) {
        setEncryptedPinBlock(encryptedPinBlock);
        return this;
    }

    /**
     * <p>
     * The unique data for cardholder identification.
     * </p>
     * 
     * @param pinValidationData
     *        The unique data for cardholder identification.
     */

    public void setPinValidationData(String pinValidationData) {
        this.pinValidationData = pinValidationData;
    }

    /**
     * <p>
     * The unique data for cardholder identification.
     * </p>
     * 
     * @return The unique data for cardholder identification.
     */

    public String getPinValidationData() {
        return this.pinValidationData;
    }

    /**
     * <p>
     * The unique data for cardholder identification.
     * </p>
     * 
     * @param pinValidationData
     *        The unique data for cardholder identification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ibm3624PinOffset withPinValidationData(String pinValidationData) {
        setPinValidationData(pinValidationData);
        return this;
    }

    /**
     * <p>
     * The padding character for validation data.
     * </p>
     * 
     * @param pinValidationDataPadCharacter
     *        The padding character for validation data.
     */

    public void setPinValidationDataPadCharacter(String pinValidationDataPadCharacter) {
        this.pinValidationDataPadCharacter = pinValidationDataPadCharacter;
    }

    /**
     * <p>
     * The padding character for validation data.
     * </p>
     * 
     * @return The padding character for validation data.
     */

    public String getPinValidationDataPadCharacter() {
        return this.pinValidationDataPadCharacter;
    }

    /**
     * <p>
     * The padding character for validation data.
     * </p>
     * 
     * @param pinValidationDataPadCharacter
     *        The padding character for validation data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ibm3624PinOffset withPinValidationDataPadCharacter(String pinValidationDataPadCharacter) {
        setPinValidationDataPadCharacter(pinValidationDataPadCharacter);
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
        if (getDecimalizationTable() != null)
            sb.append("DecimalizationTable: ").append(getDecimalizationTable()).append(",");
        if (getEncryptedPinBlock() != null)
            sb.append("EncryptedPinBlock: ").append(getEncryptedPinBlock()).append(",");
        if (getPinValidationData() != null)
            sb.append("PinValidationData: ").append(getPinValidationData()).append(",");
        if (getPinValidationDataPadCharacter() != null)
            sb.append("PinValidationDataPadCharacter: ").append(getPinValidationDataPadCharacter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ibm3624PinOffset == false)
            return false;
        Ibm3624PinOffset other = (Ibm3624PinOffset) obj;
        if (other.getDecimalizationTable() == null ^ this.getDecimalizationTable() == null)
            return false;
        if (other.getDecimalizationTable() != null && other.getDecimalizationTable().equals(this.getDecimalizationTable()) == false)
            return false;
        if (other.getEncryptedPinBlock() == null ^ this.getEncryptedPinBlock() == null)
            return false;
        if (other.getEncryptedPinBlock() != null && other.getEncryptedPinBlock().equals(this.getEncryptedPinBlock()) == false)
            return false;
        if (other.getPinValidationData() == null ^ this.getPinValidationData() == null)
            return false;
        if (other.getPinValidationData() != null && other.getPinValidationData().equals(this.getPinValidationData()) == false)
            return false;
        if (other.getPinValidationDataPadCharacter() == null ^ this.getPinValidationDataPadCharacter() == null)
            return false;
        if (other.getPinValidationDataPadCharacter() != null
                && other.getPinValidationDataPadCharacter().equals(this.getPinValidationDataPadCharacter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDecimalizationTable() == null) ? 0 : getDecimalizationTable().hashCode());
        hashCode = prime * hashCode + ((getEncryptedPinBlock() == null) ? 0 : getEncryptedPinBlock().hashCode());
        hashCode = prime * hashCode + ((getPinValidationData() == null) ? 0 : getPinValidationData().hashCode());
        hashCode = prime * hashCode + ((getPinValidationDataPadCharacter() == null) ? 0 : getPinValidationDataPadCharacter().hashCode());
        return hashCode;
    }

    @Override
    public Ibm3624PinOffset clone() {
        try {
            return (Ibm3624PinOffset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.Ibm3624PinOffsetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
