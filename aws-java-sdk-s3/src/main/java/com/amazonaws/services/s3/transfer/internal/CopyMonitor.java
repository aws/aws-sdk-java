/*
 * Copyright 2011-2019 Amazon Technologies, Inc.
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

import static com.amazonaws.event.SDKProgressPublisher.publishProgress;

import com.amazonaws.SdkClientException;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.model.CopyResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Monitors an copy operation by periodically checking to see if the operation is
 * completed, and returning a result if so. Otherwise, schedules a copy of
 * itself to be run in the futureReference. When waiting on the result
 * of this class via a Future object, clients must call
 * {@link CopyMonitor#isDone()} and {@link CopyMonitor#getFuture()}
 */
public class CopyMonitor implements Callable<CopyResult>, TransferMonitor {

    /**
     * Reference to the Amazon S3 client object that is used to initiate the copy
     * or copy part request.
     */
    private final AmazonS3 s3;
    /** Thread pool used during multi-part copy is performed. */
    private final ExecutorService threadPool;
    /** A reference to the original copy request received. */
    private final CopyObjectRequest origReq;
    /** Reference to the CopyCallable that is used for initiating copy requests. */
    private final CopyCallable multipartCopyCallable;
    private final CopyImpl transfer;
    private final ProgressListenerChain listener;

    private final List<Future<PartETag>> futures = new ArrayList<Future<PartETag>>();

    /*
     * State for clients wishing to poll for completion
     */
    private boolean isCopyDone = false;
    private AtomicReference<Future<CopyResult>> futureReference = new AtomicReference<Future<CopyResult>>(null);

    public Future<CopyResult> getFuture() {
        return futureReference.get();
    }

    public synchronized boolean isDone() {
        return isCopyDone;
    }

    private synchronized void markAllDone() {
        isCopyDone = true;
    }

    /**
     * Constructs a new watcher for copy operation, and then immediately submits
     * it to the thread pool.
     *
     * @param manager
     *            The {@link TransferManager} that owns this copy request.
     * @param threadPool
     *            The {@link ExecutorService} to which we should submit new
     *            tasks.
     * @param multipartCopyCallable
     *            The callable responsible for processing the copy
     *            asynchronously
     * @param copyObjectRequest
     *            The original CopyObject request
     */
    public static CopyMonitor create(
            TransferManager manager,
            CopyImpl transfer,
            ExecutorService threadPool,
            CopyCallable multipartCopyCallable,
            CopyObjectRequest copyObjectRequest,
            ProgressListenerChain progressListenerChain) {

        CopyMonitor copyMonitor = new CopyMonitor(manager, transfer,
                threadPool, multipartCopyCallable, copyObjectRequest,
                progressListenerChain);
        Future<CopyResult> thisFuture = threadPool.submit(copyMonitor);
        // Use an atomic compareAndSet to prevent a possible race between the
        // setting of the CopyMonitor's futureReference, and setting the
        // CompleteMultipartCopy's futureReference within the call() method.
        // We only want to set the futureReference to CopyMonitor's futureReference if the
        // current value is null, otherwise the futureReference that's set is
        // CompleteMultipartCopy's which is ultimately what we want.
        copyMonitor.futureReference.compareAndSet(null, thisFuture);
        return copyMonitor;
    }

    private CopyMonitor(TransferManager manager, CopyImpl transfer,
                        ExecutorService threadPool, CopyCallable multipartCopyCallable,
                        CopyObjectRequest copyObjectRequest,
                        ProgressListenerChain progressListenerChain) {

        this.s3 = manager.getAmazonS3Client();
        this.multipartCopyCallable = multipartCopyCallable;
        this.origReq = copyObjectRequest;
        this.listener = progressListenerChain;
        this.transfer = transfer;
        this.threadPool = threadPool;
    }

    @Override
    public CopyResult call() throws Exception {
        try {
            CopyResult result = multipartCopyCallable.call();

            if (result == null) {
                futures.addAll(multipartCopyCallable.getFutures());
                futureReference.set(threadPool.submit(new CompleteMultipartCopy(multipartCopyCallable.getMultipartUploadId(), s3, origReq,
                        futures, listener, this)));
            } else {
                copyComplete();
            }
            return result;
        } catch (CancellationException e) {
            transfer.setState(TransferState.Canceled);
            publishProgress(listener, ProgressEventType.TRANSFER_CANCELED_EVENT);
            throw new SdkClientException("Upload canceled");
        } catch (Exception e) {
            transfer.setState(TransferState.Failed);
            publishProgress(listener, ProgressEventType.TRANSFER_FAILED_EVENT);
            throw e;
        }
    }

    void copyComplete() {
        markAllDone();
        transfer.setState(TransferState.Completed);
        // Since the copy has completed we can assume all bytes were successfully transferred
        // This is required since there are no progress updates available during server-side
        // copying of data.
        transfer.getProgress().updateProgress(transfer.getProgress().getTotalBytesToTransfer());
        // AmazonS3Client takes care of all the events for single part uploads,
        // so we only need to send a completed event for multipart uploads.
        if (multipartCopyCallable.isMultipartCopy()) {
            publishProgress(listener, ProgressEventType.TRANSFER_COMPLETED_EVENT);
        }
    }

    /**
     * Marks the copy as a failure.
     */
    void reportFailure() {
        transfer.setState(TransferState.Failed);
    }
}
