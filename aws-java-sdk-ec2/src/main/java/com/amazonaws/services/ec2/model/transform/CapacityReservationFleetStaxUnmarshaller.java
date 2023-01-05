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
 * CapacityReservationFleet StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityReservationFleetStaxUnmarshaller implements Unmarshaller<CapacityReservationFleet, StaxUnmarshallerContext> {

    public CapacityReservationFleet unmarshall(StaxUnmarshallerContext context) throws Exception {
        CapacityReservationFleet capacityReservationFleet = new CapacityReservationFleet();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return capacityReservationFleet;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("capacityReservationFleetId", targetDepth)) {
                    capacityReservationFleet.setCapacityReservationFleetId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("capacityReservationFleetArn", targetDepth)) {
                    capacityReservationFleet.setCapacityReservationFleetArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("state", targetDepth)) {
                    capacityReservationFleet.setState(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalTargetCapacity", targetDepth)) {
                    capacityReservationFleet.setTotalTargetCapacity(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("totalFulfilledCapacity", targetDepth)) {
                    capacityReservationFleet.setTotalFulfilledCapacity(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tenancy", targetDepth)) {
                    capacityReservationFleet.setTenancy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("endDate", targetDepth)) {
                    capacityReservationFleet.setEndDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("createTime", targetDepth)) {
                    capacityReservationFleet.setCreateTime(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceMatchCriteria", targetDepth)) {
                    capacityReservationFleet.setInstanceMatchCriteria(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("allocationStrategy", targetDepth)) {
                    capacityReservationFleet.setAllocationStrategy(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instanceTypeSpecificationSet", targetDepth)) {
                    capacityReservationFleet.withInstanceTypeSpecifications(new ArrayList<FleetCapacityReservation>());
                    continue;
                }

                if (context.testExpression("instanceTypeSpecificationSet/item", targetDepth)) {
                    capacityReservationFleet.withInstanceTypeSpecifications(FleetCapacityReservationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("tagSet", targetDepth)) {
                    capacityReservationFleet.withTags(new ArrayList<Tag>());
                    continue;
                }

                if (context.testExpression("tagSet/item", targetDepth)) {
                    capacityReservationFleet.withTags(TagStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return capacityReservationFleet;
                }
            }
        }
    }

    private static CapacityReservationFleetStaxUnmarshaller instance;

    public static CapacityReservationFleetStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CapacityReservationFleetStaxUnmarshaller();
        return instance;
    }
}
