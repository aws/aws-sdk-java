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
 * A <code>TimeRangeFilter</code> filters values that are between two specified values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TimeRangeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeRangeFilter implements Serializable, Cloneable, StructuredPojo {

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
    private TimeRangeFilterValue rangeMinimumValue;
    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     */
    private TimeRangeFilterValue rangeMaximumValue;
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
     * The exclude period of the time range filter.
     * </p>
     */
    private ExcludePeriodConfiguration excludePeriodConfiguration;
    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;

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

    public TimeRangeFilter withFilterId(String filterId) {
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

    public TimeRangeFilter withColumn(ColumnIdentifier column) {
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

    public TimeRangeFilter withIncludeMinimum(Boolean includeMinimum) {
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

    public TimeRangeFilter withIncludeMaximum(Boolean includeMaximum) {
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
     * @param rangeMinimumValue
     *        The minimum value for the filter value range.
     */

    public void setRangeMinimumValue(TimeRangeFilterValue rangeMinimumValue) {
        this.rangeMinimumValue = rangeMinimumValue;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @return The minimum value for the filter value range.
     */

    public TimeRangeFilterValue getRangeMinimumValue() {
        return this.rangeMinimumValue;
    }

    /**
     * <p>
     * The minimum value for the filter value range.
     * </p>
     * 
     * @param rangeMinimumValue
     *        The minimum value for the filter value range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRangeFilter withRangeMinimumValue(TimeRangeFilterValue rangeMinimumValue) {
        setRangeMinimumValue(rangeMinimumValue);
        return this;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @param rangeMaximumValue
     *        The maximum value for the filter value range.
     */

    public void setRangeMaximumValue(TimeRangeFilterValue rangeMaximumValue) {
        this.rangeMaximumValue = rangeMaximumValue;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @return The maximum value for the filter value range.
     */

    public TimeRangeFilterValue getRangeMaximumValue() {
        return this.rangeMaximumValue;
    }

    /**
     * <p>
     * The maximum value for the filter value range.
     * </p>
     * 
     * @param rangeMaximumValue
     *        The maximum value for the filter value range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRangeFilter withRangeMaximumValue(TimeRangeFilterValue rangeMaximumValue) {
        setRangeMaximumValue(rangeMaximumValue);
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

    public TimeRangeFilter withNullOption(String nullOption) {
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

    public TimeRangeFilter withNullOption(FilterNullOption nullOption) {
        this.nullOption = nullOption.toString();
        return this;
    }

    /**
     * <p>
     * The exclude period of the time range filter.
     * </p>
     * 
     * @param excludePeriodConfiguration
     *        The exclude period of the time range filter.
     */

    public void setExcludePeriodConfiguration(ExcludePeriodConfiguration excludePeriodConfiguration) {
        this.excludePeriodConfiguration = excludePeriodConfiguration;
    }

    /**
     * <p>
     * The exclude period of the time range filter.
     * </p>
     * 
     * @return The exclude period of the time range filter.
     */

    public ExcludePeriodConfiguration getExcludePeriodConfiguration() {
        return this.excludePeriodConfiguration;
    }

    /**
     * <p>
     * The exclude period of the time range filter.
     * </p>
     * 
     * @param excludePeriodConfiguration
     *        The exclude period of the time range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeRangeFilter withExcludePeriodConfiguration(ExcludePeriodConfiguration excludePeriodConfiguration) {
        setExcludePeriodConfiguration(excludePeriodConfiguration);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TimeGranularity
     */

    public void setTimeGranularity(String timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @return The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TimeGranularity
     */

    public String getTimeGranularity() {
        return this.timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public TimeRangeFilter withTimeGranularity(String timeGranularity) {
        setTimeGranularity(timeGranularity);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public TimeRangeFilter withTimeGranularity(TimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
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
        if (getRangeMinimumValue() != null)
            sb.append("RangeMinimumValue: ").append(getRangeMinimumValue()).append(",");
        if (getRangeMaximumValue() != null)
            sb.append("RangeMaximumValue: ").append(getRangeMaximumValue()).append(",");
        if (getNullOption() != null)
            sb.append("NullOption: ").append(getNullOption()).append(",");
        if (getExcludePeriodConfiguration() != null)
            sb.append("ExcludePeriodConfiguration: ").append(getExcludePeriodConfiguration()).append(",");
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeRangeFilter == false)
            return false;
        TimeRangeFilter other = (TimeRangeFilter) obj;
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
        if (other.getRangeMinimumValue() == null ^ this.getRangeMinimumValue() == null)
            return false;
        if (other.getRangeMinimumValue() != null && other.getRangeMinimumValue().equals(this.getRangeMinimumValue()) == false)
            return false;
        if (other.getRangeMaximumValue() == null ^ this.getRangeMaximumValue() == null)
            return false;
        if (other.getRangeMaximumValue() != null && other.getRangeMaximumValue().equals(this.getRangeMaximumValue()) == false)
            return false;
        if (other.getNullOption() == null ^ this.getNullOption() == null)
            return false;
        if (other.getNullOption() != null && other.getNullOption().equals(this.getNullOption()) == false)
            return false;
        if (other.getExcludePeriodConfiguration() == null ^ this.getExcludePeriodConfiguration() == null)
            return false;
        if (other.getExcludePeriodConfiguration() != null && other.getExcludePeriodConfiguration().equals(this.getExcludePeriodConfiguration()) == false)
            return false;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
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
        hashCode = prime * hashCode + ((getRangeMinimumValue() == null) ? 0 : getRangeMinimumValue().hashCode());
        hashCode = prime * hashCode + ((getRangeMaximumValue() == null) ? 0 : getRangeMaximumValue().hashCode());
        hashCode = prime * hashCode + ((getNullOption() == null) ? 0 : getNullOption().hashCode());
        hashCode = prime * hashCode + ((getExcludePeriodConfiguration() == null) ? 0 : getExcludePeriodConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        return hashCode;
    }

    @Override
    public TimeRangeFilter clone() {
        try {
            return (TimeRangeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TimeRangeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
