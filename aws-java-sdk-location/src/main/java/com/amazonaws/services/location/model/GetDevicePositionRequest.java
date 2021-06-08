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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetDevicePosition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDevicePositionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The device whose position you want to retrieve.
     * </p>
     */
    private String deviceId;
    /**
     * <p>
     * The tracker resource receiving the position update.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * The device whose position you want to retrieve.
     * </p>
     * 
     * @param deviceId
     *        The device whose position you want to retrieve.
     */

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * <p>
     * The device whose position you want to retrieve.
     * </p>
     * 
     * @return The device whose position you want to retrieve.
     */

    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * <p>
     * The device whose position you want to retrieve.
     * </p>
     * 
     * @param deviceId
     *        The device whose position you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionRequest withDeviceId(String deviceId) {
        setDeviceId(deviceId);
        return this;
    }

    /**
     * <p>
     * The tracker resource receiving the position update.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource receiving the position update.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The tracker resource receiving the position update.
     * </p>
     * 
     * @return The tracker resource receiving the position update.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The tracker resource receiving the position update.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource receiving the position update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDevicePositionRequest withTrackerName(String trackerName) {
        setTrackerName(trackerName);
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
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDevicePositionRequest == false)
            return false;
        GetDevicePositionRequest other = (GetDevicePositionRequest) obj;
        if (other.getDeviceId() == null ^ this.getDeviceId() == null)
            return false;
        if (other.getDeviceId() != null && other.getDeviceId().equals(this.getDeviceId()) == false)
            return false;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public GetDevicePositionRequest clone() {
        return (GetDevicePositionRequest) super.clone();
    }

}
