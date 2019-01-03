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
 * Describes a product code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ProductCode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductCode implements Serializable, Cloneable {

    /**
     * <p>
     * The product code.
     * </p>
     */
    private String productCodeId;
    /**
     * <p>
     * The type of product code.
     * </p>
     */
    private String productCodeType;

    /**
     * <p>
     * The product code.
     * </p>
     * 
     * @param productCodeId
     *        The product code.
     */

    public void setProductCodeId(String productCodeId) {
        this.productCodeId = productCodeId;
    }

    /**
     * <p>
     * The product code.
     * </p>
     * 
     * @return The product code.
     */

    public String getProductCodeId() {
        return this.productCodeId;
    }

    /**
     * <p>
     * The product code.
     * </p>
     * 
     * @param productCodeId
     *        The product code.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductCode withProductCodeId(String productCodeId) {
        setProductCodeId(productCodeId);
        return this;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * 
     * @param productCodeType
     *        The type of product code.
     * @see ProductCodeValues
     */

    public void setProductCodeType(String productCodeType) {
        this.productCodeType = productCodeType;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * 
     * @return The type of product code.
     * @see ProductCodeValues
     */

    public String getProductCodeType() {
        return this.productCodeType;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * 
     * @param productCodeType
     *        The type of product code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductCodeValues
     */

    public ProductCode withProductCodeType(String productCodeType) {
        setProductCodeType(productCodeType);
        return this;
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * 
     * @param productCodeType
     *        The type of product code.
     * @see ProductCodeValues
     */

    public void setProductCodeType(ProductCodeValues productCodeType) {
        withProductCodeType(productCodeType);
    }

    /**
     * <p>
     * The type of product code.
     * </p>
     * 
     * @param productCodeType
     *        The type of product code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProductCodeValues
     */

    public ProductCode withProductCodeType(ProductCodeValues productCodeType) {
        this.productCodeType = productCodeType.toString();
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
        if (getProductCodeId() != null)
            sb.append("ProductCodeId: ").append(getProductCodeId()).append(",");
        if (getProductCodeType() != null)
            sb.append("ProductCodeType: ").append(getProductCodeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductCode == false)
            return false;
        ProductCode other = (ProductCode) obj;
        if (other.getProductCodeId() == null ^ this.getProductCodeId() == null)
            return false;
        if (other.getProductCodeId() != null && other.getProductCodeId().equals(this.getProductCodeId()) == false)
            return false;
        if (other.getProductCodeType() == null ^ this.getProductCodeType() == null)
            return false;
        if (other.getProductCodeType() != null && other.getProductCodeType().equals(this.getProductCodeType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductCodeId() == null) ? 0 : getProductCodeId().hashCode());
        hashCode = prime * hashCode + ((getProductCodeType() == null) ? 0 : getProductCodeType().hashCode());
        return hashCode;
    }

    @Override
    public ProductCode clone() {
        try {
            return (ProductCode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
