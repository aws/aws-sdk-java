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

import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @JsonUnwrapped
    private final PathContainer pathContainer;

    @JsonUnwrapped
    private final Transition transition;

    @JsonCreator
    private WaitState(Builder builder) {
        this.comment = builder.comment;
        this.waitFor = builder.waitFor.build();
        this.pathContainer = builder.pathContainer.build();
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
    @JsonIgnore
    public String getInputPath() {
        return pathContainer.getInputPath();
    }

    /**
     * @return The output path expression that may optionally transform the output to this state.
     */
    @JsonIgnore
    public String getOutputPath() {
        return pathContainer.getOutputPath();
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
    public static final class Builder extends TransitionStateBuilder implements InputOutputPathBuilder<Builder> {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        private WaitFor.Builder waitFor = WaitFor.NULL_BUILDER;

        @JsonUnwrapped
        private final PathContainer.Builder pathContainer = PathContainer.builder();

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

        @Override
        public Builder inputPath(String inputPath) {
            pathContainer.inputPath(inputPath);
            return this;
        }

        @Override
        public Builder outputPath(String outputPath) {
            pathContainer.outputPath(outputPath);
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
