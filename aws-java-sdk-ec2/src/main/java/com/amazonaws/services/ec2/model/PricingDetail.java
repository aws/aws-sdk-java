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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a Reserved Instance offering.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/PricingDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PricingDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The price per instance.
     * </p>
     */
    private Double price;

    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     * 
     * @param count
     *        The number of reservations available for the price.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     * 
     * @return The number of reservations available for the price.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of reservations available for the price.
     * </p>
     * 
     * @param count
     *        The number of reservations available for the price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingDetail withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The price per instance.
     * </p>
     * 
     * @param price
     *        The price per instance.
     */

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * <p>
     * The price per instance.
     * </p>
     * 
     * @return The price per instance.
     */

    public Double getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The price per instance.
     * </p>
     * 
     * @param price
     *        The price per instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PricingDetail withPrice(Double price) {
        setPrice(price);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PricingDetail == false)
            return false;
        PricingDetail other = (PricingDetail) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return hashCode;
    }

    @Override
    public PricingDetail clone() {
        try {
            return (PricingDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
