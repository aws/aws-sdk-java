/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a <code>BatchWriteItem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchWriteItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteItemResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A map of tables and requests against those tables that were not processed. The <code>UnprocessedItems</code>
     * value is in the same form as <code>RequestItems</code>, so you can provide this value directly to a subsequent
     * <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request
     * Parameters section.
     * </p>
     * <p>
     * Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of operations to
     * perform (<code>DeleteRequest</code> or <code>PutRequest</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item to be
     * deleted is identified by a <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in this map
     * consists of an attribute name and an attribute value.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be put is
     * identified by an <code>Item</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute name
     * and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths
     * greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected
     * with a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code> map.
     * </p>
     */
    private java.util.Map<String, java.util.List<WriteRequest>> unprocessedItems;
    /**
     * <p>
     * A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information about any
     * item collections that were affected by individual <code>DeleteItem</code> or <code>PutItem</code> operations.
     * </p>
     * <p>
     * Each entry consists of the following subelements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the
     * partition key value of the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a two-element
     * array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the
     * items in the table, plus the size of all attributes projected into all of the local secondary indexes on the
     * table. Use this estimate to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, java.util.List<ItemCollectionMetrics>> itemCollectionMetrics;
    /**
     * <p>
     * The capacity units consumed by the entire <code>BatchWriteItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<ConsumedCapacity> consumedCapacity;

    /**
     * <p>
     * A map of tables and requests against those tables that were not processed. The <code>UnprocessedItems</code>
     * value is in the same form as <code>RequestItems</code>, so you can provide this value directly to a subsequent
     * <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request
     * Parameters section.
     * </p>
     * <p>
     * Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of operations to
     * perform (<code>DeleteRequest</code> or <code>PutRequest</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item to be
     * deleted is identified by a <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in this map
     * consists of an attribute name and an attribute value.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be put is
     * identified by an <code>Item</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute name
     * and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths
     * greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected
     * with a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code> map.
     * </p>
     * 
     * @return A map of tables and requests against those tables that were not processed. The
     *         <code>UnprocessedItems</code> value is in the same form as <code>RequestItems</code>, so you can provide
     *         this value directly to a subsequent <code>BatchGetItem</code> operation. For more information, see
     *         <code>RequestItems</code> in the Request Parameters section.</p>
     *         <p>
     *         Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of
     *         operations to perform (<code>DeleteRequest</code> or <code>PutRequest</code>).
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item
     *         to be deleted is identified by a <code>Key</code> subelement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in
     *         this map consists of an attribute name and an attribute value.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be
     *         put is identified by an <code>Item</code> subelement:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute
     *         name and an attribute value. Attribute values must not be null; string and binary type attributes must
     *         have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty
     *         values will be rejected with a <code>ValidationException</code> exception.
     *         </p>
     *         <p>
     *         If you specify any attributes that are part of an index key, then the data types for those attributes
     *         must match those of the schema in the table's attribute definition.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     *         <p>
     *         If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code>
     *         map.
     */

    public java.util.Map<String, java.util.List<WriteRequest>> getUnprocessedItems() {
        return unprocessedItems;
    }

    /**
     * <p>
     * A map of tables and requests against those tables that were not processed. The <code>UnprocessedItems</code>
     * value is in the same form as <code>RequestItems</code>, so you can provide this value directly to a subsequent
     * <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request
     * Parameters section.
     * </p>
     * <p>
     * Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of operations to
     * perform (<code>DeleteRequest</code> or <code>PutRequest</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item to be
     * deleted is identified by a <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in this map
     * consists of an attribute name and an attribute value.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be put is
     * identified by an <code>Item</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute name
     * and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths
     * greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected
     * with a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code> map.
     * </p>
     * 
     * @param unprocessedItems
     *        A map of tables and requests against those tables that were not processed. The
     *        <code>UnprocessedItems</code> value is in the same form as <code>RequestItems</code>, so you can provide
     *        this value directly to a subsequent <code>BatchGetItem</code> operation. For more information, see
     *        <code>RequestItems</code> in the Request Parameters section.</p>
     *        <p>
     *        Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of
     *        operations to perform (<code>DeleteRequest</code> or <code>PutRequest</code>).
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item
     *        to be deleted is identified by a <code>Key</code> subelement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in
     *        this map consists of an attribute name and an attribute value.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be
     *        put is identified by an <code>Item</code> subelement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute
     *        name and an attribute value. Attribute values must not be null; string and binary type attributes must
     *        have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty
     *        values will be rejected with a <code>ValidationException</code> exception.
     *        </p>
     *        <p>
     *        If you specify any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code>
     *        map.
     */

    public void setUnprocessedItems(java.util.Map<String, java.util.List<WriteRequest>> unprocessedItems) {
        this.unprocessedItems = unprocessedItems;
    }

    /**
     * <p>
     * A map of tables and requests against those tables that were not processed. The <code>UnprocessedItems</code>
     * value is in the same form as <code>RequestItems</code>, so you can provide this value directly to a subsequent
     * <code>BatchGetItem</code> operation. For more information, see <code>RequestItems</code> in the Request
     * Parameters section.
     * </p>
     * <p>
     * Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of operations to
     * perform (<code>DeleteRequest</code> or <code>PutRequest</code>).
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item to be
     * deleted is identified by a <code>Key</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in this map
     * consists of an attribute name and an attribute value.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be put is
     * identified by an <code>Item</code> subelement:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute name
     * and an attribute value. Attribute values must not be null; string and binary type attributes must have lengths
     * greater than zero; and set type attributes must not be empty. Requests that contain empty values will be rejected
     * with a <code>ValidationException</code> exception.
     * </p>
     * <p>
     * If you specify any attributes that are part of an index key, then the data types for those attributes must match
     * those of the schema in the table's attribute definition.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code> map.
     * </p>
     * 
     * @param unprocessedItems
     *        A map of tables and requests against those tables that were not processed. The
     *        <code>UnprocessedItems</code> value is in the same form as <code>RequestItems</code>, so you can provide
     *        this value directly to a subsequent <code>BatchGetItem</code> operation. For more information, see
     *        <code>RequestItems</code> in the Request Parameters section.</p>
     *        <p>
     *        Each <code>UnprocessedItems</code> entry consists of a table name and, for that table, a list of
     *        operations to perform (<code>DeleteRequest</code> or <code>PutRequest</code>).
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DeleteRequest</code> - Perform a <code>DeleteItem</code> operation on the specified item. The item
     *        to be deleted is identified by a <code>Key</code> subelement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Key</code> - A map of primary key attribute values that uniquely identify the item. Each entry in
     *        this map consists of an attribute name and an attribute value.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PutRequest</code> - Perform a <code>PutItem</code> operation on the specified item. The item to be
     *        put is identified by an <code>Item</code> subelement:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Item</code> - A map of attributes and their values. Each entry in this map consists of an attribute
     *        name and an attribute value. Attribute values must not be null; string and binary type attributes must
     *        have lengths greater than zero; and set type attributes must not be empty. Requests that contain empty
     *        values will be rejected with a <code>ValidationException</code> exception.
     *        </p>
     *        <p>
     *        If you specify any attributes that are part of an index key, then the data types for those attributes must
     *        match those of the schema in the table's attribute definition.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        </ul>
     *        <p>
     *        If there are no unprocessed items remaining, the response contains an empty <code>UnprocessedItems</code>
     *        map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemResult withUnprocessedItems(java.util.Map<String, java.util.List<WriteRequest>> unprocessedItems) {
        setUnprocessedItems(unprocessedItems);
        return this;
    }

    public BatchWriteItemResult addUnprocessedItemsEntry(String key, java.util.List<WriteRequest> value) {
        if (null == this.unprocessedItems) {
            this.unprocessedItems = new java.util.HashMap<String, java.util.List<WriteRequest>>();
        }
        if (this.unprocessedItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.unprocessedItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UnprocessedItems.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemResult clearUnprocessedItemsEntries() {
        this.unprocessedItems = null;
        return this;
    }

    /**
     * <p>
     * A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information about any
     * item collections that were affected by individual <code>DeleteItem</code> or <code>PutItem</code> operations.
     * </p>
     * <p>
     * Each entry consists of the following subelements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the
     * partition key value of the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a two-element
     * array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the
     * items in the table, plus the size of all attributes projected into all of the local secondary indexes on the
     * table. Use this estimate to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information
     *         about any item collections that were affected by individual <code>DeleteItem</code> or
     *         <code>PutItem</code> operations.</p>
     *         <p>
     *         Each entry consists of the following subelements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the
     *         partition key value of the item.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a
     *         two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the
     *         size of all the items in the table, plus the size of all attributes projected into all of the local
     *         secondary indexes on the table. Use this estimate to measure whether a local secondary index is
     *         approaching its size limit.
     *         </p>
     *         <p>
     *         The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
     *         estimate.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, java.util.List<ItemCollectionMetrics>> getItemCollectionMetrics() {
        return itemCollectionMetrics;
    }

    /**
     * <p>
     * A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information about any
     * item collections that were affected by individual <code>DeleteItem</code> or <code>PutItem</code> operations.
     * </p>
     * <p>
     * Each entry consists of the following subelements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the
     * partition key value of the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a two-element
     * array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the
     * items in the table, plus the size of all attributes projected into all of the local secondary indexes on the
     * table. Use this estimate to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param itemCollectionMetrics
     *        A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information about
     *        any item collections that were affected by individual <code>DeleteItem</code> or <code>PutItem</code>
     *        operations.</p>
     *        <p>
     *        Each entry consists of the following subelements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the
     *        partition key value of the item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a
     *        two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the
     *        size of all the items in the table, plus the size of all attributes projected into all of the local
     *        secondary indexes on the table. Use this estimate to measure whether a local secondary index is
     *        approaching its size limit.
     *        </p>
     *        <p>
     *        The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
     *        estimate.
     *        </p>
     *        </li>
     */

    public void setItemCollectionMetrics(java.util.Map<String, java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
        this.itemCollectionMetrics = itemCollectionMetrics;
    }

    /**
     * <p>
     * A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information about any
     * item collections that were affected by individual <code>DeleteItem</code> or <code>PutItem</code> operations.
     * </p>
     * <p>
     * Each entry consists of the following subelements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the
     * partition key value of the item.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a two-element
     * array containing a lower bound and an upper bound for the estimate. The estimate includes the size of all the
     * items in the table, plus the size of all attributes projected into all of the local secondary indexes on the
     * table. Use this estimate to measure whether a local secondary index is approaching its size limit.
     * </p>
     * <p>
     * The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the estimate.
     * </p>
     * </li>
     * </ul>
     * 
     * @param itemCollectionMetrics
     *        A list of tables that were processed by <code>BatchWriteItem</code> and, for each table, information about
     *        any item collections that were affected by individual <code>DeleteItem</code> or <code>PutItem</code>
     *        operations.</p>
     *        <p>
     *        Each entry consists of the following subelements:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ItemCollectionKey</code> - The partition key value of the item collection. This is the same as the
     *        partition key value of the item.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SizeEstimateRangeGB</code> - An estimate of item collection size, expressed in GB. This is a
     *        two-element array containing a lower bound and an upper bound for the estimate. The estimate includes the
     *        size of all the items in the table, plus the size of all attributes projected into all of the local
     *        secondary indexes on the table. Use this estimate to measure whether a local secondary index is
     *        approaching its size limit.
     *        </p>
     *        <p>
     *        The estimate is subject to change over time; therefore, do not rely on the precision or accuracy of the
     *        estimate.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemResult withItemCollectionMetrics(java.util.Map<String, java.util.List<ItemCollectionMetrics>> itemCollectionMetrics) {
        setItemCollectionMetrics(itemCollectionMetrics);
        return this;
    }

    public BatchWriteItemResult addItemCollectionMetricsEntry(String key, java.util.List<ItemCollectionMetrics> value) {
        if (null == this.itemCollectionMetrics) {
            this.itemCollectionMetrics = new java.util.HashMap<String, java.util.List<ItemCollectionMetrics>>();
        }
        if (this.itemCollectionMetrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.itemCollectionMetrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ItemCollectionMetrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemResult clearItemCollectionMetricsEntries() {
        this.itemCollectionMetrics = null;
        return this;
    }

    /**
     * <p>
     * The capacity units consumed by the entire <code>BatchWriteItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The capacity units consumed by the entire <code>BatchWriteItem</code> operation.</p>
     *         <p>
     *         Each element consists of:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>TableName</code> - The table that consumed the provisioned throughput.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CapacityUnits</code> - The total number of capacity units consumed.
     *         </p>
     *         </li>
     */

    public java.util.List<ConsumedCapacity> getConsumedCapacity() {
        return consumedCapacity;
    }

    /**
     * <p>
     * The capacity units consumed by the entire <code>BatchWriteItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param consumedCapacity
     *        The capacity units consumed by the entire <code>BatchWriteItem</code> operation.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TableName</code> - The table that consumed the provisioned throughput.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityUnits</code> - The total number of capacity units consumed.
     *        </p>
     *        </li>
     */

    public void setConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        if (consumedCapacity == null) {
            this.consumedCapacity = null;
            return;
        }

        this.consumedCapacity = new java.util.ArrayList<ConsumedCapacity>(consumedCapacity);
    }

    /**
     * <p>
     * The capacity units consumed by the entire <code>BatchWriteItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConsumedCapacity(java.util.Collection)} or {@link #withConsumedCapacity(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param consumedCapacity
     *        The capacity units consumed by the entire <code>BatchWriteItem</code> operation.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TableName</code> - The table that consumed the provisioned throughput.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityUnits</code> - The total number of capacity units consumed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemResult withConsumedCapacity(ConsumedCapacity... consumedCapacity) {
        if (this.consumedCapacity == null) {
            setConsumedCapacity(new java.util.ArrayList<ConsumedCapacity>(consumedCapacity.length));
        }
        for (ConsumedCapacity ele : consumedCapacity) {
            this.consumedCapacity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capacity units consumed by the entire <code>BatchWriteItem</code> operation.
     * </p>
     * <p>
     * Each element consists of:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>TableName</code> - The table that consumed the provisioned throughput.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CapacityUnits</code> - The total number of capacity units consumed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param consumedCapacity
     *        The capacity units consumed by the entire <code>BatchWriteItem</code> operation.</p>
     *        <p>
     *        Each element consists of:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>TableName</code> - The table that consumed the provisioned throughput.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CapacityUnits</code> - The total number of capacity units consumed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemResult withConsumedCapacity(java.util.Collection<ConsumedCapacity> consumedCapacity) {
        setConsumedCapacity(consumedCapacity);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUnprocessedItems() != null)
            sb.append("UnprocessedItems: ").append(getUnprocessedItems()).append(",");
        if (getItemCollectionMetrics() != null)
            sb.append("ItemCollectionMetrics: ").append(getItemCollectionMetrics()).append(",");
        if (getConsumedCapacity() != null)
            sb.append("ConsumedCapacity: ").append(getConsumedCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchWriteItemResult == false)
            return false;
        BatchWriteItemResult other = (BatchWriteItemResult) obj;
        if (other.getUnprocessedItems() == null ^ this.getUnprocessedItems() == null)
            return false;
        if (other.getUnprocessedItems() != null && other.getUnprocessedItems().equals(this.getUnprocessedItems()) == false)
            return false;
        if (other.getItemCollectionMetrics() == null ^ this.getItemCollectionMetrics() == null)
            return false;
        if (other.getItemCollectionMetrics() != null && other.getItemCollectionMetrics().equals(this.getItemCollectionMetrics()) == false)
            return false;
        if (other.getConsumedCapacity() == null ^ this.getConsumedCapacity() == null)
            return false;
        if (other.getConsumedCapacity() != null && other.getConsumedCapacity().equals(this.getConsumedCapacity()) == false)
            return false;
        return true;
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
    public BatchWriteItemResult clone() {
        try {
            return (BatchWriteItemResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
