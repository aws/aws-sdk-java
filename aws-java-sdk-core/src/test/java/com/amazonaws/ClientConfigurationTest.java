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
package com.amazonaws;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.KeyStore;

import org.apache.http.conn.ssl.SSLSocketFactory;
import org.junit.Test;

public class ClientConfigurationTest {

    @Test
    public void httpClientConfiguration() throws Exception {
        ClientConfiguration config = new ClientConfiguration();
        ApacheHttpClientConfig httpclientConfig = config.getApacheHttpClientConfig();
        assertNotNull("httpclient config must never be null", httpclientConfig);

        assertNull("default ssl socket factory is null",
                httpclientConfig.getSslSocketFactory());

        SSLSocketFactory customFactory = new SSLSocketFactory((KeyStore) null);
        config.getApacheHttpClientConfig().setSslSocketFactory(customFactory);
        assertSame("custom ssl socket factory configured", customFactory,
                config.getApacheHttpClientConfig().getSslSocketFactory());

        config.getApacheHttpClientConfig().setSslSocketFactory(null);
        assertNull("no more custom ssl socket factory configured", config
                .getApacheHttpClientConfig().getSslSocketFactory());

        config.getApacheHttpClientConfig().withSslSocketFactory(customFactory);
        assertSame("custom ssl socket factory configured via fluent API",
                customFactory,
                config.getApacheHttpClientConfig().getSslSocketFactory());

        ClientConfiguration config2 = new ClientConfiguration(config);
        assertSame("custom ssl socket factory copied via ctor",
                customFactory,
                config2.getApacheHttpClientConfig().getSslSocketFactory());

        config.getApacheHttpClientConfig().setSslSocketFactory(null);
        assertNull(
            "ssl socket factory set to null for the original httpclient config",
            config.getApacheHttpClientConfig().getSslSocketFactory());
        assertNotNull(
            "ssl soscket of the new httpclient config should not be affected",
            config2.getApacheHttpClientConfig().getSslSocketFactory());

        assertNotNull("Client Configuration must have a default DnsResolver",
                config.getDnsResolver());

        try {
            config.setDnsResolver(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }

        DnsResolver resolver = new DnsResolver() {
            @Override
            public InetAddress[] resolve(String s) throws UnknownHostException {
                return new InetAddress[0];
            }
        };

        config.setDnsResolver(resolver);
        assertSame("custom dns resolver set via fluent API",
                resolver,
                config.getDnsResolver());
    }

    @Test
    public void testProxySystemProperties() throws Exception {
        ClientConfiguration config;
        config = new ClientConfiguration();
        assertNull(config.getProxyHost());
        assertEquals(config.getProxyPort(), -1);
        assertNull(config.getProxyUsername());
        assertNull(config.getProxyPassword());
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getProxyHost());
        assertEquals(config.getProxyPort(), -1);
        assertNull(config.getProxyUsername());
        assertNull(config.getProxyPassword());

        System.setProperty("https.proxyHost", "foo");
        config = new ClientConfiguration();
        assertEquals(config.getProxyHost(), "foo");
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getProxyHost());
        System.clearProperty("https.proxyHost");

        System.setProperty("http.proxyHost", "foo");
        config = new ClientConfiguration();
        assertNull(config.getProxyHost());
        config.setProtocol(Protocol.HTTP);
        assertEquals(config.getProxyHost(), "foo");
        System.clearProperty("http.proxyHost");

        System.setProperty("https.proxyPort", "8443");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPort(), 8443);
        config.setProtocol(Protocol.HTTP);
        assertEquals(config.getProxyPort(), -1);
        System.clearProperty("https.proxyPort");

        System.setProperty("http.proxyPort", "8080");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPort(), -1);
        config.setProtocol(Protocol.HTTP);
        assertEquals(config.getProxyPort(), 8080);
        System.clearProperty("http.proxyPort");

        System.setProperty("https.proxyUser", "foo");
        config = new ClientConfiguration();
        assertEquals(config.getProxyUsername(), "foo");
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getProxyUsername());
        System.clearProperty("https.proxyUser");

        System.setProperty("http.proxyUser", "foo");
        config = new ClientConfiguration();
        assertNull(config.getProxyUsername());
        config.setProtocol(Protocol.HTTP);
        assertEquals(config.getProxyUsername(), "foo");
        System.clearProperty("http.proxyUser");

        System.setProperty("https.proxyPassword", "foo");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPassword(), "foo");
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getProxyPassword());
        System.clearProperty("https.proxyPassword");

        System.setProperty("http.proxyPassword", "foo");
        config = new ClientConfiguration();
        assertNull(config.getProxyPassword());
        config.setProtocol(Protocol.HTTP);
        assertEquals(config.getProxyPassword(), "foo");
        System.clearProperty("http.proxyPassword");
    }

}
