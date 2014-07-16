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
import static com.amazonaws.services.s3.AmazonS3EncryptionClient.USER_AGENT;
import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.createInstructionGetRequest;
import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.getAdjustedCryptoRange;
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoStorageMode;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadResult;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.model.UploadPartResult;
import com.amazonaws.util.json.Jackson;

/**
 * Authenticated encryption (AE) cryptographic module for the S3 encryption client.
 */
class S3CryptoModuleAE extends S3CryptoModuleBase<MultipartUploadCryptoContext> {
    static {
        // Enable bouncy castle if available
        CryptoRuntime.enableBouncyCastle();
    }
    private static final boolean IS_MULTI_PART = true;

    S3CryptoModuleAE(S3Direct s3,
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig) {
        super(s3, credentialsProvider, encryptionMaterialsProvider,
                clientConfig, cryptoConfig, 
                new S3CryptoScheme(ContentCryptoScheme.AES_GCM));
    }

    /**
     * Used for testing purposes only.
     */
    S3CryptoModuleAE(S3Direct s3,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(s3, new DefaultAWSCredentialsProviderChain(),
                encryptionMaterialsProvider, new ClientConfiguration(),
                cryptoConfig);
    }

    /**
     * Returns true if a strict encryption mode is in use in the current crypto
     * module; false otherwise.
     */
    protected boolean isStrict() {
        return false;
    }

    /**
     * @throws SecurityException
     *             if the crypto scheme used in the given content crypto
     *             material is not allowed in this crypto module.
     */
    protected void securityCheck(ContentCryptoMaterial cekMaterial,
            S3ObjectWrapper retrieved) {
        // default is no-op. Sublcass may override.
    }

    @Override
    public PutObjectResult putObjectSecurely(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        appendUserAgent(putObjectRequest, USER_AGENT);

        if (this.cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile) {
            return putObjectUsingInstructionFile(putObjectRequest);
        } else {
            return putObjectUsingMetadata(putObjectRequest);
        }
    }

    private PutObjectResult putObjectUsingMetadata(PutObjectRequest req)
            throws AmazonClientException, AmazonServiceException {
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterial(req);
        // Wraps the object data with a cipher input stream
        PutObjectRequest wrappedReq = wrapWithCipher(req, cekMaterial);
        // Update the metadata
        req.setMetadata(updateMetadataWithContentCryptoMaterial(
                req.getMetadata(), req.getFile(),
                cekMaterial));
        // Put the encrypted object into S3
        return s3.putObject(wrappedReq);
    }

    @Override
    public S3Object getObjectSecurely(GetObjectRequest req)
            throws AmazonClientException, AmazonServiceException {
        appendUserAgent(req, USER_AGENT);
        // Adjust the crypto range to retrieve all of the cipher blocks needed to contain the user's desired
        // range of bytes.
        long[] desiredRange = req.getRange();
        if (isStrict() && desiredRange  != null)
            throw new SecurityException("Range get is not allowed in strict crypto mode");
        long[] adjustedCryptoRange = getAdjustedCryptoRange(desiredRange);
        if (adjustedCryptoRange != null)
            req.setRange(adjustedCryptoRange[0], adjustedCryptoRange[1]);
        // Get the object from S3
        S3Object retrieved = s3.getObject(req);
        // If the caller has specified constraints, it's possible that super.getObject(...)
        // would return null, so we simply return null as well.
        if (retrieved == null)
            return null;
        try {
            return decipher(req, desiredRange, adjustedCryptoRange, retrieved);
        } catch (RuntimeException rc) {
            // If we're unable to set up the decryption, make sure we close the
            // HTTP connection
            closeQuietly(retrieved.getObjectContent(), log);
            throw rc;
        } catch (Error error) {
            closeQuietly(retrieved.getObjectContent(), log);
            throw error;
        }
    }

    private S3Object decipher(GetObjectRequest req,
            long[] desiredRange, long[] cryptoRange,
            S3Object retrieved) {
        S3ObjectWrapper wrapped = new S3ObjectWrapper(retrieved);
        // Check if encryption info is in object metadata
        if (wrapped.hasEncryptionInfo())
            return decipherWithMetadata(desiredRange, cryptoRange, wrapped);
        // Check if encrypted info is in an instruction file
        S3ObjectWrapper instructionFile = fetchInstructionFile(req);
        if (instructionFile != null) {
            try {
                if (instructionFile.isInstructionFile()) {
                    return decipherWithInstructionFile(desiredRange, cryptoRange,
                            wrapped, instructionFile);
                }
            } finally {
                try {
                    instructionFile.getObjectContent().close();
                } catch (Exception ignore) {
                }
            }
        }
        if (isStrict()) {
            closeQuietly(wrapped, log);
            throw new SecurityException("S3 object with bucket name: "
                    + retrieved.getBucketName() + ", key: "
                    + retrieved.getKey() + " is not encrypted");
        }
       // The object was not encrypted to begin with. Return the object
        // without decrypting it.
        log.warn(String.format(
                "Unable to detect encryption information for object '%s' in bucket '%s'. "
                        + "Returning object without decryption.",
                retrieved.getKey(),
                retrieved.getBucketName()));
        // Adjust the output to the desired range of bytes.
        S3ObjectWrapper adjusted = adjustToDesiredRange(wrapped, desiredRange, null);
        return adjusted.getS3Object();
    }

    private S3Object decipherWithInstructionFile(long[] desiredRange,
            long[] cryptoRange, S3ObjectWrapper retrieved,
            S3ObjectWrapper instructionFile) {
        String json = instructionFile.toJsonString();
        @SuppressWarnings("unchecked")
        Map<String, String> instruction = Collections.unmodifiableMap(
                Jackson.fromJsonString(json, Map.class));
        ContentCryptoMaterial cekMaterial =
                ContentCryptoMaterial.fromInstructionFile(
                    instruction,
                    kekMaterialsProvider,
                    cryptoConfig.getCryptoProvider(), 
                    cryptoRange   // range is sometimes necessary to compute the adjusted IV
            );
        securityCheck(cekMaterial, retrieved);
        S3ObjectWrapper decrypted = decrypt(retrieved, cekMaterial, cryptoRange);
        // Adjust the output to the desired range of bytes.
        S3ObjectWrapper adjusted = adjustToDesiredRange(
                decrypted, desiredRange, instruction);
        return adjusted.getS3Object();
    }

    private S3Object decipherWithMetadata(long[] desiredRange,
            long[] cryptoRange, S3ObjectWrapper retrieved) {
        ContentCryptoMaterial cekMaterial = ContentCryptoMaterial
            .fromObjectMetadata(retrieved.getObjectMetadata(),
                kekMaterialsProvider,
                cryptoConfig.getCryptoProvider(),
                // range is sometimes necessary to compute the adjusted IV
                cryptoRange
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
            throw new AmazonClientException("Error adjusting output to desired byte range: " + e.getMessage());
        }
    }
    
    @Override
    public ObjectMetadata getObjectSecurely(GetObjectRequest getObjectRequest, File destinationFile)
            throws AmazonClientException, AmazonServiceException {
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
            throw new AmazonClientException(
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
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(
            CompleteMultipartUploadRequest req) throws AmazonClientException,
            AmazonServiceException {
        appendUserAgent(req, USER_AGENT);
        String uploadId = req.getUploadId();
        MultipartUploadCryptoContext uploadContext = multipartUploadContexts.get(uploadId);

        if (uploadContext.hasFinalPartBeenSeen() == false) {
            throw new AmazonClientException("Unable to complete an encrypted multipart upload without being told which part was the last.  " +
                    "Without knowing which part was the last, the encrypted data in Amazon S3 is incomplete and corrupt.");
        }

        CompleteMultipartUploadResult result = s3.completeMultipartUpload(req);

        // In InstructionFile mode, we want to write the instruction file only
        // after the whole upload has completed correctly.
        if (cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile) {
            // Put the instruction file into S3
            s3.putObject(createInstructionPutRequest(
                    uploadContext.getBucketName(),
                    uploadContext.getKey(),
                    uploadContext.getContentCryptoMaterial()));
        }
        multipartUploadContexts.remove(uploadId);
        return result;
    }

    @Override
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(
            InitiateMultipartUploadRequest req)
            throws AmazonClientException, AmazonServiceException {
        appendUserAgent(req, USER_AGENT);
        // Generate a one-time use symmetric key and initialize a cipher to
        // encrypt object data
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterial(req);
        if (cryptoConfig.getStorageMode() == CryptoStorageMode.ObjectMetadata) {
            ObjectMetadata metadata = req.getObjectMetadata();
            if (metadata == null)
                metadata = new ObjectMetadata();
            // Store encryption info in metadata
            req.setObjectMetadata(updateMetadataWithContentCryptoMaterial(
                    metadata, null, cekMaterial));
        }
        InitiateMultipartUploadResult result = s3.initiateMultipartUpload(req);
        MultipartUploadCryptoContext uploadContext = new MultipartUploadCryptoContext(
                req.getBucketName(), req.getKey(), cekMaterial);
        multipartUploadContexts.put(result.getUploadId(), uploadContext);
        return result;
    }

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
    public UploadPartResult uploadPartSecurely(UploadPartRequest req)
            throws AmazonClientException, AmazonServiceException {
        appendUserAgent(req, USER_AGENT);
        final int blockSize = contentCryptoScheme.getBlockSizeInBytes();
        final boolean isLastPart = req.isLastPart();
        final String uploadId = req.getUploadId();
        final long partSize = req.getPartSize();
        final boolean partSizeMultipleOfCipherBlockSize = 0 == (partSize % blockSize);
        if (!isLastPart && !partSizeMultipleOfCipherBlockSize) {
            throw new AmazonClientException(
                "Invalid part size: part sizes for encrypted multipart uploads must be multiples "
                    + "of the cipher block size ("
                    + blockSize
                    + ") with the exception of the last part.");
        }

        // Generate the envelope symmetric key and initialize a cipher to encrypt the object's data
        MultipartUploadCryptoContext uploadContext = multipartUploadContexts.get(uploadId);
        if (uploadContext == null) {
            throw new AmazonClientException(
                "No client-side information available on upload ID " + uploadId);
        }

        CipherLite cipherLite = uploadContext.getCipherLite();
        req.setInputStream(newMultipartS3CipherInputStream(req, cipherLite));
        // Treat all encryption requests as input stream upload requests, not as
        // file upload requests.
        req.setFile(null);
        req.setFileOffset(0);
        // The last part of the multipart upload will contain an extra 16-byte mac
        if (req.isLastPart()) {
            // We only change the size of the last part
            req.setPartSize(partSize + (contentCryptoScheme.getTagLengthInBits()/8));
            if (uploadContext.hasFinalPartBeenSeen()) {
                throw new AmazonClientException(
                    "This part was specified as the last part in a multipart upload, but a previous part was already marked as the last part.  "
                        + "Only the last part of the upload should be marked as the last part.");
            }
            uploadContext.setHasFinalPartBeenSeen(true);
        }

        UploadPartResult result = s3.uploadPart(req);
        return result;
    }

    protected final CipherLiteInputStream newMultipartS3CipherInputStream(
            UploadPartRequest req, CipherLite cipherLite) {
        try {
            InputStream is = req.getInputStream();
            if (req.getFile() != null) {
                is = new InputSubstream(
                    new RepeatableFileInputStream(
                        req.getFile()),
                        req.getFileOffset(), 
                        req.getPartSize(),
                        req.isLastPart());
            }
            return new CipherLiteInputStream(is, cipherLite,
                DEFAULT_BUFFER_SIZE,
                IS_MULTI_PART
            );
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Unable to create cipher input stream: " + e.getMessage(),
                    e);
        }
    }

    @Override
    public CopyPartResult copyPartSecurely(CopyPartRequest copyPartRequest) {
        String uploadId = copyPartRequest.getUploadId();
        MultipartUploadCryptoContext uploadContext = multipartUploadContexts.get(uploadId);

        if (!uploadContext.hasFinalPartBeenSeen()) {
            uploadContext.setHasFinalPartBeenSeen(true);
        }

        return s3.copyPart(copyPartRequest);
    }

    /*
     * Private helper methods
     */


    /**
     * Puts an encrypted object into S3, and puts an instruction file into S3. Encryption info is stored in the instruction file.
     *
     * @param putObjectRequest
     *      The request object containing all the parameters to upload a
     *      new object to Amazon S3.
     * @return
     *      A {@link PutObjectResult} object containing the information
     *      returned by Amazon S3 for the new, created object.
     * @throws AmazonClientException
     *      If any errors are encountered on the client while making the
     *      request or handling the response.
     * @throws AmazonServiceException
     *      If any errors occurred in Amazon S3 while processing the
     *      request.
     */
    private PutObjectResult putObjectUsingInstructionFile(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        PutObjectRequest putInstFileRequest = putObjectRequest.clone();
        // Create instruction
        ContentCryptoMaterial cekMaterial = createContentCryptoMaterial(putObjectRequest);
        // Wraps the object data with a cipher input stream; note the metadata
        // is mutated as a side effect.
        PutObjectRequest req = wrapWithCipher(putObjectRequest, cekMaterial);
        // Put the encrypted object into S3
        PutObjectResult result = s3.putObject(req);
        // Put the instruction file into S3
        s3.putObject(upateInstructionPutRequest(putInstFileRequest, cekMaterial));
        // Return the result of the encrypted object PUT.
        return result;
    }

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
                new CipherLiteInputStream(objectContent, cekMaterial
                        .getCipherLite(), DEFAULT_BUFFER_SIZE), objectContent
                        .getHttpRequest()));
        return wrapper;
    }

    /**
     * Retrieves an instruction file from S3.  If no instruction file is found, returns null.
     *
     * @param getObjectRequest
     *      A GET request for an object in S3.  The parameters from this request will be used
     *      to retrieve the corresponding instruction file.
     * @return
     *      An instruction file, or null if no instruction file was found.
     */
    private S3ObjectWrapper fetchInstructionFile(GetObjectRequest getObjectRequest) {
        try {
            S3Object o = s3.getObject(createInstructionGetRequest(getObjectRequest));
            return o == null ? null : new S3ObjectWrapper(o);
        } catch (AmazonServiceException e) {
            // If no instruction file is found, log a debug message, and return null.
            log.debug("Unable to retrieve instruction file : " + e.getMessage());
            return null;
        }
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
