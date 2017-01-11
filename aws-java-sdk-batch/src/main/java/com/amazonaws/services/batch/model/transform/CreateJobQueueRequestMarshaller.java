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
 * CreateJobQueueRequest Marshaller
 */
public class CreateJobQueueRequestMarshaller implements Marshaller<Request<CreateJobQueueRequest>, CreateJobQueueRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateJobQueueRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateJobQueueRequest> marshall(CreateJobQueueRequest createJobQueueRequest) {

        if (createJobQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateJobQueueRequest> request = new DefaultRequest<CreateJobQueueRequest>(createJobQueueRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/createjobqueue";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createJobQueueRequest.getJobQueueName() != null) {
                jsonGenerator.writeFieldName("jobQueueName").writeValue(createJobQueueRequest.getJobQueueName());
            }
            if (createJobQueueRequest.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(createJobQueueRequest.getState());
            }
            if (createJobQueueRequest.getPriority() != null) {
                jsonGenerator.writeFieldName("priority").writeValue(createJobQueueRequest.getPriority());
            }

            java.util.List<ComputeEnvironmentOrder> computeEnvironmentOrderList = createJobQueueRequest.getComputeEnvironmentOrder();
            if (computeEnvironmentOrderList != null) {
                jsonGenerator.writeFieldName("computeEnvironmentOrder");
                jsonGenerator.writeStartArray();
                for (ComputeEnvironmentOrder computeEnvironmentOrderListValue : computeEnvironmentOrderList) {
                    if (computeEnvironmentOrderListValue != null) {

                        ComputeEnvironmentOrderJsonMarshaller.getInstance().marshall(computeEnvironmentOrderListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
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
