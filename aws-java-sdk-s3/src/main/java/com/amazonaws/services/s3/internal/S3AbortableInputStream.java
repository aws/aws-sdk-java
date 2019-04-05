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
package com.amazonaws.services.s3.internal;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.Throwables;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * Does EOS detection for objects returned by S3. Will abort the HTTP connection if not all data is read
 * from the stream which means a new connection must be established. This is likely an error on the customers part
 * as they should only request the bytes they need (or drain the stream after use) to ensure the connection can be reused.
 */
@SdkInternalApi
public final class S3AbortableInputStream extends SdkFilterInputStream {

    private static final Log LOG = LogFactory.getLog(S3AbortableInputStream.class);

    private final HttpRequestBase httpRequest;
    private final long contentLength;
    private long bytesRead;
    private long markedBytes;
    private boolean eofReached = false;

    public S3AbortableInputStream(InputStream in, HttpRequestBase httpRequest, long contentLength) {
        super(in);
        this.httpRequest = httpRequest;
        this.contentLength = contentLength;
    }

    /**
     * {@inheritDoc}
     *
     * Aborts the underlying http request without reading any more data and
     * closes the stream.
     * <p>
     * By default Apache {@link org.apache.http.client.HttpClient} tries to reuse http connections by
     * reading to the end of an attached input stream on
     * {@link InputStream#close()}. This is efficient from a socket pool
     * management perspective, but for objects with large payloads can incur
     * significant overhead while bytes are read from s3 and discarded. It's up
     * to clients to decide when to take the performance hit implicit in not
     * reusing an http connection in order to not read unnecessary information
     * from S3.
     *
     * @see org.apache.http.conn.EofSensorInputStream
     */
    @Override
    public void abort() {
        super.abort();
        if (httpRequest != null) {
            httpRequest.abort();
        }
        IOUtils.closeQuietly(in, null);
    }

    /**
     * Returns the value of super.available() if the result is nonzero, or 1
     * otherwise.
     * <p>
     * This is necessary to work around a known bug in
     * GZIPInputStream.available(), which returns zero in some edge cases,
     * causing file truncation.
     * <p>
     * Ref: http://bugs.java.com/bugdatabase/view_bug.do?bug_id=7036144
     */
    @Override
    public int available() throws IOException {
        int estimate = super.available();
        return estimate == 0 ? 1 : estimate;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int read() throws IOException {
        try {
            int value = super.read();
            eofReached = value == -1;
            if (!eofReached) {
                bytesRead++;
            }
            return value;
        } catch (Exception e) {
            return onException(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        try {
            int value = super.read(b, off, len);
            eofReached = value == -1;
            if (!eofReached) {
                bytesRead += value;
            }
            return value;
        } catch (Exception e) {
            return onException(e);
        }
    }

    @Override
    public synchronized void mark(int readlimit) {
        super.mark(readlimit);
        markedBytes = bytesRead;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public synchronized void reset() throws IOException {
        super.reset();
        bytesRead = markedBytes;
        eofReached = false;
    }

    @Override
    public synchronized long skip(long n) throws IOException {
        try {
            long skipped = super.skip(n);
            if (skipped > 0) {
                bytesRead += skipped;
            }
            return skipped;
        } catch (Exception e) {
            return onException(e);
        }
    }

    /**
     * {@inheritDoc}
     *
     * Delegates to {@link S3ObjectInputStream#abort()} if there is any data
     * remaining in the stream. Otherwise, it safely closes the stream.
     *
     * @see {@link S3ObjectInputStream#abort()}
     */
    @Override
    public void close() throws IOException {
        if (_readAllBytes() || isAborted()) {
            super.close();
        } else {
            LOG.warn(
                    "Not all bytes were read from the S3ObjectInputStream, aborting HTTP connection. This is likely an error and " +
                    "may result in sub-optimal behavior. Request only the bytes you need via a ranged GET or drain the input " +
                    "stream after use.");
            if (httpRequest != null) {
                httpRequest.abort();
            }
            IOUtils.closeQuietly(in, null);
        }
    }

    /**
     * Exposed for tests to verify the correct number of bytes were read in mark/reset scenarios.
     */
    @SdkTestInternalApi
    long getBytesRead() {
        return this.bytesRead;
    }

    @SdkTestInternalApi
    boolean isEofReached() {
        return this.eofReached;
    }

    /**
     * Marks the input stream as EOF since no further reads should be done.
     *
     * @param e Exception thrown by delegate stream.
     * @return Noting, just for return signature.
     * @throws IOException or {@link RuntimeException}
     */
    private int onException(Exception e) throws IOException {
        eofReached = true;
        if (e instanceof IOException) {
            throw (IOException) e;
        } else if (e instanceof RuntimeException) {
            throw (RuntimeException) e;
        } else {
            // Impossible since InputStream throws no other checked exceptions.
            throw Throwables.failure(e);
        }
    }

    // Underscore to prevent clash with Java 9's method.
    private boolean _readAllBytes() {
        return bytesRead >= contentLength || eofReached;
    }
}
