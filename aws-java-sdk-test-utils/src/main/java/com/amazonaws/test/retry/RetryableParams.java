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
package com.amazonaws.test.retry;

/**
 * Parameters for {@link RetryableAssertion}.
 */
public class RetryableParams {

    private final int maxAttempts;
    private final int delayInMs;

    public RetryableParams() {
        this.maxAttempts = 0;
        this.delayInMs = 0;
    }

    private RetryableParams(int maxAttempts, int delayInMs) {
        this.maxAttempts = maxAttempts;
        this.delayInMs = delayInMs;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public RetryableParams withMaxAttempts(int maxAttempts) {
        return new RetryableParams(maxAttempts, this.delayInMs);
    }

    public int getDelayInMs() {
        return delayInMs;
    }

    public RetryableParams withDelayInMs(int delayInMs) {
        return new RetryableParams(this.maxAttempts, delayInMs);
    }

}
