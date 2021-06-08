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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the device position details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/DevicePosition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DevicePosition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The device whose position you retrieved.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The last known device position.
     * </p>
     */
    private java.util.List<Double> position;
    /**
     * <p>
     * The timestamp for when the tracker resource received the device position in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date receivedTime;
    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     */
    private java.util.Date sampleTime;

    /**
     * <p>
     * The device whose position you retrieved.
     * </p>
     * 
     * @param deviceId
     *        The device whose position you retrieved.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device whose position you retrieved.
     * </p>
     * 
     * @return The device whose position you retrieved.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device whose position you retrieved.
     * </p>
     * 
     * @param deviceId
     *        The device whose position you retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePosition withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     * 
     * @return The last known device position.
     */

    public java.util.List<Double> getPosition() {
        return position;
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     * 
     * @param position
     *        The last known device position.
     */

    public void setPosition(java.util.Collection<Double> position) {
        if (position == null) {
            this.position = null;
            return;
        }

        this.position = new java.util.ArrayList<Double>(position);
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPosition(java.util.Collection)} or {@link #withPosition(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param position
     *        The last known device position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePosition withPosition(Double... position) {
        if (this.position == null) {
            setPosition(new java.util.ArrayList<Double>(position.length));
        }
        for (Double ele : position) {
            this.position.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The last known device position.
     * </p>
     * 
     * @param position
     *        The last known device position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePosition withPosition(java.util.Collection<Double> position) {
        setPosition(position);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource received the device position in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param receivedTime
     *        The timestamp for when the tracker resource received the device position in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setReceivedTime(java.util.Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource received the device position in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp for when the tracker resource received the device position in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getReceivedTime() {
        return this.receivedTime;
    }

    /**
     * <p>
     * The timestamp for when the tracker resource received the device position in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param receivedTime
     *        The timestamp for when the tracker resource received the device position in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePosition withReceivedTime(java.util.Date receivedTime) {
        setReceivedTime(receivedTime);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param sampleTime
     *        The timestamp at which the device's position was determined. Uses <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public void setSampleTime(java.util.Date sampleTime) {
        this.sampleTime = sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @return The timestamp at which the device's position was determined. Uses <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     */

    public java.util.Date getSampleTime() {
        return this.sampleTime;
    }

    /**
     * <p>
     * The timestamp at which the device's position was determined. Uses <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * </p>
     * 
     * @param sampleTime
     *        The timestamp at which the device's position was determined. Uses <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html"> ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DevicePosition withSampleTime(java.util.Date sampleTime) {
        setSampleTime(sampleTime);
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
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append("***Sensitive Data Redacted***").append(",");
        if (getReceivedTime() != null)
            sb.append("ReceivedTime: ").append(getReceivedTime()).append(",");
        if (getSampleTime() != null)
            sb.append("SampleTime: ").append(getSampleTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DevicePosition == false)
            return false;
        DevicePosition other = (DevicePosition) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getReceivedTime() == null ^ this.getReceivedTime() == null)
            return false;
        if (other.getReceivedTime() != null && other.getReceivedTime().equals(this.getReceivedTime()) == false)
            return false;
        if (other.getSampleTime() == null ^ this.getSampleTime() == null)
            return false;
        if (other.getSampleTime() != null && other.getSampleTime().equals(this.getSampleTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getReceivedTime() == null) ? 0 : getReceivedTime().hashCode());
        hashCode = prime * hashCode + ((getSampleTime() == null) ? 0 : getSampleTime().hashCode());
        return hashCode;
    }

    @Override
    public DevicePosition clone() {
        try {
            return (DevicePosition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.DevicePositionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
