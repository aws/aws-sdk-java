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
 * A complex type that specifies the headers that you want CloudFront to forward
 * to the origin for this cache behavior. For the headers that you specify,
 * CloudFront also caches separate versions of a given object based on the
 * header values in viewer requests; this is known as varying on headers. For
 * example, suppose viewer requests for logo.jpg contain a custom Product header
 * that has a value of either Acme or Apex, and you configure CloudFront to vary
 * on the Product header. CloudFront forwards the Product header to the origin
 * and caches the response from the origin once for each header value.
 */
public class Headers implements Serializable, Cloneable {

    /**
     * The number of different headers that you want CloudFront to forward to
     * the origin and to vary on for this cache behavior. The maximum number of
     * headers that you can specify by name is 10. If you want CloudFront to
     * forward all headers to the origin and vary on all of them, specify 1 for
     * Quantity and * for Name. If you don't want CloudFront to forward any
     * additional headers to the origin or to vary on any headers, specify 0 for
     * Quantity and omit Items.
     */
    private Integer quantity;
    /**
     * Optional: A complex type that contains a Name element for each header
     * that you want CloudFront to forward to the origin and to vary on for this
     * cache behavior. If Quantity is 0, omit Items.
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * The number of different headers that you want CloudFront to forward to
     * the origin and to vary on for this cache behavior. The maximum number of
     * headers that you can specify by name is 10. If you want CloudFront to
     * forward all headers to the origin and vary on all of them, specify 1 for
     * Quantity and * for Name. If you don't want CloudFront to forward any
     * additional headers to the origin or to vary on any headers, specify 0 for
     * Quantity and omit Items.
     * 
     * @param quantity
     *        The number of different headers that you want CloudFront to
     *        forward to the origin and to vary on for this cache behavior. The
     *        maximum number of headers that you can specify by name is 10. If
     *        you want CloudFront to forward all headers to the origin and vary
     *        on all of them, specify 1 for Quantity and * for Name. If you
     *        don't want CloudFront to forward any additional headers to the
     *        origin or to vary on any headers, specify 0 for Quantity and omit
     *        Items.
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * The number of different headers that you want CloudFront to forward to
     * the origin and to vary on for this cache behavior. The maximum number of
     * headers that you can specify by name is 10. If you want CloudFront to
     * forward all headers to the origin and vary on all of them, specify 1 for
     * Quantity and * for Name. If you don't want CloudFront to forward any
     * additional headers to the origin or to vary on any headers, specify 0 for
     * Quantity and omit Items.
     * 
     * @return The number of different headers that you want CloudFront to
     *         forward to the origin and to vary on for this cache behavior. The
     *         maximum number of headers that you can specify by name is 10. If
     *         you want CloudFront to forward all headers to the origin and vary
     *         on all of them, specify 1 for Quantity and * for Name. If you
     *         don't want CloudFront to forward any additional headers to the
     *         origin or to vary on any headers, specify 0 for Quantity and omit
     *         Items.
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * The number of different headers that you want CloudFront to forward to
     * the origin and to vary on for this cache behavior. The maximum number of
     * headers that you can specify by name is 10. If you want CloudFront to
     * forward all headers to the origin and vary on all of them, specify 1 for
     * Quantity and * for Name. If you don't want CloudFront to forward any
     * additional headers to the origin or to vary on any headers, specify 0 for
     * Quantity and omit Items.
     * 
     * @param quantity
     *        The number of different headers that you want CloudFront to
     *        forward to the origin and to vary on for this cache behavior. The
     *        maximum number of headers that you can specify by name is 10. If
     *        you want CloudFront to forward all headers to the origin and vary
     *        on all of them, specify 1 for Quantity and * for Name. If you
     *        don't want CloudFront to forward any additional headers to the
     *        origin or to vary on any headers, specify 0 for Quantity and omit
     *        Items.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Headers withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * Optional: A complex type that contains a Name element for each header
     * that you want CloudFront to forward to the origin and to vary on for this
     * cache behavior. If Quantity is 0, omit Items.
     * 
     * @return Optional: A complex type that contains a Name element for each
     *         header that you want CloudFront to forward to the origin and to
     *         vary on for this cache behavior. If Quantity is 0, omit Items.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * Optional: A complex type that contains a Name element for each header
     * that you want CloudFront to forward to the origin and to vary on for this
     * cache behavior. If Quantity is 0, omit Items.
     * 
     * @param items
     *        Optional: A complex type that contains a Name element for each
     *        header that you want CloudFront to forward to the origin and to
     *        vary on for this cache behavior. If Quantity is 0, omit Items.
     */

    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new com.amazonaws.internal.SdkInternalList<String>(items);
    }

    /**
     * Optional: A complex type that contains a Name element for each header
     * that you want CloudFront to forward to the origin and to vary on for this
     * cache behavior. If Quantity is 0, omit Items.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setItems(java.util.Collection)} or
     * {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        Optional: A complex type that contains a Name element for each
     *        header that you want CloudFront to forward to the origin and to
     *        vary on for this cache behavior. If Quantity is 0, omit Items.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Headers withItems(String... items) {
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
     * Optional: A complex type that contains a Name element for each header
     * that you want CloudFront to forward to the origin and to vary on for this
     * cache behavior. If Quantity is 0, omit Items.
     * 
     * @param items
     *        Optional: A complex type that contains a Name element for each
     *        header that you want CloudFront to forward to the origin and to
     *        vary on for this cache behavior. If Quantity is 0, omit Items.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Headers withItems(java.util.Collection<String> items) {
        setItems(items);
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
            sb.append("Items: " + getItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Headers == false)
            return false;
        Headers other = (Headers) obj;
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
        return hashCode;
    }

    @Override
    public Headers clone() {
        try {
            return (Headers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
