/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.autoscaling.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CapacityForecast StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityForecastStaxUnmarshaller implements Unmarshaller<CapacityForecast, StaxUnmarshallerContext> {

    public CapacityForecast unmarshall(StaxUnmarshallerContext context) throws Exception {
        CapacityForecast capacityForecast = new CapacityForecast();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return capacityForecast;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Timestamps", targetDepth)) {
                    capacityForecast.withTimestamps(new ArrayList<java.util.Date>());
                    continue;
                }

                if (context.testExpression("Timestamps/member", targetDepth)) {
                    capacityForecast.withTimestamps(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Values", targetDepth)) {
                    capacityForecast.withValues(new ArrayList<Double>());
                    continue;
                }

                if (context.testExpression("Values/member", targetDepth)) {
                    capacityForecast.withValues(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return capacityForecast;
                }
            }
        }
    }

    private static CapacityForecastStaxUnmarshaller instance;

    public static CapacityForecastStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CapacityForecastStaxUnmarshaller();
        return instance;
    }
}
