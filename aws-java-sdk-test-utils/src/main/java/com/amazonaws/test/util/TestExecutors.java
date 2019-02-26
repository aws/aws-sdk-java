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

package com.amazonaws.test.util;

import com.google.common.util.concurrent.ForwardingExecutorService;
import com.google.common.util.concurrent.Futures;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Test executor services
 */
public class TestExecutors {
    private TestExecutors() {}

    public static ExecutorService blocksOnFirstCallFromCallableOfType(final ExecutorService delegate, final Class<? extends Callable> type) {
        return new ForwardingExecutorService() {
            private boolean firstCall = true;

            @Override
            protected ExecutorService delegate() {
                return delegate;
            }

            @Override
            public <T> Future<T> submit(Callable<T> task) {
                if (task.getClass().equals(type) && firstCall) {
                    firstCall = false;
                    try {
                        return Futures.immediateFuture(task.call());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
                return super.submit(task);
            }
        };
    }
}
