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
package com.amazonaws.services.stepfunctions.builder.states;

import com.amazonaws.services.stepfunctions.builder.ErrorCodes;
import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Catches an error from a {@link ParallelState} or a {@link TaskState} and transitions into the specified recovery state. The
 * recovery state will receive the error output as input unless otherwise specified by a ResultPath.
 *
 * @see <a href="https://states-language.net/spec.html#errors">https://states-language.net/spec.html#errors</a>
 */
public final class Catcher {

    @JsonProperty(PropertyNames.ERROR_EQUALS)
    private final List<String> errorEquals;

    @JsonUnwrapped
    private final PathContainer pathContainer;

    @JsonUnwrapped
    private final Transition transition;

    private Catcher(Builder builder) {
        this.errorEquals = new ArrayList<String>(builder.errorEquals);
        this.pathContainer = builder.pathContainer.build();
        this.transition = builder.transition.build();
    }

    /**
     * @return List of error codes this catcher handles.
     */
    public List<String> getErrorEquals() {
        return errorEquals;
    }

    /**
     * @return JSON Path expression that can be used to combine the error output with the input to the state. If not specified the
     * result will solely consist of the error output. See <a href="https://states-language.net/spec.html#filters">https://states-language.net/spec.html#filters</a>
     * for more information.
     */
    @JsonIgnore
    public String getResultPath() {
        return pathContainer.getResultPath();
    }

    /**
     * @return The {@link Transition} that will occur if this catcher is evaluated (i.e. the error code
     * matches a code in {@link #getErrorEquals()}.
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * @return Builder instance to construct a {@link Catcher}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link Catcher}.
     */
    public static final class Builder implements Buildable<Catcher>, ResultPathBuilder<Builder> {

        @JsonProperty(PropertyNames.ERROR_EQUALS)
        private List<String> errorEquals = new ArrayList<String>();

        @JsonUnwrapped
        private final PathContainer.Builder pathContainer = PathContainer.builder();

        private Transition.Builder transition = Transition.NULL_BUILDER;

        private Builder() {
        }

        /**
         * Adds to the error codes that this catcher handles. If the catcher matches an error code then the state machine
         * transitions to the state identified by {@link #nextStateName(String)}.
         *
         * @param errorEquals New error codes to add to this catchers handled errors.
         * @return This object for method chaining.
         */
        public Builder errorEquals(String... errorEquals) {
            Collections.addAll(this.errorEquals, errorEquals);
            return this;
        }

        /**
         * Makes this catcher handle all errors. This method should not be used with {@link #errorEquals}.
         *
         * @return This object for method chaining.
         */
        public Builder catchAll() {
            this.errorEquals.clear();
            errorEquals(ErrorCodes.ALL);
            return this;
        }

        /**
         * @param resultPath JSON Path expression that can be used to combine the error output with the input to the state. If
         *                   not
         *                   specified the result will solely consist of the error output. See <a
         *                   href="https://states-language.net/spec.html#filters">https://states-language.net/spec.html#filters</a>
         *                   for more information.
         * @return This object for method chaining.
         */
        @Override
        public Builder resultPath(String resultPath) {
            pathContainer.resultPath(resultPath);
            return this;
        }

        /**
         * Sets the recovery state that this catcher should transition to if matched.
         *
         * @param nextStateName Recovery state name.
         * @return This object for method chaining.
         */
        @JsonProperty(PropertyNames.NEXT)
        private Builder nextStateName(String nextStateName) {
            return transition(NextStateTransition.builder().nextStateName(nextStateName));
        }

        /**
         * Sets the transition that will occur if this catcher is evaluated. Currently only supports transitioning to another
         * state.
         *
         * @param transition New transition.
         * @return This object for method chaining.
         */
        public Builder transition(NextStateTransition.Builder transition) {
            this.transition = transition;
            return this;
        }

        /**
         * @return An immutable {@link Catcher} object.
         */
        @Override
        public Catcher build() {
            return new Catcher(this);
        }
    }
}
