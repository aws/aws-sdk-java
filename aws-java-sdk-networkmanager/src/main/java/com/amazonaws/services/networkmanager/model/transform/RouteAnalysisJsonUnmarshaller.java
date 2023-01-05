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
package com.amazonaws.services.networkmanager.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.networkmanager.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RouteAnalysis JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteAnalysisJsonUnmarshaller implements Unmarshaller<RouteAnalysis, JsonUnmarshallerContext> {

    public RouteAnalysis unmarshall(JsonUnmarshallerContext context) throws Exception {
        RouteAnalysis routeAnalysis = new RouteAnalysis();

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
                if (context.testExpression("GlobalNetworkId", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setGlobalNetworkId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OwnerAccountId", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setOwnerAccountId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("RouteAnalysisId", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setRouteAnalysisId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("StartTimestamp", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setStartTimestamp(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("Status", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Source", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setSource(RouteAnalysisEndpointOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("Destination", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setDestination(RouteAnalysisEndpointOptionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IncludeReturnPath", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setIncludeReturnPath(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("UseMiddleboxes", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setUseMiddleboxes(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("ForwardPath", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setForwardPath(RouteAnalysisPathJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ReturnPath", targetDepth)) {
                    context.nextToken();
                    routeAnalysis.setReturnPath(RouteAnalysisPathJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return routeAnalysis;
    }

    private static RouteAnalysisJsonUnmarshaller instance;

    public static RouteAnalysisJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteAnalysisJsonUnmarshaller();
        return instance;
    }
}
