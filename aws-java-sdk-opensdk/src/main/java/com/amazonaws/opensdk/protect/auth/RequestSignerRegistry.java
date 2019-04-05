/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.opensdk.protect.auth;

import com.amazonaws.auth.RequestSigner;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Hold references to all of the available RequestSigners and can
 * retrieve a RequestSigner implementation of a given type (if it
 * exists in the registry)
 */
public final class RequestSignerRegistry implements RequestSignerProvider {

    private final Map<Class<? extends RequestSigner>, RequestSigner> signerForType;

    public RequestSignerRegistry() {
        signerForType = Collections.emptyMap();
    }

    private RequestSignerRegistry(Map<Class<? extends RequestSigner>, RequestSigner> registeredSignersMap) {
        signerForType = Collections.unmodifiableMap(registeredSignersMap);
    }

    /**
     * Register an requestSigner
     * @param requestSigner
     *      an instance of an RequestSigner to use for a given type
     * @param signerType
     *      the type of requestSigner that this instance will be used for
     */
    public RequestSignerRegistry register(RequestSigner requestSigner, Class<? extends RequestSigner> signerType) {
        Map<Class<? extends RequestSigner>, RequestSigner> registeredSigners = new HashMap<>();
        registeredSigners.putAll(signerForType);
        registeredSigners.put(signerType, requestSigner);
        return new RequestSignerRegistry(registeredSigners);
    }

    @Override
    public Optional<RequestSigner> getSigner(Class<? extends RequestSigner> requestSignerType) {
        return Optional.ofNullable(signerForType.get(requestSignerType));
    }
}
