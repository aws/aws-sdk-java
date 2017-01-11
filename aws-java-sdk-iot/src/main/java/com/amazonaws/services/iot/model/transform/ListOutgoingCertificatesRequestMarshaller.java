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
 * ListOutgoingCertificatesRequest Marshaller
 */
public class ListOutgoingCertificatesRequestMarshaller implements Marshaller<Request<ListOutgoingCertificatesRequest>, ListOutgoingCertificatesRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public ListOutgoingCertificatesRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListOutgoingCertificatesRequest> marshall(ListOutgoingCertificatesRequest listOutgoingCertificatesRequest) {

        if (listOutgoingCertificatesRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListOutgoingCertificatesRequest> request = new DefaultRequest<ListOutgoingCertificatesRequest>(listOutgoingCertificatesRequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/certificates-out-going";

        request.setResourcePath(uriResourcePath);

        if (listOutgoingCertificatesRequest.getPageSize() != null) {
            request.addParameter("pageSize", StringUtils.fromInteger(listOutgoingCertificatesRequest.getPageSize()));
        }

        if (listOutgoingCertificatesRequest.getMarker() != null) {
            request.addParameter("marker", StringUtils.fromString(listOutgoingCertificatesRequest.getMarker()));
        }

        if (listOutgoingCertificatesRequest.getAscendingOrder() != null) {
            request.addParameter("isAscendingOrder", StringUtils.fromBoolean(listOutgoingCertificatesRequest.getAscendingOrder()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
