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
 * WCDMA.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/WcdmaObj" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WcdmaObj implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Mobile Country Code.
     * </p>
     */
    private Integer mcc;
    /**
     * <p>
     * Mobile Network Code.
     * </p>
     */
    private Integer mnc;
    /**
     * <p>
     * Location Area Code.
     * </p>
     */
    private Integer lac;
    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     */
    private Integer utranCid;
    /**
     * <p>
     * WCDMA local ID information.
     * </p>
     */
    private WcdmaLocalId wcdmaLocalId;
    /**
     * <p>
     * Received Signal Code Power (signal power) (dBm).
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
     * WCDMA object for network measurement reports.
     * </p>
     */
    private java.util.List<WcdmaNmrObj> wcdmaNmr;

    /**
     * <p>
     * Mobile Country Code.
     * </p>
     * 
     * @param mcc
     *        Mobile Country Code.
     */

    public void setMcc(Integer mcc) {
        this.mcc = mcc;
    }

    /**
     * <p>
     * Mobile Country Code.
     * </p>
     * 
     * @return Mobile Country Code.
     */

    public Integer getMcc() {
        return this.mcc;
    }

    /**
     * <p>
     * Mobile Country Code.
     * </p>
     * 
     * @param mcc
     *        Mobile Country Code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withMcc(Integer mcc) {
        setMcc(mcc);
        return this;
    }

    /**
     * <p>
     * Mobile Network Code.
     * </p>
     * 
     * @param mnc
     *        Mobile Network Code.
     */

    public void setMnc(Integer mnc) {
        this.mnc = mnc;
    }

    /**
     * <p>
     * Mobile Network Code.
     * </p>
     * 
     * @return Mobile Network Code.
     */

    public Integer getMnc() {
        return this.mnc;
    }

    /**
     * <p>
     * Mobile Network Code.
     * </p>
     * 
     * @param mnc
     *        Mobile Network Code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withMnc(Integer mnc) {
        setMnc(mnc);
        return this;
    }

    /**
     * <p>
     * Location Area Code.
     * </p>
     * 
     * @param lac
     *        Location Area Code.
     */

    public void setLac(Integer lac) {
        this.lac = lac;
    }

    /**
     * <p>
     * Location Area Code.
     * </p>
     * 
     * @return Location Area Code.
     */

    public Integer getLac() {
        return this.lac;
    }

    /**
     * <p>
     * Location Area Code.
     * </p>
     * 
     * @param lac
     *        Location Area Code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withLac(Integer lac) {
        setLac(lac);
        return this;
    }

    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @param utranCid
     *        UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
     */

    public void setUtranCid(Integer utranCid) {
        this.utranCid = utranCid;
    }

    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @return UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
     */

    public Integer getUtranCid() {
        return this.utranCid;
    }

    /**
     * <p>
     * UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @param utranCid
     *        UTRAN (UMTS Terrestrial Radio Access Network) Cell Global Identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withUtranCid(Integer utranCid) {
        setUtranCid(utranCid);
        return this;
    }

    /**
     * <p>
     * WCDMA local ID information.
     * </p>
     * 
     * @param wcdmaLocalId
     *        WCDMA local ID information.
     */

    public void setWcdmaLocalId(WcdmaLocalId wcdmaLocalId) {
        this.wcdmaLocalId = wcdmaLocalId;
    }

    /**
     * <p>
     * WCDMA local ID information.
     * </p>
     * 
     * @return WCDMA local ID information.
     */

    public WcdmaLocalId getWcdmaLocalId() {
        return this.wcdmaLocalId;
    }

    /**
     * <p>
     * WCDMA local ID information.
     * </p>
     * 
     * @param wcdmaLocalId
     *        WCDMA local ID information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withWcdmaLocalId(WcdmaLocalId wcdmaLocalId) {
        setWcdmaLocalId(wcdmaLocalId);
        return this;
    }

    /**
     * <p>
     * Received Signal Code Power (signal power) (dBm).
     * </p>
     * 
     * @param rscp
     *        Received Signal Code Power (signal power) (dBm).
     */

    public void setRscp(Integer rscp) {
        this.rscp = rscp;
    }

    /**
     * <p>
     * Received Signal Code Power (signal power) (dBm).
     * </p>
     * 
     * @return Received Signal Code Power (signal power) (dBm).
     */

    public Integer getRscp() {
        return this.rscp;
    }

    /**
     * <p>
     * Received Signal Code Power (signal power) (dBm).
     * </p>
     * 
     * @param rscp
     *        Received Signal Code Power (signal power) (dBm).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withRscp(Integer rscp) {
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

    public WcdmaObj withPathLoss(Integer pathLoss) {
        setPathLoss(pathLoss);
        return this;
    }

    /**
     * <p>
     * WCDMA object for network measurement reports.
     * </p>
     * 
     * @return WCDMA object for network measurement reports.
     */

    public java.util.List<WcdmaNmrObj> getWcdmaNmr() {
        return wcdmaNmr;
    }

    /**
     * <p>
     * WCDMA object for network measurement reports.
     * </p>
     * 
     * @param wcdmaNmr
     *        WCDMA object for network measurement reports.
     */

    public void setWcdmaNmr(java.util.Collection<WcdmaNmrObj> wcdmaNmr) {
        if (wcdmaNmr == null) {
            this.wcdmaNmr = null;
            return;
        }

        this.wcdmaNmr = new java.util.ArrayList<WcdmaNmrObj>(wcdmaNmr);
    }

    /**
     * <p>
     * WCDMA object for network measurement reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWcdmaNmr(java.util.Collection)} or {@link #withWcdmaNmr(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param wcdmaNmr
     *        WCDMA object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withWcdmaNmr(WcdmaNmrObj... wcdmaNmr) {
        if (this.wcdmaNmr == null) {
            setWcdmaNmr(new java.util.ArrayList<WcdmaNmrObj>(wcdmaNmr.length));
        }
        for (WcdmaNmrObj ele : wcdmaNmr) {
            this.wcdmaNmr.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * WCDMA object for network measurement reports.
     * </p>
     * 
     * @param wcdmaNmr
     *        WCDMA object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WcdmaObj withWcdmaNmr(java.util.Collection<WcdmaNmrObj> wcdmaNmr) {
        setWcdmaNmr(wcdmaNmr);
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
        if (getMcc() != null)
            sb.append("Mcc: ").append(getMcc()).append(",");
        if (getMnc() != null)
            sb.append("Mnc: ").append(getMnc()).append(",");
        if (getLac() != null)
            sb.append("Lac: ").append(getLac()).append(",");
        if (getUtranCid() != null)
            sb.append("UtranCid: ").append(getUtranCid()).append(",");
        if (getWcdmaLocalId() != null)
            sb.append("WcdmaLocalId: ").append(getWcdmaLocalId()).append(",");
        if (getRscp() != null)
            sb.append("Rscp: ").append(getRscp()).append(",");
        if (getPathLoss() != null)
            sb.append("PathLoss: ").append(getPathLoss()).append(",");
        if (getWcdmaNmr() != null)
            sb.append("WcdmaNmr: ").append(getWcdmaNmr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WcdmaObj == false)
            return false;
        WcdmaObj other = (WcdmaObj) obj;
        if (other.getMcc() == null ^ this.getMcc() == null)
            return false;
        if (other.getMcc() != null && other.getMcc().equals(this.getMcc()) == false)
            return false;
        if (other.getMnc() == null ^ this.getMnc() == null)
            return false;
        if (other.getMnc() != null && other.getMnc().equals(this.getMnc()) == false)
            return false;
        if (other.getLac() == null ^ this.getLac() == null)
            return false;
        if (other.getLac() != null && other.getLac().equals(this.getLac()) == false)
            return false;
        if (other.getUtranCid() == null ^ this.getUtranCid() == null)
            return false;
        if (other.getUtranCid() != null && other.getUtranCid().equals(this.getUtranCid()) == false)
            return false;
        if (other.getWcdmaLocalId() == null ^ this.getWcdmaLocalId() == null)
            return false;
        if (other.getWcdmaLocalId() != null && other.getWcdmaLocalId().equals(this.getWcdmaLocalId()) == false)
            return false;
        if (other.getRscp() == null ^ this.getRscp() == null)
            return false;
        if (other.getRscp() != null && other.getRscp().equals(this.getRscp()) == false)
            return false;
        if (other.getPathLoss() == null ^ this.getPathLoss() == null)
            return false;
        if (other.getPathLoss() != null && other.getPathLoss().equals(this.getPathLoss()) == false)
            return false;
        if (other.getWcdmaNmr() == null ^ this.getWcdmaNmr() == null)
            return false;
        if (other.getWcdmaNmr() != null && other.getWcdmaNmr().equals(this.getWcdmaNmr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMcc() == null) ? 0 : getMcc().hashCode());
        hashCode = prime * hashCode + ((getMnc() == null) ? 0 : getMnc().hashCode());
        hashCode = prime * hashCode + ((getLac() == null) ? 0 : getLac().hashCode());
        hashCode = prime * hashCode + ((getUtranCid() == null) ? 0 : getUtranCid().hashCode());
        hashCode = prime * hashCode + ((getWcdmaLocalId() == null) ? 0 : getWcdmaLocalId().hashCode());
        hashCode = prime * hashCode + ((getRscp() == null) ? 0 : getRscp().hashCode());
        hashCode = prime * hashCode + ((getPathLoss() == null) ? 0 : getPathLoss().hashCode());
        hashCode = prime * hashCode + ((getWcdmaNmr() == null) ? 0 : getWcdmaNmr().hashCode());
        return hashCode;
    }

    @Override
    public WcdmaObj clone() {
        try {
            return (WcdmaObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.WcdmaObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
