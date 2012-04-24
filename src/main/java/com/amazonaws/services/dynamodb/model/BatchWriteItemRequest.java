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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest) BatchWriteItem operation}.
 * <p>
 * Allows to execute a batch of Put and/or Delete Requests for many
 * tables in a single call. A total of 25 requests are allowed.
 * </p>
 * <p>
 * There are no transaction guarantees provided by this API. It does not
 * allow conditional puts nor does it support return values.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)
 */
public class BatchWriteItemRequest extends AmazonWebServiceRequest {

    /**
     * A map of table name to list-of-write-requests. Used as input to the
     * <code>BatchWriteItem</code> API call
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private java.util.Map<String,java.util.List<WriteRequest>> requestItems;

    /**
     * A map of table name to list-of-write-requests. Used as input to the
     * <code>BatchWriteItem</code> API call
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return A map of table name to list-of-write-requests. Used as input to the
     *         <code>BatchWriteItem</code> API call
     */
    public java.util.Map<String,java.util.List<WriteRequest>> getRequestItems() {
        
        return requestItems;
    }
    
    /**
     * A map of table name to list-of-write-requests. Used as input to the
     * <code>BatchWriteItem</code> API call
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param requestItems A map of table name to list-of-write-requests. Used as input to the
     *         <code>BatchWriteItem</code> API call
     */
    public void setRequestItems(java.util.Map<String,java.util.List<WriteRequest>> requestItems) {
        this.requestItems = requestItems;
    }
    
    /**
     * A map of table name to list-of-write-requests. Used as input to the
     * <code>BatchWriteItem</code> API call
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param requestItems A map of table name to list-of-write-requests. Used as input to the
     *         <code>BatchWriteItem</code> API call
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchWriteItemRequest withRequestItems(java.util.Map<String,java.util.List<WriteRequest>> requestItems) {
        setRequestItems(requestItems);
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
        if (requestItems != null) sb.append("RequestItems: " + requestItems + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRequestItems() == null) ? 0 : getRequestItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof BatchWriteItemRequest == false) return false;
        BatchWriteItemRequest other = (BatchWriteItemRequest)obj;
        
        if (other.getRequestItems() == null ^ this.getRequestItems() == null) return false;
        if (other.getRequestItems() != null && other.getRequestItems().equals(this.getRequestItems()) == false) return false; 
        return true;
    }
    
}
    