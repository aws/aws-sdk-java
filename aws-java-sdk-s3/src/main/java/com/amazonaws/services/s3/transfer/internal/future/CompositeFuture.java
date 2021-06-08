/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.transfer.internal.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * An implementation of {@link Future} that aggregates the results of multiple futures into a single result.
 */
public class CompositeFuture<T> implements Future<List<T>> {
    private final List<? extends Future<T>> futures;

    public CompositeFuture(List<? extends Future<T>> futures) {
        this.futures = futures;
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        boolean anyCancelled = false;
        for (Future<T> future : futures) {
            anyCancelled |= future.cancel(mayInterruptIfRunning);
        }
        return anyCancelled;
    }

    @Override
    public boolean isCancelled() {
        for (Future<T> future : futures) {
            if (!future.isCancelled()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isDone() {
        for (Future<T> future : futures) {
            if (!future.isDone()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public List<T> get() throws InterruptedException, ExecutionException {
        List<T> results = new ArrayList<T>();
        for (Future<T> future : futures) {
            results.add(future.get());
        }
        return results;
    }

    @Override
    public List<T> get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        long doneTime = System.nanoTime() + unit.toNanos(timeout);

        List<T> results = new ArrayList<T>();
        for (Future<T> future : futures) {
            long timeLeft = doneTime - System.nanoTime();
            results.add(future.get(timeLeft, TimeUnit.NANOSECONDS));
        }
        return results;
    }
}
