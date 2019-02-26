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
package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.annotation.GuardedBy;

import com.amazonaws.SdkClientException;

class MultipartUploadCryptoContext extends MultipartUploadContext {
    private final ContentCryptoMaterial cekMaterial;
    /**
     * Can be used to enforce serial uploads.
     */
    @GuardedBy("this")
    private int partNumber;
    /**
     * True if a multi-part upload is currently in progress; false otherwise.
     */
    private volatile boolean partUploadInProgress;

    MultipartUploadCryptoContext(String bucketName, String key,
            ContentCryptoMaterial cekMaterial) {
        super(bucketName, key);
        this.cekMaterial = cekMaterial;
    }

    /**
     * Convenient method to return the content encrypting cipher lite (which is
     * stateful) for the multi-part uploads.
     */
    CipherLite getCipherLite() {
        return cekMaterial.getCipherLite();
    }

    /**
     * Returns the content encrypting cryptographic material for the multi-part
     * uploads.
     */
    ContentCryptoMaterial getContentCryptoMaterial() {
        return cekMaterial;
    }

    /**
     * Can be used to check the next part number must either be the same (if it
     * was an retry) or increment by exactly 1 during a serial part uploads.
     * <p>
     * As a side effect, the {@link #partUploadInProgress} will be set to true
     * upon successful completion of this method. Caller of this method is
     * responsible to call {@link #endPartUpload()} in a finally block once
     * the respective part-upload is completed (either normally or abruptly).
     * 
     * @see #endPartUpload()
     * 
     * @throws SdkClientException
     *             if parallel part upload is detected
     */
    void beginPartUpload(final int nextPartNumber)
            throws SdkClientException {
        if (nextPartNumber < 1)
            throw new IllegalArgumentException("part number must be at least 1");
        if (partUploadInProgress) {
            throw new SdkClientException(
                    "Parts are required to be uploaded in series");
        }
        synchronized (this) {
            if (nextPartNumber - partNumber <= 1) {
                partNumber = nextPartNumber;
                partUploadInProgress = true;
            } else {
                throw new SdkClientException(
                        "Parts are required to be uploaded in series (partNumber="
                                + partNumber + ", nextPartNumber="
                                + nextPartNumber + ")");
            }
        }
    }

    /**
     * Used to mark the completion of a part upload before the next. Should be
     * invoked in a finally block, and must be preceded previously by a call to
     * {@link #beginPartUpload(int)}.
     * 
     * @see #beginPartUpload(int)
     */
    void endPartUpload() {
        partUploadInProgress = false;
    }
}
