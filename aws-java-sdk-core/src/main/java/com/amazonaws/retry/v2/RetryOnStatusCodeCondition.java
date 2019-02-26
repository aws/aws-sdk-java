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

import java.util.ArrayList;
import java.util.List;

import static com.amazonaws.util.ValidationUtils.assertNotNull;

/**
 * Retry condition implementation that retries if the HTTP status code matches one of the provided status codes.
 */
public class RetryOnStatusCodeCondition implements RetryCondition {

    private final List<Integer> statusCodesToRetryOn;

    public RetryOnStatusCodeCondition(List<Integer> statusCodesToRetryOn) {
        this.statusCodesToRetryOn = new ArrayList<Integer>(
                assertNotNull(statusCodesToRetryOn, "statusCodesToRetryOn"));
    }

    /**
     * @param context Context about the state of the last request and information about the number of requests made.
     * @return True if the HTTP status code matches one of the provided status codes. False if it doesn't match or the request
     * failed for reasons other than an exceptional HTTP response (i.e. IOException).
     */
    @Override
    public boolean shouldRetry(RetryPolicyContext context) {
        if (context.httpStatusCode() != null) {
            for (Integer statusCode : statusCodesToRetryOn) {
                if (statusCode.equals(context.httpStatusCode())) {
                    return true;
                }
            }
        }
        return false;
    }
}
