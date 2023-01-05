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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TransitGatewayPolicyTable StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPolicyTableStaxUnmarshaller implements Unmarshaller<TransitGatewayPolicyTable, StaxUnmarshallerContext> {

    public TransitGatewayPolicyTable unmarshall(StaxUnmarshallerContext context) throws Exception {
        TransitGatewayPolicyTable transitGatewayPolicyTable = new TransitGatewayPolicyTable();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return transitGatewayPolicyTable;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("transitGatewayPolicyTableId", targetDepth)) {
                    transitGatewayPolicyTable.setTransitGatewayPolicyTableId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("transitGatewayId", targetDepth)) {
                    transitGatewayPolicyTable.setTransitGatewayId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    transitGatewayPolicyTable.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("creationTime", targetDepth)) {
                    transitGatewayPolicyTable.setCreationTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    transitGatewayPolicyTable.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    transitGatewayPolicyTable.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return transitGatewayPolicyTable;
                }
            }
        }
    }

    private static TransitGatewayPolicyTableStaxUnmarshaller instance;

    public static TransitGatewayPolicyTableStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TransitGatewayPolicyTableStaxUnmarshaller();
        return instance;
    }
}
