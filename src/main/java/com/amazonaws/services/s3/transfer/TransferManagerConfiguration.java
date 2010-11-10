/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    private static final int DEFAULT_MULTIPART_UPLOAD_THRESHOLD = 16 * MB;

    
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
    private int multipartUploadThreshold = DEFAULT_MULTIPART_UPLOAD_THRESHOLD;

    
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
    public void setMultipartUploadThreshold(int multipartUploadThreshold) {
        this.multipartUploadThreshold = multipartUploadThreshold;
    }
}