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
package com.amazonaws.services.route53.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * GeoLocationDetails StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoLocationDetailsStaxUnmarshaller implements Unmarshaller<GeoLocationDetails, StaxUnmarshallerContext> {

    public GeoLocationDetails unmarshall(StaxUnmarshallerContext context) throws Exception {
        GeoLocationDetails geoLocationDetails = new GeoLocationDetails();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return geoLocationDetails;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("ContinentCode", targetDepth)) {
                    geoLocationDetails.setContinentCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ContinentName", targetDepth)) {
                    geoLocationDetails.setContinentName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CountryCode", targetDepth)) {
                    geoLocationDetails.setCountryCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("CountryName", targetDepth)) {
                    geoLocationDetails.setCountryName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubdivisionCode", targetDepth)) {
                    geoLocationDetails.setSubdivisionCode(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SubdivisionName", targetDepth)) {
                    geoLocationDetails.setSubdivisionName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return geoLocationDetails;
                }
            }
        }
    }

    private static GeoLocationDetailsStaxUnmarshaller instance;

    public static GeoLocationDetailsStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new GeoLocationDetailsStaxUnmarshaller();
        return instance;
    }
}
