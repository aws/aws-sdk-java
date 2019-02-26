/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.transfer;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressEventFilter;
import com.amazonaws.event.ProgressEventType;

final class TransferCompletionFilter implements ProgressEventFilter {
    @Override
    public ProgressEvent filter(ProgressEvent progressEvent) {
        // Block COMPLETE events from the low-level GetObject operation,
        // but we still want to keep the BytesTransferred
        return progressEvent.getEventType() == ProgressEventType.TRANSFER_COMPLETED_EVENT
             ? null // discard this event
             : progressEvent
             ;
    }
}
