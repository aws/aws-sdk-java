/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * SDKGlobalConfiguration is to configure any global settings
 */
public class SDKGlobalConfiguration {
    /**
     * globalTimeOffset is a time offset that is used to globally adjust the
     * client clock skew. Java SDK already provides timeOffset and accessor methods
     * in {@link Request} class but those are used per request, whereas
     * this variable will adjust clock skew globally. Java SDK detects clock
     * skew errors and adjusts global clock skew automatically.
     */
    private static AtomicInteger globalTimeOffset = new AtomicInteger(0);

    /**
     * Sets the global time offset. If this value is set then all the subsequent
     * requests will use this value to generate timestamps. To adjust clock skew
     * per request use {@link Request#setTimeOffset(int)}
     *
     * @param timeOffset the time difference between local client and server
     */
    public  static void setGlobalTimeOffset(int timeOffset) {
        globalTimeOffset.set(timeOffset);
    }

    /**
     * Gets the global time offset. See {@link Request#getTimeOffset()} if global time
     * offset is not set.
     *
     * @return globalTimeOffset an AtomicInteger that holds the value of time
     * offset
     */
    public static int getGlobalTimeOffset() {
        return globalTimeOffset.get();
    }
}
