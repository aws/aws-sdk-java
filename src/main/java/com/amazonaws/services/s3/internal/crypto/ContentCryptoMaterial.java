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

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.Key;
import java.security.Provider;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsAccessor;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.json.Jackson;

/**
 * Cryptographic material used for client-side content encrypt/decryption in S3.
 * This includes the randomly generated one-time secured CEK
 * (content-encryption-key) and the respective key wrapping algorithm, if any,
 * and the cryptographic scheme in use.
 */
final class ContentCryptoMaterial {
    // null if cek is not secured via key wrapping
    private final String keyWrappingAlgorithm; 
    private final CipherLite cipherLite;

    private final Map<String, String> kekMaterialsDescription;
    private final byte[] encryptedCEK;

    ContentCryptoMaterial(Map<String, String> kekMaterialsDescription,
            byte[] encryptedCEK,
            String keyWrappingAlgorithm,
            CipherLite cipherLite) {
        this.cipherLite = cipherLite;
        this.keyWrappingAlgorithm = keyWrappingAlgorithm;
        this.encryptedCEK = encryptedCEK.clone();
        this.kekMaterialsDescription = kekMaterialsDescription;
    }

    /**
     * Returns the key wrapping algorithm, or null if the content key is not
     * secured via a key wrapping algorithm.
     */
    String getKeyWrappingAlgorithm() {
        return keyWrappingAlgorithm;
    }

    /**
     * Returns the content crypto scheme.
     */
    ContentCryptoScheme getContentCryptoScheme() {
        return cipherLite.getContentCryptoScheme();
    }

    // No need for this routine once we upgraded from commons codec 1.3 to 1.6
    private String encodeBase64String(byte[] b) {
        byte[] encoded = Base64.encodeBase64(b);
        return new String(encoded, UTF8);
    }

    /**
     * Returns the given metadata updated with this content crypto material.
     */
    ObjectMetadata toObjectMetadata(ObjectMetadata metadata) {
        // If we generated a symmetric key to encrypt the data, store it in the
        // object metadata.
        byte[] encryptedCEK = getEncryptedCEK();
        metadata.addUserMetadata(Headers.CRYPTO_KEY_V2, encodeBase64String(encryptedCEK));
        // Put the cipher initialization vector (IV) into the object metadata
        byte[] iv = cipherLite.getIV();
        metadata.addUserMetadata(Headers.CRYPTO_IV, encodeBase64String(iv));
        // Put the materials description into the object metadata as JSON
        metadata.addUserMetadata(Headers.MATERIALS_DESCRIPTION,
                kekMaterialDescAsJson());
        // The CRYPTO_CEK_ALGORITHM, CRYPTO_TAG_LENGTH and
        // CRYPTO_KEYWRAP_ALGORITHM were not available in the Encryption Only
        // (EO) implementation
        ContentCryptoScheme scheme = getContentCryptoScheme();
        metadata.addUserMetadata(Headers.CRYPTO_CEK_ALGORITHM,
                scheme.getCipherAlgorithm());
        int tagLen = scheme.getTagLengthInBits();
        if (tagLen > 0)
            metadata.addUserMetadata(Headers.CRYPTO_TAG_LENGTH,
                    String.valueOf(tagLen));
        String keyWrapAlgo = getKeyWrappingAlgorithm();
        if (keyWrapAlgo != null)
            metadata.addUserMetadata(Headers.CRYPTO_KEYWRAP_ALGORITHM,
                    keyWrapAlgo);
        return metadata;
    }


    String toJsonString() {
        Map<String, String> map = new HashMap<String, String>();
        byte[] encryptedCEK = getEncryptedCEK();
        map.put(Headers.CRYPTO_KEY_V2, encodeBase64String(encryptedCEK));
        byte[] iv = cipherLite.getIV();
        map.put(Headers.CRYPTO_IV, encodeBase64String(iv));
        map.put(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        // The CRYPTO_CEK_ALGORITHM, CRYPTO_TAG_LENGTH and
        // CRYPTO_KEYWRAP_ALGORITHM were not available in the Encryption Only
        // (EO) implementation
        ContentCryptoScheme scheme = getContentCryptoScheme();
        map.put(Headers.CRYPTO_CEK_ALGORITHM, scheme.getCipherAlgorithm());
        int tagLen = scheme.getTagLengthInBits();
        if (tagLen > 0)
            map.put(Headers.CRYPTO_TAG_LENGTH, String.valueOf(tagLen));
        String keyWrapAlgo = getKeyWrappingAlgorithm();
        if (keyWrapAlgo != null)
            map.put(Headers.CRYPTO_KEYWRAP_ALGORITHM, keyWrapAlgo);
        return Jackson.toJsonString(map);
    }
    
    /**
     * Returns the key-encrypting-key material description as a non-null json
     * string;
     */
    private String kekMaterialDescAsJson() {
        Map<String,String> kekMaterialDesc = getKEKMaterialsDescription();
        if (kekMaterialDesc == null)
            kekMaterialDesc = Collections.emptyMap();
        return Jackson.toJsonString(kekMaterialDesc);
    }

    /**
     * Returns the binary value decoded from a Base 64 string; or null if the
     * input is null.
     */
    private static byte[] decodeB64(String b64s) {
        return b64s == null ? null : Base64.decodeBase64(b64s.getBytes(UTF8));
    }

    /**
     * Returns the corresponding kek material description from the given json;
     * or null if the input is null.
     */
    @SuppressWarnings("unchecked")
    private static Map<String, String> matdescFromJson(String json) {
        return Collections.unmodifiableMap(Jackson.fromJsonString(json, Map.class));
    }

    /**
     * Returns the content encrypting key unwrapped or decrypted.
     * 
     * @param cekSecured
     *            the content encrypting key in wrapped or encrypted form; must
     *            not be null
     * @param keyWrapAlgo
     *            key wrapping algorithm; or null if direct encryption instead
     *            of key wrapping is used
     * @param materials
     *            the client key encrypting key material for the content
     *            encrypting key
     * @param securityProvider
     *            security provider or null if the default security provider of
     *            the JCE is used
     */
    private static SecretKey cek(byte[] cekSecured, String keyWrapAlgo,
            EncryptionMaterials materials, Provider securityProvider) {
        Key kek;
        if (materials.getKeyPair() != null) {
            // Do envelope decryption with private key from key pair
            kek = materials.getKeyPair().getPrivate();
        } else {
            // Do envelope decryption with symmetric key
            kek = materials.getSymmetricKey();
        }

        try {
            if (keyWrapAlgo != null) {
                // Key wrapping specified
                Cipher cipher = securityProvider == null ? Cipher
                        .getInstance(keyWrapAlgo) : Cipher.getInstance(
                        keyWrapAlgo, securityProvider);
                cipher.init(Cipher.UNWRAP_MODE, kek);
                return (SecretKey) cipher.unwrap(cekSecured, keyWrapAlgo,
                        Cipher.SECRET_KEY);
            }
            // fall back to the Encryption Only (EO) key decrypting method
            Cipher cipher;
            if (securityProvider != null) {
                cipher = Cipher.getInstance(kek.getAlgorithm(),
                        securityProvider);
            } else {
                cipher = Cipher.getInstance(kek.getAlgorithm());
            }
            cipher.init(Cipher.DECRYPT_MODE, kek);
            byte[] decryptedSymmetricKeyBytes = cipher.doFinal(cekSecured);
            return new SecretKeySpec(decryptedSymmetricKeyBytes,
                    JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        } catch (Exception e) {
            throw new AmazonClientException(
                    "Unable to decrypt symmetric key from object metadata : "
                            + e.getMessage(), e);
        }
    }

    /**
     * Factory method to return the content crypto material from the S3 object
     * meta data, using the specified key encrypting key material accessor and
     * an optional security provider.
     */
    static ContentCryptoMaterial fromObjectMetadata(
            ObjectMetadata metadata,
            EncryptionMaterialsAccessor kekMaterialAccessor,
            Provider securityProvider,
            long[] range) {
        // CEK and IV
        Map<String, String> userMeta = metadata.getUserMetadata();
        String b64key = userMeta.get(Headers.CRYPTO_KEY_V2);
        if (b64key == null) {
            b64key = userMeta.get(Headers.CRYPTO_KEY);
            if (b64key == null)
                throw new AmazonClientException("Content encrypting key not found.");
        }
        byte[] cekWrapped = decodeB64(b64key);
        byte[] iv = decodeB64(userMeta.get(Headers.CRYPTO_IV));
        if (cekWrapped == null || iv == null) {
            throw new AmazonClientException("Content encrypting key or IV not found.");
        }
        // Material description
        String matdescStr = userMeta.get(Headers.MATERIALS_DESCRIPTION);
        Map<String, String> matdesc = matdescFromJson(matdescStr);
        EncryptionMaterials materials = kekMaterialAccessor == null
            ? null
            : kekMaterialAccessor.getEncryptionMaterials(matdesc)
            ;
        if (materials == null) {
            throw new AmazonClientException(
                    "Unable to retrieve the client encryption materials");
        }
        // CEK algorithm
        String cekAlgo = userMeta.get(Headers.CRYPTO_CEK_ALGORITHM);
        boolean isRangeGet = range != null;
        // The content crypto scheme may vary depending on whether
        // it is a range get operation
        ContentCryptoScheme contentCryptoScheme = ContentCryptoScheme
                .fromCEKAlgo(cekAlgo, isRangeGet);
        if (isRangeGet) {
            // Adjust the IV as needed
            iv = contentCryptoScheme.adjustIV(iv, range[0]);
        } else {
            // Validate the tag length supported
            int tagLenExpected = contentCryptoScheme.getTagLengthInBits();
            if (tagLenExpected > 0) {
                String s = userMeta.get(Headers.CRYPTO_TAG_LENGTH);
                int tagLenActual = Integer.parseInt(s);
                if (tagLenExpected != tagLenActual) {
                    throw new AmazonClientException("Unsupported tag length: "
                            + tagLenActual + ", expected: " + tagLenExpected);
                }
            }
        }
        // Unwrap or decrypt the CEK
        String keyWrapAlgo = userMeta.get(Headers.CRYPTO_KEYWRAP_ALGORITHM);
        SecretKey cek = cek(cekWrapped, keyWrapAlgo, materials,
                securityProvider);
        return new ContentCryptoMaterial(matdesc, cekWrapped, keyWrapAlgo,
                contentCryptoScheme.createCipherLite(cek, iv,
                        Cipher.DECRYPT_MODE, securityProvider));
    }

    /**
     * Factory method to return the content crypto material from the S3
     * instruction file, using the specified key encrypting key material
     * accessor and an optional security provider.
     */
    static ContentCryptoMaterial fromInstructionFile(Map<String,String> instFile,
        EncryptionMaterialsAccessor kekMaterialAccessor,
        Provider securityProvider,
        long[] range) {
        return fromInstructionFile0(instFile, kekMaterialAccessor,
                securityProvider, range);
    }

    private static ContentCryptoMaterial fromInstructionFile0(
            Map<String,String> map,
            EncryptionMaterialsAccessor kekMaterialAccessor,
            Provider securityProvider,
            long[] range) {
        // CEK and IV
        String b64key = map.get(Headers.CRYPTO_KEY_V2);
        if (b64key == null) {
            b64key = map.get(Headers.CRYPTO_KEY);
            if (b64key == null)
                throw new AmazonClientException("Content encrypting key not found.");
        }
        byte[] cekWrapped = decodeB64(b64key);
        byte[] iv = decodeB64(map.get(Headers.CRYPTO_IV));
        if (cekWrapped == null || iv == null) {
            throw new AmazonClientException(
                    "Necessary encryption info not found in the instruction file "
                            + map);
        }
        // Material description
        String matdescStr = map.get(Headers.MATERIALS_DESCRIPTION);
        Map<String, String> matdesc = matdescFromJson(matdescStr);
        EncryptionMaterials materials = kekMaterialAccessor == null
            ? null
            : kekMaterialAccessor.getEncryptionMaterials(matdesc)
            ;
        if (materials == null) {
            throw new AmazonClientException(
                    "Unable to retrieve the encryption materials that originally "
                            + "encrypted object corresponding to instruction file " + map);
        }
        // CEK algorithm
        String cekAlgo = map.get(Headers.CRYPTO_CEK_ALGORITHM);
        boolean isRangeGet = range != null;
        // The content crypto scheme may vary depending on whether
        // it is a range get operation
        ContentCryptoScheme contentCryptoScheme = ContentCryptoScheme
                .fromCEKAlgo(cekAlgo, isRangeGet);
        if (isRangeGet) {
            // Adjust the IV as needed
            iv = contentCryptoScheme.adjustIV(iv, range[0]);
        } else {
            // Validate the tag length supported
            int tagLenExpected = contentCryptoScheme.getTagLengthInBits();
            if (tagLenExpected > 0) {
                String s = map.get(Headers.CRYPTO_TAG_LENGTH);
                int tagLenActual = Integer.parseInt(s);
                if (tagLenExpected != tagLenActual) {
                    throw new AmazonClientException("Unsupported tag length: "
                            + tagLenActual + ", expected: " + tagLenExpected);
                }
            }
        }
        // Unwrap or decrypt the CEK
        String keyWrapAlgo = map.get(Headers.CRYPTO_KEYWRAP_ALGORITHM);
        SecretKey cek = cek(cekWrapped, keyWrapAlgo, materials, securityProvider);
        return new ContentCryptoMaterial(matdesc, cekWrapped, keyWrapAlgo,
                contentCryptoScheme.createCipherLite(cek, iv,
                        Cipher.DECRYPT_MODE, securityProvider));
    }

    /**
     * Parses instruction data retrieved from S3 and returns a JSON string
     * representing the instruction. Made for testing purposes.
     */
    static String parseInstructionFile(S3Object instructionFile) {
        try {
            return convertStreamToString(instructionFile.getObjectContent());
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
     * Return the cipher lite used for content encryption/decryption purposes.
     */
    CipherLite getCipherLite() {
        return cipherLite;
    }

    /**
     * Returns the description of the kek materials that were used to
     * encrypt the cek.
     */
    Map<String, String> getKEKMaterialsDescription() {
        return this.kekMaterialsDescription;
    }

    /**
     * Returns an array of bytes representing the encrypted envelope symmetric
     * key.
     * 
     * @return an array of bytes representing the encrypted envelope symmetric
     *         key.
     */
    byte[] getEncryptedCEK() {
        return this.encryptedCEK.clone();
    }
}
