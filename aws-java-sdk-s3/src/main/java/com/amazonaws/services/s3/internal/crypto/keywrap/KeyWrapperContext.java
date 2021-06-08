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

import java.security.Provider;
import java.security.SecureRandom;

import com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme;
import com.amazonaws.services.s3.model.EncryptionMaterials;

public class KeyWrapperContext {
    private final byte[] cekSecured;
    private final EncryptionMaterials materials;
    private final ContentCryptoScheme contentCryptoScheme;
    private final KMSKeyWrapperContext kmsKeyWrapperContext;
    private final InternalKeyWrapAlgorithm internalKeyWrapAlgorithm;
    private final Provider cryptoProvider;
    private final SecureRandom secureRandom;

    private KeyWrapperContext(Builder b) {
        this.cekSecured = b.cekSecured;
        this.internalKeyWrapAlgorithm = b.internalKeyWrapAlgorithm;
        this.materials = b.materials;
        this.contentCryptoScheme = b.contentCryptoScheme;
        this.kmsKeyWrapperContext = b.kmsKeyWrapperContext;
        this.cryptoProvider = b.cryptoProvider;
        this.secureRandom = b.secureRandom;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * the content encrypting key in wrapped or encrypted form; must not be null
     */
    public byte[] cekSecured() {
        return cekSecured;
    }

    /**
     * key wrapping algorithm; or null if direct encryption instead of key wrapping is used
     */
    public InternalKeyWrapAlgorithm internalKeyWrapAlgorithm() {
        return internalKeyWrapAlgorithm;
    }

    /**
     * the client key encrypting key material for the content encrypting key
     */
    public EncryptionMaterials materials() {
        return materials;
    }

    public ContentCryptoScheme contentCryptoScheme() {
        return contentCryptoScheme;
    }

    public KMSKeyWrapperContext kmsKeyWrapperContext() {
        return kmsKeyWrapperContext;
    }

    public Provider cryptoProvider() {
        return cryptoProvider;
    }

    public SecureRandom secureRandom() {
        return secureRandom;
    }

    public static class Builder {
        private byte[] cekSecured;
        private EncryptionMaterials materials;
        private ContentCryptoScheme contentCryptoScheme;
        private KMSKeyWrapperContext kmsKeyWrapperContext;
        private InternalKeyWrapAlgorithm internalKeyWrapAlgorithm;
        private Provider cryptoProvider;
        private SecureRandom secureRandom;

        public Builder cekSecured(byte[] cekSecured) {
            this.cekSecured = cekSecured;
            return this;
        }

        public Builder internalKeyWrapAlgorithm(InternalKeyWrapAlgorithm keyWrapAlgo) {
            this.internalKeyWrapAlgorithm = keyWrapAlgo;
            return this;
        }

        public Builder materials(EncryptionMaterials materials) {
            this.materials = materials;
            return this;
        }

        public Builder contentCryptoScheme(ContentCryptoScheme contentCryptoScheme) {
            this.contentCryptoScheme = contentCryptoScheme;
            return this;
        }

        public Builder kmsKeyWrapperContext(KMSKeyWrapperContext kmsKeyWrapperContext) {
            this.kmsKeyWrapperContext = kmsKeyWrapperContext;
            return this;
        }

        public Builder cryptoProvider(Provider cryptoProvider) {
            this.cryptoProvider = cryptoProvider;
            return this;
        }

        public Builder secureRandom(SecureRandom secureRandom) {
            this.secureRandom = secureRandom;
            return this;
        }

        public KeyWrapperContext build() {
            return new KeyWrapperContext(this);
        }
    }
}
