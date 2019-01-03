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
package com.amazonaws.services.directconnect.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.directconnect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DirectConnectGateway JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGatewayJsonUnmarshaller implements Unmarshaller<DirectConnectGateway, JsonUnmarshallerContext> {

    public DirectConnectGateway unmarshall(JsonUnmarshallerContext context) throws Exception {
        DirectConnectGateway directConnectGateway = new DirectConnectGateway();

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
                if (context.testExpression("directConnectGatewayId", targetDepth)) {
                    context.nextToken();
                    directConnectGateway.setDirectConnectGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayName", targetDepth)) {
                    context.nextToken();
                    directConnectGateway.setDirectConnectGatewayName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("amazonSideAsn", targetDepth)) {
                    context.nextToken();
                    directConnectGateway.setAmazonSideAsn(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("ownerAccount", targetDepth)) {
                    context.nextToken();
                    directConnectGateway.setOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayState", targetDepth)) {
                    context.nextToken();
                    directConnectGateway.setDirectConnectGatewayState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateChangeError", targetDepth)) {
                    context.nextToken();
                    directConnectGateway.setStateChangeError(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return directConnectGateway;
    }

    private static DirectConnectGatewayJsonUnmarshaller instance;

    public static DirectConnectGatewayJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayJsonUnmarshaller();
        return instance;
    }
}
