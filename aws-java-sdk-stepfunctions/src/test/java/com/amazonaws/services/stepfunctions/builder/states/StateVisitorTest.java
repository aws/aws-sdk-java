/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.stepfunctions.builder.states;

import static org.junit.Assert.*;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.*;

import org.junit.Test;

public class StateVisitorTest {

    // This serves as a reminder to add a default implementation for any new states in
    // StateVistior. Otherwise this will fail to compile.
    public static class MyVisitor extends StateVisitor<Void> {

    }

    @Test
    public void defaultVisitMethods_ReturnNull() {
        MyVisitor visitor = new MyVisitor();

        assertNull(visitor.visit(failState().build()));
        assertNull(visitor.visit(choiceState().build()));
        assertNull(visitor.visit(parallelState().build()));
        assertNull(visitor.visit(succeedState().build()));
        assertNull(visitor.visit(taskState().build()));
        assertNull(visitor.visit(waitState().build()));
        assertNull(visitor.visit(passState().build()));
    }

}