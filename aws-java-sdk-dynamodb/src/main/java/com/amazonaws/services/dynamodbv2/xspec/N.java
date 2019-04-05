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

import java.util.LinkedList;
import java.util.List;

import com.amazonaws.annotation.Immutable;

import com.amazonaws.annotation.Beta;

/**
 * A path operand that refers to a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html"
 * >number</a> attribute in DynamoDB; used for building expressions.
 * <p>
 * Use {@link ExpressionSpecBuilder#N(String)} to instantiate this class.
 */
@Beta
@Immutable
public final class N extends PathOperand {
    N(String path) { super(path); }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is equal to that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition eq(N that) {
        return new ComparatorCondition("=", this, that);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is not equal to that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition ne(N that) {
        return new ComparatorCondition("<>", this, that);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is less than or equal to the specified value) for building
     * condition expression.
     */
    public ComparatorCondition le(Number value) {
        return new ComparatorCondition("<=", this, new LiteralOperand(value));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is less than or equal to that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition le(N that) {
        return new ComparatorCondition("<=", this, that);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is less than the specified value) for building
     * condition expression.
     */
    public ComparatorCondition lt(Number value) {
        return new ComparatorCondition("<", this, new LiteralOperand(value));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is less than that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition lt(N that) {
        return new ComparatorCondition("<", this, that);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is greater than or equal to the specified value) for building
     * condition expression.
     */
    public ComparatorCondition ge(Number value) {
        return new ComparatorCondition(">=", this, new LiteralOperand(value));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is greater than or equal to that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition ge(N that) {
        return new ComparatorCondition(">=", this, that);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is greater than the specified value) for building
     * condition expression.
     */
    public ComparatorCondition gt(Number value) {
        return new ComparatorCondition(">", this, new LiteralOperand(value));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is greater than that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition gt(N that) {
        return new ComparatorCondition(">", this, that);
    }

    /**
     * Returns a <code>BetweenCondition</code> that represents a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >BETWEEN comparison</a> (that evaluates to true if the value of the
     * current attribute is greater than or equal to the given low value, and
     * less than or equal to the given high value) for building condition
     * expression.
     */
    public BetweenCondition between(Number low, Number high) {
        return new BetweenCondition(this, 
                new LiteralOperand(low),
                new LiteralOperand(high));
    }

    /**
     * Returns an <code>AddAction</code> for build expression that would add the
     * given value mathematically to the existing attribute; or if the attribute
     * does not already exist, add the new attribute and the value to the item.
     * <p>
     * In general, DynamoDB recommends using SET rather than ADD.
     */
    public AddAction add(Number value) {
        return new AddAction(this, new LiteralOperand(value));
    }

    // Binary operation on a number
    /**
     * Returns a <code>PlusOperation</code> that represents the addition of the
     * given value to that of the current attribute; used for building update
     * expression.
     * 
     * @param value
     *            given value to be added to the value of the current attribute.
     */
    public PlusOperation plus(Number value) {
        return new PlusOperation(this, new LiteralOperand(value));
    }

    /**
     * Returns a <code>PlusOperation</code> object that represents the addition of the
     * value of the given attribute to that of the current attribute; used for
     * building update expression.
     * 
     * @param attr
     *            given attribute whose value is to be added to that of the
     *            current attribute
     */
    public PlusOperation plus(N attr) {
        return new PlusOperation(this, attr);
    }

    /**
     * Returns a <code>MinusOperation</code> object that represents the subtraction of
     * the given value from that of the current attribute; used for building
     * update expression.
     * 
     * @param value
     *            given value to be subtracted from the value of the current
     *            attribute.
     */
    public MinusOperation minus(Number value) {
        return new MinusOperation(this, new LiteralOperand(value));
    }

    /**
     * Returns a <code>MinusOperation</code> object that represents the subtraction of
     * the value of the given attribute from that of the current attribute; used
     * for building update expression.
     * 
     * @param attr
     *            given attribute whose value is to be subtracted from that of
     *            the current attribute
     */
    public MinusOperation minus(N attr) {
        return new MinusOperation(this, attr);
    }

    // SET binary operation

    /**
     * Returns a <code>SetAction</code> object used for building update
     * expression with the specified <code>PlusOperation</code>. If the current
     * attribute doesn't exist, the returned object represents adding the result
     * of the specified plus ('+') binary operation as an attribute to an item.
     * If this attribute already exists, the returned object represents the
     * value replacement of the current attribute by the result of the specified
     * plus ('+') binary operation.
     */
    public final SetAction set(PlusOperation plusOperation) {
        return new SetAction(this, plusOperation);
    }

    /**
     * Returns a <code>SetAction</code> object used for building update
     * expression with the specified <code>MinusOperation</code>. If the current
     * attribute doesn't exist, the returned object represents adding the result
     * of the specified minus ('-') binary operation as an attribute to an item.
     * If this attribute already exists, the returned object represents the
     * value replacement of the current attribute by the result of the specified
     * minus ('-') binary operation.
     */
    public final SetAction set(MinusOperation minusOperation) {
        return new SetAction(this, minusOperation);
    }

    /**
     * Returns an <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >InCondition</a> (that evaluates to true if the value of the current
     * attribute is equal to any of the specified values) for building condition
     * expression.
     * 
     * @param values
     *            specified values. The number of values must be at least one
     *            and at most 100.
     */
    public final InCondition in(Number... values) {
        List<LiteralOperand> list = new LinkedList<LiteralOperand>();
        for (Number v: values)
            list.add(new LiteralOperand(v));
        return new InCondition(this, list);
    }

    /**
     * Returns an <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >InCondition</a> (that evaluates to true if the value of the current
     * attribute is equal to any of the values in the specified list) for
     * building condition expression.
     * 
     * @param values
     *            specified list of values. The number of values must be at
     *            least one and at most 100.
     */
    public final <T extends Number> InCondition in(List<T> values) {
        List<LiteralOperand> list = new LinkedList<LiteralOperand>();
        for (Number v: values)
            list.add(new LiteralOperand(v));
        return new InCondition(this, list);
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
    public SetAction set(N source) {
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
    public SetAction set(Number value) {
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
    public SetAction set(IfNotExistsFunction<N> ifNotExistsFunction) {
        return new SetAction(this, ifNotExistsFunction);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >comparator condition</a> (that evaluates to true if the attribute value
     * referred to by this path operand is equal to the specified value) for
     * building condition expression.
     */
    public ComparatorCondition eq(Number value) {
        return new ComparatorCondition("=", this, new LiteralOperand(value));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >comparator condition</a> (that evaluates to true if the attribute value
     * referred to by this path operand is not equal to that of the specified
     * path operand) for building condition expression.
     */
    public ComparatorCondition ne(Number value) {
        return new ComparatorCondition("<>", this, new LiteralOperand(value));
    }

    /**
     * Returns an <code>IfNotExists</code> object which represents an <a href=
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
    public IfNotExistsFunction<N> ifNotExists(Number defaultValue) {
        return new IfNotExistsFunction<N>(this, new LiteralOperand(defaultValue));
    }

    /**
     * Returns an <code>IfNotExists</code> object which represents an <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >if_not_exists(path, operand)</a> function call where path refers to that
     * of the current attribute; used for building expressions.
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
    public IfNotExistsFunction<N> ifNotExists(N defaultValue) {
        return ExpressionSpecBuilder.if_not_exists(this, defaultValue);
    }
}
