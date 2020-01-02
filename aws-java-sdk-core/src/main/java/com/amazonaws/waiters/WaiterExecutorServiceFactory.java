/*
 * Copyright 2019-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.waiters;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.amazonaws.annotation.SdkProtectedApi;
import com.amazonaws.util.NamedDefaultThreadFactory;

/**
 * Static helper class that is used by generated code to build an efficient {@link ExecutorService} to be used by
 * asynchronous waiter executions. By default, this factory will build a cached thread-pool which will either
 * re-use a recently completed thread or create a new thread every time a new execution is requested. Executions will
 * never be blocked by the {@link ExecutorService} itself, but may end up competing for limited resources under
 * extremely high loads.
 */
@SdkProtectedApi
public class WaiterExecutorServiceFactory {
    /**
     * Construct a new {@link ExecutorService} to be used by a specific client Waiter class. Threads will still be
     * uniquely named, but will also contain the name of the Waiter for easier identification.
     * @param name The name of the Waiter class that is using the ExecutorService.
     * @return An {@link ExecutorService} that can be used for asynchronous executions of the named Waiter.
     */
    public static ExecutorService buildExecutorServiceForWaiter(String name) {
        return Executors.newCachedThreadPool(NamedDefaultThreadFactory.of(name));
    }
}
