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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchUpdateDevicePosition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateDevicePositionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     */
    private String trackerName;
    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     */
    private java.util.List<DevicePositionUpdate> updates;

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to update.
     */

    public void setTrackerName(String trackerName) {
        this.trackerName = trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @return The name of the tracker resource to update.
     */

    public String getTrackerName() {
        return this.trackerName;
    }

    /**
     * <p>
     * The name of the tracker resource to update.
     * </p>
     * 
     * @param trackerName
     *        The name of the tracker resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateDevicePositionRequest withTrackerName(String trackerName) {
        setTrackerName(trackerName);
        return this;
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     * 
     * @return Contains the position update details for each device.
     */

    public java.util.List<DevicePositionUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     * 
     * @param updates
     *        Contains the position update details for each device.
     */

    public void setUpdates(java.util.Collection<DevicePositionUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<DevicePositionUpdate>(updates);
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdates(java.util.Collection)} or {@link #withUpdates(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param updates
     *        Contains the position update details for each device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateDevicePositionRequest withUpdates(DevicePositionUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<DevicePositionUpdate>(updates.length));
        }
        for (DevicePositionUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the position update details for each device.
     * </p>
     * 
     * @param updates
     *        Contains the position update details for each device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateDevicePositionRequest withUpdates(java.util.Collection<DevicePositionUpdate> updates) {
        setUpdates(updates);
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
        if (getTrackerName() != null)
            sb.append("TrackerName: ").append(getTrackerName()).append(",");
        if (getUpdates() != null)
            sb.append("Updates: ").append(getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateDevicePositionRequest == false)
            return false;
        BatchUpdateDevicePositionRequest other = (BatchUpdateDevicePositionRequest) obj;
        if (other.getTrackerName() == null ^ this.getTrackerName() == null)
            return false;
        if (other.getTrackerName() != null && other.getTrackerName().equals(this.getTrackerName()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrackerName() == null) ? 0 : getTrackerName().hashCode());
        hashCode = prime * hashCode + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateDevicePositionRequest clone() {
        return (BatchUpdateDevicePositionRequest) super.clone();
    }

}
