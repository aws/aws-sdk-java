/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * GatewayRouteRef JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayRouteRefJsonUnmarshaller implements Unmarshaller<GatewayRouteRef, JsonUnmarshallerContext> {

    public GatewayRouteRef unmarshall(JsonUnmarshallerContext context) throws Exception {
        GatewayRouteRef gatewayRouteRef = new GatewayRouteRef();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("gatewayRouteName", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setGatewayRouteName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("meshName", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setMeshName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("meshOwner", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setMeshOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceOwner", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setResourceOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayName", targetDepth)) {
                    context.nextToken();
                    gatewayRouteRef.setVirtualGatewayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gatewayRouteRef;
    }

    private static GatewayRouteRefJsonUnmarshaller instance;

    public static GatewayRouteRefJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewayRouteRefJsonUnmarshaller();
        return instance;
    }
}
