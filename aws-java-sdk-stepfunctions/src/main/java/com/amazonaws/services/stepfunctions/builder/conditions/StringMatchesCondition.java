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
 * Binary condition for String pattern matching.
 *
 * The value of the pattern MUST be a String which MAY contain one or more "*" characters. The expression yields true if the data value selected by the Variable Path matches the value, where "*" in the value matches zero or more characters. Thus, foo*.log matches foo23.log, *.log matches zebra.log, and foo*.* matches foobar.zebra. No characters other than "*" have any special meaning during matching.
 * If the character "*" needs to appear as part of the value without serving as a wildcard, it MUST be escaped with a backslash.
 * If the character "\" needs to appear as part of the value without serving as an escape character, it MUST be escaped with a backslash.
 *
 * @see <a href="https://states-language.net/spec.html#choice-state">https://states-language.net/spec.html#choice-state</a>
 * @see com.amazonaws.services.stepfunctions.builder.states.Choice
 */
public final class StringMatchesCondition implements BinaryCondition<String> {

    @JsonProperty(PropertyNames.VARIABLE)
    private final String variable;

    @JsonProperty(PropertyNames.STRING_MATCHES)
    private final String expectedValue;

    private StringMatchesCondition(Builder builder) {
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
     * @return Builder instance to construct a {@link StringMatchesCondition}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link StringMatchesCondition}.
     */
    public static final class Builder extends BinaryStringConditionBuilder {

        @JsonProperty(PropertyNames.VARIABLE)
        private String variable;

        @JsonProperty(PropertyNames.STRING_MATCHES)
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
        public Builder expectedValue(String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }

        @Override
        String type() {
            return PropertyNames.STRING_MATCHES;
        }

        /**
         * @return An immutable {@link StringMatchesCondition} object.
         */
        @Override
        public StringMatchesCondition build() {
            return new StringMatchesCondition(this);
        }

    }
}
