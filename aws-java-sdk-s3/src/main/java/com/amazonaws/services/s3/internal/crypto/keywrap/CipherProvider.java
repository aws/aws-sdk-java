/*
 * Copyright 2020-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.security.Provider;

import javax.crypto.Cipher;

public class CipherProvider {
    private final String algorithm;
    private final Provider provider;

    private CipherProvider(String algorithm, Provider provider) {
        this.algorithm = algorithm;
        this.provider = provider;
    }

    public static CipherProvider create(String algorithm) {
        return new CipherProvider(algorithm, null);
    }

    public static CipherProvider create(String algorithm, Provider provider) {
        return new CipherProvider(algorithm, provider);
    }

    public String algorithm() {
        return this.algorithm;
    }

    public Provider provider() {
        return this.provider;
    }

    public Cipher createCipher() {
        try {
            if (this.provider == null) {
                return Cipher.getInstance(this.algorithm);
            } else {
                return Cipher.getInstance(this.algorithm, this.provider);
            }
        } catch (Exception e) {
            throw failure(e, "An exception was thrown during the creation of a new Cipher for '" + provider + "'");
        }
    }
}
