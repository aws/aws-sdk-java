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
 * MethodResponseMarshaller
 */
public class MethodResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a JSONWriter
     */
    public void marshall(MethodResponse methodResponse, JSONWriter jsonWriter) {
        if (methodResponse == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        try {
            jsonWriter.object();

            if (methodResponse.getStatusCode() != null) {
                jsonWriter.key("statusCode").value(
                        methodResponse.getStatusCode());
            }

            java.util.Map<String, Boolean> responseParametersMap = methodResponse
                    .getResponseParameters();
            if (responseParametersMap != null) {
                jsonWriter.key("responseParameters");
                jsonWriter.object();

                for (Map.Entry<String, Boolean> responseParametersMapValue : responseParametersMap
                        .entrySet()) {
                    if (responseParametersMapValue.getValue() != null) {
                        jsonWriter.key(responseParametersMapValue.getKey());

                        jsonWriter.value(responseParametersMapValue.getValue());
                    }
                }
                jsonWriter.endObject();
            }

            java.util.Map<String, String> responseModelsMap = methodResponse
                    .getResponseModels();
            if (responseModelsMap != null) {
                jsonWriter.key("responseModels");
                jsonWriter.object();

                for (Map.Entry<String, String> responseModelsMapValue : responseModelsMap
                        .entrySet()) {
                    if (responseModelsMapValue.getValue() != null) {
                        jsonWriter.key(responseModelsMapValue.getKey());

                        jsonWriter.value(responseModelsMapValue.getValue());
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

    private static MethodResponseJsonMarshaller instance;

    public static MethodResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodResponseJsonMarshaller();
        return instance;
    }

}
