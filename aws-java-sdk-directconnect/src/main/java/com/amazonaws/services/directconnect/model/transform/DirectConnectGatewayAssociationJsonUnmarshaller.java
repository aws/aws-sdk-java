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
 * DirectConnectGatewayAssociation JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGatewayAssociationJsonUnmarshaller implements Unmarshaller<DirectConnectGatewayAssociation, JsonUnmarshallerContext> {

    public DirectConnectGatewayAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        DirectConnectGatewayAssociation directConnectGatewayAssociation = new DirectConnectGatewayAssociation();

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
                    directConnectGatewayAssociation.setDirectConnectGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayOwnerAccount", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setDirectConnectGatewayOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associationState", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setAssociationState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stateChangeError", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setStateChangeError(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatedGateway", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setAssociatedGateway(AssociatedGatewayJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("associationId", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setAssociationId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("allowedPrefixesToDirectConnectGateway", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setAllowedPrefixesToDirectConnectGateway(new ListUnmarshaller<RouteFilterPrefix>(
                            RouteFilterPrefixJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayId", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setVirtualGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayRegion", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setVirtualGatewayRegion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("virtualGatewayOwnerAccount", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociation.setVirtualGatewayOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return directConnectGatewayAssociation;
    }

    private static DirectConnectGatewayAssociationJsonUnmarshaller instance;

    public static DirectConnectGatewayAssociationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAssociationJsonUnmarshaller();
        return instance;
    }
}
