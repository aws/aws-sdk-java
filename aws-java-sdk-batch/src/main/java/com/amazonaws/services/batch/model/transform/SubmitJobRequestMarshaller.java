/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.batch.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * SubmitJobRequest Marshaller
 */
public class SubmitJobRequestMarshaller implements Marshaller<Request<SubmitJobRequest>, SubmitJobRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public SubmitJobRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<SubmitJobRequest> marshall(SubmitJobRequest submitJobRequest) {

        if (submitJobRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<SubmitJobRequest> request = new DefaultRequest<SubmitJobRequest>(submitJobRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/submitjob";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (submitJobRequest.getJobName() != null) {
                jsonGenerator.writeFieldName("jobName").writeValue(submitJobRequest.getJobName());
            }
            if (submitJobRequest.getJobQueue() != null) {
                jsonGenerator.writeFieldName("jobQueue").writeValue(submitJobRequest.getJobQueue());
            }

            java.util.List<JobDependency> dependsOnList = submitJobRequest.getDependsOn();
            if (dependsOnList != null) {
                jsonGenerator.writeFieldName("dependsOn");
                jsonGenerator.writeStartArray();
                for (JobDependency dependsOnListValue : dependsOnList) {
                    if (dependsOnListValue != null) {

                        JobDependencyJsonMarshaller.getInstance().marshall(dependsOnListValue, jsonGenerator);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (submitJobRequest.getJobDefinition() != null) {
                jsonGenerator.writeFieldName("jobDefinition").writeValue(submitJobRequest.getJobDefinition());
            }

            java.util.Map<String, String> parametersMap = submitJobRequest.getParameters();
            if (parametersMap != null) {
                jsonGenerator.writeFieldName("parameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> parametersMapValue : parametersMap.entrySet()) {
                    if (parametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(parametersMapValue.getKey());

                        jsonGenerator.writeValue(parametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (submitJobRequest.getContainerOverrides() != null) {
                jsonGenerator.writeFieldName("containerOverrides");
                ContainerOverridesJsonMarshaller.getInstance().marshall(submitJobRequest.getContainerOverrides(), jsonGenerator);
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
