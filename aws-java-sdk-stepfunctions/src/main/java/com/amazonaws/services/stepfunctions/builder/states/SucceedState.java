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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * The Succeed State terminates a state machine successfully. The Succeed State is a useful target for Choice-state branches that
 * don't do anything but terminate the machine.
 *
 * @see <a href="https://states-language.net/spec.html#succeed-state">https://states-language.net/spec.html#succeed-state</a>
 */
public final class SucceedState implements State {

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonUnwrapped
    private final PathContainer pathContainer;

    private SucceedState(Builder builder) {
        this.comment = builder.comment;
        this.pathContainer = builder.pathContainer.build();
    }

    /**
     * @return Type identifier of {@link SucceedState}.
     */
    @Override
    public String getType() {
        return "Succeed";
    }

    /**
     * @return Human readable description for the state.
     */
    public String getComment() {
        return comment;
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
     * {@link SucceedState} is always a terminal state.
     *
     * @return True.
     */
    @Override
    public boolean isTerminalState() {
        return true;
    }

    @Override
    public <T> T accept(StateVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * @return Builder instance to construct a {@link SucceedState}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link SucceedState}.
     */
    public static final class Builder implements State.Builder, InputOutputPathBuilder<Builder> {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonUnwrapped
        private final PathContainer.Builder pathContainer = PathContainer.builder();

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
         * @return An immutable {@link SucceedState} object.
         */
        public SucceedState build() {
            return new SucceedState(this);
        }
    }
}
