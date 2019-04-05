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
package com.amazonaws.test.util;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.SyncProgressListener;
/**
 * Validates the events received by the progress listener.
 */
public class ProgressListenerWithEventCodeVerification extends
        SyncProgressListener {
    private final ProgressEventType[] types;
    private int count;

    public ProgressListenerWithEventCodeVerification(ProgressEventType... types) {
        this.types = types.clone();
    }

    @Override
    public void progressChanged(ProgressEvent progressEvent) {
        ProgressEventType type = progressEvent.getEventType();
        if (type.isByteCountEvent())
            return;
        if (type != types[count]) {
            throw new AssertionError("Expect event type "
                    + types[count] + " but got "
                    + progressEvent.getEventType());
        }
        count++;
    }

    public void reset() {
        count = 0;
    }
}
