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
package com.amazonaws.services.dynamodbv2.document.spec;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amazonaws.annotation.Beta;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.document.ScanFilter;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.Select;
import com.amazonaws.services.dynamodbv2.xspec.ScanExpressionSpec;

/**
 * API for fully specifying all the parameters of a Table-centric Scan API.
 */
public class ScanSpec extends AbstractCollectionSpec<ScanRequest> {
    private Collection<ScanFilter> scanFilters;
    private Map<String, String> nameMap;
    private Map<String, Object> valueMap;

    private Collection<KeyAttribute> exclusiveStartKey;

    public ScanSpec() {
        super(new ScanRequest());
    }

    /**
     * @see ScanRequest#getScanFilter()
     */
    public Collection<ScanFilter> getScanFilters() {
        return scanFilters;
    }

    /**
     * @see ScanRequest#withScanFilter(Map)
     */
    public ScanSpec withScanFilters(ScanFilter... scanFilters) {
        if (scanFilters == null)
            this.scanFilters = null;
        else {
            Set<String> names = new LinkedHashSet<String>();
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

    /**
     * AND|OR that applies to all the conditions in the ScanFilters.
     *
     * @see ScanRequest#getConditionalOperator()
     */
    public String getConditionalOperator() {
        return getRequest().getConditionalOperator();
    }

    /**
     * @see ScanRequest#withConditionalOperator(ConditionalOperator)
     */
    public ScanSpec withConditionalOperator(ConditionalOperator op) {
        getRequest().setConditionalOperator(op);
        return this;
    }

    /**
     * @see ScanRequest#getAttributesToGet()
     */
    public List<String> getAttributesToGet() {
        return getRequest().getAttributesToGet();
    }

    /**
     * @see ScanRequest#withAttributesToGet(String...)
     */
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
     *
     * @see ScanRequest#getFilterExpression()
     */
    public String getFilterExpression() {
        return getRequest().getFilterExpression();
    }

    /**
     * @see ScanRequest#withFilterExpression(String)
     */
    public ScanSpec withFilterExpression(String filterExpression) {
        getRequest().setFilterExpression(filterExpression);
        return this;
    }

    /**
     * @see ScanRequest#getProjectionExpression()
     */
    public String getProjectionExpression() {
        return getRequest().getProjectionExpression();
    }

    /**
     * @see ScanRequest#withProjectionExpression(String)
     */
    public ScanSpec withProjectionExpression(String projectionExpression) {
        getRequest().setProjectionExpression(projectionExpression);
        return this;
    }

    /**
     * @see ScanRequest#getExpressionAttributeNames()
     */
    public Map<String,String> getNameMap() {
        return nameMap;
    }

    /**
     * Applicable only when an expression has been specified.
     * Used to specify the actual values for the attribute-name placeholders,
     * where the value in the map can either be string for simple attribute
     * name, or a JSON path expression.
     *
     * @see ScanRequest#withExpressionAttributeNames(Map)
     */
    public ScanSpec withNameMap(Map<String, String> nameMap) {
        if (nameMap == null)
            this.nameMap = null;
        else
            this.nameMap = Collections.unmodifiableMap(new LinkedHashMap<String, String>(nameMap));
        return this;
    }

    /**
     * @see ScanRequest#getExpressionAttributeValues()
     */
    public Map<String,Object> getValueMap() {
        return valueMap;
    }

    /**
     * Applicable only when an expression has been specified. Used to
     * specify the actual values for the attribute-value placeholders.
     *
     * @see ScanRequest#withExpressionAttributeValues(Map)
     */
    public ScanSpec withValueMap(Map<String, Object> valueMap) {
        if (valueMap == null)
            this.valueMap = null;
        else
            this.valueMap = Collections.unmodifiableMap(new LinkedHashMap<String, Object>(valueMap));
        return this;
    }

    /**
     * @see ScanRequest#getReturnConsumedCapacity()
     */
    public String getReturnConsumedCapacity() {
        return getRequest().getReturnConsumedCapacity();
    }

    /**
     * @see ScanRequest#withReturnConsumedCapacity(ReturnConsumedCapacity)
     */
    public ScanSpec withReturnConsumedCapacity(ReturnConsumedCapacity capacity) {
        getRequest().setReturnConsumedCapacity(capacity);
        return this;
    }

    /**
     * Specifies the attributes to be returned.
     *
     * @see ScanRequest#getSelect()
     */
    // ALL_ATTRIBUTES | ALL_PROJECTED_ATTRIBUTES | SPECIFIC_ATTRIBUTES | COUNT
    public String getSelect() {
        return getRequest().getSelect();
    }

    /**
     * @see ScanRequest#withSelect(Select)
     */
    public ScanSpec withSelect(Select select) {
        getRequest().setSelect(select);
        return this;
    }

    /**
     * @see ScanRequest#getSegment()
     */
    public Integer getSegment() {
        return getRequest().getSegment();
    }

    /**
     * @see ScanRequest#withSegment(Integer)
     */
    public ScanSpec withSegment(Integer segment) {
        getRequest().setSegment(segment);
        return this;
    }

    /**
     * @see ScanRequest#getTotalSegments()
     */
    public Integer getTotalSegments() {
        return getRequest().getTotalSegments();
    }

    /**
     * @see ScanRequest#withTotalSegments(Integer)
     */
    public ScanSpec withTotalSegments(Integer totalSegments) {
        getRequest().setTotalSegments(totalSegments);
        return this;
    }

    /**
     * @see ScanRequest#isConsistentRead()
     */
    public Boolean isConsistentRead() {
        return getRequest().isConsistentRead();
    }

    /**
     * @see ScanRequest#withConsistentRead(Boolean)
     */
    public ScanSpec withConsistentRead(Boolean consistentRead) {
        getRequest().withConsistentRead(consistentRead);
        return this;
    }

    // Exclusive start key

    /**
     * @see ScanRequest#getExclusiveStartKey()
     */
    public Collection<KeyAttribute> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * @see ScanRequest#withExclusiveStartKey(Map)
     */
    public ScanSpec withExclusiveStartKey(KeyAttribute... exclusiveStartKey) {
        if (exclusiveStartKey == null)
            this.exclusiveStartKey = null;
        else
            this.exclusiveStartKey = Arrays.asList(exclusiveStartKey);
        return this;
    }

    /**
     * @see ScanRequest#withExclusiveStartKey(Map)
     */
    public ScanSpec withExclusiveStartKey(PrimaryKey exclusiveStartKey) {
        if (exclusiveStartKey == null)
            this.exclusiveStartKey = null;
        else {
            this.exclusiveStartKey = exclusiveStartKey.getComponents();
        }
        return this;
    }

    /**
     * @see ScanRequest#withExclusiveStartKey(Map)
     */
    public ScanSpec withExclusiveStartKey(
            String hashKeyName, Object hashKeyValue) {
        return withExclusiveStartKey(new KeyAttribute(hashKeyName, hashKeyValue));
    }

    /**
     * @see ScanRequest#withExclusiveStartKey(Map)
     */
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

    /**
     * Convenient method to specify expressions (and the associated name map and
     * value map) via {@link ScanExpressionSpec}.
     */
    @Beta
    public ScanSpec withExpressionSpec(ScanExpressionSpec xspec) {
        return withFilterExpression(xspec.getFilterExpression())
              .withProjectionExpression(xspec.getProjectionExpression())
              .withNameMap(xspec.getNameMap())
              .withValueMap(xspec.getValueMap())
              ;
    }
}
