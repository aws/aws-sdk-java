/*
 * Copyright (c) 2016-2019. Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.ReflectionMethodInvoker;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
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
    private static final Log log = LogFactory.getLog(ApacheUtils.class);

    private static final ReflectionMethodInvoker<RequestConfig.Builder, RequestConfig.Builder> normalizeUriInvoker;

    static {
        // Attempt to initialize the invoker once on class-load. If it fails, it will not be attempted again, but we'll
        // use that opportunity to log a warning.
        normalizeUriInvoker =
            new ReflectionMethodInvoker<RequestConfig.Builder, RequestConfig.Builder>(RequestConfig.Builder.class,
                                                                                      RequestConfig.Builder.class,
                                                                                      "setNormalizeUri",
                                                                                      boolean.class);

        try {
            normalizeUriInvoker.initialize();
        } catch (NoSuchMethodException ignored) {
            noSuchMethodThrownByNormalizeUriInvoker();
        }
    }

    private final boolean normalizeUriMethodNotFound = false;

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

        RequestConfig.Builder builder = RequestConfig.custom();
        disableNormalizeUri(builder);

        clientContext.setRequestConfig(builder.build());
        clientContext.setAttribute(HttpContextUtils.DISABLE_SOCKET_PROXY_PROPERTY, settings.disableSocketProxy());
        return clientContext;

    }

    /**
     * From Apache v4.5.8, normalization should be disabled or AWS requests with special characters in URI path will fail
     * with Signature Errors.
     * <p>
     *    setNormalizeUri is added only in 4.5.8, so customers using the latest version of SDK with old versions (4.5.6 or less)
     *    of Apache httpclient will see NoSuchMethodError. Hence this method will suppress the error.
     *
     *    Do not use Apache version 4.5.7 as it breaks URI paths with special characters and there is no option
     *    to disable normalization.
     * </p>
     *
     * For more information, See https://github.com/aws/aws-sdk-java/issues/1919
     */
    public static void disableNormalizeUri(RequestConfig.Builder requestConfigBuilder) {
        // For efficiency, do not attempt to call the invoker again if it failed to initialize on class-load
        if (normalizeUriInvoker.isInitialized()) {
            try {
                normalizeUriInvoker.invoke(requestConfigBuilder, false);
            } catch (NoSuchMethodException ignored) {
                noSuchMethodThrownByNormalizeUriInvoker();
            }
        }
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

    // Just log and then swallow the exception
    private static void noSuchMethodThrownByNormalizeUriInvoker() {
        // setNormalizeUri method was added in httpclient 4.5.8
        log.warn("NoSuchMethodException was thrown when disabling normalizeUri. This indicates you are using "
                 + "an old version (< 4.5.8) of Apache http client. It is recommended to use http client "
                 + "version >= 4.5.9 to avoid the breaking change introduced in apache client 4.5.7 and "
                 + "the latency in exception handling. See https://github.com/aws/aws-sdk-java/issues/1919"
                 + " for more information");
    }
}
