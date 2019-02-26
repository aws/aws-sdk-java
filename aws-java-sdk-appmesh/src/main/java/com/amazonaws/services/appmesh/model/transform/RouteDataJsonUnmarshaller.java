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
package com.amazonaws.services.appmesh.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * RouteData JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteDataJsonUnmarshaller implements Unmarshaller<RouteData, JsonUnmarshallerContext> {

    public RouteData unmarshall(JsonUnmarshallerContext context) throws Exception {
        RouteData routeData = new RouteData();

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
                if (context.testExpression("meshName", targetDepth)) {
                    context.nextToken();
                    routeData.setMeshName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("metadata", targetDepth)) {
                    context.nextToken();
                    routeData.setMetadata(ResourceMetadataJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("routeName", targetDepth)) {
                    context.nextToken();
                    routeData.setRouteName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("spec", targetDepth)) {
                    context.nextToken();
                    routeData.setSpec(RouteSpecJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    routeData.setStatus(RouteStatusJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("virtualRouterName", targetDepth)) {
                    context.nextToken();
                    routeData.setVirtualRouterName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return routeData;
    }

    private static RouteDataJsonUnmarshaller instance;

    public static RouteDataJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RouteDataJsonUnmarshaller();
        return instance;
    }
}
