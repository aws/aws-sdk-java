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
package com.amazonaws.services.s3;

import com.amazonaws.SdkClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AnonymousAWSCredentials;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Region;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClient;
import com.amazonaws.services.s3.internal.MultiFileOutputStream;
import com.amazonaws.services.s3.internal.PartCreationEvent;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.internal.crypto.CryptoModuleDispatcher;
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
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectId;
import com.amazonaws.services.s3.model.StaticEncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.UploadObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.util.VersionInfoUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Used to perform client-side encryption for storing data securely in S3. Data
 * encryption is done using a one-time randomly generated content encryption
 * key (CEK) per S3 object. 
 * <p>
 * The encryption materials specified in the constructor will be used to
 * protect the CEK which is then stored along side with the S3 object.
 */
public class AmazonS3EncryptionClient extends AmazonS3Client implements
        AmazonS3Encryption {
    public static final String USER_AGENT = AmazonS3EncryptionClient.class.getName()
            + "/" + VersionInfoUtils.getVersion();
    private final S3CryptoModule<?> crypto;
    private final AWSKMS kms;
    /**
     * True if the a default KMS client is constructed, which will be shut down
     * when this instance of S3 encryption client is shutdown.  False otherwise,
     * which means the users who provided the KMS client would be responsible
     * to shut down the KMS client. 
     */
    private final boolean isKMSClientInternal;

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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(
            EncryptionMaterialsProvider encryptionMaterialsProvider) {

        this(new StaticCredentialsProvider(new AnonymousAWSCredentials()),
                encryptionMaterialsProvider,
                configFactory.getConfig(), new CryptoConfiguration());
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {

        this(new StaticCredentialsProvider(new AnonymousAWSCredentials()),
                encryptionMaterialsProvider,
                configFactory.getConfig(), cryptoConfig);
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this(credentials, encryptionMaterialsProvider,
                configFactory.getConfig(), new CryptoConfiguration());
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this(credentialsProvider, encryptionMaterialsProvider,
                configFactory.getConfig(), new CryptoConfiguration());
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)}
     */
    @Deprecated
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(credentials, encryptionMaterialsProvider,
                configFactory.getConfig(), cryptoConfig);
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(credentialsProvider, encryptionMaterialsProvider,
                configFactory.getConfig(), cryptoConfig);
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
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterials encryptionMaterials,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        this(credentials, new StaticEncryptionMaterialsProvider(
                encryptionMaterials), clientConfig, cryptoConfig);
    }

    /**
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        this(new StaticCredentialsProvider(credentials),
                encryptionMaterialsProvider, clientConfig, cryptoConfig);
    }

    /**
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider kekMaterialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig) {
        this(credentialsProvider, kekMaterialsProvider, clientConfig,
                cryptoConfig,
                null    // request metric collector
        );
    }

    /**
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withMetricsCollector(RequestMetricCollector)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider kekMaterialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig,
            RequestMetricCollector requestMetricCollector) {
        this(null, // KMS client
            credentialsProvider, kekMaterialsProvider, clientConfig,
            cryptoConfig, requestMetricCollector);
    }

    /**
     * @deprecated use {@link AmazonS3EncryptionClientBuilder#withEncryptionMaterials(EncryptionMaterialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withCryptoConfiguration(CryptoConfiguration)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withMetricsCollector(RequestMetricCollector)} and
     *                 {@link AmazonS3EncryptionClientBuilder#withKmsClient(AWSKMS)}
     */
    @Deprecated
    public AmazonS3EncryptionClient(AWSKMSClient kms,
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider kekMaterialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig,
            RequestMetricCollector requestMetricCollector) {
        super(credentialsProvider, clientConfig, requestMetricCollector);
        assertParameterNotNull(kekMaterialsProvider,
                "EncryptionMaterialsProvider parameter must not be null.");
        assertParameterNotNull(cryptoConfig,
                "CryptoConfiguration parameter must not be null.");
        this.isKMSClientInternal = kms == null;
        this.kms = isKMSClientInternal 
            ? newAWSKMSClient(credentialsProvider, clientConfig, cryptoConfig, 
                    requestMetricCollector)
            : kms;
        this.crypto = new CryptoModuleDispatcher(this.kms, new S3DirectImpl(),
                credentialsProvider, kekMaterialsProvider, cryptoConfig);
    }

    @SdkInternalApi
    AmazonS3EncryptionClient(AmazonS3EncryptionClientParams params) {
        super(params);
        assertParameterNotNull(params.getEncryptionMaterials(), "EncryptionMaterialsProvider parameter must not be null.");
        assertParameterNotNull(params.getCryptoConfiguration(), "CryptoConfiguration parameter must not be null.");
        this.isKMSClientInternal = params.getKmsClient() == null;
        this.kms = isKMSClientInternal ?
                newAWSKMSClient(params.getClientParams().getCredentialsProvider(),
                        params.getClientParams().getClientConfiguration(),
                        params.getCryptoConfiguration(),
                        params.getClientParams().getRequestMetricCollector()) : params.getKmsClient();
        this.crypto = new CryptoModuleDispatcher(this.kms, new S3DirectImpl(),
                params.getClientParams().getCredentialsProvider(), params.getEncryptionMaterials(), params.getCryptoConfiguration());
    }

    public static AmazonS3EncryptionClientBuilder encryptionBuilder() {
        return AmazonS3EncryptionClientBuilder.standard();
    }

    /**
     * Creates and returns a new instance of AWS KMS client in the case when
     * an explicit AWS KMS client is not specified.
     */
    private AWSKMSClient newAWSKMSClient(
            AWSCredentialsProvider credentialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig,
            RequestMetricCollector requestMetricCollector
    ) {
        final AWSKMSClient kmsClient = new AWSKMSClient(
            credentialsProvider, clientConfig, requestMetricCollector);
        final Region kmsRegion = cryptoConfig.getAwsKmsRegion();
        if (kmsRegion != null)
            kmsClient.setRegion(kmsRegion);
        return kmsClient;
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
        return crypto.putObjectSecurely(req.clone());
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
        InstructionFileId ifid = new S3ObjectId(req.getBucketName(), req.getKey()).instructionFileId();

        DeleteObjectRequest instructionDeleteRequest = (DeleteObjectRequest) req.clone();
        instructionDeleteRequest.withBucketName(ifid.getBucket()).withKey(ifid.getKey());
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
        boolean isCreateEncryptionMaterial = true;
        if (req instanceof EncryptedInitiateMultipartUploadRequest) {
            EncryptedInitiateMultipartUploadRequest cryptoReq = 
                    (EncryptedInitiateMultipartUploadRequest) req;
            isCreateEncryptionMaterial = cryptoReq.isCreateEncryptionMaterial();
        }
        return isCreateEncryptionMaterial
             ? crypto.initiateMultipartUploadSecurely(req)
             : super.initiateMultipartUpload(req)
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
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest)
            throws SdkClientException, AmazonServiceException {
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

    /**
     * Creates a new crypto instruction file by re-encrypting the CEK of an
     * existing encrypted S3 object with a new encryption material identifiable
     * via a new set of material description.
     *<p> 
     * User of this method is responsible for explicitly deleting/updating the
     * instruction file so created should the corresponding S3 object is
     * deleted/created.
     * 
     * @return the result of the put (instruction file) operation.
     */
    public PutObjectResult putInstructionFile(PutInstructionFileRequest req) {
        return crypto.putInstructionFileSecurely(req);
    }

    /**
     * {@inheritDoc}
     * <p>
     * If the a default internal KMS client has been constructed, it will also be
     * shut down by calling this method.
     * Otherwise, users who provided the KMS client would be responsible to
     * shut down the KMS client extrinsic to this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        if (isKMSClientInternal)
            kms.shutdown();
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
                throws SdkClientException, AmazonServiceException {
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

    /**
     * Used to encrypt data first to disk with pipelined concurrent multi-part
     * uploads to S3. This method enables significant speed-up of encrypting and
     * uploading large payloads to Amazon S3 via pipelining and parallel uploads
     * by consuming temporary disk space.
     * <p>
     * There are many ways you can customize the behavior of this method,
     * including
     * <ul>
     * <li>the configuration of your own custom thread pool</li>
     * <li>the part size of each multi-part upload request; By default, a
     * temporary ciphertext file is generated per part and gets uploaded
     * immediately to S3</li>
     * <li>the maximum temporary disk space that must not be exceeded by
     * execution of this request; By default, the encryption will block upon
     * hitting the limit and will only resume when the in-flight uploads catch
     * up by releasing the temporary disk space upon successful uploads of the
     * completed parts</li>
     * <li>the configuration of your own {@link MultiFileOutputStream} for
     * custom pipeline behavior</li>
     * <li>the configuration of your own {@link UploadObjectObserver} for custom
     * multi-part upload behavior</li>
     * </ul>
     * <p>
     * A request is handled with the following life cycle, calling the necessary
     * Service Provider Interface:
     * <ol>
     * <li>A thread pool is constructed (or retrieved from the request) for the
     * execution of concurrent upload tasks to be submitted by the
     * <code>UploadObjectObserver</code></li>
     * <li>An {@link UploadObjectObserver} is constructed (or retrieved from the
     * request) for execution of concurrent uploads to S3</li>
     * <li>Initialize the <code>UploadObjectObserver</code></li>
     * <li>Initialize a multi-part upload request to S3 by calling
     * {@link UploadObjectObserver#onUploadInitiation(UploadObjectRequest)}</li>
     * <li>A {@link MultiFileOutputStream} is constructed (or retrieved from the
     * request) which serves as the pipeline for incremental (but serial)
     * encryption to disk with concurrent multipart uploads to S3 whenever the
     * parts on the disk are ready</li>
     * <li>Initialize the <code>MultiFileOutputStream</code></li>
     * <li>Kicks off the pipeline for incremental encryption to disk with
     * pipelined concurrent multi-part uploads to S3</li>
     * <li>For every part encrypted into a temporary file on disk, it is
     * uploaded by calling
     * {@link UploadObjectObserver#onPartCreate(PartCreationEvent)}</li>
     * <li>Finally, clean up and complete the multi-part upload by calling
     * {@link UploadObjectObserver#onCompletion(List)}.</li>
     * </ol>
     * 
     * @return the result of the completed muti-part uploads
     * 
     * @throws IOException
     *             if the encryption to disk failed
     * @throws InterruptedException
     *             if the current thread was interrupted while waiting
     * @throws ExecutionException
     *             if the concurrent uploads threw an exception
     */
    public CompleteMultipartUploadResult uploadObject(final UploadObjectRequest req)
            throws IOException, InterruptedException, ExecutionException {
        // Set up the pipeline for concurrent encrypt and upload
        // Set up a thread pool for this pipeline
        ExecutorService es = req.getExecutorService();
        final boolean defaultExecutorService = es == null;
        if (es == null)
            es = Executors.newFixedThreadPool(clientConfiguration.getMaxConnections());
        UploadObjectObserver observer = req.getUploadObjectObserver();
        if (observer == null)
            observer = new UploadObjectObserver();
        // initialize the observer
        observer.init(req, new S3DirectImpl(), this, es);
        // Initiate upload
        final String uploadId = observer.onUploadInitiation(req);
        final List<PartETag> partETags = new ArrayList<PartETag>();
        MultiFileOutputStream mfos = req.getMultiFileOutputStream();
        if (mfos == null)
            mfos = new MultiFileOutputStream();
        try {
            // initialize the multi-file output stream
            mfos.init(observer, req.getPartSize(), req.getDiskLimit());
            // Kicks off the encryption-upload pipeline;
            // Note mfos is automatically closed upon method completion.
            crypto.putLocalObjectSecurely(req, uploadId, mfos);
            // block till all part have been uploaded
            for (Future<UploadPartResult> future: observer.getFutures()) {
                UploadPartResult partResult = future.get();
                partETags.add(new PartETag(partResult.getPartNumber(), partResult.getETag()));
            }
        } catch(IOException ex) {
            throw onAbort(observer, ex);
        } catch(InterruptedException ex) {
            throw onAbort(observer, ex);
        } catch(ExecutionException ex) {
            throw onAbort(observer, ex);
        } catch(RuntimeException ex) {
            throw onAbort(observer, ex);
        } catch(Error ex) {
            throw onAbort(observer, ex);
        } finally {
            if (defaultExecutorService)
                es.shutdownNow();   // shut down the locally created thread pool
            mfos.cleanup();       // delete left-over temp files
        }
        // Complete upload
        return observer.onCompletion(partETags);
    }

    /**
     * Convenient method to notifies the observer to abort the multi-part
     * upload, and returns the original exception.
     */
    private <T extends Throwable> T onAbort(UploadObjectObserver observer, T t) {
        observer.onAbort();
        return t;
    }
}
