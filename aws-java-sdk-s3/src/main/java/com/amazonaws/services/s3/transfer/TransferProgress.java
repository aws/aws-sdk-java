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
package com.amazonaws.services.s3.transfer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Describes the progress of a transfer.
 */
public final class TransferProgress {

    private static final Log log = LogFactory.getLog(TransferProgress.class);
    private volatile long bytesTransferred = 0;
    private volatile long totalBytesToTransfer = -1;

    /**
     * @deprecated Replaced by {@link #getBytesTransferred()}
     */
    public long getBytesTransfered() {
        return getBytesTransferred();
    }

    /**
     * Returns the number of bytes completed in the associated transfer.
     *
     * @return The number of bytes completed in the associated transfer.
     */
    public long getBytesTransferred() {
        return bytesTransferred;
    }

    /**
     * Returns the total size in bytes of the associated transfer, or -1
     * if the total size isn't known.
     *
     * @return The total size in bytes of the associated transfer.
     * 		   Returns or -1 if the total size of the associated
     * 		   transfer isn't known yet.
     */
    public long getTotalBytesToTransfer() {
        return totalBytesToTransfer;
    }

    /**
     * @deprecated Replaced by {@link #getPercentTransferred()}
     */
    @Deprecated
    public synchronized double getPercentTransfered() {
        return getPercentTransferred();
    }

    /**
     * Returns a percentage of the number of bytes transferred out of the total
     * number of bytes to transfer.
     *
     * @return A percentage of the number of bytes transferred out of the total
     *         number of bytes to transfer; or -1.0 if the total length is not known.
     */
    public synchronized double getPercentTransferred() {
        if (getBytesTransferred() < 0) return 0;

        return totalBytesToTransfer < 0
             ? -1.0 
             : ((double)bytesTransferred / (double)totalBytesToTransfer) * (double)100;
    }

    public synchronized void updateProgress(long bytes) {
        this.bytesTransferred += bytes;
        if (totalBytesToTransfer > -1
        &&  this.bytesTransferred > this.totalBytesToTransfer) {
            this.bytesTransferred = this.totalBytesToTransfer;
            if (log.isDebugEnabled()) {
                log.debug("Number of bytes transfered is more than the actual total bytes to transfer. Total number of bytes to Transfer : "
                        + totalBytesToTransfer
                        + ". Bytes Transferred : "
                        + (bytesTransferred + bytes));
            }
        }
    }

    public void setTotalBytesToTransfer(long totalBytesToTransfer) {
        this.totalBytesToTransfer = totalBytesToTransfer;
    }
}
