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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/BatchPutGeofence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchPutGeofenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The geofence collection storing the geofences.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     */
    private java.util.List<BatchPutGeofenceRequestEntry> entries;

    /**
     * <p>
     * The geofence collection storing the geofences.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection storing the geofences.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the geofences.
     * </p>
     * 
     * @return The geofence collection storing the geofences.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The geofence collection storing the geofences.
     * </p>
     * 
     * @param collectionName
     *        The geofence collection storing the geofences.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutGeofenceRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     * 
     * @return The batch of geofences to be stored in a geofence collection.
     */

    public java.util.List<BatchPutGeofenceRequestEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     * 
     * @param entries
     *        The batch of geofences to be stored in a geofence collection.
     */

    public void setEntries(java.util.Collection<BatchPutGeofenceRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<BatchPutGeofenceRequestEntry>(entries);
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The batch of geofences to be stored in a geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutGeofenceRequest withEntries(BatchPutGeofenceRequestEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<BatchPutGeofenceRequestEntry>(entries.length));
        }
        for (BatchPutGeofenceRequestEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The batch of geofences to be stored in a geofence collection.
     * </p>
     * 
     * @param entries
     *        The batch of geofences to be stored in a geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchPutGeofenceRequest withEntries(java.util.Collection<BatchPutGeofenceRequestEntry> entries) {
        setEntries(entries);
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
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchPutGeofenceRequest == false)
            return false;
        BatchPutGeofenceRequest other = (BatchPutGeofenceRequest) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public BatchPutGeofenceRequest clone() {
        return (BatchPutGeofenceRequest) super.clone();
    }

}
