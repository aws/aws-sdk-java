/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class AllowedMethods implements Serializable, Cloneable {

    private Integer quantity;

    private com.amazonaws.internal.SdkInternalList<String> items;

    private CachedMethods cachedMethods;

    /**
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @param quantity
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AllowedMethods withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * @return
     * @see Method
     */
    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * @param items
     * @see Method
     */
    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<String>(items);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setItems(java.util.Collection)} or
     * {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Method
     */
    public AllowedMethods withItems(String... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<String>(
                    items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * @param items
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Method
     */
    public AllowedMethods withItems(java.util.Collection<String> items) {
        setItems(items);
        return this;
    }

    /**
     * @param items
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Method
     */
    public AllowedMethods withItems(Method... items) {
        com.amazonaws.internal.SdkInternalList<String> itemsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                items.length);
        for (Method value : items) {
            itemsCopy.add(value.toString());
        }
        if (getItems() == null) {
            setItems(itemsCopy);
        } else {
            getItems().addAll(itemsCopy);
        }
        return this;
    }

    /**
     * @param cachedMethods
     */
    public void setCachedMethods(CachedMethods cachedMethods) {
        this.cachedMethods = cachedMethods;
    }

    /**
     * @return
     */
    public CachedMethods getCachedMethods() {
        return this.cachedMethods;
    }

    /**
     * @param cachedMethods
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public AllowedMethods withCachedMethods(CachedMethods cachedMethods) {
        setCachedMethods(cachedMethods);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null)
            sb.append("Items: " + getItems() + ",");
        if (getCachedMethods() != null)
            sb.append("CachedMethods: " + getCachedMethods());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AllowedMethods == false)
            return false;
        AllowedMethods other = (AllowedMethods) obj;
        if (other.getQuantity() == null ^ this.getQuantity() == null)
            return false;
        if (other.getQuantity() != null
                && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null
                && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getCachedMethods() == null ^ this.getCachedMethods() == null)
            return false;
        if (other.getCachedMethods() != null
                && other.getCachedMethods().equals(this.getCachedMethods()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode
                + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime
                * hashCode
                + ((getCachedMethods() == null) ? 0 : getCachedMethods()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AllowedMethods clone() {
        try {
            return (AllowedMethods) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}