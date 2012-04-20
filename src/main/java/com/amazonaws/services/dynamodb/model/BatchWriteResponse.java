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
 * Batch Write Response
 */
public class BatchWriteResponse {

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
    public BatchWriteResponse withConsumedCapacityUnits(Double consumedCapacityUnits) {
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
        if (consumedCapacityUnits != null) sb.append("ConsumedCapacityUnits: " + consumedCapacityUnits + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConsumedCapacityUnits() == null) ? 0 : getConsumedCapacityUnits().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof BatchWriteResponse == false) return false;
        BatchWriteResponse other = (BatchWriteResponse)obj;
        
        if (other.getConsumedCapacityUnits() == null ^ this.getConsumedCapacityUnits() == null) return false;
        if (other.getConsumedCapacityUnits() != null && other.getConsumedCapacityUnits().equals(this.getConsumedCapacityUnits()) == false) return false; 
        return true;
    }
    
}
    