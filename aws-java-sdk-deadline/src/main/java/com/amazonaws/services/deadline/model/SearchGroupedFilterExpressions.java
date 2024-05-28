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
 * The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search strings in
 * a resource.
 * <p>
 * You can use two groupings per search each within parenthesis <code>()</code>.
 * </p>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchGroupedFilterExpressions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchGroupedFilterExpressions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filters to use for the search.
     * </p>
     */
    private java.util.List<SearchFilterExpression> filters;
    /**
     * <p>
     * The operators to include in the search.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * The filters to use for the search.
     * </p>
     * 
     * @return The filters to use for the search.
     */

    public java.util.List<SearchFilterExpression> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to use for the search.
     * </p>
     * 
     * @param filters
     *        The filters to use for the search.
     */

    public void setFilters(java.util.Collection<SearchFilterExpression> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<SearchFilterExpression>(filters);
    }

    /**
     * <p>
     * The filters to use for the search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to use for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGroupedFilterExpressions withFilters(SearchFilterExpression... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<SearchFilterExpression>(filters.length));
        }
        for (SearchFilterExpression ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to use for the search.
     * </p>
     * 
     * @param filters
     *        The filters to use for the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchGroupedFilterExpressions withFilters(java.util.Collection<SearchFilterExpression> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The operators to include in the search.
     * </p>
     * 
     * @param operator
     *        The operators to include in the search.
     * @see LogicalOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * The operators to include in the search.
     * </p>
     * 
     * @return The operators to include in the search.
     * @see LogicalOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * The operators to include in the search.
     * </p>
     * 
     * @param operator
     *        The operators to include in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public SearchGroupedFilterExpressions withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * The operators to include in the search.
     * </p>
     * 
     * @param operator
     *        The operators to include in the search.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogicalOperator
     */

    public SearchGroupedFilterExpressions withOperator(LogicalOperator operator) {
        this.operator = operator.toString();
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getOperator() != null)
            sb.append("Operator: ").append(getOperator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchGroupedFilterExpressions == false)
            return false;
        SearchGroupedFilterExpressions other = (SearchGroupedFilterExpressions) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getOperator() == null ^ this.getOperator() == null)
            return false;
        if (other.getOperator() != null && other.getOperator().equals(this.getOperator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public SearchGroupedFilterExpressions clone() {
        try {
            return (SearchGroupedFilterExpressions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.SearchGroupedFilterExpressionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
