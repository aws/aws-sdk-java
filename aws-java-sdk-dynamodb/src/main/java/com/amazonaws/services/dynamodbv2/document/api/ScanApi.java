/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document.api;

import java.util.Map;

import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.ScanFilter;
import com.amazonaws.services.dynamodbv2.document.ScanOutcome;
import com.amazonaws.services.dynamodbv2.document.spec.ScanSpec;

/**
 * A Table-centric Scan API.
 */
@ThreadSafe
public interface ScanApi {
    /**
     * Retrieves items by the specified list of scan filters.
     */
    public ItemCollection<ScanOutcome> scan(ScanFilter ... scanFilters);

    /**
     * Scans table using a Filter Expression.
     *
     * @param filterExpression
     *            condition expression example:
     *            "(#a > :a) AND (#c > :c OR #e < :e)"
     *
     * @param nameMap
     *            actual values for the attribute-name place holders; can be
     *            null if there is no attribute-name placeholder.
     * @param valueMap
     *            actual values for the value place holders can be null if there
     *            is no attribute-value placeholder.
     */
    public ItemCollection<ScanOutcome> scan(String filterExpression,
            Map<String, String> nameMap,
            Map<String, Object> valueMap);

    /**
     * Scans table using a Filter Expression and a Projection Expression.
     *
     * @param filterExpression
     *            condition expression example:
     *            "(#a > :a) AND (#c > :c OR #e < :e)"
     * @param projectionExpression
     *            projection expression example: "a.b , c[0].e"
     *
     * @param nameMap actual values for the attribute-name place holders;
     *                can be null if there is no attribute-name placeholder.
     * @param valueMap actual values for the value place holders
     *                can be null if there is no attribute-value placeholder.
     */
    public ItemCollection<ScanOutcome> scan(
            String filterExpression,
            String projectionExpression,
            Map<String, String> nameMap,
            Map<String, Object> valueMap);

    /**
     * Scans table by specifying all the details.
     */
    public ItemCollection<ScanOutcome> scan(ScanSpec params);
}
