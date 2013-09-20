/*
 * Copyright 2011-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.params.CoreProtocolPNames;

import com.amazonaws.AmazonClientException;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.util.HttpUtils;

/** Responsible for creating Apache HttpClient 4 request objects. */
class HttpRequestFactory {

    private static final String DEFAULT_ENCODING = "UTF-8";

    /**
     * Creates an HttpClient method object based on the specified request and
     * populates any parameters, headers, etc. from the original request.
     *
     * @param request
     *            The request to convert to an HttpClient method object.
     * @param previousEntity
     *            The optional, previous HTTP entity to reuse in the new
     *            request.
     * @param context
     *            The execution context of the HTTP method to be executed
     *
     * @return The converted HttpClient method object with any parameters,
     *         headers, etc. from the original request set.
     */
    HttpRequestBase createHttpRequest(Request<?> request, ClientConfiguration clientConfiguration, HttpEntity previousEntity, ExecutionContext context) {
        URI endpoint = request.getEndpoint();

        /*
         * HttpClient cannot handle url in pattern of "http://host//path", so we
         * have to escape the double-slash between endpoint and resource-path
         * into "/%2F"
         */
        String uri = HttpUtils.appendUri(endpoint.toString(), request.getResourcePath(), true);
        String encodedParams = HttpUtils.encodeParameters(request);

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

        HttpRequestBase httpRequest;
        if (request.getHttpMethod() == HttpMethodName.POST) {
            HttpPost postMethod = new HttpPost(uri);

            /*
             * If there isn't any payload content to include in this request,
             * then try to include the POST parameters in the query body,
             * otherwise, just use the query string. For all AWS Query services,
             * the best behavior is putting the params in the request body for
             * POST requests, but we can't do that for S3.
             */
            if (request.getContent() == null && encodedParams != null) {
                postMethod.setEntity(newStringEntity(encodedParams));
            } else {
                postMethod.setEntity(new RepeatableInputStreamRequestEntity(request));
            }
            httpRequest = postMethod;
        } else if (request.getHttpMethod() == HttpMethodName.PUT) {
            HttpPut putMethod = new HttpPut(uri);
            httpRequest = putMethod;

            /*
             * Enable 100-continue support for PUT operations, since this is
             * where we're potentially uploading large amounts of data and want
             * to find out as early as possible if an operation will fail. We
             * don't want to do this for all operations since it will cause
             * extra latency in the network interaction.
             */
            putMethod.getParams().setParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, true);

            if (previousEntity != null) {
                putMethod.setEntity(previousEntity);
            } else if (request.getContent() != null) {
                HttpEntity entity = new RepeatableInputStreamRequestEntity(request);
                if (request.getHeaders().get("Content-Length") == null) {
                    entity = newBufferedHttpEntity(entity);
                }
                putMethod.setEntity(entity);
            }
        } else if (request.getHttpMethod() == HttpMethodName.GET) {
            httpRequest = new HttpGet(uri);
        } else if (request.getHttpMethod() == HttpMethodName.DELETE) {
            httpRequest = new HttpDelete(uri);
        } else if (request.getHttpMethod() == HttpMethodName.HEAD) {
            httpRequest = new HttpHead(uri);
        } else {
            throw new AmazonClientException("Unknown HTTP method name: " + request.getHttpMethod());
        }

        configureHeaders(httpRequest, request, context, clientConfiguration);

        return httpRequest;
    }

    /** Configures the headers in the specified Apache HTTP request. */
    private void configureHeaders(HttpRequestBase httpRequest, Request<?> request, ExecutionContext context, ClientConfiguration clientConfiguration) {
        /*
         * Apache HttpClient omits the port number in the Host header (even if
         * we explicitly specify it) if it's the default port for the protocol
         * in use. To ensure that we use the same Host header in the request and
         * in the calculated string to sign (even if Apache HttpClient changed
         * and started honoring our explicit host with endpoint), we follow this
         * same behavior here and in the QueryString signer.
         */
        URI endpoint = request.getEndpoint();
        String hostHeader = endpoint.getHost();
        if (HttpUtils.isUsingNonDefaultPort(endpoint)) {
            hostHeader += ":" + endpoint.getPort();
        }
        httpRequest.addHeader("Host", hostHeader);

        // Copy over any other headers already in our request
        for (Entry<String, String> entry : request.getHeaders().entrySet()) {
            /*
             * HttpClient4 fills in the Content-Length header and complains if
             * it's already present, so we skip it here. We also skip the Host
             * header to avoid sending it twice, which will interfere with some
             * signing schemes.
             */
            if (entry.getKey().equalsIgnoreCase("Content-Length") || entry.getKey().equalsIgnoreCase("Host")) continue;

            httpRequest.addHeader(entry.getKey(), entry.getValue());
        }

        /* Set content type and encoding */
        if (httpRequest.getHeaders("Content-Type") == null || httpRequest.getHeaders("Content-Type").length == 0) {
            httpRequest.addHeader("Content-Type",
                    "application/x-www-form-urlencoded; " +
                    "charset=" + DEFAULT_ENCODING.toLowerCase());
        }

        // Override the user agent string specified in the client params if the context requires it
        if (context != null && context.getContextUserAgent() != null) {
            httpRequest.addHeader("User-Agent", createUserAgentString(clientConfiguration, context.getContextUserAgent()));
        }
    }

    /** Appends the given user-agent string to the client's existing one and returns it. */
    private String createUserAgentString(ClientConfiguration clientConfiguration, String contextUserAgent) {
        if (clientConfiguration.getUserAgent().contains(contextUserAgent)) {
            return clientConfiguration.getUserAgent();
        } else {
            return clientConfiguration.getUserAgent() + " " + contextUserAgent;
        }
    }

    /**
     * Utility function for creating a new StringEntity and wrapping any errors
     * as an AmazonClientException.
     *
     * @param s
     *            The string contents of the returned HTTP entity.
     *
     * @return A new StringEntity with the specified contents.
     */
    private HttpEntity newStringEntity(String s) {
        try {
            return new StringEntity(s);
        } catch (UnsupportedEncodingException e) {
            throw new AmazonClientException("Unable to create HTTP entity: " + e.getMessage(), e);
        }
    }

    /**
     * Utility function for creating a new BufferedEntity and wrapping any errors
     * as an AmazonClientException.
     *
     * @param entity
     *            The HTTP entity to wrap with a buffered HTTP entity.
     *
     * @return A new BufferedHttpEntity wrapping the specified entity.
     */
    private HttpEntity newBufferedHttpEntity(HttpEntity entity) {
        try {
            return new BufferedHttpEntity(entity);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to create HTTP entity: " + e.getMessage(), e);
        }
    }
}
