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
package com.amazonaws.services.s3.transfer;

import java.util.concurrent.CountDownLatch;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.internal.MultipleFileTransfer;
import com.amazonaws.services.s3.transfer.internal.TransferStateChangeListener;

final class MultipleFileTransferStateChangeListener implements TransferStateChangeListener {
    private final CountDownLatch latch;
    private final MultipleFileTransfer<?> multipleFileTransfer;

    public MultipleFileTransferStateChangeListener(CountDownLatch latch,
            MultipleFileTransfer<?> multipleFileTransfer) {
        this.latch = latch;
        this.multipleFileTransfer = multipleFileTransfer;
    }

    @Override
    public void transferStateChanged(Transfer upload, TransferState state) {
        // There's a race here: we can't start monitoring the state of
        // individual transfers until we have added all the transfers to the
        // list, or we may incorrectly report completion.
        try {
            latch.await();
        } catch ( InterruptedException e ) {
            throw new SdkClientException("Couldn't wait for all downloads to be queued");
        }

        synchronized (multipleFileTransfer) {
            if ( multipleFileTransfer.getState() == state || multipleFileTransfer.isDone() )
                return;

            /*
             * If we're not already in a terminal state, allow a transition
             * to a non-waiting state. Mark completed if this download is
             * completed and the monitor says all of the rest are as well.
             */
            if ( state == TransferState.InProgress ) {
                multipleFileTransfer.setState(state);
            } else if ( multipleFileTransfer.getMonitor().isDone() ) {
                multipleFileTransfer.collateFinalState();
            } else {
                multipleFileTransfer.setState(TransferState.InProgress);
            }
        }
    }
}
