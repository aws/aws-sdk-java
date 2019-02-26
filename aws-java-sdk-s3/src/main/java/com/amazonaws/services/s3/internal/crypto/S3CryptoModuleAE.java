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
import static com.amazonaws.services.s3.model.CryptoMode.AuthenticatedEncryption;
import static com.amazonaws.services.s3.model.CryptoMode.StrictAuthenticatedEncryption;
import static com.amazonaws.services.s3.model.ExtraMaterialsDescription.NONE;
import static com.amazonaws.util.IOUtils.closeQuietly;

import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.internal.SdkFilterInputStream;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.EncryptedGetObjectRequest;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.ExtraMaterialsDescription;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectId;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.json.Jackson;

/**
 * Authenticated encryption (AE) cryptographic module for the S3 encryption client.
 */
class S3CryptoModuleAE extends S3CryptoModuleBase<MultipartUploadCryptoContext> {
    static {
        // Enable bouncy castle if available
        CryptoRuntime.enableBouncyCastle();
    }
    /**
     * @param cryptoConfig a read-only copy of the crypto configuration.
     */
    S3CryptoModuleAE(AWSKMS kms, S3Direct s3,
                     AWSCredentialsProvider credentialsProvider,
                     EncryptionMaterialsProvider encryptionMaterialsProvider,
                     CryptoConfiguration cryptoConfig) {
        super(kms, s3, credentialsProvider, encryptionMaterialsProvider,
                cryptoConfig);
        CryptoMode mode = cryptoConfig.getCryptoMode();
        if (mode != StrictAuthenticatedEncryption
        &&  mode != AuthenticatedEncryption) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Used for testing purposes only.
     */
    S3CryptoModuleAE(S3Direct s3,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(null, s3, new DefaultAWSCredentialsProviderChain(),
                encryptionMaterialsProvider, cryptoConfig);
    }
    /**
     * Used for testing purposes only.
     */
    S3CryptoModuleAE(AWSKMS kms, S3Direct s3,
                     EncryptionMaterialsProvider encryptionMaterialsProvider,
                     CryptoConfiguration cryptoConfig) {
        this(kms, s3, new DefaultAWSCredentialsProviderChain(),
                encryptionMaterialsProvider, cryptoConfig);
    }

    /**
     * Returns true if a strict encryption mode is in use in the current crypto
     * module; false otherwise.
     */
    protected boolean isStrict() {
        return false;
    }

    @Override
    public S3Object getObjectSecurely(GetObjectRequest req) {
        appendUserAgent(req, USER_AGENT);
        // Adjust the crypto range to retrieve all of the cipher blocks needed to contain the user's desired
        // range of bytes.
        long[] desiredRange = req.getRange();
        if (isStrict() && (desiredRange  != null || req.getPartNumber() != null))
            throw new SecurityException("Range get and getting a part are not allowed in strict crypto mode");
        long[] adjustedCryptoRange = getAdjustedCryptoRange(desiredRange);
        if (adjustedCryptoRange != null)
            req.setRange(adjustedCryptoRange[0], adjustedCryptoRange[1]);
        // Get the object from S3
        S3Object retrieved = s3.getObject(req);
        // If the caller has specified constraints, it's possible that super.getObject(...)
        // would return null, so we simply return null as well.
        if (retrieved == null)
            return null;
        String suffix = null;
        if (req instanceof EncryptedGetObjectRequest) {
            EncryptedGetObjectRequest ereq = (EncryptedGetObjectRequest)req;
            suffix = ereq.getInstructionFileSuffix();
        }
        try {
            return suffix == null || suffix.trim().isEmpty()
             ? decipher(req, desiredRange, adjustedCryptoRange, retrieved)
             : decipherWithInstFileSuffix(req,
                     desiredRange, adjustedCryptoRange, retrieved,
                     suffix)
             ;
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

    private S3Object decipher(GetObjectRequest req,
            long[] desiredRange, long[] cryptoRange,
            S3Object retrieved) {
        S3ObjectWrapper wrapped = new S3ObjectWrapper(retrieved, req.getS3ObjectId());
        // Check if encryption info is in object metadata
        if (wrapped.hasEncryptionInfo())
            return decipherWithMetadata(req, desiredRange, cryptoRange, wrapped);
        // Check if encrypted info is in an instruction file
        S3ObjectWrapper ifile = fetchInstructionFile(req.getS3ObjectId(), null);
        if (ifile != null) {
            try {
                return decipherWithInstructionFile(req, desiredRange,
                        cryptoRange, wrapped, ifile);
            } finally {
                closeQuietly(ifile, log);
            }
        }

        if (isStrict() || !cryptoConfig.isIgnoreMissingInstructionFile()) {
            closeQuietly(wrapped, log);
            throw new SecurityException("Instruction file not found for S3 object with bucket name: "
                    + retrieved.getBucketName() + ", key: "
                    + retrieved.getKey());
        }
        // To keep backward compatible:
        // ignore the missing instruction file and treat the object as un-encrypted.
        log.warn(String.format(
                "Unable to detect encryption information for object '%s' in bucket '%s'. "
                        + "Returning object without decryption.",
                retrieved.getKey(),
                retrieved.getBucketName()));
        // Adjust the output to the desired range of bytes.
        S3ObjectWrapper adjusted = adjustToDesiredRange(wrapped, desiredRange, null);
        return adjusted.getS3Object();
    }

    /**
     * Same as {@link #decipher(GetObjectRequest, long[], long[], S3Object)}
     * but makes use of an instruction file with the specified suffix.
     * @param instFileSuffix never null or empty (which is assumed to have been
     * sanitized upstream.)
     */
    private S3Object decipherWithInstFileSuffix(GetObjectRequest req,
            long[] desiredRange, long[] cryptoRange, S3Object retrieved,
            String instFileSuffix) {
        final S3ObjectId id = req.getS3ObjectId();
        // Check if encrypted info is in an instruction file
        final S3ObjectWrapper ifile = fetchInstructionFile(id, instFileSuffix);
        if (ifile == null) {
            throw new SdkClientException("Instruction file with suffix "
                    + instFileSuffix + " is not found for " + retrieved);
        }
        try {
            return decipherWithInstructionFile(req, desiredRange,
                    cryptoRange, new S3ObjectWrapper(retrieved, id), ifile);
        } finally {
            closeQuietly(ifile, log);
        }
    }

    private S3Object decipherWithInstructionFile(GetObjectRequest req,
            long[] desiredRange, long[] cryptoRange, S3ObjectWrapper retrieved,
            S3ObjectWrapper instructionFile) {
        ExtraMaterialsDescription extraMatDesc = NONE;
        boolean keyWrapExpected = isStrict();
        if (req instanceof EncryptedGetObjectRequest) {
            EncryptedGetObjectRequest ereq = (EncryptedGetObjectRequest)req;
            extraMatDesc = ereq.getExtraMaterialDescription();
            if (!keyWrapExpected)
                keyWrapExpected = ereq.isKeyWrapExpected();
        }
        String json = instructionFile.toJsonString();
        @SuppressWarnings("unchecked")
        Map<String, String> matdesc =
            Collections.unmodifiableMap(Jackson.fromJsonString(json, Map.class));
        ContentCryptoMaterial cekMaterial =
                ContentCryptoMaterial.fromInstructionFile(
                    matdesc,
                    kekMaterialsProvider,
                    cryptoConfig.getCryptoProvider(),
                    cryptoConfig.getAlwaysUseCryptoProvider(),
                    cryptoRange,   // range is sometimes necessary to compute the adjusted IV
                    extraMatDesc,
                    keyWrapExpected,
                    kms
            );
        securityCheck(cekMaterial, retrieved);
        S3ObjectWrapper decrypted = decrypt(retrieved, cekMaterial, cryptoRange);
        // Adjust the output to the desired range of bytes.
        S3ObjectWrapper adjusted = adjustToDesiredRange(
                decrypted, desiredRange, matdesc);
        return adjusted.getS3Object();
    }

    private S3Object decipherWithMetadata(GetObjectRequest req,
            long[] desiredRange,
            long[] cryptoRange, S3ObjectWrapper retrieved) {
        ExtraMaterialsDescription extraMatDesc = NONE;
        boolean keyWrapExpected = isStrict();
        if (req instanceof EncryptedGetObjectRequest) {
            EncryptedGetObjectRequest ereq = (EncryptedGetObjectRequest)req;
            extraMatDesc = ereq.getExtraMaterialDescription();
            if (!keyWrapExpected)
                keyWrapExpected = ereq.isKeyWrapExpected();
        }
        ContentCryptoMaterial cekMaterial = ContentCryptoMaterial
            .fromObjectMetadata(retrieved.getObjectMetadata(),
                kekMaterialsProvider,
                cryptoConfig.getCryptoProvider(),
                cryptoConfig.getAlwaysUseCryptoProvider(),
                // range is sometimes necessary to compute the adjusted IV
                cryptoRange,
                extraMatDesc,
                keyWrapExpected,
                kms
            );
        securityCheck(cekMaterial, retrieved);
        S3ObjectWrapper decrypted = decrypt(retrieved, cekMaterial, cryptoRange);
        // Adjust the output to the desired range of bytes.
        S3ObjectWrapper adjusted = adjustToDesiredRange(
                decrypted, desiredRange, null);
        return adjusted.getS3Object();
    }

    /**
     * Adjusts the retrieved S3Object so that the object contents contain only the range of bytes
     * desired by the user.  Since encrypted contents can only be retrieved in CIPHER_BLOCK_SIZE
     * (16 bytes) chunks, the S3Object potentially contains more bytes than desired, so this method
     * adjusts the contents range.
     *
     * @param s3object
     *      The S3Object retrieved from S3 that could possibly contain more bytes than desired
     *      by the user.
     * @param range
     *      A two-element array of longs corresponding to the start and finish (inclusive) of a desired
     *      range of bytes.
     * @param instruction
     *      Instruction file in JSON or null if no instruction file is involved
     * @return
     *      The S3Object with adjusted object contents containing only the range desired by the user.
     *      If the range specified is invalid, then the S3Object is returned without any modifications.
     */
    protected final S3ObjectWrapper adjustToDesiredRange(S3ObjectWrapper s3object,
            long[] range, Map<String,String> instruction) {
        if (range == null)
            return s3object;
        // Figure out the original encryption scheme used, which can be
        // different from the crypto scheme used for decryption.
        ContentCryptoScheme encryptionScheme = s3object.encryptionSchemeOf(instruction);
        // range get on data encrypted using AES_GCM
        final long instanceLen = s3object.getObjectMetadata().getInstanceLength();
        final long maxOffset = instanceLen - encryptionScheme.getTagLengthInBits() / 8 - 1;
        if (range[1] > maxOffset) {
            range[1] = maxOffset;
            if (range[0] > range[1]) {
                // Return empty content
                // First let's close the existing input stream to avoid resource
                // leakage
                closeQuietly(s3object.getObjectContent(), log);
                s3object.setObjectContent(new ByteArrayInputStream(new byte[0]));
                return s3object;
            }
        }
        if (range[0] > range[1]) {
            // Make no modifications if range is invalid.
            return s3object;
        }
        try {
            S3ObjectInputStream objectContent = s3object.getObjectContent();
            InputStream adjustedRangeContents = new AdjustedRangeInputStream(objectContent, range[0], range[1]);
            s3object.setObjectContent(new S3ObjectInputStream(adjustedRangeContents, objectContent.getHttpRequest()));
            return s3object;
        } catch (IOException e) {
            throw new SdkClientException("Error adjusting output to desired byte range: " + e.getMessage());
        }
    }

    @Override
    public ObjectMetadata getObjectSecurely(GetObjectRequest getObjectRequest,
            File destinationFile) {
        assertParameterNotNull(destinationFile,
        "The destination file parameter must be specified when downloading an object directly to a file");

        S3Object s3Object = getObjectSecurely(getObjectRequest);
        // getObject can return null if constraints were specified but not met
        if (s3Object == null) return null;

        OutputStream outputStream = null;
        try {
            outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));
            byte[] buffer = new byte[1024*10];
            int bytesRead;
            while ((bytesRead = s3Object.getObjectContent().read(buffer)) > -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            throw new SdkClientException(
                    "Unable to store object contents to disk: " + e.getMessage(), e);
        } finally {
            closeQuietly(outputStream, log);
            closeQuietly(s3Object.getObjectContent(), log);
        }

        /*
         * Unlike the standard Amazon S3 Client, the Amazon S3 Encryption Client does not do an MD5 check
         * here because the contents stored in S3 and the contents we just retrieved are different.  In
         * S3, the stored contents are encrypted, and locally, the retrieved contents are decrypted.
         */

        return s3Object.getObjectMetadata();
    }

    @Override
    final MultipartUploadCryptoContext newUploadContext(
            InitiateMultipartUploadRequest req, ContentCryptoMaterial cekMaterial) {
        return new MultipartUploadCryptoContext(
                req.getBucketName(), req.getKey(), cekMaterial);
    }

    //// specific overrides for uploading parts.
    @Override
    final CipherLite cipherLiteForNextPart(
            MultipartUploadCryptoContext uploadContext) {
        return uploadContext.getCipherLite();
    }
    @Override
    final SdkFilterInputStream wrapForMultipart(
            CipherLiteInputStream  is, long partSize) {
        return is;
    }
    @Override
    final long computeLastPartSize(UploadPartRequest req) {
        return req.getPartSize()
             + (contentCryptoScheme.getTagLengthInBits() / 8);
    }
    @Override
    final void updateUploadContext(MultipartUploadCryptoContext uploadContext,
            SdkFilterInputStream is) {
    }

    /*
     * Private helper methods
     */

    /**
     * Returns an updated object where the object content input stream contains the decrypted contents.
     *
     * @param wrapper
     *      The object whose contents are to be decrypted.
     * @param cekMaterial
     *      The instruction that will be used to decrypt the object data.
     * @return
     *      The updated object where the object content input stream contains the decrypted contents.
     */
    private S3ObjectWrapper decrypt(S3ObjectWrapper wrapper,
            ContentCryptoMaterial cekMaterial, long[] range) {
        S3ObjectInputStream objectContent = wrapper.getObjectContent();
        wrapper.setObjectContent(new S3ObjectInputStream(
                new CipherLiteInputStream(objectContent,
                    cekMaterial.getCipherLite(),
                    DEFAULT_BUFFER_SIZE),
                    objectContent.getHttpRequest()));
        return wrapper;
    }

    /**
     * Asserts that the specified parameter value is not null and if it is,
     * throws an IllegalArgumentException with the specified error message.
     *
     * @param parameterValue
     *            The parameter value being checked.
     * @param errorMessage
     *            The error message to include in the IllegalArgumentException
     *            if the specified parameter is null.
     */
    private void assertParameterNotNull(Object parameterValue, String errorMessage) {
        if (parameterValue == null) throw new IllegalArgumentException(errorMessage);
    }

    @Override
    protected final long ciphertextLength(long originalContentLength) {
        // Add 16 bytes for the 128-bit tag length using AES/GCM
        return originalContentLength + contentCryptoScheme.getTagLengthInBits()/8;
    }
}
