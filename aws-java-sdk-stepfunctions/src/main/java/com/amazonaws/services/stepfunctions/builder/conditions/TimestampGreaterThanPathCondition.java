/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Binary condition for Timestamp greater than comparison. Dates are converted to ISO8601 UTC timestamps.
 *
 * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
 * @see com.amazonaws.services.stepfunctions.builder.states.Choice
 */
public final class TimestampGreaterThanPathCondition implements BinaryCondition<String> {

    @JsonProperty(PropertyNames.VARIABLE)
    private final String variable;

    @JsonProperty(PropertyNames.TIMESTAMP_GREATER_THAN_PATH)
    private final String expectedValue;

    private TimestampGreaterThanPathCondition(Builder builder) {
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
    public String getExpectedValue() {
        return expectedValue;
    }

    /**
     * @return Builder instance to construct a {@link TimestampGreaterThanPathCondition}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link TimestampGreaterThanPathCondition}.
     */
    public static final class Builder extends BinaryStringConditionBuilder {

        @JsonProperty(PropertyNames.VARIABLE)
        private String variable;

        @JsonProperty(PropertyNames.TIMESTAMP_GREATER_THAN_PATH)
        private String expectedValue;

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
        @Override
        public Builder expectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }

        @Override
        String type() {
            return PropertyNames.TIMESTAMP_GREATER_THAN_PATH;
        }

        /**
         * @return An immutable {@link TimestampGreaterThanPathCondition} object.
         */
        @Override
        public TimestampGreaterThanPathCondition build() {
            return new TimestampGreaterThanPathCondition(this);
        }
    }
}
