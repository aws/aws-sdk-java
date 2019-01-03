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
 * Represents the <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Expressions.Modifying.html"
 * >list_append(operand, operand)</a> function in building expression.
 * <p>
 * "list_append (operand, operand) – This function evaluates to a list with a 
 * new element added to it. You can append the new element to the start or the 
 * end of the list by reversing the order of the operands."
 * <p>
 * This object is as immutable (or unmodifiable) as the values in it's operands.
 */
@Beta
public final class ListAppendFunction extends FunctionOperand {
    private final Operand first;
    private final Operand second;

    ListAppendFunction(Operand first, Operand second) {
        this.first = first;
        this.second = second;
    }

    @Override
    String asSubstituted(SubstitutionContext context) {
        return "list_append(" + first.asSubstituted(context) + ", "
                + second.asSubstituted(context) + ")";
    }
}
