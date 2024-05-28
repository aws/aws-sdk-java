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
 * Entitlements granted to the acceptor of fixed upfront as part of agreement execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/GrantItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GrantItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique dimension key defined in the product document. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     */
    private String dimensionKey;
    /**
     * <p>
     * Maximum amount of capacity that the buyer can be entitled to the given dimension of the product. If
     * <code>MaxQuantity</code> is not provided, the buyer will be able to use an unlimited amount of the given
     * dimension.
     * </p>
     */
    private Integer maxQuantity;

    /**
     * <p>
     * Unique dimension key defined in the product document. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @param dimensionKey
     *        Unique dimension key defined in the product document. Dimensions represent categories of capacity in a
     *        product and are specified when the product is listed in AWS Marketplace.
     */

    public void setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
    }

    /**
     * <p>
     * Unique dimension key defined in the product document. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @return Unique dimension key defined in the product document. Dimensions represent categories of capacity in a
     *         product and are specified when the product is listed in AWS Marketplace.
     */

    public String getDimensionKey() {
        return this.dimensionKey;
    }

    /**
     * <p>
     * Unique dimension key defined in the product document. Dimensions represent categories of capacity in a product
     * and are specified when the product is listed in AWS Marketplace.
     * </p>
     * 
     * @param dimensionKey
     *        Unique dimension key defined in the product document. Dimensions represent categories of capacity in a
     *        product and are specified when the product is listed in AWS Marketplace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantItem withDimensionKey(String dimensionKey) {
        setDimensionKey(dimensionKey);
        return this;
    }

    /**
     * <p>
     * Maximum amount of capacity that the buyer can be entitled to the given dimension of the product. If
     * <code>MaxQuantity</code> is not provided, the buyer will be able to use an unlimited amount of the given
     * dimension.
     * </p>
     * 
     * @param maxQuantity
     *        Maximum amount of capacity that the buyer can be entitled to the given dimension of the product. If
     *        <code>MaxQuantity</code> is not provided, the buyer will be able to use an unlimited amount of the given
     *        dimension.
     */

    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    /**
     * <p>
     * Maximum amount of capacity that the buyer can be entitled to the given dimension of the product. If
     * <code>MaxQuantity</code> is not provided, the buyer will be able to use an unlimited amount of the given
     * dimension.
     * </p>
     * 
     * @return Maximum amount of capacity that the buyer can be entitled to the given dimension of the product. If
     *         <code>MaxQuantity</code> is not provided, the buyer will be able to use an unlimited amount of the given
     *         dimension.
     */

    public Integer getMaxQuantity() {
        return this.maxQuantity;
    }

    /**
     * <p>
     * Maximum amount of capacity that the buyer can be entitled to the given dimension of the product. If
     * <code>MaxQuantity</code> is not provided, the buyer will be able to use an unlimited amount of the given
     * dimension.
     * </p>
     * 
     * @param maxQuantity
     *        Maximum amount of capacity that the buyer can be entitled to the given dimension of the product. If
     *        <code>MaxQuantity</code> is not provided, the buyer will be able to use an unlimited amount of the given
     *        dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GrantItem withMaxQuantity(Integer maxQuantity) {
        setMaxQuantity(maxQuantity);
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
        if (getMaxQuantity() != null)
            sb.append("MaxQuantity: ").append(getMaxQuantity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantItem == false)
            return false;
        GrantItem other = (GrantItem) obj;
        if (other.getDimensionKey() == null ^ this.getDimensionKey() == null)
            return false;
        if (other.getDimensionKey() != null && other.getDimensionKey().equals(this.getDimensionKey()) == false)
            return false;
        if (other.getMaxQuantity() == null ^ this.getMaxQuantity() == null)
            return false;
        if (other.getMaxQuantity() != null && other.getMaxQuantity().equals(this.getMaxQuantity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionKey() == null) ? 0 : getDimensionKey().hashCode());
        hashCode = prime * hashCode + ((getMaxQuantity() == null) ? 0 : getMaxQuantity().hashCode());
        return hashCode;
    }

    @Override
    public GrantItem clone() {
        try {
            return (GrantItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.GrantItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
