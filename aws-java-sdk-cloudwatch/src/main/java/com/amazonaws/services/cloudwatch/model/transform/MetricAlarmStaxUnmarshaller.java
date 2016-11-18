/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;

/**
 * MetricAlarm StAX Unmarshaller
 */
public class MetricAlarmStaxUnmarshaller implements Unmarshaller<MetricAlarm, StaxUnmarshallerContext> {

    public MetricAlarm unmarshall(StaxUnmarshallerContext context) throws Exception {
        MetricAlarm metricAlarm = new MetricAlarm();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        if (context.isStartOfDocument())
            targetDepth += 1;

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument())
                return metricAlarm;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {

                if (context.testExpression("AlarmName", targetDepth)) {
                    metricAlarm.setAlarmName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmArn", targetDepth)) {
                    metricAlarm.setAlarmArn(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmDescription", targetDepth)) {
                    metricAlarm.setAlarmDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmConfigurationUpdatedTimestamp", targetDepth)) {
                    metricAlarm.setAlarmConfigurationUpdatedTimestamp(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ActionsEnabled", targetDepth)) {
                    metricAlarm.setActionsEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("OKActions/member", targetDepth)) {
                    metricAlarm.withOKActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("AlarmActions/member", targetDepth)) {
                    metricAlarm.withAlarmActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("InsufficientDataActions/member", targetDepth)) {
                    metricAlarm.withInsufficientDataActions(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateValue", targetDepth)) {
                    metricAlarm.setStateValue(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateReason", targetDepth)) {
                    metricAlarm.setStateReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateReasonData", targetDepth)) {
                    metricAlarm.setStateReasonData(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("StateUpdatedTimestamp", targetDepth)) {
                    metricAlarm.setStateUpdatedTimestamp(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("MetricName", targetDepth)) {
                    metricAlarm.setMetricName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Namespace", targetDepth)) {
                    metricAlarm.setNamespace(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Statistic", targetDepth)) {
                    metricAlarm.setStatistic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ExtendedStatistic", targetDepth)) {
                    metricAlarm.setExtendedStatistic(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Dimensions/member", targetDepth)) {
                    metricAlarm.withDimensions(DimensionStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Period", targetDepth)) {
                    metricAlarm.setPeriod(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Unit", targetDepth)) {
                    metricAlarm.setUnit(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("EvaluationPeriods", targetDepth)) {
                    metricAlarm.setEvaluationPeriods(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("Threshold", targetDepth)) {
                    metricAlarm.setThreshold(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }

                if (context.testExpression("ComparisonOperator", targetDepth)) {
                    metricAlarm.setComparisonOperator(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return metricAlarm;
                }
            }
        }
    }

    private static MetricAlarmStaxUnmarshaller instance;

    public static MetricAlarmStaxUnmarshaller getInstance() {
        if (instance == null)
            instance = new MetricAlarmStaxUnmarshaller();
        return instance;
    }
}
