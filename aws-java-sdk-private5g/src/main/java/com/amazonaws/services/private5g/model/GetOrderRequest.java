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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/GetOrder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetOrderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     */
    private String orderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order.
     */

    public void setOrderArn(String orderArn) {
        this.orderArn = orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the order.
     */

    public String getOrderArn() {
        return this.orderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the order.
     * </p>
     * 
     * @param orderArn
     *        The Amazon Resource Name (ARN) of the order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetOrderRequest withOrderArn(String orderArn) {
        setOrderArn(orderArn);
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
        if (getOrderArn() != null)
            sb.append("OrderArn: ").append(getOrderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetOrderRequest == false)
            return false;
        GetOrderRequest other = (GetOrderRequest) obj;
        if (other.getOrderArn() == null ^ this.getOrderArn() == null)
            return false;
        if (other.getOrderArn() != null && other.getOrderArn().equals(this.getOrderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrderArn() == null) ? 0 : getOrderArn().hashCode());
        return hashCode;
    }

    @Override
    public GetOrderRequest clone() {
        return (GetOrderRequest) super.clone();
    }

}
