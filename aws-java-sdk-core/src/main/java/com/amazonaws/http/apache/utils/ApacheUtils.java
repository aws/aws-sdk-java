/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.http.apache.utils;

import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.http.settings.HttpClientSettings;
import com.amazonaws.util.FakeIOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.apache.http.protocol.HttpContext;

public class ApacheUtils {

    /**
     * Checks if the request was successful or not based on the status code.
     *
     * @param response HTTP response
     * @return True if the request was successful (i.e. has a 2xx status code), false otherwise.
     */
    public static boolean isRequestSuccessful(org.apache.http.HttpResponse response) {
        int status = response.getStatusLine().getStatusCode();
        return status / 100 == HttpStatus.SC_OK / 100;
    }

    /**
     * Creates and initializes an HttpResponse object suitable to be passed to an HTTP response
     * handler object.
     *
     * @param request Marshalled request object.
     * @param method  The HTTP method that was invoked to get the response.
     * @param context The HTTP context associated with the request and response.
     * @return The new, initialized HttpResponse object ready to be passed to an HTTP response
     * handler object.
     * @throws IOException If there were any problems getting any response information from the
     *                     HttpClient method object.
     */
    public static HttpResponse createResponse(Request<?> request,
                                        HttpRequestBase method,
                                        org.apache.http.HttpResponse apacheHttpResponse,
                                        HttpContext context) throws IOException {
        HttpResponse httpResponse = new HttpResponse(request, method, context);

        if (apacheHttpResponse.getEntity() != null) {
            httpResponse.setContent(apacheHttpResponse.getEntity().getContent());
        }

        httpResponse.setStatusCode(apacheHttpResponse.getStatusLine().getStatusCode());
        httpResponse.setStatusText(apacheHttpResponse.getStatusLine().getReasonPhrase());
        for (Header header : apacheHttpResponse.getAllHeaders()) {
            httpResponse.addHeader(header.getName(), header.getValue());
        }

        return httpResponse;
    }

    /**
     * Utility function for creating a new StringEntity and wrapping any errors
     * as a SdkClientException.
     *
     * @param s The string contents of the returned HTTP entity.
     * @return A new StringEntity with the specified contents.
     */
    public static HttpEntity newStringEntity(String s) {
        try {
            return new StringEntity(s);
        } catch (UnsupportedEncodingException e) {
            throw new SdkClientException("Unable to create HTTP entity: " + e.getMessage(), e);
        }
    }

    /**
     * Utility function for creating a new BufferedEntity and wrapping any errors
     * as a SdkClientException.
     *
     * @param entity The HTTP entity to wrap with a buffered HTTP entity.
     * @return A new BufferedHttpEntity wrapping the specified entity.
     * @throws FakeIOException only for test simulation
     */
    public static HttpEntity newBufferedHttpEntity(HttpEntity entity) throws
            FakeIOException {
        try {
            return new BufferedHttpEntity(entity);
        } catch (FakeIOException e) {
            // Only for test simulation.
            throw e;
        } catch (IOException e) {
            throw new SdkClientException("Unable to create HTTP entity: " + e.getMessage(), e);
        }
    }

    /**
     * Returns a new HttpClientContext used for request execution.
     */
    public static HttpClientContext newClientContext(HttpClientSettings settings,
                                                     Map<String, ? extends Object>
                                                             attributes) {
        final HttpClientContext clientContext = new HttpClientContext();

        if (attributes != null && !attributes.isEmpty()) {
            for (Map.Entry<String, ?> entry : attributes.entrySet()) {
                clientContext.setAttribute(entry.getKey(), entry.getValue());
            }
        }

        addPreemptiveAuthenticationProxy(clientContext, settings);

        clientContext.setAttribute(HttpContextUtils.DISABLE_SOCKET_PROXY_PROPERTY, settings.disableSocketProxy());
        return clientContext;

    }

    /**
     * Returns a new Credentials Provider for use with proxy authentication.
     */
    public static CredentialsProvider newProxyCredentialsProvider
    (HttpClientSettings settings) {
        final CredentialsProvider provider = new BasicCredentialsProvider();
        provider.setCredentials(newAuthScope(settings), newNTCredentials(settings));
        return provider;
    }

    /**
     * Returns a new instance of NTCredentials used for proxy authentication.
     */
    private static Credentials newNTCredentials(HttpClientSettings settings) {
        return new NTCredentials(settings.getProxyUsername(),
                settings.getProxyPassword(),
                settings.getProxyWorkstation(),
                settings.getProxyDomain());
    }

    /**
     * Returns a new instance of AuthScope used for proxy authentication.
     */
    private static AuthScope newAuthScope(HttpClientSettings settings) {
        return new AuthScope(settings.getProxyHost(), settings.getProxyPort());
    }

    private static void addPreemptiveAuthenticationProxy(HttpClientContext clientContext,
                                                         HttpClientSettings settings) {

        if (settings.isPreemptiveBasicProxyAuth()) {
            HttpHost targetHost = new HttpHost(settings.getProxyHost(), settings
                    .getProxyPort());
            final CredentialsProvider credsProvider = newProxyCredentialsProvider(settings);
            // Create AuthCache instance
            AuthCache authCache = new BasicAuthCache();
            // Generate BASIC scheme object and add it to the local auth cache
            BasicScheme basicAuth = new BasicScheme();
            authCache.put(targetHost, basicAuth);

            clientContext.setCredentialsProvider(credsProvider);
            clientContext.setAuthCache(authCache);
        }
    }
}
