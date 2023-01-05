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
 * The details that define an aggregation based on finding type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/FindingTypeAggregation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingTypeAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The finding type to aggregate.
     * </p>
     */
    private String findingType;
    /**
     * <p>
     * The resource type to aggregate.
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
     * The finding type to aggregate.
     * </p>
     * 
     * @param findingType
     *        The finding type to aggregate.
     * @see AggregationFindingType
     */

    public void setFindingType(String findingType) {
        this.findingType = findingType;
    }

    /**
     * <p>
     * The finding type to aggregate.
     * </p>
     * 
     * @return The finding type to aggregate.
     * @see AggregationFindingType
     */

    public String getFindingType() {
        return this.findingType;
    }

    /**
     * <p>
     * The finding type to aggregate.
     * </p>
     * 
     * @param findingType
     *        The finding type to aggregate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationFindingType
     */

    public FindingTypeAggregation withFindingType(String findingType) {
        setFindingType(findingType);
        return this;
    }

    /**
     * <p>
     * The finding type to aggregate.
     * </p>
     * 
     * @param findingType
     *        The finding type to aggregate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationFindingType
     */

    public FindingTypeAggregation withFindingType(AggregationFindingType findingType) {
        this.findingType = findingType.toString();
        return this;
    }

    /**
     * <p>
     * The resource type to aggregate.
     * </p>
     * 
     * @param resourceType
     *        The resource type to aggregate.
     * @see AggregationResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type to aggregate.
     * </p>
     * 
     * @return The resource type to aggregate.
     * @see AggregationResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type to aggregate.
     * </p>
     * 
     * @param resourceType
     *        The resource type to aggregate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationResourceType
     */

    public FindingTypeAggregation withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type to aggregate.
     * </p>
     * 
     * @param resourceType
     *        The resource type to aggregate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationResourceType
     */

    public FindingTypeAggregation withResourceType(AggregationResourceType resourceType) {
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
     * @see FindingTypeSortBy
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
     * @see FindingTypeSortBy
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
     * @see FindingTypeSortBy
     */

    public FindingTypeAggregation withSortBy(String sortBy) {
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
     * @see FindingTypeSortBy
     */

    public FindingTypeAggregation withSortBy(FindingTypeSortBy sortBy) {
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

    public FindingTypeAggregation withSortOrder(String sortOrder) {
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

    public FindingTypeAggregation withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getFindingType() != null)
            sb.append("FindingType: ").append(getFindingType()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingTypeAggregation == false)
            return false;
        FindingTypeAggregation other = (FindingTypeAggregation) obj;
        if (other.getFindingType() == null ^ this.getFindingType() == null)
            return false;
        if (other.getFindingType() != null && other.getFindingType().equals(this.getFindingType()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFindingType() == null) ? 0 : getFindingType().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public FindingTypeAggregation clone() {
        try {
            return (FindingTypeAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FindingTypeAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
