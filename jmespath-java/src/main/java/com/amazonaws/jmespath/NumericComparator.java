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

import java.math.BigDecimal;

public abstract class NumericComparator extends Comparator {

    /**
     * Constructs a new Comparator with the given lhs amd rhs
     * expressions.
     *
     * @param lhsExpr Left expression
     * @param rhsExpr Right expression
     */
    public NumericComparator(JmesPathExpression lhsExpr, JmesPathExpression rhsExpr) {
        super(lhsExpr, rhsExpr);
    }

    /**
     * Converts the lhs and rhs JsonNodes to the numeric values
     * and delegates to the matches method that operates on the
     * numeric values alone.
     *
     * @param lhs Lhs expression
     * @param rhs Rhs expression
     * @return Boolean result of the matches method of the
     * corresponding comparison operator
     */
    @Override
    public final boolean matches(JsonNode lhs, JsonNode rhs) {
        return matches(lhs.decimalValue(), rhs.decimalValue());
    }

    /**
     * Abstract method definition that is overriden by the
     * subclasses to compare the given lhs and rhs numbers
     * according to the given comparator
     *
     * @param lhs Lhs Number
     * @param rhs Rhs Number
     * @return True if the comparison is evaluated to true;
     * False otherwise
     */
    public abstract boolean matches(BigDecimal lhs, BigDecimal rhs);

}
