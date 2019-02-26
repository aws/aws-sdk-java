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

import org.apache.http.HttpClientConnection;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpContext;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ClientConnectionManagerFactoryTest {
    HttpClientConnectionManager noop = new HttpClientConnectionManager() {
        @Override
        public void connect(HttpClientConnection conn, HttpRoute route, int connectTimeout, HttpContext context) throws IOException {

        }

        @Override
        public void upgrade(HttpClientConnection conn, HttpRoute route, HttpContext context) throws IOException {

        }

        @Override
        public void routeComplete(HttpClientConnection conn, HttpRoute route, HttpContext context) throws IOException {

        }

        @Override
        public ConnectionRequest requestConnection(HttpRoute route,
                                                   Object state) {
            return null;
        }

        @Override
        public void releaseConnection(HttpClientConnection conn,
                                      Object newState,
                                      long validDuration,
                                      TimeUnit timeUnit) {
        }

        @Override
        public void closeIdleConnections(long idletime, TimeUnit tunit) {
        }

        @Override
        public void closeExpiredConnections() {
        }

        @Override
        public void shutdown() {
        }
    };

    @Test
    public void wrapOnce() {
        HttpClientConnectionManager wrapped = ClientConnectionManagerFactory.wrap(noop);
        assertTrue(wrapped instanceof Wrapped);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrapTwice() {
        HttpClientConnectionManager wrapped = ClientConnectionManagerFactory.wrap(noop);
        ClientConnectionManagerFactory.wrap(wrapped);
    }
}
