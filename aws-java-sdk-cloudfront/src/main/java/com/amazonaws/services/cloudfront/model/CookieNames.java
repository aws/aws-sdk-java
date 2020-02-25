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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that specifies whether you want CloudFront to forward cookies to the origin and, if so, which ones.
 * For more information about forwarding cookies to the origin, see <a
 * href="https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html"> Caching Content Based
 * on Request Headers</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2019-03-26/CookieNames" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CookieNames implements Serializable, Cloneable {

    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior. The
     * value must equal the number of items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this value must be
     * <code>1</code> or higher.
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to forward to
     * the origin for this cache behavior. It must contain the same number of items that is specified in the
     * <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field must
     * contain at least one item.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior. The
     * value must equal the number of items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this value must be
     * <code>1</code> or higher.
     * </p>
     * 
     * @param quantity
     *        The number of different cookies that you want CloudFront to forward to the origin for this cache behavior.
     *        The value must equal the number of items that are in the <code>Items</code> field.</p>
     *        <p>
     *        When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this value
     *        must be <code>1</code> or higher.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior. The
     * value must equal the number of items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this value must be
     * <code>1</code> or higher.
     * </p>
     * 
     * @return The number of different cookies that you want CloudFront to forward to the origin for this cache
     *         behavior. The value must equal the number of items that are in the <code>Items</code> field.</p>
     *         <p>
     *         When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this value
     *         must be <code>1</code> or higher.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of different cookies that you want CloudFront to forward to the origin for this cache behavior. The
     * value must equal the number of items that are in the <code>Items</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this value must be
     * <code>1</code> or higher.
     * </p>
     * 
     * @param quantity
     *        The number of different cookies that you want CloudFront to forward to the origin for this cache behavior.
     *        The value must equal the number of items that are in the <code>Items</code> field.</p>
     *        <p>
     *        When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this value
     *        must be <code>1</code> or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieNames withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to forward to
     * the origin for this cache behavior. It must contain the same number of items that is specified in the
     * <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field must
     * contain at least one item.
     * </p>
     * 
     * @return A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to
     *         forward to the origin for this cache behavior. It must contain the same number of items that is specified
     *         in the <code>Quantity</code> field.</p>
     *         <p>
     *         When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field
     *         must contain at least one item.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to forward to
     * the origin for this cache behavior. It must contain the same number of items that is specified in the
     * <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field must
     * contain at least one item.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to
     *        forward to the origin for this cache behavior. It must contain the same number of items that is specified
     *        in the <code>Quantity</code> field.</p>
     *        <p>
     *        When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field
     *        must contain at least one item.
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
     * A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to forward to
     * the origin for this cache behavior. It must contain the same number of items that is specified in the
     * <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field must
     * contain at least one item.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to
     *        forward to the origin for this cache behavior. It must contain the same number of items that is specified
     *        in the <code>Quantity</code> field.</p>
     *        <p>
     *        When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field
     *        must contain at least one item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieNames withItems(String... items) {
        if (this.items == null) {
            setItems(new com.amazonaws.internal.SdkInternalList<String>(items.length));
        }
        for (String ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to forward to
     * the origin for this cache behavior. It must contain the same number of items that is specified in the
     * <code>Quantity</code> field.
     * </p>
     * <p>
     * When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field must
     * contain at least one item.
     * </p>
     * 
     * @param items
     *        A complex type that contains one <code>Name</code> element for each cookie that you want CloudFront to
     *        forward to the origin for this cache behavior. It must contain the same number of items that is specified
     *        in the <code>Quantity</code> field.</p>
     *        <p>
     *        When you set <code>Forward = whitelist</code> (in the <code>CookiePreferences</code> object), this field
     *        must contain at least one item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CookieNames withItems(java.util.Collection<String> items) {
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

        if (obj instanceof CookieNames == false)
            return false;
        CookieNames other = (CookieNames) obj;
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
    public CookieNames clone() {
        try {
            return (CookieNames) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
