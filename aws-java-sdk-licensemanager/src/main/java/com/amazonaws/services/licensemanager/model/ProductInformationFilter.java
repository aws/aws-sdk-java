/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes product information filters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/ProductInformationFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductInformationFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filter name.
     * </p>
     */
    private String productInformationFilterName;
    /**
     * <p>
     * Filter value.
     * </p>
     */
    private java.util.List<String> productInformationFilterValue;
    /**
     * <p>
     * Logical operator.
     * </p>
     */
    private String productInformationFilterComparator;

    /**
     * <p>
     * Filter name.
     * </p>
     * 
     * @param productInformationFilterName
     *        Filter name.
     */

    public void setProductInformationFilterName(String productInformationFilterName) {
        this.productInformationFilterName = productInformationFilterName;
    }

    /**
     * <p>
     * Filter name.
     * </p>
     * 
     * @return Filter name.
     */

    public String getProductInformationFilterName() {
        return this.productInformationFilterName;
    }

    /**
     * <p>
     * Filter name.
     * </p>
     * 
     * @param productInformationFilterName
     *        Filter name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductInformationFilter withProductInformationFilterName(String productInformationFilterName) {
        setProductInformationFilterName(productInformationFilterName);
        return this;
    }

    /**
     * <p>
     * Filter value.
     * </p>
     * 
     * @return Filter value.
     */

    public java.util.List<String> getProductInformationFilterValue() {
        return productInformationFilterValue;
    }

    /**
     * <p>
     * Filter value.
     * </p>
     * 
     * @param productInformationFilterValue
     *        Filter value.
     */

    public void setProductInformationFilterValue(java.util.Collection<String> productInformationFilterValue) {
        if (productInformationFilterValue == null) {
            this.productInformationFilterValue = null;
            return;
        }

        this.productInformationFilterValue = new java.util.ArrayList<String>(productInformationFilterValue);
    }

    /**
     * <p>
     * Filter value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductInformationFilterValue(java.util.Collection)} or
     * {@link #withProductInformationFilterValue(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param productInformationFilterValue
     *        Filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductInformationFilter withProductInformationFilterValue(String... productInformationFilterValue) {
        if (this.productInformationFilterValue == null) {
            setProductInformationFilterValue(new java.util.ArrayList<String>(productInformationFilterValue.length));
        }
        for (String ele : productInformationFilterValue) {
            this.productInformationFilterValue.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filter value.
     * </p>
     * 
     * @param productInformationFilterValue
     *        Filter value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductInformationFilter withProductInformationFilterValue(java.util.Collection<String> productInformationFilterValue) {
        setProductInformationFilterValue(productInformationFilterValue);
        return this;
    }

    /**
     * <p>
     * Logical operator.
     * </p>
     * 
     * @param productInformationFilterComparator
     *        Logical operator.
     */

    public void setProductInformationFilterComparator(String productInformationFilterComparator) {
        this.productInformationFilterComparator = productInformationFilterComparator;
    }

    /**
     * <p>
     * Logical operator.
     * </p>
     * 
     * @return Logical operator.
     */

    public String getProductInformationFilterComparator() {
        return this.productInformationFilterComparator;
    }

    /**
     * <p>
     * Logical operator.
     * </p>
     * 
     * @param productInformationFilterComparator
     *        Logical operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductInformationFilter withProductInformationFilterComparator(String productInformationFilterComparator) {
        setProductInformationFilterComparator(productInformationFilterComparator);
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
        if (getProductInformationFilterName() != null)
            sb.append("ProductInformationFilterName: ").append(getProductInformationFilterName()).append(",");
        if (getProductInformationFilterValue() != null)
            sb.append("ProductInformationFilterValue: ").append(getProductInformationFilterValue()).append(",");
        if (getProductInformationFilterComparator() != null)
            sb.append("ProductInformationFilterComparator: ").append(getProductInformationFilterComparator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductInformationFilter == false)
            return false;
        ProductInformationFilter other = (ProductInformationFilter) obj;
        if (other.getProductInformationFilterName() == null ^ this.getProductInformationFilterName() == null)
            return false;
        if (other.getProductInformationFilterName() != null && other.getProductInformationFilterName().equals(this.getProductInformationFilterName()) == false)
            return false;
        if (other.getProductInformationFilterValue() == null ^ this.getProductInformationFilterValue() == null)
            return false;
        if (other.getProductInformationFilterValue() != null
                && other.getProductInformationFilterValue().equals(this.getProductInformationFilterValue()) == false)
            return false;
        if (other.getProductInformationFilterComparator() == null ^ this.getProductInformationFilterComparator() == null)
            return false;
        if (other.getProductInformationFilterComparator() != null
                && other.getProductInformationFilterComparator().equals(this.getProductInformationFilterComparator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProductInformationFilterName() == null) ? 0 : getProductInformationFilterName().hashCode());
        hashCode = prime * hashCode + ((getProductInformationFilterValue() == null) ? 0 : getProductInformationFilterValue().hashCode());
        hashCode = prime * hashCode + ((getProductInformationFilterComparator() == null) ? 0 : getProductInformationFilterComparator().hashCode());
        return hashCode;
    }

    @Override
    public ProductInformationFilter clone() {
        try {
            return (ProductInformationFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.ProductInformationFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
