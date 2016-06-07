/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.http.timers;

/**
 * Constants relevant for request timeout and client execution timeout tests
 */
public class TimeoutTestConstants {

    public static final int TEST_TIMEOUT = 25 * 1000;
    public static final int CLIENT_EXECUTION_TIMEOUT = 5 * 1000;
    public static final int SLOW_REQUEST_HANDLER_TIMEOUT = 100;

    /**
     * ScheduledThreadPoolExecutor isn't exact and can be delayed occasionally. For tests where we
     * are asserting that a certain timeout comes first (i.e. SocketTimeout is triggered before
     * Request timeout or Request Timeout is triggered before Client execution timeout) then we need
     * to add a comfortable margin to ensure tests don't fail.
     */
    public static final int PRECISION_MULTIPLIER = 5;
}
