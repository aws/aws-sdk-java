/*
 * Copyright 2012-2017 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.EofSensorInputStream;

import com.amazonaws.internal.MetricAware;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricFilterInputStream;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.util.IOUtils;

/**
 * Input stream representing the content of an {@link S3Object}. In addition to
 * the methods supplied by the {@link InputStream} class,
 * {@link S3ObjectInputStream} supplies the abort() method, which will terminate
 * an HTTP connection to the S3 object.
 */
public class S3ObjectInputStream extends SdkFilterInputStream {

    private final HttpRequestBase httpRequest;

    private boolean eof;

    public S3ObjectInputStream(InputStream in, HttpRequestBase httpRequest) {
        this(in, httpRequest, wrapWithByteCounting(in));
    }

    public S3ObjectInputStream(
            InputStream in,
            HttpRequestBase httpRequest,
            boolean collectMetrics) {

        super(collectMetrics
                ? new MetricFilterInputStream(S3ServiceMetric.S3DownloadThroughput, in)
                : in);

        this.httpRequest = httpRequest;
    }

    /**
     * Returns true if we should wrap the given input stream with a byte
     * counting wrapper; false otherwise.
     */
    private static boolean wrapWithByteCounting(InputStream in) {
        if (!AwsSdkMetrics.isMetricsEnabled())
            return false;   // metrics is disabled
        if (in instanceof MetricAware) {
            MetricAware aware = (MetricAware)in;
            // wrap only if not already wrapped in one of it's inner chain of input stream
            return !aware.isMetricActivated();
        }
        return true; // this is a raw input stream so metric wrapping is necessary
    }

    /**
     * {@inheritDoc}
     *
     * Aborts the underlying http request without reading any more data and
     * closes the stream.
     * <p>
     * By default Apache {@link HttpClient} tries to reuse http connections by
     * reading to the end of an attached input stream on
     * {@link InputStream#close()}. This is efficient from a socket pool
     * management perspective, but for objects with large payloads can incur
     * significant overhead while bytes are read from s3 and discarded. It's up
     * to clients to decide when to take the performance hit implicit in not
     * reusing an http connection in order to not read unnecessary information
     * from S3.
     *
     * @see EofSensorInputStream
     */
    @Override
    public void abort() {
        doAbort();
    }

    /**
     * To allow customers to override abort to just close. We can think about exposing this method
     * as protected to allow customers to completely prevent the abort behavior if there is a need
     */
    private void doAbort() {
        if (httpRequest != null) {
            httpRequest.abort();
        }
        IOUtils.closeQuietly(in, null);
    }

    /**
     * Returns the http request from which this input stream is derived.
     */
    public HttpRequestBase getHttpRequest() {
        return httpRequest;
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
        int value = super.read();
        if (value == -1) {
            eof = true;
        }
        return value;
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
        int value = super.read(b, off, len);
        if (value == -1) {
            eof = true;
        }
        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void reset() throws IOException {
        super.reset();
        eof = false;
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
        if (eof) {
            super.close();
        } else {
            doAbort();
        }
    }
}
