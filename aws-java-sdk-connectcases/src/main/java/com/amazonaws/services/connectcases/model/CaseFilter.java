/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter for cases. Only one value can be provided.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/CaseFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaseFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Provides "and all" filtering.
     * </p>
     */
    private java.util.List<CaseFilter> andAll;
    /**
     * <p>
     * A list of fields to filter on.
     * </p>
     */
    private FieldFilter field;

    private CaseFilter not;

    /**
     * <p>
     * Provides "and all" filtering.
     * </p>
     * 
     * @return Provides "and all" filtering.
     */

    public java.util.List<CaseFilter> getAndAll() {
        return andAll;
    }

    /**
     * <p>
     * Provides "and all" filtering.
     * </p>
     * 
     * @param andAll
     *        Provides "and all" filtering.
     */

    public void setAndAll(java.util.Collection<CaseFilter> andAll) {
        if (andAll == null) {
            this.andAll = null;
            return;
        }

        this.andAll = new java.util.ArrayList<CaseFilter>(andAll);
    }

    /**
     * <p>
     * Provides "and all" filtering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAndAll(java.util.Collection)} or {@link #withAndAll(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param andAll
     *        Provides "and all" filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseFilter withAndAll(CaseFilter... andAll) {
        if (this.andAll == null) {
            setAndAll(new java.util.ArrayList<CaseFilter>(andAll.length));
        }
        for (CaseFilter ele : andAll) {
            this.andAll.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides "and all" filtering.
     * </p>
     * 
     * @param andAll
     *        Provides "and all" filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseFilter withAndAll(java.util.Collection<CaseFilter> andAll) {
        setAndAll(andAll);
        return this;
    }

    /**
     * <p>
     * A list of fields to filter on.
     * </p>
     * 
     * @param field
     *        A list of fields to filter on.
     */

    public void setField(FieldFilter field) {
        this.field = field;
    }

    /**
     * <p>
     * A list of fields to filter on.
     * </p>
     * 
     * @return A list of fields to filter on.
     */

    public FieldFilter getField() {
        return this.field;
    }

    /**
     * <p>
     * A list of fields to filter on.
     * </p>
     * 
     * @param field
     *        A list of fields to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseFilter withField(FieldFilter field) {
        setField(field);
        return this;
    }

    /**
     * @param not
     */

    public void setNot(CaseFilter not) {
        this.not = not;
    }

    /**
     * @return
     */

    public CaseFilter getNot() {
        return this.not;
    }

    /**
     * @param not
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaseFilter withNot(CaseFilter not) {
        setNot(not);
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
        if (getAndAll() != null)
            sb.append("AndAll: ").append(getAndAll()).append(",");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getNot() != null)
            sb.append("Not: ").append(getNot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaseFilter == false)
            return false;
        CaseFilter other = (CaseFilter) obj;
        if (other.getAndAll() == null ^ this.getAndAll() == null)
            return false;
        if (other.getAndAll() != null && other.getAndAll().equals(this.getAndAll()) == false)
            return false;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getNot() == null ^ this.getNot() == null)
            return false;
        if (other.getNot() != null && other.getNot().equals(this.getNot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAndAll() == null) ? 0 : getAndAll().hashCode());
        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getNot() == null) ? 0 : getNot().hashCode());
        return hashCode;
    }

    @Override
    public CaseFilter clone() {
        try {
            return (CaseFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcases.model.transform.CaseFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
