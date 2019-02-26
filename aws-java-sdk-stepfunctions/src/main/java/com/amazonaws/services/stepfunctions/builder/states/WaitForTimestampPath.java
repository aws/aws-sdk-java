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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link WaitFor} implementation that can be used in a {@link WaitState}. Corresponds to the "{@value
 * PropertyNames#TIMESTAMP_PATH}" field in the JSON document.
 *
 * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
 */
public final class WaitForTimestampPath implements WaitFor {

    @JsonProperty(PropertyNames.TIMESTAMP_PATH)
    private final String timestampPath;

    private WaitForTimestampPath(Builder builder) {
        this.timestampPath = builder.timestampPath;
    }

    /**
     * @return The path to a date in the input to this state.
     */
    public String getTimestampPath() {
        return timestampPath;
    }

    /**
     * @return Builder instance to construct a {@link WaitForTimestampPath}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link WaitForTimestampPath}.
     */
    public static final class Builder implements WaitFor.Builder {

        private String timestampPath;

        private Builder() {
        }

        /**
         * REQUIRED. Sets the path to a date in the input to this state. The {@link WaitState} will wait until the date specified
         * in the input. Date in input must be in the format described
         * <a href="https://states-language.net/spec.html#timestamps">here</a>.
         *
         * @param timestampPath Reference path to date in the input.
         * @return This object for method chaining.
         */
        public Builder timestampPath(String timestampPath) {
            this.timestampPath = timestampPath;
            return this;
        }

        /**
         * @return An immutable {@link WaitForTimestampPath} object.
         */
        public WaitForTimestampPath build() {
            return new WaitForTimestampPath(this);
        }
    }
}
