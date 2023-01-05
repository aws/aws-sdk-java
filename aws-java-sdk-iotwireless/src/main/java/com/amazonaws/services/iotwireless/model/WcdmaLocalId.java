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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * WCDMA local identification (local ID) information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WcdmaLocalId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WcdmaLocalId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * WCDMA UTRA Absolute RF Channel Number downlink.
     * </p>
     */
    private Integer uarfcndl;
    /**
     * <p>
     * Primary Scrambling Code.
     * </p>
     */
    private Integer psc;

    /**
     * <p>
     * WCDMA UTRA Absolute RF Channel Number downlink.
     * </p>
     * 
     * @param uarfcndl
     *        WCDMA UTRA Absolute RF Channel Number downlink.
     */

    public void setUarfcndl(Integer uarfcndl) {
        this.uarfcndl = uarfcndl;
    }

    /**
     * <p>
     * WCDMA UTRA Absolute RF Channel Number downlink.
     * </p>
     * 
     * @return WCDMA UTRA Absolute RF Channel Number downlink.
     */

    public Integer getUarfcndl() {
        return this.uarfcndl;
    }

    /**
     * <p>
     * WCDMA UTRA Absolute RF Channel Number downlink.
     * </p>
     * 
     * @param uarfcndl
     *        WCDMA UTRA Absolute RF Channel Number downlink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaLocalId withUarfcndl(Integer uarfcndl) {
        setUarfcndl(uarfcndl);
        return this;
    }

    /**
     * <p>
     * Primary Scrambling Code.
     * </p>
     * 
     * @param psc
     *        Primary Scrambling Code.
     */

    public void setPsc(Integer psc) {
        this.psc = psc;
    }

    /**
     * <p>
     * Primary Scrambling Code.
     * </p>
     * 
     * @return Primary Scrambling Code.
     */

    public Integer getPsc() {
        return this.psc;
    }

    /**
     * <p>
     * Primary Scrambling Code.
     * </p>
     * 
     * @param psc
     *        Primary Scrambling Code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaLocalId withPsc(Integer psc) {
        setPsc(psc);
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
        if (getUarfcndl() != null)
            sb.append("Uarfcndl: ").append(getUarfcndl()).append(",");
        if (getPsc() != null)
            sb.append("Psc: ").append(getPsc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WcdmaLocalId == false)
            return false;
        WcdmaLocalId other = (WcdmaLocalId) obj;
        if (other.getUarfcndl() == null ^ this.getUarfcndl() == null)
            return false;
        if (other.getUarfcndl() != null && other.getUarfcndl().equals(this.getUarfcndl()) == false)
            return false;
        if (other.getPsc() == null ^ this.getPsc() == null)
            return false;
        if (other.getPsc() != null && other.getPsc().equals(this.getPsc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUarfcndl() == null) ? 0 : getUarfcndl().hashCode());
        hashCode = prime * hashCode + ((getPsc() == null) ? 0 : getPsc().hashCode());
        return hashCode;
    }

    @Override
    public WcdmaLocalId clone() {
        try {
            return (WcdmaLocalId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WcdmaLocalIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
