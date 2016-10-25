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
 * MethodMarshaller
 */
public class MethodJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Method method, StructuredJsonGenerator jsonGenerator) {

        if (method == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (method.getHttpMethod() != null) {
                jsonGenerator.writeFieldName("httpMethod").writeValue(method.getHttpMethod());
            }
            if (method.getAuthorizationType() != null) {
                jsonGenerator.writeFieldName("authorizationType").writeValue(method.getAuthorizationType());
            }
            if (method.getAuthorizerId() != null) {
                jsonGenerator.writeFieldName("authorizerId").writeValue(method.getAuthorizerId());
            }
            if (method.getApiKeyRequired() != null) {
                jsonGenerator.writeFieldName("apiKeyRequired").writeValue(method.getApiKeyRequired());
            }

            java.util.Map<String, Boolean> requestParametersMap = method.getRequestParameters();
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

            java.util.Map<String, String> requestModelsMap = method.getRequestModels();
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

            java.util.Map<String, MethodResponse> methodResponsesMap = method.getMethodResponses();
            if (methodResponsesMap != null) {
                jsonGenerator.writeFieldName("methodResponses");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, MethodResponse> methodResponsesMapValue : methodResponsesMap.entrySet()) {
                    if (methodResponsesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(methodResponsesMapValue.getKey());

                        MethodResponseJsonMarshaller.getInstance().marshall(methodResponsesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (method.getMethodIntegration() != null) {
                jsonGenerator.writeFieldName("methodIntegration");
                IntegrationJsonMarshaller.getInstance().marshall(method.getMethodIntegration(), jsonGenerator);
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static MethodJsonMarshaller instance;

    public static MethodJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MethodJsonMarshaller();
        return instance;
    }

}
