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
 * TD-SCDMA local identification (local Id) information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TdscdmaLocalId" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TdscdmaLocalId implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
     * </p>
     */
    private Integer uarfcn;
    /**
     * <p>
     * Cell parameters for TD-SCDMA.
     * </p>
     */
    private Integer cellParams;

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
     * </p>
     * 
     * @param uarfcn
     *        TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
     */

    public void setUarfcn(Integer uarfcn) {
        this.uarfcn = uarfcn;
    }

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
     * </p>
     * 
     * @return TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
     */

    public Integer getUarfcn() {
        return this.uarfcn;
    }

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
     * </p>
     * 
     * @param uarfcn
     *        TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number (UARFCN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaLocalId withUarfcn(Integer uarfcn) {
        setUarfcn(uarfcn);
        return this;
    }

    /**
     * <p>
     * Cell parameters for TD-SCDMA.
     * </p>
     * 
     * @param cellParams
     *        Cell parameters for TD-SCDMA.
     */

    public void setCellParams(Integer cellParams) {
        this.cellParams = cellParams;
    }

    /**
     * <p>
     * Cell parameters for TD-SCDMA.
     * </p>
     * 
     * @return Cell parameters for TD-SCDMA.
     */

    public Integer getCellParams() {
        return this.cellParams;
    }

    /**
     * <p>
     * Cell parameters for TD-SCDMA.
     * </p>
     * 
     * @param cellParams
     *        Cell parameters for TD-SCDMA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaLocalId withCellParams(Integer cellParams) {
        setCellParams(cellParams);
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
        if (getUarfcn() != null)
            sb.append("Uarfcn: ").append(getUarfcn()).append(",");
        if (getCellParams() != null)
            sb.append("CellParams: ").append(getCellParams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TdscdmaLocalId == false)
            return false;
        TdscdmaLocalId other = (TdscdmaLocalId) obj;
        if (other.getUarfcn() == null ^ this.getUarfcn() == null)
            return false;
        if (other.getUarfcn() != null && other.getUarfcn().equals(this.getUarfcn()) == false)
            return false;
        if (other.getCellParams() == null ^ this.getCellParams() == null)
            return false;
        if (other.getCellParams() != null && other.getCellParams().equals(this.getCellParams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUarfcn() == null) ? 0 : getUarfcn().hashCode());
        hashCode = prime * hashCode + ((getCellParams() == null) ? 0 : getCellParams().hashCode());
        return hashCode;
    }

    @Override
    public TdscdmaLocalId clone() {
        try {
            return (TdscdmaLocalId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.TdscdmaLocalIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
