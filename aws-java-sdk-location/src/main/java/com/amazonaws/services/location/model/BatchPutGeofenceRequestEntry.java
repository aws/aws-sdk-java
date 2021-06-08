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
 * Contains geofence geometry details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchPutGeofenceRequestEntry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutGeofenceRequestEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence collection.
     * </p>
     */
    private String geofenceId;
    /**
     * <p>
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a
     * href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">geofence
     * polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     */
    private GeofenceGeometry geometry;

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence collection.
     * </p>
     * 
     * @param geofenceId
     *        The identifier for the geofence to be stored in a given geofence collection.
     */

    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence collection.
     * </p>
     * 
     * @return The identifier for the geofence to be stored in a given geofence collection.
     */

    public String getGeofenceId() {
        return this.geofenceId;
    }

    /**
     * <p>
     * The identifier for the geofence to be stored in a given geofence collection.
     * </p>
     * 
     * @param geofenceId
     *        The identifier for the geofence to be stored in a given geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutGeofenceRequestEntry withGeofenceId(String geofenceId) {
        setGeofenceId(geofenceId);
        return this;
    }

    /**
     * <p>
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a
     * href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">geofence
     * polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     * 
     * @param geometry
     *        Contains the polygon details to specify the position of the geofence.</p> <note>
     *        <p>
     *        Each <a
     *        href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *        >geofence polygon</a> can have a maximum of 1,000 vertices.
     *        </p>
     */

    public void setGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a
     * href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">geofence
     * polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     * 
     * @return Contains the polygon details to specify the position of the geofence.</p> <note>
     *         <p>
     *         Each <a
     *         href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *         >geofence polygon</a> can have a maximum of 1,000 vertices.
     *         </p>
     */

    public GeofenceGeometry getGeometry() {
        return this.geometry;
    }

    /**
     * <p>
     * Contains the polygon details to specify the position of the geofence.
     * </p>
     * <note>
     * <p>
     * Each <a
     * href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">geofence
     * polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     * 
     * @param geometry
     *        Contains the polygon details to specify the position of the geofence.</p> <note>
     *        <p>
     *        Each <a
     *        href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html"
     *        >geofence polygon</a> can have a maximum of 1,000 vertices.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutGeofenceRequestEntry withGeometry(GeofenceGeometry geometry) {
        setGeometry(geometry);
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
        if (getGeofenceId() != null)
            sb.append("GeofenceId: ").append(getGeofenceId()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutGeofenceRequestEntry == false)
            return false;
        BatchPutGeofenceRequestEntry other = (BatchPutGeofenceRequestEntry) obj;
        if (other.getGeofenceId() == null ^ this.getGeofenceId() == null)
            return false;
        if (other.getGeofenceId() != null && other.getGeofenceId().equals(this.getGeofenceId()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutGeofenceRequestEntry clone() {
        try {
            return (BatchPutGeofenceRequestEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.BatchPutGeofenceRequestEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
