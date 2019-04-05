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

import static com.amazonaws.services.s3.model.CryptoMode.AuthenticatedEncryption;
import static com.amazonaws.services.s3.model.CryptoMode.EncryptionOnly;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.kms.AWSKMS;
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
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.UploadObjectRequest;
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

    public CryptoModuleDispatcher(AWSKMS kms, S3Direct s3,
                                  AWSCredentialsProvider credentialsProvider,
                                  EncryptionMaterialsProvider encryptionMaterialsProvider,
                                  CryptoConfiguration cryptoConfig) {
        cryptoConfig = cryptoConfig.clone();    // make a clone
        CryptoMode cryptoMode = cryptoConfig.getCryptoMode();
        if (cryptoMode == null) {
            cryptoMode = EncryptionOnly;
            cryptoConfig.setCryptoMode(cryptoMode); // defaults to EO
        }
        cryptoConfig = cryptoConfig.readOnly(); // make read-only
        this.defaultCryptoMode = cryptoConfig.getCryptoMode();
        switch(this.defaultCryptoMode) {
            case StrictAuthenticatedEncryption:
                this.ae = new S3CryptoModuleAEStrict(kms, s3, credentialsProvider,
                        encryptionMaterialsProvider,
                        cryptoConfig);
                this.eo = null;
                break;
            case AuthenticatedEncryption:
                this.ae = new S3CryptoModuleAE(kms, s3, credentialsProvider,
                        encryptionMaterialsProvider,
                        cryptoConfig);
                this.eo = null;
                break;
            case EncryptionOnly:
                this.eo = new S3CryptoModuleEO(kms, s3, credentialsProvider,
                        encryptionMaterialsProvider,
                        cryptoConfig);
                CryptoConfiguration aeConfig = cryptoConfig.clone();
                try {
                    aeConfig.setCryptoMode(AuthenticatedEncryption);
                } catch(UnsupportedOperationException ex) {
                    // BC not available during runtime; but EO can still work.
                    // Hence ignoring.
                }
                this.ae = new S3CryptoModuleAE(kms, s3, credentialsProvider,
                    encryptionMaterialsProvider,
                    aeConfig.readOnly());
                break;
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest) {
        return defaultCryptoMode == EncryptionOnly
             ? eo.putObjectSecurely(putObjectRequest)
             : ae.putObjectSecurely(putObjectRequest)
             ;
    }

    @Override
    public S3Object getObjectSecurely(GetObjectRequest req) {
        // AE module can handle S3 objects encrypted in either AE or EO format
        return ae.getObjectSecurely(req);
    }

    @Override
    public ObjectMetadata getObjectSecurely(GetObjectRequest req,
            File destinationFile) {
        // AE module can handle S3 objects encrypted in either AE or EO format
        return ae.getObjectSecurely(req, destinationFile);
    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(
            CompleteMultipartUploadRequest req)
                    throws SdkClientException, AmazonServiceException {
        return defaultCryptoMode == EncryptionOnly 
             ? eo.completeMultipartUploadSecurely(req)
             : ae.completeMultipartUploadSecurely(req)
             ;
    }

    @Override
    public void abortMultipartUploadSecurely(AbortMultipartUploadRequest req) {
        if (defaultCryptoMode == EncryptionOnly)
            eo.abortMultipartUploadSecurely(req);
        else
            ae.abortMultipartUploadSecurely(req);
    }

    @Override
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(
            InitiateMultipartUploadRequest req)
                    throws SdkClientException, AmazonServiceException {
        return defaultCryptoMode == EncryptionOnly 
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
        throws SdkClientException, AmazonServiceException {
        return defaultCryptoMode == EncryptionOnly
             ? eo.uploadPartSecurely(req)
             : ae.uploadPartSecurely(req)
             ;
    }

    @Override
    public CopyPartResult copyPartSecurely(CopyPartRequest req) {
        return defaultCryptoMode == EncryptionOnly 
             ? eo.copyPartSecurely(req)
             : ae.copyPartSecurely(req)
             ;
    }

    @Override
    public PutObjectResult putInstructionFileSecurely(
            PutInstructionFileRequest req) {
        return defaultCryptoMode == EncryptionOnly
            ? eo.putInstructionFileSecurely(req)
            : ae.putInstructionFileSecurely(req)
            ;
    }

    @Override
    public void putLocalObjectSecurely(UploadObjectRequest req,
            String uploadId, OutputStream os) throws IOException {
        if (defaultCryptoMode == EncryptionOnly)
            eo.putLocalObjectSecurely(req, uploadId, os);
        else
            ae.putLocalObjectSecurely(req, uploadId, os);
    }
}
