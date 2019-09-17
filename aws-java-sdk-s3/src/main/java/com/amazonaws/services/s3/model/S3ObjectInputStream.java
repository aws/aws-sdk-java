/*
 * Copyright 2012-2019 Amazon Technologies, Inc.
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

import com.amazonaws.internal.MetricAware;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricFilterInputStream;
import com.amazonaws.services.s3.metrics.S3ServiceMetric;
import com.amazonaws.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.EofSensorInputStream;

/**
 * Input stream representing the content of an {@link S3Object}. In addition to
 * the methods supplied by the {@link InputStream} class,
 * {@link S3ObjectInputStream} supplies the abort() method, which will terminate
 * an HTTP connection to the S3 object.
 */
public class S3ObjectInputStream extends SdkFilterInputStream {

    private final HttpRequestBase httpRequest;

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
        if (!AwsSdkMetrics.isMetricsEnabled()) {
            return false;   // metrics is disabled
        }
        if (in instanceof MetricAware) {
            MetricAware aware = (MetricAware) in;
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
        super.abort();

        if (httpRequest != null) {
            httpRequest.abort();
        }

        // The default abort() implementation calls abort on the wrapped stream
        // if it's an SdkFilterInputStream; otherwise we'll need to close the
        // stream.
        if (!(in instanceof SdkFilterInputStream)) {
            IOUtils.closeQuietly(in, null);
        }
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
     *
     * Delegates to {@link S3ObjectInputStream#abort()} if there is any data
     * remaining in the stream. Otherwise, it safely closes the stream.
     *
     * @see S3ObjectInputStream#abort()
     * @see com.amazonaws.services.s3.internal.S3AbortableInputStream
     */
    @Override
    public void close() throws IOException {
        super.close();
    }

}
