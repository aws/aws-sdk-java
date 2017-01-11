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
 * UpdateIntegrationResponseRequest Marshaller
 */
public class UpdateIntegrationResponseRequestMarshaller implements Marshaller<Request<UpdateIntegrationResponseRequest>, UpdateIntegrationResponseRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public UpdateIntegrationResponseRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<UpdateIntegrationResponseRequest> marshall(UpdateIntegrationResponseRequest updateIntegrationResponseRequest) {

        if (updateIntegrationResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateIntegrationResponseRequest> request = new DefaultRequest<UpdateIntegrationResponseRequest>(updateIntegrationResponseRequest,
                "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PATCH);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id",
                updateIntegrationResponseRequest.getRestApiId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "resource_id",
                updateIntegrationResponseRequest.getResourceId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "http_method",
                updateIntegrationResponseRequest.getHttpMethod());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "status_code",
                updateIntegrationResponseRequest.getStatusCode());
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.List<PatchOperation> patchOperationsList = updateIntegrationResponseRequest.getPatchOperations();
            if (patchOperationsList != null) {
                jsonGenerator.writeFieldName("patchOperations");
                jsonGenerator.writeStartArray();
                for (PatchOperation patchOperationsListValue : patchOperationsList) {
                    if (patchOperationsListValue != null) {

                        PatchOperationJsonMarshaller.getInstance().marshall(patchOperationsListValue, jsonGenerator);
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
