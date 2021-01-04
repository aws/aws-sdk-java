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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetGeofence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeofenceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The geofence identifier.
     * </p>
     */
    private String geofenceId;
    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
     * </p>
     */
    private GeofenceGeometry geometry;
    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system index.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the geofence collection was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @return The timestamp for when the geofence collection was created in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was created in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param createTime
     *        The timestamp for when the geofence collection was created in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeofenceResult withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The geofence identifier.
     * </p>
     * 
     * @param geofenceId
     *        The geofence identifier.
     */

    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * The geofence identifier.
     * </p>
     * 
     * @return The geofence identifier.
     */

    public String getGeofenceId() {
        return this.geofenceId;
    }

    /**
     * <p>
     * The geofence identifier.
     * </p>
     * 
     * @param geofenceId
     *        The geofence identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeofenceResult withGeofenceId(String geofenceId) {
        setGeofenceId(geofenceId);
        return this;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
     * </p>
     * 
     * @param geometry
     *        Contains the geofence geometry details describing a polygon.
     */

    public void setGeometry(GeofenceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
     * </p>
     * 
     * @return Contains the geofence geometry details describing a polygon.
     */

    public GeofenceGeometry getGeometry() {
        return this.geometry;
    }

    /**
     * <p>
     * Contains the geofence geometry details describing a polygon.
     * </p>
     * 
     * @param geometry
     *        Contains the geofence geometry details describing a polygon.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeofenceResult withGeometry(GeofenceGeometry geometry) {
        setGeometry(geometry);
        return this;
    }

    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system index.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Identifies the state of the geofence. A geofence will hold one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> — The geofence has been indexed by the system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> — The geofence is being processed by the system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> — The geofence failed to be indexed by the system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> — The geofence has been deleted from the system index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> — The geofence is being deleted from the system index.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system index.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Identifies the state of the geofence. A geofence will hold one of the following states:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> — The geofence has been indexed by the system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> — The geofence is being processed by the system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> — The geofence failed to be indexed by the system.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETED</code> — The geofence has been deleted from the system index.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> — The geofence is being deleted from the system index.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Identifies the state of the geofence. A geofence will hold one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code> — The geofence has been indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> — The geofence is being processed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> — The geofence failed to be indexed by the system.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETED</code> — The geofence has been deleted from the system index.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> — The geofence is being deleted from the system index.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Identifies the state of the geofence. A geofence will hold one of the following states:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> — The geofence has been indexed by the system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> — The geofence is being processed by the system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> — The geofence failed to be indexed by the system.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETED</code> — The geofence has been deleted from the system index.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> — The geofence is being deleted from the system index.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeofenceResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the geofence collection was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @return The timestamp for when the geofence collection was last updated in <a
     *         href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *         <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The timestamp for when the geofence collection was last updated in <a
     * href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     * <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * </p>
     * 
     * @param updateTime
     *        The timestamp for when the geofence collection was last updated in <a
     *        href="https://www.iso.org/iso-8601-date-and-time-format.html">ISO 8601</a> format:
     *        <code>YYYY-MM-DDThh:mm:ss.sssZ</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeofenceResult withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
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
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getGeofenceId() != null)
            sb.append("GeofenceId: ").append(getGeofenceId()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeofenceResult == false)
            return false;
        GetGeofenceResult other = (GetGeofenceResult) obj;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getGeofenceId() == null ^ this.getGeofenceId() == null)
            return false;
        if (other.getGeofenceId() != null && other.getGeofenceId().equals(this.getGeofenceId()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public GetGeofenceResult clone() {
        try {
            return (GetGeofenceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
