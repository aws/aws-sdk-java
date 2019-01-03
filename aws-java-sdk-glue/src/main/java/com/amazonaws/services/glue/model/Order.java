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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the sort order of a sorted column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Order" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Order implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String column;
    /**
     * <p>
     * Indicates that the column is sorted in ascending order (<code>== 1</code>), or in descending order (
     * <code>==0</code>).
     * </p>
     */
    private Integer sortOrder;

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param column
     *        The name of the column.
     */

    public void setColumn(String column) {
        this.column = column;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @return The name of the column.
     */

    public String getColumn() {
        return this.column;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param column
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withColumn(String column) {
        setColumn(column);
        return this;
    }

    /**
     * <p>
     * Indicates that the column is sorted in ascending order (<code>== 1</code>), or in descending order (
     * <code>==0</code>).
     * </p>
     * 
     * @param sortOrder
     *        Indicates that the column is sorted in ascending order (<code>== 1</code>), or in descending order (
     *        <code>==0</code>).
     */

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Indicates that the column is sorted in ascending order (<code>== 1</code>), or in descending order (
     * <code>==0</code>).
     * </p>
     * 
     * @return Indicates that the column is sorted in ascending order (<code>== 1</code>), or in descending order (
     *         <code>==0</code>).
     */

    public Integer getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Indicates that the column is sorted in ascending order (<code>== 1</code>), or in descending order (
     * <code>==0</code>).
     * </p>
     * 
     * @param sortOrder
     *        Indicates that the column is sorted in ascending order (<code>== 1</code>), or in descending order (
     *        <code>==0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Order withSortOrder(Integer sortOrder) {
        setSortOrder(sortOrder);
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
        if (getColumn() != null)
            sb.append("Column: ").append(getColumn()).append(",");
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

        if (obj instanceof Order == false)
            return false;
        Order other = (Order) obj;
        if (other.getColumn() == null ^ this.getColumn() == null)
            return false;
        if (other.getColumn() != null && other.getColumn().equals(this.getColumn()) == false)
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

        hashCode = prime * hashCode + ((getColumn() == null) ? 0 : getColumn().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public Order clone() {
        try {
            return (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.OrderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
