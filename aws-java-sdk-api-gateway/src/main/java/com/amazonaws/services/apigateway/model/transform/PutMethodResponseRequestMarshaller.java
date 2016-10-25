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
 * PutMethodResponseRequest Marshaller
 */
public class PutMethodResponseRequestMarshaller implements Marshaller<Request<PutMethodResponseRequest>, PutMethodResponseRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public PutMethodResponseRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutMethodResponseRequest> marshall(PutMethodResponseRequest putMethodResponseRequest) {

        if (putMethodResponseRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutMethodResponseRequest> request = new DefaultRequest<PutMethodResponseRequest>(putMethodResponseRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/responses/{status_code}";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putMethodResponseRequest.getRestApiId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(putMethodResponseRequest.getRestApiId()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (putMethodResponseRequest.getResourceId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(putMethodResponseRequest.getResourceId()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (putMethodResponseRequest.getHttpMethod() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(putMethodResponseRequest.getHttpMethod()),
                        false) : "");
        uriResourcePath = uriResourcePath.replace(
                "{status_code}",
                (putMethodResponseRequest.getStatusCode() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(putMethodResponseRequest.getStatusCode()),
                        false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            java.util.Map<String, Boolean> responseParametersMap = putMethodResponseRequest.getResponseParameters();
            if (responseParametersMap != null) {
                jsonGenerator.writeFieldName("responseParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Boolean> responseParametersMapValue : responseParametersMap.entrySet()) {
                    if (responseParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(responseParametersMapValue.getKey());

                        jsonGenerator.writeValue(responseParametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, String> responseModelsMap = putMethodResponseRequest.getResponseModels();
            if (responseModelsMap != null) {
                jsonGenerator.writeFieldName("responseModels");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> responseModelsMapValue : responseModelsMap.entrySet()) {
                    if (responseModelsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(responseModelsMapValue.getKey());

                        jsonGenerator.writeValue(responseModelsMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", protocolFactory.getContentType());
            }
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
