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

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * An implementation of {@link Future} that can be completed successfully or unsuccessfully.
 */
public class FutureImpl<T> implements Future<T> {
    public final DelegatingFuture<T> delegatingFuture = new DelegatingFuture<T>();

    /**
     * Complete this future successfully.
     */
    public void complete(T value) {
        delegatingFuture.setDelegateIfUnset(new CompletedFuture<T>(value));
    }

    /**
     * Complete this future unsuccessfully.
     */
    public void fail(Throwable t) {
        delegatingFuture.setDelegateIfUnset(new FailedFuture<T>(t));
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return delegatingFuture.cancel(mayInterruptIfRunning);
    }

    @Override
    public boolean isCancelled() {
        return delegatingFuture.isCancelled();
    }

    @Override
    public boolean isDone() {
        return delegatingFuture.isDone();
    }

    /**
     * Call {@link #get()}, and re-throw any checked exceptions as an unchecked {@link RuntimeException} with the provided
     * message.
     */
    public T getOrThrowUnchecked(String errorMessage) {
        try {
            return get();
        } catch (Throwable e) {
            throw new RuntimeException(errorMessage, e);
        }
    }

    @Override
    public T get() throws InterruptedException, ExecutionException {
        return delegatingFuture.get();
    }

    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return delegatingFuture.get(timeout, unit);
    }
}
