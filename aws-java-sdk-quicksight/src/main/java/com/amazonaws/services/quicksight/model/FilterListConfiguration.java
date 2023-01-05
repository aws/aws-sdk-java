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
 * A list of filter configurations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilterListConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterListConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The match operator that is used to determine if a filter should be applied.
     * </p>
     */
    private String matchOperator;
    /**
     * <p>
     * The list of category values for the filter.
     * </p>
     */
    private java.util.List<String> categoryValues;
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

    public FilterListConfiguration withMatchOperator(String matchOperator) {
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

    public FilterListConfiguration withMatchOperator(CategoryFilterMatchOperator matchOperator) {
        this.matchOperator = matchOperator.toString();
        return this;
    }

    /**
     * <p>
     * The list of category values for the filter.
     * </p>
     * 
     * @return The list of category values for the filter.
     */

    public java.util.List<String> getCategoryValues() {
        return categoryValues;
    }

    /**
     * <p>
     * The list of category values for the filter.
     * </p>
     * 
     * @param categoryValues
     *        The list of category values for the filter.
     */

    public void setCategoryValues(java.util.Collection<String> categoryValues) {
        if (categoryValues == null) {
            this.categoryValues = null;
            return;
        }

        this.categoryValues = new java.util.ArrayList<String>(categoryValues);
    }

    /**
     * <p>
     * The list of category values for the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCategoryValues(java.util.Collection)} or {@link #withCategoryValues(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param categoryValues
     *        The list of category values for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterListConfiguration withCategoryValues(String... categoryValues) {
        if (this.categoryValues == null) {
            setCategoryValues(new java.util.ArrayList<String>(categoryValues.length));
        }
        for (String ele : categoryValues) {
            this.categoryValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of category values for the filter.
     * </p>
     * 
     * @param categoryValues
     *        The list of category values for the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterListConfiguration withCategoryValues(java.util.Collection<String> categoryValues) {
        setCategoryValues(categoryValues);
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

    public FilterListConfiguration withSelectAllOptions(String selectAllOptions) {
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

    public FilterListConfiguration withSelectAllOptions(CategoryFilterSelectAllOptions selectAllOptions) {
        this.selectAllOptions = selectAllOptions.toString();
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
        if (getCategoryValues() != null)
            sb.append("CategoryValues: ").append(getCategoryValues()).append(",");
        if (getSelectAllOptions() != null)
            sb.append("SelectAllOptions: ").append(getSelectAllOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterListConfiguration == false)
            return false;
        FilterListConfiguration other = (FilterListConfiguration) obj;
        if (other.getMatchOperator() == null ^ this.getMatchOperator() == null)
            return false;
        if (other.getMatchOperator() != null && other.getMatchOperator().equals(this.getMatchOperator()) == false)
            return false;
        if (other.getCategoryValues() == null ^ this.getCategoryValues() == null)
            return false;
        if (other.getCategoryValues() != null && other.getCategoryValues().equals(this.getCategoryValues()) == false)
            return false;
        if (other.getSelectAllOptions() == null ^ this.getSelectAllOptions() == null)
            return false;
        if (other.getSelectAllOptions() != null && other.getSelectAllOptions().equals(this.getSelectAllOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMatchOperator() == null) ? 0 : getMatchOperator().hashCode());
        hashCode = prime * hashCode + ((getCategoryValues() == null) ? 0 : getCategoryValues().hashCode());
        hashCode = prime * hashCode + ((getSelectAllOptions() == null) ? 0 : getSelectAllOptions().hashCode());
        return hashCode;
    }

    @Override
    public FilterListConfiguration clone() {
        try {
            return (FilterListConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterListConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
