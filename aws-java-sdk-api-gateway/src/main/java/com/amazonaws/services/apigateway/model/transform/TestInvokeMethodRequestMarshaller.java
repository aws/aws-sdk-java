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
 * TestInvokeMethodRequest Marshaller
 */
public class TestInvokeMethodRequestMarshaller implements
        Marshaller<Request<TestInvokeMethodRequest>, TestInvokeMethodRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<TestInvokeMethodRequest> marshall(
            TestInvokeMethodRequest testInvokeMethodRequest) {

        if (testInvokeMethodRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<TestInvokeMethodRequest> request = new DefaultRequest<TestInvokeMethodRequest>(
                testInvokeMethodRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis/{restapi_id}/resources/{resource_id}/methods/{http_method}";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (testInvokeMethodRequest.getRestApiId() == null) ? ""
                        : StringUtils.fromString(testInvokeMethodRequest
                                .getRestApiId()));
        uriResourcePath = uriResourcePath.replace(
                "{resource_id}",
                (testInvokeMethodRequest.getResourceId() == null) ? ""
                        : StringUtils.fromString(testInvokeMethodRequest
                                .getResourceId()));
        uriResourcePath = uriResourcePath.replace(
                "{http_method}",
                (testInvokeMethodRequest.getHttpMethod() == null) ? ""
                        : StringUtils.fromString(testInvokeMethodRequest
                                .getHttpMethod()));
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (testInvokeMethodRequest.getPathWithQueryString() != null) {
                jsonWriter.key("pathWithQueryString").value(
                        testInvokeMethodRequest.getPathWithQueryString());
            }

            if (testInvokeMethodRequest.getBody() != null) {
                jsonWriter.key("body").value(testInvokeMethodRequest.getBody());
            }

            java.util.Map<String, String> headersMap = testInvokeMethodRequest
                    .getHeaders();
            if (headersMap != null) {
                jsonWriter.key("headers");
                jsonWriter.object();

                for (Map.Entry<String, String> headersMapValue : headersMap
                        .entrySet()) {
                    if (headersMapValue.getValue() != null) {
                        jsonWriter.key(headersMapValue.getKey());

                        jsonWriter.value(headersMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (testInvokeMethodRequest.getClientCertificateId() != null) {
                jsonWriter.key("clientCertificateId").value(
                        testInvokeMethodRequest.getClientCertificateId());
            }

            java.util.Map<String, String> stageVariablesMap = testInvokeMethodRequest
                    .getStageVariables();
            if (stageVariablesMap != null) {
                jsonWriter.key("stageVariables");
                jsonWriter.object();

                for (Map.Entry<String, String> stageVariablesMapValue : stageVariablesMap
                        .entrySet()) {
                    if (stageVariablesMapValue.getValue() != null) {
                        jsonWriter.key(stageVariablesMapValue.getKey());

                        jsonWriter.value(stageVariablesMapValue.getValue());
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
