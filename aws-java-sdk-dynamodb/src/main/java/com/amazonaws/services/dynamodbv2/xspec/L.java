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

import java.util.Arrays;
import java.util.List;

import com.amazonaws.annotation.Immutable;

import com.amazonaws.annotation.Beta;

/**
 * A path operand that refers to a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html"
 * >list</a> attribute in DynamoDB; used for building expressions.
 * <p>
 * Use {@link ExpressionSpecBuilder#L(String)} to instantiate this class.
 */
@Beta
@Immutable
public final class L extends PathOperand {

    L(String path) {
        super(path);
    }

    /**
     * Returns a <code>SetAction</code> for adding the value of evaluating the
     * specified <code>ListAppend</code> function as an attribute to an item. If
     * this attribute already exists, it will be replaced by the new value.
     */
    public SetAction set(ListAppendFunction listAppendFunction) {
        return new SetAction(this, listAppendFunction);
    }

    public FunctionCondition contains(Object value) {
        return new FunctionCondition("contains", this,
                new LiteralOperand(value));
    }

    public ComparatorCondition eq(FunctionOperand value) {
        return new ComparatorCondition("=", this, value);
    }

    public ComparatorCondition eq(L that) {
        return new ComparatorCondition("=", this, that);
    }

    public ComparatorCondition ne(FunctionOperand value) {
        return new ComparatorCondition("<>", this, value);
    }

    public ComparatorCondition ne(L that) {
        return new ComparatorCondition("<>", this, that);
    }

    public IfNotExistsFunction<L> ifNotExists(L that) {
        return new IfNotExistsFunction<L>(this, that);
    }

    public IfNotExistsFunction<L> ifNotExists(Object... defaultValues) {
        return new IfNotExistsFunction<L>(this, new LiteralOperand(
                Arrays.asList(defaultValues)));
    }

    /**
     * Returns an <code>ListAppend</code> for building expression that involves
     * a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >list_append(operand, operand)</a> function for the purpose of adding the
     * specified values to the current list attribute.
     * 
     * @param values
     *            the specified values to be added to the current list
     *            attribute.
     */
    public ListAppendFunction listAppend(Object... values) {
        return new ListAppendFunction(this, new LiteralOperand(
                Arrays.asList(values)));
    }

    /**
     * Returns an <code>ListAppend</code> for building expression that involves
     * a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >list_append(operand, operand)</a> function for the purpose of adding the
     * specified list of values to that of the current list attribute.
     * 
     * @param values
     *            the specified list of values to be added to the current list
     *            attribute.
     */
    public ListAppendFunction listAppend(List<?> values) {
        return new ListAppendFunction(this, new LiteralOperand(values));
    }

    /**
     * Returns an <code>ListAppend</code> for building expression that involves
     * a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
     * >list_append(operand, operand)</a> function for the purpose of adding the
     * values of the specified list attribute to the current list attribute.
     * 
     * @param that
     *            the specified list attribute whose values will be added to the
     *            current list attribute.
     */
    public ListAppendFunction listAppend(L that) {
        return new ListAppendFunction(this, that);
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
    public SetAction set(L source) {
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
    public SetAction set(List<?> value) {
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
    public SetAction set(IfNotExistsFunction<L> ifNotExistsFunction) {
        return new SetAction(this, ifNotExistsFunction);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >comparator condition</a> (that evaluates to true if the attribute value
     * referred to by this path operand is equal to the specified value) for
     * building condition expression.
     */
    public ComparatorCondition eq(List<?> value) {
        return new ComparatorCondition("=", this, new LiteralOperand(value));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >comparator condition</a> (that evaluates to true if the attribute value
     * referred to by this path operand is not equal to that of the specified
     * path operand) for building condition expression.
     */
    public ComparatorCondition ne(List<?> value) {
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
    public IfNotExistsFunction<L> ifNotExists(List<?> defaultValue) {
        return new IfNotExistsFunction<L>(this, new LiteralOperand(defaultValue));
    }
}
