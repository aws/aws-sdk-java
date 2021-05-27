/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotevents.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.iotevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeAlarmModelResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAlarmModelResultJsonUnmarshaller implements Unmarshaller<DescribeAlarmModelResult, JsonUnmarshallerContext> {

    public DescribeAlarmModelResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeAlarmModelResult describeAlarmModelResult = new DescribeAlarmModelResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeAlarmModelResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("creationTime", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("alarmModelArn", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelVersion", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelVersion(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("lastUpdateTime", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setLastUpdateTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("statusMessage", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setStatusMessage(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelName", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("alarmModelDescription", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmModelDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("roleArn", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setRoleArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("key", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setKey(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("severity", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setSeverity(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("alarmRule", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmRule(AlarmRuleJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alarmNotification", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmNotification(AlarmNotificationJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alarmEventActions", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmEventActions(AlarmEventActionsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("alarmCapabilities", targetDepth)) {
                    context.nextToken();
                    describeAlarmModelResult.setAlarmCapabilities(AlarmCapabilitiesJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeAlarmModelResult;
    }

    private static DescribeAlarmModelResultJsonUnmarshaller instance;

    public static DescribeAlarmModelResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeAlarmModelResultJsonUnmarshaller();
        return instance;
    }
}
