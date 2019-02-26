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

import static com.amazonaws.services.s3.model.CryptoMode.StrictAuthenticatedEncryption;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;

/**
 * Strict Authenticated encryption (AE) cryptographic module for the S3
 * encryption client.
 */
class S3CryptoModuleAEStrict extends S3CryptoModuleAE {
    /**
     * @param cryptoConfig a read-only copy of the crypto configuration.
     */
    S3CryptoModuleAEStrict(AWSKMS kms, S3Direct s3,
                           AWSCredentialsProvider credentialsProvider,
                           EncryptionMaterialsProvider encryptionMaterialsProvider,
                           CryptoConfiguration cryptoConfig) {
        super(kms, s3, credentialsProvider, encryptionMaterialsProvider,
                cryptoConfig);
        if (cryptoConfig.getCryptoMode() != StrictAuthenticatedEncryption)
            throw new IllegalArgumentException();
    }

    protected final boolean isStrict() {
        return true;
    }

    protected void securityCheck(ContentCryptoMaterial cekMaterial,
            S3ObjectWrapper retrieved) {
        if (!ContentCryptoScheme.AES_GCM.equals(cekMaterial.getContentCryptoScheme())) {
            throw new SecurityException("S3 object [bucket: "
                    + retrieved.getBucketName() + ", key: "
                    + retrieved.getKey()
                    + "] not encrypted using authenticated encryption");
        }
    }
}
