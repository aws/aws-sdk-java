/*
 * Copyright 2012-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.transfer.internal;

import java.io.IOException;
import java.util.Collection;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.transfer.Download;
import com.amazonaws.services.s3.transfer.MultipleFileDownload;
import com.amazonaws.services.s3.transfer.Transfer;
import com.amazonaws.services.s3.transfer.TransferProgress;

/**
 * Multiple file download when downloading an entire virtual directory.
 */
public class MultipleFileDownloadImpl extends MultipleFileTransfer implements MultipleFileDownload {

    private final String keyPrefix;
    private final String bucketName;
    
    public MultipleFileDownloadImpl(String description, TransferProgress transferProgress,
            ProgressListenerChain progressListenerChain, String keyPrefix, String bucketName, Collection<? extends Download> downloads) {
        super(description, transferProgress, progressListenerChain, downloads);
        this.keyPrefix = keyPrefix;
        this.bucketName = bucketName;
    }
    
    /**
     * @deprecated Replaced by {@link #MultipleFileDownloadImpl(String, TransferProgress, ProgressListenerChain, String, String, Collection)}
     */
    @Deprecated
    public MultipleFileDownloadImpl(String description, TransferProgress transferProgress,
            com.amazonaws.services.s3.transfer.internal.ProgressListenerChain progressListenerChain, String keyPrefix, String bucketName, Collection<? extends Download> downloads) {
        this(description, transferProgress, progressListenerChain.transformToGeneralProgressListenerChain(), 
                keyPrefix, bucketName, downloads);
    }

    /**
     * Returns the key prefix of the virtual directory being downloaded.
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }
    
    /**
     * Returns the name of the bucket from which files are downloaded.
     */
    public String getBucketName() {
        return bucketName;
    }
   
    /**
     * Waits for this transfer to complete. This is a blocking call; the current
     * thread is suspended until this transfer completes.
     *
     * @throws AmazonClientException
     *             If any errors were encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     * @throws InterruptedException
     *             If this thread is interrupted while waiting for the transfer
     *             to complete.
     */
    @Override
    public void waitForCompletion()
            throws AmazonClientException, AmazonServiceException, InterruptedException {
        if (subTransfers.isEmpty())
            return;
        super.waitForCompletion();
    }
    
    /**
     * Aborts all outstanding downloads.
     */
    public void abort() throws IOException {
        /*
         * The abort() method of DownloadImpl would attempt to notify its
         * TransferStateChangeListener BEFORE it releases its intrinsic lock.
         * And according to the implementation of
         * MultipleFileTransferStateChangeListener which is actually shared by
         * all sub-transfers, it will call the synchronized method isDone() on
         * ALL sub-transfer objects. This would result in serious
         * contention with the worker threads who try to acquire the same set of
         * locks to call setState().
         * In order to prevent this. we should first cancel all download jobs and
         * then notify the listener.
         */
        
        /* First abort all the download jobs without notifying the state change listener.*/
        for (Transfer fileDownload : subTransfers) {
            ((DownloadImpl)fileDownload).abortWithoutNotifyingStateChangeListener();
        }
        
        /*
         * All sub-transfers are already in CANCELED state. Now the main thread
         * is able to check isDone() on each sub-transfer object without
         * contention with worker threads.
         */
        for (Transfer fileDownload : subTransfers) {
            ((DownloadImpl)fileDownload).notifyStateChangeListeners(TransferState.Canceled);
        }
    }
}
