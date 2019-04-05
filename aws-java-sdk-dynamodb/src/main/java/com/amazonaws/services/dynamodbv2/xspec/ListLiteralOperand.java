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

import java.util.List;

/**
 * Represents a list of literal values in building expressions.
 * <p>
 * This object is as immutable (or unmodifiable) as the underlying list given
 * during construction.
 */
class ListLiteralOperand extends LiteralOperand {
    ListLiteralOperand(List<?> value) {
        super(value);
    }
}
