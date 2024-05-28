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
package com.amazonaws.services.detective.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the criteria used for sorting investigations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/detective-2018-10-26/SortCriteria" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SortCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the <code>Field</code> attribute to sort investigations.
     * </p>
     */
    private String field;
    /**
     * <p>
     * The order by which the sorted findings are displayed.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * Represents the <code>Field</code> attribute to sort investigations.
     * </p>
     * 
     * @param field
     *        Represents the <code>Field</code> attribute to sort investigations.
     * @see Field
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * Represents the <code>Field</code> attribute to sort investigations.
     * </p>
     * 
     * @return Represents the <code>Field</code> attribute to sort investigations.
     * @see Field
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * Represents the <code>Field</code> attribute to sort investigations.
     * </p>
     * 
     * @param field
     *        Represents the <code>Field</code> attribute to sort investigations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Field
     */

    public SortCriteria withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * Represents the <code>Field</code> attribute to sort investigations.
     * </p>
     * 
     * @param field
     *        Represents the <code>Field</code> attribute to sort investigations.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Field
     */

    public SortCriteria withField(Field field) {
        this.field = field.toString();
        return this;
    }

    /**
     * <p>
     * The order by which the sorted findings are displayed.
     * </p>
     * 
     * @param sortOrder
     *        The order by which the sorted findings are displayed.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The order by which the sorted findings are displayed.
     * </p>
     * 
     * @return The order by which the sorted findings are displayed.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The order by which the sorted findings are displayed.
     * </p>
     * 
     * @param sortOrder
     *        The order by which the sorted findings are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortCriteria withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The order by which the sorted findings are displayed.
     * </p>
     * 
     * @param sortOrder
     *        The order by which the sorted findings are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SortCriteria withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SortCriteria == false)
            return false;
        SortCriteria other = (SortCriteria) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public SortCriteria clone() {
        try {
            return (SortCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.detective.model.transform.SortCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
