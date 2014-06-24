/*
 * Copyright 2013-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.event.ProgressListener;
import com.amazonaws.event.ProgressListenerCallbackExecutor;
import com.amazonaws.services.s3.transfer.PersistableTransfer;

/**
 * Used to publish transfer events.
 */
public class S3ProgressPublisher extends
        ProgressListenerCallbackExecutor {

    /**
     * Used to submit a task to publish the availability of a persistable
     * transfer to the given listener.
     * 
     * @return the future of the submitted task; or null if there is no listener.
     */
    public static Future<?> publishTransferPersistable(
            final ProgressListener listener,
            final PersistableTransfer persistableTransfer) {
        if (persistableTransfer == null 
        || !(listener instanceof S3ProgressListener))
            return null;
        final S3ProgressListener s3listener = (S3ProgressListener)listener;
        return getExecutorService().submit(new Runnable() {
            @Override
            public void run() {
                s3listener.onPersistableTransfer(persistableTransfer);
            }
        });
    }
}
