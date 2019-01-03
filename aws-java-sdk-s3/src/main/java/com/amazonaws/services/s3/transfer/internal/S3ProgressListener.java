/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.ProgressListener.ExceptionReporter;
import com.amazonaws.services.s3.transfer.PersistableTransfer;

/**
 * S3 specific listener interface for transfer progress events.
 */
public interface S3ProgressListener extends ProgressListener {
    /**
     * Called when the information to resume an upload/download operation is
     * available, The execution of the callback of this listener is managed by
     * {@link S3ProgressPublisher}. Implementation of this interface should
     * never block.
     * <p>
     * If the implementation follows the best practice and doesn't block, it
     * should then extends from {@link S3SyncProgressListener}.
     * <p>
     * Note any exception thrown by the listener will get ignored. Should there
     * be need to capture any such exception, you may consider wrapping the
     * listener with
     * {@link ExceptionReporter#wrap(ProgressListener)}.
     * 
     * @param persistableTransfer
     *            A non null opaque token used to resume an upload or download.
     * 
     * @see S3ProgressPublisher
     * @see ExceptionReporter
     */
    public void onPersistableTransfer(final PersistableTransfer persistableTransfer);
}
