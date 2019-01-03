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

import com.amazonaws.ClientConfiguration;
import com.amazonaws.http.apache.utils.ApacheUtils;
import com.amazonaws.http.settings.HttpClientSettings;
import org.apache.http.HttpException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.Assert.assertEquals;

/**
 * Integrations tests of proxy behavior of {@link ConnectionSocketFactory} implementations.
 */
public abstract class AbstractConnectionSocketFactoryProxyIntegrationTestBase {
    private static final MockProxy proxy = new MockProxy();

    @BeforeClass
    public static void setup() throws IOException {
        proxy.init();
        proxy.run();

        System.setProperty("socksProxyHost", "localhost");
        System.setProperty("socksProxyPort", Integer.toString(proxy.getPort()));
    }

    @AfterClass
    public static void teardown() {
        proxy.stop();

        System.clearProperty("socksProxyHost");
        System.clearProperty("socksProxyPort");
    }

    @Before
    public void methodSetup() {
        proxy.resetAcceptCount();
    }

    @Test
    public void testDisableProxyConfiguration_SettingTrue_DoesNotConnectToProxy() throws InterruptedException, ExecutionException, IOException, HttpException {
        Socket s = null;
        try {
            HttpClientSettings settings = HttpClientSettings.adapt(new ClientConfiguration().withDisableSocketProxy(true));
            HttpContext ctx = ApacheUtils.newClientContext(settings, new HashMap<String, String>());
            s = getFactory().createSocket(ctx);
            s.connect(new InetSocketAddress("s3.amazonaws.com", 80));
        } finally {
            if (s != null) {
                s.close();
            }
        }
        assertEquals(0, proxy.getAcceptCount());
    }

    @Test
    public void tesDisableProxyConfiguration_SettingFalse_ConnectsToProxy() throws InterruptedException, ExecutionException, IOException, HttpException {
        Socket s = null;
        try {
            HttpClientSettings settings = HttpClientSettings.adapt(new ClientConfiguration().withDisableSocketProxy(false));
            HttpContext ctx = ApacheUtils.newClientContext(settings, new HashMap<String, String>());
            s = getFactory().createSocket(ctx);
            s.connect(new InetSocketAddress("s3.amazonaws.com", 80));
        } catch (IOException ignored) {
            ignored.printStackTrace();
            // The Socket will throw an exception when it connects because the mock doesn't implement the protocol.
        } finally {
            if (s != null) {
                s.close();
            }
        }
        assertEquals(1, proxy.getAcceptCount());
    }

    protected abstract ConnectionSocketFactory getFactory();

    private static class MockProxy {
        private ExecutorService exec;
        private ServerSocket ss = null;
        private AtomicLong accepts = new AtomicLong(0);

        public int getPort() {
            return ss.getLocalPort();
        }

        public void init() throws IOException {
            exec = Executors.newSingleThreadExecutor();
            ss = new ServerSocket(0);
        }

        public void run() {
            exec.submit(new Runnable() {
               @Override
               public void run() {

                   while (true) {
                       try {
                           Socket s = ss.accept();
                           accepts.incrementAndGet();
                           s.close();
                       } catch (IOException ignored) {
                       }
                   }
               }
            });
        }

        public long getAcceptCount() {
            return accepts.get();
        }

        public void resetAcceptCount() {
            accepts.set(0);
        }

        public void stop() {
            exec.shutdownNow();
            exec = null;
        }
    }
}
