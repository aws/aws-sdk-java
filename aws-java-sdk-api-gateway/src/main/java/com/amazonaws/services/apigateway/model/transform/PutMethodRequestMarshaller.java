/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * PutMethodRequest Marshaller
 */
public class PutMethodRequestMarshaller implements
        Marshaller<Request<PutMethodRequest>, PutMethodRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<PutMethodRequest> marshall(PutMethodRequest putMethodRequest) {

        if (putMethodRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<PutMethodRequest> request = new DefaultRequest<PutMethodRequest>(
                putMethodRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putMethodRequest.getRestApiId() == null) ? "" : StringUtils
                        .fromString(putMethodRequest.getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (putMethodRequest.getResourceId() == null) ? "" : StringUtils
                        .fromString(putMethodRequest.getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (putMethodRequest.getHttpMethod() == null) ? "" : StringUtils
                        .fromString(putMethodRequest.getHttpMethod()));
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (putMethodRequest.getAuthorizationType() != null) {
                jsonWriter.key("authorizationType").value(
                        putMethodRequest.getAuthorizationType());
            }

            if (putMethodRequest.getApiKeyRequired() != null) {
                jsonWriter.key("apiKeyRequired").value(
                        putMethodRequest.getApiKeyRequired());
            }

            java.util.Map<String, Boolean> requestParametersMap = putMethodRequest
                    .getRequestParameters();
            if (requestParametersMap != null) {
                jsonWriter.key("requestParameters");
                jsonWriter.object();

                for (Map.Entry<String, Boolean> requestParametersMapValue : requestParametersMap
                        .entrySet()) {
                    if (requestParametersMapValue.getValue() != null) {
                        jsonWriter.key(requestParametersMapValue.getKey());

                        jsonWriter.value(requestParametersMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, String> requestModelsMap = putMethodRequest
                    .getRequestModels();
            if (requestModelsMap != null) {
                jsonWriter.key("requestModels");
                jsonWriter.object();

                for (Map.Entry<String, String> requestModelsMapValue : requestModelsMap
                        .entrySet()) {
                    if (requestModelsMapValue.getValue() != null) {
                        jsonWriter.key(requestModelsMapValue.getKey());

                        jsonWriter.value(requestModelsMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();

            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length",
                    Integer.toString(content.length));
            if (!request.getHeaders().containsKey("Content-Type")) {
                request.addHeader("Content-Type", DEFAULT_CONTENT_TYPE);
            }
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
