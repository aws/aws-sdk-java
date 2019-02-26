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
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ConnectionRequest;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ClientConnectionRequestFactoryTest {
    ConnectionRequest noop = new ConnectionRequest() {

        @Override
        public HttpClientConnection get(long timeout, TimeUnit tunit) throws InterruptedException, ExecutionException, ConnectionPoolTimeoutException {
            return null;
        }

        @Override
        public boolean cancel() {
            return false;
        }
    };

    @Test
    public void wrapOnce() {
        ConnectionRequest wrapped = ClientConnectionRequestFactory
                .wrap(noop);
        assertTrue(wrapped instanceof Wrapped);
    }

    @Test(expected = IllegalArgumentException.class)
    public void wrapTwice() {
        ConnectionRequest wrapped = ClientConnectionRequestFactory.wrap(noop);
        ClientConnectionRequestFactory.wrap(wrapped);
    }
}
