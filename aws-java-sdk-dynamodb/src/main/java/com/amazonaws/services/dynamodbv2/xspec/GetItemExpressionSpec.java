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

import com.amazonaws.annotation.Immutable;

import com.amazonaws.annotation.Beta;

/**
 * Expression specification for making GetItem request to Amazon DynamoDB.
 */
@Beta
@Immutable
public final class GetItemExpressionSpec extends ExpressionSpec {
    private final String projectionExpression;
    private final Map<String, String> nameMap;

    GetItemExpressionSpec(ExpressionSpecBuilder builder) {
        SubstitutionContext context = new SubstitutionContext();
        this.projectionExpression = builder.buildProjectionExpression(context);
        final Map<String, String> nameMap = context.getNameMap();
        this.nameMap = nameMap == null ? null : Collections.unmodifiableMap(nameMap);
    }

    /**
     * Returns the projection expression; or null if there is none.
     */
    public final String getProjectionExpression() {
        return projectionExpression;
    }

    /**
     * Returns the name map which is unmodifiable; or null if there is none.
     */
    @Override
    public final Map<String, String> getNameMap() {
        return nameMap;
    }
}
