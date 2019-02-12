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
package com.amazonaws.http.apache.request.impl;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.ProxyAuthenticationMethod;
import com.amazonaws.Request;
import com.amazonaws.SdkClientException;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.RepeatableInputStreamRequestEntity;
import com.amazonaws.http.apache.utils.ApacheUtils;
import com.amazonaws.http.request.HttpRequestFactory;
import com.amazonaws.http.settings.HttpClientSettings;
import com.amazonaws.util.FakeIOException;
import com.amazonaws.util.SdkHttpUtils;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.config.AuthSchemes;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * Responsible for creating Apache HttpClient 4 request objects.
 */
public class ApacheHttpRequestFactory implements
        HttpRequestFactory<HttpRequestBase> {

    private static final String DEFAULT_ENCODING = "UTF-8";

    private static final List<String> ignoreHeaders = Arrays.asList
            (HttpHeaders.CONTENT_LENGTH, HttpHeaders.HOST);

    @Override
    public HttpRequestBase create(final Request<?> request,
                                  final HttpClientSettings settings)
            throws
            FakeIOException {
        URI endpoint = request.getEndpoint();


        String uri;

        // skipAppendUriPath is set for APIs making requests with presigned urls. Otherwise
        // a slash will be appended at the end and the request will fail
        if (request.getOriginalRequest().getRequestClientOptions().isSkipAppendUriPath()) {
            uri = endpoint.toString();
        } else {
            /*
             * HttpClient cannot handle url in pattern of "http://host//path", so we
             * have to escape the double-slash between endpoint and resource-path
             * into "/%2F"
             */
            uri = SdkHttpUtils.appendUri(endpoint.toString(), request.getResourcePath(), true);
        }

        String encodedParams = SdkHttpUtils.encodeParameters(request);

        /*
         * For all non-POST requests, and any POST requests that already have a
         * payload, we put the encoded params directly in the URI, otherwise,
         * we'll put them in the POST request's payload.
         */
        boolean requestHasNoPayload = request.getContent() != null;
        boolean requestIsPost = request.getHttpMethod() == HttpMethodName.POST;
        boolean putParamsInUri = !requestIsPost || requestHasNoPayload;
        if (encodedParams != null && putParamsInUri) {
            uri += "?" + encodedParams;
        }

        final HttpRequestBase base = createApacheRequest(request, uri, encodedParams);
        addHeadersToRequest(base, request);
        addRequestConfig(base, request, settings);

        return base;
    }

    private void addRequestConfig(final HttpRequestBase base,
                                  final Request<?> request,
                                  final HttpClientSettings settings) {
        final RequestConfig.Builder requestConfigBuilder = RequestConfig
                .custom()
                .setConnectionRequestTimeout(settings.getConnectionPoolRequestTimeout())
                .setConnectTimeout(settings.getConnectionTimeout())
                .setSocketTimeout(settings.getSocketTimeout())
                .setLocalAddress(settings.getLocalAddress());

        /*
         * Enable 100-continue support for PUT operations, since this is
         * where we're potentially uploading large amounts of data and want
         * to find out as early as possible if an operation will fail. We
         * don't want to do this for all operations since it will cause
         * extra latency in the network interaction.
         */
        if (HttpMethodName.PUT == request.getHttpMethod() && settings.isUseExpectContinue()) {
            requestConfigBuilder.setExpectContinueEnabled(true);
        }

        addProxyConfig(requestConfigBuilder, settings);

        base.setConfig(requestConfigBuilder.build());
    }

    private HttpRequestBase createApacheRequest(Request<?> request, String uri, String encodedParams) throws FakeIOException {
        switch (request.getHttpMethod()) {
            case HEAD:
                return new HttpHead(uri);
            case GET:
                return wrapEntity(request, new HttpGetWithBody(uri), encodedParams);
            case DELETE:
                return new HttpDelete(uri);
            case OPTIONS:
                return new HttpOptions(uri);
            case PATCH:
                return wrapEntity(request, new HttpPatch(uri), encodedParams);
            case POST:
                return wrapEntity(request, new HttpPost(uri), encodedParams);
            case PUT:
                return wrapEntity(request, new HttpPut(uri), encodedParams);
            default:
                throw new SdkClientException("Unknown HTTP method name: " + request.getHttpMethod());
        }
    }

    private HttpRequestBase wrapEntity(Request<?> request,
                                       HttpEntityEnclosingRequestBase entityEnclosingRequest,
                                       String encodedParams) throws FakeIOException {

        if (HttpMethodName.POST == request.getHttpMethod()) {
            /*
             * If there isn't any payload content to include in this request,
             * then try to include the POST parameters in the query body,
             * otherwise, just use the query string. For all AWS Query services,
             * the best behavior is putting the params in the request body for
             * POST requests, but we can't do that for S3.
             */
            if (request.getContent() == null && encodedParams != null) {
                entityEnclosingRequest.setEntity(ApacheUtils.newStringEntity(encodedParams));
            } else {
                entityEnclosingRequest.setEntity(new RepeatableInputStreamRequestEntity(request));
            }
        } else {
            /*
             * We should never reuse the entity of the previous request, since
             * reading from the buffered entity will bypass reading from the
             * original request content. And if the content contains InputStream
             * wrappers that were added for validation-purpose (e.g.
             * Md5DigestCalculationInputStream), these wrappers would never be
             * read and updated again after AmazonHttpClient resets it in
             * preparation for the retry. Eventually, these wrappers would
             * return incorrect validation result.
             */
            if (request.getContent() != null) {
                HttpEntity entity = new RepeatableInputStreamRequestEntity(request);
                if (request.getHeaders().get(HttpHeaders.CONTENT_LENGTH) == null) {
                    entity = ApacheUtils.newBufferedHttpEntity(entity);
                }
                entityEnclosingRequest.setEntity(entity);
            }
        }
        return entityEnclosingRequest;
    }

    /**
     * Configures the headers in the specified Apache HTTP request.
     */
    private void addHeadersToRequest(HttpRequestBase httpRequest, Request<?> request) {

        httpRequest.addHeader(HttpHeaders.HOST, getHostHeaderValue(request.getEndpoint()));

        // Copy over any other headers already in our request
        for (Entry<String, String> entry : request.getHeaders().entrySet()) {
            /*
             * HttpClient4 fills in the Content-Length header and complains if
             * it's already present, so we skip it here. We also skip the Host
             * header to avoid sending it twice, which will interfere with some
             * signing schemes.
             */
            if (!(ignoreHeaders.contains(entry.getKey()))) {
                httpRequest.addHeader(entry.getKey(), entry.getValue());
            }
        }

        /* Set content type and encoding */
        if (httpRequest.getHeaders(HttpHeaders.CONTENT_TYPE) == null || httpRequest
                .getHeaders
                        (HttpHeaders.CONTENT_TYPE).length == 0) {
            httpRequest.addHeader(HttpHeaders.CONTENT_TYPE,
                    "application/x-www-form-urlencoded; " +
                            "charset=" + DEFAULT_ENCODING.toLowerCase());
        }
    }

    private String getHostHeaderValue(final URI endpoint) {
        /*
         * Apache HttpClient omits the port number in the Host header (even if
         * we explicitly specify it) if it's the default port for the protocol
         * in use. To ensure that we use the same Host header in the request and
         * in the calculated string to sign (even if Apache HttpClient changed
         * and started honoring our explicit host with endpoint), we follow this
         * same behavior here and in the QueryString signer.
         */
        return SdkHttpUtils.isUsingNonDefaultPort(endpoint)
                ? endpoint.getHost() + ":" + endpoint.getPort()
                : endpoint.getHost();
    }

    /**
     * Update the provided request configuration builder to specify the proxy authentication schemes that should be used when
     * authenticating against the HTTP proxy.
     *
     * @see ClientConfiguration#setProxyAuthenticationMethods(List)
     */
    private void addProxyConfig(RequestConfig.Builder requestConfigBuilder, HttpClientSettings settings) {
        if (settings.isProxyEnabled() && settings.isAuthenticatedProxy() && settings.getProxyAuthenticationMethods() != null) {
            List<String> apacheAuthenticationSchemes = new ArrayList<String>();

            for (ProxyAuthenticationMethod authenticationMethod : settings.getProxyAuthenticationMethods()) {
                apacheAuthenticationSchemes.add(toApacheAuthenticationScheme(authenticationMethod));
            }

            requestConfigBuilder.setProxyPreferredAuthSchemes(apacheAuthenticationSchemes);
        }
    }

    /**
     * Convert the customer-facing authentication method into an apache-specific authentication method.
     */
    private String toApacheAuthenticationScheme(ProxyAuthenticationMethod authenticationMethod) {
        if (authenticationMethod == null) {
            throw new IllegalStateException("The configured proxy authentication methods must not be null.");
        }

        switch (authenticationMethod) {
            case NTLM: return AuthSchemes.NTLM;
            case BASIC: return AuthSchemes.BASIC;
            case DIGEST: return AuthSchemes.DIGEST;
            case SPNEGO: return AuthSchemes.SPNEGO;
            case KERBEROS: return AuthSchemes.KERBEROS;
            default: throw new IllegalStateException("Unknown authentication scheme: " + authenticationMethod);
        }
    }
}