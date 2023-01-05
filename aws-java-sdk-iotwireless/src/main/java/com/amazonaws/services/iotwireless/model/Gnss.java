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
 * Global navigation satellite system (GNSS) object used for positioning.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/Gnss" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Gnss implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
     * </p>
     */
    private String payload;
    /**
     * <p>
     * Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds GPS
     * time (GPST). If capture time is not specified, the local server time is used.
     * </p>
     */
    private Float captureTime;
    /**
     * <p>
     * Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not
     * specified, default value of 300 is used.
     * </p>
     */
    private Float captureTimeAccuracy;
    /**
     * <p>
     * Optional assistance position information, specified using latitude and longitude values in degrees. The
     * co-ordinates are inside the WGS84 reference frame.
     * </p>
     */
    private java.util.List<Float> assistPosition;
    /**
     * <p>
     * Optional assistance altitude, which is the altitude of the device at capture time, specified in meters above the
     * WGS84 reference ellipsoid.
     * </p>
     */
    private Float assistAltitude;
    /**
     * <p>
     * Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution problem. When
     * this parameter is specified, the assistance altitude should have an accuracy of at least 10 meters.
     * </p>
     */
    private Boolean use2DSolver;

    /**
     * <p>
     * Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
     * </p>
     * 
     * @param payload
     *        Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
     */

    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
     * </p>
     * 
     * @return Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
     */

    public String getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
     * </p>
     * 
     * @param payload
     *        Payload that contains the GNSS scan result, or NAV message, in hexadecimal notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gnss withPayload(String payload) {
        setPayload(payload);
        return this;
    }

    /**
     * <p>
     * Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds GPS
     * time (GPST). If capture time is not specified, the local server time is used.
     * </p>
     * 
     * @param captureTime
     *        Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds
     *        GPS time (GPST). If capture time is not specified, the local server time is used.
     */

    public void setCaptureTime(Float captureTime) {
        this.captureTime = captureTime;
    }

    /**
     * <p>
     * Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds GPS
     * time (GPST). If capture time is not specified, the local server time is used.
     * </p>
     * 
     * @return Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds
     *         GPS time (GPST). If capture time is not specified, the local server time is used.
     */

    public Float getCaptureTime() {
        return this.captureTime;
    }

    /**
     * <p>
     * Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds GPS
     * time (GPST). If capture time is not specified, the local server time is used.
     * </p>
     * 
     * @param captureTime
     *        Optional parameter that gives an estimate of the time when the GNSS scan information is taken, in seconds
     *        GPS time (GPST). If capture time is not specified, the local server time is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gnss withCaptureTime(Float captureTime) {
        setCaptureTime(captureTime);
        return this;
    }

    /**
     * <p>
     * Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not
     * specified, default value of 300 is used.
     * </p>
     * 
     * @param captureTimeAccuracy
     *        Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not
     *        specified, default value of 300 is used.
     */

    public void setCaptureTimeAccuracy(Float captureTimeAccuracy) {
        this.captureTimeAccuracy = captureTimeAccuracy;
    }

    /**
     * <p>
     * Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not
     * specified, default value of 300 is used.
     * </p>
     * 
     * @return Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not
     *         specified, default value of 300 is used.
     */

    public Float getCaptureTimeAccuracy() {
        return this.captureTimeAccuracy;
    }

    /**
     * <p>
     * Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not
     * specified, default value of 300 is used.
     * </p>
     * 
     * @param captureTimeAccuracy
     *        Optional value that gives the capture time estimate accuracy, in seconds. If capture time accuracy is not
     *        specified, default value of 300 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gnss withCaptureTimeAccuracy(Float captureTimeAccuracy) {
        setCaptureTimeAccuracy(captureTimeAccuracy);
        return this;
    }

    /**
     * <p>
     * Optional assistance position information, specified using latitude and longitude values in degrees. The
     * co-ordinates are inside the WGS84 reference frame.
     * </p>
     * 
     * @return Optional assistance position information, specified using latitude and longitude values in degrees. The
     *         co-ordinates are inside the WGS84 reference frame.
     */

    public java.util.List<Float> getAssistPosition() {
        return assistPosition;
    }

    /**
     * <p>
     * Optional assistance position information, specified using latitude and longitude values in degrees. The
     * co-ordinates are inside the WGS84 reference frame.
     * </p>
     * 
     * @param assistPosition
     *        Optional assistance position information, specified using latitude and longitude values in degrees. The
     *        co-ordinates are inside the WGS84 reference frame.
     */

    public void setAssistPosition(java.util.Collection<Float> assistPosition) {
        if (assistPosition == null) {
            this.assistPosition = null;
            return;
        }

        this.assistPosition = new java.util.ArrayList<Float>(assistPosition);
    }

    /**
     * <p>
     * Optional assistance position information, specified using latitude and longitude values in degrees. The
     * co-ordinates are inside the WGS84 reference frame.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssistPosition(java.util.Collection)} or {@link #withAssistPosition(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param assistPosition
     *        Optional assistance position information, specified using latitude and longitude values in degrees. The
     *        co-ordinates are inside the WGS84 reference frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gnss withAssistPosition(Float... assistPosition) {
        if (this.assistPosition == null) {
            setAssistPosition(new java.util.ArrayList<Float>(assistPosition.length));
        }
        for (Float ele : assistPosition) {
            this.assistPosition.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional assistance position information, specified using latitude and longitude values in degrees. The
     * co-ordinates are inside the WGS84 reference frame.
     * </p>
     * 
     * @param assistPosition
     *        Optional assistance position information, specified using latitude and longitude values in degrees. The
     *        co-ordinates are inside the WGS84 reference frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gnss withAssistPosition(java.util.Collection<Float> assistPosition) {
        setAssistPosition(assistPosition);
        return this;
    }

    /**
     * <p>
     * Optional assistance altitude, which is the altitude of the device at capture time, specified in meters above the
     * WGS84 reference ellipsoid.
     * </p>
     * 
     * @param assistAltitude
     *        Optional assistance altitude, which is the altitude of the device at capture time, specified in meters
     *        above the WGS84 reference ellipsoid.
     */

    public void setAssistAltitude(Float assistAltitude) {
        this.assistAltitude = assistAltitude;
    }

    /**
     * <p>
     * Optional assistance altitude, which is the altitude of the device at capture time, specified in meters above the
     * WGS84 reference ellipsoid.
     * </p>
     * 
     * @return Optional assistance altitude, which is the altitude of the device at capture time, specified in meters
     *         above the WGS84 reference ellipsoid.
     */

    public Float getAssistAltitude() {
        return this.assistAltitude;
    }

    /**
     * <p>
     * Optional assistance altitude, which is the altitude of the device at capture time, specified in meters above the
     * WGS84 reference ellipsoid.
     * </p>
     * 
     * @param assistAltitude
     *        Optional assistance altitude, which is the altitude of the device at capture time, specified in meters
     *        above the WGS84 reference ellipsoid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gnss withAssistAltitude(Float assistAltitude) {
        setAssistAltitude(assistAltitude);
        return this;
    }

    /**
     * <p>
     * Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution problem. When
     * this parameter is specified, the assistance altitude should have an accuracy of at least 10 meters.
     * </p>
     * 
     * @param use2DSolver
     *        Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution
     *        problem. When this parameter is specified, the assistance altitude should have an accuracy of at least 10
     *        meters.
     */

    public void setUse2DSolver(Boolean use2DSolver) {
        this.use2DSolver = use2DSolver;
    }

    /**
     * <p>
     * Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution problem. When
     * this parameter is specified, the assistance altitude should have an accuracy of at least 10 meters.
     * </p>
     * 
     * @return Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution
     *         problem. When this parameter is specified, the assistance altitude should have an accuracy of at least 10
     *         meters.
     */

    public Boolean getUse2DSolver() {
        return this.use2DSolver;
    }

    /**
     * <p>
     * Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution problem. When
     * this parameter is specified, the assistance altitude should have an accuracy of at least 10 meters.
     * </p>
     * 
     * @param use2DSolver
     *        Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution
     *        problem. When this parameter is specified, the assistance altitude should have an accuracy of at least 10
     *        meters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Gnss withUse2DSolver(Boolean use2DSolver) {
        setUse2DSolver(use2DSolver);
        return this;
    }

    /**
     * <p>
     * Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution problem. When
     * this parameter is specified, the assistance altitude should have an accuracy of at least 10 meters.
     * </p>
     * 
     * @return Optional parameter that forces 2D solve, which modifies the positioning algorithm to a 2D solution
     *         problem. When this parameter is specified, the assistance altitude should have an accuracy of at least 10
     *         meters.
     */

    public Boolean isUse2DSolver() {
        return this.use2DSolver;
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
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getCaptureTime() != null)
            sb.append("CaptureTime: ").append(getCaptureTime()).append(",");
        if (getCaptureTimeAccuracy() != null)
            sb.append("CaptureTimeAccuracy: ").append(getCaptureTimeAccuracy()).append(",");
        if (getAssistPosition() != null)
            sb.append("AssistPosition: ").append(getAssistPosition()).append(",");
        if (getAssistAltitude() != null)
            sb.append("AssistAltitude: ").append(getAssistAltitude()).append(",");
        if (getUse2DSolver() != null)
            sb.append("Use2DSolver: ").append(getUse2DSolver());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Gnss == false)
            return false;
        Gnss other = (Gnss) obj;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getCaptureTime() == null ^ this.getCaptureTime() == null)
            return false;
        if (other.getCaptureTime() != null && other.getCaptureTime().equals(this.getCaptureTime()) == false)
            return false;
        if (other.getCaptureTimeAccuracy() == null ^ this.getCaptureTimeAccuracy() == null)
            return false;
        if (other.getCaptureTimeAccuracy() != null && other.getCaptureTimeAccuracy().equals(this.getCaptureTimeAccuracy()) == false)
            return false;
        if (other.getAssistPosition() == null ^ this.getAssistPosition() == null)
            return false;
        if (other.getAssistPosition() != null && other.getAssistPosition().equals(this.getAssistPosition()) == false)
            return false;
        if (other.getAssistAltitude() == null ^ this.getAssistAltitude() == null)
            return false;
        if (other.getAssistAltitude() != null && other.getAssistAltitude().equals(this.getAssistAltitude()) == false)
            return false;
        if (other.getUse2DSolver() == null ^ this.getUse2DSolver() == null)
            return false;
        if (other.getUse2DSolver() != null && other.getUse2DSolver().equals(this.getUse2DSolver()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getCaptureTime() == null) ? 0 : getCaptureTime().hashCode());
        hashCode = prime * hashCode + ((getCaptureTimeAccuracy() == null) ? 0 : getCaptureTimeAccuracy().hashCode());
        hashCode = prime * hashCode + ((getAssistPosition() == null) ? 0 : getAssistPosition().hashCode());
        hashCode = prime * hashCode + ((getAssistAltitude() == null) ? 0 : getAssistAltitude().hashCode());
        hashCode = prime * hashCode + ((getUse2DSolver() == null) ? 0 : getUse2DSolver().hashCode());
        return hashCode;
    }

    @Override
    public Gnss clone() {
        try {
            return (Gnss) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotwireless.model.transform.GnssMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
