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
package com.amazonaws.retry.v2;

/**
 * Super interface for {@link RetryPolicy} used to define when a request should be retried.
 */
public interface RetryCondition {

    /**
     * Determine whether a request should or should not be retried.
     *
     * @param context Context about the state of the last request and information about the number of requests made.
     * @return True if the request should be retried, false if not.
     */
    boolean shouldRetry(RetryPolicyContext context);
}
