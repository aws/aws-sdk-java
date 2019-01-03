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
package com.amazonaws.auth;

import com.amazonaws.SignableRequest;

/**
 * A strategy for applying cryptographic signatures to a request, proving
 * that the request was made by someone in posession of the given set of
 * credentials without transmitting the secret key over the wire.
 */
public interface Signer {
    /**
     * Sign the given request with the given set of credentials. Modifies the
     * passed-in request to apply the signature.
     *
     * @param request      The request to sign.
     * @param credentials  The credentials to sign the request with.
     */
    public void sign(SignableRequest<?> request, AWSCredentials credentials);
}
