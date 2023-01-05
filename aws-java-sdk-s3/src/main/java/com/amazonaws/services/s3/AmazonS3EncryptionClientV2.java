/*
 * Copyright 2013-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.services.s3.model.CryptoRangeGetMode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.SdkClientException;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Region;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClientBuilder;
import com.amazonaws.services.s3.internal.MultiFileOutputStream;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.internal.crypto.v2.S3CryptoModule;
import com.amazonaws.services.s3.internal.crypto.v2.S3CryptoModuleAE;
import com.amazonaws.services.s3.internal.crypto.v2.S3CryptoModuleAEStrict;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfigurationV2;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.EncryptedInitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.EncryptedPutObjectRequest;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectMetadataRequest;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectId;
import com.amazonaws.services.s3.model.UploadObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.util.VersionInfoUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Used to perform client-side encryption for storing data securely in S3. Data
 * encryption is done using a one-time randomly generated content encryption
 * key (CEK) per S3 object.
 * <p>
 * The encryption materials specified in the constructor will be used to
 * protect the CEK which is then stored along side with the S3 object.
 * <p>
 * For some code examples, see:
 * <p>
 * https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-crypto.html
 * <br>
 * https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-crypto-kms.html
 * <br>
 * https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/examples-crypto-masterkey.html
 */
public class AmazonS3EncryptionClientV2 extends AmazonS3Client implements AmazonS3EncryptionV2 {
    private static final String USER_AGENT_V2 = "S3CryptoV2/" + VersionInfoUtils.getVersion();
    private static final Log log = LogFactory.getLog(AmazonS3EncryptionClientV2.class);
    private final S3CryptoModule<?> crypto;
    private final AWSKMS kmsClient;
    /**
     * True if the a default KMS client is constructed, which will be shut down
     * when this instance of S3 encryption client is shutdown.  False otherwise,
     * which means the users who provided the KMS client would be responsible
     * to shut down the KMS client.
     */
    private final boolean isKMSClientInternal;

    public static AmazonS3EncryptionClientV2Builder encryptionBuilder() {
        return AmazonS3EncryptionClientV2Builder.standard();
    }

    @SdkInternalApi
    AmazonS3EncryptionClientV2(AmazonS3EncryptionClientV2Params params) {
        super(params);
        validateParameters(params);

        CryptoConfigurationV2 readOnlyCryptoConfig = validateConfigAndCreateReadOnlyCopy(
                params.getCryptoConfiguration());

        this.isKMSClientInternal = params.getKmsClient() == null;
        this.kmsClient = isKMSClientInternal ?
                newAWSKMSClient(params.getClientParams().getCredentialsProvider(),
                        params.getClientParams().getClientConfiguration(),
                        readOnlyCryptoConfig,
                        params.getClientParams().getRequestMetricCollector()) :
                params.getKmsClient();

        this.crypto = createCryptoModule(readOnlyCryptoConfig, this.kmsClient,
                params.getEncryptionMaterialsProvider(), params.getClientParams().getCredentialsProvider());

        warnOnLegacyCryptoMode(params.getCryptoConfiguration().getCryptoMode());
        warnOnRangeGetsEnabled(params);
    }

    private void validateParameters(AmazonS3EncryptionClientV2Params params) {
        assertParameterNotNull(params.getEncryptionMaterialsProvider(),
                "EncryptionMaterialsProvider parameter must not be null.");
        assertParameterNotNull(params.getCryptoConfiguration(),
                "CryptoConfiguration parameter must not be null.");
    }

    private S3CryptoModule<?> createCryptoModule(CryptoConfigurationV2 cryptoConfig,
                                                 AWSKMS kmsClient,
                                                 EncryptionMaterialsProvider encryptionMaterialsProvider,
                                                 AWSCredentialsProvider credentialsProvider) {

        if (cryptoConfig.getCryptoMode() == CryptoMode.AuthenticatedEncryption) {
            return new S3CryptoModuleAE(
                    kmsClient,
                    new S3DirectImpl(),
                    credentialsProvider,
                    encryptionMaterialsProvider,
                    cryptoConfig);
        } else if (cryptoConfig.getCryptoMode() == CryptoMode.StrictAuthenticatedEncryption) {
            return new S3CryptoModuleAEStrict(
                    kmsClient,
                    new S3DirectImpl(),
                    credentialsProvider,
                    encryptionMaterialsProvider,
                    cryptoConfig);
        } else {
            throw new UnsupportedOperationException("Cannot encrypt using mode " + cryptoConfig.getCryptoMode());
        }
    }

    private CryptoConfigurationV2 validateConfigAndCreateReadOnlyCopy(CryptoConfigurationV2 cryptoConfig) {
        CryptoConfigurationV2 clonedCryptoConfig = cryptoConfig.clone();
        if (clonedCryptoConfig.getCryptoMode() == null) {
            clonedCryptoConfig.setCryptoMode(CryptoMode.StrictAuthenticatedEncryption);
        }
        if (CryptoMode.AuthenticatedEncryption != clonedCryptoConfig.getCryptoMode() &&
                CryptoMode.StrictAuthenticatedEncryption != clonedCryptoConfig.getCryptoMode()) {
            throw new IllegalArgumentException("Invalid value for CryptoMode : " + clonedCryptoConfig.getCryptoMode());
        }

        if (cryptoConfig.isUnsafeUndecryptableObjectPassthrough() && CryptoMode.StrictAuthenticatedEncryption == cryptoConfig.getCryptoMode()) {
            throw new IllegalArgumentException(String.format("unsafeUndecryptableObjectPassthrough must not be enabled in %s "
                                                             + "mode", CryptoMode.StrictAuthenticatedEncryption));
        }

        return clonedCryptoConfig.readOnly();
    }

    /**
     * Creates and returns a new instance of Amazon Web Services KMS client in the case when
     * an explicit Amazon Web Services KMS client is not specified.
     */
    private AWSKMS newAWSKMSClient(
            AWSCredentialsProvider credentialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfigurationV2 cryptoConfig,
            RequestMetricCollector requestMetricCollector) {

        AWSKMSClientBuilder kmsClientBuilder = AWSKMSClientBuilder.standard()
                .withCredentials(credentialsProvider)
                .withClientConfiguration(clientConfig)
                .withMetricsCollector(requestMetricCollector);

        final Region kmsRegion = cryptoConfig.getAwsKmsRegion();
        if (kmsRegion != null) {
            kmsClientBuilder.withRegion(kmsRegion.getName());
        }

        return kmsClientBuilder.build();
    }

    private void assertParameterNotNull(Object parameterValue, String errorMessage) {
        if (parameterValue == null) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    /**
     * Returns the kmsClient that was supplied to this encryption client, or
     * null if it wasn't set.
     *
     * @return an Amazon Web Services KMS client
     */
    public AWSKMS getKmsClient() {
        return isKMSClientInternal? null : kmsClient;
    }

    public EncryptionMaterialsProvider getEncryptionMaterialsProvider() {
        return crypto.getEncryptionMaterialsProvider();
    }

    public CryptoConfigurationV2 getCryptoConfiguration() {
        return crypto.getCryptoConfiguration();
    }

    /**
     * {@inheritDoc}
     * <p>
     * Use {@link EncryptedPutObjectRequest} to specify materialsDescription for the EncryptionMaterials to be used for
     * this request.AmazonS3EncryptionClient would use
     * {@link EncryptionMaterialsProvider#getEncryptionMaterials(java.util.Map)} to
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
        req.getRequestClientOptions().appendUserAgent(USER_AGENT_V2);
        super.deleteObject(req);

        // If it exists, delete the instruction file.
        InstructionFileId ifid = new S3ObjectId(req.getBucketName(), req.getKey()).instructionFileId();
        DeleteObjectRequest instructionDeleteRequest = (DeleteObjectRequest) req.clone();
        instructionDeleteRequest.withBucketName(ifid.getBucket()).withKey(ifid.getKey());
        super.deleteObject(instructionDeleteRequest);
    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(CompleteMultipartUploadRequest req) {
        return crypto.completeMultipartUploadSecurely(req);
    }

    /**
     * {@inheritDoc}
     * <p>
     * Use {@link EncryptedInitiateMultipartUploadRequest} to specify materialsDescription for the
     * EncryptionMaterials to be used for this request. AmazonS3EncryptionClient would use
     * {@link EncryptionMaterialsProvider#getEncryptionMaterials(java.util.Map)} to retrieve encryption materials
     * corresponding to the materialsDescription specified in the current request.
     * </p>
     */
    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(InitiateMultipartUploadRequest req) {
        boolean isCreateEncryptionMaterial = true;
        if (req instanceof EncryptedInitiateMultipartUploadRequest) {
            EncryptedInitiateMultipartUploadRequest cryptoReq = (EncryptedInitiateMultipartUploadRequest) req;
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

    @Override
    public PutObjectResult putInstructionFile(PutInstructionFileRequest req) {
        return crypto.putInstructionFileSecurely(req);
    }

    @Override
    public CompleteMultipartUploadResult uploadObject(final UploadObjectRequest req)
            throws IOException, InterruptedException, ExecutionException {
        // Set up the pipeline for concurrent encrypt and upload
        // Set up a thread pool for this pipeline
        ExecutorService es = req.getExecutorService();
        final boolean defaultExecutorService = es == null;
        if (es == null) {
            es = Executors.newFixedThreadPool(clientConfiguration.getMaxConnections());
        }
        UploadObjectObserver observer = req.getUploadObjectObserver();
        if (observer == null) {
            observer = new UploadObjectObserver();
        }
        observer.init(req, new S3DirectImpl(), this, es);
        final String uploadId = observer.onUploadInitiation(req);
        final List<PartETag> partETags = new ArrayList<PartETag>();
        MultiFileOutputStream mfos = req.getMultiFileOutputStream();
        if (mfos == null) {
            mfos = new MultiFileOutputStream();
        }
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
        if (isKMSClientInternal) {
            kmsClient.shutdown();
        }
    }

    /**
     * Convenient method to notifies the observer to abort the multi-part
     * upload, and returns the original exception.
     */
    private <T extends Throwable> T onAbort(UploadObjectObserver observer, T t) {
        observer.onAbort();
        return t;
    }

    private static void warnOnRangeGetsEnabled(AmazonS3EncryptionClientV2Params params) {
        CryptoConfigurationV2 cryptoConfig = params.getCryptoConfiguration();

        CryptoRangeGetMode rangeGetMode = cryptoConfig.getRangeGetMode();

        if (rangeGetMode != CryptoRangeGetMode.DISABLED) {
            log.warn("The S3 Encryption Client is configured to support range get requests. Range gets do not " +
                    "provide authenticated encryption properties even when used with an authenticated mode " +
                         "(AES-GCM). See https://docs.aws.amazon.com/general/latest/gr/aws_sdk_cryptography.html");
        }
    }

    private static void warnOnLegacyCryptoMode(CryptoMode cryptoMode) {
        if (cryptoMode == CryptoMode.AuthenticatedEncryption) {
            log.warn("The S3 Encryption Client is configured to read encrypted data with legacy encryption modes " +
                         "through the CryptoMode setting. If you don't have objects encrypted with these legacy " +
                         "modes, you should disable support for them to enhance security. See " +
                         "https://docs.aws.amazon.com/general/latest/gr/aws_sdk_cryptography.html");
        }
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
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.putObject(req);
        }

        @Override
        public S3Object getObject(GetObjectRequest req) {
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.getObject(req);
        }

        @Override
        public ObjectMetadata getObject(GetObjectRequest req, File dest) {
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.getObject(req, dest);
        }

        @Override
        public ObjectMetadata getObjectMetadata(GetObjectMetadataRequest req) {
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.getObjectMetadata(req);
        }

        @Override
        public CompleteMultipartUploadResult completeMultipartUpload(
                CompleteMultipartUploadRequest req) {
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.completeMultipartUpload(req);
        }

        @Override
        public InitiateMultipartUploadResult initiateMultipartUpload(
                InitiateMultipartUploadRequest req) {
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.initiateMultipartUpload(req);
        }

        @Override
        public UploadPartResult uploadPart(UploadPartRequest req)
                throws SdkClientException, AmazonServiceException {
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.uploadPart(req);
        }

        @Override
        public CopyPartResult copyPart(CopyPartRequest req) {
            appendUserAgent(req, USER_AGENT_V2);
            return AmazonS3EncryptionClientV2.super.copyPart(req);
        }

        @Override
        public void abortMultipartUpload(AbortMultipartUploadRequest req) {
            appendUserAgent(req, USER_AGENT_V2);
            AmazonS3EncryptionClientV2.super.abortMultipartUpload(req);
        }

        /**
         * Appends a user agent to the request's USER_AGENT_V1 client marker.
         * This method is intended only for internal use by the Amazon Web Services SDK.
         */
        final <X extends AmazonWebServiceRequest> X appendUserAgent(
            X request, String userAgent) {
            request.getRequestClientOptions().appendUserAgent(userAgent);
            return request;
        }
    }
}
