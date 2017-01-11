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
package com.amazonaws.services.pinpoint.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.protocol.json.*;

/**
 * DeleteApnsChannelRequest Marshaller
 */
public class DeleteApnsChannelRequestMarshaller implements Marshaller<Request<DeleteApnsChannelRequest>, DeleteApnsChannelRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public DeleteApnsChannelRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteApnsChannelRequest> marshall(DeleteApnsChannelRequest deleteApnsChannelRequest) {

        if (deleteApnsChannelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteApnsChannelRequest> request = new DefaultRequest<DeleteApnsChannelRequest>(deleteApnsChannelRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/v1/apps/{application-id}/channels/apns";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "application-id",
                deleteApnsChannelRequest.getApplicationId());
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
