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
 * LoadForecast StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadForecastStaxUnmarshaller implements Unmarshaller<LoadForecast, StaxUnmarshallerContext> {

    public LoadForecast unmarshall(StaxUnmarshallerContext context) throws Exception {
        LoadForecast loadForecast = new LoadForecast();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return loadForecast;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Timestamps", targetDepth)) {
                    loadForecast.withTimestamps(new ArrayList<java.util.Date>());
                    continue;
                }

                if (context.testExpression("Timestamps/member", targetDepth)) {
                    loadForecast.withTimestamps(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Values", targetDepth)) {
                    loadForecast.withValues(new ArrayList<Double>());
                    continue;
                }

                if (context.testExpression("Values/member", targetDepth)) {
                    loadForecast.withValues(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetricSpecification", targetDepth)) {
                    loadForecast.setMetricSpecification(PredictiveScalingMetricSpecificationStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return loadForecast;
                }
            }
        }
    }

    private static LoadForecastStaxUnmarshaller instance;

    public static LoadForecastStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new LoadForecastStaxUnmarshaller();
        return instance;
    }
}
