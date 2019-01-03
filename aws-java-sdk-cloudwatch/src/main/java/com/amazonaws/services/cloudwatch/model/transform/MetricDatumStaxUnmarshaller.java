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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MetricDatum StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricDatumStaxUnmarshaller implements Unmarshaller<MetricDatum, StaxUnmarshallerContext> {

    public MetricDatum unmarshall(StaxUnmarshallerContext context) throws Exception {
        MetricDatum metricDatum = new MetricDatum();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return metricDatum;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MetricName", targetDepth)) {
                    metricDatum.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Dimensions", targetDepth)) {
                    metricDatum.withDimensions(new ArrayList<Dimension>());
                    continue;
                }

                if (context.testExpression("Dimensions/member", targetDepth)) {
                    metricDatum.withDimensions(DimensionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Timestamp", targetDepth)) {
                    metricDatum.setTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("Value", targetDepth)) {
                    metricDatum.setValue(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StatisticValues", targetDepth)) {
                    metricDatum.setStatisticValues(StatisticSetStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Values", targetDepth)) {
                    metricDatum.withValues(new ArrayList<Double>());
                    continue;
                }

                if (context.testExpression("Values/member", targetDepth)) {
                    metricDatum.withValues(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Counts", targetDepth)) {
                    metricDatum.withCounts(new ArrayList<Double>());
                    continue;
                }

                if (context.testExpression("Counts/member", targetDepth)) {
                    metricDatum.withCounts(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Unit", targetDepth)) {
                    metricDatum.setUnit(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StorageResolution", targetDepth)) {
                    metricDatum.setStorageResolution(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return metricDatum;
                }
            }
        }
    }

    private static MetricDatumStaxUnmarshaller instance;

    public static MetricDatumStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatumStaxUnmarshaller();
        return instance;
    }
}
