/*
 * Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.Condition;

/**
 * A query expression
 */
public class DynamoDBQueryExpression <T> {

    private boolean consistentRead = true;
    private boolean scanIndexForward = true;
    private T hashKeyValues;
    private Map<String, Condition> rangeKeyConditions;
    private Map<String, AttributeValue> exclusiveStartKey;
    private Integer limit;
    private String indexName;

    /**
     * Returns whether this query uses consistent reads
     */
    public boolean isConsistentRead() {
        return consistentRead;
    }

    /**
     * Sets whether this query uses consistent reads.
     */
    public void setConsistentRead(boolean consistentRead) {
        this.consistentRead = consistentRead;
    }

    /**
     * Sets whether this query uses consistent reads and returns a pointer to
     * this object for method-chaining.
     */
    public DynamoDBQueryExpression<T> withConsistentRead(boolean consistentRead) {
        this.consistentRead = consistentRead;
        return this;
    }

    /**
     * Returns whether this query scans forward.
     */
    public boolean isScanIndexForward() {
        return scanIndexForward;
    }

    /**
     * Sets whether this query scans forward.
     */
    public void setScanIndexForward(boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
    }

    /**
     * Sets whether this query scans forward and returns a pointer to this
     * object for method-chaining.
     */
    public DynamoDBQueryExpression<T> withScanIndexForward(boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
        return this;
    }

    /**
     * Returns the exclusive start key for this query.
     */
    public Map<String, AttributeValue> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this query.
     */
    public void setExclusiveStartKey(Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this query and returns a pointer to this
     * object for method-chaining.
     */
    public DynamoDBQueryExpression<T> withExclusiveStartKey(Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
        return this;
    }

    /**
     * Returns the limit of items to return from this query.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the limit of items to return from this query.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Sets the limit of items to return from this query and returns a pointer to this
     * object for method-chaining.
     */
    public DynamoDBQueryExpression<T> withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Gets the hash key value(s) for this query. All hash key attributes for
     * the table must be specified with this key object.
     */
    public T getHashKeyValues() {
        return hashKeyValues;
    }

    
    /**
     * Sets the hash key value(s) for this query. All hash key attributes for
     * the table must be specified with this key object.
     * 
     * Note 1: Currently the DynamoDBMapper supports only one value per hash key.
     * Note 2: Currently the Amazon DynamoDB supports only one hash key per table.   
     */
    public void setHashKeyValues(T hashKeyValues) {
        this.hashKeyValues = hashKeyValues;
    }
    
    /**
     * Sets the hash key value(s) for this query. All hash key attributes for
     * the table must be specified with this key object.
     */
    public DynamoDBQueryExpression<T> withHashKeyValues(T hashKObject) {
        setHashKeyValues(hashKObject);
        return this;
    }

    /**
     * Gets the range key condition for this query. All range key attributes for
     * the table must be specified by attribute name in the map.
     */
    public Map<String, Condition> getRangeKeyConditions() {
        return rangeKeyConditions;
    }
    
    /**
     * Sets the range key condition for this query. All range key attributes for
     * the table must be specified by attribute name in the map.
     * 
     * @param rangeKeyConditions
     * 			NOTE: The current DynamoDB service only allows up to one range key condition per query.
     * 			Providing more than one range key conditions  will result in an
     * 			AmazonClientException
     */
    public void setRangeKeyConditions(Map<String, Condition> rangeKeyConditions) {
        this.rangeKeyConditions = rangeKeyConditions;
    }
    
    /**
     * Sets the range key condition for this query. All range key attributes for
     * the table must be specified by attribute name in the map.
     * 
     * @param rangeKeyConditions
     * 			NOTE: The current DynamoDB service only allows up to one range key condition per query.
     * 			Providing more than one range key conditions  will result in an
     * 			AmazonClientException
     */
    public DynamoDBQueryExpression<T> withRangeKeyConditions(Map<String, Condition> rangeKeyConditions) {
        setRangeKeyConditions(rangeKeyConditions);
        return this;
    }
    
    /**
     * Sets one range key condition for this query, using the attribute name of
     * the range key. All range key attributes for the table must be specified
     * by using {@link DynamoDBRangeKey} or {@link DynamoDBIndexRangeKey} annotations
     * before executing the query.
     * 		<dl>
     * 			<dt>If the attribute is the primary range key</dt>
     * 				<dd>users should NOT set any index name for this query.</dd>
     * 			<dt>If the attribute is an index range key</dt> 
     * 				<dd>{@link DynamoDBMapper} will automatically
     * 				set the index name if the range key is annotated as only used by one local secondary index,
     * 				otherwise users must set the index name manually
     * 				by either {@link DynamoDBQueryExpression#setIndexName(String)} or 
     * 				{@link DynamoDBQueryExpression#withIndexName(String)}.</dd>
     * 		</dl>
     * @param rangeKeyAttributeName
     * 			This could be either the primary range key of the table, or an index range key.
     * 
     * @param rangeKeyCondition
     * 			Condition specified on the given range key for this query.
     */
    public DynamoDBQueryExpression<T> withRangeKeyCondition(String rangeKeyAttributeName, Condition rangeKeyCondition) {
        if ( rangeKeyConditions == null )
            rangeKeyConditions = new HashMap<String, Condition>();
        rangeKeyConditions.put(rangeKeyAttributeName, rangeKeyCondition);
        return this;
    }
    
    /**
     * Returns the name of the index used by this query.
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * Sets the name of the index to be used by this query. All index names must be specified by using
     * {@link DynamoDBIndexRangeKey} annotation on the getter method of the corresponding index range key
     * before executing the query.
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * Sets the name of the index to be used by this query. All index names must be specified by using
     * {@link DynamoDBIndexRangeKey} annotation on the getter method of the corresponding index range key
     * before executing the query.
     * <p>Returns a pointer to this object for method-chaining.
     */
    public DynamoDBQueryExpression<T> withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

}
