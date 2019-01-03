/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.SdkClientException;

/**
 * Listener interface for transfer progress events.
 * <p>
 * This class could be used for both Amazon S3 and Amazon Glacier clients. The
 * legacy Amazon S3 progress listener
 * com.amazonaws.services.s3.model.ProgressListener has been deprecated in favor
 * of this new class.
 * </p>
 *
 * @see ProgressEvent
 */
public interface ProgressListener {
	public static final ProgressListener NOOP = new NoOpProgressListener();

    static class NoOpProgressListener implements ProgressListener, DeliveryMode {

        @Override
        public boolean isSyncCallSafe() {
            return true;
        }

        @Override
        public void progressChanged(ProgressEvent progressEvent) {
        }
    }

    /**
     * Called when progress has changed, such as additional bytes transferred,
     * transfer failed, etc. The execution of the callback of this listener is managed
     * by {@link SDKProgressPublisher}.  Implementation of this interface
     * should never block.
     * <p>
     * If the implementation follows the best practice and doesn't block, it
     * should then extends from {@link SyncProgressListener}.
     * <p>
     * Note any exception thrown by the listener will get ignored.
     * Should there be need to capture any such exception, you may consider
     * wrapping the listener with {@link ExceptionReporter#wrap(ProgressListener)}.
     *
     * @param progressEvent
     *            The event describing the progress change.
     *
     * @see SDKProgressPublisher
     * @see ExceptionReporter
     */
    public void progressChanged(ProgressEvent progressEvent);

    /**
     * A utility class for capturing and reporting the first exception thrown by
     * a given progress listener. Note once an exception is thrown by the
     * underlying listener, all subsequent events will no longer be notified to
     * the listener.
     */
    public static class ExceptionReporter implements ProgressListener, DeliveryMode {
        private final ProgressListener listener;
        private final boolean syncCallSafe;
        private volatile Throwable cause;

        public ExceptionReporter(ProgressListener listener) {
            if (listener == null)
                throw new IllegalArgumentException();
            this.listener = listener;
            if (listener instanceof DeliveryMode) {
                DeliveryMode cs = (DeliveryMode) listener;
                syncCallSafe = cs.isSyncCallSafe();
            } else
                syncCallSafe = false;
        }

        /**
         * Delivers the progress event to the underlying listener but only if
         * there has not been an exception previously thrown by the listener.
         * <p>
         * {@inheritDoc}
         */
        @Override public void progressChanged(ProgressEvent progressEvent) {
            if (cause != null)
                return;
            try {
                this.listener.progressChanged(progressEvent);
            } catch(Throwable t) {
                cause = t;
            }
        }

        /**
         * Throws the underlying exception, if any, as an
         * {@link SdkClientException}; or do nothing otherwise.
         */
        public void throwExceptionIfAny() {
            if (cause != null)
                throw new SdkClientException(cause);
        }

        /**
         * Returns the underlying exception, if any; or null otherwise.
         */
        public Throwable getCause() {
            return cause;
        }

        /**
         * Returns a wrapper for the given listener to capture the first
         * exception thrown.
         */
        public static ExceptionReporter wrap(ProgressListener listener) {
            return new ExceptionReporter(listener);
        }

        @Override public boolean isSyncCallSafe() { return syncCallSafe; }
    }
}
