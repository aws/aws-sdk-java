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
package com.amazonaws.http.apache.client.impl;


import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.settings.HttpClientSettings;

import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApacheConnectionManagerFactoryTest {


    private final ApacheConnectionManagerFactory factory = new ApacheConnectionManagerFactory();

    @Test
    public void validateAfterInactivityMillis_RespectedInConnectionManager() {
        final int validateAfterInactivity = 1234;
        final HttpClientSettings httpClientSettings =
                HttpClientSettings.adapt(new ClientConfiguration()
                                                 .withValidateAfterInactivityMillis(validateAfterInactivity));

        final PoolingHttpClientConnectionManager connectionManager =
                (PoolingHttpClientConnectionManager) factory.create(httpClientSettings);
        assertEquals(validateAfterInactivity, connectionManager.getValidateAfterInactivity());
    }
}