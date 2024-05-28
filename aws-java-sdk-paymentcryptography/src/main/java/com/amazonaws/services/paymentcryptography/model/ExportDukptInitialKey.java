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
 * Parameter information for IPEK generation during export.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ExportDukptInitialKey"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportDukptInitialKey implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The KSN for IPEK generation using DUKPT.
     * </p>
     * <p>
     * KSN must be padded before sending to Amazon Web Services Payment Cryptography. KSN hex length should be 20 for a
     * TDES_2KEY key or 24 for an AES key.
     * </p>
     */
    private String keySerialNumber;

    /**
     * <p>
     * The KSN for IPEK generation using DUKPT.
     * </p>
     * <p>
     * KSN must be padded before sending to Amazon Web Services Payment Cryptography. KSN hex length should be 20 for a
     * TDES_2KEY key or 24 for an AES key.
     * </p>
     * 
     * @param keySerialNumber
     *        The KSN for IPEK generation using DUKPT. </p>
     *        <p>
     *        KSN must be padded before sending to Amazon Web Services Payment Cryptography. KSN hex length should be 20
     *        for a TDES_2KEY key or 24 for an AES key.
     */

    public void setKeySerialNumber(String keySerialNumber) {
        this.keySerialNumber = keySerialNumber;
    }

    /**
     * <p>
     * The KSN for IPEK generation using DUKPT.
     * </p>
     * <p>
     * KSN must be padded before sending to Amazon Web Services Payment Cryptography. KSN hex length should be 20 for a
     * TDES_2KEY key or 24 for an AES key.
     * </p>
     * 
     * @return The KSN for IPEK generation using DUKPT. </p>
     *         <p>
     *         KSN must be padded before sending to Amazon Web Services Payment Cryptography. KSN hex length should be
     *         20 for a TDES_2KEY key or 24 for an AES key.
     */

    public String getKeySerialNumber() {
        return this.keySerialNumber;
    }

    /**
     * <p>
     * The KSN for IPEK generation using DUKPT.
     * </p>
     * <p>
     * KSN must be padded before sending to Amazon Web Services Payment Cryptography. KSN hex length should be 20 for a
     * TDES_2KEY key or 24 for an AES key.
     * </p>
     * 
     * @param keySerialNumber
     *        The KSN for IPEK generation using DUKPT. </p>
     *        <p>
     *        KSN must be padded before sending to Amazon Web Services Payment Cryptography. KSN hex length should be 20
     *        for a TDES_2KEY key or 24 for an AES key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportDukptInitialKey withKeySerialNumber(String keySerialNumber) {
        setKeySerialNumber(keySerialNumber);
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
        if (getKeySerialNumber() != null)
            sb.append("KeySerialNumber: ").append(getKeySerialNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportDukptInitialKey == false)
            return false;
        ExportDukptInitialKey other = (ExportDukptInitialKey) obj;
        if (other.getKeySerialNumber() == null ^ this.getKeySerialNumber() == null)
            return false;
        if (other.getKeySerialNumber() != null && other.getKeySerialNumber().equals(this.getKeySerialNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeySerialNumber() == null) ? 0 : getKeySerialNumber().hashCode());
        return hashCode;
    }

    @Override
    public ExportDukptInitialKey clone() {
        try {
            return (ExportDukptInitialKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptography.model.transform.ExportDukptInitialKeyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
