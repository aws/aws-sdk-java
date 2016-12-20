/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import com.amazonaws.annotation.Immutable;
import com.amazonaws.annotation.SdkProtectedApi;

import java.nio.ByteBuffer;
import java.util.Map;

/**
 * Metadata about the HTTP response. Also includes the raw body content for debugging.
 */
@Immutable
public class SdkErrorHttpMetadata {

    private final ByteBuffer responseContent;

    private final SdkHttpMetadata httpMetadata;

    @SdkProtectedApi
    public SdkErrorHttpMetadata(SdkHttpMetadata httpMetadata,
                                byte[] responseContent) {
        this.httpMetadata = httpMetadata;
        this.responseContent = ByteBuffer.wrap(responseContent).asReadOnlyBuffer();
    }

    /**
     * @return All HTTP headers in response.
     */
    public Map<String, String> getHttpHeaders() {
        return httpMetadata.getHttpHeaders();
    }

    /**
     * @return HTTP status code of response.
     */
    public int getHttpStatusCode() {
        return httpMetadata.getHttpStatusCode();
    }

    /**
     * @return Response content as a {@link ByteBuffer}.
     */
    public ByteBuffer getResponseContent() {
        return responseContent;
    }
}
