/*
 * Copyright 2011-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.retry;

/**
 * The retry mode
 */
public enum RetryMode {

    /**
     * The legacy mode that only enables throttled retry for transient errors
     */
    LEGACY("legacy"),

    /**
     * Standard mode is built on top of legacy mode and has throttled retry enabled for throttling errors apart from transient
     * errors. In addition, timeout(socket timeout or connection timeout) errors would cost more retry capacity compared with
     * {@link #LEGACY}.
     */
    STANDARD("standard"),

    /**
     * Adaptive retry mode dynamically limits the rate of AWS requests to maximize success rate. This may be at the
     * expense of request latency. Adaptive retry mode is not recommended when predictable latency is important. 
     * <p>
     * <b>Warning:</b> Adaptive retry mode assumes that the client is working against a single resource (e.g. one
     * DynamoDB Table or one S3 Bucket). If you use a single client for multiple resources, throttling or outages
     * associated with one resource will result in increased latency and failures when accessing all other resources via
     * the same client. When using adaptive retry mode, we recommend using a single client per resource.
     *
     * @see RetryPolicy#isFastFailRateLimiting()
     */
    ADAPTIVE("adaptive")

    ;

    private final String name;

    RetryMode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * Returns a retry mode enum corresponding to the given retryMode name.
     *
     * @param value The name of the retry mode
     * @return RetryMode enum representing the given retry mode name.
     */
    public static RetryMode fromName(String value) {
        if (value == null) {
            return null;
        }

        for (RetryMode retryMode : RetryMode.values()) {
            if (retryMode.getName().equalsIgnoreCase(value)) {
                return retryMode;
            }
        }

        return null;
    }
}
