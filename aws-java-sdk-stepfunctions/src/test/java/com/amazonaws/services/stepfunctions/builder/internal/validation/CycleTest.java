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

import com.amazonaws.services.stepfunctions.builder.StateMachine;

import org.junit.Test;

import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.branch;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choice;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.choiceState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.end;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.eq;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.next;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.parallelState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.passState;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.stateMachine;
import static com.amazonaws.services.stepfunctions.builder.StepFunctionBuilder.succeedState;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class CycleTest {

    @Test
    public void singleTerminalState_HasNoCycle_IsValid() {
        assertNoCycle(stateMachine()
                              .startAt("Initial")
                              .state("Initial", succeedState()));
    }

    @Test(expected = ValidationException.class)
    public void simpleStateMachine_WithCycle_IsNotValid() {
        assertCycle(stateMachine()
                            .startAt("Initial")
                            .state("Initial", passState()
                                    .transition(next("Next")))
                            .state("Next", passState()
                                    .transition(next("Initial"))));
    }

    @Test(expected = ValidationException.class)
    public void choiceStateWithOnlyCycles_IsNotValid() {
        assertDoesNotHaveTerminalPath(stateMachine()
                                              .startAt("Initial")
                                              .state("Initial", passState()
                                                      .transition(next("Choice")))
                                              .state("Choice", choiceState()
                                                      .defaultStateName("Default")
                                                      .choice(choice()
                                                                      .transition(next("Initial"))
                                                                      .condition(eq("$.foo", "bar")))
                                                      .choice(choice()
                                                                      .transition(next("Default"))
                                                                      .condition(eq("$.foo", "bar"))))
                                              .state("Default", passState().transition(next("Choice"))));
    }

    @Test
    public void choiceStateWithPathToTerminal_IsValid() {
        assertHasPathToTerminal(stateMachine()
                                        .startAt("Initial")
                                        .state("Initial", passState()
                                                .transition(next("Choice")))
                                        .state("Choice", choiceState()
                                                .defaultStateName("Default")
                                                .choice(choice()
                                                                .transition(next("Initial"))
                                                                .condition(eq("$.foo", "bar")))
                                                .choice(choice()
                                                                .transition(next("Default"))
                                                                .condition(eq("$.foo", "bar"))))
                                        .state("Default", passState().transition(end())));
    }

    @Test(expected = ValidationException.class)
    public void choiceStateWithClosedCycle_IsNotValid() {
        assertCycle(stateMachine()
                            .startAt("Initial")
                            .state("Initial", passState()
                                    .transition(next("Choice")))
                            .state("Choice", choiceState()
                                    .defaultStateName("Terminal")
                                    .choice(choice()
                                                    .transition(next("Terminal"))
                                                    .condition(eq("$.foo", "bar")))
                                    .choice(choice()
                                                    .transition(next("NonTerminal"))
                                                    .condition(eq("$.foo", "bar"))))
                            .state("Terminal", passState().transition(end()))
                            .state("NonTerminal", passState().transition(next("Cyclic")))
                            .state("Cyclic", passState().transition(next("NonTerminal"))));
    }

    /**
     * While the nested ChoiceTwo state only has cycles, it has a cycle out of the choice state to
     * a state that contains a path to a terminal. The validator doesn't validate that the path out actually
     * has a path to the terminal so there are some invalid state machines that will pass validation.
     */
    @Test
    public void choiceStateWithPathOut_IsValid() {
        assertNoCycle(
                stateMachine()
                        .startAt("Initial")
                        .state("Initial", passState()
                                .transition(next("ChoiceOne")))
                        .state("ChoiceOne", choiceState()
                                .defaultStateName("DefaultOne")
                                .choice(choice()
                                                .transition(next("ChoiceTwo"))
                                                .condition(eq("$.foo", "bar"))))
                        .state("DefaultOne", succeedState())
                        .state("ChoiceTwo", choiceState()
                                .defaultStateName("DefaultTwo")
                                .choice(choice()
                                                .transition(next("ChoiceOne"))
                                                .condition(eq("$.foo", "bar"))))
                        .state("DefaultTwo", passState().transition(next("ChoiceTwo"))));
    }

    @Test
    public void parallelState_NoCycles() {
        assertNoCycle(stateMachine()
                              .startAt("Initial")
                              .state("Initial", parallelState()
                                      .branch(branch()
                                                      .startAt("BranchOneStart")
                                                      .state("BranchOneStart", succeedState()))
                                      .branch(branch()
                                                      .startAt("BranchTwoStart")
                                                      .state("BranchTwoStart", passState()
                                                              .transition(next("NextState")))
                                                      .state("NextState", succeedState()))
                                      .transition(end())));
    }

    @Test(expected = ValidationException.class)
    public void parallelState_WithCycles_IsNotValid() {
        assertCycle(stateMachine()
                            .startAt("Parallel")
                            .state("Parallel", parallelState()
                                    .branch(branch()
                                                    .startAt("BranchOneInitial")
                                                    .state("BranchOneInitial", passState()
                                                            .transition(next("CyclicState")))
                                                    .state("CyclicState", passState()
                                                            .transition(next("BranchOneInitial"))))
                                    .transition(end())));
    }

    @Test(expected = ValidationException.class)
    public void parallelState_WithChoiceThatHasNoTerminalPath_IsNotValid() {
        assertDoesNotHaveTerminalPath(
                stateMachine()
                        .startAt("Parallel")
                        .state("Parallel", parallelState()
                                .transition(end())
                                .branch(branch()
                                                .startAt("Initial")
                                                .state("Initial", passState()
                                                        .transition(next("Choice")))
                                                .state("Choice", choiceState()
                                                        .defaultStateName("Default")
                                                        .choice(choice()
                                                                        .transition(next("Initial"))
                                                                        .condition(eq("$.foo", "bar")))
                                                        .choice(choice()
                                                                        .transition(next("Default"))
                                                                        .condition(eq("$.foo", "bar"))))
                                                .state("Default", passState().transition(next("Choice"))))));
    }

    @Test
    public void parallelState_ChoiceStateWithTerminalPath_IsValid() {
        assertHasPathToTerminal(
                stateMachine()
                        .startAt("Parallel")
                        .state("Parallel", parallelState()
                                .transition(end())
                                .branch(branch()
                                                .startAt("Initial")
                                                .state("Initial", passState()
                                                        .transition(next("Choice")))
                                                .state("Choice", choiceState()
                                                        .defaultStateName("Default")
                                                        .choice(choice()
                                                                        .transition(next("Initial"))
                                                                        .condition(eq("$.foo", "bar")))
                                                        .choice(choice()
                                                                        .transition(next("Default"))
                                                                        .condition(eq("$.foo", "bar"))))
                                                .state("Default", passState().transition(end())))));
    }

    @Test(expected = ValidationException.class)
    public void parallelState_BranchContainsChoiceStateWithClosedCycle_IsNotValid() {
        assertCycle(
                stateMachine()
                        .startAt("Initial")
                        .state("Initial", passState()
                                .transition(next("Choice")))
                        .state("Choice", choiceState()
                                .defaultStateName("Terminal")
                                .choice(choice()
                                                .transition(next("Terminal"))
                                                .condition(eq("$.foo", "bar")))
                                .choice(choice()
                                                .transition(next("NonTerminal"))
                                                .condition(eq("$.foo", "bar"))))
                        .state("Terminal", passState().transition(end()))
                        .state("NonTerminal", passState().transition(next("Cyclic")))
                        .state("Cyclic", passState().transition(next("NonTerminal"))));
    }

    private void assertCycle(StateMachine.Builder stateMachineBuilder) {
        try {
            validate(stateMachineBuilder);
        } catch (IllegalArgumentException expected) {
            assertThat(expected.getMessage(), containsString("Cycle detected"));
        }
    }

    private void assertDoesNotHaveTerminalPath(StateMachine.Builder stateMachineBuilder) {
        try {
            validate(stateMachineBuilder);
        } catch (IllegalArgumentException expected) {
            assertThat(expected.getMessage(), containsString("No path to a terminal state exists in the state machine"));
        }
    }

    private void assertHasPathToTerminal(StateMachine.Builder stateMachineBuilder) {
        validate(stateMachineBuilder);
    }

    private void assertNoCycle(StateMachine.Builder stateMachineBuilder) {
        validate(stateMachineBuilder);
    }

    private void validate(StateMachine.Builder stateMachineBuilder) {
        new StateMachineValidator(stateMachineBuilder.build()).validate();
    }
}
