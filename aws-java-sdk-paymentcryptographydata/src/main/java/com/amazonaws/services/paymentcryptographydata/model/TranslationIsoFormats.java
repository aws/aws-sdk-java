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
 * Parameters that are required for translation between ISO9564 PIN block formats 0,1,3,4.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-data-2022-02-03/TranslationIsoFormats"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranslationIsoFormats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 0 tranlation.
     * </p>
     */
    private TranslationPinDataIsoFormat034 isoFormat0;
    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 1 tranlation.
     * </p>
     */
    private TranslationPinDataIsoFormat1 isoFormat1;
    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 3 tranlation.
     * </p>
     */
    private TranslationPinDataIsoFormat034 isoFormat3;
    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 4 tranlation.
     * </p>
     */
    private TranslationPinDataIsoFormat034 isoFormat4;

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 0 tranlation.
     * </p>
     * 
     * @param isoFormat0
     *        Parameters that are required for ISO9564 PIN format 0 tranlation.
     */

    public void setIsoFormat0(TranslationPinDataIsoFormat034 isoFormat0) {
        this.isoFormat0 = isoFormat0;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 0 tranlation.
     * </p>
     * 
     * @return Parameters that are required for ISO9564 PIN format 0 tranlation.
     */

    public TranslationPinDataIsoFormat034 getIsoFormat0() {
        return this.isoFormat0;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 0 tranlation.
     * </p>
     * 
     * @param isoFormat0
     *        Parameters that are required for ISO9564 PIN format 0 tranlation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslationIsoFormats withIsoFormat0(TranslationPinDataIsoFormat034 isoFormat0) {
        setIsoFormat0(isoFormat0);
        return this;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 1 tranlation.
     * </p>
     * 
     * @param isoFormat1
     *        Parameters that are required for ISO9564 PIN format 1 tranlation.
     */

    public void setIsoFormat1(TranslationPinDataIsoFormat1 isoFormat1) {
        this.isoFormat1 = isoFormat1;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 1 tranlation.
     * </p>
     * 
     * @return Parameters that are required for ISO9564 PIN format 1 tranlation.
     */

    public TranslationPinDataIsoFormat1 getIsoFormat1() {
        return this.isoFormat1;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 1 tranlation.
     * </p>
     * 
     * @param isoFormat1
     *        Parameters that are required for ISO9564 PIN format 1 tranlation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslationIsoFormats withIsoFormat1(TranslationPinDataIsoFormat1 isoFormat1) {
        setIsoFormat1(isoFormat1);
        return this;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 3 tranlation.
     * </p>
     * 
     * @param isoFormat3
     *        Parameters that are required for ISO9564 PIN format 3 tranlation.
     */

    public void setIsoFormat3(TranslationPinDataIsoFormat034 isoFormat3) {
        this.isoFormat3 = isoFormat3;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 3 tranlation.
     * </p>
     * 
     * @return Parameters that are required for ISO9564 PIN format 3 tranlation.
     */

    public TranslationPinDataIsoFormat034 getIsoFormat3() {
        return this.isoFormat3;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 3 tranlation.
     * </p>
     * 
     * @param isoFormat3
     *        Parameters that are required for ISO9564 PIN format 3 tranlation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslationIsoFormats withIsoFormat3(TranslationPinDataIsoFormat034 isoFormat3) {
        setIsoFormat3(isoFormat3);
        return this;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 4 tranlation.
     * </p>
     * 
     * @param isoFormat4
     *        Parameters that are required for ISO9564 PIN format 4 tranlation.
     */

    public void setIsoFormat4(TranslationPinDataIsoFormat034 isoFormat4) {
        this.isoFormat4 = isoFormat4;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 4 tranlation.
     * </p>
     * 
     * @return Parameters that are required for ISO9564 PIN format 4 tranlation.
     */

    public TranslationPinDataIsoFormat034 getIsoFormat4() {
        return this.isoFormat4;
    }

    /**
     * <p>
     * Parameters that are required for ISO9564 PIN format 4 tranlation.
     * </p>
     * 
     * @param isoFormat4
     *        Parameters that are required for ISO9564 PIN format 4 tranlation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranslationIsoFormats withIsoFormat4(TranslationPinDataIsoFormat034 isoFormat4) {
        setIsoFormat4(isoFormat4);
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
        if (getIsoFormat0() != null)
            sb.append("IsoFormat0: ").append(getIsoFormat0()).append(",");
        if (getIsoFormat1() != null)
            sb.append("IsoFormat1: ").append(getIsoFormat1()).append(",");
        if (getIsoFormat3() != null)
            sb.append("IsoFormat3: ").append(getIsoFormat3()).append(",");
        if (getIsoFormat4() != null)
            sb.append("IsoFormat4: ").append(getIsoFormat4());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranslationIsoFormats == false)
            return false;
        TranslationIsoFormats other = (TranslationIsoFormats) obj;
        if (other.getIsoFormat0() == null ^ this.getIsoFormat0() == null)
            return false;
        if (other.getIsoFormat0() != null && other.getIsoFormat0().equals(this.getIsoFormat0()) == false)
            return false;
        if (other.getIsoFormat1() == null ^ this.getIsoFormat1() == null)
            return false;
        if (other.getIsoFormat1() != null && other.getIsoFormat1().equals(this.getIsoFormat1()) == false)
            return false;
        if (other.getIsoFormat3() == null ^ this.getIsoFormat3() == null)
            return false;
        if (other.getIsoFormat3() != null && other.getIsoFormat3().equals(this.getIsoFormat3()) == false)
            return false;
        if (other.getIsoFormat4() == null ^ this.getIsoFormat4() == null)
            return false;
        if (other.getIsoFormat4() != null && other.getIsoFormat4().equals(this.getIsoFormat4()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsoFormat0() == null) ? 0 : getIsoFormat0().hashCode());
        hashCode = prime * hashCode + ((getIsoFormat1() == null) ? 0 : getIsoFormat1().hashCode());
        hashCode = prime * hashCode + ((getIsoFormat3() == null) ? 0 : getIsoFormat3().hashCode());
        hashCode = prime * hashCode + ((getIsoFormat4() == null) ? 0 : getIsoFormat4().hashCode());
        return hashCode;
    }

    @Override
    public TranslationIsoFormats clone() {
        try {
            return (TranslationIsoFormats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.paymentcryptographydata.model.transform.TranslationIsoFormatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
