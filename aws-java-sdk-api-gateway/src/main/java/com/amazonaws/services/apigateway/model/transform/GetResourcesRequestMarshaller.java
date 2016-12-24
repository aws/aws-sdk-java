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
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetResourcesRequest Marshaller
 */
public class GetResourcesRequestMarshaller implements Marshaller<Request<GetResourcesRequest>, GetResourcesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetResourcesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetResourcesRequest> marshall(GetResourcesRequest getResourcesRequest) {

        if (getResourcesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetResourcesRequest> request = new DefaultRequest<GetResourcesRequest>(getResourcesRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restapis/{restapi_id}/resources";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "restapi_id", getResourcesRequest.getRestApiId());
        request.setResourcePath(uriResourcePath);

        if (getResourcesRequest.getPosition() != null) {
            request.addParameter("position", StringUtils.fromString(getResourcesRequest.getPosition()));
        }

        if (getResourcesRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromInteger(getResourcesRequest.getLimit()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
