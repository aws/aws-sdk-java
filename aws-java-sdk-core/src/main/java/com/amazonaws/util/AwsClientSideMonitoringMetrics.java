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

package com.amazonaws.util;

import com.amazonaws.metrics.RequestMetricType;

/**
 * Metrics used for generate client side monitoring events.
 */
public enum AwsClientSideMonitoringMetrics implements RequestMetricType {
    /**
     * The elapsed time, in milliseconds, between when the Api Call was begun and when a final response or error is
     * manifested to the caller.
     */
    ApiCallLatency,

    /**
     * a boolean value that is false unless the Api call failed and the final attempt returned a retryable error.
     */
    MaxRetriesExceeded
}
