/*
 * Copyright 2013-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto.v2;

import static com.amazonaws.services.s3.Headers.AWS_CRYPTO_CEK_ALGORITHM;
import static com.amazonaws.services.s3.Headers.CRYPTO_CEK_ALGORITHM;
import static com.amazonaws.services.s3.model.ExtraMaterialsDescription.NONE;
import static com.amazonaws.util.BinaryUtils.copyAllBytesFrom;
import static com.amazonaws.util.Throwables.failure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.security.Key;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.SdkClientException;
import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.kms.model.DecryptResult;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.KeyWrapException;
import com.amazonaws.services.s3.internal.crypto.CipherLite;
import com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme;
import com.amazonaws.services.s3.internal.crypto.CryptoUtils;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.amazonaws.services.s3.internal.crypto.keywrap.InternalKeyWrapAlgorithm;
import com.amazonaws.services.s3.internal.crypto.keywrap.KMSKeyWrapperContext;
import com.amazonaws.services.s3.internal.crypto.keywrap.KeyWrapAlgorithmResolver;
import com.amazonaws.services.s3.internal.crypto.keywrap.KeyWrapper;
import com.amazonaws.services.s3.internal.crypto.keywrap.KeyWrapperContext;
import com.amazonaws.services.s3.internal.crypto.keywrap.KeyWrapperFactory;
import com.amazonaws.services.s3.model.CryptoConfigurationV2;
import com.amazonaws.services.s3.model.CryptoKeyWrapAlgorithm;
import com.amazonaws.services.s3.model.CryptoMode;
import com.amazonaws.services.s3.model.CryptoRangeGetMode;
import com.amazonaws.services.s3.model.EncryptionMaterials;
import com.amazonaws.services.s3.model.EncryptionMaterialsAccessor;
import com.amazonaws.services.s3.model.EncryptionMaterialsProvider;
import com.amazonaws.services.s3.model.ExtraMaterialsDescription;
import com.amazonaws.services.s3.model.KMSEncryptionMaterials;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutInstructionFileRequest;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.Base64;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.Jackson;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Cryptographic material used for client-side content encrypt/decryption in S3.
 * This includes the randomly generated one-time secured CEK
 * (content-encryption-key) and the respective key wrapping algorithm, if any,
 * and the cryptographic scheme in use.
 */
final class ContentCryptoMaterial {

    private final InternalKeyWrapAlgorithm keyWrappingAlgorithm;
    private final CipherLite cipherLite;

    private final Map<String, String> kekMaterialsDescription;
    private final byte[] encryptedCEK;

    ContentCryptoMaterial(Map<String, String> kekMaterialsDescription,
                          byte[] encryptedCEK,
                          InternalKeyWrapAlgorithm keyWrappingAlgorithm,
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
    InternalKeyWrapAlgorithm getKeyWrappingAlgorithm() {
        return keyWrappingAlgorithm;
    }

    /**
     * Returns the content crypto scheme.
     */
    ContentCryptoScheme getContentCryptoScheme() {
        return cipherLite.getContentCryptoScheme();
    }

    /**
     * Returns the metadata in the latest format.
     */
    ObjectMetadata toObjectMetadata(ObjectMetadata metadata) {
        // If we generated a symmetric key to encrypt the data, store it in the
        // object metadata.
        byte[] encryptedCEK = getEncryptedCEK();
        metadata.addUserMetadata(Headers.CRYPTO_KEY_V2,
                                 Base64.encodeAsString(encryptedCEK));
        // Put the cipher initialization vector (IV) into the object metadata
        byte[] iv = cipherLite.getIV();
        metadata.addUserMetadata(Headers.CRYPTO_IV, Base64.encodeAsString(iv));
        // Put the materials description into the object metadata as JSON
        metadata.addUserMetadata(Headers.MATERIALS_DESCRIPTION,
                                 kekMaterialDescAsJson());
        // The CRYPTO_CEK_ALGORITHM, CRYPTO_TAG_LENGTH and
        // CRYPTO_KEYWRAP_ALGORITHM were not available in the Encryption Only
        // (EO) implementation
        ContentCryptoScheme scheme = getContentCryptoScheme();
        metadata.addUserMetadata(CRYPTO_CEK_ALGORITHM,
                                 scheme.getCipherAlgorithm());
        int tagLen = scheme.getTagLengthInBits();
        if (tagLen > 0)
            metadata.addUserMetadata(Headers.CRYPTO_TAG_LENGTH,
                                     String.valueOf(tagLen));
        InternalKeyWrapAlgorithm keyWrapAlgo = getKeyWrappingAlgorithm();
        if (keyWrapAlgo != null)
            metadata.addUserMetadata(Headers.CRYPTO_KEYWRAP_ALGORITHM,
                                     keyWrapAlgo.algorithmName());
        return metadata;
    }

    /**
     * Returns the json string in the latest format.
     */
    String toJsonString() {
        Map<String, String> map = new HashMap<>();
        byte[] encryptedCEK = getEncryptedCEK();
        map.put(Headers.CRYPTO_KEY_V2, Base64.encodeAsString(encryptedCEK));
        byte[] iv = cipherLite.getIV();
        map.put(Headers.CRYPTO_IV, Base64.encodeAsString(iv));
        map.put(Headers.MATERIALS_DESCRIPTION, kekMaterialDescAsJson());
        // The CRYPTO_CEK_ALGORITHM, CRYPTO_TAG_LENGTH and
        // CRYPTO_KEYWRAP_ALGORITHM were not available in the Encryption Only
        // (EO) implementation
        ContentCryptoScheme scheme = getContentCryptoScheme();
        map.put(CRYPTO_CEK_ALGORITHM, scheme.getCipherAlgorithm());
        int tagLen = scheme.getTagLengthInBits();
        if (tagLen > 0)
            map.put(Headers.CRYPTO_TAG_LENGTH, String.valueOf(tagLen));
        InternalKeyWrapAlgorithm keyWrapAlgo = getKeyWrappingAlgorithm();
        if (keyWrapAlgo != null)
            map.put(Headers.CRYPTO_KEYWRAP_ALGORITHM, keyWrapAlgo.algorithmName());
        return Jackson.toJsonString(map);
    }

    /**
     * Returns the key-encrypting-key material description as a non-null json
     * string;
     */
    private String kekMaterialDescAsJson() {
        Map<String, String> kekMaterialDesc = getKEKMaterialsDescription();
        if (kekMaterialDesc == null)
            kekMaterialDesc = Collections.emptyMap();
        return Jackson.toJsonString(kekMaterialDesc);
    }

    /**
     * Returns the corresponding kek material description from the given json;
     * or null if the input is null.
     */
    private static Map<String, String> matdescFromJson(String json) {
        Map<String, String> map = Jackson.stringMapFromJsonString(json);
        return map == null ? null : Collections.unmodifiableMap(map);
    }

    /**
     * Returns the content encrypting key unwrapped or decrypted.  Note if KMS
     * is used for key protection, a remote call will be made to KMS to decrypt
     * the ciphertext blob.
     *
     * @param context contextual information needed to decrypt the CEK stored in a {@link KeyWrapperContext}
     * @return the content encrypting key unwrapped or decrypted
     */
    private static SecretKey decryptCEK(KeyWrapperContext context) {
        if (isV1DecryptContext(context)){
            return decryptV1CEK(context);
        }
        if (context.internalKeyWrapAlgorithm().isKMS()) {
            validateKMSParameters(context);
        }
        Key kek = getDecryptionKeyFrom(context.materials());
        String keyGeneratorAlgorithm = context.internalKeyWrapAlgorithm().isKMS() ?
                                               context.contentCryptoScheme().getKeyGeneratorAlgorithm() :
                                               kek.getAlgorithm();
        KeyWrapper keyWrapper = KeyWrapperFactory.defaultInstance().createKeyWrapper(context);
        return new SecretKeySpec(keyWrapper.unwrapCek(context.cekSecured(), kek), keyGeneratorAlgorithm);
    }

    private static boolean isV1DecryptContext(KeyWrapperContext context) {
        InternalKeyWrapAlgorithm keyWrapAlgorithm = context.internalKeyWrapAlgorithm();
        return keyWrapAlgorithm == null || keyWrapAlgorithm.isV1Algorithm();
    }

    private static void validateKMSParameters(KeyWrapperContext context) {
        KMSKeyWrapperContext kmsKeyWrapperContext = context.kmsKeyWrapperContext();
        if (kmsKeyWrapperContext == null) {
            throw new IllegalStateException("Missing KMS parameters");
        }
        Map<String, String> kmsMaterialsDescription = kmsKeyWrapperContext.kmsMaterialsDescription();
        if (kmsMaterialsDescription == null) {
            throw new IllegalStateException("Key materials from KMS must contain description entries");
        }
        String cekAlgoFromMaterials = kmsMaterialsDescription.get(AWS_CRYPTO_CEK_ALGORITHM);
        if (cekAlgoFromMaterials == null) {
            throw new IllegalStateException("Could not find required description in key material: "
                    + AWS_CRYPTO_CEK_ALGORITHM);
        }
        String cekAlgoFromCryptoScheme =
            CryptoUtils.normalizeContentAlgorithmForValidation(context.contentCryptoScheme().getCipherAlgorithm());
        if (!cekAlgoFromMaterials.equals(cekAlgoFromCryptoScheme)) {
            throw new IllegalStateException("Algorithm values from materials and metadata/instruction file don't match:"
                    + cekAlgoFromMaterials + ", " + cekAlgoFromCryptoScheme);
        }
    }

    /**
     * Returns the content encrypting key unwrapped or decrypted.  Note if KMS
     * is used for key protection, a remote call will be made to KMS to decrypt
     * the ciphertext blob.
     */

    private static SecretKey decryptV1CEK(KeyWrapperContext context) {
        InternalKeyWrapAlgorithm internalKeyWrapAlgorithm = context.internalKeyWrapAlgorithm();
        if (internalKeyWrapAlgorithm != null && internalKeyWrapAlgorithm.isKMS()) {
            return decryptV1CEKByKMS(context);
        }
        String keyWrapAlgo = internalKeyWrapAlgorithm != null ?
                                     internalKeyWrapAlgorithm.algorithmName() : null;
        Key kek;
        if (context.materials().getKeyPair() != null) {
            kek = context.materials().getKeyPair().getPrivate();
        } else {
            kek = context.materials().getSymmetricKey();
        }
        if (kek == null) {
            throw new SdkClientException("Key encrypting key not available");
        }

        Provider securityProvider = context.cryptoProvider();
        try {
            if (keyWrapAlgo != null) {
                Cipher cipher = securityProvider == null ? Cipher
                        .getInstance(keyWrapAlgo) : Cipher.getInstance(
                        keyWrapAlgo, securityProvider);
                cipher.init(Cipher.UNWRAP_MODE, kek);
                return (SecretKey) cipher.unwrap(context.cekSecured(), keyWrapAlgo,
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
            byte[] decryptedSymmetricKeyBytes = cipher.doFinal(context.cekSecured());
            return new SecretKeySpec(decryptedSymmetricKeyBytes,
                    JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
        } catch (Exception e) {
            throw failure(e, "Unable to decrypt symmetric key from object metadata");
        }
    }

    /**
     * Decrypts the secured CEK via KMS; involves network calls.
     *
     * @return the CEK (in plaintext).
     */
    private static SecretKey decryptV1CEKByKMS(KeyWrapperContext context) {
        KMSKeyWrapperContext kmsKeyWrapperContext = context.kmsKeyWrapperContext();
        if (kmsKeyWrapperContext == null) {
            throw new IllegalStateException("Missing KMS parameters");
        }
        String cmk = context.materials().getCustomerMasterKeyId();
        if (null == cmk || cmk.isEmpty()) {
            throw new IllegalArgumentException("The CMK must be specified to decrypt KMS protected objects");
        }
        DecryptRequest kmsreq = new DecryptRequest()
                .withEncryptionContext(context.materials().getMaterialsDescription())
                .withCiphertextBlob(ByteBuffer.wrap(context.cekSecured()))
                .withKeyId(cmk);
        DecryptResult result = kmsKeyWrapperContext.kms().decrypt(kmsreq);
        return new SecretKeySpec(copyAllBytesFrom(result.getPlaintext()),
                context.contentCryptoScheme().getKeyGeneratorAlgorithm());
    }

    /**
     * @return a non-null content crypto material.
     */
    static ContentCryptoMaterial fromObjectMetadata(
        Map<String, String> metadata,
        EncryptionMaterialsAccessor kekMaterialAccessor,
        CryptoConfigurationV2 cryptoConfiguration,
        boolean keyWrapExpected,
        AWSKMS kms) {
        return fromObjectMetadata0(metadata,
                                   kekMaterialAccessor,
                                   cryptoConfiguration,
                                   null,
                                   NONE,
                                   keyWrapExpected,
                                   kms);
    }

    /**
     * Factory method to return the content crypto material from the S3 object
     * meta data, using the specified key encrypting key material accessor and
     * an optional security provider.
     *
     * @return a non-null content crypto material.
     */
    static ContentCryptoMaterial fromObjectMetadata(
        Map<String, String> metadata,
        EncryptionMaterialsAccessor kekMaterialAccessor,
        CryptoConfigurationV2 cryptoConfiguration,
        long[] range,
        ExtraMaterialsDescription extra,
        boolean keyWrapExpected,
        AWSKMS kms) {
        return fromObjectMetadata0(metadata,
                                   kekMaterialAccessor,
                                   cryptoConfiguration,
                                   range,
                                   extra,
                                   keyWrapExpected,
                                   kms);
    }

    /**
     * @return a non-null content crypto material.
     */
    private static ContentCryptoMaterial fromObjectMetadata0(Map<String, String> userMeta,
                                                             EncryptionMaterialsAccessor kekMaterialAccessor,
                                                             CryptoConfigurationV2 cryptoConfiguration, long[] range,
                                                             ExtraMaterialsDescription extra, boolean keyWrapExpected,
                                                             AWSKMS kms) {
        // CEK and IV
        String b64key = userMeta.get(Headers.CRYPTO_KEY_V2);
        if (b64key == null) {
            b64key = userMeta.get(Headers.CRYPTO_KEY);
            if (b64key == null)
                throw new SdkClientException(
                    "Content encrypting key not found.");
        }
        byte[] cekWrapped = Base64.decode(b64key);
        byte[] iv = Base64.decode(userMeta.get(Headers.CRYPTO_IV));
        if (cekWrapped == null || iv == null) {
            throw new SdkClientException(
                "Content encrypting key or IV not found.");
        }
        // Material description
        String matdescStr = userMeta.get(Headers.MATERIALS_DESCRIPTION);
        final String keyWrapAlgo = userMeta.get(Headers.CRYPTO_KEYWRAP_ALGORITHM);
        final Map<String, String> coreMatDesc = matdescFromJson(matdescStr);

        InternalKeyWrapAlgorithm internalKeyWrapAlgorithm = InternalKeyWrapAlgorithm.fromAlgorithmName(keyWrapAlgo);
        validateKeyWrapAlgorithmForDecrypt(internalKeyWrapAlgorithm, keyWrapExpected, cryptoConfiguration.getCryptoMode());
        final boolean isKMS = internalKeyWrapAlgorithm != null && internalKeyWrapAlgorithm.isKMS();

        final Map<String, String> mergedMatDesc = isKMS || extra == null ? coreMatDesc : extra.mergeInto(coreMatDesc);
        final EncryptionMaterials materials;
        if (isKMS) {
            materials = (kekMaterialAccessor instanceof EncryptionMaterialsProvider) ?
                                ((EncryptionMaterialsProvider) kekMaterialAccessor).getEncryptionMaterials() : null;
        } else {
            materials = kekMaterialAccessor.getEncryptionMaterials(mergedMatDesc);
        }
        validateMaterialsForDecrypt(materials, mergedMatDesc, cryptoConfiguration.getCryptoMode(), internalKeyWrapAlgorithm);

        String cekAlgo = userMeta.get(CRYPTO_CEK_ALGORITHM);
        boolean isRangeGet = range != null;
        // The content crypto scheme may vary depending on whether
        // it is a range get operation
        ContentCryptoScheme contentCryptoScheme =
            ContentCryptoScheme.fromCEKAlgo(cekAlgo, isRangeGet);
        if (isRangeGet) {
            assertCryptoSchemeAllowedForRangeGet(contentCryptoScheme,cryptoConfiguration.getCryptoMode(),
                    cryptoConfiguration.getRangeGetMode());
            // Adjust the IV as needed
            iv = contentCryptoScheme.adjustIV(iv, range[0]);
        } else {
            // Validate the tag length supported
            int tagLenExpected = contentCryptoScheme.getTagLengthInBits();
            if (tagLenExpected > 0) {
                String s = userMeta.get(Headers.CRYPTO_TAG_LENGTH);
                int tagLenActual = Integer.parseInt(s);
                if (tagLenExpected != tagLenActual) {
                    throw new SdkClientException("Unsupported tag length: "
                                                 + tagLenActual + ", expected: " + tagLenExpected);
                }
            }
        }

        SecretKey cek = decryptCEK(
                KeyWrapperContext.builder()
                                 .cekSecured(cekWrapped)
                                 .internalKeyWrapAlgorithm(internalKeyWrapAlgorithm)
                                 .materials(materials)
                                 .cryptoProvider(cryptoConfiguration.getCryptoProvider())
                                 .secureRandom(cryptoConfiguration.getSecureRandom())
                                 .contentCryptoScheme(contentCryptoScheme)
                                 .kmsKeyWrapperContext(KMSKeyWrapperContext.builder()
                                                                           .kms(kms)
                                                                           .kmsMaterialsDescription(mergedMatDesc)
                                                                           .build())
                                 .build());
        Provider securityProvider = cryptoConfiguration.getCryptoProvider();
        boolean alwaysUseSecurityProvider = cryptoConfiguration.getAlwaysUseCryptoProvider();
        return new ContentCryptoMaterial(mergedMatDesc, cekWrapped, internalKeyWrapAlgorithm,
                contentCryptoScheme.createCipherLite(cek, iv, Cipher.DECRYPT_MODE, securityProvider,
                        alwaysUseSecurityProvider));
    }

    /**
     * @return a non-null content crypto material.
     */
    static ContentCryptoMaterial fromInstructionFile(Map<String, String> instFile,
                                                     EncryptionMaterialsAccessor kekMaterialAccessor,
                                                     CryptoConfigurationV2 cryptoConfiguration, boolean keyWrapExpected,
                                                     AWSKMS kms) {
        return fromInstructionFile0(instFile, kekMaterialAccessor, cryptoConfiguration, null, NONE,
                keyWrapExpected, kms);
    }

    /**
     * Factory method to return the content crypto material from the S3
     * instruction file, using the specified key encrypting key material
     * accessor and an optional security provider.
     *
     * @return a non-null content crypto material.
     */
    static ContentCryptoMaterial fromInstructionFile(
        Map<String, String> instFile,
        EncryptionMaterialsAccessor kekMaterialAccessor,
        CryptoConfigurationV2 cryptoConfiguration,
        long[] range,
        ExtraMaterialsDescription extra,
        boolean keyWrapExpected,
        AWSKMS kms) {
        return fromInstructionFile0(instFile, kekMaterialAccessor,
                                    cryptoConfiguration, range, extra,
                                    keyWrapExpected, kms);
    }

    /**
     * @return a non-null content crypto material.
     */
    private static ContentCryptoMaterial fromInstructionFile0(
        Map<String, String> instFile,
        EncryptionMaterialsAccessor kekMaterialAccessor,
        CryptoConfigurationV2 cryptoConfiguration,
        long[] range,
        ExtraMaterialsDescription extra,
        boolean keyWrapExpected,
        AWSKMS kms) {
        // CEK and IV
        String b64key = instFile.get(Headers.CRYPTO_KEY_V2);
        if (b64key == null) {
            b64key = instFile.get(Headers.CRYPTO_KEY);
            if (b64key == null)
                throw new SdkClientException(
                    "Content encrypting key not found.");
        }
        byte[] cekWrapped = Base64.decode(b64key);
        byte[] iv = Base64.decode(instFile.get(Headers.CRYPTO_IV));
        if (cekWrapped == null || iv == null) {
            throw new SdkClientException(
                "Necessary encryption info not found in the instruction file "
                + instFile);
        }
        final String keyWrapAlgo = instFile.get(Headers.CRYPTO_KEYWRAP_ALGORITHM);

        InternalKeyWrapAlgorithm internalKeyWrapAlgorithm = InternalKeyWrapAlgorithm.fromAlgorithmName(keyWrapAlgo);
        validateKeyWrapAlgorithmForDecrypt(internalKeyWrapAlgorithm, keyWrapExpected, cryptoConfiguration.getCryptoMode());
        final boolean isKMS = internalKeyWrapAlgorithm != null && internalKeyWrapAlgorithm.isKMS();

        String matdescStr = instFile.get(Headers.MATERIALS_DESCRIPTION);
        final Map<String, String> coreMatDesc = matdescFromJson(matdescStr);
        final Map<String, String> mergedMatDesc = extra == null || isKMS ? coreMatDesc : extra.mergeInto(coreMatDesc);
        EncryptionMaterials materials;
        if (isKMS) {
            materials = (kekMaterialAccessor instanceof EncryptionMaterialsProvider) ?
                ((EncryptionMaterialsProvider) kekMaterialAccessor).getEncryptionMaterials() : null;
        } else {
            materials = kekMaterialAccessor.getEncryptionMaterials(mergedMatDesc);
        }
        validateMaterialsForDecrypt(materials, mergedMatDesc, cryptoConfiguration.getCryptoMode(), internalKeyWrapAlgorithm);

        // CEK algorithm
        final String cekAlgo = instFile.get(CRYPTO_CEK_ALGORITHM);
        final boolean isRangeGet = range != null;
        // The content crypto scheme may vary depending on whether
        // it is a range get operation
        ContentCryptoScheme contentCryptoScheme = ContentCryptoScheme.fromCEKAlgo(cekAlgo, isRangeGet);
        if (isRangeGet) {
            assertCryptoSchemeAllowedForRangeGet(contentCryptoScheme, cryptoConfiguration.getCryptoMode(),
                    cryptoConfiguration.getRangeGetMode());
            // Adjust the IV as needed
            iv = contentCryptoScheme.adjustIV(iv, range[0]);
        } else {
            // Validate the tag length supported
            int tagLenExpected = contentCryptoScheme.getTagLengthInBits();
            if (tagLenExpected > 0) {
                String s = instFile.get(Headers.CRYPTO_TAG_LENGTH);
                int tagLenActual = Integer.parseInt(s);
                if (tagLenExpected != tagLenActual) {
                    throw new SdkClientException("Unsupported tag length: "
                                                 + tagLenActual + ", expected: " + tagLenExpected);
                }
            }
        }

        SecretKey cek = decryptCEK(
                KeyWrapperContext.builder()
                                 .cekSecured(cekWrapped)
                                 .internalKeyWrapAlgorithm(internalKeyWrapAlgorithm)
                                 .materials(materials)
                                 .cryptoProvider(cryptoConfiguration.getCryptoProvider())
                                 .secureRandom(cryptoConfiguration.getSecureRandom())
                                 .contentCryptoScheme(contentCryptoScheme)
                                 .kmsKeyWrapperContext(KMSKeyWrapperContext.builder()
                                                                           .kms(kms)
                                                                           .kmsMaterialsDescription(mergedMatDesc)
                                                                           .build())
                                 .build());
        return new ContentCryptoMaterial(mergedMatDesc, cekWrapped, internalKeyWrapAlgorithm,
            contentCryptoScheme.createCipherLite(cek,
                                                 iv,
                                                 Cipher.DECRYPT_MODE,
                                                 cryptoConfiguration.getCryptoProvider(),
                                                 cryptoConfiguration.getAlwaysUseCryptoProvider()));
    }

    /**
     * Parses instruction data retrieved from S3 and returns a JSON string
     * representing the instruction. Made for testing purposes.
     */
    static String parseInstructionFile(S3Object instructionFile) {
        try {
            return convertStreamToString(instructionFile.getObjectContent());
        } catch (Exception e) {
            throw failure(e, "Error parsing JSON instruction file");
        }
    }

    /**
     * Converts the contents of an input stream to a String
     */
    private static String convertStreamToString(InputStream inputStream)
        throws IOException {
        if (inputStream == null) {
            return "";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            try {
                BufferedReader reader =
                    new BufferedReader(new InputStreamReader(inputStream,
                                                             StringUtils.UTF8));
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
     * Returns the description of the kek materials that were used to encrypt
     * the cek.
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


    /**
     * Recreates a new content crypto material from the current material given a
     * new KEK encryption materials. The purpose is to re-encrypt the CEK under
     * the new KEK.
     *
     * Note network calls are involved if the CEK has been or is to be protected
     * by KMS.
     *
     * @param accessor
     *            used to retrieve the original KEK given the corresponding
     *            material description
     * @throws SecurityException
     *             if the old and new material description are the same; or if
     *             the old and new KEK are the same
     */
    ContentCryptoMaterial recreate(EncryptionMaterialsAccessor accessor,
                                   CryptoConfigurationV2 config,
                                   String keyWrapAlgoFromMetadata, AWSKMS kms,
                                   PutInstructionFileRequest req) {

        EncryptionMaterials newKEK = getNewEncryptionMaterials(req, accessor);
        if (!InternalKeyWrapAlgorithm.KMS.equals(keyWrappingAlgorithm) &&
                    newKEK.getMaterialsDescription().equals(kekMaterialsDescription)) {
            throw new SecurityException(
                "Material description of the new KEK must differ from the current one");
        }
        EncryptionMaterials origKEK;
        if (InternalKeyWrapAlgorithm.KMS.equals(keyWrappingAlgorithm)) {
            throw new SdkClientException("Recreating KMS encrypted CEK is not supported.");
        } else {
            origKEK = accessor.getEncryptionMaterials(kekMaterialsDescription);
        }
        validateKeyWrapAlgorithmForDecrypt(keyWrappingAlgorithm, config.getCryptoMode());
        InternalKeyWrapAlgorithm originalKeyWrapAlgo =
                InternalKeyWrapAlgorithm.fromAlgorithmName(keyWrapAlgoFromMetadata);
        SecretKey cek = decryptCEK(KeyWrapperContext.builder()
                                                    .cekSecured(encryptedCEK)
                                                    .internalKeyWrapAlgorithm(originalKeyWrapAlgo)
                                                    .materials(origKEK)
                                                    .cryptoProvider(config.getCryptoProvider())
                                                    .secureRandom(config.getSecureRandom())
                                                    .contentCryptoScheme(getContentCryptoScheme())
                                                    .kmsKeyWrapperContext(KMSKeyWrapperContext.builder()
                                                                                              .kms(kms)
                                                                                              .build())
                                                    .build());
        ContentCryptoMaterial output = create(cek, cipherLite.getIV(), newKEK, getContentCryptoScheme(), config, kms, req);
        if (Arrays.equals(output.encryptedCEK, encryptedCEK)) {
            throw new SecurityException("The new KEK must differ from the original");
        }
        return output;
    }

    private EncryptionMaterials getNewEncryptionMaterials(PutInstructionFileRequest req,
                                                          EncryptionMaterialsAccessor accessor) {
        EncryptionMaterials newKEK = req.getEncryptionMaterials();
        if (newKEK == null) {
            Map<String, String> materialsDescription = req.getMaterialsDescription();
            newKEK = accessor.getEncryptionMaterials(materialsDescription);
        }
        if (newKEK == null) {
            throw new SdkClientException("No material available with the description " + req.getMaterialsDescription()
                                                 + " from the encryption material provider");
        }
        return newKEK;
    }

    static ContentCryptoMaterial create(SecretKey cek,
                                        byte[] iv,
                                        EncryptionMaterials kekMaterials,
                                        ContentCryptoScheme contentCryptoScheme,
                                        CryptoConfigurationV2 config,
                                        AWSKMS kms,
                                        AmazonWebServiceRequest req) {
        KeyWrapperContext keyWrapperContext = createEncryptionKeyWrapperContext(kekMaterials, contentCryptoScheme, config, kms, req);
        SecuredCEK cekSecured = encryptCEK(cek, keyWrapperContext);
        return wrap(cek, iv, contentCryptoScheme, config.getCryptoProvider(), config.getAlwaysUseCryptoProvider(),
                cekSecured);
    }

    private static KeyWrapperContext createEncryptionKeyWrapperContext(EncryptionMaterials materials,
                                                                       ContentCryptoScheme cryptoScheme,
                                                                       CryptoConfigurationV2 config,
                                                                       AWSKMS kms,
                                                                       AmazonWebServiceRequest req) {

        CryptoKeyWrapAlgorithm keyWrapAlgorithm = KeyWrapAlgorithmResolver.getDefaultKeyWrapAlgorithm(materials);
        InternalKeyWrapAlgorithm internalKeyWrapAlgorithm = InternalKeyWrapAlgorithm.fromExternal(keyWrapAlgorithm);

        if (materials.isKMSEnabled()) {
            Map<String, String> matdesc = KMSMaterialsHandler.createKMSContextMaterialsDescription(
                    KMSMaterialsHandler.mergeMaterialsDescription((KMSEncryptionMaterials) materials, req),
                    cryptoScheme.getCipherAlgorithm());
            KMSKeyWrapperContext kmsKeyWrapperContext = KMSKeyWrapperContext.builder()
                                                                            .kms(kms)
                                                                            .kmsMaterialsDescription(matdesc)
                                                                            .originalRequest(req)
                                                                            .build();
            return KeyWrapperContext.builder()
                                    .cryptoProvider(config.getCryptoProvider())
                                    .secureRandom(config.getSecureRandom())
                                    .materials(materials)
                                    .internalKeyWrapAlgorithm(internalKeyWrapAlgorithm)
                                    .kmsKeyWrapperContext(kmsKeyWrapperContext)
                                    .contentCryptoScheme(cryptoScheme)
                                    .build();
        } else {
            return KeyWrapperContext.builder()
                                    .cryptoProvider(config.getCryptoProvider())
                                    .secureRandom(config.getSecureRandom())
                                    .materials(materials)
                                    .internalKeyWrapAlgorithm(internalKeyWrapAlgorithm)
                                    .contentCryptoScheme(cryptoScheme)
                                    .build();
        }
    }

    /**
     * Returns a new instance of <code>ContentCryptoMaterial</code> by wrapping
     * the input parameters, including the already secured CEK. No network calls
     * are involved.
     */
    static ContentCryptoMaterial wrap(SecretKey cek,
                                             byte[] iv,
                                             ContentCryptoScheme contentCryptoScheme,
                                             Provider provider,
                                             boolean alwaysUseProvider,
                                             SecuredCEK cekSecured) {
        return new ContentCryptoMaterial(
            cekSecured.getMaterialDescription(),
            cekSecured.getEncrypted(),
            cekSecured.getKeyWrapAlgorithm(),
            contentCryptoScheme.createCipherLite(cek, iv, Cipher.ENCRYPT_MODE, provider, alwaysUseProvider));
    }

    private static SecuredCEK encryptCEK(SecretKey cek,
                                         KeyWrapperContext context)  {

        EncryptionMaterials materials = context.materials();
        validateKeyWrapAlgorithmForEncrypt(materials, context.internalKeyWrapAlgorithm());
        Key kek = getEncryptionKeyFrom(materials);
        final Map<String,String> matdesc = materials.isKMSEnabled() ?
                                                   context.kmsKeyWrapperContext().kmsMaterialsDescription() :
                                                   materials.getMaterialsDescription();
        KeyWrapper keyWrapper = KeyWrapperFactory.defaultInstance().createKeyWrapper(context);
        return new SecuredCEK(keyWrapper.wrapCek(cek.getEncoded(), kek), context.internalKeyWrapAlgorithm(), matdesc);
    }

    private static Key getEncryptionKeyFrom(EncryptionMaterials materials) {
        if (materials.isKMSEnabled()) {
            return null;
        }
        return materials.getKeyPair() != null ? materials.getKeyPair().getPublic() : materials.getSymmetricKey();
    }

    private static Key getDecryptionKeyFrom(EncryptionMaterials materials) {
        if (materials.isKMSEnabled()) {
            return null;
        }
        return materials.getKeyPair() != null ? materials.getKeyPair().getPrivate() : materials.getSymmetricKey();
    }

    private static void validateKeyWrapAlgorithmForEncrypt(EncryptionMaterials materials,
                                                           InternalKeyWrapAlgorithm keyWrapAlgorithm) {

        if (materials.isKMSEnabled()) {
            validateKMSKeyWrapAlgorithmForEncrypt(materials, keyWrapAlgorithm);
            return;
        }
        if (materials.getKeyPair() != null && !keyWrapAlgorithm.isAsymmetric()) {
            throw new IllegalStateException(
                    String.format("Encryption materials with asymmetric keys are not consistent with selected " +
                                          "key wrap algorithm %s.", keyWrapAlgorithm));
        }
        if (materials.getSymmetricKey() != null && !keyWrapAlgorithm.isSymmetric()) {
            throw new IllegalStateException(
                    String.format("Encryption materials with a symmetric key are not consistent with selected " +
                                          "key wrap algorithm %s.", keyWrapAlgorithm));
        }
        return;
    }

    private static void validateKMSKeyWrapAlgorithmForEncrypt(EncryptionMaterials materials,
                                                                 InternalKeyWrapAlgorithm keyWrapAlgorithm) {
        if (!InternalKeyWrapAlgorithm.KMS.equals(keyWrapAlgorithm)) {
            throw new IllegalStateException(
                    String.format("KMS enabled encryption materials are not consistent with selected " +
                                          "key wrap algorithm %s.", keyWrapAlgorithm));
        }
        return;
    }

    private static void validateKeyWrapAlgorithmForDecrypt(InternalKeyWrapAlgorithm keyWrapAlgo, CryptoMode cryptoMode) {
        validateKeyWrapAlgorithmForDecrypt(keyWrapAlgo, false, cryptoMode);
    }

    private static void validateKeyWrapAlgorithmForDecrypt(InternalKeyWrapAlgorithm keyWrapAlgo,
                                                           boolean keyWrapExpected, CryptoMode cryptoMode) {
        if (CryptoMode.StrictAuthenticatedEncryption.equals(cryptoMode)) {
            if (keyWrapAlgo == null) {
                throw new KeyWrapException("No key wrap algorithm detected. Use crypto mode " +
                                                   CryptoMode.AuthenticatedEncryption + " to decrypt object.");
            }
            else if (keyWrapAlgo.isV1Algorithm()) {
                throw new KeyWrapException("Detected key wrap algorithm used with previous version of client. Use " +
                                                   "crypto mode " + CryptoMode.AuthenticatedEncryption + " to " +
                                                   "decrypt object.");
            }
        } else {
            if (keyWrapExpected && keyWrapAlgo == null) {
                throw new KeyWrapException("Key wrap expected, but no key wrap algorithm was found.");
            }
        }
    }

    private static void validateMaterialsForDecrypt(EncryptionMaterials materials, Map<String, String> mergedMatDesc,
                                                    CryptoMode cryptoMode, InternalKeyWrapAlgorithm keyWrapAlgorithm) {
        if (materials == null) {
            throw new SdkClientException("Unable to retrieve the client encryption materials");
        }
        if (keyWrapAlgorithm == null || !keyWrapAlgorithm.isKMS()) {
            return;
        }
        if (!keyWrapAlgorithm.isV1Algorithm()
            && KMSMaterialsHandler.isValidV2Description(materials.getMaterialsDescription(), mergedMatDesc)) {
            return;
        }
        boolean isValidV1MaterialsDescription =
            KMSMaterialsHandler.isValidV1Description(materials.getMaterialsDescription(), mergedMatDesc);
        if (keyWrapAlgorithm.isV1Algorithm() && isValidV1MaterialsDescription) {
            if (CryptoMode.AuthenticatedEncryption.equals(cryptoMode)) {
                return;
            } else {
                throw new IllegalStateException("A previous version of the client may have been used to encrypt " +
                                                        "key via KMS. Use crypto mode " +
                                                        CryptoMode.AuthenticatedEncryption + " to decrypt object.");
            }
        }
        throw new IllegalStateException("Provided encryption materials do not match information" +
                                                " retrieved from the encrypted object");
    }

    private static void assertCryptoSchemeAllowedForRangeGet(ContentCryptoScheme scheme,
                                                             CryptoMode cryptoMode,
                                                             CryptoRangeGetMode rangeGetMode) {
        if (!rangeGetMode.permitsCipherAlgorithm(cryptoMode, scheme.getCipherAlgorithm())) {
            if (CryptoRangeGetMode.DISABLED.equals(rangeGetMode)) {
                throw new SecurityException("Unable to perform range get request: Range get support has been disabled. " +
                    "See https://docs.aws.amazon.com/general/latest/gr/aws_sdk_cryptography.html");
            } else {
                throw new SecurityException(
                    "Range get support is not enabled for this content encryption type. Use " +
                        CryptoMode.AuthenticatedEncryption + " instead. See " +
                        "https://docs.aws.amazon.com/general/latest/gr/aws_sdk_cryptography.html");
            }
        }
    }
}
