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
package com.amazonaws;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.ImmutableMapParameter;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.junit.Test;
import org.mockito.Mockito;

public class ClientConfigurationTest {

    private static final Random RANDOM = new Random();

    private static final ClientConfiguration DEFAULT_CLIENT_CONFIG = new ClientConfiguration();

    private static final RetryPolicy CUSTOM_RETRY_POLICY = new RetryPolicy(
            PredefinedRetryPolicies.SDKDefaultRetryCondition.NO_RETRY_CONDITION,
            RetryPolicy.BackoffStrategy.NO_DELAY, 1000, false);

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

    private void clearProxyProperties() {
        System.clearProperty("http.proxyHost");
        System.clearProperty("http.proxyPort");
        System.clearProperty("https.proxyHost");
        System.clearProperty("https.proxyPort");
        System.clearProperty("http.nonProxyHosts");
    }

    @Test
    public void testNonProxyHostsSetting() throws Exception {
        clearProxyProperties();

        // test ClientConfiguration setting
        ClientConfiguration config;
        config = new ClientConfiguration().withNonProxyHosts("foo.com");
        assertEquals("foo.com", config.getNonProxyHosts());

        config.setProtocol(Protocol.HTTP);
        assertEquals("foo.com", config.getNonProxyHosts());

        // test system property
        System.setProperty("http.nonProxyHosts", "foo.com");
        config = new ClientConfiguration();
        assertEquals("foo.com", config.getNonProxyHosts());

        config.setProtocol(Protocol.HTTP);
        assertEquals("foo.com", config.getNonProxyHosts());
        System.clearProperty("http.nonProxyHosts");

        // ClientConfiguration setting has a precedence over system property
        System.setProperty("http.nonProxyHosts", "bar.com");
        config = new ClientConfiguration().withNonProxyHosts("foo.com");
        assertEquals("foo.com", config.getNonProxyHosts());

        config.setProtocol(Protocol.HTTP);
        assertEquals("foo.com", config.getNonProxyHosts());
        System.clearProperty("http.nonProxyHosts");

        // ClientConfiguration setting has a precedence over system property
        config = new ClientConfiguration();
        assertNull(config.getNonProxyHosts());

        config.setProtocol(Protocol.HTTP);
        assertNull(config.getNonProxyHosts());
    }

    @Test
    public void testProxySystemProperties() throws Exception {
        clearProxyProperties();
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

    @Test
    public void testHeadersDeepCopyInConstructor() {
        String key1 = "key1", value1 = "value1";
        String key2 = "key2", value2 = "value2";

        ClientConfiguration source = new ClientConfiguration().withHeader(key1, value1).withHeader(key2, value2);
        ClientConfiguration target = new ClientConfiguration(source);

        assertEquals(2, target.getHeaders().size());
        assertEquals(value1, target.getHeaders().get(key1));
        assertEquals(value2, target.getHeaders().get(key2));

        source.withHeader(key1, "value3");
        source.withHeader("new key", "new value");

        assertEquals(2, target.getHeaders().size());
        assertEquals(value1, target.getHeaders().get(key1));
        assertEquals(value2, target.getHeaders().get(key2));
    }

    @Test
    public void clientConfigurationCopyConstructor_CopiesAllValues() throws Exception {
        ClientConfiguration customConfig = new ClientConfiguration();

        for (Field field : ClientConfiguration.class.getDeclaredFields()) {
            if (isStaticField(field)) {
                continue;
            }
            field.setAccessible(true);
            final Class<?> clzz = field.getType();

            if (clzz.isAssignableFrom(int.class) || clzz.isAssignableFrom(long.class)) {
                field.set(customConfig, Math.abs(RANDOM.nextInt()));
            } else if (clzz.isAssignableFrom(boolean.class)) {
                // Invert the default value to ensure it's different
                field.set(customConfig, !(Boolean) field.get(customConfig));
            } else if (clzz.isAssignableFrom(String.class)) {
                field.set(customConfig, RandomStringUtils.random(10));
            } else if (clzz.isAssignableFrom(RetryPolicy.class)) {
                field.set(customConfig, CUSTOM_RETRY_POLICY);
            } else if (clzz.isAssignableFrom(InetAddress.class)) {
                field.set(customConfig, InetAddress.getLocalHost());
            } else if (clzz.isAssignableFrom(Protocol.class)) {
                if (field.getName().equals("protocol")) {
                    // Default is HTTPS so switch to HTTP
                    field.set(customConfig, Protocol.HTTP);
                } else {
                    // field proxyProtocol's default is HTTP
                    field.set(customConfig, Protocol.HTTPS);
                }
            } else if (clzz.isAssignableFrom(DnsResolver.class)) {
                field.set(customConfig, new MyCustomDnsResolver());
            } else if (clzz.isAssignableFrom(SecureRandom.class)) {
                field.set(customConfig, new SecureRandom());
            } else if (field.getName().equals("headers")) {
                field.set(customConfig, ImmutableMapParameter.of("foo", "bar"));
            } else if (clzz.isAssignableFrom(ApacheHttpClientConfig.class)) {
                customConfig.getApacheHttpClientConfig()
                            .setSslSocketFactory(Mockito.mock(ConnectionSocketFactory.class));
            } else if (clzz.isAssignableFrom(List.class)) {
                field.set(customConfig, new ArrayList<Object>());
            } else {
                throw new RuntimeException(
                        String.format("Field %s of type %s is not supported",
                                      field.getName(),
                                      field.getType()));
            }
            // Extra check to make sure the value differs from the default and we haven't missed something
            assertNotEquals(
                    String.format("Field %s does not differ from default value", field.getName()),
                    field.get(DEFAULT_CLIENT_CONFIG), field.get(customConfig));
        }

        // Do a deep comparison of the config after sending it through the copy constructor
        assertReflectionEquals(customConfig, new ClientConfiguration(customConfig));
    }

    /**
     * Some customers extend ClientConfiguration and override the accessors. We should use the accessors
     * in the copy constructor otherwise we will ignore those overridden methods. See TT0142110771 for
     * more information.
     */
    @Test
    public void copyConstructorUsesAccessors() {
       ClientConfiguration config = new ClientConfiguration()  {
           @Override
           public int getSocketTimeout() {
               return Integer.MAX_VALUE;
           }
       };
       assertThat(new ClientConfiguration(config).getSocketTimeout(), equalTo(Integer.MAX_VALUE));
    }

    private boolean isStaticField(Field field) {
        return (field.getModifiers() & Modifier.STATIC) == Modifier.STATIC;
    }

    public static class MyCustomDnsResolver implements DnsResolver {

        @Override
        public InetAddress[] resolve(String host) throws UnknownHostException {
            return new InetAddress[0];
        }
    }

}
