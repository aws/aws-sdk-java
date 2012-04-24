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
 * <p>
 * A container for <code>BatchWriteItem</code> response
 * </p>
 */
public class BatchWriteItemResult {

    /**
     * The response object as a result of <code>BatchWriteItem</code> call.
     * This is essentially a map of table name to
     * <code>ConsumedCapacityUnits</code>.
     */
    private java.util.Map<String,BatchWriteResponse> responses;

    /**
     * The Items which we could not successfully process in a
     * <code>BatchWriteItem</code> call is returned as
     * <code>UnprocessedItems</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems;

    /**
     * The response object as a result of <code>BatchWriteItem</code> call.
     * This is essentially a map of table name to
     * <code>ConsumedCapacityUnits</code>.
     *
     * @return The response object as a result of <code>BatchWriteItem</code> call.
     *         This is essentially a map of table name to
     *         <code>ConsumedCapacityUnits</code>.
     */
    public java.util.Map<String,BatchWriteResponse> getResponses() {
        
        return responses;
    }
    
    /**
     * The response object as a result of <code>BatchWriteItem</code> call.
     * This is essentially a map of table name to
     * <code>ConsumedCapacityUnits</code>.
     *
     * @param responses The response object as a result of <code>BatchWriteItem</code> call.
     *         This is essentially a map of table name to
     *         <code>ConsumedCapacityUnits</code>.
     */
    public void setResponses(java.util.Map<String,BatchWriteResponse> responses) {
        this.responses = responses;
    }
    
    /**
     * The response object as a result of <code>BatchWriteItem</code> call.
     * This is essentially a map of table name to
     * <code>ConsumedCapacityUnits</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param responses The response object as a result of <code>BatchWriteItem</code> call.
     *         This is essentially a map of table name to
     *         <code>ConsumedCapacityUnits</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchWriteItemResult withResponses(java.util.Map<String,BatchWriteResponse> responses) {
        setResponses(responses);
        return this;
    }
    
    /**
     * The Items which we could not successfully process in a
     * <code>BatchWriteItem</code> call is returned as
     * <code>UnprocessedItems</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return The Items which we could not successfully process in a
     *         <code>BatchWriteItem</code> call is returned as
     *         <code>UnprocessedItems</code>
     */
    public java.util.Map<String,java.util.List<WriteRequest>> getUnprocessedItems() {
        
        return unprocessedItems;
    }
    
    /**
     * The Items which we could not successfully process in a
     * <code>BatchWriteItem</code> call is returned as
     * <code>UnprocessedItems</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param unprocessedItems The Items which we could not successfully process in a
     *         <code>BatchWriteItem</code> call is returned as
     *         <code>UnprocessedItems</code>
     */
    public void setUnprocessedItems(java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems) {
        this.unprocessedItems = unprocessedItems;
    }
    
    /**
     * The Items which we could not successfully process in a
     * <code>BatchWriteItem</code> call is returned as
     * <code>UnprocessedItems</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param unprocessedItems The Items which we could not successfully process in a
     *         <code>BatchWriteItem</code> call is returned as
     *         <code>UnprocessedItems</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchWriteItemResult withUnprocessedItems(java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems) {
        setUnprocessedItems(unprocessedItems);
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
        if (responses != null) sb.append("Responses: " + responses + ", ");
        if (unprocessedItems != null) sb.append("UnprocessedItems: " + unprocessedItems + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResponses() == null) ? 0 : getResponses().hashCode()); 
        hashCode = prime * hashCode + ((getUnprocessedItems() == null) ? 0 : getUnprocessedItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof BatchWriteItemResult == false) return false;
        BatchWriteItemResult other = (BatchWriteItemResult)obj;
        
        if (other.getResponses() == null ^ this.getResponses() == null) return false;
        if (other.getResponses() != null && other.getResponses().equals(this.getResponses()) == false) return false; 
        if (other.getUnprocessedItems() == null ^ this.getUnprocessedItems() == null) return false;
        if (other.getUnprocessedItems() != null && other.getUnprocessedItems().equals(this.getUnprocessedItems()) == false) return false; 
        return true;
    }
    
}
    