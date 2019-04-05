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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains zero or more <code>CacheBehavior</code> elements.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CacheBehaviors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheBehaviors implements Serializable, Cloneable {

    /**
     * <p>
     * The number of cache behaviors for this distribution.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CacheBehavior> items;

    /**
     * <p>
     * The number of cache behaviors for this distribution.
     * </p>
     * 
     * @param quantity
     *        The number of cache behaviors for this distribution.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of cache behaviors for this distribution.
     * </p>
     * 
     * @return The number of cache behaviors for this distribution.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of cache behaviors for this distribution.
     * </p>
     * 
     * @param quantity
     *        The number of cache behaviors for this distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehaviors withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @return Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     *         <code>0</code>, you can omit <code>Items</code>.
     */

    public java.util.List<CacheBehavior> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<CacheBehavior>();
        }
        return items;
    }

    /**
     * <p>
     * Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     *        <code>0</code>, you can omit <code>Items</code>.
     */

    public void setItems(java.util.Collection<CacheBehavior> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<CacheBehavior>(items);
    }

    /**
     * <p>
     * Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     *        <code>0</code>, you can omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehaviors withItems(CacheBehavior... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<CacheBehavior>(items.length));
        }
        for (CacheBehavior ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     * <code>0</code>, you can omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        Optional: A complex type that contains cache behaviors for this distribution. If <code>Quantity</code> is
     *        <code>0</code>, you can omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CacheBehaviors withItems(java.util.Collection<CacheBehavior> items) {
        setItems(items);
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
        if (getQuantity() != null)
            sb.append("Quantity: ").append(getQuantity()).append(",");
        if (getItems() != null)
            sb.append("Items: ").append(getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CacheBehaviors == false)
            return false;
        CacheBehaviors other = (CacheBehaviors) obj;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public CacheBehaviors clone() {
        try {
            return (CacheBehaviors) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
