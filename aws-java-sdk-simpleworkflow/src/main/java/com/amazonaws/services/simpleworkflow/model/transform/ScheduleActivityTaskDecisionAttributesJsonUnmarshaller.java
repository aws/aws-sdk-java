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
package com.amazonaws.services.simpleworkflow.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * ScheduleActivityTaskDecisionAttributes JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleActivityTaskDecisionAttributesJsonUnmarshaller implements Unmarshaller<ScheduleActivityTaskDecisionAttributes, JsonUnmarshallerContext> {

    public ScheduleActivityTaskDecisionAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        ScheduleActivityTaskDecisionAttributes scheduleActivityTaskDecisionAttributes = new ScheduleActivityTaskDecisionAttributes();

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
                if (context.testExpression("activityType", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setActivityType(ActivityTypeJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("activityId", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setActivityId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("control", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setControl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("input", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setInput(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scheduleToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setScheduleToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("taskList", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setTaskList(TaskListJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("taskPriority", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setTaskPriority(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("scheduleToStartTimeout", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setScheduleToStartTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startToCloseTimeout", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setStartToCloseTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("heartbeatTimeout", targetDepth)) {
                    context.nextToken();
                    scheduleActivityTaskDecisionAttributes.setHeartbeatTimeout(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return scheduleActivityTaskDecisionAttributes;
    }

    private static ScheduleActivityTaskDecisionAttributesJsonUnmarshaller instance;

    public static ScheduleActivityTaskDecisionAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleActivityTaskDecisionAttributesJsonUnmarshaller();
        return instance;
    }
}
