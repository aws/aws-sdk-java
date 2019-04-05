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

import static com.amazonaws.services.stepfunctions.builder.StatesAsserts.assertStateMachineMatches;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.and;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.branch;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.catcher;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choice;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choiceState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.end;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.eq;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.failState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.gt;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.gte;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.lt;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.lte;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.next;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.not;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.or;
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

import java.util.Date;
import org.joda.time.DateTime;
import org.junit.Test;

public class StepFunctionBuilderTest {

    @Test
    public void singleSucceedState() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .timeoutSeconds(30)
                .comment("My Simple State Machine")
                .state("InitialState", succeedState()
                        .comment("Initial State")
                        .inputPath("$.input")
                        .outputPath("$.output"))
                .build();
        assertStateMachineMatches("SingleSucceedState.json", stateMachine);
    }

    @Test
    public void singleTaskState() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .comment("Initial State")
                        .timeoutSeconds(10)
                        .heartbeatSeconds(1)
                        .transition(next("NextState"))
                        .resource("resource-arn")
                        .inputPath("$.input")
                        .resultPath("$.result")
                        .outputPath("$.output")
                        .parameters(new SimplePojo("value")))
                .state("NextState", succeedState())
                .build();

        assertStateMachineMatches("SimpleTaskState.json", stateMachine);
    }

    @Test
    public void taskStateWithEnd() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .resource("resource-arn")
                        .transition(end()))
                .build();

        assertStateMachineMatches("TaskStateWithEnd.json", stateMachine);
    }

    @Test
    public void singleTaskStateWithRetries() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .transition(next("NextState"))
                        .resource("resource-arn")
                        .retriers(retrier()
                                          .errorEquals("Foo", "Bar")
                                          .intervalSeconds(20)
                                          .maxAttempts(3)
                                          .backoffRate(2.0),
                                  retrier()
                                          .retryOnAllErrors()
                                          .intervalSeconds(30)
                                          .maxAttempts(10)
                                          .backoffRate(2.0)))
                .state("NextState", succeedState())
                .build();

        assertStateMachineMatches("SimpleTaskStateWithRetries.json", stateMachine);
    }

    @Test
    public void singleTaskStateWithCatchers() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", taskState()
                        .transition(next("NextState"))
                        .resource("resource-arn")
                        .catchers(catcher()
                                          .errorEquals("Foo", "Bar")
                                          .transition(next("RecoveryState"))
                                          .resultPath("$.result-path"),
                                  catcher()
                                          .catchAll()
                                          .transition(next("OtherRecoveryState"))))
                .state("NextState", succeedState())
                .state("RecoveryState", succeedState())
                .state("OtherRecoveryState", succeedState())
                .build();

        assertStateMachineMatches("SimpleTaskStateWithCatchers.json", stateMachine);
    }

    @Test
    public void singlePassStateWithJsonResult() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", passState()
                        .comment("Pass through state")
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .resultPath("$.result")
                        .parameters("true")
                        .transition(next("NextState"))
                        .result("{\"Foo\": \"Bar\"}"))
                .state("NextState", succeedState())
                .build();

        assertStateMachineMatches("SinglePassStateWithJsonResult.json", stateMachine);
    }

    @Test
    public void singlePassStateWithObjectResult() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", passState()
                        .transition(end())
                        .result(new SimplePojo("value")))
                .build();

        assertStateMachineMatches("SinglePassStateWithObjectResult.json", stateMachine);
    }

    @Test
    public void singleWaitState_WaitForSeconds() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .comment("My wait state")
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .waitFor(seconds(10))
                        .transition(next("NextState")))
                .state("NextState", succeedState())
                .build();

        assertStateMachineMatches("SingleWaitStateWithSeconds.json", stateMachine);
    }

    @Test
    public void singleWaitState_WaitUntilSecondsPath() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(secondsPath("$.seconds"))
                        .transition(end()))
                .build();

        assertStateMachineMatches("SingleWaitStateWithSecondsPath.json", stateMachine);
    }

    @Test
    public void singleWaitState_WaitUntilTimestamp() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(timestamp(DateTime.parse("2016-03-14T01:59:00Z").toDate()))
                        .transition(end()))
                .build();

        assertStateMachineMatches("SingleWaitStateWithTimestamp.json", stateMachine);
    }

    @Test
    public void singleWaitState_WaitUntilTimestampWithMillisecond() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(timestamp(DateTime.parse("2016-03-14T01:59:00.123Z").toDate()))
                        .transition(end()))
                .build();

        assertStateMachineMatches("SingleWaitStateWithTimestampWithMilliseconds.json", stateMachine);
    }

    @Test
    public void singleWaitState_WaitUntilTimestampWithTimezone() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(timestamp(DateTime.parse("2016-03-14T01:59:00.123-08:00").toDate()))
                        .transition(end()))
                .build();

        assertStateMachineMatches("SingleWaitStateWithTimestampWithTimezone.json", stateMachine);
    }

    @Test
    public void singleWaitState_WaitUntilTimestampWithPath() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", waitState()
                        .waitFor(timestampPath("$.timestamp"))
                        .transition(end()))
                .build();

        assertStateMachineMatches("SingleWaitStateWithTimestampWithPath.json", stateMachine);
    }

    @Test
    public void singleFailState() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", failState()
                        .comment("My fail state")
                        .cause("InternalError")
                        .error("java.lang.Exception"))
                .build();

        assertStateMachineMatches("SingleFailState.json", stateMachine);
    }

    @Test
    public void simpleChoiceState() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .comment("My choice state")
                        .defaultStateName("DefaultState")
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .choice(choice().transition(next("NextState"))
                                        .condition(eq("$.var", "value"))))
                .state("NextState", succeedState())
                .state("DefaultState", succeedState())
                .build();

        assertStateMachineMatches("SimpleChoiceState.json", stateMachine);
    }

    @Test
    public void choiceStateWithMultipleChoices() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .defaultStateName("DefaultState")
                        .choices(
                                choice().transition(next("NextState"))
                                        .condition(eq("$.var", "value")),
                                choice().transition(next("OtherNextState"))
                                        .condition(gt("$.number", 10))))
                .state("NextState", succeedState())
                .state("OtherNextState", succeedState())
                .state("DefaultState", succeedState())
                .build();

        assertStateMachineMatches("ChoiceStateWithMultipleChoices.json", stateMachine);
    }

    @Test
    public void choiceStateWithAndCondition() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .defaultStateName("DefaultState")
                        .choice(choice().transition(next("NextState"))
                                        .condition(
                                                and(eq("$.var", "value"),
                                                    eq("$.other-var", 10)
                                                ))))
                .state("NextState", succeedState())
                .state("DefaultState", succeedState())
                .build();

        assertStateMachineMatches("ChoiceStateWithAndCondition.json", stateMachine);
    }

    @Test
    public void choiceStateWithOrCondition() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .defaultStateName("DefaultState")
                        .choice(choice().transition(next("NextState"))
                                        .condition(
                                                or(gt("$.var", "value"),
                                                   lte("$.other-var", 10)
                                                ))))
                .state("NextState", succeedState())
                .state("DefaultState", succeedState())
                .build();

        assertStateMachineMatches("ChoiceStateWithOrCondition.json", stateMachine);
    }

    @Test
    public void choiceStateWithNotCondition() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .defaultStateName("DefaultState")
                        .choice(choice().transition(next("NextState"))
                                        .condition(not(gte("$.var", "value")))))
                .state("NextState", succeedState())
                .state("DefaultState", succeedState())
                .build();

        assertStateMachineMatches("ChoiceStateWithNotCondition.json", stateMachine);
    }

    @Test
    public void choiceStateWithComplexCondition() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .defaultStateName("DefaultState")
                        .choice(choice().transition(next("NextState"))
                                        .condition(and(
                                                gte("$.var", "value"),
                                                lte("$.other-var", "foo"),
                                                or(
                                                        lt("$.numeric", 9000.1),
                                                        not(gte("$.numeric", 42))
                                                )
                                        ))))
                .state("NextState", succeedState())
                .state("DefaultState", succeedState())
                .build();

        assertStateMachineMatches("ChoiceStateWithComplexCondition.json", stateMachine);
    }

    @Test
    public void choiceStateWithAllPrimitiveConditions() {
        final Date date = DateTime.parse("2016-03-14T01:59:00.000Z").toDate();
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .defaultStateName("DefaultState")
                        .choice(choice().transition(next("NextState"))
                                        .condition(and(
                                                eq("$.string", "value"),
                                                gt("$.string", "value"),
                                                gte("$.string", "value"),
                                                lt("$.string", "value"),
                                                lte("$.string", "value"),
                                                eq("$.integral", 42),
                                                gt("$.integral", 42),
                                                gte("$.integral", 42),
                                                lt("$.integral", 42),
                                                lte("$.integral", 42),
                                                eq("$.double", 9000.1),
                                                gt("$.double", 9000.1),
                                                gte("$.double", 9000.1),
                                                lt("$.double", 9000.1),
                                                lte("$.double", 9000.1),
                                                eq("$.timestamp", date),
                                                gt("$.timestamp", date),
                                                gte("$.timestamp", date),
                                                lt("$.timestamp", date),
                                                lte("$.timestamp", date),
                                                eq("$.boolean", true),
                                                eq("$.boolean", false)
                                        ))))
                .state("NextState", succeedState())
                .state("DefaultState", succeedState())
                .build();

        assertStateMachineMatches("ChoiceStateWithAllPrimitiveCondition.json", stateMachine);
    }

    @Test
    public void simpleParallelState() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", parallelState()
                        .comment("My parallel state")
                        .inputPath("$.input")
                        .outputPath("$.output")
                        .resultPath("$.result")
                        .parameters("{\"foo.$\": \"$.val\"}")
                        .transition(next("NextState"))
                        .branches(
                                branch()
                                        .comment("Branch one")
                                        .startAt("BranchOneInitial")
                                        .state("BranchOneInitial", succeedState()),
                                branch()
                                        .comment("Branch two")
                                        .startAt("BranchTwoInitial")
                                        .state("BranchTwoInitial", succeedState())
                        ))
                .state("NextState", succeedState())
                .build();

        assertStateMachineMatches("SimpleParallelState.json", stateMachine);
    }

    @Test
    public void parallelStateWithRetriers() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", parallelState()
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
                        )
                        .retriers(retrier()
                                          .errorEquals("Foo", "Bar")
                                          .intervalSeconds(10)
                                          .backoffRate(1.0)
                                          .maxAttempts(3),
                                  retrier()
                                          .retryOnAllErrors()
                                          .intervalSeconds(10)
                                          .backoffRate(1.0)
                                          .maxAttempts(3)
                        ))
                .build();

        assertStateMachineMatches("ParallelStateWithRetriers.json", stateMachine);
    }

    @Test
    public void parallelStateWithCatchers() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", parallelState()
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
                        )
                        .catchers(catcher()
                                          .errorEquals("Foo", "Bar")
                                          .transition(next("RecoveryState"))
                                          .resultPath("$.result"),
                                  catcher()
                                          .catchAll()
                                          .transition(next("OtherRecoveryState"))
                                          .resultPath("$.result")
                        ))
                .state("RecoveryState", succeedState())
                .state("OtherRecoveryState", succeedState())
                .build();

        assertStateMachineMatches("ParallelStateWithCatchers.json", stateMachine);
    }

    @Test
    public void choiceStateWithEmptyStringInExpectedValue_DoesNotExcludeExpectedValueFromJson() {
        final StateMachine stateMachine = stateMachine()
                .startAt("InitialState")
                .state("InitialState", choiceState()
                        .comment("My choice state")
                        .choice(choice().transition(next("FinalState"))
                                        .condition(eq("$.var", ""))))
                .state("FinalState", succeedState())
                .build();

        assertStateMachineMatches("ChoiceStateWithEmptyStringInExpectedValue.json", stateMachine);
    }

    @Test(expected = Exception.class)
    public void stateMachineFromJson_MalformedJson_ThrowsException() {
        StateMachine.fromJson("{");
    }

}
