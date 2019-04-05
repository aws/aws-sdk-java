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

import com.amazonaws.annotation.Immutable;

import com.amazonaws.annotation.Beta;

/**
 * A path operand that refers to a <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_AttributeValue.html"
 * >NULL</a> attribute in DynamoDB; used for building expressions.
 * <p>
 * Use {@link ExpressionSpecBuilder#NULL(String)} to instantiate this class.
 */
@Beta
@Immutable
public class NULL extends PathOperand {

    NULL(String path) {
        super(path);
    }

    /**
     * Returns a <code>SetAction</code> object (used for building update
     * expression) of setting an attribute to null.
     */
    public final SetAction set() {
        return new SetAction(this, new LiteralOperand((Object)null));
    }
}
