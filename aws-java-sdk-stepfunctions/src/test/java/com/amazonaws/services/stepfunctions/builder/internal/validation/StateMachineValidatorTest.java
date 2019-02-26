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
package com.amazonaws.services.stepfunctions.builder.internal.validation;

import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.and;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.branch;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.catcher;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choice;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choiceState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.end;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.eq;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.failState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.next;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.parallelState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.passState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.retrier;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.seconds;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.secondsPath;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.stateMachine;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.succeedState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.taskState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.timestamp;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.timestampPath;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.waitState;

import com.amazonaws.services.stepfunctions.builder.ErrorCodes;
import com.amazonaws.services.stepfunctions.builder.conditions.NotCondition;
import org.junit.Test;

public class StateMachineValidatorTest {

    @Test(expected = ValidationException.class)
    public void nothingSet_IsNotValid() {
        stateMachine().build();
    }

    @Test(expected = ValidationException.class)
    public void noStates_IsNotValid() {
        stateMachine().startAt("Foo").build();
    }

    @Test(expected = ValidationException.class)
    public void startAtStateDoesNotExist_IsNotValid() {
        stateMachine()
                .startAt("Foo")
                .state("Initial", succeedState())
                .build();
    }

    @Test
    public void validMinimalStateMachine_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void missingResourceInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void missingTransitionInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void invalidTransitionInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(next("NoSuchState"))
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void negativeTimeoutSecondsInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .timeoutSeconds(-1)
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void zeroTimeoutSecondsInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .timeoutSeconds(0)
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void negativeHeartbeatSecondsInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .heartbeatSeconds(-1)
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void zeroHeartbeatSecondsInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .heartbeatSeconds(0)
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void heartbeatSecondsGreaterThanTimeoutSecondsInTaskState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .heartbeatSeconds(60)
                        .timeoutSeconds(30)
                        .resource("arn"))
                .build();
    }

    @Test
    public void retrierInTaskState_OnlyErrorEqualsSet_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void retrierInTaskState_MaxAttemptsNegative_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .maxAttempts(-1)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test
    public void retrierInTaskState_MaxAttemptsZero_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .maxAttempts(0)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void retrierInTaskState_IntervalSecondsNegative_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .intervalSeconds(-1)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void retrierInTaskState_IntervalSecondsZero_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .intervalSeconds(0)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test
    public void retrierInTaskState_IntervalSecondsPositive_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .intervalSeconds(10)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void retrierInTaskState_BackoffRateNegative_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .backoffRate(-1.0)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void retrierInTaskState_BackoffRateLessThanOne_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .backoffRate(0.5)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test
    public void retrierInTaskState_BackoffRateGreaterThanOne_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .backoffRate(1.5)
                                         .retryOnAllErrors())
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void retrierInTaskState_RetryAllHasOtherErrorCodes_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .errorEquals("Foo", "Bar", ErrorCodes.ALL))
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void retrierInTaskState_RetryAllIsNotLastRetrier_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .retrier(retrier()
                                         .retryOnAllErrors())
                        .retrier(retrier()
                                         .errorEquals("Foo", "Bar"))
                        .resource("arn"))
                .build();
    }

    @Test
    public void catcherInTaskState_ValidTransition_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .catcher(catcher()
                                         .transition(next("Terminal"))
                                         .catchAll())
                        .resource("arn"))
                .state("Terminal", succeedState())
                .build();
    }


    @Test(expected = ValidationException.class)
    public void catcherInTaskState_InvalidTransition_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .catcher(catcher()
                                         .transition(next("NoSuchState"))
                                         .catchAll())
                        .resource("arn"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void catcherInTaskState_CatchAllHasOtherErrorCodes_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .catcher(catcher()
                                         .transition(next("Terminal"))
                                         .errorEquals("Foo", "Bar", ErrorCodes.ALL))
                        .resource("arn"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void catcherInTaskState_CatchAllIsNotLastCatcher_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", taskState()
                        .transition(end())
                        .catcher(catcher()
                                         .transition(next("Terminal"))
                                         .catchAll())
                        .catcher(catcher()
                                         .transition(next("Terminal"))
                                         .errorEquals("Foo", "Bar"))
                        .resource("arn"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void invalidTransitionInWaitState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(seconds(10))
                        .transition(next("NoSuchState")))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void noWaitForSupplied_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitForSeconds_NegativeSeconds_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(seconds(-1))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitForSeconds_ZeroSeconds_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(seconds(0))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitForTimestamp_NullDate_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(timestamp(null))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitForTimestampPath_MissingPath_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(timestampPath(null))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitForTimestampPath_EmptyPath_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(timestampPath(""))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitForSecondsPath_MissingPath_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(secondsPath(null))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void waitForSecondsPath_EmptyPath_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", waitState()
                        .waitFor(secondsPath(""))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void invalidTransitionInPassState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", passState()
                        .transition(next("NoSuchState")))
                .build();
    }

    @Test
    public void validTransitionInPassState_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", passState()
                        .transition(next("Terminal")))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void missingCauseInFailState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", failState()
                        .error("Error"))
                .build();
    }

    @Test
    public void missingErrorInFailState_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", failState()
                        .cause("Cause"))
                .build();
    }

    @Test
    public void failStateWithErrorAndCause_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", failState()
                        .error("Error")
                        .cause("Cause"))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void choiceStateWithNoChoices_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .defaultStateName("Terminal"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void choiceStateWithInvalidDefaultState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .choice(choice()
                                        .condition(eq("$.foo", "bar"))
                                        .transition(next("Terminal")))
                        .defaultStateName("NoSuchState"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void choiceStateWithInvalidChoiceTransition_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .choice(choice()
                                        .condition(eq("$.foo", "bar"))
                                        .transition(next("NoSuchState")))
                        .defaultStateName("Terminal"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test
    public void choiceStateWithNoDefaultTransition_IsValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .choice(choice()
                                        .condition(eq("$.foo", "bar"))
                                        .transition(next("Terminal"))))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void missingVariable_StringEqualsCondition_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .choice(choice()
                                        .condition(eq(null, "foo"))
                                        .transition(next("Terminal")))
                        .defaultStateName("Terminal"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void missingExpectedValue_StringEqualsCondition_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .choice(choice()
                                        .condition(eq("$.foo", (String) null))
                                        .transition(next("Terminal")))
                        .defaultStateName("Terminal"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void noConditionsInAnd_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .choice(choice()
                                        .condition(and())
                                        .transition(next("Terminal")))
                        .defaultStateName("Terminal"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void noConditionSetForNot_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", choiceState()
                        .choice(choice()
                                        .condition(NotCondition.builder())
                                        .transition(next("Terminal")))
                        .defaultStateName("Terminal"))
                .state("Terminal", succeedState())
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelStateWithNoBranches_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", parallelState()
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelStateWithInvalidTransition_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", parallelState()
                        .branch(branch()
                                        .startAt("InitialBranchState")
                                        .state("InitialBranchState", succeedState()))
                        .transition(next("NoSuchState")))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelStateBranchStartAtStateInvalid_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", parallelState()
                        .branch(branch()
                                        .startAt("NoSuchState")
                                        .state("InitialBranchState", succeedState()))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelStateInvalidBranchState_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", parallelState()
                        .branch(branch()
                                        .startAt("InitialBranchState")
                                        .state("InitialBranchState", failState()))
                        .transition(end()))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelStateInvalidRetrier_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", parallelState()
                        .branch(branch()
                                        .startAt("InitialBranchState")
                                        .state("InitialBranchState", succeedState()))
                        .transition(end())
                        .retrier(retrier()
                                         .intervalSeconds(-1)))
                .build();
    }

    @Test(expected = ValidationException.class)
    public void parallelStateInvalidCatcher_IsNotValid() {
        stateMachine()
                .startAt("Initial")
                .state("Initial", parallelState()
                        .branch(branch()
                                        .startAt("InitialBranchState")
                                        .state("InitialBranchState", succeedState()))
                        .transition(end())
                        .catcher(catcher()
                                         .transition(next("NoSuchState"))))
                .build();
    }
}
