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
 * DirectConnectGatewayAssociationProposal JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DirectConnectGatewayAssociationProposalJsonUnmarshaller implements Unmarshaller<DirectConnectGatewayAssociationProposal, JsonUnmarshallerContext> {

    public DirectConnectGatewayAssociationProposal unmarshall(JsonUnmarshallerContext context) throws Exception {
        DirectConnectGatewayAssociationProposal directConnectGatewayAssociationProposal = new DirectConnectGatewayAssociationProposal();

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
                if (context.testExpression("proposalId", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociationProposal.setProposalId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayId", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociationProposal.setDirectConnectGatewayId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("directConnectGatewayOwnerAccount", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociationProposal.setDirectConnectGatewayOwnerAccount(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("proposalState", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociationProposal.setProposalState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("associatedGateway", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociationProposal.setAssociatedGateway(AssociatedGatewayJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("existingAllowedPrefixesToDirectConnectGateway", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociationProposal.setExistingAllowedPrefixesToDirectConnectGateway(new ListUnmarshaller<RouteFilterPrefix>(
                            RouteFilterPrefixJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("requestedAllowedPrefixesToDirectConnectGateway", targetDepth)) {
                    context.nextToken();
                    directConnectGatewayAssociationProposal.setRequestedAllowedPrefixesToDirectConnectGateway(new ListUnmarshaller<RouteFilterPrefix>(
                            RouteFilterPrefixJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return directConnectGatewayAssociationProposal;
    }

    private static DirectConnectGatewayAssociationProposalJsonUnmarshaller instance;

    public static DirectConnectGatewayAssociationProposalJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DirectConnectGatewayAssociationProposalJsonUnmarshaller();
        return instance;
    }
}
