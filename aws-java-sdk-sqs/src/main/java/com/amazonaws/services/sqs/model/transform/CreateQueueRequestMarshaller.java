/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sqs.model.transform;

import java.util.Map;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.sqs.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * CreateQueueRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateQueueRequestMarshaller implements Marshaller<Request<CreateQueueRequest>, CreateQueueRequest> {

    public Request<CreateQueueRequest> marshall(CreateQueueRequest createQueueRequest) {

        if (createQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateQueueRequest> request = new DefaultRequest<CreateQueueRequest>(createQueueRequest, "AmazonSQS");
        request.addParameter("Action", "CreateQueue");
        request.addParameter("Version", "2012-11-05");
        request.setHttpMethod(HttpMethodName.POST);

        if (createQueueRequest.getQueueName() != null) {
            request.addParameter("QueueName", StringUtils.fromString(createQueueRequest.getQueueName()));
        }

        java.util.Map<String, String> attributes = createQueueRequest.getAttributes();
        int attributesListIndex = 1;
        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            if (entry.getKey() != null) {
                request.addParameter("Attribute." + attributesListIndex + ".Name", StringUtils.fromString(entry.getKey()));
            }
            if (entry.getValue() != null) {
                request.addParameter("Attribute." + attributesListIndex + ".Value", StringUtils.fromString(entry.getValue()));
            }
            attributesListIndex++;
        }

        return request;
    }

}
