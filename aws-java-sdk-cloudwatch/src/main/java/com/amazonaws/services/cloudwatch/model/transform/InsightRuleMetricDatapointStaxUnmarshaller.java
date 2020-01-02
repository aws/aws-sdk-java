/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * InsightRuleMetricDatapoint StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightRuleMetricDatapointStaxUnmarshaller implements Unmarshaller<InsightRuleMetricDatapoint, StaxUnmarshallerContext> {

    public InsightRuleMetricDatapoint unmarshall(StaxUnmarshallerContext context) throws Exception {
        InsightRuleMetricDatapoint insightRuleMetricDatapoint = new InsightRuleMetricDatapoint();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return insightRuleMetricDatapoint;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("Timestamp", targetDepth)) {
                    insightRuleMetricDatapoint.setTimestamp(DateStaxUnmarshallerFactory.getInstance("iso8601").unmarshall(context));
                    continue;
                }

                if (context.testExpression("UniqueContributors", targetDepth)) {
                    insightRuleMetricDatapoint.setUniqueContributors(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MaxContributorValue", targetDepth)) {
                    insightRuleMetricDatapoint.setMaxContributorValue(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("SampleCount", targetDepth)) {
                    insightRuleMetricDatapoint.setSampleCount(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Average", targetDepth)) {
                    insightRuleMetricDatapoint.setAverage(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Sum", targetDepth)) {
                    insightRuleMetricDatapoint.setSum(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Minimum", targetDepth)) {
                    insightRuleMetricDatapoint.setMinimum(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Maximum", targetDepth)) {
                    insightRuleMetricDatapoint.setMaximum(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return insightRuleMetricDatapoint;
                }
            }
        }
    }

    private static InsightRuleMetricDatapointStaxUnmarshaller instance;

    public static InsightRuleMetricDatapointStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new InsightRuleMetricDatapointStaxUnmarshaller();
        return instance;
    }
}
