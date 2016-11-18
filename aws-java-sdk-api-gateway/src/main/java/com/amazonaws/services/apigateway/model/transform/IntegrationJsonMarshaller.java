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
 * IntegrationMarshaller
 */
public class IntegrationJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Integration integration, StructuredJsonGenerator jsonGenerator) {

        if (integration == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (integration.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(integration.getType());
            }
            if (integration.getHttpMethod() != null) {
                jsonGenerator.writeFieldName("httpMethod").writeValue(integration.getHttpMethod());
            }
            if (integration.getUri() != null) {
                jsonGenerator.writeFieldName("uri").writeValue(integration.getUri());
            }
            if (integration.getCredentials() != null) {
                jsonGenerator.writeFieldName("credentials").writeValue(integration.getCredentials());
            }

            java.util.Map<String, String> requestParametersMap = integration.getRequestParameters();
            if (requestParametersMap != null) {
                jsonGenerator.writeFieldName("requestParameters");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> requestParametersMapValue : requestParametersMap.entrySet()) {
                    if (requestParametersMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(requestParametersMapValue.getKey());

                        jsonGenerator.writeValue(requestParametersMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }

            java.util.Map<String, String> requestTemplatesMap = integration.getRequestTemplates();
            if (requestTemplatesMap != null) {
                jsonGenerator.writeFieldName("requestTemplates");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, String> requestTemplatesMapValue : requestTemplatesMap.entrySet()) {
                    if (requestTemplatesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(requestTemplatesMapValue.getKey());

                        jsonGenerator.writeValue(requestTemplatesMapValue.getValue());
                    }
                }
                jsonGenerator.writeEndObject();
            }
            if (integration.getPassthroughBehavior() != null) {
                jsonGenerator.writeFieldName("passthroughBehavior").writeValue(integration.getPassthroughBehavior());
            }
            if (integration.getContentHandling() != null) {
                jsonGenerator.writeFieldName("contentHandling").writeValue(integration.getContentHandling());
            }
            if (integration.getCacheNamespace() != null) {
                jsonGenerator.writeFieldName("cacheNamespace").writeValue(integration.getCacheNamespace());
            }

            java.util.List<String> cacheKeyParametersList = integration.getCacheKeyParameters();
            if (cacheKeyParametersList != null) {
                jsonGenerator.writeFieldName("cacheKeyParameters");
                jsonGenerator.writeStartArray();
                for (String cacheKeyParametersListValue : cacheKeyParametersList) {
                    if (cacheKeyParametersListValue != null) {
                        jsonGenerator.writeValue(cacheKeyParametersListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }

            java.util.Map<String, IntegrationResponse> integrationResponsesMap = integration.getIntegrationResponses();
            if (integrationResponsesMap != null) {
                jsonGenerator.writeFieldName("integrationResponses");
                jsonGenerator.writeStartObject();

                for (Map.Entry<String, IntegrationResponse> integrationResponsesMapValue : integrationResponsesMap.entrySet()) {
                    if (integrationResponsesMapValue.getValue() != null) {
                        jsonGenerator.writeFieldName(integrationResponsesMapValue.getKey());

                        IntegrationResponseJsonMarshaller.getInstance().marshall(integrationResponsesMapValue.getValue(), jsonGenerator);
                    }
                }
                jsonGenerator.writeEndObject();
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static IntegrationJsonMarshaller instance;

    public static IntegrationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IntegrationJsonMarshaller();
        return instance;
    }

}
