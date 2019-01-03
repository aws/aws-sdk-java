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

import com.amazonaws.http.conn.ssl.SdkTLSSocketFactory;
import com.amazonaws.internal.SdkSSLContext;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;

import java.security.SecureRandom;

/**
 * Proxy integration tests for {@link SdkTLSSocketFactory}.
 */
public class SdkTLSSocketFactoryProxyIntegrationTest extends AbstractConnectionSocketFactoryProxyIntegrationTestBase {
    @Override
    protected ConnectionSocketFactory getFactory() {
        return new SdkTLSSocketFactory(SdkSSLContext.getPreferredSSLContext(new SecureRandom()),
                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
    }
}
