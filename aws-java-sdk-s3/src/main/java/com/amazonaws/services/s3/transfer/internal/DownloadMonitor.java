/*
 * Copyright 2012-2021 Amazon Technologies, Inc.
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
package com.amazonaws.services.s3.transfer.internal;

import java.io.File;
import java.util.concurrent.Future;

public class DownloadMonitor implements TransferMonitor {
    private Future<File> future;
    private final AbstractTransfer download;

    public DownloadMonitor(AbstractTransfer download, Future<File> future) {
        this.download = download;
        this.future = future;
    }

    @Override
    public synchronized Future<File> getFuture() {
        return future;
    }

    public synchronized void setFuture(Future<File> future) {
        this.future = future;
    }

    @Override
    public boolean isDone() {
        return download.isDone();
    }
}
