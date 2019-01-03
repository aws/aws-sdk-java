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

import com.amazonaws.annotation.Beta;

/**
 * Represents a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference"
 * >Comparator</a> condition in building condition expression.
 * <p>
 * Underlying grammar:
 * 
 * <pre>
 *    operand comparator_symbol operand
 * 
 *    comparator_symbol ::=
 *        =
 *      | <>
 *      | <
 *      | <=
 *      | >
 *      | >=
 * </pre>
 * <p>
 * This object is as immutable (or unmodifiable) as the underlying operands.
 */
@Beta
public final class ComparatorCondition extends Condition {
    private final String comparator;
    private final Operand lhs;
    private final Operand rhs;

    ComparatorCondition(String comparator, Operand lhs, Operand rhs) {
        this.comparator = comparator;
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    String asSubstituted(SubstitutionContext context) {
        return lhs.asSubstituted(context) + " " + comparator + " "
                + rhs.asSubstituted(context);
    }

    @Override
    boolean atomic() {
        return true;
    }

    @Override
    int precedence() {
        return Precedence.Comparator.value();
    }
}
