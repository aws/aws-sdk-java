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

import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.jsonToString;
import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.objectToJsonNode;
import static com.amazonaws.services.stepfunctions.builder.internal.JacksonUtils.stringToJsonNode;

import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * The Pass State simply passes its input to its output, performing no work. Pass States are useful when constructing and
 * debugging state machines.
 *
 * <p>A Pass State MAY have a field named “Result”. If present, its value is treated as the output of a virtual task, and placed
 * as prescribed by the “ResultPath” field, if any, to be passed on to the next state.</p>
 *
 * @see <a href="https://states-language.net/spec.html#pass-state">https://states-language.net/spec.html#pass-state</a>
 */
public final class PassState extends TransitionState {

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonProperty(PropertyNames.RESULT)
    private final JsonNode result;

    @JsonUnwrapped
    private final PathContainer pathContainer;

    @JsonUnwrapped
    private final Transition transition;

    private PassState(Builder builder) {
        this.comment = builder.comment;
        this.result = builder.result;
        this.pathContainer = builder.pathContainer.build();
        this.transition = builder.transition.build();
    }

    /**
     * @return Type identifier of {@link PassState}.
     */
    @Override
    public String getType() {
        return "Pass";
    }

    /**
     * @return Human readable description for the state.
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return String containing JSON document of the state's "virtual" result.
     */
    @JsonIgnore
    public String getResult() {
        return jsonToString(result);
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
     * @return The result path expression that may optionally combine or replace the state's raw input with it's result.
     */
    @JsonIgnore
    public String getResultPath() {
        return pathContainer.getResultPath();
    }

    /**
     * @return The Parameters JSON document that may optionally transform the effective input to the task.
     */
    @JsonIgnore
    public String getParameters() {
        return jsonToString(pathContainer.getParameters());
    }

    /**
     * @return The {@link Transition} for this state.
     */
    public Transition getTransition() {
        return transition;
    }

    @Override
    public <T> T accept(StateVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * @return Builder instance to construct a {@link PassState}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link PassState}.
     */
    public static final class Builder extends TransitionStateBuilder
        implements InputOutputResultPathBuilder<Builder>, ParametersBuilder<Builder> {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonProperty(PropertyNames.RESULT)
        private JsonNode result;

        @JsonUnwrapped
        private final PathContainer.Builder pathContainer = PathContainer.builder();

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

        /**
         * OPTIONAL. Sets the "virtual" result of the pass state. Must be a POJO that can be serialized into JSON.
         *
         * @param result Object that will be serialized into the JSON document representing this states result.
         * @return This object for method chaining.
         */
        public Builder result(Object result) {
            this.result = objectToJsonNode(result);
            return this;
        }

        /**
         * OPTIONAL. Sets the "virtual" result of the pass state. Must be a valid JSON document.
         *
         * @param result JSON result represented as a string.
         * @return This object for method chaining.
         */
        public Builder result(String result) {
            this.result = stringToJsonNode("Result", result);
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

        @Override
        public Builder resultPath(String resultPath) {
            pathContainer.resultPath(resultPath);
            return this;
        }

        @Override
        public Builder parameters(String parameters) {
            pathContainer.parameters(stringToJsonNode("Parameters", parameters));
            return this;
        }

        @Override
        public Builder parameters(Object parameters) {
            pathContainer.parameters(objectToJsonNode(parameters));
            return this;
        }

        /**
         * REQUIRED. Sets the transition that will occur when this state completes successfully.
         *
         * @param transition New transition.
         * @return This object for method chaining.
         */
        public Builder transition(Transition.Builder transition) {
            this.transition = transition;
            return this;
        }

        /**
         * @return An immutable {@link PassState} object.
         */
        public PassState build() {
            return new PassState(this);
        }
    }
}
