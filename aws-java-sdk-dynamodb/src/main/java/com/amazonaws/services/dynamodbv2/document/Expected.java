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

import com.amazonaws.services.dynamodbv2.document.internal.InternalUtils;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;


/**
 * Represents a condition to be compared with an attribute value.
 * <p>
 * Typical usages:
 * <blockquote>
 * <code>new Expected("strAttr").eq("attrValue");</code>
 * <p>
 * <code>new Expected("intAttr").gt(42);</code>
 * <p>
 * ...
 * </blockquote>
 * <p>
 * See
 * http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/
 * API_ExpectedAttributeValue.html.
 */
public class Expected {
    private final String attribute;
    private ComparisonOperator op;
    private Object[] values;

    public Expected(String attrName) {
        InternalUtils.checkInvalidAttrName(attrName);
        this.attribute = attrName;
    }

    /** Returns the attribute. */
    public String getAttribute() {
        return attribute;
    }

    public ComparisonOperator getComparisonOperator() {
        return op;
    }

    public Object[] getValues() {
        return values == null ? null : values.clone();
    }

    private Expected _withValues(Object ... values) {
        this.values = values.clone();
        return this;
    }

    private Expected _withComparisonOperator(ComparisonOperator op) {
        this.op = op;
        return this;
    }

    /**
     * Creates and returns a condition of the range key being equal to the given
     * value.
     */
    public Expected eq(Object val) {
        return _withComparisonOperator(ComparisonOperator.EQ)._withValues(val);
    }

    public Expected ne(Object val) {
        return _withComparisonOperator(ComparisonOperator.NE)._withValues(val);
    }

    /**
     * Expects the attribute be an existing attribute.
     */
    public Expected exists() {
        return _withComparisonOperator(ComparisonOperator.NOT_NULL);
    }

    /**
     * Expects the attribute be non-existing.
     */
    public Expected notExist() {
        return _withComparisonOperator(ComparisonOperator.NULL);
    }

    public Expected contains(Object val) {
        return _withComparisonOperator(ComparisonOperator.CONTAINS)._withValues(val);
    }

    public Expected notContains(Object val) {
        return _withComparisonOperator(ComparisonOperator.NOT_CONTAINS)._withValues(val);
    }
    /**
     * Creates and returns a condition of the range key with a value that begins
     * with the given value.
     */
    public Expected beginsWith(String val) {
        return _withComparisonOperator(ComparisonOperator.BEGINS_WITH)._withValues(val);
    }

    public Expected in(Object ...values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("values must not be null or empty.");
        }

        return _withComparisonOperator(ComparisonOperator.IN)._withValues(values);
    }

    /**
     * Creates and returns a condition of the range key that has a value between
     * the given values.
     */
    public Expected between(Object low, Object hi) {
        return _withComparisonOperator(ComparisonOperator.BETWEEN)._withValues(low, hi);
    }

    /**
     * Creates and returns a condition of the range key being greater than or
     * equal to the given value.
     */
    public Expected ge(Object val) {
        return _withComparisonOperator(ComparisonOperator.GE)._withValues(val);
    }

    /**
     * Creates and returns a condition of the range key being greater than the
     * given value.
     */
    public Expected gt(Object val) {
        return _withComparisonOperator(ComparisonOperator.GT)._withValues(val);
    }

    /**
     * Creates and returns a condition of the range key being less than or equal
     * to the given value.
     */
    public Expected le(Object val) {
        return _withComparisonOperator(ComparisonOperator.LE)._withValues(val);
    }

    /**
     * Creates and returns a condition of the range key being less than the
     * given value.
     */
    public Expected lt(Object val) {
        return _withComparisonOperator(ComparisonOperator.LT)._withValues(val);
    }
}
