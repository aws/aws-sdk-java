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


/**
 * A condition for selecting items with a range key.  Typical usages:
 * <blockquote>
 * <code>new RangeKeyCondition("strAttr").eq("attrValue");</code>
 * <p>
 * <code>new RangeKeyCondition("intAttr").gt(42);</code>
 * <p>
 * ...
 * </blockquote>
 */
public class RangeKeyCondition {
    private final String attrName;
    private KeyConditions kcond;
    private Object[] values;

    /**
     * A condition for selecting items with a range key.  Typical usages:
     * <blockquote>
     * <code>new RangeKeyCondition("strAttr").eq("attrValue");</code>
     * <p>
     * <code>new RangeKeyCondition("intAttr").gt(42);</code>
     * <p>
     * ...
     * </blockquote>
     */
    public RangeKeyCondition(String attrName) {
        InternalUtils.checkInvalidAttrName(attrName);
        this.attrName = attrName;
    }

    public String getAttrName() {
        return attrName;
    }

    public KeyConditions getKeyCondition() {
        return kcond;
    }

    public Object[] getValues() {
        return values == null ? null : values.clone();
    }

    /**
     * Creates and returns a condition of the range key being equal to the given
     * value.
     */
    public RangeKeyCondition eq(Object val) {
        kcond = KeyConditions.EQ;
        return withValues(val);
    }

    /**
     * Creates and returns a condition of the range key with a value that begins
     * with the given value.
     */
    public RangeKeyCondition beginsWith(String val) {
        kcond = KeyConditions.BEGINS_WITH;
        return withValues(val);
    }
    /**
     * Creates and returns a condition of the range key that has a value between
     * the given values.
     */
    public RangeKeyCondition between(Object low, Object hi) {
        kcond = KeyConditions.BETWEEN;
        return withValues(low, hi);
    }

    /**
     * Creates and returns a condition of the range key being greater than or
     * equal to the given value.
     */
    public RangeKeyCondition ge(Object val) {
        kcond = KeyConditions.GE;
        return withValues(val);
    }

    /**
     * Creates and returns a condition of the range key being greater than the
     * given value.
     */
    public RangeKeyCondition gt(Object val) {
        kcond = KeyConditions.GT;
        return withValues(val);
    }

    /**
     * Creates and returns a condition of the range key being less than or equal
     * to the given value.
     */
    public RangeKeyCondition le(Object val) {
        kcond = KeyConditions.LE;
        return withValues(val);
    }

    /**
     * Creates and returns a condition of the range key being less than the
     * given value.
     */
    public RangeKeyCondition lt(Object val) {
        kcond = KeyConditions.LT;
        return withValues(val);
    }

    private RangeKeyCondition withValues(Object ... values) {
        this.values = values;
        return this;
    }
}
