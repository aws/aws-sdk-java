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

package com.amazonaws.services.s3.transfer.internal;

import static com.amazonaws.services.s3.internal.ServiceUtils.createParentDirectoryIfNecessary;

import com.amazonaws.AmazonClientException;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.internal.FileLocks;
import com.amazonaws.services.s3.internal.ServiceUtils;
import com.amazonaws.services.s3.model.PresignedUrlDownloadRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.transfer.Transfer;
import com.amazonaws.services.s3.transfer.exception.FileLockException;
import java.io.File;
import java.net.SocketException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.ssl.SSLProtocolException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@SdkInternalApi
public class PresignUrlDownloadCallable extends AbstractDownloadCallable {
    private static final Log LOG = LogFactory.getLog(PresignUrlDownloadCallable.class);

    private final AmazonS3 s3;
    private final PresignedUrlDownloadRequest request;
    private final PresignedUrlDownloadImpl download;
    private final long perRequestDownloadSize;
    private final Long startByte;
    private final Long endByte;
    private final boolean resumeOnRetry;
    private long expectedFileLength;

    public PresignUrlDownloadCallable(ExecutorService executor, File dstfile, CountDownLatch latch, PresignedUrlDownloadImpl download,
                                      boolean isDownloadParallel, ScheduledExecutorService timedExecutor, long timeout,
                                      AmazonS3 s3, PresignedUrlDownloadRequest request, long perRequestDownloadSize,
                                      Long startByte, Long endByte, boolean resumeOnRetry) {

        super(constructCallableConfig(executor, dstfile, latch, download, isDownloadParallel, timedExecutor, timeout));

        if (s3 == null || request == null || download == null) {
            throw new IllegalArgumentException();
        }
        this.s3 = s3;
        this.request = request;
        this.download = download;
        this.perRequestDownloadSize = perRequestDownloadSize;
        this.startByte = startByte;
        this.endByte = endByte;
        this.resumeOnRetry = resumeOnRetry;
        // only used when resuming download
        this.expectedFileLength = 0L;
    }

    @Override
    protected void downloadAsSingleObject() {
        S3Object s3Object = retryableDownloadS3ObjectToFile(dstfile,
                                                            new PresignedUrlRetryableDownloadTaskImpl(s3, download, request));
        updateDownloadStatus(s3Object);
    }

    @Override
    protected void downloadInParallel() throws Exception {
        downloadInParallelUsingRange();
    }

    @Override
    protected void setState(Transfer.TransferState transferState) {
        download.setState(transferState);
    }

    /**
     * Takes the result from serial download,
     * updates the transfer state and monitor in downloadImpl object
     * based on the result.
     */
    private void updateDownloadStatus(S3Object result) {
        if (result == null) {
            download.setState(Transfer.TransferState.Canceled);
            download.setMonitor(new DownloadMonitor(download, null));
        } else {
            download.setState(Transfer.TransferState.Completed);
        }
    }

    /**
     * Downloads object from s3 to a file. Upon certain failures, a one-time retry will happen that will
     * resume the download and append to the file.
     */
    private S3Object retryableDownloadS3ObjectToFile(File file,
                                                     ServiceUtils.RetryableS3DownloadTask retryableS3DownloadTask) {
        boolean hasRetried = false;
        S3Object s3Object;
        for (; ; ) {
            final boolean appendData = resumeOnRetry && canResumeDownload() && hasRetried;
            if (appendData) {
                // Need to adjust the get range or else we risk corrupting the downloaded file
                adjustRequest(request);
            }
            s3Object = retryableS3DownloadTask.getS3ObjectStream();
            if (s3Object == null) {
                return null;
            }
            try {
                // Used for testing the resumeOnRetry behavior
                if (testing && !hasRetried) {
                    throw new SdkClientException("testing");
                }
                ServiceUtils.downloadToFile(s3Object, file,
                                            retryableS3DownloadTask.needIntegrityCheck(),
                                            appendData, expectedFileLength);
                return s3Object;
            } catch (AmazonClientException ace) {
                if (!ace.isRetryable()) {
                    throw ace;
                }
                // Determine whether an immediate retry is needed according to the captured SdkClientException.
                // (There are three cases when downloadObjectToFile() throws SdkClientException:
                //      1) SocketException or SSLProtocolException when writing to disk (e.g. when user aborts the download)
                //      2) Other IOException when writing to disk
                //      3) MD5 hashes don't match
                // For 1) If SocketException is the result of the client side resetting the connection, this is retried
                // Cases 2) and 3) will always be retried
                final Throwable cause = ace.getCause();
                if ((cause instanceof SocketException && !cause.getMessage().equals("Connection reset"))
                    || (cause instanceof SSLProtocolException)) {
                    throw ace;
                } else {
                    if (hasRetried) {
                        throw ace;
                    } else {
                        LOG.debug("Retry the download of object " + s3Object.getKey()
                                 + " (bucket " + s3Object.getBucketName() + ")", ace);
                        hasRetried = true;
                    }
                }
            } finally {
                s3Object.getObjectContent().abort();
            }
        }
    }

    /**
     * For presigned url downloads, we can only resume a download if start and end bytes can be determined
     */
    private boolean canResumeDownload() {
        return startByte != null && endByte != null;
    }

    private void adjustRequest(PresignedUrlDownloadRequest request) {
        long start = -1;
        long end = -1;

        if (request.getRange() != null) {
            long[] range = request.getRange();
            start = range[0];
            end = range[1];
        } else {
            start = startByte.longValue();
            end = endByte.longValue();
        }

        if (dstfile.exists()) {
            if (!FileLocks.lock(dstfile)) {
                throw new FileLockException("Fail to lock " + dstfile + " for range adjustment");
            }
            try {
                expectedFileLength = dstfile.length();
                long newStart = start + expectedFileLength;
                LOG.debug("Adjusting request range from " +  Arrays.toString(new long[] {start, end})
                         + " to " + Arrays.toString(new long[] {newStart, end})
                         + " for file " + dstfile);
                request.setRange(newStart, end);

                long totalBytesToDownload  = end - newStart + 1;
                if (totalBytesToDownload < 0) {
                    throw new IllegalArgumentException(
                        "Unable to determine the range for download operation. lastByte=" + end
                        + ", StartingByte=" + newStart
                        + ", expectedFileLength=" + expectedFileLength
                        + ", totalBytesToDownload=" + totalBytesToDownload);
                }
            } finally {
                FileLocks.unlock(dstfile);
            }
        }
    }

    private void downloadInParallelUsingRange() throws Exception {
        createParentDirectoryIfNecessary(dstfile);

        if (!FileLocks.lock(dstfile)) {
            throw new FileLockException("Fail to lock " + dstfile);
        }

        long currentStart = startByte;
        long currentEnd = 0L;
        long filePositionToWrite = 0L;

        while (currentStart <= endByte) {
            // end is inclusive in setRange, so reduce size by 1
            currentEnd = currentStart + perRequestDownloadSize - 1;

            if (currentEnd > endByte) {
                currentEnd = endByte;
            }

            PresignedUrlDownloadRequest rangeRequest = request.clone();
            rangeRequest.setRange(currentStart, currentEnd);

            Callable<S3Object> s3Object = serviceCall(rangeRequest);
            futures.add(executor.submit(new DownloadS3ObjectCallable(s3Object,
                                                                     dstfile,
                                                                     filePositionToWrite)));

            filePositionToWrite += perRequestDownloadSize;
            currentStart = currentEnd + 1;
        }

        Future<File> future = executor.submit(completeAllFutures());

        ((DownloadMonitor) download.getMonitor()).setFuture(future);
    }

    /**
     * Returns a Callable to execute {@link AmazonS3#download(PresignedUrlDownloadRequest)} with given request.
     */
    private Callable<S3Object> serviceCall(final PresignedUrlDownloadRequest presignedUrlDownloadRequest) {
        return new Callable<S3Object>() {
            @Override
            public S3Object call() throws Exception {
                return s3.download(presignedUrlDownloadRequest)
                         .getS3Object();
            }
        };
    }

    private Callable<File> completeAllFutures() {
        return new Callable<File>() {
            @Override
            public File call() throws Exception {
                try {
                    for (Future<Long> future : futures) {
                        future.get();
                    }

                    download.setState(Transfer.TransferState.Completed);
                } finally {
                    FileLocks.unlock(dstfile);
                }

                return dstfile;
            }
        };
    }

    private static boolean testing;

    /**
     * Used for testing purpose only.
     */
    @SdkTestInternalApi
    public static void setTesting(boolean b) {
        testing = b;
    }
}
