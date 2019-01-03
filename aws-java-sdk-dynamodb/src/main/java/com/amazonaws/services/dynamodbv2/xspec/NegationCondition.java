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

import static com.amazonaws.services.dynamodbv2.xspec.ExpressionSpecBuilder._;

import com.amazonaws.annotation.Beta;

/**
 * Represents a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference">negation</a>
 * condition in building condition expressions.
 * <p>
 * Underlying grammar:
 * 
 * <pre>
 *    NOT condition
 * </pre>
 * <p>
 * This object is as immutable (or unmodifiable) as the underlying condition.
 */
@Beta
public final class NegationCondition extends Condition {
    private final Condition condition;

    NegationCondition(Condition condition) { 
        this.condition = condition;
    }

    @Override
    String asSubstituted(SubstitutionContext context) {
        if (this.precedence() > condition.precedence())
            return "NOT " + _(condition).asSubstituted(context);
        else
            return "NOT " + condition.asSubstituted(context);
    }

    @Override
    boolean atomic() {
        return true;
    }

    @Override
    int precedence() {
        return Precedence.NOT.value();
    }
}
