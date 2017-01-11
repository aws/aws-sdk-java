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
 * DeleteUsagePlanRequest Marshaller
 */
public class DeleteUsagePlanRequestMarshaller implements Marshaller<Request<DeleteUsagePlanRequest>, DeleteUsagePlanRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteUsagePlanRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteUsagePlanRequest> marshall(DeleteUsagePlanRequest deleteUsagePlanRequest) {

        if (deleteUsagePlanRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteUsagePlanRequest> request = new DefaultRequest<DeleteUsagePlanRequest>(deleteUsagePlanRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/usageplans/{usageplanId}";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "usageplanId", deleteUsagePlanRequest.getUsagePlanId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
