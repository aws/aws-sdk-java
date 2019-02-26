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

import com.amazonaws.services.stepfunctions.builder.ErrorCodes;
import com.amazonaws.services.stepfunctions.builder.StateMachine;
import com.amazonaws.services.stepfunctions.builder.conditions.BinaryCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.Condition;
import com.amazonaws.services.stepfunctions.builder.conditions.NAryCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NotCondition;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.amazonaws.services.stepfunctions.builder.states.Branch;
import com.amazonaws.services.stepfunctions.builder.states.Catcher;
import com.amazonaws.services.stepfunctions.builder.states.Choice;
import com.amazonaws.services.stepfunctions.builder.states.ChoiceState;
import com.amazonaws.services.stepfunctions.builder.states.FailState;
import com.amazonaws.services.stepfunctions.builder.states.NextStateTransition;
import com.amazonaws.services.stepfunctions.builder.states.ParallelState;
import com.amazonaws.services.stepfunctions.builder.states.PassState;
import com.amazonaws.services.stepfunctions.builder.states.Retrier;
import com.amazonaws.services.stepfunctions.builder.states.State;
import com.amazonaws.services.stepfunctions.builder.states.StateVisitor;
import com.amazonaws.services.stepfunctions.builder.states.SucceedState;
import com.amazonaws.services.stepfunctions.builder.states.TaskState;
import com.amazonaws.services.stepfunctions.builder.states.Transition;
import com.amazonaws.services.stepfunctions.builder.states.TransitionState;
import com.amazonaws.services.stepfunctions.builder.states.WaitFor;
import com.amazonaws.services.stepfunctions.builder.states.WaitForSeconds;
import com.amazonaws.services.stepfunctions.builder.states.WaitForSecondsPath;
import com.amazonaws.services.stepfunctions.builder.states.WaitForTimestamp;
import com.amazonaws.services.stepfunctions.builder.states.WaitForTimestampPath;
import com.amazonaws.services.stepfunctions.builder.states.WaitState;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Validator for a {@link StateMachine} object.
 * // TODO Does not check max nesting.
 * // TODO Does not validate ARNs against a regex
 */
public class StateMachineValidator {

    private final ProblemReporter problemReporter = new ProblemReporter();
    private final StateMachine stateMachine;

    public StateMachineValidator(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public StateMachine validate() {
        ValidationContext context = ValidationContext.builder()
                .problemReporter(problemReporter)
                .parentContext(null)
                .identifier("Root")
                .location(Location.StateMachine)
                .build();
        context.assertStringNotEmpty(stateMachine.getStartAt(), PropertyNames.START_AT);
        context.assertIsPositiveIfPresent(stateMachine.getTimeoutSeconds(), PropertyNames.TIMEOUT_SECONDS);
        context.assertNotEmpty(stateMachine.getStates(), PropertyNames.STATES);

        validateStates(context, stateMachine.getStates());

        if (!stateMachine.getStates().containsKey(stateMachine.getStartAt())) {
            problemReporter.report(new Problem(context,
                                               String.format("%s state does not exist.", PropertyNames.START_AT)));
        }

        // If basic validation failed then the graph may not be in a good state to be able to validate
        if (!problemReporter.hasProblems()) {
            new GraphValidator(context, stateMachine).validate();
        }

        if (problemReporter.hasProblems()) {
            throw problemReporter.getException();
        }

        return stateMachine;
    }

    /**
     * Validates the DFS does not contain unrecoverable cycles (i.e. cycles with no branching logic) or
     * does not contain a path to a terminal state.
     */
    private final class GraphValidator {
        private final Map<String, State> parentVisited;
        private final String initialState;
        private final Map<String, State> states;
        private final Map<String, State> visited = new HashMap<String, State>();
        private final ValidationContext currentContext;

        public GraphValidator(ValidationContext context, StateMachine stateMachine) {
            this(context,
                 Collections.<String, State>emptyMap(),
                 stateMachine.getStartAt(),
                 stateMachine.getStates());
        }

        private GraphValidator(ValidationContext context,
                               Map<String, State> parentVisited,
                               String initialState,
                               Map<String, State> states) {
            this.currentContext = context;
            this.parentVisited = parentVisited;
            this.initialState = initialState;
            this.states = states;
        }

        public boolean validate() {
            boolean pathToTerminal = visit(initialState);
            if (parentVisited.isEmpty() && !pathToTerminal) {
                problemReporter.report(new Problem(currentContext, "No path to a terminal state exists."));
            }
            return pathToTerminal;
        }

        private boolean visit(String stateName) {
            ValidationContext stateContext = currentContext.state(stateName);
            final State state = states.get(stateName);
            if (!parentVisited.containsKey(stateName) && visited.containsKey(stateName)) {
                problemReporter.report(new Problem(stateContext, "Cycle detected."));
                return false;
            } else if (parentVisited.containsKey(stateName)) {
                // Cycle but to parent so we may be okay
                return false;
            }
            visited.put(stateName, state);
            if (state instanceof ParallelState) {
                validateParallelState(stateContext, (ParallelState) state);
            }
            if (state.isTerminalState()) {
                return true;
            } else if (state instanceof TransitionState) {
                final Transition transition = ((TransitionState) state).getTransition();
                return visit(((NextStateTransition) transition).getNextStateName());
            } else if (state instanceof ChoiceState) {
                return validateChoiceState(stateContext, (ChoiceState) state);
            } else {
                throw new RuntimeException("Unexpected state type: " + state.getClass().getName());
            }
        }

        private void validateParallelState(ValidationContext stateContext, ParallelState state) {
            int index = 0;
            for (Branch branch : state.getBranches()) {
                new GraphValidator(stateContext.branch(index),
                                   Collections.<String, State>emptyMap(),
                                   branch.getStartAt(),
                                   branch.getStates()).validate();
                index++;
            }
        }

        private boolean validateChoiceState(ValidationContext stateContext, ChoiceState choiceState) {
            final Map<String, State> merged = mergeParentVisited();
            boolean hasPathToTerminal = false;
            if (choiceState.getDefaultStateName() != null) {
                hasPathToTerminal = new GraphValidator(stateContext, merged, choiceState.getDefaultStateName(), states)
                        .validate();
            }
            int index = 0;
            for (Choice choice : choiceState.getChoices()) {
                final String nextStateName = ((NextStateTransition) choice.getTransition()).getNextStateName();
                // It's important hasPathToTerminal is last in the OR so it doesn't short circuit the choice validation
                hasPathToTerminal = new GraphValidator(stateContext.choice(index), merged, nextStateName, states).validate()
                                    || hasPathToTerminal;
                index++;
            }
            return hasPathToTerminal;
        }

        private Map<String, State> mergeParentVisited() {
            final Map<String, State> merged = new HashMap<String, State>(parentVisited.size() + visited.size());
            merged.putAll(parentVisited);
            merged.putAll(visited);
            return merged;
        }

    }

    private void validateStates(ValidationContext parentContext, Map<String, State> states) {
        for (Map.Entry<String, State> entry : states.entrySet()) {
            parentContext.assertStringNotEmpty(entry.getKey(), "State Name");
            entry.getValue().accept(new StateValidationVisitor(states, parentContext.state(entry.getKey())));
        }
    }

    /**
     * Validates all the supported states and their nested properties.
     */
    private class StateValidationVisitor extends StateVisitor<Void> {

        private final ValidationContext currentContext;
        private final Map<String, State> states;

        private StateValidationVisitor(Map<String, State> states, ValidationContext context) {
            this.states = states;
            this.currentContext = context;
        }

        @Override
        public Void visit(ChoiceState choiceState) {
            currentContext.assertIsValidInputPath(choiceState.getInputPath());
            currentContext.assertIsValidOutputPath(choiceState.getOutputPath());
            if (choiceState.getDefaultStateName() != null) {
                currentContext.assertStringNotEmpty(choiceState.getDefaultStateName(), PropertyNames.DEFAULT_STATE);
                assertContainsState(choiceState.getDefaultStateName());
            }

            currentContext.assertNotEmpty(choiceState.getChoices(), PropertyNames.CHOICES);
            int index = 0;
            for (Choice choice : choiceState.getChoices()) {
                ValidationContext choiceContext = currentContext.choice(index);
                validateTransition(choiceContext, choice.getTransition());
                validateCondition(choiceContext, choice.getCondition());
                index++;
            }
            return null;
        }

        private void validateCondition(ValidationContext context, Condition condition) {
            context.assertNotNull(condition, "Condition");
            if (condition instanceof BinaryCondition) {
                validateBinaryCondition(context, (BinaryCondition) condition);
            } else if (condition instanceof NAryCondition) {
                validateNAryCondition(context, (NAryCondition) condition);
            } else if (condition instanceof NotCondition) {
                validateCondition(context, ((NotCondition) condition).getCondition());
            } else if (condition != null) {
                throw new RuntimeException("Unsupported condition type: " + condition.getClass());
            }
        }

        private void validateNAryCondition(ValidationContext context, NAryCondition condition) {
            context.assertNotEmpty(condition.getConditions(), "Conditions");
            for (Condition nestedCondition : condition.getConditions()) {
                validateCondition(context, nestedCondition);
            }
        }

        private void validateBinaryCondition(ValidationContext context, BinaryCondition condition) {
            context.assertStringNotEmpty(condition.getVariable(), PropertyNames.VARIABLE);
            context.assertIsValidJsonPath(condition.getVariable(), PropertyNames.VARIABLE);
            context.assertNotNull(condition.getExpectedValue(), "ExpectedValue");
        }

        @Override
        public Void visit(FailState failState) {
            currentContext.assertStringNotEmpty(failState.getCause(), PropertyNames.CAUSE);
            return null;
        }

        @Override
        public Void visit(ParallelState parallelState) {
            currentContext.assertIsValidInputPath(parallelState.getInputPath());
            currentContext.assertIsValidOutputPath(parallelState.getOutputPath());
            currentContext.assertIsValidResultPath(parallelState.getResultPath());
            validateTransition(parallelState.getTransition());
            validateRetriers(parallelState.getRetriers());
            validateCatchers(parallelState.getCatchers());
            validateBranches(parallelState);
            return null;
        }

        private void validateBranches(ParallelState parallelState) {
            currentContext.assertNotEmpty(parallelState.getBranches(), PropertyNames.BRANCHES);
            int index = 0;
            for (Branch branch : parallelState.getBranches()) {
                ValidationContext branchContext = currentContext.branch(index);
                validateStates(branchContext, branch.getStates());
                if (!branch.getStates().containsKey(branch.getStartAt())) {
                    problemReporter.report(new Problem(branchContext, String.format("%s references a non existent state.",
                                                                                    PropertyNames.START_AT)));
                }
                index++;
            }
        }

        @Override
        public Void visit(PassState passState) {
            currentContext.assertIsValidInputPath(passState.getInputPath());
            currentContext.assertIsValidOutputPath(passState.getOutputPath());
            currentContext.assertIsValidResultPath(passState.getResultPath());
            validateTransition(passState.getTransition());
            return null;
        }

        @Override
        public Void visit(SucceedState succeedState) {
            currentContext.assertIsValidInputPath(succeedState.getInputPath());
            currentContext.assertIsValidOutputPath(succeedState.getOutputPath());
            return null;
        }

        @Override
        public Void visit(TaskState taskState) {
            currentContext.assertIsValidInputPath(taskState.getInputPath());
            currentContext.assertIsValidOutputPath(taskState.getOutputPath());
            currentContext.assertIsValidResultPath(taskState.getResultPath());
            currentContext.assertIsPositiveIfPresent(taskState.getTimeoutSeconds(), PropertyNames.TIMEOUT_SECONDS);
            currentContext.assertIsPositiveIfPresent(taskState.getHeartbeatSeconds(), PropertyNames.HEARTBEAT_SECONDS);
            if (taskState.getTimeoutSeconds() != null && taskState.getHeartbeatSeconds() != null) {
                if (taskState.getHeartbeatSeconds() >= taskState.getTimeoutSeconds()) {
                    problemReporter.report(new Problem(currentContext, String.format("%s must be smaller than %s",
                                                                                     PropertyNames.HEARTBEAT_SECONDS,
                                                                                     PropertyNames.TIMEOUT_SECONDS)));
                }
            }

            currentContext.assertStringNotEmpty(taskState.getResource(), PropertyNames.RESOURCE);
            validateRetriers(taskState.getRetriers());
            validateCatchers(taskState.getCatchers());
            validateTransition(taskState.getTransition());
            return null;
        }

        private void validateRetriers(List<Retrier> retriers) {
            boolean hasRetryAll = false;
            int index = 0;
            for (Retrier retrier : retriers) {
                ValidationContext retrierContext = currentContext.retrier(index);
                if (hasRetryAll) {
                    problemReporter.report(
                            new Problem(retrierContext,
                                        String.format("When %s is used in must be in the last Retrier", ErrorCodes.ALL)));
                }
                // MaxAttempts may be zero
                retrierContext.assertIsNotNegativeIfPresent(retrier.getMaxAttempts(), PropertyNames.MAX_ATTEMPTS);
                retrierContext.assertIsPositiveIfPresent(retrier.getIntervalSeconds(), PropertyNames.INTERVAL_SECONDS);
                if (retrier.getBackoffRate() != null && retrier.getBackoffRate() < 1.0) {
                    problemReporter.report(new Problem(retrierContext, String.format("%s must be greater than or equal to 1.0",
                                                                                     PropertyNames.BACKOFF_RATE)));
                }
                hasRetryAll = validateErrorEquals(retrierContext, retrier.getErrorEquals());
                index++;
            }
        }


        private void validateCatchers(List<Catcher> catchers) {
            boolean hasCatchAll = false;
            int index = 0;
            for (Catcher catcher : catchers) {
                ValidationContext catcherContext = currentContext.catcher(index);
                catcherContext.assertIsValidResultPath(catcher.getResultPath());
                if (hasCatchAll) {
                    problemReporter.report(
                            new Problem(catcherContext,
                                        String.format("When %s is used in must be in the last Catcher", ErrorCodes.ALL)));
                }
                validateTransition(catcherContext, catcher.getTransition());
                hasCatchAll = validateErrorEquals(catcherContext, catcher.getErrorEquals());
                index++;
            }
        }

        private boolean validateErrorEquals(ValidationContext currentContext, List<String> errorEquals) {
            currentContext.assertNotEmpty(errorEquals, PropertyNames.ERROR_EQUALS);
            if (errorEquals.contains(ErrorCodes.ALL)) {
                if (errorEquals.size() != 1) {
                    problemReporter.report(new Problem(currentContext, String.format(
                            "When %s is used in %s, it must be the only error code in the array",
                            ErrorCodes.ALL, PropertyNames.ERROR_EQUALS)));
                }
                return true;
            }
            return false;
        }

        @Override
        public Void visit(WaitState waitState) {
            currentContext.assertIsValidInputPath(waitState.getInputPath());
            currentContext.assertIsValidOutputPath(waitState.getOutputPath());
            validateTransition(waitState.getTransition());
            validateWaitFor(waitState.getWaitFor());
            return null;
        }

        private void validateWaitFor(WaitFor waitFor) {
            currentContext.assertNotNull(waitFor, "WaitFor");
            if (waitFor instanceof WaitForSeconds) {
                currentContext.assertIsPositiveIfPresent(((WaitForSeconds) waitFor).getSeconds(), PropertyNames.SECONDS);
            } else if (waitFor instanceof WaitForSecondsPath) {
                assertWaitForPath(((WaitForSecondsPath) waitFor).getSecondsPath(), PropertyNames.SECONDS_PATH);
            } else if (waitFor instanceof WaitForTimestamp) {
                currentContext.assertNotNull(((WaitForTimestamp) waitFor).getTimestamp(), PropertyNames.TIMESTAMP);
            } else if (waitFor instanceof WaitForTimestampPath) {
                assertWaitForPath(((WaitForTimestampPath) waitFor).getTimestampPath(), PropertyNames.TIMESTAMP_PATH);
            } else if (waitFor != null) {
                throw new RuntimeException("Unsupported WaitFor strategy: " + waitFor.getClass());
            }
        }

        /**
         * TimestampPath and SecondsPath must have a valid reference path.
         */
        private void assertWaitForPath(String pathValue, String propertyName) {
            currentContext.assertNotNull(pathValue, propertyName);
            currentContext.assertIsValidReferencePath(pathValue, propertyName);
        }

        private void validateTransition(Transition transition) {
            validateTransition(currentContext, transition);
        }

        private void validateTransition(ValidationContext context, Transition transition) {
            context.assertNotNull(transition, "Transition");
            if (transition instanceof NextStateTransition) {
                final String nextStateName = ((NextStateTransition) transition).getNextStateName();
                context.assertNotNull(nextStateName, PropertyNames.NEXT);
                assertContainsState(context, nextStateName);
            }
        }

        private void assertContainsState(String nextStateName) {
            assertContainsState(currentContext, nextStateName);
        }

        private void assertContainsState(ValidationContext context, String nextStateName) {
            if (!states.containsKey(nextStateName)) {
                problemReporter.report(new Problem(context, String.format("%s is not a valid state", nextStateName)));
            }
        }
    }

}
