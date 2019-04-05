/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.jmespath;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Parent class for different types of comparison operators.
 */
public abstract class Comparator implements JmesPathExpression {

    /**
     * Represents the left expression
     */
    protected final JmesPathExpression lhsExpr;

    /**
     * Represents the right expression
     */
    protected final JmesPathExpression rhsExpr;

    /**
     * Constructs a new Comparator with the given lhs amd rhs
     * expressions.
     *
     * @param lhsExpr Left expression
     * @param rhsExpr Right expression
     */
    public Comparator(JmesPathExpression lhsExpr, JmesPathExpression rhsExpr) {
        this.lhsExpr = lhsExpr;
        this.rhsExpr = rhsExpr;
    }

    public JmesPathExpression getLhsExpr() {
        return lhsExpr;
    }

    public JmesPathExpression getRhsExpr() {
        return rhsExpr;
    }

    /**
     * Abstract method definition that is overriden by subclasses
     * to compare the lhs and rhs expressions depending on the
     * particular type of comparator
     *
     * @param lhs Lhs expression
     * @param rhs Rhs expression
     * @return True if the comparison is evaluated to true;
     * False otherwise
     */
    public abstract boolean matches(JsonNode lhs, JsonNode rhs);
}
