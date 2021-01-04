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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/CreatePlaceIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePlaceIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     */
    private String dataSource;
    /**
     * <p>
     * Specifies the data storage option for requesting Places.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;
    /**
     * <p>
     * The optional description for the Place index resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the Place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-) and underscores (_) ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String indexName;
    /**
     * <p>
     * Specifies the pricing plan for your Place index resource. There's three pricing plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     */
    private String pricingPlan;

    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     * 
     * @param dataSource
     *        Specifies the data provider of geospatial data.
     */

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     * 
     * @return Specifies the data provider of geospatial data.
     */

    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * <p>
     * Specifies the data provider of geospatial data.
     * </p>
     * 
     * @param dataSource
     *        Specifies the data provider of geospatial data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withDataSource(String dataSource) {
        setDataSource(dataSource);
        return this;
    }

    /**
     * <p>
     * Specifies the data storage option for requesting Places.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Specifies the data storage option for requesting Places.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Specifies the data storage option for requesting Places.
     * </p>
     * 
     * @return Specifies the data storage option for requesting Places.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Specifies the data storage option for requesting Places.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Specifies the data storage option for requesting Places.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        setDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * The optional description for the Place index resource.
     * </p>
     * 
     * @param description
     *        The optional description for the Place index resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The optional description for the Place index resource.
     * </p>
     * 
     * @return The optional description for the Place index resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The optional description for the Place index resource.
     * </p>
     * 
     * @param description
     *        The optional description for the Place index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the Place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-) and underscores (_) ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexName
     *        The name of the Place index resource. </p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-) and underscores (_) ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique Place index resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     *        </p>
     *        </li>
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the Place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-) and underscores (_) ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the Place index resource. </p>
     *         <p>
     *         Requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-) and underscores (_) ).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be a unique Place index resource name.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     *         </p>
     *         </li>
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the Place index resource.
     * </p>
     * <p>
     * Requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-) and underscores (_) ).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be a unique Place index resource name.
     * </p>
     * </li>
     * <li>
     * <p>
     * No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param indexName
     *        The name of the Place index resource. </p>
     *        <p>
     *        Requirements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Contain only alphanumeric characters (A-Z, a-z, 0-9) , hyphens (-) and underscores (_) ).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be a unique Place index resource name.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        No spaces allowed. For example, <code>ExamplePlaceIndex</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePlaceIndexRequest withIndexName(String indexName) {
        setIndexName(indexName);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your Place index resource. There's three pricing plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your Place index resource. There's three pricing plan options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     *        </p>
     *        </li>
     *        </ul>
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
     * Specifies the pricing plan for your Place index resource. There's three pricing plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @return Specifies the pricing plan for your Place index resource. There's three pricing plan options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     *         </p>
     *         </li>
     *         </ul>
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
     * Specifies the pricing plan for your Place index resource. There's three pricing plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your Place index resource. There's three pricing plan options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreatePlaceIndexRequest withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * <p>
     * Specifies the pricing plan for your Place index resource. There's three pricing plan options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For additional details and restrictions on each pricing plan option, see the <a
     * href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * </p>
     * 
     * @param pricingPlan
     *        Specifies the pricing plan for your Place index resource. There's three pricing plan options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RequestBasedUsage</code> — Selects the "Request-Based Usage" pricing plan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MobileAssetTracking</code> — Selects the "Mobile Asset Tracking" pricing plan.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MobileAssetManagement</code> — Selects the "Mobile Asset Management" pricing plan.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For additional details and restrictions on each pricing plan option, see the <a
     *        href="https://aws.amazon.com/location/pricing/">Amazon Location Service pricing page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public CreatePlaceIndexRequest withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
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
        if (getDataSource() != null)
            sb.append("DataSource: ").append(getDataSource()).append(",");
        if (getDataSourceConfiguration() != null)
            sb.append("DataSourceConfiguration: ").append(getDataSourceConfiguration()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIndexName() != null)
            sb.append("IndexName: ").append(getIndexName()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePlaceIndexRequest == false)
            return false;
        CreatePlaceIndexRequest other = (CreatePlaceIndexRequest) obj;
        if (other.getDataSource() == null ^ this.getDataSource() == null)
            return false;
        if (other.getDataSource() != null && other.getDataSource().equals(this.getDataSource()) == false)
            return false;
        if (other.getDataSourceConfiguration() == null ^ this.getDataSourceConfiguration() == null)
            return false;
        if (other.getDataSourceConfiguration() != null && other.getDataSourceConfiguration().equals(this.getDataSourceConfiguration()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSource() == null) ? 0 : getDataSource().hashCode());
        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        return hashCode;
    }

    @Override
    public CreatePlaceIndexRequest clone() {
        return (CreatePlaceIndexRequest) super.clone();
    }

}
