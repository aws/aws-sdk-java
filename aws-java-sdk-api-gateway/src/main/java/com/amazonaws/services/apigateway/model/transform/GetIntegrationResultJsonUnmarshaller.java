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
 * GetIntegrationResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetIntegrationResultJsonUnmarshaller implements Unmarshaller<GetIntegrationResult, JsonUnmarshallerContext> {

    public GetIntegrationResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetIntegrationResult getIntegrationResult = new GetIntegrationResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getIntegrationResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("type", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("httpMethod", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setHttpMethod(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("uri", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setUri(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionType", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setConnectionType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionId", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setConnectionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("credentials", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setCredentials(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setRequestParameters(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("requestTemplates", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setRequestTemplates(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("passthroughBehavior", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setPassthroughBehavior(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("contentHandling", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setContentHandling(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("timeoutInMillis", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setTimeoutInMillis(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("cacheNamespace", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setCacheNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cacheKeyParameters", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setCacheKeyParameters(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("integrationResponses", targetDepth)) {
                    context.nextToken();
                    getIntegrationResult.setIntegrationResponses(new MapUnmarshaller<String, IntegrationResponse>(context.getUnmarshaller(String.class),
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

        return getIntegrationResult;
    }

    private static GetIntegrationResultJsonUnmarshaller instance;

    public static GetIntegrationResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetIntegrationResultJsonUnmarshaller();
        return instance;
    }
}
