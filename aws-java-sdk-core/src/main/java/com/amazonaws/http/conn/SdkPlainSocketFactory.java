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

package com.amazonaws.http.conn;

import com.amazonaws.http.apache.utils.HttpContextUtils;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/**
 * Socket factory for creating plain (non TLS) connections.
 */
public class SdkPlainSocketFactory extends PlainConnectionSocketFactory {
    @Override
    public Socket createSocket(HttpContext ctx) throws IOException {
        if (HttpContextUtils.disableSocketProxy(ctx)) {
            return new Socket(Proxy.NO_PROXY);
        }
        return super.createSocket(ctx);
    }
}
