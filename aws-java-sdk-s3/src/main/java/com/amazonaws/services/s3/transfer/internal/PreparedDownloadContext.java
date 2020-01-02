/*
 * Copyright 2019-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

@SdkInternalApi
public final class PreparedDownloadContext {
    private final DownloadImpl transfer;
    private final Callable<?> callable;
    private final CountDownLatch latch;

    public PreparedDownloadContext(DownloadImpl transfer, Callable<?> callable, CountDownLatch latch) {
        this.transfer = transfer;
        this.callable = callable;
        this.latch = latch;
    }

    public DownloadImpl getTransfer() {
        return transfer;
    }

    public Callable<?> getCallable() {
        return callable;
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
