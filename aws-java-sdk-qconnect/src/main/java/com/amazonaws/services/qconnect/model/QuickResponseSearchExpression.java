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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the import job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/QuickResponseSearchExpression"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QuickResponseSearchExpression implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configuration of filtering rules applied to quick response query results.
     * </p>
     */
    private java.util.List<QuickResponseFilterField> filters;
    /**
     * <p>
     * The quick response attribute fields on which the query results are ordered.
     * </p>
     */
    private QuickResponseOrderField orderOnField;
    /**
     * <p>
     * The quick response query expressions.
     * </p>
     */
    private java.util.List<QuickResponseQueryField> queries;

    /**
     * <p>
     * The configuration of filtering rules applied to quick response query results.
     * </p>
     * 
     * @return The configuration of filtering rules applied to quick response query results.
     */

    public java.util.List<QuickResponseFilterField> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The configuration of filtering rules applied to quick response query results.
     * </p>
     * 
     * @param filters
     *        The configuration of filtering rules applied to quick response query results.
     */

    public void setFilters(java.util.Collection<QuickResponseFilterField> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<QuickResponseFilterField>(filters);
    }

    /**
     * <p>
     * The configuration of filtering rules applied to quick response query results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The configuration of filtering rules applied to quick response query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchExpression withFilters(QuickResponseFilterField... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<QuickResponseFilterField>(filters.length));
        }
        for (QuickResponseFilterField ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of filtering rules applied to quick response query results.
     * </p>
     * 
     * @param filters
     *        The configuration of filtering rules applied to quick response query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchExpression withFilters(java.util.Collection<QuickResponseFilterField> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The quick response attribute fields on which the query results are ordered.
     * </p>
     * 
     * @param orderOnField
     *        The quick response attribute fields on which the query results are ordered.
     */

    public void setOrderOnField(QuickResponseOrderField orderOnField) {
        this.orderOnField = orderOnField;
    }

    /**
     * <p>
     * The quick response attribute fields on which the query results are ordered.
     * </p>
     * 
     * @return The quick response attribute fields on which the query results are ordered.
     */

    public QuickResponseOrderField getOrderOnField() {
        return this.orderOnField;
    }

    /**
     * <p>
     * The quick response attribute fields on which the query results are ordered.
     * </p>
     * 
     * @param orderOnField
     *        The quick response attribute fields on which the query results are ordered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchExpression withOrderOnField(QuickResponseOrderField orderOnField) {
        setOrderOnField(orderOnField);
        return this;
    }

    /**
     * <p>
     * The quick response query expressions.
     * </p>
     * 
     * @return The quick response query expressions.
     */

    public java.util.List<QuickResponseQueryField> getQueries() {
        return queries;
    }

    /**
     * <p>
     * The quick response query expressions.
     * </p>
     * 
     * @param queries
     *        The quick response query expressions.
     */

    public void setQueries(java.util.Collection<QuickResponseQueryField> queries) {
        if (queries == null) {
            this.queries = null;
            return;
        }

        this.queries = new java.util.ArrayList<QuickResponseQueryField>(queries);
    }

    /**
     * <p>
     * The quick response query expressions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueries(java.util.Collection)} or {@link #withQueries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queries
     *        The quick response query expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchExpression withQueries(QuickResponseQueryField... queries) {
        if (this.queries == null) {
            setQueries(new java.util.ArrayList<QuickResponseQueryField>(queries.length));
        }
        for (QuickResponseQueryField ele : queries) {
            this.queries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The quick response query expressions.
     * </p>
     * 
     * @param queries
     *        The quick response query expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QuickResponseSearchExpression withQueries(java.util.Collection<QuickResponseQueryField> queries) {
        setQueries(queries);
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
        if (getOrderOnField() != null)
            sb.append("OrderOnField: ").append(getOrderOnField()).append(",");
        if (getQueries() != null)
            sb.append("Queries: ").append(getQueries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QuickResponseSearchExpression == false)
            return false;
        QuickResponseSearchExpression other = (QuickResponseSearchExpression) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getOrderOnField() == null ^ this.getOrderOnField() == null)
            return false;
        if (other.getOrderOnField() != null && other.getOrderOnField().equals(this.getOrderOnField()) == false)
            return false;
        if (other.getQueries() == null ^ this.getQueries() == null)
            return false;
        if (other.getQueries() != null && other.getQueries().equals(this.getQueries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getOrderOnField() == null) ? 0 : getOrderOnField().hashCode());
        hashCode = prime * hashCode + ((getQueries() == null) ? 0 : getQueries().hashCode());
        return hashCode;
    }

    @Override
    public QuickResponseSearchExpression clone() {
        try {
            return (QuickResponseSearchExpression) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.QuickResponseSearchExpressionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
