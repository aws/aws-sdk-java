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
package com.amazonaws.services.s3.transfer.internal;

import java.util.concurrent.Callable;

import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.model.UploadResult;

/**
 * Wraps a Callable object and updates the state of the specified Transfer
 * as the wrapped Callable is executed, and either fails or completes
 * successfully.
 */
public class TransferStateUpdatingCallable implements Callable<UploadResult> {
    private final Callable<UploadResult> callable;
    private final UploadImpl transfer;

    public TransferStateUpdatingCallable(Callable<UploadResult> callable, UploadImpl transfer) {
        this.callable = callable;
        this.transfer = transfer;
    }
    
    public UploadResult call() throws Exception {
        transfer.setState(TransferState.InProgress);

        try {
            UploadResult result = callable.call();
            transfer.setState(TransferState.Completed);
            return result;
        } catch (Exception e) {
            transfer.setState(TransferState.Failed);
            throw e;
        }
    }
}