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
 * VirtualGatewayRef JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VirtualGatewayRefJsonUnmarshaller implements Unmarshaller<VirtualGatewayRef, JsonUnmarshallerContext> {

    public VirtualGatewayRef unmarshall(JsonUnmarshallerContext context) throws Exception {
        VirtualGatewayRef virtualGatewayRef = new VirtualGatewayRef();

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
                    virtualGatewayRef.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    virtualGatewayRef.setCreatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("lastUpdatedAt", targetDepth)) {
                    context.nextToken();
                    virtualGatewayRef.setLastUpdatedAt(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("meshName", targetDepth)) {
                    context.nextToken();
                    virtualGatewayRef.setMeshName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("meshOwner", targetDepth)) {
                    context.nextToken();
                    virtualGatewayRef.setMeshOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("resourceOwner", targetDepth)) {
                    context.nextToken();
                    virtualGatewayRef.setResourceOwner(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("version", targetDepth)) {
                    context.nextToken();
                    virtualGatewayRef.setVersion(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayName", targetDepth)) {
                    context.nextToken();
                    virtualGatewayRef.setVirtualGatewayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return virtualGatewayRef;
    }

    private static VirtualGatewayRefJsonUnmarshaller instance;

    public static VirtualGatewayRefJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VirtualGatewayRefJsonUnmarshaller();
        return instance;
    }
}
