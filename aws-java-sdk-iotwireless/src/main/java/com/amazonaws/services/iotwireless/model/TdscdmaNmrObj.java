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
 * TD-SCDMA object for network measurement reports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TdscdmaNmrObj" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TdscdmaNmrObj implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
     * </p>
     */
    private Integer uarfcn;
    /**
     * <p>
     * Cell parameters for TD-SCDMA network measurement reports object.
     * </p>
     */
    private Integer cellParams;
    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
     * </p>
     */
    private Integer utranCid;
    /**
     * <p>
     * Code power of the received signal, measured in decibel-milliwatts (dBm).
     * </p>
     */
    private Integer rscp;
    /**
     * <p>
     * Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it propagates
     * through space.
     * </p>
     */
    private Integer pathLoss;

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
     * </p>
     * 
     * @param uarfcn
     *        TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
     */

    public void setUarfcn(Integer uarfcn) {
        this.uarfcn = uarfcn;
    }

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
     * </p>
     * 
     * @return TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
     */

    public Integer getUarfcn() {
        return this.uarfcn;
    }

    /**
     * <p>
     * TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
     * </p>
     * 
     * @param uarfcn
     *        TD-SCDMA UTRA (Universal Terrestrial Radio Access Network) absolute RF channel number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaNmrObj withUarfcn(Integer uarfcn) {
        setUarfcn(uarfcn);
        return this;
    }

    /**
     * <p>
     * Cell parameters for TD-SCDMA network measurement reports object.
     * </p>
     * 
     * @param cellParams
     *        Cell parameters for TD-SCDMA network measurement reports object.
     */

    public void setCellParams(Integer cellParams) {
        this.cellParams = cellParams;
    }

    /**
     * <p>
     * Cell parameters for TD-SCDMA network measurement reports object.
     * </p>
     * 
     * @return Cell parameters for TD-SCDMA network measurement reports object.
     */

    public Integer getCellParams() {
        return this.cellParams;
    }

    /**
     * <p>
     * Cell parameters for TD-SCDMA network measurement reports object.
     * </p>
     * 
     * @param cellParams
     *        Cell parameters for TD-SCDMA network measurement reports object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaNmrObj withCellParams(Integer cellParams) {
        setCellParams(cellParams);
        return this;
    }

    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
     * </p>
     * 
     * @param utranCid
     *        UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
     */

    public void setUtranCid(Integer utranCid) {
        this.utranCid = utranCid;
    }

    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
     * </p>
     * 
     * @return UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
     */

    public Integer getUtranCid() {
        return this.utranCid;
    }

    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
     * </p>
     * 
     * @param utranCid
     *        UTRAN (UMTS Terrestrial Radio Access Network) cell global identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaNmrObj withUtranCid(Integer utranCid) {
        setUtranCid(utranCid);
        return this;
    }

    /**
     * <p>
     * Code power of the received signal, measured in decibel-milliwatts (dBm).
     * </p>
     * 
     * @param rscp
     *        Code power of the received signal, measured in decibel-milliwatts (dBm).
     */

    public void setRscp(Integer rscp) {
        this.rscp = rscp;
    }

    /**
     * <p>
     * Code power of the received signal, measured in decibel-milliwatts (dBm).
     * </p>
     * 
     * @return Code power of the received signal, measured in decibel-milliwatts (dBm).
     */

    public Integer getRscp() {
        return this.rscp;
    }

    /**
     * <p>
     * Code power of the received signal, measured in decibel-milliwatts (dBm).
     * </p>
     * 
     * @param rscp
     *        Code power of the received signal, measured in decibel-milliwatts (dBm).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaNmrObj withRscp(Integer rscp) {
        setRscp(rscp);
        return this;
    }

    /**
     * <p>
     * Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it propagates
     * through space.
     * </p>
     * 
     * @param pathLoss
     *        Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it
     *        propagates through space.
     */

    public void setPathLoss(Integer pathLoss) {
        this.pathLoss = pathLoss;
    }

    /**
     * <p>
     * Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it propagates
     * through space.
     * </p>
     * 
     * @return Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it
     *         propagates through space.
     */

    public Integer getPathLoss() {
        return this.pathLoss;
    }

    /**
     * <p>
     * Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it propagates
     * through space.
     * </p>
     * 
     * @param pathLoss
     *        Path loss, or path attenuation, is the reduction in power density of an electromagnetic wave as it
     *        propagates through space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaNmrObj withPathLoss(Integer pathLoss) {
        setPathLoss(pathLoss);
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
            sb.append("CellParams: ").append(getCellParams()).append(",");
        if (getUtranCid() != null)
            sb.append("UtranCid: ").append(getUtranCid()).append(",");
        if (getRscp() != null)
            sb.append("Rscp: ").append(getRscp()).append(",");
        if (getPathLoss() != null)
            sb.append("PathLoss: ").append(getPathLoss());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TdscdmaNmrObj == false)
            return false;
        TdscdmaNmrObj other = (TdscdmaNmrObj) obj;
        if (other.getUarfcn() == null ^ this.getUarfcn() == null)
            return false;
        if (other.getUarfcn() != null && other.getUarfcn().equals(this.getUarfcn()) == false)
            return false;
        if (other.getCellParams() == null ^ this.getCellParams() == null)
            return false;
        if (other.getCellParams() != null && other.getCellParams().equals(this.getCellParams()) == false)
            return false;
        if (other.getUtranCid() == null ^ this.getUtranCid() == null)
            return false;
        if (other.getUtranCid() != null && other.getUtranCid().equals(this.getUtranCid()) == false)
            return false;
        if (other.getRscp() == null ^ this.getRscp() == null)
            return false;
        if (other.getRscp() != null && other.getRscp().equals(this.getRscp()) == false)
            return false;
        if (other.getPathLoss() == null ^ this.getPathLoss() == null)
            return false;
        if (other.getPathLoss() != null && other.getPathLoss().equals(this.getPathLoss()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUarfcn() == null) ? 0 : getUarfcn().hashCode());
        hashCode = prime * hashCode + ((getCellParams() == null) ? 0 : getCellParams().hashCode());
        hashCode = prime * hashCode + ((getUtranCid() == null) ? 0 : getUtranCid().hashCode());
        hashCode = prime * hashCode + ((getRscp() == null) ? 0 : getRscp().hashCode());
        hashCode = prime * hashCode + ((getPathLoss() == null) ? 0 : getPathLoss().hashCode());
        return hashCode;
    }

    @Override
    public TdscdmaNmrObj clone() {
        try {
            return (TdscdmaNmrObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.TdscdmaNmrObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
