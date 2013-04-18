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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchGetItem(BatchGetItemRequest) BatchGetItem operation}.
 * <p>
 * The <i>BatchGetItem</i> operation returns the attributes for multiple items from multiple tables using their primary keys. The maximum number of items
 * that can be retrieved for a single operation is 100. Also, the number of items retrieved is constrained by a 1 MB size limit. If the response size
 * limit is exceeded or a partial result is returned because the table???s provisioned throughput is exceeded, or because of an internal processing
 * failure, Amazon DynamoDB returns an <i>UnprocessedKeys</i> value so you can retry the operation starting with the next item to get. Amazon DynamoDB
 * automatically adjusts the number of items returned per page to enforce this limit. For example, even if you ask to retrieve 100 items, but each
 * individual item is 50 KB in size, the system returns 20 items and an appropriate <i>UnprocessedKeys</i> value so you can get the next page of results.
 * If desired, your application can include its own logic to assemble the pages of results into one set.
 * </p>
 * <p>
 * If no items could be processed because of insufficient provisioned throughput on each of the tables involved in the request, Amazon DynamoDB returns a
 * <i>ProvisionedThroughputExceededException</i> .
 * </p>
 * <p>
 * <b>NOTE:</b> By default, BatchGetItem performs eventually consistent reads on every table in the request. You can set ConsistentRead to true, on a
 * per-table basis, if you want consistent reads instead. BatchGetItem fetches items in parallel to minimize response latencies. When designing your
 * application, keep in mind that Amazon DynamoDB does not guarantee how attributes are ordered in the returned response. Include the primary key values
 * in the AttributesToGet for the items in your request to help parse the response by item. If the requested items do not exist, nothing is returned in
 * the response for those items. Requests for non-existent items consume the minimum read capacity units according to the type of read. For more
 * information, see Capacity Units Calculations of the Amazon DynamoDB Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchGetItem(BatchGetItemRequest)
 */
public class BatchGetItemRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. While requesting
     * items, each table name can be invoked only once per operation. <p>Each
     * <i>KeysAndAttributes</i> element consists of: <ul> <li>
     * <p><i>Keys</i>-An array of primary key attribute values that define
     * the items and the attributes associated with the items. </li> <li>
     * <p><i>AttributesToGet</i>-One or more attributes to retrieve from the
     * table or index. If <i>AttributesToGet</i> is not specified, then all
     * attributes will be returned. If any of the specified attributes are
     * not found, they will not appear in the result. </li> <li>
     * <p><i>ConsistentRead</i>-The consistency of a read operation. If set
     * to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private java.util.Map<String,KeysAndAttributes> requestItems;

    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. While requesting
     * items, each table name can be invoked only once per operation. <p>Each
     * <i>KeysAndAttributes</i> element consists of: <ul> <li>
     * <p><i>Keys</i>-An array of primary key attribute values that define
     * the items and the attributes associated with the items. </li> <li>
     * <p><i>AttributesToGet</i>-One or more attributes to retrieve from the
     * table or index. If <i>AttributesToGet</i> is not specified, then all
     * attributes will be returned. If any of the specified attributes are
     * not found, they will not appear in the result. </li> <li>
     * <p><i>ConsistentRead</i>-The consistency of a read operation. If set
     * to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return A map of one or more table names and, for each table, the
     *         corresponding primary keys for the items to retrieve. While requesting
     *         items, each table name can be invoked only once per operation. <p>Each
     *         <i>KeysAndAttributes</i> element consists of: <ul> <li>
     *         <p><i>Keys</i>-An array of primary key attribute values that define
     *         the items and the attributes associated with the items. </li> <li>
     *         <p><i>AttributesToGet</i>-One or more attributes to retrieve from the
     *         table or index. If <i>AttributesToGet</i> is not specified, then all
     *         attributes will be returned. If any of the specified attributes are
     *         not found, they will not appear in the result. </li> <li>
     *         <p><i>ConsistentRead</i>-The consistency of a read operation. If set
     *         to <code>true</code>, then a strongly consistent read is used;
     *         otherwise, an eventually consistent read is used. </li> </ul>
     */
    public java.util.Map<String,KeysAndAttributes> getRequestItems() {
        
        return requestItems;

    }
    
    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. While requesting
     * items, each table name can be invoked only once per operation. <p>Each
     * <i>KeysAndAttributes</i> element consists of: <ul> <li>
     * <p><i>Keys</i>-An array of primary key attribute values that define
     * the items and the attributes associated with the items. </li> <li>
     * <p><i>AttributesToGet</i>-One or more attributes to retrieve from the
     * table or index. If <i>AttributesToGet</i> is not specified, then all
     * attributes will be returned. If any of the specified attributes are
     * not found, they will not appear in the result. </li> <li>
     * <p><i>ConsistentRead</i>-The consistency of a read operation. If set
     * to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems A map of one or more table names and, for each table, the
     *         corresponding primary keys for the items to retrieve. While requesting
     *         items, each table name can be invoked only once per operation. <p>Each
     *         <i>KeysAndAttributes</i> element consists of: <ul> <li>
     *         <p><i>Keys</i>-An array of primary key attribute values that define
     *         the items and the attributes associated with the items. </li> <li>
     *         <p><i>AttributesToGet</i>-One or more attributes to retrieve from the
     *         table or index. If <i>AttributesToGet</i> is not specified, then all
     *         attributes will be returned. If any of the specified attributes are
     *         not found, they will not appear in the result. </li> <li>
     *         <p><i>ConsistentRead</i>-The consistency of a read operation. If set
     *         to <code>true</code>, then a strongly consistent read is used;
     *         otherwise, an eventually consistent read is used. </li> </ul>
     */
    public void setRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
        this.requestItems = requestItems;
    }
    
    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. While requesting
     * items, each table name can be invoked only once per operation. <p>Each
     * <i>KeysAndAttributes</i> element consists of: <ul> <li>
     * <p><i>Keys</i>-An array of primary key attribute values that define
     * the items and the attributes associated with the items. </li> <li>
     * <p><i>AttributesToGet</i>-One or more attributes to retrieve from the
     * table or index. If <i>AttributesToGet</i> is not specified, then all
     * attributes will be returned. If any of the specified attributes are
     * not found, they will not appear in the result. </li> <li>
     * <p><i>ConsistentRead</i>-The consistency of a read operation. If set
     * to <code>true</code>, then a strongly consistent read is used;
     * otherwise, an eventually consistent read is used. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems A map of one or more table names and, for each table, the
     *         corresponding primary keys for the items to retrieve. While requesting
     *         items, each table name can be invoked only once per operation. <p>Each
     *         <i>KeysAndAttributes</i> element consists of: <ul> <li>
     *         <p><i>Keys</i>-An array of primary key attribute values that define
     *         the items and the attributes associated with the items. </li> <li>
     *         <p><i>AttributesToGet</i>-One or more attributes to retrieve from the
     *         table or index. If <i>AttributesToGet</i> is not specified, then all
     *         attributes will be returned. If any of the specified attributes are
     *         not found, they will not appear in the result. </li> <li>
     *         <p><i>ConsistentRead</i>-The consistency of a read operation. If set
     *         to <code>true</code>, then a strongly consistent read is used;
     *         otherwise, an eventually consistent read is used. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchGetItemRequest withRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
        setRequestItems(requestItems);
        return this;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @return Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public BatchGetItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }
    
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * Determines whether to include consumed capacity information in the
     * output. If this is set to <code>TOTAL</code>, then this information is
     * shown in the output; otherwise, the consumed capacity information is
     * not shown.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity Determines whether to include consumed capacity information in the
     *         output. If this is set to <code>TOTAL</code>, then this information is
     *         shown in the output; otherwise, the consumed capacity information is
     *         not shown.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnConsumedCapacity
     */
    public BatchGetItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
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
        if (getRequestItems() != null) sb.append("RequestItems: " + getRequestItems() + ",");    	
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRequestItems() == null) ? 0 : getRequestItems().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
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
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    