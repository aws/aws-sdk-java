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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreateGeofenceCollection" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGeofenceCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String collectionName;
    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies the pricing plan for your geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     */
    private String pricingPlan;
    /**
     * <p>
     * Specifies the plan data source. Required if the Mobile Asset Tracking (MAT) or the Mobile Asset Management (MAM)
     * pricing plan is selected.
     * </p>
     * <p>
     * Billing is determined by the resource usage, the associated pricing plan, and the data source that was specified.
     * For more information about each pricing plan option and restrictions, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     */
    private String pricingPlanDataSource;

    /**
     * <p>
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionName
     *        A custom name for the geofence collection.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique geofence collection name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     *        </p>
     *        </li>
     */

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    /**
     * <p>
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A custom name for the geofence collection.</p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), periods (.), and underscores (_).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique geofence collection name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     *         </p>
     *         </li>
     */

    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * <p>
     * A custom name for the geofence collection.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), periods (.), and underscores (_).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique geofence collection name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param collectionName
     *        A custom name for the geofence collection.</p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A–Z, a–z, 0-9), hyphens (-), periods (.), and underscores (_).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique geofence collection name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExampleGeofenceCollection</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest withCollectionName(String collectionName) {
        setCollectionName(collectionName);
        return this;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * 
     * @param description
     *        An optional description for the geofence collection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * 
     * @return An optional description for the geofence collection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * An optional description for the geofence collection.
     * </p>
     * 
     * @param description
     *        An optional description for the geofence collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @return Specifies the pricing plan for your geofence collection.</p>
     *         <p>
     *         For additional details and restrictions on each pricing plan option, see the <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * <p>
     * Specifies the pricing plan for your geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateGeofenceCollectionRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your geofence collection.
     * </p>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your geofence collection.</p>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreateGeofenceCollectionRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the plan data source. Required if the Mobile Asset Tracking (MAT) or the Mobile Asset Management (MAM)
     * pricing plan is selected.
     * </p>
     * <p>
     * Billing is determined by the resource usage, the associated pricing plan, and the data source that was specified.
     * For more information about each pricing plan option and restrictions, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     * 
     * @param pricingPlanDataSource
     *        Specifies the plan data source. Required if the Mobile Asset Tracking (MAT) or the Mobile Asset Management
     *        (MAM) pricing plan is selected.</p>
     *        <p>
     *        Billing is determined by the resource usage, the associated pricing plan, and the data source that was
     *        specified. For more information about each pricing plan option and restrictions, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     *        </p>
     *        <p>
     *        Valid Values: <code>Esri </code>| <code>Here</code>
     */

    public void setPricingPlanDataSource(String pricingPlanDataSource) {
        this.pricingPlanDataSource = pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the plan data source. Required if the Mobile Asset Tracking (MAT) or the Mobile Asset Management (MAM)
     * pricing plan is selected.
     * </p>
     * <p>
     * Billing is determined by the resource usage, the associated pricing plan, and the data source that was specified.
     * For more information about each pricing plan option and restrictions, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     * 
     * @return Specifies the plan data source. Required if the Mobile Asset Tracking (MAT) or the Mobile Asset
     *         Management (MAM) pricing plan is selected.</p>
     *         <p>
     *         Billing is determined by the resource usage, the associated pricing plan, and the data source that was
     *         specified. For more information about each pricing plan option and restrictions, see the <a
     *         href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     *         </p>
     *         <p>
     *         Valid Values: <code>Esri </code>| <code>Here</code>
     */

    public String getPricingPlanDataSource() {
        return this.pricingPlanDataSource;
    }

    /**
     * <p>
     * Specifies the plan data source. Required if the Mobile Asset Tracking (MAT) or the Mobile Asset Management (MAM)
     * pricing plan is selected.
     * </p>
     * <p>
     * Billing is determined by the resource usage, the associated pricing plan, and the data source that was specified.
     * For more information about each pricing plan option and restrictions, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * <p>
     * Valid Values: <code>Esri </code>| <code>Here</code>
     * </p>
     * 
     * @param pricingPlanDataSource
     *        Specifies the plan data source. Required if the Mobile Asset Tracking (MAT) or the Mobile Asset Management
     *        (MAM) pricing plan is selected.</p>
     *        <p>
     *        Billing is determined by the resource usage, the associated pricing plan, and the data source that was
     *        specified. For more information about each pricing plan option and restrictions, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     *        </p>
     *        <p>
     *        Valid Values: <code>Esri </code>| <code>Here</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGeofenceCollectionRequest withPricingPlanDataSource(String pricingPlanDataSource) {
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

        if (obj instanceof CreateGeofenceCollectionRequest == false)
            return false;
        CreateGeofenceCollectionRequest other = (CreateGeofenceCollectionRequest) obj;
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
    public CreateGeofenceCollectionRequest clone() {
        return (CreateGeofenceCollectionRequest) super.clone();
    }

}
