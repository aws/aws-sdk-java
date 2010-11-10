/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Describes the progress of a transfer.
 */
public abstract class TransferProgress {
    protected long bytesTransfered = 0;
    protected long totalBytesToTransfer = -1;
    
    /**
     * Returns the number of bytes completed in the associated transfer.
     * 
     * @return The number of bytes completed in the associated transfer.
     */
    public long getBytesTransfered() {
        return bytesTransfered;
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
     * Returns a percentage of the number of bytes transfered out of the total
     * number of bytes to transfer.
     * 
     * @return A percentage of the number of bytes transfered out of the total
     *         number of bytes to transfer.
     */
    public double getPercentTransfered() {
        if (getBytesTransfered() < 0) return 0;
        
        return ((double)getBytesTransfered() / (double)getTotalBytesToTransfer()) * (double)100;
    }
}