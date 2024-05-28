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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The type of search filter to apply.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchFilterExpression" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchFilterExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters based on date and time.
     * </p>
     */
    private DateTimeFilterExpression dateTimeFilter;
    /**
     * <p>
     * Filters by group.
     * </p>
     */
    private SearchGroupedFilterExpressions groupFilter;
    /**
     * <p>
     * Filters by parameter.
     * </p>
     */
    private ParameterFilterExpression parameterFilter;
    /**
     * <p>
     * Filters by a specified search term.
     * </p>
     */
    private SearchTermFilterExpression searchTermFilter;
    /**
     * <p>
     * Filters by a string.
     * </p>
     */
    private StringFilterExpression stringFilter;

    /**
     * <p>
     * Filters based on date and time.
     * </p>
     * 
     * @param dateTimeFilter
     *        Filters based on date and time.
     */

    public void setDateTimeFilter(DateTimeFilterExpression dateTimeFilter) {
        this.dateTimeFilter = dateTimeFilter;
    }

    /**
     * <p>
     * Filters based on date and time.
     * </p>
     * 
     * @return Filters based on date and time.
     */

    public DateTimeFilterExpression getDateTimeFilter() {
        return this.dateTimeFilter;
    }

    /**
     * <p>
     * Filters based on date and time.
     * </p>
     * 
     * @param dateTimeFilter
     *        Filters based on date and time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilterExpression withDateTimeFilter(DateTimeFilterExpression dateTimeFilter) {
        setDateTimeFilter(dateTimeFilter);
        return this;
    }

    /**
     * <p>
     * Filters by group.
     * </p>
     * 
     * @param groupFilter
     *        Filters by group.
     */

    public void setGroupFilter(SearchGroupedFilterExpressions groupFilter) {
        this.groupFilter = groupFilter;
    }

    /**
     * <p>
     * Filters by group.
     * </p>
     * 
     * @return Filters by group.
     */

    public SearchGroupedFilterExpressions getGroupFilter() {
        return this.groupFilter;
    }

    /**
     * <p>
     * Filters by group.
     * </p>
     * 
     * @param groupFilter
     *        Filters by group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilterExpression withGroupFilter(SearchGroupedFilterExpressions groupFilter) {
        setGroupFilter(groupFilter);
        return this;
    }

    /**
     * <p>
     * Filters by parameter.
     * </p>
     * 
     * @param parameterFilter
     *        Filters by parameter.
     */

    public void setParameterFilter(ParameterFilterExpression parameterFilter) {
        this.parameterFilter = parameterFilter;
    }

    /**
     * <p>
     * Filters by parameter.
     * </p>
     * 
     * @return Filters by parameter.
     */

    public ParameterFilterExpression getParameterFilter() {
        return this.parameterFilter;
    }

    /**
     * <p>
     * Filters by parameter.
     * </p>
     * 
     * @param parameterFilter
     *        Filters by parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilterExpression withParameterFilter(ParameterFilterExpression parameterFilter) {
        setParameterFilter(parameterFilter);
        return this;
    }

    /**
     * <p>
     * Filters by a specified search term.
     * </p>
     * 
     * @param searchTermFilter
     *        Filters by a specified search term.
     */

    public void setSearchTermFilter(SearchTermFilterExpression searchTermFilter) {
        this.searchTermFilter = searchTermFilter;
    }

    /**
     * <p>
     * Filters by a specified search term.
     * </p>
     * 
     * @return Filters by a specified search term.
     */

    public SearchTermFilterExpression getSearchTermFilter() {
        return this.searchTermFilter;
    }

    /**
     * <p>
     * Filters by a specified search term.
     * </p>
     * 
     * @param searchTermFilter
     *        Filters by a specified search term.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilterExpression withSearchTermFilter(SearchTermFilterExpression searchTermFilter) {
        setSearchTermFilter(searchTermFilter);
        return this;
    }

    /**
     * <p>
     * Filters by a string.
     * </p>
     * 
     * @param stringFilter
     *        Filters by a string.
     */

    public void setStringFilter(StringFilterExpression stringFilter) {
        this.stringFilter = stringFilter;
    }

    /**
     * <p>
     * Filters by a string.
     * </p>
     * 
     * @return Filters by a string.
     */

    public StringFilterExpression getStringFilter() {
        return this.stringFilter;
    }

    /**
     * <p>
     * Filters by a string.
     * </p>
     * 
     * @param stringFilter
     *        Filters by a string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchFilterExpression withStringFilter(StringFilterExpression stringFilter) {
        setStringFilter(stringFilter);
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
        if (getDateTimeFilter() != null)
            sb.append("DateTimeFilter: ").append(getDateTimeFilter()).append(",");
        if (getGroupFilter() != null)
            sb.append("GroupFilter: ").append(getGroupFilter()).append(",");
        if (getParameterFilter() != null)
            sb.append("ParameterFilter: ").append(getParameterFilter()).append(",");
        if (getSearchTermFilter() != null)
            sb.append("SearchTermFilter: ").append(getSearchTermFilter()).append(",");
        if (getStringFilter() != null)
            sb.append("StringFilter: ").append(getStringFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchFilterExpression == false)
            return false;
        SearchFilterExpression other = (SearchFilterExpression) obj;
        if (other.getDateTimeFilter() == null ^ this.getDateTimeFilter() == null)
            return false;
        if (other.getDateTimeFilter() != null && other.getDateTimeFilter().equals(this.getDateTimeFilter()) == false)
            return false;
        if (other.getGroupFilter() == null ^ this.getGroupFilter() == null)
            return false;
        if (other.getGroupFilter() != null && other.getGroupFilter().equals(this.getGroupFilter()) == false)
            return false;
        if (other.getParameterFilter() == null ^ this.getParameterFilter() == null)
            return false;
        if (other.getParameterFilter() != null && other.getParameterFilter().equals(this.getParameterFilter()) == false)
            return false;
        if (other.getSearchTermFilter() == null ^ this.getSearchTermFilter() == null)
            return false;
        if (other.getSearchTermFilter() != null && other.getSearchTermFilter().equals(this.getSearchTermFilter()) == false)
            return false;
        if (other.getStringFilter() == null ^ this.getStringFilter() == null)
            return false;
        if (other.getStringFilter() != null && other.getStringFilter().equals(this.getStringFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDateTimeFilter() == null) ? 0 : getDateTimeFilter().hashCode());
        hashCode = prime * hashCode + ((getGroupFilter() == null) ? 0 : getGroupFilter().hashCode());
        hashCode = prime * hashCode + ((getParameterFilter() == null) ? 0 : getParameterFilter().hashCode());
        hashCode = prime * hashCode + ((getSearchTermFilter() == null) ? 0 : getSearchTermFilter().hashCode());
        hashCode = prime * hashCode + ((getStringFilter() == null) ? 0 : getStringFilter().hashCode());
        return hashCode;
    }

    @Override
    public SearchFilterExpression clone() {
        try {
            return (SearchFilterExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.SearchFilterExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
