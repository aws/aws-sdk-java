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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * ScheduledInstanceAvailability StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledInstanceAvailabilityStaxUnmarshaller implements Unmarshaller<ScheduledInstanceAvailability, StaxUnmarshallerContext> {

    public ScheduledInstanceAvailability unmarshall(StaxUnmarshallerContext context) throws Exception {
        ScheduledInstanceAvailability scheduledInstanceAvailability = new ScheduledInstanceAvailability();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return scheduledInstanceAvailability;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("availabilityZone", targetDepth)) {
                    scheduledInstanceAvailability.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availableInstanceCount", targetDepth)) {
                    scheduledInstanceAvailability.setAvailableInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("firstSlotStartTime", targetDepth)) {
                    scheduledInstanceAvailability.setFirstSlotStartTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("hourlyPrice", targetDepth)) {
                    scheduledInstanceAvailability.setHourlyPrice(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    scheduledInstanceAvailability.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("maxTermDurationInDays", targetDepth)) {
                    scheduledInstanceAvailability.setMaxTermDurationInDays(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("minTermDurationInDays", targetDepth)) {
                    scheduledInstanceAvailability.setMinTermDurationInDays(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("networkPlatform", targetDepth)) {
                    scheduledInstanceAvailability.setNetworkPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("platform", targetDepth)) {
                    scheduledInstanceAvailability.setPlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("purchaseToken", targetDepth)) {
                    scheduledInstanceAvailability.setPurchaseToken(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("recurrence", targetDepth)) {
                    scheduledInstanceAvailability.setRecurrence(ScheduledInstanceRecurrenceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("slotDurationInHours", targetDepth)) {
                    scheduledInstanceAvailability.setSlotDurationInHours(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalScheduledInstanceHours", targetDepth)) {
                    scheduledInstanceAvailability.setTotalScheduledInstanceHours(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return scheduledInstanceAvailability;
                }
            }
        }
    }

    private static ScheduledInstanceAvailabilityStaxUnmarshaller instance;

    public static ScheduledInstanceAvailabilityStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstanceAvailabilityStaxUnmarshaller();
        return instance;
    }
}
