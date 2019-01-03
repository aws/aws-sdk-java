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

import static com.amazonaws.event.SDKProgressPublisher.publishProgress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyObjectResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.EncryptedInitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerConfiguration;
import com.amazonaws.services.s3.transfer.model.CopyResult;

/**
 * An implementation of the Callable interface that helps
 * <code>TransferManager</code> in carrying out the copy requests. The call
 * method checks if multi-part copy request can be carried out on the Amazon S3
 * object. This is done by checking the size of the Amazon S3 object being
 * copied.
 *
 * <p>
 * If the size of the object is greater than the preferred size limit, then copy
 * operation is carried out as multi part copy requests to the server.
 * </p>
 * <p>
 * If the size of the object is less than the preferred size limit, the copy
 * operation is carried out in a single request where the Amazon S3 object is
 * transferred as one chunk from the source bucket to the destination bucket.
 * </p>
 *
 */
public class CopyCallable implements Callable<CopyResult> {

    /**
     * A reference to the Amazon S3 client using which copy or copy part
     * requests are initiated.
     */
    private final AmazonS3 s3;
    /** Thread pool used during multi-part copy is performed. */
    private final ExecutorService threadPool;
    /** A reference to the original copy request received. */
    private final CopyObjectRequest copyObjectRequest;
    /** Upload id to be used when sending copy part requests. */
    private String multipartUploadId;
    /** Metadata of the object in the source bucket to be copied. */
    private final ObjectMetadata metadata;
    private final CopyImpl copy;

    private static final Log log = LogFactory.getLog(CopyCallable.class);
    /**
     * <code>TransferManager</code> configuration that provides details on when
     * to use multi-part copy, part size etc.,
     */
    private final TransferManagerConfiguration configuration;
    /**
     * A list of future objects to be returned when multi-part copy is
     * initiated.
     */
    private final List<Future<PartETag>> futures = new ArrayList<Future<PartETag>>();

    private final ProgressListenerChain listenerChain;

    public CopyCallable(TransferManager transferManager,
            ExecutorService threadPool, CopyImpl copy,
            CopyObjectRequest copyObjectRequest, ObjectMetadata metadata,
            ProgressListenerChain progressListenerChain) {
        this.s3 = transferManager.getAmazonS3Client();
        this.configuration = transferManager.getConfiguration();
        this.threadPool = threadPool;
        this.copyObjectRequest = copyObjectRequest;
        this.metadata = metadata;
        this.listenerChain = progressListenerChain;
        this.copy = copy;
    }

    List<Future<PartETag>> getFutures() {
        return futures;
    }

    String getMultipartUploadId() {
        return multipartUploadId;
    }

    /**
     * Returns true if this CopyCallable is processing a multi-part copy.
     *
     * @return True if this CopyCallable is processing a multi-part copy.
     */
    public boolean isMultipartCopy() {
        return metadata.getContentLength() > configuration.getMultipartCopyThreshold();
    }

    public CopyResult call() throws Exception {
        copy.setState(TransferState.InProgress);
        if (isMultipartCopy()) {
            publishProgress(listenerChain, ProgressEventType.TRANSFER_STARTED_EVENT);
            copyInParts();
            return null;
        } else {
            return copyInOneChunk();
        }
    }

    /**
     * Performs the copy of the Amazon S3 object from source bucket to
     * destination bucket. The Amazon S3 object is copied to destination in one
     * single request.
     *
     * @returns CopyResult response information from the server.
     */
    private CopyResult copyInOneChunk() {
        CopyObjectResult copyObjectResult = s3.copyObject(copyObjectRequest);

        CopyResult copyResult = new CopyResult();
        copyResult.setSourceBucketName(copyObjectRequest.getSourceBucketName());
        copyResult.setSourceKey(copyObjectRequest.getSourceKey());
        copyResult.setDestinationBucketName(copyObjectRequest
                .getDestinationBucketName());
        copyResult.setDestinationKey(copyObjectRequest.getDestinationKey());
        copyResult.setETag(copyObjectResult.getETag());
        copyResult.setVersionId(copyObjectResult.getVersionId());
        return copyResult;
    }

    /**
     * Performs the copy of an Amazon S3 object from source bucket to
     * destination bucket as multiple copy part requests. The information about
     * the part to be copied is specified in the request as a byte range
     * (first-last)
     *
     * @throws Exception
     *             Any Exception that occurs while carrying out the request.
     */
    private void copyInParts() throws Exception {
        multipartUploadId = initiateMultipartUpload(copyObjectRequest);

        long optimalPartSize = getOptimalPartSize(metadata.getContentLength());

        try {
            CopyPartRequestFactory requestFactory = new CopyPartRequestFactory(
                    copyObjectRequest, multipartUploadId, optimalPartSize,
                    metadata.getContentLength());
            copyPartsInParallel(requestFactory);
        } catch (Exception e) {
            publishProgress(listenerChain, ProgressEventType.TRANSFER_FAILED_EVENT);
            abortMultipartCopy();
            throw new RuntimeException("Unable to perform multipart copy", e);
        }
    }

    /**
     * Computes and returns the optimal part size for the copy operation.
     */
    private long getOptimalPartSize(long contentLengthOfSource) {

        long optimalPartSize = TransferManagerUtils
                .calculateOptimalPartSizeForCopy(copyObjectRequest,
                        configuration, contentLengthOfSource);
        log.debug("Calculated optimal part size: " + optimalPartSize);
        return optimalPartSize;
    }

    /**
     * Submits a callable for each part to be copied to our thread pool and
     * records its corresponding Future.
     */
    private void copyPartsInParallel(CopyPartRequestFactory requestFactory) {
        while (requestFactory.hasMoreRequests()) {
            if (threadPool.isShutdown())
                throw new CancellationException(
                        "TransferManager has been shutdown");
            CopyPartRequest request = requestFactory.getNextCopyPartRequest();
            futures.add(threadPool.submit(new CopyPartCallable(s3, request)));
        }
    }

    /**
     * Initiates a multipart upload and returns the upload id
     */
    private String initiateMultipartUpload(CopyObjectRequest origReq) {

        EncryptedInitiateMultipartUploadRequest req = new EncryptedInitiateMultipartUploadRequest(
                origReq.getDestinationBucketName(),
                origReq.getDestinationKey()).withCannedACL(
                origReq.getCannedAccessControlList())
                .withRequesterPays(origReq.isRequesterPays())
                .withAccessControlList(origReq.getAccessControlList())
                .withStorageClass(origReq.getStorageClass())
                .withSSECustomerKey(origReq.getDestinationSSECustomerKey())
                .withSSEAwsKeyManagementParams(origReq.getSSEAwsKeyManagementParams())
                .withGeneralProgressListener(origReq.getGeneralProgressListener())
                .withRequestMetricCollector(origReq.getRequestMetricCollector())
           ;

        req.setCreateEncryptionMaterial(false);

        ObjectMetadata newObjectMetadata = origReq.getNewObjectMetadata();
        if (newObjectMetadata == null){
            newObjectMetadata = new ObjectMetadata();
        }
        if (newObjectMetadata.getContentType() == null){
            newObjectMetadata.setContentType(metadata.getContentType());
        }

        req.setObjectMetadata(newObjectMetadata);

        populateMetadataWithEncryptionParams(metadata,newObjectMetadata);

        req.setTagging(origReq.getNewObjectTagging());

        req.withObjectLockMode(origReq.getObjectLockMode())
           .withObjectLockLegalHoldStatus(origReq.getObjectLockLegalHoldStatus())
           .withObjectLockRetainUntilDate(origReq.getObjectLockRetainUntilDate());

        String uploadId = s3.initiateMultipartUpload(req).getUploadId();
        log.debug("Initiated new multipart upload: " + uploadId);

        return uploadId;
    }

    private void populateMetadataWithEncryptionParams(ObjectMetadata source, ObjectMetadata destination) {
        Map<String, String> userMetadataSource = source.getUserMetadata();
        Map<String, String> userMetadataDestination = destination.getUserMetadata();

        String[] headersToCopy = { Headers.CRYPTO_CEK_ALGORITHM,
                Headers.CRYPTO_IV, Headers.CRYPTO_KEY, Headers.CRYPTO_KEY_V2,
                Headers.CRYPTO_KEYWRAP_ALGORITHM, Headers.CRYPTO_TAG_LENGTH,
                Headers.MATERIALS_DESCRIPTION,
                Headers.UNENCRYPTED_CONTENT_LENGTH,
                Headers.UNENCRYPTED_CONTENT_MD5 };

        if (userMetadataSource != null) {
            if(userMetadataDestination == null){
                userMetadataDestination= new HashMap<String,String>();
                destination.setUserMetadata(userMetadataDestination);
            }

            String headerValue;
            for(String header : headersToCopy){
                headerValue = userMetadataSource.get(header);
                if(headerValue != null){
                    userMetadataDestination.put(header, headerValue);
                }
            }
        }
    }

    private void abortMultipartCopy() {
        try {
            AbortMultipartUploadRequest abortRequest = new AbortMultipartUploadRequest(
                    copyObjectRequest.getDestinationBucketName(),
                    copyObjectRequest.getDestinationKey(), multipartUploadId)
                    .withRequesterPays(copyObjectRequest.isRequesterPays());
            s3.abortMultipartUpload(abortRequest);
        } catch (Exception e) {
            log.info(
                    "Unable to abort multipart upload, you may need to manually remove uploaded parts: "
                            + e.getMessage(), e);
        }
    }
}
