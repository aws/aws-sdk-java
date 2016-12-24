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
 * RegisterJobDefinitionRequest Marshaller
 */
public class RegisterJobDefinitionRequestMarshaller implements Marshaller<Request<RegisterJobDefinitionRequest>, RegisterJobDefinitionRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public RegisterJobDefinitionRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<RegisterJobDefinitionRequest> marshall(RegisterJobDefinitionRequest registerJobDefinitionRequest) {

        if (registerJobDefinitionRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<RegisterJobDefinitionRequest> request = new DefaultRequest<RegisterJobDefinitionRequest>(registerJobDefinitionRequest, "AWSBatch");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/v1/registerjobdefinition";

        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (registerJobDefinitionRequest.getJobDefinitionName() != null) {
                jsonGenerator.writeFieldName("jobDefinitionName").writeValue(registerJobDefinitionRequest.getJobDefinitionName());
            }
            if (registerJobDefinitionRequest.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(registerJobDefinitionRequest.getType());
            }

            java.util.Map<String, String> parametersMap = registerJobDefinitionRequest.getParameters();
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
            if (registerJobDefinitionRequest.getContainerProperties() != null) {
                jsonGenerator.writeFieldName("containerProperties");
                ContainerPropertiesJsonMarshaller.getInstance().marshall(registerJobDefinitionRequest.getContainerProperties(), jsonGenerator);
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
