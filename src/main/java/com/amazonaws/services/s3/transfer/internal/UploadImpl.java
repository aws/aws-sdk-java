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

import java.util.concurrent.Future;

import com.amazonaws.services.s3.transfer.Upload;

public class UploadImpl extends Upload {
    public UploadImpl(String description, TransferProgressImpl transferProgressInternalState,
            ProgressListenerChain progressListenerChain) {
        super(description, transferProgressInternalState, progressListenerChain);
    }

    /**
     * Sets the state of this transfer - callers should <b>never</b> call this
     * method directly, it's only intended for the library to use when updating
     * a transfer's state.
     * 
     * @param state
     *            The new state of this transfer.
     */
    public void setState(TransferState state) {
        if (super.state == state) return;
        super.state = state;
    }
    
    /**
     * Sets the future for the result of the asynchronous transfer.
     * 
     * @param future
     */
    public void setFuture(Future<?> future) {
        super.future = future;
    }
}