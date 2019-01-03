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
 * A complex type that controls which HTTP methods CloudFront processes and forwards to your Amazon S3 bucket or your
 * custom origin. There are three choices:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CloudFront forwards only <code>GET</code> and <code>HEAD</code> requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * CloudFront forwards only <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * CloudFront forwards <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and <code>DELETE</code> requests.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you pick the third choice, you may need to restrict access to your Amazon S3 bucket or to your custom origin so
 * users can't perform operations that you don't want them to. For example, you might not want users to have permissions
 * to delete objects from your origin.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/AllowedMethods" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AllowedMethods implements Serializable, Cloneable {

    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for
     * <code>GET</code> and <code>HEAD</code> requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    private CachedMethods cachedMethods;

    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for
     * <code>GET</code> and <code>HEAD</code> requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     * 
     * @param quantity
     *        The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for
     *        <code>GET</code> and <code>HEAD</code> requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     *        <code>OPTIONS</code> requests) and 7 (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *        <code>DELETE</code> requests).
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for
     * <code>GET</code> and <code>HEAD</code> requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     * 
     * @return The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for
     *         <code>GET</code> and <code>HEAD</code> requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     *         <code>OPTIONS</code> requests) and 7 (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *         <code>DELETE</code> requests).
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for
     * <code>GET</code> and <code>HEAD</code> requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     * <code>OPTIONS</code> requests) and 7 (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     * <code>DELETE</code> requests).
     * </p>
     * 
     * @param quantity
     *        The number of HTTP methods that you want CloudFront to forward to your origin. Valid values are 2 (for
     *        <code>GET</code> and <code>HEAD</code> requests), 3 (for <code>GET</code>, <code>HEAD</code>, and
     *        <code>OPTIONS</code> requests) and 7 (for <code>GET, HEAD, OPTIONS, PUT, PATCH, POST</code>, and
     *        <code>DELETE</code> requests).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedMethods withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
     * </p>
     * 
     * @return A complex type that contains the HTTP methods that you want CloudFront to process and forward to your
     *         origin.
     * @see Method
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to process and forward to your
     *        origin.
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
     * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to process and forward to your
     *        origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Method
     */

    public AllowedMethods withItems(String... items) {
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
     * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to process and forward to your
     *        origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Method
     */

    public AllowedMethods withItems(java.util.Collection<String> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to process and forward to your origin.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to process and forward to your
     *        origin.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Method
     */

    public AllowedMethods withItems(Method... items) {
        com.amazonaws.internal.SdkInternalList<String> itemsCopy = new com.amazonaws.internal.SdkInternalList<String>(items.length);
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AllowedMethods withCachedMethods(CachedMethods cachedMethods) {
        setCachedMethods(cachedMethods);
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
            sb.append("Items: ").append(getItems()).append(",");
        if (getCachedMethods() != null)
            sb.append("CachedMethods: ").append(getCachedMethods());
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
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false)
            return false;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getCachedMethods() == null ^ this.getCachedMethods() == null)
            return false;
        if (other.getCachedMethods() != null && other.getCachedMethods().equals(this.getCachedMethods()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getCachedMethods() == null) ? 0 : getCachedMethods().hashCode());
        return hashCode;
    }

    @Override
    public AllowedMethods clone() {
        try {
            return (AllowedMethods) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
