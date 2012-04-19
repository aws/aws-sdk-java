/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.model;

/**
 * Query Result
 */
public class QueryResult {

    private java.util.List<java.util.Map<String,AttributeValue>> items;

    /**
     * Number of items in the response.
     */
    private Integer count;

    /**
     * Primary key of the item where the query operation stopped, inclusive
     * of the previous result set. Use this value to start a new operation
     * excluding this value in the new request. The
     * <code>LastEvaluatedKey</code> is null when the entire query result set
     * is complete (i.e. the operation processed the "last page").
     */
    private Key lastEvaluatedKey;

    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. <code>GetItem</code>,
     * <code>BatchGetItem</code>, <code>BatchWriteItem</code>,
     * <code>Query</code>, and <code>Scan</code> operations consume
     * <code>ReadCapacityUnits</code>, while <code>PutItem</code>,
     * <code>UpdateItem</code>, and <code>DeleteItem</code> operations
     * consume <code>WriteCapacityUnits</code>.
     */
    private Double consumedCapacityUnits;

    /**
     * Returns the value of the Items property for this object.
     *
     * @return The value of the Items property for this object.
     */
    public java.util.List<java.util.Map<String,AttributeValue>> getItems() {
        
        return items;
    }
    
    /**
     * Sets the value of the Items property for this object.
     *
     * @param items The new value for the Items property for this object.
     */
    public void setItems(java.util.Collection<java.util.Map<String,AttributeValue>> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        java.util.List<java.util.Map<String,AttributeValue>> itemsCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.size());
        itemsCopy.addAll(items);
        this.items = itemsCopy;
    }
    
    /**
     * Sets the value of the Items property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items The new value for the Items property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withItems(java.util.Map<String,AttributeValue>... items) {
        if (getItems() == null) setItems(new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.length));
        for (java.util.Map<String,AttributeValue> value : items) {
            getItems().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Items property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param items The new value for the Items property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withItems(java.util.Collection<java.util.Map<String,AttributeValue>> items) {
        if (items == null) {
            this.items = null;
        } else {
            java.util.List<java.util.Map<String,AttributeValue>> itemsCopy = new java.util.ArrayList<java.util.Map<String,AttributeValue>>(items.size());
            itemsCopy.addAll(items);
            this.items = itemsCopy;
        }

        return this;
    }
    
    /**
     * Number of items in the response.
     *
     * @return Number of items in the response.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * Number of items in the response.
     *
     * @param count Number of items in the response.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * Number of items in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count Number of items in the response.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withCount(Integer count) {
        this.count = count;
        return this;
    }
    
    
    /**
     * Primary key of the item where the query operation stopped, inclusive
     * of the previous result set. Use this value to start a new operation
     * excluding this value in the new request. The
     * <code>LastEvaluatedKey</code> is null when the entire query result set
     * is complete (i.e. the operation processed the "last page").
     *
     * @return Primary key of the item where the query operation stopped, inclusive
     *         of the previous result set. Use this value to start a new operation
     *         excluding this value in the new request. The
     *         <code>LastEvaluatedKey</code> is null when the entire query result set
     *         is complete (i.e. the operation processed the "last page").
     */
    public Key getLastEvaluatedKey() {
        return lastEvaluatedKey;
    }
    
    /**
     * Primary key of the item where the query operation stopped, inclusive
     * of the previous result set. Use this value to start a new operation
     * excluding this value in the new request. The
     * <code>LastEvaluatedKey</code> is null when the entire query result set
     * is complete (i.e. the operation processed the "last page").
     *
     * @param lastEvaluatedKey Primary key of the item where the query operation stopped, inclusive
     *         of the previous result set. Use this value to start a new operation
     *         excluding this value in the new request. The
     *         <code>LastEvaluatedKey</code> is null when the entire query result set
     *         is complete (i.e. the operation processed the "last page").
     */
    public void setLastEvaluatedKey(Key lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
    }
    
    /**
     * Primary key of the item where the query operation stopped, inclusive
     * of the previous result set. Use this value to start a new operation
     * excluding this value in the new request. The
     * <code>LastEvaluatedKey</code> is null when the entire query result set
     * is complete (i.e. the operation processed the "last page").
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastEvaluatedKey Primary key of the item where the query operation stopped, inclusive
     *         of the previous result set. Use this value to start a new operation
     *         excluding this value in the new request. The
     *         <code>LastEvaluatedKey</code> is null when the entire query result set
     *         is complete (i.e. the operation processed the "last page").
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withLastEvaluatedKey(Key lastEvaluatedKey) {
        this.lastEvaluatedKey = lastEvaluatedKey;
        return this;
    }
    
    
    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. <code>GetItem</code>,
     * <code>BatchGetItem</code>, <code>BatchWriteItem</code>,
     * <code>Query</code>, and <code>Scan</code> operations consume
     * <code>ReadCapacityUnits</code>, while <code>PutItem</code>,
     * <code>UpdateItem</code>, and <code>DeleteItem</code> operations
     * consume <code>WriteCapacityUnits</code>.
     *
     * @return The number of Capacity Units of the provisioned throughput of the
     *         table consumed during the operation. <code>GetItem</code>,
     *         <code>BatchGetItem</code>, <code>BatchWriteItem</code>,
     *         <code>Query</code>, and <code>Scan</code> operations consume
     *         <code>ReadCapacityUnits</code>, while <code>PutItem</code>,
     *         <code>UpdateItem</code>, and <code>DeleteItem</code> operations
     *         consume <code>WriteCapacityUnits</code>.
     */
    public Double getConsumedCapacityUnits() {
        return consumedCapacityUnits;
    }
    
    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. <code>GetItem</code>,
     * <code>BatchGetItem</code>, <code>BatchWriteItem</code>,
     * <code>Query</code>, and <code>Scan</code> operations consume
     * <code>ReadCapacityUnits</code>, while <code>PutItem</code>,
     * <code>UpdateItem</code>, and <code>DeleteItem</code> operations
     * consume <code>WriteCapacityUnits</code>.
     *
     * @param consumedCapacityUnits The number of Capacity Units of the provisioned throughput of the
     *         table consumed during the operation. <code>GetItem</code>,
     *         <code>BatchGetItem</code>, <code>BatchWriteItem</code>,
     *         <code>Query</code>, and <code>Scan</code> operations consume
     *         <code>ReadCapacityUnits</code>, while <code>PutItem</code>,
     *         <code>UpdateItem</code>, and <code>DeleteItem</code> operations
     *         consume <code>WriteCapacityUnits</code>.
     */
    public void setConsumedCapacityUnits(Double consumedCapacityUnits) {
        this.consumedCapacityUnits = consumedCapacityUnits;
    }
    
    /**
     * The number of Capacity Units of the provisioned throughput of the
     * table consumed during the operation. <code>GetItem</code>,
     * <code>BatchGetItem</code>, <code>BatchWriteItem</code>,
     * <code>Query</code>, and <code>Scan</code> operations consume
     * <code>ReadCapacityUnits</code>, while <code>PutItem</code>,
     * <code>UpdateItem</code>, and <code>DeleteItem</code> operations
     * consume <code>WriteCapacityUnits</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacityUnits The number of Capacity Units of the provisioned throughput of the
     *         table consumed during the operation. <code>GetItem</code>,
     *         <code>BatchGetItem</code>, <code>BatchWriteItem</code>,
     *         <code>Query</code>, and <code>Scan</code> operations consume
     *         <code>ReadCapacityUnits</code>, while <code>PutItem</code>,
     *         <code>UpdateItem</code>, and <code>DeleteItem</code> operations
     *         consume <code>WriteCapacityUnits</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryResult withConsumedCapacityUnits(Double consumedCapacityUnits) {
        this.consumedCapacityUnits = consumedCapacityUnits;
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
        if (items != null) sb.append("Items: " + items + ", ");
        if (count != null) sb.append("Count: " + count + ", ");
        if (lastEvaluatedKey != null) sb.append("LastEvaluatedKey: " + lastEvaluatedKey + ", ");
        if (consumedCapacityUnits != null) sb.append("ConsumedCapacityUnits: " + consumedCapacityUnits + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        hashCode = prime * hashCode + ((getLastEvaluatedKey() == null) ? 0 : getLastEvaluatedKey().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacityUnits() == null) ? 0 : getConsumedCapacityUnits().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof QueryResult == false) return false;
        QueryResult other = (QueryResult)obj;
        
        if (other.getItems() == null ^ this.getItems() == null) return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getLastEvaluatedKey() == null ^ this.getLastEvaluatedKey() == null) return false;
        if (other.getLastEvaluatedKey() != null && other.getLastEvaluatedKey().equals(this.getLastEvaluatedKey()) == false) return false; 
        if (other.getConsumedCapacityUnits() == null ^ this.getConsumedCapacityUnits() == null) return false;
        if (other.getConsumedCapacityUnits() != null && other.getConsumedCapacityUnits().equals(this.getConsumedCapacityUnits()) == false) return false; 
        return true;
    }
    
}
    