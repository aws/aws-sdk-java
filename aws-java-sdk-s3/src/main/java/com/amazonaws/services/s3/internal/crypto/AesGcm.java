/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

class AesGcm extends ContentCryptoScheme {
    @Override String getKeyGeneratorAlgorithm() { return "AES"; }
    @Override String getCipherAlgorithm() { return "AES/GCM/NoPadding"; }
    @Override int getKeyLengthInBits() { return 256; }
    @Override int getBlockSizeInBytes() { return 16; }
    @Override int getIVLengthInBytes() { return 12; }
    @Override long getMaxPlaintextSize() { return MAX_GCM_BYTES; }
    /**
     * Used to explicitly record the tag length in S3 for interoperability
     * with other services.
     */
    @Override int getTagLengthInBits() { return 128; }
    /**
     * Currently only Bouncy Castle can support the AES/GCM cipher in
     * Java 6 without having to use the AEAD API in Java 7+.
     */
    @Override String getPreferredCipherProvider() { return "BC"; }

    @Override
    CipherLite createAuxillaryCipher(SecretKey cek, byte[] ivOrig,
            int cipherMode, Provider securityProvider, long startingBytePos)
            throws InvalidKeyException, NoSuchAlgorithmException,
            NoSuchProviderException, NoSuchPaddingException,
            InvalidAlgorithmParameterException {
        byte[] iv = AES_CTR.adjustIV(ivOrig, startingBytePos);
        return AES_CTR.createCipherLite(cek, iv, cipherMode, securityProvider, false);
    }

    @Override
    protected CipherLite newCipherLite(Cipher cipher,  SecretKey cek, int cipherMode) {
        return new GCMCipherLite(cipher, cek, cipherMode);
    }
}
