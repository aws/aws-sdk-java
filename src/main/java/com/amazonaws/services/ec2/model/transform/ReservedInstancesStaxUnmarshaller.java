/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Reserved Instances StAX Unmarshaller
 */
public class ReservedInstancesStaxUnmarshaller implements Unmarshaller<ReservedInstances, StaxUnmarshallerContext> {

    public ReservedInstances unmarshall(StaxUnmarshallerContext context) throws Exception {
        ReservedInstances reservedInstances = new ReservedInstances();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return reservedInstances;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("reservedInstancesId", targetDepth)) {
                    reservedInstances.setReservedInstancesId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceType", targetDepth)) {
                    reservedInstances.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("availabilityZone", targetDepth)) {
                    reservedInstances.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("start", targetDepth)) {
                    reservedInstances.setStart(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("end", targetDepth)) {
                    reservedInstances.setEnd(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("duration", targetDepth)) {
                    reservedInstances.setDuration(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("usagePrice", targetDepth)) {
                    reservedInstances.setUsagePrice(FloatStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("fixedPrice", targetDepth)) {
                    reservedInstances.setFixedPrice(FloatStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceCount", targetDepth)) {
                    reservedInstances.setInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("productDescription", targetDepth)) {
                    reservedInstances.setProductDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("state", targetDepth)) {
                    reservedInstances.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("tagSet/item", targetDepth)) {
                    reservedInstances.getTags().add(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("instanceTenancy", targetDepth)) {
                    reservedInstances.setInstanceTenancy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("currencyCode", targetDepth)) {
                    reservedInstances.setCurrencyCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("offeringType", targetDepth)) {
                    reservedInstances.setOfferingType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("recurringCharges/item", targetDepth)) {
                    reservedInstances.getRecurringCharges().add(RecurringChargeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservedInstances;
                }
            }
        }
    }

    private static ReservedInstancesStaxUnmarshaller instance;
    public static ReservedInstancesStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ReservedInstancesStaxUnmarshaller();
        return instance;
    }
}
    