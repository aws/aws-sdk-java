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
import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.createSymmetricCipher;
import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.encryptRequestUsingInstruction;
import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.generateInstruction;
import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.generateOneTimeUseSymmetricKey;
import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.getEncryptedSymmetricKey;

import java.io.File;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoStorageMode;
import com.amazonaws.services.s3.model.EncryptionMaterials;
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
 * Encryption only (EO) cryptographic module for the S3 encryption client.
 */
class S3CryptoModuleEO extends S3CryptoModuleBase<EncryptedUploadContext> {
    S3CryptoModuleEO(S3Direct s3,
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        super(s3, credentialsProvider, encryptionMaterialsProvider,
                clientConfig, cryptoConfig,
                new S3CryptoScheme(ContentCryptoScheme.AES_CBC));
    }

    /**
     * Used for testing purposes only.
     */
    S3CryptoModuleEO(S3Direct s3,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this(s3, new DefaultAWSCredentialsProviderChain(),
                encryptionMaterialsProvider, new ClientConfiguration(),
                cryptoConfig);
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

    @Override
    public S3Object getObjectSecurely(GetObjectRequest getObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        // Should never get here, as S3 object encrypted in either EO or AE
        // format should all be handled by the AE module.
        throw new IllegalStateException();
    }

    @Override
    public ObjectMetadata getObjectSecurely(GetObjectRequest getObjectRequest, File destinationFile)
            throws AmazonClientException, AmazonServiceException {
        // Should never get here, as S3 object encrypted in either EO or AE
        // format should all be handled by the AE module.
        throw new IllegalStateException();
    }


    @Override
    public CompleteMultipartUploadResult completeMultipartUploadSecurely(
            CompleteMultipartUploadRequest completeMultipartUploadRequest)
                    throws AmazonClientException, AmazonServiceException {
        appendUserAgent(completeMultipartUploadRequest, USER_AGENT);

        String uploadId = completeMultipartUploadRequest.getUploadId();
        EncryptedUploadContext encryptedUploadContext = multipartUploadContexts.get(uploadId);

        if (encryptedUploadContext.hasFinalPartBeenSeen() == false) {
            throw new AmazonClientException("Unable to complete an encrypted multipart upload without being told which part was the last.  " +
                    "Without knowing which part was the last, the encrypted data in Amazon S3 is incomplete and corrupt.");
        }

        CompleteMultipartUploadResult result = s3.completeMultipartUpload(completeMultipartUploadRequest);

        // In InstructionFile mode, we want to write the instruction file only after the whole upload has completed correctly.
        if (cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile) {
            Cipher symmetricCipher = createSymmetricCipher(
                    encryptedUploadContext.getEnvelopeEncryptionKey(),
                    Cipher.ENCRYPT_MODE, cryptoConfig.getCryptoProvider(),
                    encryptedUploadContext.getFirstInitializationVector());

            EncryptionMaterials encryptionMaterials = kekMaterialsProvider.getEncryptionMaterials();

            // Encrypt the envelope symmetric key
            byte[] encryptedEnvelopeSymmetricKey = getEncryptedSymmetricKey(encryptedUploadContext.getEnvelopeEncryptionKey(), encryptionMaterials, cryptoConfig.getCryptoProvider());
            EncryptionInstruction instruction = new EncryptionInstruction(encryptionMaterials.getMaterialsDescription(), encryptedEnvelopeSymmetricKey, encryptedUploadContext.getEnvelopeEncryptionKey(), symmetricCipher);

            // Put the instruction file into S3
            s3.putObject(EncryptionUtils.createInstructionPutRequest(encryptedUploadContext.getBucketName(), encryptedUploadContext.getKey(), instruction));
        }

        multipartUploadContexts.remove(uploadId);
        return result;
    }

    @Override
    public InitiateMultipartUploadResult initiateMultipartUploadSecurely(
            InitiateMultipartUploadRequest initiateMultipartUploadRequest)
                    throws AmazonClientException, AmazonServiceException {
        appendUserAgent(initiateMultipartUploadRequest, USER_AGENT);

        // Generate a one-time use symmetric key and initialize a cipher to encrypt object data
        SecretKey envelopeSymmetricKey = generateOneTimeUseSymmetricKey();
        Cipher symmetricCipher = createSymmetricCipher(envelopeSymmetricKey, Cipher.ENCRYPT_MODE, cryptoConfig.getCryptoProvider(), null);

        if (cryptoConfig.getStorageMode() == CryptoStorageMode.ObjectMetadata) {
      EncryptionMaterials encryptionMaterials = kekMaterialsProvider.getEncryptionMaterials();
            // Encrypt the envelope symmetric key
            byte[] encryptedEnvelopeSymmetricKey = getEncryptedSymmetricKey(envelopeSymmetricKey, encryptionMaterials, cryptoConfig.getCryptoProvider());

            // Store encryption info in metadata
            ObjectMetadata metadata = EncryptionUtils.updateMetadataWithEncryptionInfo(initiateMultipartUploadRequest, encryptedEnvelopeSymmetricKey, symmetricCipher, encryptionMaterials.getMaterialsDescription());

            // Update the request's metadata to the updated metadata
            initiateMultipartUploadRequest.setObjectMetadata(metadata);
        }

        InitiateMultipartUploadResult result = s3.initiateMultipartUpload(initiateMultipartUploadRequest);
        EncryptedUploadContext encryptedUploadContext = new EncryptedUploadContext(initiateMultipartUploadRequest.getBucketName(), initiateMultipartUploadRequest.getKey(), envelopeSymmetricKey);
        encryptedUploadContext.setNextInitializationVector(symmetricCipher.getIV());
        encryptedUploadContext.setFirstInitializationVector(symmetricCipher.getIV());
        multipartUploadContexts.put(result.getUploadId(), encryptedUploadContext);

        return result;
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
    public UploadPartResult uploadPartSecurely(UploadPartRequest uploadPartRequest)
        throws AmazonClientException, AmazonServiceException {

        appendUserAgent(uploadPartRequest, USER_AGENT);

        boolean isLastPart = uploadPartRequest.isLastPart();
        String uploadId = uploadPartRequest.getUploadId();

        boolean partSizeMultipleOfCipherBlockSize = uploadPartRequest.getPartSize() % JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE == 0;
        if (!isLastPart && !partSizeMultipleOfCipherBlockSize) {
            throw new AmazonClientException("Invalid part size: part sizes for encrypted multipart uploads must be multiples " +
                    "of the cipher block size (" + JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE + ") with the exception of the last part.  " +
                    "Otherwise encryption adds extra padding that will corrupt the final object.");
        }

        // Generate the envelope symmetric key and initialize a cipher to encrypt the object's data
        EncryptedUploadContext encryptedUploadContext = multipartUploadContexts.get(uploadId);
        if (encryptedUploadContext == null) throw new AmazonClientException("No client-side information available on upload ID " + uploadId);

        SecretKey envelopeSymmetricKey = encryptedUploadContext.getEnvelopeEncryptionKey();
        byte[] iv = encryptedUploadContext.getNextInitializationVector();
        CipherFactory cipherFactory = new CipherFactory(envelopeSymmetricKey, Cipher.ENCRYPT_MODE, iv, this.cryptoConfig.getCryptoProvider());

        // Create encrypted input stream
        ByteRangeCapturingInputStream encryptedInputStream = EncryptionUtils.getEncryptedInputStream(uploadPartRequest, cipherFactory);
        uploadPartRequest.setInputStream(encryptedInputStream);

        // The last part of the multipart upload will contain extra padding from the encryption process
        if (uploadPartRequest.isLastPart()) {
            // We only change the size of the last part
            long cryptoContentLength = EncryptionUtils.calculateCryptoContentLength(cipherFactory.createCipher(), uploadPartRequest);
            if (cryptoContentLength > 0) uploadPartRequest.setPartSize(cryptoContentLength);

            if (encryptedUploadContext.hasFinalPartBeenSeen()) {
                throw new AmazonClientException("This part was specified as the last part in a multipart upload, but a previous part was already marked as the last part.  " +
                        "Only the last part of the upload should be marked as the last part, otherwise it will cause the encrypted data to be corrupted.");
            }

            encryptedUploadContext.setHasFinalPartBeenSeen(true);
        }

        // Treat all encryption requests as input stream upload requests, not as file upload requests.
        uploadPartRequest.setFile(null);
        uploadPartRequest.setFileOffset(0);

        UploadPartResult result = s3.uploadPart(uploadPartRequest);
        encryptedUploadContext.setNextInitializationVector(encryptedInputStream.getBlock());
        return result;
    }

    @Override
    public CopyPartResult copyPartSecurely(CopyPartRequest copyPartRequest) {
        String uploadId = copyPartRequest.getUploadId();
        EncryptedUploadContext encryptedUploadContext = multipartUploadContexts.get(uploadId);

        if (!encryptedUploadContext.hasFinalPartBeenSeen()) {
            encryptedUploadContext.setHasFinalPartBeenSeen(true);
        }

        return s3.copyPart(copyPartRequest);
    }

    /*
     * Private helper methods
     */

    /**
     * Puts an encrypted object into S3 and stores encryption info in the object metadata.
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
    private PutObjectResult putObjectUsingMetadata(PutObjectRequest putObjectRequest)
            throws AmazonClientException, AmazonServiceException {
        // Create instruction
        EncryptionInstruction instruction = generateInstruction(this.kekMaterialsProvider, this.cryptoConfig.getCryptoProvider());

        // Encrypt the object data with the instruction
        PutObjectRequest encryptedObjectRequest = encryptRequestUsingInstruction(putObjectRequest, instruction);

        // Update the metadata
        EncryptionUtils.updateMetadataWithEncryptionInstruction( putObjectRequest, instruction );

        // Put the encrypted object into S3
        return s3.putObject(encryptedObjectRequest);
    }

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
        // Create instruction
        EncryptionInstruction instruction = generateInstruction(this.kekMaterialsProvider, this.cryptoConfig.getCryptoProvider());

        // Encrypt the object data with the instruction
        PutObjectRequest encryptedObjectRequest = encryptRequestUsingInstruction(putObjectRequest, instruction);

        // Put the encrypted object into S3
        PutObjectResult encryptedObjectResult = s3.putObject(encryptedObjectRequest);

        // Put the instruction file into S3
        PutObjectRequest instructionRequest = EncryptionUtils.createInstructionPutRequest(putObjectRequest, instruction);
        s3.putObject(instructionRequest);

        // Return the result of the encrypted object PUT.
        return encryptedObjectResult;
    }

    @Override
    protected final long ciphertextLength(long plaintextLength) {
        long cipherBlockSize = contentCryptoScheme.getBlockSizeInBytes();
        long offset = cipherBlockSize - (plaintextLength % cipherBlockSize);
        return plaintextLength + offset;
    }
}
