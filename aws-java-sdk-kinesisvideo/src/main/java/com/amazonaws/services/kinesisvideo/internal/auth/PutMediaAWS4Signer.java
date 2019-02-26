/*
 * Copyright 2012-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.kinesisvideo.internal.auth;

import com.amazonaws.SignableRequest;
import com.amazonaws.auth.AWS4Signer;
import com.amazonaws.auth.internal.SignerConstants;

/**
 * Signer for PutMedia operation which does not sign the chunked payload.
 */
public class PutMediaAWS4Signer extends AWS4Signer {

    // TODO use UNSIGNED
    private static final String CONTENT_STREAMING_PAYLOAD = "STREAMING-AWS4-HMAC-SHA256-PAYLOAD";

    public PutMediaAWS4Signer(String region) {
        setServiceName("kinesisvideo");
        setRegionName(region);
    }

    @Override
    protected String calculateContentHash(final SignableRequest<?> request) {
        request.addHeader(SignerConstants.X_AMZ_CONTENT_SHA256, CONTENT_STREAMING_PAYLOAD);
        return CONTENT_STREAMING_PAYLOAD;
    }
}
