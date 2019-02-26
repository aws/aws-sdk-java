/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.xspec;

import com.amazonaws.annotation.Beta;


/**
 * Represents an <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
 * >ADD</a> action in the ADD section of an update expression.
 * <p>
 * <h3>Important</h3>
 * The ADD action only supports Number and set data types. In general, DynamoDB
 * recommends using SET rather than ADD.
 * <p>
 * Use the ADD action in an update expression to do either of the following:
 * <ul>
 * <li>If the attribute does not already exist, add the new attribute and its
 * value(s) to the item.</li>
 * 
 * <li>If the attribute already exists, then the behavior of ADD depends on the
 * attribute's data type:
 * <ul>
 * <li>If the attribute is a number, and the value you are adding is also a number,
 * then the value is mathematically added to the existing attribute. (If the
 * value is a negative number, then it is subtracted from the existing
 * attribute.)</li>
 * 
 * <li>If the attribute is a set, and the value you are adding is also a set, then
 * the value is appended to the existing set.</li>
 * <ul>
 * </ul>
 * <p>
 * This object is as immutable (or unmodifiable) as the underlying value (of
 * type <code>UnitOfExpression</code>) given during construction.
 */
@Beta
public final class AddAction extends UpdateAction {
    AddAction(PathOperand attr, UnitOfExpression value) {
        super("ADD", attr, value);
    }
}
