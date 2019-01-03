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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <code>BatchWriteItem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/BatchWriteItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchWriteItemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of operations to be performed (
     * <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the following:
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
     * consists of an attribute name and an attribute value. For each primary key, you must provide <i>all</i> of the
     * key attributes. For example, with a simple primary key, you only need to provide a value for the partition key.
     * For a composite primary key, you must provide values for <i>both</i> the partition key and the sort key.
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
     */
    private java.util.Map<String, java.util.List<WriteRequest>> requestItems;

    private String returnConsumedCapacity;
    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     */
    private String returnItemCollectionMetrics;

    /**
     * Default constructor for BatchWriteItemRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public BatchWriteItemRequest() {
    }

    /**
     * Constructs a new BatchWriteItemRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a list of operations to be performed (
     *        <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the
     *        following:</p>
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
     *        this map consists of an attribute name and an attribute value. For each primary key, you must provide
     *        <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide a value
     *        for the partition key. For a composite primary key, you must provide values for <i>both</i> the partition
     *        key and the sort key.
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
     */
    public BatchWriteItemRequest(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        setRequestItems(requestItems);
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of operations to be performed (
     * <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the following:
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
     * consists of an attribute name and an attribute value. For each primary key, you must provide <i>all</i> of the
     * key attributes. For example, with a simple primary key, you only need to provide a value for the partition key.
     * For a composite primary key, you must provide values for <i>both</i> the partition key and the sort key.
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
     * 
     * @return A map of one or more table names and, for each table, a list of operations to be performed (
     *         <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the
     *         following:</p>
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
     *         this map consists of an attribute name and an attribute value. For each primary key, you must provide
     *         <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide a
     *         value for the partition key. For a composite primary key, you must provide values for <i>both</i> the
     *         partition key and the sort key.
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
     */

    public java.util.Map<String, java.util.List<WriteRequest>> getRequestItems() {
        return requestItems;
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of operations to be performed (
     * <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the following:
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
     * consists of an attribute name and an attribute value. For each primary key, you must provide <i>all</i> of the
     * key attributes. For example, with a simple primary key, you only need to provide a value for the partition key.
     * For a composite primary key, you must provide values for <i>both</i> the partition key and the sort key.
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
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a list of operations to be performed (
     *        <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the
     *        following:</p>
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
     *        this map consists of an attribute name and an attribute value. For each primary key, you must provide
     *        <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide a value
     *        for the partition key. For a composite primary key, you must provide values for <i>both</i> the partition
     *        key and the sort key.
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
     */

    public void setRequestItems(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        this.requestItems = requestItems;
    }

    /**
     * <p>
     * A map of one or more table names and, for each table, a list of operations to be performed (
     * <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the following:
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
     * consists of an attribute name and an attribute value. For each primary key, you must provide <i>all</i> of the
     * key attributes. For example, with a simple primary key, you only need to provide a value for the partition key.
     * For a composite primary key, you must provide values for <i>both</i> the partition key and the sort key.
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
     * 
     * @param requestItems
     *        A map of one or more table names and, for each table, a list of operations to be performed (
     *        <code>DeleteRequest</code> or <code>PutRequest</code>). Each element in the map consists of the
     *        following:</p>
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
     *        this map consists of an attribute name and an attribute value. For each primary key, you must provide
     *        <i>all</i> of the key attributes. For example, with a simple primary key, you only need to provide a value
     *        for the partition key. For a composite primary key, you must provide values for <i>both</i> the partition
     *        key and the sort key.
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
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemRequest withRequestItems(java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        setRequestItems(requestItems);
        return this;
    }

    public BatchWriteItemRequest addRequestItemsEntry(String key, java.util.List<WriteRequest> value) {
        if (null == this.requestItems) {
            this.requestItems = new java.util.HashMap<String, java.util.List<WriteRequest>>();
        }
        if (this.requestItems.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestItems.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestItems.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchWriteItemRequest clearRequestItemsEntries() {
        this.requestItems = null;
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }

    /**
     * @return
     * @see ReturnConsumedCapacity
     */

    public String getReturnConsumedCapacity() {
        return this.returnConsumedCapacity;
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public BatchWriteItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    /**
     * @param returnConsumedCapacity
     * @see ReturnConsumedCapacity
     */

    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        withReturnConsumedCapacity(returnConsumedCapacity);
    }

    /**
     * @param returnConsumedCapacity
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnConsumedCapacity
     */

    public BatchWriteItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @return Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *         includes statistics about item collections, if any, that were modified during the operation are returned
     *         in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public String getReturnItemCollectionMetrics() {
        return this.returnItemCollectionMetrics;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnItemCollectionMetrics
     */

    public BatchWriteItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @see ReturnItemCollectionMetrics
     */

    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        withReturnItemCollectionMetrics(returnItemCollectionMetrics);
    }

    /**
     * <p>
     * Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response includes
     * statistics about item collections, if any, that were modified during the operation are returned in the response.
     * If set to <code>NONE</code> (the default), no statistics are returned.
     * </p>
     * 
     * @param returnItemCollectionMetrics
     *        Determines whether item collection metrics are returned. If set to <code>SIZE</code>, the response
     *        includes statistics about item collections, if any, that were modified during the operation are returned
     *        in the response. If set to <code>NONE</code> (the default), no statistics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReturnItemCollectionMetrics
     */

    public BatchWriteItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
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
        if (getRequestItems() != null)
            sb.append("RequestItems: ").append(getRequestItems()).append(",");
        if (getReturnConsumedCapacity() != null)
            sb.append("ReturnConsumedCapacity: ").append(getReturnConsumedCapacity()).append(",");
        if (getReturnItemCollectionMetrics() != null)
            sb.append("ReturnItemCollectionMetrics: ").append(getReturnItemCollectionMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchWriteItemRequest == false)
            return false;
        BatchWriteItemRequest other = (BatchWriteItemRequest) obj;
        if (other.getRequestItems() == null ^ this.getRequestItems() == null)
            return false;
        if (other.getRequestItems() != null && other.getRequestItems().equals(this.getRequestItems()) == false)
            return false;
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null)
            return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false)
            return false;
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null)
            return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false)
            return false;
        return true;
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
    public BatchWriteItemRequest clone() {
        return (BatchWriteItemRequest) super.clone();
    }

}
