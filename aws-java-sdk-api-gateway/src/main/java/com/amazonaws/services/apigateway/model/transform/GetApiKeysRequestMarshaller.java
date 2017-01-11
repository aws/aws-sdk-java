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
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetApiKeysRequest Marshaller
 */
public class GetApiKeysRequestMarshaller implements Marshaller<Request<GetApiKeysRequest>, GetApiKeysRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetApiKeysRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetApiKeysRequest> marshall(GetApiKeysRequest getApiKeysRequest) {

        if (getApiKeysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetApiKeysRequest> request = new DefaultRequest<GetApiKeysRequest>(getApiKeysRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/apikeys";

        request.setResourcePath(uriResourcePath);

        if (getApiKeysRequest.getPosition() != null) {
            request.addParameter("position", StringUtils.fromString(getApiKeysRequest.getPosition()));
        }

        if (getApiKeysRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromInteger(getApiKeysRequest.getLimit()));
        }

        if (getApiKeysRequest.getNameQuery() != null) {
            request.addParameter("name", StringUtils.fromString(getApiKeysRequest.getNameQuery()));
        }

        if (getApiKeysRequest.getCustomerId() != null) {
            request.addParameter("customerId", StringUtils.fromString(getApiKeysRequest.getCustomerId()));
        }

        if (getApiKeysRequest.getIncludeValues() != null) {
            request.addParameter("includeValues", StringUtils.fromBoolean(getApiKeysRequest.getIncludeValues()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
