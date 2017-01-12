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

import java.util.List;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * UpdateJobQueueRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateJobQueueRequestMarshaller implements Marshaller<Request<UpdateJobQueueRequest>, UpdateJobQueueRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateJobQueueRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateJobQueueRequest> marshall(UpdateJobQueueRequest updateJobQueueRequest) {

        if (updateJobQueueRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateJobQueueRequest> request = new DefaultRequest<UpdateJobQueueRequest>(updateJobQueueRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/updatejobqueue";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updateJobQueueRequest.getJobQueue() != null) {
                jsonGenerator.writeFieldName("jobQueue").writeValue(updateJobQueueRequest.getJobQueue());
            }
            if (updateJobQueueRequest.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(updateJobQueueRequest.getState());
            }
            if (updateJobQueueRequest.getPriority() != null) {
                jsonGenerator.writeFieldName("priority").writeValue(updateJobQueueRequest.getPriority());
            }

            java.util.List<ComputeEnvironmentOrder> computeEnvironmentOrderList = updateJobQueueRequest.getComputeEnvironmentOrder();
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
