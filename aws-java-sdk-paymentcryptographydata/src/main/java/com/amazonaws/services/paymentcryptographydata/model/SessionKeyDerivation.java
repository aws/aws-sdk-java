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
 * Parameters to derive a session key for Authorization Response Cryptogram (ARQC) verification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/SessionKeyDerivation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionKeyDerivation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters to derive session key for an Amex payment card for ARQC verification.
     * </p>
     */
    private SessionKeyAmex amex;
    /**
     * <p>
     * Parameters to derive session key for an Emv2000 payment card for ARQC verification.
     * </p>
     */
    private SessionKeyEmv2000 emv2000;
    /**
     * <p>
     * Parameters to derive session key for an Emv common payment card for ARQC verification.
     * </p>
     */
    private SessionKeyEmvCommon emvCommon;
    /**
     * <p>
     * Parameters to derive session key for a Mastercard payment card for ARQC verification.
     * </p>
     */
    private SessionKeyMastercard mastercard;
    /**
     * <p>
     * Parameters to derive session key for a Visa payment cardfor ARQC verification.
     * </p>
     */
    private SessionKeyVisa visa;

    /**
     * <p>
     * Parameters to derive session key for an Amex payment card for ARQC verification.
     * </p>
     * 
     * @param amex
     *        Parameters to derive session key for an Amex payment card for ARQC verification.
     */

    public void setAmex(SessionKeyAmex amex) {
        this.amex = amex;
    }

    /**
     * <p>
     * Parameters to derive session key for an Amex payment card for ARQC verification.
     * </p>
     * 
     * @return Parameters to derive session key for an Amex payment card for ARQC verification.
     */

    public SessionKeyAmex getAmex() {
        return this.amex;
    }

    /**
     * <p>
     * Parameters to derive session key for an Amex payment card for ARQC verification.
     * </p>
     * 
     * @param amex
     *        Parameters to derive session key for an Amex payment card for ARQC verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyDerivation withAmex(SessionKeyAmex amex) {
        setAmex(amex);
        return this;
    }

    /**
     * <p>
     * Parameters to derive session key for an Emv2000 payment card for ARQC verification.
     * </p>
     * 
     * @param emv2000
     *        Parameters to derive session key for an Emv2000 payment card for ARQC verification.
     */

    public void setEmv2000(SessionKeyEmv2000 emv2000) {
        this.emv2000 = emv2000;
    }

    /**
     * <p>
     * Parameters to derive session key for an Emv2000 payment card for ARQC verification.
     * </p>
     * 
     * @return Parameters to derive session key for an Emv2000 payment card for ARQC verification.
     */

    public SessionKeyEmv2000 getEmv2000() {
        return this.emv2000;
    }

    /**
     * <p>
     * Parameters to derive session key for an Emv2000 payment card for ARQC verification.
     * </p>
     * 
     * @param emv2000
     *        Parameters to derive session key for an Emv2000 payment card for ARQC verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyDerivation withEmv2000(SessionKeyEmv2000 emv2000) {
        setEmv2000(emv2000);
        return this;
    }

    /**
     * <p>
     * Parameters to derive session key for an Emv common payment card for ARQC verification.
     * </p>
     * 
     * @param emvCommon
     *        Parameters to derive session key for an Emv common payment card for ARQC verification.
     */

    public void setEmvCommon(SessionKeyEmvCommon emvCommon) {
        this.emvCommon = emvCommon;
    }

    /**
     * <p>
     * Parameters to derive session key for an Emv common payment card for ARQC verification.
     * </p>
     * 
     * @return Parameters to derive session key for an Emv common payment card for ARQC verification.
     */

    public SessionKeyEmvCommon getEmvCommon() {
        return this.emvCommon;
    }

    /**
     * <p>
     * Parameters to derive session key for an Emv common payment card for ARQC verification.
     * </p>
     * 
     * @param emvCommon
     *        Parameters to derive session key for an Emv common payment card for ARQC verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyDerivation withEmvCommon(SessionKeyEmvCommon emvCommon) {
        setEmvCommon(emvCommon);
        return this;
    }

    /**
     * <p>
     * Parameters to derive session key for a Mastercard payment card for ARQC verification.
     * </p>
     * 
     * @param mastercard
     *        Parameters to derive session key for a Mastercard payment card for ARQC verification.
     */

    public void setMastercard(SessionKeyMastercard mastercard) {
        this.mastercard = mastercard;
    }

    /**
     * <p>
     * Parameters to derive session key for a Mastercard payment card for ARQC verification.
     * </p>
     * 
     * @return Parameters to derive session key for a Mastercard payment card for ARQC verification.
     */

    public SessionKeyMastercard getMastercard() {
        return this.mastercard;
    }

    /**
     * <p>
     * Parameters to derive session key for a Mastercard payment card for ARQC verification.
     * </p>
     * 
     * @param mastercard
     *        Parameters to derive session key for a Mastercard payment card for ARQC verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyDerivation withMastercard(SessionKeyMastercard mastercard) {
        setMastercard(mastercard);
        return this;
    }

    /**
     * <p>
     * Parameters to derive session key for a Visa payment cardfor ARQC verification.
     * </p>
     * 
     * @param visa
     *        Parameters to derive session key for a Visa payment cardfor ARQC verification.
     */

    public void setVisa(SessionKeyVisa visa) {
        this.visa = visa;
    }

    /**
     * <p>
     * Parameters to derive session key for a Visa payment cardfor ARQC verification.
     * </p>
     * 
     * @return Parameters to derive session key for a Visa payment cardfor ARQC verification.
     */

    public SessionKeyVisa getVisa() {
        return this.visa;
    }

    /**
     * <p>
     * Parameters to derive session key for a Visa payment cardfor ARQC verification.
     * </p>
     * 
     * @param visa
     *        Parameters to derive session key for a Visa payment cardfor ARQC verification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionKeyDerivation withVisa(SessionKeyVisa visa) {
        setVisa(visa);
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
        if (getAmex() != null)
            sb.append("Amex: ").append(getAmex()).append(",");
        if (getEmv2000() != null)
            sb.append("Emv2000: ").append(getEmv2000()).append(",");
        if (getEmvCommon() != null)
            sb.append("EmvCommon: ").append(getEmvCommon()).append(",");
        if (getMastercard() != null)
            sb.append("Mastercard: ").append(getMastercard()).append(",");
        if (getVisa() != null)
            sb.append("Visa: ").append(getVisa());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionKeyDerivation == false)
            return false;
        SessionKeyDerivation other = (SessionKeyDerivation) obj;
        if (other.getAmex() == null ^ this.getAmex() == null)
            return false;
        if (other.getAmex() != null && other.getAmex().equals(this.getAmex()) == false)
            return false;
        if (other.getEmv2000() == null ^ this.getEmv2000() == null)
            return false;
        if (other.getEmv2000() != null && other.getEmv2000().equals(this.getEmv2000()) == false)
            return false;
        if (other.getEmvCommon() == null ^ this.getEmvCommon() == null)
            return false;
        if (other.getEmvCommon() != null && other.getEmvCommon().equals(this.getEmvCommon()) == false)
            return false;
        if (other.getMastercard() == null ^ this.getMastercard() == null)
            return false;
        if (other.getMastercard() != null && other.getMastercard().equals(this.getMastercard()) == false)
            return false;
        if (other.getVisa() == null ^ this.getVisa() == null)
            return false;
        if (other.getVisa() != null && other.getVisa().equals(this.getVisa()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmex() == null) ? 0 : getAmex().hashCode());
        hashCode = prime * hashCode + ((getEmv2000() == null) ? 0 : getEmv2000().hashCode());
        hashCode = prime * hashCode + ((getEmvCommon() == null) ? 0 : getEmvCommon().hashCode());
        hashCode = prime * hashCode + ((getMastercard() == null) ? 0 : getMastercard().hashCode());
        hashCode = prime * hashCode + ((getVisa() == null) ? 0 : getVisa().hashCode());
        return hashCode;
    }

    @Override
    public SessionKeyDerivation clone() {
        try {
            return (SessionKeyDerivation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.SessionKeyDerivationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
