/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that specifies the AWS accounts, if any, that you want to allow to create signed URLs for private content. If you want to require
 * signed URLs in requests for objects in the target origin that match the PathPattern for this cache behavior, specify true for Enabled, and specify the
 * applicable values for Quantity and Items. For more information, go to Using a Signed URL to Serve Private Content in the Amazon CloudFront Developer
 * Guide. If you don't want to require signed URLs in requests for objects that match PathPattern, specify false for Enabled and 0 for Quantity. Omit
 * Items. To add, change, or remove one or more trusted signers, change Enabled to true (if it's currently false), change Quantity as applicable, and
 * specify all of the trusted signers that you want to include in the updated distribution.
 * </p>
 */
public class TrustedSigners implements Serializable {

    /**
     * Specifies whether you want to require end users to use signed URLs to
     * access the files specified by PathPattern and TargetOriginId.
     */
    private Boolean enabled;

    /**
     * The number of trusted signers for this cache behavior.
     */
    private Integer quantity;

    /**
     * Optional: A complex type that contains trusted signers for this cache
     * behavior. If Quantity is 0, you can omit Items.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> items;

    /**
     * Default constructor for a new TrustedSigners object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public TrustedSigners() {}
    
    /**
     * Constructs a new TrustedSigners object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param items Optional: A complex type that contains trusted signers
     * for this cache behavior. If Quantity is 0, you can omit Items.
     */
    public TrustedSigners(java.util.List<String> items) {
        setItems(items);
    }

    /**
     * Specifies whether you want to require end users to use signed URLs to
     * access the files specified by PathPattern and TargetOriginId.
     *
     * @return Specifies whether you want to require end users to use signed URLs to
     *         access the files specified by PathPattern and TargetOriginId.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether you want to require end users to use signed URLs to
     * access the files specified by PathPattern and TargetOriginId.
     *
     * @param enabled Specifies whether you want to require end users to use signed URLs to
     *         access the files specified by PathPattern and TargetOriginId.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether you want to require end users to use signed URLs to
     * access the files specified by PathPattern and TargetOriginId.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether you want to require end users to use signed URLs to
     *         access the files specified by PathPattern and TargetOriginId.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedSigners withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether you want to require end users to use signed URLs to
     * access the files specified by PathPattern and TargetOriginId.
     *
     * @return Specifies whether you want to require end users to use signed URLs to
     *         access the files specified by PathPattern and TargetOriginId.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The number of trusted signers for this cache behavior.
     *
     * @return The number of trusted signers for this cache behavior.
     */
    public Integer getQuantity() {
        return quantity;
    }
    
    /**
     * The number of trusted signers for this cache behavior.
     *
     * @param quantity The number of trusted signers for this cache behavior.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    /**
     * The number of trusted signers for this cache behavior.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param quantity The number of trusted signers for this cache behavior.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedSigners withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Optional: A complex type that contains trusted signers for this cache
     * behavior. If Quantity is 0, you can omit Items.
     *
     * @return Optional: A complex type that contains trusted signers for this cache
     *         behavior. If Quantity is 0, you can omit Items.
     */
    public java.util.List<String> getItems() {
        if (items == null) {
              items = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              items.setAutoConstruct(true);
        }
        return items;
    }
    
    /**
     * Optional: A complex type that contains trusted signers for this cache
     * behavior. If Quantity is 0, you can omit Items.
     *
     * @param items Optional: A complex type that contains trusted signers for this cache
     *         behavior. If Quantity is 0, you can omit Items.
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
     * Optional: A complex type that contains trusted signers for this cache
     * behavior. If Quantity is 0, you can omit Items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items Optional: A complex type that contains trusted signers for this cache
     *         behavior. If Quantity is 0, you can omit Items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedSigners withItems(String... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<String>(items.length));
        for (String value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * Optional: A complex type that contains trusted signers for this cache
     * behavior. If Quantity is 0, you can omit Items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items Optional: A complex type that contains trusted signers for this cache
     *         behavior. If Quantity is 0, you can omit Items.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedSigners withItems(java.util.Collection<String> items) {
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
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getQuantity() != null) sb.append("Quantity: " + getQuantity() + ",");
        if (getItems() != null) sb.append("Items: " + getItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getQuantity() == null) ? 0 : getQuantity().hashCode()); 
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedSigners == false) return false;
        TrustedSigners other = (TrustedSigners)obj;
        
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getQuantity() == null ^ this.getQuantity() == null) return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false) return false; 
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        return true;
    }
    
}
    