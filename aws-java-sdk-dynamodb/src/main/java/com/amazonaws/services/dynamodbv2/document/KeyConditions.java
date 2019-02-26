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
package com.amazonaws.services.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;

/**
 * Simple key conditions.
 */
public enum KeyConditions {
    EQ(ComparisonOperator.EQ),
    LE(ComparisonOperator.LE),
    LT(ComparisonOperator.LT),
    GE(ComparisonOperator.GE),
    GT(ComparisonOperator.GT),
    BEGINS_WITH(ComparisonOperator.BEGINS_WITH),
    BETWEEN(ComparisonOperator.BETWEEN),
    ;

    private final ComparisonOperator comparisonOperator;

    private KeyConditions(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public ComparisonOperator toComparisonOperator() {
        return comparisonOperator;
    }
}
