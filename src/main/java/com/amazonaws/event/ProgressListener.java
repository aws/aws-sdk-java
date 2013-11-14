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
package com.amazonaws.event;

/**
 * Listener interface for transfer progress events.
 * <p>
 * This class could be used for both Amazon S3 and Amazon Glacier clients. The
 * legacy Amazon S3 progress listener
 * com.amazonaws.services.s3.model.ProgressListener has been deprecated in favor
 * of this new class.
 * </p>
 * 
 * @see ProgressEvent
 */
public interface ProgressListener {

    /**
     * Called when progress has changed, such as additional bytes transferred,
     * transfer failed, etc. The execution of the callback of this listener is managed
     * by {@link ProgressListenerCallbackExecutor} class, which maintains a single thread
     * to sequentially execute all progressChanged callbacks.
     *
     * @param progressEvent
     *            The event describing the progress change.
     *            
     * @see ProgressListenerCallbackExecutor
     */
    public void progressChanged(ProgressEvent progressEvent);

}
