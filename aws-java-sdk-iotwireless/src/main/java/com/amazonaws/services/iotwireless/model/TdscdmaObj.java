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
 * TD-SCDMA object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/TdscdmaObj" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TdscdmaObj implements Serializable, Cloneable, StructuredPojo {

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
     * TD-SCDMA local identification (local ID) information.
     * </p>
     */
    private TdscdmaLocalId tdscdmaLocalId;
    /**
     * <p>
     * TD-SCDMA Timing advance.
     * </p>
     */
    private Integer tdscdmaTimingAdvance;
    /**
     * <p>
     * Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
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
     * TD-SCDMA object for network measurement reports.
     * </p>
     */
    private java.util.List<TdscdmaNmrObj> tdscdmaNmr;

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

    public TdscdmaObj withMcc(Integer mcc) {
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

    public TdscdmaObj withMnc(Integer mnc) {
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

    public TdscdmaObj withLac(Integer lac) {
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

    public TdscdmaObj withUtranCid(Integer utranCid) {
        setUtranCid(utranCid);
        return this;
    }

    /**
     * <p>
     * TD-SCDMA local identification (local ID) information.
     * </p>
     * 
     * @param tdscdmaLocalId
     *        TD-SCDMA local identification (local ID) information.
     */

    public void setTdscdmaLocalId(TdscdmaLocalId tdscdmaLocalId) {
        this.tdscdmaLocalId = tdscdmaLocalId;
    }

    /**
     * <p>
     * TD-SCDMA local identification (local ID) information.
     * </p>
     * 
     * @return TD-SCDMA local identification (local ID) information.
     */

    public TdscdmaLocalId getTdscdmaLocalId() {
        return this.tdscdmaLocalId;
    }

    /**
     * <p>
     * TD-SCDMA local identification (local ID) information.
     * </p>
     * 
     * @param tdscdmaLocalId
     *        TD-SCDMA local identification (local ID) information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaObj withTdscdmaLocalId(TdscdmaLocalId tdscdmaLocalId) {
        setTdscdmaLocalId(tdscdmaLocalId);
        return this;
    }

    /**
     * <p>
     * TD-SCDMA Timing advance.
     * </p>
     * 
     * @param tdscdmaTimingAdvance
     *        TD-SCDMA Timing advance.
     */

    public void setTdscdmaTimingAdvance(Integer tdscdmaTimingAdvance) {
        this.tdscdmaTimingAdvance = tdscdmaTimingAdvance;
    }

    /**
     * <p>
     * TD-SCDMA Timing advance.
     * </p>
     * 
     * @return TD-SCDMA Timing advance.
     */

    public Integer getTdscdmaTimingAdvance() {
        return this.tdscdmaTimingAdvance;
    }

    /**
     * <p>
     * TD-SCDMA Timing advance.
     * </p>
     * 
     * @param tdscdmaTimingAdvance
     *        TD-SCDMA Timing advance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaObj withTdscdmaTimingAdvance(Integer tdscdmaTimingAdvance) {
        setTdscdmaTimingAdvance(tdscdmaTimingAdvance);
        return this;
    }

    /**
     * <p>
     * Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
     * </p>
     * 
     * @param rscp
     *        Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
     */

    public void setRscp(Integer rscp) {
        this.rscp = rscp;
    }

    /**
     * <p>
     * Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
     * </p>
     * 
     * @return Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
     */

    public Integer getRscp() {
        return this.rscp;
    }

    /**
     * <p>
     * Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
     * </p>
     * 
     * @param rscp
     *        Signal power of the received signal (Received Signal Code Power), measured in decibel-milliwatts (dBm).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaObj withRscp(Integer rscp) {
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

    public TdscdmaObj withPathLoss(Integer pathLoss) {
        setPathLoss(pathLoss);
        return this;
    }

    /**
     * <p>
     * TD-SCDMA object for network measurement reports.
     * </p>
     * 
     * @return TD-SCDMA object for network measurement reports.
     */

    public java.util.List<TdscdmaNmrObj> getTdscdmaNmr() {
        return tdscdmaNmr;
    }

    /**
     * <p>
     * TD-SCDMA object for network measurement reports.
     * </p>
     * 
     * @param tdscdmaNmr
     *        TD-SCDMA object for network measurement reports.
     */

    public void setTdscdmaNmr(java.util.Collection<TdscdmaNmrObj> tdscdmaNmr) {
        if (tdscdmaNmr == null) {
            this.tdscdmaNmr = null;
            return;
        }

        this.tdscdmaNmr = new java.util.ArrayList<TdscdmaNmrObj>(tdscdmaNmr);
    }

    /**
     * <p>
     * TD-SCDMA object for network measurement reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTdscdmaNmr(java.util.Collection)} or {@link #withTdscdmaNmr(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tdscdmaNmr
     *        TD-SCDMA object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaObj withTdscdmaNmr(TdscdmaNmrObj... tdscdmaNmr) {
        if (this.tdscdmaNmr == null) {
            setTdscdmaNmr(new java.util.ArrayList<TdscdmaNmrObj>(tdscdmaNmr.length));
        }
        for (TdscdmaNmrObj ele : tdscdmaNmr) {
            this.tdscdmaNmr.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * TD-SCDMA object for network measurement reports.
     * </p>
     * 
     * @param tdscdmaNmr
     *        TD-SCDMA object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TdscdmaObj withTdscdmaNmr(java.util.Collection<TdscdmaNmrObj> tdscdmaNmr) {
        setTdscdmaNmr(tdscdmaNmr);
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
        if (getTdscdmaLocalId() != null)
            sb.append("TdscdmaLocalId: ").append(getTdscdmaLocalId()).append(",");
        if (getTdscdmaTimingAdvance() != null)
            sb.append("TdscdmaTimingAdvance: ").append(getTdscdmaTimingAdvance()).append(",");
        if (getRscp() != null)
            sb.append("Rscp: ").append(getRscp()).append(",");
        if (getPathLoss() != null)
            sb.append("PathLoss: ").append(getPathLoss()).append(",");
        if (getTdscdmaNmr() != null)
            sb.append("TdscdmaNmr: ").append(getTdscdmaNmr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TdscdmaObj == false)
            return false;
        TdscdmaObj other = (TdscdmaObj) obj;
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
        if (other.getTdscdmaLocalId() == null ^ this.getTdscdmaLocalId() == null)
            return false;
        if (other.getTdscdmaLocalId() != null && other.getTdscdmaLocalId().equals(this.getTdscdmaLocalId()) == false)
            return false;
        if (other.getTdscdmaTimingAdvance() == null ^ this.getTdscdmaTimingAdvance() == null)
            return false;
        if (other.getTdscdmaTimingAdvance() != null && other.getTdscdmaTimingAdvance().equals(this.getTdscdmaTimingAdvance()) == false)
            return false;
        if (other.getRscp() == null ^ this.getRscp() == null)
            return false;
        if (other.getRscp() != null && other.getRscp().equals(this.getRscp()) == false)
            return false;
        if (other.getPathLoss() == null ^ this.getPathLoss() == null)
            return false;
        if (other.getPathLoss() != null && other.getPathLoss().equals(this.getPathLoss()) == false)
            return false;
        if (other.getTdscdmaNmr() == null ^ this.getTdscdmaNmr() == null)
            return false;
        if (other.getTdscdmaNmr() != null && other.getTdscdmaNmr().equals(this.getTdscdmaNmr()) == false)
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
        hashCode = prime * hashCode + ((getTdscdmaLocalId() == null) ? 0 : getTdscdmaLocalId().hashCode());
        hashCode = prime * hashCode + ((getTdscdmaTimingAdvance() == null) ? 0 : getTdscdmaTimingAdvance().hashCode());
        hashCode = prime * hashCode + ((getRscp() == null) ? 0 : getRscp().hashCode());
        hashCode = prime * hashCode + ((getPathLoss() == null) ? 0 : getPathLoss().hashCode());
        hashCode = prime * hashCode + ((getTdscdmaNmr() == null) ? 0 : getTdscdmaNmr().hashCode());
        return hashCode;
    }

    @Override
    public TdscdmaObj clone() {
        try {
            return (TdscdmaObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.TdscdmaObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
