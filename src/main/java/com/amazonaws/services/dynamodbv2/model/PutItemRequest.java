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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#putItem(PutItemRequest) PutItem operation}.
 * <p>
 * Creates a new item, or replaces an old item with a new item. If an item already exists in the specified table with the same primary key, the new item
 * completely replaces the existing item. You can perform a conditional put (insert a new item if one with the specified primary key doesn't exist), or
 * replace an existing item if it has certain attribute values.
 * </p>
 * <p>
 * In addition to putting an item, you can also return the item's attribute values in the same operation, using the <i>ReturnValues</i> parameter.
 * </p>
 * <p>
 * When you add an item, the primary key attribute(s) are the only required attributes. Attribute values cannot be null. String and binary type
 * attributes must have lengths greater than zero. Set type attributes cannot be empty. Requests with empty values will be rejected with a
 * <i>ValidationException</i> .
 * </p>
 * <p>
 * You can request that <i>PutItem</i> return either a copy of the old item (before the update) or a copy of the new item (after the update). For more
 * information, see the <i>ReturnValues</i> description.
 * </p>
 * <p>
 * <b>NOTE:</b> To prevent a new item from replacing an existing item, use a conditional put operation with Exists set to false for the primary key
 * attribute, or attributes.
 * </p>
 * <p>
 * For more information about using this API, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithDDItems.html">
 * Working with Items </a> in the Amazon DynamoDB Developer Guide.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#putItem(PutItemRequest)
 */
public class PutItemRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table to contain the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    private java.util.Map<String,AttributeValue> item;

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. All the conditions must be met for the
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
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
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
     * Default constructor for a new PutItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public PutItemRequest() {}
    
    /**
     * Constructs a new PutItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    public PutItemRequest(String tableName, java.util.Map<String,AttributeValue> item) {
        setTableName(tableName);
        setItem(item);
    }

    /**
     * Constructs a new PutItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are: <ul>
     * <li> <p><code>NONE</code> - If <i>ReturnValues</i> is not specified,
     * or if its value is <code>NONE</code>, then nothing is returned. (This
     * is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute
     * name-value pair, then the content of the old item is returned. </li>
     * </ul>
     */
    public PutItemRequest(String tableName, java.util.Map<String,AttributeValue> item, String returnValues) {
        setTableName(tableName);
        setItem(item);
        setReturnValues(returnValues);
    }

    /**
     * Constructs a new PutItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table to contain the item.
     * @param item A map of attribute name/value pairs, one for each
     * attribute. Only the primary key attributes are required; you can
     * optionally provide other attribute name-value pairs for the item.
     * <p>If you specify any attributes that are part of an index key, then
     * the data types for those attributes must match those of the schema in
     * the table's attribute definition. <p>For more information about
     * primary keys, see <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * @param returnValues Use <i>ReturnValues</i> if you want to get the
     * item attributes as they appeared before they were updated with the
     * <i>PutItem</i> request. For <i>PutItem</i>, the valid values are: <ul>
     * <li> <p><code>NONE</code> - If <i>ReturnValues</i> is not specified,
     * or if its value is <code>NONE</code>, then nothing is returned. (This
     * is the default for <i>ReturnValues</i>.) </li> <li>
     * <p><code>ALL_OLD</code> - If <i>PutItem</i> overwrote an attribute
     * name-value pair, then the content of the old item is returned. </li>
     * </ul>
     */
    public PutItemRequest(String tableName, java.util.Map<String,AttributeValue> item, ReturnValue returnValues) {
        this.tableName = tableName;
        this.item = item;
        this.returnValues = returnValues.toString();
    }

    /**
     * The name of the table to contain the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table to contain the item.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table to contain the item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to contain the item.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table to contain the item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table to contain the item.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     *
     * @return A map of attribute name/value pairs, one for each attribute. Only the
     *         primary key attributes are required; you can optionally provide other
     *         attribute name-value pairs for the item. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition. <p>For more information about primary keys, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     *         Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     *         <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    public java.util.Map<String,AttributeValue> getItem() {
        
        return item;
    }
    
    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     *
     * @param item A map of attribute name/value pairs, one for each attribute. Only the
     *         primary key attributes are required; you can optionally provide other
     *         attribute name-value pairs for the item. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition. <p>For more information about primary keys, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     *         Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     *         <i>Item</i> map is an <i>AttributeValue</i> object.
     */
    public void setItem(java.util.Map<String,AttributeValue> item) {
        this.item = item;
    }
    
    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param item A map of attribute name/value pairs, one for each attribute. Only the
     *         primary key attributes are required; you can optionally provide other
     *         attribute name-value pairs for the item. <p>If you specify any
     *         attributes that are part of an index key, then the data types for
     *         those attributes must match those of the schema in the table's
     *         attribute definition. <p>For more information about primary keys, see
     *         <a
     *         href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     *         Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     *         <i>Item</i> map is an <i>AttributeValue</i> object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PutItemRequest withItem(java.util.Map<String,AttributeValue> item) {
        setItem(item);
        return this;
    }

    /**
     * A map of attribute name/value pairs, one for each attribute. Only the
     * primary key attributes are required; you can optionally provide other
     * attribute name-value pairs for the item. <p>If you specify any
     * attributes that are part of an index key, then the data types for
     * those attributes must match those of the schema in the table's
     * attribute definition. <p>For more information about primary keys, see
     * <a
     * href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DataModel.html#DataModelPrimaryKey">Primary
     * Key</a> in the Amazon DynamoDB Developer Guide. <p>Each element in the
     * <i>Item</i> map is an <i>AttributeValue</i> object.
     * <p>
     * The method adds a new key-value pair into Item parameter, and returns
     * a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Item.
     * @param value The corresponding value of the entry to be added into Item.
     */
	public PutItemRequest addItemEntry(String key, AttributeValue value) {
		if (null == this.item) {
			this.item = new java.util.HashMap<String,AttributeValue>();
		}
		if (this.item.containsKey(key))
			throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
		this.item.put(key, value);
		return this;
	}

	/**
	 * Removes all the entries added into Item.
	 * <p>
	 * Returns a reference to this object so that method calls can be chained together.
	 */
	public PutItemRequest clearItemEntries() {
		this.item = null;
		return this;
	}
	
    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. All the conditions must be met for the
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
     *         the <i>PutItem</i> operation. All the conditions must be met for the
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
     * the <i>PutItem</i> operation. All the conditions must be met for the
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
     *         the <i>PutItem</i> operation. All the conditions must be met for the
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
     * the <i>PutItem</i> operation. All the conditions must be met for the
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
     *         the <i>PutItem</i> operation. All the conditions must be met for the
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
    public PutItemRequest withExpected(java.util.Map<String,ExpectedAttributeValue> expected) {
        setExpected(expected);
        return this;
    }

    /**
     * A map of attribute/condition pairs. This is the conditional block for
     * the <i>PutItem</i> operation. All the conditions must be met for the
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
	public PutItemRequest addExpectedEntry(String key, ExpectedAttributeValue value) {
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
	public PutItemRequest clearExpectedEntries() {
		this.expected = null;
		return this;
	}
	
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @return Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public String getReturnValues() {
        return returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(String returnValues) {
        this.returnValues = returnValues;
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public PutItemRequest withReturnValues(String returnValues) {
        this.returnValues = returnValues;
        return this;
    }

    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @see ReturnValue
     */
    public void setReturnValues(ReturnValue returnValues) {
        this.returnValues = returnValues.toString();
    }
    
    /**
     * Use <i>ReturnValues</i> if you want to get the item attributes as they
     * appeared before they were updated with the <i>PutItem</i> request. For
     * <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     * If <i>ReturnValues</i> is not specified, or if its value is
     * <code>NONE</code>, then nothing is returned. (This is the default for
     * <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     * <i>PutItem</i> overwrote an attribute name-value pair, then the
     * content of the old item is returned. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, ALL_OLD, UPDATED_OLD, ALL_NEW, UPDATED_NEW
     *
     * @param returnValues Use <i>ReturnValues</i> if you want to get the item attributes as they
     *         appeared before they were updated with the <i>PutItem</i> request. For
     *         <i>PutItem</i>, the valid values are: <ul> <li> <p><code>NONE</code> -
     *         If <i>ReturnValues</i> is not specified, or if its value is
     *         <code>NONE</code>, then nothing is returned. (This is the default for
     *         <i>ReturnValues</i>.) </li> <li> <p><code>ALL_OLD</code> - If
     *         <i>PutItem</i> overwrote an attribute name-value pair, then the
     *         content of the old item is returned. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ReturnValue
     */
    public PutItemRequest withReturnValues(ReturnValue returnValues) {
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
    public PutItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public PutItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
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
    public PutItemRequest withReturnItemCollectionMetrics(String returnItemCollectionMetrics) {
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
    public PutItemRequest withReturnItemCollectionMetrics(ReturnItemCollectionMetrics returnItemCollectionMetrics) {
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
        if (getItem() != null) sb.append("Item: " + getItem() + ",");
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
        hashCode = prime * hashCode + ((getItem() == null) ? 0 : getItem().hashCode()); 
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

        if (obj instanceof PutItemRequest == false) return false;
        PutItemRequest other = (PutItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getItem() == null ^ this.getItem() == null) return false;
        if (other.getItem() != null && other.getItem().equals(this.getItem()) == false) return false; 
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
    