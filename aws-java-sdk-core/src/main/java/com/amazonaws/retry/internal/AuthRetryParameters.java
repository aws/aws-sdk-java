/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.retry.internal;

import java.net.URI;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.auth.Signer;

/**
 * Signer and endpoint parameters that are to be used for the next retry.
 * <p>
 * For internal use only.
 */
@Immutable
public class AuthRetryParameters {

    private final Signer signerForRetry;
    private final URI endpointForRetry;

    public AuthRetryParameters(Signer signer, URI endpoint) {
        if (signer == null)
            throw new NullPointerException("signer");
        if (endpoint == null)
            throw new NullPointerException("endpoint");

        this.signerForRetry = signer;
        this.endpointForRetry = endpoint;
    }

    public Signer getSignerForRetry() {
        return signerForRetry;
    }

    public URI getEndpointForRetry() {
        return endpointForRetry;
    }

}
