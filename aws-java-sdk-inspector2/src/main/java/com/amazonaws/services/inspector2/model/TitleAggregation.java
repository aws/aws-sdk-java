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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details that define an aggregation based on finding title.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/TitleAggregation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TitleAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type to aggregate on.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The value to sort results by.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The order to sort results by.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The finding titles to aggregate on.
     * </p>
     */
    private java.util.List<StringFilter> titles;
    /**
     * <p>
     * The vulnerability IDs of the findings.
     * </p>
     */
    private java.util.List<StringFilter> vulnerabilityIds;

    /**
     * <p>
     * The resource type to aggregate on.
     * </p>
     * 
     * @param resourceType
     *        The resource type to aggregate on.
     * @see AggregationResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type to aggregate on.
     * </p>
     * 
     * @return The resource type to aggregate on.
     * @see AggregationResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type to aggregate on.
     * </p>
     * 
     * @param resourceType
     *        The resource type to aggregate on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationResourceType
     */

    public TitleAggregation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type to aggregate on.
     * </p>
     * 
     * @param resourceType
     *        The resource type to aggregate on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationResourceType
     */

    public TitleAggregation withResourceType(AggregationResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @see TitleSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @return The value to sort results by.
     * @see TitleSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TitleSortBy
     */

    public TitleAggregation withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The value to sort results by.
     * </p>
     * 
     * @param sortBy
     *        The value to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TitleSortBy
     */

    public TitleAggregation withSortBy(TitleSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @return The order to sort results by.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public TitleAggregation withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order to sort results by.
     * </p>
     * 
     * @param sortOrder
     *        The order to sort results by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public TitleAggregation withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The finding titles to aggregate on.
     * </p>
     * 
     * @return The finding titles to aggregate on.
     */

    public java.util.List<StringFilter> getTitles() {
        return titles;
    }

    /**
     * <p>
     * The finding titles to aggregate on.
     * </p>
     * 
     * @param titles
     *        The finding titles to aggregate on.
     */

    public void setTitles(java.util.Collection<StringFilter> titles) {
        if (titles == null) {
            this.titles = null;
            return;
        }

        this.titles = new java.util.ArrayList<StringFilter>(titles);
    }

    /**
     * <p>
     * The finding titles to aggregate on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTitles(java.util.Collection)} or {@link #withTitles(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param titles
     *        The finding titles to aggregate on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregation withTitles(StringFilter... titles) {
        if (this.titles == null) {
            setTitles(new java.util.ArrayList<StringFilter>(titles.length));
        }
        for (StringFilter ele : titles) {
            this.titles.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The finding titles to aggregate on.
     * </p>
     * 
     * @param titles
     *        The finding titles to aggregate on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregation withTitles(java.util.Collection<StringFilter> titles) {
        setTitles(titles);
        return this;
    }

    /**
     * <p>
     * The vulnerability IDs of the findings.
     * </p>
     * 
     * @return The vulnerability IDs of the findings.
     */

    public java.util.List<StringFilter> getVulnerabilityIds() {
        return vulnerabilityIds;
    }

    /**
     * <p>
     * The vulnerability IDs of the findings.
     * </p>
     * 
     * @param vulnerabilityIds
     *        The vulnerability IDs of the findings.
     */

    public void setVulnerabilityIds(java.util.Collection<StringFilter> vulnerabilityIds) {
        if (vulnerabilityIds == null) {
            this.vulnerabilityIds = null;
            return;
        }

        this.vulnerabilityIds = new java.util.ArrayList<StringFilter>(vulnerabilityIds);
    }

    /**
     * <p>
     * The vulnerability IDs of the findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVulnerabilityIds(java.util.Collection)} or {@link #withVulnerabilityIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param vulnerabilityIds
     *        The vulnerability IDs of the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregation withVulnerabilityIds(StringFilter... vulnerabilityIds) {
        if (this.vulnerabilityIds == null) {
            setVulnerabilityIds(new java.util.ArrayList<StringFilter>(vulnerabilityIds.length));
        }
        for (StringFilter ele : vulnerabilityIds) {
            this.vulnerabilityIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The vulnerability IDs of the findings.
     * </p>
     * 
     * @param vulnerabilityIds
     *        The vulnerability IDs of the findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TitleAggregation withVulnerabilityIds(java.util.Collection<StringFilter> vulnerabilityIds) {
        setVulnerabilityIds(vulnerabilityIds);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getTitles() != null)
            sb.append("Titles: ").append(getTitles()).append(",");
        if (getVulnerabilityIds() != null)
            sb.append("VulnerabilityIds: ").append(getVulnerabilityIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TitleAggregation == false)
            return false;
        TitleAggregation other = (TitleAggregation) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getTitles() == null ^ this.getTitles() == null)
            return false;
        if (other.getTitles() != null && other.getTitles().equals(this.getTitles()) == false)
            return false;
        if (other.getVulnerabilityIds() == null ^ this.getVulnerabilityIds() == null)
            return false;
        if (other.getVulnerabilityIds() != null && other.getVulnerabilityIds().equals(this.getVulnerabilityIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getTitles() == null) ? 0 : getTitles().hashCode());
        hashCode = prime * hashCode + ((getVulnerabilityIds() == null) ? 0 : getVulnerabilityIds().hashCode());
        return hashCode;
    }

    @Override
    public TitleAggregation clone() {
        try {
            return (TitleAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.TitleAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
