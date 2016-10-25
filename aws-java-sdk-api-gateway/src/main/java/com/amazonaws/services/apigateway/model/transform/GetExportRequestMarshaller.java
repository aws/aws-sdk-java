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
 * GetExportRequest Marshaller
 */
public class GetExportRequestMarshaller implements Marshaller<Request<GetExportRequest>, GetExportRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public GetExportRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<GetExportRequest> marshall(GetExportRequest getExportRequest) {

        if (getExportRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<GetExportRequest> request = new DefaultRequest<GetExportRequest>(getExportRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.GET);

        if (getExportRequest.getAccepts() != null) {
            request.addHeader("Accept", StringUtils.fromString(getExportRequest.getAccepts()));
        }

        String uriResourcePath = "/restapis/{restapi_id}/stages/{stage_name}/exports/{export_type}";

        uriResourcePath = uriResourcePath.replace("{restapi_id}",
                (getExportRequest.getRestApiId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(getExportRequest.getRestApiId()), false) : "");
        uriResourcePath = uriResourcePath.replace("{stage_name}",
                (getExportRequest.getStageName() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(getExportRequest.getStageName()), false) : "");
        uriResourcePath = uriResourcePath.replace("{export_type}",
                (getExportRequest.getExportType() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(getExportRequest.getExportType()), false) : "");
        request.setResourcePath(uriResourcePath);

        java.util.Map<String, String> parameters = getExportRequest.getParameters();
        if (parameters != null) {
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                if (entry.getValue() != null) {
                    request.addParameter(StringUtils.fromString(entry.getKey()), StringUtils.fromString(entry.getValue()));
                }
            }
        }

        request.setContent(new ByteArrayInputStream(new byte[0]));
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", protocolFactory.getContentType());
        }

        return request;
    }

}
