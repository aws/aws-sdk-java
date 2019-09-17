/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.builder;

import org.junit.Test;

import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.eq;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.gt;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.gte;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.lt;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.lte;
import static org.junit.Assert.assertEquals;

public class NumericConditionsTest {

    @Test
    public void getExpectedValue_numericEquals_ReturnsIntegralString() {
        assertEquals("42", eq("$.var", 42).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericGreaterThan_ReturnsIntegralString() {
        assertEquals("42", gt("$.var", 42).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericGreaterThanEquals_ReturnsIntegralString() {
        assertEquals("42", gte("$.var", 42).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericLessThan_ReturnsIntegralString() {
        assertEquals("42", lt("$.var", 42).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericLessThanEquals_ReturnsIntegralString() {
        assertEquals("42", lte("$.var", 42).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericEquals_ReturnsDoubleString() {
        assertEquals("9000.1", eq("$.var", 9000.1).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericGreaterThan_ReturnsDoubleString() {
        assertEquals("9000.1", gt("$.var", 9000.1).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericGreaterThanEquals_ReturnsDoubleString() {
        assertEquals("9000.1", gte("$.var", 9000.1).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericLessThan_ReturnsDoubleString() {
        assertEquals("9000.1", lt("$.var", 9000.1).build().getExpectedValue());
    }

    @Test
    public void getExpectedValue_numericLessThanEquals_ReturnsDoubleString() {
        assertEquals("9000.1", lte("$.var", 9000.1).build().getExpectedValue());
    }
}
