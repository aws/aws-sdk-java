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
package com.amazonaws.services.s3.internal.crypto;


final class MultipartUploadCryptoContext extends MultipartUploadContext {
    private final ContentCryptoMaterial cekMaterial;

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
}
