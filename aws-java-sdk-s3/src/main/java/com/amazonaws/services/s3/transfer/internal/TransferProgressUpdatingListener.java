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
package com.amazonaws.services.s3.transfer.internal;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.SyncProgressListener;
import com.amazonaws.services.s3.transfer.TransferProgress;

public class TransferProgressUpdatingListener extends SyncProgressListener {
    private final TransferProgress transferProgress;

    public TransferProgressUpdatingListener(TransferProgress transferProgress) {
        this.transferProgress = transferProgress;
    }

    public void progressChanged(ProgressEvent progressEvent) {
        long bytes = progressEvent.getBytesTransferred();
        if (bytes == 0)
            return; // only interested in non-zero bytes
        transferProgress.updateProgress(bytes);
    }
}
