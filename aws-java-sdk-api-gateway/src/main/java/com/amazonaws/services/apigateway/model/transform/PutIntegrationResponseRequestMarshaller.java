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
package com.amazonaws.services.apigateway.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Map;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * PutIntegrationResponseRequest Marshaller
 */
public class PutIntegrationResponseRequestMarshaller implements Marshaller<Request<PutIntegrationResponseRequest>, PutIntegrationResponseRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PutIntegrationResponseRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutIntegrationResponseRequest> marshall(PutIntegrationResponseRequest putIntegrationResponseRequest) {

        if (putIntegrationResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutIntegrationResponseRequest> request = new DefaultRequest<PutIntegrationResponseRequest>(putIntegrationResponseRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id",
                putIntegrationResponseRequest.getRestApiId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "resource_id",
                putIntegrationResponseRequest.getResourceId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "http_method",
                putIntegrationResponseRequest.getHttpMethod());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "status_code",
                putIntegrationResponseRequest.getStatusCode());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (putIntegrationResponseRequest.getSelectionPattern() != null) {
                jsonGenerator.writeFieldName("selectionPattern").writeValue(putIntegrationResponseRequest.getSelectionPattern());
            }

            java.util.Map<String, String> responseParametersMap = putIntegrationResponseRequest.getResponseParameters();
            if (responseParametersMap != null) {
                jsonGenerator.writeFieldName("responseParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> responseParametersMapValue : responseParametersMap.entrySet()) {
                    if (responseParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(responseParametersMapValue.getKey());

                        jsonGenerator.writeValue(responseParametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, String> responseTemplatesMap = putIntegrationResponseRequest.getResponseTemplates();
            if (responseTemplatesMap != null) {
                jsonGenerator.writeFieldName("responseTemplates");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> responseTemplatesMapValue : responseTemplatesMap.entrySet()) {
                    if (responseTemplatesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(responseTemplatesMapValue.getKey());

                        jsonGenerator.writeValue(responseTemplatesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (putIntegrationResponseRequest.getContentHandling() != null) {
                jsonGenerator.writeFieldName("contentHandling").writeValue(putIntegrationResponseRequest.getContentHandling());
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
