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
package com.amazonaws.services.pinpoint.model.transform;

import java.io.ByteArrayInputStream;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.pinpoint.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetSegmentVersionsRequest Marshaller
 */
public class GetSegmentVersionsRequestMarshaller implements Marshaller<Request<GetSegmentVersionsRequest>, GetSegmentVersionsRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public GetSegmentVersionsRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetSegmentVersionsRequest> marshall(GetSegmentVersionsRequest getSegmentVersionsRequest) {

        if (getSegmentVersionsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetSegmentVersionsRequest> request = new DefaultRequest<GetSegmentVersionsRequest>(getSegmentVersionsRequest, "AmazonPinpoint");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/v1/apps/{application-id}/segments/{segment-id}/versions";

        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "application-id",
                getSegmentVersionsRequest.getApplicationId());
        uriResourcePath = com.amazonaws.transform.PathMarshallers.NON_GREEDY.marshall(uriResourcePath, "segment-id", getSegmentVersionsRequest.getSegmentId());
        request.setResourcePath(uriResourcePath);

        if (getSegmentVersionsRequest.getPageSize() != null) {
            request.addParameter("page-size", StringUtils.fromString(getSegmentVersionsRequest.getPageSize()));
        }

        if (getSegmentVersionsRequest.getToken() != null) {
            request.addParameter("token", StringUtils.fromString(getSegmentVersionsRequest.getToken()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
