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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionEstimate" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPositionEstimateRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE's
     * Wi-Fi based solver.
     * </p>
     */
    private java.util.List<WiFiAccessPoint> wiFiAccessPoints;
    /**
     * <p>
     * Retrieves an estimated device position by resolving measurement data from cellular radio towers. The position is
     * resolved using HERE's cellular-based solver.
     * </p>
     */
    private CellTowers cellTowers;
    /**
     * <p>
     * Retrieves an estimated device position by resolving the IP address information from the device. The position is
     * resolved using MaxMind's IP-based solver.
     * </p>
     */
    private Ip ip;
    /**
     * <p>
     * Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan data. The
     * position is resolved using the GNSS solver powered by LoRa Cloud.
     * </p>
     */
    private Gnss gnss;
    /**
     * <p>
     * Optional information that specifies the time when the position information will be resolved. It uses the UNIX
     * timestamp format. If not specified, the time at which the request was received will be used.
     * </p>
     */
    private java.util.Date timestamp;

    /**
     * <p>
     * Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE's
     * Wi-Fi based solver.
     * </p>
     * 
     * @return Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using
     *         HERE's Wi-Fi based solver.
     */

    public java.util.List<WiFiAccessPoint> getWiFiAccessPoints() {
        return wiFiAccessPoints;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE's
     * Wi-Fi based solver.
     * </p>
     * 
     * @param wiFiAccessPoints
     *        Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using
     *        HERE's Wi-Fi based solver.
     */

    public void setWiFiAccessPoints(java.util.Collection<WiFiAccessPoint> wiFiAccessPoints) {
        if (wiFiAccessPoints == null) {
            this.wiFiAccessPoints = null;
            return;
        }

        this.wiFiAccessPoints = new java.util.ArrayList<WiFiAccessPoint>(wiFiAccessPoints);
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE's
     * Wi-Fi based solver.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWiFiAccessPoints(java.util.Collection)} or {@link #withWiFiAccessPoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param wiFiAccessPoints
     *        Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using
     *        HERE's Wi-Fi based solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionEstimateRequest withWiFiAccessPoints(WiFiAccessPoint... wiFiAccessPoints) {
        if (this.wiFiAccessPoints == null) {
            setWiFiAccessPoints(new java.util.ArrayList<WiFiAccessPoint>(wiFiAccessPoints.length));
        }
        for (WiFiAccessPoint ele : wiFiAccessPoints) {
            this.wiFiAccessPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using HERE's
     * Wi-Fi based solver.
     * </p>
     * 
     * @param wiFiAccessPoints
     *        Retrieves an estimated device position by resolving WLAN measurement data. The position is resolved using
     *        HERE's Wi-Fi based solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionEstimateRequest withWiFiAccessPoints(java.util.Collection<WiFiAccessPoint> wiFiAccessPoints) {
        setWiFiAccessPoints(wiFiAccessPoints);
        return this;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving measurement data from cellular radio towers. The position is
     * resolved using HERE's cellular-based solver.
     * </p>
     * 
     * @param cellTowers
     *        Retrieves an estimated device position by resolving measurement data from cellular radio towers. The
     *        position is resolved using HERE's cellular-based solver.
     */

    public void setCellTowers(CellTowers cellTowers) {
        this.cellTowers = cellTowers;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving measurement data from cellular radio towers. The position is
     * resolved using HERE's cellular-based solver.
     * </p>
     * 
     * @return Retrieves an estimated device position by resolving measurement data from cellular radio towers. The
     *         position is resolved using HERE's cellular-based solver.
     */

    public CellTowers getCellTowers() {
        return this.cellTowers;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving measurement data from cellular radio towers. The position is
     * resolved using HERE's cellular-based solver.
     * </p>
     * 
     * @param cellTowers
     *        Retrieves an estimated device position by resolving measurement data from cellular radio towers. The
     *        position is resolved using HERE's cellular-based solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionEstimateRequest withCellTowers(CellTowers cellTowers) {
        setCellTowers(cellTowers);
        return this;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving the IP address information from the device. The position is
     * resolved using MaxMind's IP-based solver.
     * </p>
     * 
     * @param ip
     *        Retrieves an estimated device position by resolving the IP address information from the device. The
     *        position is resolved using MaxMind's IP-based solver.
     */

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving the IP address information from the device. The position is
     * resolved using MaxMind's IP-based solver.
     * </p>
     * 
     * @return Retrieves an estimated device position by resolving the IP address information from the device. The
     *         position is resolved using MaxMind's IP-based solver.
     */

    public Ip getIp() {
        return this.ip;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving the IP address information from the device. The position is
     * resolved using MaxMind's IP-based solver.
     * </p>
     * 
     * @param ip
     *        Retrieves an estimated device position by resolving the IP address information from the device. The
     *        position is resolved using MaxMind's IP-based solver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionEstimateRequest withIp(Ip ip) {
        setIp(ip);
        return this;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan data. The
     * position is resolved using the GNSS solver powered by LoRa Cloud.
     * </p>
     * 
     * @param gnss
     *        Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan
     *        data. The position is resolved using the GNSS solver powered by LoRa Cloud.
     */

    public void setGnss(Gnss gnss) {
        this.gnss = gnss;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan data. The
     * position is resolved using the GNSS solver powered by LoRa Cloud.
     * </p>
     * 
     * @return Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan
     *         data. The position is resolved using the GNSS solver powered by LoRa Cloud.
     */

    public Gnss getGnss() {
        return this.gnss;
    }

    /**
     * <p>
     * Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan data. The
     * position is resolved using the GNSS solver powered by LoRa Cloud.
     * </p>
     * 
     * @param gnss
     *        Retrieves an estimated device position by resolving the global navigation satellite system (GNSS) scan
     *        data. The position is resolved using the GNSS solver powered by LoRa Cloud.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionEstimateRequest withGnss(Gnss gnss) {
        setGnss(gnss);
        return this;
    }

    /**
     * <p>
     * Optional information that specifies the time when the position information will be resolved. It uses the UNIX
     * timestamp format. If not specified, the time at which the request was received will be used.
     * </p>
     * 
     * @param timestamp
     *        Optional information that specifies the time when the position information will be resolved. It uses the
     *        UNIX timestamp format. If not specified, the time at which the request was received will be used.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Optional information that specifies the time when the position information will be resolved. It uses the UNIX
     * timestamp format. If not specified, the time at which the request was received will be used.
     * </p>
     * 
     * @return Optional information that specifies the time when the position information will be resolved. It uses the
     *         UNIX timestamp format. If not specified, the time at which the request was received will be used.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Optional information that specifies the time when the position information will be resolved. It uses the UNIX
     * timestamp format. If not specified, the time at which the request was received will be used.
     * </p>
     * 
     * @param timestamp
     *        Optional information that specifies the time when the position information will be resolved. It uses the
     *        UNIX timestamp format. If not specified, the time at which the request was received will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionEstimateRequest withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
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
        if (getWiFiAccessPoints() != null)
            sb.append("WiFiAccessPoints: ").append(getWiFiAccessPoints()).append(",");
        if (getCellTowers() != null)
            sb.append("CellTowers: ").append(getCellTowers()).append(",");
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getGnss() != null)
            sb.append("Gnss: ").append(getGnss()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPositionEstimateRequest == false)
            return false;
        GetPositionEstimateRequest other = (GetPositionEstimateRequest) obj;
        if (other.getWiFiAccessPoints() == null ^ this.getWiFiAccessPoints() == null)
            return false;
        if (other.getWiFiAccessPoints() != null && other.getWiFiAccessPoints().equals(this.getWiFiAccessPoints()) == false)
            return false;
        if (other.getCellTowers() == null ^ this.getCellTowers() == null)
            return false;
        if (other.getCellTowers() != null && other.getCellTowers().equals(this.getCellTowers()) == false)
            return false;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getGnss() == null ^ this.getGnss() == null)
            return false;
        if (other.getGnss() != null && other.getGnss().equals(this.getGnss()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWiFiAccessPoints() == null) ? 0 : getWiFiAccessPoints().hashCode());
        hashCode = prime * hashCode + ((getCellTowers() == null) ? 0 : getCellTowers().hashCode());
        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getGnss() == null) ? 0 : getGnss().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetPositionEstimateRequest clone() {
        return (GetPositionEstimateRequest) super.clone();
    }

}
