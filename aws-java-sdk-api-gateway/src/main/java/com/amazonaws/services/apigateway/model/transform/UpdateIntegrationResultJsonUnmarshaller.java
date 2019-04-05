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
package com.amazonaws.services.apigateway.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * UpdateIntegrationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateIntegrationResultJsonUnmarshaller implements Unmarshaller<UpdateIntegrationResult, JsonUnmarshallerContext> {

    public UpdateIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateIntegrationResult updateIntegrationResult = new UpdateIntegrationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateIntegrationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("httpMethod", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setHttpMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uri", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionType", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentials", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setCredentials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setRequestParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("requestTemplates", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setRequestTemplates(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("passthroughBehavior", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setPassthroughBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentHandling", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setContentHandling(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInMillis", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setTimeoutInMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("cacheNamespace", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setCacheNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cacheKeyParameters", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setCacheKeyParameters(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("integrationResponses", targetDepth)) {
                    context.nextToken();
                    updateIntegrationResult.setIntegrationResponses(new MapUnmarshaller<String, IntegrationResponse>(context.getUnmarshaller(String.class),
                            IntegrationResponseJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateIntegrationResult;
    }

    private static UpdateIntegrationResultJsonUnmarshaller instance;

    public static UpdateIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
