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
 * A <code>NumericEqualityFilter</code> filters values that are equal to the specified value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/NumericEqualityFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NumericEqualityFilter implements Serializable, Cloneable, StructuredPojo {

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
     * The input value.
     * </p>
     */
    private Double value;
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
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     */
    private String matchOperator;
    /**
     * <p>
     * The aggregation function of the filter.
     * </p>
     */
    private AggregationFunction aggregationFunction;
    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     */
    private String parameterName;
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

    public NumericEqualityFilter withFilterId(String filterId) {
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

    public NumericEqualityFilter withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The input value.
     * </p>
     * 
     * @param value
     *        The input value.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The input value.
     * </p>
     * 
     * @return The input value.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The input value.
     * </p>
     * 
     * @param value
     *        The input value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericEqualityFilter withValue(Double value) {
        setValue(value);
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

    public NumericEqualityFilter withSelectAllOptions(String selectAllOptions) {
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

    public NumericEqualityFilter withSelectAllOptions(NumericFilterSelectAllOptions selectAllOptions) {
        this.selectAllOptions = selectAllOptions.toString();
        return this;
    }

    /**
     * <p>
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     * 
     * @param matchOperator
     *        The match operator that is used to determine if a filter should be applied.
     * @see NumericEqualityMatchOperator
     */

    public void setMatchOperator(String matchOperator) {
        this.matchOperator = matchOperator;
    }

    /**
     * <p>
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     * 
     * @return The match operator that is used to determine if a filter should be applied.
     * @see NumericEqualityMatchOperator
     */

    public String getMatchOperator() {
        return this.matchOperator;
    }

    /**
     * <p>
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     * 
     * @param matchOperator
     *        The match operator that is used to determine if a filter should be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericEqualityMatchOperator
     */

    public NumericEqualityFilter withMatchOperator(String matchOperator) {
        setMatchOperator(matchOperator);
        return this;
    }

    /**
     * <p>
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     * 
     * @param matchOperator
     *        The match operator that is used to determine if a filter should be applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NumericEqualityMatchOperator
     */

    public NumericEqualityFilter withMatchOperator(NumericEqualityMatchOperator matchOperator) {
        this.matchOperator = matchOperator.toString();
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

    public NumericEqualityFilter withAggregationFunction(AggregationFunction aggregationFunction) {
        setAggregationFunction(aggregationFunction);
        return this;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * 
     * @param parameterName
     *        The parameter whose value should be used for the filter value.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * 
     * @return The parameter whose value should be used for the filter value.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * 
     * @param parameterName
     *        The parameter whose value should be used for the filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NumericEqualityFilter withParameterName(String parameterName) {
        setParameterName(parameterName);
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

    public NumericEqualityFilter withNullOption(String nullOption) {
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

    public NumericEqualityFilter withNullOption(FilterNullOption nullOption) {
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getSelectAllOptions() != null)
            sb.append("SelectAllOptions: ").append(getSelectAllOptions()).append(",");
        if (getMatchOperator() != null)
            sb.append("MatchOperator: ").append(getMatchOperator()).append(",");
        if (getAggregationFunction() != null)
            sb.append("AggregationFunction: ").append(getAggregationFunction()).append(",");
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
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

        if (obj instanceof NumericEqualityFilter == false)
            return false;
        NumericEqualityFilter other = (NumericEqualityFilter) obj;
        if (other.getFilterId() == null ^ this.getFilterId() == null)
            return false;
        if (other.getFilterId() != null && other.getFilterId().equals(this.getFilterId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getSelectAllOptions() == null ^ this.getSelectAllOptions() == null)
            return false;
        if (other.getSelectAllOptions() != null && other.getSelectAllOptions().equals(this.getSelectAllOptions()) == false)
            return false;
        if (other.getMatchOperator() == null ^ this.getMatchOperator() == null)
            return false;
        if (other.getMatchOperator() != null && other.getMatchOperator().equals(this.getMatchOperator()) == false)
            return false;
        if (other.getAggregationFunction() == null ^ this.getAggregationFunction() == null)
            return false;
        if (other.getAggregationFunction() != null && other.getAggregationFunction().equals(this.getAggregationFunction()) == false)
            return false;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
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
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getSelectAllOptions() == null) ? 0 : getSelectAllOptions().hashCode());
        hashCode = prime * hashCode + ((getMatchOperator() == null) ? 0 : getMatchOperator().hashCode());
        hashCode = prime * hashCode + ((getAggregationFunction() == null) ? 0 : getAggregationFunction().hashCode());
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getNullOption() == null) ? 0 : getNullOption().hashCode());
        return hashCode;
    }

    @Override
    public NumericEqualityFilter clone() {
        try {
            return (NumericEqualityFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.NumericEqualityFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
