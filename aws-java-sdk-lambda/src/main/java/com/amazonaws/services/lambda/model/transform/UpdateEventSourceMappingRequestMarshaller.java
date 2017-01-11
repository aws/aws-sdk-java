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
package com.amazonaws.services.lambda.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * UpdateEventSourceMappingRequest Marshaller
 */
public class UpdateEventSourceMappingRequestMarshaller implements Marshaller<Request<UpdateEventSourceMappingRequest>, UpdateEventSourceMappingRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateEventSourceMappingRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateEventSourceMappingRequest> marshall(UpdateEventSourceMappingRequest updateEventSourceMappingRequest) {

        if (updateEventSourceMappingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateEventSourceMappingRequest> request = new DefaultRequest<UpdateEventSourceMappingRequest>(updateEventSourceMappingRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/2015-03-31/event-source-mappings/{UUID}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "UUID", updateEventSourceMappingRequest.getUUID());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (updateEventSourceMappingRequest.getFunctionName() != null) {
                jsonGenerator.writeFieldName("FunctionName").writeValue(updateEventSourceMappingRequest.getFunctionName());
            }
            if (updateEventSourceMappingRequest.getEnabled() != null) {
                jsonGenerator.writeFieldName("Enabled").writeValue(updateEventSourceMappingRequest.getEnabled());
            }
            if (updateEventSourceMappingRequest.getBatchSize() != null) {
                jsonGenerator.writeFieldName("BatchSize").writeValue(updateEventSourceMappingRequest.getBatchSize());
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
