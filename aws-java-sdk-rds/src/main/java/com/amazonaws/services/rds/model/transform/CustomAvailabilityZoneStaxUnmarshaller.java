/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CustomAvailabilityZone StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CustomAvailabilityZoneStaxUnmarshaller implements Unmarshaller<CustomAvailabilityZone, StaxUnmarshallerContext> {

    public CustomAvailabilityZone unmarshall(StaxUnmarshallerContext context) throws Exception {
        CustomAvailabilityZone customAvailabilityZone = new CustomAvailabilityZone();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 3;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return customAvailabilityZone;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("CustomAvailabilityZoneId", targetDepth)) {
                    customAvailabilityZone.setCustomAvailabilityZoneId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomAvailabilityZoneName", targetDepth)) {
                    customAvailabilityZone.setCustomAvailabilityZoneName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomAvailabilityZoneStatus", targetDepth)) {
                    customAvailabilityZone.setCustomAvailabilityZoneStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("VpnDetails", targetDepth)) {
                    customAvailabilityZone.setVpnDetails(VpnDetailsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return customAvailabilityZone;
                }
            }
        }
    }

    private static CustomAvailabilityZoneStaxUnmarshaller instance;

    public static CustomAvailabilityZoneStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CustomAvailabilityZoneStaxUnmarshaller();
        return instance;
    }
}
