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

import com.amazonaws.services.stepfunctions.builder.conditions.Condition;
import com.amazonaws.services.stepfunctions.builder.conditions.ConditionDeserializer;
import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

/**
 * Class representing a choice rule to be included in a {@link ChoiceState}. A choice consists of a condition and a state that
 * the
 * state machine will transition to if the condition evaluates to true.
 *
 * @see <a href="https://states-language.net/spec.html#choice-state>https://states-language.net/spec.html#choice-state</a>
 */
public final class Choice {

    @JsonUnwrapped
    private final Condition condition;

    @JsonUnwrapped
    private final Transition transition;

    private Choice(Builder builder) {
        this.condition = builder.condition.build();
        this.transition = builder.transition.build();
    }

    /**
     * @return Condition for the choice rule.
     */
    public Condition getCondition() {
        return condition;
    }

    /**
     * @return The {@link Transition} that occurs when this choice is evaluated.
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * @return Builder instance to construct a {@link Choice}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link Choice}.
     */
    @JsonDeserialize(using = Choice.ChoiceDeserializer.class)
    public final static class Builder implements Buildable<Choice> {

        private Condition.Builder condition = Condition.NULL_BUILDER;
        private Transition.Builder transition = Transition.NULL_BUILDER;

        private Builder() {
        }

        /**
         * REQUIRED. Sets the condition for this choice rule.
         *
         * @param conditionBuilder Instance of {@link com.amazonaws.services.stepfunctions.builder.conditions.Condition.Builder}.
         *                         Note that the
         *                         {@link State} object is not built until the {@link Choice} is built so any modifications on
         *                         the
         *                         state builder will be reflected in this object.
         * @return This object for method chaining.
         */
        public Builder condition(Condition.Builder conditionBuilder) {
            this.condition = conditionBuilder;
            return this;
        }

        /**
         * Sets the name of the state that the state machine will transition to if the condition evaluates to true.
         *
         * @param nextStateName Name of the state.
         * @return This object for method chaining.
         */
        @JsonProperty(PropertyNames.NEXT)
        private Builder nextStateName(String nextStateName) {
            return transition(NextStateTransition.builder().nextStateName(nextStateName));
        }

        /**
         * REQUIRED. Sets the transition for this choice rule.
         *
         * @param transition Transition that occurs if the choice rule condition evaluates to true.
         * @return This object for method chaining.
         */
        public Builder transition(NextStateTransition.Builder transition) {
            this.transition = transition;
            return this;
        }

        /**
         * @return An immutable {@link Choice} object.
         */
        @Override
        public Choice build() {
            return new Choice(this);
        }
    }

    /**
     * Custom deserializer for {@link Choice.Builder}.
     */
    private static class ChoiceDeserializer extends StdDeserializer<Builder> {

        private final ConditionDeserializer conditionDeserializer = new ConditionDeserializer();

        protected ChoiceDeserializer() {
            super(Choice.class);
        }

        @Override
        public Choice.Builder deserialize(JsonParser jsonParser,
                                          DeserializationContext deserializationContext) throws IOException {
            final JsonNode node = jsonParser.getCodec().readTree(jsonParser);
            return Choice.builder()
                    .nextStateName(node.get(PropertyNames.NEXT).asText())
                    .condition(conditionDeserializer.deserializeCondition(node));
        }

    }
}
