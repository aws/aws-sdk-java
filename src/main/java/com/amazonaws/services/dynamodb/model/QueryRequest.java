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
 * Container for the parameters to the {@link com.amazonaws.services.dynamodb.AmazonDynamoDB#query(QueryRequest) Query operation}.
 * <p>
 * Gets the values of one or more items and its attributes by primary key (composite primary key, only).
 * </p>
 * <p>
 * Narrow the scope of the query using comparison operators on the <code>RangeKeyValue</code> of the composite key. Use the <code>ScanIndexForward</code>
 * parameter to get results in forward or reverse order by range key.
 * </p>
 *
 * @see com.amazonaws.services.dynamodb.AmazonDynamoDB#query(QueryRequest)
 */
public class QueryRequest extends AmazonWebServiceRequest {

    /**
     * The name of the table in which you want to query. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private java.util.List<String> attributesToGet;

    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while querying the table, it stops the query and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the query. Also, if the
     * result set size exceeds 1MB before Amazon DynamoDB hits this limit, it
     * stops the query and returns the matching values, and a
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer limit;

    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     */
    private Boolean consistentRead;

    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items that match the query parameters, instead of a list of the
     * matching items and their attributes. Do not set <code>Count</code> to
     * <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     */
    private Boolean count;

    /**
     * Attribute value of the hash component of the composite primary key.
     */
    private AttributeValue hashKeyValue;

    /**
     * A container for the attribute values and comparison operators to use
     * for the query.
     */
    private Condition rangeKeyCondition;

    /**
     * Specifies forward or backward traversal of the index. Amazon DynamoDB
     * returns results reflecting the requested order, determined by the
     * range key. The default value is <code>true</code> (forward).
     */
    private Boolean scanIndexForward;

    /**
     * Primary key of the item from which to continue an earlier query. An
     * earlier query might provide this value as the
     * <code>LastEvaluatedKey</code> if that query operation was interrupted
     * before completing the query; either because of the result set size or
     * the <code>Limit</code> parameter. The <code>LastEvaluatedKey</code>
     * can be passed back in a new query request to continue the operation
     * from that point.
     */
    private Key exclusiveStartKey;

    /**
     * Default constructor for a new QueryRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public QueryRequest() {}
    
    /**
     * Constructs a new QueryRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param tableName The name of the table in which you want to query.
     * Allowed characters are <code>a-z</code>, <code>A-Z</code>,
     * <code>0-9</code>, <code>_</code> (underscore), <code>-</code> (hyphen)
     * and <code>.</code> (period).
     * @param hashKeyValue Attribute value of the hash component of the
     * composite primary key.
     */
    public QueryRequest(String tableName, AttributeValue hashKeyValue) {
        this.tableName = tableName;
        this.hashKeyValue = hashKeyValue;
    }

    
    
    /**
     * The name of the table in which you want to query. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The name of the table in which you want to query. Allowed characters
     *         are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public String getTableName() {
        return tableName;
    }
    
    /**
     * The name of the table in which you want to query. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to query. Allowed characters
     *         are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    /**
     * The name of the table in which you want to query. Allowed characters
     * are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     * <code>_</code> (underscore), <code>-</code> (hyphen) and
     * <code>.</code> (period).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName The name of the table in which you want to query. Allowed characters
     *         are <code>a-z</code>, <code>A-Z</code>, <code>0-9</code>,
     *         <code>_</code> (underscore), <code>-</code> (hyphen) and
     *         <code>.</code> (period).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     */
    public java.util.List<String> getAttributesToGet() {
        
        return attributesToGet;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     */
    public void setAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
            return;
        }

        java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
        attributesToGetCopy.addAll(attributesToGet);
        this.attributesToGet = attributesToGetCopy;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withAttributesToGet(String... attributesToGet) {
        if (getAttributesToGet() == null) setAttributesToGet(new java.util.ArrayList<String>(attributesToGet.length));
        for (String value : attributesToGet) {
            getAttributesToGet().add(value);
        }
        return this;
    }
    
    /**
     * List of <code>Attribute</code> names. If attribute names are not
     * specified then all attributes will be returned. If some attributes are
     * not found, they will not appear in the result.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param attributesToGet List of <code>Attribute</code> names. If attribute names are not
     *         specified then all attributes will be returned. If some attributes are
     *         not found, they will not appear in the result.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withAttributesToGet(java.util.Collection<String> attributesToGet) {
        if (attributesToGet == null) {
            this.attributesToGet = null;
        } else {
            java.util.List<String> attributesToGetCopy = new java.util.ArrayList<String>(attributesToGet.size());
            attributesToGetCopy.addAll(attributesToGet);
            this.attributesToGet = attributesToGetCopy;
        }

        return this;
    }
    
    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while querying the table, it stops the query and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the query. Also, if the
     * result set size exceeds 1MB before Amazon DynamoDB hits this limit, it
     * stops the query and returns the matching values, and a
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The maximum number of items to return. If Amazon DynamoDB hits this
     *         limit while querying the table, it stops the query and returns the
     *         matching values up to the limit, and a <code>LastEvaluatedKey</code>
     *         to apply in a subsequent operation to continue the query. Also, if the
     *         result set size exceeds 1MB before Amazon DynamoDB hits this limit, it
     *         stops the query and returns the matching values, and a
     *         <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     *         continue the query.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while querying the table, it stops the query and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the query. Also, if the
     * result set size exceeds 1MB before Amazon DynamoDB hits this limit, it
     * stops the query and returns the matching values, and a
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the query.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to return. If Amazon DynamoDB hits this
     *         limit while querying the table, it stops the query and returns the
     *         matching values up to the limit, and a <code>LastEvaluatedKey</code>
     *         to apply in a subsequent operation to continue the query. Also, if the
     *         result set size exceeds 1MB before Amazon DynamoDB hits this limit, it
     *         stops the query and returns the matching values, and a
     *         <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     *         continue the query.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of items to return. If Amazon DynamoDB hits this
     * limit while querying the table, it stops the query and returns the
     * matching values up to the limit, and a <code>LastEvaluatedKey</code>
     * to apply in a subsequent operation to continue the query. Also, if the
     * result set size exceeds 1MB before Amazon DynamoDB hits this limit, it
     * stops the query and returns the matching values, and a
     * <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     * continue the query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param limit The maximum number of items to return. If Amazon DynamoDB hits this
     *         limit while querying the table, it stops the query and returns the
     *         matching values up to the limit, and a <code>LastEvaluatedKey</code>
     *         to apply in a subsequent operation to continue the query. Also, if the
     *         result set size exceeds 1MB before Amazon DynamoDB hits this limit, it
     *         stops the query and returns the matching values, and a
     *         <code>LastEvaluatedKey</code> to apply in a subsequent operation to
     *         continue the query.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     *
     * @return If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
     */
    public Boolean isConsistentRead() {
        return consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     *
     * @param consistentRead If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
     */
    public void setConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
    }
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param consistentRead If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withConsistentRead(Boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }
    
    
    /**
     * If set to <code>true</code>, then a consistent read is issued.
     * Otherwise eventually-consistent is used.
     *
     * @return If set to <code>true</code>, then a consistent read is issued.
     *         Otherwise eventually-consistent is used.
     */
    public Boolean getConsistentRead() {
        return consistentRead;
    }
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items that match the query parameters, instead of a list of the
     * matching items and their attributes. Do not set <code>Count</code> to
     * <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     *
     * @return If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items that match the query parameters, instead of a list of the
     *         matching items and their attributes. Do not set <code>Count</code> to
     *         <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     */
    public Boolean isCount() {
        return count;
    }
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items that match the query parameters, instead of a list of the
     * matching items and their attributes. Do not set <code>Count</code> to
     * <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     *
     * @param count If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items that match the query parameters, instead of a list of the
     *         matching items and their attributes. Do not set <code>Count</code> to
     *         <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     */
    public void setCount(Boolean count) {
        this.count = count;
    }
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items that match the query parameters, instead of a list of the
     * matching items and their attributes. Do not set <code>Count</code> to
     * <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items that match the query parameters, instead of a list of the
     *         matching items and their attributes. Do not set <code>Count</code> to
     *         <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withCount(Boolean count) {
        this.count = count;
        return this;
    }
    
    
    /**
     * If set to <code>true</code>, Amazon DynamoDB returns a total number of
     * items that match the query parameters, instead of a list of the
     * matching items and their attributes. Do not set <code>Count</code> to
     * <code>true</code> while providing a list of
     * <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     * validation error.
     *
     * @return If set to <code>true</code>, Amazon DynamoDB returns a total number of
     *         items that match the query parameters, instead of a list of the
     *         matching items and their attributes. Do not set <code>Count</code> to
     *         <code>true</code> while providing a list of
     *         <code>AttributesToGet</code>, otherwise Amazon DynamoDB returns a
     *         validation error.
     */
    public Boolean getCount() {
        return count;
    }
    
    /**
     * Attribute value of the hash component of the composite primary key.
     *
     * @return Attribute value of the hash component of the composite primary key.
     */
    public AttributeValue getHashKeyValue() {
        return hashKeyValue;
    }
    
    /**
     * Attribute value of the hash component of the composite primary key.
     *
     * @param hashKeyValue Attribute value of the hash component of the composite primary key.
     */
    public void setHashKeyValue(AttributeValue hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }
    
    /**
     * Attribute value of the hash component of the composite primary key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hashKeyValue Attribute value of the hash component of the composite primary key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withHashKeyValue(AttributeValue hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }
    
    
    /**
     * A container for the attribute values and comparison operators to use
     * for the query.
     *
     * @return A container for the attribute values and comparison operators to use
     *         for the query.
     */
    public Condition getRangeKeyCondition() {
        return rangeKeyCondition;
    }
    
    /**
     * A container for the attribute values and comparison operators to use
     * for the query.
     *
     * @param rangeKeyCondition A container for the attribute values and comparison operators to use
     *         for the query.
     */
    public void setRangeKeyCondition(Condition rangeKeyCondition) {
        this.rangeKeyCondition = rangeKeyCondition;
    }
    
    /**
     * A container for the attribute values and comparison operators to use
     * for the query.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rangeKeyCondition A container for the attribute values and comparison operators to use
     *         for the query.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withRangeKeyCondition(Condition rangeKeyCondition) {
        this.rangeKeyCondition = rangeKeyCondition;
        return this;
    }
    
    
    /**
     * Specifies forward or backward traversal of the index. Amazon DynamoDB
     * returns results reflecting the requested order, determined by the
     * range key. The default value is <code>true</code> (forward).
     *
     * @return Specifies forward or backward traversal of the index. Amazon DynamoDB
     *         returns results reflecting the requested order, determined by the
     *         range key. The default value is <code>true</code> (forward).
     */
    public Boolean isScanIndexForward() {
        return scanIndexForward;
    }
    
    /**
     * Specifies forward or backward traversal of the index. Amazon DynamoDB
     * returns results reflecting the requested order, determined by the
     * range key. The default value is <code>true</code> (forward).
     *
     * @param scanIndexForward Specifies forward or backward traversal of the index. Amazon DynamoDB
     *         returns results reflecting the requested order, determined by the
     *         range key. The default value is <code>true</code> (forward).
     */
    public void setScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }
    
    /**
     * Specifies forward or backward traversal of the index. Amazon DynamoDB
     * returns results reflecting the requested order, determined by the
     * range key. The default value is <code>true</code> (forward).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param scanIndexForward Specifies forward or backward traversal of the index. Amazon DynamoDB
     *         returns results reflecting the requested order, determined by the
     *         range key. The default value is <code>true</code> (forward).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withScanIndexForward(Boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
        return this;
    }
    
    
    /**
     * Specifies forward or backward traversal of the index. Amazon DynamoDB
     * returns results reflecting the requested order, determined by the
     * range key. The default value is <code>true</code> (forward).
     *
     * @return Specifies forward or backward traversal of the index. Amazon DynamoDB
     *         returns results reflecting the requested order, determined by the
     *         range key. The default value is <code>true</code> (forward).
     */
    public Boolean getScanIndexForward() {
        return scanIndexForward;
    }
    
    /**
     * Primary key of the item from which to continue an earlier query. An
     * earlier query might provide this value as the
     * <code>LastEvaluatedKey</code> if that query operation was interrupted
     * before completing the query; either because of the result set size or
     * the <code>Limit</code> parameter. The <code>LastEvaluatedKey</code>
     * can be passed back in a new query request to continue the operation
     * from that point.
     *
     * @return Primary key of the item from which to continue an earlier query. An
     *         earlier query might provide this value as the
     *         <code>LastEvaluatedKey</code> if that query operation was interrupted
     *         before completing the query; either because of the result set size or
     *         the <code>Limit</code> parameter. The <code>LastEvaluatedKey</code>
     *         can be passed back in a new query request to continue the operation
     *         from that point.
     */
    public Key getExclusiveStartKey() {
        return exclusiveStartKey;
    }
    
    /**
     * Primary key of the item from which to continue an earlier query. An
     * earlier query might provide this value as the
     * <code>LastEvaluatedKey</code> if that query operation was interrupted
     * before completing the query; either because of the result set size or
     * the <code>Limit</code> parameter. The <code>LastEvaluatedKey</code>
     * can be passed back in a new query request to continue the operation
     * from that point.
     *
     * @param exclusiveStartKey Primary key of the item from which to continue an earlier query. An
     *         earlier query might provide this value as the
     *         <code>LastEvaluatedKey</code> if that query operation was interrupted
     *         before completing the query; either because of the result set size or
     *         the <code>Limit</code> parameter. The <code>LastEvaluatedKey</code>
     *         can be passed back in a new query request to continue the operation
     *         from that point.
     */
    public void setExclusiveStartKey(Key exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }
    
    /**
     * Primary key of the item from which to continue an earlier query. An
     * earlier query might provide this value as the
     * <code>LastEvaluatedKey</code> if that query operation was interrupted
     * before completing the query; either because of the result set size or
     * the <code>Limit</code> parameter. The <code>LastEvaluatedKey</code>
     * can be passed back in a new query request to continue the operation
     * from that point.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param exclusiveStartKey Primary key of the item from which to continue an earlier query. An
     *         earlier query might provide this value as the
     *         <code>LastEvaluatedKey</code> if that query operation was interrupted
     *         before completing the query; either because of the result set size or
     *         the <code>Limit</code> parameter. The <code>LastEvaluatedKey</code>
     *         can be passed back in a new query request to continue the operation
     *         from that point.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public QueryRequest withExclusiveStartKey(Key exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
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
        if (tableName != null) sb.append("TableName: " + tableName + ", ");
        if (attributesToGet != null) sb.append("AttributesToGet: " + attributesToGet + ", ");
        if (limit != null) sb.append("Limit: " + limit + ", ");
        if (consistentRead != null) sb.append("ConsistentRead: " + consistentRead + ", ");
        if (count != null) sb.append("Count: " + count + ", ");
        if (hashKeyValue != null) sb.append("HashKeyValue: " + hashKeyValue + ", ");
        if (rangeKeyCondition != null) sb.append("RangeKeyCondition: " + rangeKeyCondition + ", ");
        if (scanIndexForward != null) sb.append("ScanIndexForward: " + scanIndexForward + ", ");
        if (exclusiveStartKey != null) sb.append("ExclusiveStartKey: " + exclusiveStartKey + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode()); 
        hashCode = prime * hashCode + ((getAttributesToGet() == null) ? 0 : getAttributesToGet().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        hashCode = prime * hashCode + ((isConsistentRead() == null) ? 0 : isConsistentRead().hashCode()); 
        hashCode = prime * hashCode + ((isCount() == null) ? 0 : isCount().hashCode()); 
        hashCode = prime * hashCode + ((getHashKeyValue() == null) ? 0 : getHashKeyValue().hashCode()); 
        hashCode = prime * hashCode + ((getRangeKeyCondition() == null) ? 0 : getRangeKeyCondition().hashCode()); 
        hashCode = prime * hashCode + ((isScanIndexForward() == null) ? 0 : isScanIndexForward().hashCode()); 
        hashCode = prime * hashCode + ((getExclusiveStartKey() == null) ? 0 : getExclusiveStartKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof QueryRequest == false) return false;
        QueryRequest other = (QueryRequest)obj;
        
        if (other.getTableName() == null ^ this.getTableName() == null) return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false) return false; 
        if (other.getAttributesToGet() == null ^ this.getAttributesToGet() == null) return false;
        if (other.getAttributesToGet() != null && other.getAttributesToGet().equals(this.getAttributesToGet()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        if (other.isConsistentRead() == null ^ this.isConsistentRead() == null) return false;
        if (other.isConsistentRead() != null && other.isConsistentRead().equals(this.isConsistentRead()) == false) return false; 
        if (other.isCount() == null ^ this.isCount() == null) return false;
        if (other.isCount() != null && other.isCount().equals(this.isCount()) == false) return false; 
        if (other.getHashKeyValue() == null ^ this.getHashKeyValue() == null) return false;
        if (other.getHashKeyValue() != null && other.getHashKeyValue().equals(this.getHashKeyValue()) == false) return false; 
        if (other.getRangeKeyCondition() == null ^ this.getRangeKeyCondition() == null) return false;
        if (other.getRangeKeyCondition() != null && other.getRangeKeyCondition().equals(this.getRangeKeyCondition()) == false) return false; 
        if (other.isScanIndexForward() == null ^ this.isScanIndexForward() == null) return false;
        if (other.isScanIndexForward() != null && other.isScanIndexForward().equals(this.isScanIndexForward()) == false) return false; 
        if (other.getExclusiveStartKey() == null ^ this.getExclusiveStartKey() == null) return false;
        if (other.getExclusiveStartKey() != null && other.getExclusiveStartKey().equals(this.getExclusiveStartKey()) == false) return false; 
        return true;
    }
    
}
    