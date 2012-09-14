/*
 * Copyright 2011-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodb.datamodeling;

import com.amazonaws.services.dynamodb.model.AttributeValue;
import com.amazonaws.services.dynamodb.model.Condition;
import com.amazonaws.services.dynamodb.model.Key;

/**
 * A query expression
 */
public class DynamoDBQueryExpression {

    private boolean consistentRead = true;
    private boolean scanIndexForward = true;
    private AttributeValue hashKeyValue;
    private Condition rangeKeyCondition;
    private Key exclusiveStartKey;
    private Integer limit;

    public DynamoDBQueryExpression(AttributeValue hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

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
    public DynamoDBQueryExpression withConsistentRead(boolean consistentRead) {
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
    public DynamoDBQueryExpression withScanIndexForward(boolean scanIndexForward) {
        this.scanIndexForward = scanIndexForward;
        return this;
    }

    /**
     * Returns the hash key value to match.
     */
    public AttributeValue getHashKeyValue() {
        return hashKeyValue;
    }

    /**
     * Sets the hash key value for this query to match.
     */
    public void setHashKeyValue(AttributeValue hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
    }

    /**
     * Sets the hash key value for this query to match and returns a pointer to
     * this object for method-chaining.
     */
    public DynamoDBQueryExpression withHashKeyValue(AttributeValue hashKeyValue) {
        this.hashKeyValue = hashKeyValue;
        return this;
    }

    /**
     * Returns the range key condition for this query.
     */
    public Condition getRangeKeyCondition() {
        return rangeKeyCondition;
    }

    /**
     * Sets the range key condition for this query.
     */
    public void setRangeKeyCondition(Condition rangeKeyCondition) {
        this.rangeKeyCondition = rangeKeyCondition;
    }

    /**
     * Sets the range key condition for this query and returns a pointer to this
     * object for method-chaining.
     */
    public DynamoDBQueryExpression withRangeKeyCondition(Condition rangeKeyCondition) {
        this.rangeKeyCondition = rangeKeyCondition;
        return this;
    }

    /**
     * Returns the exclusive start key for this query.
     */
    public Key getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this query.
     */
    public void setExclusiveStartKey(Key exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this query and returns a pointer to this
     * object for method-chaining.
     */
    public DynamoDBQueryExpression withExclusiveStartKey(Key exclusiveStartKey) {
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
    public DynamoDBQueryExpression withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

}
