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
package com.amazonaws.services.fms.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.fms.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * EC2CreateRouteAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2CreateRouteActionJsonUnmarshaller implements Unmarshaller<EC2CreateRouteAction, JsonUnmarshallerContext> {

    public EC2CreateRouteAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        EC2CreateRouteAction eC2CreateRouteAction = new EC2CreateRouteAction();

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
                if (context.testExpression("Description", targetDepth)) {
                    context.nextToken();
                    eC2CreateRouteAction.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationCidrBlock", targetDepth)) {
                    context.nextToken();
                    eC2CreateRouteAction.setDestinationCidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationPrefixListId", targetDepth)) {
                    context.nextToken();
                    eC2CreateRouteAction.setDestinationPrefixListId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DestinationIpv6CidrBlock", targetDepth)) {
                    context.nextToken();
                    eC2CreateRouteAction.setDestinationIpv6CidrBlock(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("VpcEndpointId", targetDepth)) {
                    context.nextToken();
                    eC2CreateRouteAction.setVpcEndpointId(ActionTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("GatewayId", targetDepth)) {
                    context.nextToken();
                    eC2CreateRouteAction.setGatewayId(ActionTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("RouteTableId", targetDepth)) {
                    context.nextToken();
                    eC2CreateRouteAction.setRouteTableId(ActionTargetJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return eC2CreateRouteAction;
    }

    private static EC2CreateRouteActionJsonUnmarshaller instance;

    public static EC2CreateRouteActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EC2CreateRouteActionJsonUnmarshaller();
        return instance;
    }
}
