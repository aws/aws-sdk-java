/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * A complex type that controls which HTTP methods CloudFront processes
 * and forwards to your Amazon S3 bucket or your custom origin. There are
 * three choices: - CloudFront forwards only GET and HEAD requests. -
 * CloudFront forwards only GET, HEAD and OPTIONS requests. - CloudFront
 * forwards GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE requests. If
 * you pick the third choice, you may need to restrict access to your
 * Amazon S3 bucket or to your custom origin so users can't perform
 * operations that you don't want them to. For example, you may not want
 * users to have permission to delete objects from your origin.
 * </p>
 */
public class AllowedMethods implements Serializable {

    /**
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET,
     * HEAD and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH,
     * POST, and DELETE requests).
     */
    private Integer quantity;

    /**
     * A complex type that contains the HTTP methods that you want CloudFront
     * to process and forward to your origin.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> items;

    /**
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices: -
     * CloudFront caches responses to GET and HEAD requests. - CloudFront
     * caches responses to GET, HEAD, and OPTIONS requests. If you pick the
     * second choice for your S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers and
     * Origin headers for the responses to be cached correctly.
     */
    private CachedMethods cachedMethods;

    /**
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET,
     * HEAD and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH,
     * POST, and DELETE requests).
     *
     * @return The number of HTTP methods that you want CloudFront to forward to your
     *         origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET,
     *         HEAD and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH,
     *         POST, and DELETE requests).
     */
    public Integer getQuantity() {
        return quantity;
    }
    
    /**
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET,
     * HEAD and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH,
     * POST, and DELETE requests).
     *
     * @param quantity The number of HTTP methods that you want CloudFront to forward to your
     *         origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET,
     *         HEAD and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH,
     *         POST, and DELETE requests).
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    /**
     * The number of HTTP methods that you want CloudFront to forward to your
     * origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET,
     * HEAD and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH,
     * POST, and DELETE requests).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param quantity The number of HTTP methods that you want CloudFront to forward to your
     *         origin. Valid values are 2 (for GET and HEAD requests), 3 (for GET,
     *         HEAD and OPTIONS requests) and 7 (for GET, HEAD, OPTIONS, PUT, PATCH,
     *         POST, and DELETE requests).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllowedMethods withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * A complex type that contains the HTTP methods that you want CloudFront
     * to process and forward to your origin.
     *
     * @return A complex type that contains the HTTP methods that you want CloudFront
     *         to process and forward to your origin.
     */
    public java.util.List<String> getItems() {
        if (items == null) {
              items = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              items.setAutoConstruct(true);
        }
        return items;
    }
    
    /**
     * A complex type that contains the HTTP methods that you want CloudFront
     * to process and forward to your origin.
     *
     * @param items A complex type that contains the HTTP methods that you want CloudFront
     *         to process and forward to your origin.
     */
    public void setItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * A complex type that contains the HTTP methods that you want CloudFront
     * to process and forward to your origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A complex type that contains the HTTP methods that you want CloudFront
     *         to process and forward to your origin.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllowedMethods withItems(String... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<String>(items.length));
        for (String value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains the HTTP methods that you want CloudFront
     * to process and forward to your origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A complex type that contains the HTTP methods that you want CloudFront
     *         to process and forward to your origin.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllowedMethods withItems(java.util.Collection<String> items) {
        if (items == null) {
            this.items = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(items.size());
            itemsCopy.addAll(items);
            this.items = itemsCopy;
        }

        return this;
    }

    /**
     * A complex type that contains the HTTP methods that you want CloudFront
     * to process and forward to your origin.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A complex type that contains the HTTP methods that you want CloudFront
     *         to process and forward to your origin.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllowedMethods withItems(Method... items) {
        java.util.ArrayList<String> itemsCopy = new java.util.ArrayList<String>(items.length);
        for (Method member : items) {
            itemsCopy.add(member.toString());
        }
        if (getItems() == null) {
            setItems(itemsCopy);
        } else {
            getItems().addAll(itemsCopy);
        }
        return this;
    }

    /**
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices: -
     * CloudFront caches responses to GET and HEAD requests. - CloudFront
     * caches responses to GET, HEAD, and OPTIONS requests. If you pick the
     * second choice for your S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers and
     * Origin headers for the responses to be cached correctly.
     *
     * @return A complex type that controls whether CloudFront caches the response to
     *         requests using the specified HTTP methods. There are two choices: -
     *         CloudFront caches responses to GET and HEAD requests. - CloudFront
     *         caches responses to GET, HEAD, and OPTIONS requests. If you pick the
     *         second choice for your S3 Origin, you may need to forward
     *         Access-Control-Request-Method, Access-Control-Request-Headers and
     *         Origin headers for the responses to be cached correctly.
     */
    public CachedMethods getCachedMethods() {
        return cachedMethods;
    }
    
    /**
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices: -
     * CloudFront caches responses to GET and HEAD requests. - CloudFront
     * caches responses to GET, HEAD, and OPTIONS requests. If you pick the
     * second choice for your S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers and
     * Origin headers for the responses to be cached correctly.
     *
     * @param cachedMethods A complex type that controls whether CloudFront caches the response to
     *         requests using the specified HTTP methods. There are two choices: -
     *         CloudFront caches responses to GET and HEAD requests. - CloudFront
     *         caches responses to GET, HEAD, and OPTIONS requests. If you pick the
     *         second choice for your S3 Origin, you may need to forward
     *         Access-Control-Request-Method, Access-Control-Request-Headers and
     *         Origin headers for the responses to be cached correctly.
     */
    public void setCachedMethods(CachedMethods cachedMethods) {
        this.cachedMethods = cachedMethods;
    }
    
    /**
     * A complex type that controls whether CloudFront caches the response to
     * requests using the specified HTTP methods. There are two choices: -
     * CloudFront caches responses to GET and HEAD requests. - CloudFront
     * caches responses to GET, HEAD, and OPTIONS requests. If you pick the
     * second choice for your S3 Origin, you may need to forward
     * Access-Control-Request-Method, Access-Control-Request-Headers and
     * Origin headers for the responses to be cached correctly.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cachedMethods A complex type that controls whether CloudFront caches the response to
     *         requests using the specified HTTP methods. There are two choices: -
     *         CloudFront caches responses to GET and HEAD requests. - CloudFront
     *         caches responses to GET, HEAD, and OPTIONS requests. If you pick the
     *         second choice for your S3 Origin, you may need to forward
     *         Access-Control-Request-Method, Access-Control-Request-Headers and
     *         Origin headers for the responses to be cached correctly.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AllowedMethods withCachedMethods(CachedMethods cachedMethods) {
        this.cachedMethods = cachedMethods;
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
        if (getQuantity() != null) sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null) sb.append("Items: " + getItems() + ",");
        if (getCachedMethods() != null) sb.append("CachedMethods: " + getCachedMethods() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AllowedMethods == false) return false;
        AllowedMethods other = (AllowedMethods)obj;
        
        if (other.getQuantity() == null ^ this.getQuantity() == null) return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false) return false; 
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        if (other.getCachedMethods() == null ^ this.getCachedMethods() == null) return false;
        if (other.getCachedMethods() != null && other.getCachedMethods().equals(this.getCachedMethods()) == false) return false; 
        return true;
    }
    
}
    