/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.CopyPartRequest;

/**
 * Factory for creating all the individual CopyPartRequest objects for a
 * multipart copy.
 * <p>
 * This allows us to delay creating each CopyPartRequest until we're ready for
 * it, instead of immediately creating thousands of CopyPartRequest objects for
 * each large copy, when we won't need most of those request objects for a
 * while.
 */
public class CopyPartRequestFactory {

    /** Upload id to be used in each copy part request. */
    private final String uploadId;
    /** Optimal size of each part in the copy request. */
    private final long optimalPartSize;
    /** The original copy object request. */
    private final CopyObjectRequest copyObjectRequest;
    /** Part Number to be specified in each copy part request. */
    private int partNumber = 1;
    /** Starting byte for each part. */
    private long offset = 0;
    /** The number of remaining bytes to be copied. */
    private long remainingBytes;

    public CopyPartRequestFactory(CopyObjectRequest copyObjectRequest,
            String uploadId, long optimalPartSize, long contentLength) {
        this.copyObjectRequest = copyObjectRequest;
        this.uploadId = uploadId;
        this.optimalPartSize = optimalPartSize;
        this.remainingBytes = contentLength;
    }

    public synchronized boolean hasMoreRequests() {
        return (remainingBytes > 0);
    }

    /**
     * Constructs a copy part requests and returns it.
     *
     * @return Returns a new copy part request
     */
    public synchronized CopyPartRequest getNextCopyPartRequest() {
        long partSize = Math.min(optimalPartSize, remainingBytes);

        CopyPartRequest request = new CopyPartRequest()
                .withSourceBucketName(copyObjectRequest.getSourceBucketName())
                .withSourceKey(copyObjectRequest.getSourceKey())
                .withUploadId(uploadId)
                .withPartNumber(partNumber++)
                .withDestinationBucketName(
                        copyObjectRequest.getDestinationBucketName())
                .withDestinationKey(copyObjectRequest.getDestinationKey())
                .withSourceVersionId(copyObjectRequest.getSourceVersionId())
                .withFirstByte(new Long(offset))
                .withLastByte(new Long(offset + partSize - 1));

        setOtherMetadataInRequest(request);
        offset += partSize;
        remainingBytes -= partSize;

        return request;
    }

    private void setOtherMetadataInRequest(CopyPartRequest request) {
        if (copyObjectRequest.getMatchingETagConstraints() != null)
            request.setMatchingETagConstraints(copyObjectRequest
                    .getMatchingETagConstraints());
        if (copyObjectRequest.getModifiedSinceConstraint() != null)
            request.setModifiedSinceConstraint(copyObjectRequest
                    .getModifiedSinceConstraint());
        if (copyObjectRequest.getNonmatchingETagConstraints() != null)
            request.setNonmatchingETagConstraints(copyObjectRequest
                    .getNonmatchingETagConstraints());
        if (copyObjectRequest.getSourceVersionId() != null)
            request.setSourceVersionId(copyObjectRequest.getSourceVersionId());
        if (copyObjectRequest.getUnmodifiedSinceConstraint() != null)
            request.setUnmodifiedSinceConstraint(copyObjectRequest
                    .getUnmodifiedSinceConstraint());
    }

}
