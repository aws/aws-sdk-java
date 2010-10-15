/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.io.OutputStream;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.services.s3.internal.crypto.EncryptionInstruction;
import com.amazonaws.services.s3.internal.crypto.EncryptionUtils;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.CryptoStorageMode;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.GroupGrantee;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.Permission;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.S3Object;

/**
 * The AmazonS3Encryption class extends the Amazon S3 Client, allowing you to store data securely in S3.
 * <p>
 * The encryption materials specified in the constructor will be used to encrypt and decrypt data.
 */                
public class AmazonS3EncryptionClient extends AmazonS3Client {

    private EncryptionMaterials encryptionMaterials;
    private CryptoConfiguration cryptoConfig;
    
    /** Shared logger for encryption client events */
    private static Log log = LogFactory.getLog(AmazonS3EncryptionClient.class);

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
     *      The encryption materials to be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(EncryptionMaterials encryptionMaterials) {
        this(null, encryptionMaterials, new ClientConfiguration(), new CryptoConfiguration());
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
     *      	  The encryption materials to be used to encrypt and decrypt data.
     * @param cryptoConfig
     * 			  The crypto configuration whose parameters will be used to encrypt and decrypt data.
     */
    public AmazonS3EncryptionClient(EncryptionMaterials encryptionMaterials, CryptoConfiguration cryptoConfig) {
        this(null, encryptionMaterials, new ClientConfiguration(), cryptoConfig);
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
        this(credentials, encryptionMaterials, new ClientConfiguration(), new CryptoConfiguration());
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
    public AmazonS3EncryptionClient(AWSCredentials credentials, EncryptionMaterials encryptionMaterials, CryptoConfiguration cryptoConfig) {
        this(credentials, encryptionMaterials, new ClientConfiguration(), cryptoConfig);
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
        super(credentials, clientConfig);
        assertParameterNotNull(encryptionMaterials, "EncryptionMaterials parameter must not be null.");
        assertParameterNotNull(cryptoConfig, "CryptoConfiguration parameter must not be null.");
        this.encryptionMaterials = encryptionMaterials;
        this.cryptoConfig = cryptoConfig;
    }

    /* (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3#putObject(com.amazonaws.services.s3.model.PutObjectRequest)
     */ 
    @Override
    public PutObjectResult putObject(PutObjectRequest putObjectRequest)
    throws AmazonClientException, AmazonServiceException {
        if(this.cryptoConfig.getStorageMode() == CryptoStorageMode.InstructionFile) {
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
        // Adjust the crypto range to retrieve all of the cipher blocks needed to contain the user's desired
        // range of bytes.
        long[] desiredRange = getObjectRequest.getRange();
        long[] adjustedCryptoRange = EncryptionUtils.getAdjustedCryptoRange(desiredRange);
        if(adjustedCryptoRange != null) {
            getObjectRequest.setRange(adjustedCryptoRange[0], adjustedCryptoRange[1]);
        }
        
        // Get the object from S3
        S3Object retrievedObject = super.getObject(getObjectRequest);
        
        S3Object objectToBeReturned;
        // Check if encryption info is in object metadata
        if(EncryptionUtils.isEncryptionInfoInMetadata(retrievedObject)) {
            objectToBeReturned = decryptObjectUsingMetadata(retrievedObject);
        } else {
            // Check if encrypted info is in an instruction file
            S3Object instructionFile = getInstructionFile(getObjectRequest);
            if(EncryptionUtils.isEncryptionInfoInInstructionFile(instructionFile)) {
                objectToBeReturned = decryptObjectUsingInstructionFile(retrievedObject, instructionFile);
            } else {
                // The object was not encrypted to begin with.  Return the object without decrypting it.
                log.warn(String.format("Unable to detect encryption information for object '%s' in bucket '%s'. " +
                        "Returning object without decryption.", 
                        retrievedObject.getKey(), retrievedObject.getBucketName()));
                objectToBeReturned = retrievedObject;
            }
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
    
    /*
     * (non-Javadoc)
     * @see com.amazonaws.services.s3.AmazonS3Client#deleteObject(com.amazonaws.services.s3.model.DeleteObjectRequest)
     */
    @Override
    public void deleteObject(DeleteObjectRequest deleteObjectRequest) {
        // Delete the object
        super.deleteObject(deleteObjectRequest);
        // If it exists, delete the instruction file.
        DeleteObjectRequest instructionDeleteRequest = EncryptionUtils.createInstructionDeleteObjectRequest(deleteObjectRequest);
        super.deleteObject(instructionDeleteRequest);
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
        putObjectRequest = EncryptionUtils.encryptRequestUsingMetadata(putObjectRequest, this.encryptionMaterials, this.cryptoConfig.getCryptoProvider());
        return super.putObject(putObjectRequest);
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
        EncryptionInstruction instruction = EncryptionUtils.generateInstruction(putObjectRequest, this.encryptionMaterials, this.cryptoConfig.getCryptoProvider());

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
        return EncryptionUtils.decryptObjectUsingMetadata(object, this.encryptionMaterials, this.cryptoConfig.getCryptoProvider());
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
        EncryptionInstruction instruction = EncryptionUtils.buildInstructionFromInstructionFile(instructionFile, this.encryptionMaterials, this.cryptoConfig.getCryptoProvider());        
        
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
}