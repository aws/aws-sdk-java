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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the per unit rates for each individual product dimension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/RateCardItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RateCardItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and
     * are specified when the product is listed in AWS Marketplace.
     * </p>
     */
    private String dimensionKey;
    /**
     * <p>
     * Per unit price for the product dimension that’s used for calculating the amount to be charged.
     * </p>
     */
    private String price;

    /**
     * <p>
     * Dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and
     * are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @param dimensionKey
     *        Dimension for which the given entitlement applies. Dimensions represent categories of capacity in a
     *        product and are specified when the product is listed in AWS Marketplace.
     */

    public void setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
    }

    /**
     * <p>
     * Dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and
     * are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @return Dimension for which the given entitlement applies. Dimensions represent categories of capacity in a
     *         product and are specified when the product is listed in AWS Marketplace.
     */

    public String getDimensionKey() {
        return this.dimensionKey;
    }

    /**
     * <p>
     * Dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and
     * are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @param dimensionKey
     *        Dimension for which the given entitlement applies. Dimensions represent categories of capacity in a
     *        product and are specified when the product is listed in AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateCardItem withDimensionKey(String dimensionKey) {
        setDimensionKey(dimensionKey);
        return this;
    }

    /**
     * <p>
     * Per unit price for the product dimension that’s used for calculating the amount to be charged.
     * </p>
     * 
     * @param price
     *        Per unit price for the product dimension that’s used for calculating the amount to be charged.
     */

    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * <p>
     * Per unit price for the product dimension that’s used for calculating the amount to be charged.
     * </p>
     * 
     * @return Per unit price for the product dimension that’s used for calculating the amount to be charged.
     */

    public String getPrice() {
        return this.price;
    }

    /**
     * <p>
     * Per unit price for the product dimension that’s used for calculating the amount to be charged.
     * </p>
     * 
     * @param price
     *        Per unit price for the product dimension that’s used for calculating the amount to be charged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RateCardItem withPrice(String price) {
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
        if (getDimensionKey() != null)
            sb.append("DimensionKey: ").append(getDimensionKey()).append(",");
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

        if (obj instanceof RateCardItem == false)
            return false;
        RateCardItem other = (RateCardItem) obj;
        if (other.getDimensionKey() == null ^ this.getDimensionKey() == null)
            return false;
        if (other.getDimensionKey() != null && other.getDimensionKey().equals(this.getDimensionKey()) == false)
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

        hashCode = prime * hashCode + ((getDimensionKey() == null) ? 0 : getDimensionKey().hashCode());
        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return hashCode;
    }

    @Override
    public RateCardItem clone() {
        try {
            return (RateCardItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.RateCardItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
