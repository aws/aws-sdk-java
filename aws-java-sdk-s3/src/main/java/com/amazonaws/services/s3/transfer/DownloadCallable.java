/*
 * Copyright 2015-2016 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.transfer;

import java.io.File;
import java.net.SocketException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLProtocolException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.FileLocks;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.internal.ServiceUtils.RetryableS3DownloadTask;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.exception.FileLockException;
import com.amazonaws.services.s3.transfer.internal.AbstractTransfer;
import com.amazonaws.services.s3.transfer.internal.DownloadImpl;
import com.amazonaws.services.s3.transfer.internal.DownloadMonitor;

final class DownloadCallable implements Callable<File> {
    private static final Log log = LogFactory.getLog(DownloadCallable.class);

    private final AmazonS3 s3;
    private final CountDownLatch latch;
    private final GetObjectRequest req;
    private final boolean resumeExistingDownload;
    private final DownloadImpl download;
    private final File dstfile;
    private final long origStartingByte;
    private final long timeout;
    private final ScheduledExecutorService executor;

    private long expectedFileLength;

    DownloadCallable(AmazonS3 s3, CountDownLatch latch,
            GetObjectRequest req,
            boolean resumeExistingDownload,
            DownloadImpl download, File dstfile, long origStartingByte,
            long expectedFileLength, long timeout,
                     ScheduledExecutorService executor)
    {
        if (s3 == null || latch == null || req == null || dstfile == null || download == null)
            throw new IllegalArgumentException();
        this.s3 = s3;
        this.latch = latch;
        this.req = req;
        this.resumeExistingDownload = resumeExistingDownload;
        this.download = download;
        this.dstfile = dstfile;
        this.origStartingByte = origStartingByte;
        this.expectedFileLength = expectedFileLength;
        this.timeout = timeout;
        this.executor = executor;
    }

    /**
     * This method must return a non-null object, or else the existing
     * implementation in {@link AbstractTransfer#waitForCompletion()}
     * would block forever.
     * 
     * @return the downloaded file
     */
    @Override
    public File call() throws Exception {
        try {
            latch.await();

            if (isTimeoutEnabled()) {
                executor.schedule(new Runnable() {
                    public void run() {
                        try {
                            if (download.getState() != TransferState.Completed) {
                                download.abort();
                            }
                        } catch(Exception e) {
                            throw new AmazonClientException(
                                    "Unable to abort download after timeout", e);
                        }
                    }
                }, timeout, TimeUnit.MILLISECONDS);
            }
            download.setState(TransferState.InProgress);
            S3Object s3Object = retryableDownloadS3ObjectToFile(dstfile,
                new DownloadTaskImpl(s3, download, req), 
                resumeExistingDownload);

            if (s3Object == null) {
                download.setState(TransferState.Canceled);
                download.setMonitor(new DownloadMonitor(download, null));
            } else {
                download.setState(TransferState.Completed);
            }
            return dstfile;
        } catch (Throwable t) {
            // Downloads aren't allowed to move from canceled to failed
            if (download.getState() != TransferState.Canceled) {
                download.setState(TransferState.Failed);
            }
            if (t instanceof Exception)
                throw (Exception) t;
            else
                throw (Error) t;
        }
    }

    /**
     * This method is called only if it is a resumed download.
     *
     * Adjust the range of the get request, and the expected (ie current) file
     * length of the destination file to append to.
     */
    private void adjustRequest(GetObjectRequest req) {
        long[] range = req.getRange();
        long lastByte = range[1];
        long totalBytesToDownload = lastByte - this.origStartingByte + 1;

        if (dstfile.exists()) {
            if (!FileLocks.lock(dstfile)) {
                throw new FileLockException("Fail to lock " + dstfile
                        + " for range adjustment");
            }
            try {
                expectedFileLength = dstfile.length();
                long startingByte = this.origStartingByte + expectedFileLength;
                log.info("Adjusting request range from " + Arrays.toString(range)
                        + " to "
                        + Arrays.toString(new long[] { startingByte, lastByte })
                        + " for file " + dstfile);
                req.setRange(startingByte, lastByte);
                totalBytesToDownload = lastByte - startingByte + 1;
            } finally {
                FileLocks.unlock(dstfile);
            }
        }

        if (totalBytesToDownload < 0) {
            throw new IllegalArgumentException(
                "Unable to determine the range for download operation. lastByte="
                        + lastByte + ", origStartingByte=" + origStartingByte
                        + ", expectedFileLength=" + expectedFileLength
                        + ", totalBytesToDownload=" + totalBytesToDownload);
        }
    }

    private S3Object retryableDownloadS3ObjectToFile(File file,
            RetryableS3DownloadTask retryableS3DownloadTask, boolean appendData) {
        boolean hasRetried = false;
        S3Object s3Object;
        for (;;) {
            if (resumeExistingDownload && hasRetried) {
                // Need to adjust the get range or else we risk corrupting the downloaded file
                adjustRequest(req);
            }
            s3Object = retryableS3DownloadTask.getS3ObjectStream();
            if (s3Object == null)
                return null;
            try {
                if (testing && resumeExistingDownload && !hasRetried) {
                    throw new AmazonClientException("testing");
                }
                ServiceUtils.downloadToFile(s3Object, file,
                        retryableS3DownloadTask.needIntegrityCheck(),
                        appendData, expectedFileLength);
                return s3Object;
            } catch (AmazonClientException ace) {
                if (!ace.isRetryable())
                    throw ace;
                // Determine whether an immediate retry is needed according to the captured AmazonClientException.
                // (There are three cases when downloadObjectToFile() throws AmazonClientException:
                //      1) SocketException or SSLProtocolException when writing to disk (e.g. when user aborts the download)
                //      2) Other IOException when writing to disk
                //      3) MD5 hashes don't match
                // The current code will retry the download only when case 2) or 3) happens.
                if (ace.getCause() instanceof SocketException || ace.getCause() instanceof SSLProtocolException) {
                    throw ace;
                } else {
                    if (hasRetried)
                        throw ace;
                    else {
                        log.info("Retry the download of object " + s3Object.getKey() + " (bucket " + s3Object.getBucketName() + ")", ace);
                        hasRetried = true;
                    }
                }
            } finally {
                s3Object.getObjectContent().abort();
            }
        }
    }

    private boolean isTimeoutEnabled() {
        return timeout > 0;
    }

    private static boolean testing;
    /**
     * Used for testing purpose only.
     */
    static void setTesting(boolean b) {
        testing = b;
    }
}