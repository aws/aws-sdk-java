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
 * With a <code>Filter</code>, you can remove portions of data from a particular visual or view.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>CategoryFilter</code> filters text values.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text
     * filters</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private CategoryFilter categoryFilter;
    /**
     * <p>
     * A <code>NumericRangeFilter</code> filters numeric values that are either inside or outside a given numeric range.
     * </p>
     */
    private NumericRangeFilter numericRangeFilter;
    /**
     * <p>
     * A <code>NumericEqualityFilter</code> filters numeric values that equal or do not equal a given numeric value.
     * </p>
     */
    private NumericEqualityFilter numericEqualityFilter;
    /**
     * <p>
     * A <code>TimeEqualityFilter</code> filters date-time values that equal or do not equal a given date/time value.
     * </p>
     */
    private TimeEqualityFilter timeEqualityFilter;
    /**
     * <p>
     * A <code>TimeRangeFilter</code> filters date-time values that are either inside or outside a given date/time
     * range.
     * </p>
     */
    private TimeRangeFilter timeRangeFilter;
    /**
     * <p>
     * A <code>RelativeDatesFilter</code> filters date values that are relative to a given date.
     * </p>
     */
    private RelativeDatesFilter relativeDatesFilter;
    /**
     * <p>
     * A <code>TopBottomFilter</code> filters data to the top or bottom values for a given column.
     * </p>
     */
    private TopBottomFilter topBottomFilter;

    /**
     * <p>
     * A <code>CategoryFilter</code> filters text values.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text
     * filters</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param categoryFilter
     *        A <code>CategoryFilter</code> filters text values.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text
     *        filters</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setCategoryFilter(CategoryFilter categoryFilter) {
        this.categoryFilter = categoryFilter;
    }

    /**
     * <p>
     * A <code>CategoryFilter</code> filters text values.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text
     * filters</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return A <code>CategoryFilter</code> filters text values.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text
     *         filters</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public CategoryFilter getCategoryFilter() {
        return this.categoryFilter;
    }

    /**
     * <p>
     * A <code>CategoryFilter</code> filters text values.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text
     * filters</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param categoryFilter
     *        A <code>CategoryFilter</code> filters text values.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html">Adding text
     *        filters</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withCategoryFilter(CategoryFilter categoryFilter) {
        setCategoryFilter(categoryFilter);
        return this;
    }

    /**
     * <p>
     * A <code>NumericRangeFilter</code> filters numeric values that are either inside or outside a given numeric range.
     * </p>
     * 
     * @param numericRangeFilter
     *        A <code>NumericRangeFilter</code> filters numeric values that are either inside or outside a given numeric
     *        range.
     */

    public void setNumericRangeFilter(NumericRangeFilter numericRangeFilter) {
        this.numericRangeFilter = numericRangeFilter;
    }

    /**
     * <p>
     * A <code>NumericRangeFilter</code> filters numeric values that are either inside or outside a given numeric range.
     * </p>
     * 
     * @return A <code>NumericRangeFilter</code> filters numeric values that are either inside or outside a given
     *         numeric range.
     */

    public NumericRangeFilter getNumericRangeFilter() {
        return this.numericRangeFilter;
    }

    /**
     * <p>
     * A <code>NumericRangeFilter</code> filters numeric values that are either inside or outside a given numeric range.
     * </p>
     * 
     * @param numericRangeFilter
     *        A <code>NumericRangeFilter</code> filters numeric values that are either inside or outside a given numeric
     *        range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withNumericRangeFilter(NumericRangeFilter numericRangeFilter) {
        setNumericRangeFilter(numericRangeFilter);
        return this;
    }

    /**
     * <p>
     * A <code>NumericEqualityFilter</code> filters numeric values that equal or do not equal a given numeric value.
     * </p>
     * 
     * @param numericEqualityFilter
     *        A <code>NumericEqualityFilter</code> filters numeric values that equal or do not equal a given numeric
     *        value.
     */

    public void setNumericEqualityFilter(NumericEqualityFilter numericEqualityFilter) {
        this.numericEqualityFilter = numericEqualityFilter;
    }

    /**
     * <p>
     * A <code>NumericEqualityFilter</code> filters numeric values that equal or do not equal a given numeric value.
     * </p>
     * 
     * @return A <code>NumericEqualityFilter</code> filters numeric values that equal or do not equal a given numeric
     *         value.
     */

    public NumericEqualityFilter getNumericEqualityFilter() {
        return this.numericEqualityFilter;
    }

    /**
     * <p>
     * A <code>NumericEqualityFilter</code> filters numeric values that equal or do not equal a given numeric value.
     * </p>
     * 
     * @param numericEqualityFilter
     *        A <code>NumericEqualityFilter</code> filters numeric values that equal or do not equal a given numeric
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withNumericEqualityFilter(NumericEqualityFilter numericEqualityFilter) {
        setNumericEqualityFilter(numericEqualityFilter);
        return this;
    }

    /**
     * <p>
     * A <code>TimeEqualityFilter</code> filters date-time values that equal or do not equal a given date/time value.
     * </p>
     * 
     * @param timeEqualityFilter
     *        A <code>TimeEqualityFilter</code> filters date-time values that equal or do not equal a given date/time
     *        value.
     */

    public void setTimeEqualityFilter(TimeEqualityFilter timeEqualityFilter) {
        this.timeEqualityFilter = timeEqualityFilter;
    }

    /**
     * <p>
     * A <code>TimeEqualityFilter</code> filters date-time values that equal or do not equal a given date/time value.
     * </p>
     * 
     * @return A <code>TimeEqualityFilter</code> filters date-time values that equal or do not equal a given date/time
     *         value.
     */

    public TimeEqualityFilter getTimeEqualityFilter() {
        return this.timeEqualityFilter;
    }

    /**
     * <p>
     * A <code>TimeEqualityFilter</code> filters date-time values that equal or do not equal a given date/time value.
     * </p>
     * 
     * @param timeEqualityFilter
     *        A <code>TimeEqualityFilter</code> filters date-time values that equal or do not equal a given date/time
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withTimeEqualityFilter(TimeEqualityFilter timeEqualityFilter) {
        setTimeEqualityFilter(timeEqualityFilter);
        return this;
    }

    /**
     * <p>
     * A <code>TimeRangeFilter</code> filters date-time values that are either inside or outside a given date/time
     * range.
     * </p>
     * 
     * @param timeRangeFilter
     *        A <code>TimeRangeFilter</code> filters date-time values that are either inside or outside a given
     *        date/time range.
     */

    public void setTimeRangeFilter(TimeRangeFilter timeRangeFilter) {
        this.timeRangeFilter = timeRangeFilter;
    }

    /**
     * <p>
     * A <code>TimeRangeFilter</code> filters date-time values that are either inside or outside a given date/time
     * range.
     * </p>
     * 
     * @return A <code>TimeRangeFilter</code> filters date-time values that are either inside or outside a given
     *         date/time range.
     */

    public TimeRangeFilter getTimeRangeFilter() {
        return this.timeRangeFilter;
    }

    /**
     * <p>
     * A <code>TimeRangeFilter</code> filters date-time values that are either inside or outside a given date/time
     * range.
     * </p>
     * 
     * @param timeRangeFilter
     *        A <code>TimeRangeFilter</code> filters date-time values that are either inside or outside a given
     *        date/time range.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withTimeRangeFilter(TimeRangeFilter timeRangeFilter) {
        setTimeRangeFilter(timeRangeFilter);
        return this;
    }

    /**
     * <p>
     * A <code>RelativeDatesFilter</code> filters date values that are relative to a given date.
     * </p>
     * 
     * @param relativeDatesFilter
     *        A <code>RelativeDatesFilter</code> filters date values that are relative to a given date.
     */

    public void setRelativeDatesFilter(RelativeDatesFilter relativeDatesFilter) {
        this.relativeDatesFilter = relativeDatesFilter;
    }

    /**
     * <p>
     * A <code>RelativeDatesFilter</code> filters date values that are relative to a given date.
     * </p>
     * 
     * @return A <code>RelativeDatesFilter</code> filters date values that are relative to a given date.
     */

    public RelativeDatesFilter getRelativeDatesFilter() {
        return this.relativeDatesFilter;
    }

    /**
     * <p>
     * A <code>RelativeDatesFilter</code> filters date values that are relative to a given date.
     * </p>
     * 
     * @param relativeDatesFilter
     *        A <code>RelativeDatesFilter</code> filters date values that are relative to a given date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withRelativeDatesFilter(RelativeDatesFilter relativeDatesFilter) {
        setRelativeDatesFilter(relativeDatesFilter);
        return this;
    }

    /**
     * <p>
     * A <code>TopBottomFilter</code> filters data to the top or bottom values for a given column.
     * </p>
     * 
     * @param topBottomFilter
     *        A <code>TopBottomFilter</code> filters data to the top or bottom values for a given column.
     */

    public void setTopBottomFilter(TopBottomFilter topBottomFilter) {
        this.topBottomFilter = topBottomFilter;
    }

    /**
     * <p>
     * A <code>TopBottomFilter</code> filters data to the top or bottom values for a given column.
     * </p>
     * 
     * @return A <code>TopBottomFilter</code> filters data to the top or bottom values for a given column.
     */

    public TopBottomFilter getTopBottomFilter() {
        return this.topBottomFilter;
    }

    /**
     * <p>
     * A <code>TopBottomFilter</code> filters data to the top or bottom values for a given column.
     * </p>
     * 
     * @param topBottomFilter
     *        A <code>TopBottomFilter</code> filters data to the top or bottom values for a given column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withTopBottomFilter(TopBottomFilter topBottomFilter) {
        setTopBottomFilter(topBottomFilter);
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
        if (getCategoryFilter() != null)
            sb.append("CategoryFilter: ").append(getCategoryFilter()).append(",");
        if (getNumericRangeFilter() != null)
            sb.append("NumericRangeFilter: ").append(getNumericRangeFilter()).append(",");
        if (getNumericEqualityFilter() != null)
            sb.append("NumericEqualityFilter: ").append(getNumericEqualityFilter()).append(",");
        if (getTimeEqualityFilter() != null)
            sb.append("TimeEqualityFilter: ").append(getTimeEqualityFilter()).append(",");
        if (getTimeRangeFilter() != null)
            sb.append("TimeRangeFilter: ").append(getTimeRangeFilter()).append(",");
        if (getRelativeDatesFilter() != null)
            sb.append("RelativeDatesFilter: ").append(getRelativeDatesFilter()).append(",");
        if (getTopBottomFilter() != null)
            sb.append("TopBottomFilter: ").append(getTopBottomFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getCategoryFilter() == null ^ this.getCategoryFilter() == null)
            return false;
        if (other.getCategoryFilter() != null && other.getCategoryFilter().equals(this.getCategoryFilter()) == false)
            return false;
        if (other.getNumericRangeFilter() == null ^ this.getNumericRangeFilter() == null)
            return false;
        if (other.getNumericRangeFilter() != null && other.getNumericRangeFilter().equals(this.getNumericRangeFilter()) == false)
            return false;
        if (other.getNumericEqualityFilter() == null ^ this.getNumericEqualityFilter() == null)
            return false;
        if (other.getNumericEqualityFilter() != null && other.getNumericEqualityFilter().equals(this.getNumericEqualityFilter()) == false)
            return false;
        if (other.getTimeEqualityFilter() == null ^ this.getTimeEqualityFilter() == null)
            return false;
        if (other.getTimeEqualityFilter() != null && other.getTimeEqualityFilter().equals(this.getTimeEqualityFilter()) == false)
            return false;
        if (other.getTimeRangeFilter() == null ^ this.getTimeRangeFilter() == null)
            return false;
        if (other.getTimeRangeFilter() != null && other.getTimeRangeFilter().equals(this.getTimeRangeFilter()) == false)
            return false;
        if (other.getRelativeDatesFilter() == null ^ this.getRelativeDatesFilter() == null)
            return false;
        if (other.getRelativeDatesFilter() != null && other.getRelativeDatesFilter().equals(this.getRelativeDatesFilter()) == false)
            return false;
        if (other.getTopBottomFilter() == null ^ this.getTopBottomFilter() == null)
            return false;
        if (other.getTopBottomFilter() != null && other.getTopBottomFilter().equals(this.getTopBottomFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCategoryFilter() == null) ? 0 : getCategoryFilter().hashCode());
        hashCode = prime * hashCode + ((getNumericRangeFilter() == null) ? 0 : getNumericRangeFilter().hashCode());
        hashCode = prime * hashCode + ((getNumericEqualityFilter() == null) ? 0 : getNumericEqualityFilter().hashCode());
        hashCode = prime * hashCode + ((getTimeEqualityFilter() == null) ? 0 : getTimeEqualityFilter().hashCode());
        hashCode = prime * hashCode + ((getTimeRangeFilter() == null) ? 0 : getTimeRangeFilter().hashCode());
        hashCode = prime * hashCode + ((getRelativeDatesFilter() == null) ? 0 : getRelativeDatesFilter().hashCode());
        hashCode = prime * hashCode + ((getTopBottomFilter() == null) ? 0 : getTopBottomFilter().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
