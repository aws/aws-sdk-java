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
 * RemediationAction JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemediationActionJsonUnmarshaller implements Unmarshaller<RemediationAction, JsonUnmarshallerContext> {

    public RemediationAction unmarshall(JsonUnmarshallerContext context) throws Exception {
        RemediationAction remediationAction = new RemediationAction();

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
                    remediationAction.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EC2CreateRouteAction", targetDepth)) {
                    context.nextToken();
                    remediationAction.setEC2CreateRouteAction(EC2CreateRouteActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EC2ReplaceRouteAction", targetDepth)) {
                    context.nextToken();
                    remediationAction.setEC2ReplaceRouteAction(EC2ReplaceRouteActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EC2DeleteRouteAction", targetDepth)) {
                    context.nextToken();
                    remediationAction.setEC2DeleteRouteAction(EC2DeleteRouteActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EC2CopyRouteTableAction", targetDepth)) {
                    context.nextToken();
                    remediationAction.setEC2CopyRouteTableAction(EC2CopyRouteTableActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EC2ReplaceRouteTableAssociationAction", targetDepth)) {
                    context.nextToken();
                    remediationAction.setEC2ReplaceRouteTableAssociationAction(EC2ReplaceRouteTableAssociationActionJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("EC2AssociateRouteTableAction", targetDepth)) {
                    context.nextToken();
                    remediationAction.setEC2AssociateRouteTableAction(EC2AssociateRouteTableActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EC2CreateRouteTableAction", targetDepth)) {
                    context.nextToken();
                    remediationAction.setEC2CreateRouteTableAction(EC2CreateRouteTableActionJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return remediationAction;
    }

    private static RemediationActionJsonUnmarshaller instance;

    public static RemediationActionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RemediationActionJsonUnmarshaller();
        return instance;
    }
}
