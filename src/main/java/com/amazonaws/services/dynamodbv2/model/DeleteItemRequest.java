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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteItem(DeleteItemRequest) DeleteItem operation}.
 * <p>
 * Deletes a single item in a table by primary key. You can perform a conditional delete operation that deletes the item if it exists, or if it has an
 * expected attribute value.
 * </p>
 * <p>
 * In addition to deleting an item, you can also return the item's attribute values in the same operation, using the <i>ReturnValues</i> parameter.
 * </p>
 * <p>
 * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent operation; running it multiple times on the same item or attribute does
 * <i>not</i> result in an error response.
 * </p>
 * <p>
 * Conditional deletes are useful for only deleting items if specific conditions are met. If those conditions are met, Amazon DynamoDB performs the
 * delete. Otherwise, the item is not deleted.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#deleteItem(DeleteItemRequest)
 */
public class DeleteItemRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table from which to delete the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     */
    private java.util.Map<String,AttributeValue> key;

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>DeleteItem</i>operation. All the conditions must be met for the
     * operation to succeed. <p><i>Expected</i> allows you to provide an
     * attribute name, and whether or not Amazon DynamoDB should check to see
     * if the attribute value already exists; or if the attribute value
     * exists and has a particular value before changing it. <p>Each item in
     * <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     * check, along with the following: <ul> <li> <p><i>Value</i> - The
     * attribute value for Amazon DynamoDB to check. </li> <li>
     * <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     * attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     * specify more than one condition for <i>Exists</i>, then all of the
     * conditions must evaluate to true. (In other words, the conditions are
     * ANDed together.) Otherwise, the conditional operation will fail.
     */
    private java.util.Map<String,ExpectedAttributeValue> expected;

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     */
    private String returnValues;

    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     */
    private String returnConsumedCapacity;

    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned..
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     */
    private String returnItemCollectionMetrics;

    /**
     * Default constructor for a new DeleteItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteItemRequest() {}
    
    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     */
    public DeleteItemRequest(String tableName, java.util.Map<String,AttributeValue> key) {
        setTableName(tableName);
        setKey(key);
    }

    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were deleted. For
     * <i>DeleteItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * The content of the old item is returned. </li> </ul>
     */
    public DeleteItemRequest(String tableName, java.util.Map<String,AttributeValue> key, String returnValues) {
        setTableName(tableName);
        setKey(key);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new DeleteItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table from which to delete the item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were deleted. For
     * <i>DeleteItem</i>, the valid values are: <ul> <li>
     * <p><code>NONE</code> - If <i>ReturnValues</i> is not specified, or if
     * its value is <code>NONE</code>, then nothing is returned. (This is the
     * default for <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> -
     * The content of the old item is returned. </li> </ul>
     */
    public DeleteItemRequest(String tableName, java.util.Map<String,AttributeValue> key, ReturnValue returnValues) {
        this.tableName = tableName;
        this.key = key;
        this.returnValues = returnValues.toString();
    }

    /**
     * The name of the table from which to delete the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table from which to delete the item.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table from which to delete the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table from which to delete the item.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table from which to delete the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table from which to delete the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     *
     * @return A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to delete.
     */
    public java.util.Map<String,AttributeValue> getKey() {
        
        return key;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to delete.
     */
    public void setKey(java.util.Map<String,AttributeValue> key) {
        this.key = key;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteItemRequest withKey(java.util.Map<String,AttributeValue> key) {
        setKey(key);
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     * <p>
     * This method accepts the hashKey, rangeKey of Key as
     * java.util.Map.Entry<String, AttributeValue> objects.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public void setKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
        java.util.HashMap<String,AttributeValue> key = new java.util.HashMap<String,AttributeValue>();
    	
    	if (hashKey != null) {
    	    key.put(hashKey.getKey(), hashKey.getValue());
    	} else
            throw new IllegalArgumentException("hashKey must be non-null object.");
    	if (rangeKey != null) {
    	    key.put(rangeKey.getKey(), rangeKey.getValue());
    	} 
        setKey(key);
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     * <p>
     * This method accepts the hashKey, rangeKey of Key as
     * java.util.Map.Entry<String, AttributeValue> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public DeleteItemRequest withKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
    	setKey(hashKey, rangeKey);
    	return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to delete.
     * <p>
     * The method adds a new key-value pair into Key parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Key.
     * @param value The corresponding value of the entry to be added into Key.
     */
	public DeleteItemRequest addKeyEntry(String key, AttributeValue value) {
		if (null == this.key) {
			this.key = new java.util.HashMap<String,AttributeValue>();
		}
		if (this.key.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.key.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Key.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public DeleteItemRequest clearKeyEntries() {
		this.key = null;
		return this;
	}
	
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>DeleteItem</i>operation. All the conditions must be met for the
     * operation to succeed. <p><i>Expected</i> allows you to provide an
     * attribute name, and whether or not Amazon DynamoDB should check to see
     * if the attribute value already exists; or if the attribute value
     * exists and has a particular value before changing it. <p>Each item in
     * <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     * check, along with the following: <ul> <li> <p><i>Value</i> - The
     * attribute value for Amazon DynamoDB to check. </li> <li>
     * <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     * attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     * specify more than one condition for <i>Exists</i>, then all of the
     * conditions must evaluate to true. (In other words, the conditions are
     * ANDed together.) Otherwise, the conditional operation will fail.
     *
     * @return A map of attribute/condition pairs. This is the conditional block for
     *         the <i>DeleteItem</i>operation. All the conditions must be met for the
     *         operation to succeed. <p><i>Expected</i> allows you to provide an
     *         attribute name, and whether or not Amazon DynamoDB should check to see
     *         if the attribute value already exists; or if the attribute value
     *         exists and has a particular value before changing it. <p>Each item in
     *         <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     *         check, along with the following: <ul> <li> <p><i>Value</i> - The
     *         attribute value for Amazon DynamoDB to check. </li> <li>
     *         <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     *         attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     *         <code>true</code>, Amazon DynamoDB will check to see if that attribute
     *         value already exists in the table. If it is found, then the operation
     *         succeeds. If it is not found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, Amazon DynamoDB assumes that the attribute
     *         value does <i>not</i> exist in the table. If in fact the value does
     *         not exist, then the assumption is valid and the operation succeeds. If
     *         the value is found, despite the assumption that it does not exist, the
     *         operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     *         </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     *         If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     *         the attribute exists: You don't have to set <i>Exists</i> to
     *         <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     *         specify more than one condition for <i>Exists</i>, then all of the
     *         conditions must evaluate to true. (In other words, the conditions are
     *         ANDed together.) Otherwise, the conditional operation will fail.
     */
    public java.util.Map<String,ExpectedAttributeValue> getExpected() {
        
        return expected;
    }
    
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>DeleteItem</i>operation. All the conditions must be met for the
     * operation to succeed. <p><i>Expected</i> allows you to provide an
     * attribute name, and whether or not Amazon DynamoDB should check to see
     * if the attribute value already exists; or if the attribute value
     * exists and has a particular value before changing it. <p>Each item in
     * <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     * check, along with the following: <ul> <li> <p><i>Value</i> - The
     * attribute value for Amazon DynamoDB to check. </li> <li>
     * <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     * attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     * specify more than one condition for <i>Exists</i>, then all of the
     * conditions must evaluate to true. (In other words, the conditions are
     * ANDed together.) Otherwise, the conditional operation will fail.
     *
     * @param expected A map of attribute/condition pairs. This is the conditional block for
     *         the <i>DeleteItem</i>operation. All the conditions must be met for the
     *         operation to succeed. <p><i>Expected</i> allows you to provide an
     *         attribute name, and whether or not Amazon DynamoDB should check to see
     *         if the attribute value already exists; or if the attribute value
     *         exists and has a particular value before changing it. <p>Each item in
     *         <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     *         check, along with the following: <ul> <li> <p><i>Value</i> - The
     *         attribute value for Amazon DynamoDB to check. </li> <li>
     *         <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     *         attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     *         <code>true</code>, Amazon DynamoDB will check to see if that attribute
     *         value already exists in the table. If it is found, then the operation
     *         succeeds. If it is not found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, Amazon DynamoDB assumes that the attribute
     *         value does <i>not</i> exist in the table. If in fact the value does
     *         not exist, then the assumption is valid and the operation succeeds. If
     *         the value is found, despite the assumption that it does not exist, the
     *         operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     *         </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     *         If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     *         the attribute exists: You don't have to set <i>Exists</i> to
     *         <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     *         specify more than one condition for <i>Exists</i>, then all of the
     *         conditions must evaluate to true. (In other words, the conditions are
     *         ANDed together.) Otherwise, the conditional operation will fail.
     */
    public void setExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        this.expected = expected;
    }
    
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>DeleteItem</i>operation. All the conditions must be met for the
     * operation to succeed. <p><i>Expected</i> allows you to provide an
     * attribute name, and whether or not Amazon DynamoDB should check to see
     * if the attribute value already exists; or if the attribute value
     * exists and has a particular value before changing it. <p>Each item in
     * <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     * check, along with the following: <ul> <li> <p><i>Value</i> - The
     * attribute value for Amazon DynamoDB to check. </li> <li>
     * <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     * attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     * specify more than one condition for <i>Exists</i>, then all of the
     * conditions must evaluate to true. (In other words, the conditions are
     * ANDed together.) Otherwise, the conditional operation will fail.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expected A map of attribute/condition pairs. This is the conditional block for
     *         the <i>DeleteItem</i>operation. All the conditions must be met for the
     *         operation to succeed. <p><i>Expected</i> allows you to provide an
     *         attribute name, and whether or not Amazon DynamoDB should check to see
     *         if the attribute value already exists; or if the attribute value
     *         exists and has a particular value before changing it. <p>Each item in
     *         <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     *         check, along with the following: <ul> <li> <p><i>Value</i> - The
     *         attribute value for Amazon DynamoDB to check. </li> <li>
     *         <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     *         attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     *         <code>true</code>, Amazon DynamoDB will check to see if that attribute
     *         value already exists in the table. If it is found, then the operation
     *         succeeds. If it is not found, the operation fails with a
     *         <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     *         is <code>false</code>, Amazon DynamoDB assumes that the attribute
     *         value does <i>not</i> exist in the table. If in fact the value does
     *         not exist, then the assumption is valid and the operation succeeds. If
     *         the value is found, despite the assumption that it does not exist, the
     *         operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     *         </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     *         If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     *         the attribute exists: You don't have to set <i>Exists</i> to
     *         <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     *         <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     *         <code>true</code> but there is no <i>Value</i> to check. (You expect a
     *         value to exist, but don't specify what that value is.) </li> <li>
     *         <p><i>Exists</i> is <code>false</code> but you also specify a
     *         <i>Value</i>. (You cannot expect an attribute to have a value, while
     *         also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     *         specify more than one condition for <i>Exists</i>, then all of the
     *         conditions must evaluate to true. (In other words, the conditions are
     *         ANDed together.) Otherwise, the conditional operation will fail.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>DeleteItem</i>operation. All the conditions must be met for the
     * operation to succeed. <p><i>Expected</i> allows you to provide an
     * attribute name, and whether or not Amazon DynamoDB should check to see
     * if the attribute value already exists; or if the attribute value
     * exists and has a particular value before changing it. <p>Each item in
     * <i>Expected</i> represents an attribute name for Amazon DynamoDB to
     * check, along with the following: <ul> <li> <p><i>Value</i> - The
     * attribute value for Amazon DynamoDB to check. </li> <li>
     * <p><i>Exists</i> - Causes Amazon DynamoDB to evaluate the value before
     * attempting a conditional operation: <ul> <li> <p>If <i>Exists</i> is
     * <code>true</code>, Amazon DynamoDB will check to see if that attribute
     * value already exists in the table. If it is found, then the operation
     * succeeds. If it is not found, the operation fails with a
     * <i>ConditionalCheckFailedException</i>. </li> <li> <p>If <i>Exists</i>
     * is <code>false</code>, Amazon DynamoDB assumes that the attribute
     * value does <i>not</i> exist in the table. If in fact the value does
     * not exist, then the assumption is valid and the operation succeeds. If
     * the value is found, despite the assumption that it does not exist, the
     * operation fails with a <i>ConditionalCheckFailedException</i>. </li>
     * </ul> <p>The default setting for <i>Exists</i> is <code>true</code>.
     * If you supply a <i>Value</i> all by itself, Amazon DynamoDB assumes
     * the attribute exists: You don't have to set <i>Exists</i> to
     * <code>true</code>, because it is implied. <p>Amazon DynamoDB returns a
     * <i>ValidationException</i> if: <ul> <li> <p><i>Exists</i> is
     * <code>true</code> but there is no <i>Value</i> to check. (You expect a
     * value to exist, but don't specify what that value is.) </li> <li>
     * <p><i>Exists</i> is <code>false</code> but you also specify a
     * <i>Value</i>. (You cannot expect an attribute to have a value, while
     * also expecting it not to exist.) </li> </ul> </li> </ul> <p>If you
     * specify more than one condition for <i>Exists</i>, then all of the
     * conditions must evaluate to true. (In other words, the conditions are
     * ANDed together.) Otherwise, the conditional operation will fail.
     * <p>
     * The method adds a new key-value pair into Expected parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Expected.
     * @param value The corresponding value of the entry to be added into Expected.
     */
	public DeleteItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
		if (null == this.expected) {
			this.expected = new java.util.HashMap<String,ExpectedAttributeValue>();
		}
		if (this.expected.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.expected.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Expected.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public DeleteItemRequest clearExpectedEntries() {
		this.expected = null;
		return this;
	}
	
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     *         <p><code>ALL_OLD</code> - The content of the old item is returned.
     *         </li> </ul>
     *
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     *         <p><code>ALL_OLD</code> - The content of the old item is returned.
     *         </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     *         <p><code>ALL_OLD</code> - The content of the old item is returned.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     *         <p><code>ALL_OLD</code> - The content of the old item is returned.
     *         </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were deleted. For <i>DeleteItem</i>, the valid
     * values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     * not specified, or if its value is <code>NONE</code>, then nothing is
     * returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - The content of the old item is returned.
     * </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were deleted. For <i>DeleteItem</i>, the valid
     *         values are: <ul> <li> <p><code>NONE</code> - If <i>ReturnValues</i> is
     *         not specified, or if its value is <code>NONE</code>, then nothing is
     *         returned. (This is the default for <i>ReturnValues</i>.) </li> <li>
     *         <p><code>ALL_OLD</code> - The content of the old item is returned.
     *         </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public DeleteItemRequest withReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
        return this;
    }

    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @return If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @see ReturnConsumedCapacity
     */
    public String getReturnConsumedCapacity() {
        return returnConsumedCapacity;
    }
    
    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
    }
    
    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnConsumedCapacity
     */
    public DeleteItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity;
        return this;
    }

    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @see ReturnConsumedCapacity
     */
    public void setReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
    }
    
    /**
     * If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     * the response; if set to <code>NONE</code> (the default),
     * <i>ConsumedCapacity</i> is not included.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOTAL, NONE
     *
     * @param returnConsumedCapacity If set to <code>TOTAL</code>, <i>ConsumedCapacity</i> is included in
     *         the response; if set to <code>NONE</code> (the default),
     *         <i>ConsumedCapacity</i> is not included.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnConsumedCapacity
     */
    public DeleteItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned..
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @return If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned..
     *
     * @see ReturnItemCollectionMetrics
     */
    public String getReturnItemCollectionMetrics() {
        return returnItemCollectionMetrics;
    }
    
    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned..
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned..
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
    }
    
    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned..
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnItemCollectionMetrics
     */
    public DeleteItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics;
        return this;
    }

    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned..
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned..
     *
     * @see ReturnItemCollectionMetrics
     */
    public void setReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        this.returnItemCollectionMetrics = returnItemCollectionMetrics.toString();
    }
    
    /**
     * If set to <code>SIZE</code>, statistics about item collections, if
     * any, that were modified during the operation are returned in the
     * response. If set to <code>NONE</code> (the default), no statistics are
     * returned..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SIZE, NONE
     *
     * @param returnItemCollectionMetrics If set to <code>SIZE</code>, statistics about item collections, if
     *         any, that were modified during the operation are returned in the
     *         response. If set to <code>NONE</code> (the default), no statistics are
     *         returned..
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnItemCollectionMetrics
     */
    public DeleteItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
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
        if (getTableName() != null) sb.append("TableName: " + getTableName() + ",");
        if (getKey() != null) sb.append("Key: " + getKey() + ",");
        if (getExpected() != null) sb.append("Expected: " + getExpected() + ",");
        if (getReturnValues() != null) sb.append("ReturnValues: " + getReturnValues() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getReturnItemCollectionMetrics() != null) sb.append("ReturnItemCollectionMetrics: " + getReturnItemCollectionMetrics() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getExpected() == null) ? 0 : getExpected().hashCode()); 
        hashCode = prime * hashCode + ((getReturnValues() == null) ? 0 : getReturnValues().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getReturnItemCollectionMetrics() == null) ? 0 : getReturnItemCollectionMetrics().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteItemRequest == false) return false;
        DeleteItemRequest other = (DeleteItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getExpected() == null ^ this.getExpected() == null) return false;
        if (other.getExpected() != null && other.getExpected().equals(this.getExpected()) == false) return false; 
        if (other.getReturnValues() == null ^ this.getReturnValues() == null) return false;
        if (other.getReturnValues() != null && other.getReturnValues().equals(this.getReturnValues()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getReturnItemCollectionMetrics() == null ^ this.getReturnItemCollectionMetrics() == null) return false;
        if (other.getReturnItemCollectionMetrics() != null && other.getReturnItemCollectionMetrics().equals(this.getReturnItemCollectionMetrics()) == false) return false; 
        return true;
    }
    
}
    