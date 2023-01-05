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
package com.amazonaws.services.autoscaling.model.transform;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * TargetTrackingMetricDataQuery StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetTrackingMetricDataQueryStaxUnmarshaller implements Unmarshaller<TargetTrackingMetricDataQuery, StaxUnmarshallerContext> {

    public TargetTrackingMetricDataQuery unmarshall(StaxUnmarshallerContext context) throws Exception {
        TargetTrackingMetricDataQuery targetTrackingMetricDataQuery = new TargetTrackingMetricDataQuery();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return targetTrackingMetricDataQuery;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Id", targetDepth)) {
                    targetTrackingMetricDataQuery.setId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Expression", targetDepth)) {
                    targetTrackingMetricDataQuery.setExpression(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetricStat", targetDepth)) {
                    targetTrackingMetricDataQuery.setMetricStat(TargetTrackingMetricStatStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Label", targetDepth)) {
                    targetTrackingMetricDataQuery.setLabel(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ReturnData", targetDepth)) {
                    targetTrackingMetricDataQuery.setReturnData(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return targetTrackingMetricDataQuery;
                }
            }
        }
    }

    private static TargetTrackingMetricDataQueryStaxUnmarshaller instance;

    public static TargetTrackingMetricDataQueryStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new TargetTrackingMetricDataQueryStaxUnmarshaller();
        return instance;
    }
}
