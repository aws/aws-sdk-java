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

import java.io.File;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;

/**
 * A proxy cryptographic module used to dispatch method calls to the appropriate
 * underlying cryptographic module depending on the current configuration.
 */
public class CryptoModuleDispatcher extends S3CryptoModule<MultipartUploadContext> {
    private final CryptoMode defaultCryptoMode;
    /** Encryption only (EO) cryptographic module. */
    private final S3CryptoModuleEO eo;
    /** Authenticated encryption (AE) cryptographic module. */
    private final S3CryptoModuleAE ae;

    public CryptoModuleDispatcher(S3Direct s3,
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig) {
        CryptoMode cryptoMode = cryptoConfig.getCryptoMode();
        this.defaultCryptoMode = cryptoMode == null ? CryptoMode.EncryptionOnly : cryptoMode;
        switch(defaultCryptoMode) {
            case StrictAuthenticatedEncryption:
                this.ae = new S3CryptoModuleAEStrict(s3, credentialsProvider,
                        encryptionMaterialsProvider, clientConfig, cryptoConfig);
                this.eo = null;
                break;
            case AuthenticatedEncryption:
                this.ae = new S3CryptoModuleAE(s3, credentialsProvider,
                        encryptionMaterialsProvider, clientConfig, cryptoConfig);
                this.eo = null;
                break;
            default:
                this.eo = new S3CryptoModuleEO(s3, credentialsProvider,
                        encryptionMaterialsProvider, clientConfig, cryptoConfig);
                this.ae = new S3CryptoModuleAE(s3, credentialsProvider,
                        encryptionMaterialsProvider, clientConfig, cryptoConfig);
                break;
        }
    }

    @Override
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        return defaultCryptoMode == CryptoMode.EncryptionOnly
             ? eo.putObjectSecurely(putObjectRequest)
             : ae.putObjectSecurely(putObjectRequest)
             ;
    }

    @Override
    public S3Object getObjectSecurely(GetObjectRequest req)
            throws AmazonClientException, AmazonServiceException {
        // AE module can handle S3 objects encrypted in either AE or OE format
        return ae.getObjectSecurely(req);
    }

    @Override
    public ObjectMetadata getObjectSecurely(GetObjectRequest req, File destinationFile)
            throws AmazonClientException, AmazonServiceException {
        // AE module can handle S3 objects encrypted in either AE or OE format
        return ae.getObjectSecurely(req, destinationFile);
    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(
            CompleteMultipartUploadRequest req)
                    throws AmazonClientException, AmazonServiceException {
        return defaultCryptoMode == CryptoMode.EncryptionOnly 
             ? eo.completeMultipartUploadSecurely(req)
             : ae.completeMultipartUploadSecurely(req)
             ;
    }

    @Override
    public void abortMultipartUploadSecurely(AbortMultipartUploadRequest req) {
        if (defaultCryptoMode == CryptoMode.EncryptionOnly)
            eo.abortMultipartUploadSecurely(req);
        else
            ae.abortMultipartUploadSecurely(req);
    }

    @Override
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(
            InitiateMultipartUploadRequest req)
                    throws AmazonClientException, AmazonServiceException {
        return defaultCryptoMode == CryptoMode.EncryptionOnly 
             ? eo.initiateMultipartUploadSecurely(req)
             : ae.initiateMultipartUploadSecurely(req)
             ;
    }

    /**
     * {@inheritDoc}
     *
     * <p>
     * <b>NOTE:</b> Because the encryption process requires context from block
     * N-1 in order to encrypt block N, parts uploaded with the
     * AmazonS3EncryptionClient (as opposed to the normal AmazonS3Client) must
     * be uploaded serially, and in order. Otherwise, the previous encryption
     * context isn't available to use when encrypting the current part.
     */
    @Override
    public UploadPartResult uploadPartSecurely(UploadPartRequest req)
        throws AmazonClientException, AmazonServiceException {
        return defaultCryptoMode == CryptoMode.EncryptionOnly
             ? eo.uploadPartSecurely(req)
             : ae.uploadPartSecurely(req)
             ;
    }

    @Override
    public CopyPartResult copyPartSecurely(CopyPartRequest req) {
        return defaultCryptoMode == CryptoMode.EncryptionOnly 
             ? eo.copyPartSecurely(req)
             : ae.copyPartSecurely(req)
             ;
    }
}
