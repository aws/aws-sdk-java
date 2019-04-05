/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.auth;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.annotation.NotThreadSafe;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.internal.SdkPredicate;
import com.amazonaws.util.ValidationUtils;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Handles refreshing a value with a simple synchronization policy. Does a blocking, synchronous
 * refresh if needed, otherwise queues an asynchronous refresh and returns the current value.
 */
@ThreadSafe
@SdkInternalApi
class RefreshableTask<T> implements Closeable {
    /**
     * Maximum time to wait for a blocking refresh lock before calling refresh again. This is to
     * rate limit how many times we call refresh. In the ideal case, refresh always occurs in a
     * timely fashion and only one thread actually does the refresh.
     */
    private static final long BLOCKING_REFRESH_MAX_WAIT_IN_SECONDS = 5;

    /**
     * Used to synchronize a blocking refresh. Used when a caller can't return without getting the
     * refreshed value.
     */
    private final Lock blockingRefreshLock = new ReentrantLock();

    /**
     * Atomic holder for refreshable value.
     */
    private final AtomicReference<T> refreshableValueHolder = new AtomicReference<T>();

    /**
     * Single threaded executor to asynchronous refresh the value.
     */
    private final ExecutorService executor = Executors.newSingleThreadExecutor(new DaemonThreadFactory());

    /**
     * Used to ensure only one thread at any given time refreshes the value.
     */
    private final AtomicBoolean asyncRefreshing = new AtomicBoolean(false);

    /**
     * Callback to get a new refreshed value.
     */
    private final Callable<T> refreshCallable;

    /**
     * Predicate to determine whether a blocking refresh should be performed
     */
    private final SdkPredicate<T> shouldDoBlockingRefresh;

    /**
     * Predicate to determine whether a async refresh can be done rather than a blocking refresh.
     */
    private final SdkPredicate<T> shouldDoAsyncRefresh;

    private RefreshableTask(Callable<T> refreshCallable, SdkPredicate<T> shouldDoBlockingRefresh,
                            SdkPredicate<T> shouldDoAsyncRefresh) {
        this.refreshCallable = ValidationUtils.assertNotNull(refreshCallable, "refreshCallable");
        this.shouldDoBlockingRefresh = ValidationUtils
                .assertNotNull(shouldDoBlockingRefresh, "shouldDoBlockingRefresh");
        this.shouldDoAsyncRefresh = ValidationUtils
                .assertNotNull(shouldDoAsyncRefresh, "shouldDoAsyncRefresh");
    }

    @Override
    public void close() {
        executor.shutdown();
    }

    @NotThreadSafe
    public static class Builder<T> {
        private Callable<T> refreshCallable;
        private SdkPredicate<T> shouldDoBlockingRefresh;
        private SdkPredicate<T> shouldDoAsyncRefresh;

        /**
         * Set the callable that will provide the value when a refresh occurs.
         *
         * @return This object for method chaining.
         */
        public Builder withRefreshCallable(Callable<T> refreshCallable) {
            this.refreshCallable = refreshCallable;
            return this;
        }

        /**
         * Set the predicate that will determine when the task will do a blocking refresh.
         *
         * @return This object for method chaining.
         */
        public Builder withBlockingRefreshPredicate(SdkPredicate<T> shouldDoBlockingRefresh) {
            this.shouldDoBlockingRefresh = shouldDoBlockingRefresh;
            return this;
        }

        /**
         * Set the predicate that will determine when the task will queue a non-blocking, async
         * refresh.
         *
         * @return This object for method chaining.
         */
        public Builder withAsyncRefreshPredicate(SdkPredicate<T> shouldDoAsyncRefresh) {
            this.shouldDoAsyncRefresh = shouldDoAsyncRefresh;
            return this;
        }

        /**
         * @return The configured RefreshableTask
         */
        public RefreshableTask<T> build() {
            return new RefreshableTask<T>(refreshCallable, shouldDoBlockingRefresh,
                                          shouldDoAsyncRefresh);
        }
    }

    /**
     * Return a valid value, refreshing if necessary. May return the current value, do an async
     * refresh if possible, or do a blocking refresh if needed.
     *
     * @throws AmazonClientException If error occurs during refresh.
     * @throws IllegalStateException If value if invalid after refreshing.
     */
    public T getValue() throws AmazonClientException, IllegalStateException {
        if (shouldDoBlockingRefresh()) {
            blockingRefresh();
        } else if (shouldDoAsyncRefresh()) {
            asyncRefresh();
        }

        return getRefreshedValue();
    }

    /**
     * Forces a refresh of the value. This method will not attempt to lock on calls to refresh the
     * value.
     *
     * @throws AmazonClientException If error occurs during refresh.
     * @throws IllegalStateException If value if invalid after refreshing.
     */
    public T forceGetValue() {
        refreshValue();
        return getRefreshedValue();
    }

    /**
     * @return The refreshed value.
     * @throws IllegalStateException If the refreshed value is still invalid.
     */
    private T getRefreshedValue() throws IllegalStateException {
        T refreshableValue = refreshableValueHolder.get();
        if (refreshableValue != null) {
            return refreshableValue;
        } else {
            throw new IllegalStateException("Refreshed value should never be null.");
        }
    }

    private boolean shouldDoBlockingRefresh() {
        return shouldDoBlockingRefresh.test(refreshableValueHolder.get());
    }

    /**
     * @return True if we should kick of an asynchronous refresh of the value. False otherwise.
     */
    private boolean shouldDoAsyncRefresh() {
        return shouldDoAsyncRefresh.test(refreshableValueHolder.get());
    }

    /**
     * Used when there is no valid value to return. Callers are blocked until a new value is created
     * or an exception is thrown.
     */
    private void blockingRefresh() {
        try {
            if (blockingRefreshLock
                    .tryLock(BLOCKING_REFRESH_MAX_WAIT_IN_SECONDS, TimeUnit.SECONDS)) {
                try {
                    // Return if successful refresh occurred while waiting for the lock
                    if (!shouldDoBlockingRefresh()) {
                        return;
                    } else {
                        // Otherwise do a synchronous refresh if the last lock holder was unable to
                        // refresh the value
                        refreshValue();
                        return;
                    }
                } finally {
                    blockingRefreshLock.unlock();
                }
            }
        } catch (InterruptedException ex) {
            handleInterruptedException("Interrupted waiting to refresh the value.", ex);
        }
        // Couldn't acquire the lock. Just try a synchronous refresh
        refreshValue();
    }

    /**
     * Used to asynchronously refresh the value. Caller is never blocked.
     */
    private void asyncRefresh() {
        // Immediately return if refresh already in progress
        if (asyncRefreshing.compareAndSet(false, true)) {
            try {
                executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            refreshValue();
                        } finally {
                            asyncRefreshing.set(false);
                        }
                    }
                });
            } catch (RuntimeException ex) {
                asyncRefreshing.set(false);
                throw ex;
            }
        }
    }

    /**
     * Invokes the callback to get a new value.
     */
    private void refreshValue() {
        try {
            refreshableValueHolder
                    .compareAndSet(refreshableValueHolder.get(), refreshCallable.call());
        } catch (AmazonServiceException ase) {
            // Preserve the original ASE
            throw ase;
        } catch (AmazonClientException ace) {
            // Preserve the original ACE
            throw ace;
        } catch (Exception e) {
            throw new AmazonClientException(e);
        }
    }

    /**
     * If we are interrupted while waiting for a lock we just restore the interrupt status and throw
     * an AmazonClientException back to the caller.
     */
    private void handleInterruptedException(String message, InterruptedException cause) {
        Thread.currentThread().interrupt();
        throw new AbortedException(message, cause);
    }

}
