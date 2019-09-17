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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.services.s3.transfer.AbortableTransfer;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/**
 * Class with configuration objects to construct {@link AbstractDownloadCallable}
 */
@SdkInternalApi
final class AbstractDownloadCallableConfig {

    /** The thread pool in which partial objects are downloaded. */
    private ExecutorService executor;

    /** The destination file to abortableDownload the object to */
    private File destFile;

    private CountDownLatch latch;

    /** Transfer for abortableDownload that can be aborted. */
    private AbortableTransfer abortableDownload;

    /** Options whether to abortableDownload the object in parallel. */
    private boolean isDownloadParallel;

    /** Executor service used for periodically checking transfers and updating their state,
     * as well as enforcing timeouts.
     */
    private ScheduledExecutorService timedExecutor;

    /**  Timeout, in milliseconds, for waiting for this abortableDownload to complete. */
    private long timeout;

    public ExecutorService getExecutor() {
        return executor;
    }

    public void setExecutor(ExecutorService executor) {
        this.executor = executor;
    }

    public AbstractDownloadCallableConfig withExecutor(ExecutorService executor) {
        setExecutor(executor);
        return this;
    }

    public File getDestFile() {
        return destFile;
    }

    public void setDestFile(File destFile) {
        this.destFile = destFile;
    }

    public AbstractDownloadCallableConfig withDestFile(File destFile) {
        setDestFile(destFile);
        return this;
    }

    public CountDownLatch getLatch() {
        return latch;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public AbstractDownloadCallableConfig withLatch(CountDownLatch latch) {
        setLatch(latch);
        return this;
    }

    public AbortableTransfer getAbortableDownload() {
        return abortableDownload;
    }

    public void setAbortableDownload(AbortableTransfer abortableDownload) {
        this.abortableDownload = abortableDownload;
    }

    public AbstractDownloadCallableConfig withAbortableDownload(AbortableTransfer abortableDownload) {
        setAbortableDownload(abortableDownload);
        return this;
    }

    public boolean isDownloadParallel() {
        return isDownloadParallel;
    }

    public void setDownloadParallel(boolean downloadParallel) {
        isDownloadParallel = downloadParallel;
    }

    public AbstractDownloadCallableConfig withDownloadParallel(boolean downloadParallel) {
        setDownloadParallel(downloadParallel);
        return this;
    }

    public ScheduledExecutorService getTimedExecutor() {
        return timedExecutor;
    }

    public void setTimedExecutor(ScheduledExecutorService timedExecutor) {
        this.timedExecutor = timedExecutor;
    }


    public AbstractDownloadCallableConfig withTimedExecutor(ScheduledExecutorService timedExecutor) {
        setTimedExecutor(timedExecutor);
        return this;
    }

    public long getTimeout() {
        return timeout;
    }

    public void setTimeout(long timeout) {
        this.timeout = timeout;
    }


    public AbstractDownloadCallableConfig withTimeout(long timeout) {
        setTimeout(timeout);
        return this;
    }
}
