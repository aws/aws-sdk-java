/*
 * Copyright 2013-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto.v2;

import static com.amazonaws.services.s3.model.CryptoMode.StrictAuthenticatedEncryption;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme;
import com.amazonaws.services.s3.model.CryptoConfigurationV2;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.CryptoRangeGetMode;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.S3ObjectId;

/**
 * Strict Authenticated encryption (AE) cryptographic module for the S3
 * encryption client.
 */
public class S3CryptoModuleAEStrict extends S3CryptoModuleAE {
    /**
     * @param cryptoConfig a read-only copy of the crypto configuration.
     */
    public S3CryptoModuleAEStrict(AWSKMS kms, S3Direct s3,
                           AWSCredentialsProvider credentialsProvider,
                           EncryptionMaterialsProvider encryptionMaterialsProvider,
                           CryptoConfigurationV2 cryptoConfig) {
        super(kms, s3, credentialsProvider, encryptionMaterialsProvider, cryptoConfig);
        if (cryptoConfig.getCryptoMode() != StrictAuthenticatedEncryption)
            throw new IllegalArgumentException();
    }

    protected final boolean isStrict() {
        return true;
    }

    @Override
    protected void securityCheck(ContentCryptoMaterial cekMaterial, S3ObjectId objectId, boolean isRangeGet) {
        // Note: a range get means AES_GCM won't be selected. We validate within the ContentCryptoMaterial class that
        // the algorithm chosen is fit for the configured RangeGetMode.
        if (!isRangeGet && !ContentCryptoScheme.AES_GCM.equals(cekMaterial.getContentCryptoScheme())) {
            throw new SecurityException("S3 object [bucket: "
                    + objectId.getBucket() + ", key: "
                    + objectId.getKey()
                    + "] not encrypted using authenticated encryption");
        }
    }
}
