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
package com.amazonaws.services.lambda.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.lambda.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListEventSourceMappingsRequest Marshaller
 */
public class ListEventSourceMappingsRequestMarshaller implements Marshaller<Request<ListEventSourceMappingsRequest>, ListEventSourceMappingsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListEventSourceMappingsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListEventSourceMappingsRequest> marshall(ListEventSourceMappingsRequest listEventSourceMappingsRequest) {

        if (listEventSourceMappingsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListEventSourceMappingsRequest> request = new DefaultRequest<ListEventSourceMappingsRequest>(listEventSourceMappingsRequest, "AWSLambda");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/2015-03-31/event-source-mappings/";

        request.setResourcePath(uriResourcePath);

        if (listEventSourceMappingsRequest.getEventSourceArn() != null) {
            request.addParameter("EventSourceArn", StringUtils.fromString(listEventSourceMappingsRequest.getEventSourceArn()));
        }

        if (listEventSourceMappingsRequest.getFunctionName() != null) {
            request.addParameter("FunctionName", StringUtils.fromString(listEventSourceMappingsRequest.getFunctionName()));
        }

        if (listEventSourceMappingsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listEventSourceMappingsRequest.getMarker()));
        }

        if (listEventSourceMappingsRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listEventSourceMappingsRequest.getMaxItems()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
