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
package com.amazonaws.services.route53.model.transform;

import java.util.ArrayList;

import javax.xml.stream.events.XMLEvent;
import javax.annotation.Generated;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;

import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * CloudWatchAlarmConfiguration StAX Unmarshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudWatchAlarmConfigurationStaxUnmarshaller implements Unmarshaller<CloudWatchAlarmConfiguration, StaxUnmarshallerContext> {

    public CloudWatchAlarmConfiguration unmarshall(StaxUnmarshallerContext context) throws Exception {
        CloudWatchAlarmConfiguration cloudWatchAlarmConfiguration = new CloudWatchAlarmConfiguration();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return cloudWatchAlarmConfiguration;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("EvaluationPeriods", targetDepth)) {
                    cloudWatchAlarmConfiguration.setEvaluationPeriods(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Threshold", targetDepth)) {
                    cloudWatchAlarmConfiguration.setThreshold(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ComparisonOperator", targetDepth)) {
                    cloudWatchAlarmConfiguration.setComparisonOperator(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Period", targetDepth)) {
                    cloudWatchAlarmConfiguration.setPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetricName", targetDepth)) {
                    cloudWatchAlarmConfiguration.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Namespace", targetDepth)) {
                    cloudWatchAlarmConfiguration.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Statistic", targetDepth)) {
                    cloudWatchAlarmConfiguration.setStatistic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Dimensions", targetDepth)) {
                    cloudWatchAlarmConfiguration.withDimensions(new ArrayList<Dimension>());
                    continue;
                }

                if (context.testExpression("Dimensions/Dimension", targetDepth)) {
                    cloudWatchAlarmConfiguration.withDimensions(DimensionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return cloudWatchAlarmConfiguration;
                }
            }
        }
    }

    private static CloudWatchAlarmConfigurationStaxUnmarshaller instance;

    public static CloudWatchAlarmConfigurationStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchAlarmConfigurationStaxUnmarshaller();
        return instance;
    }
}
