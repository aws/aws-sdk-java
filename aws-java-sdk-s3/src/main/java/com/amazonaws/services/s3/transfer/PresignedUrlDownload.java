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

package com.amazonaws.services.s3.transfer;

import com.amazonaws.services.s3.model.PresignedUrlDownloadConfig;
import com.amazonaws.services.s3.model.PresignedUrlDownloadRequest;
import java.io.File;
import java.net.URL;

/**
 * Interface to represent the output for the asynchronous download operation using presigned url in {@link TransferManager}.
 *
 * @see TransferManager#download(PresignedUrlDownloadRequest, File, PresignedUrlDownloadConfig).
 */
public interface PresignedUrlDownload extends AbortableTransfer {

    /**
     * @return The presigned url from which the object is being downloaded
     */
    URL getPresignedUrl();
}
