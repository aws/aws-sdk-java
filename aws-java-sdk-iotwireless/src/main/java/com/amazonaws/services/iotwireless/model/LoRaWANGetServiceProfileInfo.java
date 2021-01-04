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
 * LoRaWANGetServiceProfileInfo object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/LoRaWANGetServiceProfileInfo"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoRaWANGetServiceProfileInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ULRate value.
     * </p>
     */
    private Integer ulRate;
    /**
     * <p>
     * The ULBucketSize value.
     * </p>
     */
    private Integer ulBucketSize;
    /**
     * <p>
     * The ULRatePolicy value.
     * </p>
     */
    private String ulRatePolicy;
    /**
     * <p>
     * The DLRate value.
     * </p>
     */
    private Integer dlRate;
    /**
     * <p>
     * The DLBucketSize value.
     * </p>
     */
    private Integer dlBucketSize;
    /**
     * <p>
     * The DLRatePolicy value.
     * </p>
     */
    private String dlRatePolicy;
    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     */
    private Boolean addGwMetadata;
    /**
     * <p>
     * The DevStatusReqFreq value.
     * </p>
     */
    private Integer devStatusReqFreq;
    /**
     * <p>
     * The ReportDevStatusBattery value.
     * </p>
     */
    private Boolean reportDevStatusBattery;
    /**
     * <p>
     * The ReportDevStatusMargin value.
     * </p>
     */
    private Boolean reportDevStatusMargin;
    /**
     * <p>
     * The DRMin value.
     * </p>
     */
    private Integer drMin;
    /**
     * <p>
     * The DRMax value.
     * </p>
     */
    private Integer drMax;
    /**
     * <p>
     * The ChannelMask value.
     * </p>
     */
    private String channelMask;
    /**
     * <p>
     * The PRAllowed value that describes whether passive roaming is allowed.
     * </p>
     */
    private Boolean prAllowed;
    /**
     * <p>
     * The HRAllowed value that describes whether handover roaming is allowed.
     * </p>
     */
    private Boolean hrAllowed;
    /**
     * <p>
     * The RAAllowed value that describes whether roaming activation is allowed.
     * </p>
     */
    private Boolean raAllowed;
    /**
     * <p>
     * The NwkGeoLoc value.
     * </p>
     */
    private Boolean nwkGeoLoc;
    /**
     * <p>
     * The TargetPER value.
     * </p>
     */
    private Integer targetPer;
    /**
     * <p>
     * The MinGwDiversity value.
     * </p>
     */
    private Integer minGwDiversity;

    /**
     * <p>
     * The ULRate value.
     * </p>
     * 
     * @param ulRate
     *        The ULRate value.
     */

    public void setUlRate(Integer ulRate) {
        this.ulRate = ulRate;
    }

    /**
     * <p>
     * The ULRate value.
     * </p>
     * 
     * @return The ULRate value.
     */

    public Integer getUlRate() {
        return this.ulRate;
    }

    /**
     * <p>
     * The ULRate value.
     * </p>
     * 
     * @param ulRate
     *        The ULRate value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withUlRate(Integer ulRate) {
        setUlRate(ulRate);
        return this;
    }

    /**
     * <p>
     * The ULBucketSize value.
     * </p>
     * 
     * @param ulBucketSize
     *        The ULBucketSize value.
     */

    public void setUlBucketSize(Integer ulBucketSize) {
        this.ulBucketSize = ulBucketSize;
    }

    /**
     * <p>
     * The ULBucketSize value.
     * </p>
     * 
     * @return The ULBucketSize value.
     */

    public Integer getUlBucketSize() {
        return this.ulBucketSize;
    }

    /**
     * <p>
     * The ULBucketSize value.
     * </p>
     * 
     * @param ulBucketSize
     *        The ULBucketSize value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withUlBucketSize(Integer ulBucketSize) {
        setUlBucketSize(ulBucketSize);
        return this;
    }

    /**
     * <p>
     * The ULRatePolicy value.
     * </p>
     * 
     * @param ulRatePolicy
     *        The ULRatePolicy value.
     */

    public void setUlRatePolicy(String ulRatePolicy) {
        this.ulRatePolicy = ulRatePolicy;
    }

    /**
     * <p>
     * The ULRatePolicy value.
     * </p>
     * 
     * @return The ULRatePolicy value.
     */

    public String getUlRatePolicy() {
        return this.ulRatePolicy;
    }

    /**
     * <p>
     * The ULRatePolicy value.
     * </p>
     * 
     * @param ulRatePolicy
     *        The ULRatePolicy value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withUlRatePolicy(String ulRatePolicy) {
        setUlRatePolicy(ulRatePolicy);
        return this;
    }

    /**
     * <p>
     * The DLRate value.
     * </p>
     * 
     * @param dlRate
     *        The DLRate value.
     */

    public void setDlRate(Integer dlRate) {
        this.dlRate = dlRate;
    }

    /**
     * <p>
     * The DLRate value.
     * </p>
     * 
     * @return The DLRate value.
     */

    public Integer getDlRate() {
        return this.dlRate;
    }

    /**
     * <p>
     * The DLRate value.
     * </p>
     * 
     * @param dlRate
     *        The DLRate value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withDlRate(Integer dlRate) {
        setDlRate(dlRate);
        return this;
    }

    /**
     * <p>
     * The DLBucketSize value.
     * </p>
     * 
     * @param dlBucketSize
     *        The DLBucketSize value.
     */

    public void setDlBucketSize(Integer dlBucketSize) {
        this.dlBucketSize = dlBucketSize;
    }

    /**
     * <p>
     * The DLBucketSize value.
     * </p>
     * 
     * @return The DLBucketSize value.
     */

    public Integer getDlBucketSize() {
        return this.dlBucketSize;
    }

    /**
     * <p>
     * The DLBucketSize value.
     * </p>
     * 
     * @param dlBucketSize
     *        The DLBucketSize value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withDlBucketSize(Integer dlBucketSize) {
        setDlBucketSize(dlBucketSize);
        return this;
    }

    /**
     * <p>
     * The DLRatePolicy value.
     * </p>
     * 
     * @param dlRatePolicy
     *        The DLRatePolicy value.
     */

    public void setDlRatePolicy(String dlRatePolicy) {
        this.dlRatePolicy = dlRatePolicy;
    }

    /**
     * <p>
     * The DLRatePolicy value.
     * </p>
     * 
     * @return The DLRatePolicy value.
     */

    public String getDlRatePolicy() {
        return this.dlRatePolicy;
    }

    /**
     * <p>
     * The DLRatePolicy value.
     * </p>
     * 
     * @param dlRatePolicy
     *        The DLRatePolicy value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withDlRatePolicy(String dlRatePolicy) {
        setDlRatePolicy(dlRatePolicy);
        return this;
    }

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @param addGwMetadata
     *        The AddGWMetaData value.
     */

    public void setAddGwMetadata(Boolean addGwMetadata) {
        this.addGwMetadata = addGwMetadata;
    }

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @return The AddGWMetaData value.
     */

    public Boolean getAddGwMetadata() {
        return this.addGwMetadata;
    }

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @param addGwMetadata
     *        The AddGWMetaData value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withAddGwMetadata(Boolean addGwMetadata) {
        setAddGwMetadata(addGwMetadata);
        return this;
    }

    /**
     * <p>
     * The AddGWMetaData value.
     * </p>
     * 
     * @return The AddGWMetaData value.
     */

    public Boolean isAddGwMetadata() {
        return this.addGwMetadata;
    }

    /**
     * <p>
     * The DevStatusReqFreq value.
     * </p>
     * 
     * @param devStatusReqFreq
     *        The DevStatusReqFreq value.
     */

    public void setDevStatusReqFreq(Integer devStatusReqFreq) {
        this.devStatusReqFreq = devStatusReqFreq;
    }

    /**
     * <p>
     * The DevStatusReqFreq value.
     * </p>
     * 
     * @return The DevStatusReqFreq value.
     */

    public Integer getDevStatusReqFreq() {
        return this.devStatusReqFreq;
    }

    /**
     * <p>
     * The DevStatusReqFreq value.
     * </p>
     * 
     * @param devStatusReqFreq
     *        The DevStatusReqFreq value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withDevStatusReqFreq(Integer devStatusReqFreq) {
        setDevStatusReqFreq(devStatusReqFreq);
        return this;
    }

    /**
     * <p>
     * The ReportDevStatusBattery value.
     * </p>
     * 
     * @param reportDevStatusBattery
     *        The ReportDevStatusBattery value.
     */

    public void setReportDevStatusBattery(Boolean reportDevStatusBattery) {
        this.reportDevStatusBattery = reportDevStatusBattery;
    }

    /**
     * <p>
     * The ReportDevStatusBattery value.
     * </p>
     * 
     * @return The ReportDevStatusBattery value.
     */

    public Boolean getReportDevStatusBattery() {
        return this.reportDevStatusBattery;
    }

    /**
     * <p>
     * The ReportDevStatusBattery value.
     * </p>
     * 
     * @param reportDevStatusBattery
     *        The ReportDevStatusBattery value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withReportDevStatusBattery(Boolean reportDevStatusBattery) {
        setReportDevStatusBattery(reportDevStatusBattery);
        return this;
    }

    /**
     * <p>
     * The ReportDevStatusBattery value.
     * </p>
     * 
     * @return The ReportDevStatusBattery value.
     */

    public Boolean isReportDevStatusBattery() {
        return this.reportDevStatusBattery;
    }

    /**
     * <p>
     * The ReportDevStatusMargin value.
     * </p>
     * 
     * @param reportDevStatusMargin
     *        The ReportDevStatusMargin value.
     */

    public void setReportDevStatusMargin(Boolean reportDevStatusMargin) {
        this.reportDevStatusMargin = reportDevStatusMargin;
    }

    /**
     * <p>
     * The ReportDevStatusMargin value.
     * </p>
     * 
     * @return The ReportDevStatusMargin value.
     */

    public Boolean getReportDevStatusMargin() {
        return this.reportDevStatusMargin;
    }

    /**
     * <p>
     * The ReportDevStatusMargin value.
     * </p>
     * 
     * @param reportDevStatusMargin
     *        The ReportDevStatusMargin value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withReportDevStatusMargin(Boolean reportDevStatusMargin) {
        setReportDevStatusMargin(reportDevStatusMargin);
        return this;
    }

    /**
     * <p>
     * The ReportDevStatusMargin value.
     * </p>
     * 
     * @return The ReportDevStatusMargin value.
     */

    public Boolean isReportDevStatusMargin() {
        return this.reportDevStatusMargin;
    }

    /**
     * <p>
     * The DRMin value.
     * </p>
     * 
     * @param drMin
     *        The DRMin value.
     */

    public void setDrMin(Integer drMin) {
        this.drMin = drMin;
    }

    /**
     * <p>
     * The DRMin value.
     * </p>
     * 
     * @return The DRMin value.
     */

    public Integer getDrMin() {
        return this.drMin;
    }

    /**
     * <p>
     * The DRMin value.
     * </p>
     * 
     * @param drMin
     *        The DRMin value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withDrMin(Integer drMin) {
        setDrMin(drMin);
        return this;
    }

    /**
     * <p>
     * The DRMax value.
     * </p>
     * 
     * @param drMax
     *        The DRMax value.
     */

    public void setDrMax(Integer drMax) {
        this.drMax = drMax;
    }

    /**
     * <p>
     * The DRMax value.
     * </p>
     * 
     * @return The DRMax value.
     */

    public Integer getDrMax() {
        return this.drMax;
    }

    /**
     * <p>
     * The DRMax value.
     * </p>
     * 
     * @param drMax
     *        The DRMax value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withDrMax(Integer drMax) {
        setDrMax(drMax);
        return this;
    }

    /**
     * <p>
     * The ChannelMask value.
     * </p>
     * 
     * @param channelMask
     *        The ChannelMask value.
     */

    public void setChannelMask(String channelMask) {
        this.channelMask = channelMask;
    }

    /**
     * <p>
     * The ChannelMask value.
     * </p>
     * 
     * @return The ChannelMask value.
     */

    public String getChannelMask() {
        return this.channelMask;
    }

    /**
     * <p>
     * The ChannelMask value.
     * </p>
     * 
     * @param channelMask
     *        The ChannelMask value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withChannelMask(String channelMask) {
        setChannelMask(channelMask);
        return this;
    }

    /**
     * <p>
     * The PRAllowed value that describes whether passive roaming is allowed.
     * </p>
     * 
     * @param prAllowed
     *        The PRAllowed value that describes whether passive roaming is allowed.
     */

    public void setPrAllowed(Boolean prAllowed) {
        this.prAllowed = prAllowed;
    }

    /**
     * <p>
     * The PRAllowed value that describes whether passive roaming is allowed.
     * </p>
     * 
     * @return The PRAllowed value that describes whether passive roaming is allowed.
     */

    public Boolean getPrAllowed() {
        return this.prAllowed;
    }

    /**
     * <p>
     * The PRAllowed value that describes whether passive roaming is allowed.
     * </p>
     * 
     * @param prAllowed
     *        The PRAllowed value that describes whether passive roaming is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withPrAllowed(Boolean prAllowed) {
        setPrAllowed(prAllowed);
        return this;
    }

    /**
     * <p>
     * The PRAllowed value that describes whether passive roaming is allowed.
     * </p>
     * 
     * @return The PRAllowed value that describes whether passive roaming is allowed.
     */

    public Boolean isPrAllowed() {
        return this.prAllowed;
    }

    /**
     * <p>
     * The HRAllowed value that describes whether handover roaming is allowed.
     * </p>
     * 
     * @param hrAllowed
     *        The HRAllowed value that describes whether handover roaming is allowed.
     */

    public void setHrAllowed(Boolean hrAllowed) {
        this.hrAllowed = hrAllowed;
    }

    /**
     * <p>
     * The HRAllowed value that describes whether handover roaming is allowed.
     * </p>
     * 
     * @return The HRAllowed value that describes whether handover roaming is allowed.
     */

    public Boolean getHrAllowed() {
        return this.hrAllowed;
    }

    /**
     * <p>
     * The HRAllowed value that describes whether handover roaming is allowed.
     * </p>
     * 
     * @param hrAllowed
     *        The HRAllowed value that describes whether handover roaming is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withHrAllowed(Boolean hrAllowed) {
        setHrAllowed(hrAllowed);
        return this;
    }

    /**
     * <p>
     * The HRAllowed value that describes whether handover roaming is allowed.
     * </p>
     * 
     * @return The HRAllowed value that describes whether handover roaming is allowed.
     */

    public Boolean isHrAllowed() {
        return this.hrAllowed;
    }

    /**
     * <p>
     * The RAAllowed value that describes whether roaming activation is allowed.
     * </p>
     * 
     * @param raAllowed
     *        The RAAllowed value that describes whether roaming activation is allowed.
     */

    public void setRaAllowed(Boolean raAllowed) {
        this.raAllowed = raAllowed;
    }

    /**
     * <p>
     * The RAAllowed value that describes whether roaming activation is allowed.
     * </p>
     * 
     * @return The RAAllowed value that describes whether roaming activation is allowed.
     */

    public Boolean getRaAllowed() {
        return this.raAllowed;
    }

    /**
     * <p>
     * The RAAllowed value that describes whether roaming activation is allowed.
     * </p>
     * 
     * @param raAllowed
     *        The RAAllowed value that describes whether roaming activation is allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withRaAllowed(Boolean raAllowed) {
        setRaAllowed(raAllowed);
        return this;
    }

    /**
     * <p>
     * The RAAllowed value that describes whether roaming activation is allowed.
     * </p>
     * 
     * @return The RAAllowed value that describes whether roaming activation is allowed.
     */

    public Boolean isRaAllowed() {
        return this.raAllowed;
    }

    /**
     * <p>
     * The NwkGeoLoc value.
     * </p>
     * 
     * @param nwkGeoLoc
     *        The NwkGeoLoc value.
     */

    public void setNwkGeoLoc(Boolean nwkGeoLoc) {
        this.nwkGeoLoc = nwkGeoLoc;
    }

    /**
     * <p>
     * The NwkGeoLoc value.
     * </p>
     * 
     * @return The NwkGeoLoc value.
     */

    public Boolean getNwkGeoLoc() {
        return this.nwkGeoLoc;
    }

    /**
     * <p>
     * The NwkGeoLoc value.
     * </p>
     * 
     * @param nwkGeoLoc
     *        The NwkGeoLoc value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withNwkGeoLoc(Boolean nwkGeoLoc) {
        setNwkGeoLoc(nwkGeoLoc);
        return this;
    }

    /**
     * <p>
     * The NwkGeoLoc value.
     * </p>
     * 
     * @return The NwkGeoLoc value.
     */

    public Boolean isNwkGeoLoc() {
        return this.nwkGeoLoc;
    }

    /**
     * <p>
     * The TargetPER value.
     * </p>
     * 
     * @param targetPer
     *        The TargetPER value.
     */

    public void setTargetPer(Integer targetPer) {
        this.targetPer = targetPer;
    }

    /**
     * <p>
     * The TargetPER value.
     * </p>
     * 
     * @return The TargetPER value.
     */

    public Integer getTargetPer() {
        return this.targetPer;
    }

    /**
     * <p>
     * The TargetPER value.
     * </p>
     * 
     * @param targetPer
     *        The TargetPER value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withTargetPer(Integer targetPer) {
        setTargetPer(targetPer);
        return this;
    }

    /**
     * <p>
     * The MinGwDiversity value.
     * </p>
     * 
     * @param minGwDiversity
     *        The MinGwDiversity value.
     */

    public void setMinGwDiversity(Integer minGwDiversity) {
        this.minGwDiversity = minGwDiversity;
    }

    /**
     * <p>
     * The MinGwDiversity value.
     * </p>
     * 
     * @return The MinGwDiversity value.
     */

    public Integer getMinGwDiversity() {
        return this.minGwDiversity;
    }

    /**
     * <p>
     * The MinGwDiversity value.
     * </p>
     * 
     * @param minGwDiversity
     *        The MinGwDiversity value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoRaWANGetServiceProfileInfo withMinGwDiversity(Integer minGwDiversity) {
        setMinGwDiversity(minGwDiversity);
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
        if (getUlRate() != null)
            sb.append("UlRate: ").append(getUlRate()).append(",");
        if (getUlBucketSize() != null)
            sb.append("UlBucketSize: ").append(getUlBucketSize()).append(",");
        if (getUlRatePolicy() != null)
            sb.append("UlRatePolicy: ").append(getUlRatePolicy()).append(",");
        if (getDlRate() != null)
            sb.append("DlRate: ").append(getDlRate()).append(",");
        if (getDlBucketSize() != null)
            sb.append("DlBucketSize: ").append(getDlBucketSize()).append(",");
        if (getDlRatePolicy() != null)
            sb.append("DlRatePolicy: ").append(getDlRatePolicy()).append(",");
        if (getAddGwMetadata() != null)
            sb.append("AddGwMetadata: ").append(getAddGwMetadata()).append(",");
        if (getDevStatusReqFreq() != null)
            sb.append("DevStatusReqFreq: ").append(getDevStatusReqFreq()).append(",");
        if (getReportDevStatusBattery() != null)
            sb.append("ReportDevStatusBattery: ").append(getReportDevStatusBattery()).append(",");
        if (getReportDevStatusMargin() != null)
            sb.append("ReportDevStatusMargin: ").append(getReportDevStatusMargin()).append(",");
        if (getDrMin() != null)
            sb.append("DrMin: ").append(getDrMin()).append(",");
        if (getDrMax() != null)
            sb.append("DrMax: ").append(getDrMax()).append(",");
        if (getChannelMask() != null)
            sb.append("ChannelMask: ").append(getChannelMask()).append(",");
        if (getPrAllowed() != null)
            sb.append("PrAllowed: ").append(getPrAllowed()).append(",");
        if (getHrAllowed() != null)
            sb.append("HrAllowed: ").append(getHrAllowed()).append(",");
        if (getRaAllowed() != null)
            sb.append("RaAllowed: ").append(getRaAllowed()).append(",");
        if (getNwkGeoLoc() != null)
            sb.append("NwkGeoLoc: ").append(getNwkGeoLoc()).append(",");
        if (getTargetPer() != null)
            sb.append("TargetPer: ").append(getTargetPer()).append(",");
        if (getMinGwDiversity() != null)
            sb.append("MinGwDiversity: ").append(getMinGwDiversity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoRaWANGetServiceProfileInfo == false)
            return false;
        LoRaWANGetServiceProfileInfo other = (LoRaWANGetServiceProfileInfo) obj;
        if (other.getUlRate() == null ^ this.getUlRate() == null)
            return false;
        if (other.getUlRate() != null && other.getUlRate().equals(this.getUlRate()) == false)
            return false;
        if (other.getUlBucketSize() == null ^ this.getUlBucketSize() == null)
            return false;
        if (other.getUlBucketSize() != null && other.getUlBucketSize().equals(this.getUlBucketSize()) == false)
            return false;
        if (other.getUlRatePolicy() == null ^ this.getUlRatePolicy() == null)
            return false;
        if (other.getUlRatePolicy() != null && other.getUlRatePolicy().equals(this.getUlRatePolicy()) == false)
            return false;
        if (other.getDlRate() == null ^ this.getDlRate() == null)
            return false;
        if (other.getDlRate() != null && other.getDlRate().equals(this.getDlRate()) == false)
            return false;
        if (other.getDlBucketSize() == null ^ this.getDlBucketSize() == null)
            return false;
        if (other.getDlBucketSize() != null && other.getDlBucketSize().equals(this.getDlBucketSize()) == false)
            return false;
        if (other.getDlRatePolicy() == null ^ this.getDlRatePolicy() == null)
            return false;
        if (other.getDlRatePolicy() != null && other.getDlRatePolicy().equals(this.getDlRatePolicy()) == false)
            return false;
        if (other.getAddGwMetadata() == null ^ this.getAddGwMetadata() == null)
            return false;
        if (other.getAddGwMetadata() != null && other.getAddGwMetadata().equals(this.getAddGwMetadata()) == false)
            return false;
        if (other.getDevStatusReqFreq() == null ^ this.getDevStatusReqFreq() == null)
            return false;
        if (other.getDevStatusReqFreq() != null && other.getDevStatusReqFreq().equals(this.getDevStatusReqFreq()) == false)
            return false;
        if (other.getReportDevStatusBattery() == null ^ this.getReportDevStatusBattery() == null)
            return false;
        if (other.getReportDevStatusBattery() != null && other.getReportDevStatusBattery().equals(this.getReportDevStatusBattery()) == false)
            return false;
        if (other.getReportDevStatusMargin() == null ^ this.getReportDevStatusMargin() == null)
            return false;
        if (other.getReportDevStatusMargin() != null && other.getReportDevStatusMargin().equals(this.getReportDevStatusMargin()) == false)
            return false;
        if (other.getDrMin() == null ^ this.getDrMin() == null)
            return false;
        if (other.getDrMin() != null && other.getDrMin().equals(this.getDrMin()) == false)
            return false;
        if (other.getDrMax() == null ^ this.getDrMax() == null)
            return false;
        if (other.getDrMax() != null && other.getDrMax().equals(this.getDrMax()) == false)
            return false;
        if (other.getChannelMask() == null ^ this.getChannelMask() == null)
            return false;
        if (other.getChannelMask() != null && other.getChannelMask().equals(this.getChannelMask()) == false)
            return false;
        if (other.getPrAllowed() == null ^ this.getPrAllowed() == null)
            return false;
        if (other.getPrAllowed() != null && other.getPrAllowed().equals(this.getPrAllowed()) == false)
            return false;
        if (other.getHrAllowed() == null ^ this.getHrAllowed() == null)
            return false;
        if (other.getHrAllowed() != null && other.getHrAllowed().equals(this.getHrAllowed()) == false)
            return false;
        if (other.getRaAllowed() == null ^ this.getRaAllowed() == null)
            return false;
        if (other.getRaAllowed() != null && other.getRaAllowed().equals(this.getRaAllowed()) == false)
            return false;
        if (other.getNwkGeoLoc() == null ^ this.getNwkGeoLoc() == null)
            return false;
        if (other.getNwkGeoLoc() != null && other.getNwkGeoLoc().equals(this.getNwkGeoLoc()) == false)
            return false;
        if (other.getTargetPer() == null ^ this.getTargetPer() == null)
            return false;
        if (other.getTargetPer() != null && other.getTargetPer().equals(this.getTargetPer()) == false)
            return false;
        if (other.getMinGwDiversity() == null ^ this.getMinGwDiversity() == null)
            return false;
        if (other.getMinGwDiversity() != null && other.getMinGwDiversity().equals(this.getMinGwDiversity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUlRate() == null) ? 0 : getUlRate().hashCode());
        hashCode = prime * hashCode + ((getUlBucketSize() == null) ? 0 : getUlBucketSize().hashCode());
        hashCode = prime * hashCode + ((getUlRatePolicy() == null) ? 0 : getUlRatePolicy().hashCode());
        hashCode = prime * hashCode + ((getDlRate() == null) ? 0 : getDlRate().hashCode());
        hashCode = prime * hashCode + ((getDlBucketSize() == null) ? 0 : getDlBucketSize().hashCode());
        hashCode = prime * hashCode + ((getDlRatePolicy() == null) ? 0 : getDlRatePolicy().hashCode());
        hashCode = prime * hashCode + ((getAddGwMetadata() == null) ? 0 : getAddGwMetadata().hashCode());
        hashCode = prime * hashCode + ((getDevStatusReqFreq() == null) ? 0 : getDevStatusReqFreq().hashCode());
        hashCode = prime * hashCode + ((getReportDevStatusBattery() == null) ? 0 : getReportDevStatusBattery().hashCode());
        hashCode = prime * hashCode + ((getReportDevStatusMargin() == null) ? 0 : getReportDevStatusMargin().hashCode());
        hashCode = prime * hashCode + ((getDrMin() == null) ? 0 : getDrMin().hashCode());
        hashCode = prime * hashCode + ((getDrMax() == null) ? 0 : getDrMax().hashCode());
        hashCode = prime * hashCode + ((getChannelMask() == null) ? 0 : getChannelMask().hashCode());
        hashCode = prime * hashCode + ((getPrAllowed() == null) ? 0 : getPrAllowed().hashCode());
        hashCode = prime * hashCode + ((getHrAllowed() == null) ? 0 : getHrAllowed().hashCode());
        hashCode = prime * hashCode + ((getRaAllowed() == null) ? 0 : getRaAllowed().hashCode());
        hashCode = prime * hashCode + ((getNwkGeoLoc() == null) ? 0 : getNwkGeoLoc().hashCode());
        hashCode = prime * hashCode + ((getTargetPer() == null) ? 0 : getTargetPer().hashCode());
        hashCode = prime * hashCode + ((getMinGwDiversity() == null) ? 0 : getMinGwDiversity().hashCode());
        return hashCode;
    }

    @Override
    public LoRaWANGetServiceProfileInfo clone() {
        try {
            return (LoRaWANGetServiceProfileInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.LoRaWANGetServiceProfileInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
