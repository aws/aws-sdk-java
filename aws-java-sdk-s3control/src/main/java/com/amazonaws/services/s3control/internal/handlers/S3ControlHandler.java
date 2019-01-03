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

package com.amazonaws.services.s3control.internal.handlers;

import com.amazonaws.Request;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.s3.request.S3HandlerContextKeys;
import java.io.ByteArrayInputStream;

/**
 * Turns on payload signing and prevents moving query params to body during a POST which S3 doesn't like.
 */
@SdkInternalApi
public final class S3ControlHandler extends RequestHandler2 {

    @Override
    public void beforeRequest(Request<?> request) {
        request.addHandlerContext(S3HandlerContextKeys.IS_PAYLOAD_SIGNING_ENABLED, true);
        if (request.getContent() == null && request.getHttpMethod() == HttpMethodName.POST) {
            request.setContent(new ByteArrayInputStream(new byte[0]));
        }
    }
}
