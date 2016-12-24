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

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DeleteMethodResponseRequest Marshaller
 */
public class DeleteMethodResponseRequestMarshaller implements Marshaller<Request<DeleteMethodResponseRequest>, DeleteMethodResponseRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteMethodResponseRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteMethodResponseRequest> marshall(DeleteMethodResponseRequest deleteMethodResponseRequest) {

        if (deleteMethodResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteMethodResponseRequest> request = new DefaultRequest<DeleteMethodResponseRequest>(deleteMethodResponseRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY
                .marshall(uriResourcePath, "restapi_id", deleteMethodResponseRequest.getRestApiId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "resource_id",
                deleteMethodResponseRequest.getResourceId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "http_method",
                deleteMethodResponseRequest.getHttpMethod());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "status_code",
                deleteMethodResponseRequest.getStatusCode());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
