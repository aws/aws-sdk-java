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
package com.amazonaws.services.redshift.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ReservedNode StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodeStaxUnmarshaller implements Unmarshaller<ReservedNode, StaxUnmarshallerContext> {

    public ReservedNode unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedNode reservedNode = new ReservedNode();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservedNode;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReservedNodeId", targetDepth)) {
                    reservedNode.setReservedNodeId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReservedNodeOfferingId", targetDepth)) {
                    reservedNode.setReservedNodeOfferingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeType", targetDepth)) {
                    reservedNode.setNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StartTime", targetDepth)) {
                    reservedNode.setStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Duration", targetDepth)) {
                    reservedNode.setDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FixedPrice", targetDepth)) {
                    reservedNode.setFixedPrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UsagePrice", targetDepth)) {
                    reservedNode.setUsagePrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrencyCode", targetDepth)) {
                    reservedNode.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeCount", targetDepth)) {
                    reservedNode.setNodeCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("State", targetDepth)) {
                    reservedNode.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OfferingType", targetDepth)) {
                    reservedNode.setOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecurringCharges", targetDepth)) {
                    reservedNode.withRecurringCharges(new ArrayList<RecurringCharge>());
                    continue;
                }

                if (context.testExpression("RecurringCharges/RecurringCharge", targetDepth)) {
                    reservedNode.withRecurringCharges(RecurringChargeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReservedNodeOfferingType", targetDepth)) {
                    reservedNode.setReservedNodeOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedNode;
                }
            }
        }
    }

    private static ReservedNodeStaxUnmarshaller instance;

    public static ReservedNodeStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedNodeStaxUnmarshaller();
        return instance;
    }
}
