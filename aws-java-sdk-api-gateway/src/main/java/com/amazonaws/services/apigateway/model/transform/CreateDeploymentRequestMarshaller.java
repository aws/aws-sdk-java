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
 * CreateDeploymentRequest Marshaller
 */
public class CreateDeploymentRequestMarshaller implements
        Marshaller<Request<CreateDeploymentRequest>, CreateDeploymentRequest> {

    private static final String DEFAULT_CONTENT_TYPE = "";

    public Request<CreateDeploymentRequest> marshall(
            CreateDeploymentRequest createDeploymentRequest) {

        if (createDeploymentRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateDeploymentRequest> request = new DefaultRequest<CreateDeploymentRequest>(
                createDeploymentRequest, "AmazonApiGateway");

        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/restapis/{restapi_id}/deployments";

        uriResourcePath = uriResourcePath.replace(
                "{restapi_id}",
                (createDeploymentRequest.getRestApiId() == null) ? ""
                        : StringUtils.fromString(createDeploymentRequest
                                .getRestApiId()));
        request.setResourcePath(uriResourcePath);

        try {
            StringWriter stringWriter = new StringWriter();
            JSONWriter jsonWriter = new JSONWriter(stringWriter);

            jsonWriter.object();

            if (createDeploymentRequest.getStageName() != null) {
                jsonWriter.key("stageName").value(
                        createDeploymentRequest.getStageName());
            }

            if (createDeploymentRequest.getStageDescription() != null) {
                jsonWriter.key("stageDescription").value(
                        createDeploymentRequest.getStageDescription());
            }

            if (createDeploymentRequest.getDescription() != null) {
                jsonWriter.key("description").value(
                        createDeploymentRequest.getDescription());
            }

            if (createDeploymentRequest.getCacheClusterEnabled() != null) {
                jsonWriter.key("cacheClusterEnabled").value(
                        createDeploymentRequest.getCacheClusterEnabled());
            }

            if (createDeploymentRequest.getCacheClusterSize() != null) {
                jsonWriter.key("cacheClusterSize").value(
                        createDeploymentRequest.getCacheClusterSize());
            }

            java.util.Map<String, String> variablesMap = createDeploymentRequest
                    .getVariables();
            if (variablesMap != null) {
                jsonWriter.key("variables");
                jsonWriter.object();

                for (Map.Entry<String, String> variablesMapValue : variablesMap
                        .entrySet()) {
                    if (variablesMapValue.getValue() != null) {
                        jsonWriter.key(variablesMapValue.getKey());

                        jsonWriter.value(variablesMapValue.getValue());
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
