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
 * PropertyNames#SECONDS_PATH}" field in the JSON document.
 *
 * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
 */
public final class WaitForSecondsPath implements WaitFor {

    @JsonProperty(PropertyNames.SECONDS_PATH)
    private final String secondsPath;

    private WaitForSecondsPath(Builder builder) {
        this.secondsPath = builder.secondsPath;
    }

    /**
     * @return The path to data in the input to this state indicating the number of seconds to wait for.
     */
    public String getSecondsPath() {
        return secondsPath;
    }

    /**
     * @return Builder instance to construct a {@link WaitForSecondsPath}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link WaitForSecondsPath}.
     */
    public static final class Builder implements WaitFor.Builder {

        private String secondsPath;

        private Builder() {
        }

        /**
         * REQUIRED. Sets the path to a number in the input to this state representing
         * the number of seconds to wait.
         *
         * @param secondsPath Reference path to seconds in the input.
         * @return This object for method chaining.
         */
        public Builder secondsPath(String secondsPath) {
            this.secondsPath = secondsPath;
            return this;
        }

        /**
         * @return An immutable {@link WaitForSecondsPath} object.
         */
        public WaitForSecondsPath build() {
            return new WaitForSecondsPath(this);
        }
    }
}
