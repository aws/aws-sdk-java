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

import com.amazonaws.services.s3.internal.crypto.CryptoUtils;

public final class RsaOaepKeyWrapperProvider implements KeyWrapperProvider {
    private static final RsaOaepKeyWrapperProvider DEFAULT_SHA1 =
        new RsaOaepKeyWrapperProvider(InternalKeyWrapAlgorithm.RSA_OAEP_SHA1);

    private final InternalKeyWrapAlgorithm cryptoKeyWrapAlgorithm;

    private RsaOaepKeyWrapperProvider(InternalKeyWrapAlgorithm cryptoKeyWrapAlgorithm) {
        this.cryptoKeyWrapAlgorithm = cryptoKeyWrapAlgorithm;
    }

    public static RsaOaepKeyWrapperProvider createSha1() {
        return DEFAULT_SHA1;
    }

    @Override
    public InternalKeyWrapAlgorithm algorithm() {
        return this.cryptoKeyWrapAlgorithm;
    }

    @Override
    public KeyWrapper createKeyWrapper(KeyWrapperContext keyWrapperContext) {
        String remappedCekAlgorithm = CryptoUtils.normalizeContentAlgorithmForValidation(
            keyWrapperContext.contentCryptoScheme().getCipherAlgorithm());

        return RsaOaepKeyWrapper.builder()
                                .cipherProvider(CipherProvider.create(RsaOaepKeyWrapper.cipherAlgorithm(),
                                                                      keyWrapperContext.cryptoProvider()))
                                .cryptoKeyWrapAlgorithm(this.cryptoKeyWrapAlgorithm)
                                .cekAlgorithm(remappedCekAlgorithm)
                                .build();
    }
}
