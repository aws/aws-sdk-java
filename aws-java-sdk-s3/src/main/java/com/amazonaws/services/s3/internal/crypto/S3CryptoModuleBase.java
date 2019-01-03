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

import static com.amazonaws.services.s3.AmazonS3EncryptionClient.USER_AGENT;
import static com.amazonaws.services.s3.model.CryptoStorageMode.InstructionFile;
import static com.amazonaws.services.s3.model.CryptoStorageMode.ObjectMetadata;
import static com.amazonaws.services.s3.model.InstructionFileId.DEFAULT_INSTRUCTION_FILE_SUFFIX;
import static com.amazonaws.services.s3.model.InstructionFileId.DOT;
import static com.amazonaws.services.s3.model.S3DataSource.Utils.cleanupDataSource;
import static com.amazonaws.util.BinaryUtils.copyAllBytesFrom;
import static com.amazonaws.util.IOUtils.closeQuietly;
import static com.amazonaws.util.LengthCheckInputStream.EXCLUDE_SKIPPED_BYTES;
import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.Throwables.failure;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import com.amazonaws.services.kms.AWSKMS;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.SdkClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.internal.ReleasableInputStream;
import com.amazonaws.internal.ResettableInputStream;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.kms.model.GenerateDataKeyRequest;
import com.amazonaws.services.kms.model.GenerateDataKeyResult;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.Mimetypes;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.AbstractPutObjectRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsFactory;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.amazonaws.services.s3.model.MaterialsDescriptionProvider;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectId;
import com.amazonaws.services.s3.model.UploadObjectRequest;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.util.IOUtils;
import com.amazonaws.util.LengthCheckInputStream;
import com.amazonaws.util.json.Jackson;

/**
 * Common implementation for different S3 cryptographic modules.
 */
public abstract class S3CryptoModuleBase<T extends MultipartUploadCryptoContext>
    extends S3CryptoModule<T> {
    private static final boolean IS_MULTI_PART = true;
    protected static final int DEFAULT_BUFFER_SIZE = 1024*2;    // 2K
    protected final EncryptionMaterialsProvider kekMaterialsProvider;
    protected final Log log = LogFactory.getLog(getClass());
    protected final S3CryptoScheme cryptoScheme;
    protected final ContentCryptoScheme contentCryptoScheme;
    /** A read-only copy of the crypto configuration. */
    protected final CryptoConfiguration cryptoConfig;

    /** Map of data about in progress encrypted multipart uploads. */
    protected final  Map<String, T> multipartUploadContexts =
        Collections.synchronizedMap(new HashMap<String,T>());
    protected final S3Direct s3;
    protected final AWSKMS kms;

    /**
     * @param cryptoConfig a read-only copy of the crypto configuration.
     */
    protected S3CryptoModuleBase(AWSKMS kms, S3Direct s3,
                                 AWSCredentialsProvider credentialsProvider,
                                 EncryptionMaterialsProvider kekMaterialsProvider,
                                 CryptoConfiguration cryptoConfig) {
        if (!cryptoConfig.isReadOnly())
            throw new IllegalArgumentException("The cryto configuration parameter is required to be read-only");
        this.kekMaterialsProvider = kekMaterialsProvider;
        this.s3 = s3;
        this.cryptoConfig = cryptoConfig;
        this.cryptoScheme = S3CryptoScheme.from(cryptoConfig.getCryptoMode());
        this.contentCryptoScheme = cryptoScheme.getContentCryptoScheme();
        this.kms = kms;
    }

    /**
     * For testing purposes only.
     */
    protected S3CryptoModuleBase(S3Direct s3,
                                 AWSCredentialsProvider credentialsProvider,
                                 EncryptionMaterialsProvider kekMaterialsProvider,
                                 CryptoConfiguration cryptoConfig) {
        this.kekMaterialsProvider = kekMaterialsProvider;
        this.s3 = s3;
        this.cryptoConfig = cryptoConfig;
        this.cryptoScheme = S3CryptoScheme.from(cryptoConfig.getCryptoMode());
        this.contentCryptoScheme = cryptoScheme.getContentCryptoScheme();
        this.kms = null;
    }

    /**
     * Returns the length of the ciphertext computed from the length of the
     * plaintext.
     *
     * @param plaintextLength
     *            a non-negative number
     * @return a non-negative number
     */
    protected abstract long ciphertextLength(long plaintextLength);

    //////////////////////// Common Implementation ////////////////////////
    @Override
    public PutObjectResult putObjectSecurely(PutObjectRequest req) {
        // TODO: consider cloning req before proceeding further to reduce side
        // effects
        appendUserAgent(req, USER_AGENT);
        return cryptoConfig.getStorageMode() == InstructionFile
               ? putObjectUsingInstructionFile(req)
               : putObjectUsingMetadata(req);
    }

    private PutObjectResult putObjectUsingMetadata(PutObjectRequest req) {
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterial(req);
        // Wraps the object data with a cipher input stream
        final File fileOrig = req.getFile();
        final InputStream isOrig = req.getInputStream();
        PutObjectRequest wrappedReq = wrapWithCipher(req, cekMaterial);
        // Update the metadata
        req.setMetadata(updateMetadataWithContentCryptoMaterial(
            req.getMetadata(), req.getFile(), cekMaterial));
        // Put the encrypted object into S3
        try {
            return s3.putObject(wrappedReq);
        } finally {
            cleanupDataSource(req, fileOrig, isOrig, wrappedReq.getInputStream(), log);
        }
    }

    /**
     * Puts an encrypted object into S3, and puts an instruction file into S3.
     * Encryption info is stored in the instruction file.
     *
     * @param putObjectRequest
     *            The request object containing all the parameters to upload a
     *            new object to Amazon S3.
     * @return A {@link PutObjectResult} object containing the information
     *         returned by Amazon S3 for the new, created object.
     */
    private PutObjectResult putObjectUsingInstructionFile(
        PutObjectRequest putObjectRequest) {
        final File fileOrig = putObjectRequest.getFile();
        final InputStream isOrig = putObjectRequest.getInputStream();
        final PutObjectRequest putInstFileRequest = putObjectRequest.clone()
                                                                    .withFile(null)
                                                                    .withInputStream(null)
            ;
        putInstFileRequest.setKey(putInstFileRequest.getKey() + DOT
                                  + DEFAULT_INSTRUCTION_FILE_SUFFIX);
        // Create instruction
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterial(putObjectRequest);
        // Wraps the object data with a cipher input stream; note the metadata
        // is mutated as a side effect.
        PutObjectRequest req = wrapWithCipher(putObjectRequest, cekMaterial);
        // Put the encrypted object into S3
        final PutObjectResult result;
        try {
            result = s3.putObject(req);
        } finally {
            cleanupDataSource(putObjectRequest, fileOrig, isOrig,
                              req.getInputStream(), log);
        }
        // Put the instruction file into S3
        s3.putObject(updateInstructionPutRequest(putInstFileRequest,
                                                 cekMaterial));
        // Return the result of the encrypted object PUT.
        return result;
    }

    @Override
    public final void abortMultipartUploadSecurely(AbortMultipartUploadRequest req) {
        s3.abortMultipartUpload(req);
        multipartUploadContexts.remove(req.getUploadId());
    }

    @Override
    public final CopyPartResult copyPartSecurely(CopyPartRequest copyPartRequest) {
        String uploadId = copyPartRequest.getUploadId();
        T uploadContext = multipartUploadContexts.get(uploadId);
        CopyPartResult result = s3.copyPart(copyPartRequest);

        if (uploadContext != null && !uploadContext.hasFinalPartBeenSeen())
            uploadContext.setHasFinalPartBeenSeen(true);
        return result;
    }

    abstract T newUploadContext(InitiateMultipartUploadRequest req,
                                ContentCryptoMaterial cekMaterial);

    @Override
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(
        InitiateMultipartUploadRequest req) {
        appendUserAgent(req, USER_AGENT);
        // Generate a one-time use symmetric key and initialize a cipher to
        // encrypt object data
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterial(req);
        if (cryptoConfig.getStorageMode() == ObjectMetadata) {
            ObjectMetadata metadata = req.getObjectMetadata();
            if (metadata == null)
                metadata = new ObjectMetadata();
            // Store encryption info in metadata
            req.setObjectMetadata(updateMetadataWithContentCryptoMaterial(
                metadata, null, cekMaterial));
        }
        InitiateMultipartUploadResult result = s3.initiateMultipartUpload(req);
        T uploadContext = newUploadContext(req, cekMaterial);
        if (req instanceof MaterialsDescriptionProvider) {
            MaterialsDescriptionProvider p = (MaterialsDescriptionProvider) req;
            uploadContext.setMaterialsDescription(p.getMaterialsDescription());
        }
        multipartUploadContexts.put(result.getUploadId(), uploadContext);
        return result;
    }

    //// specific crypto module behavior for uploading parts.
    abstract CipherLite cipherLiteForNextPart(T uploadContext);
    abstract long computeLastPartSize(UploadPartRequest req);
    abstract <I extends CipherLiteInputStream> SdkFilterInputStream wrapForMultipart(
        I is, long partSize);
    abstract void updateUploadContext(T uploadContext, SdkFilterInputStream is);
    /**
     * {@inheritDoc}
     *
     * <p>
     * <b>NOTE:</b> Because the encryption process requires context from
     * previous blocks, parts uploaded with the AmazonS3EncryptionClient (as
     * opposed to the normal AmazonS3Client) must be uploaded serially, and in
     * order. Otherwise, the previous encryption context isn't available to use
     * when encrypting the current part.
     */
    @Override
    public UploadPartResult uploadPartSecurely(UploadPartRequest req) {
        appendUserAgent(req, USER_AGENT);
        final int blockSize = contentCryptoScheme.getBlockSizeInBytes();
        final boolean isLastPart = req.isLastPart();
        final String uploadId = req.getUploadId();
        final long partSize = req.getPartSize();
        final boolean partSizeMultipleOfCipherBlockSize = 0 == (partSize % blockSize);
        if (!isLastPart && !partSizeMultipleOfCipherBlockSize) {
            throw new SdkClientException(
                "Invalid part size: part sizes for encrypted multipart uploads must be multiples "
                + "of the cipher block size ("
                + blockSize
                + ") with the exception of the last part.");
        }
        final T uploadContext = multipartUploadContexts.get(uploadId);
        if (uploadContext == null) {
            throw new SdkClientException(
                "No client-side information available on upload ID " + uploadId);
        }
        final UploadPartResult result;
        // Checks the parts are uploaded in series
        uploadContext.beginPartUpload(req.getPartNumber());
        CipherLite cipherLite = cipherLiteForNextPart(uploadContext);
        final File fileOrig = req.getFile();
        final InputStream isOrig = req.getInputStream();
        SdkFilterInputStream isCurr = null;
        try {
            CipherLiteInputStream clis = newMultipartS3CipherInputStream(req, cipherLite);
            isCurr = clis; // so the clis will be closed (in the finally block below) upon
            // unexpected failure should we opened a file undereath
            isCurr = wrapForMultipart(clis, partSize);
            req.setInputStream(isCurr);
            // Treat all encryption requests as input stream upload requests,
            // not as file upload requests.
            req.setFile(null);
            req.setFileOffset(0);
            // The last part of the multipart upload will contain an extra
            // 16-byte mac
            if (isLastPart) {
                // We only change the size of the last part
                long lastPartSize = computeLastPartSize(req);
                if (lastPartSize > -1)
                    req.setPartSize(lastPartSize);
                if (uploadContext.hasFinalPartBeenSeen()) {
                    throw new SdkClientException(
                        "This part was specified as the last part in a multipart upload, but a previous part was already marked as the last part.  "
                        + "Only the last part of the upload should be marked as the last part.");
                }
            }

            result = s3.uploadPart(req);
        } finally {
            cleanupDataSource(req, fileOrig, isOrig, isCurr, log);
            uploadContext.endPartUpload();
        }
        if (isLastPart)
            uploadContext.setHasFinalPartBeenSeen(true);
        updateUploadContext(uploadContext, isCurr);
        return result;
    }

    protected final CipherLiteInputStream newMultipartS3CipherInputStream(
        UploadPartRequest req, CipherLite cipherLite) {
        final File fileOrig = req.getFile();
        final InputStream isOrig = req.getInputStream();
        InputStream isCurr = null;
        try {
            if (fileOrig == null) {
                if (isOrig == null) {
                    throw new IllegalArgumentException(
                        "A File or InputStream must be specified when uploading part");
                }
                isCurr = isOrig;
            } else {
                isCurr = new ResettableInputStream(fileOrig);
            }
            isCurr = new InputSubstream(isCurr,
                                        req.getFileOffset(),
                                        req.getPartSize(),
                                        req.isLastPart());
            return cipherLite.markSupported()
                   ? new CipherLiteInputStream(isCurr, cipherLite,
                                               DEFAULT_BUFFER_SIZE,
                                               IS_MULTI_PART, req.isLastPart())
                   : new RenewableCipherLiteInputStream(isCurr, cipherLite,
                                                        DEFAULT_BUFFER_SIZE,
                                                        IS_MULTI_PART, req.isLastPart());
        } catch (Exception e) {
            cleanupDataSource(req, fileOrig, isOrig, isCurr, log);
            throw failure(e,"Unable to create cipher input stream");
        }
    }

    @Override
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(
        CompleteMultipartUploadRequest req) {
        appendUserAgent(req, USER_AGENT);
        String uploadId = req.getUploadId();
        final T uploadContext = multipartUploadContexts.get(uploadId);

        if (uploadContext != null && !uploadContext.hasFinalPartBeenSeen()) {
            throw new SdkClientException(
                "Unable to complete an encrypted multipart upload without being told which part was the last.  "
                + "Without knowing which part was the last, the encrypted data in Amazon S3 is incomplete and corrupt.");
        }
        CompleteMultipartUploadResult result = s3.completeMultipartUpload(req);

        // In InstructionFile mode, we want to write the instruction file only
        // after the whole upload has completed correctly.
        if (uploadContext != null
            &&  cryptoConfig.getStorageMode() == InstructionFile) {
            // Put the instruction file into S3
            s3.putObject(createInstructionPutRequest(
                uploadContext.getBucketName(), uploadContext.getKey(),
                uploadContext.getContentCryptoMaterial()));
        }
        multipartUploadContexts.remove(uploadId);
        return result;
    }

    protected final ObjectMetadata updateMetadataWithContentCryptoMaterial(
        ObjectMetadata metadata, File file, ContentCryptoMaterial instruction) {
        if (metadata == null)
            metadata = new ObjectMetadata();
        if (file != null) {
            Mimetypes mimetypes = Mimetypes.getInstance();
            metadata.setContentType(mimetypes.getMimetype(file));
        }
        return instruction.toObjectMetadata(metadata, cryptoConfig.getCryptoMode());
    }

    /**
     * Creates and returns a non-null content crypto material for the given
     * request.
     *
     * @throws SdkClientException if no encryption material can be found.
     */
    protected final ContentCryptoMaterial createContentCryptoMaterial(
        AmazonWebServiceRequest req) {
        if (req instanceof EncryptionMaterialsFactory) {
            // per request level encryption materials
            EncryptionMaterialsFactory f = (EncryptionMaterialsFactory)req;
            final EncryptionMaterials materials = f.getEncryptionMaterials();
            if (materials != null) {
                return buildContentCryptoMaterial(materials, req);
            }
        }
        if (req instanceof MaterialsDescriptionProvider) {
            // per request level material description
            MaterialsDescriptionProvider mdp = (MaterialsDescriptionProvider) req;
            Map<String,String> matdesc_req = mdp.getMaterialsDescription();
            ContentCryptoMaterial ccm = newContentCryptoMaterial(
                kekMaterialsProvider,
                matdesc_req,
                cryptoConfig.getCryptoProvider(), req);
            if (ccm != null)
                return ccm;
            if (matdesc_req != null) {
                // check to see if KMS is in use and if so we should fall thru
                // to the s3 client level encryption material
                EncryptionMaterials material =
                    kekMaterialsProvider.getEncryptionMaterials();
                if (!material.isKMSEnabled()) {
                    throw new SdkClientException(
                        "No material available from the encryption material provider for description "
                        + matdesc_req);
                }
            }
            // if there is no material description, fall thru to use
            // the per s3 client level encryption  materials
        }
        // per s3 client level encryption materials
        return newContentCryptoMaterial(this.kekMaterialsProvider,
                                        cryptoConfig.getCryptoProvider(), req);
    }

    /**
     * Returns the content encryption material generated with the given kek
     * material, material description and security providers; or null if
     * the encryption material cannot be found for the specified description.
     */
    private ContentCryptoMaterial newContentCryptoMaterial(
        EncryptionMaterialsProvider kekMaterialProvider,
        Map<String, String> materialsDescription, Provider provider,
        AmazonWebServiceRequest req) {
        EncryptionMaterials kekMaterials =
            kekMaterialProvider.getEncryptionMaterials(materialsDescription);
        if (kekMaterials == null) {
            return null;
        }
        return buildContentCryptoMaterial(kekMaterials, req);
    }

    /**
     * Returns a non-null content encryption material generated with the given kek
     * material and security providers.
     *
     * @throws SdkClientException if no encryption material can be found from
     * the given encryption material provider.
     */
    private ContentCryptoMaterial newContentCryptoMaterial(
        EncryptionMaterialsProvider kekMaterialProvider,
        Provider provider, AmazonWebServiceRequest req) {
        EncryptionMaterials kekMaterials = kekMaterialProvider.getEncryptionMaterials();
        if (kekMaterials == null)
            throw new SdkClientException("No material available from the encryption material provider");
        return buildContentCryptoMaterial(kekMaterials, req);
    }

    @Override
    public final void putLocalObjectSecurely(final UploadObjectRequest reqIn,
                                             String uploadId, OutputStream os) throws IOException {
        UploadObjectRequest req = reqIn.clone();

        final File fileOrig = req.getFile();
        final InputStream isOrig = req.getInputStream();

        final T uploadContext = multipartUploadContexts.get(uploadId);
        ContentCryptoMaterial cekMaterial = uploadContext.getContentCryptoMaterial();
        req = wrapWithCipher(req, cekMaterial);

        try {
            IOUtils.copy(req.getInputStream(), os);
            // so it won't crap out with a false negative at the end; (Not
            // really relevant here)
            uploadContext.setHasFinalPartBeenSeen(true);
        } finally {
            cleanupDataSource(req, fileOrig, isOrig,
                              req.getInputStream(), log);
            IOUtils.closeQuietly(os, log);
        }
        return;
    }

    /**
     * @param materials a non-null encryption material
     */
    private ContentCryptoMaterial buildContentCryptoMaterial(
        EncryptionMaterials materials,
        AmazonWebServiceRequest req) {
        // Randomly generate the IV
        final byte[] iv = new byte[contentCryptoScheme.getIVLengthInBytes()];
        cryptoConfig.getSecureRandom().nextBytes(iv);

        if (materials.isKMSEnabled()) {
            final Map<String, String> encryptionContext =
                ContentCryptoMaterial.mergeMaterialDescriptions(materials, req);
            GenerateDataKeyRequest keyGenReq = new GenerateDataKeyRequest()
                .withEncryptionContext(encryptionContext)
                .withKeyId(materials.getCustomerMasterKeyId())
                .withKeySpec(contentCryptoScheme.getKeySpec());
            keyGenReq
                .withGeneralProgressListener(req.getGeneralProgressListener())
                .withRequestMetricCollector(req.getRequestMetricCollector())
            ;
            GenerateDataKeyResult keyGenRes = kms.generateDataKey(keyGenReq);
            final SecretKey cek =
                new SecretKeySpec(copyAllBytesFrom(keyGenRes.getPlaintext()),
                                  contentCryptoScheme.getKeyGeneratorAlgorithm());
            byte[] keyBlob = copyAllBytesFrom(keyGenRes.getCiphertextBlob());
            return ContentCryptoMaterial.wrap(cek, iv,
                                              contentCryptoScheme, cryptoConfig.getCryptoProvider(),
                                              cryptoConfig.getAlwaysUseCryptoProvider(),
                                              new KMSSecuredCEK(keyBlob, encryptionContext));
        } else {
            // Generate a one-time use symmetric key and initialize a cipher to encrypt object data
            return ContentCryptoMaterial.create(
                generateCEK(materials),
                iv, materials, cryptoScheme, cryptoConfig, kms, req);
        }
    }

    /**
     * @param kekMaterials non-null encryption materials
     */
    protected final SecretKey generateCEK(final EncryptionMaterials kekMaterials) {
        final String keygenAlgo = contentCryptoScheme.getKeyGeneratorAlgorithm();
        KeyGenerator generator;
        try {
            generator = cryptoConfig.getCryptoProvider() == null
                        ? KeyGenerator.getInstance(keygenAlgo)
                        : KeyGenerator.getInstance(keygenAlgo, cryptoConfig.getCryptoProvider());
            generator.init(contentCryptoScheme.getKeyLengthInBits(), cryptoConfig.getSecureRandom());
            // Set to true iff the key encryption involves the use of BC's public key
            boolean involvesBCPublicKey = false;
            KeyPair keypair = kekMaterials.getKeyPair();
            if (keypair != null) {
                String keyWrapAlgo = cryptoScheme.getKeyWrapScheme().getKeyWrapAlgorithm(keypair.getPublic());
                if (keyWrapAlgo == null) {
                    Provider provider = generator.getProvider();
                    String providerName = provider == null ? null : provider.getName();
                    involvesBCPublicKey = CryptoRuntime.BOUNCY_CASTLE_PROVIDER.equals(providerName);
                }
            }
            SecretKey secretKey = generator.generateKey();
            if (!involvesBCPublicKey || secretKey.getEncoded()[0] != 0)
                return secretKey;
            for (int retry = 0; retry < 9; retry++) {
                // Regenerate the random key due to a bug/feature in BC:
                // https://github.com/aws/aws-sdk-android/issues/15
                secretKey = generator.generateKey();
                if (secretKey.getEncoded()[0] != 0)
                    return secretKey;
            }
            // The probability of getting here is 2^80, which is impossible in practice.
            throw new SdkClientException("Failed to generate secret key");
        } catch (NoSuchAlgorithmException e) {
            throw new SdkClientException(
                "Unable to generate envelope symmetric key:"
                + e.getMessage(), e);
        }
    }

    /**
     * Returns the given <code>PutObjectRequest</code> but has the content as
     * input stream wrapped with a cipher, and configured with some meta data
     * and user metadata.
     */
    protected final <R extends AbstractPutObjectRequest> R wrapWithCipher(
        final R request, ContentCryptoMaterial cekMaterial) {
        // Create a new metadata object if there is no metadata already.
        ObjectMetadata metadata = request.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
        }

        // Record the original Content MD5, if present, for the unencrypted data
        if (metadata.getContentMD5() != null) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_MD5,
                                     metadata.getContentMD5());
        }

        // Removes the original content MD5 if present from the meta data.
        metadata.setContentMD5(null);

        // Record the original, unencrypted content-length so it can be accessed
        // later
        final long plaintextLength = plaintextLength(request, metadata);
        if (plaintextLength >= 0) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_LENGTH,
                                     Long.toString(plaintextLength));
            // Put the ciphertext length in the metadata
            metadata.setContentLength(ciphertextLength(plaintextLength));
        }
        request.setMetadata(metadata);
        request.setInputStream(newS3CipherLiteInputStream(
            request, cekMaterial, plaintextLength));
        // Treat all encryption requests as input stream upload requests, not as
        // file upload requests.
        request.setFile(null);
        return request;
    }

    private CipherLiteInputStream newS3CipherLiteInputStream(
        AbstractPutObjectRequest req, ContentCryptoMaterial cekMaterial,
        long plaintextLength) {
        final File fileOrig = req.getFile();
        final InputStream isOrig = req.getInputStream();
        InputStream isCurr = null;
        try {
            if (fileOrig == null) {
                // When input is a FileInputStream, this wrapping enables
                // unlimited mark-and-reset
                isCurr = isOrig == null ? null : ReleasableInputStream.wrap(isOrig);
            } else {
                isCurr = new ResettableInputStream(fileOrig);
            }
            if (plaintextLength > -1) {
                // S3 allows a single PUT to be no more than 5GB, which
                // therefore won't exceed the maximum length that can be
                // encrypted either using any cipher such as CBC or GCM.

                // This ensures the plain-text read from the underlying data
                // stream has the same length as the expected total.
                isCurr = new LengthCheckInputStream(isCurr, plaintextLength,
                                                    EXCLUDE_SKIPPED_BYTES);
            }
            final CipherLite cipherLite = cekMaterial.getCipherLite();

            if (cipherLite.markSupported()) {
                return new CipherLiteInputStream(isCurr, cipherLite,
                                                 DEFAULT_BUFFER_SIZE);
            } else {
                return new RenewableCipherLiteInputStream(isCurr, cipherLite,
                                                          DEFAULT_BUFFER_SIZE);
            }
        } catch (Exception e) {
            cleanupDataSource(req, fileOrig, isOrig, isCurr, log);
            throw failure(e, "Unable to create cipher input stream");
        }
    }

    /**
     * Returns the plaintext length from the request and metadata; or -1 if
     * unknown.
     */
    protected final long plaintextLength(AbstractPutObjectRequest request,
                                         ObjectMetadata metadata) {
        if (request.getFile() != null) {
            return request.getFile().length();
        } else if (request.getInputStream() != null
                   && metadata.getRawMetadataValue(Headers.CONTENT_LENGTH) != null) {
            return metadata.getContentLength();
        }
        return -1;
    }

    public final S3CryptoScheme getS3CryptoScheme() {
        return cryptoScheme;
    }

    /**
     * Updates put request to store the specified instruction object in S3.
     *
     * @param req
     *            The put-instruction-file request for the instruction file to
     *            be stored in S3.
     * @param cekMaterial
     *            The instruction object to be stored in S3.
     * @return A put request to store the specified instruction object in S3.
     */
    protected final PutObjectRequest updateInstructionPutRequest(
        PutObjectRequest req, ContentCryptoMaterial cekMaterial) {
        byte[] bytes =  cekMaterial.toJsonString(cryptoConfig.getCryptoMode())
                                   .getBytes(UTF8);
        ObjectMetadata metadata = req.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
            req.setMetadata(metadata);
        }
        // Set the content-length of the upload
        metadata.setContentLength(bytes.length);
        // Set the crypto instruction file header
        metadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");
        // Update the instruction request
        req.setMetadata(metadata);
        req.setInputStream(new ByteArrayInputStream(bytes));
        // the file attribute in the request is always null before calling this
        // routine
        return req;
    }

    protected final PutObjectRequest createInstructionPutRequest(
        String bucketName, String key, ContentCryptoMaterial cekMaterial) {
        byte[] bytes = cekMaterial.toJsonString(cryptoConfig.getCryptoMode())
                                  .getBytes(UTF8);
        InputStream is = new ByteArrayInputStream(bytes);
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(bytes.length);
        metadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");
        InstructionFileId ifileId = new S3ObjectId(bucketName, key)
            .instructionFileId();
        return new PutObjectRequest(ifileId.getBucket(), ifileId.getKey(),
                                    is, metadata);
    }

    /**
     * Appends a user agent to the request's USER_AGENT client marker.
     * This method is intended only for internal use by the AWS SDK.
     */
    final <X extends AmazonWebServiceRequest> X appendUserAgent(
        X request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
        return request;
    }

    /**
     * Checks if the the crypto scheme used in the given content crypto material
     * is allowed to be used in this crypto module. Default is no-op. Subclass
     * may override.
     *
     * @throws SecurityException
     *             if the crypto scheme used in the given content crypto
     *             material is not allowed in this crypto module.
     */
    protected void securityCheck(ContentCryptoMaterial cekMaterial,
                                 S3ObjectWrapper retrieved) {
    }

    /**
     * Retrieves an instruction file from S3; or null if no instruction file is
     * found.
     *
     * @param s3ObjectId
     *            the S3 object id (not the instruction file id)
     * @param instFileSuffix
     *            suffix of the instruction file to be retrieved; or null to use
     *            the default suffix.
     * @return an instruction file, or null if no instruction file is found.
     */
    final S3ObjectWrapper fetchInstructionFile(S3ObjectId s3ObjectId,
                                               String instFileSuffix) {
        try {
            S3Object o = s3.getObject(
                createInstructionGetRequest(s3ObjectId, instFileSuffix));
            return o == null ? null : new S3ObjectWrapper(o, s3ObjectId);
        } catch (AmazonServiceException e) {
            // If no instruction file is found, log a debug message, and return
            // null.
            if (log.isDebugEnabled()) {
                log.debug("Unable to retrieve instruction file : "
                          + e.getMessage());
            }
            return null;
        }
    }

    @Override
    public final PutObjectResult putInstructionFileSecurely(
        PutInstructionFileRequest req) {
        final S3ObjectId id = req.getS3ObjectId();
        final GetObjectRequest getreq = new GetObjectRequest(id);
        appendUserAgent(getreq, USER_AGENT);
        // Get the object from S3
        final S3Object retrieved = s3.getObject(getreq);
        // We only need the meta-data already retrieved, not the data stream.
        // So close it immediately to prevent resource leakage.
        closeQuietly(retrieved, log);
        if (retrieved == null) {
            throw new IllegalArgumentException(
                "The specified S3 object (" + id + ") doesn't exist.");
        }
        S3ObjectWrapper wrapped = new S3ObjectWrapper(retrieved, id);
        try {
            final ContentCryptoMaterial origCCM = contentCryptoMaterialOf(wrapped);
            if (ContentCryptoScheme.AES_GCM.equals(origCCM.getContentCryptoScheme())
                &&  cryptoConfig.getCryptoMode() == CryptoMode.EncryptionOnly) {
                throw new SecurityException(
                    "Lowering the protection of encryption material is not allowed");
            }
            securityCheck(origCCM, wrapped);
            // Re-ecnrypt the CEK in a new content crypto material
            final EncryptionMaterials newKEK = req.getEncryptionMaterials();
            final ContentCryptoMaterial newCCM;
            if (newKEK == null) {
                newCCM = origCCM.recreate(req.getMaterialsDescription(),
                                          this.kekMaterialsProvider,
                                          cryptoScheme,
                                          cryptoConfig, kms, req);
            } else {
                newCCM = origCCM.recreate(newKEK,
                                          this.kekMaterialsProvider,
                                          cryptoScheme,
                                          cryptoConfig, kms, req);
            }
            PutObjectRequest putInstFileRequest = req.createPutObjectRequest(retrieved);
            // Put the new instruction file into S3
            return s3.putObject(updateInstructionPutRequest(putInstFileRequest, newCCM));
        } catch (RuntimeException ex) {
            // If we're unable to set up the decryption, make sure we close the
            // HTTP connection
            closeQuietly(retrieved, log);
            throw ex;
        } catch (Error error) {
            closeQuietly(retrieved, log);
            throw error;
        }
    }

    /**
     * Returns the content crypto material of an existing S3 object.
     *
     * @param s3w
     *            an existing S3 object (wrapper)
     *
     * @return a non-null content crypto material.
     */
    private ContentCryptoMaterial contentCryptoMaterialOf(S3ObjectWrapper s3w) {
        // Check if encryption info is in object metadata
        if (s3w.hasEncryptionInfo()) {
            return ContentCryptoMaterial
                .fromObjectMetadata(s3w.getObjectMetadata(),
                                    kekMaterialsProvider,
                                    cryptoConfig.getCryptoProvider(),
                                    cryptoConfig.getAlwaysUseCryptoProvider(),
                                    false,   // existing CEK not necessarily key-wrapped
                                    kms
                );
        }
        S3ObjectWrapper orig_ifile =
            fetchInstructionFile(s3w.getS3ObjectId(), null);
        if (orig_ifile == null) {
            throw new IllegalArgumentException(
                "S3 object is not encrypted: " + s3w);
        }
        String json = orig_ifile.toJsonString();
        return ccmFromJson(json);
    }

    private ContentCryptoMaterial ccmFromJson(String json) {
        @SuppressWarnings("unchecked")
        Map<String, String> instruction = Collections.unmodifiableMap(
            Jackson.fromJsonString(json, Map.class));
        return ContentCryptoMaterial.fromInstructionFile(
            instruction,
            kekMaterialsProvider,
            cryptoConfig.getCryptoProvider(),
            cryptoConfig.getAlwaysUseCryptoProvider(),
            false,   // existing CEK not necessarily key-wrapped
            kms
        );
    }

    /**
     * Creates a get object request for an instruction file using
     * the default instruction file suffix.
     *
     * @param id
     *      an S3 object id (not the instruction file id)
     * @return
     *      A get request to retrieve an instruction file from S3.
     */
    final GetObjectRequest createInstructionGetRequest(S3ObjectId id) {
        return createInstructionGetRequest(id, null);
    }

    /**
     * Creates and return a get object request for an instruction file.
     *
     * @param s3objectId
     *      an S3 object id (not the instruction file id)
     * @param instFileSuffix
     *            suffix of the specific instruction file to be used, or null if
     *            the default instruction file is to be used.
     */
    final GetObjectRequest createInstructionGetRequest(
        S3ObjectId s3objectId, String instFileSuffix) {
        return new GetObjectRequest(
            s3objectId.instructionFileId(instFileSuffix));
    }

    static long[] getAdjustedCryptoRange(long[] range) {
        // If range is invalid, then return null.
        if (range == null || range[0] > range[1]) {
            return null;
        }
        long[] adjustedCryptoRange = new long[2];
        adjustedCryptoRange[0] = getCipherBlockLowerBound(range[0]);
        adjustedCryptoRange[1] = getCipherBlockUpperBound(range[1]);
        return adjustedCryptoRange;
    }

    private static long getCipherBlockLowerBound(long leftmostBytePosition) {
        long cipherBlockSize = JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE;
        long offset = leftmostBytePosition % cipherBlockSize;
        long lowerBound = leftmostBytePosition - offset - cipherBlockSize;
        return lowerBound < 0 ? 0 : lowerBound;
    }

    /**
     * Takes the position of the rightmost desired byte of a user specified
     * range and returns the position of the end of the following cipher block;
     * or {@value Long#MAX_VALUE} if the resultant position has a value that
     * exceeds {@value Long#MAX_VALUE}.
     */
    private static long getCipherBlockUpperBound(final long rightmostBytePosition) {
        long cipherBlockSize = JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE;
        long offset = cipherBlockSize - (rightmostBytePosition % cipherBlockSize);
        long upperBound = rightmostBytePosition + offset + cipherBlockSize;
        return upperBound < 0 ? Long.MAX_VALUE : upperBound;
    }
}
