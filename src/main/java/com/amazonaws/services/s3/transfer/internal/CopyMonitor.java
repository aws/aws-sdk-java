/*
 * Copyright 2011-2014 Amazon Technologies, Inc.
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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.model.CopyResult;

/**
 * Monitors an copy operation by periodically checking to see if the operation is
 * completed, and returning a result if so. Otherwise, schedules a copy of
 * itself to be run in the future. When waiting on the result
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
    private final CopyObjectRequest copyObjectRequest;
    /**
     * Thread pool used for scheduling the monitor to check if the copy
     * operation is completed.
     */
    private ScheduledExecutorService timedThreadPool;
    /** Reference to the CopyCallable that is used for initiating copy requests. */
    private final CopyCallable multipartCopyCallable;
    private final CopyImpl transfer;
    private final ProgressListenerCallbackExecutor progressListenerChainCallbackExecutor;

    /*
     * State for tracking the upload's progress
     */
    private String uploadId;
    private final List<Future<PartETag>> futures = new ArrayList<Future<PartETag>>();

    /*
     * State for clients wishing to poll for completion
     */
    private boolean isCopyDone = false;
    private Future<CopyResult> nextFuture;

    public synchronized Future<CopyResult> getFuture() {
        return nextFuture;
    }

    private synchronized void setNextFuture(Future<CopyResult> nextFuture) {
        this.nextFuture = nextFuture;
    }

    public synchronized boolean isDone() {
        return isCopyDone;
    }

    private synchronized void markAllDone() {
        isCopyDone = true;
    }

    // TODO: this could be configured in the configuration object (which we're
    // not using right now)
    private int pollInterval = 5000;

    /**
     * Constructs a new watcher for copy operation, which immediately submits
     * itself to the thread pool.
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
    public CopyMonitor(TransferManager manager, CopyImpl transfer,
            ExecutorService threadPool, CopyCallable multipartCopyCallable,
            CopyObjectRequest copyObjectRequest,
            ProgressListenerChain progressListenerChain) {

        this.s3 = manager.getAmazonS3Client();
        this.multipartCopyCallable = multipartCopyCallable;
        this.threadPool = threadPool;
        this.copyObjectRequest = copyObjectRequest;
        this.transfer = transfer;
        this.progressListenerChainCallbackExecutor = ProgressListenerCallbackExecutor
                .wrapListener(progressListenerChain);

        setNextFuture(threadPool.submit(this));
    }

    @Override
    public CopyResult call() throws Exception {
        try {
            if (uploadId == null) {
                return copy();
            } else {
                return poll();
            }
        } catch (CancellationException e) {
            transfer.setState(TransferState.Canceled);
            fireProgressEvent(ProgressEvent.CANCELED_EVENT_CODE);
            throw new AmazonClientException("Upload canceled");
        } catch (Exception e) {
            transfer.setState(TransferState.Failed);
            fireProgressEvent(ProgressEvent.FAILED_EVENT_CODE);
            throw e;
        }
    }

    public void setTimedThreadPool(ScheduledExecutorService timedThreadPool) {
        this.timedThreadPool = timedThreadPool;
    }

    /**
     * Polls for a result from a multi-part copy operation and either returns it
     * if complete, or reschedules to poll again later if not.
     */
    private CopyResult poll() throws InterruptedException {
        for (Future<PartETag> f : futures) {
            if (!f.isDone()) {
                reschedule();
                return null;
            }
        }

        for (Future<PartETag> f : futures) {
            if (f.isCancelled()) {
                throw new CancellationException();
            }
        }

        return completeMultipartUpload();
    }

    private void fireProgressEvent(final int eventType) {
        if (progressListenerChainCallbackExecutor == null)
            return;
        ProgressEvent event = new ProgressEvent(0);
        event.setEventCode(eventType);
        progressListenerChainCallbackExecutor.progressChanged(event);
    }

    /**
     * Initiates the copy operation and checks on the result. If it has
     * completed, returns the result; otherwise, reschedules to check back
     * later.
     */
    private CopyResult copy() throws Exception, InterruptedException {

        CopyResult result = multipartCopyCallable.call();

        if (result != null) {
            copyComplete();
        } else {
            uploadId = multipartCopyCallable.getMultipartUploadId();
            futures.addAll(multipartCopyCallable.getFutures());
            reschedule();
        }

        return result;
    }

    private void copyComplete() {
        markAllDone();

        transfer.setState(TransferState.Completed);

        // AmazonS3Client takes care of all the events for single part uploads,
        // so we only need to send a completed event for multipart uploads.
        if (multipartCopyCallable.isMultipartCopy()) {
            fireProgressEvent(ProgressEvent.COMPLETED_EVENT_CODE);
        }
    }

    private void reschedule()  {
        setNextFuture(timedThreadPool.schedule(new Callable<CopyResult>() {
            public CopyResult call() throws Exception {
                setNextFuture(threadPool.submit(CopyMonitor.this));
                return null;
            }
        }, pollInterval, TimeUnit.MILLISECONDS));
    }

    /**
     * Completes the multipart upload and returns the result.
     */
    private CopyResult completeMultipartUpload() {
        CompleteMultipartUploadResult completeMultipartUploadResult = s3
                .completeMultipartUpload(new CompleteMultipartUploadRequest(
                        copyObjectRequest.getDestinationBucketName(),
                        copyObjectRequest.getDestinationKey(), uploadId,
                        collectPartETags()));

        copyComplete();

        CopyResult copyResult = new CopyResult();
        copyResult.setSourceBucketName(copyObjectRequest.getSourceBucketName());
        copyResult.setSourceKey(copyObjectRequest.getSourceKey());
        copyResult.setDestinationBucketName(completeMultipartUploadResult
                .getBucketName());
        copyResult.setDestinationKey(completeMultipartUploadResult.getKey());
        copyResult.setETag(completeMultipartUploadResult.getETag());
        copyResult.setVersionId(completeMultipartUploadResult.getVersionId());
        return copyResult;
    }

    private List<PartETag> collectPartETags() {
        final List<PartETag> partETags = new ArrayList<PartETag>(futures.size());
        for (Future<PartETag> future : futures) {
            try {
                partETags.add(future.get());
            } catch (Exception e) {
                throw new AmazonClientException("Unable to copy part: "
                        + e.getCause().getMessage(), e.getCause());
            }
        }
        return partETags;
    }
}
