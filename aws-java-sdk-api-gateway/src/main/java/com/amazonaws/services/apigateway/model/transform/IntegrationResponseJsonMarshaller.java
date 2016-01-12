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
 * IntegrationResponseMarshaller
 */
public class IntegrationResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(IntegrationResponse integrationResponse,
            JSONWriter jsonWriter) {
        if (integrationResponse == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (integrationResponse.getStatusCode() != null) {
                jsonWriter.key("statusCode").value(
                        integrationResponse.getStatusCode());
            }

            if (integrationResponse.getSelectionPattern() != null) {
                jsonWriter.key("selectionPattern").value(
                        integrationResponse.getSelectionPattern());
            }

            java.util.Map<String, String> responseParametersMap = integrationResponse
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

            java.util.Map<String, String> responseTemplatesMap = integrationResponse
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
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IntegrationResponseJsonMarshaller instance;

    public static IntegrationResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationResponseJsonMarshaller();
        return instance;
    }

}
