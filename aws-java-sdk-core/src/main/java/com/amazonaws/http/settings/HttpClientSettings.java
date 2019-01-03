/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http.settings;

import com.amazonaws.Protocol;
import com.amazonaws.ProxyAuthenticationMethod;
import java.net.InetAddress;
import java.security.SecureRandom;

import com.amazonaws.ApacheHttpClientConfig;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.DnsResolver;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.util.ValidationUtils;
import java.util.List;

/**
 * A convienient class that expose all settings in {@link ClientConfiguration} and other internal settings to the
 * underlying http client.
 */
@SdkInternalApi
public class HttpClientSettings {

    private final ClientConfiguration config;

    private final boolean useBrowserCompatibleHostNameVerifier;

    private final boolean calculateCRC32FromCompressedData;

    HttpClientSettings(final ClientConfiguration config,
                       final boolean useBrowserCompatibleHostNameVerifier,
                       final boolean calculateCRC32FromCompressedData) {
        this.config = ValidationUtils.assertNotNull(config, "client configuration");
        this.useBrowserCompatibleHostNameVerifier = useBrowserCompatibleHostNameVerifier;
        this.calculateCRC32FromCompressedData = calculateCRC32FromCompressedData;
    }

    public static HttpClientSettings adapt(final ClientConfiguration config,
            final boolean useBrowserCompatibleHostNameVerifier,
            final boolean calculateCRC32FromCompressedData) {
        return new HttpClientSettings(config, useBrowserCompatibleHostNameVerifier, calculateCRC32FromCompressedData);
    }

    public static HttpClientSettings adapt(final ClientConfiguration config,
                                           final boolean useBrowserCompatibleHostNameVerifier) {
        return adapt(config, useBrowserCompatibleHostNameVerifier, false);
    }

    public static HttpClientSettings adapt(final ClientConfiguration config) {
        return adapt(config, false);
    }

    public boolean useBrowserCompatibleHostNameVerifier() {
        return useBrowserCompatibleHostNameVerifier;
    }

    public boolean calculateCRC32FromCompressedData() {
        return calculateCRC32FromCompressedData;
    }

    public int getMaxConnections() {
        return config.getMaxConnections();
    }

    public InetAddress getLocalAddress() {
        return config.getLocalAddress();
    }

    public String getProxyHost() {
        return config.getProxyHost();
    }

    public int getProxyPort() {
        return config.getProxyPort();
    }

    public String getProxyUsername() {
        return config.getProxyUsername();
    }

    public String getProxyPassword() {
        return config.getProxyPassword();
    }

    public String getNonProxyHosts() {
        return config.getNonProxyHosts();
    }

    public List<ProxyAuthenticationMethod> getProxyAuthenticationMethods() {
        return config.getProxyAuthenticationMethods();
    }

    public boolean useReaper() {
        return config.useReaper();
    }

    public boolean useGzip() {
        return config.useGzip();
    }

    public DnsResolver getDnsResolver() {
        return config.getDnsResolver();
    }

    public ApacheHttpClientConfig getApacheHttpClientConfig() {
        return config.getApacheHttpClientConfig();
    }

    public int getSocketTimeout() {
        return config.getSocketTimeout();
    }

    public int[] getSocketBufferSize() {
        return config.getSocketBufferSizeHints();
    }

    public boolean useTcpKeepAlive() {
        return config.useTcpKeepAlive();
    }

    public SecureRandom getSecureRandom() {
        return config.getSecureRandom();
    }

    public int getConnectionTimeout() {
        return config.getConnectionTimeout();
    }

    public int getConnectionPoolRequestTimeout() {
        return config.getConnectionTimeout();
    }

    public long getConnectionPoolTTL() {
        return config.getConnectionTTL();
    }

    public long getMaxIdleConnectionTime() {
        return config.getConnectionMaxIdleMillis();
    }

    public int getValidateAfterInactivityMillis() {
        return config.getValidateAfterInactivityMillis();
    }

    public String getProxyWorkstation() {
        return config.getProxyWorkstation();
    }

    public String getProxyDomain() {
        return config.getProxyDomain();
    }

    public boolean isPreemptiveBasicProxyAuth() {
        return config.isPreemptiveBasicProxyAuth();
    }

    public boolean isUseExpectContinue() {
        return config.isUseExpectContinue();
    }

    public boolean isProxyEnabled() {
        return getProxyHost() != null && getProxyPort() > 0;
    }

    public boolean disableSocketProxy() {
        return config.disableSocketProxy();
    }

    public boolean isAuthenticatedProxy() {
        return getProxyUsername() != null && getProxyPassword() != null;
    }

    public Protocol getProxyProtocol() {
        return config.getProxyProtocol();
    }
}
