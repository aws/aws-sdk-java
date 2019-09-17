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
package com.amazonaws.services.dynamodbv2.document.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.dynamodbv2.document.AttributeUpdate;
import com.amazonaws.services.dynamodbv2.document.Expected;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemUtils;
import com.amazonaws.services.dynamodbv2.document.KeyAttribute;
import com.amazonaws.services.dynamodbv2.document.PrimaryKey;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.util.ValidationUtils;
import com.amazonaws.util.VersionInfoUtils;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Internal utilities.  Not meant for general use.  May change without notice.
 *
 * @deprecated Use {@link ItemUtils} instead.
 */
@Deprecated
public enum InternalUtils {
    ;

    /**
     * Returns a non-null list of <code>Item</code>'s given the low level
     * list of item information.
     */
    public static List<Item> toItemList(List<Map<String, AttributeValue>> items) {
        return ItemUtils.toItemList(items);
    }

    /**
     * Converts an <code>Item</code> into the low-level representation;
     * or null if the input is null.
     */
    public static Map<String, AttributeValue> toAttributeValues(Item item) {
        return ItemUtils.toAttributeValues(item);
    }

    /**
     * Converts a map of string to simple objects into the low-level
     * representation; or null if the input is null.
     */
    public static Map<String, AttributeValue> fromSimpleMap(
        Map<String, Object> map) {
        return ItemUtils.fromSimpleMap(map);
    }

    /**
     * Converts a list of <code>AttributeUpdate</code> into the low-level
     * representation; or null if the input is null.
     */
    public static Map<String, AttributeValueUpdate> toAttributeValueUpdate(
        List<AttributeUpdate> attributesToUpdate) {
        return ItemUtils.toAttributeValueUpdate(attributesToUpdate);
    }

    /**
     * Converts a simple value into the low-level <code><AttributeValue/code>
     * representation.
     *
     * @param value the given value which can be one of the followings:
     * <ul>
     * <li>String</li>
     * <li>Set&lt;String></li>
     * <li>Number (including any subtypes and primitive types)</li>
     * <li>Set&lt;Number></li>
     * <li>byte[]</li>
     * <li>Set&lt;byte[]></li>
     * <li>ByteBuffer</li>
     * <li>Set&lt;ByteBuffer></li>
     * <li>Boolean or boolean</li>
     * <li>null</li>
     * <li>Map&lt;String,T>, where T can be any type on this list but must not
     * induce any circular reference</li>
     * <li>List&lt;T>, where T can be any type on this list but must not induce
     * any circular reference</li>
     * </ul>
     * @return a non-null low level representation of the input object value
     * @throws UnsupportedOperationException if the input object type is not supported
     */
    public static AttributeValue toAttributeValue(Object value) {
        return ItemUtils.toAttributeValue(value);
    }

    /**
     * Converts a list of low-level <code>AttributeValue</code> into a list of
     * simple values. Each value in the returned list can be one of the
     * followings:
     *
     * <ul>
     * <li>String</li>
     * <li>Set&lt;String></li>
     * <li>Number (including any subtypes and primitive types)</li>
     * <li>Set&lt;Number></li>
     * <li>byte[]</li>
     * <li>Set&lt;byte[]></li>
     * <li>ByteBuffer</li>
     * <li>Set&lt;ByteBuffer></li>
     * <li>Boolean or boolean</li>
     * <li>null</li>
     * <li>Map&lt;String,T>, where T can be any type on this list but must not
     * induce any circular reference</li>
     * <li>List&lt;T>, where T can be any type on this list but must not induce
     * any circular reference</li>
     * </ul>
     */
    public static List<Object> toSimpleList(List<AttributeValue> attrValues) {
        return ItemUtils.toSimpleList(attrValues);
    }

    /**
     * Convenient method to convert a list of low-level
     * <code>AttributeValue</code> into a list of values of the same type T.
     * Each value in the returned list can be one of the followings:
     * <ul>
     * <li>String</li>
     * <li>Set&lt;String></li>
     * <li>Number (including any subtypes and primitive types)</li>
     * <li>Set&lt;Number></li>
     * <li>byte[]</li>
     * <li>Set&lt;byte[]></li>
     * <li>ByteBuffer</li>
     * <li>Set&lt;ByteBuffer></li>
     * <li>Boolean or boolean</li>
     * <li>null</li>
     * <li>Map&lt;String,T>, where T can be any type on this list but must not
     * induce any circular reference</li>
     * <li>List&lt;T>, where T can be any type on this list but must not induce
     * any circular reference</li>
     * </ul>
     */
    public static <T> List<T> toSimpleListValue(List<AttributeValue> values) {
        return ItemUtils.toSimpleListValue(values);
    }

    public static <T> Map<String, T> toSimpleMapValue(
        Map<String, AttributeValue> values) {
        return ItemUtils.toSimpleMapValue(values);
    }

    /**
     * Returns the string representation of the given value; or null if the
     * value is null. For <code>BigDecimal</code> it will be the string
     * representation without an exponent field.
     */
    public static String valToString(Object val) {
        return ItemUtils.valToString(val);
    }

    /**
     * Converts a low-level <code>AttributeValue</code> into a simple value,
     * which can be one of the followings:
     *
     * <ul>
     * <li>String</li>
     * <li>Set&lt;String></li>
     * <li>Number (including any subtypes and primitive types)</li>
     * <li>Set&lt;Number></li>
     * <li>byte[]</li>
     * <li>Set&lt;byte[]></li>
     * <li>ByteBuffer</li>
     * <li>Set&lt;ByteBuffer></li>
     * <li>Boolean or boolean</li>
     * <li>null</li>
     * <li>Map&lt;String,T>, where T can be any type on this list but must not
     * induce any circular reference</li>
     * <li>List&lt;T>, where T can be any type on this list but must not induce
     * any circular reference</li>
     * </ul>
     *
     * @throws IllegalArgumentException if an empty <code>AttributeValue</code> value is specified
     */
    static <T> T toSimpleValue(AttributeValue value) {
        return ItemUtils.toSimpleValue(value);
    }

    /**
     * Returns the minimum of the two input integers taking null into account.
     * Returns null if both integers are null. Otherwise, a null Integer is
     * treated as infinity.
     */
    public static Integer minimum(Integer one, Integer two) {
        return ItemUtils.minimum(one, two);
    }

    /**
     * Returns the low level representation of a collection of <code>Expected</code>.
     */
    public static Map<String, ExpectedAttributeValue> toExpectedAttributeValueMap(
        Collection<Expected> expectedSet) {
        return ItemUtils.toExpectedAttributeValueMap(expectedSet);
    }

    /**
     * Returns the low level representation of a collection of <code>Filter</code>.
     */
    public static Map<String, Condition> toAttributeConditionMap(Collection<? extends Filter<?>> filters) {
        return ItemUtils.toAttributeConditionMap(filters);
    }

    /**
     * Converts the input array of values into an array of low level
     * representation of those values.
     *
     * A value in the input array can be one of the followings:
     *
     * <ul>
     * <li>String</li>
     * <li>Set&lt;String></li>
     * <li>Number (including any subtypes and primitive types)</li>
     * <li>Set&lt;Number></li>
     * <li>byte[]</li>
     * <li>Set&lt;byte[]></li>
     * <li>ByteBuffer</li>
     * <li>Set&lt;ByteBuffer></li>
     * <li>Boolean or boolean</li>
     * <li>null</li>
     * <li>Map&lt;String,T>, where T can be any type on this list but must not
     * induce any circular reference</li>
     * <li>List&lt;T>, where T can be any type on this list but must not induce
     * any circular reference</li>
     * </ul>
     */
    public static AttributeValue[] toAttributeValues(Object[] values) {
        return ItemUtils.toAttributeValues(values);
    }

    /**
     * Converts the specified primary key into the low-level representation.
     */
    public static Map<String, AttributeValue> toAttributeValueMap(
        Collection<KeyAttribute> primaryKey) {
        return ItemUtils.toAttributeValueMap(primaryKey);
    }

    /**
     * Converts the specified primary key into the low-level representation.
     */
    public static Map<String, AttributeValue> toAttributeValueMap(
        PrimaryKey primaryKey) {
        return ItemUtils.toAttributeValueMap(primaryKey);
    }

    /**
     * Converts the specified primary key into the low-level representation.
     */
    public static Map<String, AttributeValue> toAttributeValueMap(
        KeyAttribute... primaryKey) {
        return ItemUtils.toAttributeValueMap(primaryKey);
    }

    /**
     * Converts a number into BigDecimal representation.
     */
    public static BigDecimal toBigDecimal(Number n) {
        return ItemUtils.toBigDecimal(n);
    }

    public static Set<BigDecimal> toBigDecimalSet(Number... val) {
        return ItemUtils.toBigDecimalSet(val);
    }

    public static Set<BigDecimal> toBigDecimalSet(Set<Number> vals) {
        return ItemUtils.toBigDecimalSet(vals);
    }

    /**
     * Append the custom user-agent string.
     * <p>Note to maintainers, this is technically not deprecated and not present in {@link ItemUtils}. It is truly meant for
     * internal use only.</p>
     */
    public static <X extends AmazonWebServiceRequest> X applyUserAgent(X request) {
        final String USER_AGENT = "dynamodb-table-api/" + VersionInfoUtils.getVersion();

        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        return request;
    }

    public static void rejectNullValue(Object val) {
        ValidationUtils.assertNotNull(val, "val");
    }

    public static void rejectNullInput(Object input) {
        ValidationUtils.assertNotNull(input, "val");
    }

    public static void rejectEmptyInput(Object[] input) {
        ValidationUtils.assertNotEmpty(input, "input");
    }

    public static void rejectNullOrEmptyInput(Object[] input) {
        rejectNullInput(input);
        rejectEmptyInput(input);
    }

    public static void checkInvalidAttrName(String attrName) {
        ItemUtils.checkInvalidAttrName(attrName);
    }

    public static void checkInvalidAttribute(String attrName, Object val) {
        ItemUtils.checkInvalidAttribute(attrName, val);
    }
}
