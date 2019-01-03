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
package com.amazonaws.services.kinesisvideo.internal.netty.util;

import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.StringUtils;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.DefaultHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.QueryStringEncoder;
import java.util.List;
import java.util.Map;

public final class RequestAdapter {

    /**
     * Adapts an SDK {@link Request} object to a Netty {@link HttpRequest}.
     */
    public static HttpRequest adapt(Request<?> sdkRequest) {
        String uri = uriFrom(sdkRequest);
        HttpMethod method = toNettyHttpMethod(sdkRequest.getHttpMethod());
        DefaultHttpRequest request = new DefaultHttpRequest(HttpVersion.HTTP_1_1, method, uri, new DefaultHttpHeaders());
        for (Map.Entry<String, String> header : sdkRequest.getHeaders().entrySet()) {
            request.headers().add(header.getKey(), resolveValue(header.getValue()));
        }
        return request;
    }

    /**
     * Netty doesn't like null so we send header as an empty string.
     *
     * @param value Value to resolve.
     * @return Empty string if value is null, otherwise just the original value.
     */
    private static String resolveValue(String value) {
        return value == null ? "" : value;
    }

    private static String uriFrom(Request<?> sdkRequest) {
        StringBuilder uriBuilder = new StringBuilder(sdkRequest.getEndpoint().toString());
        if (!StringUtils.isNullOrEmpty(sdkRequest.getResourcePath())) {
            uriBuilder.append(sdkRequest.getResourcePath());
        }

        QueryStringEncoder encoder = new QueryStringEncoder(uriBuilder.toString());
        for (Map.Entry<String, List<String>> param : sdkRequest.getParameters().entrySet()) {
            for (String value : param.getValue()) {
                encoder.addParam(param.getKey(), value);
            }
        }
        return encoder.toString();
    }

    private static HttpMethod toNettyHttpMethod(HttpMethodName method) {
        return HttpMethod.valueOf(method.name());
    }
}
