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

import com.amazonaws.services.stepfunctions.builder.ErrorCodes;
import com.amazonaws.services.stepfunctions.builder.internal.Buildable;
import com.amazonaws.services.stepfunctions.builder.internal.PropertyNames;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Describes retry behavior for a state. A Retrier consists of a list of error codes that the retrier applies to and parameters
 * controlling the behavior when a retry is performed.
 *
 * @see <a href="https://states-language.net/spec.html#errors">https://states-language.net/spec.html#errors</a>
 */
public final class Retrier {

    @JsonProperty(PropertyNames.ERROR_EQUALS)
    private final List<String> errorEquals;

    @JsonProperty(PropertyNames.INTERVAL_SECONDS)
    private final Integer intervalSeconds;

    @JsonProperty(PropertyNames.MAX_ATTEMPTS)
    private final Integer maxAttempts;

    @JsonProperty(PropertyNames.BACKOFF_RATE)
    private final Double backoffRate;

    private Retrier(Builder builder) {
        this.errorEquals = new ArrayList<String>(builder.errorEquals);
        this.intervalSeconds = builder.intervalSeconds;
        this.maxAttempts = builder.maxAttempts;
        this.backoffRate = builder.backoffRate;
    }

    /**
     * @return List of error codes this retrier handles.
     */
    public List<String> getErrorEquals() {
        return errorEquals;
    }

    /**
     * @return Delay before the first retry attempt.
     */
    public Integer getIntervalSeconds() {
        return intervalSeconds;
    }

    /**
     * @return Max number of retry attempts this retrier can perform.
     */
    public Integer getMaxAttempts() {
        return maxAttempts;
    }

    /**
     * @return Multiplier that increases the {@link #getIntervalSeconds()} on each attempt.
     */
    public Double getBackoffRate() {
        return backoffRate;
    }

    /**
     * @return Builder instance to construct a {@link Retrier}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for a {@link Retrier}.
     */
    public static final class Builder implements Buildable<Retrier> {

        @JsonProperty(PropertyNames.ERROR_EQUALS)
        private List<String> errorEquals = new ArrayList<String>();

        @JsonProperty(PropertyNames.INTERVAL_SECONDS)
        private Integer intervalSeconds;

        @JsonProperty(PropertyNames.MAX_ATTEMPTS)
        private Integer maxAttempts;

        @JsonProperty(PropertyNames.BACKOFF_RATE)
        private Double backoffRate;

        private Builder() {
        }

        /**
         * REQUIRED. Adds the codes to the list of error codes that this retrier handles. If the retrier matches an error code
         * then the state may be retried according to the retry parameters.
         *
         * @param errorEquals New error codes to add to this retrier's handled errors.
         * @return This object for method chaining.
         */
        public Builder errorEquals(String... errorEquals) {
            Collections.addAll(this.errorEquals, errorEquals);
            return this;
        }

        /**
         * OPTIONAL. Makes this retrier handle all errors. This method should not be used with {@link #errorEquals}.
         *
         * @return This object for method chaining.
         */
        public Builder retryOnAllErrors() {
            this.errorEquals.clear();
            errorEquals(ErrorCodes.ALL);
            return this;
        }

        /**
         * OPTIONAL. Delay before the first retry attempt. The default value is 1 second. The delay for subsequent retries will
         * be
         * computed by applying the {@link #backoffRate} multiplier to the previous delay.
         *
         * @param intervalSeconds Delay in seconds. Positive integer.
         * @return This object for method chaining.
         */
        public Builder intervalSeconds(Integer intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }

        /**
         * OPTIONAL. Max number of retry attempts this retrier can perform. The default value is 3 if not specified. <p>Note that
         * 0 is a legal value for MaxAttempts and represents that the error should not be retried.</p>
         *
         * @param maxAttempts Number of max attempts. Non-negative integer.
         * @return This object for method chaining.
         */
        public Builder maxAttempts(Integer maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }

        /**
         * OPTIONAL. Multiplier that increases the {@link #intervalSeconds(Integer)} on each attempt. The default value is 2.0.
         *
         * @param backoffRate Multiplier for {@link #intervalSeconds(Integer)}. Must be greater than or equal to 1.0.
         * @return This object for method chaining.
         */
        public Builder backoffRate(Double backoffRate) {
            this.backoffRate = backoffRate;
            return this;
        }

        /**
         * @return An immutable {@link Retrier} object.
         */
        @Override
        public Retrier build() {
            return new Retrier(this);
        }
    }
}
