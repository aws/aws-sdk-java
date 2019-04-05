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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Reservation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReservationStaxUnmarshaller implements Unmarshaller<Reservation, StaxUnmarshallerContext> {

    public Reservation unmarshall(StaxUnmarshallerContext context) throws Exception {
        Reservation reservation = new Reservation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return reservation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("groupSet", targetDepth)) {
                    reservation.withGroups(new ArrayList<GroupIdentifier>());
                    continue;
                }

                if (context.testExpression("groupSet/item", targetDepth)) {
                    reservation.withGroups(GroupIdentifierStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("instancesSet", targetDepth)) {
                    reservation.withInstances(new ArrayList<Instance>());
                    continue;
                }

                if (context.testExpression("instancesSet/item", targetDepth)) {
                    reservation.withInstances(InstanceStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ownerId", targetDepth)) {
                    reservation.setOwnerId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("requesterId", targetDepth)) {
                    reservation.setRequesterId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("reservationId", targetDepth)) {
                    reservation.setReservationId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("groupName", targetDepth)) {
                    reservation.withGroupNames(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("groupName/GroupName", targetDepth)) {
                    reservation.withGroupNames(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return reservation;
                }
            }
        }
    }

    private static ReservationStaxUnmarshaller instance;

    public static ReservationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new ReservationStaxUnmarshaller();
        return instance;
    }
}
