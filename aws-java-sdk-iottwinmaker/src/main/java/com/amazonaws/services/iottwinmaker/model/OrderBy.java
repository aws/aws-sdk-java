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
 * Filter criteria that orders the return output. It can be sorted in ascending or descending order.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iottwinmaker-2021-11-29/OrderBy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set order that filters results.
     * </p>
     */
    private String order;
    /**
     * <p>
     * The property name.
     * </p>
     */
    private String propertyName;

    /**
     * <p>
     * The set order that filters results.
     * </p>
     * 
     * @param order
     *        The set order that filters results.
     * @see Order
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The set order that filters results.
     * </p>
     * 
     * @return The set order that filters results.
     * @see Order
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The set order that filters results.
     * </p>
     * 
     * @param order
     *        The set order that filters results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public OrderBy withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The set order that filters results.
     * </p>
     * 
     * @param order
     *        The set order that filters results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public OrderBy withOrder(Order order) {
        this.order = order.toString();
        return this;
    }

    /**
     * <p>
     * The property name.
     * </p>
     * 
     * @param propertyName
     *        The property name.
     */

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * <p>
     * The property name.
     * </p>
     * 
     * @return The property name.
     */

    public String getPropertyName() {
        return this.propertyName;
    }

    /**
     * <p>
     * The property name.
     * </p>
     * 
     * @param propertyName
     *        The property name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderBy withPropertyName(String propertyName) {
        setPropertyName(propertyName);
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
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getPropertyName() != null)
            sb.append("PropertyName: ").append(getPropertyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderBy == false)
            return false;
        OrderBy other = (OrderBy) obj;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getPropertyName() == null ^ this.getPropertyName() == null)
            return false;
        if (other.getPropertyName() != null && other.getPropertyName().equals(this.getPropertyName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getPropertyName() == null) ? 0 : getPropertyName().hashCode());
        return hashCode;
    }

    @Override
    public OrderBy clone() {
        try {
            return (OrderBy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iottwinmaker.model.transform.OrderByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
