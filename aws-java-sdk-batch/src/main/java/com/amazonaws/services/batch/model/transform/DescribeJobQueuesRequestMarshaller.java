/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.batch.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DescribeJobQueuesRequest Marshaller
 */
public class DescribeJobQueuesRequestMarshaller implements Marshaller<Request<DescribeJobQueuesRequest>, DescribeJobQueuesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DescribeJobQueuesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DescribeJobQueuesRequest> marshall(DescribeJobQueuesRequest describeJobQueuesRequest) {

        if (describeJobQueuesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeJobQueuesRequest> request = new DefaultRequest<DescribeJobQueuesRequest>(describeJobQueuesRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/describejobqueues";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<String> jobQueuesList = describeJobQueuesRequest.getJobQueues();
            if (jobQueuesList != null) {
                jsonGenerator.writeFieldName("jobQueues");
                jsonGenerator.writeStartArray();
                for (String jobQueuesListValue : jobQueuesList) {
                    if (jobQueuesListValue != null) {
                        jsonGenerator.writeValue(jobQueuesListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (describeJobQueuesRequest.getMaxResults() != null) {
                jsonGenerator.writeFieldName("maxResults").writeValue(describeJobQueuesRequest.getMaxResults());
            }
            if (describeJobQueuesRequest.getNextToken() != null) {
                jsonGenerator.writeFieldName("nextToken").writeValue(describeJobQueuesRequest.getNextToken());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
