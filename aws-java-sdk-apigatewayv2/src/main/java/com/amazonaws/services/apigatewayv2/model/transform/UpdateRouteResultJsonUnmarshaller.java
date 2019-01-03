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
 * UpdateRouteResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRouteResultJsonUnmarshaller implements Unmarshaller<UpdateRouteResult, JsonUnmarshallerContext> {

    public UpdateRouteResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        UpdateRouteResult updateRouteResult = new UpdateRouteResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return updateRouteResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("apiKeyRequired", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setApiKeyRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("authorizationScopes", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setAuthorizationScopes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("authorizationType", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setAuthorizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerId", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setAuthorizerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelSelectionExpression", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setModelSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationName", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setOperationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestModels", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setRequestModels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setRequestParameters(new MapUnmarshaller<String, ParameterConstraints>(context.getUnmarshaller(String.class),
                            ParameterConstraintsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("routeId", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setRouteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeKey", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setRouteKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeResponseSelectionExpression", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setRouteResponseSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    updateRouteResult.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return updateRouteResult;
    }

    private static UpdateRouteResultJsonUnmarshaller instance;

    public static UpdateRouteResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateRouteResultJsonUnmarshaller();
        return instance;
    }
}
