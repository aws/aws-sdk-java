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
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * IntegrationMarshaller
 */
public class IntegrationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Integration integration, JSONWriter jsonWriter) {
        if (integration == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (integration.getType() != null) {
                jsonWriter.key("type").value(integration.getType());
            }

            if (integration.getHttpMethod() != null) {
                jsonWriter.key("httpMethod").value(integration.getHttpMethod());
            }

            if (integration.getUri() != null) {
                jsonWriter.key("uri").value(integration.getUri());
            }

            if (integration.getCredentials() != null) {
                jsonWriter.key("credentials").value(
                        integration.getCredentials());
            }

            java.util.Map<String, String> requestParametersMap = integration
                    .getRequestParameters();
            if (requestParametersMap != null) {
                jsonWriter.key("requestParameters");
                jsonWriter.object();

                for (Map.Entry<String, String> requestParametersMapValue : requestParametersMap
                        .entrySet()) {
                    if (requestParametersMapValue.getValue() != null) {
                        jsonWriter.key(requestParametersMapValue.getKey());

                        jsonWriter.value(requestParametersMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, String> requestTemplatesMap = integration
                    .getRequestTemplates();
            if (requestTemplatesMap != null) {
                jsonWriter.key("requestTemplates");
                jsonWriter.object();

                for (Map.Entry<String, String> requestTemplatesMapValue : requestTemplatesMap
                        .entrySet()) {
                    if (requestTemplatesMapValue.getValue() != null) {
                        jsonWriter.key(requestTemplatesMapValue.getKey());

                        jsonWriter.value(requestTemplatesMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            if (integration.getCacheNamespace() != null) {
                jsonWriter.key("cacheNamespace").value(
                        integration.getCacheNamespace());
            }

            java.util.List<String> cacheKeyParametersList = integration
                    .getCacheKeyParameters();
            if (cacheKeyParametersList != null) {
                jsonWriter.key("cacheKeyParameters");
                jsonWriter.array();
                for (String cacheKeyParametersListValue : cacheKeyParametersList) {
                    if (cacheKeyParametersListValue != null) {
                        jsonWriter.value(cacheKeyParametersListValue);
                    }
                }
                jsonWriter.endArray();
            }

            java.util.Map<String, IntegrationResponse> integrationResponsesMap = integration
                    .getIntegrationResponses();
            if (integrationResponsesMap != null) {
                jsonWriter.key("integrationResponses");
                jsonWriter.object();

                for (Map.Entry<String, IntegrationResponse> integrationResponsesMapValue : integrationResponsesMap
                        .entrySet()) {
                    if (integrationResponsesMapValue.getValue() != null) {
                        jsonWriter.key(integrationResponsesMapValue.getKey());

                        IntegrationResponseJsonMarshaller
                                .getInstance()
                                .marshall(
                                        integrationResponsesMapValue.getValue(),
                                        jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IntegrationJsonMarshaller instance;

    public static IntegrationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationJsonMarshaller();
        return instance;
    }

}
