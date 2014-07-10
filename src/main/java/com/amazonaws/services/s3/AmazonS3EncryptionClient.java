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
package com.amazonaws.services.s3;

import java.io.File;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.internal.crypto.CryptoModuleDispatcher;
import com.amazonaws.services.s3.internal.crypto.EncryptionUtils;
import com.amazonaws.services.s3.internal.crypto.S3CryptoModule;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.EncryptedInitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.EncryptedPutObjectRequest;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.StaticEncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.util.VersionInfoUtils;

/**
 * Used to perform client-side encryption for storing data securely in S3. Data
 * encryption is done using a one-time randomly generated content encryption
 * key (CEK) per S3 object. 
 * <p>
 * The encryption materials specified in the constructor will be used to
 * protect the CEK which is then stored along side with the S3 object.
 */
public class AmazonS3EncryptionClient extends AmazonS3Client {
    public static final String USER_AGENT = AmazonS3EncryptionClient.class.getName()
            + "/" + VersionInfoUtils.getVersion();
    private final S3CryptoModule<?> crypto;

    // ///////////////////// Constructors ////////////////
    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client that will make <b>anonymous</b>
     * requests to Amazon S3.  If {@link #getObject(String, String)} is called,
     * the object contents will be decrypted with the encryption materials provided.
     * </p>
     * <p>
     * Only a subset of the Amazon S3 API will work with anonymous
     * <i>(i.e. unsigned)</i> requests, but this can prove useful in some situations.
     * For example:
     * <ul>
     *  <li>If an Amazon S3 bucket has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #listObjects(String)} to see what objects are stored in a bucket.</li>
     *  <li>If an object has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #getObject(String, String)} and
     *  {@link #getObjectMetadata(String, String)} to pull object content and
     *  metadata.</li>
     *  <li>If a bucket has {@link Permission#Write} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can upload objects
     *  to the bucket.</li>
     * </ul>
     * </p>
     *
     * @param encryptionMaterials
     *            The encryption materials to be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(EncryptionMaterials encryptionMaterials) {
        this(new StaticEncryptionMaterialsProvider(encryptionMaterials));
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client that will make <b>anonymous</b>
     * requests to Amazon S3.  If {@link #getObject(String, String)} is called,
     * the object contents will be decrypted with the encryption materials provided.
     * </p>
     * <p>
     * Only a subset of the Amazon S3 API will work with anonymous
     * <i>(i.e. unsigned)</i> requests, but this can prove useful in some situations.
     * For example:
     * <ul>
     *  <li>If an Amazon S3 bucket has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #listObjects(String)} to see what objects are stored in a bucket.</li>
     *  <li>If an object has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #getObject(String, String)} and
     *  {@link #getObjectMetadata(String, String)} to pull object content and
     *  metadata.</li>
     *  <li>If a bucket has {@link Permission#Write} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can upload objects
     *  to the bucket.</li>
     * </ul>
     * </p>
     *
     * @param encryptionMaterialsProvider
     *            A provider for the encryption materials to be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(
            EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this((AWSCredentialsProvider) null, encryptionMaterialsProvider,
                new ClientConfiguration(), new CryptoConfiguration());
    }


    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client that will make <b>anonymous</b>
     * requests to Amazon S3.  If {@link #getObject(String, String)} is called,
     * the object contents will be decrypted with the encryption materials provided.
     * The encryption implementation of the provided crypto provider will be
     * used to encrypt and decrypt data.
     * </p>
     * <p>
     * Only a subset of the Amazon S3 API will work with anonymous
     * <i>(i.e. unsigned)</i> requests, but this can prove useful in some situations.
     * For example:
     * <ul>
     *  <li>If an Amazon S3 bucket has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #listObjects(String)} to see what objects are stored in a bucket.</li>
     *  <li>If an object has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #getObject(String, String)} and
     *  {@link #getObjectMetadata(String, String)} to pull object content and
     *  metadata.</li>
     *  <li>If a bucket has {@link Permission#Write} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can upload objects
     *  to the bucket.</li>
     * </ul>
     * </p>
     *
     * @param encryptionMaterials
     *              The encryption materials to be used to encrypt and decrypt data.
     * @param cryptoConfig
     *                The crypto configuration whose parameters will be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(EncryptionMaterials encryptionMaterials,
            CryptoConfiguration cryptoConfig) {
        this(new StaticEncryptionMaterialsProvider(encryptionMaterials),
                cryptoConfig);
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client that will make <b>anonymous</b>
     * requests to Amazon S3.  If {@link #getObject(String, String)} is called,
     * the object contents will be decrypted with the encryption materials provided.
     * The encryption implementation of the provided crypto provider will be
     * used to encrypt and decrypt data.
     * </p>
     * <p>
     * Only a subset of the Amazon S3 API will work with anonymous
     * <i>(i.e. unsigned)</i> requests, but this can prove useful in some situations.
     * For example:
     * <ul>
     *  <li>If an Amazon S3 bucket has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #listObjects(String)} to see what objects are stored in a bucket.</li>
     *  <li>If an object has {@link Permission#Read} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can call
     *  {@link #getObject(String, String)} and
     *  {@link #getObjectMetadata(String, String)} to pull object content and
     *  metadata.</li>
     *  <li>If a bucket has {@link Permission#Write} permission for the
     *  {@link GroupGrantee#AllUsers} group, anonymous clients can upload objects
     *  to the bucket.</li>
     * </ul>
     * </p>
     *
     * @param encryptionMaterialsProvider
     *            A provider for the encryption materials to be used to encrypt and decrypt data.
     * @param cryptoConfig
     *            The crypto configuration whose parameters will be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this((AWSCredentialsProvider) null, encryptionMaterialsProvider,
                new ClientConfiguration(), cryptoConfig);
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client using the specified AWS credentials to
     * access Amazon S3.  Object contents will be encrypted and decrypted with the encryption
     * materials provided.
     * </p>
     *
     * @param credentials
     *            The AWS credentials to use when making requests to Amazon S3
     *            with this client.
     * @param encryptionMaterials
     *            The encryption materials to be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterials encryptionMaterials) {
        this(credentials, new StaticEncryptionMaterialsProvider(
                encryptionMaterials));
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client using the specified AWS credentials to
     * access Amazon S3.  Object contents will be encrypted and decrypted with the encryption
     * materials provided.
     * </p>
     *
     * @param credentials
     *            The AWS credentials to use when making requests to Amazon S3
     *            with this client.
     * @param encryptionMaterialsProvider
     *            A provider for the encryption materials to be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this(credentials, encryptionMaterialsProvider,
                new ClientConfiguration(), new CryptoConfiguration());
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client using the specified AWS credentials to
     * access Amazon S3.  Object contents will be encrypted and decrypted with the encryption
     * materials provided.
     * </p>
     *
     * @param credentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param encryptionMaterialsProvider
     *            A provider for the encryption materials to be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this(credentialsProvider, encryptionMaterialsProvider,
                new ClientConfiguration(), new CryptoConfiguration());
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client using the specified AWS credentials to
     * access Amazon S3.  Object contents will be encrypted and decrypted with the encryption
     * materials provided.  The encryption implementation of the provided crypto provider will
     * be used to encrypt and decrypt data.
     * </p>
     *
     * @param credentials
     *            The AWS credentials to use when making requests to Amazon S3
     *            with this client.
     * @param encryptionMaterials
     *            The encryption materials to be used to encrypt and decrypt data.
     * @param cryptoConfig
     *            The crypto configuration whose parameters will be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterials encryptionMaterials,
            CryptoConfiguration cryptoConfig) {
        this(credentials, new StaticEncryptionMaterialsProvider(
                encryptionMaterials), cryptoConfig);
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client using the specified AWS credentials to
     * access Amazon S3.  Object contents will be encrypted and decrypted with the encryption
     * materials provided.  The encryption implementation of the provided crypto provider will
     * be used to encrypt and decrypt data.
     * </p>
     *
     * @param credentials
     *            The AWS credentials to use when making requests to Amazon S3
     *            with this client.
     * @param encryptionMaterialsProvider
     *            A provider for the encryption materials to be used to encrypt and decrypt data.
     * @param cryptoConfig
     *            The crypto configuration whose parameters will be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(credentials, encryptionMaterialsProvider,
                new ClientConfiguration(), cryptoConfig);
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client using the specified AWS credentials to
     * access Amazon S3.  Object contents will be encrypted and decrypted with the encryption
     * materials provided.  The encryption implementation of the provided crypto provider will
     * be used to encrypt and decrypt data.
     * </p>
     *
     * @param credentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param encryptionMaterialsProvider
     *            A provider for the encryption materials to be used to encrypt and decrypt data.
     * @param cryptoConfig
     *            The crypto configuration whose parameters will be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(credentialsProvider, encryptionMaterialsProvider,
                new ClientConfiguration(), cryptoConfig);
    }

    /**
     * <p>
     * Constructs a new Amazon S3 Encryption client using the specified AWS credentials and
     * client configuration to access Amazon S3.  Object contents will be encrypted and decrypted
     * with the encryption materials provided. The crypto provider and storage mode denoted in
     * the specified crypto configuration will be used to encrypt and decrypt data.
     * </p>
     *
     * @param credentials
     *            The AWS credentials to use when making requests to Amazon S3
     *            with this client.
     * @param encryptionMaterials
     *            The encryption materials to be used to encrypt and decrypt data.
     * @param clientConfig
     *            The client configuration options controlling how this client
     *            connects to Amazon S3 (ex: proxy settings, retry counts, etc).
     * @param cryptoConfig
     *            The crypto configuration whose parameters will be used to encrypt and decrypt data.
     * @throws IllegalArgumentException
     *            If either of the encryption materials or crypto configuration parameters are null.
     */
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterials encryptionMaterials,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        this(credentials, new StaticEncryptionMaterialsProvider(
                encryptionMaterials), clientConfig, cryptoConfig);
    }

    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        this(new StaticCredentialsProvider(credentials),
                encryptionMaterialsProvider, clientConfig, cryptoConfig);
    }

    public AmazonS3EncryptionClient(
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider kekMaterialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig) {
        super(credentialsProvider, clientConfig);
        assertParameterNotNull(kekMaterialsProvider,
                "EncryptionMaterialsProvider parameter must not be null.");
        assertParameterNotNull(cryptoConfig,
                "CryptoConfiguration parameter must not be null.");
        this.crypto = new CryptoModuleDispatcher(new S3DirectImpl(),
                credentialsProvider, kekMaterialsProvider,
                clientConfig, cryptoConfig);
    }

    private void assertParameterNotNull(Object parameterValue,
            String errorMessage) {
        if (parameterValue == null)
            throw new IllegalArgumentException(errorMessage);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Use {@link EncryptedPutObjectRequest} to specify materialsDescription for the EncryptionMaterials to be used for 
     * this request.AmazonS3EncryptionClient would use {@link EncryptionMaterialsProvider#getEncryptionMaterials(java.util.Map)} to 
     * retrieve encryption materials corresponding to the materialsDescription specified in the current request.
     * </p>
     * 
     */
    @Override
    public PutObjectResult putObject(PutObjectRequest req) {
        return crypto.putObjectSecurely(req);
    }

    @Override
    public S3Object getObject(GetObjectRequest req) {
        return crypto.getObjectSecurely(req);
    }

    @Override
    public ObjectMetadata getObject(GetObjectRequest req, File dest) {
        return crypto.getObjectSecurely(req, dest);
    }

    @Override
    public void deleteObject(DeleteObjectRequest req) {
        req.getRequestClientOptions().appendUserAgent(USER_AGENT);
        // Delete the object
        super.deleteObject(req);
        // If it exists, delete the instruction file.
        DeleteObjectRequest instructionDeleteRequest = EncryptionUtils
                .createInstructionDeleteObjectRequest(req);
        super.deleteObject(instructionDeleteRequest);
    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(
            CompleteMultipartUploadRequest req) {
        return crypto.completeMultipartUploadSecurely(req);
    }

    /** 
     * {@inheritDoc}
     * <p>
     * Use {@link EncryptedInitiateMultipartUploadRequest} to specify materialsDescription for the EncryptionMaterials to be used for this request.
     * AmazonS3EncryptionClient would use {@link EncryptionMaterialsProvider#getEncryptionMaterials(java.util.Map)} to retrieve encryption materials
     * corresponding to the materialsDescription specified in the current request.
     * </p>
     */
    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(
            InitiateMultipartUploadRequest req) {
        return crypto.initiateMultipartUploadSecurely(req);
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
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest)
            throws AmazonClientException, AmazonServiceException {
        return crypto.uploadPartSecurely(uploadPartRequest);
    }

    @Override
    public CopyPartResult copyPart(CopyPartRequest copyPartRequest) {
        return crypto.copyPartSecurely(copyPartRequest);
    }

    @Override
    public void abortMultipartUpload(AbortMultipartUploadRequest req) {
        crypto.abortMultipartUploadSecurely(req);
    }

    // /////////////////// Access to the methods in the super class //////////
    /**
     * An internal implementation used to provide limited but direct access to
     * the underlying methods of AmazonS3Client without any encryption or
     * decryption operations.
     */
    private final class S3DirectImpl extends S3Direct {
        @Override
        public PutObjectResult putObject(PutObjectRequest req) {
            return AmazonS3EncryptionClient.super.putObject(req);
        }

        @Override
        public S3Object getObject(GetObjectRequest req) {
            return AmazonS3EncryptionClient.super.getObject(req);
        }

        @Override
        public ObjectMetadata getObject(GetObjectRequest req, File dest) {
            return AmazonS3EncryptionClient.super.getObject(req, dest);
        }

        @Override
        public CompleteMultipartUploadResult completeMultipartUpload(
                CompleteMultipartUploadRequest req) {
            return AmazonS3EncryptionClient.super.completeMultipartUpload(req);
        }

        @Override
        public InitiateMultipartUploadResult initiateMultipartUpload(
                InitiateMultipartUploadRequest req) {
            return AmazonS3EncryptionClient.super.initiateMultipartUpload(req);
        }

        @Override
        public UploadPartResult uploadPart(UploadPartRequest req)
                throws AmazonClientException, AmazonServiceException {
            return AmazonS3EncryptionClient.super.uploadPart(req);
        }

        @Override
        public CopyPartResult copyPart(CopyPartRequest req) {
            return AmazonS3EncryptionClient.super.copyPart(req);
        }

        @Override
        public void abortMultipartUpload(AbortMultipartUploadRequest req) {
            AmazonS3EncryptionClient.super.abortMultipartUpload(req);
        }
    }
}
