/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.request;

import com.amazonaws.handlers.HandlerContextKey;
import com.amazonaws.services.s3.S3ClientOptions;
import com.amazonaws.services.s3.internal.AWSS3V4Signer;

/**
 * Constants for {@link HandlerContextKey} pertaining to S3
 */
public class S3HandlerContextKeys {

    /**
     * Context provided to {@link AWSS3V4Signer} to determine whether chunked encoding should be used
     * or not. Derived from the value set in {@link S3ClientOptions}
     */
    public static final HandlerContextKey<Boolean> IS_CHUNKED_ENCODING_DISABLED = new HandlerContextKey<Boolean>(
            "IsChunkedEncodingDisabled");

    /**
     * Context provided to {@link AWSS3V4Signer} to determine whether payloads should be signed.  If enabled,
     * payload hash will be computed when constructing the request.  This does incur a performance penalty.
     * Derived from the value set in {@link S3ClientOptions}
     */
    public static final HandlerContextKey<Boolean> IS_PAYLOAD_SIGNING_ENABLED = new HandlerContextKey<Boolean>(
            "IsPayloadSigningEnabled");

}
