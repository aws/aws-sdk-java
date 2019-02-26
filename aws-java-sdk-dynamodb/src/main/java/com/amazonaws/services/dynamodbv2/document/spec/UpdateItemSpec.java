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

import java.util.ArrayList;
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
import com.amazonaws.services.dynamodbv2.document.AttributeUpdate;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import com.amazonaws.services.dynamodbv2.model.ReturnItemCollectionMetrics;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.xspec.UpdateItemExpressionSpec;

/**
 * Full parameter specification for the UpdateItem API.
 */
public class UpdateItemSpec extends AbstractSpecWithPrimaryKey<UpdateItemRequest> {
    private List<AttributeUpdate> attributes;
    private Collection<Expected> expected;

    private Map<String, String> nameMap;
    private Map<String, Object> valueMap;

    public UpdateItemSpec() {
        super(new UpdateItemRequest());
    }

    @Override
    public UpdateItemSpec withPrimaryKey(KeyAttribute ... components) {
        super.withPrimaryKey(components);
        return this;
    }

    @Override
    public UpdateItemSpec withPrimaryKey(PrimaryKey primaryKey) {
        super.withPrimaryKey(primaryKey);
        return this;
    }

    @Override
    public UpdateItemSpec withPrimaryKey(String hashKeyName, Object hashKeyValue) {
        super.withPrimaryKey(hashKeyName, hashKeyValue);
        return this;
    }

    @Override
    public UpdateItemSpec withPrimaryKey(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue) {
        super.withPrimaryKey(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue);
        return this;
    }

    public List<AttributeUpdate> getAttributeUpdate() {
        return attributes;
    }

    public UpdateItemSpec withAttributeUpdate(
            List<AttributeUpdate> attributeUpdates) {
        this.attributes = attributeUpdates;
        return this;
    }

    public UpdateItemSpec withAttributeUpdate(
            AttributeUpdate... attributeUpdates) {
        this.attributes = new ArrayList<AttributeUpdate>(Arrays.asList(attributeUpdates));
        return this;
    }

    public UpdateItemSpec addAttributeUpdate(AttributeUpdate attributeUpdate) {
        if (null == this.attributes) {
            this.attributes = new ArrayList<AttributeUpdate>();
        }
        this.attributes.add(attributeUpdate);
        return this;
    }

    public UpdateItemSpec clearAttributeUpdate() {
        this.attributes = null;
        return this;
    }

    public Collection<Expected> getExpected() {
        return expected;
    }

    public UpdateItemSpec withExpected(Expected ... expected) {
        if (expected == null) {
            this.expected = null;
            return this;
        }
        return withExpected(Arrays.asList(expected));
    }

    public UpdateItemSpec withExpected(Collection<Expected> expected) {
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

    public String getUpdateExpression() {
        return getRequest().getUpdateExpression();
    }

    public UpdateItemSpec withUpdateExpression(String updateExpression) {
        getRequest().setUpdateExpression(updateExpression);
        return this;
    }

    public String getConditionExpression() {
        return getRequest().getConditionExpression();
    }

    public UpdateItemSpec withConditionExpression(String conditionExpression) {
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
    public UpdateItemSpec withNameMap(Map<String, String> nameMap) {
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
    public UpdateItemSpec withValueMap(Map<String, Object> valueMap) {
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

    public String getReturnConsumedCapacity() {
        return getRequest().getReturnConsumedCapacity();
    }

    public UpdateItemSpec withReturnConsumedCapacity(
            String returnConsumedCapacity) {
        getRequest().setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    public UpdateItemSpec withReturnConsumedCapacity(
            ReturnConsumedCapacity returnConsumedCapacity) {
        getRequest().setReturnConsumedCapacity(returnConsumedCapacity);
        return this;
    }

    public String getReturnItemCollectionMetrics() {
        return getRequest().getReturnItemCollectionMetrics();
    }

    public UpdateItemSpec withReturnItemCollectionMetrics(
            ReturnItemCollectionMetrics returnItemCollectionMetrics) {
        getRequest().setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    public UpdateItemSpec withReturnItemCollectionMetrics(
            String returnItemCollectionMetrics) {
        getRequest().setReturnItemCollectionMetrics(returnItemCollectionMetrics);
        return this;
    }

    public String getReturnValues() {
        return getRequest().getReturnValues();
    }

    public UpdateItemSpec withReturnValues(ReturnValue returnValues) {
        getRequest().setReturnValues(returnValues);
        return this;
    }

    public UpdateItemSpec withReturnValues(String returnValues) {
        getRequest().setReturnValues(returnValues);
        return this;
    }

    @Override
    public UpdateItemSpec withProgressListener(ProgressListener progressListener) {
        setProgressListener(progressListener);
        return this;
    }

    @Override
    public UpdateItemSpec withRequestMetricCollector(
            RequestMetricCollector requestMetricCollector) {
        setRequestMetricCollector(requestMetricCollector);
        return this;
    }

    /**
     * Convenient method to specify expressions (and the associated name map and
     * value map) via {@link UpdateItemExpressionSpec}.
     */
    @Beta
    public UpdateItemSpec withExpressionSpec(UpdateItemExpressionSpec xspec) {
        return withUpdateExpression(xspec.getUpdateExpression())
              .withConditionExpression(xspec.getConditionExpression())
              .withNameMap(xspec.getNameMap())
              .withValueMap(xspec.getValueMap())
              ;
    }
}
