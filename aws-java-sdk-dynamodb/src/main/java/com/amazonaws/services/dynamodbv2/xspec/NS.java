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
import java.util.LinkedHashSet;
import java.util.Set;

import com.amazonaws.annotation.Immutable;

import com.amazonaws.annotation.Beta;

/**
 * A path operand that refers to a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html"
 * >number set</a> attribute in DynamoDB; used for building expressions.
 * <p>
 * Use {@link ExpressionSpecBuilder#NS(String)} to instantiate this class.
 */
@Beta
@Immutable
public final class NS extends PathOperand {
    NS(String path) {
        super(path);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the
     * current attribute is equal to the set of specified values) for building condition
     * expression.
     */
    public ComparatorCondition eq(Number... values) {
        return new ComparatorCondition("=", this, new LiteralOperand(
                new LinkedHashSet<Number>(Arrays.asList(values))));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the current
     * attribute is equal to that of the specified attribute) for building
     * condition expression.
     */
    public ComparatorCondition eq(NS that) {
        return new ComparatorCondition("=", this, that);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the
     * current attribute is not equal to the set of specified values) for
     * building condition expression.
     */
    public ComparatorCondition ne(Number... values) {
        return new ComparatorCondition("<>", this, new LiteralOperand(
                new LinkedHashSet<Number>(Arrays.asList(values))));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Comparators"
     * >comparator condition</a> (that evaluates to true if the value of the
     * current attribute is not equal to the set of specified values) for
     * building condition expression.
     */
    public ComparatorCondition ne(NS that) {
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
    public FunctionCondition contains(Number value) {
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
    public SetAction set(Number... values) {
        return set(new LinkedHashSet<Number>(Arrays.asList(values)));
    }

    /**
     * Returns an <code>AddAction</code> for building expression that would
     * append the specified values to this number set; or if the attribute does
     * not already exist, adding the new attribute and the value(s) to the item.
     * <p>
     * In general, DynamoDB recommends using SET rather than ADD.
     */
    public AddAction append(Number... values) {
        return append(new LinkedHashSet<Number>(Arrays.asList(values)));
    }

    /**
     * Returns an <code>AddAction</code> for building expression that would
     * append the specified values to this number set; or if the attribute does
     * not already exist, adding the new attribute and the value(s) to the item.
     * <p>
     * In general, DynamoDB recommends using SET rather than ADD.
     */
    public <T extends Number> AddAction append(Set<T> values) {
        return new AddAction(this, new LiteralOperand(values));
    }

    /**
     * Returns a <code>DeleteAction</code> for deleting the specified values
     * from this number set.
     */
    public DeleteAction delete(Number... values) {
        return delete(new LinkedHashSet<Number>(Arrays.asList(values)));
    }

    /**
     * Returns a <code>DeleteAction</code> for deleting the specified values
     * from this number set.
     */
    public <T extends Number> DeleteAction delete(Set<T> values) {
        return new DeleteAction(this, new LiteralOperand(values));
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
    public IfNotExistsFunction<NS> ifNotExists(Number... defaultValue) {
        return new IfNotExistsFunction<NS>(this, new LiteralOperand(
                new LinkedHashSet<Number>(Arrays.asList(defaultValue))));
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
     *            the default value (of another string set attribute) that will be
     *            used as the operand to the if_not_exists function call.
     */
    public IfNotExistsFunction<NS> ifNotExists(NS defaultValue) {
        return new IfNotExistsFunction<NS>(this, defaultValue);
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
    public SetAction set(NS source) {
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
    public <T extends Number> SetAction set(Set<T> value) {
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
    public SetAction set(IfNotExistsFunction<NS> ifNotExistsFunction) {
        return new SetAction(this, ifNotExistsFunction);
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >comparator condition</a> (that evaluates to true if the attribute value
     * referred to by this path operand is equal to the specified value) for
     * building condition expression.
     */
    public <T extends Number> ComparatorCondition eq(Set<T> value) {
        return new ComparatorCondition("=", this, new LiteralOperand(value));
    }

    /**
     * Returns a <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.SpecifyingConditions.html#ConditionExpressionReference.Functions"
     * >comparator condition</a> (that evaluates to true if the attribute value
     * referred to by this path operand is not equal to that of the specified
     * path operand) for building condition expression.
     */
    public <T extends Number> ComparatorCondition ne(Set<T> value) {
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
    public <T extends Number> IfNotExistsFunction<NS> ifNotExists(Set<T> defaultValue) {
        return new IfNotExistsFunction<NS>(this, new LiteralOperand(defaultValue));
    }
}
