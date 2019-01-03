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

package com.amazonaws.services.stepfunctions.builder;

import static com.amazonaws.services.stepfunctions.builder.StatesAsserts.assertJsonEquals;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.succeedState;

import org.junit.Test;

public class StateMachineAdapterTest {

    @Test
    public void simpleStateMachine_AdaptsCorrectlyToJson() {
        String expected = "{\n"
                          + "   \"StartAt\":\"Succeed\",\n"
                          + "   \"States\":{\n"
                          + "      \"Succeed\":{\n"
                          + "         \"Type\":\"Succeed\"\n"
                          + "      }\n"
                          + "   }\n"
                          + "}";
        String actual = new StateMachineAdapter().adapt(StateMachine.builder()
                                                                    .state("Succeed", succeedState())
                                                                    .startAt("Succeed")
                                                                    .build());
        assertJsonEquals(expected, actual);
    }

}