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
package com.amazonaws.event.request;

import com.amazonaws.annotation.ThreadSafe;

/**
 * An actual implementation to represent the progress of a request/response.
 */
@ThreadSafe
public class ProgressSupport extends Progress {
    /* Request transfer progress */
    private volatile long requestContentLength = -1;
    private volatile long requestBytesTransferred;

    /* Response transfer progress */
    private volatile long responseContentLength = -1;
    private volatile long responseBytesTransferred;

    private static final Object lock = new Object();

    /**
     * Returns the number of bytes to be expected in the request, or -1 if the
     * number is unknown (e.g. when the request is still not serialized yet, or
     * when the request contains raw InputStream as the payload in which case
     * the SDK cannot infer the content-length in advance).
     */
    @Override
    public long getRequestContentLength() {
        return requestContentLength;
    }

    /**
     * Adds the number of bytes to be expected in the request.
     */
    @Override
    public void addRequestContentLength(long contentLength) {
        if (contentLength < 0)
            throw new IllegalArgumentException();
        synchronized(lock) {
            if (this.requestContentLength == -1)
                this.requestContentLength = contentLength;
            else
                this.requestContentLength += contentLength;
        }
    }

    /**
     * Returns the number of bytes that have been transferred in the request.
     */
    @Override
    public long getRequestBytesTransferred() {
        return requestBytesTransferred;
    }

    /**
     * Returns the number of bytes to be expected in the response, or -1 if the
     * number is unknown (e.g. when the client hasn't received the response
     * yet).
     */
    @Override
    public long getResponseContentLength() {
        return responseContentLength;
    }

    /**
     * Adds the number of bytes to be expected in the response.
     */
    @Override
    public void addResponseContentLength(long contentLength) {
        if (contentLength < 0)
            throw new IllegalArgumentException();
        synchronized(lock) {
            if (this.responseContentLength == -1)
                this.responseContentLength = contentLength;
            else
                this.responseContentLength += contentLength;
        }
    }

    /**
     * Returns the number of bytes that have been transferred in the response.
     */
    @Override
    public long getResponseBytesTransferred() {
        return responseBytesTransferred;
    }

    @Override
    public void addRequestBytesTransferred(long bytes) {
        synchronized (lock) {
            requestBytesTransferred += bytes;
        }
    }

    @Override
    public void addResponseBytesTransferred(long bytes) {
        synchronized(lock) {
            responseBytesTransferred += bytes;
        }
    }

    @Override
    public String toString() {
        return String.format("Request: %d/%d, Response: %d/%d",
                requestBytesTransferred, requestContentLength,
                responseBytesTransferred, responseContentLength);
    }

    @Override
    public final boolean isEnabled() { return true; }
}