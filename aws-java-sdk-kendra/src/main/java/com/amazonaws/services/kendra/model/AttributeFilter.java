/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides filtering the query results based on document attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/AttributeFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttributeFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     */
    private java.util.List<AttributeFilter> andAllFilters;
    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     */
    private java.util.List<AttributeFilter> orAllFilters;
    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     */
    private AttributeFilter notFilter;
    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     */
    private DocumentAttribute equalsTo;
    /**
     * <p>
     * Returns true when a document contains all of the specified document attributes.
     * </p>
     */
    private DocumentAttribute containsAll;
    /**
     * <p>
     * Returns true when a document contains any of the specified document attributes.
     * </p>
     */
    private DocumentAttribute containsAny;
    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     */
    private DocumentAttribute greaterThan;
    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     */
    private DocumentAttribute greaterThanOrEquals;
    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     */
    private DocumentAttribute lessThan;
    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     */
    private DocumentAttribute lessThanOrEquals;

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     * 
     * @return Performs a logical <code>AND</code> operation on all supplied filters.
     */

    public java.util.List<AttributeFilter> getAndAllFilters() {
        return andAllFilters;
    }

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     * 
     * @param andAllFilters
     *        Performs a logical <code>AND</code> operation on all supplied filters.
     */

    public void setAndAllFilters(java.util.Collection<AttributeFilter> andAllFilters) {
        if (andAllFilters == null) {
            this.andAllFilters = null;
            return;
        }

        this.andAllFilters = new java.util.ArrayList<AttributeFilter>(andAllFilters);
    }

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAndAllFilters(java.util.Collection)} or {@link #withAndAllFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param andAllFilters
     *        Performs a logical <code>AND</code> operation on all supplied filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withAndAllFilters(AttributeFilter... andAllFilters) {
        if (this.andAllFilters == null) {
            setAndAllFilters(new java.util.ArrayList<AttributeFilter>(andAllFilters.length));
        }
        for (AttributeFilter ele : andAllFilters) {
            this.andAllFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>AND</code> operation on all supplied filters.
     * </p>
     * 
     * @param andAllFilters
     *        Performs a logical <code>AND</code> operation on all supplied filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withAndAllFilters(java.util.Collection<AttributeFilter> andAllFilters) {
        setAndAllFilters(andAllFilters);
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     * 
     * @return Performs a logical <code>OR</code> operation on all supplied filters.
     */

    public java.util.List<AttributeFilter> getOrAllFilters() {
        return orAllFilters;
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     * 
     * @param orAllFilters
     *        Performs a logical <code>OR</code> operation on all supplied filters.
     */

    public void setOrAllFilters(java.util.Collection<AttributeFilter> orAllFilters) {
        if (orAllFilters == null) {
            this.orAllFilters = null;
            return;
        }

        this.orAllFilters = new java.util.ArrayList<AttributeFilter>(orAllFilters);
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrAllFilters(java.util.Collection)} or {@link #withOrAllFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param orAllFilters
     *        Performs a logical <code>OR</code> operation on all supplied filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withOrAllFilters(AttributeFilter... orAllFilters) {
        if (this.orAllFilters == null) {
            setOrAllFilters(new java.util.ArrayList<AttributeFilter>(orAllFilters.length));
        }
        for (AttributeFilter ele : orAllFilters) {
            this.orAllFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>OR</code> operation on all supplied filters.
     * </p>
     * 
     * @param orAllFilters
     *        Performs a logical <code>OR</code> operation on all supplied filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withOrAllFilters(java.util.Collection<AttributeFilter> orAllFilters) {
        setOrAllFilters(orAllFilters);
        return this;
    }

    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     * 
     * @param notFilter
     *        Performs a logical <code>NOT</code> operation on all supplied filters.
     */

    public void setNotFilter(AttributeFilter notFilter) {
        this.notFilter = notFilter;
    }

    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     * 
     * @return Performs a logical <code>NOT</code> operation on all supplied filters.
     */

    public AttributeFilter getNotFilter() {
        return this.notFilter;
    }

    /**
     * <p>
     * Performs a logical <code>NOT</code> operation on all supplied filters.
     * </p>
     * 
     * @param notFilter
     *        Performs a logical <code>NOT</code> operation on all supplied filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withNotFilter(AttributeFilter notFilter) {
        setNotFilter(notFilter);
        return this;
    }

    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     * 
     * @param equalsTo
     *        Performs an equals operation on two document attributes.
     */

    public void setEqualsTo(DocumentAttribute equalsTo) {
        this.equalsTo = equalsTo;
    }

    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     * 
     * @return Performs an equals operation on two document attributes.
     */

    public DocumentAttribute getEqualsTo() {
        return this.equalsTo;
    }

    /**
     * <p>
     * Performs an equals operation on two document attributes.
     * </p>
     * 
     * @param equalsTo
     *        Performs an equals operation on two document attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withEqualsTo(DocumentAttribute equalsTo) {
        setEqualsTo(equalsTo);
        return this;
    }

    /**
     * <p>
     * Returns true when a document contains all of the specified document attributes.
     * </p>
     * 
     * @param containsAll
     *        Returns true when a document contains all of the specified document attributes.
     */

    public void setContainsAll(DocumentAttribute containsAll) {
        this.containsAll = containsAll;
    }

    /**
     * <p>
     * Returns true when a document contains all of the specified document attributes.
     * </p>
     * 
     * @return Returns true when a document contains all of the specified document attributes.
     */

    public DocumentAttribute getContainsAll() {
        return this.containsAll;
    }

    /**
     * <p>
     * Returns true when a document contains all of the specified document attributes.
     * </p>
     * 
     * @param containsAll
     *        Returns true when a document contains all of the specified document attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withContainsAll(DocumentAttribute containsAll) {
        setContainsAll(containsAll);
        return this;
    }

    /**
     * <p>
     * Returns true when a document contains any of the specified document attributes.
     * </p>
     * 
     * @param containsAny
     *        Returns true when a document contains any of the specified document attributes.
     */

    public void setContainsAny(DocumentAttribute containsAny) {
        this.containsAny = containsAny;
    }

    /**
     * <p>
     * Returns true when a document contains any of the specified document attributes.
     * </p>
     * 
     * @return Returns true when a document contains any of the specified document attributes.
     */

    public DocumentAttribute getContainsAny() {
        return this.containsAny;
    }

    /**
     * <p>
     * Returns true when a document contains any of the specified document attributes.
     * </p>
     * 
     * @param containsAny
     *        Returns true when a document contains any of the specified document attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withContainsAny(DocumentAttribute containsAny) {
        setContainsAny(containsAny);
        return this;
    }

    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param greaterThan
     *        Performs a greater than operation on two document attributes. Use with a document attribute of type
     *        <code>Integer</code> or <code>Long</code>.
     */

    public void setGreaterThan(DocumentAttribute greaterThan) {
        this.greaterThan = greaterThan;
    }

    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @return Performs a greater than operation on two document attributes. Use with a document attribute of type
     *         <code>Integer</code> or <code>Long</code>.
     */

    public DocumentAttribute getGreaterThan() {
        return this.greaterThan;
    }

    /**
     * <p>
     * Performs a greater than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param greaterThan
     *        Performs a greater than operation on two document attributes. Use with a document attribute of type
     *        <code>Integer</code> or <code>Long</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withGreaterThan(DocumentAttribute greaterThan) {
        setGreaterThan(greaterThan);
        return this;
    }

    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param greaterThanOrEquals
     *        Performs a greater or equals than operation on two document attributes. Use with a document attribute of
     *        type <code>Integer</code> or <code>Long</code>.
     */

    public void setGreaterThanOrEquals(DocumentAttribute greaterThanOrEquals) {
        this.greaterThanOrEquals = greaterThanOrEquals;
    }

    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @return Performs a greater or equals than operation on two document attributes. Use with a document attribute of
     *         type <code>Integer</code> or <code>Long</code>.
     */

    public DocumentAttribute getGreaterThanOrEquals() {
        return this.greaterThanOrEquals;
    }

    /**
     * <p>
     * Performs a greater or equals than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param greaterThanOrEquals
     *        Performs a greater or equals than operation on two document attributes. Use with a document attribute of
     *        type <code>Integer</code> or <code>Long</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withGreaterThanOrEquals(DocumentAttribute greaterThanOrEquals) {
        setGreaterThanOrEquals(greaterThanOrEquals);
        return this;
    }

    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param lessThan
     *        Performs a less than operation on two document attributes. Use with a document attribute of type
     *        <code>Integer</code> or <code>Long</code>.
     */

    public void setLessThan(DocumentAttribute lessThan) {
        this.lessThan = lessThan;
    }

    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @return Performs a less than operation on two document attributes. Use with a document attribute of type
     *         <code>Integer</code> or <code>Long</code>.
     */

    public DocumentAttribute getLessThan() {
        return this.lessThan;
    }

    /**
     * <p>
     * Performs a less than operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param lessThan
     *        Performs a less than operation on two document attributes. Use with a document attribute of type
     *        <code>Integer</code> or <code>Long</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withLessThan(DocumentAttribute lessThan) {
        setLessThan(lessThan);
        return this;
    }

    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param lessThanOrEquals
     *        Performs a less than or equals operation on two document attributes. Use with a document attribute of type
     *        <code>Integer</code> or <code>Long</code>.
     */

    public void setLessThanOrEquals(DocumentAttribute lessThanOrEquals) {
        this.lessThanOrEquals = lessThanOrEquals;
    }

    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @return Performs a less than or equals operation on two document attributes. Use with a document attribute of
     *         type <code>Integer</code> or <code>Long</code>.
     */

    public DocumentAttribute getLessThanOrEquals() {
        return this.lessThanOrEquals;
    }

    /**
     * <p>
     * Performs a less than or equals operation on two document attributes. Use with a document attribute of type
     * <code>Integer</code> or <code>Long</code>.
     * </p>
     * 
     * @param lessThanOrEquals
     *        Performs a less than or equals operation on two document attributes. Use with a document attribute of type
     *        <code>Integer</code> or <code>Long</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttributeFilter withLessThanOrEquals(DocumentAttribute lessThanOrEquals) {
        setLessThanOrEquals(lessThanOrEquals);
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
        if (getAndAllFilters() != null)
            sb.append("AndAllFilters: ").append(getAndAllFilters()).append(",");
        if (getOrAllFilters() != null)
            sb.append("OrAllFilters: ").append(getOrAllFilters()).append(",");
        if (getNotFilter() != null)
            sb.append("NotFilter: ").append(getNotFilter()).append(",");
        if (getEqualsTo() != null)
            sb.append("EqualsTo: ").append(getEqualsTo()).append(",");
        if (getContainsAll() != null)
            sb.append("ContainsAll: ").append(getContainsAll()).append(",");
        if (getContainsAny() != null)
            sb.append("ContainsAny: ").append(getContainsAny()).append(",");
        if (getGreaterThan() != null)
            sb.append("GreaterThan: ").append(getGreaterThan()).append(",");
        if (getGreaterThanOrEquals() != null)
            sb.append("GreaterThanOrEquals: ").append(getGreaterThanOrEquals()).append(",");
        if (getLessThan() != null)
            sb.append("LessThan: ").append(getLessThan()).append(",");
        if (getLessThanOrEquals() != null)
            sb.append("LessThanOrEquals: ").append(getLessThanOrEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttributeFilter == false)
            return false;
        AttributeFilter other = (AttributeFilter) obj;
        if (other.getAndAllFilters() == null ^ this.getAndAllFilters() == null)
            return false;
        if (other.getAndAllFilters() != null && other.getAndAllFilters().equals(this.getAndAllFilters()) == false)
            return false;
        if (other.getOrAllFilters() == null ^ this.getOrAllFilters() == null)
            return false;
        if (other.getOrAllFilters() != null && other.getOrAllFilters().equals(this.getOrAllFilters()) == false)
            return false;
        if (other.getNotFilter() == null ^ this.getNotFilter() == null)
            return false;
        if (other.getNotFilter() != null && other.getNotFilter().equals(this.getNotFilter()) == false)
            return false;
        if (other.getEqualsTo() == null ^ this.getEqualsTo() == null)
            return false;
        if (other.getEqualsTo() != null && other.getEqualsTo().equals(this.getEqualsTo()) == false)
            return false;
        if (other.getContainsAll() == null ^ this.getContainsAll() == null)
            return false;
        if (other.getContainsAll() != null && other.getContainsAll().equals(this.getContainsAll()) == false)
            return false;
        if (other.getContainsAny() == null ^ this.getContainsAny() == null)
            return false;
        if (other.getContainsAny() != null && other.getContainsAny().equals(this.getContainsAny()) == false)
            return false;
        if (other.getGreaterThan() == null ^ this.getGreaterThan() == null)
            return false;
        if (other.getGreaterThan() != null && other.getGreaterThan().equals(this.getGreaterThan()) == false)
            return false;
        if (other.getGreaterThanOrEquals() == null ^ this.getGreaterThanOrEquals() == null)
            return false;
        if (other.getGreaterThanOrEquals() != null && other.getGreaterThanOrEquals().equals(this.getGreaterThanOrEquals()) == false)
            return false;
        if (other.getLessThan() == null ^ this.getLessThan() == null)
            return false;
        if (other.getLessThan() != null && other.getLessThan().equals(this.getLessThan()) == false)
            return false;
        if (other.getLessThanOrEquals() == null ^ this.getLessThanOrEquals() == null)
            return false;
        if (other.getLessThanOrEquals() != null && other.getLessThanOrEquals().equals(this.getLessThanOrEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAndAllFilters() == null) ? 0 : getAndAllFilters().hashCode());
        hashCode = prime * hashCode + ((getOrAllFilters() == null) ? 0 : getOrAllFilters().hashCode());
        hashCode = prime * hashCode + ((getNotFilter() == null) ? 0 : getNotFilter().hashCode());
        hashCode = prime * hashCode + ((getEqualsTo() == null) ? 0 : getEqualsTo().hashCode());
        hashCode = prime * hashCode + ((getContainsAll() == null) ? 0 : getContainsAll().hashCode());
        hashCode = prime * hashCode + ((getContainsAny() == null) ? 0 : getContainsAny().hashCode());
        hashCode = prime * hashCode + ((getGreaterThan() == null) ? 0 : getGreaterThan().hashCode());
        hashCode = prime * hashCode + ((getGreaterThanOrEquals() == null) ? 0 : getGreaterThanOrEquals().hashCode());
        hashCode = prime * hashCode + ((getLessThan() == null) ? 0 : getLessThan().hashCode());
        hashCode = prime * hashCode + ((getLessThanOrEquals() == null) ? 0 : getLessThanOrEquals().hashCode());
        return hashCode;
    }

    @Override
    public AttributeFilter clone() {
        try {
            return (AttributeFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kendra.model.transform.AttributeFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
