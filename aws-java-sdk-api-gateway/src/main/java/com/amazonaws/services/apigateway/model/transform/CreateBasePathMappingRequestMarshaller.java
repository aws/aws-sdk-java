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
package com.amazonaws.services.apigateway.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * CreateBasePathMappingRequest Marshaller
 */
public class CreateBasePathMappingRequestMarshaller implements Marshaller<Request<CreateBasePathMappingRequest>, CreateBasePathMappingRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public CreateBasePathMappingRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<CreateBasePathMappingRequest> marshall(CreateBasePathMappingRequest createBasePathMappingRequest) {

        if (createBasePathMappingRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateBasePathMappingRequest> request = new DefaultRequest<CreateBasePathMappingRequest>(createBasePathMappingRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/domainnames/{domain_name}/basepathmappings";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "domain_name",
                createBasePathMappingRequest.getDomainName());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (createBasePathMappingRequest.getBasePath() != null) {
                jsonGenerator.writeFieldName("basePath").writeValue(createBasePathMappingRequest.getBasePath());
            }
            if (createBasePathMappingRequest.getRestApiId() != null) {
                jsonGenerator.writeFieldName("restApiId").writeValue(createBasePathMappingRequest.getRestApiId());
            }
            if (createBasePathMappingRequest.getStage() != null) {
                jsonGenerator.writeFieldName("stage").writeValue(createBasePathMappingRequest.getStage());
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
