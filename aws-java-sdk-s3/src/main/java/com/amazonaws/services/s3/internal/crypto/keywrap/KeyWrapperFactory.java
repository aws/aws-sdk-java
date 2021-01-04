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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KeyWrapperFactory {
    private static final KeyWrapperFactory DEFAULT =
        KeyWrapperFactory.builder()
                         .addKeyWrapper(AesGcmKeyWrapperProvider.create())
                         .addKeyWrapper(RsaOaepKeyWrapperProvider.createSha1())
                         .addKeyWrapper(KMSKeyWrapperProvider.create())
                         .build();

    private final Map<InternalKeyWrapAlgorithm, KeyWrapperProvider> keyWrapperProviderMap;

    private KeyWrapperFactory(Builder b) {
        Map<InternalKeyWrapAlgorithm, KeyWrapperProvider> mutableKeyWrapperMap = new HashMap<>();

        for (KeyWrapperProvider keyWrapper : b.keyWrapperProviders) {
            mutableKeyWrapperMap.put(keyWrapper.algorithm(), keyWrapper);
        }

        this.keyWrapperProviderMap = Collections.unmodifiableMap(mutableKeyWrapperMap);
    }

    public static KeyWrapperFactory defaultInstance() {
        return DEFAULT;
    }

    public static Builder builder() {
        return new Builder();
    }

    public KeyWrapper createKeyWrapper(KeyWrapperContext context) {
        KeyWrapperProvider keyWrapperProvider = this.keyWrapperProviderMap.get(context.internalKeyWrapAlgorithm());

        if (keyWrapperProvider == null) {
            throw new SecurityException("A key wrapping algorithm could not be found for '" +
                                                context.internalKeyWrapAlgorithm() + "'");
        }

        return keyWrapperProvider.createKeyWrapper(context);
    }

    public static class Builder {
        private Collection<KeyWrapperProvider> keyWrapperProviders;

        public Builder addKeyWrapper(KeyWrapperProvider keyWrapperProvider) {
            if (keyWrapperProviders == null) {
                keyWrapperProviders = new ArrayList<>();
            }

            keyWrapperProviders.add(keyWrapperProvider);
            return this;
        }

        public KeyWrapperFactory build() {
            return new KeyWrapperFactory(this);
        }
    }
}
