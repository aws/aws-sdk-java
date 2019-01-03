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

import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A single branch of parallel execution in a state machine. See {@link ParallelState}.
 *
 * @see <a href="https://states-language.net/spec.html#parallel-state">https://states-language.net/spec.html#parallel-state</a>
 */
public final class Branch {

    @JsonProperty(PropertyNames.START_AT)
    private final String startAt;

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonProperty(PropertyNames.STATES)
    private final Map<String, State> states;

    private Branch(Builder builder) {
        this.startAt = builder.startAt;
        this.comment = builder.comment;
        this.states = Buildable.Utils.build(builder.stateBuilders);
    }


    /**
     * @return Name of the state to start branch execution at.
     */
    public String getStartAt() {
        return startAt;
    }

    /**
     * @return Human readable description for the state machine.
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return The states for this branch.
     */
    public Map<String, State> getStates() {
        return states;
    }

    /**
     * @return Builder instance to construct a {@link Branch}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link Branch}.
     */
    public static final class Builder implements Buildable<Branch> {

        @JsonProperty(PropertyNames.START_AT)
        private String startAt;

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonProperty(PropertyNames.STATES)
        private Map<String, State.Builder> stateBuilders = new LinkedHashMap<String, State.Builder>();

        private Builder() {
        }

        /**
         * REQUIRED. Name of the state to start branch execution at. Must match a state name provided via {@link #state(String,
         * State.Builder)}.
         *
         * @param startAt Name of starting state.
         * @return This object for method chaining.
         */
        public Builder startAt(String startAt) {
            this.startAt = startAt;
            return this;
        }

        /**
         * OPTIONAL. Human readable description for the state machine.
         *
         * @param comment New comment.
         * @return This object for method chaining.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * REQUIRED. Adds a new state to the branch. A branch MUST have at least one state.
         *
         * @param stateName    Name of the state
         * @param stateBuilder Instance of {@link com.amazonaws.services.stepfunctions.builder.states.State.Builder}. Note that
         *                     the {@link State}
         *                     object is not built until the {@link Branch} is built so any modifications on the state builder
         *                     will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder state(String stateName, State.Builder stateBuilder) {
            this.stateBuilders.put(stateName, stateBuilder);
            return this;
        }

        /**
         * @return An immutable {@link Branch} object.
         */
        @Override
        public Branch build() {
            return new Branch(this);
        }
    }

}
