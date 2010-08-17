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
package com.amazonaws.services.sqs.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Send Message Request Marshaller
 */
public class SendMessageRequestMarshaller implements Marshaller<Request<SendMessageRequest>, SendMessageRequest> {

    public Request<SendMessageRequest> marshall(SendMessageRequest sendMessageRequest) {
        Request<SendMessageRequest> request = new DefaultRequest<SendMessageRequest>(sendMessageRequest, "AmazonSQS");
        request.addParameter("Action", "SendMessage");
        request.addParameter("Version", "2009-02-01");
        if (sendMessageRequest != null) {
            if (sendMessageRequest.getQueueUrl() != null) {
                request.addParameter("QueueUrl", StringUtils.fromString(sendMessageRequest.getQueueUrl()));
            }
        }
        if (sendMessageRequest != null) {
            if (sendMessageRequest.getMessageBody() != null) {
                request.addParameter("MessageBody", StringUtils.fromString(sendMessageRequest.getMessageBody()));
            }
        }


        return request;
    }
}
