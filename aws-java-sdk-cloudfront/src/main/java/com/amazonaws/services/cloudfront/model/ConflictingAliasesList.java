/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A list of aliases (also called CNAMEs) and the CloudFront distributions and Amazon Web Services accounts that they
 * are associated with. In the list, the distribution and account IDs are partially hidden, which allows you to identify
 * the distributions and accounts that you own, but helps to protect the information of ones that you don’t own.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/ConflictingAliasesList" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConflictingAliasesList implements Serializable, Cloneable {

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing conflicting
     * aliases where you left off.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The maximum number of conflicting aliases requested.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * The number of conflicting aliases returned in the response.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * Contains the conflicting aliases in the list.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConflictingAlias> items;

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing conflicting
     * aliases where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *        conflicting aliases where you left off.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing conflicting
     * aliases where you left off.
     * </p>
     * 
     * @return If there are more items in the list than are in this response, this element is present. It contains the
     *         value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *         conflicting aliases where you left off.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If there are more items in the list than are in this response, this element is present. It contains the value
     * that you should use in the <code>Marker</code> field of a subsequent request to continue listing conflicting
     * aliases where you left off.
     * </p>
     * 
     * @param nextMarker
     *        If there are more items in the list than are in this response, this element is present. It contains the
     *        value that you should use in the <code>Marker</code> field of a subsequent request to continue listing
     *        conflicting aliases where you left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAliasesList withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of conflicting aliases requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of conflicting aliases requested.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of conflicting aliases requested.
     * </p>
     * 
     * @return The maximum number of conflicting aliases requested.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of conflicting aliases requested.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of conflicting aliases requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAliasesList withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * The number of conflicting aliases returned in the response.
     * </p>
     * 
     * @param quantity
     *        The number of conflicting aliases returned in the response.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of conflicting aliases returned in the response.
     * </p>
     * 
     * @return The number of conflicting aliases returned in the response.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of conflicting aliases returned in the response.
     * </p>
     * 
     * @param quantity
     *        The number of conflicting aliases returned in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAliasesList withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * Contains the conflicting aliases in the list.
     * </p>
     * 
     * @return Contains the conflicting aliases in the list.
     */

    public java.util.List<ConflictingAlias> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<ConflictingAlias>();
        }
        return items;
    }

    /**
     * <p>
     * Contains the conflicting aliases in the list.
     * </p>
     * 
     * @param items
     *        Contains the conflicting aliases in the list.
     */

    public void setItems(java.util.Collection<ConflictingAlias> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<ConflictingAlias>(items);
    }

    /**
     * <p>
     * Contains the conflicting aliases in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Contains the conflicting aliases in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAliasesList withItems(ConflictingAlias... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<ConflictingAlias>(items.length));
        }
        for (ConflictingAlias ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains the conflicting aliases in the list.
     * </p>
     * 
     * @param items
     *        Contains the conflicting aliases in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConflictingAliasesList withItems(java.util.Collection<ConflictingAlias> items) {
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

        if (obj instanceof ConflictingAliasesList == false)
            return false;
        ConflictingAliasesList other = (ConflictingAliasesList) obj;
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
    public ConflictingAliasesList clone() {
        try {
            return (ConflictingAliasesList) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
