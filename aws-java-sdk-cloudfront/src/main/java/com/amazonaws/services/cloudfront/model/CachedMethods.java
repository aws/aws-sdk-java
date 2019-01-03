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
 * A complex type that controls whether CloudFront caches the response to requests using the specified HTTP methods.
 * There are two choices:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CloudFront caches responses to <code>GET</code> and <code>HEAD</code> requests.
 * </p>
 * </li>
 * <li>
 * <p>
 * CloudFront caches responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests.
 * </p>
 * </li>
 * </ul>
 * <p>
 * If you pick the second choice for your Amazon S3 Origin, you may need to forward Access-Control-Request-Method,
 * Access-Control-Request-Headers, and Origin headers for the responses to be cached correctly.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/CachedMethods" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CachedMethods implements Serializable, Cloneable {

    /**
     * <p>
     * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are <code>2</code> (for
     * caching responses to <code>GET</code> and <code>HEAD</code> requests) and <code>3</code> (for caching responses
     * to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests).
     * </p>
     */
    private Integer quantity;
    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * <p>
     * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are <code>2</code> (for
     * caching responses to <code>GET</code> and <code>HEAD</code> requests) and <code>3</code> (for caching responses
     * to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests).
     * </p>
     * 
     * @param quantity
     *        The number of HTTP methods for which you want CloudFront to cache responses. Valid values are
     *        <code>2</code> (for caching responses to <code>GET</code> and <code>HEAD</code> requests) and
     *        <code>3</code> (for caching responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code>
     *        requests).
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are <code>2</code> (for
     * caching responses to <code>GET</code> and <code>HEAD</code> requests) and <code>3</code> (for caching responses
     * to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests).
     * </p>
     * 
     * @return The number of HTTP methods for which you want CloudFront to cache responses. Valid values are
     *         <code>2</code> (for caching responses to <code>GET</code> and <code>HEAD</code> requests) and
     *         <code>3</code> (for caching responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code>
     *         requests).
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of HTTP methods for which you want CloudFront to cache responses. Valid values are <code>2</code> (for
     * caching responses to <code>GET</code> and <code>HEAD</code> requests) and <code>3</code> (for caching responses
     * to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code> requests).
     * </p>
     * 
     * @param quantity
     *        The number of HTTP methods for which you want CloudFront to cache responses. Valid values are
     *        <code>2</code> (for caching responses to <code>GET</code> and <code>HEAD</code> requests) and
     *        <code>3</code> (for caching responses to <code>GET</code>, <code>HEAD</code>, and <code>OPTIONS</code>
     *        requests).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CachedMethods withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * </p>
     * 
     * @return A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
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
     * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
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
     * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Method
     */

    public CachedMethods withItems(String... items) {
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
     * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Method
     */

    public CachedMethods withItems(java.util.Collection<String> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * </p>
     * 
     * @param items
     *        A complex type that contains the HTTP methods that you want CloudFront to cache responses to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Method
     */

    public CachedMethods withItems(Method... items) {
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

        if (obj instanceof CachedMethods == false)
            return false;
        CachedMethods other = (CachedMethods) obj;
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
    public CachedMethods clone() {
        try {
            return (CachedMethods) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
