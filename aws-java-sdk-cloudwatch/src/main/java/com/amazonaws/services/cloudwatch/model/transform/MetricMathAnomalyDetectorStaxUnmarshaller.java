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
package com.amazonaws.services.cloudwatch.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MetricMathAnomalyDetector StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricMathAnomalyDetectorStaxUnmarshaller implements Unmarshaller<MetricMathAnomalyDetector, StaxUnmarshallerContext> {

    public MetricMathAnomalyDetector unmarshall(StaxUnmarshallerContext context) throws Exception {
        MetricMathAnomalyDetector metricMathAnomalyDetector = new MetricMathAnomalyDetector();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return metricMathAnomalyDetector;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("MetricDataQueries", targetDepth)) {
                    metricMathAnomalyDetector.withMetricDataQueries(new ArrayList<MetricDataQuery>());
                    continue;
                }

                if (context.testExpression("MetricDataQueries/member", targetDepth)) {
                    metricMathAnomalyDetector.withMetricDataQueries(MetricDataQueryStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return metricMathAnomalyDetector;
                }
            }
        }
    }

    private static MetricMathAnomalyDetectorStaxUnmarshaller instance;

    public static MetricMathAnomalyDetectorStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricMathAnomalyDetectorStaxUnmarshaller();
        return instance;
    }
}
