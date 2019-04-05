/*
 * Copyright 2013-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.client.HttpClient;

import com.amazonaws.internal.SdkFilterInputStream;

/**
 * An {@code InputStream} that closes the associated {@code HttpClient}
 * when the stream is closed.
 */
class HttpClientWrappingInputStream extends SdkFilterInputStream {

    private final HttpClient client;

    /**
     * @param client the {@code HttpClient} to wrap
     * @param stream the {@code InputStream} to wrap
     */
    public HttpClientWrappingInputStream(
            final HttpClient client,
            final InputStream stream) {

        super(stream);
        this.client = client;
    }

    @Override
    @SuppressWarnings("deprecation")
    public void close() throws IOException {
        try {
            super.close();
        } finally {
            client.getConnectionManager().shutdown();
        }
    }
}