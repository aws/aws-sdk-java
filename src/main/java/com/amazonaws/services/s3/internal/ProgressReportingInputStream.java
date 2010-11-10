/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal;

import static com.amazonaws.services.s3.internal.Constants.*;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.services.s3.model.ProgressEvent;
import com.amazonaws.services.s3.model.ProgressListener;

/**
 * Simple InputStream wrapper that occasionally notifies a progress listener
 * about the number of bytes transfered.
 */
public class ProgressReportingInputStream extends FilterInputStream {

    /** The threshold of bytes between notifications. */
    private static final int NOTIFICATION_THRESHOLD = 8 * KB;

    /** The listener to notify. */
    private final ProgressListener listener;
    
    /** The number of bytes read that the listener hasn't been notified about yet. */
    private int unnotifiedByteCount;

    /**
     * Creates a new progress reporting input stream that simply wraps the
     * specified input stream and notifies the specified listener occasionally
     * about the number of bytes transfered.
     * 
     * @param in
     *            The input stream to wrap.
     * @param listener
     *            The listener to notify about progress.
     */
    public ProgressReportingInputStream(final InputStream in, final ProgressListener listener) {
        super(in);
        this.listener = listener;
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        if (data != -1) notify(1);
        return data;
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int bytesRead = super.read(b, off, len);
        if (bytesRead != -1) notify(bytesRead);
        return bytesRead;
    }

    @Override
    public void close() throws IOException {
        if (unnotifiedByteCount > 0) {
            listener.progressChanged(new ProgressEvent(unnotifiedByteCount));
            unnotifiedByteCount = 0;
        }
        super.close();
    }
    
    private void notify(int bytesRead) {
        unnotifiedByteCount += bytesRead;
        if (unnotifiedByteCount >= NOTIFICATION_THRESHOLD) {
            listener.progressChanged(new ProgressEvent(unnotifiedByteCount));
            unnotifiedByteCount = 0;
        }
    }
}