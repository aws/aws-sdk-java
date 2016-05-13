/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http.apache.client.impl;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.HttpClientConnectionManager;

/**
 * An extension of Apache's HttpClient that expose the connection manager
 * associated with the client.
 */
public interface ConnectionManagerAwareHttpClient extends HttpClient {

    /**
     * Returns the {@link HttpClientConnectionManager} associated with the
     * http client.
     */
    HttpClientConnectionManager getHttpClientConnectionManager();
}
