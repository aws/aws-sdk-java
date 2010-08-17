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
 * Set Queue Attributes Request Marshaller
 */
public class SetQueueAttributesRequestMarshaller implements Marshaller<Request<SetQueueAttributesRequest>, SetQueueAttributesRequest> {

    public Request<SetQueueAttributesRequest> marshall(SetQueueAttributesRequest setQueueAttributesRequest) {
        Request<SetQueueAttributesRequest> request = new DefaultRequest<SetQueueAttributesRequest>(setQueueAttributesRequest, "AmazonSQS");
        request.addParameter("Action", "SetQueueAttributes");
        request.addParameter("Version", "2009-02-01");
        if (setQueueAttributesRequest != null) {
            if (setQueueAttributesRequest.getQueueUrl() != null) {
                request.addParameter("QueueUrl", StringUtils.fromString(setQueueAttributesRequest.getQueueUrl()));
            }
        }
        if (setQueueAttributesRequest != null) {
            if (setQueueAttributesRequest.getAttributes() != null) {
                int attributesListIndex = 1;
                for (Map.Entry<String, String> attributesListValue : setQueueAttributesRequest.getAttributes().entrySet()) {

                    if (attributesListValue != null) {
                        if (attributesListValue.getKey() != null) {
                            request.addParameter("Attribute." + attributesListIndex + ".Name", StringUtils.fromString(attributesListValue.getKey()));
                        }
                    }
                    if (attributesListValue != null) {
                        if (attributesListValue.getValue() != null) {
                            request.addParameter("Attribute." + attributesListIndex + ".Value", StringUtils.fromString(attributesListValue.getValue()));
                        }
                    }
                    ++attributesListIndex;
                }
            }
        }


        return request;
    }
}
