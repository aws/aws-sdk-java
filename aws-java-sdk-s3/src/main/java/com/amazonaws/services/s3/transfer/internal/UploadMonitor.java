/*
 * Copyright 2011-2021 Amazon Technologies, Inc.
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
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.transfer.PauseResult;
import com.amazonaws.services.s3.transfer.PauseStatus;
import com.amazonaws.services.s3.transfer.PersistableUpload;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.internal.future.CompletedFuture;
import com.amazonaws.services.s3.transfer.internal.future.FailedFuture;
import com.amazonaws.services.s3.transfer.internal.future.DelegatingFuture;
import com.amazonaws.services.s3.transfer.model.UploadResult;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Manages an upload by periodically checking to see if the upload is done, and
 * returning a result if so. Otherwise, schedules a copy of itself to be run in
 * the futureReference and returns null. When waiting on the result of this class via a
 * Future object, clients must call {@link UploadMonitor#isDone()} and
 * {@link UploadMonitor#getFuture()}
 */
public class UploadMonitor implements Callable<Void>, TransferMonitor {
    private final AmazonS3 s3;
    private final PutObjectRequest origReq;
    private final ProgressListenerChain listener;
    private final UploadCallable multipartUploadCallable;
    private final UploadImpl transfer;
    private final ExecutorService threadPool;

    private final DelegatingFuture<UploadResult> resultFuture = new DelegatingFuture<UploadResult>();
    private final DelegatingFuture<Void> initiateUploadFuture = new DelegatingFuture<Void>();

    public Future<UploadResult> getFuture() {
        return resultFuture;
    }

    public synchronized boolean isDone() {
        return resultFuture.isDone();
    }

    /**
     * Constructs a new upload watcher and then immediately submits it to
     * the thread pool.
     *
     * @param manager
     *            The {@link TransferManager} that owns this upload.
     * @param transfer
     *            The transfer being processed.
     * @param threadPool
     *            The {@link ExecutorService} to which we should submit new
     *            tasks.
     * @param multipartUploadCallable
     *            The callable responsible for processing the upload
     *            asynchronously
     * @param putObjectRequest
     *            The original putObject request
     * @param progressListenerChain
     *            A chain of listeners that wish to be notified of upload
     *            progress
     */
    public static UploadMonitor create(
            TransferManager manager,
            UploadImpl transfer,
            ExecutorService threadPool,
            UploadCallable multipartUploadCallable,
            PutObjectRequest putObjectRequest,
            ProgressListenerChain progressListenerChain) {
        UploadMonitor uploadMonitor = new UploadMonitor(manager, transfer,
                threadPool, multipartUploadCallable, putObjectRequest,
                progressListenerChain);

        uploadMonitor.initiateUploadFuture.setDelegate(threadPool.submit(uploadMonitor));

        return uploadMonitor;
    }

    private UploadMonitor(TransferManager manager, UploadImpl transfer, ExecutorService threadPool,
            UploadCallable multipartUploadCallable, PutObjectRequest putObjectRequest,
            ProgressListenerChain progressListenerChain) {
        this.s3 = manager.getAmazonS3Client();
        this.multipartUploadCallable = multipartUploadCallable;
        this.origReq = putObjectRequest;
        this.listener = progressListenerChain;
        this.transfer = transfer;
        this.threadPool = threadPool;
    }


    @Override
    public Void call() {
        try {
            UploadResult result = multipartUploadCallable.call();

            // If the result is null, it is a multi-part parallel upload. So, a new task is submitted for initiating a complete
            // multi part upload request.
            if (result == null) {
                CompleteMultipartUpload completeTask =
                    new CompleteMultipartUpload(multipartUploadCallable.getMultipartUploadId(),
                                                s3,
                                                origReq,
                                                multipartUploadCallable.getFutures(),
                                                multipartUploadCallable.getETags(),
                                                listener,
                                                this);

                resultFuture.setDelegate(threadPool.submit(completeTask));
            } else {
                setTransferStateToCompleted();
                resultFuture.setDelegate(new CompletedFuture<UploadResult>(result));
            }
        } catch (CancellationException e) {
            transfer.setState(TransferState.Canceled);
            publishProgress(listener, ProgressEventType.TRANSFER_CANCELED_EVENT);
            SdkClientException exception = new SdkClientException("Upload canceled");
            resultFuture.setDelegate(new FailedFuture<UploadResult>(exception));
        } catch (Throwable e) {
            transfer.setState(TransferState.Failed);
            resultFuture.setDelegate(new FailedFuture<UploadResult>(e));
        }

        return null;
    }

    void setTransferStateToCompleted() {
        transfer.setState(TransferState.Completed);

        // AmazonS3Client takes care of all the events for single part uploads,
        // so we only need to send a completed event for multipart uploads.
        if (multipartUploadCallable.isMultipartUpload()) {
            publishProgress(listener, ProgressEventType.TRANSFER_COMPLETED_EVENT);
        }
    }

    void setTransferStateToFailed() {
        transfer.setState(TransferState.Failed);
    }

    /**
     * Cancels the futures in the following cases - If the user has requested
     * for forcefully aborting the transfers. - If the upload is a multi part
     * parellel upload. - If the upload operation hasn't started. Cancels all
     * the in flight transfers of the upload if applicable. Returns the
     * multi-part upload Id in case of the parallel multi-part uploads. Returns
     * null otherwise.
     */
    PauseResult<PersistableUpload> pause(boolean forceCancel) {

        PersistableUpload persistableUpload = multipartUploadCallable.getPersistableUpload();
        if (persistableUpload == null) {
            PauseStatus pauseStatus = TransferManagerUtils.determinePauseStatus(transfer.getState(), forceCancel);
            if (forceCancel) {
                cancelTransferFutures();
                multipartUploadCallable.safelyAbortMultipartUpload(initiateUploadFuture);
            }
            return new PauseResult<PersistableUpload>(pauseStatus);
        }
        initiateUploadFuture.cancel(true);
        cancelTransferFutures();
        return new PauseResult<PersistableUpload>(PauseStatus.SUCCESS, persistableUpload);
    }

    /**
     * Cancels the inflight transfers if they are not completed.
     */
    private void cancelTransferFutures() {
        resultFuture.cancel(true);
        multipartUploadCallable.getFutures().cancel(true);
    }

    /**
     * Cancels all the futures associated with this upload operation. Also
     * cleans up the parts on Amazon S3 if the upload is performed as a
     * multi-part upload operation.
     */
    void performAbort() {
        cancelTransferFutures();
        multipartUploadCallable.safelyAbortMultipartUpload(initiateUploadFuture);
        publishProgress(listener, ProgressEventType.TRANSFER_CANCELED_EVENT);
    }
}
