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
 * Represents the output of a <i>BatchWriteItem</i> operation.
 * </p>
 */
public class BatchWriteItemResult implements Serializable {

    /**
     * A map of tables and requests against those tables that were not
     * processed. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so you can provide this value directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each
     * <i>UnprocessedItems</i> entry consists of a table name and, for that
     * table, a list of operations to perform (<i>DeleteRequest</i> or
     * <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     * <i>DeleteItem</i> operation on the specified item. The item to be
     * deleted is identified by a <i>Key</i> subelement: <ul> <li>
     * <p><i>Key</i> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute
     * name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     * specified item. The item to be put is identified by an <i>Item</i>
     * subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     * values. Each entry in this map consists of an attribute name and an
     * attribute value. Attribute values must not be null; string and binary
     * type attributes must have lengths greater than zero; and set type
     * attributes must not be empty. Requests that contain empty values will
     * be rejected with a <i>ValidationException</i>. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition.</li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems;

    /**
     * A list of tables that were processed by <i>BatchWriteItem</i> and, for
     * each table, information about any item collections that were affected
     * by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     * entry consists of the following subelements: <ul> <li>
     * <p><i>ItemCollectionKey</i> - The hash key value of the item
     * collection. This is the same as the hash key of the item. </li> <li>
     * <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     * expressed in GB. This is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the secondary indexes on the table. Use this estimate to
     * measure whether a secondary index is approaching its size limit.
     * <p>The estimate is subject to change over time; therefore, do not rely
     * on the precision or accuracy of the estimate. </li> </ul>
     */
    private java.util.Map<String,java.util.List<ItemCollectionMetrics>> itemCollectionMetrics;

    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     * number of capacity units consumed. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ConsumedCapacity> consumedCapacity;

    /**
     * A map of tables and requests against those tables that were not
     * processed. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so you can provide this value directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each
     * <i>UnprocessedItems</i> entry consists of a table name and, for that
     * table, a list of operations to perform (<i>DeleteRequest</i> or
     * <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     * <i>DeleteItem</i> operation on the specified item. The item to be
     * deleted is identified by a <i>Key</i> subelement: <ul> <li>
     * <p><i>Key</i> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute
     * name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     * specified item. The item to be put is identified by an <i>Item</i>
     * subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     * values. Each entry in this map consists of an attribute name and an
     * attribute value. Attribute values must not be null; string and binary
     * type attributes must have lengths greater than zero; and set type
     * attributes must not be empty. Requests that contain empty values will
     * be rejected with a <i>ValidationException</i>. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition.</li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return A map of tables and requests against those tables that were not
     *         processed. The <i>UnprocessedKeys</i> value is in the same form as
     *         <i>RequestItems</i>, so you can provide this value directly to a
     *         subsequent <i>BatchGetItem</i> operation. For more information, see
     *         <i>RequestItems</i> in the Request Parameters section. <p>Each
     *         <i>UnprocessedItems</i> entry consists of a table name and, for that
     *         table, a list of operations to perform (<i>DeleteRequest</i> or
     *         <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     *         <i>DeleteItem</i> operation on the specified item. The item to be
     *         deleted is identified by a <i>Key</i> subelement: <ul> <li>
     *         <p><i>Key</i> - A map of primary key attribute values that uniquely
     *         identify the item. Each entry in this map consists of an attribute
     *         name and an attribute value. </li> </ul> </li> <li>
     *         <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     *         specified item. The item to be put is identified by an <i>Item</i>
     *         subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     *         values. Each entry in this map consists of an attribute name and an
     *         attribute value. Attribute values must not be null; string and binary
     *         type attributes must have lengths greater than zero; and set type
     *         attributes must not be empty. Requests that contain empty values will
     *         be rejected with a <i>ValidationException</i>. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition.</li> </ul> </li> </ul>
     */
    public java.util.Map<String,java.util.List<WriteRequest>> getUnprocessedItems() {
        
        return unprocessedItems;
    }
    
    /**
     * A map of tables and requests against those tables that were not
     * processed. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so you can provide this value directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each
     * <i>UnprocessedItems</i> entry consists of a table name and, for that
     * table, a list of operations to perform (<i>DeleteRequest</i> or
     * <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     * <i>DeleteItem</i> operation on the specified item. The item to be
     * deleted is identified by a <i>Key</i> subelement: <ul> <li>
     * <p><i>Key</i> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute
     * name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     * specified item. The item to be put is identified by an <i>Item</i>
     * subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     * values. Each entry in this map consists of an attribute name and an
     * attribute value. Attribute values must not be null; string and binary
     * type attributes must have lengths greater than zero; and set type
     * attributes must not be empty. Requests that contain empty values will
     * be rejected with a <i>ValidationException</i>. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition.</li> </ul> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param unprocessedItems A map of tables and requests against those tables that were not
     *         processed. The <i>UnprocessedKeys</i> value is in the same form as
     *         <i>RequestItems</i>, so you can provide this value directly to a
     *         subsequent <i>BatchGetItem</i> operation. For more information, see
     *         <i>RequestItems</i> in the Request Parameters section. <p>Each
     *         <i>UnprocessedItems</i> entry consists of a table name and, for that
     *         table, a list of operations to perform (<i>DeleteRequest</i> or
     *         <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     *         <i>DeleteItem</i> operation on the specified item. The item to be
     *         deleted is identified by a <i>Key</i> subelement: <ul> <li>
     *         <p><i>Key</i> - A map of primary key attribute values that uniquely
     *         identify the item. Each entry in this map consists of an attribute
     *         name and an attribute value. </li> </ul> </li> <li>
     *         <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     *         specified item. The item to be put is identified by an <i>Item</i>
     *         subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     *         values. Each entry in this map consists of an attribute name and an
     *         attribute value. Attribute values must not be null; string and binary
     *         type attributes must have lengths greater than zero; and set type
     *         attributes must not be empty. Requests that contain empty values will
     *         be rejected with a <i>ValidationException</i>. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition.</li> </ul> </li> </ul>
     */
    public void setUnprocessedItems(java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems) {
        this.unprocessedItems = unprocessedItems;
    }
    
    /**
     * A map of tables and requests against those tables that were not
     * processed. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so you can provide this value directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each
     * <i>UnprocessedItems</i> entry consists of a table name and, for that
     * table, a list of operations to perform (<i>DeleteRequest</i> or
     * <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     * <i>DeleteItem</i> operation on the specified item. The item to be
     * deleted is identified by a <i>Key</i> subelement: <ul> <li>
     * <p><i>Key</i> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute
     * name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     * specified item. The item to be put is identified by an <i>Item</i>
     * subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     * values. Each entry in this map consists of an attribute name and an
     * attribute value. Attribute values must not be null; string and binary
     * type attributes must have lengths greater than zero; and set type
     * attributes must not be empty. Requests that contain empty values will
     * be rejected with a <i>ValidationException</i>. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition.</li> </ul> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param unprocessedItems A map of tables and requests against those tables that were not
     *         processed. The <i>UnprocessedKeys</i> value is in the same form as
     *         <i>RequestItems</i>, so you can provide this value directly to a
     *         subsequent <i>BatchGetItem</i> operation. For more information, see
     *         <i>RequestItems</i> in the Request Parameters section. <p>Each
     *         <i>UnprocessedItems</i> entry consists of a table name and, for that
     *         table, a list of operations to perform (<i>DeleteRequest</i> or
     *         <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     *         <i>DeleteItem</i> operation on the specified item. The item to be
     *         deleted is identified by a <i>Key</i> subelement: <ul> <li>
     *         <p><i>Key</i> - A map of primary key attribute values that uniquely
     *         identify the item. Each entry in this map consists of an attribute
     *         name and an attribute value. </li> </ul> </li> <li>
     *         <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     *         specified item. The item to be put is identified by an <i>Item</i>
     *         subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     *         values. Each entry in this map consists of an attribute name and an
     *         attribute value. Attribute values must not be null; string and binary
     *         type attributes must have lengths greater than zero; and set type
     *         attributes must not be empty. Requests that contain empty values will
     *         be rejected with a <i>ValidationException</i>. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition.</li> </ul> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchWriteItemResult withUnprocessedItems(java.util.Map<String,java.util.List<WriteRequest>> unprocessedItems) {
        setUnprocessedItems(unprocessedItems);
        return this;
    }

    /**
     * A map of tables and requests against those tables that were not
     * processed. The <i>UnprocessedKeys</i> value is in the same form as
     * <i>RequestItems</i>, so you can provide this value directly to a
     * subsequent <i>BatchGetItem</i> operation. For more information, see
     * <i>RequestItems</i> in the Request Parameters section. <p>Each
     * <i>UnprocessedItems</i> entry consists of a table name and, for that
     * table, a list of operations to perform (<i>DeleteRequest</i> or
     * <i>PutRequest</i>). <ul> <li> <p><i>DeleteRequest</i> - Perform a
     * <i>DeleteItem</i> operation on the specified item. The item to be
     * deleted is identified by a <i>Key</i> subelement: <ul> <li>
     * <p><i>Key</i> - A map of primary key attribute values that uniquely
     * identify the item. Each entry in this map consists of an attribute
     * name and an attribute value. </li> </ul> </li> <li>
     * <p><i>PutRequest</i> - Perform a <i>PutItem</i> operation on the
     * specified item. The item to be put is identified by an <i>Item</i>
     * subelement: <ul> <li> <p><i>Item</i> - A map of attributes and their
     * values. Each entry in this map consists of an attribute name and an
     * attribute value. Attribute values must not be null; string and binary
     * type attributes must have lengths greater than zero; and set type
     * attributes must not be empty. Requests that contain empty values will
     * be rejected with a <i>ValidationException</i>. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition.</li> </ul> </li> </ul>
     * <p>
     * The method adds a new key-value pair into UnprocessedItems parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param key The key of the entry to be added into UnprocessedItems.
     * @param value The corresponding value of the entry to be added into UnprocessedItems.
     */
	public BatchWriteItemResult addUnprocessedItemsEntry(String key, java.util.List<WriteRequest> value) {
		if (null == this.unprocessedItems) {
			this.unprocessedItems = new java.util.HashMap<String,java.util.List<WriteRequest>>();
		}
		if (this.unprocessedItems.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.unprocessedItems.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into UnprocessedItems.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public BatchWriteItemResult clearUnprocessedItemsEntries() {
		this.unprocessedItems = null;
		return this;
	}
	
    /**
     * A list of tables that were processed by <i>BatchWriteItem</i> and, for
     * each table, information about any item collections that were affected
     * by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     * entry consists of the following subelements: <ul> <li>
     * <p><i>ItemCollectionKey</i> - The hash key value of the item
     * collection. This is the same as the hash key of the item. </li> <li>
     * <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     * expressed in GB. This is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the secondary indexes on the table. Use this estimate to
     * measure whether a secondary index is approaching its size limit.
     * <p>The estimate is subject to change over time; therefore, do not rely
     * on the precision or accuracy of the estimate. </li> </ul>
     *
     * @return A list of tables that were processed by <i>BatchWriteItem</i> and, for
     *         each table, information about any item collections that were affected
     *         by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     *         entry consists of the following subelements: <ul> <li>
     *         <p><i>ItemCollectionKey</i> - The hash key value of the item
     *         collection. This is the same as the hash key of the item. </li> <li>
     *         <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     *         expressed in GB. This is a two-element array containing a lower bound
     *         and an upper bound for the estimate. The estimate includes the size of
     *         all the items in the table, plus the size of all attributes projected
     *         into all of the secondary indexes on the table. Use this estimate to
     *         measure whether a secondary index is approaching its size limit.
     *         <p>The estimate is subject to change over time; therefore, do not rely
     *         on the precision or accuracy of the estimate. </li> </ul>
     */
    public java.util.Map<String,java.util.List<ItemCollectionMetrics>> getItemCollectionMetrics() {
        
        return itemCollectionMetrics;
    }
    
    /**
     * A list of tables that were processed by <i>BatchWriteItem</i> and, for
     * each table, information about any item collections that were affected
     * by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     * entry consists of the following subelements: <ul> <li>
     * <p><i>ItemCollectionKey</i> - The hash key value of the item
     * collection. This is the same as the hash key of the item. </li> <li>
     * <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     * expressed in GB. This is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the secondary indexes on the table. Use this estimate to
     * measure whether a secondary index is approaching its size limit.
     * <p>The estimate is subject to change over time; therefore, do not rely
     * on the precision or accuracy of the estimate. </li> </ul>
     *
     * @param itemCollectionMetrics A list of tables that were processed by <i>BatchWriteItem</i> and, for
     *         each table, information about any item collections that were affected
     *         by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     *         entry consists of the following subelements: <ul> <li>
     *         <p><i>ItemCollectionKey</i> - The hash key value of the item
     *         collection. This is the same as the hash key of the item. </li> <li>
     *         <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     *         expressed in GB. This is a two-element array containing a lower bound
     *         and an upper bound for the estimate. The estimate includes the size of
     *         all the items in the table, plus the size of all attributes projected
     *         into all of the secondary indexes on the table. Use this estimate to
     *         measure whether a secondary index is approaching its size limit.
     *         <p>The estimate is subject to change over time; therefore, do not rely
     *         on the precision or accuracy of the estimate. </li> </ul>
     */
    public void setItemCollectionMetrics(java.util.Map<String,java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
    }
    
    /**
     * A list of tables that were processed by <i>BatchWriteItem</i> and, for
     * each table, information about any item collections that were affected
     * by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     * entry consists of the following subelements: <ul> <li>
     * <p><i>ItemCollectionKey</i> - The hash key value of the item
     * collection. This is the same as the hash key of the item. </li> <li>
     * <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     * expressed in GB. This is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the secondary indexes on the table. Use this estimate to
     * measure whether a secondary index is approaching its size limit.
     * <p>The estimate is subject to change over time; therefore, do not rely
     * on the precision or accuracy of the estimate. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param itemCollectionMetrics A list of tables that were processed by <i>BatchWriteItem</i> and, for
     *         each table, information about any item collections that were affected
     *         by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     *         entry consists of the following subelements: <ul> <li>
     *         <p><i>ItemCollectionKey</i> - The hash key value of the item
     *         collection. This is the same as the hash key of the item. </li> <li>
     *         <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     *         expressed in GB. This is a two-element array containing a lower bound
     *         and an upper bound for the estimate. The estimate includes the size of
     *         all the items in the table, plus the size of all attributes projected
     *         into all of the secondary indexes on the table. Use this estimate to
     *         measure whether a secondary index is approaching its size limit.
     *         <p>The estimate is subject to change over time; therefore, do not rely
     *         on the precision or accuracy of the estimate. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchWriteItemResult withItemCollectionMetrics(java.util.Map<String,java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
        setItemCollectionMetrics(itemCollectionMetrics);
        return this;
    }

    /**
     * A list of tables that were processed by <i>BatchWriteItem</i> and, for
     * each table, information about any item collections that were affected
     * by individual <i>DeleteItem</i> or <i>PutItem</i> operations. <p>Each
     * entry consists of the following subelements: <ul> <li>
     * <p><i>ItemCollectionKey</i> - The hash key value of the item
     * collection. This is the same as the hash key of the item. </li> <li>
     * <p><i>SizeEstimateRange</i> - An estimate of item collection size,
     * expressed in GB. This is a two-element array containing a lower bound
     * and an upper bound for the estimate. The estimate includes the size of
     * all the items in the table, plus the size of all attributes projected
     * into all of the secondary indexes on the table. Use this estimate to
     * measure whether a secondary index is approaching its size limit.
     * <p>The estimate is subject to change over time; therefore, do not rely
     * on the precision or accuracy of the estimate. </li> </ul>
     * <p>
     * The method adds a new key-value pair into ItemCollectionMetrics
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into ItemCollectionMetrics.
     * @param value The corresponding value of the entry to be added into ItemCollectionMetrics.
     */
	public BatchWriteItemResult addItemCollectionMetricsEntry(String key, java.util.List<ItemCollectionMetrics> value) {
		if (null == this.itemCollectionMetrics) {
			this.itemCollectionMetrics = new java.util.HashMap<String,java.util.List<ItemCollectionMetrics>>();
		}
		if (this.itemCollectionMetrics.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.itemCollectionMetrics.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into ItemCollectionMetrics.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public BatchWriteItemResult clearItemCollectionMetricsEntries() {
		this.itemCollectionMetrics = null;
		return this;
	}
	
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     * number of capacity units consumed. </li> </ul>
     *
     * @return The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     *         number of capacity units consumed. </li> </ul>
     */
    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        return consumedCapacity;
    }
    
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     * number of capacity units consumed. </li> </ul>
     *
     * @param consumedCapacity The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     *         number of capacity units consumed. </li> </ul>
     */
    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ConsumedCapacity> consumedCapacityCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConsumedCapacity>(consumedCapacity.size());
        consumedCapacityCopy.addAll(consumedCapacity);
        this.consumedCapacity = consumedCapacityCopy;
    }
    
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     * number of capacity units consumed. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacity The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     *         number of capacity units consumed. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchWriteItemResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (getConsumedCapacity() == null) setConsumedCapacity(new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.length));
        for (ConsumedCapacity value : consumedCapacity) {
            getConsumedCapacity().add(value);
        }
        return this;
    }
    
    /**
     * The capacity units consumed by the operation. <p>Each element consists
     * of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     * provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     * number of capacity units consumed. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consumedCapacity The capacity units consumed by the operation. <p>Each element consists
     *         of: <ul> <li> <p><i>TableName</i> - The table that consumed the
     *         provisioned throughput. </li> <li> <p><i>CapacityUnits</i> - The total
     *         number of capacity units consumed. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public BatchWriteItemResult withConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ConsumedCapacity> consumedCapacityCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ConsumedCapacity>(consumedCapacity.size());
            consumedCapacityCopy.addAll(consumedCapacity);
            this.consumedCapacity = consumedCapacityCopy;
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
        if (getUnprocessedItems() != null) sb.append("UnprocessedItems: " + getUnprocessedItems() + ",");
        if (getItemCollectionMetrics() != null) sb.append("ItemCollectionMetrics: " + getItemCollectionMetrics() + ",");
        if (getConsumedCapacity() != null) sb.append("ConsumedCapacity: " + getConsumedCapacity() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUnprocessedItems() == null) ? 0 : getUnprocessedItems().hashCode()); 
        hashCode = prime * hashCode + ((getItemCollectionMetrics() == null) ? 0 : getItemCollectionMetrics().hashCode()); 
        hashCode = prime * hashCode + ((getConsumedCapacity() == null) ? 0 : getConsumedCapacity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof BatchWriteItemResult == false) return false;
        BatchWriteItemResult other = (BatchWriteItemResult)obj;
        
        if (other.getUnprocessedItems() == null ^ this.getUnprocessedItems() == null) return false;
        if (other.getUnprocessedItems() != null && other.getUnprocessedItems().equals(this.getUnprocessedItems()) == false) return false; 
        if (other.getItemCollectionMetrics() == null ^ this.getItemCollectionMetrics() == null) return false;
        if (other.getItemCollectionMetrics() != null && other.getItemCollectionMetrics().equals(this.getItemCollectionMetrics()) == false) return false; 
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null) return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false) return false; 
        return true;
    }
    
}
    