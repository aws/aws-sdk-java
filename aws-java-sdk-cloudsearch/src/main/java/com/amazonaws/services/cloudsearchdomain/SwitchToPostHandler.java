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
package com.amazonaws.services.cloudsearchdomain;

import com.amazonaws.Request;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudsearchdomain.model.SearchRequest;
import com.amazonaws.util.SdkHttpUtils;

import java.io.ByteArrayInputStream;

/**
 * Ensures that all SearchRequests use <code>POST<code> instead of <code>GET</code>.
 */
public class SwitchToPostHandler extends RequestHandler2 {
    @Override
    public void beforeRequest(Request<?> request) {
        if (request.getOriginalRequest() instanceof SearchRequest && request.getHttpMethod() == HttpMethodName.GET) {
            request.setHttpMethod(HttpMethodName.POST);
            final byte[] content = SdkHttpUtils.encodeParameters(request).getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Type", "application/x-www-form-urlencoded");
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.getParameters().clear();
        }
    }
}
