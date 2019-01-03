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
 * Route JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteJsonUnmarshaller implements Unmarshaller<Route, JsonUnmarshallerContext> {

    public Route unmarshall(JsonUnmarshallerContext context) throws Exception {
        Route route = new Route();

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
                if (context.testExpression("apiKeyRequired", targetDepth)) {
                    context.nextToken();
                    route.setApiKeyRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("authorizationScopes", targetDepth)) {
                    context.nextToken();
                    route.setAuthorizationScopes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("authorizationType", targetDepth)) {
                    context.nextToken();
                    route.setAuthorizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerId", targetDepth)) {
                    context.nextToken();
                    route.setAuthorizerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelSelectionExpression", targetDepth)) {
                    context.nextToken();
                    route.setModelSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationName", targetDepth)) {
                    context.nextToken();
                    route.setOperationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestModels", targetDepth)) {
                    context.nextToken();
                    route.setRequestModels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    route.setRequestParameters(new MapUnmarshaller<String, ParameterConstraints>(context.getUnmarshaller(String.class),
                            ParameterConstraintsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("routeId", targetDepth)) {
                    context.nextToken();
                    route.setRouteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeKey", targetDepth)) {
                    context.nextToken();
                    route.setRouteKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeResponseSelectionExpression", targetDepth)) {
                    context.nextToken();
                    route.setRouteResponseSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    route.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return route;
    }

    private static RouteJsonUnmarshaller instance;

    public static RouteJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteJsonUnmarshaller();
        return instance;
    }
}
