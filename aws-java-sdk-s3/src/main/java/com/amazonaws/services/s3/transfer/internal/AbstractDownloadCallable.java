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

import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.transfer.AbortableTransfer;
import com.amazonaws.services.s3.transfer.Transfer;
import com.amazonaws.services.s3.transfer.TransferManager;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Abstract callable used for downloading objects using {@link TransferManager}.
 *
 * @see PresignUrlDownloadCallable
 */
@SdkInternalApi
public abstract class AbstractDownloadCallable implements Callable<File> {

    /** The thread pool in which partial objects are downloaded. */
    protected final ExecutorService executor;
    protected final List<Future<Long>> futures;
    protected final File dstfile;

    private final CountDownLatch latch;
    private final AbortableTransfer abortableDownload;
    private final boolean isDownloadParallel;
    private final ScheduledExecutorService timedExecutor;
    private final long timeout;

    protected AbstractDownloadCallable(AbstractDownloadCallableConfig options) {
        if (options.getLatch() == null || options.getDestFile() == null || options.getAbortableDownload() == null) {
            throw new IllegalArgumentException();
        }

        this.executor = options.getExecutor();
        this.timedExecutor = options.getTimedExecutor();
        this.futures = new ArrayList<Future<Long>>();
        this.dstfile = options.getDestFile();
        this.latch = options.getLatch();
        this.abortableDownload = options.getAbortableDownload();
        this.isDownloadParallel = options.isDownloadParallel();
        this.timeout = options.getTimeout();
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
                timedExecutor.schedule(new Runnable() {
                    public void run() {
                        try {
                            if (abortableDownload.getState() != Transfer.TransferState.Completed) {
                                abortableDownload.abort();
                            }
                        } catch (Exception e) {
                            throw new SdkClientException(
                                "Unable to abort download after timeout", e);
                        }
                    }
                }, timeout, TimeUnit.MILLISECONDS);
            }

            setState(Transfer.TransferState.InProgress);
            createParentDirectoryIfNecessary(dstfile);

            if (isDownloadParallel) {
                downloadInParallel();
            } else {
                downloadAsSingleObject();
            }
            return dstfile;
        } catch (Throwable t) {
            cleanupAfterException();
            if (t instanceof Exception) {
                throw (Exception) t;
            } else {
                throw (Error) t;
            }
        }
    }

    /**
     * Set the current {@link Transfer.TransferState}
     */
    protected abstract void setState(Transfer.TransferState transferState);

    /**
     * Download the object from S3 in a single request
     */
    protected abstract void downloadAsSingleObject();

    /**
     * Download the object from S3 in multiple requests
     */
    protected abstract void downloadInParallel() throws Exception;

    protected static AbstractDownloadCallableConfig constructCallableConfig(ExecutorService executor, File dstfile,
                                                                            CountDownLatch latch, AbortableTransfer download,
                                                                            boolean isDownloadParallel,
                                                                            ScheduledExecutorService timedExecutor, long timeout) {
        return new AbstractDownloadCallableConfig()
            .withExecutor(executor)
            .withDestFile(dstfile)
            .withLatch(latch)
            .withAbortableDownload(download)
            .withDownloadParallel(isDownloadParallel)
            .withTimedExecutor(timedExecutor)
            .withTimeout(timeout);
    }

    private boolean isTimeoutEnabled() {
        return timeout > 0;
    }

    private void cleanupAfterException() {
        // Cancel all the futures
        for (Future<Long> f : futures) {
            f.cancel(true);
        }
        // Downloads aren't allowed to move from canceled to failed
        if (abortableDownload.getState() != Transfer.TransferState.Canceled) {
            setState(Transfer.TransferState.Failed);
        }
    }
}
