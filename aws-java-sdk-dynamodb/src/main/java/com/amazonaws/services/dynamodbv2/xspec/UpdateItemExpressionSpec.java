/*
 * Copyright 2015-2019 Amazon Technologies, Inc.
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
 package com.amazonaws.services.dynamodbv2.xspec;

import java.util.Collections;
import java.util.Map;

import com.amazonaws.annotation.Beta;

/**
 * Expression specification for making UpdateItem request to Amazon DynamoDB.
 * <p>
 * Even though the internal name map and value map are unmodifiable, this object
 * is only as unmodifiable as the underlying values in it's value map. In turn,
 * the values in the value maps are essentially provided by the users of this
 * library. In other words, this object is thread-safe as long as the underlying
 * values provided by the users are thread-safe.
 */
@Beta
public class UpdateItemExpressionSpec extends ExpressionSpec {
    private final String updateExpression;
    private final String conditionExpression;

    private final Map<String, String> nameMap;
    private final Map<String, Object> valueMap;

    UpdateItemExpressionSpec(ExpressionSpecBuilder builder) {
        SubstitutionContext context = new SubstitutionContext();
        this.updateExpression = builder.buildUpdateExpression(context);
        this.conditionExpression = builder.buildConditionExpression(context);
        final Map<String, String> nameMap = context.getNameMap();
        this.nameMap = nameMap == null ? null : Collections.unmodifiableMap(nameMap);
        Map<String, Object> valueMap = context.getValueMap();
        this.valueMap = valueMap == null ? null : Collections.unmodifiableMap(valueMap);
    }

    /**
     * Returns the update expression; or null if there is none.
     */
    public String getUpdateExpression() {
        return updateExpression;
    }

    /**
     * Returns the condition expression; or null if there is none.
     */
    public String getConditionExpression() {
        return conditionExpression;
    }

    /**
     * Returns the name map which is unmodifiable; or null if there is none.
     */
    @Override
    public Map<String, String> getNameMap() {
        return nameMap;
    }

    /**
     * Returns the value map which is unmodifiable; or null if there is none.
     */
    public Map<String, Object> getValueMap() {
        return valueMap;
    }
}
