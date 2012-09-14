/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.dynamodb.datamodeling;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.dynamodb.model.ComparisonOperator;
import com.amazonaws.services.dynamodb.model.Condition;
import com.amazonaws.services.dynamodb.model.Key;

/**
 * Options for filtering results from a scan operation. For example, callers can
 * specify filter conditions so that only objects whose attributes match
 * different conditions are returned (see {@link ComparisonOperator} for more
 * information on the available comparison types).
 * 
 * @see DynamoDBMapper#scan(Class, DynamoDBScanExpression)
 */
public class DynamoDBScanExpression {

    /** Optional filter to limit the results of the scan. */
    private Map<String, Condition> scanFilter;

    private Key exclusiveStartKey;
    private Integer limit;

    /**
     * Sets the scan filter to the map of attribute names to conditions.
     * 
     * @param scanFilter
     *            The map of attribute names to conditions to use when filtering
     *            scan results.
     */
    public void setScanFilter(Map<String, Condition> scanFilter) {
        this.scanFilter = scanFilter;
    }

    /**
     * Returns the scan filter as a map of attribute names to conditions.
     * 
     * @return The scan filter as a map of attribute names to conditions.
     */
    public Map<String, Condition> getScanFilter() {
        return scanFilter;
    }

    /**
     * Adds a new filter condition to the current scan filter.
     * 
     * @param attributeName
     *            The name of the attribute on which the specified condition
     *            operates.
     * @param condition
     *            The condition which describes how the specified attribute is
     *            compared and if a row of data is included in the results
     *            returned by the scan operation.
     */
    public void addFilterCondition(String attributeName, Condition condition) {
        if ( scanFilter == null )
            scanFilter = new HashMap<String, Condition>();

        scanFilter.put(attributeName, condition);
    }

    /**
     * Returns the exclusive start key for this scan.
     */
    public Key getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this scan.
     */
    public void setExclusiveStartKey(Key exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this scan and returns a pointer to this
     * object for method-chaining.
     */
    public DynamoDBScanExpression withExclusiveStartKey(Key exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
        return this;
    }

    /**
     * Returns the limit of items to scan during this scan.
     * <p>
     * Use with caution. Please note that this is <b>not</b> the same as the
     * number of items to return from the scan operation -- the operation will
     * cease and return as soon as this many items are scanned, even if no
     * matching results are found. Furthermore, {@link PaginatedScanList} will
     * execute as many scan operations as necessary until it either reaches the
     * end of the result set as indicated by DynamoDB or enough elements are
     * available to fulfill the list operation (e.g. iteration). Therefore,
     * except when scanning without a scan filter, it's usually bad practice to
     * set a low limit, since doing so will often generate the same amount of
     * traffic to DynamoDB but with a greater number of round trips and
     * therefore more overall latency.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the limit of items to scan during this scan. Please note that this
     * is <b>not</b> the same as the number of items to return from the scan
     * operation -- the operation will cease and return as soon as this many
     * items are scanned, even if no matching results are found.
     * 
     * @see DynamoDBScanExpression#getLimit()
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Sets the limit of items to scan and returns a pointer to this object for
     * method-chaining. Please note that this is <b>not</b> the same as the
     * number of items to return from the scan operation -- the operation will
     * cease and return as soon as this many items are scanned, even if no
     * matching results are found.
     * 
     * @see DynamoDBScanExpression#getLimit()
     */
    public DynamoDBScanExpression withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

}
