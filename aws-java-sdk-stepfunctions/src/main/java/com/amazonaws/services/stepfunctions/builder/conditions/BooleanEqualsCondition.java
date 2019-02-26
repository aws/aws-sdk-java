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
package com.amazonaws.services.stepfunctions.builder.conditions;

import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * Binary condition for Boolean equality comparison.
 *
 * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
 * @see com.amazonaws.services.stepfunctions.builder.states.Choice
 */
public final class BooleanEqualsCondition implements BinaryCondition<Boolean> {

    @JsonProperty(PropertyNames.VARIABLE)
    private final String variable;

    @JsonProperty(PropertyNames.BOOLEAN_EQUALS)
    private final Boolean expectedValue;

    private BooleanEqualsCondition(Builder builder) {
        this.variable = builder.variable;
        this.expectedValue = builder.expectedValue;
    }

    /**
     * @return The JSONPath expression that determines which piece of the input document is used for the comparison.
     */
    @Override
    public String getVariable() {
        return variable;
    }

    /**
     * @return The expected value for this condition.
     */
    @Override
    public Boolean getExpectedValue() {
        return expectedValue;
    }

    /**
     * @return Builder instance to construct a {@link BooleanEqualsCondition}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link BooleanEqualsCondition}.
     */
    public static final class Builder extends BinaryConditionBuilder {

        @JsonProperty(PropertyNames.VARIABLE)
        private String variable;

        @JsonProperty(PropertyNames.BOOLEAN_EQUALS)
        private Boolean expectedValue;

        private Builder() {
        }

        /**
         * Sets the JSONPath expression that determines which piece of the input document is used for the comparison.
         *
         * @param variable Reference path.
         * @return This object for method chaining.
         */
        @Override
        public Builder variable(String variable) {
            this.variable = variable;
            return this;
        }

        /**
         * Sets the expected value for this condition.
         *
         * @param expectedValue Expected value.
         * @return This object for method chaining.
         */
        public Builder expectedValue(boolean expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }

        @Override
        BinaryConditionBuilder expectedValue(JsonNode expectedValue) {
            return expectedValue(expectedValue.booleanValue());
        }

        @Override
        String type() {
            return PropertyNames.BOOLEAN_EQUALS;
        }

        /**
         * @return An immutable {@link BooleanEqualsCondition} object.
         */
        @Override
        public BooleanEqualsCondition build() {
            return new BooleanEqualsCondition(this);
        }
    }
}
