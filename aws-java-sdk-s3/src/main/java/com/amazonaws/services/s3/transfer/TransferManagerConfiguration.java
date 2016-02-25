/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.internal.Constants.*;

/**
 * Configuration options for how {@link TransferManager} processes requests.
 * <p>
 * The best configuration settings depend on network
 * configuration, latency and bandwidth.
 * The default configuration settings are suitable
 * for most applications, but this class enables developers to experiment with
 * different configurations and tune transfer manager performance.
 */
public class TransferManagerConfiguration {

    /** Default minimum part size for upload parts. */
    private static final int DEFAULT_MINIMUM_UPLOAD_PART_SIZE = 5 * MB;

    /** Default size threshold for when to use multipart uploads.  */
    private static final long DEFAULT_MULTIPART_UPLOAD_THRESHOLD = 16 * MB;

    /** Default size threshold for Amazon S3 object after which multi-part copy is initiated. */
    private static final long DEFAULT_MULTIPART_COPY_THRESHOLD = 5 * GB;

    /** Default minimum size of each part for multi-part copy. */
    private static final long DEFAULT_MINIMUM_COPY_PART_SIZE = 100 * MB;

    /**
     * The minimum part size for upload parts. Decreasing the minimum part size
     * will cause multipart uploads to be split into a larger number of smaller
     * parts. Setting this value too low can have a negative effect on transfer
     * speeds since it will cause extra latency and network communication for
     * each part.
     */
    private long minimumUploadPartSize = DEFAULT_MINIMUM_UPLOAD_PART_SIZE;

    /**
     * The size threshold, in bytes, for when to use multipart uploads. Uploads
     * over this size will automatically use a multipart upload strategy, while
     * uploads smaller than this threshold will use a single connection to
     * upload the whole object.
     * <p>
     * Multipart uploads are easier to recover from and also potentially faster
     * than single part uploads, especially when the upload parts can be
     * uploaded in parallel as with files. Because there is additional network
     * communication, small uploads are still recommended to use a single
     * connection for the upload.
     */
    private long multipartUploadThreshold = DEFAULT_MULTIPART_UPLOAD_THRESHOLD;

    /**
     * The size threshold, in bytes, for when to use multi-part copy. Copy
     * requests for objects over this size will automatically use a multi-part
     * copy strategy, while copy requests for objects smaller than this
     * threshold will use a single connection to copy the whole object.
     */
    private long multipartCopyThreshold = DEFAULT_MULTIPART_COPY_THRESHOLD;

    /**
     * The minimum size in bytes of each part when a multi-part copy operation
     * is carried out. Decreasing the minimum part size will cause a large
     * number of copy part requests being initiated.
     */
    private long multipartCopyPartSize = DEFAULT_MINIMUM_COPY_PART_SIZE;

    /**
     * Returns the minimum part size for upload parts.
     * Decreasing the minimum part size causes
     * multipart uploads to be split into a larger number
     * of smaller parts. Setting this value too low has a negative effect
     * on transfer speeds, causing extra latency and network
     * communication for each part.
     *
     * @return The minimum part size for upload parts.
     */
    public long getMinimumUploadPartSize() {
        return minimumUploadPartSize;
    }

    /**
     * Sets the minimum part size for upload parts.
     * Decreasing the minimum part size causes
     * multipart uploads to be split into a larger number
     * of smaller parts. Setting this value too low has a negative effect
     * on transfer speeds, causing extra latency and network
     * communication for each part.
     *
     * @param minimumUploadPartSize
     *            The minimum part size for upload parts.
     */
    public void setMinimumUploadPartSize(long minimumUploadPartSize) {
        this.minimumUploadPartSize = minimumUploadPartSize;
    }

    /**
     * Returns the size threshold in bytes for when to use multipart uploads.
     * Uploads over this size will automatically use a multipart upload
     * strategy, while uploads smaller than this threshold will use a single
     * connection to upload the whole object.
     * <p>
     * Multipart uploads are easier to recover from and potentially faster
     * than single part uploads, especially when the upload parts can be
     * uploaded in parallel as with files. Due to additional network
     * communication, small uploads should use a single
     * connection for the upload.
     *
     * @return The size threshold in bytes for when to use multipart uploads.
     */
    public long getMultipartUploadThreshold() {
        return multipartUploadThreshold;
    }

    /**
     * Sets the size threshold in bytes for when to use multipart uploads.
     * Uploads over this size will automatically use a multipart upload
     * strategy, while uploads smaller than this threshold will use a single
     * connection to upload the whole object.
     * <p>
     * Multipart uploads are easier to recover from and potentially faster
     * than single part uploads, especially when the upload parts can be
     * uploaded in parallel as with files. Due to additional network
     * communication, small uploads should use a single
     * connection for the upload.
     *
     * @param multipartUploadThreshold
     *            The size threshold in bytes for when to use multipart
     *            uploads.
     */
    public void setMultipartUploadThreshold(long multipartUploadThreshold) {
        this.multipartUploadThreshold = multipartUploadThreshold;
    }

    /**
     * Returns the minimum size in bytes of each part in a multi-part copy
     * request. Decreasing this size will result in increase in the number of
     * copy part requests to the server.
     *
     * @return The minimum size in bytes for each part in a multi-part copy
     *         request.
     */
    public long getMultipartCopyPartSize() {
        return multipartCopyPartSize;
    }

    /**
     * Sets the minimum part size in bytes for each part in a multi-part copy
     * request. Decreasing this size will result in increase in the number of
     * copy part requests to the server.
     *
     * @param multipartCopyPartSize
     *            The minimum size in bytes for each part in a multi part copy
     *            request.
     */
    public void setMultipartCopyPartSize(long multipartCopyPartSize) {
        this.multipartCopyPartSize = multipartCopyPartSize;
    }

    /**
     * Returns the maximum threshold size of an Amazon S3 object after which the
     * copy operation is carried out using multi-part request.
     *
     * @return The size threshold of an Amazon S3 object for when to use a
     *         multi-part copy
     */
    public long getMultipartCopyThreshold() {
        return multipartCopyThreshold;
    }

    /**
     * Sets the size threshold in bytes for when to use multi-part copy
     * requests. Copy requests for objects over this size will automatically use
     * a multi-part copy strategy, while copy requests for objects smaller than
     * this threshold will use a single connection to copy the whole object.
     *
     * @param multipartCopyThreshold
     *            The size threshold in bytes for when to use multi part copy.
     */
    public void setMultipartCopyThreshold(long multipartCopyThreshold) {
        this.multipartCopyThreshold = multipartCopyThreshold;
    }

    /**
     * Sets the size threshold in bytes for when to use multipart uploads.
     * Uploads over this size will automatically use a multipart upload
     * strategy, while uploads smaller than this threshold will use a single
     * connection to upload the whole object.
     * <p>
     * Multipart uploads are easier to recover from and potentially faster
     * than single part uploads, especially when the upload parts can be
     * uploaded in parallel as with files. Due to additional network
     * communication, small uploads should use a single
     * connection for the upload.
     *
     * This reversed the backward incompatibility with Hadoop 2.7 and S3A filesystem
     * introduced in AWS SDK v1.7.6 by this pull request:
     * https://github.com/aws/aws-sdk-java/pull/201
     *
     * See details (on error message, and fix targeted for Hadoop 2.8) here:
     * - https://issues.apache.org/jira/browse/HADOOP-12420
     * - https://issues.apache.org/jira/browse/HADOOP-12496
     * - https://issues.apache.org/jira/browse/HADOOP-12269
     * Once Hadoop 2.8 (which uses aws-sdk 1.10.6 or later) is used commonly, this may be removed
     *
     * @param multipartUploadThreshold
     *            The size threshold in bytes for when to use multipart
     *            uploads.
     * @deprecated replaced by {@link #setMultipartUploadThreshold(long)}
     */
    @Deprecated
    public void setMultipartUploadThreshold(int multipartUploadThreshold) {
        setMultipartUploadThreshold((long) multipartUploadThreshold);
    }
}