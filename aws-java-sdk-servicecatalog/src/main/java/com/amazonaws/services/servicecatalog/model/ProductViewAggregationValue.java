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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single product view aggregation value/count pair, containing metadata about each product to which the calling user
 * has access.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ProductViewAggregationValue"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductViewAggregationValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     */
    private String value;
    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     */
    private Integer approximateCount;

    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     * 
     * @param value
     *        The value of the product view aggregation.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     * 
     * @return The value of the product view aggregation.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the product view aggregation.
     * </p>
     * 
     * @param value
     *        The value of the product view aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewAggregationValue withValue(String value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     * 
     * @param approximateCount
     *        An approximate count of the products that match the value.
     */

    public void setApproximateCount(Integer approximateCount) {
        this.approximateCount = approximateCount;
    }

    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     * 
     * @return An approximate count of the products that match the value.
     */

    public Integer getApproximateCount() {
        return this.approximateCount;
    }

    /**
     * <p>
     * An approximate count of the products that match the value.
     * </p>
     * 
     * @param approximateCount
     *        An approximate count of the products that match the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductViewAggregationValue withApproximateCount(Integer approximateCount) {
        setApproximateCount(approximateCount);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
        if (getApproximateCount() != null)
            sb.append("ApproximateCount: ").append(getApproximateCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductViewAggregationValue == false)
            return false;
        ProductViewAggregationValue other = (ProductViewAggregationValue) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getApproximateCount() == null ^ this.getApproximateCount() == null)
            return false;
        if (other.getApproximateCount() != null && other.getApproximateCount().equals(this.getApproximateCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getApproximateCount() == null) ? 0 : getApproximateCount().hashCode());
        return hashCode;
    }

    @Override
    public ProductViewAggregationValue clone() {
        try {
            return (ProductViewAggregationValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ProductViewAggregationValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
