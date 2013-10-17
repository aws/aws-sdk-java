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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;


/**
 * <p>
 * Information about item collections, if any, that were affected by the operation. <i>ItemCollectionMetrics</i> is only returned if it was asked for in
 * the request. If the table does not have any secondary indexes, this information is not returned in the response.
 * </p>
 */
public class ItemCollectionMetrics implements Serializable {

    /**
     * The hash key value of the item collection. This is the same as the
     * hash key of the item.
     */
    private java.util.Map<String,AttributeValue> itemCollectionKey;

    /**
     * An estimate of item collection size, measured in gigabytes. This is a
     * two-element array containing a lower bound and an upper bound for the
     * estimate. The estimate includes the size of all the items in the
     * table, plus the size of all attributes projected into all of the
     * secondary indexes on that table. Use this estimate to measure whether
     * a secondary index is approaching its size limit. <p>The estimate is
     * subject to change over time; therefore, do not rely on the precision
     * or accuracy of the estimate.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Double> sizeEstimateRangeGB;

    /**
     * The hash key value of the item collection. This is the same as the
     * hash key of the item.
     *
     * @return The hash key value of the item collection. This is the same as the
     *         hash key of the item.
     */
    public java.util.Map<String,AttributeValue> getItemCollectionKey() {
        
        return itemCollectionKey;
    }
    
    /**
     * The hash key value of the item collection. This is the same as the
     * hash key of the item.
     *
     * @param itemCollectionKey The hash key value of the item collection. This is the same as the
     *         hash key of the item.
     */
    public void setItemCollectionKey(java.util.Map<String,AttributeValue> itemCollectionKey) {
        this.itemCollectionKey = itemCollectionKey;
    }
    
    /**
     * The hash key value of the item collection. This is the same as the
     * hash key of the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCollectionKey The hash key value of the item collection. This is the same as the
     *         hash key of the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ItemCollectionMetrics withItemCollectionKey(java.util.Map<String,AttributeValue> itemCollectionKey) {
        setItemCollectionKey(itemCollectionKey);
        return this;
    }

    /**
     * The hash key value of the item collection. This is the same as the
     * hash key of the item.
     * <p>
     * The method adds a new key-value pair into ItemCollectionKey parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into ItemCollectionKey.
     * @param value The corresponding value of the entry to be added into ItemCollectionKey.
     */
	public ItemCollectionMetrics addItemCollectionKeyEntry(String key, AttributeValue value) {
		if (null == this.itemCollectionKey) {
			this.itemCollectionKey = new java.util.HashMap<String,AttributeValue>();
		}
		if (this.itemCollectionKey.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.itemCollectionKey.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into ItemCollectionKey.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public ItemCollectionMetrics clearItemCollectionKeyEntries() {
		this.itemCollectionKey = null;
		return this;
	}
	
    /**
     * An estimate of item collection size, measured in gigabytes. This is a
     * two-element array containing a lower bound and an upper bound for the
     * estimate. The estimate includes the size of all the items in the
     * table, plus the size of all attributes projected into all of the
     * secondary indexes on that table. Use this estimate to measure whether
     * a secondary index is approaching its size limit. <p>The estimate is
     * subject to change over time; therefore, do not rely on the precision
     * or accuracy of the estimate.
     *
     * @return An estimate of item collection size, measured in gigabytes. This is a
     *         two-element array containing a lower bound and an upper bound for the
     *         estimate. The estimate includes the size of all the items in the
     *         table, plus the size of all attributes projected into all of the
     *         secondary indexes on that table. Use this estimate to measure whether
     *         a secondary index is approaching its size limit. <p>The estimate is
     *         subject to change over time; therefore, do not rely on the precision
     *         or accuracy of the estimate.
     */
    public java.util.List<Double> getSizeEstimateRangeGB() {
        return sizeEstimateRangeGB;
    }
    
    /**
     * An estimate of item collection size, measured in gigabytes. This is a
     * two-element array containing a lower bound and an upper bound for the
     * estimate. The estimate includes the size of all the items in the
     * table, plus the size of all attributes projected into all of the
     * secondary indexes on that table. Use this estimate to measure whether
     * a secondary index is approaching its size limit. <p>The estimate is
     * subject to change over time; therefore, do not rely on the precision
     * or accuracy of the estimate.
     *
     * @param sizeEstimateRangeGB An estimate of item collection size, measured in gigabytes. This is a
     *         two-element array containing a lower bound and an upper bound for the
     *         estimate. The estimate includes the size of all the items in the
     *         table, plus the size of all attributes projected into all of the
     *         secondary indexes on that table. Use this estimate to measure whether
     *         a secondary index is approaching its size limit. <p>The estimate is
     *         subject to change over time; therefore, do not rely on the precision
     *         or accuracy of the estimate.
     */
    public void setSizeEstimateRangeGB(java.util.Collection<Double> sizeEstimateRangeGB) {
        if (sizeEstimateRangeGB == null) {
            this.sizeEstimateRangeGB = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Double> sizeEstimateRangeGBCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Double>(sizeEstimateRangeGB.size());
        sizeEstimateRangeGBCopy.addAll(sizeEstimateRangeGB);
        this.sizeEstimateRangeGB = sizeEstimateRangeGBCopy;
    }
    
    /**
     * An estimate of item collection size, measured in gigabytes. This is a
     * two-element array containing a lower bound and an upper bound for the
     * estimate. The estimate includes the size of all the items in the
     * table, plus the size of all attributes projected into all of the
     * secondary indexes on that table. Use this estimate to measure whether
     * a secondary index is approaching its size limit. <p>The estimate is
     * subject to change over time; therefore, do not rely on the precision
     * or accuracy of the estimate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sizeEstimateRangeGB An estimate of item collection size, measured in gigabytes. This is a
     *         two-element array containing a lower bound and an upper bound for the
     *         estimate. The estimate includes the size of all the items in the
     *         table, plus the size of all attributes projected into all of the
     *         secondary indexes on that table. Use this estimate to measure whether
     *         a secondary index is approaching its size limit. <p>The estimate is
     *         subject to change over time; therefore, do not rely on the precision
     *         or accuracy of the estimate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ItemCollectionMetrics withSizeEstimateRangeGB(Double... sizeEstimateRangeGB) {
        if (getSizeEstimateRangeGB() == null) setSizeEstimateRangeGB(new java.util.ArrayList<Double>(sizeEstimateRangeGB.length));
        for (Double value : sizeEstimateRangeGB) {
            getSizeEstimateRangeGB().add(value);
        }
        return this;
    }
    
    /**
     * An estimate of item collection size, measured in gigabytes. This is a
     * two-element array containing a lower bound and an upper bound for the
     * estimate. The estimate includes the size of all the items in the
     * table, plus the size of all attributes projected into all of the
     * secondary indexes on that table. Use this estimate to measure whether
     * a secondary index is approaching its size limit. <p>The estimate is
     * subject to change over time; therefore, do not rely on the precision
     * or accuracy of the estimate.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sizeEstimateRangeGB An estimate of item collection size, measured in gigabytes. This is a
     *         two-element array containing a lower bound and an upper bound for the
     *         estimate. The estimate includes the size of all the items in the
     *         table, plus the size of all attributes projected into all of the
     *         secondary indexes on that table. Use this estimate to measure whether
     *         a secondary index is approaching its size limit. <p>The estimate is
     *         subject to change over time; therefore, do not rely on the precision
     *         or accuracy of the estimate.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ItemCollectionMetrics withSizeEstimateRangeGB(java.util.Collection<Double> sizeEstimateRangeGB) {
        if (sizeEstimateRangeGB == null) {
            this.sizeEstimateRangeGB = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Double> sizeEstimateRangeGBCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Double>(sizeEstimateRangeGB.size());
            sizeEstimateRangeGBCopy.addAll(sizeEstimateRangeGB);
            this.sizeEstimateRangeGB = sizeEstimateRangeGBCopy;
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
        if (getItemCollectionKey() != null) sb.append("ItemCollectionKey: " + getItemCollectionKey() + ",");
        if (getSizeEstimateRangeGB() != null) sb.append("SizeEstimateRangeGB: " + getSizeEstimateRangeGB() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getItemCollectionKey() == null) ? 0 : getItemCollectionKey().hashCode()); 
        hashCode = prime * hashCode + ((getSizeEstimateRangeGB() == null) ? 0 : getSizeEstimateRangeGB().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ItemCollectionMetrics == false) return false;
        ItemCollectionMetrics other = (ItemCollectionMetrics)obj;
        
        if (other.getItemCollectionKey() == null ^ this.getItemCollectionKey() == null) return false;
        if (other.getItemCollectionKey() != null && other.getItemCollectionKey().equals(this.getItemCollectionKey()) == false) return false; 
        if (other.getSizeEstimateRangeGB() == null ^ this.getSizeEstimateRangeGB() == null) return false;
        if (other.getSizeEstimateRangeGB() != null && other.getSizeEstimateRangeGB().equals(this.getSizeEstimateRangeGB()) == false) return false; 
        return true;
    }
    
}
    