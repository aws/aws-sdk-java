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
 * ListCACertificatesRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCACertificatesRequestMarshaller implements Marshaller<Request<ListCACertificatesRequest>, ListCACertificatesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListCACertificatesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListCACertificatesRequest> marshall(ListCACertificatesRequest listCACertificatesRequest) {

        if (listCACertificatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListCACertificatesRequest> request = new DefaultRequest<ListCACertificatesRequest>(listCACertificatesRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/cacertificates";

        request.setResourcePath(uriResourcePath);

        if (listCACertificatesRequest.getPageSize() != null) {
            request.addParameter("pageSize", StringUtils.fromInteger(listCACertificatesRequest.getPageSize()));
        }

        if (listCACertificatesRequest.getMarker() != null) {
            request.addParameter("marker", StringUtils.fromString(listCACertificatesRequest.getMarker()));
        }

        if (listCACertificatesRequest.getAscendingOrder() != null) {
            request.addParameter("isAscendingOrder", StringUtils.fromBoolean(listCACertificatesRequest.getAscendingOrder()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
