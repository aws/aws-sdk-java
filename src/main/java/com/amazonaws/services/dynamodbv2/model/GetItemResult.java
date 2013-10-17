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
 * Represents the output of a <i>GetItem</i> operation.
 * </p>
 */
public class GetItemResult implements Serializable {

    /**
     * A map of attribute names to <i>AttributeValue</i> objects, as
     * specified by <i>AttributesToGet</i>.
     */
    private java.util.Map<String,AttributeValue> item;

    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> in the Amazon DynamoDB Developer Guide.
     */
    private ConsumedCapacity consumedCapacity;

    /**
     * A map of attribute names to <i>AttributeValue</i> objects, as
     * specified by <i>AttributesToGet</i>.
     *
     * @return A map of attribute names to <i>AttributeValue</i> objects, as
     *         specified by <i>AttributesToGet</i>.
     */
    public java.util.Map<String,AttributeValue> getItem() {
        
        return item;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects, as
     * specified by <i>AttributesToGet</i>.
     *
     * @param item A map of attribute names to <i>AttributeValue</i> objects, as
     *         specified by <i>AttributesToGet</i>.
     */
    public void setItem(java.util.Map<String,AttributeValue> item) {
        this.item = item;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects, as
     * specified by <i>AttributesToGet</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param item A map of attribute names to <i>AttributeValue</i> objects, as
     *         specified by <i>AttributesToGet</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetItemResult withItem(java.util.Map<String,AttributeValue> item) {
        setItem(item);
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects, as
     * specified by <i>AttributesToGet</i>.
     * <p>
     * The method adds a new key-value pair into Item parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Item.
     * @param value The corresponding value of the entry to be added into Item.
     */
	public GetItemResult addItemEntry(String key, AttributeValue value) {
		if (null == this.item) {
			this.item = new java.util.HashMap<String,AttributeValue>();
		}
		if (this.item.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.item.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Item.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public GetItemResult clearItemEntries() {
		this.item = null;
		return this;
	}
	
    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return The table name that consumed provisioned throughput, and the number of
     *         capacity units consumed by it. <i>ConsumedCapacity</i> is only
     *         returned if it was asked for in the request. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     *         Throughput</a> in the Amazon DynamoDB Developer Guide.
     */
    public ConsumedCapacity getConsumedCapacity() {
        return consumedCapacity;
    }
    
    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> in the Amazon DynamoDB Developer Guide.
     *
     * @param consumedCapacity The table name that consumed provisioned throughput, and the number of
     *         capacity units consumed by it. <i>ConsumedCapacity</i> is only
     *         returned if it was asked for in the request. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     *         Throughput</a> in the Amazon DynamoDB Developer Guide.
     */
    public void setConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
    }
    
    /**
     * The table name that consumed provisioned throughput, and the number of
     * capacity units consumed by it. <i>ConsumedCapacity</i> is only
     * returned if it was asked for in the request. For more information, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     * Throughput</a> in the Amazon DynamoDB Developer Guide.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacity The table name that consumed provisioned throughput, and the number of
     *         capacity units consumed by it. <i>ConsumedCapacity</i> is only
     *         returned if it was asked for in the request. For more information, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ProvisionedThroughputIntro.html">Provisioned
     *         Throughput</a> in the Amazon DynamoDB Developer Guide.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetItemResult withConsumedCapacity(ConsumedCapacity consumedCapacity) {
        this.consumedCapacity = consumedCapacity;
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
        if (getItem() != null) sb.append("Item: " + getItem() + ",");
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetItemResult == false) return false;
        GetItemResult other = (GetItemResult)obj;
        
        if (other.getItem() == null ^ this.getItem() == null) return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    