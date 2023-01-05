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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/CancelOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelOrderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the order.
     * </p>
     */
    private String orderId;

    /**
     * <p>
     * The ID of the order.
     * </p>
     * 
     * @param orderId
     *        The ID of the order.
     */

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * <p>
     * The ID of the order.
     * </p>
     * 
     * @return The ID of the order.
     */

    public String getOrderId() {
        return this.orderId;
    }

    /**
     * <p>
     * The ID of the order.
     * </p>
     * 
     * @param orderId
     *        The ID of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelOrderRequest withOrderId(String orderId) {
        setOrderId(orderId);
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
        if (getOrderId() != null)
            sb.append("OrderId: ").append(getOrderId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelOrderRequest == false)
            return false;
        CancelOrderRequest other = (CancelOrderRequest) obj;
        if (other.getOrderId() == null ^ this.getOrderId() == null)
            return false;
        if (other.getOrderId() != null && other.getOrderId().equals(this.getOrderId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        return hashCode;
    }

    @Override
    public CancelOrderRequest clone() {
        return (CancelOrderRequest) super.clone();
    }

}
