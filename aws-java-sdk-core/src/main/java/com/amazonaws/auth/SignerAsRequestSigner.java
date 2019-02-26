/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *   http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package com.amazonaws.auth;

import com.amazonaws.SignableRequest;

/**
 * An adapter class that allows a {@link Signer} to implement the
 * {@link RequestSigner} interface
 */
public final class SignerAsRequestSigner implements RequestSigner {
    private final Signer signer;
    private final AWSCredentialsProvider credentialsProvider;

    /**
     * Creates a {@link SignerAsRequestSigner}
     * @param signer
     *          the underlying {@link Signer} to use to actually sign the request
     * @param credentialsProvider
     *          the credentialsProvider to use to pass {@link AWSCredentials} to the underlying {@link Signer}
     */
    public SignerAsRequestSigner(Signer signer, AWSCredentialsProvider credentialsProvider) {
        this.signer = signer;
        this.credentialsProvider = credentialsProvider;
    }

    /**
     * @see RequestSigner#sign(SignableRequest)
     */
    @Override
    public void sign(SignableRequest<?> request) {
        signer.sign(request, credentialsProvider.getCredentials());
    }
}
