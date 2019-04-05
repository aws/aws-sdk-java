/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.apigateway.internal;

import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.handlers.RequestHandler2;

import java.util.Map;

public final class AcceptJsonRequestHandler extends RequestHandler2 {

    @Override
    public void beforeRequest(Request<?> request) {
        // Some operations marshall to this header, so don't clobber if it exists
        if (!request.getHeaders().containsKey("Accept")) {
            request.addHeader("Accept", "application/json");
        }
    }

    @Override
    public void afterResponse(Request<?> request, Response<?> response) {
        // No-op.
    }

    @Override
    public void afterError(
            Request<?> request,
            Response<?> response,
            Exception e) {

        // No-op.
    }
}
