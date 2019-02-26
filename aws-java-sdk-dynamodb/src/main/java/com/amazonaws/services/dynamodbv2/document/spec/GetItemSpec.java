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
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.annotation.Beta;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.ReturnConsumedCapacity;
import com.amazonaws.services.dynamodbv2.xspec.GetItemExpressionSpec;

/**
 * Full parameter specification for the GetItem API.
 */
public class GetItemSpec extends AbstractSpecWithPrimaryKey<GetItemRequest> {
    private Map<String, String> nameMap;

    public GetItemSpec() {
        super(new GetItemRequest());
    }

    @Override
    public GetItemSpec withPrimaryKey(KeyAttribute ... components) {
        super.withPrimaryKey(components);
        return this;
    }

    @Override
    public GetItemSpec withPrimaryKey(PrimaryKey primaryKey) {
        super.withPrimaryKey(primaryKey);
        return this;
    }

    @Override
    public GetItemSpec withPrimaryKey(String hashKeyName, Object hashKeyValue) {
        super.withPrimaryKey(hashKeyName, hashKeyValue);
        return this;
    }

    @Override
    public GetItemSpec withPrimaryKey(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue) {
        super.withPrimaryKey(hashKeyName, hashKeyValue, rangeKeyName, rangeKeyValue);
        return this;
    }

    public String getReturnConsumedCapacity() {
        return getRequest().getReturnConsumedCapacity();
    }

    public GetItemSpec withReturnConsumedCapacity(ReturnConsumedCapacity capacity) {
        getRequest().setReturnConsumedCapacity(capacity);
        return this;
    }

    public List<String> getAttributesToGet() {
        return getRequest().getAttributesToGet();
    }

    public GetItemSpec withAttributesToGet(String ... attrNames) {
        if (attrNames == null)
            getRequest().setAttributesToGet(null);
        else
            getRequest().setAttributesToGet(Arrays.asList(attrNames));
        return this;
    }

    public Boolean isConsistentRead() {
        return getRequest().isConsistentRead();
    }

    public GetItemSpec withConsistentRead(boolean consistentRead) {
        getRequest().setConsistentRead(consistentRead);
        return this;
    }

    public String getProjectionExpression() {
        return getRequest().getProjectionExpression();
    }

    /**
     * When a projection expression is specified, the corresponding name-map can
     * optionally be specified via { {@link #withNameMap(Map)}. (Note
     * attributes-to-get must not be specified if a projection expression has
     * been specified.)
     */
    public GetItemSpec withProjectionExpression(String projectionExpression) {
        getRequest().setProjectionExpression(projectionExpression);
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
    public GetItemSpec withNameMap(Map<String,String> nameMap) {
        if (nameMap == null) {
            this.nameMap = null;
        } else {
            this.nameMap = Collections.unmodifiableMap(
                new LinkedHashMap<String, String>(nameMap));
        }
        return this;
    }

    @Override
    public GetItemSpec withProgressListener(ProgressListener progressListener) {
        setProgressListener(progressListener);
        return this;
    }

    @Override
    public GetItemSpec withRequestMetricCollector(
            RequestMetricCollector requestMetricCollector) {
        setRequestMetricCollector(requestMetricCollector);
        return this;
    }

    /**
     * Convenient method to specify expressions (and the associated name map and
     * value map) via {@link GetItemExpressionSpec}.
     */
    @Beta
    public GetItemSpec withExpressionSpec(GetItemExpressionSpec xspec) {
        return withProjectionExpression(xspec.getProjectionExpression())
              .withNameMap(xspec.getNameMap())
              ;
    }
}
