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
package com.amazonaws.services.securityhub.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AwsCloudWatchAlarmDetails JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsCloudWatchAlarmDetailsJsonUnmarshaller implements Unmarshaller<AwsCloudWatchAlarmDetails, JsonUnmarshallerContext> {

    public AwsCloudWatchAlarmDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsCloudWatchAlarmDetails awsCloudWatchAlarmDetails = new AwsCloudWatchAlarmDetails();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ActionsEnabled", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setActionsEnabled(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("AlarmActions", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setAlarmActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("AlarmArn", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setAlarmArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmConfigurationUpdatedTimestamp", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setAlarmConfigurationUpdatedTimestamp(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmDescription", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setAlarmDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("AlarmName", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setAlarmName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ComparisonOperator", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setComparisonOperator(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("DatapointsToAlarm", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setDatapointsToAlarm(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Dimensions", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setDimensions(new ListUnmarshaller<AwsCloudWatchAlarmDimensionsDetails>(
                            AwsCloudWatchAlarmDimensionsDetailsJsonUnmarshaller.getInstance())

                    .unmarshall(context));
                }
                if (context.testExpression("EvaluateLowSampleCountPercentile", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setEvaluateLowSampleCountPercentile(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("EvaluationPeriods", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setEvaluationPeriods(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("ExtendedStatistic", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setExtendedStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("InsufficientDataActions", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setInsufficientDataActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("MetricName", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setMetricName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Namespace", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setNamespace(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("OkActions", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setOkActions(new ListUnmarshaller<String>(context.getUnmarshaller(String.class))

                    .unmarshall(context));
                }
                if (context.testExpression("Period", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setPeriod(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("Statistic", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setStatistic(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Threshold", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setThreshold(context.getUnmarshaller(Double.class).unmarshall(context));
                }
                if (context.testExpression("ThresholdMetricId", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setThresholdMetricId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("TreatMissingData", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setTreatMissingData(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("Unit", targetDepth)) {
                    context.nextToken();
                    awsCloudWatchAlarmDetails.setUnit(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return awsCloudWatchAlarmDetails;
    }

    private static AwsCloudWatchAlarmDetailsJsonUnmarshaller instance;

    public static AwsCloudWatchAlarmDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudWatchAlarmDetailsJsonUnmarshaller();
        return instance;
    }
}
