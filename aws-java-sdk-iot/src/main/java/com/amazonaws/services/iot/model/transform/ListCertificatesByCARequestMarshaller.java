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
package com.amazonaws.services.iot.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import static com.amazonaws.util.StringUtils.COMMA_SEPARATOR;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * ListCertificatesByCARequest Marshaller
 */
public class ListCertificatesByCARequestMarshaller implements Marshaller<Request<ListCertificatesByCARequest>, ListCertificatesByCARequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public ListCertificatesByCARequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<ListCertificatesByCARequest> marshall(ListCertificatesByCARequest listCertificatesByCARequest) {

        if (listCertificatesByCARequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<ListCertificatesByCARequest> request = new DefaultRequest<ListCertificatesByCARequest>(listCertificatesByCARequest, "AWSIot");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/certificates-by-ca/{caCertificateId}";

        uriResourcePath = uriResourcePath.replace(
                "{caCertificateId}",
                (listCertificatesByCARequest.getCaCertificateId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(listCertificatesByCARequest.getCaCertificateId()), false) : "");
        request.setResourcePath(uriResourcePath);

        if (listCertificatesByCARequest.getPageSize() != null) {
            request.addParameter("pageSize", StringUtils.fromInteger(listCertificatesByCARequest.getPageSize()));
        }

        if (listCertificatesByCARequest.getMarker() != null) {
            request.addParameter("marker", StringUtils.fromString(listCertificatesByCARequest.getMarker()));
        }

        if (listCertificatesByCARequest.getAscendingOrder() != null) {
            request.addParameter("isAscendingOrder", StringUtils.fromBoolean(listCertificatesByCARequest.getAscendingOrder()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
