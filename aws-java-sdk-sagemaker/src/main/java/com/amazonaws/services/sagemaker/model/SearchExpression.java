/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A multi-expression that searches for the specified resource or resources in a search. All resource objects that
 * satisfy the expression's condition are included in the search results. You must specify at least one subexpression,
 * filter, or nested filter. A <code>SearchExpression</code> can contain up to twenty elements.
 * </p>
 * <p>
 * A <code>SearchExpression</code> contains the following components:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A list of <code>Filter</code> objects. Each filter defines a simple Boolean expression comprised of a resource
 * property name, Boolean operator, and value.
 * </p>
 * </li>
 * <li>
 * <p>
 * A list of <code>NestedFilter</code> objects. Each nested filter defines a list of Boolean expressions using a list of
 * resource properties. A nested filter is satisfied if a single object in the list satisfies all Boolean expressions.
 * </p>
 * </li>
 * <li>
 * <p>
 * A list of <code>SearchExpression</code> objects. A search expression object can be nested in a list of search
 * expression objects.
 * </p>
 * </li>
 * <li>
 * <p>
 * A Boolean operator: <code>And</code> or <code>Or</code>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SearchExpression" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of filter objects.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * A list of nested filter objects.
     * </p>
     */
    private java.util.List<NestedFilters> nestedFilters;
    /**
     * <p>
     * A list of search expression objects.
     * </p>
     */
    private java.util.List<SearchExpression> subExpressions;
    /**
     * <p>
     * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists
     * to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a single
     * conditional statement needs to be true for the entire search expression to be true, specify <code>Or</code>. The
     * default value is <code>And</code>.
     * </p>
     */
    private String operator;

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @return A list of filter objects.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchExpression withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of filter objects.
     * </p>
     * 
     * @param filters
     *        A list of filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchExpression withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * A list of nested filter objects.
     * </p>
     * 
     * @return A list of nested filter objects.
     */

    public java.util.List<NestedFilters> getNestedFilters() {
        return nestedFilters;
    }

    /**
     * <p>
     * A list of nested filter objects.
     * </p>
     * 
     * @param nestedFilters
     *        A list of nested filter objects.
     */

    public void setNestedFilters(java.util.Collection<NestedFilters> nestedFilters) {
        if (nestedFilters == null) {
            this.nestedFilters = null;
            return;
        }

        this.nestedFilters = new java.util.ArrayList<NestedFilters>(nestedFilters);
    }

    /**
     * <p>
     * A list of nested filter objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNestedFilters(java.util.Collection)} or {@link #withNestedFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param nestedFilters
     *        A list of nested filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchExpression withNestedFilters(NestedFilters... nestedFilters) {
        if (this.nestedFilters == null) {
            setNestedFilters(new java.util.ArrayList<NestedFilters>(nestedFilters.length));
        }
        for (NestedFilters ele : nestedFilters) {
            this.nestedFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of nested filter objects.
     * </p>
     * 
     * @param nestedFilters
     *        A list of nested filter objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchExpression withNestedFilters(java.util.Collection<NestedFilters> nestedFilters) {
        setNestedFilters(nestedFilters);
        return this;
    }

    /**
     * <p>
     * A list of search expression objects.
     * </p>
     * 
     * @return A list of search expression objects.
     */

    public java.util.List<SearchExpression> getSubExpressions() {
        return subExpressions;
    }

    /**
     * <p>
     * A list of search expression objects.
     * </p>
     * 
     * @param subExpressions
     *        A list of search expression objects.
     */

    public void setSubExpressions(java.util.Collection<SearchExpression> subExpressions) {
        if (subExpressions == null) {
            this.subExpressions = null;
            return;
        }

        this.subExpressions = new java.util.ArrayList<SearchExpression>(subExpressions);
    }

    /**
     * <p>
     * A list of search expression objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubExpressions(java.util.Collection)} or {@link #withSubExpressions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param subExpressions
     *        A list of search expression objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchExpression withSubExpressions(SearchExpression... subExpressions) {
        if (this.subExpressions == null) {
            setSubExpressions(new java.util.ArrayList<SearchExpression>(subExpressions.length));
        }
        for (SearchExpression ele : subExpressions) {
            this.subExpressions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of search expression objects.
     * </p>
     * 
     * @param subExpressions
     *        A list of search expression objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchExpression withSubExpressions(java.util.Collection<SearchExpression> subExpressions) {
        setSubExpressions(subExpressions);
        return this;
    }

    /**
     * <p>
     * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists
     * to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a single
     * conditional statement needs to be true for the entire search expression to be true, specify <code>Or</code>. The
     * default value is <code>And</code>.
     * </p>
     * 
     * @param operator
     *        A Boolean operator used to evaluate the search expression. If you want every conditional statement in all
     *        lists to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a
     *        single conditional statement needs to be true for the entire search expression to be true, specify
     *        <code>Or</code>. The default value is <code>And</code>.
     * @see BooleanOperator
     */

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * <p>
     * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists
     * to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a single
     * conditional statement needs to be true for the entire search expression to be true, specify <code>Or</code>. The
     * default value is <code>And</code>.
     * </p>
     * 
     * @return A Boolean operator used to evaluate the search expression. If you want every conditional statement in all
     *         lists to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a
     *         single conditional statement needs to be true for the entire search expression to be true, specify
     *         <code>Or</code>. The default value is <code>And</code>.
     * @see BooleanOperator
     */

    public String getOperator() {
        return this.operator;
    }

    /**
     * <p>
     * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists
     * to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a single
     * conditional statement needs to be true for the entire search expression to be true, specify <code>Or</code>. The
     * default value is <code>And</code>.
     * </p>
     * 
     * @param operator
     *        A Boolean operator used to evaluate the search expression. If you want every conditional statement in all
     *        lists to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a
     *        single conditional statement needs to be true for the entire search expression to be true, specify
     *        <code>Or</code>. The default value is <code>And</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BooleanOperator
     */

    public SearchExpression withOperator(String operator) {
        setOperator(operator);
        return this;
    }

    /**
     * <p>
     * A Boolean operator used to evaluate the search expression. If you want every conditional statement in all lists
     * to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a single
     * conditional statement needs to be true for the entire search expression to be true, specify <code>Or</code>. The
     * default value is <code>And</code>.
     * </p>
     * 
     * @param operator
     *        A Boolean operator used to evaluate the search expression. If you want every conditional statement in all
     *        lists to be satisfied for the entire search expression to be true, specify <code>And</code>. If only a
     *        single conditional statement needs to be true for the entire search expression to be true, specify
     *        <code>Or</code>. The default value is <code>And</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BooleanOperator
     */

    public SearchExpression withOperator(BooleanOperator operator) {
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
        if (getNestedFilters() != null)
            sb.append("NestedFilters: ").append(getNestedFilters()).append(",");
        if (getSubExpressions() != null)
            sb.append("SubExpressions: ").append(getSubExpressions()).append(",");
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

        if (obj instanceof SearchExpression == false)
            return false;
        SearchExpression other = (SearchExpression) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNestedFilters() == null ^ this.getNestedFilters() == null)
            return false;
        if (other.getNestedFilters() != null && other.getNestedFilters().equals(this.getNestedFilters()) == false)
            return false;
        if (other.getSubExpressions() == null ^ this.getSubExpressions() == null)
            return false;
        if (other.getSubExpressions() != null && other.getSubExpressions().equals(this.getSubExpressions()) == false)
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
        hashCode = prime * hashCode + ((getNestedFilters() == null) ? 0 : getNestedFilters().hashCode());
        hashCode = prime * hashCode + ((getSubExpressions() == null) ? 0 : getSubExpressions().hashCode());
        hashCode = prime * hashCode + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return hashCode;
    }

    @Override
    public SearchExpression clone() {
        try {
            return (SearchExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SearchExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
