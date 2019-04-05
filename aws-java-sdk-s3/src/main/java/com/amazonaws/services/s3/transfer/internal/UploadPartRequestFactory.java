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

import static com.amazonaws.services.s3.Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY;

import com.amazonaws.internal.ReleasableInputStream;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.SSECustomerKey;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.transfer.TransferManager;
import java.io.File;
import java.io.FileInputStream;

/**
 * Factory for creating all the individual UploadPartRequest objects for a
 * multipart upload.
 * <p>
 * This allows us to delay creating each UploadPartRequest until we're ready for
 * it, instead of immediately creating thousands of UploadPartRequest objects
 * for each large upload, when we won't need most of those request objects for a
 * while.
 */
public class UploadPartRequestFactory {
    private final String bucketName;
    private final String key;
    private final String uploadId;
    private final long optimalPartSize;
    private final File file;
    private final PutObjectRequest origReq;
    private int partNumber = 1;
    private long offset = 0;
    private long remainingBytes;
    private SSECustomerKey sseCustomerKey;
    private final int totalNumberOfParts;

    /**
     * Wrapped to provide necessary mark-and-reset support for the underlying
     * input stream. In particular, it provides support for unlimited
     * mark-and-reset if the underlying stream is a {@link FileInputStream}.
     */
    private ReleasableInputStream wrappedStream;

    // Note: Do not copy object metadata from PutObjectRequest to the UploadPartRequest
    // as headers "like x-amz-server-side-encryption" are valid in PutObject but not in UploadPart API
    public UploadPartRequestFactory(PutObjectRequest origReq, String uploadId, long optimalPartSize) {
        this.origReq = origReq;
        this.uploadId = uploadId;
        this.optimalPartSize = optimalPartSize;
        this.bucketName = origReq.getBucketName();
        this.key = origReq.getKey();
        this.file = TransferManagerUtils.getRequestFile(origReq);
        this.remainingBytes = TransferManagerUtils.getContentLength(origReq);
        this.sseCustomerKey = origReq.getSSECustomerKey();
        this.totalNumberOfParts = (int) Math.ceil((double) this.remainingBytes
                / this.optimalPartSize);
        if (origReq.getInputStream() != null) {
            wrappedStream = ReleasableInputStream.wrap(origReq.getInputStream());
        }
    }

    public synchronized boolean hasMoreRequests() {
        return (remainingBytes > 0);
    }

    public synchronized UploadPartRequest getNextUploadPartRequest() {
        long partSize = Math.min(optimalPartSize, remainingBytes);
        boolean isLastPart = (remainingBytes - partSize <= 0);

        UploadPartRequest req = null;
        if (wrappedStream != null) {
            req = new UploadPartRequest()
                .withBucketName(bucketName)
                .withKey(key)
                .withUploadId(uploadId)
                .withInputStream(new InputSubstream(wrappedStream, 0, partSize, isLastPart))
                .withPartNumber(partNumber++)
                .withPartSize(partSize);
        } else {
            req = new UploadPartRequest()
                .withBucketName(bucketName)
                .withKey(key)
                .withUploadId(uploadId)
                .withFile(file)
                .withFileOffset(offset)
                .withPartNumber(partNumber++)
                .withPartSize(partSize);
        }

        // Copying the SSE-C metadata if it's using SSE-C, which is required for each UploadPart Request.
        // See https://docs.aws.amazon.com/AmazonS3/latest/API/mpUploadUploadPart.html, https://github.com/aws/aws-sdk-java/issues/1840
        ObjectMetadata origReqMetadata = origReq.getMetadata();
        if (origReqMetadata != null &&
            origReqMetadata.getRawMetadataValue(SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY) != null &&
            origReqMetadata.getSSECustomerAlgorithm() != null &&
            origReqMetadata.getSSECustomerKeyMd5() != null) {

            ObjectMetadata metadata = new ObjectMetadata();
            metadata.setHeader(SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY,
                               origReqMetadata.getRawMetadataValue(SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY));
            metadata.setSSECustomerAlgorithm(origReqMetadata.getSSECustomerAlgorithm());
            metadata.setSSECustomerKeyMd5(origReqMetadata.getSSECustomerKeyMd5());

            req.withObjectMetadata(metadata);
        }

        req.withRequesterPays(origReq.isRequesterPays());
        TransferManager.appendMultipartUserAgent(req);

        if (sseCustomerKey != null) req.setSSECustomerKey(sseCustomerKey);

        offset += partSize;
        remainingBytes -= partSize;

        req.setLastPart(isLastPart);

        req.withGeneralProgressListener(origReq.getGeneralProgressListener())
           .withRequestMetricCollector(origReq.getRequestMetricCollector())
           ;
        req.getRequestClientOptions().setReadLimit(origReq.getReadLimit());
        return req;
    }

    public int getTotalNumberOfParts() {
        return totalNumberOfParts;
    }

}
