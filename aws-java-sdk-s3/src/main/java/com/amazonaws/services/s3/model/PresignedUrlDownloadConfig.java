/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.model;

import static com.amazonaws.services.s3.internal.Constants.MB;

import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.internal.S3ProgressListener;

/**
 * Configuration options that can be used to control the download behavior in {@link TransferManager}
 * when using presigned urls
 */
public final class PresignedUrlDownloadConfig {

    private static final long DEFAULT_TIMEOUT = -1L;

    private static final long DEFAULT_DOWNLOAD_SIZE = 5 * MB;

    /**
     *  An optional callback listener to get the progress of the download.
     */
    private S3ProgressListener s3progressListener;

    /**
     * Timeout, in milliseconds, for waiting for this download to complete. Note that the timeout time will be approximate
     * and is not strictly guaranteed.  As a result this timeout should not be relied on in cases where exact precision is
     * required.
     */
    private long timeoutMillis = DEFAULT_TIMEOUT;

    /**
     * Set the download size while making partial S3 GET requests. This parameter is used in parallel downloads.
     * The default object size to download in each request is 5 MB.
     */
    private long downloadSizePerRequest = DEFAULT_DOWNLOAD_SIZE;

    private boolean resumeOnRetry = false;

    /**
     * @return the optional callback listener to get the progress of the download
     */
    public S3ProgressListener getS3progressListener() {
        return s3progressListener;
    }

    /**
     * @param s3progressListener sets optional callback listener to get the progress of the download.
     */
    public void setS3progressListener(S3ProgressListener s3progressListener) {
        this.s3progressListener = s3progressListener;
    }

    /**
     * @param s3progressListener sets optional callback listener to get the progress of the download.
     * @return This object for method chaining
     */
    public PresignedUrlDownloadConfig withS3progressListener(S3ProgressListener s3progressListener) {
        setS3progressListener(s3progressListener);
        return this;
    }

    /**
     * @return Timeout, in milliseconds, for waiting for this download to complete.
     */
    public long getTimeoutMillis() {
        return timeoutMillis;
    }

    /**
     * Sets the timeout, in milliseconds, for waiting for this download to complete. Note that the timeout time will be approximate
     * and is not strictly guaranteed.  As a result this timeout should not be relied on in cases where exact precision is
     * required.
     *
     * @param timeoutMillis Timeout, in milliseconds, for waiting for this download to complete.
     */
    public void setTimeoutMillis(long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
    }

    /**
     * Sets the timeout, in milliseconds, for waiting for this download to complete. Note that the timeout time will be approximate
     * and is not strictly guaranteed.  As a result this timeout should not be relied on in cases where exact precision is
     * required.
     *
     * @param timeoutMillis Timeout, in milliseconds, for waiting for this download to complete.
     * @return This object for method chaining
     */
    public PresignedUrlDownloadConfig withTimeoutMillis(long timeoutMillis) {
        setTimeoutMillis(timeoutMillis);
        return this;
    }

    /**
     * @return the size of each request while downloading object in parallel
     */
    public long getDownloadSizePerRequest() {
        return downloadSizePerRequest;
    }

    /**
     * @param downloadSizePerRequest sets the size of each request while downloading object in parallel. The default value is 5 MB
     */
    public void setDownloadSizePerRequest(long downloadSizePerRequest) {
        assertIsPositive(downloadSizePerRequest, "partial object size");
        this.downloadSizePerRequest = downloadSizePerRequest;
    }

    /**
     * @param downloadSizePerRequest sets the size of each request while downloading object in parallel. The default value is 5 MB
     * @return This object for method chaining
     */
    public PresignedUrlDownloadConfig withDownloadSizePerRequest(long downloadSizePerRequest) {
        setDownloadSizePerRequest(downloadSizePerRequest);
        return this;
    }

    /**
     * @return a boolean value indicating if a failed download should be resumed upon an immediate retry.
     *         The default value is false.
     */
    public boolean isResumeOnRetry() {
        return resumeOnRetry;
    }

    /**
     * @param resumeOnRetry If set to true, upon an immediate retry of a failed object download,
     * the <code>TransferManager</code> will resume the download from the current end of the file on disk.
     * This is a one-time retry mechanism that is different from the default retries provided by sdk.
     *
     * <p>The default value is false.</p>
     *
     * Note: This value is only valid for serial downloads and one of the following conditions is true:
     * 1) Download range is set on the request
     * 2) TransferManager is able to find the content-length of the object using presigned url
     *
     */
    public void setResumeOnRetry(boolean resumeOnRetry) {
        this.resumeOnRetry = resumeOnRetry;
    }

    /**
     *
     * @param resumeOnRetry If set to true, upon an immediate retry of a failed object download,
     * the <code>TransferManager</code> will resume the download from the current end of the file on disk.
     * This is a one-time retry mechanism that is different from the default retries provided by sdk.
     *
     * <p>The default value is false.</p>
     *
     * Note: This value is only valid for serial downloads and one of the following conditions is true:
     * 1) Download range is set on the request
     * 2) TransferManager is able to find the content-length of the object using presigned url
     *
     * @return This object for method chaining
     */
    public PresignedUrlDownloadConfig withResumeOnRetry(boolean resumeOnRetry) {
        setResumeOnRetry(resumeOnRetry);
        return this;
    }

    private void assertIsPositive(long num, String fieldName) {
        if (num <= 0) {
            throw new IllegalArgumentException(String.format("%s must be positive", fieldName));
        }
    }
}
