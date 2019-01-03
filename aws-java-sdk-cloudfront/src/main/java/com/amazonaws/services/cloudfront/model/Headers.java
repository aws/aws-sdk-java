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
 * A complex type that specifies the request headers, if any, that you want CloudFront to base caching on for this cache
 * behavior.
 * </p>
 * <p>
 * For the headers that you specify, CloudFront caches separate versions of a specified object based on the header
 * values in viewer requests. For example, suppose viewer requests for <code>logo.jpg</code> contain a custom
 * <code>product</code> header that has a value of either <code>acme</code> or <code>apex</code>, and you configure
 * CloudFront to cache your content based on values in the <code>product</code> header. CloudFront forwards the
 * <code>product</code> header to the origin and caches the response from the origin once for each header value. For
 * more information about caching based on header values, see <a
 * href="http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/header-caching.html">How CloudFront Forwards
 * and Caches Headers</a> in the <i>Amazon CloudFront Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2018-11-05/Headers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Headers implements Serializable, Cloneable {

    /**
     * <p>
     * The number of different headers that you want CloudFront to base caching on for this cache behavior. You can
     * configure each cache behavior in a web distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Forward all headers to your origin</b>: Specify <code>1</code> for <code>Quantity</code> and <code>*</code>
     * for <code>Name</code>.
     * </p>
     * <important>
     * <p>
     * CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront sends
     * every request to the origin.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Forward a whitelist of headers you specify</b>: Specify the number of headers that you want CloudFront to base
     * caching on. Then specify the header names in <code>Name</code> elements. CloudFront caches your objects based on
     * the values in the specified headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Forward only the default headers</b>: Specify <code>0</code> for <code>Quantity</code> and omit
     * <code>Items</code>. In this configuration, CloudFront doesn't cache based on the values in the request headers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the origin is
     * an S3 bucket or a custom origin. See the following documentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorS3Origin.html#request-s3-removed-headers"
     * >HTTP Request Headers That CloudFront Removes or Updates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Custom origin</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-headers-behavior"
     * >HTTP Request Headers and CloudFront Behavior</a>
     * </p>
     * </li>
     * </ul>
     */
    private Integer quantity;
    /**
     * <p>
     * A list that contains one <code>Name</code> element for each header that you want CloudFront to use for caching in
     * this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> items;

    /**
     * <p>
     * The number of different headers that you want CloudFront to base caching on for this cache behavior. You can
     * configure each cache behavior in a web distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Forward all headers to your origin</b>: Specify <code>1</code> for <code>Quantity</code> and <code>*</code>
     * for <code>Name</code>.
     * </p>
     * <important>
     * <p>
     * CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront sends
     * every request to the origin.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Forward a whitelist of headers you specify</b>: Specify the number of headers that you want CloudFront to base
     * caching on. Then specify the header names in <code>Name</code> elements. CloudFront caches your objects based on
     * the values in the specified headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Forward only the default headers</b>: Specify <code>0</code> for <code>Quantity</code> and omit
     * <code>Items</code>. In this configuration, CloudFront doesn't cache based on the values in the request headers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the origin is
     * an S3 bucket or a custom origin. See the following documentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorS3Origin.html#request-s3-removed-headers"
     * >HTTP Request Headers That CloudFront Removes or Updates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Custom origin</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-headers-behavior"
     * >HTTP Request Headers and CloudFront Behavior</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param quantity
     *        The number of different headers that you want CloudFront to base caching on for this cache behavior. You
     *        can configure each cache behavior in a web distribution to do one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Forward all headers to your origin</b>: Specify <code>1</code> for <code>Quantity</code> and
     *        <code>*</code> for <code>Name</code>.
     *        </p>
     *        <important>
     *        <p>
     *        CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront
     *        sends every request to the origin.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>Forward a whitelist of headers you specify</b>: Specify the number of headers that you want CloudFront
     *        to base caching on. Then specify the header names in <code>Name</code> elements. CloudFront caches your
     *        objects based on the values in the specified headers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Forward only the default headers</b>: Specify <code>0</code> for <code>Quantity</code> and omit
     *        <code>Items</code>. In this configuration, CloudFront doesn't cache based on the values in the request
     *        headers.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the
     *        origin is an S3 bucket or a custom origin. See the following documentation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>S3 bucket</b>: See <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorS3Origin.html#request-s3-removed-headers"
     *        >HTTP Request Headers That CloudFront Removes or Updates</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Custom origin</b>: See <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-headers-behavior"
     *        >HTTP Request Headers and CloudFront Behavior</a>
     *        </p>
     *        </li>
     */

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * <p>
     * The number of different headers that you want CloudFront to base caching on for this cache behavior. You can
     * configure each cache behavior in a web distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Forward all headers to your origin</b>: Specify <code>1</code> for <code>Quantity</code> and <code>*</code>
     * for <code>Name</code>.
     * </p>
     * <important>
     * <p>
     * CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront sends
     * every request to the origin.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Forward a whitelist of headers you specify</b>: Specify the number of headers that you want CloudFront to base
     * caching on. Then specify the header names in <code>Name</code> elements. CloudFront caches your objects based on
     * the values in the specified headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Forward only the default headers</b>: Specify <code>0</code> for <code>Quantity</code> and omit
     * <code>Items</code>. In this configuration, CloudFront doesn't cache based on the values in the request headers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the origin is
     * an S3 bucket or a custom origin. See the following documentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorS3Origin.html#request-s3-removed-headers"
     * >HTTP Request Headers That CloudFront Removes or Updates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Custom origin</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-headers-behavior"
     * >HTTP Request Headers and CloudFront Behavior</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of different headers that you want CloudFront to base caching on for this cache behavior. You
     *         can configure each cache behavior in a web distribution to do one of the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Forward all headers to your origin</b>: Specify <code>1</code> for <code>Quantity</code> and
     *         <code>*</code> for <code>Name</code>.
     *         </p>
     *         <important>
     *         <p>
     *         CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront
     *         sends every request to the origin.
     *         </p>
     *         </important></li>
     *         <li>
     *         <p>
     *         <b>Forward a whitelist of headers you specify</b>: Specify the number of headers that you want CloudFront
     *         to base caching on. Then specify the header names in <code>Name</code> elements. CloudFront caches your
     *         objects based on the values in the specified headers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Forward only the default headers</b>: Specify <code>0</code> for <code>Quantity</code> and omit
     *         <code>Items</code>. In this configuration, CloudFront doesn't cache based on the values in the request
     *         headers.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the
     *         origin is an S3 bucket or a custom origin. See the following documentation:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>S3 bucket</b>: See <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorS3Origin.html#request-s3-removed-headers"
     *         >HTTP Request Headers That CloudFront Removes or Updates</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Custom origin</b>: See <a href=
     *         "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-headers-behavior"
     *         >HTTP Request Headers and CloudFront Behavior</a>
     *         </p>
     *         </li>
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * <p>
     * The number of different headers that you want CloudFront to base caching on for this cache behavior. You can
     * configure each cache behavior in a web distribution to do one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Forward all headers to your origin</b>: Specify <code>1</code> for <code>Quantity</code> and <code>*</code>
     * for <code>Name</code>.
     * </p>
     * <important>
     * <p>
     * CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront sends
     * every request to the origin.
     * </p>
     * </important></li>
     * <li>
     * <p>
     * <b>Forward a whitelist of headers you specify</b>: Specify the number of headers that you want CloudFront to base
     * caching on. Then specify the header names in <code>Name</code> elements. CloudFront caches your objects based on
     * the values in the specified headers.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Forward only the default headers</b>: Specify <code>0</code> for <code>Quantity</code> and omit
     * <code>Items</code>. In this configuration, CloudFront doesn't cache based on the values in the request headers.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the origin is
     * an S3 bucket or a custom origin. See the following documentation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>S3 bucket</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorS3Origin.html#request-s3-removed-headers"
     * >HTTP Request Headers That CloudFront Removes or Updates</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Custom origin</b>: See <a href=
     * "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-headers-behavior"
     * >HTTP Request Headers and CloudFront Behavior</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param quantity
     *        The number of different headers that you want CloudFront to base caching on for this cache behavior. You
     *        can configure each cache behavior in a web distribution to do one of the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Forward all headers to your origin</b>: Specify <code>1</code> for <code>Quantity</code> and
     *        <code>*</code> for <code>Name</code>.
     *        </p>
     *        <important>
     *        <p>
     *        CloudFront doesn't cache the objects that are associated with this cache behavior. Instead, CloudFront
     *        sends every request to the origin.
     *        </p>
     *        </important></li>
     *        <li>
     *        <p>
     *        <b>Forward a whitelist of headers you specify</b>: Specify the number of headers that you want CloudFront
     *        to base caching on. Then specify the header names in <code>Name</code> elements. CloudFront caches your
     *        objects based on the values in the specified headers.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Forward only the default headers</b>: Specify <code>0</code> for <code>Quantity</code> and omit
     *        <code>Items</code>. In this configuration, CloudFront doesn't cache based on the values in the request
     *        headers.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Regardless of which option you choose, CloudFront forwards headers to your origin based on whether the
     *        origin is an S3 bucket or a custom origin. See the following documentation:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>S3 bucket</b>: See <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorS3Origin.html#request-s3-removed-headers"
     *        >HTTP Request Headers That CloudFront Removes or Updates</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Custom origin</b>: See <a href=
     *        "http://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/RequestAndResponseBehaviorCustomOrigin.html#request-custom-headers-behavior"
     *        >HTTP Request Headers and CloudFront Behavior</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Headers withQuantity(Integer quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>Name</code> element for each header that you want CloudFront to use for caching in
     * this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     * </p>
     * 
     * @return A list that contains one <code>Name</code> element for each header that you want CloudFront to use for
     *         caching in this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     */

    public java.util.List<String> getItems() {
        if (items == null) {
            items = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return items;
    }

    /**
     * <p>
     * A list that contains one <code>Name</code> element for each header that you want CloudFront to use for caching in
     * this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        A list that contains one <code>Name</code> element for each header that you want CloudFront to use for
     *        caching in this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
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
     * A list that contains one <code>Name</code> element for each header that you want CloudFront to use for caching in
     * this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        A list that contains one <code>Name</code> element for each header that you want CloudFront to use for
     *        caching in this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Headers withItems(String... items) {
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
     * A list that contains one <code>Name</code> element for each header that you want CloudFront to use for caching in
     * this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     * </p>
     * 
     * @param items
     *        A list that contains one <code>Name</code> element for each header that you want CloudFront to use for
     *        caching in this cache behavior. If <code>Quantity</code> is <code>0</code>, omit <code>Items</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Headers withItems(java.util.Collection<String> items) {
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

        if (obj instanceof Headers == false)
            return false;
        Headers other = (Headers) obj;
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
    public Headers clone() {
        try {
            return (Headers) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
