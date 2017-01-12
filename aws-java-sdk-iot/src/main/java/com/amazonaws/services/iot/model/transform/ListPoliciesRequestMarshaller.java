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
 * ListPoliciesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesRequestMarshaller implements Marshaller<Request<ListPoliciesRequest>, ListPoliciesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListPoliciesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListPoliciesRequest> marshall(ListPoliciesRequest listPoliciesRequest) {

        if (listPoliciesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListPoliciesRequest> request = new DefaultRequest<ListPoliciesRequest>(listPoliciesRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/policies";

        request.setResourcePath(uriResourcePath);

        if (listPoliciesRequest.getMarker() != null) {
            request.addParameter("marker", StringUtils.fromString(listPoliciesRequest.getMarker()));
        }

        if (listPoliciesRequest.getPageSize() != null) {
            request.addParameter("pageSize", StringUtils.fromInteger(listPoliciesRequest.getPageSize()));
        }

        if (listPoliciesRequest.getAscendingOrder() != null) {
            request.addParameter("isAscendingOrder", StringUtils.fromBoolean(listPoliciesRequest.getAscendingOrder()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
