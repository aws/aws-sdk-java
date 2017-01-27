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

import com.amazonaws.services.stepfunctions.builder.ErrorCodes;
import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * A Choice state adds branching logic to a state machine. A Choice state consists of a list of choices, each of which contains a
 * potential transition state and a condition that determines if that choice is evaluated, and a default state that the state
 * machine transitions to if no choice branches are matched.
 *
 * @see <a href="https://states-language.net/spec.html#choice-state>https://states-language.net/spec.html#choice-state</a>
 */
public final class ChoiceState implements State {

    @JsonProperty(PropertyNames.COMMENT)
    private final String comment;

    @JsonProperty(PropertyNames.DEFAULT_STATE)
    private final String defaultStateName;

    @JsonProperty(PropertyNames.CHOICES)
    private final List<Choice> choices;

    @JsonProperty(PropertyNames.INPUT_PATH)
    private final String inputPath;

    @JsonProperty(PropertyNames.OUTPUT_PATH)
    private final String outputPath;

    private ChoiceState(Builder builder) {
        this.comment = builder.comment;
        this.defaultStateName = builder.defaultStateName;
        this.choices = Buildable.Utils.build(builder.choices);
        this.inputPath = builder.inputPath;
        this.outputPath = builder.outputPath;
    }

    /**
     * @return Type identifier of {@link ChoiceState}.
     */
    @Override
    public String getType() {
        return "Choice";
    }

    /**
     * @return Human readable description for the state.
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return Name of state to transition to if no {@link Choice} rules match.
     */
    public String getDefaultStateName() {
        return defaultStateName;
    }

    /**
     * @return The choice rules for this state.
     */
    public List<Choice> getChoices() {
        return choices;
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
     * Choice state can never be a terminal state.
     *
     * @return False.
     */
    @Override
    public boolean isTerminalState() {
        return false;
    }

    @Override
    public <T> T accept(StateVisitor<T> visitor) {
        return visitor.visit(this);
    }

    /**
     * @return Builder instance to construct a {@link ChoiceState}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link ChoiceState}.
     */
    public static final class Builder implements State.Builder {

        @JsonProperty(PropertyNames.COMMENT)
        private String comment;

        @JsonProperty(PropertyNames.DEFAULT_STATE)
        private String defaultStateName;

        @JsonProperty(PropertyNames.CHOICES)
        private List<Choice.Builder> choices = new ArrayList<Choice.Builder>();

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
         * OPTIONAL. Name of state to transition to if no {@link Choice} rules match. If a default state is not provided and no
         * choices match then a {@link ErrorCodes#NO_CHOICE_MATCHED} error is thrown.
         *
         * @param defaultStateName Name of default state.
         * @return This object for method chaining.
         */
        public Builder defaultStateName(String defaultStateName) {
            this.defaultStateName = defaultStateName;
            return this;
        }

        /**
         * REQUIRED. Adds a new {@link Choice} rule to the {@link ChoiceState}. A {@link ChoiceState} must contain at least one
         * choice rule.
         *
         * @param choiceBuilder Instance of {@link com.amazonaws.services.stepfunctions.builder.states.Choice.Builder}. Note that
         *                      the {@link
         *                      Choice} object is not built until the {@link ChoiceState} is built so any modifications on the
         *                      state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder choice(Choice.Builder choiceBuilder) {
            this.choices.add(choiceBuilder);
            return this;
        }

        /**
         * REQUIRED. Adds the {@link Choice} rules to the {@link ChoiceState}. A {@link ChoiceState} must contain at least one
         * choice rule.
         *
         * @param choiceBuilders Instances of {@link com.amazonaws.services.stepfunctions.builder.states.Choice.Builder}. Note
         *                       that the {@link
         *                       Choice} object is not built until the {@link ChoiceState} is built so any modifications on the
         *                       state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder choices(Choice.Builder... choiceBuilders) {
            for (Choice.Builder choiceBuilder : choiceBuilders) {
                this.choices.add(choiceBuilder);
            }
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
         * @return An immutable {@link ChoiceState} object.
         */
        public ChoiceState build() {
            return new ChoiceState(this);
        }
    }

}
