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

import com.amazonaws.event.request.Progress;
import com.amazonaws.event.request.ProgressSupport;

/**
 * Default implementation for progress tracking.
 */
public class ProgressTracker extends SyncProgressListener {
    public static final ProgressTracker NOOP = new ProgressTracker() {
        @Override public void progressChanged(ProgressEvent progressEvent) {}
    };

    private final Progress progress = new ProgressSupport();

    @Override
    public void progressChanged(ProgressEvent progressEvent) {
        long bytes = progressEvent.getBytes();
        if (bytes <= 0)
            return;
        switch (progressEvent.getEventType()) {
            case REQUEST_CONTENT_LENGTH_EVENT:
                progress.addRequestContentLength(bytes);
                break;
            case RESPONSE_CONTENT_LENGTH_EVENT:
                progress.addResponseContentLength(bytes);
                break;
            case REQUEST_BYTE_TRANSFER_EVENT:
                progress.addRequestBytesTransferred(bytes);
                break;
            case RESPONSE_BYTE_TRANSFER_EVENT:
                progress.addResponseBytesTransferred(bytes);
                break;
            case HTTP_REQUEST_CONTENT_RESET_EVENT:
                progress.addRequestBytesTransferred(0-bytes);
                break;
            case HTTP_RESPONSE_CONTENT_RESET_EVENT: 
            case RESPONSE_BYTE_DISCARD_EVENT: 
                progress.addResponseBytesTransferred(0-bytes);
                break;
            default:
                break;
        }
    }
    
    public Progress getProgress() { return progress; }
}
