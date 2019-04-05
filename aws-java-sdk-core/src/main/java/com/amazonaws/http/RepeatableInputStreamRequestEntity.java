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
package com.amazonaws.http;

import com.amazonaws.Request;
import com.amazonaws.metrics.MetricInputStreamEntity;
import com.amazonaws.metrics.ServiceMetricType;
import com.amazonaws.metrics.ThroughputMetricType;
import com.amazonaws.metrics.internal.ServiceMetricTypeGuesser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.InputStreamEntity;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Custom implementation of {@link RequestEntity} that delegates to an
 * {@link RepeatableInputStreamRequestEntity}, with the one notable difference, that if
 * the underlying InputStream supports being reset, this RequestEntity will
 * report that it is repeatable and will reset the stream on all subsequent
 * attempts to write out the request.
 *
 * TODO : Move this to apache specific package.
 */
public class RepeatableInputStreamRequestEntity extends BasicHttpEntity {

    /** True if the request entity hasn't been written out yet */
    private boolean firstAttempt = true;

    /** The underlying InputStreamEntity being delegated to */
    private InputStreamEntity inputStreamRequestEntity;

    /** The InputStream containing the content to write out */
    private InputStream content;

    private static final Log log = LogFactory
            .getLog(RepeatableInputStreamRequestEntity.class);

    /**
     * Record the original exception if we do attempt a retry, so that if the
     * retry fails, we can report the original exception. Otherwise, we're most
     * likely masking the real exception with an error about not being able to
     * reset far enough back in the input stream.
     */
    private IOException originalException;


    /**
     * Creates a new RepeatableInputStreamRequestEntity using the information
     * from the specified request. If the input stream containing the request's
     * contents is repeatable, then this RequestEntity will report as being
     * repeatable.
     *
     * @param request
     *            The details of the request being written out (content type,
     *            content length, and content).
     */
    public RepeatableInputStreamRequestEntity(final Request<?> request) {
        setChunked(false);

        /*
         * If we don't specify a content length when we instantiate our
         * InputStreamRequestEntity, then HttpClient will attempt to
         * buffer the entire stream contents into memory to determine
         * the content length.
         *
         * TODO: It'd be nice to have easier access to content length and
         *       content type from the request, instead of having to look
         *       directly into the headers.
         */
        long contentLength = -1;
        try {
            String contentLengthString = request.getHeaders().get("Content-Length");
            if (contentLengthString != null) {
                contentLength = Long.parseLong(contentLengthString);
            }
        } catch (NumberFormatException nfe) {
            log.warn("Unable to parse content length from request.  " +
                    "Buffering contents in memory.");
        }

        String contentType = request.getHeaders().get("Content-Type");
        ThroughputMetricType type = ServiceMetricTypeGuesser
                .guessThroughputMetricType(request,
                        ServiceMetricType.UPLOAD_THROUGHPUT_NAME_SUFFIX,
                        ServiceMetricType.UPLOAD_BYTE_COUNT_NAME_SUFFIX);

        content = getContent(request);
        inputStreamRequestEntity = (type == null) ? new InputStreamEntity(content, contentLength) :
                new MetricInputStreamEntity(type, content, contentLength);
        inputStreamRequestEntity.setContentType(contentType);

        setContent(content);
        setContentType(contentType);
        setContentLength(contentLength);
    }

    /**
     * @return The request content input stream or an empty input stream if there is no content.
     */
    private InputStream getContent(Request<?> request) {
        return (request.getContent() == null) ? new ByteArrayInputStream(new byte[0]) :
                request.getContent();
    }

    @Override
    public boolean isChunked() {
        return false;
    }

    /**
     * Returns true if the underlying InputStream supports marking/reseting or
     * if the underlying InputStreamRequestEntity is repeatable (i.e. its
     * content length has been set to
     * {@link InputStreamRequestEntity#CONTENT_LENGTH_AUTO} and therefore its
     * entire contents will be buffered in memory and can be repeated).
     *
     * @see org.apache.commons.httpclient.methods.RequestEntity#isRepeatable()
     */
    @Override
    public boolean isRepeatable() {
        return content.markSupported() || inputStreamRequestEntity.isRepeatable();
    }

    /**
     * Resets the underlying InputStream if this isn't the first attempt to
     * write out the request, otherwise simply delegates to
     * InputStreamRequestEntity to write out the data.
     * <p>
     * If an error is encountered the first time we try to write the request
     * entity, we remember the original exception, and report that as the root
     * cause if we continue to encounter errors, rather than masking the
     * original error.
     *
     * @see org.apache.commons.httpclient.methods.RequestEntity#writeRequest(java.io.OutputStream)
     */
    @Override
    public void writeTo(OutputStream output) throws IOException {
        try {
            if (!firstAttempt && isRepeatable()) content.reset();

            firstAttempt = false;
            inputStreamRequestEntity.writeTo(output);
        } catch (IOException ioe) {
            if (originalException == null) originalException = ioe;
            throw originalException;
        }
    }

}
