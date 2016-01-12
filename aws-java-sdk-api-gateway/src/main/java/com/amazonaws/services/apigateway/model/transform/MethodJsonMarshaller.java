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
 * MethodMarshaller
 */
public class MethodJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(Method method, JSONWriter jsonWriter) {
        if (method == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (method.getHttpMethod() != null) {
                jsonWriter.key("httpMethod").value(method.getHttpMethod());
            }

            if (method.getAuthorizationType() != null) {
                jsonWriter.key("authorizationType").value(
                        method.getAuthorizationType());
            }

            if (method.getApiKeyRequired() != null) {
                jsonWriter.key("apiKeyRequired").value(
                        method.getApiKeyRequired());
            }

            java.util.Map<String, Boolean> requestParametersMap = method
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

            java.util.Map<String, String> requestModelsMap = method
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

            java.util.Map<String, MethodResponse> methodResponsesMap = method
                    .getMethodResponses();
            if (methodResponsesMap != null) {
                jsonWriter.key("methodResponses");
                jsonWriter.object();

                for (Map.Entry<String, MethodResponse> methodResponsesMapValue : methodResponsesMap
                        .entrySet()) {
                    if (methodResponsesMapValue.getValue() != null) {
                        jsonWriter.key(methodResponsesMapValue.getKey());

                        MethodResponseJsonMarshaller.getInstance().marshall(
                                methodResponsesMapValue.getValue(), jsonWriter);
                    }
                }
                jsonWriter.endObject();
            }

            if (method.getMethodIntegration() != null) {
                jsonWriter.key("methodIntegration");
                IntegrationJsonMarshaller.getInstance().marshall(
                        method.getMethodIntegration(), jsonWriter);
            }

            jsonWriter.endObject();
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MethodJsonMarshaller instance;

    public static MethodJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodJsonMarshaller();
        return instance;
    }

}
