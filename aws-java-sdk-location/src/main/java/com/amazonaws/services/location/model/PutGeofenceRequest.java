/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Associates one of more properties with the geofence. A property is a key-value pair stored with the geofence and
     * added to any geofence event triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     */
    private java.util.Map<String, String> geofenceProperties;
    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be either a polygon or a circle. Including both
     * will return a validation error.
     * </p>
     * <note>
     * <p>
     * Each <a href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">
     * geofence polygon</a> can have a maximum of 1,000 vertices.
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
     * Associates one of more properties with the geofence. A property is a key-value pair stored with the geofence and
     * added to any geofence event triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * 
     * @return Associates one of more properties with the geofence. A property is a key-value pair stored with the
     *         geofence and added to any geofence event triggered with that geofence.</p>
     *         <p>
     *         Format: <code>"key" : "value"</code>
     */

    public java.util.Map<String, String> getGeofenceProperties() {
        return geofenceProperties;
    }

    /**
     * <p>
     * Associates one of more properties with the geofence. A property is a key-value pair stored with the geofence and
     * added to any geofence event triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * 
     * @param geofenceProperties
     *        Associates one of more properties with the geofence. A property is a key-value pair stored with the
     *        geofence and added to any geofence event triggered with that geofence.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     */

    public void setGeofenceProperties(java.util.Map<String, String> geofenceProperties) {
        this.geofenceProperties = geofenceProperties;
    }

    /**
     * <p>
     * Associates one of more properties with the geofence. A property is a key-value pair stored with the geofence and
     * added to any geofence event triggered with that geofence.
     * </p>
     * <p>
     * Format: <code>"key" : "value"</code>
     * </p>
     * 
     * @param geofenceProperties
     *        Associates one of more properties with the geofence. A property is a key-value pair stored with the
     *        geofence and added to any geofence event triggered with that geofence.</p>
     *        <p>
     *        Format: <code>"key" : "value"</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGeofenceRequest withGeofenceProperties(java.util.Map<String, String> geofenceProperties) {
        setGeofenceProperties(geofenceProperties);
        return this;
    }

    /**
     * Add a single GeofenceProperties entry
     *
     * @see PutGeofenceRequest#withGeofenceProperties
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PutGeofenceRequest addGeofencePropertiesEntry(String key, String value) {
        if (null == this.geofenceProperties) {
            this.geofenceProperties = new java.util.HashMap<String, String>();
        }
        if (this.geofenceProperties.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.geofenceProperties.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into GeofenceProperties.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutGeofenceRequest clearGeofencePropertiesEntries() {
        this.geofenceProperties = null;
        return this;
    }

    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be either a polygon or a circle. Including both
     * will return a validation error.
     * </p>
     * <note>
     * <p>
     * Each <a href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">
     * geofence polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     * 
     * @param geometry
     *        Contains the details to specify the position of the geofence. Can be either a polygon or a circle.
     *        Including both will return a validation error.</p> <note>
     *        <p>
     *        Each <a
     *        href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">
     *        geofence polygon</a> can have a maximum of 1,000 vertices.
     *        </p>
     */

    public void setGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be either a polygon or a circle. Including both
     * will return a validation error.
     * </p>
     * <note>
     * <p>
     * Each <a href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">
     * geofence polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     * 
     * @return Contains the details to specify the position of the geofence. Can be either a polygon or a circle.
     *         Including both will return a validation error.</p> <note>
     *         <p>
     *         Each <a
     *         href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">
     *         geofence polygon</a> can have a maximum of 1,000 vertices.
     *         </p>
     */

    public GeofenceGeometry getGeometry() {
        return this.geometry;
    }

    /**
     * <p>
     * Contains the details to specify the position of the geofence. Can be either a polygon or a circle. Including both
     * will return a validation error.
     * </p>
     * <note>
     * <p>
     * Each <a href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">
     * geofence polygon</a> can have a maximum of 1,000 vertices.
     * </p>
     * </note>
     * 
     * @param geometry
     *        Contains the details to specify the position of the geofence. Can be either a polygon or a circle.
     *        Including both will return a validation error.</p> <note>
     *        <p>
     *        Each <a
     *        href="https://docs.aws.amazon.com/location-geofences/latest/APIReference/API_GeofenceGeometry.html">
     *        geofence polygon</a> can have a maximum of 1,000 vertices.
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
        if (getGeofenceProperties() != null)
            sb.append("GeofenceProperties: ").append("***Sensitive Data Redacted***").append(",");
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
        if (other.getGeofenceProperties() == null ^ this.getGeofenceProperties() == null)
            return false;
        if (other.getGeofenceProperties() != null && other.getGeofenceProperties().equals(this.getGeofenceProperties()) == false)
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
        hashCode = prime * hashCode + ((getGeofenceProperties() == null) ? 0 : getGeofenceProperties().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        return hashCode;
    }

    @Override
    public PutGeofenceRequest clone() {
        return (PutGeofenceRequest) super.clone();
    }

}
