/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iottwinmaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The tabular conditions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/TabularConditions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TabularConditions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter criteria that orders the output. It can be sorted in ascending or descending order.
     * </p>
     */
    private java.util.List<OrderBy> orderBy;
    /**
     * <p>
     * You can filter the request using various logical operators and a key-value format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     */
    private java.util.List<PropertyFilter> propertyFilters;

    /**
     * <p>
     * Filter criteria that orders the output. It can be sorted in ascending or descending order.
     * </p>
     * 
     * @return Filter criteria that orders the output. It can be sorted in ascending or descending order.
     */

    public java.util.List<OrderBy> getOrderBy() {
        return orderBy;
    }

    /**
     * <p>
     * Filter criteria that orders the output. It can be sorted in ascending or descending order.
     * </p>
     * 
     * @param orderBy
     *        Filter criteria that orders the output. It can be sorted in ascending or descending order.
     */

    public void setOrderBy(java.util.Collection<OrderBy> orderBy) {
        if (orderBy == null) {
            this.orderBy = null;
            return;
        }

        this.orderBy = new java.util.ArrayList<OrderBy>(orderBy);
    }

    /**
     * <p>
     * Filter criteria that orders the output. It can be sorted in ascending or descending order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrderBy(java.util.Collection)} or {@link #withOrderBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param orderBy
     *        Filter criteria that orders the output. It can be sorted in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularConditions withOrderBy(OrderBy... orderBy) {
        if (this.orderBy == null) {
            setOrderBy(new java.util.ArrayList<OrderBy>(orderBy.length));
        }
        for (OrderBy ele : orderBy) {
            this.orderBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter criteria that orders the output. It can be sorted in ascending or descending order.
     * </p>
     * 
     * @param orderBy
     *        Filter criteria that orders the output. It can be sorted in ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularConditions withOrderBy(java.util.Collection<OrderBy> orderBy) {
        setOrderBy(orderBy);
        return this;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a key-value format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * 
     * @return You can filter the request using various logical operators and a key-value format. For example:</p>
     *         <p>
     *         <code>{"key": "serverType", "value": "webServer"}</code>
     */

    public java.util.List<PropertyFilter> getPropertyFilters() {
        return propertyFilters;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a key-value format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * 
     * @param propertyFilters
     *        You can filter the request using various logical operators and a key-value format. For example:</p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     */

    public void setPropertyFilters(java.util.Collection<PropertyFilter> propertyFilters) {
        if (propertyFilters == null) {
            this.propertyFilters = null;
            return;
        }

        this.propertyFilters = new java.util.ArrayList<PropertyFilter>(propertyFilters);
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a key-value format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPropertyFilters(java.util.Collection)} or {@link #withPropertyFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param propertyFilters
     *        You can filter the request using various logical operators and a key-value format. For example:</p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularConditions withPropertyFilters(PropertyFilter... propertyFilters) {
        if (this.propertyFilters == null) {
            setPropertyFilters(new java.util.ArrayList<PropertyFilter>(propertyFilters.length));
        }
        for (PropertyFilter ele : propertyFilters) {
            this.propertyFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can filter the request using various logical operators and a key-value format. For example:
     * </p>
     * <p>
     * <code>{"key": "serverType", "value": "webServer"}</code>
     * </p>
     * 
     * @param propertyFilters
     *        You can filter the request using various logical operators and a key-value format. For example:</p>
     *        <p>
     *        <code>{"key": "serverType", "value": "webServer"}</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TabularConditions withPropertyFilters(java.util.Collection<PropertyFilter> propertyFilters) {
        setPropertyFilters(propertyFilters);
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
        if (getOrderBy() != null)
            sb.append("OrderBy: ").append(getOrderBy()).append(",");
        if (getPropertyFilters() != null)
            sb.append("PropertyFilters: ").append(getPropertyFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TabularConditions == false)
            return false;
        TabularConditions other = (TabularConditions) obj;
        if (other.getOrderBy() == null ^ this.getOrderBy() == null)
            return false;
        if (other.getOrderBy() != null && other.getOrderBy().equals(this.getOrderBy()) == false)
            return false;
        if (other.getPropertyFilters() == null ^ this.getPropertyFilters() == null)
            return false;
        if (other.getPropertyFilters() != null && other.getPropertyFilters().equals(this.getPropertyFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrderBy() == null) ? 0 : getOrderBy().hashCode());
        hashCode = prime * hashCode + ((getPropertyFilters() == null) ? 0 : getPropertyFilters().hashCode());
        return hashCode;
    }

    @Override
    public TabularConditions clone() {
        try {
            return (TabularConditions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.TabularConditionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
