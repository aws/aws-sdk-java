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
import java.util.Map;
import java.util.Set;

import com.amazonaws.annotation.Beta;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import com.amazonaws.services.dynamodbv2.model.ReturnItemCollectionMetrics;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.xspec.PutItemExpressionSpec;

/**
 * Full parameter specification for the PutItem API.
 */
public class PutItemSpec extends AbstractSpec<PutItemRequest> {
    private Item item;
    private Collection<Expected> expected;
    private Map<String, String> nameMap;
    private Map<String, Object> valueMap;

    public PutItemSpec() {
        super(new PutItemRequest());
    }

    public Item getItem() {
        return item;
    }
    public PutItemSpec withItem(Item item) {
        this.item = item;
        return this;
    }
    public Collection<Expected> getExpected() {
        return expected;
    }

    public PutItemSpec withExpected(Expected ... expected) {
        if (expected == null) {
            this.expected = null;
            return this;
        }
        return withExpected(Arrays.asList(expected));
    }

    public PutItemSpec withExpected(Collection<Expected> expected) {
        if (expected == null) {
            this.expected = null;
            return this;
        }
        Set<String> names = new LinkedHashSet<String>();
        for (Expected e: expected)
            names.add(e.getAttribute());
        if (names.size() != expected.size()) {
            throw new IllegalArgumentException(
                "attribute names must not duplicate in the list of expected");
        }
        this.expected = Collections.unmodifiableCollection(expected);
        return this;
    }

    public String getConditionExpression() {
        return getRequest().getConditionExpression();
    }

    public PutItemSpec withConditionExpression(String conditionExpression) {
        getRequest().setConditionExpression(conditionExpression);
        return this;
    }

    public Map<String, String> getNameMap() {
        return nameMap;
    }

    /**
     * Applicable only when an expression has been specified.
     * Used to specify the actual values for the attribute-name placeholders,
     * where the value in the map can either be string for simple attribute
     * name, or a JSON path expression.
     */
    public PutItemSpec withNameMap(Map<String, String> nameMap) {
        if (nameMap == null) {
            this.nameMap = null;
        } else {
            this.nameMap = Collections.unmodifiableMap(
                new LinkedHashMap<String, String>(nameMap));
        }
        return this;
    }
    public Map<String, Object> getValueMap() {
        return valueMap;
    }

    /**
     * Applicable only when an expression has been specified. Used to
     * specify the actual values for the attribute-value placeholders.
     */
    public PutItemSpec withValueMap(Map<String, Object> valueMap) {
        if (valueMap == null) {
            this.valueMap = null;
        } else {
            this.valueMap = Collections.unmodifiableMap(
                new LinkedHashMap<String, Object>(valueMap));
        }
        return this;
    }

    public String getConditionalOperator() {
        return getRequest().getConditionalOperator();
    }

    public PutItemSpec withConditionalOperator(
            ConditionalOperator conditionalOperator) {
        getRequest().setConditionalOperator(conditionalOperator);
        return this;
    }

    public String getReturnConsumedCapacity() {
        return getRequest().getReturnConsumedCapacity();
    }

    public PutItemSpec withReturnConsumedCapacity(
            ReturnConsumedCapacity returnConsumedCapacity) {
        getRequest().setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    public String getReturnItemCollectionMetrics() {
        return getRequest().getReturnItemCollectionMetrics();
    }

    public PutItemSpec withReturnItemCollectionMetrics(
            ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        getRequest()
                .setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    public String getReturnValues() {
        return getRequest().getReturnValues();
    }

    public PutItemSpec withReturnValues(ReturnValue returnValues) {
        getRequest().setReturnValues(returnValues);
        return this;
    }

    @Override
    public PutItemSpec withProgressListener(ProgressListener progressListener) {
        setProgressListener(progressListener);
        return this;
    }

    @Override
    public PutItemSpec withRequestMetricCollector(
            RequestMetricCollector requestMetricCollector) {
        setRequestMetricCollector(requestMetricCollector);
        return this;
    }

    /**
     * Convenient method to specify expressions (and the associated name map and
     * value map) via {@link PutItemExpressionSpec}.
     */
    @Beta
    public PutItemSpec withExpressionSpec(PutItemExpressionSpec xspec) {
        return withConditionExpression(xspec.getConditionExpression())
              .withNameMap(xspec.getNameMap())
              .withValueMap(xspec.getValueMap())
              ;
    }
}
