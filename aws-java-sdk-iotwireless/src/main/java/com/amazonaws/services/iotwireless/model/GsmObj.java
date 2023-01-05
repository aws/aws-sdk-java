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
 * GSM object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GsmObj" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GsmObj implements Serializable, Cloneable, StructuredPojo {

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
     * Location area code.
     * </p>
     */
    private Integer lac;
    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
     * </p>
     */
    private Integer geranCid;
    /**
     * <p>
     * GSM local identification (local ID) information.
     * </p>
     */
    private GsmLocalId gsmLocalId;
    /**
     * <p>
     * Timing advance value, which corresponds to the length of time a signal takes to reach the base station from a
     * mobile phone.
     * </p>
     */
    private Integer gsmTimingAdvance;
    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     */
    private Integer rxLevel;
    /**
     * <p>
     * GSM object for network measurement reports.
     * </p>
     */
    private java.util.List<GsmNmrObj> gsmNmr;

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

    public GsmObj withMcc(Integer mcc) {
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

    public GsmObj withMnc(Integer mnc) {
        setMnc(mnc);
        return this;
    }

    /**
     * <p>
     * Location area code.
     * </p>
     * 
     * @param lac
     *        Location area code.
     */

    public void setLac(Integer lac) {
        this.lac = lac;
    }

    /**
     * <p>
     * Location area code.
     * </p>
     * 
     * @return Location area code.
     */

    public Integer getLac() {
        return this.lac;
    }

    /**
     * <p>
     * Location area code.
     * </p>
     * 
     * @param lac
     *        Location area code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmObj withLac(Integer lac) {
        setLac(lac);
        return this;
    }

    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @param geranCid
     *        GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
     */

    public void setGeranCid(Integer geranCid) {
        this.geranCid = geranCid;
    }

    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @return GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
     */

    public Integer getGeranCid() {
        return this.geranCid;
    }

    /**
     * <p>
     * GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
     * </p>
     * 
     * @param geranCid
     *        GERAN (GSM EDGE Radio Access Network) Cell Global Identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmObj withGeranCid(Integer geranCid) {
        setGeranCid(geranCid);
        return this;
    }

    /**
     * <p>
     * GSM local identification (local ID) information.
     * </p>
     * 
     * @param gsmLocalId
     *        GSM local identification (local ID) information.
     */

    public void setGsmLocalId(GsmLocalId gsmLocalId) {
        this.gsmLocalId = gsmLocalId;
    }

    /**
     * <p>
     * GSM local identification (local ID) information.
     * </p>
     * 
     * @return GSM local identification (local ID) information.
     */

    public GsmLocalId getGsmLocalId() {
        return this.gsmLocalId;
    }

    /**
     * <p>
     * GSM local identification (local ID) information.
     * </p>
     * 
     * @param gsmLocalId
     *        GSM local identification (local ID) information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmObj withGsmLocalId(GsmLocalId gsmLocalId) {
        setGsmLocalId(gsmLocalId);
        return this;
    }

    /**
     * <p>
     * Timing advance value, which corresponds to the length of time a signal takes to reach the base station from a
     * mobile phone.
     * </p>
     * 
     * @param gsmTimingAdvance
     *        Timing advance value, which corresponds to the length of time a signal takes to reach the base station
     *        from a mobile phone.
     */

    public void setGsmTimingAdvance(Integer gsmTimingAdvance) {
        this.gsmTimingAdvance = gsmTimingAdvance;
    }

    /**
     * <p>
     * Timing advance value, which corresponds to the length of time a signal takes to reach the base station from a
     * mobile phone.
     * </p>
     * 
     * @return Timing advance value, which corresponds to the length of time a signal takes to reach the base station
     *         from a mobile phone.
     */

    public Integer getGsmTimingAdvance() {
        return this.gsmTimingAdvance;
    }

    /**
     * <p>
     * Timing advance value, which corresponds to the length of time a signal takes to reach the base station from a
     * mobile phone.
     * </p>
     * 
     * @param gsmTimingAdvance
     *        Timing advance value, which corresponds to the length of time a signal takes to reach the base station
     *        from a mobile phone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmObj withGsmTimingAdvance(Integer gsmTimingAdvance) {
        setGsmTimingAdvance(gsmTimingAdvance);
        return this;
    }

    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param rxLevel
     *        Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     */

    public void setRxLevel(Integer rxLevel) {
        this.rxLevel = rxLevel;
    }

    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @return Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     */

    public Integer getRxLevel() {
        return this.rxLevel;
    }

    /**
     * <p>
     * Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param rxLevel
     *        Rx level, which is the received signal power, measured in dBm (decibel-milliwatts).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmObj withRxLevel(Integer rxLevel) {
        setRxLevel(rxLevel);
        return this;
    }

    /**
     * <p>
     * GSM object for network measurement reports.
     * </p>
     * 
     * @return GSM object for network measurement reports.
     */

    public java.util.List<GsmNmrObj> getGsmNmr() {
        return gsmNmr;
    }

    /**
     * <p>
     * GSM object for network measurement reports.
     * </p>
     * 
     * @param gsmNmr
     *        GSM object for network measurement reports.
     */

    public void setGsmNmr(java.util.Collection<GsmNmrObj> gsmNmr) {
        if (gsmNmr == null) {
            this.gsmNmr = null;
            return;
        }

        this.gsmNmr = new java.util.ArrayList<GsmNmrObj>(gsmNmr);
    }

    /**
     * <p>
     * GSM object for network measurement reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGsmNmr(java.util.Collection)} or {@link #withGsmNmr(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param gsmNmr
     *        GSM object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmObj withGsmNmr(GsmNmrObj... gsmNmr) {
        if (this.gsmNmr == null) {
            setGsmNmr(new java.util.ArrayList<GsmNmrObj>(gsmNmr.length));
        }
        for (GsmNmrObj ele : gsmNmr) {
            this.gsmNmr.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * GSM object for network measurement reports.
     * </p>
     * 
     * @param gsmNmr
     *        GSM object for network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GsmObj withGsmNmr(java.util.Collection<GsmNmrObj> gsmNmr) {
        setGsmNmr(gsmNmr);
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
        if (getGeranCid() != null)
            sb.append("GeranCid: ").append(getGeranCid()).append(",");
        if (getGsmLocalId() != null)
            sb.append("GsmLocalId: ").append(getGsmLocalId()).append(",");
        if (getGsmTimingAdvance() != null)
            sb.append("GsmTimingAdvance: ").append(getGsmTimingAdvance()).append(",");
        if (getRxLevel() != null)
            sb.append("RxLevel: ").append(getRxLevel()).append(",");
        if (getGsmNmr() != null)
            sb.append("GsmNmr: ").append(getGsmNmr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GsmObj == false)
            return false;
        GsmObj other = (GsmObj) obj;
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
        if (other.getGeranCid() == null ^ this.getGeranCid() == null)
            return false;
        if (other.getGeranCid() != null && other.getGeranCid().equals(this.getGeranCid()) == false)
            return false;
        if (other.getGsmLocalId() == null ^ this.getGsmLocalId() == null)
            return false;
        if (other.getGsmLocalId() != null && other.getGsmLocalId().equals(this.getGsmLocalId()) == false)
            return false;
        if (other.getGsmTimingAdvance() == null ^ this.getGsmTimingAdvance() == null)
            return false;
        if (other.getGsmTimingAdvance() != null && other.getGsmTimingAdvance().equals(this.getGsmTimingAdvance()) == false)
            return false;
        if (other.getRxLevel() == null ^ this.getRxLevel() == null)
            return false;
        if (other.getRxLevel() != null && other.getRxLevel().equals(this.getRxLevel()) == false)
            return false;
        if (other.getGsmNmr() == null ^ this.getGsmNmr() == null)
            return false;
        if (other.getGsmNmr() != null && other.getGsmNmr().equals(this.getGsmNmr()) == false)
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
        hashCode = prime * hashCode + ((getGeranCid() == null) ? 0 : getGeranCid().hashCode());
        hashCode = prime * hashCode + ((getGsmLocalId() == null) ? 0 : getGsmLocalId().hashCode());
        hashCode = prime * hashCode + ((getGsmTimingAdvance() == null) ? 0 : getGsmTimingAdvance().hashCode());
        hashCode = prime * hashCode + ((getRxLevel() == null) ? 0 : getRxLevel().hashCode());
        hashCode = prime * hashCode + ((getGsmNmr() == null) ? 0 : getGsmNmr().hashCode());
        return hashCode;
    }

    @Override
    public GsmObj clone() {
        try {
            return (GsmObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.GsmObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
