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
 * Create Queue Request Marshaller
 */
public class CreateQueueRequestMarshaller implements Marshaller<Request<CreateQueueRequest>, CreateQueueRequest> {

    public Request<CreateQueueRequest> marshall(CreateQueueRequest createQueueRequest) {
        Request<CreateQueueRequest> request = new DefaultRequest<CreateQueueRequest>(createQueueRequest, "AmazonSQS");
        request.addParameter("Action", "CreateQueue");
        request.addParameter("Version", "2009-02-01");
        if (createQueueRequest != null) {
            if (createQueueRequest.getQueueName() != null) {
                request.addParameter("QueueName", StringUtils.fromString(createQueueRequest.getQueueName()));
            }
        }
        if (createQueueRequest != null) {
            if (createQueueRequest.getDefaultVisibilityTimeout() != null) {
                request.addParameter("DefaultVisibilityTimeout", StringUtils.fromInteger(createQueueRequest.getDefaultVisibilityTimeout()));
            }
        }


        return request;
    }
}
