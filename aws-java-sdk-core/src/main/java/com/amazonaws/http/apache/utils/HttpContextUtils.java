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

package com.amazonaws.http.apache.utils;

import com.amazonaws.annotation.SdkInternalApi;
import org.apache.http.protocol.HttpContext;

@SdkInternalApi
public final class HttpContextUtils {
    public static final String DISABLE_SOCKET_PROXY_PROPERTY = "com.amazonaws.disableSocketProxy";
    private HttpContextUtils() {
    }

    public static boolean disableSocketProxy(HttpContext ctx) {
        Object v = ctx.getAttribute(DISABLE_SOCKET_PROXY_PROPERTY);
        return v != null && (Boolean) v;
    }
}
