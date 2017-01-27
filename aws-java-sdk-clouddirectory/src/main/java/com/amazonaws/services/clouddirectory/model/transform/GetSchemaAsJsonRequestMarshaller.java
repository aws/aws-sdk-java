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
package com.amazonaws.services.clouddirectory.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.clouddirectory.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * GetSchemaAsJsonRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSchemaAsJsonRequestMarshaller implements Marshaller<Request<GetSchemaAsJsonRequest>, GetSchemaAsJsonRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetSchemaAsJsonRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetSchemaAsJsonRequest> marshall(GetSchemaAsJsonRequest getSchemaAsJsonRequest) {

        if (getSchemaAsJsonRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSchemaAsJsonRequest> request = new DefaultRequest<GetSchemaAsJsonRequest>(getSchemaAsJsonRequest, "AmazonCloudDirectory");

        request.setHttpMethod(HttpMethodName.POST);

        if (getSchemaAsJsonRequest.getSchemaArn() != null) {
            request.addHeader("x-amz-data-partition", StringUtils.fromString(getSchemaAsJsonRequest.getSchemaArn()));
        }

        String uriResourcePath = "/amazonclouddirectory/2017-01-11/schema/json";

        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
