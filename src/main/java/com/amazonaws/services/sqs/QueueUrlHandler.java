/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.net.URI;
import java.net.URISyntaxException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.handlers.AbstractRequestHandler;

/**
 * Custom request handler for SQS that processes the request before it gets
 * routed to the client runtime layer.
 * <p>
 * SQS MessageQueue operations take a QueueUrl parameter that needs special
 * handling to update the endpoint and resource path on the request before it's
 * executed.
 */
public class QueueUrlHandler extends AbstractRequestHandler {
    private static final String QUEUE_URL_PARAMETER = "QueueUrl";

	public void beforeRequest(Request request) {
        if (request.getParameters().get(QUEUE_URL_PARAMETER) != null) {
            String queueUrl = (String)request.getParameters().remove(QUEUE_URL_PARAMETER);

            try {
                request.setEndpoint(new URI(queueUrl));
            } catch (URISyntaxException e) {
                throw new AmazonClientException("Unable to parse SQS queue URL '" + queueUrl + "'", e);
            }
        }
	}
}