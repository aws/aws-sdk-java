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

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;

public final class AesGcmKeyWrapper implements KeyWrapper {

    private static final String CIPHER_ALGORITHM = "AES/GCM/NoPadding";
    private static final int IV_LENGTH_IN_BYTES = 12;
    private static final int TAG_LENGTH_IN_BYTES = 16;
    private static final int TAG_LENGTH_IN_BITS = TAG_LENGTH_IN_BYTES * 8;

    private final CipherProvider cipherProvider;
    private final SecureRandom secureRandom;
    private final String cekAlgorithm;

    private AesGcmKeyWrapper(Builder b) {
        this.cipherProvider = validateNotNull(b.cipherProvider, "cipherProvider");
        this.secureRandom = b.secureRandom;
        this.cekAlgorithm = validateNotNull(b.cekAlgorithm, "cekAlgorithm");
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

    public CipherProvider cipherProvider() {
        return this.cipherProvider;
    }

    public SecureRandom secureRandom() {
        return this.secureRandom;
    }

    public String cekAlgorithm() {
        return this.cekAlgorithm;
    }

    @Override
    public byte[] unwrapCek(byte[] encryptedCek, Key key) {
        ByteBuffer encryptedCekBuff = ByteBuffer.wrap(encryptedCek);
        // Split the IV from the front of the ciphertext
        byte[] iv = new byte[IV_LENGTH_IN_BYTES];
        byte[] taggedCek = new byte[encryptedCek.length - IV_LENGTH_IN_BYTES];
        encryptedCekBuff.get(iv);
        encryptedCekBuff.get(taggedCek);

        Cipher cipher = this.cipherProvider.createCipher();
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(TAG_LENGTH_IN_BITS, iv);
        try {
            cipher.init(Cipher.DECRYPT_MODE, key, gcmParameterSpec);
            cipher.updateAAD(this.cekAlgorithm.getBytes(StandardCharsets.UTF_8));
            return cipher.doFinal(taggedCek);
        } catch (Exception e) {
            throw failure(e, "An exception was thrown when attempting to decrypt the Content Encryption Key");
        }
    }

    @Override
    public byte[] wrapCek(byte[] plaintextCek, Key key) {
        if (this.secureRandom == null) {
            throw new NullPointerException("Error initializing AesGcmKeyWrapper for wrapping: 'secureRandom' cannot" +
                                               " be null");
        }

        Cipher cipher = this.cipherProvider.createCipher();
        byte[] iv = new byte[IV_LENGTH_IN_BYTES];
        secureRandom.nextBytes(iv);
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(TAG_LENGTH_IN_BITS, iv);
        try {
            cipher.init(Cipher.ENCRYPT_MODE, key, gcmParameterSpec, this.secureRandom);
            cipher.updateAAD(this.cekAlgorithm.getBytes(StandardCharsets.UTF_8));

            // Prepend randomly generated IV to the cipherText
            return concat(cipher.getIV(), cipher.doFinal(plaintextCek));
        } catch (Exception e) {
            throw failure(e, "An exception was thrown when attempting to encrypt the Content Encryption Key");
        }
    }

    private <T> T validateNotNull(T obj, String propertyName) {
        if (obj == null) {
            throw new NullPointerException("Error initializing AesGcmKeyWrapper: '" + propertyName +
                                               "' cannot be null");
        }

        return obj;
    }

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] c = new byte[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }

    public final static class Builder {
        private CipherProvider cipherProvider;
        private SecureRandom secureRandom;
        private String cekAlgorithm;

        private Builder() {
        }

        public Builder cipherProvider(CipherProvider cipherProvider) {
            this.cipherProvider = cipherProvider;
            return this;
        }

        public Builder secureRandom(SecureRandom secureRandom) {
            this.secureRandom = secureRandom;
            return this;
        }

        public Builder cekAlgorithm(String cekAlgorithm) {
            this.cekAlgorithm = cekAlgorithm;
            return this;
        }

        public AesGcmKeyWrapper build() {
            return new AesGcmKeyWrapper(this);
        }
    }
}
