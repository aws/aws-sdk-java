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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A search filter clause in Amazon DataZone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/FilterClause" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterClause implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The 'and' search filter clause in Amazon DataZone.
     * </p>
     */
    private java.util.List<FilterClause> and;
    /**
     * <p>
     * A search filter in Amazon DataZone.
     * </p>
     */
    private Filter filter;
    /**
     * <p>
     * The 'or' search filter clause in Amazon DataZone.
     * </p>
     */
    private java.util.List<FilterClause> or;

    /**
     * <p>
     * The 'and' search filter clause in Amazon DataZone.
     * </p>
     * 
     * @return The 'and' search filter clause in Amazon DataZone.
     */

    public java.util.List<FilterClause> getAnd() {
        return and;
    }

    /**
     * <p>
     * The 'and' search filter clause in Amazon DataZone.
     * </p>
     * 
     * @param and
     *        The 'and' search filter clause in Amazon DataZone.
     */

    public void setAnd(java.util.Collection<FilterClause> and) {
        if (and == null) {
            this.and = null;
            return;
        }

        this.and = new java.util.ArrayList<FilterClause>(and);
    }

    /**
     * <p>
     * The 'and' search filter clause in Amazon DataZone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnd(java.util.Collection)} or {@link #withAnd(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param and
     *        The 'and' search filter clause in Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterClause withAnd(FilterClause... and) {
        if (this.and == null) {
            setAnd(new java.util.ArrayList<FilterClause>(and.length));
        }
        for (FilterClause ele : and) {
            this.and.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The 'and' search filter clause in Amazon DataZone.
     * </p>
     * 
     * @param and
     *        The 'and' search filter clause in Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterClause withAnd(java.util.Collection<FilterClause> and) {
        setAnd(and);
        return this;
    }

    /**
     * <p>
     * A search filter in Amazon DataZone.
     * </p>
     * 
     * @param filter
     *        A search filter in Amazon DataZone.
     */

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * A search filter in Amazon DataZone.
     * </p>
     * 
     * @return A search filter in Amazon DataZone.
     */

    public Filter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * A search filter in Amazon DataZone.
     * </p>
     * 
     * @param filter
     *        A search filter in Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterClause withFilter(Filter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The 'or' search filter clause in Amazon DataZone.
     * </p>
     * 
     * @return The 'or' search filter clause in Amazon DataZone.
     */

    public java.util.List<FilterClause> getOr() {
        return or;
    }

    /**
     * <p>
     * The 'or' search filter clause in Amazon DataZone.
     * </p>
     * 
     * @param or
     *        The 'or' search filter clause in Amazon DataZone.
     */

    public void setOr(java.util.Collection<FilterClause> or) {
        if (or == null) {
            this.or = null;
            return;
        }

        this.or = new java.util.ArrayList<FilterClause>(or);
    }

    /**
     * <p>
     * The 'or' search filter clause in Amazon DataZone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOr(java.util.Collection)} or {@link #withOr(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param or
     *        The 'or' search filter clause in Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterClause withOr(FilterClause... or) {
        if (this.or == null) {
            setOr(new java.util.ArrayList<FilterClause>(or.length));
        }
        for (FilterClause ele : or) {
            this.or.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The 'or' search filter clause in Amazon DataZone.
     * </p>
     * 
     * @param or
     *        The 'or' search filter clause in Amazon DataZone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterClause withOr(java.util.Collection<FilterClause> or) {
        setOr(or);
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
        if (getAnd() != null)
            sb.append("And: ").append(getAnd()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getOr() != null)
            sb.append("Or: ").append(getOr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterClause == false)
            return false;
        FilterClause other = (FilterClause) obj;
        if (other.getAnd() == null ^ this.getAnd() == null)
            return false;
        if (other.getAnd() != null && other.getAnd().equals(this.getAnd()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getOr() == null ^ this.getOr() == null)
            return false;
        if (other.getOr() != null && other.getOr().equals(this.getOr()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnd() == null) ? 0 : getAnd().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getOr() == null) ? 0 : getOr().hashCode());
        return hashCode;
    }

    @Override
    public FilterClause clone() {
        try {
            return (FilterClause) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.FilterClauseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
