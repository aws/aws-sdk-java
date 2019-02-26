/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.xspec;

import com.amazonaws.annotation.Beta;

/**
 * Represents a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference">BETWEEN</a>
 * condition in a condition expression.
 * <p>
 * Underlying grammar:
 * 
 * <pre>
 *    operand BETWEEN operand AND operand
 * </pre>
 * <p>
 * This object is as immutable (or unmodifiable) as the underlying operands.
 */
@Beta
public final class BetweenCondition extends Condition {
    private final PathOperand attribute;
    private final Operand min;
    private final Operand max;

    BetweenCondition(PathOperand attribute, Operand min, Operand max) {
        this.attribute = attribute;
        this.min = min;
        this.max = max;
    }

    @Override
    String asSubstituted(SubstitutionContext context) {
        return attribute.asSubstituted(context)
                + " BETWEEN "
                + min.asSubstituted(context)
                + " AND "
                + max.asSubstituted(context)
                ;
    }

    @Override
    boolean atomic() {
        return true;
    }

    @Override
    int precedence() {
        return Precedence.BETWEEN.value();
    }
}
