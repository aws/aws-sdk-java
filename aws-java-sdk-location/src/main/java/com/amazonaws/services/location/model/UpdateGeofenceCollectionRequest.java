/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdateGeofenceCollection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGeofenceCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     */
    private String collectionName;
    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     */
    @Deprecated
    private String pricingPlan;
    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     */
    @Deprecated
    private String pricingPlanDataSource;

    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     * 
     * @param collectionName
     *        The name of the geofence collection to update.
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     * 
     * @return The name of the geofence collection to update.
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * The name of the geofence collection to update.
     * </p>
     * 
     * @param collectionName
     *        The name of the geofence collection to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeofenceCollectionRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     * 
     * @param description
     *        Updates the description for the geofence collection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     * 
     * @return Updates the description for the geofence collection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Updates the description for the geofence collection.
     * </p>
     * 
     * @param description
     *        Updates the description for the geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGeofenceCollectionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @see PricingPlan
     */
    @Deprecated
    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @return No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @see PricingPlan
     */
    @Deprecated
    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */
    @Deprecated
    public UpdateGeofenceCollectionRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     * 
     * @param pricingPlan
     *        No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */
    @Deprecated
    public UpdateGeofenceCollectionRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * 
     * @param pricingPlanDataSource
     *        This parameter is no longer used.
     */
    @Deprecated
    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * 
     * @return This parameter is no longer used.
     */
    @Deprecated
    public String getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }

    /**
     * <p>
     * This parameter is no longer used.
     * </p>
     * 
     * @param pricingPlanDataSource
     *        This parameter is no longer used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public UpdateGeofenceCollectionRequest withPricingPlanDataSource(String pricingPlanDataSource) {
        setPricingPlanDataSource(pricingPlanDataSource);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getPricingPlanDataSource() != null)
            sb.append("PricingPlanDataSource: ").append(getPricingPlanDataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGeofenceCollectionRequest == false)
            return false;
        UpdateGeofenceCollectionRequest other = (UpdateGeofenceCollectionRequest) obj;
        if (other.getCollectionName() == null ^ this.getCollectionName() == null)
            return false;
        if (other.getCollectionName() != null && other.getCollectionName().equals(this.getCollectionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getPricingPlanDataSource() == null ^ this.getPricingPlanDataSource() == null)
            return false;
        if (other.getPricingPlanDataSource() != null && other.getPricingPlanDataSource().equals(this.getPricingPlanDataSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionName() == null) ? 0 : getCollectionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getPricingPlanDataSource() == null) ? 0 : getPricingPlanDataSource().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGeofenceCollectionRequest clone() {
        return (UpdateGeofenceCollectionRequest) super.clone();
    }

}
