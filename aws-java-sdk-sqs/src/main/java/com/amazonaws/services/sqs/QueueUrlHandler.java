/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sqs;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.handlers.AbstractRequestHandler;
import com.amazonaws.util.ReflectionMethodInvoker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Custom request handler for SQS that processes the request before it gets routed to the client
 * runtime layer.
 * <p>
 * SQS MessageQueue operations take a QueueUrl parameter that needs special handling to update the
 * endpoint and resource path on the request before it's executed.
 */
public class QueueUrlHandler extends AbstractRequestHandler {
    private final Map<Class<? extends AmazonWebServiceRequest>, ReflectionMethodInvoker<AmazonWebServiceRequest, String>> reflectionMethodInvokers =
        new ConcurrentHashMap<Class<? extends AmazonWebServiceRequest>, ReflectionMethodInvoker<AmazonWebServiceRequest, String>>();

    @Override
    public void beforeRequest(Request<?> request) {
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        String retrieveQueueUrl = retrieveQueueUrl(originalRequest);
        try {
            if (retrieveQueueUrl == null) {
                return;
            }

            URI uri = new URI(retrieveQueueUrl);
            request.setResourcePath(uri.getPath());

            if (uri.getHost() != null) {
                // If the URI has a host specified, set the request's endpoint to the queue URLs
                // endpoint, so that queue URLs from different regions will send the request to
                // the correct endpoint.
                URI uriWithoutPath = new URI(uri.toString().replace(uri.getPath(), ""));
                appendUserAgent(request, uriWithoutPath);
                request.setEndpoint(uriWithoutPath);
            }
        } catch (URISyntaxException e) {
            throw new AmazonClientException("Unable to parse SQS queue URL '" + retrieveQueueUrl + "'", e);
        }
    }

    private static void appendUserAgent(Request<?> request, URI uriWithoutPath) {
        if (!uriWithoutPath.equals(request.getEndpoint())) {
            request.getOriginalRequest().getRequestClientOptions().appendUserAgent("md/redirect");
        }
    }

    public String retrieveQueueUrl(AmazonWebServiceRequest request) {
        ReflectionMethodInvoker<AmazonWebServiceRequest, String> getter = reflectionMethodInvokers.get(request.getClass());
        if (getter == null) {
            getter = new ReflectionMethodInvoker<AmazonWebServiceRequest, String>(request.getClass(),
                                                                                  String.class,
                                                                                  "getQueueUrl");
            reflectionMethodInvokers.put(request.getClass(), getter);
        }

        try {
            return getter.invoke(request);
        } catch (NoSuchMethodException e) {
            // ignore
        }
        return null;
    }
}