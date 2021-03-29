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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/PutGeofence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutGeofenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The geofence collection to store the geofence in.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * An identifier for the geofence. For example, <code>ExampleGeofence-1</code>.
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
     * The geofence collection to store the geofence in.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection to store the geofence in.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The geofence collection to store the geofence in.
     * </p>
     * 
     * @return The geofence collection to store the geofence in.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The geofence collection to store the geofence in.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection to store the geofence in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGeofenceRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * An identifier for the geofence. For example, <code>ExampleGeofence-1</code>.
     * </p>
     * 
     * @param geofenceId
     *        An identifier for the geofence. For example, <code>ExampleGeofence-1</code>.
     */

    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * An identifier for the geofence. For example, <code>ExampleGeofence-1</code>.
     * </p>
     * 
     * @return An identifier for the geofence. For example, <code>ExampleGeofence-1</code>.
     */

    public String getGeofenceId() {
        return this.geofenceId;
    }

    /**
     * <p>
     * An identifier for the geofence. For example, <code>ExampleGeofence-1</code>.
     * </p>
     * 
     * @param geofenceId
     *        An identifier for the geofence. For example, <code>ExampleGeofence-1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGeofenceRequest withGeofenceId(String geofenceId) {
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

    public PutGeofenceRequest withGeometry(GeofenceGeometry geometry) {
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
        if (getCollectionName() != null)
            sb.append("CollectionName: ").append(getCollectionName()).append(",");
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

        if (obj instanceof PutGeofenceRequest == false)
            return false;
        PutGeofenceRequest other = (PutGeofenceRequest) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        return hashCode;
    }

    @Override
    public PutGeofenceRequest clone() {
        return (PutGeofenceRequest) super.clone();
    }

}
