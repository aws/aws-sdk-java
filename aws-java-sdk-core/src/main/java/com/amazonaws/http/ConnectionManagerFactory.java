/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import java.util.concurrent.TimeUnit;

import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.params.HttpParams;

import com.amazonaws.ClientConfiguration;

/**
 * Responsible for creating and configuring instances of Apache HttpClient4's
 * Connection Manager.
 */
class ConnectionManagerFactory {

    public static PoolingClientConnectionManager createPoolingClientConnManager(
            ClientConfiguration config,
            HttpParams httpClientParams,
            SSLSocketFactory socketFactory) {

        PoolingClientConnectionManager connectionManager = new PoolingClientConnectionManager(
                createSchemeRegistry(socketFactory),
                config.getConnectionTTL(),
                TimeUnit.MILLISECONDS,
                new DelegatingDnsResolver(config.getDnsResolver()));

        connectionManager.setDefaultMaxPerRoute(config.getMaxConnections());
        connectionManager.setMaxTotal(config.getMaxConnections());

        if (config.useReaper()) {
            IdleConnectionReaper.registerConnectionManager(connectionManager);
        }

        return connectionManager;
    }

    private static SchemeRegistry createSchemeRegistry(SSLSocketFactory socketFactory) {
        final SchemeRegistry registry = new SchemeRegistry();
        registry.register(
                new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));
        registry.register(
                new Scheme("https", 443, socketFactory));
        return registry;
    }
}
