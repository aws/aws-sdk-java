/*
 * Copyright 2018-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.model.PresignedUrlDownloadRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.transfer.PresignedUrlDownload;
import com.amazonaws.services.s3.transfer.TransferProgress;
import java.io.IOException;
import java.net.URL;

/**
 * Implementation for {@link PresignedUrlDownload} interface. This represents the result of the download operation
 * in TransferManager using presigned urls.
 */
@SdkInternalApi
public class PresignedUrlDownloadImpl extends AbstractTransfer implements PresignedUrlDownload {

    private final PresignedUrlDownloadRequest presignedUrlDownloadRequest;
    private S3Object s3Object;

    public PresignedUrlDownloadImpl(String description,
                                    TransferProgress transferProgress,
                                    ProgressListenerChain progressListenerChain,
                                    PresignedUrlDownloadRequest presignedUrlDownloadRequest) {
        super(description, transferProgress, progressListenerChain);
        this.presignedUrlDownloadRequest = presignedUrlDownloadRequest;
    }

    /**
     *  Set the S3 object to download.
     */
    public synchronized void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    @Override
    public URL getPresignedUrl() {
        return presignedUrlDownloadRequest.getPresignedUrl();
    }

    @Override
    public synchronized void abort() throws IOException {
        this.monitor.getFuture().cancel(true);

        if (s3Object != null) {
            s3Object.getObjectContent().abort();
        }
        setState(TransferState.Canceled);
    }

    /**
     * This method is also responsible for firing COMPLETED signal to the
     * listeners.
     */
    @Override
    public void setState(TransferState state) {
        super.setState(state);

        switch (state) {
            case Completed :
                fireProgressEvent(ProgressEventType.TRANSFER_COMPLETED_EVENT);
                break;
            case Canceled:
                fireProgressEvent(ProgressEventType.TRANSFER_CANCELED_EVENT);
                break;
            case Failed:
                fireProgressEvent(ProgressEventType.TRANSFER_FAILED_EVENT);
                break;
            default:
                break;
        }
    }
}
