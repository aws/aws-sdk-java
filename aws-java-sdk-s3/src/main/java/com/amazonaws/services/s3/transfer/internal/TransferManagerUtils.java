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

import static com.amazonaws.services.s3.internal.Constants.MAXIMUM_UPLOAD_PARTS;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Encryption;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.CopyObjectRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.transfer.PauseStatus;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferManagerConfiguration;
import com.amazonaws.util.ValidationUtils;
import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Internal utilities for multipart uploads with TransferManager.
 */
public class TransferManagerUtils {

    private static final Log log = LogFactory.getLog(TransferManagerUtils.class);

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
     * @param isUsingEncryption
     *            True if the upload is an encrypted upload, otherwise false.
     *
     * @return True if this request can use parallel part uploads for faster
     *         uploads.
     */
    public static boolean isUploadParallelizable(final PutObjectRequest putObjectRequest, final boolean isUsingEncryption) {
        // Each uploaded part in an encrypted upload depends on the encryption context
        // from the previous upload, so we cannot parallelize encrypted upload parts.
        if (isUsingEncryption) return false;

        // Otherwise, if there's a file, we can process the uploads concurrently.
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
        return contentLength > configuration.getMultipartUploadThreshold();

    }

    /**
     * Convenience method for getting the file specified in a request.
     */
    public static File getRequestFile(final PutObjectRequest putObjectRequest) {
        if (putObjectRequest.getFile() != null) return putObjectRequest.getFile();
        return null;
    }

    /**
     * Calculates the optimal part size of each part request if the copy
     * operation is carried out as multi-part copy.
     *
     * @param copyObjectRequest
     *            the original request.
     * @param configuration
     *            configuration containing the default part size.
     * @param contentLengthOfSource
     *            content length of the Amazon S3 object.
     * @return the optimal part size for a copy part request.
     */
    public static long calculateOptimalPartSizeForCopy(
            CopyObjectRequest copyObjectRequest,
            TransferManagerConfiguration configuration,
            long contentLengthOfSource) {
        double optimalPartSize = (double) contentLengthOfSource
                / (double) MAXIMUM_UPLOAD_PARTS;
        // round up so we don't push the copy over the maximum number of parts
        optimalPartSize = Math.ceil(optimalPartSize);
        return (long) Math.max(optimalPartSize,
                configuration.getMultipartCopyPartSize());
    }

    /**
     * Determines the pause status based on the current state of transfer.
     */
    public static PauseStatus determinePauseStatus(TransferState transferState,
            boolean forceCancel) {

        if (forceCancel) {
            if (transferState == TransferState.Waiting) {
                return PauseStatus.CANCELLED_BEFORE_START;
            } else if (transferState == TransferState.InProgress) {
                return PauseStatus.CANCELLED;
            }
        }
        if (transferState == TransferState.Waiting) {
            return PauseStatus.NOT_STARTED;
        }
        return PauseStatus.NO_EFFECT;
    }

    /**
     * Returns true if the specified download request can use parallel part
     * downloads for increased performance.
     *
     * @param getObjectRequest
     *            The request to check.
     *
     * @param s3
     *            The Amazon s3 client.
     *
     * @return True if this request can use parallel part downloads.
     */
    public static boolean isDownloadParallelizable(final AmazonS3 s3, final GetObjectRequest getObjectRequest,
            Integer partCount) {
        ValidationUtils.assertNotNull(s3, "S3 client");
        ValidationUtils.assertNotNull(getObjectRequest, "GetObjectRequest");

        if (s3 instanceof AmazonS3Encryption || getObjectRequest.getRange() != null
                || getObjectRequest.getPartNumber() != null || partCount == null) {
            return false;
        }
        return true;
    }

    /**
     * Returns the content length of the object if response contains the Content-Range header
     * and is well formed.
     *
     * If the Content-Range header is missing or header is malformed or content length is missing in the header value,
     * then a null value is returned.
     * <b>Note: If there is exception parsing the value, the exception is logged and a null value is returned.</b>
     *
     * For example,
     * Retuns 1234, if Content-Range value is bytes 42-1233/1234
     * Retuns null, if Content-Range value is missing
     * Retuns null, if Content-Range value is not well formed bytes 42-1233/*
     */
    public static Long getContentLengthFromContentRange(ObjectMetadata metadata) {
        ValidationUtils.assertNotNull(metadata, "Object metadata");

        String contentRange = (String) metadata.getRawMetadataValue(Headers.CONTENT_RANGE);

        if (contentRange != null) {
            try {
                String[] tokens = contentRange.split("[ -/]+");
                return Long.parseLong(tokens[3]);
            } catch (Exception e) {
                log.info(String.format("Error parsing 'Content-Range' header value: %s. So returning "
                                       + "null value for content length", contentRange), e);
            }
        }

        return null;
    }
}
