/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.transfer.Upload;
import com.amazonaws.services.s3.transfer.model.UploadResult;

public class UploadImpl extends AbstractTransfer implements Upload {
    
    public UploadImpl(String description, TransferProgressImpl transferProgressInternalState,
            ProgressListenerChain progressListenerChain, TransferStateChangeListener listener) {
        super(description, transferProgressInternalState, progressListenerChain, listener);
    }

    /**
     * @deprecated Replaced by {@link #UploadImpl(String, TransferProgressImpl, ProgressListenerChain, TransferStateChangeListener)}
     */
    @Deprecated
    public UploadImpl(String description, TransferProgressImpl transferProgressInternalState,
            com.amazonaws.services.s3.transfer.internal.ProgressListenerChain progressListenerChain, TransferStateChangeListener listener) {
        this(description, transferProgressInternalState, progressListenerChain.transformToGeneralProgressListenerChain(), listener);
    }

    /**
     * Waits for this upload to complete and returns the result of this
     * upload. Be prepared to handle errors when calling this method. Any
     * errors that occurred during the asynchronous transfer will be re-thrown
     * through this method.
     * 
     * @return The result of this transfer.
     * 
     * @throws AmazonClientException
     *             If any errors were encountered in the client while making the
     *             request or handling the response.
     * @throws AmazonServiceException
     *             If any errors occurred in Amazon S3 while processing the
     *             request.
     * @throws InterruptedException
     *             If this thread is interrupted while waiting for the upload to
     *             complete.
     */
    public UploadResult waitForUploadResult() 
            throws AmazonClientException, AmazonServiceException, InterruptedException {
        try {
            UploadResult result = null;
            while (!monitor.isDone() || result == null) {
                Future<?> f = monitor.getFuture();
                result = (UploadResult)f.get();
            }
            return result;
        } catch (ExecutionException e) {
            rethrowExecutionException(e);
            return null;
        }
    }

}
