/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static com.amazonaws.services.s3.internal.Constants.*;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.transfer.TransferManagerConfiguration;

/**
 * Internal utilities for multipart uploads with TransferManager.
 */
public class TransferManagerUtils {

    /**
     * Returns a new thread pool configured with the default settings.
     *
     * @return A new thread pool configured with the default settings.
     */
    public static ThreadPoolExecutor createDefaultExecutorService() {
        ThreadFactory threadFactory = new ThreadFactory() {
            private int threadCount = 1;

            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setName("s3-transfer-manager-worker-" + threadCount++);
                return thread;
            }
        };
        return (ThreadPoolExecutor)Executors.newFixedThreadPool(10, threadFactory);
    }

    /**
     * Returns true if the specified upload request can use parallel part
     * uploads for increased performance.
     *
     * @param putObjectRequest
     *            The request to check.
     *
     * @return True if this request can use parallel part uploads for fasters
     *         uploads.
     */
    public static boolean isUploadParallelizable(final PutObjectRequest putObjectRequest) {
        // Currently we only use parallel part uploads for files
        return (getRequestFile(putObjectRequest) != null);
    }

    /**
     * Returns the size of the data in this request, otherwise -1 if the content
     * length is unknown.
     *
     * @param putObjectRequest
     *            The request to check.
     *
     * @return The size of the data in this request, otherwise -1 if the size of
     *         the data is unknown.
     */
    public static long getContentLength(PutObjectRequest putObjectRequest) {
        File file = getRequestFile(putObjectRequest);
        if (file != null) return file.length();

        if (putObjectRequest.getInputStream() != null) {
            if (putObjectRequest.getMetadata().getContentLength() > 0) {
                return putObjectRequest.getMetadata().getContentLength();
            }
        }

        return -1;
    }

    /**
     * Returns the optimal part size, in bytes, for each individual part upload
     * in a multipart upload.
     *
     * @param putObjectRequest
     *            The request containing all the details of the upload.
     * @param configuration
     *            Configuration values to use when calculating size.
     *
     * @return The optimal part size, in bytes, for each individual part upload
     *         in a multipart upload.
     */
    public static long calculateOptimalPartSize(PutObjectRequest putObjectRequest, TransferManagerConfiguration configuration) {
        double contentLength = TransferManagerUtils.getContentLength(putObjectRequest);
        double optimalPartSize = (double)contentLength / (double)MAXIMUM_UPLOAD_PARTS;
        // round up so we don't push the upload over the maximum number of parts
        optimalPartSize = Math.ceil(optimalPartSize);
        return (long)Math.max(optimalPartSize, configuration.getMinimumUploadPartSize());
    }

    /**
     * Returns true if the the specified request should be processed as a
     * multipart upload (instead of a single part upload).
     *
     * @param putObjectRequest
     *            The request containing all the details of the upload.
     * @param configuration
     *            Configuration settings controlling how transfer manager
     *            processes requests.
     *
     * @return True if the the specified request should be processed as a
     *         multipart upload.
     */
    public static boolean shouldUseMultipartUpload(PutObjectRequest putObjectRequest, TransferManagerConfiguration configuration) {
        long contentLength = TransferManagerUtils.getContentLength(putObjectRequest);
        return (contentLength > configuration.getMultipartUploadThreshold());
    }

    /**
     * Convenience method for getting the file specified in a request.
     */
    public static File getRequestFile(final PutObjectRequest putObjectRequest) {
        if (putObjectRequest.getFile() != null) return putObjectRequest.getFile();
        return null;
    }

}
