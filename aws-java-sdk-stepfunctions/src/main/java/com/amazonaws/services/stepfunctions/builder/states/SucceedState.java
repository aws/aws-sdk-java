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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Succeed State terminates a state machine successfully. The Succeed State is a useful target for Choice-state branches that
 * don't do anything but terminate the machine.
 *
 * @see <a href="https://states-language.net/spec.html#succeed-state">https://states-language.net/spec.html#succeed-state</a>
 */
public final class SucceedState implements State {

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonProperty(PropertyNames.INPUT_PATH)
    private final String inputPath;

    @JsonProperty(PropertyNames.OUTPUT_PATH)
    private final String outputPath;

    private SucceedState(Builder builder) {
        this.comment = builder.comment;
        this.inputPath = builder.inputPath;
        this.outputPath = builder.outputPath;
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
    public static final class Builder implements State.Builder {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonProperty(PropertyNames.INPUT_PATH)
        private String inputPath;

        @JsonProperty(PropertyNames.OUTPUT_PATH)
        private String outputPath;

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

        /**
         * OPTIONAL. The value of “InputPath” MUST be a Path, which is applied to a State’s raw input to select some or all of
         * it;
         * that selection is used by the state. If not provided then the whole output from the previous state is used as input to
         * this state.
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
         * @return An immutable {@link SucceedState} object.
         */
        public SucceedState build() {
            return new SucceedState(this);
        }
    }
}
