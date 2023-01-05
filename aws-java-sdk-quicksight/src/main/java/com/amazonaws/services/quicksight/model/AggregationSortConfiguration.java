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
 * The configuration options to sort aggregated values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/AggregationSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The column that determines the sort order of aggregated values.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * The sort direction of values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Sort in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Sort in descending order.
     * </p>
     * </li>
     * </ul>
     */
    private String sortDirection;
    /**
     * <p>
     * The function that aggregates the values in <code>Column</code>.
     * </p>
     */
    private AggregationFunction aggregationFunction;

    /**
     * <p>
     * The column that determines the sort order of aggregated values.
     * </p>
     * 
     * @param column
     *        The column that determines the sort order of aggregated values.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that determines the sort order of aggregated values.
     * </p>
     * 
     * @return The column that determines the sort order of aggregated values.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that determines the sort order of aggregated values.
     * </p>
     * 
     * @param column
     *        The column that determines the sort order of aggregated values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationSortConfiguration withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The sort direction of values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Sort in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Sort in descending order.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortDirection
     *        The sort direction of values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASC</code>: Sort in ascending order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESC</code>: Sort in descending order.
     *        </p>
     *        </li>
     * @see SortDirection
     */

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }

    /**
     * <p>
     * The sort direction of values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Sort in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Sort in descending order.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The sort direction of values.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ASC</code>: Sort in ascending order.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESC</code>: Sort in descending order.
     *         </p>
     *         </li>
     * @see SortDirection
     */

    public String getSortDirection() {
        return this.sortDirection;
    }

    /**
     * <p>
     * The sort direction of values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Sort in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Sort in descending order.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortDirection
     *        The sort direction of values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASC</code>: Sort in ascending order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESC</code>: Sort in descending order.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public AggregationSortConfiguration withSortDirection(String sortDirection) {
        setSortDirection(sortDirection);
        return this;
    }

    /**
     * <p>
     * The sort direction of values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ASC</code>: Sort in ascending order.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESC</code>: Sort in descending order.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sortDirection
     *        The sort direction of values.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ASC</code>: Sort in ascending order.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESC</code>: Sort in descending order.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public AggregationSortConfiguration withSortDirection(SortDirection sortDirection) {
        this.sortDirection = sortDirection.toString();
        return this;
    }

    /**
     * <p>
     * The function that aggregates the values in <code>Column</code>.
     * </p>
     * 
     * @param aggregationFunction
     *        The function that aggregates the values in <code>Column</code>.
     */

    public void setAggregationFunction(AggregationFunction aggregationFunction) {
        this.aggregationFunction = aggregationFunction;
    }

    /**
     * <p>
     * The function that aggregates the values in <code>Column</code>.
     * </p>
     * 
     * @return The function that aggregates the values in <code>Column</code>.
     */

    public AggregationFunction getAggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * <p>
     * The function that aggregates the values in <code>Column</code>.
     * </p>
     * 
     * @param aggregationFunction
     *        The function that aggregates the values in <code>Column</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationSortConfiguration withAggregationFunction(AggregationFunction aggregationFunction) {
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
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getSortDirection() != null)
            sb.append("SortDirection: ").append(getSortDirection()).append(",");
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

        if (obj instanceof AggregationSortConfiguration == false)
            return false;
        AggregationSortConfiguration other = (AggregationSortConfiguration) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getSortDirection() == null ^ this.getSortDirection() == null)
            return false;
        if (other.getSortDirection() != null && other.getSortDirection().equals(this.getSortDirection()) == false)
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

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getSortDirection() == null) ? 0 : getSortDirection().hashCode());
        hashCode = prime * hashCode + ((getAggregationFunction() == null) ? 0 : getAggregationFunction().hashCode());
        return hashCode;
    }

    @Override
    public AggregationSortConfiguration clone() {
        try {
            return (AggregationSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.AggregationSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
