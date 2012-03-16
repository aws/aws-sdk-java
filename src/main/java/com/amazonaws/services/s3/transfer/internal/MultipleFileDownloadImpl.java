/*
 * Copyright 2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.transfer.internal;

import java.io.IOException;
import java.util.Collection;

import com.amazonaws.services.s3.transfer.Download;
import com.amazonaws.services.s3.transfer.MultipleFileDownload;
import com.amazonaws.services.s3.transfer.Transfer;
import com.amazonaws.services.s3.transfer.TransferProgress;

/**
 * Multiple file download when downloading an entire virtual directory.
 */
public class MultipleFileDownloadImpl extends MultipleFileTransfer implements MultipleFileDownload {

    private final String keyPrefix;
    private final String bucketName;
    
    public MultipleFileDownloadImpl(String description, TransferProgress transferProgress,
            ProgressListenerChain progressListenerChain, String keyPrefix, String bucketName, Collection<? extends Download> downloads) {
        super(description, transferProgress, progressListenerChain, downloads);
        this.keyPrefix = keyPrefix;
        this.bucketName = bucketName;
    }

    /**
     * Returns the key prefix of the virtual directory being downloaded.
     */
    public String getKeyPrefix() {
        return keyPrefix;
    }
    
    /**
     * Returns the name of the bucket from which files are downloaded.
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Aborts all outstanding downloads.
     */
    public void abort() throws IOException {
        for (Transfer fileDownload : subTransfers) {
            ((Download)fileDownload).abort();
        }
    }
}
