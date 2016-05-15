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

import static com.amazonaws.ClientConfiguration.*;
import static com.amazonaws.Protocol.HTTP;
import static com.amazonaws.Protocol.HTTPS;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.KeyStore;

import org.apache.http.conn.ssl.SSLSocketFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClientConfiguration.class)
@PowerMockIgnore("javax.net.ssl.*")
public class ClientConfigurationTest {

    private ClientConfiguration clientConfiguration = new ClientConfiguration();

    private static final String HOSTNAME = "hostname";
    private static final String HOSTNAME_SECURED = "hostname_secured";
    private static final String PWD = "pwd";
    private static final String PWD_SECURED = "pwd_secured";
    private static final String USERNAME = "username";
    private static final String USERNAME_SECURED = "username_secured";
    private static final String SPECIALCHARED_PWD_SECURED = AT + PWD_SECURED + ":";
    private static final String SPECIALCHARED_PWD = AT + PWD + ":";
    private static final String SPECIALCHARED_USRNAME_SECURED = AT + USERNAME_SECURED + ":";
    private static final String SPECIALCHARED_USRNAME = AT + USERNAME + ":";

    private static final int HTTP_ALT_PORT = 8080;

    private static final String HTTPS_PROXY_WITH_USERPWD_VALUE = HTTPS.toString()+"://" + USERNAME_SECURED + ":" + PWD_SECURED + AT + HOSTNAME_SECURED + ":" + HTTPS_PORT;
    private static final String HTTPS_PROXY_WITHOUT_USERPWD_VALUE = HTTPS+"://" + HOSTNAME_SECURED + ":" + HTTPS_PORT;
    private static final String HTTPS_PROXY_WITHOUT_USERPWDPORT_VALUE = HTTPS+"://" + HOSTNAME_SECURED;
    private static final String HTTP_PROXY_WITH_USERPWD_VALUE = HTTP+"://" + USERNAME + ":" + PWD + AT + HOSTNAME + ":" + HTTP_ALT_PORT;
    private static final String HTTP_PROXY_WITHOUT_USERPWD_VALUE = HTTP+"://" + HOSTNAME + ":" + HTTP_PORT;
    private static final String HTTP_PROXY_WITHOUT_USERPWDPORT_VALUE = HTTP+"://" + HOSTNAME;

    private static final String HTTPS_PROXY_WITH_SPECIAL_CHARS_IN_USERPWD_VALUE = HTTPS+"://" + SPECIALCHARED_USRNAME_SECURED + ":" + SPECIALCHARED_PWD_SECURED + AT + HOSTNAME_SECURED + ":" + HTTPS_PORT;
    private static final String HTTPS_PROXY_WITH_SPECIAL_CHARS_IN_PWD_VALUE = HTTPS+"://" + USERNAME_SECURED + ":" + SPECIALCHARED_PWD_SECURED + AT + HOSTNAME_SECURED + ":" + HTTPS_PORT;
    private static final String HTTPS_PROXY_WITHOUT_USRPWD_BUT_WITH_SPECIAL_CHARS_IN_PWD_VALUE = HTTPS+"://" +":" +  AT + HOSTNAME_SECURED + ":" + HTTPS_PORT;
    private static final String HTTPS_PROXY_WITHOUT_PORT_BUT_WITH_SPECIAL_CHAR_AT_END = HTTPS+"://" +":" +  AT + HOSTNAME_SECURED + ":" ;
    private static final String HTTP_PROXY_WITH_SPECIAL_CHARS_IN_PWD_VALUE = HTTP+"://" + USERNAME + ":" + SPECIALCHARED_PWD + AT + HOSTNAME + ":" + HTTP_PORT;
    private static final String HTTP_PROXY_WITH_SPECIAL_CHARS_IN_USERPWD_VALUE = HTTP+"://" + SPECIALCHARED_USRNAME + ":" + SPECIALCHARED_PWD + AT + HOSTNAME_SECURED + ":" + HTTPS_PORT;
    private static final String HTTP_PROXY_WITHOUT_USRPWD_BUT_WITH_SPECIAL_CHARS_IN_PWD_VALUE = HTTP+"://" +":" +  AT + HOSTNAME + ":" + HTTP_PORT;
    private static final String HTTP_PROXY_WITHOUT_PORT_BUT_WITH_SPECIAL_CHAR_AT_END = HTTP+"://" +":" +  AT + HOSTNAME + ":" ;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

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
        config.setProtocol(HTTP);
        assertNull(config.getProxyHost());
        assertEquals(config.getProxyPort(), -1);
        assertNull(config.getProxyUsername());
        assertNull(config.getProxyPassword());

        System.setProperty("https.proxyHost", "foo");
        config = new ClientConfiguration();
        assertEquals(config.getProxyHost(), "foo");
        config.setProtocol(HTTP);
        assertNull(config.getProxyHost());
        System.clearProperty("https.proxyHost");

        System.setProperty("http.proxyHost", "foo");
        config = new ClientConfiguration();
        assertNull(config.getProxyHost());
        config.setProtocol(HTTP);
        assertEquals(config.getProxyHost(), "foo");
        System.clearProperty("http.proxyHost");

        System.setProperty("https.proxyPort", "8443");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPort(), 8443);
        config.setProtocol(HTTP);
        assertEquals(config.getProxyPort(), -1);
        System.clearProperty("https.proxyPort");

        System.setProperty("http.proxyPort", "8080");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPort(), -1);
        config.setProtocol(HTTP);
        assertEquals(config.getProxyPort(), 8080);
        System.clearProperty("http.proxyPort");

        System.setProperty("https.proxyUser", "foo");
        config = new ClientConfiguration();
        assertEquals(config.getProxyUsername(), "foo");
        config.setProtocol(HTTP);
        assertNull(config.getProxyUsername());
        System.clearProperty("https.proxyUser");

        System.setProperty("http.proxyUser", "foo");
        config = new ClientConfiguration();
        assertNull(config.getProxyUsername());
        config.setProtocol(HTTP);
        assertEquals(config.getProxyUsername(), "foo");
        System.clearProperty("http.proxyUser");

        System.setProperty("https.proxyPassword", "foo");
        config = new ClientConfiguration();
        assertEquals(config.getProxyPassword(), "foo");
        config.setProtocol(HTTP);
        assertNull(config.getProxyPassword());
        System.clearProperty("https.proxyPassword");

        System.setProperty("http.proxyPassword", "foo");
        config = new ClientConfiguration();
        assertNull(config.getProxyPassword());
        config.setProtocol(HTTP);
        assertEquals(config.getProxyPassword(), "foo");
        System.clearProperty("http.proxyPassword");
    }

    @Test
    public void givenHTTPSProtocolAndSystemProperties_whenClientConfigurationisUsed_thenValuesAreNotNull() {
        setSystemPropertyMockValuesOnSystem();

        assertThat(clientConfiguration.getProtocol().toString(), notNullValue());
        assertThat(clientConfiguration.getProxyUsername(), notNullValue());
        assertThat(clientConfiguration.getProxyPassword(), notNullValue());
        assertThat(clientConfiguration.getProxyHost(), notNullValue());
        assertThat(clientConfiguration.getProxyPort(), notNullValue());

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemProperties_whenClientConfigurationisUsed_thenValuesAreNotNull() {
        setSystemPropertyMockValuesOnSystem();

        clientConfiguration.setProtocol(HTTP);

        assertThat(clientConfiguration.getProtocol().toString(), notNullValue());
        assertThat(clientConfiguration.getProxyUsername(), notNullValue());
        assertThat(clientConfiguration.getProxyPassword(), notNullValue());
        assertThat(clientConfiguration.getProxyHost(), notNullValue());
        assertThat(clientConfiguration.getProxyPort(), notNullValue());

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxy_whenClientConfigurationisUsed_thenValuesAreNormal() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITH_USERPWD_VALUE);

        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(USERNAME), equalToIgnoringWhiteSpace(PWD),equalToIgnoringWhiteSpace(HOSTNAME), equalTo(HTTP_ALT_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPSProtocolAndSystemVariableHttpProxyAndNOSystemPropperty_whenClientConfigurationisUsed_thenHTTPSValuesAreUsed() {
        setHttpProxySystemVars();

        matchClientConfig(equalToIgnoringWhiteSpace(USERNAME_SECURED), equalToIgnoringWhiteSpace(PWD_SECURED), equalTo(HTTPS_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyAndNOSystemPropperty_whenClientConfigurationisUsed_thenHTTPValuesAreUsed() {
        setHttpProxySystemVars(HTTP_PROXY_WITH_USERPWD_VALUE, HTTPS_PROXY_WITH_USERPWD_VALUE);

        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(USERNAME), equalToIgnoringWhiteSpace(PWD),equalToIgnoringWhiteSpace(HOSTNAME), equalTo(HTTP_ALT_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyAndHttpsProxyWithNoUsernamePwdAndPort_whenClientConfigurationisUsed_thenUsrPwdAreEmpty() {
        setHttpProxySystemVars(HTTP_PROXY_WITHOUT_USERPWDPORT_VALUE, HTTPS_PROXY_WITHOUT_USERPWD_VALUE);
        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(HOSTNAME), equalTo(HTTP_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }


    @Test
    public void givenHTTPSProtocolAndSystemVariableHttpProxyWithNoUsernameAndPwd_whenClientConfigurationisUsed_thenUsrPwdAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTPS_PROXYOnSystem(HTTPS_PROXY_WITHOUT_USERPWD_VALUE);

        matchClientConfig(equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING), equalTo(HTTPS_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyWithNoUsernameAndPwd_whenClientConfigurationisUsed_thenUsrPwdAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITHOUT_USERPWD_VALUE);
        clientConfiguration.setProtocol(Protocol.HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalToIgnoringWhiteSpace(HOSTNAME), equalTo(HTTP_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyWithNoUsernamePwdAndPort_whenClientConfigurationisUsed_thenUsrPwdAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITHOUT_USERPWDPORT_VALUE);

        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalToIgnoringWhiteSpace(HOSTNAME), equalTo(HTTP_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPSProtocolAndSystemVariableHttpProxyWithNoUsernamePwdAndPort_whenClientConfigurationisUsed_thenUsrPwdPortAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTPS_PROXYOnSystem(HTTPS_PROXY_WITHOUT_USERPWDPORT_VALUE);

        matchClientConfig(equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING), equalTo(HTTPS_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPSProtocolAndSystemVariableHttpProxyWithSpecialCharactersInPWD_whenClientConfigurationisUsed_thenValuesAreNormaAndPwdisOK() {
        setSystemClassMock();
        setSystemEnvVariableHTTPS_PROXYOnSystem(HTTPS_PROXY_WITH_SPECIAL_CHARS_IN_PWD_VALUE);

        matchClientConfig(equalToIgnoringWhiteSpace(USERNAME_SECURED), equalToIgnoringWhiteSpace(SPECIALCHARED_PWD_SECURED), equalTo(HTTPS_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPSProtocolAndSystemVariableHttpProxyWithSpecialCharactersWithoutUSRPWD_whenClientConfigurationisUsed_thenValuesAreNormaAndUSRAndPwdAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTPS_PROXYOnSystem(HTTPS_PROXY_WITHOUT_USRPWD_BUT_WITH_SPECIAL_CHARS_IN_PWD_VALUE);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTPS.toString()),equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalToIgnoringWhiteSpace(HOSTNAME_SECURED), equalTo(HTTPS_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyWithSpecialCharactersWithoutUSRPWD_whenClientConfigurationisUsed_thenValuesAreNormaAndUSRAndPwdAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITHOUT_USRPWD_BUT_WITH_SPECIAL_CHARS_IN_PWD_VALUE);
        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalToIgnoringWhiteSpace(HOSTNAME), equalTo(HTTP_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }


    @Test
    public void givenHTTPSProtocolAndSystemVariableHttpProxyWithoutPortButSpecialChar_whenClientConfigurationisUsed_thenValuesAreNormaAndPortAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTPS_PROXYOnSystem(HTTPS_PROXY_WITHOUT_PORT_BUT_WITH_SPECIAL_CHAR_AT_END);

        matchClientConfig(equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalTo(HTTPS_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyWithoutPortButSpecialChar_whenClientConfigurationisUsed_thenValuesAreNormaAndPortAreEmpty() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITHOUT_PORT_BUT_WITH_SPECIAL_CHAR_AT_END);
        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalToIgnoringWhiteSpace(HOSTNAME), equalTo(HTTP_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyWithSpecialCharactersInPWD_whenClientConfigurationisUsed_thenValuesAreNormaAndPwdisOK() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITH_SPECIAL_CHARS_IN_PWD_VALUE);
        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()),equalToIgnoringWhiteSpace(USERNAME), equalToIgnoringWhiteSpace(SPECIALCHARED_PWD), equalToIgnoringWhiteSpace(HOSTNAME),equalTo(HTTP_PORT));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPSProtocolAndSystemVariableHttpProxyWithSpecialCharactersInUSRandPWD_whenClientConfigurationisUsed_thenCanNotReadAndEmptyStringIsReturned() {
        setSystemClassMock();
        setSystemEnvVariableHTTPS_PROXYOnSystem(HTTPS_PROXY_WITH_SPECIAL_CHARS_IN_USERPWD_VALUE);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTPS.toString()), equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalTo(-1));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyWithSpecialCharactersInUSRandPWD_whenClientConfigurationisUsed_thenCanNotReadAndEmptyStringIsReturned() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITH_SPECIAL_CHARS_IN_USERPWD_VALUE);
        clientConfiguration.setProtocol(HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()), equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalTo(-1));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    @Test
    public void givenHTTPProtocolAndSystemVariableHttpProxyWithHostnameNotEncoededProperly_whenClientConfigurationisUsed_thenCanNotReadAndEmptyStringIsReturnedForHostnameAndPort() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITH_SPECIAL_CHARS_IN_USERPWD_VALUE);
        clientConfiguration.setProtocol(Protocol.HTTP);

        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTP.toString()), equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING), equalToIgnoringWhiteSpace(EMPTYSTRING),equalTo(-1));

        System.out.println(getHttpFullStringFromClientConfig());
    }

    private void matchClientConfig(org.hamcrest.Matcher<String> userNameMatcher, org.hamcrest.Matcher<String> passwordMatcher, org.hamcrest.Matcher<Integer> portMatcher) {
        matchClientConfig(equalToIgnoringWhiteSpace(Protocol.HTTPS.toString()),userNameMatcher, passwordMatcher, portMatcher);
    }

    private void matchClientConfig(org.hamcrest.Matcher<String> protocolMatcher, org.hamcrest.Matcher<String> userNameMatcher, org.hamcrest.Matcher<String> passwordMatcher, org.hamcrest.Matcher<Integer> portMatcher) {
        matchClientConfig(protocolMatcher, userNameMatcher, passwordMatcher, equalToIgnoringWhiteSpace(HOSTNAME_SECURED), portMatcher);
    }

    private void matchClientConfig(org.hamcrest.Matcher<String> protocolMatcher, org.hamcrest.Matcher<String> userNameMatcher, org.hamcrest.Matcher<String> passwordMatcher, org.hamcrest.Matcher<String> hostMatcher, org.hamcrest.Matcher<Integer> portMatcher) {
        assertThat(clientConfiguration.getProtocol().toString(), protocolMatcher);
        assertThat(clientConfiguration.getProxyUsername(), userNameMatcher);
        assertThat(clientConfiguration.getProxyPassword(), passwordMatcher);
        assertThat(clientConfiguration.getProxyHost(), hostMatcher);
        assertThat(clientConfiguration.getProxyPort(), portMatcher);
    }

    private void setSystemPropertyMockValuesOnSystem() {
        PowerMockito.mockStatic(System.class);
        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTPS_PROXY_HOST)).thenReturn(HOSTNAME_SECURED);
        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTP_PROXY_HOST)).thenReturn(HOSTNAME);

        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTPS_PROXY_PORT)).thenReturn(String.valueOf(HTTPS_PORT));
        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTP_PROXY_PORT)).thenReturn(String.valueOf(HTTP_ALT_PORT));

        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTPS_PROXY_USER)).thenReturn(USERNAME_SECURED);
        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTP_PROXY_USER)).thenReturn(USERNAME);

        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTPS_PROXY_PWD)).thenReturn(PWD_SECURED);
        when(System.getProperty(ClientConfiguration.SYSPROPKEY_HTTP_PROXY_PWD)).thenReturn(PWD);
    }

    private void setHttpProxySystemVars() {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITH_USERPWD_VALUE);
        setSystemEnvVariableHTTPS_PROXYOnSystem(HTTPS_PROXY_WITH_USERPWD_VALUE);
    }

    private void setHttpProxySystemVars(String httpsProxyValue) {
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(HTTP_PROXY_WITH_USERPWD_VALUE);
        setSystemEnvVariableHTTPS_PROXYOnSystem(httpsProxyValue);
    }

    private void setHttpProxySystemVars(String httpProxyValue, String httpsProxyValue){
        setSystemClassMock();
        setSystemEnvVariableHTTP_PROXYOnSystem(httpProxyValue);
        setSystemEnvVariableHTTPS_PROXYOnSystem(httpsProxyValue);
    }


    private void setSystemClassMock() {
        PowerMockito.spy(System.class);
    }

    private void setSystemEnvVariableHTTP_PROXYOnSystem(String httpProxyValue) {
        when(System.getenv(ClientConfiguration.HTTP_PROXY)).thenReturn(httpProxyValue);
    }

    private void setSystemEnvVariableHTTPS_PROXYOnSystem(String httpsProxyValue) {
        when(System.getenv(ClientConfiguration.HTTPS_PROXY)).thenReturn(httpsProxyValue);
    }

    private String getHttpFullStringFromClientConfig() {
        StringBuffer sb = new StringBuffer();
        sb.append(clientConfiguration.getProtocol().toString());
        sb.append("://");
        if (null != clientConfiguration.getProxyUsername() && clientConfiguration.getProxyUsername().length() > 0) {
            sb.append(clientConfiguration.getProxyUsername());
            sb.append(":");
            sb.append(clientConfiguration.getProxyPassword());
            sb.append(AT);
        }
        sb.append(clientConfiguration.getProxyHost());
        sb.append(":");
        sb.append(clientConfiguration.getProxyPort());
        return sb.toString();
    }
}