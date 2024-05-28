/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediaconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * GatewayInstance JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayInstanceJsonUnmarshaller implements Unmarshaller<GatewayInstance, JsonUnmarshallerContext> {

    public GatewayInstance unmarshall(JsonUnmarshallerContext context) throws Exception {
        GatewayInstance gatewayInstance = new GatewayInstance();

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
                if (context.testExpression("bridgePlacement", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setBridgePlacement(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("connectionStatus", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setConnectionStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayArn", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setGatewayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayInstanceArn", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setGatewayInstanceArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceId", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setInstanceId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("instanceMessages", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setInstanceMessages(new ListUnmarshaller<MessageDetail>(MessageDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("instanceState", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setInstanceState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("runningBridgeCount", targetDepth)) {
                    context.nextToken();
                    gatewayInstance.setRunningBridgeCount(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return gatewayInstance;
    }

    private static GatewayInstanceJsonUnmarshaller instance;

    public static GatewayInstanceJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewayInstanceJsonUnmarshaller();
        return instance;
    }
}
