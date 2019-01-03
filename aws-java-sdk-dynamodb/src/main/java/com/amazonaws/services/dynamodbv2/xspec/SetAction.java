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

import com.amazonaws.annotation.Beta;

/**
 * Represents a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
 * >SET</a> action in the SET section of an update expression.
 * <p>
 * A SET action is used to add one or more attributes and values to an item. If
 * any of these attribute already exist, they are replaced by the new values.
 * <p>
 * This object is as immutable (or unmodifiable) as the underlying value (of
 * type <code>UnitOfExpression</code>) given during construction.
 */
@Beta
public final class SetAction extends UpdateAction {
    SetAction(PathOperand attr, UnitOfExpression value) {
        super("SET", attr, value);
    }

    /**
     * Returns the operand for this update expression as a string, substituted
     * if necessary with tokens using the given substitution context.
     */
    @Override
    String asSubstituted(SubstitutionContext context) {
        return new StringBuilder(getPathOperand().asSubstituted(context))
                .append(" = ").append(getValue().asSubstituted(context))
                .toString();
    }
}
