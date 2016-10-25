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
 * AuthorizerMarshaller
 */
public class AuthorizerJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(Authorizer authorizer, StructuredJsonGenerator jsonGenerator) {

        if (authorizer == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (authorizer.getId() != null) {
                jsonGenerator.writeFieldName("id").writeValue(authorizer.getId());
            }
            if (authorizer.getName() != null) {
                jsonGenerator.writeFieldName("name").writeValue(authorizer.getName());
            }
            if (authorizer.getType() != null) {
                jsonGenerator.writeFieldName("type").writeValue(authorizer.getType());
            }

            java.util.List<String> providerARNsList = authorizer.getProviderARNs();
            if (providerARNsList != null) {
                jsonGenerator.writeFieldName("providerARNs");
                jsonGenerator.writeStartArray();
                for (String providerARNsListValue : providerARNsList) {
                    if (providerARNsListValue != null) {
                        jsonGenerator.writeValue(providerARNsListValue);
                    }
                }
                jsonGenerator.writeEndArray();
            }
            if (authorizer.getAuthType() != null) {
                jsonGenerator.writeFieldName("authType").writeValue(authorizer.getAuthType());
            }
            if (authorizer.getAuthorizerUri() != null) {
                jsonGenerator.writeFieldName("authorizerUri").writeValue(authorizer.getAuthorizerUri());
            }
            if (authorizer.getAuthorizerCredentials() != null) {
                jsonGenerator.writeFieldName("authorizerCredentials").writeValue(authorizer.getAuthorizerCredentials());
            }
            if (authorizer.getIdentitySource() != null) {
                jsonGenerator.writeFieldName("identitySource").writeValue(authorizer.getIdentitySource());
            }
            if (authorizer.getIdentityValidationExpression() != null) {
                jsonGenerator.writeFieldName("identityValidationExpression").writeValue(authorizer.getIdentityValidationExpression());
            }
            if (authorizer.getAuthorizerResultTtlInSeconds() != null) {
                jsonGenerator.writeFieldName("authorizerResultTtlInSeconds").writeValue(authorizer.getAuthorizerResultTtlInSeconds());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static AuthorizerJsonMarshaller instance;

    public static AuthorizerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AuthorizerJsonMarshaller();
        return instance;
    }

}
