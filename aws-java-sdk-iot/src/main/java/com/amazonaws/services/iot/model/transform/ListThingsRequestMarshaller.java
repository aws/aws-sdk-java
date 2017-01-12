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
package com.amazonaws.services.iot.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.util.StringUtils;

import com.amazonaws.protocol.json.*;

/**
 * ListThingsRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListThingsRequestMarshaller implements Marshaller<Request<ListThingsRequest>, ListThingsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListThingsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListThingsRequest> marshall(ListThingsRequest listThingsRequest) {

        if (listThingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListThingsRequest> request = new DefaultRequest<ListThingsRequest>(listThingsRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/things";

        request.setResourcePath(uriResourcePath);

        if (listThingsRequest.getNextToken() != null) {
            request.addParameter("nextToken", StringUtils.fromString(listThingsRequest.getNextToken()));
        }

        if (listThingsRequest.getMaxResults() != null) {
            request.addParameter("maxResults", StringUtils.fromInteger(listThingsRequest.getMaxResults()));
        }

        if (listThingsRequest.getAttributeName() != null) {
            request.addParameter("attributeName", StringUtils.fromString(listThingsRequest.getAttributeName()));
        }

        if (listThingsRequest.getAttributeValue() != null) {
            request.addParameter("attributeValue", StringUtils.fromString(listThingsRequest.getAttributeValue()));
        }

        if (listThingsRequest.getThingTypeName() != null) {
            request.addParameter("thingTypeName", StringUtils.fromString(listThingsRequest.getThingTypeName()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
