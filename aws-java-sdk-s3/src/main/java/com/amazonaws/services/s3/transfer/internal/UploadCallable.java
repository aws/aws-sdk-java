/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.event.SDKProgressPublisher.publishProgress;

import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Encryption;
import com.amazonaws.services.s3.AmazonS3EncryptionV2;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.EncryptedInitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.EncryptedPutObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.transfer.PersistableUpload;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerConfiguration;
import com.amazonaws.services.s3.transfer.TransferProgress;
import com.amazonaws.services.s3.transfer.internal.future.CompletedFuture;
import com.amazonaws.services.s3.transfer.internal.future.CompositeFuture;
import com.amazonaws.services.s3.transfer.internal.future.DelegatingFuture;
import com.amazonaws.services.s3.transfer.internal.future.FutureImpl;
import com.amazonaws.services.s3.transfer.model.UploadResult;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UploadCallable implements Callable<UploadResult> {
    private static final Log log = LogFactory.getLog(UploadCallable.class);

    private final AmazonS3 s3;
    private final ExecutorService threadPool;
    private final PutObjectRequest origReq;
    private final FutureImpl<String> multipartUploadId = new FutureImpl<String>();
    private final UploadImpl upload;

    private final TransferManagerConfiguration configuration;
    private final DelegatingFuture<List<PartETag>> partsFuture = new DelegatingFuture<List<PartETag>>();
    private final ProgressListenerChain listener;
    private final TransferProgress transferProgress;

    /**
     * ETags retrieved from Amazon S3 for a multi-part upload id. These parts
     * will be skipped while resuming a paused upload.
     */
    private final List<PartETag> eTagsToSkip = new ArrayList<PartETag>();

    /**
     * The amount of time (in seconds) to wait for a {@link #multipartUploadId} when {@link #safelyAbortMultipartUpload} is
     * invoked. We use a finite amount of time (instead of waiting indefinitely) in case something went horribly wrong and the
     * multipart upload ID future was not completed.
     *
     * This should be at least as long as it takes to finish an initiate-multipart-upload call.
     */
    private final int MULTIPART_UPLOAD_ID_RETRIEVAL_TIMEOUT_SECONDS = 30;

    private PersistableUpload persistableUpload;

    private final AtomicReference<State> state = new AtomicReference<State>(State.BEFORE_INITIATE);

    private final AtomicBoolean abortRequestSent = new AtomicBoolean(false);

    public UploadCallable(TransferManager transferManager,
            ExecutorService threadPool, UploadImpl upload,
            PutObjectRequest origReq,
            ProgressListenerChain progressListenerChain, String uploadId,
            TransferProgress transferProgress) {
        this.s3 = transferManager.getAmazonS3Client();
        this.configuration = transferManager.getConfiguration();

        this.threadPool = threadPool;
        this.origReq = origReq;
        this.listener = progressListenerChain;
        this.upload = upload;
        this.transferProgress = transferProgress;

        // We only have an upload ID if we are resuming a multipart upload.
        if (uploadId != null) {
            this.multipartUploadId.complete(uploadId);
        }
    }

    Future<List<PartETag>> getFutures() {
        return partsFuture;
    }

    /**
     * Returns the ETags retrieved from Amazon S3 for a multi-part upload id.
     * These parts will be skipped while resuming a paused upload.
     */
    List<PartETag> getETags() {
        return eTagsToSkip;
    }

    String getMultipartUploadId() {
        return multipartUploadId.getOrThrowUnchecked("Failed to retrieve multipart upload ID.");
    }

    /**
     * Returns true if this UploadCallable is processing a multipart upload.
     * @return True if this UploadCallable is processing a multipart upload.
     */
    public boolean isMultipartUpload() {
        return TransferManagerUtils.shouldUseMultipartUpload(origReq, configuration);
    }

    public UploadResult call() throws Exception {
        try {
            upload.setState(TransferState.InProgress);
            if (isMultipartUpload()) {
                publishProgress(listener, ProgressEventType.TRANSFER_STARTED_EVENT);
                return uploadInParts();
            } else {
                return uploadInOneChunk();
            }
        } finally {
            // Make sure that the parts futures is always initialized as part of the call().
            // Note: If an exception is thrown, we still use a successful future with an empty list,
            // because the parts future communicates the status of the *parts*, not the overall upload.
            partsFuture.setDelegateIfUnset(new CompletedFuture<List<PartETag>>(Collections.<PartETag>emptyList()));

            // Fail-safe: Make sure that the multipart upload ID future is always initialized as part of the call().
            multipartUploadId.complete(null);
        }
    }

    /**
     * Uploads the given request in a single chunk and returns the result.
     */
    private UploadResult uploadInOneChunk() {
        // Not a multipart upload, so no multipart upload ID.
        multipartUploadId.complete(null);

        PutObjectResult putObjectResult = s3.putObject(origReq);

        UploadResult uploadResult = new UploadResult();
        uploadResult.setBucketName(origReq.getBucketName());
        uploadResult.setKey(origReq.getKey());
        uploadResult.setETag(putObjectResult.getETag());
        uploadResult.setVersionId(putObjectResult.getVersionId());
        return uploadResult;
    }

    /**
     * Captures the state of the upload.
     */
    private void captureUploadStateIfPossible(String multipartUploadId) {
        if (origReq.getSSECustomerKey() == null) {
            persistableUpload = new PersistableUpload(origReq.getBucketName(),
                    origReq.getKey(), origReq.getFile()
                            .getAbsolutePath(), multipartUploadId,
                    configuration.getMinimumUploadPartSize(),
                    configuration.getMultipartUploadThreshold());
            notifyPersistableTransferAvailability();
        }
    }

    public PersistableUpload getPersistableUpload() {
        return persistableUpload;
    }

    /**
     * Notifies to the callbacks that state is available
     */
    private void notifyPersistableTransferAvailability() {
        S3ProgressPublisher.publishTransferPersistable(
                listener, persistableUpload);
    }

    /**
     * Uploads the request in multiple chunks, submitting each upload chunk task
     * to the thread pool and recording its corresponding Future object, as well
     * as the multipart upload id.
     */
    private UploadResult uploadInParts() throws Exception {
        boolean isUsingEncryption = s3 instanceof AmazonS3Encryption || s3 instanceof AmazonS3EncryptionV2;
        long optimalPartSize = getOptimalPartSize(isUsingEncryption);

        try {
            // Get a multipart upload ID, either using one we already have (e.g. because of a resume), or creating a new one.
            String uploadId = multipartUploadId.isDone() ? multipartUploadId.get()
                                                         : initiateMultipartUpload(origReq, isUsingEncryption);

            UploadPartRequestFactory requestFactory = new UploadPartRequestFactory(origReq, uploadId, optimalPartSize);

            if (TransferManagerUtils.isUploadParallelizable(origReq, isUsingEncryption)) {
                captureUploadStateIfPossible(uploadId);
                uploadPartsInParallel(requestFactory, uploadId);
                return null;
            } else {
                return uploadPartsInSeries(requestFactory, uploadId);
            }
        } catch (Exception e) {
            publishProgress(listener, ProgressEventType.TRANSFER_FAILED_EVENT);

            if (multipartUploadId.isDone()) {
                abortMultipartUpload(multipartUploadId.get());
            }
            throw e;
        } finally {
            if (origReq.getInputStream() != null) {
                try {origReq.getInputStream().close(); } catch (Exception e) {
                    log.warn("Unable to cleanly close input stream: " + e.getMessage(), e);
                }
            }
        }
    }

    void safelyAbortMultipartUpload(Future<?> future) {
        if (multipartUploadId.isDone()) {
            state.set(State.ABORTED);
            abortMultipartUpload(getUploadIdOrTimeout());
        } else if (state.compareAndSet(State.BEFORE_INITIATE, State.ABORTED)) {
            // No need to abort a multipart upload. We didn't start one.
        } else if (state.compareAndSet(State.INITIATED, State.ABORTED)) {
            // We have initiated a multipart upload already. Abort it.
            abortMultipartUpload(getUploadIdOrTimeout());
        }

        future.cancel(true);
    }

    private String getUploadIdOrTimeout() {
        try {
            return multipartUploadId.get(MULTIPART_UPLOAD_ID_RETRIEVAL_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to retrieve an upload ID after " +
                                            MULTIPART_UPLOAD_ID_RETRIEVAL_TIMEOUT_SECONDS + " seconds.");
        }
    }

    private void abortMultipartUpload(String multipartUploadId) {
        if (multipartUploadId == null) {
            return;
        }

        if (!abortRequestSent.compareAndSet(false, true)) {
            // Request already sent.
            return;
        }

        try {
            AbortMultipartUploadRequest abortRequest = new AbortMultipartUploadRequest(origReq.getBucketName(), origReq.getKey(),
                                                                                       multipartUploadId)
                .withRequesterPays(origReq.isRequesterPays())
                .withRequestCredentialsProvider(origReq.getRequestCredentialsProvider());
            s3.abortMultipartUpload(abortRequest);
        } catch (Exception e2) {
            log.info(
                "Unable to abort multipart upload, you may need to manually remove uploaded parts: "
                + e2.getMessage(), e2);
        }
    }

    /**
     * Computes and returns the optimal part size for the upload.
     */
    private long getOptimalPartSize(boolean isUsingEncryption) {
        long optimalPartSize = TransferManagerUtils.calculateOptimalPartSize(origReq, configuration);
        if (isUsingEncryption && optimalPartSize % 32 > 0) {
            // When using encryption, parts must line up correctly along cipher block boundaries
            optimalPartSize = optimalPartSize - (optimalPartSize % 32) + 32 ;
        }
        log.debug("Calculated optimal part size: " + optimalPartSize);
        return optimalPartSize;
    }

    /**
     * Uploads all parts in the request in serial in this thread, then completes
     * the upload and returns the result.
     */
    private UploadResult uploadPartsInSeries(UploadPartRequestFactory requestFactory, String multipartUploadId) {

        final List<PartETag> partETags = new ArrayList<PartETag>();

        while (requestFactory.hasMoreRequests()) {
            if (threadPool.isShutdown()) throw new CancellationException("TransferManager has been shutdown");
            UploadPartRequest uploadPartRequest = requestFactory.getNextUploadPartRequest();
            // Mark the stream in case we need to reset it
            InputStream inputStream = uploadPartRequest.getInputStream();
            if (inputStream != null && inputStream.markSupported()) {
                if (uploadPartRequest.getPartSize() >= Integer.MAX_VALUE) {
                    inputStream.mark(Integer.MAX_VALUE);
                } else {
                    inputStream.mark((int)uploadPartRequest.getPartSize());
                }
            }
            partETags.add(s3.uploadPart(uploadPartRequest).getPartETag());
        }

        CompleteMultipartUploadRequest req =
            new CompleteMultipartUploadRequest(
                origReq.getBucketName(), origReq.getKey(), multipartUploadId,
                    partETags)
                    .withRequesterPays(origReq.isRequesterPays())
            .withGeneralProgressListener(origReq.getGeneralProgressListener())
            .withRequestMetricCollector(origReq.getRequestMetricCollector())
            .withRequestCredentialsProvider(origReq.getRequestCredentialsProvider());

        CompleteMultipartUploadResult res = s3.completeMultipartUpload(req);

        UploadResult uploadResult = new UploadResult();
        uploadResult.setBucketName(res.getBucketName());
        uploadResult.setKey(res.getKey());
        uploadResult.setETag(res.getETag());
        uploadResult.setVersionId(res.getVersionId());
        return uploadResult;
    }

    /**
     * Submits a callable for each part to upload to our thread pool and records its corresponding Future.
     */
    private void uploadPartsInParallel(UploadPartRequestFactory requestFactory,
            String uploadId) {

        Map<Integer,PartSummary> partNumbers = identifyExistingPartsForResume(uploadId);

        List<Future<PartETag>> futures = new ArrayList<Future<PartETag>>();
        try {
            while (requestFactory.hasMoreRequests()) {
                if (threadPool.isShutdown()) throw new CancellationException("TransferManager has been shutdown");
                UploadPartRequest request = requestFactory.getNextUploadPartRequest();
                if (partNumbers.containsKey(request.getPartNumber())) {
                    PartSummary summary = partNumbers.get(request.getPartNumber());
                    eTagsToSkip.add(new PartETag(request.getPartNumber(), summary
                        .getETag()));
                    transferProgress.updateProgress(summary.getSize());
                    continue;
                }
                futures.add(threadPool.submit(new UploadPartCallable(s3, request, shouldCalculatePartMd5())));
            }
        } finally {
            partsFuture.setDelegate(new CompositeFuture<PartETag>(futures));
        }
    }

    private Map<Integer, PartSummary> identifyExistingPartsForResume(
            String uploadId) {
        Map<Integer, PartSummary> partNumbers = new HashMap<Integer, PartSummary>();
        if (uploadId == null) {
            return partNumbers;
        }
        int partNumber = 0;

        while (true) {
            ListPartsRequest listPartsRequest = new ListPartsRequest(
                    origReq.getBucketName(),
                    origReq.getKey(), uploadId)
                    .withPartNumberMarker(partNumber)
                    .withRequesterPays(origReq.isRequesterPays())
                    .withRequestCredentialsProvider(origReq.getRequestCredentialsProvider());

            PartListing parts = s3.listParts(listPartsRequest);
            for (PartSummary partSummary : parts.getParts()) {
                partNumbers.put(partSummary.getPartNumber(), partSummary);
            }
            if (!parts.isTruncated()) {
                return partNumbers;
            }
            partNumber = parts.getNextPartNumberMarker();
        }
    }

    /**
     * Initiates a multipart upload and returns the upload id
     * @param isUsingEncryption
     */
    private String initiateMultipartUpload(PutObjectRequest origReq, boolean isUsingEncryption) {

        InitiateMultipartUploadRequest req = null;
        if (isUsingEncryption && origReq instanceof EncryptedPutObjectRequest) {
            req = new EncryptedInitiateMultipartUploadRequest(
                    origReq.getBucketName(), origReq.getKey()).withCannedACL(
                    origReq.getCannedAcl()).withObjectMetadata(origReq.getMetadata());
            ((EncryptedInitiateMultipartUploadRequest) req)
                    .setMaterialsDescription(((EncryptedPutObjectRequest) origReq).getMaterialsDescription());
        } else {
            req = new InitiateMultipartUploadRequest(origReq.getBucketName(), origReq.getKey())
                .withCannedACL(origReq.getCannedAcl())
                .withObjectMetadata(origReq.getMetadata());
        }

        req.withTagging(origReq.getTagging());

        TransferManager.appendMultipartUserAgent(req);

        req.withAccessControlList(origReq.getAccessControlList())
           .withRequesterPays(origReq.isRequesterPays())
           .withStorageClass(origReq.getStorageClass())
           .withRedirectLocation(origReq.getRedirectLocation())
           .withSSECustomerKey(origReq.getSSECustomerKey())
           .withSSEAwsKeyManagementParams(origReq.getSSEAwsKeyManagementParams())
           .withGeneralProgressListener(origReq.getGeneralProgressListener())
           .withRequestMetricCollector(origReq.getRequestMetricCollector())
           ;

        req.withObjectLockMode(origReq.getObjectLockMode())
           .withObjectLockRetainUntilDate(origReq.getObjectLockRetainUntilDate())
           .withObjectLockLegalHoldStatus(origReq.getObjectLockLegalHoldStatus());

        req.withRequestCredentialsProvider(origReq.getRequestCredentialsProvider());

        if (!state.compareAndSet(State.BEFORE_INITIATE, State.INITIATED)) {
            throw new IllegalStateException("Failed to update state to " + State.INITIATED +
                                            " (State: " + state.get() + ")");
        }

        String uploadId;
        try {
            uploadId = s3.initiateMultipartUpload(req).getUploadId();
            multipartUploadId.complete(uploadId);
        } catch (RuntimeException t) {
            multipartUploadId.complete(null);
            throw t;
        } catch (Error t) {
            multipartUploadId.complete(null);
            throw t;
        }

        log.debug("Initiated new multipart upload: " + uploadId);

        return uploadId;
    }

    private boolean shouldCalculatePartMd5() {
        return origReq.getObjectLockMode() != null
                || origReq.getObjectLockRetainUntilDate() != null
                || origReq.getObjectLockLegalHoldStatus() != null
                || configuration.isAlwaysCalculateMultipartMd5();
    }

    private enum State {
        BEFORE_INITIATE,
        INITIATED,
        ABORTED
    }
}
