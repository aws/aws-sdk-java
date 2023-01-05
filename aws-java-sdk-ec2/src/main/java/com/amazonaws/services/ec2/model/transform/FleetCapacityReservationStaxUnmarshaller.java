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
 * FleetCapacityReservation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetCapacityReservationStaxUnmarshaller implements Unmarshaller<FleetCapacityReservation, StaxUnmarshallerContext> {

    public FleetCapacityReservation unmarshall(StaxUnmarshallerContext context) throws Exception {
        FleetCapacityReservation fleetCapacityReservation = new FleetCapacityReservation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return fleetCapacityReservation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("capacityReservationId", targetDepth)) {
                    fleetCapacityReservation.setCapacityReservationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZoneId", targetDepth)) {
                    fleetCapacityReservation.setAvailabilityZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceType", targetDepth)) {
                    fleetCapacityReservation.setInstanceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instancePlatform", targetDepth)) {
                    fleetCapacityReservation.setInstancePlatform(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("availabilityZone", targetDepth)) {
                    fleetCapacityReservation.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalInstanceCount", targetDepth)) {
                    fleetCapacityReservation.setTotalInstanceCount(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("fulfilledCapacity", targetDepth)) {
                    fleetCapacityReservation.setFulfilledCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ebsOptimized", targetDepth)) {
                    fleetCapacityReservation.setEbsOptimized(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("createDate", targetDepth)) {
                    fleetCapacityReservation.setCreateDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("weight", targetDepth)) {
                    fleetCapacityReservation.setWeight(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("priority", targetDepth)) {
                    fleetCapacityReservation.setPriority(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return fleetCapacityReservation;
                }
            }
        }
    }

    private static FleetCapacityReservationStaxUnmarshaller instance;

    public static FleetCapacityReservationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new FleetCapacityReservationStaxUnmarshaller();
        return instance;
    }
}
