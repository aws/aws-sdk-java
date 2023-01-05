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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The sort configuration for a column that is not used in a field well.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnSort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnSort implements Serializable, Cloneable, StructuredPojo {

    private ColumnIdentifier sortBy;
    /**
     * <p>
     * The sort direction.
     * </p>
     */
    private String direction;
    /**
     * <p>
     * The aggregation function that is defined in the column sort.
     * </p>
     */
    private AggregationFunction aggregationFunction;

    /**
     * @param sortBy
     */

    public void setSortBy(ColumnIdentifier sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * @return
     */

    public ColumnIdentifier getSortBy() {
        return this.sortBy;
    }

    /**
     * @param sortBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSort withSortBy(ColumnIdentifier sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The sort direction.
     * </p>
     * 
     * @param direction
     *        The sort direction.
     * @see SortDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The sort direction.
     * </p>
     * 
     * @return The sort direction.
     * @see SortDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * The sort direction.
     * </p>
     * 
     * @param direction
     *        The sort direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public ColumnSort withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * The sort direction.
     * </p>
     * 
     * @param direction
     *        The sort direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public ColumnSort withDirection(SortDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation function that is defined in the column sort.
     * </p>
     * 
     * @param aggregationFunction
     *        The aggregation function that is defined in the column sort.
     */

    public void setAggregationFunction(AggregationFunction aggregationFunction) {
        this.aggregationFunction = aggregationFunction;
    }

    /**
     * <p>
     * The aggregation function that is defined in the column sort.
     * </p>
     * 
     * @return The aggregation function that is defined in the column sort.
     */

    public AggregationFunction getAggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * <p>
     * The aggregation function that is defined in the column sort.
     * </p>
     * 
     * @param aggregationFunction
     *        The aggregation function that is defined in the column sort.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSort withAggregationFunction(AggregationFunction aggregationFunction) {
        setAggregationFunction(aggregationFunction);
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
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getAggregationFunction() != null)
            sb.append("AggregationFunction: ").append(getAggregationFunction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnSort == false)
            return false;
        ColumnSort other = (ColumnSort) obj;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getAggregationFunction() == null ^ this.getAggregationFunction() == null)
            return false;
        if (other.getAggregationFunction() != null && other.getAggregationFunction().equals(this.getAggregationFunction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getAggregationFunction() == null) ? 0 : getAggregationFunction().hashCode());
        return hashCode;
    }

    @Override
    public ColumnSort clone() {
        try {
            return (ColumnSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnSortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
