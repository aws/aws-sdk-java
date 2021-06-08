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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchDeleteGeofence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteGeofenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The geofence collection storing the geofences to be deleted.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * The batch of geofences to be deleted.
     * </p>
     */
    private java.util.List<String> geofenceIds;

    /**
     * <p>
     * The geofence collection storing the geofences to be deleted.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection storing the geofences to be deleted.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the geofences to be deleted.
     * </p>
     * 
     * @return The geofence collection storing the geofences to be deleted.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the geofences to be deleted.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection storing the geofences to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteGeofenceRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * The batch of geofences to be deleted.
     * </p>
     * 
     * @return The batch of geofences to be deleted.
     */

    public java.util.List<String> getGeofenceIds() {
        return geofenceIds;
    }

    /**
     * <p>
     * The batch of geofences to be deleted.
     * </p>
     * 
     * @param geofenceIds
     *        The batch of geofences to be deleted.
     */

    public void setGeofenceIds(java.util.Collection<String> geofenceIds) {
        if (geofenceIds == null) {
            this.geofenceIds = null;
            return;
        }

        this.geofenceIds = new java.util.ArrayList<String>(geofenceIds);
    }

    /**
     * <p>
     * The batch of geofences to be deleted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeofenceIds(java.util.Collection)} or {@link #withGeofenceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param geofenceIds
     *        The batch of geofences to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteGeofenceRequest withGeofenceIds(String... geofenceIds) {
        if (this.geofenceIds == null) {
            setGeofenceIds(new java.util.ArrayList<String>(geofenceIds.length));
        }
        for (String ele : geofenceIds) {
            this.geofenceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The batch of geofences to be deleted.
     * </p>
     * 
     * @param geofenceIds
     *        The batch of geofences to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteGeofenceRequest withGeofenceIds(java.util.Collection<String> geofenceIds) {
        setGeofenceIds(geofenceIds);
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
        if (getGeofenceIds() != null)
            sb.append("GeofenceIds: ").append(getGeofenceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteGeofenceRequest == false)
            return false;
        BatchDeleteGeofenceRequest other = (BatchDeleteGeofenceRequest) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getGeofenceIds() == null ^ this.getGeofenceIds() == null)
            return false;
        if (other.getGeofenceIds() != null && other.getGeofenceIds().equals(this.getGeofenceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getGeofenceIds() == null) ? 0 : getGeofenceIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteGeofenceRequest clone() {
        return (BatchDeleteGeofenceRequest) super.clone();
    }

}
