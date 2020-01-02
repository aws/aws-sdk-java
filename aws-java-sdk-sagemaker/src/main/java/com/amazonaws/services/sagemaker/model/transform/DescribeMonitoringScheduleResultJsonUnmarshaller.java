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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeMonitoringScheduleResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMonitoringScheduleResultJsonUnmarshaller implements Unmarshaller<DescribeMonitoringScheduleResult, JsonUnmarshallerContext> {

    public DescribeMonitoringScheduleResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeMonitoringScheduleResult describeMonitoringScheduleResult = new DescribeMonitoringScheduleResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeMonitoringScheduleResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("MonitoringScheduleArn", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setMonitoringScheduleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonitoringScheduleName", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setMonitoringScheduleName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("MonitoringScheduleStatus", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setMonitoringScheduleStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("FailureReason", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setFailureReason(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("LastModifiedTime", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setLastModifiedTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("MonitoringScheduleConfig", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setMonitoringScheduleConfig(MonitoringScheduleConfigJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("EndpointName", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setEndpointName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("LastMonitoringExecutionSummary", targetDepth)) {
                    context.nextToken();
                    describeMonitoringScheduleResult.setLastMonitoringExecutionSummary(MonitoringExecutionSummaryJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeMonitoringScheduleResult;
    }

    private static DescribeMonitoringScheduleResultJsonUnmarshaller instance;

    public static DescribeMonitoringScheduleResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeMonitoringScheduleResultJsonUnmarshaller();
        return instance;
    }
}
