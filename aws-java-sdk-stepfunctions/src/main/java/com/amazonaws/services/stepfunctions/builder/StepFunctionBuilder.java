/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.stepfunctions.builder.conditions.AndCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.BooleanEqualsCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.BooleanEqualsPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.Condition;
import com.amazonaws.services.stepfunctions.builder.conditions.IsBooleanCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.IsNullCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.IsNumericCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.IsPresentCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.IsStringCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.IsTimestampCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NotCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericEqualsCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericEqualsPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericGreaterThanCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericGreaterThanOrEqualCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericGreaterThanOrEqualPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericGreaterThanPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericLessThanCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericLessThanOrEqualCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericLessThanOrEqualPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.NumericLessThanPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.OrCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringEqualsCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringEqualsPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringGreaterThanCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringGreaterThanOrEqualCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringGreaterThanOrEqualPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringGreaterThanPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringLessThanCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringLessThanOrEqualCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringLessThanOrEqualPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringLessThanPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.StringMatchesCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampEqualsCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampEqualsPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampGreaterThanCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampGreaterThanOrEqualCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampGreaterThanOrEqualPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampGreaterThanPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampLessThanCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampLessThanOrEqualCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampLessThanOrEqualPathCondition;
import com.amazonaws.services.stepfunctions.builder.conditions.TimestampLessThanPathCondition;
import com.amazonaws.services.stepfunctions.builder.states.Branch;
import com.amazonaws.services.stepfunctions.builder.states.Iterator;
import com.amazonaws.services.stepfunctions.builder.states.Catcher;
import com.amazonaws.services.stepfunctions.builder.states.Choice;
import com.amazonaws.services.stepfunctions.builder.states.ChoiceState;
import com.amazonaws.services.stepfunctions.builder.states.EndTransition;
import com.amazonaws.services.stepfunctions.builder.states.FailState;
import com.amazonaws.services.stepfunctions.builder.states.NextStateTransition;
import com.amazonaws.services.stepfunctions.builder.states.ParallelState;
import com.amazonaws.services.stepfunctions.builder.states.MapState;
import com.amazonaws.services.stepfunctions.builder.states.PassState;
import com.amazonaws.services.stepfunctions.builder.states.Retrier;
import com.amazonaws.services.stepfunctions.builder.states.SucceedState;
import com.amazonaws.services.stepfunctions.builder.states.TaskState;
import com.amazonaws.services.stepfunctions.builder.states.Transition;
import com.amazonaws.services.stepfunctions.builder.states.WaitFor;
import com.amazonaws.services.stepfunctions.builder.states.WaitForSeconds;
import com.amazonaws.services.stepfunctions.builder.states.WaitForSecondsPath;
import com.amazonaws.services.stepfunctions.builder.states.WaitForTimestamp;
import com.amazonaws.services.stepfunctions.builder.states.WaitForTimestampPath;
import com.amazonaws.services.stepfunctions.builder.states.WaitState;

import java.util.Date;

/**
 * Fluent API for creating a {@link StateMachine} object.
 */
public final class StepFunctionBuilder {

    private StepFunctionBuilder() {
    }

    /**
     * Represents a StepFunctions state machine. A state machine must have at least one state.
     *
     * @return Builder used to configure a {@link StateMachine}.
     * @see <a href="https://states-language.net/spec.html#toplevelfields">https://states-language.net/spec.html#toplevelfields</a>
     */
    public static StateMachine.Builder stateMachine() {
        return StateMachine.builder();
    }

    /**
     * State that allows for parallel execution of {@link Branch}s. A Parallel state causes the interpreter to execute each
     * branch starting with the state named in its “StartAt” field, as concurrently as possible, and wait until each branch
     * terminates
     * (reaches a terminal state) before processing the Parallel state's “Next” field.
     *
     * @return Builder used to configure a {@link ParallelState}.
     * @see <a href="https://states-language.net/spec.html#parallel-state">https://states-language.net/spec.html#parallel-state</a>
     */
    public static ParallelState.Builder parallelState() {
        return ParallelState.builder();
    }

    /**
     * A single branch of parallel execution in a state machine. See {@link ParallelState}.
     *
     * @return Builder used to configure a {@link Branch}.
     */
    public static Branch.Builder branch() {
        return Branch.builder();
    }

    /**
     * State that allows for applying the same {@link Iterator} to multiple input elements.
     * The Map State (identified by "Type": "Map") causes the interpreter to process all the elements of an array,
     * potentially in parallel, with the processing of each element independent of the others.
     *
     * @return Builder used to configure a {@link MapState}.
     * @see <a href="https://states-language.net/spec.html#map-state">https://states-language.net/spec.html#map-state</a>
     */
    public static MapState.Builder mapState() {
        return MapState.builder();
    }

    /**
     * An iterator to apply against a list of inputs. See {@link MapState}.
     *
     * @return Builder used to configure a {@link Iterator}.
     */
    public static Iterator.Builder iterator() {
        return Iterator.builder();
    }

    /**
     * The Pass State simply passes its input to its output, performing no work. Pass States are useful when constructing and
     * debugging state machines.
     *
     * <p>A Pass State MAY have a field named “Result”. If present, its value is treated as the output of a virtual task, and
     * placed as prescribed by the “ResultPath” field, if any, to be passed on to the next state.</p>
     *
     * @return Builder used to configure a {@link PassState}.
     * @see <a href="https://states-language.net/spec.html#pass-state">https://states-language.net/spec.html#pass-state</a>
     */
    public static PassState.Builder passState() {
        return PassState.builder();
    }

    /**
     * The Succeed State terminates a state machine successfully. The Succeed State is a useful target for Choice-state branches
     * that don't do anything but terminate the machine.
     *
     * @return Builder used to configure a {@link SucceedState}.
     * @see <a href="https://states-language.net/spec.html#succeed-state">https://states-language.net/spec.html#succeed-state</a>
     */
    public static SucceedState.Builder succeedState() {
        return SucceedState.builder();
    }

    /**
     * Terminal state that terminates the state machine and marks it as a failure.
     *
     * @return Builder used to configure a {@link FailState}.
     * @see <a href="https://states-language.net/spec.html#fail-state">https://states-language.net/spec.html#fail-state</a>
     */
    public static FailState.Builder failState() {
        return FailState.builder();
    }

    /**
     * A Wait state causes the interpreter to delay the machine from continuing for a specified time. The time can be specified
     * as a wait duration, specified in seconds, or an absolute expiry time, specified as an ISO-8601 extended offset date-time
     * format string.
     *
     * @return Builder used to configure a {@link WaitState}.
     * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
     */
    public static WaitState.Builder waitState() {
        return WaitState.builder();
    }

    /**
     * The Task State causes the interpreter to execute the work identified by the state’s “Resource” field.
     *
     * <p>Currently allowed resources include Lambda functions and States activities.</p>
     *
     * @return Builder used to configure a {@link TaskState}.
     * @see <a href="https://states-language.net/spec.html#task-state">https://states-language.net/spec.html#task-state</a>
     */
    public static TaskState.Builder taskState() {
        return TaskState.builder();
    }

    /**
     * A Choice state adds branching logic to a state machine. A Choice state consists of a list of choices, each of which
     * contains a potential transition state and a condition that determines if that choice is evaluated, and a default state
     * that the state machine transitions to if no choice branches are matched.
     *
     * @return Builder used to configure a {@link ChoiceState}.
     * @see <a href="https://states-language.net/spec.html#choice-state>https://states-language.net/spec.html#choice-state</a>
     */
    public static ChoiceState.Builder choiceState() {
        return ChoiceState.builder();
    }

    /**
     * Class representing a choice rule to be included in a {@link ChoiceState}. A choice consists of a condition and a state
     * that the state machine will transition to if the condition evaluates to true.
     *
     * @return Builder used to configure a {@link Choice}.
     * @see <a href="https://states-language.net/spec.html#choice-state>https://states-language.net/spec.html#choice-state</a>
     */
    public static Choice.Builder choice() {
        return Choice.builder();
    }

    /**
     * Describes retry behavior for a state. A Retrier consists of a list of error codes that the retrier applies to and
     * parameters controlling the behavior when a retry is performed.
     *
     * @return Builder used to configure a {@link Retrier}.
     * @see <a href="https://states-language.net/spec.html#errors">https://states-language.net/spec.html#errors</a>
     */
    public static Retrier.Builder retrier() {
        return Retrier.builder();
    }

    /**
     * Catches an error from a {@link ParallelState} or a {@link TaskState} and transitions into the specified recovery state.
     * The
     * recovery state will receive the error output as input unless otherwise specified by a ResultPath.
     *
     * @return Builder used to configure a {@link Catcher}.
     * @see <a href="https://states-language.net/spec.html#errors">https://states-language.net/spec.html#errors</a>
     */
    public static Catcher.Builder catcher() {
        return Catcher.builder();
    }

    /**
     * Binary condition for String equality comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringEqualsCondition.Builder eq(String variable, String expectedValue) {
        return StringEqualsCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric equality comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericEqualsCondition.Builder eq(String variable, long expectedValue) {
        return NumericEqualsCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric equality comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericEqualsCondition.Builder eq(String variable, double expectedValue) {
        return NumericEqualsCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Boolean equality comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static BooleanEqualsCondition.Builder eq(String variable, boolean expectedValue) {
        return BooleanEqualsCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Timestamp equality comparison. Dates are converted to ISO8601 UTC timestamps.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampEqualsCondition.Builder eq(String variable, Date expectedValue) {
        return TimestampEqualsCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for String greater than comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringGreaterThanCondition.Builder gt(String variable, String expectedValue) {
        return StringGreaterThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric greater than comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericGreaterThanCondition.Builder gt(String variable, long expectedValue) {
        return NumericGreaterThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric greater than comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericGreaterThanCondition.Builder gt(String variable, double expectedValue) {
        return NumericGreaterThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Timestamp greater than comparison. Dates are converted to ISO8601 UTC timestamps.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampGreaterThanCondition.Builder gt(String variable, Date expectedValue) {
        return TimestampGreaterThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for String greater than or equal to comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringGreaterThanOrEqualCondition.Builder gte(String variable, String expectedValue) {
        return StringGreaterThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric greater than comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericGreaterThanOrEqualCondition.Builder gte(String variable, long expectedValue) {
        return NumericGreaterThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric greater than comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericGreaterThanOrEqualCondition.Builder gte(String variable, double expectedValue) {
        return NumericGreaterThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Timestamp greater than or equal to comparison. Dates are converted to ISO8601 UTC timestamps.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampGreaterThanOrEqualCondition.Builder gte(String variable, Date expectedValue) {
        return TimestampGreaterThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for String less than comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringLessThanCondition.Builder lt(String variable, String expectedValue) {
        return StringLessThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric less than comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericLessThanCondition.Builder lt(String variable, long expectedValue) {
        return NumericLessThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric less than comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericLessThanCondition.Builder lt(String variable, double expectedValue) {
        return NumericLessThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Timestamp less than comparison. Dates are converted to ISO8601 UTC timestamps.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampLessThanCondition.Builder lt(String variable, Date expectedValue) {
        return TimestampLessThanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for String less than or equal to comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringLessThanOrEqualCondition.Builder lte(String variable, String expectedValue) {
        return StringLessThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric less than or equal to comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericLessThanOrEqualCondition.Builder lte(String variable, long expectedValue) {
        return NumericLessThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Numeric less than or equal to comparison. Supports both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericLessThanOrEqualCondition.Builder lte(String variable, double expectedValue) {
        return NumericLessThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Timestamp less than or equal to comparison. Dates are converted to ISO8601 UTC timestamps.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue The expected value for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampLessThanOrEqualCondition.Builder lte(String variable, Date expectedValue) {
        return TimestampLessThanOrEqualCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Null type comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue Whether or not the variable is a Null value.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static IsNullCondition.Builder isNull(String variable, Boolean expectedValue) {
        return IsNullCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for checking the existence of the key.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue Whether or not the JSONPath expression points to a valid key in the input document.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static IsPresentCondition.Builder isPresent(String variable, Boolean expectedValue) {
        return IsPresentCondition.builder().variable(variable).expectedValue(expectedValue);
    }


    /**
     * Binary condition for Numeric type comparison. Checks for both integral and floating point numeric types.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue Whether or not the variable is a Null value.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static IsNumericCondition.Builder isNumber(String variable, Boolean expectedValue) {
        return IsNumericCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Timestamp type comparison. Checks that Date is ISO8601 UTC timestamp format.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue Whether or not the variable is a Null value.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static IsTimestampCondition.Builder isTimestamp(String variable, Boolean expectedValue) {
        return IsTimestampCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Boolean type comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue Whether or not the variable is a Null value.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static IsBooleanCondition.Builder isBoolean(String variable, Boolean expectedValue) {
        return IsBooleanCondition.builder().variable(variable).expectedValue(expectedValue);
    }

    /**
     * Binary condition for Boolean type comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param pattern       The pattern to match the input against.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringMatchesCondition.Builder patternMatch(String variable, String pattern) {
        return StringMatchesCondition.builder().variable(variable).expectedValue(pattern);
    }


    /**
     * Binary condition for String type comparison.
     *
     * @param variable      The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param expectedValue Whether or not the variable is a Null value.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static IsStringCondition.Builder isString(String variable, Boolean expectedValue) {
        return IsStringCondition.builder().variable(variable).expectedValue(expectedValue);
    }


    /**
     * Represents the logical NOT of a single condition. May be used in a {@link com.amazonaws.services.stepfunctions.builder.states.ChoiceState}.
     *
     * @param conditionBuilder The condition to be negated. May be another composite condition or a simple condition.
     * @return Builder used to configure a {@link NotCondition}.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     */
    public static NotCondition.Builder not(Condition.Builder conditionBuilder) {
        return NotCondition.builder().condition(conditionBuilder);
    }

    /**
     * Represents the logical AND of multiple conditions. May be used in a {@link com.amazonaws.services.stepfunctions.builder.states.ChoiceState}.
     *
     * @param conditionBuilders The conditions to AND together. May be another composite condition or a simple condition.
     * @return Builder used to configure a {@link AndCondition}.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     */
    public static AndCondition.Builder and(Condition.Builder... conditionBuilders) {
        return AndCondition.builder().conditions(conditionBuilders);
    }

    /**
     * Represents the logical OR of multiple conditions. May be used in a {@link com.amazonaws.services.stepfunctions.builder.states.ChoiceState}.
     *
     * @param conditionBuilders The conditions to OR together. May be another composite condition or a simple condition.
     * @return Builder used to configure a {@link OrCondition}.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     */
    public static OrCondition.Builder or(Condition.Builder... conditionBuilders) {
        return OrCondition.builder().conditions(conditionBuilders);
    }

    /**
     * A transition to another state in the state machine.
     *
     * @param nextStateName Name of state to transition to.
     * @return Transition to another state in the state machine.
     * @see <a href="https://states-language.net/spec.html#transition">https://states-language.net/spec.html#transition</a>
     */
    public static NextStateTransition.Builder next(String nextStateName) {
        return NextStateTransition.builder().nextStateName(nextStateName);
    }

    /**
     * Transition indicating the state machine should terminate execution.
     *
     * @return EndTransition
     * @see <a href="https://states-language.net/spec.html#transition">https://states-language.net/spec.html#transition</a>
     */
    public static Transition.Builder end() {
        return EndTransition.builder();
    }

    /**
     * {@link WaitFor} that can be used in a {@link WaitState}. Instructs the {@link WaitState} to wait for the
     * given number of seconds.
     *
     * @param seconds Number of seconds to wait. Must be positive.
     * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
     */
    public static WaitFor.Builder seconds(int seconds) {
        return WaitForSeconds.builder().seconds(seconds);
    }

    /**
     * {@link WaitFor} that can be used in a {@link WaitState}. Instructs the {@link WaitState} to wait for the
     * number of seconds specified at the reference path in the input to the state.
     *
     * @param secondsPath Reference path to the location in the input data containing the number of seconds to wait.
     * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
     */
    public static WaitFor.Builder secondsPath(String secondsPath) {
        return WaitForSecondsPath.builder().secondsPath(secondsPath);
    }

    /**
     * {@link WaitFor} that can be used in a {@link WaitState}. Instructs the {@link WaitState} to wait until
     * the given timestamp.
     *
     * @param timestamp Date to wait until before proceeding.
     * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
     */
    public static WaitFor.Builder timestamp(Date timestamp) {
        return WaitForTimestamp.builder().timestamp(timestamp);
    }

    /**
     * {@link WaitFor} that can be used in a {@link WaitState}. Instructs the {@link WaitState} to wait until
     * the date specified at the reference path in the input to the state.
     *
     * @param timestampPath Reference path to the location in the input data containing the date to wait until.
     * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
     */
    public static WaitFor.Builder timestampPath(String timestampPath) {
        return WaitForTimestampPath.builder().timestampPath(timestampPath);
    }

    /**
     * Binary condition for String equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected string for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringEqualsPathCondition.Builder eqString(String variable, String path) {
        return StringEqualsPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Numeric equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected number for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericEqualsPathCondition.Builder eqNumeric(String variable, String path) {
        return NumericEqualsPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Timestamp equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected timestamp for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampEqualsPathCondition.Builder eqTimestamp(String variable, String path) {
        return TimestampEqualsPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Boolean equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected boolean for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static BooleanEqualsPathCondition.Builder eqBoolean(String variable, String path) {
        return BooleanEqualsPathCondition.builder().variable(variable).expectedValue(path);
    }


    /**
     * Binary condition for String equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected string for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringGreaterThanPathCondition.Builder gtString(String variable, String path) {
        return StringGreaterThanPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Numeric equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected number for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericGreaterThanPathCondition.Builder gtNumeric(String variable, String path) {
        return NumericGreaterThanPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Timestamp equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected timestamp for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampGreaterThanPathCondition.Builder gtTimestamp(String variable, String path) {
        return TimestampGreaterThanPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for String equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected string for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringGreaterThanOrEqualPathCondition.Builder gteString(String variable, String path) {
        return StringGreaterThanOrEqualPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Numeric equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected number for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericGreaterThanOrEqualPathCondition.Builder gteNumeric(String variable, String path) {
        return NumericGreaterThanOrEqualPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Timestamp equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected timestamp for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampGreaterThanOrEqualPathCondition.Builder gteTimestamp(String variable, String path) {
        return TimestampGreaterThanOrEqualPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for String equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected string for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringLessThanPathCondition.Builder ltString(String variable, String path) {
        return StringLessThanPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Numeric equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected number for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericLessThanPathCondition.Builder ltNumeric(String variable, String path) {
        return NumericLessThanPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Timestamp equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected timestamp for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampLessThanPathCondition.Builder ltTimestamp(String variable, String path) {
        return TimestampLessThanPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for String equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected string for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static StringLessThanOrEqualPathCondition.Builder lteString(String variable, String path) {
        return StringLessThanOrEqualPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Numeric equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected number for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static NumericLessThanOrEqualPathCondition.Builder lteNumeric(String variable, String path) {
        return NumericLessThanOrEqualPathCondition.builder().variable(variable).expectedValue(path);
    }

    /**
     * Binary condition for Timestamp equality comparison.
     *
     * @param variable The JSONPath expression that determines which piece of the input document is used for the comparison.
     * @param path Reference path to the location in the input data containing the expected timestamp for this condition.
     * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
     * @see com.amazonaws.services.stepfunctions.builder.states.Choice
     */
    public static TimestampLessThanOrEqualPathCondition.Builder lteTimestamp(String variable, String path) {
        return TimestampLessThanOrEqualPathCondition.builder().variable(variable).expectedValue(path);
    }
}
