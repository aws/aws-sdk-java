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
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.checkInvalidAttrName;
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.checkInvalidAttribute;
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.rejectNullInput;
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.rejectNullOrEmptyInput;
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.rejectNullValue;
import static com.amazonaws.services.dynamodbv2.document.internal.InternalUtils.valToString;
import static com.amazonaws.util.BinaryUtils.copyAllBytesFrom;
import static com.amazonaws.util.BinaryUtils.copyBytesFrom;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.document.internal.InternalUtils;
import com.amazonaws.services.dynamodbv2.document.internal.ItemValueConformer;
import com.amazonaws.util.Base64;
import com.amazonaws.util.json.Jackson;
/**
 * An <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"
 * >item</a> in DynamoDB. An item is a collection of attributes. Each attribute
 * has a name and a value. An attribute value can be one of the followings:
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
 * For an <code>Item</code> to be successfully persisted in DynamoDB, at a
 * minimum the respective attributes for the primary key must be specified.
 */
public class Item {
    private static final String DUPLICATE_VALUES_FOUND_IN_INPUT = "Duplicate values found in input";
    private final Map<String, Object> attributes = new LinkedHashMap<String, Object>();
    private static final ItemValueConformer valueConformer = new ItemValueConformer();

    /**
     * Returns true if the specified attribute exists with a null value; false
     * otherwise.
     */
    public boolean isNull(String attrName) {
        return attributes.containsKey(attrName)
                && attributes.get(attrName) == null;
    }

    /**
     * Returns true if this item contains the specified attribute; false
     * otherwise.
     */
    public boolean isPresent(String attrName) {
        return attributes.containsKey(attrName);
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * string; or null if the attribute either doesn't exist or the attribute
     * value is null.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public String getString(String attrName) {
        Object val = attributes.get(attrName);
        return valToString(val);
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given string value.
     */
    public Item withString(String attrName, String val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, val);
        return this;
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * <code>BigDecimal</code>; or null if the attribute either doesn't exist or
     * the attribute value is null.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws NumberFormatException if the attribute value is not a valid
     *         representation of a {@code BigDecimal}.
     */
    public BigDecimal getNumber(String attrName) {
        Object val = attributes.get(attrName);
        return toBigDecimal(val);
    }

    private BigDecimal toBigDecimal(Object val) {
        if (val == null)
            return null;
        return val instanceof BigDecimal
             ?  (BigDecimal) val
             : new BigDecimal(val.toString())
             ;
    }

    /**
     * Returns the value of the specified attribute in the current item as an
     * <code>BigInteger</code>; or null if the attribute doesn't exist.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws NumberFormatException
     *             if the attribute value is null or not a valid representation
     *             of a {@code BigDecimal}.
     */
    public BigInteger getBigInteger(String attrName) {
        BigDecimal bd = getNumber(attrName);
        return bd == null ? null : bd.toBigInteger();
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * <code>short</code>.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws NumberFormatException
     *             if the attribute value is null or not a valid representation
     *             of a {@code BigDecimal}.
     */
    public short getShort(String attrName) {
        BigDecimal bd = getNumber(attrName);
        if (bd == null)
            throw new NumberFormatException
                ("value of " + attrName + " is null");
        return bd.shortValue();
    }

    /**
     * Returns the value of the specified attribute in the current item as an
     * <code>int</code>.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws NumberFormatException
     *             if the attribute value is null or not a valid representation
     *             of a {@code BigDecimal}.
     */
    public int getInt(String attrName) {
        BigDecimal bd = getNumber(attrName);
        if (bd == null)
            throw new NumberFormatException
                ("value of " + attrName + " is null");
        return bd.intValue();
    }

    /**
     * Returns the value of the specified attribute in the current item as an
     * <code>long</code>.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws NumberFormatException
     *             if the attribute value is null or not a valid representation
     *             of a {@code BigDecimal}.
     */
    public long getLong(String attrName) {
        BigDecimal bd = getNumber(attrName);
        if (bd == null)
            throw new NumberFormatException
                ("value of " + attrName + " is null");
        return bd.longValue();
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * <code>float</code>.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws NumberFormatException
     *             if the attribute value is null or not a valid representation
     *             of a {@code BigDecimal}.
     */
    public float getFloat(String attrName) {
        BigDecimal bd = getNumber(attrName);
        if (bd == null)
            throw new NumberFormatException
                ("value of " + attrName + " is null");
        return bd.floatValue();
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * <code>double</code>.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws NumberFormatException
     *             if the attribute value is null or not a valid representation
     *             of a {@code BigDecimal}.
     */
    public double getDouble(String attrName) {
        BigDecimal bd = getNumber(attrName);
        if (bd == null)
            throw new NumberFormatException
                ("value of " + attrName + " is null");
        return bd.doubleValue();
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withNumber(String attrName, BigDecimal val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, val);
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withNumber(String attrName, Number val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, toBigDecimal(val));
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withInt(String attrName, int val) {
        checkInvalidAttrName(attrName);
        return withNumber(attrName, Integer.valueOf(val));
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBigInteger(String attrName, BigInteger val) {
        checkInvalidAttrName(attrName);
        return withNumber(attrName, val);
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withShort(String attrName, short val) {
        checkInvalidAttrName(attrName);
        return withNumber(attrName, Short.valueOf(val));
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withFloat(String attrName, float val) {
        checkInvalidAttrName(attrName);
        return withNumber(attrName, Float.valueOf(val));
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withDouble(String attrName, double val) {
        checkInvalidAttrName(attrName);
        return withNumber(attrName, Double.valueOf(val));
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withLong(String attrName, long val) {
        checkInvalidAttrName(attrName);
        return withNumber(attrName, Long.valueOf(val));
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * byte array; or null if the attribute either doesn't exist or the
     * attribute value is null.
     *
     * @throws UnsupportedOperationException
     *             If the attribute value involves a byte buffer which is not
     *             backed by an accessible array
     *
     * @throws IncompatibleTypeException
     *             if the attribute value cannot be converted into a byte array
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public byte[] getBinary(String attrName) {
        Object val = attributes.get(attrName);
        return toByteArray(val);
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * <code>ByteBuffer</code>; or null if the attribute either doesn't exist or
     * the attribute value is null.
     *
     * @throws IncompatibleTypeException
     *             if the attribute value cannot be converted into a byte array
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public ByteBuffer getByteBuffer(String attrName) {
        Object val = attributes.get(attrName);
        return toByteBuffer(val);
    }

    /**
     * This method is assumed to be only called from a getter method, but NOT
     * from a setter method.
     */
    private byte[] toByteArray(Object val) {
        if (val == null)
            return null;
        if (val instanceof byte[])
            return (byte[]) val;
        if (val instanceof ByteBuffer) {
            // Defensive code but execution should never get here. The internal
            // representation of binary should always be
            // byte[], not ByteBuffer. This allows Item to be converted into
            // a JSON string via Jackson without causing trouble.
            return copyAllBytesFrom((ByteBuffer)val);
        }
        throw new IncompatibleTypeException(val.getClass()
                + " cannot be converted into a byte array");
    }

    private ByteBuffer toByteBuffer(Object val) {
        if (val == null)
            return null;
        if (val instanceof byte[])
            return ByteBuffer.wrap((byte[])val);
        if (val instanceof ByteBuffer) {
            // Defensive code but execution should never get here. The internal
            // representation of binary should always be
            // byte[], not ByteBuffer. This allows Item to be converted into
            // a JSON string via Jackson without causing trouble.
            return (ByteBuffer)val;
        }
        throw new IncompatibleTypeException(val.getClass()
                + " cannot be converted into a ByteBuffer");
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBinary(String attrName, byte[] val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, val);
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBinary(String attrName, ByteBuffer val) {
        checkInvalidAttribute(attrName, val);
        // convert ByteBuffer to bytes to keep Jackson happy
        attributes.put(attrName, copyBytesFrom(val));
        return this;
    }

    /**
     * Returns the value of the specified attribute in the current item as a set
     * of strings; or null if the attribute either doesn't exist or the
     * attribute value is null.
     *
     * @throws IncompatibleTypeException
     *             if the attribute value cannot be converted into a set of
     *             strings because of duplicate elements
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public Set<String> getStringSet(String attrName) {
        Object val = attributes.get(attrName);
        if (val == null)
            return null;
        Set<String> stringSet = new LinkedHashSet<String>();
        if (val instanceof Collection) {
            Collection<?> col = (Collection<?>) val;
            if (col.size() == 0)
                return stringSet;
            for (Object element: col) {
                String s = element == null ? null : valToString(element);
                if (!stringSet.add(s))
                    throw new IncompatibleTypeException(val.getClass()
                        + " cannot be converted into a set of strings because of duplicate elements");
            }
            return stringSet;
        }
        stringSet.add(valToString(val));
        return stringSet;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withStringSet(String attrName, Set<String> val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, val);
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withStringSet(String attrName, String ...val) {
        checkInvalidAttribute(attrName, val);
        Set<String> strSet = new LinkedHashSet<String>(Arrays.asList(val));
        if (strSet.size() != val.length)
            throw new IllegalArgumentException(DUPLICATE_VALUES_FOUND_IN_INPUT);
        attributes.put(attrName, strSet);
        return this;
    }

    /**
     * Returns the value of the specified attribute in the current item as a set
     * of BigDecimal's; or null if the attribute either doesn't exist or the
     * attribute value is null.
     *
     * @throws NumberFormatException
     *             if the attribute involves a value that is not a valid
     *             representation of a {@code BigDecimal}.
     *
     * @throws IncompatibleTypeException
     *             if the attribute value cannot be converted into a set of
     *             <code>BigDecimal</code>'s because of duplicate elements
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public Set<BigDecimal> getNumberSet(String attrName) {
        Object val = attributes.get(attrName);
        if (val == null)
            return null;
        Set<BigDecimal> numSet = new LinkedHashSet<BigDecimal>();
        if (val instanceof Collection) {
            Collection<?> col = (Collection<?>) val;
            if (col.size() == 0)
                return numSet;
            for (Object element: col) {
                BigDecimal bd = toBigDecimal(element);
                if (!numSet.add(bd))
                    throw new IncompatibleTypeException(val.getClass()
                        + " cannot be converted into a set of BigDecimal's because of duplicate elements");
            }
            return numSet;
        } else if (val instanceof BigDecimal) {
            numSet.add((BigDecimal)val);
            return numSet;
        } else {
            numSet.add(new BigDecimal(val.toString()));
            return numSet;
        }
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBigDecimalSet(String attrName, Set<BigDecimal> val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, val);
        return this;
    }
    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBigDecimalSet(String attrName, BigDecimal ... vals) {
        checkInvalidAttribute(attrName, vals);
        Set<BigDecimal> set = new LinkedHashSet<BigDecimal>(Arrays.asList(vals));
        if (set.size() != vals.length)
            throw new IllegalArgumentException(DUPLICATE_VALUES_FOUND_IN_INPUT);
        attributes.put(attrName, set);
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withNumberSet(String attrName, Number ... vals) {
        checkInvalidAttribute(attrName, vals);
        Set<BigDecimal> set = InternalUtils.toBigDecimalSet(vals);
        if (set.size() != vals.length)
            throw new IllegalArgumentException(DUPLICATE_VALUES_FOUND_IN_INPUT);
        return withBigDecimalSet(attrName, set);
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withNumberSet(String attrName, Set<Number> vals) {
        checkInvalidAttribute(attrName, vals);
        Set<BigDecimal> set = InternalUtils.toBigDecimalSet(vals);
        if (set.size() != vals.size())
            throw new IllegalArgumentException(DUPLICATE_VALUES_FOUND_IN_INPUT);
        return withBigDecimalSet(attrName, set);
    }

    /**
     * Returns the value of the specified attribute in the current item as a set
     * of byte arrays; or null if the attribute either doesn't exist or the
     * attribute value is null.
     *
     * @throws IncompatibleTypeException
     *             if the attribute value cannot be converted into a set of byte
     *             arrays
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public Set<byte[]> getBinarySet(String attrName) {
        Object val = attributes.get(attrName);
        if (val == null)
            return null;
        Set<byte[]> binarySet = new LinkedHashSet<byte[]>();
        if (val instanceof Collection) {
            Collection<?> col = (Collection<?>) val;
            if (col.size() == 0)
                return binarySet;
            for (Object element: col) {
                byte[] ba = toByteArray(element);
                if (!binarySet.add(ba))
                    throw new IncompatibleTypeException(val.getClass()
                        + " cannot be converted into a set of byte arrays because of duplicate elements");
            }
            return binarySet;
        } else if (val instanceof byte[]) {
            binarySet.add((byte[])val);
            return binarySet;
        } else if (val instanceof ByteBuffer) {
            // Defensive code but execution should never get here. The internal
            // representation of binary should always be
            // byte[], not ByteBuffer. This allows Item to be converted into
            // a JSON string via Jackson without causing trouble.
            ByteBuffer bb = (ByteBuffer) val;
            binarySet.add(copyAllBytesFrom(bb));
            return binarySet;
        }
        throw new IncompatibleTypeException(val.getClass()
                + " cannot be converted into a set of byte arrays");
    }

    /**
     * Returns the value of the specified attribute in the current item as a set
     * of <code>ByteBuffer</code>; or null if the attribute either doesn't exist
     * or the attribute value is null.
     *
     * @throws IncompatibleTypeException
     *             if the attribute value cannot be converted into a set of
     *             <code>ByteBuffer</code>
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public Set<ByteBuffer> getByteBufferSet(String attrName) {
        Object val = attributes.get(attrName);
        if (val == null)
            return null;
        Set<ByteBuffer> binarySet = new LinkedHashSet<ByteBuffer>();
        if (val instanceof Collection) {
            Collection<?> col = (Collection<?>) val;
            if (col.size() == 0)
                return binarySet;
            for (Object element: col) {
                ByteBuffer ba = toByteBuffer(element);
                if (!binarySet.add(ba))
                    throw new IncompatibleTypeException(val.getClass()
                        + " cannot be converted into a set of ByteBuffer because of duplicate elements");
            }
            return binarySet;
        } else if (val instanceof ByteBuffer) {
            // Defensive code but execution should never get here. The internal
            // representation of binary should always be
            // byte[], not ByteBuffer. This allows Item to be converted into
            // a JSON string via Jackson without causing trouble.
            binarySet.add((ByteBuffer)val);
            return binarySet;
        } else if (val instanceof byte[]) {
            binarySet.add(ByteBuffer.wrap((byte[])val));
            return binarySet;
        }
        throw new IncompatibleTypeException(val.getClass()
                + " cannot be converted into a set of ByteBuffer");
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBinarySet(String attrName, Set<byte[]> val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, val);
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withByteBufferSet(String attrName, Set<ByteBuffer> val) {
        checkInvalidAttribute(attrName, val);
        // convert ByteBuffer to bytes to keep Jackson happy
        Set<byte[]> set = new LinkedHashSet<byte[]>(val.size());
        for (ByteBuffer bb: val)
            set.add(copyBytesFrom(bb));
        attributes.put(attrName, set);
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBinarySet(String attrName, byte[] ... vals) {
        checkInvalidAttribute(attrName, vals);
        Set<byte[]> set = new LinkedHashSet<byte[]>(Arrays.asList(vals));
        if (set.size() != vals.length)
            throw new IllegalArgumentException(DUPLICATE_VALUES_FOUND_IN_INPUT);
        attributes.put(attrName, set);
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withBinarySet(String attrName, ByteBuffer ... vals) {
        checkInvalidAttribute(attrName, vals);
        // convert ByteBuffer to bytes to keep Jackson happy
        Set<byte[]> set = new LinkedHashSet<byte[]>(vals.length);
        for (ByteBuffer bb: vals)
            set.add(copyBytesFrom(bb));
        if (set.size() != vals.length)
            throw new IllegalArgumentException(DUPLICATE_VALUES_FOUND_IN_INPUT);
        attributes.put(attrName, set);
        return this;
    }

    /**
     * Returns the value of the specified attribute in the current item as a set
     * of <code>T</code>'s.; or null if the attribute either doesn't exist or
     * the attribute value is null.
     *
     * @throws ClassCastException
     *             if the attribute involves a value that cannot be casted to
     *             <code>T</code>
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public <T> List<T> getList(String attrName) {
        Object val = attributes.get(attrName);
        if (val == null)
            return null;
        if (val instanceof List) {
            @SuppressWarnings("unchecked")
            List<T> ret = (List<T>)val;
            return ret;
        }
        List<T> list = new ArrayList<T>();
        if (val instanceof Collection) {
            Collection<?> col = (Collection<?>)val;
            for (Object element: col) {
                @SuppressWarnings("unchecked")
                T t = (T)element;
                list.add(t);
            }
            return list;
        }
        @SuppressWarnings("unchecked")
        T t = (T)val;
        list.add(t);
        return list;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withList(String attrName, List<?> val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, valueConformer.transform(val));
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given values as a list.
     */
    public Item withList(String attrName, Object ... vals) {
        checkInvalidAttribute(attrName, vals);
        List<Object> list_in = Arrays.asList(vals);
        attributes.put(attrName, valueConformer.transform(list_in));
        return this;
    }

    /**
     * Returns the value of the specified attribute in the current item as a map
     * of string-to-<code>T</code>'s; or null if the attribute either doesn't
     * exist or the attribute value is null. Note that any numeric type of a
     * map is always canonicalized into <code>BigDecimal</code>, and therefore
     * if <code>T</code> referred to a <code>Number</code> type, it would need
     * to be <code>BigDecimal</code> to avoid a class cast exception.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws ClassCastException
     *             if the attribute is not a map of string to <code>T</code>
     */
    @SuppressWarnings("unchecked")
    public <T> Map<String, T> getMap(String attrName) {
        return (Map<String, T>)attributes.get(attrName);
    }

    /**
     * Convenient method to return the specified attribute in the current item
     * as a (copy of) map of string-to-<code>T</code>'s where T must be a
     * subclass of <code>Number</code>; or null if the attribute doesn't
     * exist.
     *
     * @param attrName
     *            the attribute name
     * @param valueType
     *            the specific number type of the value to be returned.
     *            Currently, only<ul>
     *            <li><code>Short</code></li>
     *            <li><code>Integer</code></li>
     *            <li><code>Long</code></li>
     *            <li><code>Float</code></li>
     *            <li><code>Double</code></li>
     *            <li><code>Number</code></li>
     *            <li><code>BigDecimal</code></li>
     *            <li><code>BigInteger</code></li>
     *            </ul>are supported.
     *
     * @throws UnsupportedOperationException
     *             if the value type is not supported
     * @throws ClassCastException
     *             if the attribute is not a map of string to numbers
     */
    @SuppressWarnings("unchecked")
    public <T extends Number> Map<String, T> getMapOfNumbers(String attrName,
            Class<T> valueType) {
        if (valueType == Short.class
        ||  valueType == Integer.class
        ||  valueType == Long.class
        ||  valueType == Float.class
        ||  valueType == Double.class
        ||  valueType == Number.class
        ||  valueType == BigDecimal.class
        ||  valueType == BigInteger.class) {
            final Map<String, BigDecimal> src =
                (Map<String, BigDecimal>)attributes.get(attrName);
            if (src == null)
                return null;
            final Map<String, T> dst = new LinkedHashMap<String, T>(src.size());
            for (Map.Entry<String,BigDecimal> e: src.entrySet()) {
                final String key = e.getKey();
                final BigDecimal val = e.getValue();
                if (val == null) {
                    dst.put(key, null);
                } else if (valueType == Short.class) {
                    dst.put(key, (T)Short.valueOf(val.shortValue()));
                } else if (valueType == Integer.class) {
                    dst.put(key, (T)Integer.valueOf(val.intValue()));
                } else if (valueType == Long.class) {
                    dst.put(key, (T)Long.valueOf(val.longValue()));
                } else if (valueType == Float.class) {
                    dst.put(key, (T)Float.valueOf(val.floatValue()));
                } else if (valueType == Double.class) {
                    dst.put(key, (T)Double.valueOf(val.doubleValue()));
                } else if (valueType == BigDecimal.class || valueType == Number.class) {
                    dst.put(key, (T)val);
                } else if (valueType == BigInteger.class) {
                    dst.put(key, (T)val.toBigInteger());
                }
            }
            return dst;
        } else {
            throw new UnsupportedOperationException("Value type " + valueType
                    + " is not currently supported");
        }
    }

    /**
     * Convenient method to return the value of the specified attribute in the
     * current item as a map of string-to-<code>Object</code>'s; or null if the
     * attribute either doesn't exist or the attribute value is null. Note that
     * any numeric type of the map will be returned as <code>BigDecimal</code>.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     *
     * @throws ClassCastException if the attribute is not a map
     */
    @SuppressWarnings("unchecked")
    public Map<String, Object> getRawMap(String attrName) {
        return (Map<String, Object>)attributes.get(attrName);
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given value.
     */
    public Item withMap(String attrName, Map<String, ?> val) {
        checkInvalidAttribute(attrName, val);
        attributes.put(attrName, valueConformer.transform(val));
        return this;
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * given JSON document in the form of a string.
     */
    public Item withJSON(String attrName, String json) {
        checkInvalidAttribute(attrName, json);
        attributes.put(attrName,
            valueConformer.transform(Jackson.fromJsonString(json, Object.class)));
        return this;
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * JSON string; or null if the attribute either doesn't
     * exist or the attribute value is null.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public String getJSON(String attrName) {
        checkInvalidAttrName(attrName);
        Object val = attributes.get(attrName);
        return val == null ? null : Jackson.toJsonString(val);
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * JSON string with pretty indentation; or null if the attribute either
     * doesn't exist or the attribute value is null.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public String getJSONPretty(String attrName) {
        checkInvalidAttrName(attrName);
        Object val = attributes.get(attrName);
        return val == null ? null : Jackson.toJsonPrettyString(val);
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * non-null Boolean.
     *
     * @throws IncompatibleTypeException
     *             if either the attribute doesn't exist or if the attribute
     *             value cannot be converted into a non-null Boolean value
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public Boolean getBOOL(String attrName) {
        final Object val = attributes.get(attrName);
        if (val instanceof Boolean)
            return (Boolean)val;
        if (val instanceof String) {
            if ("1".equals(val))
                return true;
            if ("0".equals(val))
                return false;
            return Boolean.valueOf((String)val);
        }
        throw new IncompatibleTypeException("Value of attribute " + attrName
                + " of type " + getTypeOf(attrName)
                + " cannot be converted into a boolean value");
    }

    /**
     * Returns the value of the specified attribute in the current item as a
     * primitive boolean.
     *
     * @throws IncompatibleTypeException
     *             if either the attribute doesn't exist or if the attribute
     *             value cannot be converted into a boolean value
     */
    public boolean getBoolean(String attrName) {
        final Boolean b = getBOOL(attrName);
        return b.booleanValue();
    }

    /**
     * Sets the value of the specified attribute in the current item to the
     * boolean value.
     */
    public Item withBoolean(String attrName, boolean val) {
        checkInvalidAttrName(attrName);
        attributes.put(attrName, Boolean.valueOf(val));
        return this;
    }

    /**
     * Sets the value of the specified attribute to null.
     */
    public Item withNull(String attrName) {
        checkInvalidAttrName(attrName);
        attributes.put(attrName, null);
        return this;
    }
    /**
     * Sets the value of the specified attribute to the given value. An
     * attribute value can be a
     * <ul>
     * <li>Number</li>
     * <li>String</li>
     * <li>binary (ie byte array or byte buffer)</li>
     * <li>boolean</li>
     * <li>null</li>
     * <li>list (of any of the types on this list)</li>
     * <li>map (with string key to value of any of the types on this list)</li>
     * <li>set (of any of the types on this list)</li>
     * </ul>
     */
    public Item with(String attrName, Object val) {
        if (val == null)
            return withNull(attrName);
        if (val instanceof String)
            return withString(attrName, (String)val);
        if (val instanceof Number)
            return withNumber(attrName, (Number)val);
        if (val instanceof byte[])
            return withBinary(attrName, (byte[])val);
        if (val instanceof ByteBuffer)
            return withBinary(attrName, (ByteBuffer)val);
        if (val instanceof Boolean)
            return withBoolean(attrName, (Boolean)val);
        if (val instanceof List)
            return withList(attrName, (List<?>)val);
        if (val instanceof Map) {
            @SuppressWarnings("unchecked")
            Map<String,?> map = (Map<String,?>)val;
            return withMap(attrName, map);
        }
        if (val instanceof Set) {
            Set<?> set = (Set<?>)val;
            // Treat an empty set as a set of String
            if (set.size() == 0) {
                @SuppressWarnings("unchecked")
                Set<String> ss = (Set<String>)val;
                return withStringSet(attrName, ss);
            }
            // Try to locate the first non-null element and use that as the
            // representative type
            Object representative = null;
            for (Object o: set) {
                if (o != null)
                    representative = o;
            }
            // If all elements are null, treat the element type as String
            if (representative == null || representative instanceof String) {
                @SuppressWarnings("unchecked")
                Set<String> ss = (Set<String>)val;
                return withStringSet(attrName, ss);
            }
            if (representative instanceof Number) {
                @SuppressWarnings("unchecked")
                Set<Number> ns = (Set<Number>)val;
                return withNumberSet(attrName, ns);
            }
            if (representative instanceof byte[]) {
                @SuppressWarnings("unchecked")
                Set<byte[]> bs = (Set<byte[]>)val;
                return withBinarySet(attrName, bs);
            }
            if (representative instanceof ByteBuffer) {
                @SuppressWarnings("unchecked")
                Set<ByteBuffer> bs = (Set<ByteBuffer>)val;
                return withByteBufferSet(attrName, bs);
            }
            throw new UnsupportedOperationException("Set of "
                    + representative.getClass() + " is not currently supported");
        }
        throw new UnsupportedOperationException("Input type "
                + val.getClass() + " is not currently supported");
    }

    /**
     * Convenient methods - sets the attributes of this item from the given
     * key attributes.
     */
    public Item withPrimaryKey(PrimaryKey primaryKey) {
        rejectNullValue(primaryKey);
        if (primaryKey.getComponents().size() == 0)
            throw new IllegalArgumentException("primary key must not be empty");
        for (KeyAttribute ka: primaryKey.getComponents())
            this.with(ka.getName(), ka.getValue());
        return this;
    }

    /**
     * Convenient method to set the attributes of this item from the given
     * hash-only primary key name and value.
     */
    public Item withPrimaryKey(String hashKeyName, Object hashKeyValue) {
        return withKeyComponent(hashKeyName, hashKeyValue);
    }

    /**
     * Convenient method to set the attributes of this item from the given
     * hash and range primary key.
     */
    public Item withPrimaryKey(String hashKeyName, Object hashKeyValue,
            String rangeKeyName, Object rangeKeyValue) {
        return withKeyComponent(hashKeyName, hashKeyValue)
              .withKeyComponent(rangeKeyName, rangeKeyValue);
    }

    /**
     * Convenient methods - sets the attributes of this item from the specified
     * key components.
     */
    public Item withKeyComponents(KeyAttribute ...components) {
        rejectNullOrEmptyInput(components);
        for (KeyAttribute ka: components) {
            rejectNullValue(ka);
            this.with(ka.getName(), ka.getValue());
        }
        return this;
    }

    /**
     * Convenient methods - sets an attribute of this item for the specified
     * key attribute name and value.
     */
    public Item withKeyComponent(String keyAttrName, Object keyAttrValue) {
        return with(keyAttrName, keyAttrValue);
    }

    /**
     * Returns the value of the specified attribute in the current item as an
     * object; or null if the attribute either doesn't exist or the attribute
     * value is null.
     * <p>
     * An attribute value can be a
     * <ul>
     * <li>Number</li>
     * <li>String</li>
     * <li>binary (ie byte array or byte buffer)</li>
     * <li>boolean</li>
     * <li>null</li>
     * <li>list (of any of the types on this list)</li>
     * <li>map (with string key to value of any of the types on this list)</li>
     * <li>set (of any of the types on this list)</li>
     * </ul>
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public Object get(String attrName) {
        return attributes.get(attrName);
    }

    /**
     * Returns the type of the specified attribute in the current item; or null
     * if the attribute either doesn't exist or the attribute value is null.
     *
     * @see #isNull(String) #isNull(String) to check if the attribute value is
     *      null.
     * @see #isPresent(String) #isPresent(String) to check if the attribute
     *      value is present.
     */
    public Class<?> getTypeOf(String attrName) {
        Object val = attributes.get(attrName);
        return val == null ? null : val.getClass();
    }

    /**
     * Removes the specified attribute from the current item.
     */
    public Item removeAttribute(String attrName) {
        checkInvalidAttrName(attrName);
        attributes.remove(attrName);
        return this;
    }

    /**
     * Returns all attributes of the current item.
     */
    public Iterable<Entry<String, Object>> attributes() {
        return new LinkedHashMap<String, Object>(attributes).entrySet();
    }

    /**
     * Returns true if this item has the specified attribute; false otherwise.
     */
    public boolean hasAttribute(String attrName) {
        return attributes.containsKey(attrName);
    }

    /**
     * Returns all attributes of the current item as a map.
     */
    public Map<String, Object> asMap() {
        return new LinkedHashMap<String,Object>(attributes);
    }

    /**
     * Returns the number of attributes of this item.
     */
    public int numberOfAttributes() {
        return attributes.size();
    }

    /**
     * Convenient factory method - instantiates an <code>Item</code> from the
     * given map.
     *
     * @param attributes
     *            simple Java types; not the DyanmoDB types
     */
    public static Item fromMap(Map<String, Object> attributes) {
        if (attributes == null)
            return null;
        Item item = new Item();
        for (Map.Entry<String, Object> e : attributes.entrySet())
            item.with(e.getKey(), e.getValue());
        return item;
    }

    /**
     * Convenient factory method - instantiates an <code>Item</code> from the
     * given JSON string.
     *
     * @return an <code>Item</code> initialized from the given JSON document;
     * or null if the input is null.
     */
    public static Item fromJSON(String json) {
        if (json == null)
            return null;
        @SuppressWarnings("unchecked")
        Map<String, Object> map = (Map<String, Object>)
            valueConformer.transform(Jackson.fromJsonString(json, Map.class));
        return fromMap(map);
    }

    /**
     * Returns this item as a JSON string.  Note all binary data will become
     * base-64 encoded in the resultant string.
     */
    public String toJSON() {
        return Jackson.toJsonString(this.attributes);
    }

    /**
     * Utility method to decode the designated binary attributes from base-64
     * encoding; converting binary lists into binary sets.
     *
     * @param binaryAttrNames
     *            names of binary attributes or binary set attributes currently
     *            base-64 encoded (typically when converted from a JSON string.)
     *
     * @see #fromJSON(String)
     */
    public Item base64Decode(String ... binaryAttrNames) {
        rejectNullInput(binaryAttrNames);
        // Verify all attributes are good
        for (String attrName: binaryAttrNames) {
            checkInvalidAttrName(attrName);
            if (String.class == getTypeOf(attrName)) {
                String b64 = getString(attrName);
                Base64.decode(b64);
            } else {
                Set<String> b64s = getStringSet(attrName);
                for (String b64: b64s)
                    Base64.decode(b64);
            }
        }
        // Decodes b64 into binary
        for (String attrName: binaryAttrNames) {
            if (String.class == getTypeOf(attrName)) {
                String b64 = getString(attrName);
                byte[] bytes = Base64.decode(b64);
                withBinary(attrName, bytes);
            } else {
                Set<String> b64s = getStringSet(attrName);
                Set<byte[]> binarySet = new LinkedHashSet<byte[]>(b64s.size());
                for (String b64: b64s)
                    binarySet.add(Base64.decode(b64));
                withBinarySet(attrName, binarySet);
            }
        }
        return this;
    }

    /**
     * Utility method to converts the designated attributes from
     * <code>List</code> into <code>Set</code>, throwing
     * <code>IllegalArgumentException</code> should there be duplicate elements.
     *
     * @param listAttrNames
     *            names of attributes to be converted.
     *
     * @see #fromJSON(String)
     */
    public Item convertListsToSets(String ... listAttrNames) {
        rejectNullInput(listAttrNames);
        // Verify all attributes are good
        for (String attrName: listAttrNames) {
            checkInvalidAttrName(attrName);
            if (List.class.isAssignableFrom(getTypeOf(attrName))) {
                List<?> list = getList(attrName);
                if (list != null) {
                    for (Object e: list) {
                        if (e instanceof String) {
                            Set<String> ss = getStringSet(attrName);
                            if (list.size() != ss.size())
                                throw new IllegalArgumentException("List cannot be converted to Set due to duplicate elements");
                        } else if (e instanceof Number) {
                            Set<BigDecimal> ss = getNumberSet(attrName);
                            if (list.size() != ss.size())
                                throw new IllegalArgumentException("List cannot be converted to Set due to duplicate elements");
                        } else if (e instanceof byte[]) {
                            Set<byte[]> ss = getBinarySet(attrName);
                            if (list.size() != ss.size())
                                throw new IllegalArgumentException("List cannot be converted to Set due to duplicate elements");
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Attribute " + attrName + " is not a list");
            }
        }
        // Do the conversion
        for (String attrName: listAttrNames) {
            checkInvalidAttrName(attrName);
            List<?> list = getList(attrName);
            if (list != null) {
                boolean converted = false;
                for (Object e: list) {
                    if (e instanceof String) {
                        Set<String> set = getStringSet(attrName);
                        withStringSet(attrName, set);
                        converted = true;
                        break;
                    } else if (e instanceof Number) {
                        Set<BigDecimal> set = getNumberSet(attrName);
                        withBigDecimalSet(attrName, set);
                        converted = true;
                        break;
                    } else if (e instanceof byte[]) {
                        Set<byte[]> set = getBinarySet(attrName);
                        withBinarySet(attrName, set);
                        converted = true;
                        break;
                    }
                }
                if (!converted) {
                    // All elements are null.  So treat it as a String set.
                    Set<String> set = getStringSet(attrName);
                    withStringSet(attrName, set);
                }
            }
        }
        return this;
    }

    /**
     * Returns this item as a pretty JSON string. Note all binary data will
     * become base-64 encoded in the resultant string.
     */
    public String toJSONPretty() {
        return Jackson.toJsonPrettyString(this.attributes);
    }

    @Override
    public String toString() {
        return "{ Item: " + attributes.toString() + " }";
    }

    @Override
    public int hashCode() {
        return attributes.hashCode();
    }

    @Override
    public boolean equals(Object in) {
        if (in instanceof Item) {
            Item that = (Item)in;
            return this.attributes.equals(that.attributes);
        } else {
            return false;
        }
    }
}
