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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/UpdatePlaceIndex" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePlaceIndexRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     */
    private DataSourceConfiguration dataSourceConfiguration;
    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     */
    private String indexName;
    /**
     * <p>
     * No longer used. If included, the only allowed value is <code>RequestBasedUsage</code>.
     * </p>
     */
    @Deprecated
    private String pricingPlan;

    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Updates the data storage option for the place index resource.
     */

    public void setDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        this.dataSourceConfiguration = dataSourceConfiguration;
    }

    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     * 
     * @return Updates the data storage option for the place index resource.
     */

    public DataSourceConfiguration getDataSourceConfiguration() {
        return this.dataSourceConfiguration;
    }

    /**
     * <p>
     * Updates the data storage option for the place index resource.
     * </p>
     * 
     * @param dataSourceConfiguration
     *        Updates the data storage option for the place index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaceIndexRequest withDataSourceConfiguration(DataSourceConfiguration dataSourceConfiguration) {
        setDataSourceConfiguration(dataSourceConfiguration);
        return this;
    }

    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the place index resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     * 
     * @return Updates the description for the place index resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Updates the description for the place index resource.
     * </p>
     * 
     * @param description
     *        Updates the description for the place index resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaceIndexRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     * 
     * @param indexName
     *        The name of the place index resource to update.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     * 
     * @return The name of the place index resource to update.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the place index resource to update.
     * </p>
     * 
     * @param indexName
     *        The name of the place index resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePlaceIndexRequest withIndexName(String indexName) {
        setIndexName(indexName);
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
    public UpdatePlaceIndexRequest withPricingPlan(String pricingPlan) {
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
    public UpdatePlaceIndexRequest withPricingPlan(PricingPlan pricingPlan) {
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

        if (obj instanceof UpdatePlaceIndexRequest == false)
            return false;
        UpdatePlaceIndexRequest other = (UpdatePlaceIndexRequest) obj;
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

        hashCode = prime * hashCode + ((getDataSourceConfiguration() == null) ? 0 : getDataSourceConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePlaceIndexRequest clone() {
        return (UpdatePlaceIndexRequest) super.clone();
    }

}
