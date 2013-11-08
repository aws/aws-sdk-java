/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.s3.internal.crypto.ByteRangeCapturingInputStream;
import com.amazonaws.services.s3.internal.crypto.CipherFactory;
import com.amazonaws.services.s3.internal.crypto.EncryptedUploadContext;
import com.amazonaws.services.s3.internal.crypto.EncryptionInstruction;
import com.amazonaws.services.s3.internal.crypto.EncryptionUtils;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.CopyPartRequest;
import com.amazonaws.services.s3.model.CopyPartResult;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoStorageMode;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
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
 * The AmazonS3Encryption class extends the Amazon S3 Client, allowing you to store data securely in S3.
 * <p>
 * The encryption materials specified in the constructor will be used to encrypt and decrypt data.
 */
public class AmazonS3EncryptionClient extends AmazonS3Client {

    private EncryptionMaterialsProvider encryptionMaterialsProvider;
    private CryptoConfiguration cryptoConfig;

    private static final String USER_AGENT = AmazonS3EncryptionClient.class.getName() + "/" + VersionInfoUtils.getVersion();

    /** Shared logger for encryption client events */
    private static Log log = LogFactory.getLog(AmazonS3EncryptionClient.class);

    /** Map of data about in progress encrypted multipart uploads. */
    private Map<String, EncryptedUploadContext> currentMultipartUploadSecretKeys =
        Collections.synchronizedMap(new HashMap<String, EncryptedUploadContext>());


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
    public AmazonS3EncryptionClient(EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this((AWSCredentialsProvider)null, encryptionMaterialsProvider, new ClientConfiguration(), new CryptoConfiguration());
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
     *      	    The encryption materials to be used to encrypt and decrypt data.
     * @param cryptoConfig
     * 			      The crypto configuration whose parameters will be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(EncryptionMaterials encryptionMaterials, CryptoConfiguration cryptoConfig) {
        this(new StaticEncryptionMaterialsProvider(encryptionMaterials), cryptoConfig);
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
    public AmazonS3EncryptionClient(EncryptionMaterialsProvider encryptionMaterialsProvider,
            CryptoConfiguration cryptoConfig) {
        this((AWSCredentialsProvider)null, encryptionMaterialsProvider, new ClientConfiguration(), cryptoConfig);
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
    public AmazonS3EncryptionClient(AWSCredentials credentials, EncryptionMaterials encryptionMaterials) {
        this(credentials, new StaticEncryptionMaterialsProvider(encryptionMaterials));
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
    public AmazonS3EncryptionClient(AWSCredentials credentials, EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this(credentials, encryptionMaterialsProvider, new ClientConfiguration(), new CryptoConfiguration());
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
    public AmazonS3EncryptionClient(AWSCredentialsProvider credentialsProvider, EncryptionMaterialsProvider encryptionMaterialsProvider) {
        this(credentialsProvider, encryptionMaterialsProvider, new ClientConfiguration(), new CryptoConfiguration());
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
    public AmazonS3EncryptionClient(AWSCredentials credentials, EncryptionMaterials encryptionMaterials,
            CryptoConfiguration cryptoConfig) {
        this(credentials, new StaticEncryptionMaterialsProvider(encryptionMaterials), cryptoConfig);
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
            EncryptionMaterialsProvider encryptionMaterialsProvider, CryptoConfiguration cryptoConfig) {
        this(credentials, encryptionMaterialsProvider, new ClientConfiguration(), cryptoConfig);
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
    public AmazonS3EncryptionClient(AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider, CryptoConfiguration cryptoConfig) {
        this(credentialsProvider, encryptionMaterialsProvider, new ClientConfiguration(), cryptoConfig);
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
     * @param clientConfiguration
     *            The client configuration options controlling how this client
     *            connects to Amazon S3 (ex: proxy settings, retry counts, etc).
     * @param cryptoConfig
     *            The crypto configuration whose parameters will be used to encrypt and decrypt data.
     * @throws IllegalArgumentException
     *            If either of the encryption materials or crypto configuration parameters are null.
     */
    public AmazonS3EncryptionClient(AWSCredentials credentials, EncryptionMaterials encryptionMaterials,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        this(credentials, new StaticEncryptionMaterialsProvider(encryptionMaterials), clientConfig, cryptoConfig);
    }


    public AmazonS3EncryptionClient(AWSCredentials credentials,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        super(credentials, clientConfig);
        assertParameterNotNull(encryptionMaterialsProvider,
                               "EncryptionMaterialsProvider parameter must not be null.");
        assertParameterNotNull(cryptoConfig, "CryptoConfiguration parameter must not be null.");
        this.encryptionMaterialsProvider = encryptionMaterialsProvider;
        this.cryptoConfig = cryptoConfig;
    }

    public AmazonS3EncryptionClient(AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider encryptionMaterialsProvider,
            ClientConfiguration clientConfig, CryptoConfiguration cryptoConfig) {
        super(credentialsProvider, clientConfig);
        assertParameterNotNull(encryptionMaterialsProvider,
                               "EncryptionMaterialsProvider parameter must not be null.");
        assertParameterNotNull(cryptoConfig, "CryptoConfiguration parameter must not be null.");
        this.encryptionMaterialsProvider = encryptionMaterialsProvider;
        this.cryptoConfig = cryptoConfig;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#putObject(com.amazonaws.services.s3.model.PutObjectRequest)
     */
    @Override
    public PutObjectResult putObject(PutObjectRequest putObjectRequest)
    throws AmazonClientException, AmazonServiceException {

        appendUserAgent(putObjectRequest, USER_AGENT);

        if (this.cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile) {
            return putObjectUsingInstructionFile(putObjectRequest);
        } else {
            return putObjectUsingMetadata(putObjectRequest);
        }
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObject(com.amazonaws.services.s3.model.GetObjectRequest)
     */
    @Override
    public S3Object getObject(GetObjectRequest getObjectRequest)
    throws AmazonClientException, AmazonServiceException {

        appendUserAgent(getObjectRequest, USER_AGENT);

        // Adjust the crypto range to retrieve all of the cipher blocks needed to contain the user's desired
        // range of bytes.
        long[] desiredRange = getObjectRequest.getRange();
        long[] adjustedCryptoRange = EncryptionUtils.getAdjustedCryptoRange(desiredRange);
        if (adjustedCryptoRange != null) {
            getObjectRequest.setRange(adjustedCryptoRange[0], adjustedCryptoRange[1]);
        }

        // Get the object from S3
        S3Object retrievedObject = super.getObject(getObjectRequest);

        // If the caller has specified constraints, it's possible that super.getObject(...)
        // would return null, so we simply return null as well.
        if (retrievedObject == null) return null;

        S3Object objectToBeReturned;
        try {
            // Check if encryption info is in object metadata
            if (EncryptionUtils.isEncryptionInfoInMetadata(retrievedObject)) {
                objectToBeReturned = decryptObjectUsingMetadata(retrievedObject);
            } else {
                // Check if encrypted info is in an instruction file
                S3Object instructionFile = null;
                try {
                    instructionFile = getInstructionFile(getObjectRequest);
                    if (EncryptionUtils.isEncryptionInfoInInstructionFile(instructionFile)) {
                        objectToBeReturned = decryptObjectUsingInstructionFile(retrievedObject, instructionFile);
                    } else {
                        // The object was not encrypted to begin with.  Return the object without decrypting it.
                        log.warn(String.format("Unable to detect encryption information for object '%s' in bucket '%s'. " +
                                "Returning object without decryption.",
                                retrievedObject.getKey(), retrievedObject.getBucketName()));
                        objectToBeReturned = retrievedObject;
                    }
                } finally {
                    if (instructionFile != null) {
                        try { instructionFile.getObjectContent().close();} catch (Exception e) {}
                    }
                }
            }
        } catch (AmazonClientException ace) {
            // If we're unable to set up the decryption, make sure we close the HTTP connection
            try {retrievedObject.getObjectContent().close();} catch (Exception e) {}
            throw ace;
        }

        // Adjust the output to the desired range of bytes.
        return EncryptionUtils.adjustOutputToDesiredRange(objectToBeReturned, desiredRange);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#getObject(com.amazonaws.services.s3.model.GetObjectRequest, java.io.File)
     */
    @Override
    public ObjectMetadata getObject(GetObjectRequest getObjectRequest, File destinationFile)
    throws AmazonClientException, AmazonServiceException {

        assertParameterNotNull(destinationFile,
        "The destination file parameter must be specified when downloading an object directly to a file");

        S3Object s3Object = getObject(getObjectRequest);
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
            try {outputStream.close();} catch (Exception e) {}
            try {s3Object.getObjectContent().close();} catch (Exception e) {}
        }

        /*
         * Unlike the standard Amazon S3 Client, the Amazon S3 Encryption Client does not do an MD5 check
         * here because the contents stored in S3 and the contents we just retrieved are different.  In
         * S3, the stored contents are encrypted, and locally, the retrieved contents are decrypted.
         */

        return s3Object.getObjectMetadata();
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3Client#deleteObject(com.amazonaws.services.s3.model.DeleteObjectRequest)
     */
    @Override
    public void deleteObject(DeleteObjectRequest deleteObjectRequest) {

        appendUserAgent(deleteObjectRequest, USER_AGENT);

        // Delete the object
        super.deleteObject(deleteObjectRequest);
        // If it exists, delete the instruction file.
        DeleteObjectRequest instructionDeleteRequest = EncryptionUtils.createInstructionDeleteObjectRequest(deleteObjectRequest);
        super.deleteObject(instructionDeleteRequest);
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3Client#completeMultipartUpload(com.amazonaws.services.s3.model.CompleteMultipartUploadRequest)
     */
    @Override
    public CompleteMultipartUploadResult completeMultipartUpload(
            CompleteMultipartUploadRequest completeMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {

        appendUserAgent(completeMultipartUploadRequest, USER_AGENT);

        String uploadId = completeMultipartUploadRequest.getUploadId();
        EncryptedUploadContext encryptedUploadContext = currentMultipartUploadSecretKeys.get(uploadId);

        if (encryptedUploadContext.hasFinalPartBeenSeen() == false) {
            throw new AmazonClientException("Unable to complete an encrypted multipart upload without being told which part was the last.  " +
                    "Without knowing which part was the last, the encrypted data in Amazon S3 is incomplete and corrupt.");
        }

        CompleteMultipartUploadResult result = super.completeMultipartUpload(completeMultipartUploadRequest);

        // In InstructionFile mode, we want to write the instruction file only after the whole upload has completed correctly.
        if (cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile) {
            Cipher symmetricCipher = EncryptionUtils.createSymmetricCipher(
                    encryptedUploadContext.getEnvelopeEncryptionKey(),
                    Cipher.ENCRYPT_MODE, cryptoConfig.getCryptoProvider(),
                    encryptedUploadContext.getFirstInitializationVector());

            EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials();

            // Encrypt the envelope symmetric key
            byte[] encryptedEnvelopeSymmetricKey = EncryptionUtils.getEncryptedSymmetricKey(encryptedUploadContext.getEnvelopeEncryptionKey(), encryptionMaterials, cryptoConfig.getCryptoProvider());
            EncryptionInstruction instruction = new EncryptionInstruction(encryptionMaterials.getMaterialsDescription(), encryptedEnvelopeSymmetricKey, encryptedUploadContext.getEnvelopeEncryptionKey(), symmetricCipher);

            // Put the instruction file into S3
            super.putObject(EncryptionUtils.createInstructionPutRequest(encryptedUploadContext.getBucketName(), encryptedUploadContext.getKey(), instruction));
        }

        currentMultipartUploadSecretKeys.remove(uploadId);
        return result;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3Client#initiateMultipartUpload(com.amazonaws.services.s3.model.InitiateMultipartUploadRequest)
     */
    @Override
    public InitiateMultipartUploadResult initiateMultipartUpload(
            InitiateMultipartUploadRequest initiateMultipartUploadRequest)
            throws AmazonClientException, AmazonServiceException {

        appendUserAgent(initiateMultipartUploadRequest, USER_AGENT);

        // Generate a one-time use symmetric key and initialize a cipher to encrypt object data
        SecretKey envelopeSymmetricKey = EncryptionUtils.generateOneTimeUseSymmetricKey();
        Cipher symmetricCipher = EncryptionUtils.createSymmetricCipher(envelopeSymmetricKey, Cipher.ENCRYPT_MODE, cryptoConfig.getCryptoProvider(), null);

        if (cryptoConfig.getStorageMode() == CryptoStorageMode.ObjectMetadata) {
      EncryptionMaterials encryptionMaterials = encryptionMaterialsProvider.getEncryptionMaterials();
            // Encrypt the envelope symmetric key
            byte[] encryptedEnvelopeSymmetricKey = EncryptionUtils.getEncryptedSymmetricKey(envelopeSymmetricKey, encryptionMaterials, cryptoConfig.getCryptoProvider());

            // Store encryption info in metadata
            ObjectMetadata metadata = EncryptionUtils.updateMetadataWithEncryptionInfo(initiateMultipartUploadRequest, encryptedEnvelopeSymmetricKey, symmetricCipher, encryptionMaterials.getMaterialsDescription());

            // Update the request's metadata to the updated metadata
            initiateMultipartUploadRequest.setObjectMetadata(metadata);
        }

        InitiateMultipartUploadResult result = super.initiateMultipartUpload(initiateMultipartUploadRequest);
        EncryptedUploadContext encryptedUploadContext = new EncryptedUploadContext(initiateMultipartUploadRequest.getBucketName(), initiateMultipartUploadRequest.getKey(), envelopeSymmetricKey);
        encryptedUploadContext.setNextInitializationVector(symmetricCipher.getIV());
        encryptedUploadContext.setFirstInitializationVector(symmetricCipher.getIV());
        currentMultipartUploadSecretKeys.put(result.getUploadId(), encryptedUploadContext);

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
    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest)
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
        EncryptedUploadContext encryptedUploadContext = currentMultipartUploadSecretKeys.get(uploadId);
        if (encryptedUploadContext == null) throw new AmazonClientException("No client-side information available on upload ID " + uploadId);

        SecretKey envelopeSymmetricKey = encryptedUploadContext.getEnvelopeEncryptionKey();
        byte[] iv = encryptedUploadContext.getNextInitializationVector();
        CipherFactory cipherFactory = new CipherFactory(envelopeSymmetricKey, Cipher.ENCRYPT_MODE, iv, this.cryptoConfig.getCryptoProvider());

        // Create encrypted input stream
        InputStream encryptedInputStream = EncryptionUtils.getEncryptedInputStream(uploadPartRequest, cipherFactory);
        uploadPartRequest.setInputStream(encryptedInputStream);

        // The last part of the multipart upload will contain extra padding from the encryption process, which
        // changes the
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

        UploadPartResult result = super.uploadPart(uploadPartRequest);

        if (encryptedInputStream instanceof ByteRangeCapturingInputStream) {
            ByteRangeCapturingInputStream bris = (ByteRangeCapturingInputStream)encryptedInputStream;
            encryptedUploadContext.setNextInitializationVector(bris.getBlock());
        } else {
            throw new AmazonClientException("Unable to access last block of encrypted data");
        }

        return result;
    }

    @Override
     public CopyPartResult copyPart(CopyPartRequest copyPartRequest) {
        String uploadId = copyPartRequest.getUploadId();
        EncryptedUploadContext encryptedUploadContext = currentMultipartUploadSecretKeys.get(uploadId);

        if (!encryptedUploadContext.hasFinalPartBeenSeen()) {
            encryptedUploadContext.setHasFinalPartBeenSeen(true);
        }

        return super.copyPart(copyPartRequest);
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
        EncryptionInstruction instruction = EncryptionUtils.generateInstruction(this.encryptionMaterialsProvider, this.cryptoConfig.getCryptoProvider());

        // Encrypt the object data with the instruction
        PutObjectRequest encryptedObjectRequest = EncryptionUtils.encryptRequestUsingInstruction(putObjectRequest, instruction);

        // Update the metadata
        EncryptionUtils.updateMetadataWithEncryptionInstruction( putObjectRequest, instruction );

        // Put the encrypted object into S3
        return super.putObject(encryptedObjectRequest);
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
        EncryptionInstruction instruction = EncryptionUtils.generateInstruction(this.encryptionMaterialsProvider, this.cryptoConfig.getCryptoProvider());

        // Encrypt the object data with the instruction
        PutObjectRequest encryptedObjectRequest = EncryptionUtils.encryptRequestUsingInstruction(putObjectRequest, instruction);

        // Put the encrypted object into S3
        PutObjectResult encryptedObjectResult = super.putObject(encryptedObjectRequest);

        // Put the instruction file into S3
        PutObjectRequest instructionRequest = EncryptionUtils.createInstructionPutRequest(putObjectRequest, instruction);
        super.putObject(instructionRequest);

        // Return the result of the encrypted object PUT.
        return encryptedObjectResult;
    }

    /**
     * Decrypts an object using information retrieved from metadata.  If decryption is not possible, returns null.
     *
     * @param object
     *      The S3Object to be decrypted.
     * @return
     *      An S3Object with decrypted object contents.  If decryption is not possible, returns null.
     */
    private S3Object decryptObjectUsingMetadata(S3Object object) {
        // Create an instruction object from the object headers
        EncryptionInstruction instruction = EncryptionUtils.buildInstructionFromObjectMetadata( object, this.encryptionMaterialsProvider, this.cryptoConfig.getCryptoProvider() );

        // Decrypt the object file with the instruction
        return EncryptionUtils.decryptObjectUsingInstruction(object, instruction);
    }

    /**
     * Decrypts an object using information retrieved from an instruction file.
     *
     * @param object
     *      The S3Object to be decrypted.
     * @param instructionFile
     *      The S3Object instruction file to be used to decrypt the object.
     * @return
     *      An S3Object with decrypted object contents.
     */
    private S3Object decryptObjectUsingInstructionFile(S3Object object, S3Object instructionFile) {
        // Create an instruction object from the retrieved instruction file
        EncryptionInstruction instruction = EncryptionUtils.buildInstructionFromInstructionFile(instructionFile, this.encryptionMaterialsProvider, this.cryptoConfig.getCryptoProvider());

        // Decrypt the object file with the instruction
        return EncryptionUtils.decryptObjectUsingInstruction(object, instruction);
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
    private S3Object getInstructionFile(GetObjectRequest getObjectRequest) {
        try {
            GetObjectRequest instructionFileRequest = EncryptionUtils.createInstructionGetRequest(getObjectRequest);
            return super.getObject(instructionFileRequest);
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

    public <X extends AmazonWebServiceRequest> X appendUserAgent(X request, String userAgent) {
        request.getRequestClientOptions().appendUserAgent(userAgent);
        return request;
    }

}
