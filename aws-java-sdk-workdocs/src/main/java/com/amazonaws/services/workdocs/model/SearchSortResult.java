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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of the sort operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/SearchSortResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchSortResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sort search results based on this field name.
     * </p>
     */
    private String field;
    /**
     * <p>
     * Sort direction.
     * </p>
     */
    private String order;

    /**
     * <p>
     * Sort search results based on this field name.
     * </p>
     * 
     * @param field
     *        Sort search results based on this field name.
     * @see OrderByFieldType
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * Sort search results based on this field name.
     * </p>
     * 
     * @return Sort search results based on this field name.
     * @see OrderByFieldType
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * Sort search results based on this field name.
     * </p>
     * 
     * @param field
     *        Sort search results based on this field name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderByFieldType
     */

    public SearchSortResult withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * Sort search results based on this field name.
     * </p>
     * 
     * @param field
     *        Sort search results based on this field name.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderByFieldType
     */

    public SearchSortResult withField(OrderByFieldType field) {
        this.field = field.toString();
        return this;
    }

    /**
     * <p>
     * Sort direction.
     * </p>
     * 
     * @param order
     *        Sort direction.
     * @see SortOrder
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * Sort direction.
     * </p>
     * 
     * @return Sort direction.
     * @see SortOrder
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * Sort direction.
     * </p>
     * 
     * @param order
     *        Sort direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchSortResult withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * Sort direction.
     * </p>
     * 
     * @param order
     *        Sort direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public SearchSortResult withOrder(SortOrder order) {
        this.order = order.toString();
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
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchSortResult == false)
            return false;
        SearchSortResult other = (SearchSortResult) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public SearchSortResult clone() {
        try {
            return (SearchSortResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workdocs.model.transform.SearchSortResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
