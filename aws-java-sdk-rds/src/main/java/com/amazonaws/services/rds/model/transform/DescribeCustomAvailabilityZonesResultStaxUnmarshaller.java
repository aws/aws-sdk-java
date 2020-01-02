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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * DescribeCustomAvailabilityZonesResult StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCustomAvailabilityZonesResultStaxUnmarshaller implements Unmarshaller<DescribeCustomAvailabilityZonesResult, StaxUnmarshallerContext> {

    public DescribeCustomAvailabilityZonesResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeCustomAvailabilityZonesResult describeCustomAvailabilityZonesResult = new DescribeCustomAvailabilityZonesResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 2;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return describeCustomAvailabilityZonesResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Marker", targetDepth)) {
                    describeCustomAvailabilityZonesResult.setMarker(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CustomAvailabilityZones", targetDepth)) {
                    describeCustomAvailabilityZonesResult.withCustomAvailabilityZones(new ArrayList<CustomAvailabilityZone>());
                    continue;
                }

                if (context.testExpression("CustomAvailabilityZones/CustomAvailabilityZone", targetDepth)) {
                    describeCustomAvailabilityZonesResult.withCustomAvailabilityZones(CustomAvailabilityZoneStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeCustomAvailabilityZonesResult;
                }
            }
        }
    }

    private static DescribeCustomAvailabilityZonesResultStaxUnmarshaller instance;

    public static DescribeCustomAvailabilityZonesResultStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeCustomAvailabilityZonesResultStaxUnmarshaller();
        return instance;
    }
}
