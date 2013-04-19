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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest) BatchWriteItem operation}.
 * <p>
 * This operation enables you to put or delete several items across multiple tables in a single API call.
 * </p>
 * <p>
 * To upload one item, you can use the <i>PutItem</i> API and to delete one item, you can use the <i>DeleteItem</i> API. However, when you want to upload
 * or delete large amounts of data, such as uploading large amounts of data from Amazon Elastic MapReduce (EMR) or migrate data from another database
 * into Amazon DynamoDB, this API offers an efficient alternative.
 * </p>
 * <p>
 * If you use a programming language that supports concurrency, such as Java, you can use threads to upload items in parallel. This adds complexity in
 * your application to handle the threads. With other languages that don't support threading, such as PHP, you must upload or delete items one at a time.
 * In both situations, the <i>BatchWriteItem</i> API provides an alternative where the API performs the specified put and delete operations in parallel,
 * giving you the power of the thread pool approach without having to introduce complexity in your application.
 * </p>
 * <p>
 * Note that each individual put and delete specified in a <i>BatchWriteItem</i> operation costs the same in terms of consumed capacity units, however,
 * the API performs the specified operations in parallel giving you lower latency. Delete operations on non-existent items consume 1 write capacity unit.
 * </p>
 * <p>
 * When using this API, note the following limitations:
 * </p>
 * 
 * <ul>
 * <li> <p>
 * <i>Maximum operations in a single request-</i> You can specify a total of up to 25 put or delete operations; however, the total request size cannot
 * exceed 1 MB (the HTTP payload).
 * </p>
 * </li>
 * <li> <p>
 * You can use the <i>BatchWriteItem</i> operation only to put and delete items. You cannot use it to update existing items.
 * </p>
 * </li>
 * <li> <p>
 * <i>Not an atomic operation-</i> The individual <i>PutItem</i> and <i>DeleteItem</i> operations specified in <i>BatchWriteItem</i> are atomic; however
 * <i>BatchWriteItem</i> as a whole is a "best-effort" operation and not an atomic operation. That is, in a <i>BatchWriteItem</i> request, some
 * operations might succeed and others might fail. The failed operations are returned in <i>UnprocessedItems</i> in the response. Some of these failures
 * might be because you exceeded the provisioned throughput configured for the table or a transient failure such as a network error. You can investigate
 * and optionally resend the requests. Typically, you call <i>BatchWriteItem</i> in a loop and in each iteration check for unprocessed items, and submit
 * a new <i>BatchWriteItem</i> request with those unprocessed items.
 * </p>
 * </li>
 * <li> <p>
 * <i>Does not return any items-</i> The <i>BatchWriteItem</i> is designed for uploading large amounts of data efficiently. It does not provide some of
 * the sophistication offered by APIs such as <i>PutItem</i> and <i>DeleteItem</i> . For example, the <i>DeleteItem</i> API supports <i>ReturnValues</i>
 * in the request body to request the deleted item in the response. The <i>BatchWriteItem</i> operation does not return any items in the response.
 * </p>
 * </li>
 * <li> <p>
 * Unlike the <i>PutItem</i> and <i>DeleteItem</i> APIs, <i>BatchWriteItem</i> does not allow you to specify conditions on individual write requests in
 * the operation.
 * </p>
 * </li>
 * <li> <p>
 * Attribute values must not be null; string and binary type attributes must have lengths greater than zero; and set type attributes must not be empty.
 * Requests that have empty values will be rejected with a <i>ValidationException</i> .
 * </p>
 * </li>
 * 
 * </ul>
 * <p>
 * Amazon DynamoDB rejects the entire batch write operation if any one of the following is true:
 * <ul>
 * <li> <p>
 * If one or more tables specified in the <i>BatchWriteItem</i> request does not exist.
 * </p>
 * </li>
 * <li> <p>
 * If primary key attributes specified on an item in the request does not match the corresponding table's primary key schema.
 * </p>
 * </li>
 * <li> <p>
 * If you try to perform multiple operations on the same item in the same <i>BatchWriteItem</i> request. For example, you cannot put and delete the same
 * item in the same <i>BatchWriteItem</i> request.
 * </p>
 * </li>
 * <li> <p>
 * If the total request size exceeds the 1 MB request size (the HTTP payload) limit.
 * </p>
 * </li>
 * <li> <p>
 * If any individual item in a batch exceeds the 64 KB item size limit.
 * </p>
 * </li>
 * 
 * </ul>
 * 
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchWriteItem(BatchWriteItemRequest)
 */
public class BatchWriteItemRequest extends AmazonWebServiceRequest  implements Serializable  {

    /**
     * A map of one or more table names and, for each table, a list of
     * operations to perform (<i>DeleteRequest</i> or <i>PutRequest</i>).
     * <ul> <li> <p><i>DeleteRequest</i>-Perform a <i>DeleteItem</i>
     * operation on the specified item. The item to be deleted is identified
     * by: <ul> <li> <p><i>Key</i>-A map of primary key attribute values that
     * uniquely identify the item. Each entry in this map consists of an
     * attribute name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i>-Perform a <i>PutItem</i> operation on the
     * specified item. The item to be updated is identified by: <ul>
     * <li><p><i>Item</i>-A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. <p>If
     * you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.</li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private java.util.Map<String,java.util.List<WriteRequest>> requestItems;

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
     * Indicates whether to return statistics about item collections, if any,
     * that were modified during the operation. The default for
     * <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     * no statistics will be returned. To obtain the statistics, set
     * <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     */
    private String returnItemCollectionMetrics;

    /**
     * A map of one or more table names and, for each table, a list of
     * operations to perform (<i>DeleteRequest</i> or <i>PutRequest</i>).
     * <ul> <li> <p><i>DeleteRequest</i>-Perform a <i>DeleteItem</i>
     * operation on the specified item. The item to be deleted is identified
     * by: <ul> <li> <p><i>Key</i>-A map of primary key attribute values that
     * uniquely identify the item. Each entry in this map consists of an
     * attribute name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i>-Perform a <i>PutItem</i> operation on the
     * specified item. The item to be updated is identified by: <ul>
     * <li><p><i>Item</i>-A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. <p>If
     * you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.</li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return A map of one or more table names and, for each table, a list of
     *         operations to perform (<i>DeleteRequest</i> or <i>PutRequest</i>).
     *         <ul> <li> <p><i>DeleteRequest</i>-Perform a <i>DeleteItem</i>
     *         operation on the specified item. The item to be deleted is identified
     *         by: <ul> <li> <p><i>Key</i>-A map of primary key attribute values that
     *         uniquely identify the item. Each entry in this map consists of an
     *         attribute name and an attribute value. </li> </ul> </li> <li>
     *         <p><i>PutRequest</i>-Perform a <i>PutItem</i> operation on the
     *         specified item. The item to be updated is identified by: <ul>
     *         <li><p><i>Item</i>-A map of attributes and their values. Each entry in
     *         this map consists of an attribute name and an attribute value. <p>If
     *         you specify any attributes that are part of an index key, then the
     *         data types for those attributes must match those of the schema in the
     *         table's attribute definition.</li> </ul> </li> </ul>
     */
    public java.util.Map<String,java.util.List<WriteRequest>> getRequestItems() {
        
        return requestItems;

    }
    
    /**
     * A map of one or more table names and, for each table, a list of
     * operations to perform (<i>DeleteRequest</i> or <i>PutRequest</i>).
     * <ul> <li> <p><i>DeleteRequest</i>-Perform a <i>DeleteItem</i>
     * operation on the specified item. The item to be deleted is identified
     * by: <ul> <li> <p><i>Key</i>-A map of primary key attribute values that
     * uniquely identify the item. Each entry in this map consists of an
     * attribute name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i>-Perform a <i>PutItem</i> operation on the
     * specified item. The item to be updated is identified by: <ul>
     * <li><p><i>Item</i>-A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. <p>If
     * you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.</li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param requestItems A map of one or more table names and, for each table, a list of
     *         operations to perform (<i>DeleteRequest</i> or <i>PutRequest</i>).
     *         <ul> <li> <p><i>DeleteRequest</i>-Perform a <i>DeleteItem</i>
     *         operation on the specified item. The item to be deleted is identified
     *         by: <ul> <li> <p><i>Key</i>-A map of primary key attribute values that
     *         uniquely identify the item. Each entry in this map consists of an
     *         attribute name and an attribute value. </li> </ul> </li> <li>
     *         <p><i>PutRequest</i>-Perform a <i>PutItem</i> operation on the
     *         specified item. The item to be updated is identified by: <ul>
     *         <li><p><i>Item</i>-A map of attributes and their values. Each entry in
     *         this map consists of an attribute name and an attribute value. <p>If
     *         you specify any attributes that are part of an index key, then the
     *         data types for those attributes must match those of the schema in the
     *         table's attribute definition.</li> </ul> </li> </ul>
     */
    public void setRequestItems(java.util.Map<String,java.util.List<WriteRequest>> requestItems) {
        this.requestItems = requestItems;
    }
    
    /**
     * A map of one or more table names and, for each table, a list of
     * operations to perform (<i>DeleteRequest</i> or <i>PutRequest</i>).
     * <ul> <li> <p><i>DeleteRequest</i>-Perform a <i>DeleteItem</i>
     * operation on the specified item. The item to be deleted is identified
     * by: <ul> <li> <p><i>Key</i>-A map of primary key attribute values that
     * uniquely identify the item. Each entry in this map consists of an
     * attribute name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i>-Perform a <i>PutItem</i> operation on the
     * specified item. The item to be updated is identified by: <ul>
     * <li><p><i>Item</i>-A map of attributes and their values. Each entry in
     * this map consists of an attribute name and an attribute value. <p>If
     * you specify any attributes that are part of an index key, then the
     * data types for those attributes must match those of the schema in the
     * table's attribute definition.</li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param requestItems A map of one or more table names and, for each table, a list of
     *         operations to perform (<i>DeleteRequest</i> or <i>PutRequest</i>).
     *         <ul> <li> <p><i>DeleteRequest</i>-Perform a <i>DeleteItem</i>
     *         operation on the specified item. The item to be deleted is identified
     *         by: <ul> <li> <p><i>Key</i>-A map of primary key attribute values that
     *         uniquely identify the item. Each entry in this map consists of an
     *         attribute name and an attribute value. </li> </ul> </li> <li>
     *         <p><i>PutRequest</i>-Perform a <i>PutItem</i> operation on the
     *         specified item. The item to be updated is identified by: <ul>
     *         <li><p><i>Item</i>-A map of attributes and their values. Each entry in
     *         this map consists of an attribute name and an attribute value. <p>If
     *         you specify any attributes that are part of an index key, then the
     *         data types for those attributes must match those of the schema in the
     *         table's attribute definition.</li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public BatchWriteItemRequest withRequestItems(java.util.Map<String,java.util.List<WriteRequest>> requestItems) {
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
    public BatchWriteItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public BatchWriteItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }
    
    /**
     * Indicates whether to return statistics about item collections, if any,
     * that were modified during the operation. The default for
     * <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     * no statistics will be returned. To obtain the statistics, set
     * <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @return Indicates whether to return statistics about item collections, if any,
     *         that were modified during the operation. The default for
     *         <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     *         no statistics will be returned. To obtain the statistics, set
     *         <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     *
     * @see ReturnItemCollectionMetrics
     */
    public String getReturnItemCollectionMetrics() {
        return returnItemCollectionMetrics;
    }
    
    /**
     * Indicates whether to return statistics about item collections, if any,
     * that were modified during the operation. The default for
     * <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     * no statistics will be returned. To obtain the statistics, set
     * <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics Indicates whether to return statistics about item collections, if any,
     *         that were modified during the operation. The default for
     *         <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     *         no statistics will be returned. To obtain the statistics, set
     *         <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }
    
    /**
     * Indicates whether to return statistics about item collections, if any,
     * that were modified during the operation. The default for
     * <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     * no statistics will be returned. To obtain the statistics, set
     * <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics Indicates whether to return statistics about item collections, if any,
     *         that were modified during the operation. The default for
     *         <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     *         no statistics will be returned. To obtain the statistics, set
     *         <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnItemCollectionMetrics
     */
    public BatchWriteItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
        return this;
    }
    
    
    /**
     * Indicates whether to return statistics about item collections, if any,
     * that were modified during the operation. The default for
     * <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     * no statistics will be returned. To obtain the statistics, set
     * <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics Indicates whether to return statistics about item collections, if any,
     *         that were modified during the operation. The default for
     *         <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     *         no statistics will be returned. To obtain the statistics, set
     *         <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }
    
    /**
     * Indicates whether to return statistics about item collections, if any,
     * that were modified during the operation. The default for
     * <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     * no statistics will be returned. To obtain the statistics, set
     * <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics Indicates whether to return statistics about item collections, if any,
     *         that were modified during the operation. The default for
     *         <i>ReturnItemCollectionMetrics</i> is <code>NONE</code>, meaning that
     *         no statistics will be returned. To obtain the statistics, set
     *         <i>ReturnItemCollectionMetrics</i> to <code>SIZE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ReturnItemCollectionMetrics
     */
    public BatchWriteItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
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
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");    	
        if (getReturnItemCollectionMetrics() != null) sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRequestItems() == null) ? 0 : getRequestItems().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getReturnItemCollectionMetrics() == null) ? 0 : getReturnItemCollectionMetrics().hashCode()); 
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
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null) return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false) return false; 
        return true;
    }
    
}
    