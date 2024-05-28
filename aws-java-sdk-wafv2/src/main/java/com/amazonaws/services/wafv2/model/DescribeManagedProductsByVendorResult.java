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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/DescribeManagedProductsByVendor"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeManagedProductsByVendorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * High-level information for the managed rule groups owned by the specified vendor.
     * </p>
     */
    private java.util.List<ManagedProductDescriptor> managedProducts;

    /**
     * <p>
     * High-level information for the managed rule groups owned by the specified vendor.
     * </p>
     * 
     * @return High-level information for the managed rule groups owned by the specified vendor.
     */

    public java.util.List<ManagedProductDescriptor> getManagedProducts() {
        return managedProducts;
    }

    /**
     * <p>
     * High-level information for the managed rule groups owned by the specified vendor.
     * </p>
     * 
     * @param managedProducts
     *        High-level information for the managed rule groups owned by the specified vendor.
     */

    public void setManagedProducts(java.util.Collection<ManagedProductDescriptor> managedProducts) {
        if (managedProducts == null) {
            this.managedProducts = null;
            return;
        }

        this.managedProducts = new java.util.ArrayList<ManagedProductDescriptor>(managedProducts);
    }

    /**
     * <p>
     * High-level information for the managed rule groups owned by the specified vendor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManagedProducts(java.util.Collection)} or {@link #withManagedProducts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param managedProducts
     *        High-level information for the managed rule groups owned by the specified vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedProductsByVendorResult withManagedProducts(ManagedProductDescriptor... managedProducts) {
        if (this.managedProducts == null) {
            setManagedProducts(new java.util.ArrayList<ManagedProductDescriptor>(managedProducts.length));
        }
        for (ManagedProductDescriptor ele : managedProducts) {
            this.managedProducts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * High-level information for the managed rule groups owned by the specified vendor.
     * </p>
     * 
     * @param managedProducts
     *        High-level information for the managed rule groups owned by the specified vendor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeManagedProductsByVendorResult withManagedProducts(java.util.Collection<ManagedProductDescriptor> managedProducts) {
        setManagedProducts(managedProducts);
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
        if (getManagedProducts() != null)
            sb.append("ManagedProducts: ").append(getManagedProducts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedProductsByVendorResult == false)
            return false;
        DescribeManagedProductsByVendorResult other = (DescribeManagedProductsByVendorResult) obj;
        if (other.getManagedProducts() == null ^ this.getManagedProducts() == null)
            return false;
        if (other.getManagedProducts() != null && other.getManagedProducts().equals(this.getManagedProducts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getManagedProducts() == null) ? 0 : getManagedProducts().hashCode());
        return hashCode;
    }

    @Override
    public DescribeManagedProductsByVendorResult clone() {
        try {
            return (DescribeManagedProductsByVendorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
