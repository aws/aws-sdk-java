/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.ManagedClientConnection;
import org.junit.Test;

public class ClientConnectionRequestFactoryTest {
    ClientConnectionRequest noop = new ClientConnectionRequest() {
        @Override
        public ManagedClientConnection getConnection(long timeout, TimeUnit tunit)
                throws InterruptedException, ConnectionPoolTimeoutException {
            return null;
        }

        @Override
        public void abortRequest() {
        }
    };

    @Test
    public void wrapOnce() {
        ClientConnectionRequest wrapped = ClientConnectionRequestFactory.wrap(noop);
        assertTrue(wrapped instanceof Wrapped);
    }

    @Test(expected=IllegalArgumentException.class)
    public void wrapTwice() {
        ClientConnectionRequest wrapped = ClientConnectionRequestFactory.wrap(noop);
        ClientConnectionRequestFactory.wrap(wrapped);
    }
}
