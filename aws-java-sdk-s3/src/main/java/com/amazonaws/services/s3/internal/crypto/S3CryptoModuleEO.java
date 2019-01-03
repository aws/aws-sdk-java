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

import static com.amazonaws.services.s3.model.CryptoMode.EncryptionOnly;

import java.io.File;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadPartRequest;

/**
 * Encryption only (EO) cryptographic module for the S3 encryption client.
 */
class S3CryptoModuleEO extends S3CryptoModuleBase<MultipartUploadCbcContext> {
    /**
     * @param cryptoConfig a read-only copy of the crypto configuration
     */
    S3CryptoModuleEO(AWSKMS kms, S3Direct s3,
                     AWSCredentialsProvider credentialsProvider,
                     EncryptionMaterialsProvider encryptionMaterialsProvider,
                     CryptoConfiguration cryptoConfig) {
        super(kms, s3, credentialsProvider, encryptionMaterialsProvider,
                cryptoConfig);
        if (cryptoConfig.getCryptoMode() != EncryptionOnly)
            throw new IllegalArgumentException();
    }

    /**
     * Used for testing purposes only.
     */
    S3CryptoModuleEO(S3Direct s3,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(null, s3, new DefaultAWSCredentialsProviderChain(),
                encryptionMaterialsProvider, cryptoConfig);
    }

    /**
     * Used for testing purposes only.
     */
    S3CryptoModuleEO(AWSKMS kms, S3Direct s3,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(kms, s3, new DefaultAWSCredentialsProviderChain(),
                encryptionMaterialsProvider, cryptoConfig);
    }

    @Override
    public S3Object getObjectSecurely(GetObjectRequest getObjectRequest) {
        // Should never get here, as S3 object encrypted in either EO or AE
        // format should all be handled by the AE module.
        throw new IllegalStateException();
    }

    @Override
    public ObjectMetadata getObjectSecurely(GetObjectRequest getObjectRequest,
            File destinationFile) {
        // Should never get here, as S3 object encrypted in either EO or AE
        // format should all be handled by the AE module.
        throw new IllegalStateException();
    }

    @Override
    final MultipartUploadCbcContext newUploadContext(
            InitiateMultipartUploadRequest req,
            ContentCryptoMaterial cekMaterial) {
        MultipartUploadCbcContext encryptedUploadContext = new MultipartUploadCbcContext(
                req.getBucketName(), req.getKey(), cekMaterial);
        byte[] iv = cekMaterial.getCipherLite().getIV();
        encryptedUploadContext.setNextInitializationVector(iv);
        return encryptedUploadContext; 
    }


    @Override
    final void updateUploadContext(MultipartUploadCbcContext uploadContext,
            SdkFilterInputStream is) {
        ByteRangeCapturingInputStream bis = (ByteRangeCapturingInputStream)is;
        uploadContext.setNextInitializationVector(bis.getBlock());
        return;
    }

    @Override
    final ByteRangeCapturingInputStream wrapForMultipart(
            CipherLiteInputStream is, long partSize) {
        int blockSize = contentCryptoScheme.getBlockSizeInBytes();
        return new ByteRangeCapturingInputStream(is, 
                partSize - blockSize,
                partSize);
    }
    
    @Override
    final long computeLastPartSize(UploadPartRequest request) {
        long plaintextLength;
        if (request.getFile() != null) {
            if (request.getPartSize() > 0)
                plaintextLength = request.getPartSize();
            else
                plaintextLength = request.getFile().length();
        } else if (request.getInputStream() != null) {
            plaintextLength = request.getPartSize();
        } else {
            return -1;
        }
        long cipherBlockSize = contentCryptoScheme.getBlockSizeInBytes();
        long offset = cipherBlockSize - (plaintextLength % cipherBlockSize);
        return plaintextLength + offset;
    }

    @Override
    final CipherLite cipherLiteForNextPart(
            MultipartUploadCbcContext uploadContext) {
        CipherLite cipherLite = uploadContext.getCipherLite();
        byte[] nextIV = uploadContext.getNextInitializationVector();
        return cipherLite.createUsingIV(nextIV);
    }

    /*
     * Private helper methods
     */

    @Override
    protected final long ciphertextLength(long plaintextLength) {
        long cipherBlockSize = contentCryptoScheme.getBlockSizeInBytes();
        long offset = cipherBlockSize - (plaintextLength % cipherBlockSize);
        return plaintextLength + offset;
    }
}
