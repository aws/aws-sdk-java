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
 * UpdateComputeEnvironmentRequest Marshaller
 */
public class UpdateComputeEnvironmentRequestMarshaller implements Marshaller<Request<UpdateComputeEnvironmentRequest>, UpdateComputeEnvironmentRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateComputeEnvironmentRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateComputeEnvironmentRequest> marshall(UpdateComputeEnvironmentRequest updateComputeEnvironmentRequest) {

        if (updateComputeEnvironmentRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateComputeEnvironmentRequest> request = new DefaultRequest<UpdateComputeEnvironmentRequest>(updateComputeEnvironmentRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/updatecomputeenvironment";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updateComputeEnvironmentRequest.getComputeEnvironment() != null) {
                jsonGenerator.writeFieldName("computeEnvironment").writeValue(updateComputeEnvironmentRequest.getComputeEnvironment());
            }
            if (updateComputeEnvironmentRequest.getState() != null) {
                jsonGenerator.writeFieldName("state").writeValue(updateComputeEnvironmentRequest.getState());
            }
            if (updateComputeEnvironmentRequest.getComputeResources() != null) {
                jsonGenerator.writeFieldName("computeResources");
                ComputeResourceUpdateJsonMarshaller.getInstance().marshall(updateComputeEnvironmentRequest.getComputeResources(), jsonGenerator);
            }
            if (updateComputeEnvironmentRequest.getServiceRole() != null) {
                jsonGenerator.writeFieldName("serviceRole").writeValue(updateComputeEnvironmentRequest.getServiceRole());
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
