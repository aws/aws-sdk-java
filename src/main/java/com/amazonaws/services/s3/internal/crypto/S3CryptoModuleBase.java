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

import static com.amazonaws.services.s3.internal.crypto.EncryptionUtils.INSTRUCTION_SUFFIX;
import static com.amazonaws.util.LengthCheckInputStream.EXCLUDE_SKIPPED_BYTES;
import static com.amazonaws.util.StringUtils.UTF8;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.Mimetypes;
import com.amazonaws.services.s3.internal.RepeatableFileInputStream;
import com.amazonaws.services.s3.internal.S3Direct;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CryptoConfiguration;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.util.LengthCheckInputStream;

/**
 * Common implementation for different S3 cryptographic modules.
 */
public abstract class S3CryptoModuleBase<T extends MultipartUploadContext>
        extends S3CryptoModule<T> {
    protected static final int DEFAULT_BUFFER_SIZE = 1024*2;    // 2K
    protected final EncryptionMaterialsProvider kekMaterialsProvider;
    protected final CryptoConfiguration cryptoConfig;
    protected final Log log = LogFactory.getLog(getClass());
    protected final S3CryptoScheme cryptoScheme;

    protected final ContentCryptoScheme contentCryptoScheme;

    /** Map of data about in progress encrypted multipart uploads. */
    protected final  Map<String, T> multipartUploadContexts =
        Collections.synchronizedMap(new HashMap<String,T>());
    protected final S3Direct s3;
    
    protected S3CryptoModuleBase(S3Direct s3,
            AWSCredentialsProvider credentialsProvider,
            EncryptionMaterialsProvider kekMaterialsProvider,
            ClientConfiguration clientConfig,
            CryptoConfiguration cryptoConfig,
            S3CryptoScheme cryptoScheme) {
        this.kekMaterialsProvider = kekMaterialsProvider;
        this.cryptoConfig = cryptoConfig;
        this.s3 = s3;
        this.cryptoScheme = cryptoScheme;
        this.contentCryptoScheme = cryptoScheme.getContentCryptoScheme();
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
    public final void abortMultipartUploadSecurely(AbortMultipartUploadRequest req) {
        s3.abortMultipartUpload(req);
        multipartUploadContexts.remove(req.getUploadId());
    }

    protected final ObjectMetadata updateMetadataWithContentCryptoMaterial(
            ObjectMetadata metadata, File file, ContentCryptoMaterial instruction) {
        if (metadata == null) 
            metadata = new ObjectMetadata();
        if (file != null) {
            Mimetypes mimetypes = Mimetypes.getInstance();
            metadata.setContentType(mimetypes.getMimetype(file));
        }
        return instruction.toObjectMetadata(metadata);
    }

    /**
     * Generates and returns the content encryption material with the given kek
     * material and security providers.
     */
    protected final ContentCryptoMaterial newContentCryptoMaterial(
            EncryptionMaterialsProvider kekMaterialProvider,
            Provider provider) {
        // Generate a one-time use symmetric key and initialize a cipher to encrypt object data
        SecretKey cek = generateCEK();
        // Randomly generate the IV
        byte[] iv = new byte[contentCryptoScheme.getIVLengthInBytes()];
        cryptoScheme.getSecureRandom().nextBytes(iv);
        // Encrypt the envelope symmetric key
        EncryptionMaterials kekMaterials = kekMaterialProvider.getEncryptionMaterials();
        SecuredCEK cekSecured = secureCEK(cek, kekMaterials, provider);
        // Return a new instruction with the appropriate fields.
        return new ContentCryptoMaterial(
            kekMaterials.getMaterialsDescription(),
            cekSecured.encrypted, 
            cekSecured.keyWrapAlgorithm,
            contentCryptoScheme.createCipherLite
                (cek, iv,Cipher.ENCRYPT_MODE, provider));
    }

    protected final SecretKey generateCEK() {
        KeyGenerator generator;
        try {
            generator = KeyGenerator.getInstance(contentCryptoScheme
                    .getKeyGeneratorAlgorithm());
            generator.init(contentCryptoScheme.getKeyLengthInBits(),
                    cryptoScheme.getSecureRandom());
            return generator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            throw new AmazonClientException(
                    "Unable to generate envelope symmetric key:"
                            + e.getMessage(), e);
        }
    }

    protected final SecuredCEK secureCEK(SecretKey toBeEncrypted,
            EncryptionMaterials materials, Provider cryptoProvider)
    {
        Key kek; 
        if (materials.getKeyPair() != null) {
            // Do envelope encryption with public key from key pair
            kek = materials.getKeyPair().getPublic();
        } else {
            // Do envelope encryption with symmetric key
            kek= materials.getSymmetricKey();
        }
        S3KeyWrapScheme kwScheme = cryptoScheme.getKeyWrapScheme();
        String keyWrapAlgo = kwScheme.getKeyWrapAlgorithm(kek);
        try {
            if (keyWrapAlgo != null) {
                Cipher cipher = cryptoProvider == null 
                    ? Cipher.getInstance(keyWrapAlgo)
                    : Cipher.getInstance(keyWrapAlgo, cryptoProvider)
                    ;
                cipher.init(Cipher.WRAP_MODE, kek, cryptoScheme.getSecureRandom());
                return new SecuredCEK(cipher.wrap(toBeEncrypted), keyWrapAlgo);
            }
            // fall back to the Encryption Only (EO) key encrypting method
            Cipher cipher;
            byte[] toBeEncryptedBytes = toBeEncrypted.getEncoded();
            String algo = kek.getAlgorithm();
            if (cryptoProvider != null) {
                cipher = Cipher.getInstance(algo, cryptoProvider);
            } else {
                cipher = Cipher.getInstance(algo); // Use default JCE Provider
            }
            cipher.init(Cipher.ENCRYPT_MODE, kek);
            return new SecuredCEK(cipher.doFinal(toBeEncryptedBytes), null);
        } catch (Exception e) {
            throw new AmazonClientException("Unable to encrypt symmetric key: " + e.getMessage(), e);
        }
    }

    /** Used to carry both the secured CEK and the key wrapping algorithm, if any. */
    private static class SecuredCEK {
        /**
         * The encrypted CEK either via key wrapping or simple encryption.
         */
        final byte[] encrypted;
        /**
         * The key wrapping algorithm used, or null if the CEK is not secured
         * via key wrapping.
         */
        final String keyWrapAlgorithm;
        SecuredCEK(byte[] encryptedKey, String keyWrapAlgorithm) {
            this.encrypted = encryptedKey;
            this.keyWrapAlgorithm = keyWrapAlgorithm;
        }
    }

    /**
     * Returns a request that has the content as input stream wrapped with a
     * cipher, and configured with some meta data and user metadata.
     */
    protected final PutObjectRequest wrapWithCipher(
            PutObjectRequest request, ContentCryptoMaterial cekMaterial) {
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
            PutObjectRequest req, ContentCryptoMaterial cekMaterial,
            long plaintextLength) {
        try {
            InputStream is = req.getInputStream();
            if (req.getFile() != null)
                is = new RepeatableFileInputStream(req.getFile());
            if (plaintextLength > -1) {
                // S3 allows a single PUT to be no more than 5GB, which
                // therefore won't exceed the maximum length that can be
                // encrypted either using any cipher such as CBC or GCM.
                
                // This ensures the plain-text read from the underlying data
                // stream has the same length as the expected total.
                is = new LengthCheckInputStream(is, plaintextLength,
                        EXCLUDE_SKIPPED_BYTES);
            }
            return new CipherLiteInputStream(is,
                    cekMaterial.getCipherLite(),
                    DEFAULT_BUFFER_SIZE);
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Unable to create cipher input stream: " + e.getMessage(),
                    e);
        }
    }

    /**
     * Returns the plaintext length from the request and metadata; or -1 if
     * unknown.
     */
    protected final long plaintextLength(PutObjectRequest request,
            ObjectMetadata metadata) {
        if (request.getFile() != null) {
            return request.getFile().length();
        } else if (request.getInputStream() != null
                && metadata.getRawMetadata().get(Headers.CONTENT_LENGTH) != null) {
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
     * @param request
     *      The put request for the original object to be stored in S3.
     * @param cekMaterial
     *      The instruction object to be stored in S3.
     * @return
     *      A put request to store the specified instruction object in S3.
     */
    protected final PutObjectRequest upateInstructionPutRequest(
            PutObjectRequest request, ContentCryptoMaterial cekMaterial) {
        byte[] bytes = cekMaterial.toJsonString().getBytes(UTF8);
        InputStream is = new ByteArrayInputStream(bytes);
        ObjectMetadata metadata = request.getMetadata();
        if (metadata == null) {
            metadata = new ObjectMetadata();
            request.setMetadata(metadata);
        }
        // Set the content-length of the upload
        metadata.setContentLength(bytes.length);
        // Set the crypto instruction file header
        metadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");
        // Update the instruction request
        request.setKey(request.getKey() + INSTRUCTION_SUFFIX);
        request.setMetadata(metadata);
        request.setInputStream(is);
        request.setFile(null);
        return request;
    }

    protected final PutObjectRequest createInstructionPutRequest(
            String bucketName, String key, ContentCryptoMaterial cekMaterial) {
        byte[] bytes = cekMaterial.toJsonString().getBytes(UTF8);
        InputStream is = new ByteArrayInputStream(bytes);
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(bytes.length);
        metadata.addUserMetadata(Headers.CRYPTO_INSTRUCTION_FILE, "");
        return new PutObjectRequest(bucketName, key + INSTRUCTION_SUFFIX,
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
}
