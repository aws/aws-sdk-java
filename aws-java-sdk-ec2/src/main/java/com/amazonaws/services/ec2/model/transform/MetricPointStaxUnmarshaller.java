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
package com.amazonaws.services.ec2.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MetricPoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetricPointStaxUnmarshaller implements Unmarshaller<MetricPoint, StaxUnmarshallerContext> {

    public MetricPoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        MetricPoint metricPoint = new MetricPoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return metricPoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("startDate", targetDepth)) {
                    metricPoint.setStartDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("endDate", targetDepth)) {
                    metricPoint.setEndDate(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("value", targetDepth)) {
                    metricPoint.setValue(FloatStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("status", targetDepth)) {
                    metricPoint.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return metricPoint;
                }
            }
        }
    }

    private static MetricPointStaxUnmarshaller instance;

    public static MetricPointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricPointStaxUnmarshaller();
        return instance;
    }
}
