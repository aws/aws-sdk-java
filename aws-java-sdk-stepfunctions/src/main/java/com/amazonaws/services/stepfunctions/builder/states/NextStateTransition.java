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
 * Non-terminal transition to another state in the state machine.
 *
 * @see <a href="https://states-language.net/spec.html#transition">https://states-language.net/spec.html#transition</a>
 */
public final class NextStateTransition implements Transition {

    @JsonProperty(PropertyNames.NEXT)
    private final String nextStateName;

    private NextStateTransition(Builder builder) {
        this.nextStateName = builder.nextStateName;
    }

    /**
     * @return The name of the state to transition to.
     */
    public String getNextStateName() {
        return nextStateName;
    }

    @Override
    public boolean isTerminal() {
        return false;
    }

    /**
     * @return Builder instance to construct a {@link NextStateTransition}.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link NextStateTransition}
     */
    public static final class Builder implements Transition.Builder {

        private String nextStateName;

        private Builder() {
        }

        /**
         * REQUIRED. Sets the name of the state to transition to. Must be a valid state in the state machine.
         *
         * @param nextStateName State name
         * @return This object for method chaining.
         */
        public Builder nextStateName(String nextStateName) {
            this.nextStateName = nextStateName;
            return this;
        }

        /**
         * @return An immutable {@link WaitState} object.
         */
        public NextStateTransition build() {
            return new NextStateTransition(this);
        }
    }
}
