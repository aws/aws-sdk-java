/*
 * Copyright 2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.flow.interceptors;

import java.util.Date;

import com.amazonaws.services.simpleworkflow.flow.annotations.ExponentialRetry;
import com.amazonaws.services.simpleworkflow.flow.common.FlowConstants;

/**
 * Defines retry policy in case of failures. Valid implementation should be
 * stateless and thread safe.
 * 
 * @see RetryDecorator
 * @see ExponentialRetry
 */
public interface RetryPolicy {

    boolean isRetryable(Throwable failure);

    /**
     * @return Time to the next retry. {@link FlowConstants#NONE} means stop
     *         retrying.
     */
    long nextRetryDelaySeconds(Date firstAttempt, Date recordedFailure, int numberOfTries);
}
