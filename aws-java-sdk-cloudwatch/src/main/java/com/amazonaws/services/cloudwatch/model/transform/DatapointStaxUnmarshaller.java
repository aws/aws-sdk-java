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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.Map;

import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * Datapoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatapointStaxUnmarshaller implements Unmarshaller<Datapoint, StaxUnmarshallerContext> {

    private static class ExtendedStatisticsMapEntryUnmarshaller implements Unmarshaller<Map.Entry<String, Double>, StaxUnmarshallerContext> {

        @Override
        public Entry<String, Double> unmarshall(StaxUnmarshallerContext context) throws Exception {
            int originalDepth = context.getCurrentDepth();
            int targetDepth = originalDepth + 1;

            MapEntry<String, Double> entry = new MapEntry<String, Double>();

            while (true) {
                XMLEvent xmlEvent = context.nextEvent();
                if (xmlEvent.isEndDocument())
                    return entry;

                if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                    if (context.testExpression("key", targetDepth)) {
                        entry.setKey(StringStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                    if (context.testExpression("value", targetDepth)) {
                        entry.setValue(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                        continue;
                    }
                } else if (xmlEvent.isEndElement()) {
                    if (context.getCurrentDepth() < originalDepth)
                        return entry;
                }
            }
        }

        private static ExtendedStatisticsMapEntryUnmarshaller instance;

        public static ExtendedStatisticsMapEntryUnmarshaller getInstance() {
            if (instance == null)
                instance = new ExtendedStatisticsMapEntryUnmarshaller();
            return instance;
        }

    }

    public Datapoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        Datapoint datapoint = new Datapoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return datapoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Timestamp", targetDepth)) {
                    datapoint.setTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("SampleCount", targetDepth)) {
                    datapoint.setSampleCount(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Average", targetDepth)) {
                    datapoint.setAverage(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Sum", targetDepth)) {
                    datapoint.setSum(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Minimum", targetDepth)) {
                    datapoint.setMinimum(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Maximum", targetDepth)) {
                    datapoint.setMaximum(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Unit", targetDepth)) {
                    datapoint.setUnit(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExtendedStatistics/entry", targetDepth)) {
                    Entry<String, Double> entry = ExtendedStatisticsMapEntryUnmarshaller.getInstance().unmarshall(context);
                    datapoint.addExtendedStatisticsEntry(entry.getKey(), entry.getValue());
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return datapoint;
                }
            }
        }
    }

    private static DatapointStaxUnmarshaller instance;

    public static DatapointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new DatapointStaxUnmarshaller();
        return instance;
    }
}
