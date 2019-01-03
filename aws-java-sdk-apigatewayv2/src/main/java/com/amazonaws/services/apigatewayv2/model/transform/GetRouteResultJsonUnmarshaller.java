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
 * GetRouteResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRouteResultJsonUnmarshaller implements Unmarshaller<GetRouteResult, JsonUnmarshallerContext> {

    public GetRouteResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetRouteResult getRouteResult = new GetRouteResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return getRouteResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("apiKeyRequired", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setApiKeyRequired(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("authorizationScopes", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setAuthorizationScopes(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("authorizationType", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setAuthorizationType(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("authorizerId", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setAuthorizerId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("modelSelectionExpression", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setModelSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("operationName", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setOperationName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("requestModels", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setRequestModels(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context
                            .getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("requestParameters", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setRequestParameters(new MapUnmarshaller<String, ParameterConstraints>(context.getUnmarshaller(String.class),
                            ParameterConstraintsJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("routeId", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setRouteId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeKey", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setRouteKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("routeResponseSelectionExpression", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setRouteResponseSelectionExpression(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("target", targetDepth)) {
                    context.nextToken();
                    getRouteResult.setTarget(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return getRouteResult;
    }

    private static GetRouteResultJsonUnmarshaller instance;

    public static GetRouteResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetRouteResultJsonUnmarshaller();
        return instance;
    }
}
