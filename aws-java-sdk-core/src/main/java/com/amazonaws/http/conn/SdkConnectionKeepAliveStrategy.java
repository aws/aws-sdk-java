/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.conn;

import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.protocol.HttpContext;

/**
 * The AWS SDK for Java's implementation of the
 * {@code ConnectionKeepAliveStrategy} interface. Allows a user-configurable
 * maximum idle time for connections.
 */
public class SdkConnectionKeepAliveStrategy
        implements ConnectionKeepAliveStrategy {

    private final long maxIdleTime;

    /**
     * @param maxIdleTime the maximum time a connection may be idle
     */
    public SdkConnectionKeepAliveStrategy(long maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
    }

    @Override
    public long getKeepAliveDuration(
            HttpResponse response,
            HttpContext context) {

        // If there's a Keep-Alive timeout directive in the response and it's
        // shorter than our configured max, honor that. Otherwise go with the
        // configured maximum.

        long duration = DefaultConnectionKeepAliveStrategy.INSTANCE
                .getKeepAliveDuration(response, context);

        if (0 < duration && duration < maxIdleTime) {
            return duration;
        }

        return maxIdleTime;
    }
}
