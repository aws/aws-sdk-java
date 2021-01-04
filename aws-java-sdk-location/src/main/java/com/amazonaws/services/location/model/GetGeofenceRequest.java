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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GetGeofence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeofenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The geofence collection storing the target geofence.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * The geofence you're retrieving details for.
     * </p>
     */
    private String geofenceId;

    /**
     * <p>
     * The geofence collection storing the target geofence.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection storing the target geofence.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the target geofence.
     * </p>
     * 
     * @return The geofence collection storing the target geofence.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the target geofence.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection storing the target geofence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeofenceRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * The geofence you're retrieving details for.
     * </p>
     * 
     * @param geofenceId
     *        The geofence you're retrieving details for.
     */

    public void setGeofenceId(String geofenceId) {
        this.geofenceId = geofenceId;
    }

    /**
     * <p>
     * The geofence you're retrieving details for.
     * </p>
     * 
     * @return The geofence you're retrieving details for.
     */

    public String getGeofenceId() {
        return this.geofenceId;
    }

    /**
     * <p>
     * The geofence you're retrieving details for.
     * </p>
     * 
     * @param geofenceId
     *        The geofence you're retrieving details for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeofenceRequest withGeofenceId(String geofenceId) {
        setGeofenceId(geofenceId);
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
            sb.append("GeofenceId: ").append(getGeofenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeofenceRequest == false)
            return false;
        GetGeofenceRequest other = (GetGeofenceRequest) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getGeofenceId() == null ^ this.getGeofenceId() == null)
            return false;
        if (other.getGeofenceId() != null && other.getGeofenceId().equals(this.getGeofenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getGeofenceId() == null) ? 0 : getGeofenceId().hashCode());
        return hashCode;
    }

    @Override
    public GetGeofenceRequest clone() {
        return (GetGeofenceRequest) super.clone();
    }

}
