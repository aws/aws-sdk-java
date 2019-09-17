/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.handlers;

import com.amazonaws.Request;

/**
 * Contextual data for the RequestHandler2 beforeAttempt callback
 */
public final class HandlerBeforeAttemptContext {

    /**
     * The request being attempted
     */
    private final Request<?> request;

    /**
     * Default constructor for the HandlerBeforeAttemptContext object
     */
    private HandlerBeforeAttemptContext(Request<?> request) {
        this.request = request;
    }

    /**
     * @return the request that is about to be attempted
     */
    public Request<?> getRequest() {
        return request;
    }


    /**
     * @return a new builder for a HandlerBeforeAttemptContext instance
     */
    public static HandlerBeforeAttemptContextBuilder builder() {
        return new HandlerBeforeAttemptContextBuilder();
    }

    /**
     * Builder class for HandlerBeforeAttemptContext
     */
    public static class HandlerBeforeAttemptContextBuilder {

        /**
         * The request being attempted
         */
        private Request<?> request;

        /**
         * Default constructor
         */
        private HandlerBeforeAttemptContextBuilder() {}

        /**
         * Fluent set for what the request should be on the eventual HandlerBeforeAttemptContext instance
         * @param request the request that is to be attempted
         * @return the modified builder
         */
        public HandlerBeforeAttemptContextBuilder withRequest(Request<?> request) {
            this.request = request;

            return this;
        }

        /**
         * @return a new HandlerBeforeAttemptContext object
         */
        public HandlerBeforeAttemptContext build() {
            return new HandlerBeforeAttemptContext(request);
        }
    }
}
