/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.InputSubstream;
import com.amazonaws.services.s3.internal.Mimetypes;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.model.DeleteObjectRequest;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsAccessor;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.util.json.JSONException;
import com.amazonaws.util.json.JSONObject;

/**
 * The EncryptionUtils class encrypts and decrypts data stored in S3.  It can be used to prepare
 * requests for encryption before they are stored in S3 and to decrypt objects that are retrieved from S3.
 */
public class EncryptionUtils {

    /** Suffix appended to the end of instruction file names */
    private static final String INSTRUCTION_SUFFIX = ".instruction";

    /**
     * Returns an updated request where the metadata contains encryption information and the input stream contains
     * the encrypted object contents.  The specified encryption materials will be used to encrypt and decrypt data.
     *
     * @param request
     *      The request whose contents are to be encrypted.
     * @param materials
     *      The encryption materials to be used to encrypt and decrypt data.
     * @param cryptoProvider
     *      The crypto provider whose encryption implementation will be used to encrypt data
     * @return
     *      The updated request where the metadata is set up for encryption and input stream contains
     *      the encrypted contents.
     *
     * @deprecated use generateInstruction, encryptRequestUsingInstruction, and updateMetadataWithEncryptionInfo instead
     */
    @Deprecated
    public static PutObjectRequest encryptRequestUsingMetadata(PutObjectRequest request, EncryptionMaterials materials, Provider cryptoProvider) {
        // Create instruction
        EncryptionInstruction instruction = EncryptionUtils.generateInstruction(materials, cryptoProvider);

        // Encrypt the object data with the instruction
        PutObjectRequest encryptedObjectRequest = EncryptionUtils.encryptRequestUsingInstruction(request, instruction);

        // Update the metadata
        EncryptionUtils.updateMetadataWithEncryptionInstruction( request, instruction );

        return encryptedObjectRequest;
    }

    /**
     * Returns an updated object where the object content input stream contains the decrypted contents.
     *
     * @param object
     *      The object whose contents are to be decrypted.
     * @param materials
     *      The encryption materials to be used to encrypt and decrypt data.
     * @param cryptoProvider
     *      The crypto provider whose encryption implementation will be used to decrypt data
     * @return
     *      The updated object where the object content input stream contains the decrypted contents.
     *
     * @deprecated use buildInstructionFromObjectMetadata and decryptObjectUsingInstruction instead.
     */
    @Deprecated
    public static S3Object decryptObjectUsingMetadata(S3Object object, EncryptionMaterials materials, Provider cryptoProvider) {
        // Create an instruction object from the object headers
        EncryptionInstruction instruction = EncryptionUtils.buildInstructionFromObjectMetadata( object, materials, cryptoProvider );

        // Decrypt the object file with the instruction
        return EncryptionUtils.decryptObjectUsingInstruction(object, instruction);
    }

    /**
     * Generates an instruction that will be used to encrypt an object.
     *
     * @param materials
     *      The encryption materials to be used to encrypt and decrypt data.
     * @param cryptoProvider
     *      The crypto provider whose encryption implementation will be used to encrypt and decrypt data.
     * @return
     *      The instruction that will be used to encrypt an object.
     */
    public static EncryptionInstruction generateInstruction(EncryptionMaterials materials, Provider cryptoProvider) {
        // Generate a one-time use symmetric key and initialize a cipher to encrypt object data
        SecretKey envelopeSymmetricKey = generateOneTimeUseSymmetricKey();
        Cipher symmetricCipher = createSymmetricCipher(envelopeSymmetricKey, Cipher.ENCRYPT_MODE, cryptoProvider, null);

        // Encrypt the envelope symmetric key
        byte[] encryptedEnvelopeSymmetricKey = getEncryptedSymmetricKey(envelopeSymmetricKey, materials, cryptoProvider);

        // Return a new instruction with the appropriate fields.
        return new EncryptionInstruction(materials.getMaterialsDescription(), encryptedEnvelopeSymmetricKey, envelopeSymmetricKey, symmetricCipher);
    }

    /**
     * Builds an instruction object from the contents of an instruction file.
     *
     * @param instructionFile
     *      A non-null instruction file retrieved from S3 that contains encryption information
     * @param materials
     *      The non-null encryption materials to be used to encrypt and decrypt data.
     * @param cryptoProvider
     *      The crypto provider whose encryption implementation will be used to encrypt and decrypt data.  Null is ok and uses the
     *      preferred provider from Security.getProviders().
     * @return
     *      A non-null instruction object containing encryption information
     */
    public static EncryptionInstruction buildInstructionFromInstructionFile(S3Object instructionFile, EncryptionMaterials materials, Provider cryptoProvider) {
        JSONObject instructionJSON = parseJSONInstruction(instructionFile);
        try {
            // Get fields from instruction object
            byte[] encryptedSymmetricKeyBytes = instructionJSON.getString(Headers.CRYPTO_KEY).getBytes();
            byte[] initVectorBytes = instructionJSON.getString(Headers.CRYPTO_IV).getBytes();
            String materialsDescriptionString = instructionJSON.getString(Headers.MATERIALS_DESCRIPTION);
            Map<String, String> materialsDescription = convertJSONToMap(materialsDescriptionString);

            // Decode from Base 64 to standard binary bytes
            encryptedSymmetricKeyBytes = Base64.decodeBase64(encryptedSymmetricKeyBytes);
            initVectorBytes = Base64.decodeBase64(initVectorBytes);

            if (encryptedSymmetricKeyBytes == null || initVectorBytes == null || materialsDescription == null) {
                // If necessary encryption info was not found in the instruction file, throw an exception.
                throw new AmazonClientException(
                        String.format("Necessary encryption info not found in the instruction file '%s' in bucket '%s'",
                                      instructionFile.getKey(), instructionFile.getBucketName()));
            }

            // If the original encryption materials that encrypted the object are not the same as the current
            // encryption materials, then try to retrieve the original encryption materials.
            if (!materialsDescription.equals(materials.getMaterialsDescription())) {
                materials = retrieveOriginalMaterials(materialsDescription, materials.getAccessor());
                // If we're unable to retrieve the original encryption materials, we can't decrypt the object, so
                // throw an exception.
                if (materials == null) {
                    throw new AmazonClientException(
                            String.format("Unable to retrieve the encryption materials that originally " +
                                    "encrypted object corresponding to instruction file '%s' in bucket '%s'.",
                                    instructionFile.getKey(), instructionFile.getBucketName()));
                }
            }

            // Decrypt the symmetric key and create the symmetric cipher
            SecretKey symmetricKey = getDecryptedSymmetricKey(encryptedSymmetricKeyBytes, materials, cryptoProvider);
            Cipher cipher = createSymmetricCipher(symmetricKey, Cipher.DECRYPT_MODE, cryptoProvider, initVectorBytes);

            return new EncryptionInstruction(materialsDescription, encryptedSymmetricKeyBytes, symmetricKey, cipher);
        } catch (JSONException e) {
            throw new AmazonClientException("Unable to parse retrieved instruction file : " + e.getMessage());
        }
    }

    /**
     * Builds an instruction object from the object metadata.
     *
     * @param object
     *      A non-null object that contains encryption information in its headers
     * @param materials
     *      The non-null encryption materials to be used to encrypt and decrypt data.
     * @param cryptoProvider
     *      The crypto provider whose encryption implementation will be used to encrypt and decrypt data.  Null is ok and uses the
     *      preferred provider from Security.getProviders().
     * @return
     *      A non-null instruction object containing encryption information
     *
     * @throws AmazonClientException
     *      if encryption information is missing in the metadata, or the encryption
     *      materials used to encrypt the object are not available via the materials Accessor
     */
    public static EncryptionInstruction buildInstructionFromObjectMetadata(S3Object object, EncryptionMaterials materials, Provider cryptoProvider) {
        ObjectMetadata metadata = object.getObjectMetadata();

        // Get encryption info from metadata.
        byte[] encryptedSymmetricKeyBytes = getCryptoBytesFromMetadata(Headers.CRYPTO_KEY, metadata);
        byte[] initVectorBytes = getCryptoBytesFromMetadata(Headers.CRYPTO_IV, metadata);
        String materialsDescriptionString = getStringFromMetadata(Headers.MATERIALS_DESCRIPTION, metadata);
        Map<String, String> materialsDescription = convertJSONToMap(materialsDescriptionString);

        if (encryptedSymmetricKeyBytes == null || initVectorBytes == null || materialsDescription == null) {
            // If necessary encryption info was not found in the instruction file, throw an exception.
            throw new AmazonClientException(
                    String.format("Necessary encryption info not found in the headers of file '%s' in bucket '%s'",
                                  object.getKey(), object.getBucketName()));
        }

        // If the original encryption materials that encrypted the object are not the same as the current
        // encryption materials, then try to retrieve the original encryption materials.
        if (!materialsDescription.equals(materials.getMaterialsDescription())) {
            materials = retrieveOriginalMaterials(materialsDescription, materials.getAccessor());
            // If we're unable to retrieve the original encryption materials, we can't decrypt the object, so
            // throw an exception.
            if (materials == null) {
                throw new AmazonClientException(
                        String.format("Unable to retrieve the encryption materials that originally " +
                                "encrypted file '%s' in bucket '%s'.",
                                object.getKey(), object.getBucketName()));
            }
        }

        // Decrypt the symmetric key and create the symmetric cipher
        SecretKey symmetricKey = getDecryptedSymmetricKey(encryptedSymmetricKeyBytes, materials, cryptoProvider);
        Cipher cipher = createSymmetricCipher(symmetricKey, Cipher.DECRYPT_MODE, cryptoProvider, initVectorBytes);

        return new EncryptionInstruction(materialsDescription, encryptedSymmetricKeyBytes, symmetricKey, cipher);
    }

    /**
     * Returns an updated request where the input stream contains the encrypted object contents.
     * The specified instruction will be used to encrypt data.
     *
     * @param request
     *      The request whose contents are to be encrypted.
     * @param instruction
     *      The instruction that will be used to encrypt the object data.
     * @return
     *      The updated request where the input stream contains the encrypted contents.
     */
    public static PutObjectRequest encryptRequestUsingInstruction(PutObjectRequest request, EncryptionInstruction instruction) {
        // Use the symmetric cipher from the instruction to encrypt the object.
        Cipher symmetricCipher = instruction.getSymmetricCipher();

        // Create a new metadata object if there is no metadata already.
        ObjectMetadata metadata = request.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
        }

        // Record the original Content MD5, if present, for the unencrypted data
        if (metadata.getContentMD5() != null) {
            metadata.addUserMetadata(Headers.UNENCRYPTED_CONTENT_MD5, metadata.getContentMD5());
        }

        // Record the original, unencrypted content-length so it can be accessed later
        long originalContentLength = getUnencryptedContentLength(request, metadata);
        if (originalContentLength >= 0) metadata.addUserMetadata(
                Headers.UNENCRYPTED_CONTENT_LENGTH, Long.toString(originalContentLength));

        // Put the calculated length of the encrypted contents in the metadata
        long cryptoContentLength = calculateCryptoContentLength(instruction.getSymmetricCipher(), request, metadata);
        if (cryptoContentLength >= 0) metadata.setContentLength(cryptoContentLength);

        request.setMetadata(metadata);

        // Create encrypted input stream
        InputStream encryptedInputStream = getEncryptedInputStream(request, symmetricCipher);
        request.setInputStream(encryptedInputStream);

        // Treat all encryption requests as input stream upload requests, not as file upload requests.
        request.setFile(null);

        return request;
    }

    /**
     * Returns an updated object where the object content input stream contains the decrypted contents.
     *
     * @param object
     *      The object whose contents are to be decrypted.
     * @param instruction
     *      The instruction that will be used to decrypt the object data.
     * @return
     *      The updated object where the object content input stream contains the decrypted contents.
     */
    public static S3Object decryptObjectUsingInstruction(S3Object object, EncryptionInstruction instruction) {
        S3ObjectInputStream objectContent = object.getObjectContent();
        InputStream decryptedInputStream = new CipherInputStream(objectContent, instruction.getSymmetricCipher());
        object.setObjectContent(new S3ObjectInputStream(decryptedInputStream, objectContent.getHttpRequest()));
        return object;
    }

    /**
     * Creates a put request to store the specified instruction object in S3.
     *
     * @param request
     *      The put request for the original object to be stored in S3.
     * @param instruction
     *      The instruction object to be stored in S3.
     * @return
     *      A put request to store the specified instruction object in S3.
     */
    public static PutObjectRequest createInstructionPutRequest(PutObjectRequest request, EncryptionInstruction instruction) {
        JSONObject instructionJSON = convertInstructionToJSONObject(instruction);
        byte[] instructionBytes = instructionJSON.toString().getBytes();
        InputStream instructionInputStream = new ByteArrayInputStream(instructionBytes);

        ObjectMetadata metadata = request.getMetadata();

        // Set the content-length of the upload
        metadata.setContentLength(instructionBytes.length);

        // Set the crypto instruction file header
        metadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");

        // Update the instruction request
        request.setKey(request.getKey() + INSTRUCTION_SUFFIX);
        request.setMetadata(metadata);
        request.setInputStream(instructionInputStream);

        return request;
    }

    public static PutObjectRequest createInstructionPutRequest(String bucketName, String key, EncryptionInstruction instruction) {
        JSONObject instructionJSON = convertInstructionToJSONObject(instruction);
        byte[] instructionBytes = instructionJSON.toString().getBytes();
        InputStream instructionInputStream = new ByteArrayInputStream(instructionBytes);

        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(instructionBytes.length);
        metadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");

		return new PutObjectRequest(bucketName, key + INSTRUCTION_SUFFIX, instructionInputStream, metadata);
    }

    /**
     * Creates a get request to retrieve an instruction file from S3.
     *
     * @param request
     *      The get request for the original object to be retrieved from S3.
     * @return
     *      A get request to retrieve an instruction file from S3.
     */
    public static GetObjectRequest createInstructionGetRequest(GetObjectRequest request) {
        return new GetObjectRequest(request.getBucketName(), request.getKey() + INSTRUCTION_SUFFIX, request.getVersionId());
    }

    /**
     * Creates a delete request to delete an instruction file in S3.
     *
     * @param request
     *      The delete request for the original object to be deleted from S3.
     * @return
     *      A delete request to delete an instruction file in S3.
     */
    public static DeleteObjectRequest createInstructionDeleteObjectRequest(DeleteObjectRequest request) {
        return new DeleteObjectRequest(request.getBucketName(), request.getKey() + INSTRUCTION_SUFFIX);
    }

    /**
     * Returns true if the specified S3Object contains encryption info in its
     * metadata, false otherwise.
     *
     * @param retrievedObject
     *      An S3Object
     * @return
     *      True if the specified S3Object contains encryption info in its
     *      metadata, false otherwise.
     */
    public static boolean isEncryptionInfoInMetadata(S3Object retrievedObject) {
        Map<String, String> metadata = retrievedObject.getObjectMetadata().getUserMetadata();
        if (metadata == null) {
            return false;
        }
        return (metadata.containsKey(Headers.CRYPTO_IV) &&
                metadata.containsKey(Headers.CRYPTO_KEY) &&
                metadata.containsKey(Headers.MATERIALS_DESCRIPTION));
    }

    /**
     * Returns true if the specified S3Object is an instruction file containing
     * encryption info, false otherwise.
     *
     * @param instructionFile
     *      An S3Object that may potentially be an instruction file
     * @return
     *      True if the specified S3Object is an instruction file containing
     *      encryption info, false otherwise.
     */
    public static boolean isEncryptionInfoInInstructionFile(S3Object instructionFile) {
        if (instructionFile == null) {
            return false;
        }
        Map<String, String> metadata = instructionFile.getObjectMetadata().getUserMetadata();
        if (metadata == null) {
            return false;
        }
        return metadata.containsKey(Headers.CRYPTO_INSTRUCTION_FILE);
    }

    /**
     * Adjusts a user specified range to retrieve all of the cipher blocks (each of size 16 bytes) that
     * contain the specified range.
     *
     * For Chained Block Cipher decryption to function properly, we need to retrieve the cipher block that precedes
     * the range, all of the cipher blocks that contain the range, and the cipher block that follows the range.
     *
     * @param range
     *      A two-element array of longs corresponding to the start and finish (inclusive) of a desired
     *      range of bytes.
     * @return
     *      A two-element array of longs corresponding to the start and finish of the cipher blocks to
     *      be retrieved.  If the range is invalid, then return null.
     */
    public static long[] getAdjustedCryptoRange(long[] range) {
        // If range is invalid, then return null.
        if (range == null || range[0] > range[1]) {
            return null;
        }
        long[] adjustedCryptoRange = new long[2];
        adjustedCryptoRange[0] = getCipherBlockLowerBound(range[0]);
        adjustedCryptoRange[1] = getCipherBlockUpperBound(range[1]);
        return adjustedCryptoRange;
    }

    /**
     * Adjusts the retrieved S3Object so that the object contents contain only the range of bytes
     * desired by the user.  Since encrypted contents can only be retrieved in CIPHER_BLOCK_SIZE
     * (16 bytes) chunks, the S3Object potentially contains more bytes than desired, so this method
     * adjusts the contents range.
     *
     * @param object
     *      The S3Object retrieved from S3 that could possibly contain more bytes than desired
     *      by the user.
     * @param range
     *      A two-element array of longs corresponding to the start and finish (inclusive) of a desired
     *      range of bytes.
     * @return
     *      The S3Object with adjusted object contents containing only the range desired by the user.
     *      If the range specified is invalid, then the S3Object is returned without any modifications.
     */
    public static S3Object adjustOutputToDesiredRange(S3Object object, long[] range) {
        if (range == null || range[0] > range[1]) {
            // Make no modifications if range is invalid.
            return object;
        } else {
            try {
                S3ObjectInputStream objectContent = object.getObjectContent();
                InputStream adjustedRangeContents = new AdjustedRangeInputStream(objectContent, range[0], range[1]);
                object.setObjectContent(new S3ObjectInputStream(adjustedRangeContents, objectContent.getHttpRequest()));
                return object;
            } catch (IOException e) {
                throw new AmazonClientException("Error adjusting output to desired byte range: " + e.getMessage());
            }
        }
    }

    /**
     * Generates a one-time use Symmetric Key on-the-fly for use in envelope encryption.
     */
    public static SecretKey generateOneTimeUseSymmetricKey() {
        KeyGenerator generator;
        try {
            generator = KeyGenerator.getInstance(JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
            generator.init(JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, new SecureRandom());
            return generator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new AmazonClientException("Unable to generate envelope symmetric key:" + e.getMessage(), e);
        }
    }

    /**
     * Creates a symmetric cipher in the specified mode from the given symmetric key and IV.  The given
     * crypto provider will provide the encryption implementation.  If the crypto provider is null, then
     * the default JCE crypto provider will be used.
     */
    public static Cipher createSymmetricCipher(SecretKey symmetricCryptoKey, int encryptMode, Provider cryptoProvider, byte[] initVector) {
        try {
            Cipher cipher;
            if (cryptoProvider != null) {
                cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD, cryptoProvider);
            } else {
                cipher = Cipher.getInstance(JceEncryptionConstants.SYMMETRIC_CIPHER_METHOD);
            }
            if (initVector != null) {
                cipher.init(encryptMode, symmetricCryptoKey, new IvParameterSpec(initVector));
            } else {
                cipher.init(encryptMode, symmetricCryptoKey);
            }
            return cipher;
        } catch (Exception e) {
            throw new AmazonClientException("Unable to build cipher with the provided algorithm and padding: " + e.getMessage(), e);
        }
    }

    /**
     * Encrypts a symmetric key using the provided encryption materials and returns
     * it in raw byte array form.
     */
    public static byte[] getEncryptedSymmetricKey(SecretKey toBeEncrypted, EncryptionMaterials materials, Provider cryptoProvider) {
        Key keyToDoEncryption;
        if (materials.getKeyPair() != null) {
            // Do envelope encryption with public key from key pair
            keyToDoEncryption = materials.getKeyPair().getPublic();
        } else {
            // Do envelope encryption with symmetric key
            keyToDoEncryption= materials.getSymmetricKey();
        }
        try {
            Cipher cipher;
            byte[] toBeEncryptedBytes = toBeEncrypted.getEncoded();
            if (cryptoProvider != null) {
                cipher = Cipher.getInstance(keyToDoEncryption.getAlgorithm(), cryptoProvider);
            } else {
                cipher = Cipher.getInstance(keyToDoEncryption.getAlgorithm()); // Use default JCE Provider
            }
            cipher.init(Cipher.ENCRYPT_MODE, keyToDoEncryption);
            return cipher.doFinal(toBeEncryptedBytes);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to encrypt symmetric key: " + e.getMessage(), e);
        }
    }

    /**
     * Decrypts an encrypted symmetric key using the provided encryption materials and returns
     * it as a SecretKey object.
     */
    private static SecretKey getDecryptedSymmetricKey(byte[] encryptedSymmetricKeyBytes, EncryptionMaterials materials,	Provider cryptoProvider) {
        Key keyToDoDecryption;
        if (materials.getKeyPair() != null) {
            // Do envelope decryption with private key from key pair
            keyToDoDecryption = materials.getKeyPair().getPrivate();
        } else {
            // Do envelope decryption with symmetric key
            keyToDoDecryption = materials.getSymmetricKey();
        }
        try {
            Cipher cipher;
            if (cryptoProvider != null) {
                cipher = Cipher.getInstance(keyToDoDecryption.getAlgorithm(), cryptoProvider);
            } else {
                cipher = Cipher.getInstance(keyToDoDecryption.getAlgorithm());
            }
            cipher.init(Cipher.DECRYPT_MODE, keyToDoDecryption);
            byte[] decryptedSymmetricKeyBytes = cipher.doFinal(encryptedSymmetricKeyBytes);
            return new SecretKeySpec(decryptedSymmetricKeyBytes, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to decrypt symmetric key from object metadata : " + e.getMessage(), e);
        }
    }

    /**
     * Returns an input stream encrypted with the given symmetric cipher.
     */
    private static InputStream getEncryptedInputStream(PutObjectRequest request, Cipher symmetricCipher) {
        try {
            InputStream originalInputStream = request.getInputStream();
            if (request.getFile() != null) {
                originalInputStream = new RepeatableFileInputStream(request.getFile());
            }
            return new CipherInputStream(originalInputStream, symmetricCipher);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to create cipher input stream: " + e.getMessage(), e);
        }
    }

    public static InputStream getEncryptedInputStream(UploadPartRequest request, Cipher symmetricCipher) {
    	try {
    		InputStream originalInputStream = request.getInputStream();
    		if (request.getFile() != null) {
                originalInputStream = new InputSubstream(new RepeatableFileInputStream(request.getFile()),
                        request.getFileOffset(), request.getPartSize(), request.isLastPart());
    		}

    		originalInputStream = new CipherInputStream(originalInputStream, symmetricCipher);

    		if (request.isLastPart() == false) {
    			// We want to prevent the final padding from being sent on the stream...
    			originalInputStream = new InputSubstream(originalInputStream, 0, request.getPartSize(), false);
    		}

    		long partSize = request.getPartSize();
    		int cipherBlockSize = symmetricCipher.getBlockSize();
    		return new ByteRangeCapturingInputStream(originalInputStream, partSize - cipherBlockSize, partSize);
    	} catch (Exception e) {
    		throw new AmazonClientException("Unable to create cipher input stream: " + e.getMessage(), e);
    	}
    }

    /**
     * Retrieves the byte[] value of either the crypto key or crypto IV.  If these fields are not found in
     * the metadata, returns null.
     *
     * Note: The bytes are transported in Base64-encoding, so they are decoded before they are returned.
     */
    private static byte[] getCryptoBytesFromMetadata(String headerName, ObjectMetadata metadata) throws NullPointerException {
        Map<String, String> userMetadata = metadata.getUserMetadata();
        if (userMetadata == null || !userMetadata.containsKey(headerName)) {
            return null;
        } else {
            byte[] valueBytes = userMetadata.get(headerName).getBytes();
            // Convert Base64 bytes to binary data.
            return Base64.decodeBase64(valueBytes);
        }
    }

    /**
     * Retrieves the String value of the given header from the metadata.  Returns null if the field is not
     * found in the metadata.
     */
    private static String getStringFromMetadata(String headerName, ObjectMetadata metadata) throws NullPointerException {
        Map<String, String> userMetadata = metadata.getUserMetadata();
        if (userMetadata == null || !userMetadata.containsKey(headerName)) {
            return null;
        } else {
            return userMetadata.get(headerName);
        }
    }

    /**
     * Converts the JSON encoded materials description to a Map<String, String>
     */
    @SuppressWarnings("unchecked") // Suppresses Iterator<String> type warning
    private static Map<String, String> convertJSONToMap(String descriptionJSONString) {
        if (descriptionJSONString == null) {
            return null;
        }
        try {
            JSONObject descriptionJSON = new JSONObject(descriptionJSONString);
            Iterator<String> keysIterator = descriptionJSON.keys();
            Map<String, String> materialsDescription = new HashMap<String, String>();
            while(keysIterator.hasNext()) {
                String key = keysIterator.next();
                materialsDescription.put(key, descriptionJSON.getString(key));
            }
            return materialsDescription;
        } catch (JSONException e) {
            throw new AmazonClientException("Unable to parse encryption materials description from metadata :" + e.getMessage());
        }
    }

    /**
     * Update the request's ObjectMetadata with the necessary information for decrypting the object
     *
     * @param request
     *      Non-null PUT request encrypted using the given instruction
     * @param instruction
     *      Non-null instruction used to encrypt the data in this PUT request.
     */
    public static void updateMetadataWithEncryptionInstruction(PutObjectRequest request, EncryptionInstruction instruction){
        byte[] keyBytesToStoreInMetadata = instruction.getEncryptedSymmetricKey();
        Cipher symmetricCipher = instruction.getSymmetricCipher();
        Map<String, String> materialsDescription = instruction.getMaterialsDescription();

        ObjectMetadata metadata = request.getMetadata();
        if (metadata == null) metadata = new ObjectMetadata();

        if (request.getFile() != null) {
            Mimetypes mimetypes = Mimetypes.getInstance();
            metadata.setContentType(mimetypes.getMimetype(request.getFile()));
        }

        updateMetadata(metadata, keyBytesToStoreInMetadata, symmetricCipher, materialsDescription);
        request.setMetadata( metadata );
    }

    private static void updateMetadata(ObjectMetadata metadata, byte[] keyBytesToStoreInMetadata, Cipher symmetricCipher, Map<String, String> materialsDescription) {
        // If we generated a symmetric key to encrypt the data, store it in the object metadata.
        if (keyBytesToStoreInMetadata != null) {
            keyBytesToStoreInMetadata = Base64.encodeBase64(keyBytesToStoreInMetadata);
            metadata.addUserMetadata(Headers.CRYPTO_KEY, new String(keyBytesToStoreInMetadata));
        }

        // Put the cipher initialization vector (IV) into the object metadata
        byte[] initVectorBytes = symmetricCipher.getIV();
        initVectorBytes = Base64.encodeBase64(initVectorBytes);
        metadata.addUserMetadata(Headers.CRYPTO_IV, new String(initVectorBytes));

        // Put the materials description into the object metadata as JSON
        JSONObject descriptionJSON = new JSONObject(materialsDescription);
        metadata.addUserMetadata(Headers.MATERIALS_DESCRIPTION, descriptionJSON.toString());
    }

    public static ObjectMetadata updateMetadataWithEncryptionInfo(InitiateMultipartUploadRequest request, byte[] keyBytesToStoreInMetadata, Cipher symmetricCipher, Map<String, String> materialsDescription) {
        ObjectMetadata metadata = request.getObjectMetadata();
        if (metadata == null) metadata = new ObjectMetadata();

        updateMetadata(metadata, keyBytesToStoreInMetadata, symmetricCipher, materialsDescription);

        return metadata;
    }

    /**
     * Retrieve the original materials corresponding to the specified materials description.
     * Returns null if unable to retrieve the original materials.
     */
    private static EncryptionMaterials retrieveOriginalMaterials(Map<String, String> materialsDescription, EncryptionMaterialsAccessor accessor) {
        if (accessor == null)
            return null;
        return accessor.getEncryptionMaterials(materialsDescription);
    }

    /**
     * Calculates the length of the encrypted file given the original plaintext
     * file length and the cipher that will be used for encryption.
     *
     * @return
     *      The size of the encrypted file in bytes, or -1 if no content length
     *      has been set yet.
     */
    private static long calculateCryptoContentLength(Cipher symmetricCipher, PutObjectRequest request, ObjectMetadata metadata) {
        long plaintextLength = getUnencryptedContentLength(request, metadata);

        // If we have a zero length object, return zero as the encrypted size
        if (plaintextLength == 0) return 0;

        // If we don't know the unencrypted size, then report -1
        if (plaintextLength < 0) return -1;

        long cipherBlockSize = symmetricCipher.getBlockSize();
        long offset = cipherBlockSize - (plaintextLength % cipherBlockSize);
        return plaintextLength + offset;
    }

    public static long calculateCryptoContentLength(Cipher symmetricCipher, UploadPartRequest request) {
        long plaintextLength;
        if (request.getFile() != null) {
        	if (request.getPartSize() > 0) plaintextLength = request.getPartSize();
        	else plaintextLength = request.getFile().length();
        } else if (request.getInputStream() != null) {
            plaintextLength = request.getPartSize();
        } else {
            return -1;
        }
        long cipherBlockSize = symmetricCipher.getBlockSize();
        long offset = cipherBlockSize - (plaintextLength % cipherBlockSize);
        return plaintextLength + offset;
    }

    /**
     * Returns the content length of the unencrypted data in a PutObjectRequest,
     * or -1 if the original content-length isn't known.
     *
     * @param request
     *            The request to examine.
     * @param metadata
     *            The metadata for the request.
     *
     * @return The content length of the unencrypted data in the request, or -1
     *         if it isn't known.
     */
    private static long getUnencryptedContentLength(PutObjectRequest request, ObjectMetadata metadata) {
        if (request.getFile() != null) {
            return request.getFile().length();
        } else if (request.getInputStream() != null && metadata.getContentLength() > 0) {
            return metadata.getContentLength();
        }

        return -1;
    }

    /**
     * Returns a JSONObject representation of the instruction object.
     */
    private static JSONObject convertInstructionToJSONObject(EncryptionInstruction instruction) {
        JSONObject instructionJSON = new JSONObject();
        try {
            JSONObject materialsDescriptionJSON = new JSONObject(instruction.getMaterialsDescription());
            byte[] initVector = instruction.getSymmetricCipher().getIV();
            initVector = Base64.encodeBase64(initVector);
            byte[] encryptedKeyBytes = instruction.getEncryptedSymmetricKey();
            encryptedKeyBytes = Base64.encodeBase64(encryptedKeyBytes);

            instructionJSON.put(Headers.MATERIALS_DESCRIPTION, materialsDescriptionJSON.toString());
            instructionJSON.put(Headers.CRYPTO_KEY, new String(encryptedKeyBytes));
            instructionJSON.put(Headers.CRYPTO_IV, new String(initVector));

        } catch (JSONException e) {} // Keys are never null, so JSONException will never be thrown.
        return instructionJSON;
    }

    /**
     * Parses instruction data retrieved from S3 and returns a JSONObject representing the instruction
     */
    private static JSONObject parseJSONInstruction(S3Object instructionObject) {
        try {
            String instructionString = convertStreamToString(instructionObject.getObjectContent());
            return new JSONObject(instructionString);
        } catch (Exception e) {
            throw new AmazonClientException("Error parsing JSON instruction file: " + e.getMessage());
        }
    }

    /**
     * Converts the contents of an input stream to a String
     */
    private static String convertStreamToString(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return "";
        }else {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while ((line = reader.readLine()) != null) {
                    stringBuilder.append(line);
                }
            } finally {
                inputStream.close();
            }
            return stringBuilder.toString();
        }
    }

    /**
     * Takes the position of the leftmost desired byte of a user specified range and returns the
     * position of the start of the previous cipher block, or returns 0 if the leftmost byte is in
     * the first cipher block.
     */
    private static long getCipherBlockLowerBound(long leftmostBytePosition) {
        long cipherBlockSize = JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE;
        long offset = leftmostBytePosition % cipherBlockSize;
        long lowerBound = leftmostBytePosition - offset - cipherBlockSize;
        if (lowerBound < 0) {
            return 0;
        } else {
            return lowerBound;
        }
    }

    /**
     * Takes the position of the rightmost desired byte of a user specified range and returns the
     * position of the end of the following cipher block.
     */
    private static long getCipherBlockUpperBound(long rightmostBytePosition) {
        long cipherBlockSize = JceEncryptionConstants.SYMMETRIC_CIPHER_BLOCK_SIZE;
        long offset = cipherBlockSize - (rightmostBytePosition % cipherBlockSize);
        return rightmostBytePosition + offset + cipherBlockSize;
    }
}
