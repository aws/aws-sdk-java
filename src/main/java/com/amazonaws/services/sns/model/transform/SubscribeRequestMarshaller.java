/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Subscribe Request Marshaller
 */
public class SubscribeRequestMarshaller implements Marshaller<Request<SubscribeRequest>, SubscribeRequest> {

    public Request<SubscribeRequest> marshall(SubscribeRequest subscribeRequest) {
        Request<SubscribeRequest> request = new DefaultRequest<SubscribeRequest>(subscribeRequest, "AmazonSNS");
        request.addParameter("Action", "Subscribe");
        request.addParameter("Version", "2010-03-31");
        if (subscribeRequest != null) {
            if (subscribeRequest.getTopicArn() != null) {
                request.addParameter("TopicArn", StringUtils.fromString(subscribeRequest.getTopicArn()));
            }
        }
        if (subscribeRequest != null) {
            if (subscribeRequest.getProtocol() != null) {
                request.addParameter("Protocol", StringUtils.fromString(subscribeRequest.getProtocol()));
            }
        }
        if (subscribeRequest != null) {
            if (subscribeRequest.getEndpoint() != null) {
                request.addParameter("Endpoint", StringUtils.fromString(subscribeRequest.getEndpoint()));
            }
        }


        return request;
    }
}
