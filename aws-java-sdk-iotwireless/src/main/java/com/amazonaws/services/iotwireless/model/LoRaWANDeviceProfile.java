/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * LoRaWANDeviceProfile object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANDeviceProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANDeviceProfile implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The SupportsClassB value.
     * </p>
     */
    private Boolean supportsClassB;
    /**
     * <p>
     * The ClassBTimeout value.
     * </p>
     */
    private Integer classBTimeout;
    /**
     * <p>
     * The PingSlotPeriod value.
     * </p>
     */
    private Integer pingSlotPeriod;
    /**
     * <p>
     * The PingSlotDR value.
     * </p>
     */
    private Integer pingSlotDr;
    /**
     * <p>
     * The PingSlotFreq value.
     * </p>
     */
    private Integer pingSlotFreq;
    /**
     * <p>
     * The SupportsClassC value.
     * </p>
     */
    private Boolean supportsClassC;
    /**
     * <p>
     * The ClassCTimeout value.
     * </p>
     */
    private Integer classCTimeout;
    /**
     * <p>
     * The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     * </p>
     */
    private String macVersion;
    /**
     * <p>
     * The version of regional parameters.
     * </p>
     */
    private String regParamsRevision;
    /**
     * <p>
     * The RXDelay1 value.
     * </p>
     */
    private Integer rxDelay1;
    /**
     * <p>
     * The RXDROffset1 value.
     * </p>
     */
    private Integer rxDrOffset1;
    /**
     * <p>
     * The RXDataRate2 value.
     * </p>
     */
    private Integer rxDataRate2;
    /**
     * <p>
     * The RXFreq2 value.
     * </p>
     */
    private Integer rxFreq2;
    /**
     * <p>
     * The list of values that make up the FactoryPresetFreqs value.
     * </p>
     */
    private java.util.List<Integer> factoryPresetFreqsList;
    /**
     * <p>
     * The MaxEIRP value.
     * </p>
     */
    private Integer maxEirp;
    /**
     * <p>
     * The MaxDutyCycle value.
     * </p>
     */
    private Integer maxDutyCycle;
    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     */
    private String rfRegion;
    /**
     * <p>
     * The SupportsJoin value.
     * </p>
     */
    private Boolean supportsJoin;
    /**
     * <p>
     * The Supports32BitFCnt value.
     * </p>
     */
    private Boolean supports32BitFCnt;

    /**
     * <p>
     * The SupportsClassB value.
     * </p>
     * 
     * @param supportsClassB
     *        The SupportsClassB value.
     */

    public void setSupportsClassB(Boolean supportsClassB) {
        this.supportsClassB = supportsClassB;
    }

    /**
     * <p>
     * The SupportsClassB value.
     * </p>
     * 
     * @return The SupportsClassB value.
     */

    public Boolean getSupportsClassB() {
        return this.supportsClassB;
    }

    /**
     * <p>
     * The SupportsClassB value.
     * </p>
     * 
     * @param supportsClassB
     *        The SupportsClassB value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withSupportsClassB(Boolean supportsClassB) {
        setSupportsClassB(supportsClassB);
        return this;
    }

    /**
     * <p>
     * The SupportsClassB value.
     * </p>
     * 
     * @return The SupportsClassB value.
     */

    public Boolean isSupportsClassB() {
        return this.supportsClassB;
    }

    /**
     * <p>
     * The ClassBTimeout value.
     * </p>
     * 
     * @param classBTimeout
     *        The ClassBTimeout value.
     */

    public void setClassBTimeout(Integer classBTimeout) {
        this.classBTimeout = classBTimeout;
    }

    /**
     * <p>
     * The ClassBTimeout value.
     * </p>
     * 
     * @return The ClassBTimeout value.
     */

    public Integer getClassBTimeout() {
        return this.classBTimeout;
    }

    /**
     * <p>
     * The ClassBTimeout value.
     * </p>
     * 
     * @param classBTimeout
     *        The ClassBTimeout value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withClassBTimeout(Integer classBTimeout) {
        setClassBTimeout(classBTimeout);
        return this;
    }

    /**
     * <p>
     * The PingSlotPeriod value.
     * </p>
     * 
     * @param pingSlotPeriod
     *        The PingSlotPeriod value.
     */

    public void setPingSlotPeriod(Integer pingSlotPeriod) {
        this.pingSlotPeriod = pingSlotPeriod;
    }

    /**
     * <p>
     * The PingSlotPeriod value.
     * </p>
     * 
     * @return The PingSlotPeriod value.
     */

    public Integer getPingSlotPeriod() {
        return this.pingSlotPeriod;
    }

    /**
     * <p>
     * The PingSlotPeriod value.
     * </p>
     * 
     * @param pingSlotPeriod
     *        The PingSlotPeriod value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withPingSlotPeriod(Integer pingSlotPeriod) {
        setPingSlotPeriod(pingSlotPeriod);
        return this;
    }

    /**
     * <p>
     * The PingSlotDR value.
     * </p>
     * 
     * @param pingSlotDr
     *        The PingSlotDR value.
     */

    public void setPingSlotDr(Integer pingSlotDr) {
        this.pingSlotDr = pingSlotDr;
    }

    /**
     * <p>
     * The PingSlotDR value.
     * </p>
     * 
     * @return The PingSlotDR value.
     */

    public Integer getPingSlotDr() {
        return this.pingSlotDr;
    }

    /**
     * <p>
     * The PingSlotDR value.
     * </p>
     * 
     * @param pingSlotDr
     *        The PingSlotDR value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withPingSlotDr(Integer pingSlotDr) {
        setPingSlotDr(pingSlotDr);
        return this;
    }

    /**
     * <p>
     * The PingSlotFreq value.
     * </p>
     * 
     * @param pingSlotFreq
     *        The PingSlotFreq value.
     */

    public void setPingSlotFreq(Integer pingSlotFreq) {
        this.pingSlotFreq = pingSlotFreq;
    }

    /**
     * <p>
     * The PingSlotFreq value.
     * </p>
     * 
     * @return The PingSlotFreq value.
     */

    public Integer getPingSlotFreq() {
        return this.pingSlotFreq;
    }

    /**
     * <p>
     * The PingSlotFreq value.
     * </p>
     * 
     * @param pingSlotFreq
     *        The PingSlotFreq value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withPingSlotFreq(Integer pingSlotFreq) {
        setPingSlotFreq(pingSlotFreq);
        return this;
    }

    /**
     * <p>
     * The SupportsClassC value.
     * </p>
     * 
     * @param supportsClassC
     *        The SupportsClassC value.
     */

    public void setSupportsClassC(Boolean supportsClassC) {
        this.supportsClassC = supportsClassC;
    }

    /**
     * <p>
     * The SupportsClassC value.
     * </p>
     * 
     * @return The SupportsClassC value.
     */

    public Boolean getSupportsClassC() {
        return this.supportsClassC;
    }

    /**
     * <p>
     * The SupportsClassC value.
     * </p>
     * 
     * @param supportsClassC
     *        The SupportsClassC value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withSupportsClassC(Boolean supportsClassC) {
        setSupportsClassC(supportsClassC);
        return this;
    }

    /**
     * <p>
     * The SupportsClassC value.
     * </p>
     * 
     * @return The SupportsClassC value.
     */

    public Boolean isSupportsClassC() {
        return this.supportsClassC;
    }

    /**
     * <p>
     * The ClassCTimeout value.
     * </p>
     * 
     * @param classCTimeout
     *        The ClassCTimeout value.
     */

    public void setClassCTimeout(Integer classCTimeout) {
        this.classCTimeout = classCTimeout;
    }

    /**
     * <p>
     * The ClassCTimeout value.
     * </p>
     * 
     * @return The ClassCTimeout value.
     */

    public Integer getClassCTimeout() {
        return this.classCTimeout;
    }

    /**
     * <p>
     * The ClassCTimeout value.
     * </p>
     * 
     * @param classCTimeout
     *        The ClassCTimeout value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withClassCTimeout(Integer classCTimeout) {
        setClassCTimeout(classCTimeout);
        return this;
    }

    /**
     * <p>
     * The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     * </p>
     * 
     * @param macVersion
     *        The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     */

    public void setMacVersion(String macVersion) {
        this.macVersion = macVersion;
    }

    /**
     * <p>
     * The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     * </p>
     * 
     * @return The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     */

    public String getMacVersion() {
        return this.macVersion;
    }

    /**
     * <p>
     * The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     * </p>
     * 
     * @param macVersion
     *        The MAC version (such as OTAA 1.1 or OTAA 1.0.3) to use with this device profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withMacVersion(String macVersion) {
        setMacVersion(macVersion);
        return this;
    }

    /**
     * <p>
     * The version of regional parameters.
     * </p>
     * 
     * @param regParamsRevision
     *        The version of regional parameters.
     */

    public void setRegParamsRevision(String regParamsRevision) {
        this.regParamsRevision = regParamsRevision;
    }

    /**
     * <p>
     * The version of regional parameters.
     * </p>
     * 
     * @return The version of regional parameters.
     */

    public String getRegParamsRevision() {
        return this.regParamsRevision;
    }

    /**
     * <p>
     * The version of regional parameters.
     * </p>
     * 
     * @param regParamsRevision
     *        The version of regional parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withRegParamsRevision(String regParamsRevision) {
        setRegParamsRevision(regParamsRevision);
        return this;
    }

    /**
     * <p>
     * The RXDelay1 value.
     * </p>
     * 
     * @param rxDelay1
     *        The RXDelay1 value.
     */

    public void setRxDelay1(Integer rxDelay1) {
        this.rxDelay1 = rxDelay1;
    }

    /**
     * <p>
     * The RXDelay1 value.
     * </p>
     * 
     * @return The RXDelay1 value.
     */

    public Integer getRxDelay1() {
        return this.rxDelay1;
    }

    /**
     * <p>
     * The RXDelay1 value.
     * </p>
     * 
     * @param rxDelay1
     *        The RXDelay1 value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withRxDelay1(Integer rxDelay1) {
        setRxDelay1(rxDelay1);
        return this;
    }

    /**
     * <p>
     * The RXDROffset1 value.
     * </p>
     * 
     * @param rxDrOffset1
     *        The RXDROffset1 value.
     */

    public void setRxDrOffset1(Integer rxDrOffset1) {
        this.rxDrOffset1 = rxDrOffset1;
    }

    /**
     * <p>
     * The RXDROffset1 value.
     * </p>
     * 
     * @return The RXDROffset1 value.
     */

    public Integer getRxDrOffset1() {
        return this.rxDrOffset1;
    }

    /**
     * <p>
     * The RXDROffset1 value.
     * </p>
     * 
     * @param rxDrOffset1
     *        The RXDROffset1 value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withRxDrOffset1(Integer rxDrOffset1) {
        setRxDrOffset1(rxDrOffset1);
        return this;
    }

    /**
     * <p>
     * The RXDataRate2 value.
     * </p>
     * 
     * @param rxDataRate2
     *        The RXDataRate2 value.
     */

    public void setRxDataRate2(Integer rxDataRate2) {
        this.rxDataRate2 = rxDataRate2;
    }

    /**
     * <p>
     * The RXDataRate2 value.
     * </p>
     * 
     * @return The RXDataRate2 value.
     */

    public Integer getRxDataRate2() {
        return this.rxDataRate2;
    }

    /**
     * <p>
     * The RXDataRate2 value.
     * </p>
     * 
     * @param rxDataRate2
     *        The RXDataRate2 value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withRxDataRate2(Integer rxDataRate2) {
        setRxDataRate2(rxDataRate2);
        return this;
    }

    /**
     * <p>
     * The RXFreq2 value.
     * </p>
     * 
     * @param rxFreq2
     *        The RXFreq2 value.
     */

    public void setRxFreq2(Integer rxFreq2) {
        this.rxFreq2 = rxFreq2;
    }

    /**
     * <p>
     * The RXFreq2 value.
     * </p>
     * 
     * @return The RXFreq2 value.
     */

    public Integer getRxFreq2() {
        return this.rxFreq2;
    }

    /**
     * <p>
     * The RXFreq2 value.
     * </p>
     * 
     * @param rxFreq2
     *        The RXFreq2 value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withRxFreq2(Integer rxFreq2) {
        setRxFreq2(rxFreq2);
        return this;
    }

    /**
     * <p>
     * The list of values that make up the FactoryPresetFreqs value.
     * </p>
     * 
     * @return The list of values that make up the FactoryPresetFreqs value.
     */

    public java.util.List<Integer> getFactoryPresetFreqsList() {
        return factoryPresetFreqsList;
    }

    /**
     * <p>
     * The list of values that make up the FactoryPresetFreqs value.
     * </p>
     * 
     * @param factoryPresetFreqsList
     *        The list of values that make up the FactoryPresetFreqs value.
     */

    public void setFactoryPresetFreqsList(java.util.Collection<Integer> factoryPresetFreqsList) {
        if (factoryPresetFreqsList == null) {
            this.factoryPresetFreqsList = null;
            return;
        }

        this.factoryPresetFreqsList = new java.util.ArrayList<Integer>(factoryPresetFreqsList);
    }

    /**
     * <p>
     * The list of values that make up the FactoryPresetFreqs value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFactoryPresetFreqsList(java.util.Collection)} or
     * {@link #withFactoryPresetFreqsList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param factoryPresetFreqsList
     *        The list of values that make up the FactoryPresetFreqs value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withFactoryPresetFreqsList(Integer... factoryPresetFreqsList) {
        if (this.factoryPresetFreqsList == null) {
            setFactoryPresetFreqsList(new java.util.ArrayList<Integer>(factoryPresetFreqsList.length));
        }
        for (Integer ele : factoryPresetFreqsList) {
            this.factoryPresetFreqsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values that make up the FactoryPresetFreqs value.
     * </p>
     * 
     * @param factoryPresetFreqsList
     *        The list of values that make up the FactoryPresetFreqs value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withFactoryPresetFreqsList(java.util.Collection<Integer> factoryPresetFreqsList) {
        setFactoryPresetFreqsList(factoryPresetFreqsList);
        return this;
    }

    /**
     * <p>
     * The MaxEIRP value.
     * </p>
     * 
     * @param maxEirp
     *        The MaxEIRP value.
     */

    public void setMaxEirp(Integer maxEirp) {
        this.maxEirp = maxEirp;
    }

    /**
     * <p>
     * The MaxEIRP value.
     * </p>
     * 
     * @return The MaxEIRP value.
     */

    public Integer getMaxEirp() {
        return this.maxEirp;
    }

    /**
     * <p>
     * The MaxEIRP value.
     * </p>
     * 
     * @param maxEirp
     *        The MaxEIRP value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withMaxEirp(Integer maxEirp) {
        setMaxEirp(maxEirp);
        return this;
    }

    /**
     * <p>
     * The MaxDutyCycle value.
     * </p>
     * 
     * @param maxDutyCycle
     *        The MaxDutyCycle value.
     */

    public void setMaxDutyCycle(Integer maxDutyCycle) {
        this.maxDutyCycle = maxDutyCycle;
    }

    /**
     * <p>
     * The MaxDutyCycle value.
     * </p>
     * 
     * @return The MaxDutyCycle value.
     */

    public Integer getMaxDutyCycle() {
        return this.maxDutyCycle;
    }

    /**
     * <p>
     * The MaxDutyCycle value.
     * </p>
     * 
     * @param maxDutyCycle
     *        The MaxDutyCycle value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withMaxDutyCycle(Integer maxDutyCycle) {
        setMaxDutyCycle(maxDutyCycle);
        return this;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @param rfRegion
     *        The frequency band (RFRegion) value.
     */

    public void setRfRegion(String rfRegion) {
        this.rfRegion = rfRegion;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @return The frequency band (RFRegion) value.
     */

    public String getRfRegion() {
        return this.rfRegion;
    }

    /**
     * <p>
     * The frequency band (RFRegion) value.
     * </p>
     * 
     * @param rfRegion
     *        The frequency band (RFRegion) value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withRfRegion(String rfRegion) {
        setRfRegion(rfRegion);
        return this;
    }

    /**
     * <p>
     * The SupportsJoin value.
     * </p>
     * 
     * @param supportsJoin
     *        The SupportsJoin value.
     */

    public void setSupportsJoin(Boolean supportsJoin) {
        this.supportsJoin = supportsJoin;
    }

    /**
     * <p>
     * The SupportsJoin value.
     * </p>
     * 
     * @return The SupportsJoin value.
     */

    public Boolean getSupportsJoin() {
        return this.supportsJoin;
    }

    /**
     * <p>
     * The SupportsJoin value.
     * </p>
     * 
     * @param supportsJoin
     *        The SupportsJoin value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withSupportsJoin(Boolean supportsJoin) {
        setSupportsJoin(supportsJoin);
        return this;
    }

    /**
     * <p>
     * The SupportsJoin value.
     * </p>
     * 
     * @return The SupportsJoin value.
     */

    public Boolean isSupportsJoin() {
        return this.supportsJoin;
    }

    /**
     * <p>
     * The Supports32BitFCnt value.
     * </p>
     * 
     * @param supports32BitFCnt
     *        The Supports32BitFCnt value.
     */

    public void setSupports32BitFCnt(Boolean supports32BitFCnt) {
        this.supports32BitFCnt = supports32BitFCnt;
    }

    /**
     * <p>
     * The Supports32BitFCnt value.
     * </p>
     * 
     * @return The Supports32BitFCnt value.
     */

    public Boolean getSupports32BitFCnt() {
        return this.supports32BitFCnt;
    }

    /**
     * <p>
     * The Supports32BitFCnt value.
     * </p>
     * 
     * @param supports32BitFCnt
     *        The Supports32BitFCnt value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANDeviceProfile withSupports32BitFCnt(Boolean supports32BitFCnt) {
        setSupports32BitFCnt(supports32BitFCnt);
        return this;
    }

    /**
     * <p>
     * The Supports32BitFCnt value.
     * </p>
     * 
     * @return The Supports32BitFCnt value.
     */

    public Boolean isSupports32BitFCnt() {
        return this.supports32BitFCnt;
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
        if (getSupportsClassB() != null)
            sb.append("SupportsClassB: ").append(getSupportsClassB()).append(",");
        if (getClassBTimeout() != null)
            sb.append("ClassBTimeout: ").append(getClassBTimeout()).append(",");
        if (getPingSlotPeriod() != null)
            sb.append("PingSlotPeriod: ").append(getPingSlotPeriod()).append(",");
        if (getPingSlotDr() != null)
            sb.append("PingSlotDr: ").append(getPingSlotDr()).append(",");
        if (getPingSlotFreq() != null)
            sb.append("PingSlotFreq: ").append(getPingSlotFreq()).append(",");
        if (getSupportsClassC() != null)
            sb.append("SupportsClassC: ").append(getSupportsClassC()).append(",");
        if (getClassCTimeout() != null)
            sb.append("ClassCTimeout: ").append(getClassCTimeout()).append(",");
        if (getMacVersion() != null)
            sb.append("MacVersion: ").append(getMacVersion()).append(",");
        if (getRegParamsRevision() != null)
            sb.append("RegParamsRevision: ").append(getRegParamsRevision()).append(",");
        if (getRxDelay1() != null)
            sb.append("RxDelay1: ").append(getRxDelay1()).append(",");
        if (getRxDrOffset1() != null)
            sb.append("RxDrOffset1: ").append(getRxDrOffset1()).append(",");
        if (getRxDataRate2() != null)
            sb.append("RxDataRate2: ").append(getRxDataRate2()).append(",");
        if (getRxFreq2() != null)
            sb.append("RxFreq2: ").append(getRxFreq2()).append(",");
        if (getFactoryPresetFreqsList() != null)
            sb.append("FactoryPresetFreqsList: ").append(getFactoryPresetFreqsList()).append(",");
        if (getMaxEirp() != null)
            sb.append("MaxEirp: ").append(getMaxEirp()).append(",");
        if (getMaxDutyCycle() != null)
            sb.append("MaxDutyCycle: ").append(getMaxDutyCycle()).append(",");
        if (getRfRegion() != null)
            sb.append("RfRegion: ").append(getRfRegion()).append(",");
        if (getSupportsJoin() != null)
            sb.append("SupportsJoin: ").append(getSupportsJoin()).append(",");
        if (getSupports32BitFCnt() != null)
            sb.append("Supports32BitFCnt: ").append(getSupports32BitFCnt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANDeviceProfile == false)
            return false;
        LoRaWANDeviceProfile other = (LoRaWANDeviceProfile) obj;
        if (other.getSupportsClassB() == null ^ this.getSupportsClassB() == null)
            return false;
        if (other.getSupportsClassB() != null && other.getSupportsClassB().equals(this.getSupportsClassB()) == false)
            return false;
        if (other.getClassBTimeout() == null ^ this.getClassBTimeout() == null)
            return false;
        if (other.getClassBTimeout() != null && other.getClassBTimeout().equals(this.getClassBTimeout()) == false)
            return false;
        if (other.getPingSlotPeriod() == null ^ this.getPingSlotPeriod() == null)
            return false;
        if (other.getPingSlotPeriod() != null && other.getPingSlotPeriod().equals(this.getPingSlotPeriod()) == false)
            return false;
        if (other.getPingSlotDr() == null ^ this.getPingSlotDr() == null)
            return false;
        if (other.getPingSlotDr() != null && other.getPingSlotDr().equals(this.getPingSlotDr()) == false)
            return false;
        if (other.getPingSlotFreq() == null ^ this.getPingSlotFreq() == null)
            return false;
        if (other.getPingSlotFreq() != null && other.getPingSlotFreq().equals(this.getPingSlotFreq()) == false)
            return false;
        if (other.getSupportsClassC() == null ^ this.getSupportsClassC() == null)
            return false;
        if (other.getSupportsClassC() != null && other.getSupportsClassC().equals(this.getSupportsClassC()) == false)
            return false;
        if (other.getClassCTimeout() == null ^ this.getClassCTimeout() == null)
            return false;
        if (other.getClassCTimeout() != null && other.getClassCTimeout().equals(this.getClassCTimeout()) == false)
            return false;
        if (other.getMacVersion() == null ^ this.getMacVersion() == null)
            return false;
        if (other.getMacVersion() != null && other.getMacVersion().equals(this.getMacVersion()) == false)
            return false;
        if (other.getRegParamsRevision() == null ^ this.getRegParamsRevision() == null)
            return false;
        if (other.getRegParamsRevision() != null && other.getRegParamsRevision().equals(this.getRegParamsRevision()) == false)
            return false;
        if (other.getRxDelay1() == null ^ this.getRxDelay1() == null)
            return false;
        if (other.getRxDelay1() != null && other.getRxDelay1().equals(this.getRxDelay1()) == false)
            return false;
        if (other.getRxDrOffset1() == null ^ this.getRxDrOffset1() == null)
            return false;
        if (other.getRxDrOffset1() != null && other.getRxDrOffset1().equals(this.getRxDrOffset1()) == false)
            return false;
        if (other.getRxDataRate2() == null ^ this.getRxDataRate2() == null)
            return false;
        if (other.getRxDataRate2() != null && other.getRxDataRate2().equals(this.getRxDataRate2()) == false)
            return false;
        if (other.getRxFreq2() == null ^ this.getRxFreq2() == null)
            return false;
        if (other.getRxFreq2() != null && other.getRxFreq2().equals(this.getRxFreq2()) == false)
            return false;
        if (other.getFactoryPresetFreqsList() == null ^ this.getFactoryPresetFreqsList() == null)
            return false;
        if (other.getFactoryPresetFreqsList() != null && other.getFactoryPresetFreqsList().equals(this.getFactoryPresetFreqsList()) == false)
            return false;
        if (other.getMaxEirp() == null ^ this.getMaxEirp() == null)
            return false;
        if (other.getMaxEirp() != null && other.getMaxEirp().equals(this.getMaxEirp()) == false)
            return false;
        if (other.getMaxDutyCycle() == null ^ this.getMaxDutyCycle() == null)
            return false;
        if (other.getMaxDutyCycle() != null && other.getMaxDutyCycle().equals(this.getMaxDutyCycle()) == false)
            return false;
        if (other.getRfRegion() == null ^ this.getRfRegion() == null)
            return false;
        if (other.getRfRegion() != null && other.getRfRegion().equals(this.getRfRegion()) == false)
            return false;
        if (other.getSupportsJoin() == null ^ this.getSupportsJoin() == null)
            return false;
        if (other.getSupportsJoin() != null && other.getSupportsJoin().equals(this.getSupportsJoin()) == false)
            return false;
        if (other.getSupports32BitFCnt() == null ^ this.getSupports32BitFCnt() == null)
            return false;
        if (other.getSupports32BitFCnt() != null && other.getSupports32BitFCnt().equals(this.getSupports32BitFCnt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSupportsClassB() == null) ? 0 : getSupportsClassB().hashCode());
        hashCode = prime * hashCode + ((getClassBTimeout() == null) ? 0 : getClassBTimeout().hashCode());
        hashCode = prime * hashCode + ((getPingSlotPeriod() == null) ? 0 : getPingSlotPeriod().hashCode());
        hashCode = prime * hashCode + ((getPingSlotDr() == null) ? 0 : getPingSlotDr().hashCode());
        hashCode = prime * hashCode + ((getPingSlotFreq() == null) ? 0 : getPingSlotFreq().hashCode());
        hashCode = prime * hashCode + ((getSupportsClassC() == null) ? 0 : getSupportsClassC().hashCode());
        hashCode = prime * hashCode + ((getClassCTimeout() == null) ? 0 : getClassCTimeout().hashCode());
        hashCode = prime * hashCode + ((getMacVersion() == null) ? 0 : getMacVersion().hashCode());
        hashCode = prime * hashCode + ((getRegParamsRevision() == null) ? 0 : getRegParamsRevision().hashCode());
        hashCode = prime * hashCode + ((getRxDelay1() == null) ? 0 : getRxDelay1().hashCode());
        hashCode = prime * hashCode + ((getRxDrOffset1() == null) ? 0 : getRxDrOffset1().hashCode());
        hashCode = prime * hashCode + ((getRxDataRate2() == null) ? 0 : getRxDataRate2().hashCode());
        hashCode = prime * hashCode + ((getRxFreq2() == null) ? 0 : getRxFreq2().hashCode());
        hashCode = prime * hashCode + ((getFactoryPresetFreqsList() == null) ? 0 : getFactoryPresetFreqsList().hashCode());
        hashCode = prime * hashCode + ((getMaxEirp() == null) ? 0 : getMaxEirp().hashCode());
        hashCode = prime * hashCode + ((getMaxDutyCycle() == null) ? 0 : getMaxDutyCycle().hashCode());
        hashCode = prime * hashCode + ((getRfRegion() == null) ? 0 : getRfRegion().hashCode());
        hashCode = prime * hashCode + ((getSupportsJoin() == null) ? 0 : getSupportsJoin().hashCode());
        hashCode = prime * hashCode + ((getSupports32BitFCnt() == null) ? 0 : getSupports32BitFCnt().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANDeviceProfile clone() {
        try {
            return (LoRaWANDeviceProfile) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANDeviceProfileMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
