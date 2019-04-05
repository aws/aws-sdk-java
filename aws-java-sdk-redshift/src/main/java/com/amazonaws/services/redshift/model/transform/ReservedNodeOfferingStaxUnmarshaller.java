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
 * ReservedNodeOffering StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservedNodeOfferingStaxUnmarshaller implements Unmarshaller<ReservedNodeOffering, StaxUnmarshallerContext> {

    public ReservedNodeOffering unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedNodeOffering reservedNodeOffering = new ReservedNodeOffering();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservedNodeOffering;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ReservedNodeOfferingId", targetDepth)) {
                    reservedNodeOffering.setReservedNodeOfferingId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("NodeType", targetDepth)) {
                    reservedNodeOffering.setNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Duration", targetDepth)) {
                    reservedNodeOffering.setDuration(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("FixedPrice", targetDepth)) {
                    reservedNodeOffering.setFixedPrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("UsagePrice", targetDepth)) {
                    reservedNodeOffering.setUsagePrice(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CurrencyCode", targetDepth)) {
                    reservedNodeOffering.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OfferingType", targetDepth)) {
                    reservedNodeOffering.setOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("RecurringCharges", targetDepth)) {
                    reservedNodeOffering.withRecurringCharges(new ArrayList<RecurringCharge>());
                    continue;
                }

                if (context.testExpression("RecurringCharges/RecurringCharge", targetDepth)) {
                    reservedNodeOffering.withRecurringCharges(RecurringChargeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReservedNodeOfferingType", targetDepth)) {
                    reservedNodeOffering.setReservedNodeOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedNodeOffering;
                }
            }
        }
    }

    private static ReservedNodeOfferingStaxUnmarshaller instance;

    public static ReservedNodeOfferingStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservedNodeOfferingStaxUnmarshaller();
        return instance;
    }
}
