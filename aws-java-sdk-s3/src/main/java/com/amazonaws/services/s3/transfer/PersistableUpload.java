/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An opaque token that holds some private state and can be used to resume a
 * paused download operation.
 */
public final class PersistableUpload extends PersistableTransfer {
    static final String TYPE = "upload";

    @JsonProperty
    private final String pauseType = TYPE;

    /** The bucket name in Amazon S3 from where the object has to be uploaded. */
    @JsonProperty
    private final String bucketName;

    /** The name of the object in Amazon S3. */
    @JsonProperty
    private final String key;

    /** The file to upload. */
    @JsonProperty
    private final String file;

    /** The multi-part upload id associated with this upload. */
    @JsonProperty
    private final String multipartUploadId;

    /** The part size to be used for the multi-part upload. */
    @JsonProperty
    private final long partSize;

    /** The upper threshold of the file to use multi part upload. */
    @JsonProperty
    private final long mutlipartUploadThreshold;

    public PersistableUpload() {
        this(null, null, null, null, -1, -1);
    }

    public PersistableUpload(
            @JsonProperty(value = "bucketName") String bucketName,
            @JsonProperty(value = "key") String key,
            @JsonProperty(value = "file") String file,
            @JsonProperty(value = "multipartUploadId") String multipartUploadId,
            @JsonProperty(value = "partSize") long partSize,
            @JsonProperty(value = "mutlipartUploadThreshold") long mutlipartUploadThreshold) {
        this.bucketName = bucketName;
        this.key = key;
        this.file = file;
        this.multipartUploadId = multipartUploadId;
        this.partSize = partSize;
        this.mutlipartUploadThreshold = mutlipartUploadThreshold;
    }

    /**
     * Returns the name of the bucket.
     */
    String getBucketName() {
        return bucketName;
    }

    /**
     * Returns the name of the object.
     */
    String getKey() {
        return key;
    }

    /**
     * Returns the multi part upload id.
     */
    String getMultipartUploadId() {
        return multipartUploadId;
    }

    /**
     * Returns the part size to be used in multi part upload.
     */
    long getPartSize() {
        return partSize;
    }

    /**
     * Returns the upper threshold for file size after which multipart upload is
     * used..
     */
    long getMutlipartUploadThreshold() {
        return mutlipartUploadThreshold;
    }

    /**
     * Returns the file name along with path which needs to be uploaded to
     * Amazon S3.
     */
    String getFile() {
        return file;
    }

    String getPauseType() {
        return pauseType;
    }
}
