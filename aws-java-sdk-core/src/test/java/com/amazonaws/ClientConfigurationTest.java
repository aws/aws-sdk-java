/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.http.SystemPropertyTlsKeyManagersProvider;
import com.amazonaws.http.TlsKeyManagersProvider;
import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryMode;
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
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.junit.Test;
import org.mockito.Mockito;
import utils.EnvironmentVariableHelper;

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

        System.setProperty("https.proxyPort", "bad");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPort(), -1);
        System.clearProperty("https.proxyPort");

        System.setProperty("https.proxyPort", "8443");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPort(), 8443);
        config.setProtocol(Protocol.HTTP);
        assertEquals(config.getProxyPort(), -1);
        System.clearProperty("https.proxyPort");

        System.setProperty("http.proxyPort", "bad");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals(config.getProxyPort(), -1);
        System.clearProperty("http.proxyPort");

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
    public void testProxyHostEnvironmentVariables() {
        clearProxyProperties();
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();
        ClientConfiguration config;

        config = new ClientConfiguration();
        assertNull(config.getProxyHost());

        environmentVariableHelper.set("https_proxy", "");
        config = new ClientConfiguration();
        assertNull(config.getProxyHost());

        environmentVariableHelper.set("https_proxy", "bad-url");
        config = new ClientConfiguration();
        assertNull(config.getProxyHost());

        environmentVariableHelper.set("https_proxy", "https://test1:1234");
        config = new ClientConfiguration();
        assertEquals("test1", config.getProxyHost());

        environmentVariableHelper.set("HTTPS_PROXY", "https://test2:1234");
        config = new ClientConfiguration();
        assertEquals("test2", config.getProxyHost());

        config = new ClientConfiguration();
        System.setProperty("https.proxyHost", "test3");
        assertEquals("test3", config.getProxyHost());
        config.setProxyHost("test4");
        assertEquals("test4", config.getProxyHost());
        System.clearProperty("https.proxyHost");
        environmentVariableHelper.reset();

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getProxyHost());

        environmentVariableHelper.set("http_proxy", "http://test1:1234");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals("test1", config.getProxyHost());

        environmentVariableHelper.set("HTTP_PROXY", "http://test2:1234");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals("test2", config.getProxyHost());

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        System.setProperty("http.proxyHost", "test3");
        assertEquals("test3", config.getProxyHost());
        config.setProxyHost("test4");
        assertEquals("test4", config.getProxyHost());
        System.clearProperty("http.proxyHost");
        environmentVariableHelper.reset();
    }

    @Test
    public void testProxyPortEnvironmentVariables() {
        clearProxyProperties();
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();
        ClientConfiguration config;

        config = new ClientConfiguration();
        assertEquals(-1, config.getProxyPort());

        environmentVariableHelper.set("https_proxy", "");
        config = new ClientConfiguration();
        assertEquals(-1, config.getProxyPort());

        environmentVariableHelper.set("https_proxy", "bad-url");
        config = new ClientConfiguration();
        assertEquals(-1, config.getProxyPort());

        environmentVariableHelper.set("https_proxy", "https://test1:1");
        config = new ClientConfiguration();
        assertEquals(1, config.getProxyPort());

        environmentVariableHelper.set("HTTPS_PROXY", "https://test2:2");
        config = new ClientConfiguration();
        assertEquals(2, config.getProxyPort());

        config = new ClientConfiguration();
        System.setProperty("https.proxyPort", "3");
        assertEquals(3, config.getProxyPort());
        config.setProxyPort(4);
        assertEquals(4, config.getProxyPort());
        System.clearProperty("https.proxyPort");
        environmentVariableHelper.reset();

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals(-1, config.getProxyPort());

        environmentVariableHelper.set("http_proxy", "http://test1:1");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals(1, config.getProxyPort());

        environmentVariableHelper.set("HTTP_PROXY", "http://test2:2");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals(2, config.getProxyPort());

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        System.setProperty("http.proxyPort", "3");
        assertEquals(3, config.getProxyPort());
        config.setProxyPort(4);
        assertEquals(4, config.getProxyPort());
        System.clearProperty("http.proxyPort");
        environmentVariableHelper.reset();
    }

    @Test
    public void testProxyUsernameEnvironmentVariables() {
        clearProxyProperties();
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();
        ClientConfiguration config;

        config = new ClientConfiguration();
        assertNull(config.getProxyUsername());

        environmentVariableHelper.set("https_proxy", "");
        config = new ClientConfiguration();
        assertNull(config.getProxyUsername());

        environmentVariableHelper.set("https_proxy", "bad-url");
        config = new ClientConfiguration();
        assertNull(config.getProxyUsername());

        environmentVariableHelper.set("https_proxy", "https://user1:pass@test:1234");
        config = new ClientConfiguration();
        assertEquals("user1", config.getProxyUsername());

        environmentVariableHelper.set("HTTPS_PROXY", "https://user2:pass@test:1234");
        config = new ClientConfiguration();
        assertEquals("user2", config.getProxyUsername());

        config = new ClientConfiguration();
        System.setProperty("https.proxyUser", "user3");
        assertEquals("user3", config.getProxyUsername());
        config.setProxyUsername("user4");
        assertEquals("user4", config.getProxyUsername());
        System.clearProperty("https.proxyUser");
        environmentVariableHelper.reset();

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getProxyUsername());

        environmentVariableHelper.set("http_proxy", "http://user1:pass@test:1234");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals("user1", config.getProxyUsername());

        environmentVariableHelper.set("HTTP_PROXY", "http://user2:pass@test:1234");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals("user2", config.getProxyUsername());

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        System.setProperty("http.proxyUser", "user3");
        assertEquals("user3", config.getProxyUsername());
        config.setProxyUsername("user4");
        assertEquals("user4", config.getProxyUsername());
        System.clearProperty("http.proxyUser");
        environmentVariableHelper.reset();
    }

    @Test
    public void testProxyPasswordEnvironmentVariables() {
        clearProxyProperties();
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();
        ClientConfiguration config;

        config = new ClientConfiguration();
        assertNull(config.getProxyPassword());

        environmentVariableHelper.set("https_proxy", "");
        config = new ClientConfiguration();
        assertNull(config.getProxyPassword());

        environmentVariableHelper.set("https_proxy", "bad-url");
        config = new ClientConfiguration();
        assertNull(config.getProxyPassword());

        environmentVariableHelper.set("https_proxy", "https://user:pass1@test:1234");
        config = new ClientConfiguration();
        assertEquals("pass1", config.getProxyPassword());

        environmentVariableHelper.set("HTTPS_PROXY", "https://user:pass2@test:1234");
        config = new ClientConfiguration();
        assertEquals("pass2", config.getProxyPassword());

        config = new ClientConfiguration();
        System.setProperty("https.proxyPassword", "pass3");
        assertEquals("pass3", config.getProxyPassword());
        config.setProxyPassword("pass4");
        assertEquals("pass4", config.getProxyPassword());
        System.clearProperty("https.proxyPassword");
        environmentVariableHelper.reset();

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getProxyPassword());

        environmentVariableHelper.set("http_proxy", "http://user:pass1@test:1234");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals("pass1", config.getProxyPassword());

        environmentVariableHelper.set("HTTP_PROXY", "http://user:pass2@test:1234");
        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        assertEquals("pass2", config.getProxyPassword());

        config = new ClientConfiguration();
        config.setProtocol(Protocol.HTTP);
        System.setProperty("http.proxyPassword", "pass3");
        assertEquals("pass3", config.getProxyPassword());
        config.setProxyPassword("pass4");
        assertEquals("pass4", config.getProxyPassword());
        System.clearProperty("http.proxyPassword");
        environmentVariableHelper.reset();

        config = new ClientConfiguration();
        assertNull(config.getProxyPassword());

        environmentVariableHelper.set("https_proxy", "http://user:pass:with:colon@test:1234");
        config = new ClientConfiguration();
        assertEquals("pass:with:colon", config.getProxyPassword());
        environmentVariableHelper.reset();
    }

    @Test
    public void testNonProxyHostsEnvironmentVariables() {
        clearProxyProperties();
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();
        ClientConfiguration config;

        config = new ClientConfiguration();
        assertNull(config.getNonProxyHosts());
        config.setProtocol(Protocol.HTTP);
        assertNull(config.getNonProxyHosts());
        environmentVariableHelper.set("no_proxy", "test1.com");
        assertEquals("test1.com", config.getNonProxyHosts());
        environmentVariableHelper.set("NO_PROXY", "test2.com");
        assertEquals("test2.com", config.getNonProxyHosts());
        System.setProperty("http.nonProxyHosts", "test3.com");
        assertEquals("test3.com", config.getNonProxyHosts());
        config.setNonProxyHosts("test4.com");
        assertEquals("test4.com", config.getNonProxyHosts());
        System.clearProperty("http.nonProxyHosts");
        environmentVariableHelper.reset();

        config = new ClientConfiguration();
        assertNull(config.getNonProxyHosts());
        config.setProtocol(Protocol.HTTP);
        environmentVariableHelper.set("no_proxy", "test1.com,test2.com,test3.com");
        assertEquals("test1.com|test2.com|test3.com", config.getNonProxyHosts());
        environmentVariableHelper.set("no_proxy", "test1.com|test2.com|test3.com");
        assertEquals("test1.com|test2.com|test3.com", config.getNonProxyHosts());
        environmentVariableHelper.reset();
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
            } else if (clzz.isAssignableFrom(AtomicReference.class)) {
                if (field.getName().equals("httpProxyHolder")) {
                    field.set(customConfig, new AtomicReference<ClientConfiguration.URLHolder>(new ClientConfiguration.URLHolder()));
                }
            } else if (clzz.isAssignableFrom(TlsKeyManagersProvider.class)) {
                field.set(customConfig, new SystemPropertyTlsKeyManagersProvider());
            } else if (clzz.isAssignableFrom(RetryMode.class)) {
                field.set(customConfig, RetryMode.LEGACY);
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

    @Test
    public void getProxyUserName_envVarSet_noUserName_doesNotThrow() {
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();

        environmentVariableHelper.set("HTTPS_PROXY", "http://localhost");
        new ClientConfiguration().getProxyUsername();
        environmentVariableHelper.reset();

        environmentVariableHelper.set("HTTP_PROXY", "http://localhost");
        ClientConfiguration cfg = new ClientConfiguration();
        cfg.setProtocol(Protocol.HTTP);
        cfg.getProxyUsername();
        environmentVariableHelper.reset();
    }

    @Test
    public void getProxyPassword_envVarSet_noPassword_doesNotThrow() {
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();

        environmentVariableHelper.set("HTTPS_PROXY", "http://localhost");
        new ClientConfiguration().getProxyPassword();
        environmentVariableHelper.reset();

        environmentVariableHelper.set("HTTP_PROXY", "http://localhost");
        ClientConfiguration cfg = new ClientConfiguration();
        cfg.setProtocol(Protocol.HTTP);
        cfg.getProxyPassword();
        environmentVariableHelper.reset();
    }

    @Test
    public void protocolChanged_resolvesCorrectProxyVar() {
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();
        environmentVariableHelper.set("HTTP_PROXY", "http://http-proxy");
        environmentVariableHelper.set("HTTPS_PROXY", "http://https-proxy");

        ClientConfiguration cfg = new ClientConfiguration();
        assertThat(cfg.getProxyHost(), equalTo("https-proxy"));

        cfg.setProtocol(Protocol.HTTP);
        assertThat(cfg.getProxyHost(), equalTo("http-proxy"));

        environmentVariableHelper.reset();
    }

    @Test
    public void getProxyHost_envVarSet_emptyUrl_doesNotThrow() {
        EnvironmentVariableHelper environmentVariableHelper = new EnvironmentVariableHelper();

        environmentVariableHelper.set("https_proxy", "");
        ClientConfiguration config = new ClientConfiguration();
        assertNull(config.getProxyHost());
        environmentVariableHelper.reset();

        environmentVariableHelper.set("http_proxy", "");
        config = new ClientConfiguration();
        assertNull(config.getProxyHost());
        environmentVariableHelper.reset();
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
