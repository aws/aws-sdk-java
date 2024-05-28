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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The key value store list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/KeyValueStoreList" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeyValueStoreList implements Serializable, Cloneable {

    /**
     * <p>
     * The next marker associated with the key value store list.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of items in the key value store list.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The quantity of the key value store list.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * The items of the key value store list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValueStore> items;

    /**
     * <p>
     * The next marker associated with the key value store list.
     * </p>
     * 
     * @param nextMarker
     *        The next marker associated with the key value store list.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The next marker associated with the key value store list.
     * </p>
     * 
     * @return The next marker associated with the key value store list.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The next marker associated with the key value store list.
     * </p>
     * 
     * @param nextMarker
     *        The next marker associated with the key value store list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStoreList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of items in the key value store list.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items in the key value store list.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of items in the key value store list.
     * </p>
     * 
     * @return The maximum number of items in the key value store list.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of items in the key value store list.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of items in the key value store list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStoreList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The quantity of the key value store list.
     * </p>
     * 
     * @param quantity
     *        The quantity of the key value store list.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The quantity of the key value store list.
     * </p>
     * 
     * @return The quantity of the key value store list.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The quantity of the key value store list.
     * </p>
     * 
     * @param quantity
     *        The quantity of the key value store list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStoreList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * The items of the key value store list.
     * </p>
     * 
     * @return The items of the key value store list.
     */

    public java.util.List<KeyValueStore> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<KeyValueStore>();
        }
        return items;
    }

    /**
     * <p>
     * The items of the key value store list.
     * </p>
     * 
     * @param items
     *        The items of the key value store list.
     */

    public void setItems(java.util.Collection<KeyValueStore> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<KeyValueStore>(items);
    }

    /**
     * <p>
     * The items of the key value store list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The items of the key value store list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStoreList withItems(KeyValueStore... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<KeyValueStore>(items.length));
        }
        for (KeyValueStore ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The items of the key value store list.
     * </p>
     * 
     * @param items
     *        The items of the key value store list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KeyValueStoreList withItems(java.util.Collection<KeyValueStore> items) {
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
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

        if (obj instanceof KeyValueStoreList == false)
            return false;
        KeyValueStoreList other = (KeyValueStoreList) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        return hashCode;
    }

    @Override
    public KeyValueStoreList clone() {
        try {
            return (KeyValueStoreList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
