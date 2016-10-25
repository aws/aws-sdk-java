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
 * PutMethodRequest Marshaller
 */
public class PutMethodRequestMarshaller implements Marshaller<Request<PutMethodRequest>, PutMethodRequest> {

    private final SdkJsonProtocolFactory protocolFactory;

    public PutMethodRequestMarshaller(SdkJsonProtocolFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutMethodRequest> marshall(PutMethodRequest putMethodRequest) {

        if (putMethodRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutMethodRequest> request = new DefaultRequest<PutMethodRequest>(putMethodRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}";

        uriResourcePath = uriResourcePath.replace("{restapi_id}",
                (putMethodRequest.getRestApiId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(putMethodRequest.getRestApiId()), false) : "");
        uriResourcePath = uriResourcePath.replace("{resource_id}",
                (putMethodRequest.getResourceId() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(putMethodRequest.getResourceId()), false) : "");
        uriResourcePath = uriResourcePath.replace("{http_method}",
                (putMethodRequest.getHttpMethod() != null) ? SdkHttpUtils.urlEncode(StringUtils.fromString(putMethodRequest.getHttpMethod()), false) : "");
        request.setResourcePath(uriResourcePath);

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();
            jsonGenerator.writeStartObject();

            if (putMethodRequest.getAuthorizationType() != null) {
                jsonGenerator.writeFieldName("authorizationType").writeValue(putMethodRequest.getAuthorizationType());
            }
            if (putMethodRequest.getAuthorizerId() != null) {
                jsonGenerator.writeFieldName("authorizerId").writeValue(putMethodRequest.getAuthorizerId());
            }
            if (putMethodRequest.getApiKeyRequired() != null) {
                jsonGenerator.writeFieldName("apiKeyRequired").writeValue(putMethodRequest.getApiKeyRequired());
            }

            java.util.Map<String, Boolean> requestParametersMap = putMethodRequest.getRequestParameters();
            if (requestParametersMap != null) {
                jsonGenerator.writeFieldName("requestParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, Boolean> requestParametersMapValue : requestParametersMap.entrySet()) {
                    if (requestParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(requestParametersMapValue.getKey());

                        jsonGenerator.writeValue(requestParametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, String> requestModelsMap = putMethodRequest.getRequestModels();
            if (requestModelsMap != null) {
                jsonGenerator.writeFieldName("requestModels");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> requestModelsMapValue : requestModelsMap.entrySet()) {
                    if (requestModelsMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(requestModelsMapValue.getKey());

                        jsonGenerator.writeValue(requestModelsMapValue.getValue());
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
