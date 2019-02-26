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
 * Base class used to represent the progress of a logical request/response,
 * which may correspond to either be a physical http request/response, or
 * multiple requests/responses as in a composite operation such as
 * multi-part uploads.
 * 
 * @see ProgressSupport
 */
@ThreadSafe
public class Progress {
    public static final Progress NOOP = new Progress();
    private static final String MSG = "No progress tracking configured";
    protected Progress() {}

    /**
     * Returns true if progress tracking is enabled; false otherwise.
     */
    public boolean isEnabled() { return false; }
    /**
     * @param bytes can be negative if it was a reset event.
     */
    public void addRequestBytesTransferred(long bytes) {}
    /**
     * @param bytes can be negative if it was a reset event.
     */
    public void addResponseBytesTransferred(long bytes) {}

    public long getRequestContentLength() { 
        throw new UnsupportedOperationException(MSG);
    }

    public void addRequestContentLength(long contentLength) {}
    public long getRequestBytesTransferred() { 
        throw new UnsupportedOperationException(MSG);
    }

    public long getResponseContentLength() {
        throw new UnsupportedOperationException(MSG);
    }

    public void addResponseContentLength(long contentLength) {}

    public long getResponseBytesTransferred() {
        throw new UnsupportedOperationException(MSG);
    }
}