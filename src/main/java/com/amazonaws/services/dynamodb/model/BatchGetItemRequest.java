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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#batchGetItem(BatchGetItemRequest) BatchGetItem operation}.
 * <p>
 * Retrieves the attributes for multiple items from multiple tables using their primary keys.
 * </p>
 * <p>
 * The maximum number of item attributes that can be retrieved for a single operation is 100. Also, the number of items retrieved is constrained by a 1
 * MB the size limit. If the response size limit is exceeded or a partial result is returned due to an internal processing failure, Amazon DynamoDB
 * returns an <code>UnprocessedKeys</code> value so you can retry the operation starting with the next item to get.
 * </p>
 * <p>
 * Amazon DynamoDB automatically adjusts the number of items returned per page to enforce this limit. For example, even if you ask to retrieve 100 items,
 * but each individual item is 50k in size, the system returns 20 items and an appropriate <code>UnprocessedKeys</code> value so you can get the next
 * page of results. If necessary, your application needs its own logic to assemble the pages of results into one set.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#batchGetItem(BatchGetItemRequest)
 */
public class BatchGetItemRequest extends AmazonWebServiceRequest {

    /**
     * A map of the table name and corresponding items to get by primary key.
     * While requesting items, each table name can be invoked only once per
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private java.util.Map<String,KeysAndAttributes> requestItems;

    /**
     * A map of the table name and corresponding items to get by primary key.
     * While requesting items, each table name can be invoked only once per
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return A map of the table name and corresponding items to get by primary key.
     *         While requesting items, each table name can be invoked only once per
     *         operation.
     */
    public java.util.Map<String,KeysAndAttributes> getRequestItems() {
        
        return requestItems;
    }
    
    /**
     * A map of the table name and corresponding items to get by primary key.
     * While requesting items, each table name can be invoked only once per
     * operation.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems A map of the table name and corresponding items to get by primary key.
     *         While requesting items, each table name can be invoked only once per
     *         operation.
     */
    public void setRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
        this.requestItems = requestItems;
    }
    
    /**
     * A map of the table name and corresponding items to get by primary key.
     * While requesting items, each table name can be invoked only once per
     * operation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems A map of the table name and corresponding items to get by primary key.
     *         While requesting items, each table name can be invoked only once per
     *         operation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemRequest withRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
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
    
        if (obj instanceof BatchGetItemRequest == false) return false;
        BatchGetItemRequest other = (BatchGetItemRequest)obj;
        
        if (other.getRequestItems() == null ^ this.getRequestItems() == null) return false;
        if (other.getRequestItems() != null && other.getRequestItems().equals(this.getRequestItems()) == false) return false; 
        return true;
    }
    
}
    