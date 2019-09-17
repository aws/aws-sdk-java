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
import com.amazonaws.services.s3.transfer.PersistableTransfer;

/**
 * S3 specific progress listener chain.
 */
public class S3ProgressListenerChain extends
        com.amazonaws.event.ProgressListenerChain implements S3ProgressListener
{
    /**
     * Create a listener chain that directly passes all the progress events to
     * the specified listeners.
     * 
     * @param listeners only listeners of type {@link S3ProgressListener}
     * will be notified with the S3 transfer events. 
     */
    public S3ProgressListenerChain(ProgressListener... listeners) {
        super(listeners);
    }

    @Override
    public void onPersistableTransfer(PersistableTransfer persistableTransfer) {
        for (ProgressListener listener : getListeners()) {
            if (listener instanceof S3ProgressListener) {
                S3ProgressListener s3listener = (S3ProgressListener)listener;
                s3listener.onPersistableTransfer(persistableTransfer);
            }
        }
    }
}
