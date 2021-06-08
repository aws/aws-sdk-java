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

import com.amazonaws.util.ValidationUtils;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * An implementation of {@link Future} that delegates all operations to another future. The delegate future does not need to be
 * specified when the {@code FutureFuture} is created.
 *
 * In the event that this {@code Future} is cancelled before the delegate is assigned, the delegate will be cancelled at the time
 * of assignment.
 */
public class DelegatingFuture<T> implements Future<T> {
    private final Object mutationLock = new Object();

    private volatile Future<T> delegate;
    private volatile CancelState cancelState = CancelState.NOT_CANCELLED;

    /**
     * Set the delegate, if it hasn't been set already. If it has been set, this does nothing.
     */
    public void setDelegateIfUnset(Future<T> delegate) {
        if (hasDelegate()) {
            return;
        }

        synchronized (mutationLock) {
            if (hasDelegate()) {
                return;
            }

            setDelegate(delegate);
        }
    }

    /**
     * Set the delegate, throwing an exception if it has already been set.
     */
    public void setDelegate(Future<T> delegate) {
        synchronized (mutationLock) {
            ValidationUtils.assertAllAreNull("Delegate may only be set once.", this.delegate);

            switch (cancelState) {
                case NOT_CANCELLED:
                    break;
                case CANCELLED:
                    delegate.cancel(false);
                    break;
                case CANCELLED_MAY_INTERRUPT:
                    delegate.cancel(true);
                    break;
                default:
                    throw new IllegalStateException();
            }

            this.delegate = delegate;
            mutationLock.notifyAll();
        }
    }

    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        // If we have a delegate, just delegate.
        Future<T> delegate = this.delegate;
        if (delegate != null) {
            return delegate.cancel(mayInterruptIfRunning);
        }

        synchronized (mutationLock) {
            delegate = this.delegate;
            if (delegate != null) {
                return delegate.cancel(mayInterruptIfRunning);
            }

            // We do not have a delegate. Save the cancellation for when we do.

            if (cancelState != CancelState.NOT_CANCELLED) {
                // We have already been cancelled, so do nothing.
                return false;
            }

            cancelState = mayInterruptIfRunning ? CancelState.CANCELLED_MAY_INTERRUPT
                                                : CancelState.CANCELLED;
            mutationLock.notifyAll();

            return true;
        }
    }

    @Override
    public boolean isCancelled() {
        // If we have a delegate, just delegate.
        Future<T> delegate = this.delegate;
        if (delegate != null) {
            return delegate.isCancelled();
        }

        // If we don't have a delegate, use the cancel state. Note: We could have a delegate by the time we assess the cancel
        // state, but customers cannot rely on that strict of ordering, anyway.
        return cancelState != CancelState.NOT_CANCELLED;
    }

    @Override
    public boolean isDone() {
        // If we have a delegate, just delegate.
        Future<T> delegate = this.delegate;
        if (delegate != null) {
            return delegate.isDone();
        }

        // If we don't have a delegate, use the cancel state. Note: We could have a delegate by the time we assess the cancel
        // state, but customers cannot rely on that strict of ordering, anyway.
        return cancelState != CancelState.NOT_CANCELLED;
    }

    @Override
    public T get() throws InterruptedException, ExecutionException {
        // If we have a delegate, just delegate.
        Future<T> delegate = this.delegate;
        if (delegate != null) {
            return delegate.get();
        }

        // Wait until we have a delegate.
        synchronized (mutationLock) {
            delegate = this.delegate;
            while (delegate == null) {
                if (cancelState != CancelState.NOT_CANCELLED) {
                    throw new CancellationException("Future being waited on has been cancelled.");
                }

                mutationLock.wait();
                delegate = this.delegate;
            }
        }

        return delegate.get();
    }

    @Override
    public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        // If we have a delegate, just delegate.
        Future<T> delegate = this.delegate;
        if (delegate != null) {
            return delegate.get(timeout, unit);
        }

        long nanosToWait = unit.toNanos(timeout);
        long waitEndTime = System.nanoTime() + nanosToWait;

        // Wait until we have a delegate.
        synchronized (mutationLock) {
            delegate = this.delegate;
            while (delegate == null) {
                if (cancelState != CancelState.NOT_CANCELLED) {
                    throw new CancellationException("Future being waited on has been cancelled.");
                }

                long totalNanosRemainingOnWait = nanosUntil(waitEndTime);
                long millisRemainingPart = TimeUnit.NANOSECONDS.toMillis(totalNanosRemainingOnWait);
                int nanosRemainingPart = toIntExact(totalNanosRemainingOnWait % 1000000);

                mutationLock.wait(millisRemainingPart, nanosRemainingPart);
                delegate = this.delegate;
            }
        }

        return delegate.get(nanosUntil(waitEndTime), TimeUnit.NANOSECONDS);
    }

    private boolean hasDelegate() {
        return delegate != null;
    }

    private long nanosUntil(long time) throws TimeoutException {
        long nanosRemainingOnWait = time - System.nanoTime();
        if (nanosRemainingOnWait <= 0) {
            throw new TimeoutException("Timed out waiting for future.");
        }

        return nanosRemainingOnWait;
    }

    private static int toIntExact(long value) {
        if ((int) value != value) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) value;
    }

    private enum CancelState {
        NOT_CANCELLED,
        CANCELLED_MAY_INTERRUPT,
        CANCELLED
    }
}

