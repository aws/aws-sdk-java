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
 * Gateway JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GatewayJsonUnmarshaller implements Unmarshaller<Gateway, JsonUnmarshallerContext> {

    public Gateway unmarshall(JsonUnmarshallerContext context) throws Exception {
        Gateway gateway = new Gateway();

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
                if (context.testExpression("egressCidrBlocks", targetDepth)) {
                    context.nextToken();
                    gateway.setEgressCidrBlocks(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("gatewayArn", targetDepth)) {
                    context.nextToken();
                    gateway.setGatewayArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("gatewayMessages", targetDepth)) {
                    context.nextToken();
                    gateway.setGatewayMessages(new ListUnmarshaller<MessageDetail>(MessageDetailJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("gatewayState", targetDepth)) {
                    context.nextToken();
                    gateway.setGatewayState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    gateway.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("networks", targetDepth)) {
                    context.nextToken();
                    gateway.setNetworks(new ListUnmarshaller<GatewayNetwork>(GatewayNetworkJsonUnmarshaller.getInstance())

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

        return gateway;
    }

    private static GatewayJsonUnmarshaller instance;

    public static GatewayJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GatewayJsonUnmarshaller();
        return instance;
    }
}
