/*
 * Copyright 2020-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.internal.crypto.keywrap;

import static com.amazonaws.util.Throwables.failure;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;

public final class RsaOaepKeyWrapper implements KeyWrapper {

    private static final String CIPHER_ALGORITHM = "RSA/ECB/OAEPPadding";
    private static final Map<InternalKeyWrapAlgorithm, String> DIGEST_SCHEME_MAP;
    private static final Map<InternalKeyWrapAlgorithm, Mgf1Scheme> MGF1_SCHEME_MAP;

    static {
        Map<InternalKeyWrapAlgorithm, String> mdMap = new HashMap<>();
        mdMap.put(InternalKeyWrapAlgorithm.RSA_OAEP_SHA1, "SHA-1");
        DIGEST_SCHEME_MAP = Collections.unmodifiableMap(mdMap);

        Map<InternalKeyWrapAlgorithm, Mgf1Scheme> mgf1Map = new HashMap<>();
        mgf1Map.put(InternalKeyWrapAlgorithm.RSA_OAEP_SHA1, Mgf1Scheme.MGF1_SHA1);
        MGF1_SCHEME_MAP = Collections.unmodifiableMap(mgf1Map);
    }

    private final CipherProvider cipherProvider;
    private final String digestScheme;
    private final Mgf1Scheme mgf1Scheme;
    private final InternalKeyWrapAlgorithm cryptoKeyWrapAlgorithm;
    private final String cekAlgorithm;
    private final byte[] encodedCekAlgorithm;

    private RsaOaepKeyWrapper(Builder b) {
        this.cipherProvider = validateNotNull(b.cipherProvider, "cipherProvider");
        this.cryptoKeyWrapAlgorithm = validateNotNull(b.cryptoKeyWrapAlgorithm, "cryptoKeyAlgorithm");
        this.cekAlgorithm = validateNotNull(b.cekAlgorithm, "cekAlgorithm");
        this.encodedCekAlgorithm = b.cekAlgorithm.getBytes(StandardCharsets.UTF_8);
        this.digestScheme = DIGEST_SCHEME_MAP.get(this.cryptoKeyWrapAlgorithm);
        this.mgf1Scheme = MGF1_SCHEME_MAP.get(this.cryptoKeyWrapAlgorithm);

        if (this.mgf1Scheme == null) {
            throw new IllegalArgumentException("No valid MGF1 scheme could be found for cryptoKeyAlgorithm '" +
                                                   this.cryptoKeyWrapAlgorithm.algorithmName() + "'");
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * The cipher algorithm name is the string used to correctly configure the cipher provider.
     * Do not confuse with {@link InternalKeyWrapAlgorithm#algorithmName()} which is an agreed-upon term
     * within Amazon Web Services.
     */
    public static String cipherAlgorithm() {
        return CIPHER_ALGORITHM;
    }

    @Override
    public byte[] unwrapCek(byte[] wrappedCek, Key key) {
        Cipher cipher = this.cipherProvider.createCipher();

        OAEPParameterSpec oaepParams =
            new OAEPParameterSpec(digestScheme, "MGF1", mgf1Scheme.getMgf1ParameterSpec(), PSource.PSpecified.DEFAULT);

        try {
            cipher.init(Cipher.UNWRAP_MODE, key, oaepParams);
            Key unwrappedKey =
                cipher.unwrap(wrappedCek, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, Cipher.SECRET_KEY);
            return splitConcatenatedKey(unwrappedKey.getEncoded());
        } catch (Exception e) {
            throw failure(e, "An exception was thrown when attempting to decrypt the Content Encryption Key");
        }
    }

    @Override
    public byte[] wrapCek(byte[] unwrappedCek, Key key) {
        Cipher cipher = this.cipherProvider.createCipher();

        OAEPParameterSpec oaepParams =
            new OAEPParameterSpec(digestScheme, "MGF1", mgf1Scheme.getMgf1ParameterSpec(), PSource.PSpecified.DEFAULT);

        try {
            cipher.init(Cipher.WRAP_MODE, key, oaepParams);
            return cipher.wrap(new SecretKeySpec(createCompositeCek(unwrappedCek),
                                                 JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM));
        } catch (Exception e) {
            throw failure(e, "An exception was thrown when attempting to encrypt the Content Encryption Key");
        }
    }

    public CipherProvider cipherProvider() {
        return cipherProvider;
    }

    public Mgf1Scheme mgf1Scheme() {
        return mgf1Scheme;
    }

    public String cekAlgorithm() {
        return this.cekAlgorithm;
    }

    private <T> T validateNotNull(T obj, String propertyName) {
        if (obj == null) {
            throw new NullPointerException("Error initializing RsaOaepKeyWrapper: '" + propertyName +
                                               "' cannot be null");
        }

        return obj;
    }

    private byte[] createCompositeCek(byte[] cek) {
        int concatenatedKeyLength = 1 + cek.length + encodedCekAlgorithm.length;
        byte[] concatenatedKeyValue = new byte[concatenatedKeyLength];
        concatenatedKeyValue[0] = (byte) cek.length;
        System.arraycopy(cek, 0, concatenatedKeyValue, 1, cek.length);
        System.arraycopy(encodedCekAlgorithm, 0, concatenatedKeyValue, 1 + cek.length, encodedCekAlgorithm.length);
        return concatenatedKeyValue;
    }

    private byte[] splitConcatenatedKey(byte[] concatenatedKek) {
        int keyLength = concatenatedKek[0];
        int algoLength = concatenatedKek.length - keyLength - 1;

        if (!isValidKeyLength(keyLength)) {
            throw new SecurityException("invalid key length in composite CEK");
        }

        if (algoLength <= 0) {
            throw new SecurityException("invalid algorithm length in composite CEK");
        }

        byte[] cek = new byte[keyLength];
        byte[] algo = new byte[algoLength];
        System.arraycopy(concatenatedKek, 1, cek, 0, keyLength);
        System.arraycopy(concatenatedKek, 1 + keyLength, algo, 0, algoLength);

        if (!Arrays.equals(algo, this.encodedCekAlgorithm)) {
            throw new SecurityException("The content encryption algorithm used at encryption time does not match the " +
                                            "algorithm stored for decryption time. The object may be altered or " +
                                            "corrupted.");
        }

        return cek;
    }

    private static boolean isValidKeyLength(int keyLength) {
        return keyLength == 16 || keyLength == 24 || keyLength == 32;
    }

    public final static class Builder {
        private CipherProvider cipherProvider;
        private InternalKeyWrapAlgorithm cryptoKeyWrapAlgorithm;
        private String cekAlgorithm;

        private Builder() {
        }

        public Builder cipherProvider(CipherProvider cipherProvider) {
            this.cipherProvider = cipherProvider;
            return this;
        }

        public Builder cryptoKeyWrapAlgorithm(InternalKeyWrapAlgorithm cryptoKeyWrapAlgorithm) {
            this.cryptoKeyWrapAlgorithm = cryptoKeyWrapAlgorithm;
            return this;
        }

        public Builder cekAlgorithm(String cekAlgorithm) {
            this.cekAlgorithm = cekAlgorithm;
            return this;
        }

        public RsaOaepKeyWrapper build() {
            return new RsaOaepKeyWrapper(this);
        }
    }
}
