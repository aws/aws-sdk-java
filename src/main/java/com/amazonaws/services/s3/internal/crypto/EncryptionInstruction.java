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
package com.amazonaws.services.s3.internal.crypto;

import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/**
 * Contains information used to encrypt and decrypt objects in S3.
 */
public class EncryptionInstruction {

    private final Map<String, String> materialsDescription;
    private final byte[] encryptedSymmetricKey;
    private final SecretKey symmetricKey;
    private final Cipher symmetricCipher;

    /**
     * Construct a new EncryptionInstruction object with the provided fields.
     * 
     * @param materialsDescription
     *      The description of the encryption materials that were used to encrypt the envelope symmetric key.
     * @param encryptedSymmetricKey
     *      A byte[] array representing an encrypted envelope symmetric key.
     * @param symmetricKey
     *      The symmetric key used to create the cipher that will encrypt the object data.
     * @param symmetricCipher
     *      The symmetric cipher that will encrypt the object data.
     */
    public EncryptionInstruction(Map<String, String> materialsDescription, byte[] encryptedSymmetricKey, SecretKey symmetricKey, Cipher symmetricCipher) {              
        this.materialsDescription = materialsDescription;
        this.encryptedSymmetricKey = encryptedSymmetricKey;
        this.symmetricKey = symmetricKey;
        this.symmetricCipher = symmetricCipher;
    }

    /**
     * Returns the description of the encryption materials that were used to encrypt the envelope symmetric key.
     * 
     * @return the description of the encryption materials that were used to encrypt the envelope symmetric key.
     */
    public Map<String, String> getMaterialsDescription() {
        return this.materialsDescription;
    }

    /**
     * Returns an array of bytes representing the encrypted envelope symmetric key.
     * 
     * @return an array of bytes representing the encrypted envelope symmetric key.
     */
    public byte[] getEncryptedSymmetricKey() {
        return this.encryptedSymmetricKey;
    }

    /**
     * Returns the envelope symmetric key.
     * 
     * @return the envelope symmetric key.
     */
    public SecretKey getSymmetricKey() {
        return this.symmetricKey;
    }

    /**
     * Returns the symmetric cipher created with the envelope symmetric key.
     * 
     * @return the symmetric cipher created with the envelope symmetric key.
     */
    public Cipher getSymmetricCipher() {
        return this.symmetricCipher;
    }
}
