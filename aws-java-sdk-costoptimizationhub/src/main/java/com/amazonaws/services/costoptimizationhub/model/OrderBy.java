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
package com.amazonaws.services.costoptimizationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines how rows will be sorted in the response.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cost-optimization-hub-2022-07-26/OrderBy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrderBy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Sorts by dimension values.
     * </p>
     */
    private String dimension;
    /**
     * <p>
     * The order that's used to sort the data.
     * </p>
     */
    private String order;

    /**
     * <p>
     * Sorts by dimension values.
     * </p>
     * 
     * @param dimension
     *        Sorts by dimension values.
     */

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    /**
     * <p>
     * Sorts by dimension values.
     * </p>
     * 
     * @return Sorts by dimension values.
     */

    public String getDimension() {
        return this.dimension;
    }

    /**
     * <p>
     * Sorts by dimension values.
     * </p>
     * 
     * @param dimension
     *        Sorts by dimension values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrderBy withDimension(String dimension) {
        setDimension(dimension);
        return this;
    }

    /**
     * <p>
     * The order that's used to sort the data.
     * </p>
     * 
     * @param order
     *        The order that's used to sort the data.
     * @see Order
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * The order that's used to sort the data.
     * </p>
     * 
     * @return The order that's used to sort the data.
     * @see Order
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * The order that's used to sort the data.
     * </p>
     * 
     * @param order
     *        The order that's used to sort the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public OrderBy withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The order that's used to sort the data.
     * </p>
     * 
     * @param order
     *        The order that's used to sort the data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public OrderBy withOrder(Order order) {
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
        if (getDimension() != null)
            sb.append("Dimension: ").append(getDimension()).append(",");
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

        if (obj instanceof OrderBy == false)
            return false;
        OrderBy other = (OrderBy) obj;
        if (other.getDimension() == null ^ this.getDimension() == null)
            return false;
        if (other.getDimension() != null && other.getDimension().equals(this.getDimension()) == false)
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

        hashCode = prime * hashCode + ((getDimension() == null) ? 0 : getDimension().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
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
        com.amazonaws.services.costoptimizationhub.model.transform.OrderByMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
