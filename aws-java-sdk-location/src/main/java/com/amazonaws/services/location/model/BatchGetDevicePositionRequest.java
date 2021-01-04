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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchGetDevicePosition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDevicePositionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> deviceIds;
    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     */
    private String trackerName;

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Devices whose position you want to retrieve.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *         </p>
     *         </li>
     */

    public java.util.List<String> getDeviceIds() {
        return deviceIds;
    }

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deviceIds
     *        Devices whose position you want to retrieve.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *        </p>
     *        </li>
     */

    public void setDeviceIds(java.util.Collection<String> deviceIds) {
        if (deviceIds == null) {
            this.deviceIds = null;
            return;
        }

        this.deviceIds = new java.util.ArrayList<String>(deviceIds);
    }

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeviceIds(java.util.Collection)} or {@link #withDeviceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deviceIds
     *        Devices whose position you want to retrieve.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionRequest withDeviceIds(String... deviceIds) {
        if (this.deviceIds == null) {
            setDeviceIds(new java.util.ArrayList<String>(deviceIds.length));
        }
        for (String ele : deviceIds) {
            this.deviceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Devices whose position you want to retrieve.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deviceIds
     *        Devices whose position you want to retrieve.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, for two devices: <code>device-ids=DeviceId1&amp;device-ids=DeviceId2</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionRequest withDeviceIds(java.util.Collection<String> deviceIds) {
        setDeviceIds(deviceIds);
        return this;
    }

    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource retrieving the device position.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     * 
     * @return The tracker resource retrieving the device position.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The tracker resource retrieving the device position.
     * </p>
     * 
     * @param trackerName
     *        The tracker resource retrieving the device position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDevicePositionRequest withTrackerName(String trackerName) {
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
        if (getDeviceIds() != null)
            sb.append("DeviceIds: ").append(getDeviceIds()).append(",");
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

        if (obj instanceof BatchGetDevicePositionRequest == false)
            return false;
        BatchGetDevicePositionRequest other = (BatchGetDevicePositionRequest) obj;
        if (other.getDeviceIds() == null ^ this.getDeviceIds() == null)
            return false;
        if (other.getDeviceIds() != null && other.getDeviceIds().equals(this.getDeviceIds()) == false)
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

        hashCode = prime * hashCode + ((getDeviceIds() == null) ? 0 : getDeviceIds().hashCode());
        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDevicePositionRequest clone() {
        return (BatchGetDevicePositionRequest) super.clone();
    }

}
