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
 * A complex type that lists the AWS accounts, if any, that you included in the TrustedSigners complex type for the default cache behavior or for any of
 * the other cache behaviors for this distribution. These are accounts that you want to allow to create signed URLs for private content.
 * </p>
 */
public class ActiveTrustedSigners implements Serializable {

    /**
     * Each active trusted signer.
     */
    private Boolean enabled;

    /**
     * The number of unique trusted signers included in all cache behaviors.
     * For example, if three cache behaviors all list the same three AWS
     * accounts, the value of Quantity for ActiveTrustedSigners will be 3.
     */
    private Integer quantity;

    /**
     * A complex type that contains one Signer complex type for each unique
     * trusted signer that is specified in the TrustedSigners complex type,
     * including trusted signers in the default cache behavior and in all of
     * the other cache behaviors.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Signer> items;

    /**
     * Default constructor for a new ActiveTrustedSigners object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ActiveTrustedSigners() {}
    
    /**
     * Constructs a new ActiveTrustedSigners object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param items A complex type that contains one Signer complex type for
     * each unique trusted signer that is specified in the TrustedSigners
     * complex type, including trusted signers in the default cache behavior
     * and in all of the other cache behaviors.
     */
    public ActiveTrustedSigners(java.util.List<Signer> items) {
        setItems(items);
    }

    /**
     * Each active trusted signer.
     *
     * @return Each active trusted signer.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Each active trusted signer.
     *
     * @param enabled Each active trusted signer.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Each active trusted signer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Each active trusted signer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActiveTrustedSigners withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Each active trusted signer.
     *
     * @return Each active trusted signer.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The number of unique trusted signers included in all cache behaviors.
     * For example, if three cache behaviors all list the same three AWS
     * accounts, the value of Quantity for ActiveTrustedSigners will be 3.
     *
     * @return The number of unique trusted signers included in all cache behaviors.
     *         For example, if three cache behaviors all list the same three AWS
     *         accounts, the value of Quantity for ActiveTrustedSigners will be 3.
     */
    public Integer getQuantity() {
        return quantity;
    }
    
    /**
     * The number of unique trusted signers included in all cache behaviors.
     * For example, if three cache behaviors all list the same three AWS
     * accounts, the value of Quantity for ActiveTrustedSigners will be 3.
     *
     * @param quantity The number of unique trusted signers included in all cache behaviors.
     *         For example, if three cache behaviors all list the same three AWS
     *         accounts, the value of Quantity for ActiveTrustedSigners will be 3.
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    /**
     * The number of unique trusted signers included in all cache behaviors.
     * For example, if three cache behaviors all list the same three AWS
     * accounts, the value of Quantity for ActiveTrustedSigners will be 3.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param quantity The number of unique trusted signers included in all cache behaviors.
     *         For example, if three cache behaviors all list the same three AWS
     *         accounts, the value of Quantity for ActiveTrustedSigners will be 3.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActiveTrustedSigners withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * A complex type that contains one Signer complex type for each unique
     * trusted signer that is specified in the TrustedSigners complex type,
     * including trusted signers in the default cache behavior and in all of
     * the other cache behaviors.
     *
     * @return A complex type that contains one Signer complex type for each unique
     *         trusted signer that is specified in the TrustedSigners complex type,
     *         including trusted signers in the default cache behavior and in all of
     *         the other cache behaviors.
     */
    public java.util.List<Signer> getItems() {
        if (items == null) {
              items = new com.amazonaws.internal.ListWithAutoConstructFlag<Signer>();
              items.setAutoConstruct(true);
        }
        return items;
    }
    
    /**
     * A complex type that contains one Signer complex type for each unique
     * trusted signer that is specified in the TrustedSigners complex type,
     * including trusted signers in the default cache behavior and in all of
     * the other cache behaviors.
     *
     * @param items A complex type that contains one Signer complex type for each unique
     *         trusted signer that is specified in the TrustedSigners complex type,
     *         including trusted signers in the default cache behavior and in all of
     *         the other cache behaviors.
     */
    public void setItems(java.util.Collection<Signer> items) {
        if (items == null) {
            this.items = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Signer> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Signer>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * A complex type that contains one Signer complex type for each unique
     * trusted signer that is specified in the TrustedSigners complex type,
     * including trusted signers in the default cache behavior and in all of
     * the other cache behaviors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A complex type that contains one Signer complex type for each unique
     *         trusted signer that is specified in the TrustedSigners complex type,
     *         including trusted signers in the default cache behavior and in all of
     *         the other cache behaviors.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActiveTrustedSigners withItems(Signer... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<Signer>(items.length));
        for (Signer value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains one Signer complex type for each unique
     * trusted signer that is specified in the TrustedSigners complex type,
     * including trusted signers in the default cache behavior and in all of
     * the other cache behaviors.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items A complex type that contains one Signer complex type for each unique
     *         trusted signer that is specified in the TrustedSigners complex type,
     *         including trusted signers in the default cache behavior and in all of
     *         the other cache behaviors.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActiveTrustedSigners withItems(java.util.Collection<Signer> items) {
        if (items == null) {
            this.items = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Signer> itemsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Signer>(items.size());
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

        if (obj instanceof ActiveTrustedSigners == false) return false;
        ActiveTrustedSigners other = (ActiveTrustedSigners)obj;
        
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getQuantity() == null ^ this.getQuantity() == null) return false;
        if (other.getQuantity() != null && other.getQuantity().equals(this.getQuantity()) == false) return false; 
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        return true;
    }
    
}
    