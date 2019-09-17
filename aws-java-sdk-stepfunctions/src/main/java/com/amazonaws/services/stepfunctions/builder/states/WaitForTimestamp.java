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

import java.util.Date;

/**
 * {@link WaitFor} implementation that can be used in a {@link WaitState}. Corresponds to the "{@value
 * com.amazonaws.services.stepfunctions.builder.internal.PropertyNames#TIMESTAMP}" field in the JSON document.
 *
 * @see <a href="https://states-language.net/spec.html#wait-state">https://states-language.net/spec.html#wait-state</a>
 */
public final class WaitForTimestamp implements WaitFor {

    @JsonProperty(PropertyNames.TIMESTAMP)
    private final Date timestamp;

    private WaitForTimestamp(Builder builder) {
        this.timestamp = builder.timestamp == null ? null : new Date(builder.timestamp.getTime());
    }

    /**
     * @return The date that the {@link WaitState} should wait until before proceeding.
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * @return Builder instance to construct a {@link WaitForTimestamp}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link WaitForTimestamp}.
     */
    public static final class Builder implements WaitFor.Builder {

        private Date timestamp;

        private Builder() {
        }

        /**
         * REQUIRED. Sets the date that this state should wait until before proceeding.
         *
         * @param timestamp Date to wait until.
         * @return This object for method chaining.
         */
        public Builder timestamp(Date timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * @return An immutable {@link WaitForTimestamp} object.
         */
        public WaitForTimestamp build() {
            return new WaitForTimestamp(this);
        }
    }
}
