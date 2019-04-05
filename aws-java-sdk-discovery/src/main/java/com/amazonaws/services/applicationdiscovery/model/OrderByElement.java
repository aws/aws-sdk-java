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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A field and direction for ordered output.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderByElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field on which to order.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * Ordering direction.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The field on which to order.
     * </p>
     * 
     * @param fieldName
     *        The field on which to order.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The field on which to order.
     * </p>
     * 
     * @return The field on which to order.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The field on which to order.
     * </p>
     * 
     * @param fieldName
     *        The field on which to order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderByElement withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * Ordering direction.
     * </p>
     * 
     * @param sortOrder
     *        Ordering direction.
     * @see OrderString
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Ordering direction.
     * </p>
     * 
     * @return Ordering direction.
     * @see OrderString
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Ordering direction.
     * </p>
     * 
     * @param sortOrder
     *        Ordering direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderString
     */

    public OrderByElement withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Ordering direction.
     * </p>
     * 
     * @param sortOrder
     *        Ordering direction.
     * @see OrderString
     */

    public void setSortOrder(OrderString sortOrder) {
        withSortOrder(sortOrder);
    }

    /**
     * <p>
     * Ordering direction.
     * </p>
     * 
     * @param sortOrder
     *        Ordering direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderString
     */

    public OrderByElement withSortOrder(OrderString sortOrder) {
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
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
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

        if (obj instanceof OrderByElement == false)
            return false;
        OrderByElement other = (OrderByElement) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
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

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public OrderByElement clone() {
        try {
            return (OrderByElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.OrderByElementMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
