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

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListThingTypesRequest Marshaller
 */
public class ListThingTypesRequestMarshaller implements Marshaller<Request<ListThingTypesRequest>, ListThingTypesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListThingTypesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListThingTypesRequest> marshall(ListThingTypesRequest listThingTypesRequest) {

        if (listThingTypesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListThingTypesRequest> request = new DefaultRequest<ListThingTypesRequest>(listThingTypesRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/thing-types";

        request.setResourcePath(uriResourcePath);

        if (listThingTypesRequest.getNextToken() != null) {
            request.addParameter("nextToken", StringUtils.fromString(listThingTypesRequest.getNextToken()));
        }

        if (listThingTypesRequest.getMaxResults() != null) {
            request.addParameter("maxResults", StringUtils.fromInteger(listThingTypesRequest.getMaxResults()));
        }

        if (listThingTypesRequest.getThingTypeName() != null) {
            request.addParameter("thingTypeName", StringUtils.fromString(listThingTypesRequest.getThingTypeName()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
