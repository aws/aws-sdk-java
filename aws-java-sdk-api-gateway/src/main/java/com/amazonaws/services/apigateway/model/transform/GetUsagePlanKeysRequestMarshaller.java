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
 * GetUsagePlanKeysRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUsagePlanKeysRequestMarshaller implements Marshaller<Request<GetUsagePlanKeysRequest>, GetUsagePlanKeysRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetUsagePlanKeysRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetUsagePlanKeysRequest> marshall(GetUsagePlanKeysRequest getUsagePlanKeysRequest) {

        if (getUsagePlanKeysRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetUsagePlanKeysRequest> request = new DefaultRequest<GetUsagePlanKeysRequest>(getUsagePlanKeysRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/usageplans/{usageplanId}/keys";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "usageplanId", getUsagePlanKeysRequest.getUsagePlanId());
        request.setResourcePath(uriResourcePath);

        if (getUsagePlanKeysRequest.getPosition() != null) {
            request.addParameter("position", StringUtils.fromString(getUsagePlanKeysRequest.getPosition()));
        }

        if (getUsagePlanKeysRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromInteger(getUsagePlanKeysRequest.getLimit()));
        }

        if (getUsagePlanKeysRequest.getNameQuery() != null) {
            request.addParameter("name", StringUtils.fromString(getUsagePlanKeysRequest.getNameQuery()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
