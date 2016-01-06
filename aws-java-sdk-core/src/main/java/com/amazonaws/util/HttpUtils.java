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
package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;

public class HttpUtils {

    /**
     * @deprecated by {@link SdkHttpUtils#urlEncode(String, boolean)}
     */
    @Deprecated
    public static String urlEncode(final String value, final boolean path) {
        return SdkHttpUtils.urlEncode(value, path);
    }

    /**
     * @deprecated by {@link SdkHttpUtils#isUsingNonDefaultPort(URI)}
     */
    @Deprecated
    public static boolean isUsingNonDefaultPort(URI uri) {
        return SdkHttpUtils.isUsingNonDefaultPort(uri);
    }

    /**
     * @deprecated by {@link SdkHttpUtils#usePayloadForQueryParameters(com.amazonaws.SignableRequest)}
     */
    @Deprecated
    public static boolean usePayloadForQueryParameters(Request<?> request) {
        return SdkHttpUtils.usePayloadForQueryParameters(request);
    }

    /**
     * @deprecated by {@link SdkHttpUtils#encodeParameters(com.amazonaws.SignableRequest)}
     */
    @Deprecated
    public static String encodeParameters(Request<?> request) {
        return SdkHttpUtils.encodeParameters(request);
    }

    /**
     * @deprecated by {@link SdkHttpUtils#appendUri(String, String)}
     */
    @Deprecated
    public static String appendUri(String baseUri, String path) {
        return SdkHttpUtils.appendUri(baseUri, path);
    }

    /**
     * @deprecated by {@link SdkHttpUtils#appendUri(String, String, boolean)}
     */
    @Deprecated
    public static String appendUri(final String baseUri, String path,
            final boolean escapeDoubleSlash) {
        return SdkHttpUtils.appendUri(baseUri, path, escapeDoubleSlash);
    }

    /**
     * Fetches a file from the URI given and returns an input stream to it.
     *
     * @param uri the uri of the file to fetch
     * @param config optional configuration overrides
     * @return an InputStream containing the retrieved data
     * @throws IOException on error
     */
    @SuppressWarnings("deprecation")
    public static InputStream fetchFile(
            final URI uri,
            final ClientConfiguration config) throws IOException {

        HttpParams httpClientParams = new BasicHttpParams();
        HttpProtocolParams.setUserAgent(
                httpClientParams, getUserAgent(config));

        HttpConnectionParams.setConnectionTimeout(
                httpClientParams, getConnectionTimeout(config));
        HttpConnectionParams.setSoTimeout(
                httpClientParams, getSocketTimeout(config));

        DefaultHttpClient httpclient = new DefaultHttpClient(httpClientParams);

        if (config != null) {
            String proxyHost = config.getProxyHost();
            int proxyPort = config.getProxyPort();

            if (proxyHost != null && proxyPort > 0) {

                HttpHost proxy = new HttpHost(proxyHost, proxyPort);
                httpclient.getParams().setParameter(
                        ConnRoutePNames.DEFAULT_PROXY, proxy);

                if (config.getProxyUsername() != null
                    && config.getProxyPassword() != null) {

                    httpclient.getCredentialsProvider().setCredentials(
                            new AuthScope(proxyHost, proxyPort),
                            new NTCredentials(config.getProxyUsername(),
                                              config.getProxyPassword(),
                                              config.getProxyWorkstation(),
                                              config.getProxyDomain()));
                }
            }
        }

        HttpResponse response = httpclient.execute(new HttpGet(uri));

        if (response.getStatusLine().getStatusCode() != 200) {
            throw new IOException("Error fetching file from " + uri + ": "
                                  + response);
        }

        return new HttpClientWrappingInputStream(
                httpclient,
                response.getEntity().getContent());
    }

    private static String getUserAgent(final ClientConfiguration config) {
        String userAgent = null;

        if (config != null) {
            userAgent = config.getUserAgent();
        }

        if (userAgent == null) {
            userAgent = ClientConfiguration.DEFAULT_USER_AGENT;
        } else if (!ClientConfiguration.DEFAULT_USER_AGENT.equals(userAgent)) {
            userAgent += ", " + ClientConfiguration.DEFAULT_USER_AGENT;
        }

        return userAgent;
    }

    private static int getConnectionTimeout(final ClientConfiguration config) {
        if (config != null) {
            return config.getConnectionTimeout();
        }
        return ClientConfiguration.DEFAULT_CONNECTION_TIMEOUT;
    }

    private static int getSocketTimeout(final ClientConfiguration config) {
        if (config != null) {
            return config.getSocketTimeout();
        }
        return ClientConfiguration.DEFAULT_SOCKET_TIMEOUT;
    }

    /**
     * Returns an URI for the given endpoint.
     * Prefixes the protocol if the endpoint given does not have it.
     *
     * @throws IllegalArgumentException if the inputs are null.
     */
    public static URI toUri(String endpoint, ClientConfiguration config) {

        if (config == null) {
            throw new IllegalArgumentException("ClientConfiguration cannot be null");
        }

        if (endpoint == null) {
            throw new IllegalArgumentException("endpoint cannot be null");
        }

        /*
         * If the endpoint doesn't explicitly specify a protocol to use, then
         * we'll defer to the default protocol specified in the client
         * configuration.
         */
        if (!endpoint.contains("://")) {
            endpoint = config.getProtocol().toString() + "://" + endpoint;
        }

        try {
            return new URI(endpoint);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
}