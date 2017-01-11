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
package com.amazonaws.services.datapipeline.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DeactivatePipelineRequest Marshaller
 */
public class DeactivatePipelineRequestMarshaller implements Marshaller<Request<DeactivatePipelineRequest>, DeactivatePipelineRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeactivatePipelineRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeactivatePipelineRequest> marshall(DeactivatePipelineRequest deactivatePipelineRequest) {

        if (deactivatePipelineRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeactivatePipelineRequest> request = new DefaultRequest<DeactivatePipelineRequest>(deactivatePipelineRequest, "DataPipeline");
        request.addHeader("X-Amz-Target", "DataPipeline.DeactivatePipeline");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (deactivatePipelineRequest.getPipelineId() != null) {
                jsonGenerator.writeFieldName("pipelineId").writeValue(deactivatePipelineRequest.getPipelineId());
            }
            if (deactivatePipelineRequest.getCancelActive() != null) {
                jsonGenerator.writeFieldName("cancelActive").writeValue(deactivatePipelineRequest.getCancelActive());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
