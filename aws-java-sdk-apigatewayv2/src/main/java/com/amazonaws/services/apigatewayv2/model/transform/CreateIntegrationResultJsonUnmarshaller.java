/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigatewayv2.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigatewayv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CreateIntegrationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateIntegrationResultJsonUnmarshaller implements Unmarshaller<CreateIntegrationResult, JsonUnmarshallerContext> {

    public CreateIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        CreateIntegrationResult createIntegrationResult = new CreateIntegrationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return createIntegrationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionType", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentHandlingStrategy", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setContentHandlingStrategy(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentialsArn", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setCredentialsArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationId", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setIntegrationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationMethod", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setIntegrationMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationResponseSelectionExpression", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setIntegrationResponseSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationType", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setIntegrationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("integrationUri", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setIntegrationUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("passthroughBehavior", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setPassthroughBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setRequestParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("requestTemplates", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setRequestTemplates(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("templateSelectionExpression", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setTemplateSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInMillis", targetDepth)) {
                    context.nextToken();
                    createIntegrationResult.setTimeoutInMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return createIntegrationResult;
    }

    private static CreateIntegrationResultJsonUnmarshaller instance;

    public static CreateIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CreateIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
