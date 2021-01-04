/*
 * Copyright 2011-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Metadata about the HTTP response.
 */
@Immutable
public class SdkHttpMetadata {

    private final Map<String, List<String>> allHeaders;
    private final Map<String, String> httpHeaders;

    private final int httpStatusCode;

    private SdkHttpMetadata(Map<String, String> httpHeaders, Map<String, List<String>> allHeaders, int httpStatusCode) {
        this.httpHeaders = Collections.unmodifiableMap(httpHeaders);
        this.allHeaders = unmodifiableHeaders(allHeaders);
        this.httpStatusCode = httpStatusCode;
    }

    /**
     * @return All HTTP headers in response.
     * @deprecated See {@link #getAllHttpHeaders()}
     */
    public Map<String, String> getHttpHeaders() {
        return httpHeaders;
    }

    /**
     * Returns all the headers sent in a response. Unlike
     * {@link #getHttpHeaders()}, this returns all the values given for a
     * field-name, rather than the last seen value.
 *
     * @return All the headers returned in a response.
     */
    public Map<String, List<String>> getAllHttpHeaders() {
        return allHeaders;
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
        return new SdkHttpMetadata(httpResponse.getHeaders(), httpResponse.getAllHeaders(), httpResponse.getStatusCode());
    }

    private Map<String, List<String>> unmodifiableHeaders(Map<String, List<String>> allHeaders) {
        Map<String, List<String>> unmodifiable = new HashMap<String, List<String>>();
        for (Map.Entry<String, List<String>> e : allHeaders.entrySet()) {
            unmodifiable.put(e.getKey(), Collections.unmodifiableList(e.getValue()));
        }
        return Collections.unmodifiableMap(unmodifiable);
    }
}
