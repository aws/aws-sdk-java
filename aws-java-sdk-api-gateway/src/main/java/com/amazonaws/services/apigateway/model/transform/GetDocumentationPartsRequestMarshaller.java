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
package com.amazonaws.services.apigateway.model.transform;

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
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.SdkHttpUtils;
import com.amazonaws.protocol.json.*;

/**
 * GetDocumentationPartsRequest Marshaller
 */
public class GetDocumentationPartsRequestMarshaller implements Marshaller<Request<GetDocumentationPartsRequest>, GetDocumentationPartsRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetDocumentationPartsRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetDocumentationPartsRequest> marshall(GetDocumentationPartsRequest getDocumentationPartsRequest) {

        if (getDocumentationPartsRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetDocumentationPartsRequest> request = new DefaultRequest<GetDocumentationPartsRequest>(getDocumentationPartsRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        String uriResourcePath = "/restapis/{restapi_id}/documentation/parts";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (getDocumentationPartsRequest.getRestApiId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(getDocumentationPartsRequest.getRestApiId()), false) : "");
        request.setResourcePath(uriResourcePath);

        if (getDocumentationPartsRequest.getType() != null) {
            request.addParameter("type", StringUtils.fromString(getDocumentationPartsRequest.getType()));
        }

        if (getDocumentationPartsRequest.getNameQuery() != null) {
            request.addParameter("name", StringUtils.fromString(getDocumentationPartsRequest.getNameQuery()));
        }

        if (getDocumentationPartsRequest.getPath() != null) {
            request.addParameter("path", StringUtils.fromString(getDocumentationPartsRequest.getPath()));
        }

        if (getDocumentationPartsRequest.getPosition() != null) {
            request.addParameter("position", StringUtils.fromString(getDocumentationPartsRequest.getPosition()));
        }

        if (getDocumentationPartsRequest.getLimit() != null) {
            request.addParameter("limit", StringUtils.fromInteger(getDocumentationPartsRequest.getLimit()));
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
