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
 * A <code>RelativeDatesFilter</code> filters relative dates values.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RelativeDatesFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RelativeDatesFilter implements Serializable, Cloneable, StructuredPojo {

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
     * The date configuration of the filter.
     * </p>
     */
    private AnchorDateConfiguration anchorDateConfiguration;
    /**
     * <p>
     * The minimum granularity (period granularity) of the relative dates filter.
     * </p>
     */
    private String minimumGranularity;
    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;
    /**
     * <p>
     * The range date type of the filter. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREVIOUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEXT</code>
     * </p>
     * </li>
     * </ul>
     */
    private String relativeDateType;
    /**
     * <p>
     * The date value of the filter.
     * </p>
     */
    private Integer relativeDateValue;
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
     * The configuration for the exclude period of the filter.
     * </p>
     */
    private ExcludePeriodConfiguration excludePeriodConfiguration;

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

    public RelativeDatesFilter withFilterId(String filterId) {
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

    public RelativeDatesFilter withColumn(ColumnIdentifier column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * The date configuration of the filter.
     * </p>
     * 
     * @param anchorDateConfiguration
     *        The date configuration of the filter.
     */

    public void setAnchorDateConfiguration(AnchorDateConfiguration anchorDateConfiguration) {
        this.anchorDateConfiguration = anchorDateConfiguration;
    }

    /**
     * <p>
     * The date configuration of the filter.
     * </p>
     * 
     * @return The date configuration of the filter.
     */

    public AnchorDateConfiguration getAnchorDateConfiguration() {
        return this.anchorDateConfiguration;
    }

    /**
     * <p>
     * The date configuration of the filter.
     * </p>
     * 
     * @param anchorDateConfiguration
     *        The date configuration of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeDatesFilter withAnchorDateConfiguration(AnchorDateConfiguration anchorDateConfiguration) {
        setAnchorDateConfiguration(anchorDateConfiguration);
        return this;
    }

    /**
     * <p>
     * The minimum granularity (period granularity) of the relative dates filter.
     * </p>
     * 
     * @param minimumGranularity
     *        The minimum granularity (period granularity) of the relative dates filter.
     * @see TimeGranularity
     */

    public void setMinimumGranularity(String minimumGranularity) {
        this.minimumGranularity = minimumGranularity;
    }

    /**
     * <p>
     * The minimum granularity (period granularity) of the relative dates filter.
     * </p>
     * 
     * @return The minimum granularity (period granularity) of the relative dates filter.
     * @see TimeGranularity
     */

    public String getMinimumGranularity() {
        return this.minimumGranularity;
    }

    /**
     * <p>
     * The minimum granularity (period granularity) of the relative dates filter.
     * </p>
     * 
     * @param minimumGranularity
     *        The minimum granularity (period granularity) of the relative dates filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public RelativeDatesFilter withMinimumGranularity(String minimumGranularity) {
        setMinimumGranularity(minimumGranularity);
        return this;
    }

    /**
     * <p>
     * The minimum granularity (period granularity) of the relative dates filter.
     * </p>
     * 
     * @param minimumGranularity
     *        The minimum granularity (period granularity) of the relative dates filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeGranularity
     */

    public RelativeDatesFilter withMinimumGranularity(TimeGranularity minimumGranularity) {
        this.minimumGranularity = minimumGranularity.toString();
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

    public RelativeDatesFilter withTimeGranularity(String timeGranularity) {
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

    public RelativeDatesFilter withTimeGranularity(TimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
        return this;
    }

    /**
     * <p>
     * The range date type of the filter. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREVIOUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEXT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param relativeDateType
     *        The range date type of the filter. Choose one of the options below:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREVIOUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEXT</code>
     *        </p>
     *        </li>
     * @see RelativeDateType
     */

    public void setRelativeDateType(String relativeDateType) {
        this.relativeDateType = relativeDateType;
    }

    /**
     * <p>
     * The range date type of the filter. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREVIOUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEXT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The range date type of the filter. Choose one of the options below:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PREVIOUS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THIS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LAST</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOW</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NEXT</code>
     *         </p>
     *         </li>
     * @see RelativeDateType
     */

    public String getRelativeDateType() {
        return this.relativeDateType;
    }

    /**
     * <p>
     * The range date type of the filter. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREVIOUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEXT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param relativeDateType
     *        The range date type of the filter. Choose one of the options below:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREVIOUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEXT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativeDateType
     */

    public RelativeDatesFilter withRelativeDateType(String relativeDateType) {
        setRelativeDateType(relativeDateType);
        return this;
    }

    /**
     * <p>
     * The range date type of the filter. Choose one of the options below:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PREVIOUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LAST</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOW</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NEXT</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param relativeDateType
     *        The range date type of the filter. Choose one of the options below:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PREVIOUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LAST</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOW</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NEXT</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativeDateType
     */

    public RelativeDatesFilter withRelativeDateType(RelativeDateType relativeDateType) {
        this.relativeDateType = relativeDateType.toString();
        return this;
    }

    /**
     * <p>
     * The date value of the filter.
     * </p>
     * 
     * @param relativeDateValue
     *        The date value of the filter.
     */

    public void setRelativeDateValue(Integer relativeDateValue) {
        this.relativeDateValue = relativeDateValue;
    }

    /**
     * <p>
     * The date value of the filter.
     * </p>
     * 
     * @return The date value of the filter.
     */

    public Integer getRelativeDateValue() {
        return this.relativeDateValue;
    }

    /**
     * <p>
     * The date value of the filter.
     * </p>
     * 
     * @param relativeDateValue
     *        The date value of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeDatesFilter withRelativeDateValue(Integer relativeDateValue) {
        setRelativeDateValue(relativeDateValue);
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

    public RelativeDatesFilter withParameterName(String parameterName) {
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

    public RelativeDatesFilter withNullOption(String nullOption) {
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

    public RelativeDatesFilter withNullOption(FilterNullOption nullOption) {
        this.nullOption = nullOption.toString();
        return this;
    }

    /**
     * <p>
     * The configuration for the exclude period of the filter.
     * </p>
     * 
     * @param excludePeriodConfiguration
     *        The configuration for the exclude period of the filter.
     */

    public void setExcludePeriodConfiguration(ExcludePeriodConfiguration excludePeriodConfiguration) {
        this.excludePeriodConfiguration = excludePeriodConfiguration;
    }

    /**
     * <p>
     * The configuration for the exclude period of the filter.
     * </p>
     * 
     * @return The configuration for the exclude period of the filter.
     */

    public ExcludePeriodConfiguration getExcludePeriodConfiguration() {
        return this.excludePeriodConfiguration;
    }

    /**
     * <p>
     * The configuration for the exclude period of the filter.
     * </p>
     * 
     * @param excludePeriodConfiguration
     *        The configuration for the exclude period of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RelativeDatesFilter withExcludePeriodConfiguration(ExcludePeriodConfiguration excludePeriodConfiguration) {
        setExcludePeriodConfiguration(excludePeriodConfiguration);
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
        if (getAnchorDateConfiguration() != null)
            sb.append("AnchorDateConfiguration: ").append(getAnchorDateConfiguration()).append(",");
        if (getMinimumGranularity() != null)
            sb.append("MinimumGranularity: ").append(getMinimumGranularity()).append(",");
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity()).append(",");
        if (getRelativeDateType() != null)
            sb.append("RelativeDateType: ").append(getRelativeDateType()).append(",");
        if (getRelativeDateValue() != null)
            sb.append("RelativeDateValue: ").append(getRelativeDateValue()).append(",");
        if (getParameterName() != null)
            sb.append("ParameterName: ").append(getParameterName()).append(",");
        if (getNullOption() != null)
            sb.append("NullOption: ").append(getNullOption()).append(",");
        if (getExcludePeriodConfiguration() != null)
            sb.append("ExcludePeriodConfiguration: ").append(getExcludePeriodConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RelativeDatesFilter == false)
            return false;
        RelativeDatesFilter other = (RelativeDatesFilter) obj;
        if (other.getFilterId() == null ^ this.getFilterId() == null)
            return false;
        if (other.getFilterId() != null && other.getFilterId().equals(this.getFilterId()) == false)
            return false;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
            return false;
        if (other.getAnchorDateConfiguration() == null ^ this.getAnchorDateConfiguration() == null)
            return false;
        if (other.getAnchorDateConfiguration() != null && other.getAnchorDateConfiguration().equals(this.getAnchorDateConfiguration()) == false)
            return false;
        if (other.getMinimumGranularity() == null ^ this.getMinimumGranularity() == null)
            return false;
        if (other.getMinimumGranularity() != null && other.getMinimumGranularity().equals(this.getMinimumGranularity()) == false)
            return false;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
            return false;
        if (other.getRelativeDateType() == null ^ this.getRelativeDateType() == null)
            return false;
        if (other.getRelativeDateType() != null && other.getRelativeDateType().equals(this.getRelativeDateType()) == false)
            return false;
        if (other.getRelativeDateValue() == null ^ this.getRelativeDateValue() == null)
            return false;
        if (other.getRelativeDateValue() != null && other.getRelativeDateValue().equals(this.getRelativeDateValue()) == false)
            return false;
        if (other.getParameterName() == null ^ this.getParameterName() == null)
            return false;
        if (other.getParameterName() != null && other.getParameterName().equals(this.getParameterName()) == false)
            return false;
        if (other.getNullOption() == null ^ this.getNullOption() == null)
            return false;
        if (other.getNullOption() != null && other.getNullOption().equals(this.getNullOption()) == false)
            return false;
        if (other.getExcludePeriodConfiguration() == null ^ this.getExcludePeriodConfiguration() == null)
            return false;
        if (other.getExcludePeriodConfiguration() != null && other.getExcludePeriodConfiguration().equals(this.getExcludePeriodConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterId() == null) ? 0 : getFilterId().hashCode());
        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getAnchorDateConfiguration() == null) ? 0 : getAnchorDateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMinimumGranularity() == null) ? 0 : getMinimumGranularity().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        hashCode = prime * hashCode + ((getRelativeDateType() == null) ? 0 : getRelativeDateType().hashCode());
        hashCode = prime * hashCode + ((getRelativeDateValue() == null) ? 0 : getRelativeDateValue().hashCode());
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getNullOption() == null) ? 0 : getNullOption().hashCode());
        hashCode = prime * hashCode + ((getExcludePeriodConfiguration() == null) ? 0 : getExcludePeriodConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RelativeDatesFilter clone() {
        try {
            return (RelativeDatesFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RelativeDatesFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
