/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.IOException;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.transfer.Download;
import com.amazonaws.services.s3.transfer.TransferProgress;

public class DownloadImpl extends AbstractTransfer implements Download {
    
    S3Object s3Object;

    public DownloadImpl(String description, TransferProgress transferProgress,
            ProgressListenerChain progressListenerChain, S3Object s3Object, TransferStateChangeListener listener) {
        super(description, transferProgress, progressListenerChain, listener);
        this.s3Object = s3Object;
    }
    
    /**
     * @deprecated Replaced by {@link #DownloadImpl(String, TransferProgress, ProgressListenerChain, S3Object, TransferStateChangeListener)}
     */
    @Deprecated
    public DownloadImpl(String description, TransferProgress transferProgress,
            com.amazonaws.services.s3.transfer.internal.ProgressListenerChain progressListenerChain, S3Object s3Object, TransferStateChangeListener listener) {
        this(description, transferProgress, progressListenerChain.transformToGeneralProgressListenerChain(), 
                s3Object, listener);
    }
    
    /**
     * Returns the ObjectMetadata for the object being downloaded.
     *
     * @return The ObjectMetadata for the object being downloaded.
     */
    public ObjectMetadata getObjectMetadata() {
        return s3Object.getObjectMetadata();
    }

    /**
     * The name of the bucket where the object is being downloaded from.
     *
     * @return The name of the bucket where the object is being downloaded from.
     */
    public String getBucketName() {
        return s3Object.getBucketName();
    }

    /**
     * The key under which this object was stored in Amazon S3.
     *
     * @return The key under which this object was stored in Amazon S3.
     */
    public String getKey() {
        return s3Object.getKey();
    }

    /**
     * Cancels this download.
     *
     * @throws IOException
     */
    public synchronized void abort() throws IOException {
        
        this.monitor.getFuture().cancel(true);
        
        if ( s3Object != null ) {
              s3Object.getObjectContent().abort();
        }
        setState(TransferState.Canceled);
    }
    
    /**
     * Cancels this download, but skip notifying the state change listeners.
     * 
     * @throws IOException
     */
    public synchronized void abortWithoutNotifyingStateChangeListener() throws IOException {
        
        this.monitor.getFuture().cancel(true);
        
        if ( s3Object != null ) {
              s3Object.getObjectContent().abort();
        }
        
        synchronized (this) {
            this.state = TransferState.Canceled;
        }
    }
    
    /**
     *  Set the S3 object to download.
     */
    public synchronized void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }
    
    /**
     * This method is also responsible for firing COMPLETED signal to the
     * listeners.
     */
    @Override
    public void setState(TransferState state) {
        super.setState(state);
        
        if (state == TransferState.Completed) {
            fireProgressEvent(ProgressEvent.COMPLETED_EVENT_CODE);
        }
    }
}