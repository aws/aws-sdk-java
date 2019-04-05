/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model;

/**
 * Listener interface for transfer progress events.
 * 
 * @deprecated Use {@link com.amazonaws.event.ProgressListener} instead. Using
 * this class is <b>dangerous</b> as it uses the deprecated {@link
 * ProgressEvent}, which performs an unsafe cast from {@code long} to {@code
 * int} in {@link ProgressEvent#getBytesTransfered()}.
 *
 * @see ProgressEvent
 * @see PutObjectRequest#setProgressListener(ProgressListener)
 * @see UploadPartRequest#setProgressListener(ProgressListener)
 */
@Deprecated
public interface ProgressListener {

    /**
     * Called when progress has changed, such as additional bytes transferred,
     * transfer failed, etc.
     *
     * @param progressEvent
     *            The event describing the progress change.
     */
    public void progressChanged(ProgressEvent progressEvent);

}
