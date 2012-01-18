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
        if (scanFilter == null) scanFilter = new HashMap<String, Condition>();

        scanFilter.put(attributeName, condition);
    }
}
