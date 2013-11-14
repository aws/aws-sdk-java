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
package com.amazonaws.event;

import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * Simple InputStream wrapper that occasionally notifies a progress listener
 * about the number of bytes transferred.
 * <p>
 * This class could be used for both Amazon S3 and Amazon Glacier clients. The
 * legacy Amazon Amazon S3
 * com.amazonaws.services.s3.internal.ProgressReportingInputStream has been
 * deprecated in favor of this new class.
 * </p>
 */
public class ProgressReportingInputStream extends SdkFilterInputStream {

    /** The threshold of bytes between notifications. */
    private static final int NOTIFICATION_THRESHOLD = 8 * 1024;

    /** The listener callback executor */
    private final ProgressListenerCallbackExecutor listenerCallbackExecutor;

    /** The number of bytes read that the listener hasn't been notified about yet. */
    private int unnotifiedByteCount;

    /** True if this stream should fire a completed progress event when the stream runs out. */
    private boolean fireCompletedEvent;

    /**
     * Creates a new progress reporting input stream that simply wraps the
     * specified input stream and uses the specified listener callback executor to
     * asynchronously notify the listener about the number of bytes transferred.
     * 
     * @param in
     *            The input stream to wrap.
     * @param listenerCallbackExecutor
     *            The listener callback executor that wraps the listener to notify about progress.
     */
    public ProgressReportingInputStream(final InputStream in, final ProgressListenerCallbackExecutor listenerCallbackExecutor) {
        super(in);
        this.listenerCallbackExecutor = listenerCallbackExecutor;
    }

    /**
     * Sets whether this input stream should fire an event with code
     * {@link ProgressEvent#COMPLETED_EVENT_CODE} when this stream runs out of
     * data. By default, completed events are not fired by this stream.
     *
     * @param fireCompletedEvent
     *            Whether this input stream should fire an event to indicate
     *            that the stream has been fully read.
     */
    public void setFireCompletedEvent(boolean fireCompletedEvent) {
        this.fireCompletedEvent = fireCompletedEvent;
    }

    /**
     * Returns whether this input stream should fire an event with code
     * {@link ProgressEvent#COMPLETED_EVENT_CODE} when this stream runs out of
     * data. By default, completed events are not fired by this stream.
     *
     * @return Whether this input stream should fire an event to indicate that
     *         the stream has been fully read.
     */
    public boolean getFireCompletedEvent() {
        return fireCompletedEvent;
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        if (data == -1) {
            notifyCompleted();
        } else {
            notify(1);
        }
        return data;
    }

    @Override
    public void reset() throws IOException {
        super.reset();
        ProgressEvent event = new ProgressEvent(unnotifiedByteCount);
        event.setEventCode(ProgressEvent.RESET_EVENT_CODE);
        listenerCallbackExecutor.progressChanged(event);
        unnotifiedByteCount = 0;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        if (bytesRead == -1) notifyCompleted();
        if (bytesRead != -1) notify(bytesRead);
        return bytesRead;
    }

    @Override
    public void close() throws IOException {
        if (unnotifiedByteCount > 0) {
            listenerCallbackExecutor.progressChanged(new ProgressEvent(unnotifiedByteCount));
            unnotifiedByteCount = 0;
        }
        super.close();
    }

    private void notifyCompleted() {
        if (fireCompletedEvent == false) return;

        ProgressEvent event = new ProgressEvent(unnotifiedByteCount);
        event.setEventCode(ProgressEvent.COMPLETED_EVENT_CODE);
        unnotifiedByteCount = 0;
        listenerCallbackExecutor.progressChanged(event);
    }

    private void notify(int bytesRead) {
        unnotifiedByteCount += bytesRead;
        if (unnotifiedByteCount >= NOTIFICATION_THRESHOLD) {
            listenerCallbackExecutor.progressChanged(new ProgressEvent(unnotifiedByteCount));
            unnotifiedByteCount = 0;
        }
    }
}
