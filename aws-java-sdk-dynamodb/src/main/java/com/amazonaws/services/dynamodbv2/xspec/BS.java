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

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import com.amazonaws.annotation.Immutable;

import com.amazonaws.annotation.Beta;

/**
 * A path operand that refers to a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html"
 * >binary set</a> attribute in DynamoDB; used for building expressions.
 * <p>
 * Use {@link ExpressionSpecBuilder#BS(String)} to instantiate this class.
 */
@Beta
@Immutable
public final class BS extends PathOperand {
    BS(String path) {
        super(path);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the
     * current attribute is equal to the set of specified values) for building condition
     * expression.
     */
    public ComparatorCondition eq(byte[]... values) {
        return new ComparatorCondition("=", this, new LiteralOperand(
                new LinkedHashSet<byte[]>(Arrays.asList(values))));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the
     * current attribute is equal to the set of specified values) for building condition
     * expression.
     */
    public ComparatorCondition eq(ByteBuffer... values) {
        return new ComparatorCondition("=", this, new LiteralOperand(
                new LinkedHashSet<ByteBuffer>(Arrays.asList(values))));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is equal to that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition eq(BS that) {
        return new ComparatorCondition("=", this, that);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the
     * current attribute is not equal to the set of specified values) for building condition
     * expression.
     */
    public ComparatorCondition ne(byte[]... values) {
        return new ComparatorCondition("<>", this, new LiteralOperand(
                new LinkedHashSet<byte[]>(Arrays.asList(values))));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the
     * current attribute is not equal to the set of specified values) for
     * building condition expression.
     */
    public ComparatorCondition ne(ByteBuffer... values) {
        return new ComparatorCondition("<>", this, new LiteralOperand(
                new LinkedHashSet<ByteBuffer>(Arrays.asList(values))));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is not equal to that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition ne(BS that) {
        return new ComparatorCondition("<>", this, that);
    }

    /**
     * Returns an <code>FunctionCondition</code> object which represents an <a
     * href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >contains(path, operand)</a> function condition where path refers to that
     * of the current path operand; used for building expressions.
     * 
     * <pre>
     * &quot;contains (path, operand) — true if the attribute at the specified 
     * path contains a particular operand. Note that the path and the operand 
     * must be distinct; that is, contains (a, a) will return an error&quot;
     * </pre>
     * 
     * @param value
     *            the value that will be used as the operand to the
     *            "contains" function condition.
     */
    public FunctionCondition contains(byte[] value) {
        return new FunctionCondition("contains", this,
                new LiteralOperand(value));
    }

    /**
     * Returns an <code>FunctionCondition</code> object which represents an <a
     * href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >contains(path, operand)</a> function condition where path refers to that
     * of the current path operand; used for building expressions.
     * 
     * <pre>
     * &quot;contains (path, operand) — true if the attribute at the specified 
     * path contains a particular operand. Note that the path and the operand 
     * must be distinct; that is, contains (a, a) will return an error&quot;
     * </pre>
     * 
     * @param value
     *            the value that will be used as the operand to the
     *            "contains" function condition.
     */
    public FunctionCondition contains(ByteBuffer value) {
        return new FunctionCondition("contains", this,
                new LiteralOperand(value));
    }

    /**
     * Returns a <code>SetAction</code> object used for building update
     * expression. If the attribute referred to by this path operand doesn't
     * exist, the returned object represents adding the specified value as an
     * attribute to an item. If the attribute referred to by this path operand
     * already exists, the returned object represents the value replacement of
     * the current attribute by the specified value.
     */
    public final SetAction set(byte[] ... value) {
        return new SetAction(this, new LiteralOperand(value));
    }

    /**
     * Returns a <code>SetAction</code> object used for building update
     * expression. If the attribute referred to by this path operand doesn't
     * exist, the returned object represents adding the specified value as an
     * attribute to an item. If the attribute referred to by this path operand
     * already exists, the returned object represents the value replacement of
     * the current attribute by the specified value.
     */
    public final SetAction set(ByteBuffer ... value) {
        return new SetAction(this, new LiteralOperand(value));
    }

    /**
     * Returns an <code>AddAction</code> for build expression that would append
     * the specified values to this binary set; or if the attribute does not
     * already exist, add the new attribute and the value(s) to the item.
     * <p>
     * In general, DynamoDB recommends using SET rather than ADD.
     */
    public AddAction append(byte[]... values) {
        return new AddAction(this, new LiteralOperand(
                new LinkedHashSet<byte[]>(Arrays.asList(values))));
    }

    /**
     * Returns an <code>AddAction</code> for build expression that would append
     * the specified values to this binary set; or if the attribute does not
     * already exist, add the new attribute and the value(s) to the item.
     * <p>
     * In general, DynamoDB recommends using SET rather than ADD.
     */
    public AddAction append(ByteBuffer... values) {
        return new AddAction(this, new LiteralOperand(
                new LinkedHashSet<ByteBuffer>(Arrays.asList(values))));
    }

    /**
     * Returns a <code>DeleteAction</code> for deleting the specified values
     * from this binary set.
     */
    public DeleteAction delete(byte[]... values) {
        return new DeleteAction(this, new LiteralOperand(
                new LinkedHashSet<byte[]>(Arrays.asList(values))));
    }

    /**
     * Returns a <code>DeleteAction</code> for deleting the specified values
     * from this binary set.
     */
    public DeleteAction delete(ByteBuffer... values) {
        return new DeleteAction(this, new LiteralOperand(
                new LinkedHashSet<ByteBuffer>(Arrays.asList(values))));
    }

    /**
     * Returns an <code>IfNotExistsFunction</code> object which represents an <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >if_not_exists(path, operand)</a> function call where path refers to that
     * of the current path operand; used for building expressions.
     * 
     * <pre>
     * "if_not_exists (path, operand) – If the item does not contain an attribute 
     * at the specified path, then if_not_exists evaluates to operand; otherwise, 
     * it evaluates to path. You can use this function to avoid overwriting an 
     * attribute already present in the item."
     * </pre>
     * 
     * @param defaultValue
     *            the default value that will be used as the operand to the
     *            if_not_exists function call.
     */
    public IfNotExistsFunction<BS> ifNotExists(byte[]... defaultValue) {
        return new IfNotExistsFunction<BS>(this, new LiteralOperand(
                new LinkedHashSet<byte[]>(Arrays.asList(defaultValue))));
    }

    /**
     * Returns an <code>IfNotExistsFunction</code> object which represents an <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >if_not_exists(path, operand)</a> function call where path refers to that
     * of the current path operand; used for building expressions.
     * 
     * <pre>
     * "if_not_exists (path, operand) – If the item does not contain an attribute 
     * at the specified path, then if_not_exists evaluates to operand; otherwise, 
     * it evaluates to path. You can use this function to avoid overwriting an 
     * attribute already present in the item."
     * </pre>
     * 
     * @param defaultValue
     *            the default value that will be used as the operand to the
     *            if_not_exists function call.
     */
    public IfNotExistsFunction<BS> ifNotExists(ByteBuffer... defaultValue) {
        return new IfNotExistsFunction<BS>(this, new LiteralOperand(
                new LinkedHashSet<ByteBuffer>(Arrays.asList(defaultValue))));
    }

    /**
     * Returns an <code>IfNotExistsFunction</code> object which represents an <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >if_not_exists(path, operand)</a> function call where path refers to that
     * of the current path operand; used for building expressions.
     * 
     * <pre>
     * "if_not_exists (path, operand) – If the item does not contain an attribute 
     * at the specified path, then if_not_exists evaluates to operand; otherwise, 
     * it evaluates to path. You can use this function to avoid overwriting an 
     * attribute already present in the item."
     * </pre>
     * 
     * @param defaultValue
     *            the default value (of another binary set attribute) that will be
     *            used as the operand to the if_not_exists function call.
     */
    public IfNotExistsFunction<BS> ifNotExists(BS defaultValue) {
        return new IfNotExistsFunction<BS>(this, defaultValue);
    }

    /**
     * Returns a <code>SetAction</code> object used for building update
     * expression. If the attribute referred to by this path operand doesn't
     * exist, the returned object represents adding the attribute value of the
     * specified source path operand to an item. If the current attribute
     * already exists, the returned object represents the value replacement of
     * the current attribute by the attribute value of the specified source path
     * operand.
     */
    public SetAction set(BS source) {
        return new SetAction(this, source);
    }

    /**
     * Returns a <code>SetAction</code> object used for building update
     * expression. If the attribute referred to by this path operand doesn't
     * exist, the returned object represents adding the specified value as an
     * attribute to an item. If the attribute referred to by this path operand
     * already exists, the returned object represents the value replacement of
     * the current attribute by the specified value.
     */
    public SetAction set(Set<byte[]> value) {
        return new SetAction(this, new LiteralOperand(value));
    }

    /**
     * Returns a <code>SetAction</code> object used for building update
     * expression. If the attribute referred to by this path operand doesn't
     * exist, the returned object represents adding the value of evaluating the
     * specified <code>IfNotExists</code> function as an attribute to an item.
     * If the attribute referred to by this path operand already exists, the
     * returned object represents the value replacement of the current attribute
     * by the value of evaluating the specified <code>IfNotExists</code>
     * function.
     */
    public SetAction set(IfNotExistsFunction<BS> ifNotExistsFunction) {
        return new SetAction(this, ifNotExistsFunction);
    }
}
