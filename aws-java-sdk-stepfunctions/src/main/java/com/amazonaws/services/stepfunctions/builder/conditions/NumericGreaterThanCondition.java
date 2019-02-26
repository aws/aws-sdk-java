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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NumericNode;

/**
 * Binary condition for Numeric greater than comparison. Supports both integral and floating point numeric types.
 *
 * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
 * @see com.amazonaws.services.stepfunctions.builder.states.Choice
 */
public final class NumericGreaterThanCondition implements BinaryCondition<String> {

    @JsonProperty(PropertyNames.VARIABLE)
    private final String variable;

    @JsonProperty(PropertyNames.NUMERIC_GREATER_THAN)
    private final NumericNode expectedValue;

    private NumericGreaterThanCondition(Builder builder) {
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
    @JsonIgnore
    public String getExpectedValue() {
        return expectedValue.asText();
    }

    /**
     * @return Builder instance to construct a {@link NumericGreaterThanCondition}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link NumericGreaterThanCondition}.
     */
    public static final class Builder extends BinaryConditionBuilder {

        @JsonProperty(PropertyNames.VARIABLE)
        private String variable;

        @JsonProperty(PropertyNames.NUMERIC_GREATER_THAN)
        private NumericNode expectedValue;

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
        public Builder expectedValue(long expectedValue) {
            this.expectedValue = new LongNode(expectedValue);
            return this;
        }

        /**
         * Sets the expected value for this condition.
         *
         * @param expectedValue Expected value.
         * @return This object for method chaining.
         */
        public Builder expectedValue(double expectedValue) {
            this.expectedValue = new DoubleNode(expectedValue);
            return this;
        }

        @Override
        String type() {
            return PropertyNames.NUMERIC_GREATER_THAN;
        }

        @Override
        Builder expectedValue(JsonNode expectedValue) {
            // TODO handle not numeric
            this.expectedValue = (NumericNode) expectedValue;
            return this;
        }

        /**
         * @return An immutable {@link NumericGreaterThanCondition} object.
         */
        @Override
        public NumericGreaterThanCondition build() {
            return new NumericGreaterThanCondition(this);
        }
    }
}
