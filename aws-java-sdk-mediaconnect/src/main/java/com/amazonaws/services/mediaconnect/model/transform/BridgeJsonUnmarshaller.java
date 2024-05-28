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
 * Bridge JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BridgeJsonUnmarshaller implements Unmarshaller<Bridge, JsonUnmarshallerContext> {

    public Bridge unmarshall(JsonUnmarshallerContext context) throws Exception {
        Bridge bridge = new Bridge();

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
                if (context.testExpression("bridgeArn", targetDepth)) {
                    context.nextToken();
                    bridge.setBridgeArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("bridgeMessages", targetDepth)) {
                    context.nextToken();
                    bridge.setBridgeMessages(new ListUnmarshaller<MessageDetail>(MessageDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("bridgeState", targetDepth)) {
                    context.nextToken();
                    bridge.setBridgeState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("egressGatewayBridge", targetDepth)) {
                    context.nextToken();
                    bridge.setEgressGatewayBridge(EgressGatewayBridgeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ingressGatewayBridge", targetDepth)) {
                    context.nextToken();
                    bridge.setIngressGatewayBridge(IngressGatewayBridgeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    bridge.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("outputs", targetDepth)) {
                    context.nextToken();
                    bridge.setOutputs(new ListUnmarshaller<BridgeOutput>(BridgeOutputJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("placementArn", targetDepth)) {
                    context.nextToken();
                    bridge.setPlacementArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("sourceFailoverConfig", targetDepth)) {
                    context.nextToken();
                    bridge.setSourceFailoverConfig(FailoverConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("sources", targetDepth)) {
                    context.nextToken();
                    bridge.setSources(new ListUnmarshaller<BridgeSource>(BridgeSourceJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return bridge;
    }

    private static BridgeJsonUnmarshaller instance;

    public static BridgeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BridgeJsonUnmarshaller();
        return instance;
    }
}
