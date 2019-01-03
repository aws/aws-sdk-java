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
 * Represents a condition for building condition expression.
 */
@Beta
public abstract class Condition extends UnitOfExpression {
    /**
     * Returns a new condition based on the negation of the current condition.
     */
    public final NegationCondition negate() {
        return new NegationCondition(this);
    }

    /**
     * Returns a new condition based on the conjunction of the current condition
     * and the given condition.
     * 
     * @param that given condition.
     */
    public AndCondition and(Condition that) {
        return new AndCondition(this, that.atomic() ? that : _(that));
    }

    /**
     * Returns a new condition based on the disjunction of the current condition
     * and the given condition. 
     * 
     * @param that given condition.
     */
    public OrCondition or(Condition that) {
        return new OrCondition(this, that.atomic() ? that : _(that));
    }

    /**
     * A condition is considered "atomic" if appending an additional AND condition
     * would not alter the evaluation order of the original condition;
     * false otherwise.  For example, "a == b AND c == d" is atomic, but
     * "a == b OR c == d" is not.
     */
    abstract boolean atomic();
    
    /**
     * Returns the precedence of this condition.
     * See http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference
     */
    abstract int precedence();
}
