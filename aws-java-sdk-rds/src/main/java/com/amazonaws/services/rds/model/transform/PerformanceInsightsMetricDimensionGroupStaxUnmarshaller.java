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

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * PerformanceInsightsMetricDimensionGroup StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PerformanceInsightsMetricDimensionGroupStaxUnmarshaller implements Unmarshaller<PerformanceInsightsMetricDimensionGroup, StaxUnmarshallerContext> {

    public PerformanceInsightsMetricDimensionGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        PerformanceInsightsMetricDimensionGroup performanceInsightsMetricDimensionGroup = new PerformanceInsightsMetricDimensionGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return performanceInsightsMetricDimensionGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Dimensions", targetDepth)) {
                    performanceInsightsMetricDimensionGroup.withDimensions(new ArrayList<String>());
                    continue;
                }

                if (context.testExpression("Dimensions/member", targetDepth)) {
                    performanceInsightsMetricDimensionGroup.withDimensions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Group", targetDepth)) {
                    performanceInsightsMetricDimensionGroup.setGroup(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Limit", targetDepth)) {
                    performanceInsightsMetricDimensionGroup.setLimit(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return performanceInsightsMetricDimensionGroup;
                }
            }
        }
    }

    private static PerformanceInsightsMetricDimensionGroupStaxUnmarshaller instance;

    public static PerformanceInsightsMetricDimensionGroupStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new PerformanceInsightsMetricDimensionGroupStaxUnmarshaller();
        return instance;
    }
}
