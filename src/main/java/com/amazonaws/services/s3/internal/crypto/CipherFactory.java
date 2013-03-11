/*
 * Copyright 2013-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.security.Provider;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 * Factory for creating Ciphers based on the crypto key and configuration
 * specified in the constructor.
 *
 * Each invocation of {@link #createCipher()} will produce a new, identical
 * Cipher object. Each returned Cipher will encrypt data with
 * <bold>exactly</bold> the same output as any other Cipher returned by this
 * instance of CipherFactory.
 */
public class CipherFactory {
    private SecretKey symmetricKey;
    private int cipherMode;
    private byte[] initVectorBytes;
    private Provider cryptoProvider;


    /**
     * Creates a new CipherFactory that will produce ciphers using the specified
     * key, mode, IV and provider.
     *
     * @param symmetricKey
     *            The symmetric key used in the ciphers created by this factory.
     * @param cipherMode
     *            The mode indicating whether the created ciphers are for
     *            encrypting or decrypting.
     * @param initVectorBytes
     *            The optional crypto IV used to initialize the ciphers.
     * @param cryptoProvider
     *            The optional Java crypto provider implementation, if an
     *            alternate crypto provider is to be used.
     */
    public CipherFactory(SecretKey symmetricKey, int cipherMode, byte[] initVectorBytes, Provider cryptoProvider) {
        this.symmetricKey = symmetricKey;
        this.cipherMode = cipherMode;
        this.initVectorBytes = initVectorBytes;
        this.cryptoProvider = cryptoProvider;
    }

    /**
     * Creates a new Cipher instance based on the crypto parameters specified in
     * the constructor. Each Cipher instance is identical to any other Cipher
     * produced by this CipherFactory.
     *
     * @return A new Cipher instance, identical to each Cipher produced by this
     *         factory instance.
     */
    public Cipher createCipher() {
        Cipher cipher = EncryptionUtils.createSymmetricCipher(symmetricKey, cipherMode, cryptoProvider, initVectorBytes);

        // If we weren't given an IV to use, make sure we store the one the first Cipher
        // used so we can use it for all future Ciphers created by this instance.
        if (initVectorBytes == null) initVectorBytes = cipher.getIV();

        return cipher;
    }

}