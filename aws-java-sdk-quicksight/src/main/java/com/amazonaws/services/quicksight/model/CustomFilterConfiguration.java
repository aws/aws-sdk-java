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
 * A custom filter that filters based on a single value. This filter can be partially matched.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CustomFilterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomFilterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     */
    private String matchOperator;
    /**
     * <p>
     * The category value for the filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     */
    private String categoryValue;
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
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>CategoryValue</code>.
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
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     * 
     * @param matchOperator
     *        The match operator that is used to determine if a filter should be applied.
     * @see CategoryFilterMatchOperator
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
     * @see CategoryFilterMatchOperator
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
     * @see CategoryFilterMatchOperator
     */

    public CustomFilterConfiguration withMatchOperator(String matchOperator) {
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
     * @see CategoryFilterMatchOperator
     */

    public CustomFilterConfiguration withMatchOperator(CategoryFilterMatchOperator matchOperator) {
        this.matchOperator = matchOperator.toString();
        return this;
    }

    /**
     * <p>
     * The category value for the filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     * 
     * @param categoryValue
     *        The category value for the filter.</p>
     *        <p>
     *        This field is mutually exclusive to <code>ParameterName</code>.
     */

    public void setCategoryValue(String categoryValue) {
        this.categoryValue = categoryValue;
    }

    /**
     * <p>
     * The category value for the filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     * 
     * @return The category value for the filter.</p>
     *         <p>
     *         This field is mutually exclusive to <code>ParameterName</code>.
     */

    public String getCategoryValue() {
        return this.categoryValue;
    }

    /**
     * <p>
     * The category value for the filter.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>ParameterName</code>.
     * </p>
     * 
     * @param categoryValue
     *        The category value for the filter.</p>
     *        <p>
     *        This field is mutually exclusive to <code>ParameterName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomFilterConfiguration withCategoryValue(String categoryValue) {
        setCategoryValue(categoryValue);
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
     * @see CategoryFilterSelectAllOptions
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
     * @see CategoryFilterSelectAllOptions
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
     * @see CategoryFilterSelectAllOptions
     */

    public CustomFilterConfiguration withSelectAllOptions(String selectAllOptions) {
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
     * @see CategoryFilterSelectAllOptions
     */

    public CustomFilterConfiguration withSelectAllOptions(CategoryFilterSelectAllOptions selectAllOptions) {
        this.selectAllOptions = selectAllOptions.toString();
        return this;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>CategoryValue</code>.
     * </p>
     * 
     * @param parameterName
     *        The parameter whose value should be used for the filter value.</p>
     *        <p>
     *        This field is mutually exclusive to <code>CategoryValue</code>.
     */

    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>CategoryValue</code>.
     * </p>
     * 
     * @return The parameter whose value should be used for the filter value.</p>
     *         <p>
     *         This field is mutually exclusive to <code>CategoryValue</code>.
     */

    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * <p>
     * The parameter whose value should be used for the filter value.
     * </p>
     * <p>
     * This field is mutually exclusive to <code>CategoryValue</code>.
     * </p>
     * 
     * @param parameterName
     *        The parameter whose value should be used for the filter value.</p>
     *        <p>
     *        This field is mutually exclusive to <code>CategoryValue</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CustomFilterConfiguration withParameterName(String parameterName) {
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

    public CustomFilterConfiguration withNullOption(String nullOption) {
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

    public CustomFilterConfiguration withNullOption(FilterNullOption nullOption) {
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
        if (getMatchOperator() != null)
            sb.append("MatchOperator: ").append(getMatchOperator()).append(",");
        if (getCategoryValue() != null)
            sb.append("CategoryValue: ").append(getCategoryValue()).append(",");
        if (getSelectAllOptions() != null)
            sb.append("SelectAllOptions: ").append(getSelectAllOptions()).append(",");
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

        if (obj instanceof CustomFilterConfiguration == false)
            return false;
        CustomFilterConfiguration other = (CustomFilterConfiguration) obj;
        if (other.getMatchOperator() == null ^ this.getMatchOperator() == null)
            return false;
        if (other.getMatchOperator() != null && other.getMatchOperator().equals(this.getMatchOperator()) == false)
            return false;
        if (other.getCategoryValue() == null ^ this.getCategoryValue() == null)
            return false;
        if (other.getCategoryValue() != null && other.getCategoryValue().equals(this.getCategoryValue()) == false)
            return false;
        if (other.getSelectAllOptions() == null ^ this.getSelectAllOptions() == null)
            return false;
        if (other.getSelectAllOptions() != null && other.getSelectAllOptions().equals(this.getSelectAllOptions()) == false)
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

        hashCode = prime * hashCode + ((getMatchOperator() == null) ? 0 : getMatchOperator().hashCode());
        hashCode = prime * hashCode + ((getCategoryValue() == null) ? 0 : getCategoryValue().hashCode());
        hashCode = prime * hashCode + ((getSelectAllOptions() == null) ? 0 : getSelectAllOptions().hashCode());
        hashCode = prime * hashCode + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
        hashCode = prime * hashCode + ((getNullOption() == null) ? 0 : getNullOption().hashCode());
        return hashCode;
    }

    @Override
    public CustomFilterConfiguration clone() {
        try {
            return (CustomFilterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CustomFilterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
