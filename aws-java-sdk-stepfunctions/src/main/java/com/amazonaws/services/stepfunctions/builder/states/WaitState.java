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
package com.amazonaws.services.stepfunctions.builder.states;

import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.Date;

/**
 * A Wait state causes the interpreter to delay the machine from continuing for a specified time. The time can be specified as a
 * wait duration, specified in seconds, or an absolute expiry time, specified as an ISO-8601 extended offset date-time format
 * string.
 *
 * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
 */
public final class WaitState extends TransitionState {

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonUnwrapped
    private final WaitFor waitFor;

    @JsonProperty(PropertyNames.INPUT_PATH)
    private final String inputPath;

    @JsonProperty(PropertyNames.OUTPUT_PATH)
    private final String outputPath;

    @JsonUnwrapped
    private final Transition transition;

    @JsonCreator
    private WaitState(Builder builder) {
        this.comment = builder.comment;
        this.waitFor = builder.waitFor.build();
        this.inputPath = builder.inputPath;
        this.outputPath = builder.outputPath;
        this.transition = builder.transition.build();
    }

    @Override
    public String getType() {
        return "Wait";
    }

    /**
     * @return Human readable description for the state.
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return The implementation of {@link WaitFor} that indicates how long this state should wait.
     */
    public WaitFor getWaitFor() {
        return waitFor;
    }

    /**
     * @return The input path expression that may optionally transform the input to this state.
     */
    public String getInputPath() {
        return inputPath;
    }

    /**
     * @return The output path expression that may optionally transform the output to this state.
     */
    public String getOutputPath() {
        return outputPath;
    }

    /**
     * @return The transition that will occur when the wait is completed.
     */
    public Transition getTransition() {
        return transition;
    }

    @Override
    public <T> T accept(StateVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * @return Builder instance to construct a {@link WaitState}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link WaitState}.
     */
    public static final class Builder extends TransitionStateBuilder {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        private WaitFor.Builder waitFor = WaitFor.NULL_BUILDER;

        @JsonProperty(PropertyNames.INPUT_PATH)
        private String inputPath;

        @JsonProperty(PropertyNames.OUTPUT_PATH)
        private String outputPath;

        @JsonProperty
        private Transition.Builder transition = Transition.NULL_BUILDER;

        private Builder() {
        }

        /**
         * OPTIONAL. Human readable description for the state.
         *
         * @param comment New comment.
         * @return This object for method chaining.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        // Needed for deserialization
        @JsonProperty(PropertyNames.SECONDS)
        private Builder seconds(Integer seconds) {
            return waitFor(WaitForSeconds.builder().seconds(seconds));
        }

        // Needed for deserialization
        @JsonProperty(PropertyNames.TIMESTAMP)
        private Builder timestamp(Date timestamp) {
            return waitFor(WaitForTimestamp.builder().timestamp(timestamp));
        }

        // Needed for deserialization
        @JsonProperty(PropertyNames.TIMESTAMP_PATH)
        private Builder timestampPath(String timestampPath) {
            return waitFor(WaitForTimestampPath.builder().timestampPath(timestampPath));
        }

        // Needed for deserialization
        @JsonProperty(PropertyNames.SECONDS_PATH)
        private Builder secondsPath(String secondsPath) {
            return waitFor(WaitForSecondsPath.builder().secondsPath(secondsPath));
        }

        /**
         * REQUIRED. Implementation of {@link WaitFor} that indicates how long the state should wait before proceeding.
         *
         * @param waitFor Implementation of {@link WaitFor}
         * @return This object for method chaining.
         */
        public Builder waitFor(WaitFor.Builder waitFor) {
            this.waitFor = waitFor;
            return this;
        }

        /**
         * OPTIONAL. The value of “InputPath” MUST be a Path, which is applied to the previous State’s output to select some or
         * all of it to form the input for this state. If not provided then the whole output from the previous state is used as
         * input to this state.
         *
         * @param inputPath New path value.
         * @return This object for method chaining.
         */
        public Builder inputPath(String inputPath) {
            this.inputPath = inputPath;
            return this;
        }

        /**
         * OPTIONAL. The value of “OutputPath” MUST be a path, which is applied to the state’s output after the application of
         * ResultPath, leading in the generation of the raw input for the next state. If not provided then the whole output is
         * used.
         *
         * @param outputPath New path value.
         * @return This object for method chaining.
         */
        public Builder outputPath(String outputPath) {
            this.outputPath = outputPath;
            return this;
        }

        /**
         * REQUIRED. Sets the transition that will occur when the wait is completed.
         *
         * @param transition New transition.
         * @return This object for method chaining.
         */
        @Override
        public Builder transition(Transition.Builder transition) {
            this.transition = transition;
            return this;
        }

        /**
         * @return An immutable {@link WaitState} object.
         */
        public WaitState build() {
            return new WaitState(this);
        }
    }
}
