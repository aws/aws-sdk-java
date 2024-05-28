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
package com.amazonaws.services.rds.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PerformanceInsightsMetricQuery StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsMetricQueryStaxUnmarshaller implements Unmarshaller<PerformanceInsightsMetricQuery, StaxUnmarshallerContext> {

    public PerformanceInsightsMetricQuery unmarshall(StaxUnmarshallerContext context) throws Exception {
        PerformanceInsightsMetricQuery performanceInsightsMetricQuery = new PerformanceInsightsMetricQuery();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return performanceInsightsMetricQuery;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("GroupBy", targetDepth)) {
                    performanceInsightsMetricQuery.setGroupBy(PerformanceInsightsMetricDimensionGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Metric", targetDepth)) {
                    performanceInsightsMetricQuery.setMetric(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return performanceInsightsMetricQuery;
                }
            }
        }
    }

    private static PerformanceInsightsMetricQueryStaxUnmarshaller instance;

    public static PerformanceInsightsMetricQueryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PerformanceInsightsMetricQueryStaxUnmarshaller();
        return instance;
    }
}
