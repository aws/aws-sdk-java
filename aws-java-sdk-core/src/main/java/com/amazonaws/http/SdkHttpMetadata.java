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
package com.amazonaws.http;

import com.amazonaws.annotation.Immutable;

import java.util.Collections;
import java.util.Map;

/**
 * Metadata about the HTTP response.
 */
@Immutable
public class SdkHttpMetadata {

    private final Map<String, String> httpHeaders;

    private final int httpStatusCode;

    private SdkHttpMetadata(Map<String, String> httpHeaders, int httpStatusCode) {
        this.httpHeaders = Collections.unmodifiableMap(httpHeaders);
        this.httpStatusCode = httpStatusCode;
    }

    /**
     * @return All HTTP headers in response.
     */
    public Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * @return HTTP status code of response.
     */
    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    /**
     * Static factory to create an {@link SdkHttpMetadata} from the details in a {@link
     * HttpResponse}.
     */
    public static SdkHttpMetadata from(HttpResponse httpResponse) {
        return new SdkHttpMetadata(httpResponse.getHeaders(), httpResponse.getStatusCode());
    }

}
