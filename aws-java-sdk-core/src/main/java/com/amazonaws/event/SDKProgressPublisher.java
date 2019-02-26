/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.event;

import static com.amazonaws.event.ProgressEventType.HTTP_REQUEST_CONTENT_RESET_EVENT;
import static com.amazonaws.event.ProgressEventType.HTTP_RESPONSE_CONTENT_RESET_EVENT;
import static com.amazonaws.event.ProgressEventType.REQUEST_BYTE_TRANSFER_EVENT;
import static com.amazonaws.event.ProgressEventType.REQUEST_CONTENT_LENGTH_EVENT;
import static com.amazonaws.event.ProgressEventType.RESPONSE_BYTE_TRANSFER_EVENT;
import static com.amazonaws.event.ProgressEventType.RESPONSE_CONTENT_LENGTH_EVENT;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;

import org.apache.commons.logging.LogFactory;

/**
 * This class is responsible for executing the callback method of
 * ProgressListener; listener callbacks are executed sequentially in a separate
 * single thread.
 */
public class SDKProgressPublisher {

    /**
     * Used for testing purposes only.
     */
    private static volatile Future<?> latestFutureTask;

    /**
     * Used to deliver a progress event to the given listener.
     *
     * @return the future of a submitted task; or null if the delivery is
     * synchronous with no future task involved.  Note a listener should never
     * block, and therefore returning null is the typical case.
     */
    public static Future<?> publishProgress(
            final ProgressListener listener,
            final ProgressEventType type) {
        if (listener == ProgressListener.NOOP || listener == null
        ||  type == null) {
            return null;
        }
        return deliverEvent(listener, new ProgressEvent(type));
    }

    private static Future<?> deliverEvent(final ProgressListener listener,
            final ProgressEvent event) {

        if (listener instanceof DeliveryMode) {
            DeliveryMode mode = (DeliveryMode) listener;
            if (mode.isSyncCallSafe()) {
                // Safe to call the listener directly
                return quietlyCallListener(listener, event);
            }
        }
        // Not safe to call the listener directly; so submit an async task.
        // This is unfortunate as the listener should never block in the first
        // place, but such task submission is necessary to remain backward
        // compatible.
        return latestFutureTask = LazyHolder.executor.submit(new Runnable() {
            @Override
            public void run() {
                listener.progressChanged(event);
            }
        });
    }

    private static Future<?> quietlyCallListener(final ProgressListener listener,
            final ProgressEvent event) {
        try {
            listener.progressChanged(event);
        } catch(Throwable t) {
            // That's right, we need to suppress all errors so as to be on par
            // with the async mode where all failures will be ignored.
            LogFactory.getLog(SDKProgressPublisher.class)
                .debug("Failure from the event listener", t);
        }
        return null;
    }

    /**
     * Convenient method to publish a request content length event to the given
     * listener.
     *
     * @param listener
     *            must not be null or else the publication will be skipped
     * @param bytes
     *            must be non-negative or else the publication will be skipped
     */
    public static Future<?> publishRequestContentLength(
            final ProgressListener listener,
            final long bytes) {
        return publishByteCountEvent(listener, REQUEST_CONTENT_LENGTH_EVENT, bytes);
    }

    /**
     * Convenient method to publish a response content length event to the given
     * listener.
     *
     * @param listener
     *            must not be null or else the publication will be skipped
     * @param bytes
     *            must be non-negative or else the publication will be skipped
     */
    public static Future<?> publishResponseContentLength(
            final ProgressListener listener,
            final long bytes) {
        return publishByteCountEvent(listener, RESPONSE_CONTENT_LENGTH_EVENT, bytes);
    }

    /**
     * Convenient method to publish a request byte transfer event to the given
     * listener.
     *
     * @param listener
     *            must not be null or else the publication will be skipped
     * @param bytes
     *            must be non-negative or else the publication will be skipped
     */
    public static Future<?> publishRequestBytesTransferred(
            final ProgressListener listener,
            final long bytes) {
        return publishByteCountEvent(listener, REQUEST_BYTE_TRANSFER_EVENT, bytes);
    }

    /**
     * Convenient method to publish a response byte transfer event to the given
     * listener.
     *
     * @param listener
     *            must not be null or else the publication will be skipped
     * @param bytes
     *            must be non-negative or else the publication will be skipped
     */
    public static Future<?> publishResponseBytesTransferred(
            final ProgressListener listener,
            final long bytes) {
        return publishByteCountEvent(listener, RESPONSE_BYTE_TRANSFER_EVENT, bytes);
    }

    private static Future<?> publishByteCountEvent(
            final ProgressListener listener,
            final ProgressEventType type,
            final long bytes) {
        if (listener == ProgressListener.NOOP || listener == null || bytes <= 0)
            return null;
        return deliverEvent(listener, new ProgressEvent(type, bytes));
    }

    /**
     * Convenient method to publish a request reset event to the given listener.
     *
     * @param listener
     *            must not be null or else the publication will be skipped
     * @param bytesReset
     *            must be non-negative or else the publication will be skipped
     */
    public static Future<?> publishRequestReset(
            final ProgressListener listener,
            final long bytesReset) {
        return publishResetEvent(listener, HTTP_REQUEST_CONTENT_RESET_EVENT, bytesReset);
    }

    /**
     * Convenient method to publish a response reset event to the given listener.
     */
    public static Future<?> publishResponseReset(
            final ProgressListener listener,
            final long bytesReset) {
        return publishResetEvent(listener, HTTP_RESPONSE_CONTENT_RESET_EVENT, bytesReset);
    }

    /**
     * Convenient method to publish a response bytes discard event to the given listener.
     */
    public static Future<?> publishResponseBytesDiscarded(
            final ProgressListener listener,
            final long bytesDiscarded) {
        return publishResetEvent(listener,
                ProgressEventType.RESPONSE_BYTE_DISCARD_EVENT, bytesDiscarded);
    }

    /**
     * @param listener
     *            must not be null or else the publication will be skipped
     * @param bytesReset
     *            the publication will be skipped unless the number of bytes
     *            reset is positive
     */
    private static Future<?> publishResetEvent(
            final ProgressListener listener,
            final ProgressEventType resetEventType,
            final long bytesReset) {
        if (bytesReset <= 0)
            return null;
        if (listener == ProgressListener.NOOP || listener == null)
            return null;
        return deliverEvent(listener, new ProgressEvent(resetEventType, bytesReset));
    }

    /**
     * Returns the executor service used for performing the callbacks.
     */
    protected static ExecutorService getExecutorService() {
        return LazyHolder.executor;
    }

    protected static Future<?> setLatestFutureTask(Future<?> f) {
        return latestFutureTask = f;
    }

    /**
     * For internal testing and backward compatibility only. This method blocks
     * until all the submitted callbacks are executed. Listeners should never
     * block so this method should never be used.
     */
    @Deprecated
    public static void waitTillCompletion()
            throws InterruptedException, ExecutionException {
        if (latestFutureTask != null) {
            latestFutureTask.get();
        }
    }

    /**
     * Used to avoid creating the extra thread until absolutely necessary.
     */
    private static final class LazyHolder {
        /** A single thread pool for executing all ProgressListener callbacks. **/
        private static final ExecutorService executor = createNewExecutorService();

        /**
         * Creates a new single threaded executor service for performing the
         * callbacks.
         */
        private static ExecutorService createNewExecutorService() {
            return Executors.newSingleThreadExecutor(new ThreadFactory() {
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r);
                    t.setName("java-sdk-progress-listener-callback-thread");
                    t.setDaemon(true);
                    return t;
                }
            });
        }
    }

    /**
     * Can be used to shutdown the (legacy) executor.
     * <p>
     * However, the recommended best practice is to always make use of progress
     * listeners that are short-lived (ie do not block) and are subclasses of
     * either {@link SyncProgressListener} or
     * <code>S3SyncProgressListener</code>. That way, the progress publisher
     * (legacy) thread will never be activated in the first place.
     *
     * @param now true if shutdown now; false otherwise.
     */
    public static void shutdown(boolean now) {
        if (now)
            LazyHolder.executor.shutdownNow();
        else
            LazyHolder.executor.shutdown();
    }
}
