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

public class RuntimeHttpUtils {
    private static final String COMMA = ", ";
    private static final String SPACE = " ";

    private static final String AWS_EXECUTION_ENV_PREFIX = "exec-env/";
    private static final String AWS_EXECUTION_ENV_NAME = "AWS_EXECUTION_ENV";


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
                httpClientParams, getUserAgent(config, null));

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

    public static String getUserAgent(final ClientConfiguration config, final String userAgentMarker) {
        String userDefinedPrefix = config != null ? config.getUserAgentPrefix() : "";
        String userDefinedSuffix = config != null ? config.getUserAgentSuffix() : "";
        String awsExecutionEnvironment = getEnvironmentVariable(AWS_EXECUTION_ENV_NAME);

        StringBuilder userAgent = new StringBuilder(userDefinedPrefix.trim());

        if(!ClientConfiguration.DEFAULT_USER_AGENT.equals(userDefinedPrefix)) {
            userAgent.append(COMMA).append(ClientConfiguration.DEFAULT_USER_AGENT);
        }

        if(StringUtils.hasValue(userDefinedSuffix)) {
            userAgent.append(COMMA).append(userDefinedSuffix.trim());
        }

        if(StringUtils.hasValue(awsExecutionEnvironment)) {
            userAgent.append(SPACE).append(AWS_EXECUTION_ENV_PREFIX).append(awsExecutionEnvironment.trim());
        }

        if(StringUtils.hasValue(userAgentMarker)) {
            userAgent.append(SPACE).append(userAgentMarker.trim());
        }

        return userAgent.toString();
    }

    private static String getEnvironmentVariable(String environmentVariableName) {
        try {
            return System.getenv(environmentVariableName);
        } catch (Exception e) {
            // Return an empty string if unable to get environment variable
            return "";
        }
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