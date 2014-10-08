/*
 * Copyright 2014-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.document.spec;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.ScanFilter;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.Select;

/**
 * API for fully specifying all the parameters of a Table-centric Scan API.
 */
public class ScanSpec extends AbstractCollectionSpec<ScanRequest> {
    private Collection<ScanFilter> scanFilters;
    private String filterExpression;
    private String projectionExpression;
    private Map<String, String> nameMap;
    private Map<String, Object> valueMap;

    private Collection<KeyAttribute> exclusiveStartKey;

    public ScanSpec() {
        super(new ScanRequest());
    }

    public Collection<ScanFilter> getScanFilters() {
        return scanFilters;
    }

    public ScanSpec withScanFilters(ScanFilter... scanFilters) {
        if (scanFilters == null)
            this.scanFilters = null;
        else {
            Set<String> names = new HashSet<String>();
            for (ScanFilter e: scanFilters)
                names.add(e.getAttribute());
            if (names.size() != scanFilters.length) {
                throw new IllegalArgumentException(
                    "attribute names must not duplicate in the list of scan filters");
            }
            this.scanFilters = Arrays.asList(scanFilters);
        }
        return this;
    }

    /** AND|OR that applies to all the conditions in the ScanFilters. */
    public String getConditionalOperator() {
        return getRequest().getConditionalOperator();
    }

    public ScanSpec withConditionalOperator(ConditionalOperator op) {
        getRequest().setConditionalOperator(op);
        return this;
    }

    public List<String> getAttributesToGet() {
        return getRequest().getAttributesToGet();
    }

    public ScanSpec withAttributesToGet(String ... attributes) {
        if (attributes == null)
            getRequest().setAttributesToGet(null);
        else
            getRequest().setAttributesToGet(Arrays.asList(attributes));
        return this;
    }

    /**
     * Any query filters will be ignored if a filter expression has been
     * specified. When a filter expression is specified, the corresponding
     * name-map and value-map can also be specified via
     * {@link #withNameMap(Map)} and {@link #withValueMap(Map)}.
     */
    public String getFilterExpression() {
        return filterExpression;
    }

    public ScanSpec withFilterExpression(String expression) {
        this.filterExpression = expression;
        return this;
    }

    public String getProjectionExpression() {
        return projectionExpression;
    }

    public ScanSpec withProjectionExpression(String expression) {
        this.projectionExpression = expression;
        return this;
    }

    public Map<String,String> getNameMap() {
        return nameMap;
    }

    /**
     * Applicable only when an expression has been specified.
     * Used to specify the actual values for the attribute-name placeholders,
     * where the value in the map can either be string for simple attribute
     * name, or a JSON path expression.
     */
    public ScanSpec withNameMap(Map<String, String> nameMap) {
        if (nameMap == null)
            this.nameMap = null;
        else
            this.nameMap = Collections.unmodifiableMap(new HashMap<String, String>(nameMap));
        return this;
    }

    public Map<String,Object> getValueMap() {
        return valueMap;
    }

    /**
     * Applicable only when an expression has been specified. Used to
     * specify the actual values for the attribute-value placeholders.
     */
    public ScanSpec withValueMap(Map<String, Object> valueMap) {
        if (valueMap == null)
            this.valueMap = null;
        else
            this.valueMap = Collections.unmodifiableMap(new HashMap<String, Object>(valueMap));
        return this;
    }

    public String getReturnConsumedCapacity() {
        return getRequest().getReturnConsumedCapacity();
    }

    public ScanSpec withReturnConsumedCapacity(ReturnConsumedCapacity capacity) {
        getRequest().setReturnConsumedCapacity(capacity);
        return this;
    }

    /** Specifies the attributes to be returned. */
    // ALL_ATTRIBUTES | ALL_PROJECTED_ATTRIBUTES | SPECIFIC_ATTRIBUTES | COUNT
    public String getSelect() {
        return getRequest().getSelect();
    }

    public ScanSpec withSelect(Select select) {
        getRequest().setSelect(select);
        return this;
    }

    public Integer getSegment() {
        return getRequest().getSegment();
    }

    public ScanSpec withSegment(Integer segment) {
        getRequest().setSegment(segment);
        return this;
    }

    public Integer getTotalSegments() {
        return getRequest().getTotalSegments();
    }

    public ScanSpec withTotalSegments(Integer totalSegments) {
        getRequest().setTotalSegments(totalSegments);
        return this;
    }

    // Exclusive start key

    public Collection<KeyAttribute> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    public ScanSpec withExclusiveStartKey(KeyAttribute... exclusiveStartKey) {
        if (exclusiveStartKey == null)
            this.exclusiveStartKey = null;
        else
            this.exclusiveStartKey = Arrays.asList(exclusiveStartKey);
        return this;
    }

    public ScanSpec withExclusiveStartKey(PrimaryKey exclusiveStartKey) {
        if (exclusiveStartKey == null)
            this.exclusiveStartKey = null;
        else {
            this.exclusiveStartKey = exclusiveStartKey.getComponents();
        }
        return this;
    }
    
    public ScanSpec withExclusiveStartKey(
            String hashKeyName, Object hashKeyValue) {
        return withExclusiveStartKey(new KeyAttribute(hashKeyName, hashKeyValue));
    }

    public ScanSpec withExclusiveStartKey(
            String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue) {
        return withExclusiveStartKey(
                new KeyAttribute(hashKeyName, hashKeyValue),
                new KeyAttribute(rangeKeyName, rangeKeyValue));
    }

    // Max result size

    @Override
    public ScanSpec withMaxResultSize(Integer maxResultSize) {
        setMaxResultSize(maxResultSize);
        return this;
    }

    @Override
    public ScanSpec withMaxResultSize(int maxResultSize) {
        setMaxResultSize(maxResultSize);
        return this;
    }

    @Override
    public ScanSpec withMaxPageSize(Integer maxPageSize) {
        setMaxPageSize(maxPageSize);
        return this;
    }

    @Override
    public ScanSpec withMaxPageSize(int maxPageSize) {
        setMaxPageSize(maxPageSize);
        return this;
    }

    @Override
    public ScanSpec withProgressListener(ProgressListener progressListener) {
        setProgressListener(progressListener);
        return this;
    }

    @Override
    public ScanSpec withRequestMetricCollector(
            RequestMetricCollector requestMetricCollector) {
        setRequestMetricCollector(requestMetricCollector);
        return this;
    }
}
