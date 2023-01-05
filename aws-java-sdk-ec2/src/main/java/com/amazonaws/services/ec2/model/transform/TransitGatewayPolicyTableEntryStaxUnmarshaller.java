/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TransitGatewayPolicyTableEntry StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPolicyTableEntryStaxUnmarshaller implements Unmarshaller<TransitGatewayPolicyTableEntry, StaxUnmarshallerContext> {

    public TransitGatewayPolicyTableEntry unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayPolicyTableEntry transitGatewayPolicyTableEntry = new TransitGatewayPolicyTableEntry();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayPolicyTableEntry;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("policyRuleNumber", targetDepth)) {
                    transitGatewayPolicyTableEntry.setPolicyRuleNumber(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("policyRule", targetDepth)) {
                    transitGatewayPolicyTableEntry.setPolicyRule(TransitGatewayPolicyRuleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("targetRouteTableId", targetDepth)) {
                    transitGatewayPolicyTableEntry.setTargetRouteTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayPolicyTableEntry;
                }
            }
        }
    }

    private static TransitGatewayPolicyTableEntryStaxUnmarshaller instance;

    public static TransitGatewayPolicyTableEntryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayPolicyTableEntryStaxUnmarshaller();
        return instance;
    }
}
