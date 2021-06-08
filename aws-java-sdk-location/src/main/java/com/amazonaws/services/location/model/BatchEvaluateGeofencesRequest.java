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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchEvaluateGeofences" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchEvaluateGeofencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The geofence collection used in evaluating the position of devices against its geofences.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * Contains device details for each device to be evaluated against the given geofence collection.
     * </p>
     */
    private java.util.List<DevicePositionUpdate> devicePositionUpdates;

    /**
     * <p>
     * The geofence collection used in evaluating the position of devices against its geofences.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection used in evaluating the position of devices against its geofences.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The geofence collection used in evaluating the position of devices against its geofences.
     * </p>
     * 
     * @return The geofence collection used in evaluating the position of devices against its geofences.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The geofence collection used in evaluating the position of devices against its geofences.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection used in evaluating the position of devices against its geofences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateGeofencesRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given geofence collection.
     * </p>
     * 
     * @return Contains device details for each device to be evaluated against the given geofence collection.
     */

    public java.util.List<DevicePositionUpdate> getDevicePositionUpdates() {
        return devicePositionUpdates;
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given geofence collection.
     * </p>
     * 
     * @param devicePositionUpdates
     *        Contains device details for each device to be evaluated against the given geofence collection.
     */

    public void setDevicePositionUpdates(java.util.Collection<DevicePositionUpdate> devicePositionUpdates) {
        if (devicePositionUpdates == null) {
            this.devicePositionUpdates = null;
            return;
        }

        this.devicePositionUpdates = new java.util.ArrayList<DevicePositionUpdate>(devicePositionUpdates);
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given geofence collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDevicePositionUpdates(java.util.Collection)} or
     * {@link #withDevicePositionUpdates(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param devicePositionUpdates
     *        Contains device details for each device to be evaluated against the given geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateGeofencesRequest withDevicePositionUpdates(DevicePositionUpdate... devicePositionUpdates) {
        if (this.devicePositionUpdates == null) {
            setDevicePositionUpdates(new java.util.ArrayList<DevicePositionUpdate>(devicePositionUpdates.length));
        }
        for (DevicePositionUpdate ele : devicePositionUpdates) {
            this.devicePositionUpdates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains device details for each device to be evaluated against the given geofence collection.
     * </p>
     * 
     * @param devicePositionUpdates
     *        Contains device details for each device to be evaluated against the given geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchEvaluateGeofencesRequest withDevicePositionUpdates(java.util.Collection<DevicePositionUpdate> devicePositionUpdates) {
        setDevicePositionUpdates(devicePositionUpdates);
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
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
        if (getDevicePositionUpdates() != null)
            sb.append("DevicePositionUpdates: ").append(getDevicePositionUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchEvaluateGeofencesRequest == false)
            return false;
        BatchEvaluateGeofencesRequest other = (BatchEvaluateGeofencesRequest) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getDevicePositionUpdates() == null ^ this.getDevicePositionUpdates() == null)
            return false;
        if (other.getDevicePositionUpdates() != null && other.getDevicePositionUpdates().equals(this.getDevicePositionUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getDevicePositionUpdates() == null) ? 0 : getDevicePositionUpdates().hashCode());
        return hashCode;
    }

    @Override
    public BatchEvaluateGeofencesRequest clone() {
        return (BatchEvaluateGeofencesRequest) super.clone();
    }

}
