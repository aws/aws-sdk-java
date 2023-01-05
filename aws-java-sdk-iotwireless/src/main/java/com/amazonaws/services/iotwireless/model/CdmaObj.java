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
 * CDMA (Code-division multiple access) object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CdmaObj" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CdmaObj implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * CDMA system ID (SID).
     * </p>
     */
    private Integer systemId;
    /**
     * <p>
     * CDMA network ID (NID).
     * </p>
     */
    private Integer networkId;
    /**
     * <p>
     * CDMA base station ID (BSID).
     * </p>
     */
    private Integer baseStationId;
    /**
     * <p>
     * CDMA registration zone (RZ).
     * </p>
     */
    private Integer registrationZone;
    /**
     * <p>
     * CDMA local identification (local ID) parameters.
     * </p>
     */
    private CdmaLocalId cdmaLocalId;
    /**
     * <p>
     * Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
     * </p>
     */
    private Integer pilotPower;
    /**
     * <p>
     * CDMA base station latitude in degrees.
     * </p>
     */
    private Float baseLat;
    /**
     * <p>
     * CDMA base station longtitude in degrees.
     * </p>
     */
    private Float baseLng;
    /**
     * <p>
     * CDMA network measurement reports.
     * </p>
     */
    private java.util.List<CdmaNmrObj> cdmaNmr;

    /**
     * <p>
     * CDMA system ID (SID).
     * </p>
     * 
     * @param systemId
     *        CDMA system ID (SID).
     */

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    /**
     * <p>
     * CDMA system ID (SID).
     * </p>
     * 
     * @return CDMA system ID (SID).
     */

    public Integer getSystemId() {
        return this.systemId;
    }

    /**
     * <p>
     * CDMA system ID (SID).
     * </p>
     * 
     * @param systemId
     *        CDMA system ID (SID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withSystemId(Integer systemId) {
        setSystemId(systemId);
        return this;
    }

    /**
     * <p>
     * CDMA network ID (NID).
     * </p>
     * 
     * @param networkId
     *        CDMA network ID (NID).
     */

    public void setNetworkId(Integer networkId) {
        this.networkId = networkId;
    }

    /**
     * <p>
     * CDMA network ID (NID).
     * </p>
     * 
     * @return CDMA network ID (NID).
     */

    public Integer getNetworkId() {
        return this.networkId;
    }

    /**
     * <p>
     * CDMA network ID (NID).
     * </p>
     * 
     * @param networkId
     *        CDMA network ID (NID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withNetworkId(Integer networkId) {
        setNetworkId(networkId);
        return this;
    }

    /**
     * <p>
     * CDMA base station ID (BSID).
     * </p>
     * 
     * @param baseStationId
     *        CDMA base station ID (BSID).
     */

    public void setBaseStationId(Integer baseStationId) {
        this.baseStationId = baseStationId;
    }

    /**
     * <p>
     * CDMA base station ID (BSID).
     * </p>
     * 
     * @return CDMA base station ID (BSID).
     */

    public Integer getBaseStationId() {
        return this.baseStationId;
    }

    /**
     * <p>
     * CDMA base station ID (BSID).
     * </p>
     * 
     * @param baseStationId
     *        CDMA base station ID (BSID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withBaseStationId(Integer baseStationId) {
        setBaseStationId(baseStationId);
        return this;
    }

    /**
     * <p>
     * CDMA registration zone (RZ).
     * </p>
     * 
     * @param registrationZone
     *        CDMA registration zone (RZ).
     */

    public void setRegistrationZone(Integer registrationZone) {
        this.registrationZone = registrationZone;
    }

    /**
     * <p>
     * CDMA registration zone (RZ).
     * </p>
     * 
     * @return CDMA registration zone (RZ).
     */

    public Integer getRegistrationZone() {
        return this.registrationZone;
    }

    /**
     * <p>
     * CDMA registration zone (RZ).
     * </p>
     * 
     * @param registrationZone
     *        CDMA registration zone (RZ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withRegistrationZone(Integer registrationZone) {
        setRegistrationZone(registrationZone);
        return this;
    }

    /**
     * <p>
     * CDMA local identification (local ID) parameters.
     * </p>
     * 
     * @param cdmaLocalId
     *        CDMA local identification (local ID) parameters.
     */

    public void setCdmaLocalId(CdmaLocalId cdmaLocalId) {
        this.cdmaLocalId = cdmaLocalId;
    }

    /**
     * <p>
     * CDMA local identification (local ID) parameters.
     * </p>
     * 
     * @return CDMA local identification (local ID) parameters.
     */

    public CdmaLocalId getCdmaLocalId() {
        return this.cdmaLocalId;
    }

    /**
     * <p>
     * CDMA local identification (local ID) parameters.
     * </p>
     * 
     * @param cdmaLocalId
     *        CDMA local identification (local ID) parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withCdmaLocalId(CdmaLocalId cdmaLocalId) {
        setCdmaLocalId(cdmaLocalId);
        return this;
    }

    /**
     * <p>
     * Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param pilotPower
     *        Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
     */

    public void setPilotPower(Integer pilotPower) {
        this.pilotPower = pilotPower;
    }

    /**
     * <p>
     * Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @return Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
     */

    public Integer getPilotPower() {
        return this.pilotPower;
    }

    /**
     * <p>
     * Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
     * </p>
     * 
     * @param pilotPower
     *        Transmit power level of the pilot signal, measured in dBm (decibel-milliwatts).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withPilotPower(Integer pilotPower) {
        setPilotPower(pilotPower);
        return this;
    }

    /**
     * <p>
     * CDMA base station latitude in degrees.
     * </p>
     * 
     * @param baseLat
     *        CDMA base station latitude in degrees.
     */

    public void setBaseLat(Float baseLat) {
        this.baseLat = baseLat;
    }

    /**
     * <p>
     * CDMA base station latitude in degrees.
     * </p>
     * 
     * @return CDMA base station latitude in degrees.
     */

    public Float getBaseLat() {
        return this.baseLat;
    }

    /**
     * <p>
     * CDMA base station latitude in degrees.
     * </p>
     * 
     * @param baseLat
     *        CDMA base station latitude in degrees.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withBaseLat(Float baseLat) {
        setBaseLat(baseLat);
        return this;
    }

    /**
     * <p>
     * CDMA base station longtitude in degrees.
     * </p>
     * 
     * @param baseLng
     *        CDMA base station longtitude in degrees.
     */

    public void setBaseLng(Float baseLng) {
        this.baseLng = baseLng;
    }

    /**
     * <p>
     * CDMA base station longtitude in degrees.
     * </p>
     * 
     * @return CDMA base station longtitude in degrees.
     */

    public Float getBaseLng() {
        return this.baseLng;
    }

    /**
     * <p>
     * CDMA base station longtitude in degrees.
     * </p>
     * 
     * @param baseLng
     *        CDMA base station longtitude in degrees.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withBaseLng(Float baseLng) {
        setBaseLng(baseLng);
        return this;
    }

    /**
     * <p>
     * CDMA network measurement reports.
     * </p>
     * 
     * @return CDMA network measurement reports.
     */

    public java.util.List<CdmaNmrObj> getCdmaNmr() {
        return cdmaNmr;
    }

    /**
     * <p>
     * CDMA network measurement reports.
     * </p>
     * 
     * @param cdmaNmr
     *        CDMA network measurement reports.
     */

    public void setCdmaNmr(java.util.Collection<CdmaNmrObj> cdmaNmr) {
        if (cdmaNmr == null) {
            this.cdmaNmr = null;
            return;
        }

        this.cdmaNmr = new java.util.ArrayList<CdmaNmrObj>(cdmaNmr);
    }

    /**
     * <p>
     * CDMA network measurement reports.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCdmaNmr(java.util.Collection)} or {@link #withCdmaNmr(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param cdmaNmr
     *        CDMA network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withCdmaNmr(CdmaNmrObj... cdmaNmr) {
        if (this.cdmaNmr == null) {
            setCdmaNmr(new java.util.ArrayList<CdmaNmrObj>(cdmaNmr.length));
        }
        for (CdmaNmrObj ele : cdmaNmr) {
            this.cdmaNmr.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * CDMA network measurement reports.
     * </p>
     * 
     * @param cdmaNmr
     *        CDMA network measurement reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CdmaObj withCdmaNmr(java.util.Collection<CdmaNmrObj> cdmaNmr) {
        setCdmaNmr(cdmaNmr);
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
        if (getSystemId() != null)
            sb.append("SystemId: ").append(getSystemId()).append(",");
        if (getNetworkId() != null)
            sb.append("NetworkId: ").append(getNetworkId()).append(",");
        if (getBaseStationId() != null)
            sb.append("BaseStationId: ").append(getBaseStationId()).append(",");
        if (getRegistrationZone() != null)
            sb.append("RegistrationZone: ").append(getRegistrationZone()).append(",");
        if (getCdmaLocalId() != null)
            sb.append("CdmaLocalId: ").append(getCdmaLocalId()).append(",");
        if (getPilotPower() != null)
            sb.append("PilotPower: ").append(getPilotPower()).append(",");
        if (getBaseLat() != null)
            sb.append("BaseLat: ").append(getBaseLat()).append(",");
        if (getBaseLng() != null)
            sb.append("BaseLng: ").append(getBaseLng()).append(",");
        if (getCdmaNmr() != null)
            sb.append("CdmaNmr: ").append(getCdmaNmr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CdmaObj == false)
            return false;
        CdmaObj other = (CdmaObj) obj;
        if (other.getSystemId() == null ^ this.getSystemId() == null)
            return false;
        if (other.getSystemId() != null && other.getSystemId().equals(this.getSystemId()) == false)
            return false;
        if (other.getNetworkId() == null ^ this.getNetworkId() == null)
            return false;
        if (other.getNetworkId() != null && other.getNetworkId().equals(this.getNetworkId()) == false)
            return false;
        if (other.getBaseStationId() == null ^ this.getBaseStationId() == null)
            return false;
        if (other.getBaseStationId() != null && other.getBaseStationId().equals(this.getBaseStationId()) == false)
            return false;
        if (other.getRegistrationZone() == null ^ this.getRegistrationZone() == null)
            return false;
        if (other.getRegistrationZone() != null && other.getRegistrationZone().equals(this.getRegistrationZone()) == false)
            return false;
        if (other.getCdmaLocalId() == null ^ this.getCdmaLocalId() == null)
            return false;
        if (other.getCdmaLocalId() != null && other.getCdmaLocalId().equals(this.getCdmaLocalId()) == false)
            return false;
        if (other.getPilotPower() == null ^ this.getPilotPower() == null)
            return false;
        if (other.getPilotPower() != null && other.getPilotPower().equals(this.getPilotPower()) == false)
            return false;
        if (other.getBaseLat() == null ^ this.getBaseLat() == null)
            return false;
        if (other.getBaseLat() != null && other.getBaseLat().equals(this.getBaseLat()) == false)
            return false;
        if (other.getBaseLng() == null ^ this.getBaseLng() == null)
            return false;
        if (other.getBaseLng() != null && other.getBaseLng().equals(this.getBaseLng()) == false)
            return false;
        if (other.getCdmaNmr() == null ^ this.getCdmaNmr() == null)
            return false;
        if (other.getCdmaNmr() != null && other.getCdmaNmr().equals(this.getCdmaNmr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSystemId() == null) ? 0 : getSystemId().hashCode());
        hashCode = prime * hashCode + ((getNetworkId() == null) ? 0 : getNetworkId().hashCode());
        hashCode = prime * hashCode + ((getBaseStationId() == null) ? 0 : getBaseStationId().hashCode());
        hashCode = prime * hashCode + ((getRegistrationZone() == null) ? 0 : getRegistrationZone().hashCode());
        hashCode = prime * hashCode + ((getCdmaLocalId() == null) ? 0 : getCdmaLocalId().hashCode());
        hashCode = prime * hashCode + ((getPilotPower() == null) ? 0 : getPilotPower().hashCode());
        hashCode = prime * hashCode + ((getBaseLat() == null) ? 0 : getBaseLat().hashCode());
        hashCode = prime * hashCode + ((getBaseLng() == null) ? 0 : getBaseLng().hashCode());
        hashCode = prime * hashCode + ((getCdmaNmr() == null) ? 0 : getCdmaNmr().hashCode());
        return hashCode;
    }

    @Override
    public CdmaObj clone() {
        try {
            return (CdmaObj) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.CdmaObjMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
