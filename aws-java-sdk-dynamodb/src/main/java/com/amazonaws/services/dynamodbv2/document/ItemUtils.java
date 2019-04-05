/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.dynamodbv2.document;

import static com.amazonaws.util.BinaryUtils.copyAllBytesFrom;

import com.amazonaws.services.dynamodbv2.document.internal.Filter;
import com.amazonaws.services.dynamodbv2.document.internal.InternalUtils;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.util.ValidationUtils;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Various utilities for manipulating {@link Item} and {@link AttributeValue} objects.
 */
public final class ItemUtils {

    private ItemUtils() {
    }

    /**
     * Returns an <code>Item</code> given the low level item information;
     * or null if the input is null;
     */
    public static Item toItem(Map<String, AttributeValue> item) {
        if (item == null) {
            return null;
        }
        return Item.fromMap(toSimpleMapValue(item));
    }

    /**
     * Returns a non-null list of <code>Item</code>'s given the low level
     * list of item information.
     */
    public static List<Item> toItemList(List<Map<String, AttributeValue>> items) {
        if (items == null) {
            return Collections.emptyList();
        }
        List<Item> result = new ArrayList<Item>(items.size());
        for (Map<String, AttributeValue> item : items) {
            result.add(toItem(item));
        }
        return result;
    }

    /**
     * Converts an <code>Item</code> into the low-level representation;
     * or null if the input is null.
     */
    public static Map<String, AttributeValue> toAttributeValues(Item item) {
        if (item == null)
            return null;
        // row with multiple attributes
        Map<String, AttributeValue> result = new LinkedHashMap<String, AttributeValue>();
        for (Map.Entry<String, Object> entry : item.attributes())
            result.put(entry.getKey(), toAttributeValue(entry.getValue()));
        return result;
    }

    /**
     * Converts a map of string to simple objects into the low-level
     * representation; or null if the input is null.
     */
    public static Map<String, AttributeValue> fromSimpleMap(
        Map<String, Object> map) {
        if (map == null)
            return null;
        // row with multiple attributes
        Map<String, AttributeValue> result = new LinkedHashMap<String, AttributeValue>();
        for (Map.Entry<String, Object> entry : map.entrySet())
            result.put(entry.getKey(), toAttributeValue(entry.getValue()));
        return result;
    }

    /**
     * Converts a list of <code>AttributeUpdate</code> into the low-level
     * representation; or null if the input is null.
     */
    public static Map<String, AttributeValueUpdate> toAttributeValueUpdate(
        List<AttributeUpdate> attributesToUpdate) {
        if (attributesToUpdate == null)
            return null;

        Map<String, AttributeValueUpdate> result = new LinkedHashMap<String, AttributeValueUpdate>();

        for (AttributeUpdate attribute : attributesToUpdate) {
            AttributeValueUpdate attributeToUpdate = new AttributeValueUpdate()
                .withAction(attribute.getAction());
            if (attribute.getValue() != null) {
                attributeToUpdate.withValue(toAttributeValue(attribute
                                                                 .getValue()));
            } else if (attribute.getAttributeValues() != null) {
                attributeToUpdate.withValue(toAttributeValue(attribute
                                                                 .getAttributeValues()));
            }
            result.put(attribute.getAttributeName(), attributeToUpdate);
        }

        return result;
    }

    /**
     * Converts a simple value into the low-level <code><AttributeValue/code>
     * representation.
     *
     * @param value
     *            the given value which can be one of the followings:
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
     *
     * @throws UnsupportedOperationException
     *             if the input object type is not supported
     */
    public static AttributeValue toAttributeValue(Object value) {
        AttributeValue result = new AttributeValue();
        if (value == null) {
            return result.withNULL(Boolean.TRUE);
        } else if (value instanceof Boolean) {
            return result.withBOOL((Boolean)value);
        } else if (value instanceof String) {
            return result.withS((String) value);
        } else if (value instanceof BigDecimal) {
            BigDecimal bd = (BigDecimal) value;
            return result.withN(bd.toPlainString());
        } else if (value instanceof Number) {
            return result.withN(value.toString());
        } else if (value instanceof byte[]) {
            return result.withB(ByteBuffer.wrap((byte[]) value));
        } else if (value instanceof ByteBuffer) {
            return result.withB((ByteBuffer) value);
        } else if (value instanceof Set) {
            // default to an empty string set if there is no element
            @SuppressWarnings("unchecked")
            Set<Object> set = (Set<Object>) value;
            if (set.size() == 0) {
                result.setSS(new LinkedHashSet<String>());
                return result;
            }
            Object element = set.iterator().next();
            if (element instanceof String) {
                @SuppressWarnings("unchecked")
                Set<String> ss = (Set<String>) value;
                result.setSS(new ArrayList<String>(ss));
            } else if (element instanceof Number) {
                @SuppressWarnings("unchecked")
                Set<Number> in = (Set<Number>) value;
                List<String> out = new ArrayList<String>(set.size());
                for (Number n : in) {
                    BigDecimal bd = InternalUtils.toBigDecimal(n);
                    out.add(bd.toPlainString());
                }
                result.setNS(out);
            } else if (element instanceof byte[]) {
                @SuppressWarnings("unchecked")
                Set<byte[]> in = (Set<byte[]>) value;
                List<ByteBuffer> out = new ArrayList<ByteBuffer>(set.size());
                for (byte[] buf : in) {
                    out.add(ByteBuffer.wrap(buf));
                }
                result.setBS(out);
            } else if (element instanceof ByteBuffer) {
                @SuppressWarnings("unchecked")
                Set<ByteBuffer> bs = (Set<ByteBuffer>) value;
                result.setBS(bs);
            } else {
                throw new UnsupportedOperationException("element type: "
                                                        + element.getClass());
            }
        } else if (value instanceof List) {
            @SuppressWarnings("unchecked")
            List<Object> in = (List<Object>) value;
            List<AttributeValue> out = new ArrayList<AttributeValue>();
            for (Object v : in) {
                out.add(toAttributeValue(v));
            }
            result.setL(out);
        } else if (value instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String, Object> in = (Map<String, Object>) value;
            if (in.size() > 0) {
                for (Map.Entry<String, Object> e : in.entrySet()) {
                    result.addMEntry(e.getKey(), toAttributeValue(e.getValue()));
                }
            } else {    // empty map
                result.setM(new LinkedHashMap<String,AttributeValue>());
            }
        } else {
            throw new UnsupportedOperationException("value type: "
                                                    + value.getClass());
        }
        return result;
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
        if (attrValues == null)
            return null;
        List<Object> result = new ArrayList<Object>(attrValues.size());
        for (AttributeValue attrValue : attrValues) {
            Object value = toSimpleValue(attrValue);
            result.add(value);
        }
        return result;
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
        if (values == null) {
            return null;
        }

        List<T> result = new ArrayList<T>(values.size());
        for (AttributeValue v : values) {
            T t = toSimpleValue(v);
            result.add(t);
        }
        return result;
    }

    public static <T> Map<String, T> toSimpleMapValue(
        Map<String, AttributeValue> values) {
        if (values == null) {
            return null;
        }

        Map<String, T> result = new LinkedHashMap<String, T>(values.size());
        for (Map.Entry<String, AttributeValue> entry : values.entrySet()) {
            T t = toSimpleValue(entry.getValue());
            result.put(entry.getKey(), t);
        }
        return result;
    }

    /**
     * Returns the string representation of the given value; or null if the
     * value is null. For <code>BigDecimal</code> it will be the string
     * representation without an exponent field.
     */
    public static String valToString(Object val) {
        if (val instanceof BigDecimal) {
            BigDecimal bd = (BigDecimal)val;
            return bd.toPlainString();
        }
        if (val == null)
            return null;
        if (val instanceof String
            ||  val instanceof Boolean
            ||  val instanceof Number)
            return val.toString();
        throw new IncompatibleTypeException("Cannot convert " + val.getClass() + " into a string");
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
     * @throws IllegalArgumentException
     *             if an empty <code>AttributeValue</code> value is specified
     */
    public static <T> T toSimpleValue(AttributeValue value) {
        if (value == null) {
            return null;
        }
        if (Boolean.TRUE.equals(value.getNULL())) {
            return null;
        } else if (Boolean.FALSE.equals(value.getNULL())) {
            throw new UnsupportedOperationException("False-NULL is not supported in DynamoDB");
        } else if (value.getBOOL() != null) {
            @SuppressWarnings("unchecked")
            T t = (T) value.getBOOL();
            return t;
        } else if (value.getS() != null) {
            @SuppressWarnings("unchecked")
            T t = (T) value.getS();
            return t;
        } else if (value.getN() != null) {
            @SuppressWarnings("unchecked")
            T t = (T) new BigDecimal(value.getN());
            return t;
        } else if (value.getB() != null) {
            @SuppressWarnings("unchecked")
            T t = (T) copyAllBytesFrom(value.getB());
            return t;
        } else if (value.getSS() != null) {
            @SuppressWarnings("unchecked")
            T t = (T) new LinkedHashSet<String>(value.getSS());
            return t;
        } else if (value.getNS() != null) {
            Set<BigDecimal> set = new LinkedHashSet<BigDecimal>(value.getNS().size());
            for (String s : value.getNS()) {
                set.add(new BigDecimal(s));
            }
            @SuppressWarnings("unchecked")
            T t = (T) set;
            return t;
        } else if (value.getBS() != null) {
            Set<byte[]> set = new LinkedHashSet<byte[]>(value.getBS().size());
            for (ByteBuffer bb : value.getBS()) {
                set.add(copyAllBytesFrom(bb));
            }
            @SuppressWarnings("unchecked")
            T t = (T) set;
            return t;
        } else if (value.getL() != null) {
            @SuppressWarnings("unchecked")
            T t = (T) toSimpleList(value.getL());
            return t;
        } else if (value.getM() != null) {
            @SuppressWarnings("unchecked")
            T t = (T) toSimpleMapValue(value.getM());
            return t;
        } else {
            throw new IllegalArgumentException(
                "Attribute value must not be empty: " + value);
        }
    }

    /**
     * Returns the minimum of the two input integers taking null into account.
     * Returns null if both integers are null. Otherwise, a null Integer is
     * treated as infinity.
     */
    public static Integer minimum(Integer one, Integer two) {
        if (one == null) {
            return two;
        } else if (two == null) {
            return one;
        } else if (one < two) {
            return one;
        } else {
            return two;
        }
    }

    /**
     * Returns the low level representation of a collection of <code>Expected</code>.
     */
    public static Map<String, ExpectedAttributeValue> toExpectedAttributeValueMap(
        Collection<Expected> expectedSet) {
        if (expectedSet == null)
            return null;
        Map<String, ExpectedAttributeValue> expectedMap =
            new LinkedHashMap<String, ExpectedAttributeValue>();
        for (Expected expected : expectedSet) {
            final String attr = expected.getAttribute();
            final Object[] values = expected.getValues();
            ExpectedAttributeValue eav = new ExpectedAttributeValue();
            if (values != null) {
                if (values.length > 0) {
                    // convert from list of object values to list of AttributeValues
                    AttributeValue[] avs = InternalUtils.toAttributeValues(values);
                    eav.withAttributeValueList(avs);
                } else {
                    throw new IllegalStateException("Bug!");
                }
            }
            ComparisonOperator op = expected.getComparisonOperator();
            if (op == null) {
                throw new IllegalArgumentException(
                    "Comparison operator for attribute " + expected.getAttribute()
                    + " must be specified");
            }
            eav.withComparisonOperator(op);
            expectedMap.put(attr, eav);
        }
        if (expectedSet.size() != expectedMap.size())
            throw new IllegalArgumentException("duplicates attribute names not allowed in input");
        return Collections.unmodifiableMap(expectedMap);
    }

    /**
     * Returns the low level representation of a collection of <code>Filter</code>.
     */
    public static Map<String, Condition> toAttributeConditionMap(Collection<? extends Filter<?>> filters) {
        if (filters == null)
            return null;
        Map<String, Condition> conditionMap = new LinkedHashMap<String, Condition>();
        for (Filter<?> filter : filters) {
            final String attr = filter.getAttribute();
            final Object[] values = filter.getValues();
            Condition condition = new Condition();
            if (values != null) {
                if (values.length > 0) {
                    // convert from list of object values to list of AttributeValues
                    AttributeValue[] avs = InternalUtils.toAttributeValues(values);
                    condition.withAttributeValueList(avs);
                } else {
                    throw new IllegalStateException("Bug!");
                }
            }
            ComparisonOperator op = filter.getComparisonOperator();
            if (op == null) {
                throw new IllegalArgumentException(
                    "Comparison operator for attribute " + filter.getAttribute()
                    + " must be specified");
            }
            condition.withComparisonOperator(op);
            conditionMap.put(attr, condition);
        }
        if (filters.size() != conditionMap.size())
            throw new IllegalArgumentException("duplicates attribute names not allowed in input");
        return Collections.unmodifiableMap(conditionMap);
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
        AttributeValue[] attrValues = new AttributeValue[values.length];
        for (int i=0; i < values.length; i++)
            attrValues[i] = InternalUtils.toAttributeValue(values[i]);
        return attrValues;
    }

    /**
     * Converts the specified primary key into the low-level representation.
     */
    public static Map<String, AttributeValue> toAttributeValueMap(
        Collection<KeyAttribute> primaryKey) {
        if (primaryKey == null)
            return null;
        Map<String, AttributeValue> keys = new LinkedHashMap<String, AttributeValue>();
        for (KeyAttribute keyAttr : primaryKey)
            keys.put(keyAttr.getName(),
                     InternalUtils.toAttributeValue(keyAttr.getValue()));
        return Collections.unmodifiableMap(keys);
    }

    /**
     * Converts the specified primary key into the low-level representation.
     */
    public static Map<String, AttributeValue> toAttributeValueMap(
        PrimaryKey primaryKey) {
        if (primaryKey == null)
            return null;
        return toAttributeValueMap(primaryKey.getComponents());
    }

    /**
     * Converts the specified primary key into the low-level representation.
     */
    public static Map<String, AttributeValue> toAttributeValueMap(
        KeyAttribute ... primaryKey) {
        if (primaryKey == null)
            return null;
        return toAttributeValueMap(Arrays.asList(primaryKey));
    }

    /**
     * Converts a number into BigDecimal representation.
     */
    public static BigDecimal toBigDecimal(Number n) {
        if (n instanceof BigDecimal)
            return (BigDecimal)n;
        return new BigDecimal(n.toString());
    }

    public static Set<BigDecimal> toBigDecimalSet(Number ... val) {
        Set<BigDecimal> set = new LinkedHashSet<BigDecimal>(val.length);
        for (Number n: val)
            set.add(InternalUtils.toBigDecimal(n));
        return set;
    }

    public static Set<BigDecimal> toBigDecimalSet(Set<Number> vals) {
        Set<BigDecimal> set = new LinkedHashSet<BigDecimal>(vals.size());
        for (Number n: vals)
            set.add(InternalUtils.toBigDecimal(n));
        return set;
    }

    public static void checkInvalidAttrName(String attrName) {
        if (attrName == null || attrName.trim().length() == 0)
            throw new IllegalArgumentException("Attribute name must not be null or empty");
    }

    public static void checkInvalidAttribute(String attrName, Object val) {
        checkInvalidAttrName(attrName);
        ValidationUtils.assertNotNull(val, attrName);
    }
}
