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
 * LTE object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LteObj" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LteObj implements Serializable, Cloneable, StructuredPojo {

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
     * E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     */
    private Integer eutranCid;
    /**
     * <p>
     * LTE tracking area code.
     * </p>
     */
    private Integer tac;
    /**
     * <p>
     * LTE local identification (local ID) information.
     * </p>
     */
    private LteLocalId lteLocalId;
    /**
     * <p>
     * LTE timing advance.
     * </p>
     */
    private Integer lteTimingAdvance;
    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
     * </p>
     */
    private Integer rsrp;
    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels (dB).
     * </p>
     */
    private Float rsrq;
    /**
     * <p>
     * Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     * </p>
     */
    private Boolean nrCapable;
    /**
     * <p>
     * LTE object for network measurement reports.
     * </p>
     */
    private java.util.List<LteNmrObj> lteNmr;

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

    public LteObj withMcc(Integer mcc) {
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

    public LteObj withMnc(Integer mnc) {
        setMnc(mnc);
        return this;
    }

    /**
     * <p>
     * E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @param eutranCid
     *        E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
     */

    public void setEutranCid(Integer eutranCid) {
        this.eutranCid = eutranCid;
    }

    /**
     * <p>
     * E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @return E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
     */

    public Integer getEutranCid() {
        return this.eutranCid;
    }

    /**
     * <p>
     * E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @param eutranCid
     *        E-UTRAN (Evolved Universal Terrestrial Radio Access Network) Cell Global Identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withEutranCid(Integer eutranCid) {
        setEutranCid(eutranCid);
        return this;
    }

    /**
     * <p>
     * LTE tracking area code.
     * </p>
     * 
     * @param tac
     *        LTE tracking area code.
     */

    public void setTac(Integer tac) {
        this.tac = tac;
    }

    /**
     * <p>
     * LTE tracking area code.
     * </p>
     * 
     * @return LTE tracking area code.
     */

    public Integer getTac() {
        return this.tac;
    }

    /**
     * <p>
     * LTE tracking area code.
     * </p>
     * 
     * @param tac
     *        LTE tracking area code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withTac(Integer tac) {
        setTac(tac);
        return this;
    }

    /**
     * <p>
     * LTE local identification (local ID) information.
     * </p>
     * 
     * @param lteLocalId
     *        LTE local identification (local ID) information.
     */

    public void setLteLocalId(LteLocalId lteLocalId) {
        this.lteLocalId = lteLocalId;
    }

    /**
     * <p>
     * LTE local identification (local ID) information.
     * </p>
     * 
     * @return LTE local identification (local ID) information.
     */

    public LteLocalId getLteLocalId() {
        return this.lteLocalId;
    }

    /**
     * <p>
     * LTE local identification (local ID) information.
     * </p>
     * 
     * @param lteLocalId
     *        LTE local identification (local ID) information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withLteLocalId(LteLocalId lteLocalId) {
        setLteLocalId(lteLocalId);
        return this;
    }

    /**
     * <p>
     * LTE timing advance.
     * </p>
     * 
     * @param lteTimingAdvance
     *        LTE timing advance.
     */

    public void setLteTimingAdvance(Integer lteTimingAdvance) {
        this.lteTimingAdvance = lteTimingAdvance;
    }

    /**
     * <p>
     * LTE timing advance.
     * </p>
     * 
     * @return LTE timing advance.
     */

    public Integer getLteTimingAdvance() {
        return this.lteTimingAdvance;
    }

    /**
     * <p>
     * LTE timing advance.
     * </p>
     * 
     * @param lteTimingAdvance
     *        LTE timing advance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withLteTimingAdvance(Integer lteTimingAdvance) {
        setLteTimingAdvance(lteTimingAdvance);
        return this;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param rsrp
     *        Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
     */

    public void setRsrp(Integer rsrp) {
        this.rsrp = rsrp;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @return Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
     */

    public Integer getRsrp() {
        return this.rsrp;
    }

    /**
     * <p>
     * Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param rsrp
     *        Signal power of the reference signal received, measured in dBm (decibel-milliwatts).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withRsrp(Integer rsrp) {
        setRsrp(rsrp);
        return this;
    }

    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels (dB).
     * </p>
     * 
     * @param rsrq
     *        Signal quality of the reference Signal received, measured in decibels (dB).
     */

    public void setRsrq(Float rsrq) {
        this.rsrq = rsrq;
    }

    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels (dB).
     * </p>
     * 
     * @return Signal quality of the reference Signal received, measured in decibels (dB).
     */

    public Float getRsrq() {
        return this.rsrq;
    }

    /**
     * <p>
     * Signal quality of the reference Signal received, measured in decibels (dB).
     * </p>
     * 
     * @param rsrq
     *        Signal quality of the reference Signal received, measured in decibels (dB).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withRsrq(Float rsrq) {
        setRsrq(rsrq);
        return this;
    }

    /**
     * <p>
     * Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     * </p>
     * 
     * @param nrCapable
     *        Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     */

    public void setNrCapable(Boolean nrCapable) {
        this.nrCapable = nrCapable;
    }

    /**
     * <p>
     * Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     * </p>
     * 
     * @return Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     */

    public Boolean getNrCapable() {
        return this.nrCapable;
    }

    /**
     * <p>
     * Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     * </p>
     * 
     * @param nrCapable
     *        Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withNrCapable(Boolean nrCapable) {
        setNrCapable(nrCapable);
        return this;
    }

    /**
     * <p>
     * Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     * </p>
     * 
     * @return Parameter that determines whether the LTE object is capable of supporting NR (new radio).
     */

    public Boolean isNrCapable() {
        return this.nrCapable;
    }

    /**
     * <p>
     * LTE object for network measurement reports.
     * </p>
     * 
     * @return LTE object for network measurement reports.
     */

    public java.util.List<LteNmrObj> getLteNmr() {
        return lteNmr;
    }

    /**
     * <p>
     * LTE object for network measurement reports.
     * </p>
     * 
     * @param lteNmr
     *        LTE object for network measurement reports.
     */

    public void setLteNmr(java.util.Collection<LteNmrObj> lteNmr) {
        if (lteNmr == null) {
            this.lteNmr = null;
            return;
        }

        this.lteNmr = new java.util.ArrayList<LteNmrObj>(lteNmr);
    }

    /**
     * <p>
     * LTE object for network measurement reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLteNmr(java.util.Collection)} or {@link #withLteNmr(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param lteNmr
     *        LTE object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withLteNmr(LteNmrObj... lteNmr) {
        if (this.lteNmr == null) {
            setLteNmr(new java.util.ArrayList<LteNmrObj>(lteNmr.length));
        }
        for (LteNmrObj ele : lteNmr) {
            this.lteNmr.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * LTE object for network measurement reports.
     * </p>
     * 
     * @param lteNmr
     *        LTE object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LteObj withLteNmr(java.util.Collection<LteNmrObj> lteNmr) {
        setLteNmr(lteNmr);
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
        if (getEutranCid() != null)
            sb.append("EutranCid: ").append(getEutranCid()).append(",");
        if (getTac() != null)
            sb.append("Tac: ").append(getTac()).append(",");
        if (getLteLocalId() != null)
            sb.append("LteLocalId: ").append(getLteLocalId()).append(",");
        if (getLteTimingAdvance() != null)
            sb.append("LteTimingAdvance: ").append(getLteTimingAdvance()).append(",");
        if (getRsrp() != null)
            sb.append("Rsrp: ").append(getRsrp()).append(",");
        if (getRsrq() != null)
            sb.append("Rsrq: ").append(getRsrq()).append(",");
        if (getNrCapable() != null)
            sb.append("NrCapable: ").append(getNrCapable()).append(",");
        if (getLteNmr() != null)
            sb.append("LteNmr: ").append(getLteNmr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LteObj == false)
            return false;
        LteObj other = (LteObj) obj;
        if (other.getMcc() == null ^ this.getMcc() == null)
            return false;
        if (other.getMcc() != null && other.getMcc().equals(this.getMcc()) == false)
            return false;
        if (other.getMnc() == null ^ this.getMnc() == null)
            return false;
        if (other.getMnc() != null && other.getMnc().equals(this.getMnc()) == false)
            return false;
        if (other.getEutranCid() == null ^ this.getEutranCid() == null)
            return false;
        if (other.getEutranCid() != null && other.getEutranCid().equals(this.getEutranCid()) == false)
            return false;
        if (other.getTac() == null ^ this.getTac() == null)
            return false;
        if (other.getTac() != null && other.getTac().equals(this.getTac()) == false)
            return false;
        if (other.getLteLocalId() == null ^ this.getLteLocalId() == null)
            return false;
        if (other.getLteLocalId() != null && other.getLteLocalId().equals(this.getLteLocalId()) == false)
            return false;
        if (other.getLteTimingAdvance() == null ^ this.getLteTimingAdvance() == null)
            return false;
        if (other.getLteTimingAdvance() != null && other.getLteTimingAdvance().equals(this.getLteTimingAdvance()) == false)
            return false;
        if (other.getRsrp() == null ^ this.getRsrp() == null)
            return false;
        if (other.getRsrp() != null && other.getRsrp().equals(this.getRsrp()) == false)
            return false;
        if (other.getRsrq() == null ^ this.getRsrq() == null)
            return false;
        if (other.getRsrq() != null && other.getRsrq().equals(this.getRsrq()) == false)
            return false;
        if (other.getNrCapable() == null ^ this.getNrCapable() == null)
            return false;
        if (other.getNrCapable() != null && other.getNrCapable().equals(this.getNrCapable()) == false)
            return false;
        if (other.getLteNmr() == null ^ this.getLteNmr() == null)
            return false;
        if (other.getLteNmr() != null && other.getLteNmr().equals(this.getLteNmr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMcc() == null) ? 0 : getMcc().hashCode());
        hashCode = prime * hashCode + ((getMnc() == null) ? 0 : getMnc().hashCode());
        hashCode = prime * hashCode + ((getEutranCid() == null) ? 0 : getEutranCid().hashCode());
        hashCode = prime * hashCode + ((getTac() == null) ? 0 : getTac().hashCode());
        hashCode = prime * hashCode + ((getLteLocalId() == null) ? 0 : getLteLocalId().hashCode());
        hashCode = prime * hashCode + ((getLteTimingAdvance() == null) ? 0 : getLteTimingAdvance().hashCode());
        hashCode = prime * hashCode + ((getRsrp() == null) ? 0 : getRsrp().hashCode());
        hashCode = prime * hashCode + ((getRsrq() == null) ? 0 : getRsrq().hashCode());
        hashCode = prime * hashCode + ((getNrCapable() == null) ? 0 : getNrCapable().hashCode());
        hashCode = prime * hashCode + ((getLteNmr() == null) ? 0 : getLteNmr().hashCode());
        return hashCode;
    }

    @Override
    public LteObj clone() {
        try {
            return (LteObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LteObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
