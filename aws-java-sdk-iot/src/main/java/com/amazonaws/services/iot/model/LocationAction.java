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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Location rule action sends device location updates from an MQTT message to an Amazon Location tracker
 * resource.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocationAction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location resource.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location is updated.
     * </p>
     */
    private String trackerName;
    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The time that the location data was sampled. The default value is the time the MQTT message was processed.
     * </p>
     */
    private LocationTimestamp timestamp;
    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of the device's location.
     * </p>
     */
    private String latitude;
    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude of the device's location.
     * </p>
     */
    private String longitude;

    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location resource.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that grants permission to write to the Amazon Location resource.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location resource.
     * </p>
     * 
     * @return The IAM role that grants permission to write to the Amazon Location resource.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The IAM role that grants permission to write to the Amazon Location resource.
     * </p>
     * 
     * @param roleArn
     *        The IAM role that grants permission to write to the Amazon Location resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationAction withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location is updated.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource in Amazon Location in which the location is updated.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location is updated.
     * </p>
     * 
     * @return The name of the tracker resource in Amazon Location in which the location is updated.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource in Amazon Location in which the location is updated.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource in Amazon Location in which the location is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationAction withTrackerName(String trackerName) {
        setTrackerName(trackerName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     * 
     * @param deviceId
     *        The unique ID of the device providing the location data.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     * 
     * @return The unique ID of the device providing the location data.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The unique ID of the device providing the location data.
     * </p>
     * 
     * @param deviceId
     *        The unique ID of the device providing the location data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationAction withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The time that the location data was sampled. The default value is the time the MQTT message was processed.
     * </p>
     * 
     * @param timestamp
     *        The time that the location data was sampled. The default value is the time the MQTT message was processed.
     */

    public void setTimestamp(LocationTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time that the location data was sampled. The default value is the time the MQTT message was processed.
     * </p>
     * 
     * @return The time that the location data was sampled. The default value is the time the MQTT message was
     *         processed.
     */

    public LocationTimestamp getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time that the location data was sampled. The default value is the time the MQTT message was processed.
     * </p>
     * 
     * @param timestamp
     *        The time that the location data was sampled. The default value is the time the MQTT message was processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationAction withTimestamp(LocationTimestamp timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of the device's location.
     * </p>
     * 
     * @param latitude
     *        A string that evaluates to a double value that represents the latitude of the device's location.
     */

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of the device's location.
     * </p>
     * 
     * @return A string that evaluates to a double value that represents the latitude of the device's location.
     */

    public String getLatitude() {
        return this.latitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the latitude of the device's location.
     * </p>
     * 
     * @param latitude
     *        A string that evaluates to a double value that represents the latitude of the device's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationAction withLatitude(String latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude of the device's location.
     * </p>
     * 
     * @param longitude
     *        A string that evaluates to a double value that represents the longitude of the device's location.
     */

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude of the device's location.
     * </p>
     * 
     * @return A string that evaluates to a double value that represents the longitude of the device's location.
     */

    public String getLongitude() {
        return this.longitude;
    }

    /**
     * <p>
     * A string that evaluates to a double value that represents the longitude of the device's location.
     * </p>
     * 
     * @param longitude
     *        A string that evaluates to a double value that represents the longitude of the device's location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocationAction withLongitude(String longitude) {
        setLongitude(longitude);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName()).append(",");
        if (getDeviceId() != null)
            sb.append("DeviceId: ").append(getDeviceId()).append(",");
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getLatitude() != null)
            sb.append("Latitude: ").append(getLatitude()).append(",");
        if (getLongitude() != null)
            sb.append("Longitude: ").append(getLongitude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LocationAction == false)
            return false;
        LocationAction other = (LocationAction) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getLatitude() == null ^ this.getLatitude() == null)
            return false;
        if (other.getLatitude() != null && other.getLatitude().equals(this.getLatitude()) == false)
            return false;
        if (other.getLongitude() == null ^ this.getLongitude() == null)
            return false;
        if (other.getLongitude() != null && other.getLongitude().equals(this.getLongitude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        return hashCode;
    }

    @Override
    public LocationAction clone() {
        try {
            return (LocationAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.LocationActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
