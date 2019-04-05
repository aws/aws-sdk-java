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
import com.amazonaws.annotation.SdkTestInternalApi;
import com.amazonaws.util.BinaryUtils;

import static com.amazonaws.auth.internal.SignerConstants.X_AMZ_CONTENT_SHA256;

/**
 * Exactly the same as {@link AWS4Signer} except if the request is being sent
 * over HTTPS, then it returns the string <code>UNSIGNED-PAYLOAD</code> as the
 * content SHA-256 so services that support it can avoid needing to calculate
 * the value when authorizing the request.
 * <p>
 * Payloads are still signed for requests over HTTP to preserve the request
 * integrity over a non-secure transport.
 */
public class AWS4UnsignedPayloadSigner extends AWS4Signer {
    public AWS4UnsignedPayloadSigner() {
        super();
    }

    @SdkTestInternalApi
    public AWS4UnsignedPayloadSigner(SdkClock clock) {
        super(clock);
    }

    @Override
    public void sign(SignableRequest<?> request, AWSCredentials credentials) {
        request.getHeaders().put(X_AMZ_CONTENT_SHA256, "required");
        super.sign(request, credentials);
    }

    @Override
    protected String calculateContentHash(SignableRequest<?> request) {
        if ("https".equals(request.getEndpoint().getScheme())) {
            return "UNSIGNED-PAYLOAD";
        }
        return super.calculateContentHash(request);
    }
}
