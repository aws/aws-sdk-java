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

import java.util.Map;
import java.util.List;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.protocol.json.*;

/**
 * MethodResponseMarshaller
 */
public class MethodResponseJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(MethodResponse methodResponse, StructuredJsonGenerator jsonGenerator) {

        if (methodResponse == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (methodResponse.getStatusCode() != null) {
                jsonGenerator.writeFieldName("statusCode").writeValue(methodResponse.getStatusCode());
            }

            java.util.Map<String, Boolean> responseParametersMap = methodResponse.getResponseParameters();
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

            java.util.Map<String, String> responseModelsMap = methodResponse.getResponseModels();
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
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MethodResponseJsonMarshaller instance;

    public static MethodResponseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodResponseJsonMarshaller();
        return instance;
    }

}
