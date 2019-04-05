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
package com.amazonaws.services.s3.model;

import com.amazonaws.event.ProgressEventType;

/**
 * Notification of a progress change on an Amazon S3 transfer. Typically this
 * means notice that another chunk of bytes was transferred, but it also signals
 * other types of progress events such as a transfer starting, or failing.
 *
 * @deprecated Replaced by {@link com.amazonaws.event.ProgressEvent}
 */
@Deprecated
public class ProgressEvent extends com.amazonaws.event.ProgressEvent {

    public ProgressEvent(int bytesTransferred) {
        super(bytesTransferred);
    }

    public ProgressEvent(long bytesTransferred) {
        super(ProgressEventType.BYTE_TRANSFER_EVENT, bytesTransferred);
    }

    public ProgressEvent(ProgressEventType eventType) {
        super(eventType);
    }

    /**
     * @deprecated Replaced by {@link #getBytesTransferred()}. This method
     * <b>SHOULD NEVER</b> be used as it can lead to integer overflow if the
     * number of bytes transferred was greater than {@link Integer#MAX_VALUE}.
     */
    @Deprecated
    public int getBytesTransfered() {
        return (int)getBytesTransferred();
    }

}
