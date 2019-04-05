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
 * Represents a minus binary operation in building expressions that involve
 * number attributes.
 * 
 * <pre>
 * operand '-' operand
 * </pre>
 */
@Beta
public final class MinusOperation extends BinaryOperation {
    MinusOperation(Operand lhs, Operand rhs) {
        super(lhs, "-", rhs);
    }
}
