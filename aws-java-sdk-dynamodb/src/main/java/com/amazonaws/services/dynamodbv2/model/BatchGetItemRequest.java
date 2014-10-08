/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchGetItem(BatchGetItemRequest) BatchGetItem operation}.
 * <p>
 * The <i>BatchGetItem</i> operation returns the attributes of one or
 * more items from one or more tables. You identify requested items by
 * primary key.
 * </p>
 * <p>
 * A single operation can retrieve up to 16 MB of data, which can contain
 * as many as 100 items. <i>BatchGetItem</i> will return a partial result
 * if the response size limit is exceeded, the table's provisioned
 * throughput is exceeded, or an internal processing failure occurs. If a
 * partial result is returned, the operation returns a value for
 * <i>UnprocessedKeys</i> . You can use this value to retry the operation
 * starting with the next item to get.
 * </p>
 * <p>
 * For example, if you ask to retrieve 100 items, but each individual
 * item is 300 KB in size, the system returns 52 items (so as not to
 * exceed the 16 MB limit). It also returns an appropriate
 * <i>UnprocessedKeys</i> value so you can get the next page of results.
 * If desired, your application can include its own logic to assemble the
 * pages of results into one data set.
 * </p>
 * <p>
 * If <i>none</i> of the items can be processed due to insufficient
 * provisioned throughput on all of the tables in the request, then
 * <i>BatchGetItem</i> will return a
 * <i>ProvisionedThroughputExceededException</i> . If <i>at least one</i>
 * of the items is successfully processed, then <i>BatchGetItem</i>
 * completes successfully, while returning the keys of the unread items
 * in <i>UnprocessedKeys</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b> If DynamoDB returns any unprocessed items, you
 * should retry the batch operation on those items. However, we strongly
 * recommend that you use an exponential backoff algorithm. If you retry
 * the batch operation immediately, the underlying read or write requests
 * can still fail due to throttling on the individual tables. If you
 * delay the batch operation using exponential backoff, the individual
 * requests in the batch are much more likely to succeed. For more
 * information, go to Batch Operations and Error Handling in the Amazon
 * DynamoDB Developer Guide.
 * </p>
 * <p>
 * By default, <i>BatchGetItem</i> performs eventually consistent reads
 * on every table in the request. If you want strongly consistent reads
 * instead, you can set <i>ConsistentRead</i> to <code>true</code> for
 * any or all tables.
 * </p>
 * <p>
 * In order to minimize response latency, <i>BatchGetItem</i> retrieves
 * items in parallel.
 * </p>
 * <p>
 * When designing your application, keep in mind that DynamoDB does not
 * return attributes in any particular order. To help parse the response
 * by item, include the primary key values for the items in your request
 * in the <i>AttributesToGet</i> parameter.
 * </p>
 * <p>
 * If a requested item does not exist, it is not returned in the result.
 * Requests for nonexistent items consume the minimum read capacity units
 * according to the type of read. For more information, see
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"> Capacity Units Calculations </a>
 * in the <i>Amazon DynamoDB Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#batchGetItem(BatchGetItemRequest)
 */
public class BatchGetItemRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. Each table name
     * can be invoked only once. <p>Each element in the map consists of the
     * following: <ul> <li> <p><i>Keys</i> - An array of primary key
     * attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For
     * example, with a hash type primary key, you only need to specify the
     * hash attribute. For a hash-and-range type primary key, you must
     * specify <i>both</i> the hash attribute and the range attribute. </li>
     * <li> <p><i>AttributesToGet</i> - One or more attributes to be
     * retrieved from the table. By default, all attributes are returned. If
     * a specified attribute is not found, it does not appear in the result.
     * <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     * throughput consumption. DynamoDB determines capacity units consumed
     * based on item size, not on the amount of data that is returned to an
     * application. </li> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private java.util.Map<String,KeysAndAttributes> requestItems;

    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * Default constructor for a new BatchGetItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public BatchGetItemRequest() {}
    
    /**
     * Constructs a new BatchGetItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, the corresponding primary keys for the items to retrieve. Each
     * table name can be invoked only once. <p>Each element in the map
     * consists of the following: <ul> <li> <p><i>Keys</i> - An array of
     * primary key attribute values that define specific items in the table.
     * For each primary key, you must provide <i>all</i> of the key
     * attributes. For example, with a hash type primary key, you only need
     * to specify the hash attribute. For a hash-and-range type primary key,
     * you must specify <i>both</i> the hash attribute and the range
     * attribute. </li> <li> <p><i>AttributesToGet</i> - One or more
     * attributes to be retrieved from the table. By default, all attributes
     * are returned. If a specified attribute is not found, it does not
     * appear in the result. <p>Note that <i>AttributesToGet</i> has no
     * effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data
     * that is returned to an application. </li> <li>
     * <p><i>ConsistentRead</i> - If <code>true</code>, a strongly consistent
     * read is used; if <code>false</code> (the default), an eventually
     * consistent read is used. </li> </ul>
     */
    public BatchGetItemRequest(java.util.Map<String,KeysAndAttributes> requestItems) {
        setRequestItems(requestItems);
    }

    /**
     * Constructs a new BatchGetItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, the corresponding primary keys for the items to retrieve. Each
     * table name can be invoked only once. <p>Each element in the map
     * consists of the following: <ul> <li> <p><i>Keys</i> - An array of
     * primary key attribute values that define specific items in the table.
     * For each primary key, you must provide <i>all</i> of the key
     * attributes. For example, with a hash type primary key, you only need
     * to specify the hash attribute. For a hash-and-range type primary key,
     * you must specify <i>both</i> the hash attribute and the range
     * attribute. </li> <li> <p><i>AttributesToGet</i> - One or more
     * attributes to be retrieved from the table. By default, all attributes
     * are returned. If a specified attribute is not found, it does not
     * appear in the result. <p>Note that <i>AttributesToGet</i> has no
     * effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data
     * that is returned to an application. </li> <li>
     * <p><i>ConsistentRead</i> - If <code>true</code>, a strongly consistent
     * read is used; if <code>false</code> (the default), an eventually
     * consistent read is used. </li> </ul>
     * @param returnConsumedCapacity A value that if set to
     * <code>TOTAL</code>, the response includes <i>ConsumedCapacity</i> data
     * for tables and indexes. If set to <code>INDEXES</code>, the response
     * includes <i>ConsumedCapacity</i> for indexes. If set to
     * <code>NONE</code> (the default), <i>ConsumedCapacity</i> is not
     * included in the response.
     */
    public BatchGetItemRequest(java.util.Map<String,KeysAndAttributes> requestItems, String returnConsumedCapacity) {
        setRequestItems(requestItems);
        setReturnConsumedCapacity(returnConsumedCapacity);
    }

    /**
     * Constructs a new BatchGetItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param requestItems A map of one or more table names and, for each
     * table, the corresponding primary keys for the items to retrieve. Each
     * table name can be invoked only once. <p>Each element in the map
     * consists of the following: <ul> <li> <p><i>Keys</i> - An array of
     * primary key attribute values that define specific items in the table.
     * For each primary key, you must provide <i>all</i> of the key
     * attributes. For example, with a hash type primary key, you only need
     * to specify the hash attribute. For a hash-and-range type primary key,
     * you must specify <i>both</i> the hash attribute and the range
     * attribute. </li> <li> <p><i>AttributesToGet</i> - One or more
     * attributes to be retrieved from the table. By default, all attributes
     * are returned. If a specified attribute is not found, it does not
     * appear in the result. <p>Note that <i>AttributesToGet</i> has no
     * effect on provisioned throughput consumption. DynamoDB determines
     * capacity units consumed based on item size, not on the amount of data
     * that is returned to an application. </li> <li>
     * <p><i>ConsistentRead</i> - If <code>true</code>, a strongly consistent
     * read is used; if <code>false</code> (the default), an eventually
     * consistent read is used. </li> </ul>
     * @param returnConsumedCapacity A value that if set to
     * <code>TOTAL</code>, the response includes <i>ConsumedCapacity</i> data
     * for tables and indexes. If set to <code>INDEXES</code>, the response
     * includes <i>ConsumedCapacity</i> for indexes. If set to
     * <code>NONE</code> (the default), <i>ConsumedCapacity</i> is not
     * included in the response.
     */
    public BatchGetItemRequest(java.util.Map<String,KeysAndAttributes> requestItems, ReturnConsumedCapacity returnConsumedCapacity) {
        this.requestItems = requestItems;
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }

    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. Each table name
     * can be invoked only once. <p>Each element in the map consists of the
     * following: <ul> <li> <p><i>Keys</i> - An array of primary key
     * attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For
     * example, with a hash type primary key, you only need to specify the
     * hash attribute. For a hash-and-range type primary key, you must
     * specify <i>both</i> the hash attribute and the range attribute. </li>
     * <li> <p><i>AttributesToGet</i> - One or more attributes to be
     * retrieved from the table. By default, all attributes are returned. If
     * a specified attribute is not found, it does not appear in the result.
     * <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     * throughput consumption. DynamoDB determines capacity units consumed
     * based on item size, not on the amount of data that is returned to an
     * application. </li> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return A map of one or more table names and, for each table, the
     *         corresponding primary keys for the items to retrieve. Each table name
     *         can be invoked only once. <p>Each element in the map consists of the
     *         following: <ul> <li> <p><i>Keys</i> - An array of primary key
     *         attribute values that define specific items in the table. For each
     *         primary key, you must provide <i>all</i> of the key attributes. For
     *         example, with a hash type primary key, you only need to specify the
     *         hash attribute. For a hash-and-range type primary key, you must
     *         specify <i>both</i> the hash attribute and the range attribute. </li>
     *         <li> <p><i>AttributesToGet</i> - One or more attributes to be
     *         retrieved from the table. By default, all attributes are returned. If
     *         a specified attribute is not found, it does not appear in the result.
     *         <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     *         throughput consumption. DynamoDB determines capacity units consumed
     *         based on item size, not on the amount of data that is returned to an
     *         application. </li> <li> <p><i>ConsistentRead</i> - If
     *         <code>true</code>, a strongly consistent read is used; if
     *         <code>false</code> (the default), an eventually consistent read is
     *         used. </li> </ul>
     */
    public java.util.Map<String,KeysAndAttributes> getRequestItems() {
        
        return requestItems;
    }
    
    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. Each table name
     * can be invoked only once. <p>Each element in the map consists of the
     * following: <ul> <li> <p><i>Keys</i> - An array of primary key
     * attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For
     * example, with a hash type primary key, you only need to specify the
     * hash attribute. For a hash-and-range type primary key, you must
     * specify <i>both</i> the hash attribute and the range attribute. </li>
     * <li> <p><i>AttributesToGet</i> - One or more attributes to be
     * retrieved from the table. By default, all attributes are returned. If
     * a specified attribute is not found, it does not appear in the result.
     * <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     * throughput consumption. DynamoDB determines capacity units consumed
     * based on item size, not on the amount of data that is returned to an
     * application. </li> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems A map of one or more table names and, for each table, the
     *         corresponding primary keys for the items to retrieve. Each table name
     *         can be invoked only once. <p>Each element in the map consists of the
     *         following: <ul> <li> <p><i>Keys</i> - An array of primary key
     *         attribute values that define specific items in the table. For each
     *         primary key, you must provide <i>all</i> of the key attributes. For
     *         example, with a hash type primary key, you only need to specify the
     *         hash attribute. For a hash-and-range type primary key, you must
     *         specify <i>both</i> the hash attribute and the range attribute. </li>
     *         <li> <p><i>AttributesToGet</i> - One or more attributes to be
     *         retrieved from the table. By default, all attributes are returned. If
     *         a specified attribute is not found, it does not appear in the result.
     *         <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     *         throughput consumption. DynamoDB determines capacity units consumed
     *         based on item size, not on the amount of data that is returned to an
     *         application. </li> <li> <p><i>ConsistentRead</i> - If
     *         <code>true</code>, a strongly consistent read is used; if
     *         <code>false</code> (the default), an eventually consistent read is
     *         used. </li> </ul>
     */
    public void setRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
        this.requestItems = requestItems;
    }
    
    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. Each table name
     * can be invoked only once. <p>Each element in the map consists of the
     * following: <ul> <li> <p><i>Keys</i> - An array of primary key
     * attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For
     * example, with a hash type primary key, you only need to specify the
     * hash attribute. For a hash-and-range type primary key, you must
     * specify <i>both</i> the hash attribute and the range attribute. </li>
     * <li> <p><i>AttributesToGet</i> - One or more attributes to be
     * retrieved from the table. By default, all attributes are returned. If
     * a specified attribute is not found, it does not appear in the result.
     * <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     * throughput consumption. DynamoDB determines capacity units consumed
     * based on item size, not on the amount of data that is returned to an
     * application. </li> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param requestItems A map of one or more table names and, for each table, the
     *         corresponding primary keys for the items to retrieve. Each table name
     *         can be invoked only once. <p>Each element in the map consists of the
     *         following: <ul> <li> <p><i>Keys</i> - An array of primary key
     *         attribute values that define specific items in the table. For each
     *         primary key, you must provide <i>all</i> of the key attributes. For
     *         example, with a hash type primary key, you only need to specify the
     *         hash attribute. For a hash-and-range type primary key, you must
     *         specify <i>both</i> the hash attribute and the range attribute. </li>
     *         <li> <p><i>AttributesToGet</i> - One or more attributes to be
     *         retrieved from the table. By default, all attributes are returned. If
     *         a specified attribute is not found, it does not appear in the result.
     *         <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     *         throughput consumption. DynamoDB determines capacity units consumed
     *         based on item size, not on the amount of data that is returned to an
     *         application. </li> <li> <p><i>ConsistentRead</i> - If
     *         <code>true</code>, a strongly consistent read is used; if
     *         <code>false</code> (the default), an eventually consistent read is
     *         used. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public BatchGetItemRequest withRequestItems(java.util.Map<String,KeysAndAttributes> requestItems) {
        setRequestItems(requestItems);
        return this;
    }

    /**
     * A map of one or more table names and, for each table, the
     * corresponding primary keys for the items to retrieve. Each table name
     * can be invoked only once. <p>Each element in the map consists of the
     * following: <ul> <li> <p><i>Keys</i> - An array of primary key
     * attribute values that define specific items in the table. For each
     * primary key, you must provide <i>all</i> of the key attributes. For
     * example, with a hash type primary key, you only need to specify the
     * hash attribute. For a hash-and-range type primary key, you must
     * specify <i>both</i> the hash attribute and the range attribute. </li>
     * <li> <p><i>AttributesToGet</i> - One or more attributes to be
     * retrieved from the table. By default, all attributes are returned. If
     * a specified attribute is not found, it does not appear in the result.
     * <p>Note that <i>AttributesToGet</i> has no effect on provisioned
     * throughput consumption. DynamoDB determines capacity units consumed
     * based on item size, not on the amount of data that is returned to an
     * application. </li> <li> <p><i>ConsistentRead</i> - If
     * <code>true</code>, a strongly consistent read is used; if
     * <code>false</code> (the default), an eventually consistent read is
     * used. </li> </ul>
     * <p>
     * The method adds a new key-value pair into RequestItems parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param key The key of the entry to be added into RequestItems.
     * @param value The corresponding value of the entry to be added into RequestItems.
     */
    public BatchGetItemRequest addRequestItemsEntry(String key, KeysAndAttributes value) {
        if (null == this.requestItems) {
            this.requestItems = new java.util.HashMap<String,KeysAndAttributes>();
        }
        if (this.requestItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestItems.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public BatchGetItemRequest clearRequestItemsEntries() {
        this.requestItems = null;
        return this;
    }
    
    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @return A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
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
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * A value that if set to <code>TOTAL</code>, the response includes
     * <i>ConsumedCapacity</i> data for tables and indexes. If set to
     * <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     * for indexes. If set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included in the response.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INDEXES, TOTAL, NONE
     *
     * @param returnConsumedCapacity A value that if set to <code>TOTAL</code>, the response includes
     *         <i>ConsumedCapacity</i> data for tables and indexes. If set to
     *         <code>INDEXES</code>, the response includes <i>ConsumedCapacity</i>
     *         for indexes. If set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included in the response.
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
    