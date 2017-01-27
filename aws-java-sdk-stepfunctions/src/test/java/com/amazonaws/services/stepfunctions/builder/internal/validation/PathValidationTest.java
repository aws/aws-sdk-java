/*
 * Copyright 2011-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.stepfunctions.builder.internal.validation;

import com.amazonaws.services.stepfunctions.builder.states.Catcher;
import com.amazonaws.services.stepfunctions.builder.states.ParallelState;
import com.amazonaws.services.stepfunctions.builder.states.PassState;
import com.amazonaws.services.stepfunctions.builder.states.TaskState;
import com.amazonaws.services.stepfunctions.builder.states.WaitState;

import org.junit.Test;

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

public class PathValidationTest {

    @Test(expected = ValidationException.class)
    public void choiceState_InputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("ChoiceState")
                .state("ChoiceState", choiceState()
                        .choice(choice()
                                        .condition(eq("$.foo", "bar"))
                                        .transition(next("End")))
                        .inputPath("$."))
                .state("End", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void choiceState_OutputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("ChoiceState")
                .state("ChoiceState", choiceState()
                        .choice(choice()
                                        .condition(eq("$.foo", "bar"))
                                        .transition(next("End")))
                        .outputPath("["))
                .state("End", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void choiceState_ConditionWithInvalidPath_ThrowsException() {
        stateMachine()
                .startAt("ChoiceState")
                .state("ChoiceState", choiceState()
                        .choice(choice()
                                        .condition(eq("$.", "bar"))
                                        .transition(next("End"))))
                .state("End", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelState_InputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("ParallelState")
                .state("ParallelState", validParallelState().inputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelState_OutputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("ParallelState")
                .state("ParallelState", validParallelState().outputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelState_ResultPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("ParallelState")
                .state("ParallelState", validParallelState().resultPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelState_ResultPathInvalidReferencePath_ThrowsException() {
        stateMachine()
                .startAt("ParallelState")
                .state("ParallelState", validParallelState().resultPath("$.foo[*]"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void passState_InputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("PassState")
                .state("PassState", validPassState().inputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void passState_OutputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("PassState")
                .state("PassState", validPassState().outputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void passState_ResultPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("PassState")
                .state("PassState", validPassState().resultPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void passState_ResultPathInvalidReferencePath_ThrowsException() {
        stateMachine()
                .startAt("PassState")
                .state("PassState", validPassState().resultPath("$.foo[*]"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void succeedState_InputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("SucceedState")
                .state("SucceedState", succeedState().inputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void succeedState_OutputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("SucceedState")
                .state("SucceedState", succeedState().outputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void taskState_InputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("TaskState")
                .state("TaskState", validTaskState().inputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void taskState_OutputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("TaskState")
                .state("TaskState", validTaskState().outputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void taskState_ResultPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("TaskState")
                .state("TaskState", validTaskState().resultPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void taskState_ResultPathInvalidReferencePath_ThrowsException() {
        stateMachine()
                .startAt("TaskState")
                .state("TaskState", validTaskState().resultPath("$.foo[*]"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void taskState_CatcherWithResultPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("TaskState")
                .state("TaskState", validTaskState().catcher(validCatcher("End").resultPath("$.")))
                .state("End", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void taskState_CatcherResultPathInvalidReferencePath_ThrowsException() {
        stateMachine()
                .startAt("TaskState")
                .state("TaskState", validTaskState().catcher(validCatcher("End").resultPath("$.foo[*]")))
                .state("End", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitState_InputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("WaitState")
                .state("WaitState", validWaitState().inputPath("$."))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitState_OutputPathInvalid_ThrowsException() {
        stateMachine()
                .startAt("WaitState")
                .state("WaitState", validWaitState().inputPath("$.foo[*}"))
                .build();
    }

    private ParallelState.Builder validParallelState() {
        return parallelState()
                .comment("My parallel state")
                .inputPath("$.input")
                .outputPath("$.output")
                .resultPath("$.result")
                .transition(end())
                .branches(
                        branch()
                                .comment("Branch one")
                                .startAt("BranchOneInitial")
                                .state("BranchOneInitial", succeedState()),
                        branch()
                                .comment("Branch two")
                                .startAt("BranchTwoInitial")
                                .state("BranchTwoInitial", succeedState())
                );
    }

    private WaitState.Builder validWaitState() {
        return waitState()
                .waitFor(seconds(10))
                .transition(end());
    }

    private PassState.Builder validPassState() {
        return passState().transition(end());
    }

    private TaskState.Builder validTaskState() {
        return taskState()
                .resource("foo")
                .transition(end());
    }

    private Catcher.Builder validCatcher(String catcherTransition) {
        return catcher().transition(next(catcherTransition)).catchAll();
    }
}
