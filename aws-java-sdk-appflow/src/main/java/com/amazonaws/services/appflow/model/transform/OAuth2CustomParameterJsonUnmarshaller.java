/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OAuth2CustomParameter JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OAuth2CustomParameterJsonUnmarshaller implements Unmarshaller<OAuth2CustomParameter, JsonUnmarshallerContext> {

    public OAuth2CustomParameter unmarshall(JsonUnmarshallerContext context) throws Exception {
        OAuth2CustomParameter oAuth2CustomParameter = new OAuth2CustomParameter();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    oAuth2CustomParameter.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isRequired", targetDepth)) {
                    context.nextToken();
                    oAuth2CustomParameter.setIsRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("label", targetDepth)) {
                    context.nextToken();
                    oAuth2CustomParameter.setLabel(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    oAuth2CustomParameter.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("isSensitiveField", targetDepth)) {
                    context.nextToken();
                    oAuth2CustomParameter.setIsSensitiveField(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("connectorSuppliedValues", targetDepth)) {
                    context.nextToken();
                    oAuth2CustomParameter.setConnectorSuppliedValues(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    oAuth2CustomParameter.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return oAuth2CustomParameter;
    }

    private static OAuth2CustomParameterJsonUnmarshaller instance;

    public static OAuth2CustomParameterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OAuth2CustomParameterJsonUnmarshaller();
        return instance;
    }
}
