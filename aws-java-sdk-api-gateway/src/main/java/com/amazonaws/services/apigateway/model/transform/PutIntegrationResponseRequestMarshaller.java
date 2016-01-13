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
 * PutIntegrationResponseRequest Marshaller
 */
public class PutIntegrationResponseRequestMarshaller
        implements
        Marshaller<Request<PutIntegrationResponseRequest>, PutIntegrationResponseRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<PutIntegrationResponseRequest> marshall(
            PutIntegrationResponseRequest putIntegrationResponseRequest) {

        if (putIntegrationResponseRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<PutIntegrationResponseRequest> request = new DefaultRequest<PutIntegrationResponseRequest>(
                putIntegrationResponseRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.PUT);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}/integration/responses/{status_code}";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (putIntegrationResponseRequest.getRestApiId() == null) ? ""
                        : StringUtils.fromString(putIntegrationResponseRequest
                                .getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (putIntegrationResponseRequest.getResourceId() == null) ? ""
                        : StringUtils.fromString(putIntegrationResponseRequest
                                .getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (putIntegrationResponseRequest.getHttpMethod() == null) ? ""
                        : StringUtils.fromString(putIntegrationResponseRequest
                                .getHttpMethod()));
        uriResourcePath = uriResourcePath.replace(
                "{status_code}",
                (putIntegrationResponseRequest.getStatusCode() == null) ? ""
                        : StringUtils.fromString(putIntegrationResponseRequest
                                .getStatusCode()));
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (putIntegrationResponseRequest.getSelectionPattern() != null) {
                jsonWriter.key("selectionPattern").value(
                        putIntegrationResponseRequest.getSelectionPattern());
            }

            java.util.Map<String, String> responseParametersMap = putIntegrationResponseRequest
                    .getResponseParameters();
            if (responseParametersMap != null) {
                jsonWriter.key("responseParameters");
                jsonWriter.object();

                for (Map.Entry<String, String> responseParametersMapValue : responseParametersMap
                        .entrySet()) {
                    if (responseParametersMapValue.getValue() != null) {
                        jsonWriter.key(responseParametersMapValue.getKey());

                        jsonWriter.value(responseParametersMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, String> responseTemplatesMap = putIntegrationResponseRequest
                    .getResponseTemplates();
            if (responseTemplatesMap != null) {
                jsonWriter.key("responseTemplates");
                jsonWriter.object();

                for (Map.Entry<String, String> responseTemplatesMapValue : responseTemplatesMap
                        .entrySet()) {
                    if (responseTemplatesMapValue.getValue() != null) {
                        jsonWriter.key(responseTemplatesMapValue.getKey());

                        jsonWriter.value(responseTemplatesMapValue.getValue());
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
