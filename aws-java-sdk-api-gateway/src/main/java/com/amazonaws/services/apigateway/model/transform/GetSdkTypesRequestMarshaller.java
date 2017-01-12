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

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * GetSdkTypesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSdkTypesRequestMarshaller implements Marshaller<Request<GetSdkTypesRequest>, GetSdkTypesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetSdkTypesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetSdkTypesRequest> marshall(GetSdkTypesRequest getSdkTypesRequest) {

        if (getSdkTypesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSdkTypesRequest> request = new DefaultRequest<GetSdkTypesRequest>(getSdkTypesRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/sdktypes";

        request.setResourcePath(uriResourcePath);

        if (getSdkTypesRequest.getPosition() != null) {
            request.addParameter("position", StringUtils.fromString(getSdkTypesRequest.getPosition()));
        }

        if (getSdkTypesRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromInteger(getSdkTypesRequest.getLimit()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
