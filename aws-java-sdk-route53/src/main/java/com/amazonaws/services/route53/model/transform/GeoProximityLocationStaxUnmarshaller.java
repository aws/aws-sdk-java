/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GeoProximityLocation StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoProximityLocationStaxUnmarshaller implements Unmarshaller<GeoProximityLocation, StaxUnmarshallerContext> {

    public GeoProximityLocation unmarshall(StaxUnmarshallerContext context) throws Exception {
        GeoProximityLocation geoProximityLocation = new GeoProximityLocation();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return geoProximityLocation;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AWSRegion", targetDepth)) {
                    geoProximityLocation.setAWSRegion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("LocalZoneGroup", targetDepth)) {
                    geoProximityLocation.setLocalZoneGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Coordinates", targetDepth)) {
                    geoProximityLocation.setCoordinates(CoordinatesStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Bias", targetDepth)) {
                    geoProximityLocation.setBias(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return geoProximityLocation;
                }
            }
        }
    }

    private static GeoProximityLocationStaxUnmarshaller instance;

    public static GeoProximityLocationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GeoProximityLocationStaxUnmarshaller();
        return instance;
    }
}
