/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A structure that represents a filter used to select items for a topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A description of the filter used to select items for a topic.
     * </p>
     */
    private String filterDescription;
    /**
     * <p>
     * The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     * <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * </p>
     */
    private String filterClass;
    /**
     * <p>
     * The name of the filter.
     * </p>
     */
    private String filterName;
    /**
     * <p>
     * The other names or aliases for the filter.
     * </p>
     */
    private java.util.List<String> filterSynonyms;
    /**
     * <p>
     * The name of the field that the filter operates on.
     * </p>
     */
    private String operandFieldName;
    /**
     * <p>
     * The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     * <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>, and
     * <code>RELATIVE_DATE_FILTER</code>.
     * </p>
     */
    private String filterType;
    /**
     * <p>
     * The category filter that is associated with this filter.
     * </p>
     */
    private TopicCategoryFilter categoryFilter;
    /**
     * <p>
     * The numeric equality filter.
     * </p>
     */
    private TopicNumericEqualityFilter numericEqualityFilter;
    /**
     * <p>
     * The numeric range filter.
     * </p>
     */
    private TopicNumericRangeFilter numericRangeFilter;
    /**
     * <p>
     * The date range filter.
     * </p>
     */
    private TopicDateRangeFilter dateRangeFilter;
    /**
     * <p>
     * The relative date filter.
     * </p>
     */
    private TopicRelativeDateFilter relativeDateFilter;

    /**
     * <p>
     * A description of the filter used to select items for a topic.
     * </p>
     * 
     * @param filterDescription
     *        A description of the filter used to select items for a topic.
     */

    public void setFilterDescription(String filterDescription) {
        this.filterDescription = filterDescription;
    }

    /**
     * <p>
     * A description of the filter used to select items for a topic.
     * </p>
     * 
     * @return A description of the filter used to select items for a topic.
     */

    public String getFilterDescription() {
        return this.filterDescription;
    }

    /**
     * <p>
     * A description of the filter used to select items for a topic.
     * </p>
     * 
     * @param filterDescription
     *        A description of the filter used to select items for a topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withFilterDescription(String filterDescription) {
        setFilterDescription(filterDescription);
        return this;
    }

    /**
     * <p>
     * The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     * <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * </p>
     * 
     * @param filterClass
     *        The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     *        <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * @see FilterClass
     */

    public void setFilterClass(String filterClass) {
        this.filterClass = filterClass;
    }

    /**
     * <p>
     * The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     * <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * </p>
     * 
     * @return The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     *         <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * @see FilterClass
     */

    public String getFilterClass() {
        return this.filterClass;
    }

    /**
     * <p>
     * The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     * <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * </p>
     * 
     * @param filterClass
     *        The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     *        <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterClass
     */

    public TopicFilter withFilterClass(String filterClass) {
        setFilterClass(filterClass);
        return this;
    }

    /**
     * <p>
     * The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     * <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * </p>
     * 
     * @param filterClass
     *        The class of the filter. Valid values for this structure are <code>ENFORCED_VALUE_FILTER</code>,
     *        <code>CONDITIONAL_VALUE_FILTER</code>, and <code>NAMED_VALUE_FILTER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterClass
     */

    public TopicFilter withFilterClass(FilterClass filterClass) {
        this.filterClass = filterClass.toString();
        return this;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param filterName
     *        The name of the filter.
     */

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @return The name of the filter.
     */

    public String getFilterName() {
        return this.filterName;
    }

    /**
     * <p>
     * The name of the filter.
     * </p>
     * 
     * @param filterName
     *        The name of the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withFilterName(String filterName) {
        setFilterName(filterName);
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the filter.
     * </p>
     * 
     * @return The other names or aliases for the filter.
     */

    public java.util.List<String> getFilterSynonyms() {
        return filterSynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the filter.
     * </p>
     * 
     * @param filterSynonyms
     *        The other names or aliases for the filter.
     */

    public void setFilterSynonyms(java.util.Collection<String> filterSynonyms) {
        if (filterSynonyms == null) {
            this.filterSynonyms = null;
            return;
        }

        this.filterSynonyms = new java.util.ArrayList<String>(filterSynonyms);
    }

    /**
     * <p>
     * The other names or aliases for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterSynonyms(java.util.Collection)} or {@link #withFilterSynonyms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param filterSynonyms
     *        The other names or aliases for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withFilterSynonyms(String... filterSynonyms) {
        if (this.filterSynonyms == null) {
            setFilterSynonyms(new java.util.ArrayList<String>(filterSynonyms.length));
        }
        for (String ele : filterSynonyms) {
            this.filterSynonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the filter.
     * </p>
     * 
     * @param filterSynonyms
     *        The other names or aliases for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withFilterSynonyms(java.util.Collection<String> filterSynonyms) {
        setFilterSynonyms(filterSynonyms);
        return this;
    }

    /**
     * <p>
     * The name of the field that the filter operates on.
     * </p>
     * 
     * @param operandFieldName
     *        The name of the field that the filter operates on.
     */

    public void setOperandFieldName(String operandFieldName) {
        this.operandFieldName = operandFieldName;
    }

    /**
     * <p>
     * The name of the field that the filter operates on.
     * </p>
     * 
     * @return The name of the field that the filter operates on.
     */

    public String getOperandFieldName() {
        return this.operandFieldName;
    }

    /**
     * <p>
     * The name of the field that the filter operates on.
     * </p>
     * 
     * @param operandFieldName
     *        The name of the field that the filter operates on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withOperandFieldName(String operandFieldName) {
        setOperandFieldName(operandFieldName);
        return this;
    }

    /**
     * <p>
     * The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     * <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>, and
     * <code>RELATIVE_DATE_FILTER</code>.
     * </p>
     * 
     * @param filterType
     *        The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     *        <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>,
     *        and <code>RELATIVE_DATE_FILTER</code>.
     * @see NamedFilterType
     */

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * <p>
     * The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     * <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>, and
     * <code>RELATIVE_DATE_FILTER</code>.
     * </p>
     * 
     * @return The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     *         <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>,
     *         and <code>RELATIVE_DATE_FILTER</code>.
     * @see NamedFilterType
     */

    public String getFilterType() {
        return this.filterType;
    }

    /**
     * <p>
     * The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     * <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>, and
     * <code>RELATIVE_DATE_FILTER</code>.
     * </p>
     * 
     * @param filterType
     *        The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     *        <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>,
     *        and <code>RELATIVE_DATE_FILTER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedFilterType
     */

    public TopicFilter withFilterType(String filterType) {
        setFilterType(filterType);
        return this;
    }

    /**
     * <p>
     * The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     * <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>, and
     * <code>RELATIVE_DATE_FILTER</code>.
     * </p>
     * 
     * @param filterType
     *        The type of the filter. Valid values for this structure are <code>CATEGORY_FILTER</code>,
     *        <code>NUMERIC_EQUALITY_FILTER</code>, <code>NUMERIC_RANGE_FILTER</code>, <code>DATE_RANGE_FILTER</code>,
     *        and <code>RELATIVE_DATE_FILTER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NamedFilterType
     */

    public TopicFilter withFilterType(NamedFilterType filterType) {
        this.filterType = filterType.toString();
        return this;
    }

    /**
     * <p>
     * The category filter that is associated with this filter.
     * </p>
     * 
     * @param categoryFilter
     *        The category filter that is associated with this filter.
     */

    public void setCategoryFilter(TopicCategoryFilter categoryFilter) {
        this.categoryFilter = categoryFilter;
    }

    /**
     * <p>
     * The category filter that is associated with this filter.
     * </p>
     * 
     * @return The category filter that is associated with this filter.
     */

    public TopicCategoryFilter getCategoryFilter() {
        return this.categoryFilter;
    }

    /**
     * <p>
     * The category filter that is associated with this filter.
     * </p>
     * 
     * @param categoryFilter
     *        The category filter that is associated with this filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withCategoryFilter(TopicCategoryFilter categoryFilter) {
        setCategoryFilter(categoryFilter);
        return this;
    }

    /**
     * <p>
     * The numeric equality filter.
     * </p>
     * 
     * @param numericEqualityFilter
     *        The numeric equality filter.
     */

    public void setNumericEqualityFilter(TopicNumericEqualityFilter numericEqualityFilter) {
        this.numericEqualityFilter = numericEqualityFilter;
    }

    /**
     * <p>
     * The numeric equality filter.
     * </p>
     * 
     * @return The numeric equality filter.
     */

    public TopicNumericEqualityFilter getNumericEqualityFilter() {
        return this.numericEqualityFilter;
    }

    /**
     * <p>
     * The numeric equality filter.
     * </p>
     * 
     * @param numericEqualityFilter
     *        The numeric equality filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withNumericEqualityFilter(TopicNumericEqualityFilter numericEqualityFilter) {
        setNumericEqualityFilter(numericEqualityFilter);
        return this;
    }

    /**
     * <p>
     * The numeric range filter.
     * </p>
     * 
     * @param numericRangeFilter
     *        The numeric range filter.
     */

    public void setNumericRangeFilter(TopicNumericRangeFilter numericRangeFilter) {
        this.numericRangeFilter = numericRangeFilter;
    }

    /**
     * <p>
     * The numeric range filter.
     * </p>
     * 
     * @return The numeric range filter.
     */

    public TopicNumericRangeFilter getNumericRangeFilter() {
        return this.numericRangeFilter;
    }

    /**
     * <p>
     * The numeric range filter.
     * </p>
     * 
     * @param numericRangeFilter
     *        The numeric range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withNumericRangeFilter(TopicNumericRangeFilter numericRangeFilter) {
        setNumericRangeFilter(numericRangeFilter);
        return this;
    }

    /**
     * <p>
     * The date range filter.
     * </p>
     * 
     * @param dateRangeFilter
     *        The date range filter.
     */

    public void setDateRangeFilter(TopicDateRangeFilter dateRangeFilter) {
        this.dateRangeFilter = dateRangeFilter;
    }

    /**
     * <p>
     * The date range filter.
     * </p>
     * 
     * @return The date range filter.
     */

    public TopicDateRangeFilter getDateRangeFilter() {
        return this.dateRangeFilter;
    }

    /**
     * <p>
     * The date range filter.
     * </p>
     * 
     * @param dateRangeFilter
     *        The date range filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withDateRangeFilter(TopicDateRangeFilter dateRangeFilter) {
        setDateRangeFilter(dateRangeFilter);
        return this;
    }

    /**
     * <p>
     * The relative date filter.
     * </p>
     * 
     * @param relativeDateFilter
     *        The relative date filter.
     */

    public void setRelativeDateFilter(TopicRelativeDateFilter relativeDateFilter) {
        this.relativeDateFilter = relativeDateFilter;
    }

    /**
     * <p>
     * The relative date filter.
     * </p>
     * 
     * @return The relative date filter.
     */

    public TopicRelativeDateFilter getRelativeDateFilter() {
        return this.relativeDateFilter;
    }

    /**
     * <p>
     * The relative date filter.
     * </p>
     * 
     * @param relativeDateFilter
     *        The relative date filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicFilter withRelativeDateFilter(TopicRelativeDateFilter relativeDateFilter) {
        setRelativeDateFilter(relativeDateFilter);
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
        if (getFilterDescription() != null)
            sb.append("FilterDescription: ").append(getFilterDescription()).append(",");
        if (getFilterClass() != null)
            sb.append("FilterClass: ").append(getFilterClass()).append(",");
        if (getFilterName() != null)
            sb.append("FilterName: ").append(getFilterName()).append(",");
        if (getFilterSynonyms() != null)
            sb.append("FilterSynonyms: ").append(getFilterSynonyms()).append(",");
        if (getOperandFieldName() != null)
            sb.append("OperandFieldName: ").append(getOperandFieldName()).append(",");
        if (getFilterType() != null)
            sb.append("FilterType: ").append(getFilterType()).append(",");
        if (getCategoryFilter() != null)
            sb.append("CategoryFilter: ").append(getCategoryFilter()).append(",");
        if (getNumericEqualityFilter() != null)
            sb.append("NumericEqualityFilter: ").append(getNumericEqualityFilter()).append(",");
        if (getNumericRangeFilter() != null)
            sb.append("NumericRangeFilter: ").append(getNumericRangeFilter()).append(",");
        if (getDateRangeFilter() != null)
            sb.append("DateRangeFilter: ").append(getDateRangeFilter()).append(",");
        if (getRelativeDateFilter() != null)
            sb.append("RelativeDateFilter: ").append(getRelativeDateFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicFilter == false)
            return false;
        TopicFilter other = (TopicFilter) obj;
        if (other.getFilterDescription() == null ^ this.getFilterDescription() == null)
            return false;
        if (other.getFilterDescription() != null && other.getFilterDescription().equals(this.getFilterDescription()) == false)
            return false;
        if (other.getFilterClass() == null ^ this.getFilterClass() == null)
            return false;
        if (other.getFilterClass() != null && other.getFilterClass().equals(this.getFilterClass()) == false)
            return false;
        if (other.getFilterName() == null ^ this.getFilterName() == null)
            return false;
        if (other.getFilterName() != null && other.getFilterName().equals(this.getFilterName()) == false)
            return false;
        if (other.getFilterSynonyms() == null ^ this.getFilterSynonyms() == null)
            return false;
        if (other.getFilterSynonyms() != null && other.getFilterSynonyms().equals(this.getFilterSynonyms()) == false)
            return false;
        if (other.getOperandFieldName() == null ^ this.getOperandFieldName() == null)
            return false;
        if (other.getOperandFieldName() != null && other.getOperandFieldName().equals(this.getOperandFieldName()) == false)
            return false;
        if (other.getFilterType() == null ^ this.getFilterType() == null)
            return false;
        if (other.getFilterType() != null && other.getFilterType().equals(this.getFilterType()) == false)
            return false;
        if (other.getCategoryFilter() == null ^ this.getCategoryFilter() == null)
            return false;
        if (other.getCategoryFilter() != null && other.getCategoryFilter().equals(this.getCategoryFilter()) == false)
            return false;
        if (other.getNumericEqualityFilter() == null ^ this.getNumericEqualityFilter() == null)
            return false;
        if (other.getNumericEqualityFilter() != null && other.getNumericEqualityFilter().equals(this.getNumericEqualityFilter()) == false)
            return false;
        if (other.getNumericRangeFilter() == null ^ this.getNumericRangeFilter() == null)
            return false;
        if (other.getNumericRangeFilter() != null && other.getNumericRangeFilter().equals(this.getNumericRangeFilter()) == false)
            return false;
        if (other.getDateRangeFilter() == null ^ this.getDateRangeFilter() == null)
            return false;
        if (other.getDateRangeFilter() != null && other.getDateRangeFilter().equals(this.getDateRangeFilter()) == false)
            return false;
        if (other.getRelativeDateFilter() == null ^ this.getRelativeDateFilter() == null)
            return false;
        if (other.getRelativeDateFilter() != null && other.getRelativeDateFilter().equals(this.getRelativeDateFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterDescription() == null) ? 0 : getFilterDescription().hashCode());
        hashCode = prime * hashCode + ((getFilterClass() == null) ? 0 : getFilterClass().hashCode());
        hashCode = prime * hashCode + ((getFilterName() == null) ? 0 : getFilterName().hashCode());
        hashCode = prime * hashCode + ((getFilterSynonyms() == null) ? 0 : getFilterSynonyms().hashCode());
        hashCode = prime * hashCode + ((getOperandFieldName() == null) ? 0 : getOperandFieldName().hashCode());
        hashCode = prime * hashCode + ((getFilterType() == null) ? 0 : getFilterType().hashCode());
        hashCode = prime * hashCode + ((getCategoryFilter() == null) ? 0 : getCategoryFilter().hashCode());
        hashCode = prime * hashCode + ((getNumericEqualityFilter() == null) ? 0 : getNumericEqualityFilter().hashCode());
        hashCode = prime * hashCode + ((getNumericRangeFilter() == null) ? 0 : getNumericRangeFilter().hashCode());
        hashCode = prime * hashCode + ((getDateRangeFilter() == null) ? 0 : getDateRangeFilter().hashCode());
        hashCode = prime * hashCode + ((getRelativeDateFilter() == null) ? 0 : getRelativeDateFilter().hashCode());
        return hashCode;
    }

    @Override
    public TopicFilter clone() {
        try {
            return (TopicFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
