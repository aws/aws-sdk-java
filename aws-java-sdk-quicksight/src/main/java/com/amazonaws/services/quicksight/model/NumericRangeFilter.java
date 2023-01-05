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
 * A <code>NumericRangeFilter</code> filters values that are within the value range.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericRangeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericRangeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     */
    private String filterId;
    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     */
    private ColumnIdentifier column;
    /**
     * <p>
     * Determines whether the minimum value in the filter value range should be included in the filtered results.
     * </p>
     */
    private Boolean includeMinimum;
    /**
     * <p>
     * Determines whether the maximum value in the filter value range should be included in the filtered results.
     * </p>
     */
    private Boolean includeMaximum;
    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     */
    private NumericRangeFilterValue rangeMinimum;
    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     */
    private NumericRangeFilterValue rangeMaximum;
    /**
     * <p>
     * Select all of the values. Null is not the assigned value of select all.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILTER_ALL_VALUES</code>
     * </p>
     * </li>
     * </ul>
     */
    private String selectAllOptions;
    /**
     * <p>
     * The aggregation function of the filter.
     * </p>
     */
    private AggregationFunction aggregationFunction;
    /**
     * <p>
     * This option determines how null values should be treated when filtering data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VALUES</code>: Include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULLS_ONLY</code>: Only include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     * </p>
     * </li>
     * </ul>
     */
    private String nullOption;

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @param filterId
     *        An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     */

    public void setFilterId(String filterId) {
        this.filterId = filterId;
    }

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @return An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     */

    public String getFilterId() {
        return this.filterId;
    }

    /**
     * <p>
     * An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * </p>
     * 
     * @param filterId
     *        An identifier that uniquely identifies a filter within a dashboard, analysis, or template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilter withFilterId(String filterId) {
        setFilterId(filterId);
        return this;
    }

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @param column
     *        The column that the filter is applied to.
     */

    public void setColumn(ColumnIdentifier column) {
        this.column = column;
    }

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @return The column that the filter is applied to.
     */

    public ColumnIdentifier getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The column that the filter is applied to.
     * </p>
     * 
     * @param column
     *        The column that the filter is applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilter withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * Determines whether the minimum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @param includeMinimum
     *        Determines whether the minimum value in the filter value range should be included in the filtered results.
     */

    public void setIncludeMinimum(Boolean includeMinimum) {
        this.includeMinimum = includeMinimum;
    }

    /**
     * <p>
     * Determines whether the minimum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @return Determines whether the minimum value in the filter value range should be included in the filtered
     *         results.
     */

    public Boolean getIncludeMinimum() {
        return this.includeMinimum;
    }

    /**
     * <p>
     * Determines whether the minimum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @param includeMinimum
     *        Determines whether the minimum value in the filter value range should be included in the filtered results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilter withIncludeMinimum(Boolean includeMinimum) {
        setIncludeMinimum(includeMinimum);
        return this;
    }

    /**
     * <p>
     * Determines whether the minimum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @return Determines whether the minimum value in the filter value range should be included in the filtered
     *         results.
     */

    public Boolean isIncludeMinimum() {
        return this.includeMinimum;
    }

    /**
     * <p>
     * Determines whether the maximum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @param includeMaximum
     *        Determines whether the maximum value in the filter value range should be included in the filtered results.
     */

    public void setIncludeMaximum(Boolean includeMaximum) {
        this.includeMaximum = includeMaximum;
    }

    /**
     * <p>
     * Determines whether the maximum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @return Determines whether the maximum value in the filter value range should be included in the filtered
     *         results.
     */

    public Boolean getIncludeMaximum() {
        return this.includeMaximum;
    }

    /**
     * <p>
     * Determines whether the maximum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @param includeMaximum
     *        Determines whether the maximum value in the filter value range should be included in the filtered results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilter withIncludeMaximum(Boolean includeMaximum) {
        setIncludeMaximum(includeMaximum);
        return this;
    }

    /**
     * <p>
     * Determines whether the maximum value in the filter value range should be included in the filtered results.
     * </p>
     * 
     * @return Determines whether the maximum value in the filter value range should be included in the filtered
     *         results.
     */

    public Boolean isIncludeMaximum() {
        return this.includeMaximum;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @param rangeMinimum
     *        The minimum value for the filter value range.
     */

    public void setRangeMinimum(NumericRangeFilterValue rangeMinimum) {
        this.rangeMinimum = rangeMinimum;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @return The minimum value for the filter value range.
     */

    public NumericRangeFilterValue getRangeMinimum() {
        return this.rangeMinimum;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @param rangeMinimum
     *        The minimum value for the filter value range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilter withRangeMinimum(NumericRangeFilterValue rangeMinimum) {
        setRangeMinimum(rangeMinimum);
        return this;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @param rangeMaximum
     *        The maximum value for the filter value range.
     */

    public void setRangeMaximum(NumericRangeFilterValue rangeMaximum) {
        this.rangeMaximum = rangeMaximum;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @return The maximum value for the filter value range.
     */

    public NumericRangeFilterValue getRangeMaximum() {
        return this.rangeMaximum;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @param rangeMaximum
     *        The maximum value for the filter value range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilter withRangeMaximum(NumericRangeFilterValue rangeMaximum) {
        setRangeMaximum(rangeMaximum);
        return this;
    }

    /**
     * <p>
     * Select all of the values. Null is not the assigned value of select all.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILTER_ALL_VALUES</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectAllOptions
     *        Select all of the values. Null is not the assigned value of select all.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FILTER_ALL_VALUES</code>
     *        </p>
     *        </li>
     * @see NumericFilterSelectAllOptions
     */

    public void setSelectAllOptions(String selectAllOptions) {
        this.selectAllOptions = selectAllOptions;
    }

    /**
     * <p>
     * Select all of the values. Null is not the assigned value of select all.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILTER_ALL_VALUES</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Select all of the values. Null is not the assigned value of select all.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FILTER_ALL_VALUES</code>
     *         </p>
     *         </li>
     * @see NumericFilterSelectAllOptions
     */

    public String getSelectAllOptions() {
        return this.selectAllOptions;
    }

    /**
     * <p>
     * Select all of the values. Null is not the assigned value of select all.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILTER_ALL_VALUES</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectAllOptions
     *        Select all of the values. Null is not the assigned value of select all.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FILTER_ALL_VALUES</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericFilterSelectAllOptions
     */

    public NumericRangeFilter withSelectAllOptions(String selectAllOptions) {
        setSelectAllOptions(selectAllOptions);
        return this;
    }

    /**
     * <p>
     * Select all of the values. Null is not the assigned value of select all.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FILTER_ALL_VALUES</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectAllOptions
     *        Select all of the values. Null is not the assigned value of select all.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FILTER_ALL_VALUES</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericFilterSelectAllOptions
     */

    public NumericRangeFilter withSelectAllOptions(NumericFilterSelectAllOptions selectAllOptions) {
        this.selectAllOptions = selectAllOptions.toString();
        return this;
    }

    /**
     * <p>
     * The aggregation function of the filter.
     * </p>
     * 
     * @param aggregationFunction
     *        The aggregation function of the filter.
     */

    public void setAggregationFunction(AggregationFunction aggregationFunction) {
        this.aggregationFunction = aggregationFunction;
    }

    /**
     * <p>
     * The aggregation function of the filter.
     * </p>
     * 
     * @return The aggregation function of the filter.
     */

    public AggregationFunction getAggregationFunction() {
        return this.aggregationFunction;
    }

    /**
     * <p>
     * The aggregation function of the filter.
     * </p>
     * 
     * @param aggregationFunction
     *        The aggregation function of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericRangeFilter withAggregationFunction(AggregationFunction aggregationFunction) {
        setAggregationFunction(aggregationFunction);
        return this;
    }

    /**
     * <p>
     * This option determines how null values should be treated when filtering data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VALUES</code>: Include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULLS_ONLY</code>: Only include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nullOption
     *        This option determines how null values should be treated when filtering data.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VALUES</code>: Include null values in filtered results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NULLS_ONLY</code>: Only include null values in filtered results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     *        </p>
     *        </li>
     * @see FilterNullOption
     */

    public void setNullOption(String nullOption) {
        this.nullOption = nullOption;
    }

    /**
     * <p>
     * This option determines how null values should be treated when filtering data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VALUES</code>: Include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULLS_ONLY</code>: Only include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     * </p>
     * </li>
     * </ul>
     * 
     * @return This option determines how null values should be treated when filtering data.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_VALUES</code>: Include null values in filtered results.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NULLS_ONLY</code>: Only include null values in filtered results.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     *         </p>
     *         </li>
     * @see FilterNullOption
     */

    public String getNullOption() {
        return this.nullOption;
    }

    /**
     * <p>
     * This option determines how null values should be treated when filtering data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VALUES</code>: Include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULLS_ONLY</code>: Only include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nullOption
     *        This option determines how null values should be treated when filtering data.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VALUES</code>: Include null values in filtered results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NULLS_ONLY</code>: Only include null values in filtered results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterNullOption
     */

    public NumericRangeFilter withNullOption(String nullOption) {
        setNullOption(nullOption);
        return this;
    }

    /**
     * <p>
     * This option determines how null values should be treated when filtering data.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_VALUES</code>: Include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NULLS_ONLY</code>: Only include null values in filtered results.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nullOption
     *        This option determines how null values should be treated when filtering data.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_VALUES</code>: Include null values in filtered results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NULLS_ONLY</code>: Only include null values in filtered results.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NON_NULLS_ONLY</code>: Exclude null values from filtered results.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterNullOption
     */

    public NumericRangeFilter withNullOption(FilterNullOption nullOption) {
        this.nullOption = nullOption.toString();
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
        if (getFilterId() != null)
            sb.append("FilterId: ").append(getFilterId()).append(",");
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
        if (getIncludeMinimum() != null)
            sb.append("IncludeMinimum: ").append(getIncludeMinimum()).append(",");
        if (getIncludeMaximum() != null)
            sb.append("IncludeMaximum: ").append(getIncludeMaximum()).append(",");
        if (getRangeMinimum() != null)
            sb.append("RangeMinimum: ").append(getRangeMinimum()).append(",");
        if (getRangeMaximum() != null)
            sb.append("RangeMaximum: ").append(getRangeMaximum()).append(",");
        if (getSelectAllOptions() != null)
            sb.append("SelectAllOptions: ").append(getSelectAllOptions()).append(",");
        if (getAggregationFunction() != null)
            sb.append("AggregationFunction: ").append(getAggregationFunction()).append(",");
        if (getNullOption() != null)
            sb.append("NullOption: ").append(getNullOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NumericRangeFilter == false)
            return false;
        NumericRangeFilter other = (NumericRangeFilter) obj;
        if (other.getFilterId() == null ^ this.getFilterId() == null)
            return false;
        if (other.getFilterId() != null && other.getFilterId().equals(this.getFilterId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getIncludeMinimum() == null ^ this.getIncludeMinimum() == null)
            return false;
        if (other.getIncludeMinimum() != null && other.getIncludeMinimum().equals(this.getIncludeMinimum()) == false)
            return false;
        if (other.getIncludeMaximum() == null ^ this.getIncludeMaximum() == null)
            return false;
        if (other.getIncludeMaximum() != null && other.getIncludeMaximum().equals(this.getIncludeMaximum()) == false)
            return false;
        if (other.getRangeMinimum() == null ^ this.getRangeMinimum() == null)
            return false;
        if (other.getRangeMinimum() != null && other.getRangeMinimum().equals(this.getRangeMinimum()) == false)
            return false;
        if (other.getRangeMaximum() == null ^ this.getRangeMaximum() == null)
            return false;
        if (other.getRangeMaximum() != null && other.getRangeMaximum().equals(this.getRangeMaximum()) == false)
            return false;
        if (other.getSelectAllOptions() == null ^ this.getSelectAllOptions() == null)
            return false;
        if (other.getSelectAllOptions() != null && other.getSelectAllOptions().equals(this.getSelectAllOptions()) == false)
            return false;
        if (other.getAggregationFunction() == null ^ this.getAggregationFunction() == null)
            return false;
        if (other.getAggregationFunction() != null && other.getAggregationFunction().equals(this.getAggregationFunction()) == false)
            return false;
        if (other.getNullOption() == null ^ this.getNullOption() == null)
            return false;
        if (other.getNullOption() != null && other.getNullOption().equals(this.getNullOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterId() == null) ? 0 : getFilterId().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getIncludeMinimum() == null) ? 0 : getIncludeMinimum().hashCode());
        hashCode = prime * hashCode + ((getIncludeMaximum() == null) ? 0 : getIncludeMaximum().hashCode());
        hashCode = prime * hashCode + ((getRangeMinimum() == null) ? 0 : getRangeMinimum().hashCode());
        hashCode = prime * hashCode + ((getRangeMaximum() == null) ? 0 : getRangeMaximum().hashCode());
        hashCode = prime * hashCode + ((getSelectAllOptions() == null) ? 0 : getSelectAllOptions().hashCode());
        hashCode = prime * hashCode + ((getAggregationFunction() == null) ? 0 : getAggregationFunction().hashCode());
        hashCode = prime * hashCode + ((getNullOption() == null) ? 0 : getNullOption().hashCode());
        return hashCode;
    }

    @Override
    public NumericRangeFilter clone() {
        try {
            return (NumericRangeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericRangeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
