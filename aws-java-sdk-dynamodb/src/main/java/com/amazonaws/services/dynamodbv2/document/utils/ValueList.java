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
package com.amazonaws.services.dynamodbv2.document.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.document.internal.InternalUtils;

/**
 * Utility value list.
 */
public class ValueList extends FluentArrayList<Object> {
    private static final long serialVersionUID = 1L;

    public ValueList(int initialCapacity) {
        super(initialCapacity);
    }

    public ValueList(Object ... elements) {
        super(elements);
    }

    public ValueList() {
        super();
    }

    public ValueList(Collection<?> c) {
        super(c);
    }

    public ValueList appendAll(Object ... elements) {
        super.appendAll(elements);
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendString(String val) {
        super.append(val);
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendNumber(BigDecimal val) {
        super.append(val);
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendNumber(Number val) {
        super.append(InternalUtils.toBigDecimal(val));
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendInt(int val) {
        return appendNumber(Integer.valueOf(val));
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendLong(long val) {
        return appendNumber(Long.valueOf(val));
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendBinary(byte[] val) {
        super.append(val);
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendStringSet(Set<String> val) {
        super.append(val);
        return this;
    }

    /** 
     * Appends the given values to this list as a string set.
     */
    public ValueList appendStringSet(String ...val) {
        super.append(new LinkedHashSet<String>(Arrays.asList(val)));
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendNumberSet(Set<BigDecimal> val) {
        super.append(val);
        return this;
    }

    /** 
     * Appends the given value to this list as a set of BigDecimals.
     */
    public ValueList appendNumberSet(BigDecimal ... val) {
        super.append(new LinkedHashSet<BigDecimal>(Arrays.asList(val)));
        return this;
    }

    /** 
     * Appends the given values to this list as a number set.
     */
    public ValueList appendNumberSet(Number ... val) {
        super.append(InternalUtils.toBigDecimalSet(val));
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendBinarySet(Set<byte[]> val) {
        super.append(val);
        return this;
    }

    /** 
     * Appends the given values to this list as a set of byte arrays.
     */
    public ValueList appendBinarySet(byte[] ... val) {
        super.append(new LinkedHashSet<byte[]>(Arrays.asList(val)));
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendList(List<?> val) {
        super.append(new ArrayList<Object>(val));
        return this;
    }

    /** 
     * Appends the given values to this list as a list.
     */
    public ValueList appendList(Object ... vals) {
        super.append(new ArrayList<Object>(Arrays.asList(vals)));
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendMap(Map<String, ?> val) {
        super.append(val);
        return this;
    }

    /** 
     * Appends the given value to this list.
     */
    public ValueList appendBoolean(boolean val) {
        super.append(Boolean.valueOf(val));
        return this;
    }

    /** 
     * Appends a null value to this list.
     */
    public ValueList appendNull() {
        super.append(null);
        return this;
    }

    /**
     * Appends the given value to this list. A value can be a
     * <ul>
     * <li>Number</li>
     * <li>String</li>
     * <li>binary (ie byte array or byte buffer)</li>
     * <li>boolean</li>
     * <li>null</li>
     * <li>list (of any of the types on this list)</li>
     * <li>map (append string key to value of any of the types on this list)</li>
     * <li>set (of any of the types on this list)</li>
     * </ul>
     */
    public ValueList append(Object val) {
        if (val == this)
            throw new IllegalArgumentException("Self reference is not allowed");
        // TODO: fail fast if val is not a supported type
        super.append(val);
        return this;
    }

}
