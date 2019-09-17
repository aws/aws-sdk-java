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
 * com.amazonaws.services.stepfunctions.builder.internal.PropertyNames#SECONDS}" field in the JSON document.
 *
 * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
 */
public final class WaitForSeconds implements WaitFor {

    @JsonProperty(PropertyNames.SECONDS)
    private final int seconds;

    private WaitForSeconds(Builder builder) {
        this.seconds = builder.seconds;
    }

    /**
     * @return The number of seconds the {@link WaitState} will wait for.
     */
    public int getSeconds() {
        return seconds;
    }

    /**
     * @return Builder instance to construct a {@link WaitForSeconds}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link WaitForSeconds}.
     */
    public static final class Builder implements WaitFor.Builder {

        private int seconds;

        private Builder() {
        }

        /**
         * REQUIRED. Sets the number of seconds the {@link WaitState} will wait for.
         *
         * @param seconds Number of seconds. Must be positive.
         * @return This object for method chaining.
         */
        public Builder seconds(int seconds) {
            this.seconds = seconds;
            return this;
        }

        /**
         * @return An immutable {@link WaitForSeconds} object.
         */
        public WaitForSeconds build() {
            return new WaitForSeconds(this);
        }
    }

}
