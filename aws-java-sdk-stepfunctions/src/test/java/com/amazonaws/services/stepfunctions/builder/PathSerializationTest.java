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

import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.branch;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.catcher;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choice;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choiceState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.end;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.eq;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.next;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.parallelState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.passState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.seconds;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.stateMachine;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.succeedState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.taskState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.waitState;

import org.junit.Test;

public class PathSerializationTest {

    @Test
    public void taskStateWithNoPathsProvided_DoesNotHavePathFieldsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .resource("resource-arn")
                        .transition(end()))
                .build();
        assertStateMachineMatches("TaskStateWithNoExplicitPaths.json", stateMachine);
    }

    @Test
    public void taskStateWithExplicitNullPaths_HasExplicitJsonNullInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .resource("resource-arn")
                        .inputPath(null)
                        .outputPath(null)
                        .resultPath(null)
                        .parameters(null)
                        .transition(end()))
                .build();
        assertStateMachineMatches("TaskStateWithExplicitNullPaths.json", stateMachine);
    }

    @Test
    public void taskStateWithNonNullPaths_HasCorrectPathsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .resource("resource-arn")
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .resultPath("$.result")
                        .parameters("{\"foo\": 42}")
                        .transition(end()))
                .build();
        assertStateMachineMatches("TaskStateWithNonNullPaths.json", stateMachine);
    }

    @Test
    public void parallelStateWithNoPathsProvided_DoesNotHavePathFieldsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", parallelState()
                        .branch(branch()
                                        .startAt("BranchState")
                                        .state("BranchState", succeedState()))
                        .transition(end()))
                .build();
        assertStateMachineMatches("ParallelStateWithNoExplicitPaths.json", stateMachine);
    }

    @Test
    public void parallelStateWithExplicitNullPaths_HasExplicitJsonNullInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", parallelState()
                        .branch(branch()
                                        .startAt("BranchState")
                                        .state("BranchState", succeedState()))
                        .inputPath(null)
                        .outputPath(null)
                        .resultPath(null)
                        .parameters(null)
                        .transition(end()))
                .build();
        assertStateMachineMatches("ParallelStateWithExplicitNullPaths.json", stateMachine);
    }

    @Test
    public void parallelStateWithNonNullPaths_HasCorrectPathsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", parallelState()
                        .branch(branch()
                                        .startAt("BranchState")
                                        .state("BranchState", succeedState()))
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .resultPath("$.result")
                        .parameters("[42, \"foo\", {}]")
                        .transition(end()))
                .build();
        assertStateMachineMatches("ParallelStateWithNonNullPaths.json", stateMachine);
    }

    @Test
    public void passStateWithNoPathsProvided_DoesNotHavePathFieldsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", passState()
                        .transition(end()))
                .build();
        assertStateMachineMatches("PassStateWithNoExplicitPaths.json", stateMachine);
    }

    @Test
    public void passStateWithExplicitNullPaths_HasExplicitJsonNullInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", passState()
                        .inputPath(null)
                        .outputPath(null)
                        .resultPath(null)
                        .parameters(null)
                        .transition(end()))
                .build();
        assertStateMachineMatches("PassStateWithExplicitNullPaths.json", stateMachine);
    }

    @Test
    public void passStateWithNonNullPaths_HasCorrectPathsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", passState()
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .resultPath("$.result")
                        .parameters("\"foo\"")
                        .transition(end()))
                .build();
        assertStateMachineMatches("PassStateWithNonNullPaths.json", stateMachine);
    }

    @Test
    public void waitStateWithNoPathsProvided_DoesNotHavePathFieldsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(seconds(4))
                        .transition(end()))
                .build();
        assertStateMachineMatches("WaitStateWithNoExplicitPaths.json", stateMachine);
    }

    @Test
    public void waitStateWithExplicitNullPaths_HasExplicitJsonNullInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(seconds(4))
                        .inputPath(null)
                        .outputPath(null)
                        .transition(end()))
                .build();
        assertStateMachineMatches("WaitStateWithExplicitNullPaths.json", stateMachine);
    }

    @Test
    public void waitStateWithNonNullPaths_HasCorrectPathsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(seconds(4))
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .transition(end()))
                .build();
        assertStateMachineMatches("WaitStateWithNonNullPaths.json", stateMachine);
    }

    @Test
    public void succeedStateWithNoPathsProvided_DoesNotHavePathFieldsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", succeedState())
                .build();
        assertStateMachineMatches("SucceedStateWithNoExplicitPaths.json", stateMachine);
    }

    @Test
    public void succeedStateWithExplicitNullPaths_HasExplicitJsonNullInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", succeedState()
                        .inputPath(null)
                        .outputPath(null))
                .build();
        assertStateMachineMatches("SucceedStateWithExplicitNullPaths.json", stateMachine);
    }

    @Test
    public void succeedStateWithNonNullPaths_HasCorrectPathsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", succeedState()
                        .inputPath("$.input")
                        .outputPath("$.output"))
                .build();
        assertStateMachineMatches("SucceedStateWithNonNullPaths.json", stateMachine);
    }

    @Test
    public void choiceStateWithNoPathsProvided_DoesNotHavePathFieldsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .choice(choice()
                                        .condition(eq("$.foo", "val"))
                                        .transition(next("EndState"))))
                .state("EndState", succeedState())
                .build();
        assertStateMachineMatches("ChoiceStateWithNoExplicitPaths.json", stateMachine);
    }

    @Test
    public void choiceStateWithExplicitNullPaths_HasExplicitJsonNullInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .inputPath(null)
                        .outputPath(null)
                        .choice(choice()
                                        .condition(eq("$.foo", "val"))
                                        .transition(next("EndState"))))
                .state("EndState", succeedState())
                .build();
        assertStateMachineMatches("ChoiceStateWithExplicitNullPaths.json", stateMachine);
    }

    @Test
    public void choiceStateWithNonNullPaths_HasCorrectPathsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .choice(choice()
                                        .condition(eq("$.foo", "val"))
                                        .transition(next("EndState"))))
                .state("EndState", succeedState())
                .build();
        assertStateMachineMatches("ChoiceStateWithNonNullPaths.json", stateMachine);
    }

    @Test
    public void catcherWithNoPathsProvided_DoesNotHavePathFieldsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .resource("resource-arn")
                        .catcher(catcher()
                                         .catchAll()
                                         .transition(next("EndState")))
                        .transition(end()))
                .state("EndState", succeedState())
                .build();
        assertStateMachineMatches("CatcherWithNoExplicitPaths.json", stateMachine);
    }

    @Test
    public void catcherWithExplicitNullPaths_HasExplicitJsonNullInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .resource("resource-arn")
                        .catcher(catcher()
                                         .catchAll()
                                         .resultPath(null)
                                         .transition(next("EndState")))
                        .transition(end()))
                .state("EndState", succeedState())
                .build();
        assertStateMachineMatches("CatcherWithExplicitNullPaths.json", stateMachine);
    }

    @Test
    public void catcherWithNonNullPaths_HasCorrectPathsInJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .resource("resource-arn")
                        .catcher(catcher()
                                         .catchAll()
                                         .resultPath("$.result")
                                         .transition(next("EndState")))
                        .transition(end()))
                .state("EndState", succeedState())
                .build();
        assertStateMachineMatches("CatcherWithNonNullPaths.json", stateMachine);
    }

    private static void assertStateMachineMatches(String resourcePath, StateMachine stateMachine) {
        StatesAsserts.assertStateMachineMatches("paths", resourcePath, stateMachine);
    }
}
