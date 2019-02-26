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
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import com.amazonaws.SdkClientException;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.transfer.model.CopyResult;

/**
 * Initiates a complete multi-part upload request for a
 * TransferManager multi-part parallel copy.
 */
public class CompleteMultipartCopy implements Callable<CopyResult> {

    /** The upload id associated with the multi-part copy. */
    private final String uploadId;

    /**
     * The reference to underlying Amazon S3 client to be used for initiating
     * requests to Amazon S3.
     */
    private final AmazonS3 s3;

    /** The reference to the request initiated by the user. */
    private final CopyObjectRequest origReq;

    /** The futures of threads that copies individual parts. */
    private final List<Future<PartETag>> futures;

    /** The monitor to which the copy progress has to be communicated. */
    private final CopyMonitor monitor;

    /** The listener where progress of the copy needs to be published. */
    private final ProgressListenerChain listener;

    public CompleteMultipartCopy(String uploadId, AmazonS3 s3,
                                 CopyObjectRequest copyObjectRequest, List<Future<PartETag>> futures,
                                 ProgressListenerChain progressListenerChain, CopyMonitor monitor) {
        this.uploadId = uploadId;
        this.s3 = s3;
        this.origReq = copyObjectRequest;
        this.futures = futures;
        this.listener = progressListenerChain;
        this.monitor = monitor;
    }

    @Override
    public CopyResult call() throws Exception {
        CompleteMultipartUploadResult res;

        try {
            CompleteMultipartUploadRequest req = new CompleteMultipartUploadRequest(
                    origReq.getDestinationBucketName(), origReq.getDestinationKey(), uploadId,
                    collectPartETags())
                    .withRequesterPays(origReq.isRequesterPays())
                    .withGeneralProgressListener(origReq.getGeneralProgressListener())
                    .withRequestMetricCollector(origReq.getRequestMetricCollector())
                    ;
            res = s3.completeMultipartUpload(req);
        } catch (Exception e) {
            monitor.reportFailure();
            publishProgress(listener, ProgressEventType.TRANSFER_FAILED_EVENT);
            throw e;
        }

        CopyResult copyResult = new CopyResult();
        copyResult.setSourceBucketName(origReq.getSourceBucketName());
        copyResult.setSourceKey(origReq.getSourceKey());
        copyResult.setDestinationBucketName(res
                .getBucketName());
        copyResult.setDestinationKey(res.getKey());
        copyResult.setETag(res.getETag());
        copyResult.setVersionId(res.getVersionId());

        monitor.copyComplete();

        return copyResult;
    }

    /**
     * Collects the Part ETags for initiating the complete multi-part copy
     * request. This is blocking as it waits until all the upload part threads
     * complete.
     */
    private List<PartETag> collectPartETags() {

        final List<PartETag> partETags = new ArrayList<PartETag>();
        for (Future<PartETag> future : futures) {
            try {
                partETags.add(future.get());
            } catch (Exception e) {
                throw new SdkClientException("Unable to copy part: "
                        + e.getCause().getMessage(), e.getCause());
            }
        }
        return partETags;
    }
}
