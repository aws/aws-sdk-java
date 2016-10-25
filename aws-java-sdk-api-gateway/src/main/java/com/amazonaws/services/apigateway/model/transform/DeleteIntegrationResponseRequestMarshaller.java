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
 * DeleteIntegrationResponseRequest Marshaller
 */
public class DeleteIntegrationResponseRequestMarshaller implements Marshaller<Request<DeleteIntegrationResponseRequest>, DeleteIntegrationResponseRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public DeleteIntegrationResponseRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<DeleteIntegrationResponseRequest> marshall(DeleteIntegrationResponseRequest deleteIntegrationResponseRequest) {

        if (deleteIntegrationResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<DeleteIntegrationResponseRequest> request = new DefaultRequest<DeleteIntegrationResponseRequest>(deleteIntegrationResponseRequest,
                "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.DELETE);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (deleteIntegrationResponseRequest.getRestApiId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(deleteIntegrationResponseRequest.getRestApiId()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (deleteIntegrationResponseRequest.getResourceId() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(deleteIntegrationResponseRequest.getResourceId()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (deleteIntegrationResponseRequest.getHttpMethod() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(deleteIntegrationResponseRequest.getHttpMethod()), false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{status_code}",
                (deleteIntegrationResponseRequest.getStatusCode() != null) ? SdkHttpUtils.urlEncode(
                        StringUtils.fromString(deleteIntegrationResponseRequest.getStatusCode()), false) : "");
        request.setResourcePath(uriResourcePath);

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
