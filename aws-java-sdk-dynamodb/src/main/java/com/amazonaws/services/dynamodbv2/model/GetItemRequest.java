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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodbv2.AmazonDynamoDB#getItem(GetItemRequest) GetItem operation}.
 * <p>
 * The <i>GetItem</i> operation returns a set of attributes for the item
 * with the given primary key. If there is no matching item,
 * <i>GetItem</i> does not return any data.
 * </p>
 * <p>
 * <i>GetItem</i> provides an eventually consistent read by default. If
 * your application requires a strongly consistent read, set
 * <i>ConsistentRead</i> to <code>true</code> . Although a strongly
 * consistent read might take more time than an eventually consistent
 * read, it always returns the last updated value.
 * </p>
 *
 * @see com.amazonaws.services.dynamodbv2.AmazonDynamoDB#getItem(GetItemRequest)
 */
public class GetItemRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the table containing the requested item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     */
    private java.util.Map<String,AttributeValue> key;

    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGet;

    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used.
     */
    private Boolean consistentRead;

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
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     */
    private String projectionExpression;

    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     */
    private java.util.Map<String,String> expressionAttributeNames;

    /**
     * Default constructor for a new GetItemRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetItemRequest() {}
    
    /**
     * Constructs a new GetItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the requested item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     */
    public GetItemRequest(String tableName, java.util.Map<String,AttributeValue> key) {
        setTableName(tableName);
        setKey(key);
    }

    /**
     * Constructs a new GetItemRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table containing the requested item.
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * @param consistentRead A value that if set to <code>true</code>, then
     * the operation uses strongly consistent reads; otherwise, eventually
     * consistent reads are used.
     */
    public GetItemRequest(String tableName, java.util.Map<String,AttributeValue> key, Boolean consistentRead) {
        setTableName(tableName);
        setKey(key);
        setConsistentRead(consistentRead);
    }

    /**
     * The name of the table containing the requested item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table containing the requested item.
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table containing the requested item.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the requested item.
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table containing the requested item.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table containing the requested item.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetItemRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     *
     * @return A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to retrieve. <p>For the
     *         primary key, you must provide all of the attributes. For example, with
     *         a hash type primary key, you only need to specify the hash attribute.
     *         For a hash-and-range type primary key, you must specify both the hash
     *         attribute and the range attribute.
     */
    public java.util.Map<String,AttributeValue> getKey() {
        
        return key;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to retrieve. <p>For the
     *         primary key, you must provide all of the attributes. For example, with
     *         a hash type primary key, you only need to specify the hash attribute.
     *         For a hash-and-range type primary key, you must specify both the hash
     *         attribute and the range attribute.
     */
    public void setKey(java.util.Map<String,AttributeValue> key) {
        this.key = key;
    }
    
    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param key A map of attribute names to <i>AttributeValue</i> objects,
     *         representing the primary key of the item to retrieve. <p>For the
     *         primary key, you must provide all of the attributes. For example, with
     *         a hash type primary key, you only need to specify the hash attribute.
     *         For a hash-and-range type primary key, you must specify both the hash
     *         attribute and the range attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetItemRequest withKey(java.util.Map<String,AttributeValue> key) {
        setKey(key);
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
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
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * <p>
     * This method accepts the hashKey, rangeKey of Key as
     * java.util.Map.Entry<String, AttributeValue> objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKey Primary hash key.
     * @param rangeKey Primary range key. (null if it a hash-only table)
     */
    public GetItemRequest withKey(java.util.Map.Entry<String, AttributeValue> hashKey, java.util.Map.Entry<String, AttributeValue> rangeKey) throws IllegalArgumentException {
        setKey(hashKey, rangeKey);
        return this;
    }

    /**
     * A map of attribute names to <i>AttributeValue</i> objects,
     * representing the primary key of the item to retrieve. <p>For the
     * primary key, you must provide all of the attributes. For example, with
     * a hash type primary key, you only need to specify the hash attribute.
     * For a hash-and-range type primary key, you must specify both the hash
     * attribute and the range attribute.
     * <p>
     * The method adds a new key-value pair into Key parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Key.
     * @param value The corresponding value of the entry to be added into Key.
     */
    public GetItemRequest addKeyEntry(String key, AttributeValue value) {
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
    public GetItemRequest clearKeyEntries() {
        this.key = null;
        return this;
    }
    
    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application.
     */
    public java.util.List<String> getAttributesToGet() {
        return attributesToGet;
    }
    
    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetItemRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * <important><p>There is a newer parameter available. Use
     * <i>ProjectionExpression</i> instead. Note that if you use
     * <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     * time, DynamoDB will return a <i>ValidationException</i> exception.
     * <p>This parameter allows you to retrieve lists or maps; however, it
     * cannot retrieve individual list or map elements.</important> <p>The
     * names of one or more attributes to retrieve. If no attribute names are
     * specified, then all attributes will be returned. If any of the
     * requested attributes are not found, they will not appear in the
     * result. <p>Note that <i>AttributesToGet</i> has no effect on
     * provisioned throughput consumption. DynamoDB determines capacity units
     * consumed based on item size, not on the amount of data that is
     * returned to an application.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet <important><p>There is a newer parameter available. Use
     *         <i>ProjectionExpression</i> instead. Note that if you use
     *         <i>AttributesToGet</i> and <i>ProjectionExpression</i> at the same
     *         time, DynamoDB will return a <i>ValidationException</i> exception.
     *         <p>This parameter allows you to retrieve lists or maps; however, it
     *         cannot retrieve individual list or map elements.</important> <p>The
     *         names of one or more attributes to retrieve. If no attribute names are
     *         specified, then all attributes will be returned. If any of the
     *         requested attributes are not found, they will not appear in the
     *         result. <p>Note that <i>AttributesToGet</i> has no effect on
     *         provisioned throughput consumption. DynamoDB determines capacity units
     *         consumed based on item size, not on the amount of data that is
     *         returned to an application.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetItemRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> attributesToGetCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }

    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used.
     *
     * @return A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used.
     *
     * @param consistentRead A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetItemRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * A value that if set to <code>true</code>, then the operation uses
     * strongly consistent reads; otherwise, eventually consistent reads are
     * used.
     *
     * @return A value that if set to <code>true</code>, then the operation uses
     *         strongly consistent reads; otherwise, eventually consistent reads are
     *         used.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
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
    public GetItemRequest withReturnConsumedCapacity(String returnConsumedCapacity) {
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
    public GetItemRequest withReturnConsumedCapacity(ReturnConsumedCapacity returnConsumedCapacity) {
        this.returnConsumedCapacity = returnConsumedCapacity.toString();
        return this;
    }

    /**
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     *
     * @return One or more attributes to retrieve from the table. These attributes
     *         can include scalars, sets, or elements of a JSON document. The
     *         attributes in the expression must be separated by commas. <p>If no
     *         attribute names are specified, then all attributes will be returned.
     *         If any of the requested attributes are not found, they will not appear
     *         in the result.
     */
    public String getProjectionExpression() {
        return projectionExpression;
    }
    
    /**
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     *
     * @param projectionExpression One or more attributes to retrieve from the table. These attributes
     *         can include scalars, sets, or elements of a JSON document. The
     *         attributes in the expression must be separated by commas. <p>If no
     *         attribute names are specified, then all attributes will be returned.
     *         If any of the requested attributes are not found, they will not appear
     *         in the result.
     */
    public void setProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
    }
    
    /**
     * One or more attributes to retrieve from the table. These attributes
     * can include scalars, sets, or elements of a JSON document. The
     * attributes in the expression must be separated by commas. <p>If no
     * attribute names are specified, then all attributes will be returned.
     * If any of the requested attributes are not found, they will not appear
     * in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param projectionExpression One or more attributes to retrieve from the table. These attributes
     *         can include scalars, sets, or elements of a JSON document. The
     *         attributes in the expression must be separated by commas. <p>If no
     *         attribute names are specified, then all attributes will be returned.
     *         If any of the requested attributes are not found, they will not appear
     *         in the result.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetItemRequest withProjectionExpression(String projectionExpression) {
        this.projectionExpression = projectionExpression;
        return this;
    }

    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     *
     * @return One or more substitution tokens for simplifying complex expressions.
     *         The following are some use cases for an
     *         <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     *         attribute name that is very long or unwieldy in an expression. </li>
     *         <li> <p>To create a placeholder for repeating occurrences of an
     *         attribute name in an expression. </li> <li> <p>To prevent special
     *         characters in an attribute name from being misinterpreted in an
     *         expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     *         to dereference an attribute name. For example, consider the following
     *         expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     *         order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     *         that you specified the following for <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     *         <p>The expression can now be simplified as follows:
     *         <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     */
    public java.util.Map<String,String> getExpressionAttributeNames() {
        
        return expressionAttributeNames;
    }
    
    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     *
     * @param expressionAttributeNames One or more substitution tokens for simplifying complex expressions.
     *         The following are some use cases for an
     *         <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     *         attribute name that is very long or unwieldy in an expression. </li>
     *         <li> <p>To create a placeholder for repeating occurrences of an
     *         attribute name in an expression. </li> <li> <p>To prevent special
     *         characters in an attribute name from being misinterpreted in an
     *         expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     *         to dereference an attribute name. For example, consider the following
     *         expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     *         order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     *         that you specified the following for <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     *         <p>The expression can now be simplified as follows:
     *         <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     */
    public void setExpressionAttributeNames(java.util.Map<String,String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }
    
    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param expressionAttributeNames One or more substitution tokens for simplifying complex expressions.
     *         The following are some use cases for an
     *         <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     *         attribute name that is very long or unwieldy in an expression. </li>
     *         <li> <p>To create a placeholder for repeating occurrences of an
     *         attribute name in an expression. </li> <li> <p>To prevent special
     *         characters in an attribute name from being misinterpreted in an
     *         expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     *         to dereference an attribute name. For example, consider the following
     *         expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     *         order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     *         that you specified the following for <i>ExpressionAttributeNames</i>:
     *         <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     *         <p>The expression can now be simplified as follows:
     *         <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetItemRequest withExpressionAttributeNames(java.util.Map<String,String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    /**
     * One or more substitution tokens for simplifying complex expressions.
     * The following are some use cases for an
     * <i>ExpressionAttributeNames</i> value: <ul> <li> <p>To shorten an
     * attribute name that is very long or unwieldy in an expression. </li>
     * <li> <p>To create a placeholder for repeating occurrences of an
     * attribute name in an expression. </li> <li> <p>To prevent special
     * characters in an attribute name from being misinterpreted in an
     * expression. </li> </ul> <p>Use the <b>#</b> character in an expression
     * to dereference an attribute name. For example, consider the following
     * expression: <ul><li><p><code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li></ul> <p>Now suppose
     * that you specified the following for <i>ExpressionAttributeNames</i>:
     * <ul><li><p><code>{"n":"order.customerInfo.LastName"}</code></li></ul>
     * <p>The expression can now be simplified as follows:
     * <ul><li><p><code>#n = "Smith" OR #n = "Jones"</code></li></ul>
     * <p>
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into ExpressionAttributeNames.
     * @param value The corresponding value of the entry to be added into ExpressionAttributeNames.
     */
    public GetItemRequest addExpressionAttributeNamesEntry(String key, String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String,String>();
        }
        if (this.expressionAttributeNames.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     */
    public GetItemRequest clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
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
        if (getAttributesToGet() != null) sb.append("AttributesToGet: " + getAttributesToGet() + ",");
        if (isConsistentRead() != null) sb.append("ConsistentRead: " + isConsistentRead() + ",");
        if (getReturnConsumedCapacity() != null) sb.append("ReturnConsumedCapacity: " + getReturnConsumedCapacity() + ",");
        if (getProjectionExpression() != null) sb.append("ProjectionExpression: " + getProjectionExpression() + ",");
        if (getExpressionAttributeNames() != null) sb.append("ExpressionAttributeNames: " + getExpressionAttributeNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        hashCode = prime * hashCode + ((getReturnConsumedCapacity() == null) ? 0 : getReturnConsumedCapacity().hashCode()); 
        hashCode = prime * hashCode + ((getProjectionExpression() == null) ? 0 : getProjectionExpression().hashCode()); 
        hashCode = prime * hashCode + ((getExpressionAttributeNames() == null) ? 0 : getExpressionAttributeNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetItemRequest == false) return false;
        GetItemRequest other = (GetItemRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getKey() == null ^ this.getKey() == null) return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        if (other.getReturnConsumedCapacity() == null ^ this.getReturnConsumedCapacity() == null) return false;
        if (other.getReturnConsumedCapacity() != null && other.getReturnConsumedCapacity().equals(this.getReturnConsumedCapacity()) == false) return false; 
        if (other.getProjectionExpression() == null ^ this.getProjectionExpression() == null) return false;
        if (other.getProjectionExpression() != null && other.getProjectionExpression().equals(this.getProjectionExpression()) == false) return false; 
        if (other.getExpressionAttributeNames() == null ^ this.getExpressionAttributeNames() == null) return false;
        if (other.getExpressionAttributeNames() != null && other.getExpressionAttributeNames().equals(this.getExpressionAttributeNames()) == false) return false; 
        return true;
    }
    
}
    